package androidx.exifinterface.media;

import android.content.res.AssetManager;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.OsConstants;
import android.util.Log;
import androidx.exifinterface.media.AbstractC0694c;
import com.raizlabs.android.dbflow.sql.language.Operator;
import com.umeng.analytics.pro.C3373dn;
import com.umeng.ccg.C3419c;
import com.umeng.commonsdk.stateless.C3478b;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

/* renamed from: androidx.exifinterface.media.b */
/* loaded from: classes.dex */
public class C0693b {

    /* renamed from: T */
    private static SimpleDateFormat f2536T;

    /* renamed from: U */
    private static SimpleDateFormat f2537U;

    /* renamed from: Y */
    private static final d[] f2541Y;

    /* renamed from: Z */
    private static final d[] f2542Z;

    /* renamed from: a0 */
    private static final d[] f2543a0;

    /* renamed from: b0 */
    private static final d[] f2544b0;

    /* renamed from: c0 */
    private static final d[] f2545c0;

    /* renamed from: d0 */
    private static final d f2546d0;

    /* renamed from: e0 */
    private static final d[] f2547e0;

    /* renamed from: f0 */
    private static final d[] f2548f0;

    /* renamed from: g0 */
    private static final d[] f2549g0;

    /* renamed from: h0 */
    private static final d[] f2550h0;

    /* renamed from: i0 */
    static final d[][] f2551i0;

    /* renamed from: j0 */
    private static final d[] f2552j0;

    /* renamed from: k0 */
    private static final HashMap[] f2553k0;

    /* renamed from: l0 */
    private static final HashMap[] f2554l0;

    /* renamed from: m0 */
    private static final HashSet f2555m0;

    /* renamed from: n0 */
    private static final HashMap f2556n0;

    /* renamed from: o0 */
    static final Charset f2557o0;

    /* renamed from: p0 */
    static final byte[] f2558p0;

    /* renamed from: q0 */
    private static final byte[] f2559q0;

    /* renamed from: r0 */
    private static final Pattern f2560r0;

    /* renamed from: s0 */
    private static final Pattern f2561s0;

    /* renamed from: t0 */
    private static final Pattern f2562t0;

    /* renamed from: u0 */
    private static final Pattern f2564u0;

    /* renamed from: a */
    private String f2570a;

    /* renamed from: b */
    private FileDescriptor f2571b;

    /* renamed from: c */
    private AssetManager.AssetInputStream f2572c;

    /* renamed from: d */
    private int f2573d;

    /* renamed from: e */
    private boolean f2574e;

    /* renamed from: f */
    private final HashMap[] f2575f;

    /* renamed from: g */
    private Set f2576g;

    /* renamed from: h */
    private ByteOrder f2577h;

    /* renamed from: i */
    private boolean f2578i;

    /* renamed from: j */
    private boolean f2579j;

    /* renamed from: k */
    private boolean f2580k;

    /* renamed from: l */
    private int f2581l;

    /* renamed from: m */
    private int f2582m;

    /* renamed from: n */
    private byte[] f2583n;

    /* renamed from: o */
    private int f2584o;

    /* renamed from: p */
    private int f2585p;

    /* renamed from: q */
    private int f2586q;

    /* renamed from: r */
    private int f2587r;

    /* renamed from: s */
    private int f2588s;

    /* renamed from: t */
    private boolean f2589t;

    /* renamed from: u */
    private static final boolean f2563u = Log.isLoggable("ExifInterface", 3);

    /* renamed from: v */
    private static final List f2565v = Arrays.asList(1, 6, 3, 8);

    /* renamed from: w */
    private static final List f2566w = Arrays.asList(2, 7, 4, 5);

    /* renamed from: x */
    public static final int[] f2567x = {8, 8, 8};

    /* renamed from: y */
    public static final int[] f2568y = {4};

    /* renamed from: z */
    public static final int[] f2569z = {8};

    /* renamed from: A */
    static final byte[] f2517A = {-1, -40, -1};

    /* renamed from: B */
    private static final byte[] f2518B = {102, 116, 121, 112};

    /* renamed from: C */
    private static final byte[] f2519C = {109, 105, 102, 49};

    /* renamed from: D */
    private static final byte[] f2520D = {104, 101, 105, 99};

    /* renamed from: E */
    private static final byte[] f2521E = {79, 76, 89, 77, 80, 0};

    /* renamed from: F */
    private static final byte[] f2522F = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* renamed from: G */
    private static final byte[] f2523G = {-119, 80, 78, 71, C3373dn.f14523k, 10, 26, 10};

    /* renamed from: H */
    private static final byte[] f2524H = {101, 88, 73, 102};

    /* renamed from: I */
    private static final byte[] f2525I = {73, 72, 68, 82};

    /* renamed from: J */
    private static final byte[] f2526J = {73, 69, 78, 68};

    /* renamed from: K */
    private static final byte[] f2527K = {82, 73, 70, 70};

    /* renamed from: L */
    private static final byte[] f2528L = {87, 69, 66, 80};

    /* renamed from: M */
    private static final byte[] f2529M = {69, 88, 73, 70};

    /* renamed from: N */
    private static final byte[] f2530N = {-99, 1, 42};

    /* renamed from: O */
    private static final byte[] f2531O = "VP8X".getBytes(Charset.defaultCharset());

    /* renamed from: P */
    private static final byte[] f2532P = "VP8L".getBytes(Charset.defaultCharset());

    /* renamed from: Q */
    private static final byte[] f2533Q = "VP8 ".getBytes(Charset.defaultCharset());

    /* renamed from: R */
    private static final byte[] f2534R = "ANIM".getBytes(Charset.defaultCharset());

    /* renamed from: S */
    private static final byte[] f2535S = "ANMF".getBytes(Charset.defaultCharset());

    /* renamed from: V */
    static final String[] f2538V = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* renamed from: W */
    static final int[] f2539W = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* renamed from: X */
    static final byte[] f2540X = {65, 83, 67, 73, 73, 0, 0, 0};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.exifinterface.media.b$a */
    /* loaded from: classes.dex */
    public class a extends MediaDataSource {

        /* renamed from: a */
        long f2590a;

        /* renamed from: b */
        final /* synthetic */ f f2591b;

