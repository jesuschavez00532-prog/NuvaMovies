package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import p219l4.AbstractC5391n;
import p233m4.AbstractC5593a;
import p233m4.AbstractC5595c;

/* loaded from: classes.dex */
public final class Scope extends AbstractC5593a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new C1788a();

    /* renamed from: a */
    final int f7517a;

    /* renamed from: b */
    private final String f7518b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Scope(int i10, String str) {
        AbstractC5391n.m21780f(str, "scopeUri must not be null or empty");
        this.f7517a = i10;
        this.f7518b = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f7518b.equals(((Scope) obj).f7518b);
    }

    /* renamed from: g */
    public String m7911g() {
        return this.f7518b;
    }

    public int hashCode() {
        return this.f7518b.hashCode();
    }

    public String toString() {
        return this.f7518b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m22733a = AbstractC5595c.m22733a(parcel);
        AbstractC5595c.m22741i(parcel, 1, this.f7517a);
        AbstractC5595c.m22746n(parcel, 2, m7911g(), false);
        AbstractC5595c.m22734b(parcel, m22733a);
    }

    public Scope(String str) {
        this(1, str);
    }
}
