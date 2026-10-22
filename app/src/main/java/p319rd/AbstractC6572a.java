package p319rd;

import af.InterfaceC0238d;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.fragment.app.AbstractC0729o;
import com.module.bean.AudioInfoBean;
import com.module.bean.DefinitionBean;
import com.umeng.analytics.pro.C3384f;
import com.vod.view.NotificationBar;
import com.vod.view.PosterView;
import com.vod.view.VodDetailBottomScrollView;
import com.vod.view.VodDetailLeftPanel;
import com.vod.view.VodDetailMenuPanel;
import com.vod.view.VodPlayerWindow;
import java.util.List;
import me.InterfaceC5642a;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import p212kd.InterfaceC5160c1;
import p217l2.InterfaceC5345f;
import p217l2.InterfaceC5347h;
import p217l2.InterfaceC5348i;
import p217l2.InterfaceC5349j;
import p313r7.C6559e;
import td.C6940h;

/* renamed from: rd.a */
/* loaded from: classes3.dex */
public abstract class AbstractC6572a {

    /* renamed from: rd.a$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC5345f {
        a() {
        }

        @Override // p217l2.InterfaceC5345f
        /* renamed from: a */
        public View mo21628a(Context context, AttributeSet attributeSet) {
            AbstractC5868k.m23674f(context, C3384f.f14563X);
            AbstractC5868k.m23674f(attributeSet, "attrs");
            return new VodDetailBottomScrollView(context, attributeSet, 0, 4, null);
        }

        @Override // p217l2.InterfaceC5345f
        /* renamed from: b */
        public View mo21629b(Context context, AttributeSet attributeSet) {
            AbstractC5868k.m23674f(context, C3384f.f14563X);
            AbstractC5868k.m23674f(attributeSet, "attrs");
            return new PosterView(context, attributeSet);
        }

        @Override // p217l2.InterfaceC5345f
        /* renamed from: c */
        public View mo21630c(Context context, AttributeSet attributeSet) {
            AbstractC5868k.m23674f(context, C3384f.f14563X);
            AbstractC5868k.m23674f(attributeSet, "attrs");
            return new VodDetailLeftPanel(context, attributeSet, 0, 4, null);
        }

        @Override // p217l2.InterfaceC5345f
        /* renamed from: d */
        public View mo21631d(Context context, AttributeSet attributeSet) {
            AbstractC5868k.m23674f(context, C3384f.f14563X);
            AbstractC5868k.m23674f(attributeSet, "attrs");
            return new NotificationBar(context, attributeSet);
        }

        @Override // p217l2.InterfaceC5345f
        /* renamed from: e */
        public View mo21632e(Context context, AttributeSet attributeSet) {
            AbstractC5868k.m23674f(context, C3384f.f14563X);
            AbstractC5868k.m23674f(attributeSet, "attrs");
            return new VodPlayerWindow(context, attributeSet);
        }

        @Override // p217l2.InterfaceC5345f
        /* renamed from: f */
        public View mo21633f(Context context, AttributeSet attributeSet) {
            AbstractC5868k.m23674f(context, C3384f.f14563X);
            AbstractC5868k.m23674f(attributeSet, "attrs");
            return new VodDetailMenuPanel(context, attributeSet, 0, 4, null);
        }
    }

    /* renamed from: rd.a$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC5347h {
        b() {
        }
    }

    /* renamed from: rd.a$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC5348i {
        c() {
        }

        @Override // p217l2.InterfaceC5348i
        /* renamed from: a */
        public InterfaceC0238d mo21634a() {
            return new C6559e();
        }
    }

    /* renamed from: rd.a$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC5349j {

        /* renamed from: rd.a$d$a */
        /* loaded from: classes3.dex */
        public static final class a implements InterfaceC5160c1 {

            /* renamed from: a */
            final /* synthetic */ InterfaceC5660l f25186a;

            /* renamed from: b */
            final /* synthetic */ InterfaceC5642a f25187b;

            /* renamed from: c */
            final /* synthetic */ InterfaceC5642a f25188c;

            /* renamed from: d */
            final /* synthetic */ InterfaceC5642a f25189d;

            /* renamed from: e */
            final /* synthetic */ InterfaceC5642a f25190e;

            a(InterfaceC5660l interfaceC5660l, InterfaceC5642a interfaceC5642a, InterfaceC5642a interfaceC5642a2, InterfaceC5642a interfaceC5642a3, InterfaceC5642a interfaceC5642a4) {
                this.f25186a = interfaceC5660l;
                this.f25187b = interfaceC5642a;
                this.f25188c = interfaceC5642a2;
                this.f25189d = interfaceC5642a3;
                this.f25190e = interfaceC5642a4;
            }

            @Override // p212kd.InterfaceC5160c1
            /* renamed from: a */
            public void mo20844a(int i10, String str) {
                AbstractC5868k.m23674f(str, "language");
                this.f25187b.invoke();
            }

            @Override // p212kd.InterfaceC5160c1
            /* renamed from: b */
            public void mo20845b(boolean z10) {
                this.f25190e.invoke();
            }

            @Override // p212kd.InterfaceC5160c1
            /* renamed from: c */
            public void mo20846c(int i10, AudioInfoBean audioInfoBean) {
                this.f25186a.mo542f(audioInfoBean);
            }

            @Override // p212kd.InterfaceC5160c1
            /* renamed from: d */
            public void mo20847d(int i10) {
                this.f25189d.invoke();
            }

            @Override // p212kd.InterfaceC5160c1
            /* renamed from: e */
            public void mo20848e(int i10) {
                this.f25188c.invoke();
            }
        }

        d() {
        }

        @Override // p217l2.InterfaceC5349j
        /* renamed from: a */
        public void mo21635a(AbstractC0729o abstractC0729o, String str, Object obj, List list, InterfaceC5660l interfaceC5660l, InterfaceC5642a interfaceC5642a, InterfaceC5642a interfaceC5642a2, InterfaceC5642a interfaceC5642a3, InterfaceC5642a interfaceC5642a4) {
            AbstractC5868k.m23674f(abstractC0729o, "fragmentManager");
            AbstractC5868k.m23674f(str, "contentId");
            AbstractC5868k.m23674f(interfaceC5660l, "onClickAudio");
            AbstractC5868k.m23674f(interfaceC5642a, "onClickSubtitle");
            AbstractC5868k.m23674f(interfaceC5642a2, "onClickSize");
            AbstractC5868k.m23674f(interfaceC5642a3, "onClickColor");
            AbstractC5868k.m23674f(interfaceC5642a4, "onClickSwitch");
            C6940h c6940h = new C6940h();
            c6940h.m26963Z9(obj instanceof DefinitionBean ? (DefinitionBean) obj : null);
            c6940h.m26966ca(list != null ? list : null);
            c6940h.m26964aa(str);
            c6940h.m26962Y9(str);
            c6940h.mo3277E9(abstractC0729o, "SelectSubTitleAndAudioDialog");
            c6940h.m26965ba(new a(interfaceC5660l, interfaceC5642a, interfaceC5642a2, interfaceC5642a3, interfaceC5642a4));
        }
    }

    /* renamed from: a */
    public static final InterfaceC5345f m25652a() {
        return new a();
    }

    /* renamed from: b */
    public static final InterfaceC5347h m25653b() {
        return new b();
    }

    /* renamed from: c */
    public static final InterfaceC5348i m25654c() {
        return new c();
    }

    /* renamed from: d */
    public static final InterfaceC5349j m25655d() {
        return new d();
    }
}
