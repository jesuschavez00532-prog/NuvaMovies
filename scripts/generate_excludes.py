#!/usr/bin/env python3
"""
Fast multi-pass exclude generator using BFS.
Handles both explicit imports AND same-package references.
"""
import os
import re
import sys

JAVA_ROOT = "app/src/main/java"
BUILD_GRADLE = "app/build.gradle"
MARKER = "                exclude 'com/zhy/**'"

EXCLUDED_TOP = {
    "anet","okhttp3","okio","antlr","retrofit2","javax",
    "androidx","android","io","kotlinx","org",
}

DIRECT_BAD_RE = re.compile(
    r"^import\s+("
    r"androidx\.|com\.umeng\.|com\.bumptech\.|com\.zhy\.|"
    r"com\.raizlabs\.|com\.open\.leanback\.|kotlinx\.coroutines\.internal\.|"
    r"anet\.|com\.lzy\.|com\.titan\.|com\.qiniu\.android\.dns\.|"
    r"org\.android\.|com\.taobao\.|tv\.danmaku\.|"
    r"com\.google\.android\.gms\.internal\.|com\.google\.android\.youtube\.|"
    r"com\.google\.android\.gms\.auth\.|com\.google\.android\.gms\.measurement\.|"
    r"com\.google\.android\.gms\.common\.|com\.swlauthnew\.|"
    r"android\.support\.v4\.|org\.xutils\."
    r")", re.MULTILINE
)

# Files with jadx decompile errors (unfixable by import analysis)
FORCE_EXCLUDE_SIMPLE = {
    "C5596a",      # r0 variable not declared (jadx artifact)
    "C5886a",      # r9,r11 variables not declared (jadx artifact)
    "AbstractC7186q",  # interface expected here (interface->class conversion issue)
    "AbstractC6629i0", # interface expected here
    "ExecutorServiceC5901a", # interface expected here
    "C5885c",      # android.os.ServiceManager (hidden API)
    "C7364d",      # AbstractC7363c not found (same-pkg not cascaded)
    "C7671g",      # AbstractC7670f not found
    "C4881o0",     # AbstractC4879n0 not found
    "C4252n",      # AbstractC4251m not found
    "LoadingView", # com.module.R$styleable not found
    "C3890R",      # com.google.android.youtube.tv.R reference
    "AbstractC4111a", # th variable not declared (jadx)
    "C4113c",      # FilterInputStream.in protected access
    "AbstractC4116f", # non-static this in static context
    "AbstractC1339c", # non-static this
    "AbstractC1348c", # non-static this
    "C1088t0",     # non-static this
    "C1049a",      # weaker access override
    "C1318n",      # bad operand char+Object
    "SubTitleFileList", # boolean/int incompatible
    "ViewOnFocusChangeListenerC5935m", # anonymous Runnable type
    "C6553r",      # Object to String incompatible
    "C4307b",      # FlowableTransformer incompatible
    "AbstractC4306a", # Function/Predicate not abstract
    "InterfaceC1029a", # abstract override issue
    "C1030b",      # non-static Parcelable.Creator
    "RunnableC4259u", "RunnableC4255q", "RunnableC4261w",
    "RunnableC4234c0", "RunnableC4263y", "RunnableC4257s",
    "RunnableC4230a0", # private access in same class
}

IMPORT_RE = re.compile(r"^import\s+([\w.]+)\s*;", re.MULTILINE)

def get_simple(rel):
    return os.path.basename(rel).replace(".java", "")

def get_pkg(rel):
    parts = rel.split("/")
    return ".".join(parts[:-1]) if len(parts) > 1 else ""

