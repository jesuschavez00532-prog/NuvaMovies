package p219l4;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import p172i4.C4854b;
import p219l4.AbstractC5358c;
import p394x4.HandlerC7497e;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: l4.t0 */
/* loaded from: classes.dex */
public final class HandlerC5407t0 extends HandlerC7497e {

    /* renamed from: a */
    final /* synthetic */ AbstractC5358c f22039a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC5407t0(AbstractC5358c abstractC5358c, Looper looper) {
        super(looper);
        this.f22039a = abstractC5358c;
    }

    /* renamed from: a */
    private static final void m21811a(Message message) {
        AbstractC5409u0 abstractC5409u0 = (AbstractC5409u0) message.obj;
        abstractC5409u0.mo21760b();
        abstractC5409u0.m21818e();
    }

    /* renamed from: b */
    private static final boolean m21812b(Message message) {
        int i10 = message.what;
        if (i10 == 2 || i10 == 1 || i10 == 7) {
            return true;
        }
        return false;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        AbstractC5358c.a aVar;
        AbstractC5358c.a aVar2;
        C4854b c4854b;
        C4854b c4854b2;
        C4854b c4854b3;
        C4854b c4854b4;
        boolean z10 = false;
        if (this.f22039a.f21895C.get() != message.arg1) {
            if (m21812b(message)) {
                m21811a(message);
                return;
            }
            return;
        }
        int i10 = message.what;
        if ((i10 != 1 && i10 != 7 && ((i10 != 4 || this.f22039a.m21691s()) && message.what != 5)) || this.f22039a.m21679c()) {
            int i11 = message.what;
            PendingIntent pendingIntent = null;
            if (i11 == 4) {
                this.f22039a.f21921z = new C4854b(message.arg2);
                if (AbstractC5358c.m21659g0(this.f22039a)) {
                    AbstractC5358c abstractC5358c = this.f22039a;
                    z10 = abstractC5358c.f21893A;
                    if (!z10) {
                        abstractC5358c.m21660h0(3, null);
                        return;
                    }
                }
                AbstractC5358c abstractC5358c2 = this.f22039a;
                c4854b3 = abstractC5358c2.f21921z;
                if (c4854b3 != null) {
                    c4854b4 = abstractC5358c2.f21921z;
                } else {
                    c4854b4 = new C4854b(8);
                }
                this.f22039a.f21911p.mo8034a(c4854b4);
                this.f22039a.m21669K(c4854b4);
                return;
            }
            if (i11 == 5) {
                AbstractC5358c abstractC5358c3 = this.f22039a;
                c4854b = abstractC5358c3.f21921z;
                if (c4854b != null) {
                    c4854b2 = abstractC5358c3.f21921z;
                } else {
                    c4854b2 = new C4854b(8);
                }
                this.f22039a.f21911p.mo8034a(c4854b2);
                this.f22039a.m21669K(c4854b2);
                return;
            }
            if (i11 == 3) {
                Object obj = message.obj;
                if (obj instanceof PendingIntent) {
                    pendingIntent = (PendingIntent) obj;
                }
                C4854b c4854b5 = new C4854b(message.arg2, pendingIntent);
                this.f22039a.f21911p.mo8034a(c4854b5);
                this.f22039a.m21669K(c4854b5);
                return;
            }
            if (i11 == 6) {
                this.f22039a.m21660h0(5, null);
                AbstractC5358c abstractC5358c4 = this.f22039a;
                aVar = abstractC5358c4.f21916u;
                if (aVar != null) {
                    aVar2 = abstractC5358c4.f21916u;
                    aVar2.mo9442c(message.arg2);
                }
                this.f22039a.m21670L(message.arg2);
                AbstractC5358c.m21658f0(this.f22039a, 5, 1, null);
                return;
            }
            if (i11 == 2 && !this.f22039a.isConnected()) {
                m21811a(message);
                return;
            }
            if (m21812b(message)) {
                ((AbstractC5409u0) message.obj).m21816c();
                return;
            }
            Log.wtf("GmsClient", "Don't know how to handle message: " + message.what, new Exception());
            return;
        }
        m21811a(message);
    }
}
