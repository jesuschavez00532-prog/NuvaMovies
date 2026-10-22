package p219l4;

import android.os.IBinder;
import android.os.Parcel;
import p325s4.InterfaceC6675a;
import p394x4.AbstractC7493a;

/* renamed from: l4.n1 */
/* loaded from: classes.dex */
public final class C5393n1 extends AbstractC7493a implements InterfaceC5399p1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C5393n1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    @Override // p219l4.InterfaceC5399p1
    /* renamed from: f */
    public final int mo20025f() {
        Parcel m28694a = m28694a(2, m28695d());
        int readInt = m28694a.readInt();
        m28694a.recycle();
        return readInt;
    }

    @Override // p219l4.InterfaceC5399p1
    /* renamed from: g */
    public final InterfaceC6675a mo20026g() {
        Parcel m28694a = m28694a(1, m28695d());
        InterfaceC6675a m26052c = InterfaceC6675a.a.m26052c(m28694a.readStrongBinder());
        m28694a.recycle();
        return m26052c;
    }
}
