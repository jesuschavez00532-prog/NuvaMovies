package p324s3;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p324s3.C6654b;

/* renamed from: s3.i */
/* loaded from: classes.dex */
public abstract class AbstractC6661i {

    /* renamed from: s3.i$a */
    /* loaded from: classes.dex */
    public static abstract class a {
        /* renamed from: a */
        public final a m26026a(String str, int i10) {
            mo25986e().put(str, String.valueOf(i10));
            return this;
        }

        /* renamed from: b */
        public final a m26027b(String str, long j10) {
            mo25986e().put(str, String.valueOf(j10));
            return this;
        }

        /* renamed from: c */
        public final a m26028c(String str, String str2) {
            mo25986e().put(str, str2);
            return this;
        }

        /* renamed from: d */
        public abstract AbstractC6661i mo25985d();

        /* renamed from: e */
        protected abstract Map mo25986e();

        /* renamed from: f */
        protected abstract a mo25987f(Map map);

        /* renamed from: g */
        public abstract a mo25988g(Integer num);

        /* renamed from: h */
        public abstract a mo25989h(C6660h c6660h);

        /* renamed from: i */
        public abstract a mo25990i(long j10);

        /* renamed from: j */
        public abstract a mo25991j(String str);

        /* renamed from: k */
        public abstract a mo25992k(long j10);
    }

    /* renamed from: a */
    public static a m26020a() {
        return new C6654b.b().mo25987f(new HashMap());
    }

    /* renamed from: b */
    public final String m26021b(String str) {
        String str2 = (String) mo25979c().get(str);
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public abstract Map mo25979c();

    /* renamed from: d */
    public abstract Integer mo25980d();

    /* renamed from: e */
    public abstract C6660h mo25981e();

    /* renamed from: f */
    public abstract long mo25982f();

    /* renamed from: g */
    public final int m26022g(String str) {
        String str2 = (String) mo25979c().get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    /* renamed from: h */
    public final long m26023h(String str) {
        String str2 = (String) mo25979c().get(str);
        if (str2 == null) {
            return 0L;
        }
        return Long.valueOf(str2).longValue();
    }

    /* renamed from: i */
    public final Map m26024i() {
        return Collections.unmodifiableMap(mo25979c());
    }

    /* renamed from: j */
    public abstract String mo25983j();

    /* renamed from: k */
    public abstract long mo25984k();

    /* renamed from: l */
    public a m26025l() {
        return new C6654b.b().mo25991j(mo25983j()).mo25988g(mo25980d()).mo25989h(mo25981e()).mo25990i(mo25982f()).mo25992k(mo25984k()).mo25987f(new HashMap(mo25979c()));
    }
}
