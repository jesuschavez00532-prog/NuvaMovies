package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.C2080q1;
import p219l4.AbstractC5391n;

/* renamed from: com.google.android.gms.measurement.internal.o5 */
/* loaded from: classes.dex */
public final class C2394o5 {

    /* renamed from: a */
    final Context f8887a;

    /* renamed from: b */
    String f8888b;

    /* renamed from: c */
    String f8889c;

    /* renamed from: d */
    String f8890d;

    /* renamed from: e */
    Boolean f8891e;

    /* renamed from: f */
    long f8892f;

    /* renamed from: g */
    C2080q1 f8893g;

    /* renamed from: h */
    boolean f8894h;

    /* renamed from: i */
    final Long f8895i;

    /* renamed from: j */
    String f8896j;

    public C2394o5(Context context, C2080q1 c2080q1, Long l10) {
        this.f8894h = true;
        AbstractC5391n.m21783i(context);
        Context applicationContext = context.getApplicationContext();
        AbstractC5391n.m21783i(applicationContext);
        this.f8887a = applicationContext;
        this.f8895i = l10;
        if (c2080q1 != null) {
            this.f8893g = c2080q1;
            this.f8888b = c2080q1.f8016f;
            this.f8889c = c2080q1.f8015e;
            this.f8890d = c2080q1.f8014d;
            this.f8894h = c2080q1.f8013c;
            this.f8892f = c2080q1.f8012b;
            this.f8896j = c2080q1.f8018h;
            Bundle bundle = c2080q1.f8017g;
            if (bundle != null) {
                this.f8891e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
