package com.google.firebase.messaging;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

/* renamed from: com.google.firebase.messaging.b */
/* loaded from: classes.dex */
abstract class AbstractC2666b {
    /* renamed from: a */
    private static byte[] m11123a(Queue queue, int i10) {
        if (queue.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) queue.remove();
        if (bArr.length == i10) {
            return bArr;
        }
        int length = i10 - bArr.length;
        byte[] copyOf = Arrays.copyOf(bArr, i10);
        while (length > 0) {
            byte[] bArr2 = (byte[]) queue.remove();
            int min = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, copyOf, i10 - length, min);
            length -= min;
        }
        return copyOf;
    }

    /* renamed from: b */
    public static InputStream m11124b(InputStream inputStream, long j10) {
        return new a(inputStream, j10);
    }

    /* renamed from: c */
    private static int m11125c(long j10) {
        if (j10 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j10 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j10;
    }

    /* renamed from: d */
    public static byte[] m11126d(InputStream inputStream) {
        return m11127e(inputStream, new ArrayDeque(20), 0);
    }

    /* renamed from: e */
    private static byte[] m11127e(InputStream inputStream, Queue queue, int i10) {
        int i11;
        int min = Math.min(8192, Math.max(128, Integer.highestOneBit(i10) * 2));
        while (i10 < 2147483639) {
            int min2 = Math.min(min, 2147483639 - i10);
            byte[] bArr = new byte[min2];
            queue.add(bArr);
            int i12 = 0;
            while (i12 < min2) {
                int read = inputStream.read(bArr, i12, min2 - i12);
                if (read == -1) {
                    return m11123a(queue, i10);
                }
                i12 += read;
                i10 += read;
            }
            long j10 = min;
            if (min < 4096) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            min = m11125c(j10 * i11);
        }
        if (inputStream.read() == -1) {
            return m11123a(queue, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    /* renamed from: com.google.firebase.messaging.b$a */
    /* loaded from: classes.dex */
    private static final class a extends FilterInputStream {

        /* renamed from: a */
        private long f10261a;

        /* renamed from: b */
        private long f10262b;

        a(InputStream inputStream, long j10) {
            super(inputStream);
            this.f10262b = -1L;
            this.f10261a = j10;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int available() {
            return (int) Math.min(((FilterInputStream) this).in.available(), this.f10261a);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void mark(int i10) {
            ((FilterInputStream) this).in.mark(i10);
            this.f10262b = this.f10261a;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() {
            if (this.f10261a == 0) {
                return -1;
            }
            int read = ((FilterInputStream) this).in.read();
            if (read != -1) {
                this.f10261a--;
            }
            return read;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void reset() {
            if (((FilterInputStream) this).in.markSupported()) {
                if (this.f10262b != -1) {
                    ((FilterInputStream) this).in.reset();
                    this.f10261a = this.f10262b;
                } else {
                    throw new IOException("Mark not set");
                }
            } else {
                throw new IOException("Mark not supported");
            }
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public long skip(long j10) {
            long skip = ((FilterInputStream) this).in.skip(Math.min(j10, this.f10261a));
            this.f10261a -= skip;
            return skip;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) {
            long j10 = this.f10261a;
            if (j10 == 0) {
                return -1;
            }
            int read = ((FilterInputStream) this).in.read(bArr, i10, (int) Math.min(i11, j10));
            if (read != -1) {
                this.f10261a -= read;
            }
            return read;
        }
    }
}
