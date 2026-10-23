package p119ed;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.util.Log;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p104dd.C4093a;
import p119ed.InterfaceC4173a;
import tv.danmaku.ijk.media.player.ISurfaceTextureHost;

/* renamed from: ed.c */
/* loaded from: classes3.dex */
public class C4175c extends TextureView implements InterfaceC4173a {

    /* renamed from: a */
    private C4093a f18259a;

    /* renamed from: b */
    private b f18260b;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ed.c$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC4173a.b {

        /* renamed from: a */
        private C4175c f18261a;

        /* renamed from: b */
        private SurfaceTexture f18262b;

        /* renamed from: c */
        private ISurfaceTextureHost f18263c;

        public a(C4175c c4175c, SurfaceTexture surfaceTexture, ISurfaceTextureHost iSurfaceTextureHost) {
            this.f18261a = c4175c;
            this.f18262b = surfaceTexture;
            this.f18263c = iSurfaceTextureHost;
        }

        @Override // p119ed.InterfaceC4173a.b
        public InterfaceC4173a getRenderView() {
            return this.f18261a;
        }

        @Override // p119ed.InterfaceC4173a.b
        public Surface openSurface() {
            if (this.f18262b == null) {
                return null;
            }
            return new Surface(this.f18262b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ed.c$b */
    /* loaded from: classes3.dex */
    public static final class b implements TextureView.SurfaceTextureListener, ISurfaceTextureHost {

        /* renamed from: a */
        private SurfaceTexture f18264a;

        /* renamed from: b */
        private boolean f18265b;

        /* renamed from: c */
        private int f18266c;

        /* renamed from: d */
        private int f18267d;

        /* renamed from: h */
        private WeakReference f18271h;

        /* renamed from: e */
        private boolean f18268e = true;

        /* renamed from: f */
        private boolean f18269f = false;

        /* renamed from: g */
        private boolean f18270g = false;

        /* renamed from: i */
        private Map f18272i = new ConcurrentHashMap();

        public b(C4175c c4175c) {
            this.f18271h = new WeakReference(c4175c);
        }

        /* renamed from: b */
        public void m17453b(InterfaceC4173a.a aVar) {
            a aVar2;
            this.f18272i.put(aVar, aVar);
            if (this.f18264a != null) {
                aVar2 = new a((C4175c) this.f18271h.get(), this.f18264a, this);
                aVar.mo818d(aVar2, this.f18266c, this.f18267d);
            } else {
                aVar2 = null;
            }
            if (this.f18265b) {
                if (aVar2 == null) {
                    aVar2 = new a((C4175c) this.f18271h.get(), this.f18264a, this);
                }
                aVar.mo817c(aVar2, 0, this.f18266c, this.f18267d);
            }
        }

        /* renamed from: c */
        public void m17454c() {
            Log.d("TextureRenderView", "didDetachFromWindow()");
            this.f18270g = true;
        }

        /* renamed from: d */
        public void m17455d(InterfaceC4173a.a aVar) {
            int i10 = 0;
            int i11 = 0;
            if (this.f18271h.get() != null) {
                i10 = ((C4175c) this.f18271h.get()).getView().getWidth();
                i11 = ((C4175c) this.f18271h.get()).getView().getHeight();
            } else {
                i10 = 0;
                i11 = 0;
            }
            aVar.mo816b(i10, i11);
        }

        /* renamed from: e */
        public void m17456e(InterfaceC4173a.a aVar) {
            this.f18272i.remove(aVar);
        }

        /* renamed from: f */
        public void m17457f(boolean z10) {
            this.f18268e = z10;
        }

        /* renamed from: g */
        public void m17458g() {
            Log.d("TextureRenderView", "willDetachFromWindow()");
            this.f18269f = true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
            this.f18264a = surfaceTexture;
            this.f18265b = false;
            this.f18266c = 0;
            this.f18267d = 0;
            a aVar = new a((C4175c) this.f18271h.get(), surfaceTexture, this);
            Iterator it = this.f18272i.keySet().iterator();
            while (it.hasNext()) {
                ((InterfaceC4173a.a) it.next()).mo818d(aVar, 0, 0);
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            this.f18264a = surfaceTexture;
            this.f18265b = false;
            this.f18266c = 0;
            this.f18267d = 0;
            a aVar = new a((C4175c) this.f18271h.get(), surfaceTexture, this);
            Iterator it = this.f18272i.keySet().iterator();
            while (it.hasNext()) {
                ((InterfaceC4173a.a) it.next()).mo815a(aVar);
            }
            Log.d("TextureRenderView", "onSurfaceTextureDestroyed: destroy: " + this.f18268e);
            return this.f18268e;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
            this.f18264a = surfaceTexture;
            this.f18265b = true;
            this.f18266c = i10;
            this.f18267d = i11;
            a aVar = new a((C4175c) this.f18271h.get(), surfaceTexture, this);
            for (InterfaceC4173a.a aVar2 : this.f18272i.keySet()) {
                aVar2.mo817c(aVar, 0, i10, i11);
                m17455d(aVar2);
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override // tv.danmaku.ijk.media.player.ISurfaceTextureHost
        public void releaseSurfaceTexture(SurfaceTexture surfaceTexture) {
            if (surfaceTexture == null) {
                Log.d("TextureRenderView", "releaseSurfaceTexture: null");
                return;
            }
            if (this.f18270g) {
                if (surfaceTexture != this.f18264a) {
                    Log.d("TextureRenderView", "releaseSurfaceTexture: didDetachFromWindow(): release different SurfaceTexture");
                    surfaceTexture.release();
                    return;
                } else if (!this.f18268e) {
                    Log.d("TextureRenderView", "releaseSurfaceTexture: didDetachFromWindow(): release detached SurfaceTexture");
                    surfaceTexture.release();
                    return;
                } else {
                    Log.d("TextureRenderView", "releaseSurfaceTexture: didDetachFromWindow(): already released by TextureView");
                    return;
                }
            }
            if (this.f18269f) {
                if (surfaceTexture != this.f18264a) {
                    Log.d("TextureRenderView", "releaseSurfaceTexture: willDetachFromWindow(): release different SurfaceTexture");
                    surfaceTexture.release();
                    return;
                } else if (!this.f18268e) {
                    Log.d("TextureRenderView", "releaseSurfaceTexture: willDetachFromWindow(): re-attach SurfaceTexture to TextureView");
                    m17457f(true);
                    return;
                } else {
                    Log.d("TextureRenderView", "releaseSurfaceTexture: willDetachFromWindow(): will released by TextureView");
                    return;
                }
            }
            if (surfaceTexture != this.f18264a) {
                Log.d("TextureRenderView", "releaseSurfaceTexture: alive: release different SurfaceTexture");
                surfaceTexture.release();
            } else if (!this.f18268e) {
                Log.d("TextureRenderView", "releaseSurfaceTexture: alive: re-attach SurfaceTexture to TextureView");
                m17457f(true);
            } else {
                Log.d("TextureRenderView", "releaseSurfaceTexture: alive: will released by TextureView");
            }
        }
    }

    public C4175c(Context context) {
        super(context);
        m17451c(context);
    }

    /* renamed from: c */
    private void m17451c(Context context) {
        this.f18259a = new C4093a(this);
        b bVar = new b(this);
        this.f18260b = bVar;
        setSurfaceTextureListener(bVar);
    }

    @Override // p119ed.InterfaceC4173a
    /* renamed from: a */
    public void mo17445a(InterfaceC4173a.a aVar) {
        this.f18260b.m17456e(aVar);
    }

    @Override // p119ed.InterfaceC4173a
    /* renamed from: b */
    public void mo17446b(InterfaceC4173a.a aVar) {
        this.f18260b.m17453b(aVar);
    }

    public Bitmap getScreenshot() {
        return getBitmap();
    }

    public InterfaceC4173a.b getSurfaceHolder() {
        return new a(this, this.f18260b.f18264a, this.f18260b);
    }

    @Override // p119ed.InterfaceC4173a
    public View getView() {
        return this;
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        this.f18260b.m17458g();
        super.onDetachedFromWindow();
        this.f18260b.m17454c();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(C4175c.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(C4175c.class.getName());
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        this.f18259a.m17130a(i10, i11);
        setMeasuredDimension(this.f18259a.m17132c(), this.f18259a.m17131b());
    }

    @Override // p119ed.InterfaceC4173a
    public void setAspectRatio(int i10) {
        this.f18259a.m17133d(i10);
        requestLayout();
    }

    @Override // p119ed.InterfaceC4173a
    public void setVideoRotation(int i10) {
        this.f18259a.m17134e(i10);
        setRotation(i10);
    }

    @Override // p119ed.InterfaceC4173a
    public void setVideoSize(int i10, int i11) {
        if (i10 > 0 && i11 > 0) {
            this.f18259a.m17135f(i10, i11);
            requestLayout();
        }
    }
}
