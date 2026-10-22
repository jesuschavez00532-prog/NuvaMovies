package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import p325s4.InterfaceC6675a;
import p394x4.AbstractC7493a;
import p394x4.AbstractC7495c;

/* renamed from: com.google.android.gms.dynamite.m */
/* loaded from: classes.dex */
public final class C1830m extends AbstractC7493a {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C1830m(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    /* renamed from: M */
    public final int m8070M() {
        Parcel m28694a = m28694a(6, m28695d());
        int readInt = m28694a.readInt();
        m28694a.recycle();
        return readInt;
    }

    /* renamed from: N */
    public final int m8071N(InterfaceC6675a interfaceC6675a, String str, boolean z10) {
        Parcel m28695d = m28695d();
        AbstractC7495c.m28700e(m28695d, interfaceC6675a);
        m28695d.writeString(str);
        AbstractC7495c.m28698c(m28695d, z10);
        Parcel m28694a = m28694a(3, m28695d);
        int readInt = m28694a.readInt();
        m28694a.recycle();
        return readInt;
    }

    /* renamed from: O */
    public final int m8072O(InterfaceC6675a interfaceC6675a, String str, boolean z10) {
        Parcel m28695d = m28695d();
        AbstractC7495c.m28700e(m28695d, interfaceC6675a);
        m28695d.writeString(str);
        AbstractC7495c.m28698c(m28695d, z10);
        Parcel m28694a = m28694a(5, m28695d);
        int readInt = m28694a.readInt();
        m28694a.recycle();
        return readInt;
    }

    /* renamed from: P */
    public final InterfaceC6675a m8073P(InterfaceC6675a interfaceC6675a, String str, int i10) {
        Parcel m28695d = m28695d();
        AbstractC7495c.m28700e(m28695d, interfaceC6675a);
        m28695d.writeString(str);
        m28695d.writeInt(i10);
        Parcel m28694a = m28694a(2, m28695d);
        InterfaceC6675a m26052c = InterfaceC6675a.a.m26052c(m28694a.readStrongBinder());
        m28694a.recycle();
        return m26052c;
    }

    /* renamed from: Q */
    public final InterfaceC6675a m8074Q(InterfaceC6675a interfaceC6675a, String str, int i10, InterfaceC6675a interfaceC6675a2) {
        Parcel m28695d = m28695d();
        AbstractC7495c.m28700e(m28695d, interfaceC6675a);
        m28695d.writeString(str);
        m28695d.writeInt(i10);
        AbstractC7495c.m28700e(m28695d, interfaceC6675a2);
        Parcel m28694a = m28694a(8, m28695d);
        InterfaceC6675a m26052c = InterfaceC6675a.a.m26052c(m28694a.readStrongBinder());
        m28694a.recycle();
        return m26052c;
    }

    /* renamed from: R */
    public final InterfaceC6675a m8075R(InterfaceC6675a interfaceC6675a, String str, int i10) {
        Parcel m28695d = m28695d();
        AbstractC7495c.m28700e(m28695d, interfaceC6675a);
        m28695d.writeString(str);
        m28695d.writeInt(i10);
        Parcel m28694a = m28694a(4, m28695d);
        InterfaceC6675a m26052c = InterfaceC6675a.a.m26052c(m28694a.readStrongBinder());
        m28694a.recycle();
        return m26052c;
    }

    /* renamed from: S */
    public final InterfaceC6675a m8076S(InterfaceC6675a interfaceC6675a, String str, boolean z10, long j10) {
        Parcel m28695d = m28695d();
        AbstractC7495c.m28700e(m28695d, interfaceC6675a);
        m28695d.writeString(str);
        AbstractC7495c.m28698c(m28695d, z10);
        m28695d.writeLong(j10);
        Parcel m28694a = m28694a(7, m28695d);
        InterfaceC6675a m26052c = InterfaceC6675a.a.m26052c(m28694a.readStrongBinder());
        m28694a.recycle();
        return m26052c;
    }
}
