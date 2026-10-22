package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

/* renamed from: androidx.fragment.app.h0 */
/* loaded from: classes.dex */
final class C0719h0 extends Writer {

    /* renamed from: a */
    private final String f2841a;

    /* renamed from: b */
    private StringBuilder f2842b = new StringBuilder(128);

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0719h0(String str) {
        this.f2841a = str;
    }

    /* renamed from: a */
    private void m3348a() {
        if (this.f2842b.length() > 0) {
            Log.d(this.f2841a, this.f2842b.toString());
            StringBuilder sb2 = this.f2842b;
            sb2.delete(0, sb2.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m3348a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        m3348a();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            char c10 = cArr[i10 + i12];
            if (c10 == '\n') {
                m3348a();
            } else {
                this.f2842b.append(c10);
            }
        }
    }
}
