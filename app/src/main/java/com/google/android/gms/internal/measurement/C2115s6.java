package com.google.android.gms.internal.measurement;

import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.s6 */
/* loaded from: classes.dex */
public final class C2115s6 extends AbstractC2220z6 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C2115s6(C2160v6 c2160v6, String str, Boolean bool, boolean z10) {
        super(c2160v6, str, bool, true, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.AbstractC2220z6
    /* renamed from: a */
    final /* bridge */ /* synthetic */ Object mo8902a(Object obj) {
        if (AbstractC2159v5.f8199c.matcher(obj).matches()) {
            return Boolean.TRUE;
        }
        if (AbstractC2159v5.f8200d.matcher(obj).matches()) {
            return Boolean.FALSE;
        }
        Log.e("PhenotypeFlag", "Invalid boolean value for " + super.m9397c() + ": " + ((String) obj));
        return null;
    }
}
