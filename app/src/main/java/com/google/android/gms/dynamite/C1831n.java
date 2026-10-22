package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import p325s4.InterfaceC6675a;
import p394x4.AbstractC7493a;
import p394x4.AbstractC7495c;

/* renamed from: com.google.android.gms.dynamite.n */
/* loaded from: classes.dex */
public final class C1831n extends AbstractC7493a {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C1831n(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    /* renamed from: M */
    public final InterfaceC6675a m8077M(InterfaceC6675a interfaceC6675a, String str, int i10, InterfaceC6675a interfaceC6675a2) {
        Parcel m28695d = m28695d();
        AbstractC7495c.m28700e(m28695d, interfaceC6675a);
        m28695d.writeString(str);
        m28695d.writeInt(i10);
        AbstractC7495c.m28700e(m28695d, interfaceC6675a2);
        Parcel m28694a = m28694a(2, m28695d);
        InterfaceC6675a m26052c = InterfaceC6675a.a.m26052c(m28694a.readStrongBinder());
        m28694a.recycle();
        return m26052c;
    }

    /* renamed from: N */
    public final InterfaceC6675a m8078N(InterfaceC6675a interfaceC6675a, String str, int i10, InterfaceC6675a interfaceC6675a2) {
        Parcel m28695d = m28695d();
        AbstractC7495c.m28700e(m28695d, interfaceC6675a);
        m28695d.writeString(str);
        m28695d.writeInt(i10);
        AbstractC7495c.m28700e(m28695d, interfaceC6675a2);
        Parcel m28694a = m28694a(3, m28695d);
        InterfaceC6675a m26052c = InterfaceC6675a.a.m26052c(m28694a.readStrongBinder());
        m28694a.recycle();
        return m26052c;
    }
}
