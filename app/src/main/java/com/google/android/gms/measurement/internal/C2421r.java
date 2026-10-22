package com.google.android.gms.measurement.internal;

import p219l4.AbstractC5391n;

/* renamed from: com.google.android.gms.measurement.internal.r */
/* loaded from: classes.dex */
final class C2421r {

    /* renamed from: a */
    final String f9014a;

    /* renamed from: b */
    final String f9015b;

    /* renamed from: c */
    final long f9016c;

    /* renamed from: d */
    final long f9017d;

    /* renamed from: e */
    final long f9018e;

    /* renamed from: f */
    final long f9019f;

    /* renamed from: g */
    final long f9020g;

    /* renamed from: h */
    final Long f9021h;

    /* renamed from: i */
    final Long f9022i;

    /* renamed from: j */
    final Long f9023j;

    /* renamed from: k */
    final Boolean f9024k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2421r(String str, String str2, long j10, long j11, long j12, long j13, long j14, Long l10, Long l11, Long l12, Boolean bool) {
        boolean z10;
        boolean z11;
        boolean z12;
        AbstractC5391n.m21779e(str);
        AbstractC5391n.m21779e(str2);
        if (j10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        AbstractC5391n.m21775a(z10);
        if (j11 >= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        AbstractC5391n.m21775a(z11);
        if (j12 >= 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        AbstractC5391n.m21775a(z12);
        AbstractC5391n.m21775a(j14 >= 0);
        this.f9014a = str;
        this.f9015b = str2;
        this.f9016c = j10;
        this.f9017d = j11;
        this.f9018e = j12;
        this.f9019f = j13;
        this.f9020g = j14;
        this.f9021h = l10;
        this.f9022i = l11;
        this.f9023j = l12;
        this.f9024k = bool;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final C2421r m10055a(Long l10, Long l11, Boolean bool) {
        Boolean bool2;
        if (bool != null && !bool.booleanValue()) {
            bool2 = null;
        } else {
            bool2 = bool;
        }
        return new C2421r(this.f9014a, this.f9015b, this.f9016c, this.f9017d, this.f9018e, this.f9019f, this.f9020g, this.f9021h, l10, l11, bool2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final C2421r m10056b(long j10, long j11) {
        return new C2421r(this.f9014a, this.f9015b, this.f9016c, this.f9017d, this.f9018e, this.f9019f, j10, Long.valueOf(j11), this.f9022i, this.f9023j, this.f9024k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final C2421r m10057c(long j10) {
        return new C2421r(this.f9014a, this.f9015b, this.f9016c, this.f9017d, this.f9018e, j10, this.f9020g, this.f9021h, this.f9022i, this.f9023j, this.f9024k);
    }
}
