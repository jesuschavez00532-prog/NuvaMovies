package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: com.google.android.material.datepicker.a */
/* loaded from: classes.dex */
public final class C2556a implements Parcelable {
    public static final Parcelable.Creator<C2556a> CREATOR = new a();

    /* renamed from: a */
    private final C2567l f9616a;

    /* renamed from: b */
    private final C2567l f9617b;

    /* renamed from: c */
    private final C2567l f9618c;

    /* renamed from: d */
    private final c f9619d;

    /* renamed from: e */
    private final int f9620e;

    /* renamed from: f */
    private final int f9621f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.datepicker.a$a */
    /* loaded from: classes.dex */
    public static class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C2556a createFromParcel(Parcel parcel) {
            return new C2556a((C2567l) parcel.readParcelable(C2567l.class.getClassLoader()), (C2567l) parcel.readParcelable(C2567l.class.getClassLoader()), (C2567l) parcel.readParcelable(C2567l.class.getClassLoader()), (c) parcel.readParcelable(c.class.getClassLoader()), null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2556a[] newArray(int i10) {
            return new C2556a[i10];
        }
    }

    /* renamed from: com.google.android.material.datepicker.a$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: e */
        static final long f9622e = AbstractC2576u.m10541a(C2567l.m10511b(1900, 0).f9709g);

        /* renamed from: f */
        static final long f9623f = AbstractC2576u.m10541a(C2567l.m10511b(2100, 11).f9709g);

        /* renamed from: a */
        private long f9624a;

        /* renamed from: b */
        private long f9625b;

        /* renamed from: c */
        private Long f9626c;

        /* renamed from: d */
        private c f9627d;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(C2556a c2556a) {
            this.f9624a = f9622e;
            this.f9625b = f9623f;
            this.f9627d = C2562g.m10472a(Long.MIN_VALUE);
            this.f9624a = c2556a.f9616a.f9709g;
            this.f9625b = c2556a.f9617b.f9709g;
            this.f9626c = Long.valueOf(c2556a.f9618c.f9709g);
            this.f9627d = c2556a.f9619d;
        }

        /* renamed from: a */
        public C2556a m10462a() {
            if (this.f9626c == null) {
                long m10506Q9 = C2565j.m10506Q9();
                long j10 = this.f9624a;
                if (j10 > m10506Q9 || m10506Q9 > this.f9625b) {
                    m10506Q9 = j10;
                }
                this.f9626c = Long.valueOf(m10506Q9);
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.f9627d);
            return new C2556a(C2567l.m10512d(this.f9624a), C2567l.m10512d(this.f9625b), C2567l.m10512d(this.f9626c.longValue()), (c) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY"), null);
        }

        /* renamed from: b */
        public b m10463b(long j10) {
            this.f9626c = Long.valueOf(j10);
            return this;
        }
    }

    /* renamed from: com.google.android.material.datepicker.a$c */
    /* loaded from: classes.dex */
    public interface c extends Parcelable {
        /* renamed from: c */
        boolean mo10464c(long j10);
    }

    /* synthetic */ C2556a(C2567l c2567l, C2567l c2567l2, C2567l c2567l3, c cVar, a aVar) {
        this(c2567l, c2567l2, c2567l3, cVar);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2556a)) {
            return false;
        }
        C2556a c2556a = (C2556a) obj;
        if (this.f9616a.equals(c2556a.f9616a) && this.f9617b.equals(c2556a.f9617b) && this.f9618c.equals(c2556a.f9618c) && this.f9619d.equals(c2556a.f9619d)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public c m10454f() {
        return this.f9619d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public C2567l m10455g() {
        return this.f9617b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public int m10456h() {
        return this.f9621f;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9616a, this.f9617b, this.f9618c, this.f9619d});
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public C2567l m10457i() {
        return this.f9618c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public C2567l m10458j() {
        return this.f9616a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public int m10459k() {
        return this.f9620e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f9616a, 0);
        parcel.writeParcelable(this.f9617b, 0);
        parcel.writeParcelable(this.f9618c, 0);
        parcel.writeParcelable(this.f9619d, 0);
    }

    private C2556a(C2567l c2567l, C2567l c2567l2, C2567l c2567l3, c cVar) {
        this.f9616a = c2567l;
        this.f9617b = c2567l2;
        this.f9618c = c2567l3;
        this.f9619d = cVar;
        if (c2567l.compareTo(c2567l3) <= 0) {
            if (c2567l3.compareTo(c2567l2) <= 0) {
                this.f9621f = c2567l.m10520j(c2567l2) + 1;
                this.f9620e = (c2567l2.f9706d - c2567l.f9706d) + 1;
                return;
            }
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        throw new IllegalArgumentException("start Month cannot be after current Month");
    }
}
