package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import p233m4.AbstractC5593a;
import p233m4.AbstractC5595c;

/* renamed from: com.google.android.gms.measurement.internal.t */
/* loaded from: classes.dex */
public final class C2443t extends AbstractC5593a implements Iterable {
    public static final Parcelable.Creator<C2443t> CREATOR = new C2454u();

    /* renamed from: a */
    private final Bundle f9068a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2443t(Bundle bundle) {
        this.f9068a = bundle;
    }

    /* renamed from: g */
    public final int m10071g() {
        return this.f9068a.size();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C2432s(this);
    }

    /* renamed from: j */
    public final Bundle m10072j() {
        return new Bundle(this.f9068a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public final Double m10073k(String str) {
        return Double.valueOf(this.f9068a.getDouble("value"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public final Long m10074n(String str) {
        return Long.valueOf(this.f9068a.getLong("value"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public final Object m10075o(String str) {
        return this.f9068a.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public final String m10076p(String str) {
        return this.f9068a.getString(str);
    }

    public final String toString() {
        return this.f9068a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m22733a = AbstractC5595c.m22733a(parcel);
        AbstractC5595c.m22737e(parcel, 2, m10072j(), false);
        AbstractC5595c.m22734b(parcel, m22733a);
    }
}
