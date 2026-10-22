package p216l1;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: l1.y */
/* loaded from: classes.dex */
class C5338y {

    /* renamed from: a */
    private boolean f21862a;

    /* renamed from: b */
    private final Handler f21863b = new Handler(Looper.getMainLooper(), new a());

    /* renamed from: l1.y$a */
    /* loaded from: classes.dex */
    private static final class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what == 1) {
                ((InterfaceC5335v) message.obj).mo21576b();
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void m21607a(InterfaceC5335v interfaceC5335v, boolean z10) {
        if (!this.f21862a && !z10) {
            this.f21862a = true;
            interfaceC5335v.mo21576b();
            this.f21862a = false;
        }
        this.f21863b.obtainMessage(1, interfaceC5335v).sendToTarget();
    }
}
