package p324s3;

import android.util.Base64;
import p294q3.EnumC6337d;
import p324s3.C6656d;

/* renamed from: s3.o */
/* loaded from: classes.dex */
public abstract class AbstractC6667o {

    /* renamed from: s3.o$a */
    /* loaded from: classes.dex */
    public static abstract class a {
        /* renamed from: a */
        public abstract AbstractC6667o mo26007a();

        /* renamed from: b */
        public abstract a mo26008b(String str);

        /* renamed from: c */
        public abstract a mo26009c(byte[] bArr);

        /* renamed from: d */
        public abstract a mo26010d(EnumC6337d enumC6337d);
    }

    /* renamed from: a */
    public static a m26037a() {
        return new C6656d.b().mo26010d(EnumC6337d.DEFAULT);
    }

    /* renamed from: b */
    public abstract String mo26004b();

    /* renamed from: c */
    public abstract byte[] mo26005c();

    /* renamed from: d */
    public abstract EnumC6337d mo26006d();

    /* renamed from: e */
    public boolean m26038e() {
        if (mo26005c() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public AbstractC6667o m26039f(EnumC6337d enumC6337d) {
        return m26037a().mo26008b(mo26004b()).mo26010d(enumC6337d).mo26009c(mo26005c()).mo26007a();
    }

    public final String toString() {
        String encodeToString = null;
        Object[] objArr = new Object[3];
        objArr[0] = mo26004b();
        objArr[1] = mo26006d();
        if (mo26005c() == null) {
            encodeToString = "";
        } else {
            encodeToString = Base64.encodeToString(mo26005c(), 2);
        }
        objArr[2] = encodeToString;
        return String.format("TransportContext(%s, %s, %s)", objArr);
    }
}
