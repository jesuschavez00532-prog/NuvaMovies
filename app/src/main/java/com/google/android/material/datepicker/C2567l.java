package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.datepicker.l */
/* loaded from: classes.dex */
public final class C2567l implements Comparable, Parcelable {
    public static final Parcelable.Creator<C2567l> CREATOR = new a();

    /* renamed from: a */
    private final Calendar f9703a;

    /* renamed from: b */
    private final String f9704b;

    /* renamed from: c */
    final int f9705c;

    /* renamed from: d */
    final int f9706d;

    /* renamed from: e */
    final int f9707e;

    /* renamed from: f */
    final int f9708f;

    /* renamed from: g */
    final long f9709g;

    /* renamed from: com.google.android.material.datepicker.l$a */
    /* loaded from: classes.dex */
    static class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C2567l createFromParcel(Parcel parcel) {
            return C2567l.m10511b(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2567l[] newArray(int i10) {
            return new C2567l[i10];
        }
    }

    private C2567l(Calendar calendar) {
        calendar.set(5, 1);
        Calendar m10544d = AbstractC2576u.m10544d(calendar);
        this.f9703a = m10544d;
        this.f9705c = m10544d.get(2);
        this.f9706d = m10544d.get(1);
        this.f9707e = m10544d.getMaximum(7);
        this.f9708f = m10544d.getActualMaximum(5);
        this.f9704b = AbstractC2576u.m10554n().format(m10544d.getTime());
        this.f9709g = m10544d.getTimeInMillis();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C2567l m10511b(int i10, int i11) {
        Calendar m10551k = AbstractC2576u.m10551k();
        m10551k.set(1, i10);
        m10551k.set(2, i11);
        return new C2567l(m10551k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static C2567l m10512d(long j10) {
        Calendar m10551k = AbstractC2576u.m10551k();
        m10551k.setTimeInMillis(j10);
        return new C2567l(m10551k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public static C2567l m10513k() {
        return new C2567l(AbstractC2576u.m10549i());
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C2567l c2567l) {
        return this.f9703a.compareTo(c2567l.f9703a);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public int m10515e() {
        int firstDayOfWeek = this.f9703a.get(7) - this.f9703a.getFirstDayOfWeek();
        if (firstDayOfWeek < 0) {
            return firstDayOfWeek + this.f9707e;
        }
        return firstDayOfWeek;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2567l)) {
            return false;
        }
        C2567l c2567l = (C2567l) obj;
        if (this.f9705c == c2567l.f9705c && this.f9706d == c2567l.f9706d) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public long m10516f(int i10) {
        Calendar m10544d = AbstractC2576u.m10544d(this.f9703a);
        m10544d.set(5, i10);
        return m10544d.getTimeInMillis();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public String m10517g() {
        return this.f9704b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public long m10518h() {
        return this.f9703a.getTimeInMillis();
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f9705c), Integer.valueOf(this.f9706d)});
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public C2567l m10519i(int i10) {
        Calendar m10544d = AbstractC2576u.m10544d(this.f9703a);
        m10544d.add(2, i10);
        return new C2567l(m10544d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public int m10520j(C2567l c2567l) {
        if (this.f9703a instanceof GregorianCalendar) {
            return ((c2567l.f9706d - this.f9706d) * 12) + (c2567l.f9705c - this.f9705c);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f9706d);
        parcel.writeInt(this.f9705c);
    }
}
