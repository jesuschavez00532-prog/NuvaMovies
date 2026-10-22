package ac;

import com.request.result.StartPlayVODResult;
import ne.AbstractC5868k;
import p030bc.C1224f;
import p301qb.InterfaceC6412o1;
import p317rb.AbstractC6567a;
import p317rb.AbstractC6570d;
import p343tb.AbstractC6929a;

/* renamed from: ac.n2 */
/* loaded from: classes2.dex */
public final class C0185n2 extends AbstractC0166j {

    /* renamed from: ac.n2$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC6929a {

        /* renamed from: c */
        final /* synthetic */ int[] f523c;

        a(int[] iArr) {
            this.f523c = iArr;
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onNext(StartPlayVODResult startPlayVODResult) {
            int i10;
            AbstractC5868k.m23674f(startPlayVODResult, "t");
            super.onNext(startPlayVODResult);
            InterfaceC6412o1 interfaceC6412o1 = (InterfaceC6412o1) C0185n2.this.m618a();
            int[] iArr = this.f523c;
            if (iArr != null) {
                i10 = iArr[0];
            } else {
                i10 = -1;
            }
            interfaceC6412o1.mo20728z4(startPlayVODResult, i10);
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        public void onError(Throwable th) {
            int i10;
            AbstractC5868k.m23674f(th, "e");
            super.onError(th);
            String m25644a = AbstractC6570d.m25644a(th, "EA7", "500", "ea14");
            InterfaceC6412o1 interfaceC6412o1 = (InterfaceC6412o1) C0185n2.this.m618a();
            int[] iArr = this.f523c;
            if (iArr != null) {
                i10 = iArr[0];
            } else {
                i10 = -1;
            }
            interfaceC6412o1.mo20720V(m25644a, i10);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0185n2(InterfaceC6412o1 interfaceC6412o1) {
        super(interfaceC6412o1);
        AbstractC5868k.m23674f(interfaceC6412o1, "view");
    }

    /* renamed from: b */
    public final void m678b(int i10, String str, String str2, String str3, int i11, String str4, int[] iArr) {
        AbstractC5868k.m23674f(str, "contentId");
        AbstractC5868k.m23674f(str3, "type");
        AbstractC6567a.m25631a(C1224f.f4816e.m5631a().m5622w0(i10, str, str2, str3, i11, str4, iArr), ((InterfaceC6412o1) m618a()).mo523N3()).subscribe(new a(iArr));
    }
}
