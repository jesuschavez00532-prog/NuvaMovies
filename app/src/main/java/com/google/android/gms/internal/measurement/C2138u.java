package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.measurement.u */
/* loaded from: classes.dex */
public final class C2138u implements Iterable, InterfaceC2078q {

    /* renamed from: a */
    private final String f8133a;

    public C2138u(String str) {
        if (str != null) {
            this.f8133a = str;
            return;
        }
        throw new IllegalArgumentException("StringValue cannot be null.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2138u)) {
            return false;
        }
        return this.f8133a.equals(((C2138u) obj).f8133a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2078q
    /* renamed from: g */
    public final InterfaceC2078q mo8349g() {
        return new C2138u(this.f8133a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2078q
    /* renamed from: h */
    public final Double mo8350h() {
        if (this.f8133a.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(this.f8133a);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    public final int hashCode() {
        return this.f8133a.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2078q
    /* renamed from: i */
    public final String mo8351i() {
        return this.f8133a;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C2123t(this);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2078q
    /* renamed from: j */
    public final Boolean mo8352j() {
        return Boolean.valueOf(!this.f8133a.isEmpty());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2078q
    /* renamed from: k */
    public final Iterator mo8353k() {
        return new C2108s(this);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:44:0x0184. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0562  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x05b9  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0603  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x063e  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0286  */
    @Override // com.google.android.gms.internal.measurement.InterfaceC2078q
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.measurement.InterfaceC2078q mo8355o(java.lang.String r22, com.google.android.gms.internal.measurement.C2158v4 r23, java.util.List r24) {
        /*
            Method dump skipped, instructions count: 1780
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C2138u.mo8355o(java.lang.String, com.google.android.gms.internal.measurement.v4, java.util.List):com.google.android.gms.internal.measurement.q");
    }

    public final String toString() {
        return "\"" + this.f8133a + "\"";
    }
}
