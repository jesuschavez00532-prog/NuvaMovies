package p119ed;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p104dd.C4093a;
import p119ed.InterfaceC4173a;

/* renamed from: ed.b */
/* loaded from: classes3.dex */
public class C4174b extends SurfaceView implements InterfaceC4173a {

    /* renamed from: a */
    private C4093a f18248a;

    /* renamed from: b */
    private b f18249b;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ed.b$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC4173a.b {

        /* renamed from: a */
        private C4174b f18250a;

        /* renamed from: b */
        private SurfaceHolder f18251b;

        public a(C4174b c4174b, SurfaceHolder surfaceHolder) {
            this.f18250a = c4174b;
            this.f18251b = surfaceHolder;
        }

        @Override // p119ed.InterfaceC4173a.b
        public InterfaceC4173a getRenderView() {
            return this.f18250a;
        }

        @Override // p119ed.InterfaceC4173a.b
        public Surface openSurface() {
            SurfaceHolder surfaceHolder = this.f18251b;
            if (surfaceHolder == null) {
                return null;
            }
            return surfaceHolder.getSurface();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ed.b$b */
    /* loaded from: classes3.dex */
    public static final class b implements SurfaceHolder.Callback {

        /* renamed from: a */
        private SurfaceHolder f18252a;

        /* renamed from: b */
        private boolean f18253b;

        /* renamed from: c */
        private int f18254c;

        /* renamed from: d */
        private int f18255d;

        /* renamed from: e */
        private int f18256e;

        /* renamed from: f */
        private WeakReference f18257f;

        /* renamed from: g */
        private Map f18258g = new ConcurrentHashMap();

        public b(C4174b c4174b) {
            this.f18257f = new WeakReference(c4174b);
        }

        /* renamed from: a */
        public void m17448a(InterfaceC4173a.a aVar) {
            a aVar2;
            this.f18258g.put(aVar, aVar);
            if (this.f18252a != null) {
                aVar2 = new a((C4174b) this.f18257f.get(), this.f18252a);
                aVar.mo818d(aVar2, this.f18255d, this.f18256e);
            } else {
                aVar2 = null;
            }
            if (this.f18253b) {
                if (aVar2 == null) {
                    aVar2 = new a((C4174b) this.f18257f.get(), this.f18252a);
                }
                aVar.mo817c(aVar2, this.f18254c, this.f18255d, this.f18256e);
            }
        }

        /* renamed from: b */
        public void m17449b(InterfaceC4173a.a aVar) {
            int i10;
            int i11;
            if (this.f18257f.get() != null) {
                i10 = ((C4174b) this.f18257f.get()).getView().getWidth();
                i11 = ((C4174b) this.f18257f.get()).getView().getHeight();
            } else {
                i10 = 0;
                i11 = 0;
            }
            aVar.mo816b(i10, i11);
        }

        /* renamed from: c */
        public void m17450c(InterfaceC4173a.a aVar) {
            this.f18258g.remove(aVar);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
            this.f18252a = surfaceHolder;
            this.f18253b = true;
            this.f18254c = i10;
            this.f18255d = i11;
            this.f18256e = i12;
            a aVar = new a((C4174b) this.f18257f.get(), this.f18252a);
            for (InterfaceC4173a.a aVar2 : this.f18258g.keySet()) {
                aVar2.mo817c(aVar, i10, i11, i12);
                m17449b(aVar2);
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            this.f18252a = surfaceHolder;
            this.f18253b = false;
            this.f18254c = 0;
            this.f18255d = 0;
            this.f18256e = 0;
            a aVar = new a((C4174b) this.f18257f.get(), this.f18252a);
            Iterator it = this.f18258g.keySet().iterator();
            while (it.hasNext()) {
                ((InterfaceC4173a.a) it.next()).mo818d(aVar, 0, 0);
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            this.f18252a = null;
            this.f18253b = false;
            this.f18254c = 0;
            this.f18255d = 0;
            this.f18256e = 0;
            a aVar = new a((C4174b) this.f18257f.get(), this.f18252a);
            Iterator it = this.f18258g.keySet().iterator();
            while (it.hasNext()) {
                ((InterfaceC4173a.a) it.next()).mo815a(aVar);
            }
        }
    }

    public C4174b(Context context) {
        super(context);
        m17447c(context);
    }

    /* renamed from: c */
    private void m17447c(Context context) {
        this.f18248a = new C4093a(this);
        this.f18249b = new b(this);
        getHolder().addCallback(this.f18249b);
        getHolder().setType(0);
    }

    @Override // p119ed.InterfaceC4173a
    /* renamed from: a */
    public void mo17445a(InterfaceC4173a.a aVar) {
        this.f18249b.m17450c(aVar);
    }

    @Override // p119ed.InterfaceC4173a
    /* renamed from: b */
    public void mo17446b(InterfaceC4173a.a aVar) {
        this.f18249b.m17448a(aVar);
    }

    public Bitmap getScreenshot() {
        return null;
    }

    @Override // p119ed.InterfaceC4173a
    public View getView() {
        return this;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(C4174b.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(C4174b.class.getName());
    }

    @Override // android.view.SurfaceView, android.view.View
    protected void onMeasure(int i10, int i11) {
        this.f18248a.m17130a(i10, i11);
        setMeasuredDimension(this.f18248a.m17132c(), this.f18248a.m17131b());
    }

    @Override // p119ed.InterfaceC4173a
    public void setAspectRatio(int i10) {
        this.f18248a.m17133d(i10);
        requestLayout();
    }

    @Override // p119ed.InterfaceC4173a
    public void setVideoRotation(int i10) {
        Log.e("", "SurfaceView doesn't support rotation (" + i10 + ")!\n");
    }

    @Override // p119ed.InterfaceC4173a
    public void setVideoSize(int i10, int i11) {
        if (i10 > 0 && i11 > 0) {
            this.f18248a.m17135f(i10, i11);
            getHolder().setFixedSize(i10, i11);
            requestLayout();
        }
    }
}
