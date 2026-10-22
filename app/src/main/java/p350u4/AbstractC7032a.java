package p350u4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: u4.a */
/* loaded from: classes.dex */
public abstract class AbstractC7032a implements IInterface {

    /* renamed from: a */
    private final IBinder f26407a;

    /* renamed from: b */
    private final String f26408b = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService";

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC7032a(IBinder iBinder, String str) {
        this.f26407a = iBinder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: M */
    public final Parcel m27131M(int i10, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f26407a.transact(i10, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e10) {
                obtain.recycle();
                throw e10;
            }
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f26407a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public final Parcel m27132d() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f26408b);
        return obtain;
    }
}
