package p309r3;

import java.util.List;
import p309r3.C6520g;

/* renamed from: r3.m */
/* loaded from: classes.dex */
public abstract class AbstractC6526m {

    /* renamed from: r3.m$a */
    /* loaded from: classes.dex */
    public static abstract class a {
        /* renamed from: a */
        public abstract AbstractC6526m mo25530a();

        /* renamed from: b */
        public abstract a mo25531b(AbstractC6524k abstractC6524k);

        /* renamed from: c */
        public abstract a mo25532c(List list);

        /* renamed from: d */
        abstract a mo25533d(Integer num);

        /* renamed from: e */
        abstract a mo25534e(String str);

        /* renamed from: f */
        public abstract a mo25535f(EnumC6529p enumC6529p);

        /* renamed from: g */
        public abstract a mo25536g(long j10);

        /* renamed from: h */
        public abstract a mo25537h(long j10);

        /* renamed from: i */
        public a m25551i(int i10) {
            return mo25533d(Integer.valueOf(i10));
        }

        /* renamed from: j */
        public a m25552j(String str) {
            return mo25534e(str);
        }
    }

    /* renamed from: a */
    public static a m25550a() {
        return new C6520g.b();
    }

    /* renamed from: b */
    public abstract AbstractC6524k mo25523b();

    /* renamed from: c */
    public abstract List mo25524c();

    /* renamed from: d */
    public abstract Integer mo25525d();

    /* renamed from: e */
    public abstract String mo25526e();

    /* renamed from: f */
    public abstract EnumC6529p mo25527f();

    /* renamed from: g */
    public abstract long mo25528g();

    /* renamed from: h */
    public abstract long mo25529h();
}