def main():
    # Index all files
    files = {}  # rel -> content
    for root, _, fnames in os.walk(JAVA_ROOT):
        for fname in fnames:
            if not fname.endswith(".java"):
                continue
            full = os.path.join(root, fname)
            rel = full.replace(JAVA_ROOT + "/", "").replace(JAVA_ROOT + os.sep, "").replace("\\", "/")
            top = rel.split("/")[0]
            if top in EXCLUDED_TOP:
                continue
            try:
                with open(full, "r", encoding="utf-8", errors="ignore") as f:
                    files[rel] = f.read()
            except Exception:
                files[rel] = ""

    print(f"Indexed {len(files)} app files", flush=True)

    # Build FQN -> rel map
    fqn_to_rel = {rel.replace("/", ".").replace(".java", ""): rel for rel in files}

    # Build package -> set of rels in that package
    pkg_to_rels = {}
    for rel in files:
        pkg = get_pkg(rel)
        if pkg not in pkg_to_rels:
            pkg_to_rels[pkg] = set()
        pkg_to_rels[pkg].add(rel)

    # Build simple_name -> set of rels (for same-package detection)
    simple_to_rels = {}
    for rel in files:
        simple = get_simple(rel)
        if simple not in simple_to_rels:
            simple_to_rels[simple] = set()
        simple_to_rels[simple].add(rel)

    # Pass 1: Direct bad imports + force excludes
    excluded = set()
    for rel, content in files.items():
        if DIRECT_BAD_RE.search(content):
            excluded.add(rel)
        # Force-exclude known bad jadx decompile files by simple name
        if get_simple(rel) in FORCE_EXCLUDE_SIMPLE:
            excluded.add(rel)
    print(f"Pass 1: {len(excluded)} direct bad imports", flush=True)

    # Build reverse import index: fqn -> set of files that import it
    importers = {}  # fqn -> {rel, ...}
    for rel, content in files.items():
        for m in IMPORT_RE.finditer(content):
            fqn = m.group(1)
            if fqn not in importers:
                importers[fqn] = set()
            importers[fqn].add(rel)

    # Build same-package reference index
    # For each file, which simple class names does it reference?
    # We detect: files in same package that use class names from excluded files
    def get_refs_in_content(content, pkg):
        """Get simple class names referenced in content that belong to same package"""
        refs = set()
        # Find identifiers that match known simple names in the same package
        for rel2 in pkg_to_rels.get(pkg, set()):
            simple = get_simple(rel2)
            # Check if this simple name appears in the content (word boundary)
            if re.search(r'\b' + re.escape(simple) + r'\b', content):
                refs.add(rel2)
        return refs

    # BFS cascade
    queue = list(excluded)
    visited = set(excluded)
    cascade_count = 0

    while queue:
        excl_rel = queue.pop(0)
        fqn = excl_rel.replace("/", ".").replace(".java", "")
        simple = get_simple(excl_rel)
        pkg = get_pkg(excl_rel)

        # Files that explicitly import this FQN
        for importer_rel in importers.get(fqn, set()):
            if importer_rel not in visited:
                visited.add(importer_rel)
                excluded.add(importer_rel)
                queue.append(importer_rel)
                cascade_count += 1

        # Files in the same package that reference this simple name
        for pkg_rel in pkg_to_rels.get(pkg, set()):
            if pkg_rel not in visited and pkg_rel != excl_rel:
                content = files.get(pkg_rel, "")
                if re.search(r'\b' + re.escape(simple) + r'\b', content):
                    visited.add(pkg_rel)
                    excluded.add(pkg_rel)
                    queue.append(pkg_rel)
                    cascade_count += 1

    print(f"Cascade: +{cascade_count} (total excluded: {len(excluded)})", flush=True)

    # Generate excludes
    lines = [f"                exclude '{rel}'" for rel in sorted(excluded)]

    with open(BUILD_GRADLE, "r", encoding="utf-8") as f:
        content = f.read()

    if MARKER not in content:
        print(f"ERROR: marker not found. Searching...", flush=True)
        for i, line in enumerate(content.split("\n")):
            if "zhy" in line:
                print(f"  Line {i}: {repr(line)}")
        sys.exit(1)

    new_content = content.replace(MARKER, MARKER + "\n" + "\n".join(lines))
    with open(BUILD_GRADLE, "w", encoding="utf-8") as f:
        f.write(new_content)

    print(f"Done: injected {len(lines)} excludes", flush=True)

if __name__ == "__main__":
    main()
