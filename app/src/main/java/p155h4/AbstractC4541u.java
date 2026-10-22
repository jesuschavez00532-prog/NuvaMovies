package p155h4;

import android.os.Bundle;
import android.util.Log;
import p127f5.C4247j;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: h4.u */
/* loaded from: classes.dex */
public abstract class AbstractC4541u {

    /* renamed from: a */
    final int f19582a;

    /* renamed from: b */
    final C4247j f19583b = new C4247j();

    /* renamed from: c */
    final int f19584c;

    /* renamed from: d */
    final Bundle f19585d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC4541u(int i10, int i11, Bundle bundle) {
        this.f19582a = i10;
        this.f19584c = i11;
        this.f19585d = bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo18931a(Bundle bundle);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract boolean mo18932b();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final void m18933c(C4542v c4542v) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(c4542v);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 14 + valueOf2.length());
            sb2.append("Failing ");
            sb2.append(valueOf);
            sb2.append(" with ");
            sb2.append(valueOf2);
            Log.d("MessengerIpcClient", sb2.toString());
        }
        this.f19583b.m17725b(c4542v);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final void m18934d(Object obj) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(obj);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 16 + valueOf2.length());
            sb2.append("Finishing ");
            sb2.append(valueOf);
            sb2.append(" with ");
            sb2.append(valueOf2);
            Log.d("MessengerIpcClient", sb2.toString());
        }
        this.f19583b.m17726c(obj);
    }

    public final String toString() {
        int i10 = this.f19584c;
        int i11 = this.f19582a;
        StringBuilder sb2 = new StringBuilder(55);
        sb2.append("Request { what=");
        sb2.append(i10);
        sb2.append(" id=");
        sb2.append(i11);
        sb2.append(" oneWay=");
        sb2.append(mo18932b());
        sb2.append("}");
        return sb2.toString();
    }
}
