package p368v7;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Iterator;
import p009a8.C0111a;
import p413y7.InterfaceC7682b;
import p428z7.C7760a;
import p428z7.C7761b;

/* renamed from: v7.b */
/* loaded from: classes2.dex */
public class C7247b implements InterfaceC7246a {

    /* renamed from: a */
    private final Handler f27075a = new a(Looper.getMainLooper());

    /* renamed from: b */
    private final InterfaceC7682b f27076b;

    /* renamed from: v7.b$a */
    /* loaded from: classes2.dex */
    class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            C7760a c7760a = (C7760a) message.obj;
            switch (c7760a.m30013l()) {
                case 1:
                    if (c7760a.m30005d() != null) {
                        c7760a.m30005d().onStart();
                        return;
                    }
                    return;
                case 2:
                    if (c7760a.m30005d() != null) {
                        c7760a.m30005d().mo24073d(c7760a.m30011j(), c7760a.m30012k());
                        return;
                    }
                    return;
                case 3:
                    if (c7760a.m30005d() != null) {
                        c7760a.m30005d().mo26886b();
                        return;
                    }
                    return;
                case 4:
                    if (c7760a.m30005d() != null) {
                        c7760a.m30005d().mo26887c();
                        return;
                    }
                    return;
                case 5:
                    if (c7760a.m30005d() != null) {
                        c7760a.m30005d().mo24072a();
                        return;
                    }
                    return;
                case 6:
                    if (c7760a.m30005d() != null) {
                        c7760a.m30005d().mo24074f(c7760a.m30008g());
                        return;
                    }
                    return;
                case 7:
                    if (c7760a.m30005d() != null) {
                        c7760a.m30005d().mo26888e();
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    public C7247b(InterfaceC7682b interfaceC7682b) {
        this.f27076b = interfaceC7682b;
    }

    @Override // p368v7.InterfaceC7246a
    /* renamed from: a */
    public void mo28053a(C7760a c7760a) {
        if (c7760a.m30013l() != 7) {
            this.f27076b.mo11419g(c7760a);
            if (c7760a.m30006e() != null) {
                Iterator it = c7760a.m30006e().iterator();
                while (it.hasNext()) {
                    this.f27076b.mo11413a((C7761b) it.next());
                }
            }
        }
        Message obtainMessage = this.f27075a.obtainMessage(c7760a.m30009h().hashCode());
        obtainMessage.obj = c7760a;
        if (Looper.getMainLooper() == Looper.myLooper()) {
            this.f27075a.handleMessage(obtainMessage);
        } else {
            obtainMessage.sendToTarget();
        }
    }

    @Override // p368v7.InterfaceC7246a
    /* renamed from: b */
    public void mo28054b(C7760a c7760a, C0111a c0111a) {
        if (c0111a.m485a() == 7) {
            return;
        }
        c7760a.m29998D(6);
        c7760a.m30026y(c0111a);
        mo28053a(c7760a);
    }
}
