package p322s1;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import p109e2.AbstractC4117g;
import p109e2.AbstractC4121k;
import p109e2.AbstractC4122l;
import p184j1.C4976g;
import p184j1.C4977h;
import p184j1.EnumC4971b;
import p184j1.EnumC4978i;
import p216l1.InterfaceC5335v;
import p230m1.InterfaceC5569b;
import p230m1.InterfaceC5571d;
import p322s1.AbstractC6640o;
import p322s1.InterfaceC6613a0;

/* renamed from: s1.u */
/* loaded from: classes.dex */
public final class C6646u {

    /* renamed from: f */
    public static final C4976g f25481f = C4976g.m20320f("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", EnumC4971b.f20704c);

    /* renamed from: g */
    public static final C4976g f25482g = C4976g.m20319e("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace");

    /* renamed from: h */
    public static final C4976g f25483h = AbstractC6640o.f25476h;

    /* renamed from: i */
    public static final C4976g f25484i = null;

    /* renamed from: j */
    public static final C4976g f25485j = null;

    /* renamed from: k */
    private static final Set f25486k;

    /* renamed from: l */
    private static final b f25487l;

    /* renamed from: m */
    private static final Set f25488m;

    /* renamed from: n */
    private static final Queue f25489n;

    /* renamed from: a */
    private final InterfaceC5571d f25490a;

    /* renamed from: b */
    private final DisplayMetrics f25491b;

    /* renamed from: c */
    private final InterfaceC5569b f25492c;

    /* renamed from: d */
    private final List f25493d;

    /* renamed from: e */
    private final C6651z f25494e = C6651z.m25964b();

    /* renamed from: s1.u$a */
    /* loaded from: classes.dex */
    class a implements b {
        a() {
        }

        @Override // p322s1.C6646u.b
        /* renamed from: a */
        public void mo25856a(InterfaceC5571d interfaceC5571d, Bitmap bitmap) {
        }

        @Override // p322s1.C6646u.b
        /* renamed from: b */
        public void mo25857b() {
        }
    }

    /* renamed from: s1.u$b */
    /* loaded from: classes.dex */
    public class b {
        /* renamed from: a */
        void mo25856a(InterfaceC5571d interfaceC5571d, Bitmap bitmap);

        /* renamed from: b */
        void mo25857b();
    }

    static {
        Boolean bool = Boolean.FALSE;
        f25484i = C4976g.m20320f("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", bool);
        f25485j = C4976g.m20320f("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", bool);
        f25486k = Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        f25487l = new a();
        f25488m = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
        f25489n = AbstractC4122l.m17234g(0);
    }

    public C6646u(List list, DisplayMetrics displayMetrics, InterfaceC5571d interfaceC5571d, InterfaceC5569b interfaceC5569b) {
        this.f25493d = list;
        this.f25491b = (DisplayMetrics) AbstractC4121k.m17226d(displayMetrics);
        this.f25490a = (InterfaceC5571d) AbstractC4121k.m17226d(interfaceC5571d);
        this.f25492c = (InterfaceC5569b) AbstractC4121k.m17226d(interfaceC5569b);
    }

    /* renamed from: a */
    private static int m25933a(double d10) {
        int m25941l = m25941l(d10);
        double d11 = m25941l;
        Double.isNaN(d11);
        int m25950x = m25950x(d11 * d10);
        double d12 = m25950x / m25941l;
        Double.isNaN(d12);
        double d13 = m25950x;
        Double.isNaN(d13);
        return m25950x((d10 / d12) * d13);
    }

    /* renamed from: b */
    private void m25934b(InterfaceC6613a0 interfaceC6613a0, EnumC4971b enumC4971b, boolean z10, boolean z11, BitmapFactory.Options options, int i10, int i11) {
        boolean z12 = false;
        Bitmap.Config config;
        if (this.f25494e.m25969g(i10, i11, options, z10, z11)) {
            return;
        }
        if (enumC4971b != EnumC4971b.PREFER_ARGB_8888) {
            try {
                z12 = interfaceC6613a0.mo25829d().hasAlpha();
            } catch (IOException e10) {
                if (Log.isLoggable("Downsampler", 3)) {
                    Log.d("Downsampler", "Cannot determine whether the image has alpha or not from header, format " + enumC4971b, e10);
                }
                z12 = false;
            }
            if (z12) {
                config = Bitmap.Config.ARGB_8888;
            } else {
                config = Bitmap.Config.RGB_565;
            }
            options.inPreferredConfig = config;
            if (config == Bitmap.Config.RGB_565) {
                options.inDither = true;
                return;
            }
            return;
        }
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
    }

