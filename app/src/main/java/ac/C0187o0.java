package ac;

import android.text.TextUtils;
import com.request.result.GetInviteCodeData;
import com.request.result.GetInviteCodeResult;
import ne.AbstractC5868k;
import p030bc.C1224f;
import p301qb.InterfaceC6390h0;
import p317rb.AbstractC6567a;
import p317rb.AbstractC6570d;
import p343tb.AbstractC6929a;

/* renamed from: ac.o0 */
/* loaded from: classes2.dex */
public final class C0187o0 extends AbstractC0166j {

    /* renamed from: b */
    private final String f525b;

    /* renamed from: ac.o0$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC6929a {
        a() {
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onNext(GetInviteCodeResult getInviteCodeResult) {
            String str = null;
            AbstractC5868k.m23674f(getInviteCodeResult, "t");
            super.onNext(getInviteCodeResult);
            GetInviteCodeData data = getInviteCodeResult.getData();
            if (data != null) {
                str = data.getInviteCode();
            } else {
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                ((InterfaceC6390h0) C0187o0.this.m618a()).mo20208p3("");
                return;
            }
            InterfaceC6390h0 interfaceC6390h0 = (InterfaceC6390h0) C0187o0.this.m618a();
            GetInviteCodeData data2 = getInviteCodeResult.getData();
            AbstractC5868k.m23671c(data2);
            String inviteCode = data2.getInviteCode();
            AbstractC5868k.m23671c(inviteCode);
            interfaceC6390h0.mo20209r2(inviteCode);
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        public void onError(Throwable th) {
            AbstractC5868k.m23674f(th, "e");
            super.onError(th);
            ((InterfaceC6390h0) C0187o0.this.m618a()).mo20208p3(AbstractC6570d.m25644a(th, "eb2", "500", "500"));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0187o0(InterfaceC6390h0 interfaceC6390h0) {
        super(interfaceC6390h0);
        AbstractC5868k.m23674f(interfaceC6390h0, "view");
        this.f525b = "GetInviteCodeModel";
    }

    /* renamed from: b */
    public final void m680b() {
        AbstractC6567a.m25631a(C1224f.f4816e.m5631a().m5560I(), ((InterfaceC6390h0) m618a()).mo523N3()).subscribe(new a());
    }
}
