package p380w6;

import p380w6.C7375b;

/* renamed from: w6.f */
/* loaded from: classes.dex */
public abstract class AbstractC7379f {

    /* renamed from: w6.f$a */
    /* loaded from: classes.dex */
    public static abstract class a {
        /* renamed from: a */
        public abstract AbstractC7379f mo28456a();

        /* renamed from: b */
        public abstract a mo28457b(b bVar);

        /* renamed from: c */
        public abstract a mo28458c(String str);

        /* renamed from: d */
        public abstract a mo28459d(long j10);
    }

    /* renamed from: w6.f$b */
    /* loaded from: classes.dex */
    public enum b {
        OK,
        BAD_CONFIG,
        AUTH_ERROR
    }

    /* renamed from: a */
    public static a m28486a() {
        return new C7375b.b().mo28459d(0L);
    }

    /* renamed from: b */
    public abstract b mo28453b();

    /* renamed from: c */
    public abstract String mo28454c();

    /* renamed from: d */
    public abstract long mo28455d();
}
