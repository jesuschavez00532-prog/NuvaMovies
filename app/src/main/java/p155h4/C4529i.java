package p155h4;

import android.os.Build;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import p155h4.InterfaceC4520c;

/* renamed from: h4.i */
/* loaded from: classes.dex */
public final class C4529i implements Parcelable {
    public static final Parcelable.Creator<C4529i> CREATOR = new C4527g();

    /* renamed from: a */
    Messenger f19559a;

    /* renamed from: b */
    InterfaceC4520c f19560b;

    public C4529i(IBinder iBinder) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f19559a = new Messenger(iBinder);
        } else {
            this.f19560b = new InterfaceC4520c.a(iBinder);
        }
    }

    /* renamed from: a */
    public final IBinder m18921a() {
        Messenger messenger = this.f19559a;
        if (messenger != null) {
            return messenger.getBinder();
        }
        return this.f19560b.asBinder();
    }

    /* renamed from: b */
    public final void m18922b(Message message) {
        Messenger messenger = this.f19559a;
        if (messenger != null) {
            messenger.send(message);
        } else {
            this.f19560b.mo18910o(message);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return m18921a().equals(((C4529i) obj).m18921a());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        return m18921a().hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        Messenger messenger = this.f19559a;
        if (messenger != null) {
            parcel.writeStrongBinder(messenger.getBinder());
        } else {
            parcel.writeStrongBinder(this.f19560b.asBinder());
        }
    }
}
