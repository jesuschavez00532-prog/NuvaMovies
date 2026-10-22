package p322s1;

import android.util.Log;
import anet.channel.request.Request;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import p109e2.AbstractC4121k;
import p230m1.InterfaceC5569b;

/* renamed from: s1.n */
/* loaded from: classes.dex */
public final class C6638n implements ImageHeaderParser {

    /* renamed from: a */
    static final byte[] f25464a = "Exif\u0000\u0000".getBytes(Charset.forName(Request.DEFAULT_CHARSET));

    /* renamed from: b */
    private static final int[] f25465b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* renamed from: s1.n$a */
    /* loaded from: classes.dex */
    private static final class a implements c {

        /* renamed from: a */
        private final ByteBuffer f25466a;

        a(ByteBuffer byteBuffer) {
            this.f25466a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // p322s1.C6638n.c
        /* renamed from: a */
        public int mo25917a() {
            return (mo25918b() << 8) | mo25918b();
        }

        @Override // p322s1.C6638n.c
        /* renamed from: b */
        public short mo25918b() {
            if (this.f25466a.remaining() >= 1) {
                return (short) (this.f25466a.get() & 255);
            }
            throw new c.a();
        }

        @Override // p322s1.C6638n.c
        public int read(byte[] bArr, int i10) {
            int min = Math.min(i10, this.f25466a.remaining());
            if (min == 0) {
                return -1;
            }
            this.f25466a.get(bArr, 0, min);
            return min;
        }

        @Override // p322s1.C6638n.c
        public long skip(long j10) {
            int min = (int) Math.min(this.f25466a.remaining(), j10);
            ByteBuffer byteBuffer = this.f25466a;
            byteBuffer.position(byteBuffer.position() + min);
            return min;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s1.n$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        private final ByteBuffer f25467a;

        b(byte[] bArr, int i10) {
            this.f25467a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i10);
        }

        /* renamed from: c */
        private boolean m25919c(int i10, int i11) {
            if (this.f25467a.remaining() - i10 >= i11) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        short m25920a(int i10) {
            if (m25919c(i10, 2)) {
                return this.f25467a.getShort(i10);
            }
            return (short) -1;
        }

        /* renamed from: b */
        int m25921b(int i10) {
            if (m25919c(i10, 4)) {
                return this.f25467a.getInt(i10);
            }
            return -1;
        }

        /* renamed from: d */
        int m25922d() {
            return this.f25467a.remaining();
        }

        /* renamed from: e */
        void m25923e(ByteOrder byteOrder) {
            this.f25467a.order(byteOrder);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s1.n$c */
    /* loaded from: classes.dex */
    public interface c {

        /* renamed from: s1.n$c$a */
        /* loaded from: classes.dex */
        public static final class a extends IOException {
            a() {
                super("Unexpectedly reached end of a file");
            }
        }

        /* renamed from: a */
        int mo25917a();

        /* renamed from: b */
        short mo25918b();

        int read(byte[] bArr, int i10);

        long skip(long j10);
    }

    /* renamed from: s1.n$d */
    /* loaded from: classes.dex */
    private static final class d implements c {

        /* renamed from: a */
        private final InputStream f25468a;

        d(InputStream inputStream) {
            this.f25468a = inputStream;
        }

        @Override // p322s1.C6638n.c
        /* renamed from: a */
        public int mo25917a() {
            return (mo25918b() << 8) | mo25918b();
        }

        @Override // p322s1.C6638n.c
        /* renamed from: b */
        public short mo25918b() {
            int read = this.f25468a.read();
            if (read != -1) {
                return (short) read;
            }
            throw new c.a();
        }

        @Override // p322s1.C6638n.c
        public int read(byte[] bArr, int i10) {
            int i11 = 0;
            int i12 = 0;
            while (i11 < i10 && (i12 = this.f25468a.read(bArr, i11, i10 - i11)) != -1) {
                i11 += i12;
            }
            if (i11 == 0 && i12 == -1) {
                throw new c.a();
            }
            return i11;
        }

        @Override // p322s1.C6638n.c
        public long skip(long j10) {
            if (j10 < 0) {
                return 0L;
            }
            long j11 = j10;
            while (j11 > 0) {
                long skip = this.f25468a.skip(j11);
                if (skip <= 0) {
                    if (this.f25468a.read() == -1) {
                        break;
                    }
                    skip = 1;
                }
                j11 -= skip;
            }
            return j10 - j11;
        }
    }

    /* renamed from: e */
    private static int m25908e(int i10, int i11) {
        return i10 + 2 + (i11 * 12);
    }

    /* renamed from: f */
    private int m25909f(c cVar, InterfaceC5569b interfaceC5569b) {
        try {
            int mo25917a = cVar.mo25917a();
            if (!m25911h(mo25917a)) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Parser doesn't handle magic number: " + mo25917a);
                }
                return -1;
            }
            int m25913j = m25913j(cVar);
            if (m25913j == -1) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
                }
                return -1;
            }
            byte[] bArr = (byte[]) interfaceC5569b.mo22611d(m25913j, byte[].class);
            try {
                return m25915l(cVar, bArr, m25913j);
            } finally {
                interfaceC5569b.put(bArr);
            }
        } catch (c.a unused) {
            return -1;
        }
    }

