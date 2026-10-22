package p350u4;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: u4.d */
/* loaded from: classes.dex */
public final class C7035d extends AbstractC7032a implements InterfaceC7037f {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C7035d(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    @Override // p350u4.InterfaceC7037f
    /* renamed from: f */
    public final String mo27135f() {
        Parcel m27131M = m27131M(1, m27132d());
        String readString = m27131M.readString();
        m27131M.recycle();
        return readString;
    }

    @Override // p350u4.InterfaceC7037f
    /* renamed from: q */
    public final boolean mo27136q(boolean z10) {
        Parcel m27132d = m27132d();
        AbstractC7034c.m27133a(m27132d, true);
        Parcel m27131M = m27131M(2, m27132d);
        boolean m27134b = AbstractC7034c.m27134b(m27131M);
        m27131M.recycle();
        return m27134b;
    }
}