    /* renamed from: c */
    private static void m25935c(ImageHeaderParser.ImageType imageType, InterfaceC6613a0 interfaceC6613a0, b bVar, InterfaceC5571d interfaceC5571d, AbstractC6640o abstractC6640o, int i10, int i11, int i12, int i13, int i14, BitmapFactory.Options options) {
        int i15 = 0;
        int i16 = 0;
        int min;
        int i17 = 0;
        int floor;
        double floor2;
        int i18 = 0;
        if (i11 > 0 && i12 > 0) {
            if (m25944r(i10)) {
                i16 = i11;
                i15 = i12;
            } else {
                i15 = i11;
                i16 = i12;
            }
            float mo25926b = abstractC6640o.mo25926b(i15, i16, i13, i14);
            if (mo25926b > 0.0f) {
                AbstractC6640o.g mo25925a = abstractC6640o.mo25925a(i15, i16, i13, i14);
                if (mo25925a != null) {
                    float f10 = i15;
                    float f11 = i16;
                    int m25950x = i15 / m25950x(mo25926b * f10);
                    int m25950x2 = i16 / m25950x(mo25926b * f11);
                    AbstractC6640o.g gVar = AbstractC6640o.g.MEMORY;
                    if (mo25925a == gVar) {
                        min = Math.max(m25950x, m25950x2);
                    } else {
                        min = Math.min(m25950x, m25950x2);
                    }
                    int i19 = Build.VERSION.SDK_INT;
                    if (i19 > 23 || !f25486k.contains(options.outMimeType)) {
                        int max = Math.max(1, Integer.highestOneBit(min));
                        if (mo25925a == gVar && max < 1.0f / mo25926b) {
                            max <<= 1;
                        }
                        i17 = max;
                    } else {
                        i17 = 1;
                    }
                    options.inSampleSize = i17;
                    if (imageType == ImageHeaderParser.ImageType.JPEG) {
                        float min2 = Math.min(i17, 8);
                        floor = (int) Math.ceil(f10 / min2);
                        i18 = (int) Math.ceil(f11 / min2);
                        int i20 = i17 / 8;
                        if (i20 > 0) {
                            floor /= i20;
                            i18 /= i20;
                        }
                    } else {
                        if (imageType != ImageHeaderParser.ImageType.PNG && imageType != ImageHeaderParser.ImageType.PNG_A) {
                            if (imageType.isWebp()) {
                                if (i19 >= 24) {
                                    float f12 = i17;
                                    floor = Math.round(f10 / f12);
                                    i18 = Math.round(f11 / f12);
                                } else {
                                    float f13 = i17;
                                    floor = (int) Math.floor(f10 / f13);
                                    floor2 = Math.floor(f11 / f13);
                                }
                            } else if (i15 % i17 == 0 && i16 % i17 == 0) {
                                floor = i15 / i17;
                                i18 = i16 / i17;
                            } else {
                                int[] m25942m = m25942m(interfaceC6613a0, options, bVar, interfaceC5571d);
                                floor = m25942m[0];
                                i18 = m25942m[1];
                            }
                        } else {
                            float f14 = i17;
                            floor = (int) Math.floor(f10 / f14);
                            floor2 = Math.floor(f11 / f14);
                        }
                        i18 = (int) floor2;
                    }
                    double mo25926b2 = abstractC6640o.mo25926b(floor, i18, i13, i14);
                    options.inTargetDensity = m25933a(mo25926b2);
                    options.inDensity = m25941l(mo25926b2);
                    if (m25945s(options)) {
                        options.inScaled = true;
                    } else {
                        options.inTargetDensity = 0;
                        options.inDensity = 0;
                    }
                    if (Log.isLoggable("Downsampler", 2)) {
                        Log.v("Downsampler", "Calculate scaling, source: [" + i11 + "x" + i12 + "], degreesToRotate: " + i10 + ", target: [" + i13 + "x" + i14 + "], power of two scaled: [" + floor + "x" + i18 + "], exact scale factor: " + mo25926b + ", power of 2 sample size: " + i17 + ", adjusted scale factor: " + mo25926b2 + ", target density: " + options.inTargetDensity + ", density: " + options.inDensity);
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("Cannot round with null rounding");
            }
            throw new IllegalArgumentException("Cannot scale with factor: " + mo25926b + " from: " + abstractC6640o + ", source: [" + i11 + "x" + i12 + "], target: [" + i13 + "x" + i14 + "]");
        }
        if (Log.isLoggable("Downsampler", 3)) {
            Log.d("Downsampler", "Unable to determine dimensions for: " + imageType + " with target [" + i13 + "x" + i14 + "]");
        }
    }

    /* renamed from: g */
    private InterfaceC5335v m25936g(InterfaceC6613a0 interfaceC6613a0, int i10, int i11, C4977h c4977h, b bVar) {
        boolean z10 = false;
        byte[] bArr = (byte[]) this.f25492c.mo22611d(65536, byte[].class);
        BitmapFactory.Options m25940k = m25940k();
        m25940k.inTempStorage = bArr;
        EnumC4971b enumC4971b = (EnumC4971b) c4977h.m20325c(f25481f);
        EnumC4978i enumC4978i = (EnumC4978i) c4977h.m20325c(f25482g);
        AbstractC6640o abstractC6640o = (AbstractC6640o) c4977h.m20325c(AbstractC6640o.f25476h);
        boolean booleanValue = ((Boolean) c4977h.m20325c(f25484i)).booleanValue();
        C4976g c4976g = f25485j;
        if (c4977h.m20325c(c4976g) != null && ((Boolean) c4977h.m20325c(c4976g)).booleanValue()) {
            z10 = true;
        } else {
            z10 = false;
        }
        try {
            return C6624g.m25851e(m25937h(interfaceC6613a0, m25940k, abstractC6640o, enumC4971b, enumC4978i, z10, i10, i11, booleanValue, bVar), this.f25490a);
        } finally {
            m25948v(m25940k);
            this.f25492c.put(bArr);
        }
    }

    /* renamed from: h */
    private Bitmap m25937h(InterfaceC6613a0 interfaceC6613a0, BitmapFactory.Options options, AbstractC6640o abstractC6640o, EnumC4971b enumC4971b, EnumC4978i enumC4978i, boolean z10, int i10, int i11, boolean z11, b bVar) {
        boolean z12 = false;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        String str = null;
        ColorSpace.Named named;
        ColorSpace colorSpace;
        ColorSpace colorSpace2;
        ColorSpace colorSpace3;
        ColorSpace colorSpace4;
        boolean isWideGamut;
        float f10 = 0.0f;
        int round;
        int round2;
        long m17210b = AbstractC4117g.m17210b();
        int[] m25942m = m25942m(interfaceC6613a0, options, bVar, this.f25490a);
        boolean z13 = false;
        int i15 = m25942m[0];
        int i16 = m25942m[1];
        String str2 = options.outMimeType;
        if (i15 != -1 && i16 != -1) {
            z12 = z10;
        } else {
            z12 = false;
        }
        int mo25826a = interfaceC6613a0.mo25826a();
        int m25868i = AbstractC6629i0.m25868i(mo25826a);
        boolean m25871l = AbstractC6629i0.m25871l(mo25826a);
        if (i10 == Integer.MIN_VALUE) {
            i12 = i11;
            if (m25944r(m25868i)) {
                i13 = i16;
            } else {
                i13 = i15;
            }
        } else {
            i12 = i11;
            i13 = i10;
        }
        if (i12 == Integer.MIN_VALUE) {
            if (m25944r(m25868i)) {
                i14 = i15;
            } else {
                i14 = i16;
            }
        } else {
            i14 = i12;
        }
        ImageHeaderParser.ImageType mo25829d = interfaceC6613a0.mo25829d();
        m25935c(mo25829d, interfaceC6613a0, bVar, this.f25490a, abstractC6640o, m25868i, i15, i16, i13, i14, options);
        m25934b(interfaceC6613a0, enumC4971b, z12, m25871l, options, i13, i14);
        int i17 = Build.VERSION.SDK_INT;
        int i18 = options.inSampleSize;
        if (!m25952z(mo25829d)) {
            str = "Downsampler";
        } else {
            if (i15 >= 0 && i16 >= 0 && z11) {
                str = "Downsampler";
                round = i13;
                round2 = i14;
            } else {
                if (m25945s(options)) {
                    f10 = options.inTargetDensity / options.inDensity;
                } else {
                    f10 = 1.0f;
                }
                int i19 = options.inSampleSize;
                float f11 = i19;
                int ceil = (int) Math.ceil(i15 / f11);
                int ceil2 = (int) Math.ceil(i16 / f11);
                round = Math.round(ceil * f10);
                round2 = Math.round(ceil2 * f10);
                str = "Downsampler";
                if (Log.isLoggable(str, 2)) {
                    Log.v(str, "Calculated target [" + round + "x" + round2 + "] for source [" + i15 + "x" + i16 + "], sampleSize: " + i19 + ", targetDensity: " + options.inTargetDensity + ", density: " + options.inDensity + ", density multiplier: " + f10);
                }
            }
            if (round > 0 && round2 > 0) {
                m25951y(options, this.f25490a, round, round2);
            }
        }
        if (enumC4978i != null) {
            if (i17 >= 28) {
                if (enumC4978i == EnumC4978i.DISPLAY_P3) {
                    colorSpace3 = options.outColorSpace;
                    if (colorSpace3 != null) {
                        colorSpace4 = options.outColorSpace;
                        isWideGamut = colorSpace4.isWideGamut();
                        if (isWideGamut) {
                            z13 = true;
                        }
                    }
                }
                colorSpace2 = ColorSpace.get(z13 ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB);
                options.inPreferredColorSpace = colorSpace2;
            } else if (i17 >= 26) {
                named = ColorSpace.Named.SRGB;
                colorSpace = ColorSpace.get(named);
                options.inPreferredColorSpace = colorSpace;
            }
        }
        Bitmap m25938i = m25938i(interfaceC6613a0, options, bVar, this.f25490a);
        bVar.mo25856a(this.f25490a, m25938i);
        if (Log.isLoggable(str, 2)) {
            m25946t(i15, i16, str2, options, m25938i, i10, i11, m17210b);
        }
        if (m25938i != null) {
            m25938i.setDensity(this.f25491b.densityDpi);
            Bitmap m25872m = AbstractC6629i0.m25872m(this.f25490a, m25938i, mo25826a);
            if (!m25938i.equals(m25872m)) {
                this.f25490a.mo22617c(m25938i);
                return m25872m;
            }
            return m25872m;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
    
        throw r1;
     */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.graphics.Bitmap m25938i(p322s1.InterfaceC6613a0 r5, android.graphics.BitmapFactory.Options r6, p322s1.C6646u.b r7, p230m1.InterfaceC5571d r8) {
        /*
            java.lang.String r0 = "Downsampler"
            boolean r1 = r6.inJustDecodeBounds
            if (r1 != 0) goto Lc
            r7.mo25857b()
            r5.mo25828c()
        Lc:
            int r1 = r6.outWidth
            int r2 = r6.outHeight
            java.lang.String r3 = r6.outMimeType
            java.util.concurrent.locks.Lock r4 = p322s1.AbstractC6629i0.m25867h()
            r4.lock()
            android.graphics.Bitmap r5 = r5.mo25827b(r6)     // Catch: java.lang.Throwable -> L25 java.lang.IllegalArgumentException -> L27
            java.util.concurrent.locks.Lock r6 = p322s1.AbstractC6629i0.m25867h()
            r6.unlock()
            return r5
        L25:
            r5 = move-exception
            goto L50
        L27:
            r4 = move-exception
            java.io.IOException r1 = m25947u(r4, r1, r2, r3, r6)     // Catch: java.lang.Throwable -> L25
            r2 = 3
            boolean r2 = android.util.Log.isLoggable(r0, r2)     // Catch: java.lang.Throwable -> L25
            if (r2 == 0) goto L38
            java.lang.String r2 = "Failed to decode with inBitmap, trying again without Bitmap re-use"
            android.util.Log.d(r0, r2, r1)     // Catch: java.lang.Throwable -> L25
        L38:
            android.graphics.Bitmap r0 = r6.inBitmap     // Catch: java.lang.Throwable -> L25
            if (r0 == 0) goto L4f
            r8.mo22617c(r0)     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L4e
            r0 = 0
            r6.inBitmap = r0     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L4e
            android.graphics.Bitmap r5 = m25938i(r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L4e
            java.util.concurrent.locks.Lock r6 = p322s1.AbstractC6629i0.m25867h()
            r6.unlock()
            return r5
        L4e:
            throw r1     // Catch: java.lang.Throwable -> L25
        L4f:
            throw r1     // Catch: java.lang.Throwable -> L25
        L50:
            java.util.concurrent.locks.Lock r6 = p322s1.AbstractC6629i0.m25867h()
            r6.unlock()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p322s1.C6646u.m25938i(s1.a0, android.graphics.BitmapFactory$Options, s1.u$b, m1.d):android.graphics.Bitmap");
    }

    /* renamed from: j */
    private static String m25939j(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    /* renamed from: k */
    private static synchronized BitmapFactory.Options m25940k() {
        BitmapFactory.Options options;
        synchronized (C6646u.class) {
            Queue queue = f25489n;
            synchronized (queue) {
                options = (BitmapFactory.Options) queue.poll();
            }
            if (options == null) {
                options = new BitmapFactory.Options();
                m25949w(options);
            }
        }
        return options;
    }

    /* renamed from: l */
    private static int m25941l(double d10) {
        if (d10 > 1.0d) {
            d10 = 1.0d / d10;
        }
        return (int) Math.round(d10 * 2.147483647E9d);
    }

    /* renamed from: m */
    private static int[] m25942m(InterfaceC6613a0 interfaceC6613a0, BitmapFactory.Options options, b bVar, InterfaceC5571d interfaceC5571d) {
        options.inJustDecodeBounds = true;
        m25938i(interfaceC6613a0, options, bVar, interfaceC5571d);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    /* renamed from: n */
    private static String m25943n(BitmapFactory.Options options) {
        return m25939j(options.inBitmap);
    }

    /* renamed from: r */
    private static boolean m25944r(int i10) {
        return i10 == 90 || i10 == 270;
    }

    /* renamed from: s */
    private static boolean m25945s(BitmapFactory.Options options) {
        int i10 = 0;
        int i11 = options.inTargetDensity;
        if (i11 > 0 && (i10 = options.inDensity) > 0 && i11 != i10) {
            return true;
        }
        return false;
    }

    /* renamed from: t */
    private static void m25946t(int i10, int i11, String str, BitmapFactory.Options options, Bitmap bitmap, int i12, int i13, long j10) {
        Log.v("Downsampler", "Decoded " + m25939j(bitmap) + " from [" + i10 + "x" + i11 + "] " + str + " with inBitmap " + m25943n(options) + " for [" + i12 + "x" + i13 + "], sample size: " + options.inSampleSize + ", density: " + options.inDensity + ", target density: " + options.inTargetDensity + ", thread: " + Thread.currentThread().getName() + ", duration: " + AbstractC4117g.m17209a(j10));
    }

    /* renamed from: u */
    private static IOException m25947u(IllegalArgumentException illegalArgumentException, int i10, int i11, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i10 + ", outHeight: " + i11 + ", outMimeType: " + str + ", inBitmap: " + m25943n(options), illegalArgumentException);
    }

    /* renamed from: v */
    private static void m25948v(BitmapFactory.Options options) {
        m25949w(options);
        Queue queue = f25489n;
        synchronized (queue) {
            queue.offer(options);
        }
    }

    /* renamed from: w */
    private static void m25949w(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    /* renamed from: x */
    private static int m25950x(double d10) {
        return (int) (d10 + 0.5d);
    }

    /* renamed from: y */
    private static void m25951y(BitmapFactory.Options options, InterfaceC5571d interfaceC5571d, int i10, int i11) {
        Bitmap.Config config;
        Bitmap.Config config2;
        if (Build.VERSION.SDK_INT >= 26) {
            Bitmap.Config config3 = options.inPreferredConfig;
            config2 = Bitmap.Config.HARDWARE;
            if (config3 != config2) {
                config = options.outConfig;
            } else {
                return;
            }
        } else {
            config = null;
        }
        if (config == null) {
            config = options.inPreferredConfig;
        }
        options.inBitmap = interfaceC5571d.mo22619e(i10, i11, config);
    }

    /* renamed from: z */
    private boolean m25952z(ImageHeaderParser.ImageType imageType) {
        return true;
    }

    /* renamed from: d */
    public InterfaceC5335v m25953d(ParcelFileDescriptor parcelFileDescriptor, int i10, int i11, C4977h c4977h) {
        return m25936g(new InterfaceC6613a0.c(parcelFileDescriptor, this.f25493d, this.f25492c), i10, i11, c4977h, f25487l);
    }

    /* renamed from: e */
    public InterfaceC5335v m25954e(InputStream inputStream, int i10, int i11, C4977h c4977h, b bVar) {
        return m25936g(new InterfaceC6613a0.b(inputStream, this.f25493d, this.f25492c), i10, i11, c4977h, bVar);
    }

    /* renamed from: f */
    public InterfaceC5335v m25955f(ByteBuffer byteBuffer, int i10, int i11, C4977h c4977h) {
        return m25936g(new InterfaceC6613a0.a(byteBuffer, this.f25493d, this.f25492c), i10, i11, c4977h, f25487l);
    }

    /* renamed from: o */
    public boolean m25956o(ParcelFileDescriptor parcelFileDescriptor) {
        return ParcelFileDescriptorRewinder.m7411c();
    }

    /* renamed from: p */
    public boolean m25957p(InputStream inputStream) {
        return true;
    }

    /* renamed from: q */
    public boolean m25958q(ByteBuffer byteBuffer) {
        return true;
    }
}
