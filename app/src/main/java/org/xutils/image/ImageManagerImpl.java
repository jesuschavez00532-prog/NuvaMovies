package org.xutils.image;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import java.io.File;
import org.xutils.C6127x;
import org.xutils.ImageManager;
import org.xutils.common.Callback;

/* loaded from: classes3.dex */
public final class ImageManagerImpl implements ImageManager {
    private static volatile ImageManagerImpl instance;
    private static final Object lock = new Object();

    /* renamed from: org.xutils.image.ImageManagerImpl$a */
    /* loaded from: classes3.dex */
    class RunnableC6117a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ImageView f24062a;

        /* renamed from: b */
        final /* synthetic */ String f24063b;

        RunnableC6117a(ImageView imageView, String str) {
            this.f24062a = imageView;
            this.f24063b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C6121a.m24409i(this.f24062a, this.f24063b, null, 0, null);
        }
    }

    /* renamed from: org.xutils.image.ImageManagerImpl$b */
    /* loaded from: classes3.dex */
    class RunnableC6118b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ImageView f24065a;

        /* renamed from: b */
        final /* synthetic */ String f24066b;

        /* renamed from: c */
        final /* synthetic */ ImageOptions f24067c;

        RunnableC6118b(ImageView imageView, String str, ImageOptions imageOptions) {
            this.f24065a = imageView;
            this.f24066b = str;
            this.f24067c = imageOptions;
        }

        @Override // java.lang.Runnable
        public void run() {
            C6121a.m24409i(this.f24065a, this.f24066b, this.f24067c, 0, null);
        }
    }

    /* renamed from: org.xutils.image.ImageManagerImpl$c */
    /* loaded from: classes3.dex */
    class RunnableC6119c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ImageView f24069a;

        /* renamed from: b */
        final /* synthetic */ String f24070b;

        /* renamed from: c */
        final /* synthetic */ Callback.CommonCallback f24071c;

        RunnableC6119c(ImageView imageView, String str, Callback.CommonCallback commonCallback) {
            this.f24069a = imageView;
            this.f24070b = str;
            this.f24071c = commonCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            C6121a.m24409i(this.f24069a, this.f24070b, null, 0, this.f24071c);
        }
    }

    /* renamed from: org.xutils.image.ImageManagerImpl$d */
    /* loaded from: classes3.dex */
    class RunnableC6120d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ImageView f24073a;

        /* renamed from: b */
        final /* synthetic */ String f24074b;

        /* renamed from: c */
        final /* synthetic */ ImageOptions f24075c;

        /* renamed from: d */
        final /* synthetic */ Callback.CommonCallback f24076d;

        RunnableC6120d(ImageView imageView, String str, ImageOptions imageOptions, Callback.CommonCallback commonCallback) {
            this.f24073a = imageView;
            this.f24074b = str;
            this.f24075c = imageOptions;
            this.f24076d = commonCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            C6121a.m24409i(this.f24073a, this.f24074b, this.f24075c, 0, this.f24076d);
        }
    }

    private ImageManagerImpl() {
    }

    public static void registerInstance() {
        if (instance == null) {
            synchronized (lock) {
                if (instance == null) {
                    instance = new ImageManagerImpl();
                }
            }
        }
        C6127x.Ext.setImageManager(instance);
    }

    @Override // org.xutils.ImageManager
    public void bind(ImageView imageView, String str) {
        C6127x.task().autoPost(new RunnableC6117a(imageView, str));
    }

    @Override // org.xutils.ImageManager
    public void clearCacheFiles() {
        C6121a.m24406f();
        ImageDecoder.clearCacheFiles();
    }

    @Override // org.xutils.ImageManager
    public void clearMemCache() {
        C6121a.m24407g();
    }

    @Override // org.xutils.ImageManager
    public Callback.Cancelable loadDrawable(String str, ImageOptions imageOptions, Callback.CommonCallback<Drawable> commonCallback) {
        return C6121a.m24410j(str, imageOptions, commonCallback);
    }

    @Override // org.xutils.ImageManager
    public Callback.Cancelable loadFile(String str, ImageOptions imageOptions, Callback.CacheCallback<File> cacheCallback) {
        return C6121a.m24411k(str, imageOptions, cacheCallback);
    }

    @Override // org.xutils.ImageManager
    public void bind(ImageView imageView, String str, ImageOptions imageOptions) {
        C6127x.task().autoPost(new RunnableC6118b(imageView, str, imageOptions));
    }

    @Override // org.xutils.ImageManager
    public void bind(ImageView imageView, String str, Callback.CommonCallback<Drawable> commonCallback) {
        C6127x.task().autoPost(new RunnableC6119c(imageView, str, commonCallback));
    }

    @Override // org.xutils.ImageManager
    public void bind(ImageView imageView, String str, ImageOptions imageOptions, Callback.CommonCallback<Drawable> commonCallback) {
        C6127x.task().autoPost(new RunnableC6120d(imageView, str, imageOptions, commonCallback));
    }
}
