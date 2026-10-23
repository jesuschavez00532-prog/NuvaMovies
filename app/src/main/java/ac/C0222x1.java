package ac;

import com.request.result.ApkQueryCouponResult;
import io.reactivex.Observable;
import io.reactivex.functions.Predicate;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p030bc.C1224f;
import p301qb.InterfaceC6371b;
import p317rb.AbstractC6570d;
import p343tb.AbstractC6929a;

/* renamed from: ac.x1 */
/* loaded from: classes2.dex */
public final class C0222x1 extends AbstractC0166j {

    /* renamed from: b */
    private final String f601b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ac.x1$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final a f602a = new a();

        a() {
            super(1);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo542f(ApkQueryCouponResult apkQueryCouponResult) {
            boolean z10 = false;
            AbstractC5868k.m23674f(apkQueryCouponResult, "it");
            if (apkQueryCouponResult.getData() != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }
    }

    /* renamed from: ac.x1$b */
    /* loaded from: classes2.dex */
    public static final class b extends AbstractC6929a {

        /* renamed from: c */
        final /* synthetic */ String f604c;

        b(String str) {
            this.f604c = str;
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onNext(ApkQueryCouponResult apkQueryCouponResult) {
            AbstractC5868k.m23674f(apkQueryCouponResult, "apkQueryCouponResult");
            super.onNext(apkQueryCouponResult);
            ((InterfaceC6371b) C0222x1.this.m618a()).mo20389J5(apkQueryCouponResult);
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        public void onError(Throwable th) {
            AbstractC5868k.m23674f(th, "e");
            super.onError(th);
            ((InterfaceC6371b) C0222x1.this.m618a()).mo20392U2(AbstractC6570d.m25644a(th, "EA7", "EA9", "500"), this.f604c);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0222x1(InterfaceC6371b interfaceC6371b) {
        super(interfaceC6371b);
        AbstractC5868k.m23674f(interfaceC6371b, "view");
        this.f601b = C0222x1.class.getSimpleName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static final boolean m779d(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return ((Boolean) interfaceC5660l.mo542f(obj)).booleanValue();
    }

    /* renamed from: c */
    public final void m780c(String str, String str2, String str3, String str4) {
        AbstractC5868k.m23674f(str, "userId");
        AbstractC5868k.m23674f(str2, "userToken");
        Observable compose = C1224f.f4816e.m5631a().m5587f(str, str2, str3, str4).compose(((InterfaceC6371b) m618a()).mo523N3());
        final a aVar = a.f602a;
        compose.filter(new Predicate() { // from class: ac.w1
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                boolean m779d;
                m779d = C0222x1.m779d(InterfaceC5660l.this, obj);
                return m779d;
            }
        }).subscribe(new b(str4));
    }
}
