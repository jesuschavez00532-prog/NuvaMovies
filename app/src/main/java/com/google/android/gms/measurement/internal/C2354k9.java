package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import p219l4.AbstractC5391n;
import p233m4.AbstractC5593a;

/* renamed from: com.google.android.gms.measurement.internal.k9 */
/* loaded from: classes.dex */
public final class C2354k9 extends AbstractC5593a {
    public static final Parcelable.Creator<C2354k9> CREATOR = new C2365l9();

    /* renamed from: a */
    public final int f8757a;

    /* renamed from: b */
    public final String f8758b;

    /* renamed from: c */
    public final long f8759c;

    /* renamed from: d */
    public final Long f8760d;

    /* renamed from: e */
    public final String f8761e;

    /* renamed from: f */
    public final String f8762f;

    /* renamed from: g */
    public final Double f8763g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2354k9(int i10, String str, long j10, Long l10, Float f10, String str2, String str3, Double d10) {
        this.f8757a = i10;
        this.f8758b = str;
        this.f8759c = j10;
        this.f8760d = l10;
        if (i10 == 1) {
            this.f8763g = f10 != null ? Double.valueOf(f10.doubleValue()) : null;
        } else {
            this.f8763g = d10;
        }
        this.f8761e = str2;
        this.f8762f = str3;
    }

    /* renamed from: g */
    public final Object m9735g() {
        Long l10 = this.f8760d;
        if (l10 != null) {
            return l10;
        }
        Double d10 = this.f8763g;
        if (d10 != null) {
            return d10;
        }
        String str = this.f8761e;
        if (str != null) {
            return str;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        C2365l9.m9786a(this, parcel, i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2354k9(C2376m9 c2376m9) {
        this(c2376m9.f8845c, c2376m9.f8846d, c2376m9.f8847e, c2376m9.f8844b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2354k9(String str, long j10, Object obj, String str2) {
        AbstractC5391n.m21779e(str);
        this.f8757a = 2;
        this.f8758b = str;
        this.f8759c = j10;
        this.f8762f = str2;
        if (obj == null) {
            this.f8760d = null;
            this.f8763g = null;
            this.f8761e = null;
            return;
        }
        if (obj instanceof Long) {
            this.f8760d = (Long) obj;
            this.f8763g = null;
            this.f8761e = null;
        } else if (obj instanceof String) {
            this.f8760d = null;
            this.f8763g = null;
            this.f8761e = (String) obj;
        } else {
            if (obj instanceof Double) {
                this.f8760d = null;
                this.f8763g = (Double) obj;
                this.f8761e = null;
                return;
            }
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }
}
