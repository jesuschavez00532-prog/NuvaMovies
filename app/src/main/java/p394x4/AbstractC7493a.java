package p394x4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: x4.a */
/* loaded from: classes.dex */
public abstract class AbstractC7493a implements IInterface {

    /* renamed from: a */
    private final IBinder f27564a;

    /* renamed from: b */
    private final String f27565b;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC7493a(IBinder iBinder, String str) {
        this.f27564a = iBinder;
        this.f27565b = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final Parcel m28694a(int i10, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f27564a.transact(i10, parcel, obtain, 0);
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
        return this.f27564a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public final Parcel m28695d() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f27565b);
        return obtain;
    }
}
