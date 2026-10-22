package org.xutils.image;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.animation.Animation;
import android.widget.ImageView;
import com.p077uc.crashsdk.export.LogType;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.xutils.C6127x;
import org.xutils.cache.LruCache;
import org.xutils.cache.LruDiskCache;
import org.xutils.common.Callback;
import org.xutils.common.task.Priority;
import org.xutils.common.task.PriorityExecutor;
import org.xutils.common.util.IOUtil;
import org.xutils.common.util.LogUtil;
import org.xutils.http.RequestParams;
import org.xutils.image.ImageOptions;
import org.xutils.p275ex.FileLockedException;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: org.xutils.image.a */
/* loaded from: classes3.dex */
public final class C6121a implements Callback.PrepareCallback, Callback.CacheCallback, Callback.ProgressCallback, Callback.TypedCallback, Callback.Cancelable {

    /* renamed from: p */
    private static final AtomicLong f24078p = new AtomicLong(0);

    /* renamed from: q */
    private static final Executor f24079q = new PriorityExecutor(10, false);

    /* renamed from: r */
    private static final LruCache f24080r;

    /* renamed from: s */
    private static final HashMap f24081s;

    /* renamed from: t */
    private static final Type f24082t;

    /* renamed from: a */
    private C6122b f24083a;

    /* renamed from: b */
    private ImageOptions f24084b;

    /* renamed from: c */
    private WeakReference f24085c;

    /* renamed from: j */
    private Callback.Cancelable f24092j;

    /* renamed from: k */
    private Callback.CommonCallback f24093k;

    /* renamed from: l */
    private Callback.PrepareCallback f24094l;

    /* renamed from: m */
    private Callback.CacheCallback f24095m;

    /* renamed from: n */
    private Callback.ProgressCallback f24096n;

    /* renamed from: d */
    private int f24086d = 0;

    /* renamed from: e */
    private final long f24087e = f24078p.incrementAndGet();

    /* renamed from: f */
    private volatile boolean f24088f = false;

    /* renamed from: g */
    private volatile boolean f24089g = false;

    /* renamed from: h */
    private volatile boolean f24090h = false;

    /* renamed from: i */
    private volatile boolean f24091i = false;

    /* renamed from: o */
    private boolean f24097o = false;

    /* renamed from: org.xutils.image.a$a */
    /* loaded from: classes3.dex */
    static class a extends LruCache {

        /* renamed from: a */
        private boolean f24098a;

        a(int i10) {
            super(i10);
            this.f24098a = false;
        }

