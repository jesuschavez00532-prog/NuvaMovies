package p203k4;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.Set;
import p037c5.AbstractC1362d;
import p037c5.InterfaceC1363e;
import p096d5.AbstractBinderC3944d;
import p096d5.C3952l;
import p172i4.C4854b;
import p187j4.AbstractC4991e;
import p187j4.C4987a;
import p219l4.AbstractC5391n;
import p219l4.C5361d;
import p219l4.C5377i0;

/* renamed from: k4.v */
/* loaded from: classes.dex */
public final class BinderC5125v extends AbstractBinderC3944d implements AbstractC4991e.a, AbstractC4991e.b {

    /* renamed from: h */
    private static final C4987a.a f21050h = AbstractC1362d.f5102c;

    /* renamed from: a */
    private final Context f21051a;

    /* renamed from: b */
    private final Handler f21052b;

    /* renamed from: c */
    private final C4987a.a f21053c;

    /* renamed from: d */
    private final Set f21054d;

    /* renamed from: e */
    private final C5361d f21055e;

    /* renamed from: f */
    private InterfaceC1363e f21056f;

    /* renamed from: g */
    private InterfaceC5124u f21057g;

    public BinderC5125v(Context context, Handler handler, C5361d c5361d) {
        C4987a.a aVar = f21050h;
        this.f21051a = context;
        this.f21052b = handler;
        this.f21055e = (C5361d) AbstractC5391n.m21784j(c5361d, "ClientSettings must not be null");
        this.f21054d = c5361d.m21703e();
        this.f21053c = aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O */
    public static /* bridge */ /* synthetic */ void m20757O(BinderC5125v binderC5125v, C3952l c3952l) {
        C4854b m16779g = c3952l.m16779g();
        if (m16779g.m20021n()) {
            C5377i0 c5377i0 = (C5377i0) AbstractC5391n.m21783i(c3952l.m16780i());
            C4854b m21748g = c5377i0.m21748g();
            if (!m21748g.m20021n()) {
                String valueOf = String.valueOf(m21748g);
                Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(valueOf), new Exception());
                binderC5125v.f21057g.mo8035b(m21748g);
                binderC5125v.f21056f.m20353f();
                return;
            }
            binderC5125v.f21057g.mo8036c(c5377i0.m21749i(), binderC5125v.f21054d);
        } else {
            binderC5125v.f21057g.mo8035b(m16779g);
        }
        binderC5125v.f21056f.m20353f();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [c5.e, j4.a$f] */
    /* renamed from: P */
    public final void m20758P(InterfaceC5124u interfaceC5124u) {
        InterfaceC1363e interfaceC1363e = this.f21056f;
        if (interfaceC1363e != null) {
            interfaceC1363e.m20353f();
        }
        this.f21055e.m21707i(Integer.valueOf(System.identityHashCode(this)));
        C4987a.a aVar = this.f21053c;
        Context context = this.f21051a;
        Looper looper = this.f21052b.getLooper();
        C5361d c5361d = this.f21055e;
        this.f21056f = aVar.mo6138a(context, looper, c5361d, c5361d.m21704f(), this, this);
        this.f21057g = interfaceC5124u;
        Set set = this.f21054d;
        if (set != null && !set.isEmpty()) {
            this.f21056f.mo6140n();
        } else {
            this.f21052b.post(new RunnableC5122s(this));
        }
    }

    /* renamed from: Q */
    public final void m20759Q() {
        InterfaceC1363e interfaceC1363e = this.f21056f;
        if (interfaceC1363e != null) {
            interfaceC1363e.m20353f();
        }
    }

    @Override // p203k4.InterfaceC5111h
    /* renamed from: a */
    public final void mo8019a(C4854b c4854b) {
        this.f21057g.mo8035b(c4854b);
    }

    @Override // p203k4.InterfaceC5106c
    /* renamed from: c */
    public final void mo8021c(int i10) {
        this.f21056f.m20353f();
    }

    @Override // p203k4.InterfaceC5106c
    /* renamed from: d */
    public final void mo8022d(Bundle bundle) {
        this.f21056f.mo6139m(this);
    }

    @Override // p096d5.InterfaceC3946f
    /* renamed from: w */
    public final void mo16777w(C3952l c3952l) {
        this.f21052b.post(new RunnableC5123t(this, c3952l));
    }
}
