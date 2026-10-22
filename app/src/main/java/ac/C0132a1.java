package ac;

import android.content.Context;
import android.text.TextUtils;
import cc.C1446c0;
import cc.C1466m0;
import com.request.result.SnTokenResult;
import com.umeng.analytics.pro.C3384f;
import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;
import java.util.Locale;
import ne.AbstractC5868k;
import p030bc.C1224f;
import p153h2.AbstractC4509b;
import p185j2.C4982a;
import p201k2.AbstractC5092i;
import p301qb.InterfaceC6403l1;
import p317rb.AbstractC6567a;
import p317rb.AbstractC6570d;
import p343tb.AbstractC6929a;
import p356ub.AbstractC7073a;

/* renamed from: ac.a1 */
/* loaded from: classes2.dex */
public final class C0132a1 extends AbstractC0166j {

    /* renamed from: b */
    private final String f395b;

    /* renamed from: ac.a1$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC6929a {

        /* renamed from: c */
        final /* synthetic */ Context f397c;

        a(Context context) {
            this.f397c = context;
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onNext(SnTokenResult snTokenResult) {
            boolean z10;
            String lowerCase;
            AbstractC5868k.m23674f(snTokenResult, "t");
            super.onNext(snTokenResult);
            String str = "";
            if ("1".equals(snTokenResult.getData().isNew())) {
                C1466m0 c1466m0 = C1466m0.f5627a;
                String sn = snTokenResult.getData().getSn();
                boolean z11 = true;
                if (sn != null && sn.length() != 0) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (!z10) {
                    lowerCase = snTokenResult.getData().getSn();
                    if (lowerCase == null) {
                        lowerCase = "";
                    }
                } else {
                    String m20666a = AbstractC5092i.m20666a(snTokenResult.getData().getSnToken() + "ntFT65w6itH!lHCPw7D=@qnsFC5adD28");
                    AbstractC5868k.m23673e(m20666a, "MD5(t.data.snToken + \"nt…tH!lHCPw7D=@qnsFC5adD28\")");
                    Locale locale = Locale.ROOT;
                    AbstractC5868k.m23673e(locale, "ROOT");
                    lowerCase = m20666a.toLowerCase(locale);
                    AbstractC5868k.m23673e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                }
                c1466m0.m6865f0(lowerCase);
                if (c1466m0.m6885t().length() != 0) {
                    z11 = false;
                }
                if (z11) {
                    ((InterfaceC6403l1) C0132a1.this.m618a()).mo25218Q5("");
                    return;
                }
                String userId = snTokenResult.getData().getUserId();
                if (userId != null) {
                    str = userId;
                }
                c1466m0.m6848U(str);
                C1446c0.f5559a.m6739K(this.f397c);
            } else {
                if (TextUtils.isEmpty(snTokenResult.getData().getSnToken())) {
                    ((InterfaceC6403l1) C0132a1.this.m618a()).mo25218Q5("");
                    return;
                }
                C1466m0 c1466m02 = C1466m0.f5627a;
                String snToken = snTokenResult.getData().getSnToken();
                AbstractC5868k.m23671c(snToken);
                c1466m02.m6863e0(snToken);
                String m20666a2 = AbstractC5092i.m20666a(snTokenResult.getData().getSnToken() + "ntFT65w6itH!lHCPw7D=@qnsFC5adD28");
                AbstractC5868k.m23673e(m20666a2, "MD5(t.data.snToken + \"nt…tH!lHCPw7D=@qnsFC5adD28\")");
                String lowerCase2 = m20666a2.toLowerCase();
                AbstractC5868k.m23673e(lowerCase2, "this as java.lang.String).toLowerCase()");
                c1466m02.m6865f0(lowerCase2);
            }
            C1466m0 c1466m03 = C1466m0.f5627a;
            AbstractC4509b.m18869b("PortalModel", String.valueOf(c1466m03.m6885t()), new Object[0]);
            C4982a c4982a = C4982a.f20721a;
            Context context = this.f397c;
            String str2 = AbstractC7073a.f26508c;
            AbstractC5868k.m23673e(str2, "KEY_SP_SN");
            c4982a.m20335c(context, str2, c1466m03.m6885t());
            ((InterfaceC6403l1) C0132a1.this.m618a()).mo25219Z3(snTokenResult);
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        public void onError(Throwable th) {
            AbstractC5868k.m23674f(th, "e");
            super.onError(th);
            ((InterfaceC6403l1) C0132a1.this.m618a()).mo25218Q5(AbstractC6570d.m25644a(th, "EA7", "EA9", "500"));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0132a1(InterfaceC6403l1 interfaceC6403l1) {
        super(interfaceC6403l1);
        AbstractC5868k.m23674f(interfaceC6403l1, "view");
        this.f395b = C0132a1.class.getSimpleName();
    }

    /* renamed from: b */
    public final void m527b(Context context) {
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        Observable subscribeOn = C1224f.f4816e.m5631a().m5590g0(context).subscribeOn(Schedulers.m20294io());
        AbstractC5868k.m23673e(subscribeOn, "PortalHelper.get().getSn…scribeOn(Schedulers.io())");
        AbstractC6567a.m25631a(subscribeOn, ((InterfaceC6403l1) m618a()).mo523N3()).subscribe(new a(context));
    }
}
