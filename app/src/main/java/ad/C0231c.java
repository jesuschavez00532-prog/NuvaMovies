package ad;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.umeng.analytics.pro.C3384f;
import java.util.Arrays;
import ne.AbstractC5868k;
import ne.C5881x;
import p119ed.C4174b;
import p119ed.C4175c;
import p119ed.InterfaceC4173a;
import p418yc.C7705h;

/* renamed from: ad.c */
/* loaded from: classes3.dex */
public final class C0231c implements InterfaceC0229a {

    /* renamed from: b */
    private int f621b;

    /* renamed from: c */
    private ViewGroup f622c;

    /* renamed from: d */
    private InterfaceC4173a.b f623d;

    /* renamed from: e */
    private InterfaceC4173a f624e;

    /* renamed from: f */
    private int f625f;

    /* renamed from: a */
    private final String f620a = C0231c.class.getSimpleName();

    /* renamed from: g */
    private int f626g = 3;

    /* renamed from: h */
    private String f627h = "";

    /* renamed from: i */
    private final InterfaceC4173a.a f628i = new a();

    /* renamed from: ad.c$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC4173a.a {

        /* renamed from: a */
        private boolean f629a;

        a() {
        }

        @Override // p119ed.InterfaceC4173a.a
        /* renamed from: a */
        public void mo815a(InterfaceC4173a.b bVar) {
            AbstractC5868k.m23674f(bVar, "holder");
            this.f629a = true;
            if (AbstractC5868k.m23669a(bVar.getRenderView(), C0231c.this.f624e)) {
                C0231c.this.f623d = null;
                C7705h.f28256m.m29771a().m29755G(C0231c.this.f621b, null, C0231c.this.m813j());
            }
        }

        @Override // p119ed.InterfaceC4173a.a
        /* renamed from: b */
        public void mo816b(int i10, int i11) {
        }

        @Override // p119ed.InterfaceC4173a.a
        /* renamed from: c */
        public void mo817c(InterfaceC4173a.b bVar, int i10, int i11, int i12) {
            AbstractC5868k.m23674f(bVar, "holder");
            AbstractC5868k.m23669a(bVar.getRenderView(), C0231c.this.f624e);
        }

        @Override // p119ed.InterfaceC4173a.a
        /* renamed from: d */
        public void mo818d(InterfaceC4173a.b bVar, int i10, int i11) {
            AbstractC5868k.m23674f(bVar, "holder");
            if (AbstractC5868k.m23669a(bVar.getRenderView(), C0231c.this.f624e)) {
                C0231c.this.f623d = bVar;
                C0231c.this.m814l(String.valueOf(SystemClock.elapsedRealtime()));
                C7705h.f28256m.m29771a().m29755G(C0231c.this.f621b, bVar.openSurface(), C0231c.this.m813j());
            }
        }
    }

    /* renamed from: k */
    private final void m812k(InterfaceC4173a interfaceC4173a) {
        if (this.f624e != null) {
            C7705h.f28256m.m29771a().m29755G(this.f621b, null, this.f627h);
            InterfaceC4173a interfaceC4173a2 = this.f624e;
            AbstractC5868k.m23671c(interfaceC4173a2);
            View view = interfaceC4173a2.getView();
            AbstractC5868k.m23673e(view, "mRenderView!!.view");
            InterfaceC4173a interfaceC4173a3 = this.f624e;
            AbstractC5868k.m23671c(interfaceC4173a3);
            interfaceC4173a3.mo17445a(this.f628i);
            this.f624e = null;
            ViewGroup viewGroup = this.f622c;
            if (viewGroup != null) {
                viewGroup.removeView(view);
            }
        }
        if (interfaceC4173a == null) {
            return;
        }
        this.f624e = interfaceC4173a;
        interfaceC4173a.setAspectRatio(this.f626g);
        InterfaceC4173a interfaceC4173a4 = this.f624e;
        AbstractC5868k.m23671c(interfaceC4173a4);
        View view2 = interfaceC4173a4.getView();
        AbstractC5868k.m23673e(view2, "mRenderView!!.getView()");
        if (this.f621b == 1 && (view2 instanceof SurfaceView)) {
            ((SurfaceView) view2).setZOrderMediaOverlay(true);
        }
        view2.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        ViewGroup viewGroup2 = this.f622c;
        if (viewGroup2 != null) {
            viewGroup2.addView(view2);
        }
        InterfaceC4173a interfaceC4173a5 = this.f624e;
        AbstractC5868k.m23671c(interfaceC4173a5);
        interfaceC4173a5.mo17446b(this.f628i);
        InterfaceC4173a interfaceC4173a6 = this.f624e;
        AbstractC5868k.m23671c(interfaceC4173a6);
        interfaceC4173a6.setVideoRotation(this.f625f);
    }

    @Override // ad.InterfaceC0229a
    /* renamed from: a */
    public void mo798a(Context context, int i10) {
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    String str = this.f620a;
                    C5881x c5881x = C5881x.f23415a;
                    String format = String.format("invalid render %d\n", Arrays.copyOf(new Object[]{Integer.valueOf(i10)}, 1));
                    AbstractC5868k.m23673e(format, "format(format, *args)");
                    Log.w(str, format);
                    return;
                }
                m812k(new C4175c(context));
                return;
            }
            m812k(new C4174b(context));
            return;
        }
        m812k(null);
    }

    @Override // ad.InterfaceC0229a
    /* renamed from: b */
    public void mo799b() {
        this.f622c = null;
    }

    @Override // ad.InterfaceC0229a
    /* renamed from: c */
    public void mo800c(ViewGroup viewGroup) {
        AbstractC5868k.m23674f(viewGroup, "videoView");
        this.f622c = viewGroup;
    }

    @Override // ad.InterfaceC0229a
    /* renamed from: d */
    public void mo801d(int i10, String str, Context context, Integer num) {
        int i11;
        AbstractC5868k.m23674f(str, "value");
        C7705h m29771a = C7705h.f28256m.m29771a();
        if (num != null) {
            i11 = num.intValue();
        } else {
            i11 = 0;
        }
        m29771a.m29754F(i10, "player", str, context, i11);
    }

    @Override // ad.InterfaceC0229a
    /* renamed from: e */
    public void mo802e(int i10, int i11) {
        View view;
        InterfaceC4173a interfaceC4173a = this.f624e;
        if (interfaceC4173a != null) {
            interfaceC4173a.setVideoSize(i10, i11);
        }
        InterfaceC4173a interfaceC4173a2 = this.f624e;
        if (interfaceC4173a2 != null && (view = interfaceC4173a2.getView()) != null) {
            view.requestLayout();
        }
    }

    @Override // ad.InterfaceC0229a
    /* renamed from: f */
    public void mo803f(int i10) {
        this.f621b = i10;
    }

    @Override // ad.InterfaceC0229a
    public View getRenderView() {
        InterfaceC4173a interfaceC4173a = this.f624e;
        if (interfaceC4173a != null) {
            return interfaceC4173a.getView();
        }
        return null;
    }

    /* renamed from: j */
    public final String m813j() {
        return this.f627h;
    }

    /* renamed from: l */
    public final void m814l(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.f627h = str;
    }

    @Override // ad.InterfaceC0229a
    public void setAspectRatio(int i10) {
        this.f626g = i10;
        InterfaceC4173a interfaceC4173a = this.f624e;
        if (interfaceC4173a != null) {
            AbstractC5868k.m23671c(interfaceC4173a);
            interfaceC4173a.setAspectRatio(this.f626g);
        }
    }
}
