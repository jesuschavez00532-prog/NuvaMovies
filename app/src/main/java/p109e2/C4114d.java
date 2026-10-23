package p109e2;

import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* renamed from: e2.d */
/* loaded from: classes.dex */
public final class C4114d extends InputStream {

    /* renamed from: c */
    private static final Queue f18071c = AbstractC4122l.m17234g(0);

    /* renamed from: a */
    private InputStream f18072a;

    /* renamed from: b */
    private IOException f18073b;

    C4114d() {
    }

    /* renamed from: b */
    public static C4114d m17202b(InputStream inputStream) {
        C4114d c4114d;
        Queue queue = f18071c;
        synchronized (queue) {
            c4114d = (C4114d) queue.poll();
        }
        if (c4114d == null) {
            c4114d = new C4114d();
        }
        c4114d.m17205d(inputStream);
        return c4114d;
    }

    /* renamed from: a */
    public IOException m17203a() {
        return this.f18073b;
    }

    @Override // java.io.InputStream
    public int available() throws java.io.IOException {
        return this.f18072a.available();
    }

    /* renamed from: c */
    public void m17204c() {
        this.f18073b = null;
        this.f18072a = null;
        Queue queue = f18071c;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        this.f18072a.close();
    }

    /* renamed from: d */
    void m17205d(InputStream inputStream) {
        this.f18072a = inputStream;
    }

    @Override // java.io.InputStream
    public void mark(int i10) {
        this.f18072a.mark(i10);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f18072a.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws java.io.IOException {
        try {
            return this.f18072a.read();
        } catch (IOException e10) {
            this.f18073b = e10;
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() {
        this.f18072a.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j10) throws java.io.IOException {
        try {
            return this.f18072a.skip(j10);
        } catch (IOException e10) {
            this.f18073b = e10;
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws java.io.IOException {
        try {
            return this.f18072a.read(bArr);
        } catch (IOException e10) {
            this.f18073b = e10;
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws java.io.IOException {
        try {
            return this.f18072a.read(bArr, i10, i11);
        } catch (IOException e10) {
            this.f18073b = e10;
            throw e10;
        }
    }
}