    /* renamed from: g */
    private ImageHeaderParser.ImageType m25910g(c cVar) {
        try {
            int mo25917a = cVar.mo25917a();
            if (mo25917a == 65496) {
                return ImageHeaderParser.ImageType.JPEG;
            }
            int mo25918b = (mo25917a << 8) | cVar.mo25918b();
            if (mo25918b == 4671814) {
                return ImageHeaderParser.ImageType.GIF;
            }
            int mo25918b2 = (mo25918b << 8) | cVar.mo25918b();
            if (mo25918b2 == -1991225785) {
                cVar.skip(21L);
                try {
                    if (cVar.mo25918b() >= 3) {
                        return ImageHeaderParser.ImageType.PNG_A;
                    }
                    return ImageHeaderParser.ImageType.PNG;
                } catch (c.a unused) {
                    return ImageHeaderParser.ImageType.PNG;
                }
            }
            if (mo25918b2 != 1380533830) {
                return m25916m(cVar, mo25918b2);
            }
            cVar.skip(4L);
            if (((cVar.mo25917a() << 16) | cVar.mo25917a()) != 1464156752) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int mo25917a2 = (cVar.mo25917a() << 16) | cVar.mo25917a();
            if ((mo25917a2 & (-256)) != 1448097792) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int i10 = mo25917a2 & 255;
            if (i10 == 88) {
                cVar.skip(4L);
                short mo25918b3 = cVar.mo25918b();
                if ((mo25918b3 & 2) != 0) {
                    return ImageHeaderParser.ImageType.ANIMATED_WEBP;
                }
                if ((mo25918b3 & 16) != 0) {
                    return ImageHeaderParser.ImageType.WEBP_A;
                }
                return ImageHeaderParser.ImageType.WEBP;
            }
            if (i10 == 76) {
                cVar.skip(4L);
                if ((cVar.mo25918b() & 8) != 0) {
                    return ImageHeaderParser.ImageType.WEBP_A;
                }
                return ImageHeaderParser.ImageType.WEBP;
            }
            return ImageHeaderParser.ImageType.WEBP;
        } catch (c.a unused2) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
    }

    /* renamed from: h */
    private static boolean m25911h(int i10) {
        return (i10 & 65496) == 65496 || i10 == 19789 || i10 == 18761;
    }

    /* renamed from: i */
    private boolean m25912i(byte[] bArr, int i10) {
        boolean z10;
        if (bArr != null && i10 > f25464a.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            int i11 = 0;
            while (true) {
                byte[] bArr2 = f25464a;
                if (i11 >= bArr2.length) {
                    break;
                }
                if (bArr[i11] != bArr2[i11]) {
                    return false;
                }
                i11++;
            }
        }
        return z10;
    }

