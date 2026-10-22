package p365v4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: v4.a */
/* loaded from: classes.dex */
public abstract class AbstractC7202a implements IInterface {

    /* renamed from: a */
    private final IBinder f26970a;

    /* renamed from: b */
    private final String f26971b;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC7202a(IBinder iBinder, String str) {
        this.f26970a = iBinder;
        this.f26971b = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: M */
    public final void m27896M(int i10, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f26970a.transact(i10, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: N */
    public final void m27897N(int i10, Parcel parcel) {
        try {
            this.f26970a.transact(1, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f26970a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public final Parcel m27898d() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f26971b);
        return obtain;
    }
}
