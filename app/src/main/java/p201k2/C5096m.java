package p201k2;

import android.text.TextUtils;
import be.AbstractC1313i;
import be.InterfaceC1312h;
import me.InterfaceC5642a;
import ne.AbstractC5869l;
import nf.C5884b;
import p170i2.C4842a;
import p359ue.AbstractC7157k;

/* renamed from: k2.m */
/* loaded from: classes.dex */
public final class C5096m {

    /* renamed from: a */
    public static final C5096m f20979a = new C5096m();

    /* renamed from: b */
    private static final InterfaceC1312h f20980b = AbstractC1313i.m5963b(a.f20981a);

    /* renamed from: k2.m$a */
    /* loaded from: classes.dex */
    static final class a extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final a f20981a = new a();

        a() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            String obj = null;
            String m23718c = C5884b.m23718c();
            if (m23718c == null || (obj = AbstractC7157k.m27699b0(m23718c).toString()) == null) {
                return "";
            }
            return obj;
        }
    }

    private C5096m() {
    }

    /* renamed from: a */
    public final String m20690a() {
        return (String) f20980b.getValue();
    }

    /* renamed from: b */
    public final boolean m20691b() {
        if (C4842a.f20329a.m19920a().mo19965n() == 2) {
            return false;
        }
        return !TextUtils.isEmpty(m20690a());
    }

    /* renamed from: c */
    public final boolean m20692c() {
        int mo19965n = C4842a.f20329a.m19920a().mo19965n();
        if (mo19965n != 2 && (mo19965n != 3 || !TextUtils.isEmpty(m20690a()))) {
            return false;
        }
        return true;
    }
}
