package com.google.android.gms.internal.measurement;

import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.t6 */
/* loaded from: classes.dex */
public final class C2130t6 extends AbstractC2220z6 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C2130t6(C2160v6 c2160v6, String str, Double d10, boolean z10) {
        super(c2160v6, "measurement.test.double_flag", d10, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2220z6
    /* renamed from: a */
    final /* bridge */ /* synthetic */ Object mo8902a(Object obj) {
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            Log.e("PhenotypeFlag", "Invalid double value for " + super.m9397c() + ": " + ((String) obj));
            return null;
        }
    }
}
