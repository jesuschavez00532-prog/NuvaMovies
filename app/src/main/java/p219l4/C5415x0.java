package p219l4;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import p172i4.C4854b;
import p219l4.AbstractC5358c;

/* renamed from: l4.x0 */
/* loaded from: classes.dex */
public final class C5415x0 extends AbstractC5383k0 {

    /* renamed from: g */
    public final IBinder f22050g;

    /* renamed from: h */
    final /* synthetic */ AbstractC5358c f22051h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5415x0(AbstractC5358c abstractC5358c, int i10, IBinder iBinder, Bundle bundle) {
        super(abstractC5358c, i10, bundle);
        this.f22051h = abstractC5358c;
        this.f22050g = iBinder;
    }

    @Override // p219l4.AbstractC5383k0
    /* renamed from: f */
    protected final void mo21761f(C4854b c4854b) {
        if (this.f22051h.f21917v != null) {
            this.f22051h.f21917v.mo9441a(c4854b);
        }
        this.f22051h.m21669K(c4854b);
    }

    @Override // p219l4.AbstractC5383k0
    /* renamed from: g */
    protected final boolean mo21762g() {
        AbstractC5358c.a aVar;
        AbstractC5358c.a aVar2;
        try {
            IBinder iBinder = this.f22050g;
            AbstractC5391n.m21783i(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            if (!this.f22051h.mo9656D().equals(interfaceDescriptor)) {
                Log.w("GmsClient", "service descriptor mismatch: " + this.f22051h.mo9656D() + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface mo9659r = this.f22051h.mo9659r(this.f22050g);
            if (mo9659r != null && (AbstractC5358c.m21658f0(this.f22051h, 2, 4, mo9659r) || AbstractC5358c.m21658f0(this.f22051h, 3, 4, mo9659r))) {
                this.f22051h.f21921z = null;
                Bundle m21695w = this.f22051h.m21695w();
                AbstractC5358c abstractC5358c = this.f22051h;
                aVar = abstractC5358c.f21916u;
                if (aVar != null) {
                    aVar2 = abstractC5358c.f21916u;
                    aVar2.mo9443d(m21695w);
                    return true;
                }
                return true;
            }
            return false;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
