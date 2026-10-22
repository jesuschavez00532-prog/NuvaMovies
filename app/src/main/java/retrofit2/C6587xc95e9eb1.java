package retrofit2;

import be.C1328x;
import me.InterfaceC5660l;
import ne.AbstractC5869l;

/* renamed from: retrofit2.KotlinExtensions$awaitResponse$$inlined$suspendCancellableCoroutine$lambda$1 */
/* loaded from: classes3.dex */
final class C6587xc95e9eb1 extends AbstractC5869l implements InterfaceC5660l {

    /* renamed from: a */
    final /* synthetic */ Call f25245a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6587xc95e9eb1(Call call) {
        super(1);
        this.f25245a = call;
    }

    /* renamed from: a */
    public final void m25709a(Throwable th) {
        this.f25245a.cancel();
    }

    @Override // me.InterfaceC5660l
    /* renamed from: f */
    public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
        m25709a((Throwable) obj);
        return C1328x.f4998a;
    }
}