    /* renamed from: j */
    private int m25913j(c cVar) {
        short mo25918b;
        int mo25917a;
        long j10;
        long skip;
        do {
            short mo25918b2 = cVar.mo25918b();
            if (mo25918b2 != 255) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Unknown segmentId=" + ((int) mo25918b2));
                }
                return -1;
            }
            mo25918b = cVar.mo25918b();
            if (mo25918b == 218) {
                return -1;
            }
            if (mo25918b == 217) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Found MARKER_EOI in exif segment");
                }
                return -1;
            }
            mo25917a = cVar.mo25917a() - 2;
            if (mo25918b != 225) {
                j10 = mo25917a;
                skip = cVar.skip(j10);
            } else {
                return mo25917a;
            }
        } while (skip == j10);
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Unable to skip enough data, type: " + ((int) mo25918b) + ", wanted to skip: " + mo25917a + ", but actually skipped: " + skip);
        }
        return -1;
    }

    /* renamed from: k */
    private static int m25914k(b bVar) {
        ByteOrder byteOrder;
        short m25920a = bVar.m25920a(6);
        if (m25920a != 18761) {
            if (m25920a != 19789) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Unknown endianness = " + ((int) m25920a));
                }
                byteOrder = ByteOrder.BIG_ENDIAN;
            } else {
                byteOrder = ByteOrder.BIG_ENDIAN;
            }
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        bVar.m25923e(byteOrder);
        int m25921b = bVar.m25921b(10) + 6;
        short m25920a2 = bVar.m25920a(m25921b);
        for (int i10 = 0; i10 < m25920a2; i10++) {
            int m25908e = m25908e(m25921b, i10);
            short m25920a3 = bVar.m25920a(m25908e);
            if (m25920a3 == 274) {
                short m25920a4 = bVar.m25920a(m25908e + 2);
                if (m25920a4 >= 1 && m25920a4 <= 12) {
                    int m25921b2 = bVar.m25921b(m25908e + 4);
                    if (m25921b2 < 0) {
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Negative tiff component count");
                        }
                    } else {
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Got tagIndex=" + i10 + " tagType=" + ((int) m25920a3) + " formatCode=" + ((int) m25920a4) + " componentCount=" + m25921b2);
                        }
                        int i11 = m25921b2 + f25465b[m25920a4];
                        if (i11 > 4) {
                            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                Log.d("DfltImageHeaderParser", "Got byte count > 4, not orientation, continuing, formatCode=" + ((int) m25920a4));
                            }
                        } else {
                            int i12 = m25908e + 8;
                            if (i12 >= 0 && i12 <= bVar.m25922d()) {
                                if (i11 >= 0 && i11 + i12 <= bVar.m25922d()) {
                                    return bVar.m25920a(i12);
                                }
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    Log.d("DfltImageHeaderParser", "Illegal number of bytes for TI tag data tagType=" + ((int) m25920a3));
                                }
                            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                Log.d("DfltImageHeaderParser", "Illegal tagValueOffset=" + i12 + " tagType=" + ((int) m25920a3));
                            }
                        }
                    }
                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Got invalid format code = " + ((int) m25920a4));
                }
            }
        }
        return -1;
    }

    /* renamed from: l */
    private int m25915l(c cVar, byte[] bArr, int i10) {
        int read = cVar.read(bArr, i10);
        if (read != i10) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + i10 + ", actually read: " + read);
            }
            return -1;
        }
        if (m25912i(bArr, i10)) {
            return m25914k(new b(bArr, i10));
        }
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
        }
        return -1;
    }

    /* renamed from: m */
    private ImageHeaderParser.ImageType m25916m(c cVar, int i10) {
        boolean z10;
        if (((cVar.mo25917a() << 16) | cVar.mo25917a()) != 1718909296) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        int mo25917a = (cVar.mo25917a() << 16) | cVar.mo25917a();
        if (mo25917a == 1635150195) {
            return ImageHeaderParser.ImageType.ANIMATED_AVIF;
        }
        int i11 = 0;
        if (mo25917a == 1635150182) {
            z10 = true;
        } else {
            z10 = false;
        }
        cVar.skip(4L);
        int i12 = i10 - 16;
        if (i12 % 4 == 0) {
            while (i11 < 5 && i12 > 0) {
                int mo25917a2 = (cVar.mo25917a() << 16) | cVar.mo25917a();
                if (mo25917a2 == 1635150195) {
                    return ImageHeaderParser.ImageType.ANIMATED_AVIF;
                }
                if (mo25917a2 == 1635150182) {
                    z10 = true;
                }
                i11++;
                i12 -= 4;
            }
        }
        if (z10) {
            return ImageHeaderParser.ImageType.AVIF;
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* renamed from: a */
    public ImageHeaderParser.ImageType mo7396a(ByteBuffer byteBuffer) {
        return m25910g(new a((ByteBuffer) AbstractC4121k.m17226d(byteBuffer)));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* renamed from: b */
    public int mo7397b(InputStream inputStream, InterfaceC5569b interfaceC5569b) {
        return m25909f(new d((InputStream) AbstractC4121k.m17226d(inputStream)), (InterfaceC5569b) AbstractC4121k.m17226d(interfaceC5569b));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* renamed from: c */
    public ImageHeaderParser.ImageType mo7398c(InputStream inputStream) {
        return m25910g(new d((InputStream) AbstractC4121k.m17226d(inputStream)));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* renamed from: d */
    public int mo7399d(ByteBuffer byteBuffer, InterfaceC5569b interfaceC5569b) {
        return m25909f(new a((ByteBuffer) AbstractC4121k.m17226d(byteBuffer)), (InterfaceC5569b) AbstractC4121k.m17226d(interfaceC5569b));
    }
}