        a(f fVar) {
            this.f2591b = fVar;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // android.media.MediaDataSource
        public long getSize() {
            return -1L;
        }

        @Override // android.media.MediaDataSource
        public int readAt(long j10, byte[] bArr, int i10, int i11) {
            if (i11 == 0) {
                return 0;
            }
            if (j10 < 0) {
                return -1;
            }
            try {
                long j11 = this.f2590a;
                if (j11 != j10) {
                    if (j11 >= 0 && j10 >= j11 + this.f2591b.available()) {
                        return -1;
                    }
                    this.f2591b.m3057e(j10);
                    this.f2590a = j10;
                }
                if (i11 > this.f2591b.available()) {
                    i11 = this.f2591b.available();
                }
                int read = this.f2591b.read(bArr, i10, i11);
                if (read >= 0) {
                    this.f2590a += read;
                    return read;
                }
            } catch (IOException unused) {
            }
            this.f2590a = -1L;
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.exifinterface.media.b$b */
    /* loaded from: classes.dex */
    public static class b extends InputStream implements DataInput {

        /* renamed from: e */
        private static final ByteOrder f2593e = ByteOrder.LITTLE_ENDIAN;

        /* renamed from: f */
        private static final ByteOrder f2594f = ByteOrder.BIG_ENDIAN;

        /* renamed from: a */
        final DataInputStream f2595a;

        /* renamed from: b */
        private ByteOrder f2596b;

        /* renamed from: c */
        int f2597c;

        /* renamed from: d */
        private byte[] f2598d;

        b(byte[] bArr) {
            this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
        }

        /* renamed from: a */
        public int m3040a() {
            return this.f2597c;
        }

        @Override // java.io.InputStream
        public int available() {
            return this.f2595a.available();
        }

        /* renamed from: b */
        public long m3041b() {
            return readInt() & 4294967295L;
        }

        /* renamed from: c */
        public void m3042c(ByteOrder byteOrder) {
            this.f2596b = byteOrder;
        }

        /* renamed from: d */
        public void m3043d(int i10) {
            int i11 = 0;
            while (i11 < i10) {
                int i12 = i10 - i11;
                int skip = (int) this.f2595a.skip(i12);
                if (skip <= 0) {
                    if (this.f2598d == null) {
                        this.f2598d = new byte[8192];
                    }
                    skip = this.f2595a.read(this.f2598d, 0, Math.min(8192, i12));
                    if (skip == -1) {
                        throw new EOFException("Reached EOF while skipping " + i10 + " bytes.");
                    }
                }
                i11 += skip;
            }
            this.f2597c += i11;
        }

        @Override // java.io.InputStream
        public void mark(int i10) {
            throw new UnsupportedOperationException("Mark is currently unsupported");
        }

        @Override // java.io.InputStream
        public int read() {
            this.f2597c++;
            return this.f2595a.read();
        }

        @Override // java.io.DataInput
        public boolean readBoolean() {
            this.f2597c++;
            return this.f2595a.readBoolean();
        }

        @Override // java.io.DataInput
        public byte readByte() {
            this.f2597c++;
            int read = this.f2595a.read();
            if (read >= 0) {
                return (byte) read;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public char readChar() {
            this.f2597c += 2;
            return this.f2595a.readChar();
        }

        @Override // java.io.DataInput
        public double readDouble() {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public float readFloat() {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr, int i10, int i11) {
            this.f2597c += i11;
            this.f2595a.readFully(bArr, i10, i11);
        }

        @Override // java.io.DataInput
        public int readInt() {
            this.f2597c += 4;
            int read = this.f2595a.read();
            int read2 = this.f2595a.read();
            int read3 = this.f2595a.read();
            int read4 = this.f2595a.read();
            if ((read | read2 | read3 | read4) >= 0) {
                ByteOrder byteOrder = this.f2596b;
                if (byteOrder == f2593e) {
                    return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                }
                if (byteOrder == f2594f) {
                    return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
                }
                throw new IOException("Invalid byte order: " + this.f2596b);
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public String readLine() {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        @Override // java.io.DataInput
        public long readLong() {
            this.f2597c += 8;
            int read = this.f2595a.read();
            int read2 = this.f2595a.read();
            int read3 = this.f2595a.read();
            int read4 = this.f2595a.read();
            int read5 = this.f2595a.read();
            int read6 = this.f2595a.read();
            int read7 = this.f2595a.read();
            int read8 = this.f2595a.read();
            if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
                ByteOrder byteOrder = this.f2596b;
                if (byteOrder == f2593e) {
                    return (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                }
                if (byteOrder == f2594f) {
                    return (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8) + read8;
                }
                throw new IOException("Invalid byte order: " + this.f2596b);
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public short readShort() {
            this.f2597c += 2;
            int read = this.f2595a.read();
            int read2 = this.f2595a.read();
            if ((read | read2) >= 0) {
                ByteOrder byteOrder = this.f2596b;
                if (byteOrder == f2593e) {
                    return (short) ((read2 << 8) + read);
                }
                if (byteOrder == f2594f) {
                    return (short) ((read << 8) + read2);
                }
                throw new IOException("Invalid byte order: " + this.f2596b);
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public String readUTF() {
            this.f2597c += 2;
            return this.f2595a.readUTF();
        }

        @Override // java.io.DataInput
        public int readUnsignedByte() {
            this.f2597c++;
            return this.f2595a.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public int readUnsignedShort() {
            this.f2597c += 2;
            int read = this.f2595a.read();
            int read2 = this.f2595a.read();
            if ((read | read2) >= 0) {
                ByteOrder byteOrder = this.f2596b;
                if (byteOrder == f2593e) {
                    return (read2 << 8) + read;
                }
                if (byteOrder == f2594f) {
                    return (read << 8) + read2;
                }
                throw new IOException("Invalid byte order: " + this.f2596b);
            }
            throw new EOFException();
        }

        @Override // java.io.InputStream
        public void reset() {
            throw new UnsupportedOperationException("Reset is currently unsupported");
        }

        @Override // java.io.DataInput
        public int skipBytes(int i10) {
            throw new UnsupportedOperationException("skipBytes is currently unsupported");
        }

        b(InputStream inputStream) {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        b(InputStream inputStream, ByteOrder byteOrder) {
            this.f2596b = ByteOrder.BIG_ENDIAN;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f2595a = dataInputStream;
            dataInputStream.mark(0);
            this.f2597c = 0;
            this.f2596b = byteOrder;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) {
            int read = this.f2595a.read(bArr, i10, i11);
            this.f2597c += read;
            return read;
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr) {
            this.f2597c += bArr.length;
            this.f2595a.readFully(bArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.exifinterface.media.b$c */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        public final int f2599a;

        /* renamed from: b */
        public final int f2600b;

        /* renamed from: c */
        public final long f2601c;

        /* renamed from: d */
        public final byte[] f2602d;

        c(int i10, int i11, byte[] bArr) {
            this(i10, i11, -1L, bArr);
        }

        /* renamed from: a */
        public static c m3044a(String str) {
            byte[] bytes = (str + (char) 0).getBytes(C0693b.f2557o0);
            return new c(2, bytes.length, bytes);
        }

        /* renamed from: b */
        public static c m3045b(long j10, ByteOrder byteOrder) {
            return m3046c(new long[]{j10}, byteOrder);
        }

        /* renamed from: c */
        public static c m3046c(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[C0693b.f2539W[4] * jArr.length]);
            wrap.order(byteOrder);
            for (long j10 : jArr) {
                wrap.putInt((int) j10);
            }
            return new c(4, jArr.length, wrap.array());
        }

        /* renamed from: d */
        public static c m3047d(e eVar, ByteOrder byteOrder) {
            return m3048e(new e[]{eVar}, byteOrder);
        }

        /* renamed from: e */
        public static c m3048e(e[] eVarArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[C0693b.f2539W[5] * eVarArr.length]);
            wrap.order(byteOrder);
            for (e eVar : eVarArr) {
                wrap.putInt((int) eVar.f2607a);
                wrap.putInt((int) eVar.f2608b);
            }
            return new c(5, eVarArr.length, wrap.array());
        }

        /* renamed from: f */
        public static c m3049f(int i10, ByteOrder byteOrder) {
            return m3050g(new int[]{i10}, byteOrder);
        }

        /* renamed from: g */
        public static c m3050g(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[C0693b.f2539W[3] * iArr.length]);
            wrap.order(byteOrder);
            for (int i10 : iArr) {
                wrap.putShort((short) i10);
            }
            return new c(3, iArr.length, wrap.array());
        }

        /* renamed from: h */
        public double m3051h(ByteOrder byteOrder) {
            Object m3054k = m3054k(byteOrder);
            if (m3054k != null) {
                if (m3054k instanceof String) {
                    return Double.parseDouble((String) m3054k);
                }
                if (m3054k instanceof long[]) {
                    if (((long[]) m3054k).length == 1) {
                        return r5[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                }
                if (m3054k instanceof int[]) {
                    if (((int[]) m3054k).length == 1) {
                        return r5[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                }
                if (m3054k instanceof double[]) {
                    double[] dArr = (double[]) m3054k;
                    if (dArr.length == 1) {
                        return dArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                }
                if (m3054k instanceof e[]) {
                    e[] eVarArr = (e[]) m3054k;
                    if (eVarArr.length == 1) {
                        return eVarArr[0].m3056a();
                    }
                    throw new NumberFormatException("There are more than one component");
                }
                throw new NumberFormatException("Couldn't find a double value");
            }
            throw new NumberFormatException("NULL can't be converted to a double value");
        }

        /* renamed from: i */
        public int m3052i(ByteOrder byteOrder) {
            Object m3054k = m3054k(byteOrder);
            if (m3054k != null) {
                if (m3054k instanceof String) {
                    return Integer.parseInt((String) m3054k);
                }
                if (m3054k instanceof long[]) {
                    long[] jArr = (long[]) m3054k;
                    if (jArr.length == 1) {
                        return (int) jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                }
                if (m3054k instanceof int[]) {
                    int[] iArr = (int[]) m3054k;
                    if (iArr.length == 1) {
                        return iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                }
                throw new NumberFormatException("Couldn't find a integer value");
            }
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }

        /* renamed from: j */
        public String m3053j(ByteOrder byteOrder) {
            Object m3054k = m3054k(byteOrder);
            if (m3054k == null) {
                return null;
            }
            if (m3054k instanceof String) {
                return (String) m3054k;
            }
            StringBuilder sb2 = new StringBuilder();
            int i10 = 0;
            if (m3054k instanceof long[]) {
                long[] jArr = (long[]) m3054k;
                while (i10 < jArr.length) {
                    sb2.append(jArr[i10]);
                    i10++;
                    if (i10 != jArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            }
            if (m3054k instanceof int[]) {
                int[] iArr = (int[]) m3054k;
                while (i10 < iArr.length) {
                    sb2.append(iArr[i10]);
                    i10++;
                    if (i10 != iArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            }
            if (m3054k instanceof double[]) {
                double[] dArr = (double[]) m3054k;
                while (i10 < dArr.length) {
                    sb2.append(dArr[i10]);
                    i10++;
                    if (i10 != dArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            }
            if (!(m3054k instanceof e[])) {
                return null;
            }
            e[] eVarArr = (e[]) m3054k;
            while (i10 < eVarArr.length) {
                sb2.append(eVarArr[i10].f2607a);
                sb2.append('/');
                sb2.append(eVarArr[i10].f2608b);
                i10++;
                if (i10 != eVarArr.length) {
                    sb2.append(",");
                }
            }
            return sb2.toString();
        }

        /* JADX WARN: Not initialized variable reg: 3, insn: 0x0198: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:409), block:B:168:0x0198 */
        /* JADX WARN: Removed duplicated region for block: B:171:0x019b A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* renamed from: k */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        java.lang.Object m3054k(java.nio.ByteOrder r11) {
            /*
                Method dump skipped, instructions count: 450
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.C0693b.c.m3054k(java.nio.ByteOrder):java.lang.Object");
        }

        public String toString() {
            return "(" + C0693b.f2538V[this.f2599a] + ", data length:" + this.f2602d.length + ")";
        }

        c(int i10, int i11, long j10, byte[] bArr) {
            this.f2599a = i10;
            this.f2600b = i11;
            this.f2601c = j10;
            this.f2602d = bArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.exifinterface.media.b$e */
    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a */
        public final long f2607a;

        /* renamed from: b */
        public final long f2608b;

        e(long j10, long j11) {
            if (j11 == 0) {
                this.f2607a = 0L;
                this.f2608b = 1L;
            } else {
                this.f2607a = j10;
                this.f2608b = j11;
            }
        }

        /* renamed from: a */
        public double m3056a() {
            double d10 = this.f2607a;
            double d11 = this.f2608b;
            Double.isNaN(d10);
            Double.isNaN(d11);
            return d10 / d11;
        }

        public String toString() {
            return this.f2607a + Operator.Operation.DIVISION + this.f2608b;
        }
    }

    static {
        d[] dVarArr = {new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d("ImageWidth", 256, 3, 4), new d("ImageLength", 257, 3, 4), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d("StripOffsets", C3478b.f15365a, 3, 4), new d("Orientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d("RowsPerStrip", 278, 3, 4), new d("StripByteCounts", 279, 3, 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", C3419c.f15026o, 3), new d("Software", C3419c.f15030s, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("SensorTopBorder", 4, 4), new d("SensorLeftBorder", 5, 4), new d("SensorBottomBorder", 6, 4), new d("SensorRightBorder", 7, 4), new d("ISO", 23, 3), new d("JpgFromRaw", 46, 7), new d("Xmp", 700, 1)};
        f2541Y = dVarArr;
        d[] dVarArr2 = {new d("ExposureTime", 33434, 5), new d("FNumber", 33437, 5), new d("ExposureProgram", 34850, 3), new d("SpectralSensitivity", 34852, 2), new d("PhotographicSensitivity", 34855, 3), new d("OECF", 34856, 7), new d("SensitivityType", 34864, 3), new d("StandardOutputSensitivity", 34865, 4), new d("RecommendedExposureIndex", 34866, 4), new d("ISOSpeed", 34867, 4), new d("ISOSpeedLatitudeyyy", 34868, 4), new d("ISOSpeedLatitudezzz", 34869, 4), new d("ExifVersion", 36864, 2), new d("DateTimeOriginal", 36867, 2), new d("DateTimeDigitized", 36868, 2), new d("OffsetTime", 36880, 2), new d("OffsetTimeOriginal", 36881, 2), new d("OffsetTimeDigitized", 36882, 2), new d("ComponentsConfiguration", 37121, 7), new d("CompressedBitsPerPixel", 37122, 5), new d("ShutterSpeedValue", 37377, 10), new d("ApertureValue", 37378, 5), new d("BrightnessValue", 37379, 10), new d("ExposureBiasValue", 37380, 10), new d("MaxApertureValue", 37381, 5), new d("SubjectDistance", 37382, 5), new d("MeteringMode", 37383, 3), new d("LightSource", 37384, 3), new d("Flash", 37385, 3), new d("FocalLength", 37386, 5), new d("SubjectArea", 37396, 3), new d("MakerNote", 37500, 7), new d("UserComment", 37510, 7), new d("SubSecTime", 37520, 2), new d("SubSecTimeOriginal", 37521, 2), new d("SubSecTimeDigitized", 37522, 2), new d("FlashpixVersion", 40960, 7), new d("ColorSpace", 40961, 3), new d("PixelXDimension", 40962, 3, 4), new d("PixelYDimension", 40963, 3, 4), new d("RelatedSoundFile", 40964, 2), new d("InteroperabilityIFDPointer", 40965, 4), new d("FlashEnergy", 41483, 5), new d("SpatialFrequencyResponse", 41484, 7), new d("FocalPlaneXResolution", 41486, 5), new d("FocalPlaneYResolution", 41487, 5), new d("FocalPlaneResolutionUnit", 41488, 3), new d("SubjectLocation", 41492, 3), new d("ExposureIndex", 41493, 5), new d("SensingMethod", 41495, 3), new d("FileSource", 41728, 7), new d("SceneType", 41729, 7), new d("CFAPattern", 41730, 7), new d("CustomRendered", 41985, 3), new d("ExposureMode", 41986, 3), new d("WhiteBalance", 41987, 3), new d("DigitalZoomRatio", 41988, 5), new d("FocalLengthIn35mmFilm", 41989, 3), new d("SceneCaptureType", 41990, 3), new d("GainControl", 41991, 3), new d("Contrast", 41992, 3), new d("Saturation", 41993, 3), new d("Sharpness", 41994, 3), new d("DeviceSettingDescription", 41995, 7), new d("SubjectDistanceRange", 41996, 3), new d("ImageUniqueID", 42016, 2), new d("CameraOwnerName", 42032, 2), new d("BodySerialNumber", 42033, 2), new d("LensSpecification", 42034, 5), new d("LensMake", 42035, 2), new d("LensModel", 42036, 2), new d("Gamma", 42240, 5), new d("DNGVersion", 50706, 1), new d("DefaultCropSize", 50720, 3, 4)};
        f2542Z = dVarArr2;
        d[] dVarArr3 = {new d("GPSVersionID", 0, 1), new d("GPSLatitudeRef", 1, 2), new d("GPSLatitude", 2, 5, 10), new d("GPSLongitudeRef", 3, 2), new d("GPSLongitude", 4, 5, 10), new d("GPSAltitudeRef", 5, 1), new d("GPSAltitude", 6, 5), new d("GPSTimeStamp", 7, 5), new d("GPSSatellites", 8, 2), new d("GPSStatus", 9, 2), new d("GPSMeasureMode", 10, 2), new d("GPSDOP", 11, 5), new d("GPSSpeedRef", 12, 2), new d("GPSSpeed", 13, 5), new d("GPSTrackRef", 14, 2), new d("GPSTrack", 15, 5), new d("GPSImgDirectionRef", 16, 2), new d("GPSImgDirection", 17, 5), new d("GPSMapDatum", 18, 2), new d("GPSDestLatitudeRef", 19, 2), new d("GPSDestLatitude", 20, 5), new d("GPSDestLongitudeRef", 21, 2), new d("GPSDestLongitude", 22, 5), new d("GPSDestBearingRef", 23, 2), new d("GPSDestBearing", 24, 5), new d("GPSDestDistanceRef", 25, 2), new d("GPSDestDistance", 26, 5), new d("GPSProcessingMethod", 27, 7), new d("GPSAreaInformation", 28, 7), new d("GPSDateStamp", 29, 2), new d("GPSDifferential", 30, 3), new d("GPSHPositioningError", 31, 5)};
        f2543a0 = dVarArr3;
        d[] dVarArr4 = {new d("InteroperabilityIndex", 1, 2)};
        f2544b0 = dVarArr4;
        d[] dVarArr5 = {new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d("ThumbnailImageWidth", 256, 3, 4), new d("ThumbnailImageLength", 257, 3, 4), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d("StripOffsets", C3478b.f15365a, 3, 4), new d("ThumbnailOrientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d("RowsPerStrip", 278, 3, 4), new d("StripByteCounts", 279, 3, 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", C3419c.f15026o, 3), new d("Software", C3419c.f15030s, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("DNGVersion", 50706, 1), new d("DefaultCropSize", 50720, 3, 4)};
        f2545c0 = dVarArr5;
        f2546d0 = new d("StripOffsets", C3478b.f15365a, 3);
        d[] dVarArr6 = {new d("ThumbnailImage", 256, 7), new d("CameraSettingsIFDPointer", 8224, 4), new d("ImageProcessingIFDPointer", 8256, 4)};
        f2547e0 = dVarArr6;
        d[] dVarArr7 = {new d("PreviewImageStart", 257, 4), new d("PreviewImageLength", 258, 4)};
        f2548f0 = dVarArr7;
        d[] dVarArr8 = {new d("AspectFrame", 4371, 3)};
        f2549g0 = dVarArr8;
        d[] dVarArr9 = {new d("ColorSpace", 55, 3)};
        f2550h0 = dVarArr9;
        d[][] dVarArr10 = {dVarArr, dVarArr2, dVarArr3, dVarArr4, dVarArr5, dVarArr, dVarArr6, dVarArr7, dVarArr8, dVarArr9};
        f2551i0 = dVarArr10;
        f2552j0 = new d[]{new d("SubIFDPointer", 330, 4), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("InteroperabilityIFDPointer", 40965, 4), new d("CameraSettingsIFDPointer", 8224, 1), new d("ImageProcessingIFDPointer", 8256, 1)};
        f2553k0 = new HashMap[dVarArr10.length];
        f2554l0 = new HashMap[dVarArr10.length];
        f2555m0 = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        f2556n0 = new HashMap();
        Charset forName = Charset.forName("US-ASCII");
        f2557o0 = forName;
        f2558p0 = "Exif\u0000\u0000".getBytes(forName);
        f2559q0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale);
        f2536T = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale);
        f2537U = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("UTC"));
        int i10 = 0;
        while (true) {
            d[][] dVarArr11 = f2551i0;
            if (i10 < dVarArr11.length) {
                f2553k0[i10] = new HashMap();
                f2554l0[i10] = new HashMap();
                for (d dVar : dVarArr11[i10]) {
                    f2553k0[i10].put(Integer.valueOf(dVar.f2603a), dVar);
                    f2554l0[i10].put(dVar.f2604b, dVar);
                }
                i10++;
            } else {
                HashMap hashMap = f2556n0;
                d[] dVarArr12 = f2552j0;
                hashMap.put(Integer.valueOf(dVarArr12[0].f2603a), 5);
                hashMap.put(Integer.valueOf(dVarArr12[1].f2603a), 1);
                hashMap.put(Integer.valueOf(dVarArr12[2].f2603a), 2);
                hashMap.put(Integer.valueOf(dVarArr12[3].f2603a), 3);
                hashMap.put(Integer.valueOf(dVarArr12[4].f2603a), 7);
                hashMap.put(Integer.valueOf(dVarArr12[5].f2603a), 8);
                f2560r0 = Pattern.compile(".*[1-9].*");
                f2561s0 = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                f2562t0 = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                f2564u0 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
        }
    }

    public C0693b(InputStream inputStream) {
        this(inputStream, 0);
    }

    /* renamed from: A */
    private boolean m3000A(byte[] bArr) {
        int i10 = 0;
        while (true) {
            byte[] bArr2 = f2527K;
            if (i10 < bArr2.length) {
                if (bArr[i10] != bArr2[i10]) {
                    return false;
                }
                i10++;
            } else {
                int i11 = 0;
                while (true) {
                    byte[] bArr3 = f2528L;
                    if (i11 < bArr3.length) {
                        if (bArr[f2527K.length + i11 + 4] != bArr3[i11]) {
                            return false;
                        }
                        i11++;
                    } else {
                        return true;
                    }
                }
            }
        }
    }

    /* renamed from: B */
    private void m3001B(InputStream inputStream) {
        boolean z10;
        if (inputStream != null) {
            for (int i10 = 0; i10 < f2551i0.length; i10++) {
                try {
                    try {
                        this.f2575f[i10] = new HashMap();
                    } finally {
                        m3014a();
                        if (f2563u) {
                            m3003D();
                        }
                    }
                } catch (IOException | UnsupportedOperationException e10) {
                    boolean z11 = f2563u;
                    if (z11) {
                        Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e10);
                    }
                    m3014a();
                    if (!z11) {
                        return;
                    }
                }
            }
            if (!this.f2574e) {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
                this.f2573d = m3018g(bufferedInputStream);
                inputStream = bufferedInputStream;
            }
            if (m3010K(this.f2573d)) {
                f fVar = new f(inputStream);
                if (this.f2574e) {
                    m3024m(fVar);
                } else {
                    int i11 = this.f2573d;
                    if (i11 == 12) {
                        m3016e(fVar);
                    } else if (i11 == 7) {
                        m3019h(fVar);
                    } else if (i11 == 10) {
                        m3023l(fVar);
                    } else {
                        m3022k(fVar);
                    }
                }
                fVar.m3057e(this.f2585p);
                m3009J(fVar);
            } else {
                b bVar = new b(inputStream);
                int i12 = this.f2573d;
                if (i12 == 4) {
                    m3017f(bVar, 0, 0);
                } else if (i12 == 13) {
                    m3020i(bVar);
                } else if (i12 == 9) {
                    m3021j(bVar);
                } else if (i12 == 14) {
                    m3025n(bVar);
                }
            }
            if (!z10) {
                return;
            }
            return;
        }
        throw new NullPointerException("inputstream shouldn't be null");
    }

    /* renamed from: C */
    private void m3002C(b bVar) {
        ByteOrder m3004E = m3004E(bVar);
        this.f2577h = m3004E;
        bVar.m3042c(m3004E);
        int readUnsignedShort = bVar.readUnsignedShort();
        int i10 = this.f2573d;
        if (i10 != 7 && i10 != 10 && readUnsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
        }
        int readInt = bVar.readInt();
        if (readInt >= 8) {
            int i11 = readInt - 8;
            if (i11 > 0) {
                bVar.m3043d(i11);
                return;
            }
            return;
        }
        throw new IOException("Invalid first Ifd offset: " + readInt);
    }

    /* renamed from: D */
    private void m3003D() {
        for (int i10 = 0; i10 < this.f2575f.length; i10++) {
            Log.d("ExifInterface", "The size of tag group[" + i10 + "]: " + this.f2575f[i10].size());
            for (Map.Entry entry : this.f2575f[i10].entrySet()) {
                c cVar = (c) entry.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + cVar.toString() + ", tagValue: '" + cVar.m3053j(this.f2577h) + "'");
            }
        }
    }

    /* renamed from: E */
    private ByteOrder m3004E(b bVar) {
        short readShort = bVar.readShort();
        if (readShort != 18761) {
            if (readShort == 19789) {
                if (f2563u) {
                    Log.d("ExifInterface", "readExifSegment: Byte Align MM");
                }
                return ByteOrder.BIG_ENDIAN;
            }
            throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
        }
        if (f2563u) {
            Log.d("ExifInterface", "readExifSegment: Byte Align II");
        }
        return ByteOrder.LITTLE_ENDIAN;
    }

    /* renamed from: F */
    private void m3005F(byte[] bArr, int i10) {
        f fVar = new f(bArr);
        m3002C(fVar);
        m3006G(fVar, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0283  */
    /* renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m3006G(androidx.exifinterface.media.C0693b.f r30, int r31) {
        /*
            Method dump skipped, instructions count: 928
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.C0693b.m3006G(androidx.exifinterface.media.b$f, int):void");
    }

    /* renamed from: H */
    private void m3007H(int i10, String str, String str2) {
        if (!this.f2575f[i10].isEmpty() && this.f2575f[i10].get(str) != null) {
            HashMap hashMap = this.f2575f[i10];
            hashMap.put(str2, hashMap.get(str));
            this.f2575f[i10].remove(str);
        }
    }

    /* renamed from: I */
    private void m3008I(f fVar, int i10) {
        c cVar = (c) this.f2575f[i10].get("ImageLength");
        c cVar2 = (c) this.f2575f[i10].get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            c cVar3 = (c) this.f2575f[i10].get("JPEGInterchangeFormat");
            c cVar4 = (c) this.f2575f[i10].get("JPEGInterchangeFormatLength");
            if (cVar3 != null && cVar4 != null) {
                int m3052i = cVar3.m3052i(this.f2577h);
                int m3052i2 = cVar3.m3052i(this.f2577h);
                fVar.m3057e(m3052i);
                byte[] bArr = new byte[m3052i2];
                fVar.read(bArr);
                m3017f(new b(bArr), m3052i, i10);
            }
        }
    }

    /* renamed from: J */
    private void m3009J(b bVar) {
        HashMap hashMap = this.f2575f[4];
        c cVar = (c) hashMap.get("Compression");
        if (cVar != null) {
            int m3052i = cVar.m3052i(this.f2577h);
            this.f2584o = m3052i;
            if (m3052i != 1) {
                if (m3052i != 6) {
                    if (m3052i != 7) {
                        return;
                    }
                } else {
                    m3026o(bVar, hashMap);
                    return;
                }
            }
            if (m3036y(hashMap)) {
                m3027p(bVar, hashMap);
                return;
            }
            return;
        }
        this.f2584o = 6;
        m3026o(bVar, hashMap);
    }

    /* renamed from: K */
    private static boolean m3010K(int i10) {
        return (i10 == 4 || i10 == 9 || i10 == 13 || i10 == 14) ? false : true;
    }

    /* renamed from: L */
    private void m3011L(int i10, int i11) {
        if (!this.f2575f[i10].isEmpty() && !this.f2575f[i11].isEmpty()) {
            c cVar = (c) this.f2575f[i10].get("ImageLength");
            c cVar2 = (c) this.f2575f[i10].get("ImageWidth");
            c cVar3 = (c) this.f2575f[i11].get("ImageLength");
            c cVar4 = (c) this.f2575f[i11].get("ImageWidth");
            if (cVar != null && cVar2 != null) {
                if (cVar3 != null && cVar4 != null) {
                    int m3052i = cVar.m3052i(this.f2577h);
                    int m3052i2 = cVar2.m3052i(this.f2577h);
                    int m3052i3 = cVar3.m3052i(this.f2577h);
                    int m3052i4 = cVar4.m3052i(this.f2577h);
                    if (m3052i < m3052i3 && m3052i2 < m3052i4) {
                        HashMap[] hashMapArr = this.f2575f;
                        HashMap hashMap = hashMapArr[i10];
                        hashMapArr[i10] = hashMapArr[i11];
                        hashMapArr[i11] = hashMap;
                        return;
                    }
                    return;
                }
                if (f2563u) {
                    Log.d("ExifInterface", "Second image does not contain valid size information");
                    return;
                }
                return;
            }
            if (f2563u) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (f2563u) {
            Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
        }
    }

    /* renamed from: M */
    private void m3012M(f fVar, int i10) {
        c m3049f;
        c m3049f2;
        c cVar = (c) this.f2575f[i10].get("DefaultCropSize");
        c cVar2 = (c) this.f2575f[i10].get("SensorTopBorder");
        c cVar3 = (c) this.f2575f[i10].get("SensorLeftBorder");
        c cVar4 = (c) this.f2575f[i10].get("SensorBottomBorder");
        c cVar5 = (c) this.f2575f[i10].get("SensorRightBorder");
        if (cVar != null) {
            if (cVar.f2599a == 5) {
                e[] eVarArr = (e[]) cVar.m3054k(this.f2577h);
                if (eVarArr != null && eVarArr.length == 2) {
                    m3049f = c.m3047d(eVarArr[0], this.f2577h);
                    m3049f2 = c.m3047d(eVarArr[1], this.f2577h);
                } else {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(eVarArr));
                    return;
                }
            } else {
                int[] iArr = (int[]) cVar.m3054k(this.f2577h);
                if (iArr != null && iArr.length == 2) {
                    m3049f = c.m3049f(iArr[0], this.f2577h);
                    m3049f2 = c.m3049f(iArr[1], this.f2577h);
                } else {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
            }
            this.f2575f[i10].put("ImageWidth", m3049f);
            this.f2575f[i10].put("ImageLength", m3049f2);
            return;
        }
        if (cVar2 != null && cVar3 != null && cVar4 != null && cVar5 != null) {
            int m3052i = cVar2.m3052i(this.f2577h);
            int m3052i2 = cVar4.m3052i(this.f2577h);
            int m3052i3 = cVar5.m3052i(this.f2577h);
            int m3052i4 = cVar3.m3052i(this.f2577h);
            if (m3052i2 > m3052i && m3052i3 > m3052i4) {
                c m3049f3 = c.m3049f(m3052i2 - m3052i, this.f2577h);
                c m3049f4 = c.m3049f(m3052i3 - m3052i4, this.f2577h);
                this.f2575f[i10].put("ImageLength", m3049f3);
                this.f2575f[i10].put("ImageWidth", m3049f4);
                return;
            }
            return;
        }
        m3008I(fVar, i10);
    }

    /* renamed from: N */
    private void m3013N() {
        m3011L(0, 5);
        m3011L(0, 4);
        m3011L(5, 4);
        c cVar = (c) this.f2575f[1].get("PixelXDimension");
        c cVar2 = (c) this.f2575f[1].get("PixelYDimension");
        if (cVar != null && cVar2 != null) {
            this.f2575f[0].put("ImageWidth", cVar);
            this.f2575f[0].put("ImageLength", cVar2);
        }
        if (this.f2575f[4].isEmpty() && m3037z(this.f2575f[5])) {
            HashMap[] hashMapArr = this.f2575f;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap();
        }
        if (!m3037z(this.f2575f[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        m3007H(0, "ThumbnailOrientation", "Orientation");
        m3007H(0, "ThumbnailImageLength", "ImageLength");
        m3007H(0, "ThumbnailImageWidth", "ImageWidth");
        m3007H(5, "ThumbnailOrientation", "Orientation");
        m3007H(5, "ThumbnailImageLength", "ImageLength");
        m3007H(5, "ThumbnailImageWidth", "ImageWidth");
        m3007H(4, "Orientation", "ThumbnailOrientation");
        m3007H(4, "ImageLength", "ThumbnailImageLength");
        m3007H(4, "ImageWidth", "ThumbnailImageWidth");
    }

    /* renamed from: a */
    private void m3014a() {
        String m3038b = m3038b("DateTimeOriginal");
        if (m3038b != null && m3038b("DateTime") == null) {
            this.f2575f[0].put("DateTime", c.m3044a(m3038b));
        }
        if (m3038b("ImageWidth") == null) {
            this.f2575f[0].put("ImageWidth", c.m3045b(0L, this.f2577h));
        }
        if (m3038b("ImageLength") == null) {
            this.f2575f[0].put("ImageLength", c.m3045b(0L, this.f2577h));
        }
        if (m3038b("Orientation") == null) {
            this.f2575f[0].put("Orientation", c.m3045b(0L, this.f2577h));
        }
        if (m3038b("LightSource") == null) {
            this.f2575f[1].put("LightSource", c.m3045b(0L, this.f2577h));
        }
    }

    /* renamed from: d */
    private c m3015d(String str) {
        if (str != null) {
            if ("ISOSpeedRatings".equals(str)) {
                if (f2563u) {
                    Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
                }
                str = "PhotographicSensitivity";
            }
            for (int i10 = 0; i10 < f2551i0.length; i10++) {
                c cVar = (c) this.f2575f[i10].get(str);
                if (cVar != null) {
                    return cVar;
                }
            }
            return null;
        }
        throw new NullPointerException("tag shouldn't be null");
    }

    /* renamed from: e */
    private void m3016e(f fVar) {
        String str;
        String str2;
        String str3;
        int i10;
        if (Build.VERSION.SDK_INT >= 28) {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                try {
                    AbstractC0694c.b.m3064a(mediaMetadataRetriever, new a(fVar));
                    String extractMetadata = mediaMetadataRetriever.extractMetadata(33);
                    String extractMetadata2 = mediaMetadataRetriever.extractMetadata(34);
                    String extractMetadata3 = mediaMetadataRetriever.extractMetadata(26);
                    String extractMetadata4 = mediaMetadataRetriever.extractMetadata(17);
                    if ("yes".equals(extractMetadata3)) {
                        str = mediaMetadataRetriever.extractMetadata(29);
                        str2 = mediaMetadataRetriever.extractMetadata(30);
                        str3 = mediaMetadataRetriever.extractMetadata(31);
                    } else if ("yes".equals(extractMetadata4)) {
                        str = mediaMetadataRetriever.extractMetadata(18);
                        str2 = mediaMetadataRetriever.extractMetadata(19);
                        str3 = mediaMetadataRetriever.extractMetadata(24);
                    } else {
                        str = null;
                        str2 = null;
                        str3 = null;
                    }
                    if (str != null) {
                        this.f2575f[0].put("ImageWidth", c.m3049f(Integer.parseInt(str), this.f2577h));
                    }
                    if (str2 != null) {
                        this.f2575f[0].put("ImageLength", c.m3049f(Integer.parseInt(str2), this.f2577h));
                    }
                    if (str3 != null) {
                        int parseInt = Integer.parseInt(str3);
                        if (parseInt != 90) {
                            if (parseInt != 180) {
                                if (parseInt != 270) {
                                    i10 = 1;
                                } else {
                                    i10 = 8;
                                }
                            } else {
                                i10 = 3;
                            }
                        } else {
                            i10 = 6;
                        }
                        this.f2575f[0].put("Orientation", c.m3049f(i10, this.f2577h));
                    }
                    if (extractMetadata != null && extractMetadata2 != null) {
                        int parseInt2 = Integer.parseInt(extractMetadata);
                        int parseInt3 = Integer.parseInt(extractMetadata2);
                        if (parseInt3 > 6) {
                            fVar.m3057e(parseInt2);
                            byte[] bArr = new byte[6];
                            if (fVar.read(bArr) == 6) {
                                int i11 = parseInt2 + 6;
                                int i12 = parseInt3 - 6;
                                if (Arrays.equals(bArr, f2558p0)) {
                                    byte[] bArr2 = new byte[i12];
                                    if (fVar.read(bArr2) == i12) {
                                        this.f2585p = i11;
                                        m3005F(bArr2, 0);
                                    } else {
                                        throw new IOException("Can't read exif");
                                    }
                                } else {
                                    throw new IOException("Invalid identifier");
                                }
                            } else {
                                throw new IOException("Can't read identifier");
                            }
                        } else {
                            throw new IOException("Invalid exif length");
                        }
                    }
                    if (f2563u) {
                        Log.d("ExifInterface", "Heif meta: " + str + "x" + str2 + ", rotation " + str3);
                    }
                    return;
                } catch (RuntimeException unused) {
                    throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
                }
            } finally {
                mediaMetadataRetriever.release();
            }
        }
        throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x019a, code lost:
    
        r22.m3042c(r21.f2577h);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x019f, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0184 A[LOOP:0: B:9:0x0038->B:33:0x0184, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x018e A[SYNTHETIC] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m3017f(androidx.exifinterface.media.C0693b.b r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 544
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.C0693b.m3017f(androidx.exifinterface.media.b$b, int, int):void");
    }

    /* renamed from: g */
    private int m3018g(BufferedInputStream bufferedInputStream) {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (m3030s(bArr)) {
            return 4;
        }
        if (m3033v(bArr)) {
            return 9;
        }
        if (m3029r(bArr)) {
            return 12;
        }
        if (m3031t(bArr)) {
            return 7;
        }
        if (m3034w(bArr)) {
            return 10;
        }
        if (m3032u(bArr)) {
            return 13;
        }
        if (m3000A(bArr)) {
            return 14;
        }
        return 0;
    }

    /* renamed from: h */
    private void m3019h(f fVar) {
        int i10;
        int i11;
        m3022k(fVar);
        c cVar = (c) this.f2575f[1].get("MakerNote");
        if (cVar != null) {
            f fVar2 = new f(cVar.f2602d);
            fVar2.m3042c(this.f2577h);
            byte[] bArr = f2521E;
            byte[] bArr2 = new byte[bArr.length];
            fVar2.readFully(bArr2);
            fVar2.m3057e(0L);
            byte[] bArr3 = f2522F;
            byte[] bArr4 = new byte[bArr3.length];
            fVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                fVar2.m3057e(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                fVar2.m3057e(12L);
            }
            m3006G(fVar2, 6);
            c cVar2 = (c) this.f2575f[7].get("PreviewImageStart");
            c cVar3 = (c) this.f2575f[7].get("PreviewImageLength");
            if (cVar2 != null && cVar3 != null) {
                this.f2575f[5].put("JPEGInterchangeFormat", cVar2);
                this.f2575f[5].put("JPEGInterchangeFormatLength", cVar3);
            }
            c cVar4 = (c) this.f2575f[8].get("AspectFrame");
            if (cVar4 != null) {
                int[] iArr = (int[]) cVar4.m3054k(this.f2577h);
                if (iArr != null && iArr.length == 4) {
                    int i12 = iArr[2];
                    int i13 = iArr[0];
                    if (i12 > i13 && (i10 = iArr[3]) > (i11 = iArr[1])) {
                        int i14 = (i12 - i13) + 1;
                        int i15 = (i10 - i11) + 1;
                        if (i14 < i15) {
                            int i16 = i14 + i15;
                            i15 = i16 - i15;
                            i14 = i16 - i15;
                        }
                        c m3049f = c.m3049f(i14, this.f2577h);
                        c m3049f2 = c.m3049f(i15, this.f2577h);
                        this.f2575f[0].put("ImageWidth", m3049f);
                        this.f2575f[0].put("ImageLength", m3049f2);
                        return;
                    }
                    return;
                }
                Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
            }
        }
    }

    /* renamed from: i */
    private void m3020i(b bVar) {
        if (f2563u) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + bVar);
        }
        bVar.m3042c(ByteOrder.BIG_ENDIAN);
        byte[] bArr = f2523G;
        bVar.m3043d(bArr.length);
        int length = bArr.length + 0;
        while (true) {
            try {
                int readInt = bVar.readInt();
                int i10 = length + 4;
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) == 4) {
                    int i11 = i10 + 4;
                    if (i11 == 16 && !Arrays.equals(bArr2, f2525I)) {
                        throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                    }
                    if (!Arrays.equals(bArr2, f2526J)) {
                        if (Arrays.equals(bArr2, f2524H)) {
                            byte[] bArr3 = new byte[readInt];
                            if (bVar.read(bArr3) == readInt) {
                                int readInt2 = bVar.readInt();
                                CRC32 crc32 = new CRC32();
                                crc32.update(bArr2);
                                crc32.update(bArr3);
                                if (((int) crc32.getValue()) == readInt2) {
                                    this.f2585p = i11;
                                    m3005F(bArr3, 0);
                                    m3013N();
                                    m3009J(new b(bArr3));
                                    return;
                                }
                                throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                            }
                            throw new IOException("Failed to read given length for given PNG chunk type: " + AbstractC0694c.m3058a(bArr2));
                        }
                        int i12 = readInt + 4;
                        bVar.m3043d(i12);
                        length = i11 + i12;
                    } else {
                        return;
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    /* renamed from: j */
    private void m3021j(b bVar) {
        boolean z10 = f2563u;
        if (z10) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + bVar);
        }
        bVar.m3043d(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.read(bArr);
        bVar.read(bArr2);
        bVar.read(bArr3);
        int i10 = ByteBuffer.wrap(bArr).getInt();
        int i11 = ByteBuffer.wrap(bArr2).getInt();
        int i12 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i11];
        bVar.m3043d(i10 - bVar.m3040a());
        bVar.read(bArr4);
        m3017f(new b(bArr4), i10, 5);
        bVar.m3043d(i12 - bVar.m3040a());
        bVar.m3042c(ByteOrder.BIG_ENDIAN);
        int readInt = bVar.readInt();
        if (z10) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + readInt);
        }
        for (int i13 = 0; i13 < readInt; i13++) {
            int readUnsignedShort = bVar.readUnsignedShort();
            int readUnsignedShort2 = bVar.readUnsignedShort();
            if (readUnsignedShort == f2546d0.f2603a) {
                short readShort = bVar.readShort();
                short readShort2 = bVar.readShort();
                c m3049f = c.m3049f(readShort, this.f2577h);
                c m3049f2 = c.m3049f(readShort2, this.f2577h);
                this.f2575f[0].put("ImageLength", m3049f);
                this.f2575f[0].put("ImageWidth", m3049f2);
                if (f2563u) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) readShort) + ", width: " + ((int) readShort2));
                    return;
                }
                return;
            }
            bVar.m3043d(readUnsignedShort2);
        }
    }

    /* renamed from: k */
    private void m3022k(f fVar) {
        c cVar;
        m3002C(fVar);
        m3006G(fVar, 0);
        m3012M(fVar, 0);
        m3012M(fVar, 5);
        m3012M(fVar, 4);
        m3013N();
        if (this.f2573d == 8 && (cVar = (c) this.f2575f[1].get("MakerNote")) != null) {
            f fVar2 = new f(cVar.f2602d);
            fVar2.m3042c(this.f2577h);
            fVar2.m3043d(6);
            m3006G(fVar2, 9);
            c cVar2 = (c) this.f2575f[9].get("ColorSpace");
            if (cVar2 != null) {
                this.f2575f[1].put("ColorSpace", cVar2);
            }
        }
    }

    /* renamed from: l */
    private void m3023l(f fVar) {
        if (f2563u) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + fVar);
        }
        m3022k(fVar);
        c cVar = (c) this.f2575f[0].get("JpgFromRaw");
        if (cVar != null) {
            m3017f(new b(cVar.f2602d), (int) cVar.f2601c, 5);
        }
        c cVar2 = (c) this.f2575f[0].get("ISO");
        c cVar3 = (c) this.f2575f[1].get("PhotographicSensitivity");
        if (cVar2 != null && cVar3 == null) {
            this.f2575f[1].put("PhotographicSensitivity", cVar2);
        }
    }

    /* renamed from: m */
    private void m3024m(f fVar) {
        byte[] bArr = f2558p0;
        fVar.m3043d(bArr.length);
        byte[] bArr2 = new byte[fVar.available()];
        fVar.readFully(bArr2);
        this.f2585p = bArr.length;
        m3005F(bArr2, 0);
    }

    /* renamed from: n */
    private void m3025n(b bVar) {
        if (f2563u) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + bVar);
        }
        bVar.m3042c(ByteOrder.LITTLE_ENDIAN);
        bVar.m3043d(f2527K.length);
        int readInt = bVar.readInt() + 8;
        byte[] bArr = f2528L;
        bVar.m3043d(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) == 4) {
                    int readInt2 = bVar.readInt();
                    int i10 = length + 4 + 4;
                    if (Arrays.equals(f2529M, bArr2)) {
                        byte[] bArr3 = new byte[readInt2];
                        if (bVar.read(bArr3) == readInt2) {
                            this.f2585p = i10;
                            m3005F(bArr3, 0);
                            m3009J(new b(bArr3));
                            return;
                        } else {
                            throw new IOException("Failed to read given length for given PNG chunk type: " + AbstractC0694c.m3058a(bArr2));
                        }
                    }
                    if (readInt2 % 2 == 1) {
                        readInt2++;
                    }
                    length = i10 + readInt2;
                    if (length == readInt) {
                        return;
                    }
                    if (length <= readInt) {
                        bVar.m3043d(readInt2);
                    } else {
                        throw new IOException("Encountered WebP file with invalid chunk size");
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    /* renamed from: o */
    private void m3026o(b bVar, HashMap hashMap) {
        c cVar = (c) hashMap.get("JPEGInterchangeFormat");
        c cVar2 = (c) hashMap.get("JPEGInterchangeFormatLength");
        if (cVar != null && cVar2 != null) {
            int m3052i = cVar.m3052i(this.f2577h);
            int m3052i2 = cVar2.m3052i(this.f2577h);
            if (this.f2573d == 7) {
                m3052i += this.f2586q;
            }
            if (m3052i > 0 && m3052i2 > 0) {
                this.f2578i = true;
                if (this.f2570a == null && this.f2572c == null && this.f2571b == null) {
                    byte[] bArr = new byte[m3052i2];
                    bVar.skip(m3052i);
                    bVar.read(bArr);
                    this.f2583n = bArr;
                }
                this.f2581l = m3052i;
                this.f2582m = m3052i2;
            }
            if (f2563u) {
                Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + m3052i + ", length: " + m3052i2);
            }
        }
    }

    /* renamed from: p */
    private void m3027p(b bVar, HashMap hashMap) {
        c cVar = (c) hashMap.get("StripOffsets");
        c cVar2 = (c) hashMap.get("StripByteCounts");
        if (cVar != null && cVar2 != null) {
            long[] m3059b = AbstractC0694c.m3059b(cVar.m3054k(this.f2577h));
            long[] m3059b2 = AbstractC0694c.m3059b(cVar2.m3054k(this.f2577h));
            if (m3059b != null && m3059b.length != 0) {
                if (m3059b2 != null && m3059b2.length != 0) {
                    if (m3059b.length != m3059b2.length) {
                        Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                        return;
                    }
                    long j10 = 0;
                    for (long j11 : m3059b2) {
                        j10 += j11;
                    }
                    int i10 = (int) j10;
                    byte[] bArr = new byte[i10];
                    int i11 = 1;
                    this.f2580k = true;
                    this.f2579j = true;
                    this.f2578i = true;
                    int i12 = 0;
                    int i13 = 0;
                    int i14 = 0;
                    while (i12 < m3059b.length) {
                        int i15 = (int) m3059b[i12];
                        int i16 = (int) m3059b2[i12];
                        if (i12 < m3059b.length - i11 && i15 + i16 != m3059b[i12 + 1]) {
                            this.f2580k = false;
                        }
                        int i17 = i15 - i13;
                        if (i17 < 0) {
                            Log.d("ExifInterface", "Invalid strip offset value");
                            return;
                        }
                        long j12 = i17;
                        if (bVar.skip(j12) != j12) {
                            Log.d("ExifInterface", "Failed to skip " + i17 + " bytes.");
                            return;
                        }
                        int i18 = i13 + i17;
                        byte[] bArr2 = new byte[i16];
                        if (bVar.read(bArr2) != i16) {
                            Log.d("ExifInterface", "Failed to read " + i16 + " bytes.");
                            return;
                        }
                        i13 = i18 + i16;
                        System.arraycopy(bArr2, 0, bArr, i14, i16);
                        i14 += i16;
                        i12++;
                        i11 = 1;
                    }
                    this.f2583n = bArr;
                    if (this.f2580k) {
                        this.f2581l = (int) m3059b[0];
                        this.f2582m = i10;
                        return;
                    }
                    return;
                }
                Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                return;
            }
            Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
        }
    }

    /* renamed from: q */
    private static boolean m3028q(BufferedInputStream bufferedInputStream) {
        byte[] bArr = f2558p0;
        bufferedInputStream.mark(bArr.length);
        byte[] bArr2 = new byte[bArr.length];
        bufferedInputStream.read(bArr2);
        bufferedInputStream.reset();
        int i10 = 0;
        while (true) {
            byte[] bArr3 = f2558p0;
            if (i10 < bArr3.length) {
                if (bArr2[i10] != bArr3[i10]) {
                    return false;
                }
                i10++;
            } else {
                return true;
            }
        }
    }

    /* renamed from: r */
    private boolean m3029r(byte[] bArr) {
        b bVar;
        long readInt;
        byte[] bArr2;
        long j10;
        b bVar2 = null;
        try {
            try {
                bVar = new b(bArr);
            } catch (Exception e10) {
                e = e10;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            readInt = bVar.readInt();
            bArr2 = new byte[4];
            bVar.read(bArr2);
        } catch (Exception e11) {
            e = e11;
            bVar2 = bVar;
            if (f2563u) {
                Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
            }
            if (bVar2 != null) {
                bVar2.close();
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            bVar2 = bVar;
            if (bVar2 != null) {
                bVar2.close();
            }
            throw th;
        }
        if (!Arrays.equals(bArr2, f2518B)) {
            bVar.close();
            return false;
        }
        if (readInt == 1) {
            readInt = bVar.readLong();
            j10 = 16;
            if (readInt < 16) {
                bVar.close();
                return false;
            }
        } else {
            j10 = 8;
        }
        if (readInt > bArr.length) {
            readInt = bArr.length;
        }
        long j11 = readInt - j10;
        if (j11 < 8) {
            bVar.close();
            return false;
        }
        byte[] bArr3 = new byte[4];
        boolean z10 = false;
        boolean z11 = false;
        for (long j12 = 0; j12 < j11 / 4; j12++) {
            if (bVar.read(bArr3) != 4) {
                bVar.close();
                return false;
            }
            if (j12 != 1) {
                if (Arrays.equals(bArr3, f2519C)) {
                    z10 = true;
                } else if (Arrays.equals(bArr3, f2520D)) {
                    z11 = true;
                }
                if (z10 && z11) {
                    bVar.close();
                    return true;
                }
            }
        }
        bVar.close();
        return false;
    }

    /* renamed from: s */
    private static boolean m3030s(byte[] bArr) {
        int i10 = 0;
        while (true) {
            byte[] bArr2 = f2517A;
            if (i10 < bArr2.length) {
                if (bArr[i10] != bArr2[i10]) {
                    return false;
                }
                i10++;
            } else {
                return true;
            }
        }
    }

    /* renamed from: t */
    private boolean m3031t(byte[] bArr) {
        boolean z10 = false;
        b bVar = null;
        try {
            b bVar2 = new b(bArr);
            try {
                ByteOrder m3004E = m3004E(bVar2);
                this.f2577h = m3004E;
                bVar2.m3042c(m3004E);
                short readShort = bVar2.readShort();
                if (readShort == 20306 || readShort == 21330) {
                    z10 = true;
                }
                bVar2.close();
                return z10;
            } catch (Exception unused) {
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                return false;
            } catch (Throwable th) {
                th = th;
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: u */
    private boolean m3032u(byte[] bArr) {
        int i10 = 0;
        while (true) {
            byte[] bArr2 = f2523G;
            if (i10 < bArr2.length) {
                if (bArr[i10] != bArr2[i10]) {
                    return false;
                }
                i10++;
            } else {
                return true;
            }
        }
    }

    /* renamed from: v */
    private boolean m3033v(byte[] bArr) {
        byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        for (int i10 = 0; i10 < bytes.length; i10++) {
            if (bArr[i10] != bytes[i10]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: w */
    private boolean m3034w(byte[] bArr) {
        boolean z10 = false;
        b bVar = null;
        try {
            b bVar2 = new b(bArr);
            try {
                ByteOrder m3004E = m3004E(bVar2);
                this.f2577h = m3004E;
                bVar2.m3042c(m3004E);
                if (bVar2.readShort() == 85) {
                    z10 = true;
                }
                bVar2.close();
                return z10;
            } catch (Exception unused) {
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                return false;
            } catch (Throwable th) {
                th = th;
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: x */
    private static boolean m3035x(FileDescriptor fileDescriptor) {
        int i10;
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                i10 = OsConstants.SEEK_CUR;
                AbstractC0694c.a.m3063c(fileDescriptor, 0L, i10);
                return true;
            } catch (Exception unused) {
                if (f2563u) {
                    Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                }
            }
        }
        return false;
    }

    /* renamed from: y */
    private boolean m3036y(HashMap hashMap) {
        c cVar;
        int m3052i;
        c cVar2 = (c) hashMap.get("BitsPerSample");
        if (cVar2 != null) {
            int[] iArr = (int[]) cVar2.m3054k(this.f2577h);
            int[] iArr2 = f2567x;
            if (Arrays.equals(iArr2, iArr)) {
                return true;
            }
            if (this.f2573d == 3 && (cVar = (c) hashMap.get("PhotometricInterpretation")) != null && (((m3052i = cVar.m3052i(this.f2577h)) == 1 && Arrays.equals(iArr, f2569z)) || (m3052i == 6 && Arrays.equals(iArr, iArr2)))) {
                return true;
            }
        }
        if (f2563u) {
            Log.d("ExifInterface", "Unsupported data type value");
            return false;
        }
        return false;
    }

    /* renamed from: z */
    private boolean m3037z(HashMap hashMap) {
        c cVar = (c) hashMap.get("ImageLength");
        c cVar2 = (c) hashMap.get("ImageWidth");
        if (cVar != null && cVar2 != null) {
            int m3052i = cVar.m3052i(this.f2577h);
            int m3052i2 = cVar2.m3052i(this.f2577h);
            if (m3052i <= 512 && m3052i2 <= 512) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: b */
    public String m3038b(String str) {
        if (str != null) {
            c m3015d = m3015d(str);
            if (m3015d != null) {
                if (!f2555m0.contains(str)) {
                    return m3015d.m3053j(this.f2577h);
                }
                if (str.equals("GPSTimeStamp")) {
                    int i10 = m3015d.f2599a;
                    if (i10 != 5 && i10 != 10) {
                        Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + m3015d.f2599a);
                        return null;
                    }
                    e[] eVarArr = (e[]) m3015d.m3054k(this.f2577h);
                    if (eVarArr != null && eVarArr.length == 3) {
                        e eVar = eVarArr[0];
                        e eVar2 = eVarArr[1];
                        e eVar3 = eVarArr[2];
                        return String.format("%02d:%02d:%02d", Integer.valueOf((int) (((float) eVar.f2607a) / ((float) eVar.f2608b))), Integer.valueOf((int) (((float) eVar2.f2607a) / ((float) eVar2.f2608b))), Integer.valueOf((int) (((float) eVar3.f2607a) / ((float) eVar3.f2608b))));
                    }
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(eVarArr));
                    return null;
                }
                try {
                    return Double.toString(m3015d.m3051h(this.f2577h));
                } catch (NumberFormatException unused) {
                }
            }
            return null;
        }
        throw new NullPointerException("tag shouldn't be null");
    }

    /* renamed from: c */
    public int m3039c(String str, int i10) {
        if (str != null) {
            c m3015d = m3015d(str);
            if (m3015d == null) {
                return i10;
            }
            try {
                return m3015d.m3052i(this.f2577h);
            } catch (NumberFormatException unused) {
                return i10;
            }
        }
        throw new NullPointerException("tag shouldn't be null");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.exifinterface.media.b$f */
    /* loaded from: classes.dex */
    public static class f extends b {
        f(byte[] bArr) {
            super(bArr);
            this.f2595a.mark(Integer.MAX_VALUE);
        }

        /* renamed from: e */
        public void m3057e(long j10) {
            int i10 = this.f2597c;
            if (i10 > j10) {
                this.f2597c = 0;
                this.f2595a.reset();
            } else {
                j10 -= i10;
            }
            m3043d((int) j10);
        }

        f(InputStream inputStream) {
            super(inputStream);
            if (inputStream.markSupported()) {
                this.f2595a.mark(Integer.MAX_VALUE);
                return;
            }
            throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
        }
    }

    public C0693b(InputStream inputStream, int i10) {
        d[][] dVarArr = f2551i0;
        this.f2575f = new HashMap[dVarArr.length];
        this.f2576g = new HashSet(dVarArr.length);
        this.f2577h = ByteOrder.BIG_ENDIAN;
        if (inputStream != null) {
            this.f2570a = null;
            if (i10 == 1) {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, f2558p0.length);
                if (!m3028q(bufferedInputStream)) {
                    Log.w("ExifInterface", "Given data does not follow the structure of an Exif-only data.");
                    return;
                }
                this.f2574e = true;
                this.f2572c = null;
                this.f2571b = null;
                inputStream = bufferedInputStream;
            } else if (inputStream instanceof AssetManager.AssetInputStream) {
                this.f2572c = (AssetManager.AssetInputStream) inputStream;
                this.f2571b = null;
            } else {
                if (inputStream instanceof FileInputStream) {
                    FileInputStream fileInputStream = (FileInputStream) inputStream;
                    if (m3035x(fileInputStream.getFD())) {
                        this.f2572c = null;
                        this.f2571b = fileInputStream.getFD();
                    }
                }
                this.f2572c = null;
                this.f2571b = null;
            }
            m3001B(inputStream);
            return;
        }
        throw new NullPointerException("inputStream cannot be null");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.exifinterface.media.b$d */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a */
        public final int f2603a;

        /* renamed from: b */
        public final String f2604b;

        /* renamed from: c */
        public final int f2605c;

        /* renamed from: d */
        public final int f2606d;

        d(String str, int i10, int i11) {
            this.f2604b = str;
            this.f2603a = i10;
            this.f2605c = i11;
            this.f2606d = -1;
        }

        /* renamed from: a */
        boolean m3055a(int i10) {
            int i11;
            int i12 = this.f2605c;
            if (i12 == 7 || i10 == 7 || i12 == i10 || (i11 = this.f2606d) == i10) {
                return true;
            }
            if ((i12 == 4 || i11 == 4) && i10 == 3) {
                return true;
            }
            if ((i12 == 9 || i11 == 9) && i10 == 8) {
                return true;
            }
            if ((i12 == 12 || i11 == 12) && i10 == 11) {
                return true;
            }
            return false;
        }

        d(String str, int i10, int i11, int i12) {
            this.f2604b = str;
            this.f2603a = i10;
            this.f2605c = i11;
            this.f2606d = i12;
        }
    }
}
