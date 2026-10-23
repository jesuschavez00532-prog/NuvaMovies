#!/usr/bin/env python3
"""
Finds app Java files that import from excluded/removed library packages
and injects file-level excludes into build.gradle so they are skipped.
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
    "com",  # handled via sub-exclusions
}

# Import patterns that indicate the file uses removed libs
BAD_IMPORT_RE = re.compile(
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
    r"org\.android\."
    r")",
    re.MULTILINE,
)

def is_bad_file(path):
    try:
        with open(path, "r", encoding="utf-8", errors="ignore") as f:
            content = f.read()
        return bool(BAD_IMPORT_RE.search(content))
    except Exception:
        return False

def main():
    excludes = []
    for root, dirs, files in os.walk(JAVA_ROOT):
        for fname in files:
            if not fname.endswith(".java"):
                continue
            full = os.path.join(root, fname)
            rel = full.replace(JAVA_ROOT + "/", "").replace(JAVA_ROOT + os.sep, "")
            rel = rel.replace("\\", "/")
            top_pkg = rel.split("/")[0]
            if top_pkg in EXCLUDED_TOP:
                continue
            if is_bad_file(full):
                excludes.append(f"                exclude '{rel}'")

    print(f"Found {len(excludes)} files with broken imports to exclude")

    if not excludes:
        print("Nothing to exclude")
        return

    with open(BUILD_GRADLE, "r", encoding="utf-8") as f:
        content = f.read()

    injection = "\n".join(excludes)
    new_content = content.replace(
        MARKER,
        MARKER + "\n" + injection
    )

    if new_content == content:
        print(f"WARNING: marker not found in {BUILD_GRADLE}")
        return

    with open(BUILD_GRADLE, "w", encoding="utf-8") as f:
        f.write(new_content)

    print(f"Injected {len(excludes)} file excludes into {BUILD_GRADLE}")

if __name__ == "__main__":
    main()
