#!/usr/bin/env python3
"""
Fix jadx-renamed UI packages: copy files from pNNNui.activity to ui.activity,
updating package declarations and self-referencing imports.
This allows the BFS exclude script to properly process these files.
"""
import os
import re
import shutil

JAVA_ROOT = "app/src/main/java"

# Mapping from jadx-renamed packages to correct packages
PKG_MAP = {
    "com.interactive.brasiliptv.p061ui.activity": "com.interactive.brasiliptv.ui.activity",
    "com.live.p064ui.activity":   "com.live.ui.activity",
    "com.login.p065ui.activity":  "com.login.ui.activity",
    "com.main.p067ui.activity":   "com.main.ui.activity",
    "com.mine.p068ui.activity":   "com.mine.ui.activity",
    "com.module.p070ui.activity": "com.module.ui.activity",
    "com.vod.p089ui.activity":    "com.vod.ui.activity",
}

def pkg_to_path(pkg):
    return pkg.replace(".", "/")

def main():
    copied = 0
    skipped = 0
    for old_pkg, new_pkg in PKG_MAP.items():
        src_dir = os.path.join(JAVA_ROOT, pkg_to_path(old_pkg))
        dst_dir = os.path.join(JAVA_ROOT, pkg_to_path(new_pkg))
        if not os.path.isdir(src_dir):
            print(f"SKIP (no src): {src_dir}")
            continue
        os.makedirs(dst_dir, exist_ok=True)
        for fname in os.listdir(src_dir):
            if not fname.endswith(".java"):
                continue
            dst_file = os.path.join(dst_dir, fname)
            # Don't overwrite manually created stubs
            if os.path.exists(dst_file):
                skipped += 1
                continue
            src_file = os.path.join(src_dir, fname)
            with open(src_file, "r", encoding="utf-8", errors="ignore") as f:
                content = f.read()
            # Fix package declaration
            content = content.replace(f"package {old_pkg};", f"package {new_pkg};")
            # Fix self-referencing imports (import com.xxx.p061ui.activity.ClassName)
            for op, np in PKG_MAP.items():
                content = content.replace(f"import {op}.", f"import {np}.")
            with open(dst_file, "w", encoding="utf-8") as f:
                f.write(content)
            copied += 1
    print(f"Done: copied {copied} files, skipped {skipped} existing stubs")

if __name__ == "__main__":
    main()
