package p322s1;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import p109e2.AbstractC4121k;
import p230m1.InterfaceC5571d;

/* renamed from: s1.i0 */
/* loaded from: classes.dex */
public abstract class AbstractC6629i0 {

    /* renamed from: a */
    private static final Paint f25443a = new Paint(6);

    /* renamed from: b */
    private static final Paint f25444b = new Paint(7);

    /* renamed from: c */
    private static final Paint f25445c;

    /* renamed from: d */
    private static final Set f25446d;

    /* renamed from: e */
    private static final Lock f25447e;

    /* renamed from: s1.i0$a */
    /* loaded from: classes.dex */
    class a implements b {

        /* renamed from: a */
        final /* synthetic */ int f25448a;

        a(int i10) {
            this.f25448a = i10;
        }

        @Override // p322s1.AbstractC6629i0.b
        /* renamed from: a */
        public void mo25876a(Canvas canvas, Paint paint, RectF rectF) {
            int i10 = this.f25448a;
            canvas.drawRoundRect(rectF, i10, i10, paint);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s1.i0$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        void mo25876a(Canvas canvas, Paint paint, RectF rectF);
    }

    /* renamed from: s1.i0$c */
    /* loaded from: classes.dex */
    private static final class c implements Lock {
        c() {
        }

        @Override // java.util.concurrent.locks.Lock
        public void lock() {
        }

        @Override // java.util.concurrent.locks.Lock
        public void lockInterruptibly() {
        }

        @Override // java.util.concurrent.locks.Lock
        public Condition newCondition() {
            throw new UnsupportedOperationException("Should not be called");
        }

        @Override // java.util.concurrent.locks.Lock
        public boolean tryLock() {
            return true;
        }

        @Override // java.util.concurrent.locks.Lock
        public void unlock() {
        }

        @Override // java.util.concurrent.locks.Lock
        public boolean tryLock(long j10, TimeUnit timeUnit) {
            return true;
        }
    }

    static {
        Lock cVar;
        HashSet hashSet = new HashSet(Arrays.asList("XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079"));
        f25446d = hashSet;
        if (hashSet.contains(Build.MODEL)) {
            cVar = new ReentrantLock();
        } else {
            cVar = new c();
        }
        f25447e = cVar;
        Paint paint = new Paint(7);
        f25445c = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    /* renamed from: a */
    private static void m25860a(Bitmap bitmap, Bitmap bitmap2, Matrix matrix) {
        Lock lock = f25447e;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, f25443a);
            m25863d(canvas);
            lock.unlock();
        } catch (Throwable th) {
            f25447e.unlock();
            throw th;
        }
    }

    /* renamed from: b */
    public static Bitmap m25861b(InterfaceC5571d interfaceC5571d, Bitmap bitmap, int i10, int i11) {
        float width;
        float height;
        if (bitmap.getWidth() == i10 && bitmap.getHeight() == i11) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float f10 = 0.0f;
        if (bitmap.getWidth() * i11 > bitmap.getHeight() * i10) {
            width = i11 / bitmap.getHeight();
            f10 = (i10 - (bitmap.getWidth() * width)) * 0.5f;
            height = 0.0f;
        } else {
            width = i10 / bitmap.getWidth();
            height = (i11 - (bitmap.getHeight() * width)) * 0.5f;
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (f10 + 0.5f), (int) (height + 0.5f));
        Bitmap mo22618d = interfaceC5571d.mo22618d(i10, i11, m25869j(bitmap));
        m25875p(bitmap, mo22618d);
        m25860a(bitmap, mo22618d, matrix);
        return mo22618d;
    }

