package p219l4;

import android.os.Bundle;
import p187j4.C4987a;

/* renamed from: l4.u */
/* loaded from: classes.dex */
public class C5408u implements C4987a.d {

    /* renamed from: b */
    public static final C5408u f22040b = m21813a().m21815a();

    /* renamed from: a */
    private final String f22041a;

    /* renamed from: l4.u$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        private String f22042a;

        /* synthetic */ a(AbstractC5412w abstractC5412w) {
        }

        /* renamed from: a */
        public C5408u m21815a() {
            return new C5408u(this.f22042a, null);
        }
    }

    /* synthetic */ C5408u(String str, AbstractC5414x abstractC5414x) {
        this.f22041a = str;
    }

    /* renamed from: a */
    public static a m21813a() {
        return new a(null);
    }

    /* renamed from: b */
    public final Bundle m21814b() {
        Bundle bundle = new Bundle();
        String str = this.f22041a;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5408u)) {
            return false;
        }
        return AbstractC5388m.m21771a(this.f22041a, ((C5408u) obj).f22041a);
    }

    public final int hashCode() {
        return AbstractC5388m.m21772b(this.f22041a);
    }
}
