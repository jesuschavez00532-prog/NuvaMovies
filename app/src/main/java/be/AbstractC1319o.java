package be;

import java.io.Serializable;
import ne.AbstractC5864g;
import ne.AbstractC5868k;

/* renamed from: be.o */
/* loaded from: classes3.dex */
public abstract class AbstractC1319o implements Serializable {

    /* renamed from: a */
    public static final a f4987a = new a(null);

    /* renamed from: be.o$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC5864g abstractC5864g) {
            this();
        }
    }

    /* renamed from: be.o$b */
    /* loaded from: classes3.dex */
    public static final class b implements Serializable {

        /* renamed from: a */
        public final Throwable f4988a;

        public b(Throwable th) {
            AbstractC5868k.m23674f(th, "exception");
            this.f4988a = th;
        }

        public boolean equals(Object obj) {
            if ((obj instanceof b) && AbstractC5868k.m23669a(this.f4988a, ((b) obj).f4988a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f4988a.hashCode();
        }

        public String toString() {
            return "Failure(" + this.f4988a + ')';
        }
    }

    /* renamed from: a */
    public static Object m5971a(Object obj) {
        return obj;
    }

    /* renamed from: b */
    public static final Throwable m5972b(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).f4988a;
        }
        return null;
    }

    /* renamed from: c */
    public static final boolean m5973c(Object obj) {
        return obj instanceof b;
    }

    /* renamed from: d */
    public static final boolean m5974d(Object obj) {
        return !(obj instanceof b);
    }
}
