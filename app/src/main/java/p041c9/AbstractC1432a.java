package p041c9;

import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: c9.a */
/* loaded from: classes2.dex */
abstract class AbstractC1432a {
    /* renamed from: a */
    private static void m6678a(ByteBuffer byteBuffer) {
        if (byteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
        } else {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }

    /* renamed from: b */
    public static C1435d m6679b(FileChannel fileChannel) {
        return m6680c(fileChannel, m6681d(fileChannel));
    }

    /* renamed from: c */
    public static C1435d m6680c(FileChannel fileChannel, long j10) {
        if (j10 >= 32) {
            fileChannel.position(j10 - 24);
            ByteBuffer allocate = ByteBuffer.allocate(24);
            fileChannel.read(allocate);
            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
            allocate.order(byteOrder);
            if (allocate.getLong(8) == 2334950737559900225L && allocate.getLong(16) == 3617552046287187010L) {
                long j11 = allocate.getLong(0);
                if (j11 >= allocate.capacity() && j11 <= 2147483639) {
                    int i10 = (int) (8 + j11);
                    long j12 = j10 - i10;
                    if (j12 >= 0) {
                        fileChannel.position(j12);
                        ByteBuffer allocate2 = ByteBuffer.allocate(i10);
                        fileChannel.read(allocate2);
                        allocate2.order(byteOrder);
                        long j13 = allocate2.getLong(0);
                        if (j13 == j11) {
                            return C1435d.m6691b(allocate2, Long.valueOf(j12));
                        }
                        throw new C1437f("APK Signing Block sizes in header and footer do not match: " + j13 + " vs " + j11);
                    }
                    throw new C1437f("APK Signing Block offset out of range: " + j12);
                }
                throw new C1437f("APK Signing Block size out of range: " + j11);
            }
            throw new C1437f("No APK Signing Block before ZIP Central Directory");
        }
        throw new C1437f("APK too small for APK Signing Block. ZIP Central Directory offset: " + j10);
    }

    /* renamed from: d */
    public static long m6681d(FileChannel fileChannel) {
        return m6682e(fileChannel, m6685h(fileChannel));
    }

    /* renamed from: e */
    public static long m6682e(FileChannel fileChannel, long j10) {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        fileChannel.position((fileChannel.size() - j10) - 6);
        fileChannel.read(allocate);
        return allocate.getInt(0);
    }

    /* renamed from: f */
    public static Map m6683f(ByteBuffer byteBuffer) {
        m6678a(byteBuffer);
        ByteBuffer m6686i = m6686i(byteBuffer, 8, byteBuffer.capacity() - 24);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i10 = 0;
        while (m6686i.hasRemaining()) {
            i10++;
            if (m6686i.remaining() >= 8) {
                long j10 = m6686i.getLong();
                if (j10 >= 4 && j10 <= 2147483647L) {
                    int i11 = (int) j10;
                    int position = m6686i.position() + i11;
                    if (i11 <= m6686i.remaining()) {
                        linkedHashMap.put(Integer.valueOf(m6686i.getInt()), m6684g(m6686i, i11 - 4));
                        m6686i.position(position);
                    } else {
                        throw new C1437f("APK Signing Block entry #" + i10 + " size out of range: " + i11 + ", available: " + m6686i.remaining());
                    }
                } else {
                    throw new C1437f("APK Signing Block entry #" + i10 + " size out of range: " + j10);
                }
            } else {
                throw new C1437f("Insufficient data to read size of APK Signing Block entry #" + i10);
            }
        }
        return linkedHashMap;
    }

    /* renamed from: g */
    private static ByteBuffer m6684g(ByteBuffer byteBuffer, int i10) {
        if (i10 >= 0) {
            int limit = byteBuffer.limit();
            int position = byteBuffer.position();
            int i11 = i10 + position;
            if (i11 >= position && i11 <= limit) {
                byteBuffer.limit(i11);
                try {
                    ByteBuffer slice = byteBuffer.slice();
                    slice.order(byteBuffer.order());
                    byteBuffer.position(i11);
                    return slice;
                } finally {
                    byteBuffer.limit(limit);
                }
            }
            throw new BufferUnderflowException();
        }
        throw new IllegalArgumentException("size: " + i10);
    }

    /* renamed from: h */
    public static long m6685h(FileChannel fileChannel) {
        long size = fileChannel.size();
        if (size >= 22) {
            long j10 = size - 22;
            long min = Math.min(j10, 65535L);
            int i10 = 0;
            while (true) {
                long j11 = i10;
                if (j11 <= min) {
                    long j12 = j10 - j11;
                    ByteBuffer allocate = ByteBuffer.allocate(4);
                    fileChannel.position(j12);
                    fileChannel.read(allocate);
                    ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                    allocate.order(byteOrder);
                    if (allocate.getInt(0) == 101010256) {
                        ByteBuffer allocate2 = ByteBuffer.allocate(2);
                        fileChannel.position(j12 + 20);
                        fileChannel.read(allocate2);
                        allocate2.order(byteOrder);
                        short s10 = allocate2.getShort(0);
                        if (s10 == i10) {
                            return s10;
                        }
                    }
                    i10++;
                } else {
                    throw new IOException("ZIP End of Central Directory (EOCD) record not found");
                }
            }
        } else {
            throw new IOException("APK too small for ZIP End of Central Directory (EOCD) record");
        }
    }

    /* renamed from: i */
    private static ByteBuffer m6686i(ByteBuffer byteBuffer, int i10, int i11) {
        if (i10 >= 0) {
            if (i11 >= i10) {
                int capacity = byteBuffer.capacity();
                if (i11 <= byteBuffer.capacity()) {
                    int limit = byteBuffer.limit();
                    int position = byteBuffer.position();
                    try {
                        byteBuffer.position(0);
                        byteBuffer.limit(i11);
                        byteBuffer.position(i10);
                        ByteBuffer slice = byteBuffer.slice();
                        slice.order(byteBuffer.order());
                        return slice;
                    } finally {
                        byteBuffer.position(0);
                        byteBuffer.limit(limit);
                        byteBuffer.position(position);
                    }
                }
                throw new IllegalArgumentException("end > capacity: " + i11 + " > " + capacity);
            }
            throw new IllegalArgumentException("end < start: " + i11 + " < " + i10);
        }
        throw new IllegalArgumentException("start: " + i10);
    }
}
