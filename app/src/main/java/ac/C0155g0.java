package ac;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import cc.AbstractC1468n0;
import cc.C1462k0;
import cc.C1466m0;
import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;
import ne.AbstractC5868k;
import p023b3.C1048e;
import p135fd.C4307b;
import p170i2.C4842a;
import p185j2.C4982a;
import p201k2.C5090g;
import p201k2.C5096m;
import p287pb.AbstractApplicationC6253c;
import p301qb.InterfaceC6372b0;
import p301qb.InterfaceC6416q;
import p317rb.AbstractC6567a;
import p317rb.AbstractC6570d;
import p343tb.AbstractC6929a;
import p363v2.C7197a;
import p371vb.C7252a;
import p421z0.C7734h;
import retrofit2.HttpException;

/* renamed from: ac.g0 */
/* loaded from: classes2.dex */
public final class C0155g0 extends AbstractC0166j {

    /* renamed from: b */
    private final String f448b;

    /* renamed from: c */
    private final a f449c;

    /* renamed from: ac.g0$a */
    /* loaded from: classes2.dex */
    public static final class a implements InterfaceC6416q {

        /* renamed from: a */
        final /* synthetic */ InterfaceC6372b0 f450a;

        /* renamed from: b */
        final /* synthetic */ C0155g0 f451b;

        a(InterfaceC6372b0 interfaceC6372b0, C0155g0 c0155g0) {
            this.f450a = interfaceC6372b0;
            this.f451b = c0155g0;
        }

        @Override // p301qb.InterfaceC6433v1
        /* renamed from: N3 */
        public C4307b mo523N3() {
            return this.f450a.mo523N3();
        }

        @Override // p301qb.InterfaceC6416q
        /* renamed from: n5 */
        public void mo597n5(String str, String str2, String str3, int i10) {
            AbstractC5868k.m23674f(str, "authVersion");
            AbstractC5868k.m23674f(str2, "authCode");
            C0155g0 c0155g0 = this.f451b;
            if (str3 == null) {
                str3 = "";
            }
            c0155g0.m595d(str2, str, str3, 0);
        }

        @Override // p301qb.InterfaceC6416q
        /* renamed from: y4 */
        public void mo598y4(String str) {
            AbstractC5868k.m23674f(str, "errCode");
            this.f450a.mo25201j2(str, "n1");
        }
    }

    /* renamed from: ac.g0$b */
    /* loaded from: classes2.dex */
    public static final class b extends AbstractC6929a {
        b() {
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onNext(String str) {
            AbstractC5868k.m23674f(str, "t");
            C7252a c7252a = C7252a.f27087a;
            C7197a c7197a = C7197a.f26917a;
            c7252a.m28076k(c7197a.m27847d());
            C4982a c4982a = C4982a.f20721a;
            AbstractApplicationC6253c.a aVar = AbstractApplicationC6253c.f24484b;
            c4982a.m20335c(aVar.m24887a(), "key_dcs_mark", c7197a.m27847d());
            c7252a.m28077l(String.valueOf(c7197a.m27855l()));
            C7734h.f28449q.m29905a().m29892i(c7197a.m27855l());
            c4982a.m20335c(aVar.m24887a(), "dcs_realtime", Long.valueOf(SystemClock.elapsedRealtime()));
            ((InterfaceC6372b0) C0155g0.this.m618a()).mo25200g1();
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        public void onError(Throwable th) {
            AbstractC5868k.m23674f(th, "e");
            super.onError(th);
            C7734h.f28449q.m29905a().m29892i(C7197a.f26917a.m27855l());
            C4982a.f20721a.m20335c(AbstractApplicationC6253c.f24484b.m24887a(), "dcs_realtime", Long.valueOf(SystemClock.elapsedRealtime()));
            try {
                String m25644a = AbstractC6570d.m25644a(th, "EA7", "EA9", "500");
                if (((HttpException) th).m25696a() == 401) {
                    m25644a = "DCS0001";
                }
                ((InterfaceC6372b0) C0155g0.this.m618a()).mo25201j2(m25644a, "v1");
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0155g0(InterfaceC6372b0 interfaceC6372b0) {
        super(interfaceC6372b0);
        AbstractC5868k.m23674f(interfaceC6372b0, "view");
        this.f448b = C0155g0.class.getSimpleName();
        this.f449c = new a(interfaceC6372b0, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public final void m595d(String str, String str2, String str3, int i10) {
        C4982a c4982a = C4982a.f20721a;
        AbstractApplicationC6253c.a aVar = AbstractApplicationC6253c.f24484b;
        Context m24887a = aVar.m24887a();
        C5090g c5090g = C5090g.f20948a;
        String str4 = (String) c4982a.m20333a(m24887a, c5090g.m20649n(), "");
        String str5 = (String) c4982a.m20333a(aVar.m24887a(), c5090g.m20650o(), "");
        C1048e m4892a = C1048e.f4305d.m4892a();
        String m6885t = C1466m0.f5627a.m6885t();
        String mo19960i = C4842a.f20329a.m19920a().mo19960i(aVar.m24887a());
        String str6 = Build.VERSION.RELEASE;
        AbstractC5868k.m23673e(str6, "RELEASE");
        String m6896d = AbstractC1468n0.m6896d();
        AbstractC5868k.m23673e(m6896d, "getLocalMac()");
        Observable subscribeOn = m4892a.m4889l(m6885t, str, str2, str3, null, mo19960i, str6, m6896d, i10, str4, str5).subscribeOn(Schedulers.m20294io());
        AbstractC5868k.m23673e(subscribeOn, "ApiService.get().v1(User…scribeOn(Schedulers.io())");
        AbstractC6567a.m25631a(subscribeOn, ((InterfaceC6372b0) m618a()).mo523N3()).subscribe(new b());
    }

    /* renamed from: c */
    public final void m596c(int i10) {
        String str = null;
        String str2 = null;
        C0206t c0206t = new C0206t(this.f449c);
        if (!C5096m.f20979a.m20691b()) {
            str = "";
            str2 = str;
        } else {
            Pair m6818d = C1462k0.f5614a.m6818d();
            Object obj = m6818d.first;
            AbstractC5868k.m23673e(obj, "authInfo.first");
            str2 = (String) obj;
            Object obj2 = m6818d.second;
            AbstractC5868k.m23673e(obj2, "authInfo.second");
            str = (String) obj2;
        }
        C7197a c7197a = C7197a.f26917a;
        if (TextUtils.isEmpty(c7197a.m27847d())) {
            c7197a.m27841A((String) C4982a.f20721a.m20333a(AbstractApplicationC6253c.f24484b.m24887a(), "key_dcs_mark", ""));
        }
        if (C1462k0.f5614a.m6819f()) {
            c0206t.m732d(str2, str, i10);
        } else {
            m595d(str, str2, "", 1);
        }
    }
}
