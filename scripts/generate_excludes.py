#!/usr/bin/env python3
"""
Fast multi-pass exclude generator using index-based lookup.
O(n) instead of O(n²).
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
    r"com\.google\.android\.gms\.internal\."
    r")", re.MULTILINE
)

IMPORT_RE = re.compile(r"^import\s+([\w.]+);", re.MULTILINE)

def main():
    # Step 1: Index all files
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

    # Step 2: Build import->rel index
    # For each fully-qualified class name, which rel file defines it?
    fqn_to_rel = {}
    for rel in files:
        # derive FQN from path: p400xa/C7589m1.java -> p400xa.C7589m1
        fqn = rel.replace("/", ".").replace(".java", "")
        fqn_to_rel[fqn] = rel

    # Step 3: Pass 1 - direct bad imports
    excluded = set()
    for rel, content in files.items():
        if DIRECT_BAD_RE.search(content):
            excluded.add(rel)

    print(f"Pass 1: {len(excluded)} direct", flush=True)

    # Step 4: Build reverse index - which files import which FQN?
    # importers[fqn] = set of rels that import fqn
    importers = {}
    for rel, content in files.items():
        for m in IMPORT_RE.finditer(content):
            fqn = m.group(1)
            if fqn not in importers:
                importers[fqn] = set()
            importers[fqn].add(rel)

    # Step 5: BFS cascade
    queue = list(excluded)
    visited = set(excluded)
    total_cascade = 0

    while queue:
        excl_rel = queue.pop()
        # What FQN does this file define?
        fqn = excl_rel.replace("/", ".").replace(".java", "")
        # Who imports this FQN?
        for importer_rel in importers.get(fqn, set()):
            if importer_rel not in visited:
                visited.add(importer_rel)
                excluded.add(importer_rel)
                queue.append(importer_rel)
                total_cascade += 1

    print(f"Cascade: +{total_cascade} files (total: {len(excluded)})", flush=True)

    # Step 6: Inject into build.gradle
    lines = [f"                exclude '{rel}'" for rel in sorted(excluded)]
    injection = "\n".join(lines)

    with open(BUILD_GRADLE, "r", encoding="utf-8") as f:
        content = f.read()

    if MARKER not in content:
        print(f"ERROR: marker not found in {BUILD_GRADLE}", flush=True)
        sys.exit(1)

    new_content = content.replace(MARKER, MARKER + "\n" + injection)

    with open(BUILD_GRADLE, "w", encoding="utf-8") as f:
        f.write(new_content)

    print(f"Done: injected {len(lines)} excludes into {BUILD_GRADLE}", flush=True)

if __name__ == "__main__":
    main()
