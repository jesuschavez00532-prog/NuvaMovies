package com.efs.sdk.net.p057a.p058a;

import anet.channel.entity.EventType;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.zip.GZIPInputStream;

/* renamed from: com.efs.sdk.net.a.a.e */
/* loaded from: classes.dex */
public final class C1760e extends FilterOutputStream {

    /* renamed from: b */
    private static final ExecutorService f7355b = Executors.newCachedThreadPool();

    /* renamed from: a */
    private final Future<Void> f7356a;

    /* renamed from: com.efs.sdk.net.a.a.e$a */
    /* loaded from: classes.dex */
    static class a implements Callable<Void> {

        /* renamed from: a */
        private final InputStream f7357a;

        /* renamed from: b */
        private final OutputStream f7358b;

        public a(InputStream inputStream, OutputStream outputStream) {
            this.f7357a = inputStream;
            this.f7358b = outputStream;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            GZIPInputStream gZIPInputStream = new GZIPInputStream(this.f7357a);
            try {
                C1764i.m7858a(gZIPInputStream, this.f7358b, new byte[EventType.AUTH_FAIL]);
                gZIPInputStream.close();
                this.f7358b.close();
                return null;
            } catch (Throwable th) {
                gZIPInputStream.close();
                this.f7358b.close();
                throw th;
            }
        }
    }

    private C1760e(OutputStream outputStream, Future<Void> future) {
        super(outputStream);
        this.f7356a = future;
    }

    /* renamed from: a */
    public static C1760e m7847a(OutputStream outputStream) {
        PipedInputStream pipedInputStream = new PipedInputStream();
        return new C1760e(new PipedOutputStream(pipedInputStream), f7355b.submit(new a(pipedInputStream, outputStream)));
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            super.close();
            m7848a(this.f7356a);
        } catch (Throwable th) {
            try {
                m7848a(this.f7356a);
            } catch (IOException unused) {
            }
            throw th;
        }
    }

    /* renamed from: a */
    private static <T> T m7848a(Future<T> future) {
        while (true) {
            try {
                return future.get();
            } catch (InterruptedException unused) {
            } catch (ExecutionException e10) {
                Throwable cause = e10.getCause();
                C1759d.m7846a(cause, IOException.class);
                C1759d.m7846a(cause, Error.class);
                C1759d.m7846a(cause, RuntimeException.class);
                throw new RuntimeException(cause);
            }
        }
    }
}
