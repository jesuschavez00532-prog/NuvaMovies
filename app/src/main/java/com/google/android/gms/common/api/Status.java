package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.umeng.analytics.pro.C3325bt;
import p172i4.C4854b;
import p187j4.AbstractC4989c;
import p219l4.AbstractC5388m;
import p233m4.AbstractC5593a;
import p233m4.AbstractC5595c;

/* loaded from: classes.dex */
public final class Status extends AbstractC5593a implements ReflectedParcelable {

    /* renamed from: a */
    final int f7527a;

    /* renamed from: b */
    private final int f7528b;

    /* renamed from: c */
    private final String f7529c;

    /* renamed from: d */
    private final PendingIntent f7530d;

    /* renamed from: e */
    private final C4854b f7531e;

    /* renamed from: f */
    public static final Status f7519f = new Status(-1);

    /* renamed from: g */
    public static final Status f7520g = new Status(0);

    /* renamed from: h */
    public static final Status f7521h = new Status(14);

    /* renamed from: i */
    public static final Status f7522i = new Status(8);

    /* renamed from: j */
    public static final Status f7523j = new Status(15);

    /* renamed from: k */
    public static final Status f7524k = new Status(16);

    /* renamed from: m */
    public static final Status f7526m = new Status(17);

    /* renamed from: l */
    public static final Status f7525l = new Status(18);
    public static final Parcelable.Creator<Status> CREATOR = new C1789b();

    /* JADX INFO: Access modifiers changed from: package-private */
    public Status(int i10, int i11, String str, PendingIntent pendingIntent, C4854b c4854b) {
        this.f7527a = i10;
        this.f7528b = i11;
        this.f7529c = str;
        this.f7530d = pendingIntent;
        this.f7531e = c4854b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        if (this.f7527a != status.f7527a || this.f7528b != status.f7528b || !AbstractC5388m.m21771a(this.f7529c, status.f7529c) || !AbstractC5388m.m21771a(this.f7530d, status.f7530d) || !AbstractC5388m.m21771a(this.f7531e, status.f7531e)) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public C4854b m7912g() {
        return this.f7531e;
    }

    public int hashCode() {
        return AbstractC5388m.m21772b(Integer.valueOf(this.f7527a), Integer.valueOf(this.f7528b), this.f7529c, this.f7530d, this.f7531e);
    }

    /* renamed from: i */
    public int m7913i() {
        return this.f7528b;
    }

    /* renamed from: j */
    public String m7914j() {
        return this.f7529c;
    }

    /* renamed from: k */
    public boolean m7915k() {
        return this.f7530d != null;
    }

    /* renamed from: n */
    public final String m7916n() {
        String str = this.f7529c;
        if (str != null) {
            return str;
        }
        return AbstractC4989c.m20361a(this.f7528b);
    }

    public String toString() {
        AbstractC5388m.a m21773c = AbstractC5388m.m21773c(this);
        m21773c.m21774a("statusCode", m7916n());
        m21773c.m21774a(C3325bt.f14284z, this.f7530d);
        return m21773c.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m22733a = AbstractC5595c.m22733a(parcel);
        AbstractC5595c.m22741i(parcel, 1, m7913i());
        AbstractC5595c.m22746n(parcel, 2, m7914j(), false);
        AbstractC5595c.m22745m(parcel, 3, this.f7530d, i10, false);
        AbstractC5595c.m22745m(parcel, 4, m7912g(), i10, false);
        AbstractC5595c.m22741i(parcel, 1000, this.f7527a);
        AbstractC5595c.m22734b(parcel, m22733a);
    }

    public Status(int i10) {
        this(i10, (String) null);
    }

    public Status(int i10, String str) {
        this(1, i10, str, null, null);
    }

    public Status(C4854b c4854b, String str) {
        this(c4854b, str, 17);
    }

    public Status(C4854b c4854b, String str, int i10) {
        this(1, i10, str, c4854b.m20019j(), c4854b);
    }
}
