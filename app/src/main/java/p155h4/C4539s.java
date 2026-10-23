package p155h4;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: h4.s */
/* loaded from: classes.dex */
final class C4539s {

    /* renamed from: a */
    private final Messenger f19580a;

    /* renamed from: b */
    private final C4529i f19581b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4539s(IBinder iBinder) {
        String str = null;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.f19580a = new Messenger(iBinder);
            this.f19581b = null;
        } else {
            if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
                this.f19581b = new C4529i(iBinder);
                this.f19580a = null;
                return;
            }
            String valueOf = String.valueOf(interfaceDescriptor);
            if (valueOf.length() != 0) {
                str = "Invalid interface descriptor: ".concat(valueOf);
            } else {
                str = new String("Invalid interface descriptor: ");
            }
            Log.w("MessengerIpcClient", str);
            throw new RemoteException();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m18930a(Message message) {
        Messenger messenger = this.f19580a;
        if (messenger != null) {
            messenger.send(message);
            return;
        }
        C4529i c4529i = this.f19581b;
        if (c4529i != null) {
            c4529i.m18922b(message);
            return;
        }
        throw new IllegalStateException("Both messengers are null");
    }
}
