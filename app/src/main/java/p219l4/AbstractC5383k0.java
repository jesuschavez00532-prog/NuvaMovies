package p219l4;

import android.app.PendingIntent;
import android.os.Bundle;
import p172i4.C4854b;

/* renamed from: l4.k0 */
/* loaded from: classes.dex */
abstract class AbstractC5383k0 extends AbstractC5409u0 {

    /* renamed from: d */
    public final int f22002d;

    /* renamed from: e */
    public final Bundle f22003e;

    /* renamed from: f */
    final /* synthetic */ AbstractC5358c f22004f;

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC5383k0(AbstractC5358c abstractC5358c, int i10, Bundle bundle) {
        super(abstractC5358c, Boolean.TRUE);
        this.f22004f = abstractC5358c;
        this.f22002d = i10;
        this.f22003e = bundle;
    }

    @Override // p219l4.AbstractC5409u0
    /* renamed from: a */
    protected final /* bridge */ /* synthetic */ void mo21759a(Object obj) {
        PendingIntent pendingIntent = null;
        if (this.f22002d != 0) {
            this.f22004f.m21660h0(1, null);
            Bundle bundle = this.f22003e;
            if (bundle != null) {
                pendingIntent = (PendingIntent) bundle.getParcelable("pendingIntent");
            }
            mo21761f(new C4854b(this.f22002d, pendingIntent));
            return;
        }
        if (!mo21762g()) {
            this.f22004f.m21660h0(1, null);
            mo21761f(new C4854b(8, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p219l4.AbstractC5409u0
    /* renamed from: b */
    public final void mo21760b() {
    }

    /* renamed from: f */
    protected abstract void mo21761f(C4854b c4854b);

    /* renamed from: g */
    protected abstract boolean mo21762g();
}
