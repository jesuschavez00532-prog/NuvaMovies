package ac;

import android.text.TextUtils;
import com.request.result.BindEmailGiftDaysResult;
import com.request.result.FreeProduct;
import java.util.Iterator;
import ne.AbstractC5868k;
import p030bc.C1224f;
import p301qb.InterfaceC6395j;
import p317rb.AbstractC6567a;
import p317rb.AbstractC6570d;
import p343tb.AbstractC6929a;
import p371vb.C7252a;

/* renamed from: ac.l */
/* loaded from: classes2.dex */
public final class C0174l extends AbstractC0166j {

    /* renamed from: b */
    private final String f497b;

    /* renamed from: ac.l$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC6929a {
        a() {
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onNext(BindEmailGiftDaysResult bindEmailGiftDaysResult) {
            AbstractC5868k.m23674f(bindEmailGiftDaysResult, "t");
            super.onNext(bindEmailGiftDaysResult);
            String productCode = bindEmailGiftDaysResult.getData().getProductCode();
            if (!TextUtils.isEmpty(productCode) && bindEmailGiftDaysResult.getData().getFreeProductList().size() > 0) {
                Iterator<FreeProduct> it = bindEmailGiftDaysResult.getData().getFreeProductList().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    FreeProduct next = it.next();
                    if (AbstractC5868k.m23669a(productCode, next.getProductCode())) {
                        C7252a.f27087a.m28080o(next.getPreAuthDays());
                        break;
                    }
                }
            }
            ((InterfaceC6395j) C0174l.this.m618a()).mo25210C2(bindEmailGiftDaysResult.getData());
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        public void onError(Throwable th) {
            AbstractC5868k.m23674f(th, "e");
            super.onError(th);
            ((InterfaceC6395j) C0174l.this.m618a()).mo25211q1(AbstractC6570d.m25644a(th, "EA7", "500", "500"));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0174l(InterfaceC6395j interfaceC6395j) {
        super(interfaceC6395j);
        AbstractC5868k.m23674f(interfaceC6395j, "view");
        this.f497b = C0174l.class.getSimpleName();
    }

    /* renamed from: b */
    public final void m641b() {
        AbstractC6567a.m25631a(C1224f.f4816e.m5631a().m5593i(), ((InterfaceC6395j) m618a()).mo523N3()).subscribe(new a());
    }
}