    /* renamed from: c */
    public static Bitmap m25862c(InterfaceC5571d interfaceC5571d, Bitmap bitmap, int i10, int i11) {
        if (bitmap.getWidth() <= i10 && bitmap.getHeight() <= i11) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size larger or equal to input, returning input");
            }
            return bitmap;
        }
        if (Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "requested target size too big for input, fit centering instead");
        }
        return m25864e(interfaceC5571d, bitmap, i10, i11);
    }

    /* renamed from: d */
    private static void m25863d(Canvas canvas) {
        canvas.setBitmap(null);
    }

    /* renamed from: e */
    public static Bitmap m25864e(InterfaceC5571d interfaceC5571d, Bitmap bitmap, int i10, int i11) {
        if (bitmap.getWidth() == i10 && bitmap.getHeight() == i11) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size matches input, returning input");
            }
            return bitmap;
        }
        float min = Math.min(i10 / bitmap.getWidth(), i11 / bitmap.getHeight());
        int round = Math.round(bitmap.getWidth() * min);
        int round2 = Math.round(bitmap.getHeight() * min);
        if (bitmap.getWidth() == round && bitmap.getHeight() == round2) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "adjusted target size matches input, returning input");
            }
            return bitmap;
        }
        Bitmap mo22618d = interfaceC5571d.mo22618d((int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), m25869j(bitmap));
        m25875p(bitmap, mo22618d);
        if (Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "request: " + i10 + "x" + i11);
            Log.v("TransformationUtils", "toFit:   " + bitmap.getWidth() + "x" + bitmap.getHeight());
            Log.v("TransformationUtils", "toReuse: " + mo22618d.getWidth() + "x" + mo22618d.getHeight());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("minPct:   ");
            sb2.append(min);
            Log.v("TransformationUtils", sb2.toString());
        }
        Matrix matrix = new Matrix();
        matrix.setScale(min, min);
        m25860a(bitmap, mo22618d, matrix);
        return mo22618d;
    }

    /* renamed from: f */
    private static Bitmap m25865f(InterfaceC5571d interfaceC5571d, Bitmap bitmap) {
        Bitmap.Config m25866g = m25866g(bitmap);
        if (m25866g.equals(bitmap.getConfig())) {
            return bitmap;
        }
        Bitmap mo22618d = interfaceC5571d.mo22618d(bitmap.getWidth(), bitmap.getHeight(), m25866g);
        new Canvas(mo22618d).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        return mo22618d;
    }

    /* renamed from: g */
    private static Bitmap.Config m25866g(Bitmap bitmap) {
        Bitmap.Config config;
        Bitmap.Config config2;
        if (Build.VERSION.SDK_INT >= 26) {
            config = Bitmap.Config.RGBA_F16;
            if (config.equals(bitmap.getConfig())) {
                config2 = Bitmap.Config.RGBA_F16;
                return config2;
            }
        }
        return Bitmap.Config.ARGB_8888;
    }

    /* renamed from: h */
    public static Lock m25867h() {
        return f25447e;
    }

    /* renamed from: i */
    public static int m25868i(int i10) {
        switch (i10) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    /* renamed from: j */
    private static Bitmap.Config m25869j(Bitmap bitmap) {
        if (bitmap.getConfig() != null) {
            return bitmap.getConfig();
        }
        return Bitmap.Config.ARGB_8888;
    }

    /* renamed from: k */
    static void m25870k(int i10, Matrix matrix) {
        switch (i10) {
            case 2:
                matrix.setScale(-1.0f, 1.0f);
                return;
            case 3:
                matrix.setRotate(180.0f);
                return;
            case 4:
                matrix.setRotate(180.0f);
                matrix.postScale(-1.0f, 1.0f);
                return;
            case 5:
                matrix.setRotate(90.0f);
                matrix.postScale(-1.0f, 1.0f);
                return;
            case 6:
                matrix.setRotate(90.0f);
                return;
            case 7:
                matrix.setRotate(-90.0f);
                matrix.postScale(-1.0f, 1.0f);
                return;
            case 8:
                matrix.setRotate(-90.0f);
                return;
            default:
                return;
        }
    }

    /* renamed from: l */
    public static boolean m25871l(int i10) {
        switch (i10) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: m */
    public static Bitmap m25872m(InterfaceC5571d interfaceC5571d, Bitmap bitmap, int i10) {
        if (!m25871l(i10)) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        m25870k(i10, matrix);
        RectF rectF = new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
        matrix.mapRect(rectF);
        Bitmap mo22618d = interfaceC5571d.mo22618d(Math.round(rectF.width()), Math.round(rectF.height()), m25869j(bitmap));
        matrix.postTranslate(-rectF.left, -rectF.top);
        mo22618d.setHasAlpha(bitmap.hasAlpha());
        m25860a(bitmap, mo22618d, matrix);
        return mo22618d;
    }

    /* renamed from: n */
    public static Bitmap m25873n(InterfaceC5571d interfaceC5571d, Bitmap bitmap, int i10) {
        boolean z10;
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        AbstractC4121k.m17223a(z10, "roundingRadius must be greater than 0.");
        return m25874o(interfaceC5571d, bitmap, new a(i10));
    }

    /* renamed from: o */
    private static Bitmap m25874o(InterfaceC5571d interfaceC5571d, Bitmap bitmap, b bVar) {
        Bitmap.Config m25866g = m25866g(bitmap);
        Bitmap m25865f = m25865f(interfaceC5571d, bitmap);
        Bitmap mo22618d = interfaceC5571d.mo22618d(m25865f.getWidth(), m25865f.getHeight(), m25866g);
        mo22618d.setHasAlpha(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(m25865f, tileMode, tileMode);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setShader(bitmapShader);
        RectF rectF = new RectF(0.0f, 0.0f, mo22618d.getWidth(), mo22618d.getHeight());
        Lock lock = f25447e;
        lock.lock();
        try {
            Canvas canvas = new Canvas(mo22618d);
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            bVar.mo25876a(canvas, paint, rectF);
            m25863d(canvas);
            lock.unlock();
            if (!m25865f.equals(bitmap)) {
                interfaceC5571d.mo22617c(m25865f);
            }
            return mo22618d;
        } catch (Throwable th) {
            f25447e.unlock();
            throw th;
        }
    }

    /* renamed from: p */
    public static void m25875p(Bitmap bitmap, Bitmap bitmap2) {
        bitmap2.setHasAlpha(bitmap.hasAlpha());
    }
}
