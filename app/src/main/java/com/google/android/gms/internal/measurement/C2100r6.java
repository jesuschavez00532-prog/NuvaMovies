package com.google.android.gms.internal.measurement;

import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.r6 */
/* loaded from: classes.dex */
public final class C2100r6 extends AbstractC2220z6 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C2100r6(C2160v6 c2160v6, String str, Long l10, boolean z10) {
        super(c2160v6, str, l10, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2220z6
    /* renamed from: a */
    final /* bridge */ /* synthetic */ Object mo8902a(Object obj) {
        try {
            return Long.valueOf(Long.parseLong((String) obj));
        } catch (NumberFormatException unused) {
            Log.e("PhenotypeFlag", "Invalid long value for " + super.m9397c() + ": " + ((String) obj));
            return null;
        }
    }
}
