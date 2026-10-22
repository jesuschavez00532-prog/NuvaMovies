package p230m1;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: m1.k */
/* loaded from: classes.dex */
public class C5578k implements InterfaceC5571d {

    /* renamed from: k */
    private static final Bitmap.Config f22592k = Bitmap.Config.ARGB_8888;

    /* renamed from: a */
    private final InterfaceC5579l f22593a;

    /* renamed from: b */
    private final Set f22594b;

    /* renamed from: c */
    private final long f22595c;

    /* renamed from: d */
    private final a f22596d;

    /* renamed from: e */
    private long f22597e;

    /* renamed from: f */
    private long f22598f;

    /* renamed from: g */
    private int f22599g;

    /* renamed from: h */
    private int f22600h;

    /* renamed from: i */
    private int f22601i;

    /* renamed from: j */
    private int f22602j;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m1.k$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        void mo22662a(Bitmap bitmap);

        /* renamed from: b */
        void mo22663b(Bitmap bitmap);
    }

    /* renamed from: m1.k$b */
    /* loaded from: classes.dex */
    private static final class b implements a {
        b() {
        }

        @Override // p230m1.C5578k.a
        /* renamed from: a */
        public void mo22662a(Bitmap bitmap) {
        }

        @Override // p230m1.C5578k.a
        /* renamed from: b */
        public void mo22663b(Bitmap bitmap) {
        }
    }

    C5578k(long j10, InterfaceC5579l interfaceC5579l, Set set) {
        this.f22595c = j10;
        this.f22597e = j10;
        this.f22593a = interfaceC5579l;
        this.f22594b = set;
        this.f22596d = new b();
    }

    /* renamed from: f */
    private static void m22650f(Bitmap.Config config) {
        Bitmap.Config config2;
        if (Build.VERSION.SDK_INT >= 26) {
            config2 = Bitmap.Config.HARDWARE;
            if (config != config2) {
                return;
            }
            throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
        }
    }

    /* renamed from: g */
    private static Bitmap m22651g(int i10, int i11, Bitmap.Config config) {
        if (config == null) {
            config = f22592k;
        }
        return Bitmap.createBitmap(i10, i11, config);
    }

    /* renamed from: h */
    private void m22652h() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            m22653i();
        }
    }

    /* renamed from: i */
    private void m22653i() {
        Log.v("LruBitmapPool", "Hits=" + this.f22599g + ", misses=" + this.f22600h + ", puts=" + this.f22601i + ", evictions=" + this.f22602j + ", currentSize=" + this.f22598f + ", maxSize=" + this.f22597e + "\nStrategy=" + this.f22593a);
    }

    /* renamed from: j */
    private void m22654j() {
        m22660q(this.f22597e);
    }

    /* renamed from: k */
    private static Set m22655k() {
        Bitmap.Config config;
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i10 = Build.VERSION.SDK_INT;
        hashSet.add(null);
        if (i10 >= 26) {
            config = Bitmap.Config.HARDWARE;
            hashSet.remove(config);
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: l */
    private static InterfaceC5579l m22656l() {
        return new C5582o();
    }

    /* renamed from: m */
    private synchronized Bitmap m22657m(int i10, int i11, Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap mo22667d;
        m22650f(config);
        InterfaceC5579l interfaceC5579l = this.f22593a;
        if (config != null) {
            config2 = config;
        } else {
            config2 = f22592k;
        }
        mo22667d = interfaceC5579l.mo22667d(i10, i11, config2);
        if (mo22667d == null) {
            if (Log.isLoggable("LruBitmapPool", 3)) {
                Log.d("LruBitmapPool", "Missing bitmap=" + this.f22593a.mo22664a(i10, i11, config));
            }
            this.f22600h++;
        } else {
            this.f22599g++;
            this.f22598f -= this.f22593a.mo22665b(mo22667d);
            this.f22596d.mo22662a(mo22667d);
            m22659p(mo22667d);
        }
        if (Log.isLoggable("LruBitmapPool", 2)) {
            Log.v("LruBitmapPool", "Get bitmap=" + this.f22593a.mo22664a(i10, i11, config));
        }
        m22652h();
        return mo22667d;
    }

    /* renamed from: o */
    private static void m22658o(Bitmap bitmap) {
        bitmap.setPremultiplied(true);
    }

    /* renamed from: p */
    private static void m22659p(Bitmap bitmap) {
        bitmap.setHasAlpha(true);
        m22658o(bitmap);
    }

    /* renamed from: q */
    private synchronized void m22660q(long j10) {
        while (this.f22598f > j10) {
            Bitmap removeLast = this.f22593a.removeLast();
            if (removeLast == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    Log.w("LruBitmapPool", "Size mismatch, resetting");
                    m22653i();
                }
                this.f22598f = 0L;
                return;
            }
            this.f22596d.mo22662a(removeLast);
            this.f22598f -= this.f22593a.mo22665b(removeLast);
            this.f22602j++;
            if (Log.isLoggable("LruBitmapPool", 3)) {
                Log.d("LruBitmapPool", "Evicting bitmap=" + this.f22593a.mo22668e(removeLast));
            }
            m22652h();
            removeLast.recycle();
        }
    }

    @Override // p230m1.InterfaceC5571d
    /* renamed from: a */
    public void mo22615a(int i10) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i10);
        }
        if (i10 < 40 && (Build.VERSION.SDK_INT < 23 || i10 < 20)) {
            if (i10 >= 20 || i10 == 15) {
                m22660q(m22661n() / 2);
                return;
            }
            return;
        }
        mo22616b();
    }

    @Override // p230m1.InterfaceC5571d
    /* renamed from: b */
    public void mo22616b() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        m22660q(0L);
    }

    @Override // p230m1.InterfaceC5571d
    /* renamed from: c */
    public synchronized void mo22617c(Bitmap bitmap) {
        try {
            if (bitmap != null) {
                if (!bitmap.isRecycled()) {
                    if (bitmap.isMutable() && this.f22593a.mo22665b(bitmap) <= this.f22597e && this.f22594b.contains(bitmap.getConfig())) {
                        int mo22665b = this.f22593a.mo22665b(bitmap);
                        this.f22593a.mo22666c(bitmap);
                        this.f22596d.mo22663b(bitmap);
                        this.f22601i++;
                        this.f22598f += mo22665b;
                        if (Log.isLoggable("LruBitmapPool", 2)) {
                            Log.v("LruBitmapPool", "Put bitmap in pool=" + this.f22593a.mo22668e(bitmap));
                        }
                        m22652h();
                        m22654j();
                        return;
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        Log.v("LruBitmapPool", "Reject bitmap from pool, bitmap: " + this.f22593a.mo22668e(bitmap) + ", is mutable: " + bitmap.isMutable() + ", is allowed config: " + this.f22594b.contains(bitmap.getConfig()));
                    }
                    bitmap.recycle();
                    return;
                }
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            throw new NullPointerException("Bitmap must not be null");
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p230m1.InterfaceC5571d
    /* renamed from: d */
    public Bitmap mo22618d(int i10, int i11, Bitmap.Config config) {
        Bitmap m22657m = m22657m(i10, i11, config);
        if (m22657m != null) {
            m22657m.eraseColor(0);
            return m22657m;
        }
        return m22651g(i10, i11, config);
    }

    @Override // p230m1.InterfaceC5571d
    /* renamed from: e */
    public Bitmap mo22619e(int i10, int i11, Bitmap.Config config) {
        Bitmap m22657m = m22657m(i10, i11, config);
        if (m22657m == null) {
            return m22651g(i10, i11, config);
        }
        return m22657m;
    }

    /* renamed from: n */
    public long m22661n() {
        return this.f22597e;
    }

    public C5578k(long j10) {
        this(j10, m22656l(), m22655k());
    }
}
