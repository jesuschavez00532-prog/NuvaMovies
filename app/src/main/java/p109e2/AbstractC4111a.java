package p109e2;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: e2.a */
/* loaded from: classes.dex */
public abstract class AbstractC4111a {

    /* renamed from: a */
    private static final AtomicReference f18062a = new AtomicReference();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e2.a$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        final int f18065a;

        /* renamed from: b */
        final int f18066b;

        /* renamed from: c */
        final byte[] f18067c;

        b(byte[] bArr, int i10, int i11) {
            this.f18067c = bArr;
            this.f18065a = i10;
            this.f18066b = i11;
        }
    }

    /* renamed from: a */
    public static ByteBuffer m17190a(File file) {
        RandomAccessFile randomAccessFile;
        FileChannel fileChannel = null;
        try {
            long length = file.length();
            if (length <= 2147483647L) {
                if (length != 0) {
                    randomAccessFile = new RandomAccessFile(file, "r");
                    try {
                        fileChannel = randomAccessFile.getChannel();
                        MappedByteBuffer load = fileChannel.map(FileChannel.MapMode.READ_ONLY, 0L, length).load();
                        try {
                            fileChannel.close();
                        } catch (IOException unused) {
                        }
                        try {
                            randomAccessFile.close();
                        } catch (IOException unused2) {
                        }
                        return load;
                    } catch (Throwable th) {
                        th = th;
                        if (fileChannel != null) {
                            try {
                                fileChannel.close();
                            } catch (IOException unused3) {
                            }
                        }
                        if (randomAccessFile != null) {
                            try {
                                randomAccessFile.close();
                                throw th;
                            } catch (IOException unused4) {
                                throw th;
                            }
                        }
                        throw th;
                    }
                }
                throw new IOException("File unsuitable for memory mapping");
            }
            throw new IOException("File too large to map into memory");
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile = null;
        }
    }

    /* renamed from: b */
    public static ByteBuffer m17191b(InputStream inputStream) throws java.io.IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        byte[] bArr = (byte[]) f18062a.getAndSet(null);
        if (bArr == null) {
            bArr = new byte[16384];
        }
        while (true) {
            int read = inputStream.read(bArr);
            if (read >= 0) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                f18062a.set(bArr);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                return m17193d(ByteBuffer.allocateDirect(byteArray.length).put(byteArray));
            }
        }
    }

    /* renamed from: c */
    private static b m17192c(ByteBuffer byteBuffer) {
        if (!byteBuffer.isReadOnly() && byteBuffer.hasArray()) {
            return new b(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit());
        }
        return null;
    }

    /* renamed from: d */
    public static ByteBuffer m17193d(ByteBuffer byteBuffer) {
        return (ByteBuffer) byteBuffer.position(0);
    }

    /* renamed from: e */
    public static byte[] m17194e(ByteBuffer byteBuffer) {
        b m17192c = m17192c(byteBuffer);
        if (m17192c != null && m17192c.f18065a == 0 && m17192c.f18066b == m17192c.f18067c.length) {
            return byteBuffer.array();
        }
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        byte[] bArr = new byte[asReadOnlyBuffer.limit()];
        m17193d(asReadOnlyBuffer);
        asReadOnlyBuffer.get(bArr);
        return bArr;
    }

    /* renamed from: f */
    public static void m17195f(ByteBuffer byteBuffer, File file) {
        RandomAccessFile randomAccessFile;
        m17193d(byteBuffer);
        FileChannel fileChannel = null;
        try {
            randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                fileChannel = randomAccessFile.getChannel();
                fileChannel.write(byteBuffer);
                fileChannel.force(false);
                fileChannel.close();
                randomAccessFile.close();
                try {
                    fileChannel.close();
                } catch (IOException unused) {
                }
                try {
                    randomAccessFile.close();
                } catch (IOException unused2) {
                }
            } catch (Throwable th) {
                th = th;
                if (fileChannel != null) {
                    try {
                        fileChannel.close();
                    } catch (IOException unused3) {
                    }
                }
                if (randomAccessFile != null) {
                    try {
                        randomAccessFile.close();
                        throw th;
                    } catch (IOException unused4) {
                        throw th;
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile = null;
        }
    }

    /* renamed from: g */
    public static InputStream m17196g(ByteBuffer byteBuffer) {
        return new a(byteBuffer);
    }

    /* renamed from: e2.a$a */
    /* loaded from: classes.dex */
    private static class a extends InputStream {

        /* renamed from: a */
        private final ByteBuffer f18063a;

        /* renamed from: b */
        private int f18064b = -1;

        a(ByteBuffer byteBuffer) {
            this.f18063a = byteBuffer;
        }

        @Override // java.io.InputStream
        public int available() throws java.io.IOException {
            return this.f18063a.remaining();
        }

        @Override // java.io.InputStream
        public synchronized void mark(int i10) {
            this.f18064b = this.f18063a.position();
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read() throws java.io.IOException {
            if (this.f18063a.hasRemaining()) {
                return this.f18063a.get() & 255;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public synchronized void reset() {
            int i10 = this.f18064b;
            if (i10 != -1) {
                this.f18063a.position(i10);
            } else {
                throw new IOException("Cannot reset to unset mark position");
            }
        }

        @Override // java.io.InputStream
        public long skip(long j10) throws java.io.IOException {
            if (!this.f18063a.hasRemaining()) {
                return -1L;
            }
            long min = Math.min(j10, available());
            this.f18063a.position((int) (r0.position() + min));
            return min;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) throws java.io.IOException {
            if (!this.f18063a.hasRemaining()) {
                return -1;
            }
            int min = Math.min(i11, available());
            this.f18063a.get(bArr, i10, min);
            return min;
        }
    }
}
