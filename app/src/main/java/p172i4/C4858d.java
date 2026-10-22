package p172i4;

import android.os.Parcel;
import android.os.Parcelable;
import com.lzy.okgo.cookie.SerializableCookie;
import p219l4.AbstractC5388m;
import p233m4.AbstractC5593a;
import p233m4.AbstractC5595c;

/* renamed from: i4.d */
/* loaded from: classes.dex */
public class C4858d extends AbstractC5593a {
    public static final Parcelable.Creator<C4858d> CREATOR = new C4891v();

    /* renamed from: a */
    private final String f20344a;

    /* renamed from: b */
    private final int f20345b;

    /* renamed from: c */
    private final long f20346c;

    public C4858d(String str, int i10, long j10) {
        this.f20344a = str;
        this.f20345b = i10;
        this.f20346c = j10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4858d) {
            C4858d c4858d = (C4858d) obj;
            if (((m20027g() != null && m20027g().equals(c4858d.m20027g())) || (m20027g() == null && c4858d.m20027g() == null)) && m20028i() == c4858d.m20028i()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public String m20027g() {
        return this.f20344a;
    }

    public final int hashCode() {
        return AbstractC5388m.m21772b(m20027g(), Long.valueOf(m20028i()));
    }

    /* renamed from: i */
    public long m20028i() {
        long j10 = this.f20346c;
        return j10 == -1 ? this.f20345b : j10;
    }

    public final String toString() {
        AbstractC5388m.a m21773c = AbstractC5388m.m21773c(this);
        m21773c.m21774a(SerializableCookie.NAME, m20027g());
        m21773c.m21774a("version", Long.valueOf(m20028i()));
        return m21773c.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m22733a = AbstractC5595c.m22733a(parcel);
        AbstractC5595c.m22746n(parcel, 1, m20027g(), false);
        AbstractC5595c.m22741i(parcel, 2, this.f20345b);
        AbstractC5595c.m22743k(parcel, 3, m20028i());
        AbstractC5595c.m22734b(parcel, m22733a);
    }

    public C4858d(String str, long j10) {
        this.f20344a = str;
        this.f20346c = j10;
        this.f20345b = -1;
    }
}
