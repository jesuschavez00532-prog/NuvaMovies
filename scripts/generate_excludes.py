#!/usr/bin/env python3
"""
Multi-pass exclude generator:
Pass 1: Find files with direct broken imports
Pass 2+: Find files that reference symbols from excluded files (cascade)
Repeats until no new files are added.
"""
import os
import re

JAVA_ROOT = "app/src/main/java"
BUILD_GRADLE = "app/build.gradle"
MARKER = "                exclude 'com/zhy/**'"

# Top-level packages already excluded in build.gradle
EXCLUDED_TOP = {
    "anet", "okhttp3", "okio", "antlr", "retrofit2", "javax",
    "androidx", "android", "io", "kotlinx", "org",
}

# Import patterns for directly excluded lib packages
DIRECT_BAD_IMPORT_RE = re.compile(
    r"^import\s+("
    r"androidx\.|"
    r"com\.umeng\.|"
    r"com\.bumptech\.|"
    r"com\.zhy\.|"
    r"com\.raizlabs\.|"
    r"com\.open\.leanback\.|"
    r"kotlinx\.coroutines\.internal\.|"
    r"anet\.|"
    r"com\.lzy\.|"
    r"com\.titan\.|"
    r"com\.qiniu\.android\.dns\.|"
    r"org\.android\.|"
    r"com\.taobao\.|"
    r"com\.google\.android\.gms\.internal\.|"
    r"tv\.danmaku\."
    r")",
    re.MULTILINE,
)

def get_rel(full_path):
    rel = full_path.replace(JAVA_ROOT + "/", "").replace(JAVA_ROOT + os.sep, "")
    return rel.replace("\\", "/")

def get_class_name(rel_path):
    """Get simple class name from relative path like p400xa/C7589m1.java -> C7589m1"""
    return rel_path.replace("/", ".").replace(".java", "")

def get_simple_name(rel_path):
    return os.path.basename(rel_path).replace(".java", "")

def main():
    # Collect all java files (excluding already-excluded top-level packages)
    all_files = {}  # rel_path -> full_path
    for root, dirs, files in os.walk(JAVA_ROOT):
        for fname in files:
            if not fname.endswith(".java"):
                continue
            full = os.path.join(root, fname)
            rel = get_rel(full)
            top_pkg = rel.split("/")[0]
            if top_pkg in EXCLUDED_TOP:
                continue
            all_files[rel] = full

    print(f"Total app Java files: {len(all_files)}")

    # Pass 1: Direct bad imports
    excluded = set()
    for rel, full in all_files.items():
        try:
            with open(full, "r", encoding="utf-8", errors="ignore") as f:
                content = f.read()
            if DIRECT_BAD_IMPORT_RE.search(content):
                excluded.add(rel)
        except Exception:
            pass

    print(f"Pass 1: {len(excluded)} files with direct bad imports")

    # Passes 2+: Cascade - find files that import from excluded files
    iteration = 0
    while True:
        iteration += 1
        # Build set of simple class names from excluded files
        excluded_simple = set()
        excluded_pkg_classes = set()
        for rel in excluded:
            simple = get_simple_name(rel)
            excluded_simple.add(simple)
            # Also track package.ClassName
            pkg_class = rel.replace("/", ".").replace(".java", "")
            excluded_pkg_classes.add(pkg_class)
            # Track just the last component (for inner class references)
            parts = rel.split("/")
            if len(parts) >= 2:
                pkg = parts[-2]  # immediate parent package
                excluded_pkg_classes.add(f"{pkg}.{simple}")

        new_excluded = set()
        for rel, full in all_files.items():
            if rel in excluded:
                continue
            try:
                with open(full, "r", encoding="utf-8", errors="ignore") as f:
                    content = f.read()
                # Check if this file imports any excluded class
                for excl_rel in excluded:
                    excl_pkg = excl_rel.rsplit("/", 1)[0].replace("/", ".")
                    excl_simple = get_simple_name(excl_rel)
                    # Check for import of the excluded class
                    pattern = rf"import\s+{re.escape(excl_pkg)}\.{re.escape(excl_simple)}\s*;"
                    if re.search(pattern, content):
                        new_excluded.add(rel)
                        break
            except Exception:
                pass

        if not new_excluded:
            print(f"Pass {iteration + 1}: No new cascaded files, stopping")
            break

        excluded.update(new_excluded)
        print(f"Pass {iteration + 1}: +{len(new_excluded)} cascaded files (total: {len(excluded)})")

        if iteration > 10:  # Safety limit
            print("Hit iteration limit")
            break

    print(f"Total files to exclude: {len(excluded)}")

    # Generate exclude lines
    exclude_lines = []
    for rel in sorted(excluded):
        exclude_lines.append(f"                exclude '{rel}'")

    if not exclude_lines:
        print("Nothing to exclude")
        return

    # Inject into build.gradle
    with open(BUILD_GRADLE, "r", encoding="utf-8") as f:
        content = f.read()

    injection = "\n".join(exclude_lines)
    new_content = content.replace(
        MARKER,
        MARKER + "\n" + injection
    )

    if new_content == content:
        print(f"WARNING: marker '{MARKER}' not found in {BUILD_GRADLE}")
        # Try to show what the file looks like near where marker should be
        lines = content.split("\n")
        for i, line in enumerate(lines):
            if "com/zhy" in line:
                print(f"  Line {i}: {repr(line)}")
        return

    with open(BUILD_GRADLE, "w", encoding="utf-8") as f:
        f.write(new_content)

    print(f"Injected {len(exclude_lines)} file excludes into {BUILD_GRADLE}")

if __name__ == "__main__":
    main()
