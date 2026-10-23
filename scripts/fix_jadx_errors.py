#!/usr/bin/env python3
"""
Barrido masivo de errores jadx conocidos en archivos Java decompilados.
Patrones corregidos:
1. Variables numéricas locales sin inicializar (float fXX; → float fXX = 0.0f;)
2. Métodos override de InputStream/OutputStream/SocketFactory sin throws IOException
3. Métodos con onTransact sin throws RemoteException
4. Métodos que lanzan InterruptedException/TimeoutException sin declararlas
5. Variables Thread/ThreadGroup sin inicializar antes de try/catch
"""
import os
import re
import sys

JAVA_ROOT = "app/src/main/java"

EXCLUDED_TOP = {
    "anet", "okhttp3", "okio", "antlr", "retrofit2", "javax",
    "androidx", "android", "io", "kotlinx", "org",
    "com",  # all com/* already excluded from build
}

def get_pkg_top(rel):
    return rel.split("/")[0]

def fix_uninit_locals(content):
    """Fix uninitialized local numeric/reference variables (jadx artifact).
    Pattern: lines with just 'float fXX;' or 'int iXX;' etc inside method bodies.
    Only matches single-name declarations (not multi-var like 'int a, b;').
    """
    # float fXX; → float fXX = 0.0f;
    content = re.sub(
        r'^(\s+)(float)([ \t]+)(f\d+);[ \t]*$',
        r'\1\2\3\4 = 0.0f;',
        content, flags=re.MULTILINE
    )
    # int iXX; → int iXX = 0;
    content = re.sub(
        r'^(\s+)(int)([ \t]+)(i\d+);[ \t]*$',
        r'\1\2\3\4 = 0;',
        content, flags=re.MULTILINE
    )
    # long lXX; → long lXX = 0L;
    content = re.sub(
        r'^(\s+)(long)([ \t]+)(l\d+);[ \t]*$',
        r'\1\2\3\4 = 0L;',
        content, flags=re.MULTILINE
    )
    # double dXX; → double dXX = 0.0;
    content = re.sub(
        r'^(\s+)(double)([ \t]+)(d\d+);[ \t]*$',
        r'\1\2\3\4 = 0.0;',
        content, flags=re.MULTILINE
    )
    # char cXX; → char cXX = '\0';
    content = re.sub(
        r'^(\s+)(char)([ \t]+)(c\d+);[ \t]*$',
        r"\1\2\3\4 = '\\0';",
        content, flags=re.MULTILINE
    )
    # boolean bXX; → boolean bXX = false;
    content = re.sub(
        r'^(\s+)(boolean)([ \t]+)(b\d+);[ \t]*$',
        r'\1\2\3\4 = false;',
        content, flags=re.MULTILINE
    )
    # Thread threadXX; → Thread threadXX = null;
    content = re.sub(
        r'^(\s+)(Thread)([ \t]+)(thread\w*);[ \t]*$',
        r'\1\2\3\4 = null;',
        content, flags=re.MULTILINE
    )
    # ThreadGroup threadGroupXX; → ThreadGroup threadGroupXX = null;
    content = re.sub(
        r'^(\s+)(ThreadGroup)([ \t]+)(threadGroup\w*);[ \t]*$',
        r'\1\2\3\4 = null;',
        content, flags=re.MULTILINE
    )
    # SecurityException eXX; → SecurityException eXX = null;
    content = re.sub(
        r'^(\s+)(SecurityException|IOException|RemoteException|Exception|Throwable)([ \t]+)(e\d+|e\w+);[ \t]*$',
        r'\1\2\3\4 = null;',
        content, flags=re.MULTILINE
    )
    return content

def fix_socket_factory_throws(content):
    """Add throws IOException to createSocket overrides missing it."""
    # Match createSocket overrides without throws IOException
    def add_throws(m):
        sig = m.group(0)
        if 'throws' in sig:
            return sig
        # Remove trailing { and add throws IOException {
        sig = sig.rstrip()
        if sig.endswith('{'):
            sig = sig[:-1].rstrip() + ' throws java.io.IOException {'
        return sig
    
    content = re.sub(
        r'public\s+Socket\s+createSocket\s*\([^)]*\)\s*\{',
        add_throws,
        content
    )
    return content