        @Override // org.xutils.cache.LruCache
        public void trimToSize(int i10) {
            if (i10 < 0) {
                this.f24098a = true;
            }
            super.trimToSize(i10);
            this.f24098a = false;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.xutils.cache.LruCache
        public void entryRemoved(boolean z10, C6122b c6122b, Drawable drawable, Drawable drawable2) {
            super.entryRemoved(z10, (boolean) c6122b, drawable, drawable2);
            if (z10 && this.f24098a && (drawable instanceof InterfaceC6124d)) {
                ((InterfaceC6124d) drawable).setMemCacheKey(null);
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.xutils.cache.LruCache
        public int sizeOf(C6122b c6122b, Drawable drawable) {
            if (drawable instanceof BitmapDrawable) {
                Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                if (bitmap == null) {
                    return 0;
                }
                return bitmap.getByteCount();
            }
            if (drawable instanceof GifDrawable) {
                return ((GifDrawable) drawable).getByteCount();
            }
            return super.sizeOf((a) c6122b, (C6122b) drawable);
        }
    }

    /* renamed from: org.xutils.image.a$b */
    /* loaded from: classes3.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ImageView imageView = (ImageView) C6121a.this.f24085c.get();
            if (imageView != null) {
                C6121a.m24409i(imageView, C6121a.this.f24083a.f24107a, C6121a.this.f24084b, C6121a.this.f24086d, C6121a.this.f24093k);
            } else {
                C6121a.this.onFinished();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: org.xutils.image.a$c */
    /* loaded from: classes3.dex */
    public static class c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Callback.CommonCallback f24100a;

        /* renamed from: b */
        final /* synthetic */ ImageView f24101b;

        /* renamed from: c */
        final /* synthetic */ ImageOptions f24102c;

        /* renamed from: d */
        final /* synthetic */ String f24103d;

        c(Callback.CommonCallback commonCallback, ImageView imageView, ImageOptions imageOptions, String str) {
            this.f24100a = commonCallback;
            this.f24101b = imageView;
            this.f24102c = imageOptions;
            this.f24103d = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:36:0x0052 A[Catch: all -> 0x0056, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0056, blocks: (B:16:0x0038, B:36:0x0052, B:2:0x0000, B:4:0x0006, B:5:0x000b, B:7:0x000f, B:9:0x0013, B:10:0x0025, B:12:0x0029), top: B:1:0x0000, inners: #3 }] */
        /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                r3 = this;
                org.xutils.common.Callback$CommonCallback r0 = r3.f24100a     // Catch: java.lang.Throwable -> L3c
                boolean r1 = r0 instanceof org.xutils.common.Callback.ProgressCallback     // Catch: java.lang.Throwable -> L3c
                if (r1 == 0) goto Lb
                org.xutils.common.Callback$ProgressCallback r0 = (org.xutils.common.Callback.ProgressCallback) r0     // Catch: java.lang.Throwable -> L3c
                r0.onWaiting()     // Catch: java.lang.Throwable -> L3c
            Lb:
                android.widget.ImageView r0 = r3.f24101b     // Catch: java.lang.Throwable -> L3c
                if (r0 == 0) goto L25
                org.xutils.image.ImageOptions r1 = r3.f24102c     // Catch: java.lang.Throwable -> L3c
                if (r1 == 0) goto L25
                android.widget.ImageView$ScaleType r1 = r1.getPlaceholderScaleType()     // Catch: java.lang.Throwable -> L3c
                r0.setScaleType(r1)     // Catch: java.lang.Throwable -> L3c
                android.widget.ImageView r0 = r3.f24101b     // Catch: java.lang.Throwable -> L3c
                org.xutils.image.ImageOptions r1 = r3.f24102c     // Catch: java.lang.Throwable -> L3c
                android.graphics.drawable.Drawable r1 = r1.getFailureDrawable(r0)     // Catch: java.lang.Throwable -> L3c
                r0.setImageDrawable(r1)     // Catch: java.lang.Throwable -> L3c
            L25:
                org.xutils.common.Callback$CommonCallback r0 = r3.f24100a     // Catch: java.lang.Throwable -> L3c
                if (r0 == 0) goto L34
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L3c
                java.lang.String r2 = r3.f24103d     // Catch: java.lang.Throwable -> L3c
                r1.<init>(r2)     // Catch: java.lang.Throwable -> L3c
                r2 = 0
                r0.onError(r1, r2)     // Catch: java.lang.Throwable -> L3c
            L34:
                org.xutils.common.Callback$CommonCallback r0 = r3.f24100a
                if (r0 == 0) goto L5e
                r0.onFinished()     // Catch: java.lang.Throwable -> L56
                goto L5e
            L3c:
                r0 = move-exception
                org.xutils.common.Callback$CommonCallback r1 = r3.f24100a     // Catch: java.lang.Throwable -> L5f
                if (r1 == 0) goto L4e
                r2 = 1
                r1.onError(r0, r2)     // Catch: java.lang.Throwable -> L46
                goto L4e
            L46:
                r0 = move-exception
                java.lang.String r1 = r0.getMessage()     // Catch: java.lang.Throwable -> L5f
                org.xutils.common.util.LogUtil.m24376e(r1, r0)     // Catch: java.lang.Throwable -> L5f
            L4e:
                org.xutils.common.Callback$CommonCallback r0 = r3.f24100a
                if (r0 == 0) goto L5e
                r0.onFinished()     // Catch: java.lang.Throwable -> L56
                goto L5e
            L56:
                r0 = move-exception
                java.lang.String r1 = r0.getMessage()
                org.xutils.common.util.LogUtil.m24376e(r1, r0)
            L5e:
                return
            L5f:
                r0 = move-exception
                org.xutils.common.Callback$CommonCallback r1 = r3.f24100a
                if (r1 == 0) goto L70
                r1.onFinished()     // Catch: java.lang.Throwable -> L68
                goto L70
            L68:
                r1 = move-exception
                java.lang.String r2 = r1.getMessage()
                org.xutils.common.util.LogUtil.m24376e(r2, r1)
            L70:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: org.xutils.image.C6121a.c.run():void");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: org.xutils.image.a$d */
    /* loaded from: classes3.dex */
    public static final class d extends ImageView {

        /* renamed from: c */
        private static final AtomicInteger f24104c = new AtomicInteger(0);

        /* renamed from: a */
        private final int f24105a;

        /* renamed from: b */
        private Drawable f24106b;

        public d() {
            super(C6127x.app());
            this.f24105a = f24104c.incrementAndGet();
        }

        @Override // android.widget.ImageView
        public Drawable getDrawable() {
            return this.f24106b;
        }

        public int hashCode() {
            return this.f24105a;
        }

        @Override // android.widget.ImageView
        public void setImageDrawable(Drawable drawable) {
            this.f24106b = drawable;
        }

        @Override // android.view.View
        public void setLayerType(int i10, Paint paint) {
        }

        @Override // android.widget.ImageView
        public void setScaleType(ImageView.ScaleType scaleType) {
        }

        @Override // android.view.View
        public void startAnimation(Animation animation) {
        }
    }

    static {
        int i10 = 4194304;
        a aVar = new a(4194304);
        f24080r = aVar;
        int memoryClass = (((ActivityManager) C6127x.app().getSystemService("activity")).getMemoryClass() * LogType.ANR) / 8;
        if (memoryClass >= 4194304) {
            i10 = memoryClass;
        }
        aVar.resize(i10);
        f24081s = new HashMap();
        f24082t = File.class;
    }

    private C6121a() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static void m24406f() {
        LruDiskCache.getDiskCache("xUtils_img").clearCacheFiles();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static void m24407g() {
        f24080r.evictAll();
    }

    /* renamed from: h */
    private static RequestParams m24408h(Context context, String str, ImageOptions imageOptions) {
        ImageOptions.ParamsBuilder paramsBuilder;
        RequestParams requestParams = new RequestParams(str);
        if (context != null) {
            requestParams.setContext(context);
        }
        requestParams.setCacheDirName("xUtils_img");
        requestParams.setConnectTimeout(8000);
        requestParams.setPriority(Priority.BG_LOW);
        requestParams.setExecutor(f24079q);
        requestParams.setCancelFast(true);
        requestParams.setUseCookie(false);
        if (imageOptions != null && (paramsBuilder = imageOptions.getParamsBuilder()) != null) {
            return paramsBuilder.buildParams(requestParams, imageOptions);
        }
        return requestParams;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0079, code lost:
    
        if (r2.isRecycled() != false) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x011d  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.xutils.common.Callback.Cancelable m24409i(android.widget.ImageView r6, java.lang.String r7, org.xutils.image.ImageOptions r8, int r9, org.xutils.common.Callback.CommonCallback r10) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.xutils.image.C6121a.m24409i(android.widget.ImageView, java.lang.String, org.xutils.image.ImageOptions, int, org.xutils.common.Callback$CommonCallback):org.xutils.common.Callback$Cancelable");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static Callback.Cancelable m24410j(String str, ImageOptions imageOptions, Callback.CommonCallback commonCallback) {
        if (TextUtils.isEmpty(str)) {
            m24413m(null, imageOptions, "url is null", commonCallback);
            return null;
        }
        return m24409i(new d(), str, imageOptions, 0, commonCallback);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public static Callback.Cancelable m24411k(String str, ImageOptions imageOptions, Callback.CacheCallback cacheCallback) {
        if (TextUtils.isEmpty(str)) {
            m24413m(null, imageOptions, "url is null", cacheCallback);
            return null;
        }
        return C6127x.http().get(m24408h(null, str, imageOptions), cacheCallback);
    }

    /* renamed from: l */
    private Callback.Cancelable m24412l(ImageView imageView, String str, ImageOptions imageOptions, Callback.CommonCallback commonCallback) {
        this.f24085c = new WeakReference(imageView);
        this.f24084b = imageOptions;
        this.f24083a = new C6122b(str, imageOptions);
        this.f24093k = commonCallback;
        if (commonCallback instanceof Callback.ProgressCallback) {
            this.f24096n = (Callback.ProgressCallback) commonCallback;
        }
        if (commonCallback instanceof Callback.PrepareCallback) {
            this.f24094l = (Callback.PrepareCallback) commonCallback;
        }
        if (commonCallback instanceof Callback.CacheCallback) {
            this.f24095m = (Callback.CacheCallback) commonCallback;
        }
        Drawable drawable = imageView.getDrawable();
        if (drawable == null || imageOptions.isForceLoadingDrawable()) {
            drawable = imageOptions.getLoadingDrawable(imageView);
            imageView.setScaleType(imageOptions.getPlaceholderScaleType());
        }
        imageView.setImageDrawable(new AsyncDrawable(this, drawable));
        RequestParams m24408h = m24408h(imageView.getContext(), str, imageOptions);
        if (imageView instanceof d) {
            HashMap hashMap = f24081s;
            synchronized (hashMap) {
                hashMap.put(imageView.hashCode() + str, (d) imageView);
            }
        }
        Callback.Cancelable cancelable = C6127x.http().get(m24408h, this);
        this.f24092j = cancelable;
        return cancelable;
    }

    /* renamed from: m */
    private static void m24413m(ImageView imageView, ImageOptions imageOptions, String str, Callback.CommonCallback commonCallback) {
        C6127x.task().autoPost(new c(commonCallback, imageView, imageOptions, str));
    }

    /* renamed from: n */
    private void m24414n() {
        ImageView imageView = (ImageView) this.f24085c.get();
        if (imageView != null) {
            Drawable failureDrawable = this.f24084b.getFailureDrawable(imageView);
            imageView.setScaleType(this.f24084b.getPlaceholderScaleType());
            imageView.setImageDrawable(failureDrawable);
        }
    }

    /* renamed from: o */
    private void m24415o(Drawable drawable) {
        ImageView imageView = (ImageView) this.f24085c.get();
        if (imageView != null) {
            imageView.setScaleType(this.f24084b.getImageScaleType());
            if (drawable instanceof GifDrawable) {
                if (imageView.getScaleType() == ImageView.ScaleType.CENTER) {
                    imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                }
                imageView.setLayerType(1, null);
            }
            if (this.f24084b.getAnimation() != null) {
                ImageAnimationHelper.animationDisplay(imageView, drawable, this.f24084b.getAnimation());
            } else if (this.f24084b.isFadeIn()) {
                ImageAnimationHelper.fadeInDisplay(imageView, drawable);
            } else {
                imageView.setImageDrawable(drawable);
            }
        }
    }

    /* renamed from: p */
    private boolean m24416p(boolean z10) {
        ImageView imageView = (ImageView) this.f24085c.get();
        if (imageView == null) {
            return false;
        }
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof AsyncDrawable) {
            C6121a imageLoader = ((AsyncDrawable) drawable).getImageLoader();
            if (imageLoader == null || imageLoader == this) {
                return true;
            }
            if (this.f24087e > imageLoader.f24087e) {
                imageLoader.cancel();
                return true;
            }
            cancel();
            return false;
        }
        if (z10) {
            cancel();
            return false;
        }
        return true;
    }

    @Override // org.xutils.common.Callback.Cancelable
    public void cancel() {
        this.f24088f = true;
        this.f24089g = true;
        Callback.Cancelable cancelable = this.f24092j;
        if (cancelable != null) {
            cancelable.cancel();
        }
    }

    @Override // org.xutils.common.Callback.TypedCallback
    public Type getLoadType() {
        return f24082t;
    }

    @Override // org.xutils.common.Callback.Cancelable
    public boolean isCancelled() {
        if (!this.f24089g && m24416p(false)) {
            return false;
        }
        return true;
    }

    @Override // org.xutils.common.Callback.CommonCallback
    public void onCancelled(Callback.CancelledException cancelledException) {
        Callback.CommonCallback commonCallback;
        this.f24088f = true;
        if (m24416p(false) && (commonCallback = this.f24093k) != null) {
            commonCallback.onCancelled(cancelledException);
        }
    }

    @Override // org.xutils.common.Callback.CommonCallback
    public void onError(Throwable th, boolean z10) {
        this.f24088f = true;
        if (!m24416p(false)) {
            return;
        }
        int i10 = this.f24086d + 1;
        this.f24086d = i10;
        if ((th instanceof FileLockedException) && i10 < 1000) {
            LogUtil.m24373d("ImageFileLocked: " + this.f24083a.f24107a);
            C6127x.task().postDelayed(new b(), 10L);
            this.f24091i = true;
            return;
        }
        LogUtil.m24376e(this.f24083a.f24107a, th);
        m24414n();
        Callback.CommonCallback commonCallback = this.f24093k;
        if (commonCallback != null) {
            commonCallback.onError(th, z10);
        }
    }

    @Override // org.xutils.common.Callback.CommonCallback
    public void onFinished() {
        this.f24088f = true;
        if (this.f24091i) {
            return;
        }
        ImageView imageView = (ImageView) this.f24085c.get();
        if (imageView instanceof d) {
            HashMap hashMap = f24081s;
            synchronized (hashMap) {
                hashMap.remove(imageView.hashCode() + this.f24083a.f24107a);
            }
        }
        Callback.CommonCallback commonCallback = this.f24093k;
        if (commonCallback != null) {
            commonCallback.onFinished();
        }
    }

    @Override // org.xutils.common.Callback.ProgressCallback
    public void onLoading(long j10, long j11, boolean z10) {
        Callback.ProgressCallback progressCallback;
        if (m24416p(true) && (progressCallback = this.f24096n) != null) {
            progressCallback.onLoading(j10, j11, z10);
        }
    }

    @Override // org.xutils.common.Callback.ProgressCallback
    public void onStarted() {
        Callback.ProgressCallback progressCallback;
        if (m24416p(true) && (progressCallback = this.f24096n) != null) {
            progressCallback.onStarted();
        }
    }

    @Override // org.xutils.common.Callback.ProgressCallback
    public void onWaiting() {
        Callback.ProgressCallback progressCallback;
        if (!this.f24090h && (progressCallback = this.f24096n) != null) {
            progressCallback.onWaiting();
        }
    }

    @Override // org.xutils.common.Callback.CacheCallback
    public boolean onCache(Drawable drawable) {
        if (!m24416p(true) || drawable == null) {
            return false;
        }
        this.f24097o = true;
        m24415o(drawable);
        Callback.CacheCallback cacheCallback = this.f24095m;
        if (cacheCallback != null) {
            return cacheCallback.onCache(drawable);
        }
        Callback.CommonCallback commonCallback = this.f24093k;
        if (commonCallback != null) {
            commonCallback.onSuccess(drawable);
        }
        return true;
    }

    @Override // org.xutils.common.Callback.CommonCallback
    public void onSuccess(Drawable drawable) {
        if (m24416p(!this.f24097o) && drawable != null) {
            m24415o(drawable);
            Callback.CommonCallback commonCallback = this.f24093k;
            if (commonCallback != null) {
                commonCallback.onSuccess(drawable);
            }
        }
    }

    @Override // org.xutils.common.Callback.PrepareCallback
    public Drawable prepare(File file) {
        if (!m24416p(true)) {
            return null;
        }
        if (file.exists()) {
            try {
                Callback.PrepareCallback prepareCallback = this.f24094l;
                Drawable drawable = prepareCallback != null ? (Drawable) prepareCallback.prepare(file) : null;
                if (drawable == null) {
                    drawable = ImageDecoder.decodeFileWithLock(file, this.f24084b, this);
                }
                if (drawable != null && (drawable instanceof InterfaceC6124d)) {
                    ((InterfaceC6124d) drawable).setMemCacheKey(this.f24083a);
                    f24080r.put(this.f24083a, drawable);
                }
                return drawable;
            } catch (IOException e10) {
                IOUtil.deleteFileOrDir(file);
                throw e10;
            }
        }
        throw new FileNotFoundException(file.getAbsolutePath());
    }
}
