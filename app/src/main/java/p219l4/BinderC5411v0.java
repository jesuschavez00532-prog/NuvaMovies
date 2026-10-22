package p219l4;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;

/* renamed from: l4.v0 */
/* loaded from: classes.dex */
public final class BinderC5411v0 extends AbstractBinderC5386l0 {

    /* renamed from: a */
    private AbstractC5358c f22046a;

    /* renamed from: b */
    private final int f22047b;

    public BinderC5411v0(AbstractC5358c abstractC5358c, int i10) {
        this.f22046a = abstractC5358c;
        this.f22047b = i10;
    }

    @Override // p219l4.InterfaceC5379j
    /* renamed from: t */
    public final void mo21755t(int i10, IBinder iBinder, C5419z0 c5419z0) {
        AbstractC5358c abstractC5358c = this.f22046a;
        AbstractC5391n.m21784j(abstractC5358c, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        AbstractC5391n.m21783i(c5419z0);
        AbstractC5358c.m21655b0(abstractC5358c, c5419z0);
        mo21757z(i10, iBinder, c5419z0.f22058a);
    }

    @Override // p219l4.InterfaceC5379j
    /* renamed from: u */
    public final void mo21756u(int i10, Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }

    @Override // p219l4.InterfaceC5379j
    /* renamed from: z */
    public final void mo21757z(int i10, IBinder iBinder, Bundle bundle) {
        AbstractC5391n.m21784j(this.f22046a, "onPostInitComplete can be called only once per call to getRemoteService");
        this.f22046a.m21671M(i10, iBinder, bundle, this.f22047b);
        this.f22046a = null;
    }
}