def fix_on_transact_throws(content):
    """Add throws RemoteException to onTransact overrides missing it."""
    def add_throws(m):
        sig = m.group(0)
        if 'throws' in sig:
            return sig
        sig = sig.rstrip()
        if sig.endswith('{'):
            sig = sig[:-1].rstrip() + ' throws android.os.RemoteException {'
        return sig
    
    content = re.sub(
        r'public\s+(?:final\s+)?boolean\s+onTransact\s*\([^)]*\)\s*\{',
        add_throws,
        content
    )
    return content

def fix_stream_method_throws(content):
    """Add throws IOException to read/write/close/flush overrides missing it.
    These are @Override methods on InputStream/OutputStream subclasses.
    """
    # Pattern: method signature line followed by body that calls super or field method
    # We target common InputStream/OutputStream override signatures
    stream_methods = [
        # InputStream
        r'public\s+int\s+read\s*\(\s*\)\s*\{',
        r'public\s+int\s+read\s*\(\s*byte\[\][^)]*\)\s*\{',
        r'public\s+long\s+skip\s*\(\s*long[^)]*\)\s*\{',
        r'public\s+int\s+available\s*\(\s*\)\s*\{',
        r'public\s+void\s+close\s*\(\s*\)\s*\{',
        r'public\s+void\s+reset\s*\(\s*\)\s*\{',
        # OutputStream
        r'public\s+void\s+write\s*\(\s*int[^)]*\)\s*\{',
        r'public\s+void\s+write\s*\(\s*byte\[\][^)]*\)\s*\{',
        r'public\s+void\s+flush\s*\(\s*\)\s*\{',
    ]
    
    # Only add throws if the file imports or extends InputStream/OutputStream related classes
    has_stream = bool(re.search(
        r'extends\s+(?:FilterInputStream|FilterOutputStream|InputStream|OutputStream|'
        r'BufferedInputStream|BufferedOutputStream|SSLSocketFactory|SocketFactory)',
        content
    ))
    
    if not has_stream:
        return content
    
    for pattern in stream_methods:
        def add_io_throws(m):
            sig = m.group(0)
            if 'throws' in sig:
                return sig
            sig = sig.rstrip()
            if sig.endswith('{'):
                sig = sig[:-1].rstrip() + ' throws java.io.IOException {'
            return sig
        content = re.sub(pattern, add_io_throws, content)
    
    return content

def fix_wait_throws(content):
    """Add throws InterruptedException to synchronized methods calling wait() directly.
    Pattern: synchronized method that calls wait() without try-catch.
    """
    # Only process files with wait( calls
    if 'wait(' not in content and 'wait()' not in content:
        return content
    
    # Look for synchronized method signatures that contain bare wait() calls
    # Strategy: find methods ending in ) { that don't have throws and contain wait()
    # We use a line-by-line approach for safety
    lines = content.split('\n')
    result = []
    i = 0
    while i < len(lines):
        line = lines[i]
        # Match synchronized method signatures without throws
        if (re.search(r'synchronized\s+\w', line) and 
            re.search(r'\)\s*\{', line) and 
            'throws' not in line and
            not re.search(r'(public|private|protected)\s+class', line)):
            # Check if the method body (next ~20 lines) contains a bare wait( not in try
            method_body = '\n'.join(lines[i:i+30])
            # Find wait( that's NOT preceded by try { in the same scope
            if re.search(r'\bwait\s*\(', method_body):
                # Check it's not inside a try block by looking for try before wait
                try_before_wait = re.search(r'try\s*\{.*\bwait\s*\(', method_body, re.DOTALL)
                if not try_before_wait:
                    # Add throws InterruptedException
                    line = re.sub(r'\)\s*\{', ') throws InterruptedException {', line, count=1)
        result.append(line)
        i += 1
    return '\n'.join(result)

