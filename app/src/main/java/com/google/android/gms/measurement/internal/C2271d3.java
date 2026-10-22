package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.AbstractC2049o0;
import com.google.android.gms.internal.measurement.AbstractC2079q0;
import java.util.ArrayList;
import java.util.List;
import p025b5.InterfaceC1106f;

/* renamed from: com.google.android.gms.measurement.internal.d3 */
/* loaded from: classes.dex */
public final class C2271d3 extends AbstractC2049o0 implements InterfaceC1106f {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C2271d3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // p025b5.InterfaceC1106f
    /* renamed from: B */
    public final void mo5061B(long j10, String str, String str2, String str3) {
        Parcel m8748d = m8748d();
        m8748d.writeLong(j10);
        m8748d.writeString(str);
        m8748d.writeString(str2);
        m8748d.writeString(str3);
        m8747N(10, m8748d);
    }

    @Override // p025b5.InterfaceC1106f
    /* renamed from: D */
    public final void mo5063D(C2354k9 c2354k9, C2453t9 c2453t9) {
        Parcel m8748d = m8748d();
        AbstractC2079q0.m8778e(m8748d, c2354k9);
        AbstractC2079q0.m8778e(m8748d, c2453t9);
        m8747N(2, m8748d);
    }

    @Override // p025b5.InterfaceC1106f
    /* renamed from: E */
    public final void mo5064E(C2453t9 c2453t9) {
        Parcel m8748d = m8748d();
        AbstractC2079q0.m8778e(m8748d, c2453t9);
        m8747N(20, m8748d);
    }

    @Override // p025b5.InterfaceC1106f
    /* renamed from: F */
    public final List mo5065F(String str, String str2, boolean z10, C2453t9 c2453t9) {
        Parcel m8748d = m8748d();
        m8748d.writeString(str);
        m8748d.writeString(str2);
        AbstractC2079q0.m8777d(m8748d, z10);
        AbstractC2079q0.m8778e(m8748d, c2453t9);
        Parcel m8746M = m8746M(14, m8748d);
        ArrayList createTypedArrayList = m8746M.createTypedArrayList(C2354k9.CREATOR);
        m8746M.recycle();
        return createTypedArrayList;
    }

    @Override // p025b5.InterfaceC1106f
    /* renamed from: G */
    public final void mo5066G(C2453t9 c2453t9) {
        Parcel m8748d = m8748d();
        AbstractC2079q0.m8778e(m8748d, c2453t9);
        m8747N(18, m8748d);
    }

    @Override // p025b5.InterfaceC1106f
    /* renamed from: I */
    public final void mo5067I(C2267d c2267d, C2453t9 c2453t9) {
        Parcel m8748d = m8748d();
        AbstractC2079q0.m8778e(m8748d, c2267d);
        AbstractC2079q0.m8778e(m8748d, c2453t9);
        m8747N(12, m8748d);
    }

    @Override // p025b5.InterfaceC1106f
    /* renamed from: j */
    public final void mo5068j(C2453t9 c2453t9) {
        Parcel m8748d = m8748d();
        AbstractC2079q0.m8778e(m8748d, c2453t9);
        m8747N(6, m8748d);
    }

    @Override // p025b5.InterfaceC1106f
    /* renamed from: k */
    public final void mo5069k(Bundle bundle, C2453t9 c2453t9) {
        Parcel m8748d = m8748d();
        AbstractC2079q0.m8778e(m8748d, bundle);
        AbstractC2079q0.m8778e(m8748d, c2453t9);
        m8747N(19, m8748d);
    }

    @Override // p025b5.InterfaceC1106f
    /* renamed from: l */
    public final List mo5070l(String str, String str2, String str3, boolean z10) {
        Parcel m8748d = m8748d();
        m8748d.writeString(null);
        m8748d.writeString(str2);
        m8748d.writeString(str3);
        AbstractC2079q0.m8777d(m8748d, z10);
        Parcel m8746M = m8746M(15, m8748d);
        ArrayList createTypedArrayList = m8746M.createTypedArrayList(C2354k9.CREATOR);
        m8746M.recycle();
        return createTypedArrayList;
    }

    @Override // p025b5.InterfaceC1106f
    /* renamed from: p */
    public final byte[] mo5073p(C2465v c2465v, String str) {
        Parcel m8748d = m8748d();
        AbstractC2079q0.m8778e(m8748d, c2465v);
        m8748d.writeString(str);
        Parcel m8746M = m8746M(9, m8748d);
        byte[] createByteArray = m8746M.createByteArray();
        m8746M.recycle();
        return createByteArray;
    }

    @Override // p025b5.InterfaceC1106f
    /* renamed from: r */
    public final String mo5074r(C2453t9 c2453t9) {
        Parcel m8748d = m8748d();
        AbstractC2079q0.m8778e(m8748d, c2453t9);
        Parcel m8746M = m8746M(11, m8748d);
        String readString = m8746M.readString();
        m8746M.recycle();
        return readString;
    }

    @Override // p025b5.InterfaceC1106f
    /* renamed from: s */
    public final List mo5075s(String str, String str2, String str3) {
        Parcel m8748d = m8748d();
        m8748d.writeString(null);
        m8748d.writeString(str2);
        m8748d.writeString(str3);
        Parcel m8746M = m8746M(17, m8748d);
        ArrayList createTypedArrayList = m8746M.createTypedArrayList(C2267d.CREATOR);
        m8746M.recycle();
        return createTypedArrayList;
    }

    @Override // p025b5.InterfaceC1106f
    /* renamed from: v */
    public final void mo5076v(C2465v c2465v, C2453t9 c2453t9) {
        Parcel m8748d = m8748d();
        AbstractC2079q0.m8778e(m8748d, c2465v);
        AbstractC2079q0.m8778e(m8748d, c2453t9);
        m8747N(1, m8748d);
    }

    @Override // p025b5.InterfaceC1106f
    /* renamed from: x */
    public final void mo5077x(C2453t9 c2453t9) {
        Parcel m8748d = m8748d();
        AbstractC2079q0.m8778e(m8748d, c2453t9);
        m8747N(4, m8748d);
    }

    @Override // p025b5.InterfaceC1106f
    /* renamed from: y */
    public final List mo5078y(String str, String str2, C2453t9 c2453t9) {
        Parcel m8748d = m8748d();
        m8748d.writeString(str);
        m8748d.writeString(str2);
        AbstractC2079q0.m8778e(m8748d, c2453t9);
        Parcel m8746M = m8746M(16, m8748d);
        ArrayList createTypedArrayList = m8746M.createTypedArrayList(C2267d.CREATOR);
        m8746M.recycle();
        return createTypedArrayList;
    }
}
