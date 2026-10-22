package ac;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import cc.AbstractC1468n0;
import cc.C1464l0;
import cc.C1466m0;
import com.taobao.accs.common.Constants;
import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;
import ne.AbstractC5868k;
import nf.C5884b;
import p023b3.C1048e;
import p170i2.C4842a;
import p185j2.C4982a;
import p201k2.C5090g;
import p287pb.AbstractApplicationC6253c;
import p301qb.InterfaceC6416q;
import p317rb.AbstractC6567a;
import p317rb.AbstractC6570d;
import p343tb.AbstractC6929a;
import p363v2.C7197a;
import p371vb.C7252a;
import p421z0.C7734h;
import retrofit2.HttpException;

/* renamed from: ac.t */
/* loaded from: classes2.dex */
public final class C0206t extends AbstractC0166j {

    /* renamed from: b */
    private final String f567b;

    /* renamed from: ac.t$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC6929a {

        /* renamed from: c */
        final /* synthetic */ String f569c;

        /* renamed from: d */
        final /* synthetic */ int f570d;

        a(String str, int i10) {
            this.f569c = str;
            this.f570d = i10;
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onNext(String str) {
            boolean z10;
            AbstractC5868k.m23674f(str, "t");
            super.onNext(str);
            C7252a c7252a = C7252a.f27087a;
            C7197a c7197a = C7197a.f26917a;
            c7252a.m28077l(String.valueOf(c7197a.m27855l()));
            C0206t.this.m731c();
            C7734h.f28449q.m29905a().m29892i(c7197a.m27855l());
            C4982a.f20721a.m20335c(AbstractApplicationC6253c.f24484b.m24887a(), "dcs_realtime", Long.valueOf(SystemClock.elapsedRealtime()));
            if (str.length() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                String m23717b = C5884b.m23717b(str);
                if (TextUtils.isEmpty(m23717b)) {
                    m23717b = "unknown";
                }
                InterfaceC6416q interfaceC6416q = (InterfaceC6416q) C0206t.this.m618a();
                String str2 = this.f569c;
                AbstractC5868k.m23673e(m23717b, Constants.KEY_HTTP_CODE);
                interfaceC6416q.mo597n5(str2, m23717b, str, this.f570d);
                return;
            }
            ((InterfaceC6416q) C0206t.this.m618a()).mo598y4("");
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        public void onError(Throwable th) {
            AbstractC5868k.m23674f(th, "e");
            super.onError(th);
            C7734h.f28449q.m29905a().m29892i(C7197a.f26917a.m27855l());
            C4982a.f20721a.m20335c(AbstractApplicationC6253c.f24484b.m24887a(), "dcs_realtime", Long.valueOf(SystemClock.elapsedRealtime()));
            String m25644a = AbstractC6570d.m25644a(th, "EA7", "EA9", "500");
            if (((HttpException) th).m25696a() == 401) {
                m25644a = "DCS0001";
            }
            ((InterfaceC6416q) C0206t.this.m618a()).mo598y4(m25644a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0206t(InterfaceC6416q interfaceC6416q) {
        super(interfaceC6416q);
        AbstractC5868k.m23674f(interfaceC6416q, "view");
        this.f567b = C0206t.class.getSimpleName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public final void m731c() {
        long currentTimeMillis = System.currentTimeMillis() + (AbstractC6567a.m25639i(C1464l0.f5622a.m6823b()) * (-1));
        C7252a c7252a = C7252a.f27087a;
        c7252a.m28081p(Math.abs(AbstractC6567a.m25640j(c7252a.m28067b()) - currentTimeMillis));
    }

    /* renamed from: d */
    public final void m732d(String str, String str2, int i10) {
        AbstractC5868k.m23674f(str, "authVersion");
        AbstractC5868k.m23674f(str2, "authCode");
        C4982a c4982a = C4982a.f20721a;
        AbstractApplicationC6253c.a aVar = AbstractApplicationC6253c.f24484b;
        Context m24887a = aVar.m24887a();
        C5090g c5090g = C5090g.f20948a;
        String str3 = (String) c4982a.m20333a(m24887a, c5090g.m20649n(), "");
        String str4 = (String) c4982a.m20333a(aVar.m24887a(), c5090g.m20650o(), "");
        String mo19960i = C4842a.f20329a.m19920a().mo19960i(aVar.m24887a());
        C1048e m4892a = C1048e.f4305d.m4892a();
        String m6885t = C1466m0.f5627a.m6885t();
        String str5 = Build.VERSION.RELEASE;
        String m6896d = AbstractC1468n0.m6896d();
        AbstractC5868k.m23673e(m6896d, "getLocalMac()");
        Observable subscribeOn = m4892a.m4888i(m6885t, str2, str, mo19960i, str5, m6896d, str3, str4).subscribeOn(Schedulers.m20294io());
        AbstractC5868k.m23673e(subscribeOn, "ApiService.get().n1(User…scribeOn(Schedulers.io())");
        AbstractC6567a.m25631a(subscribeOn, ((InterfaceC6416q) m618a()).mo523N3()).subscribe(new a(str, i10));
    }
}