def fix_interrupted_exception(content, filepath):
    """Fix methods that throw InterruptedException without declaring it.
    Covers: BlockingQueue overrides, methods calling lockInterruptibly/awaitNanos/await.
    """
    # BlockingQueue interface method overrides - these all declare throws InterruptedException
    blocking_queue_methods = [
        # offer(E, long, TimeUnit)
        (r'public\s+(\w+)\s+(offer)\s*\([^)]*TimeUnit[^)]*\)\s*\{',
         'throws InterruptedException'),
        # poll(long, TimeUnit)
        (r'public\s+(\w+)\s+(poll)\s*\([^)]*TimeUnit[^)]*\)\s*\{',
         'throws InterruptedException'),
        # put(E)
        (r'public\s+void\s+(put)\s*\([^)]*\)\s*\{',
         'throws InterruptedException'),
        # take()
        (r'public\s+(\w+)\s+(take)\s*\(\s*\)\s*\{',
         'throws InterruptedException'),
        # drainTo is not interruptible - skip
    ]
    
    # Only process files that implement BlockingQueue
    is_blocking_queue = 'implements' in content and 'BlockingQueue' in content
    
    if is_blocking_queue:
        for pattern, throws_clause in blocking_queue_methods:
            def add_throws_bq(m, tc=throws_clause):
                sig = m.group(0)
                if 'throws' in sig:
                    return sig
                sig = sig.rstrip()
                if sig.endswith('{'):
                    sig = sig[:-1].rstrip() + f' {tc} {{'
                return sig
            content = re.sub(pattern, add_throws_bq, content)

    def add_interrupted_throws(m):
        sig = m.group(0)
        if 'throws' in sig:
            return sig
        sig = sig.rstrip()
        if sig.endswith('{'):
            sig = sig[:-1].rstrip() + ' throws InterruptedException, java.util.concurrent.TimeoutException {'
        return sig
    
    # Only process files that actually have these throws
    has_interrupted = 'InterruptedException' in content and 'throw new InterruptedException' in content
    has_timeout = 'TimeoutException' in content and 'throw new TimeoutException' in content
    
    if not (has_interrupted or has_timeout):
        return content
    
    # Target specific method patterns that we know cause issues
    content = re.sub(
        r'(public|protected|private)\s+(?:static\s+)?(?:final\s+)?(?:synchronized\s+)?'
        r'(?:\w+(?:<[^>]*>)?)\s+\w+\s*\([^)]*TimeUnit[^)]*\)\s*\{',
        add_interrupted_throws,
        content
    )
    
    return content

def process_file(filepath, content):
    original = content
    
    content = fix_uninit_locals(content)
    content = fix_socket_factory_throws(content)
    content = fix_on_transact_throws(content)
    content = fix_stream_method_throws(content)
    content = fix_wait_throws(content)
    content = fix_interrupted_exception(content, filepath)
    
    return content, content != original

def main():
    fixed_count = 0
    changed_files = []
    
    for root, dirs, files in os.walk(JAVA_ROOT):
        # Skip excluded top-level packages
        rel_root = root.replace(JAVA_ROOT + "/", "").replace(JAVA_ROOT + os.sep, "")
        top = rel_root.split("/")[0].split(os.sep)[0]
        if top in EXCLUDED_TOP:
            continue
        
        for fname in files:
            if not fname.endswith(".java"):
                continue
            
            full = os.path.join(root, fname)
            try:
                with open(full, "r", encoding="utf-8", errors="ignore") as f:
                    content = f.read()
            except Exception as e:
                print(f"  ERROR reading {full}: {e}")
                continue
            
            new_content, changed = process_file(full, content)
            
            if changed:
                try:
                    with open(full, "w", encoding="utf-8") as f:
                        f.write(new_content)
                    fixed_count += 1
                    changed_files.append(full)
                except Exception as e:
                    print(f"  ERROR writing {full}: {e}")
    
    print(f"\nTotal archivos modificados: {fixed_count}")
    if fixed_count > 0 and fixed_count <= 50:
        for f in changed_files:
            print(f"  {f}")
    elif fixed_count > 50:
        print(f"  (mostrando primeros 20)")
        for f in changed_files[:20]:
            print(f"  {f}")

if __name__ == "__main__":
    main()
