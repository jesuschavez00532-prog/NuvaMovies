package p342ta;

import android.graphics.BitmapRegionDecoder;
import android.graphics.drawable.AnimationDrawable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.widget.ImageView;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Locale;
import ne.AbstractC5868k;
import ne.C5881x;

/* renamed from: ta.a */
/* loaded from: classes2.dex */
public final class C6928a {

    /* renamed from: a */
    public static final C6928a f26265a;

    /* renamed from: b */
    private static final String f26266b;

    /* renamed from: c */
    private static ImageView f26267c;

    /* renamed from: d */
    private static AnimationDrawable f26268d;

    /* renamed from: e */
    private static BitmapRegionDecoder f26269e;

    /* renamed from: f */
    private static String f26270f;

    /* renamed from: g */
    private static InputStream f26271g;

    /* renamed from: h */
    private static Handler f26272h;

    /* renamed from: i */
    private static Handler f26273i;

    /* renamed from: j */
    private static HandlerThread f26274j;

    static {
        C6928a c6928a = new C6928a();
        f26265a = c6928a;
        f26266b = c6928a.getClass().getSimpleName();
        f26270f = "";
        f26272h = new Handler(Looper.getMainLooper());
    }

    private C6928a() {
    }

    /* renamed from: a */
    public final String m26918a(long j10) {
        long j11 = j10 / 60000;
        long j12 = 60;
        long j13 = j11 / j12;
        long j14 = (j10 / 1000) % j12;
        long j15 = j11 % j12;
        if (j13 > 0) {
            C5881x c5881x = C5881x.f23415a;
            String format = String.format(Locale.US, "%02d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j13), Long.valueOf(j15), Long.valueOf(j14)}, 3));
            AbstractC5868k.m23673e(format, "format(locale, format, *args)");
            return format;
        }
        C5881x c5881x2 = C5881x.f23415a;
        String format2 = String.format(Locale.US, "%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j15), Long.valueOf(j14)}, 2));
        AbstractC5868k.m23673e(format2, "format(locale, format, *args)");
        return format2;
    }

    /* renamed from: b */
    public final void m26919b(ImageView imageView, long j10) throws java.io.IOException {
        AbstractC5868k.m23674f(imageView, "imageView");
    }

    /* renamed from: c */
    public final void m26920c() throws java.io.IOException {
        f26270f = "";
        InputStream inputStream = f26271g;
        if (inputStream != null) {
            inputStream.close();
        }
        BitmapRegionDecoder bitmapRegionDecoder = f26269e;
        if (bitmapRegionDecoder != null) {
            bitmapRegionDecoder.recycle();
        }
        Handler handler = f26273i;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        HandlerThread handlerThread = f26274j;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        f26267c = null;
        AnimationDrawable animationDrawable = f26268d;
        if (animationDrawable != null) {
            animationDrawable.stop();
        }
        f26268d = null;
        f26273i = null;
        f26274j = null;
    }
}
