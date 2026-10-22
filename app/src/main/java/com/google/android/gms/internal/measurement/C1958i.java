package com.google.android.gms.internal.measurement;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.i */
/* loaded from: classes.dex */
public final class C1958i implements InterfaceC2078q {

    /* renamed from: a */
    private final Double f7810a;

    public C1958i(Double d10) {
        if (d10 == null) {
            this.f7810a = Double.valueOf(Double.NaN);
        } else {
            this.f7810a = d10;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1958i)) {
            return false;
        }
        return this.f7810a.equals(((C1958i) obj).f7810a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2078q
    /* renamed from: g */
    public final InterfaceC2078q mo8349g() {
        return new C1958i(this.f7810a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2078q
    /* renamed from: h */
    public final Double mo8350h() {
        return this.f7810a;
    }

    public final int hashCode() {
        return this.f7810a.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2078q
    /* renamed from: i */
    public final String mo8351i() {
        int scale;
        if (Double.isNaN(this.f7810a.doubleValue())) {
            return "NaN";
        }
        if (Double.isInfinite(this.f7810a.doubleValue())) {
            if (this.f7810a.doubleValue() > 0.0d) {
                return "Infinity";
            }
            return "-Infinity";
        }
        BigDecimal stripTrailingZeros = BigDecimal.valueOf(this.f7810a.doubleValue()).stripTrailingZeros();
        DecimalFormat decimalFormat = new DecimalFormat("0E0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        if (stripTrailingZeros.scale() > 0) {
            scale = stripTrailingZeros.precision();
        } else {
            scale = stripTrailingZeros.scale();
        }
        decimalFormat.setMinimumFractionDigits(scale - 1);
        String format = decimalFormat.format(stripTrailingZeros);
        int indexOf = format.indexOf("E");
        if (indexOf > 0) {
            int parseInt = Integer.parseInt(format.substring(indexOf + 1));
            if ((parseInt < 0 && parseInt > -7) || (parseInt >= 0 && parseInt < 21)) {
                return stripTrailingZeros.toPlainString();
            }
            return format.replace("E-", "e-").replace("E", "e+");
        }
        return format;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2078q
    /* renamed from: j */
    public final Boolean mo8352j() {
        boolean z10 = false;
        if (!Double.isNaN(this.f7810a.doubleValue()) && this.f7810a.doubleValue() != 0.0d) {
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2078q
    /* renamed from: k */
    public final Iterator mo8353k() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2078q
    /* renamed from: o */
    public final InterfaceC2078q mo8355o(String str, C2158v4 c2158v4, List list) {
        if ("toString".equals(str)) {
            return new C2138u(mo8351i());
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", mo8351i(), str));
    }

    public final String toString() {
        return mo8351i();
    }
}
