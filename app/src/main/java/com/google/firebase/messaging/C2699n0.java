package com.google.firebase.messaging;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.messaging.AbstractC2675e;
import java.util.Map;
import p233m4.AbstractC5593a;

/* renamed from: com.google.firebase.messaging.n0 */
/* loaded from: classes.dex */
public final class C2699n0 extends AbstractC5593a {
    public static final Parcelable.Creator<C2699n0> CREATOR = new C2701o0();

    /* renamed from: a */
    Bundle f10331a;

    /* renamed from: b */
    private Map f10332b;

    /* renamed from: c */
    private b f10333c;

    /* renamed from: com.google.firebase.messaging.n0$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        private final String f10334a;

        /* renamed from: b */
        private final String f10335b;

        /* renamed from: c */
        private final String[] f10336c;

        /* renamed from: d */
        private final String f10337d;

        /* renamed from: e */
        private final String f10338e;

        /* renamed from: f */
        private final String[] f10339f;

        /* renamed from: g */
        private final String f10340g;

        /* renamed from: h */
        private final String f10341h;

        /* renamed from: i */
        private final String f10342i;

        /* renamed from: j */
        private final String f10343j;

        /* renamed from: k */
        private final String f10344k;

        /* renamed from: l */
        private final String f10345l;

        /* renamed from: m */
        private final String f10346m;

        /* renamed from: n */
        private final Uri f10347n;

        /* renamed from: o */
        private final String f10348o;

        /* renamed from: p */
        private final Integer f10349p;

        /* renamed from: q */
        private final Integer f10350q;

        /* renamed from: r */
        private final Integer f10351r;

        /* renamed from: s */
        private final int[] f10352s;

        /* renamed from: t */
        private final Long f10353t;

        /* renamed from: u */
        private final boolean f10354u;

        /* renamed from: v */
        private final boolean f10355v;

        /* renamed from: w */
        private final boolean f10356w;

        /* renamed from: x */
        private final boolean f10357x;

        /* renamed from: y */
        private final boolean f10358y;

        /* renamed from: z */
        private final long[] f10359z;

        /* renamed from: b */
        private static String[] m11289b(C2682g0 c2682g0, String str) {
            Object[] m11231g = c2682g0.m11231g(str);
            if (m11231g == null) {
                return null;
            }
            String[] strArr = new String[m11231g.length];
            for (int i10 = 0; i10 < m11231g.length; i10++) {
                strArr[i10] = String.valueOf(m11231g[i10]);
            }
            return strArr;
        }

        /* renamed from: a */
        public String m11290a() {
            return this.f10337d;
        }

        /* renamed from: c */
        public String m11291c() {
            return this.f10334a;
        }

        private b(C2682g0 c2682g0) {
            this.f10334a = c2682g0.m11240p("gcm.n.title");
            this.f10335b = c2682g0.m11232h("gcm.n.title");
            this.f10336c = m11289b(c2682g0, "gcm.n.title");
            this.f10337d = c2682g0.m11240p("gcm.n.body");
            this.f10338e = c2682g0.m11232h("gcm.n.body");
            this.f10339f = m11289b(c2682g0, "gcm.n.body");
            this.f10340g = c2682g0.m11240p("gcm.n.icon");
            this.f10342i = c2682g0.m11239o();
            this.f10343j = c2682g0.m11240p("gcm.n.tag");
            this.f10344k = c2682g0.m11240p("gcm.n.color");
            this.f10345l = c2682g0.m11240p("gcm.n.click_action");
            this.f10346m = c2682g0.m11240p("gcm.n.android_channel_id");
            this.f10347n = c2682g0.m11230f();
            this.f10341h = c2682g0.m11240p("gcm.n.image");
            this.f10348o = c2682g0.m11240p("gcm.n.ticker");
            this.f10349p = c2682g0.m11227b("gcm.n.notification_priority");
            this.f10350q = c2682g0.m11227b("gcm.n.visibility");
            this.f10351r = c2682g0.m11227b("gcm.n.notification_count");
            this.f10354u = c2682g0.m11226a("gcm.n.sticky");
            this.f10355v = c2682g0.m11226a("gcm.n.local_only");
            this.f10356w = c2682g0.m11226a("gcm.n.default_sound");
            this.f10357x = c2682g0.m11226a("gcm.n.default_vibrate_timings");
            this.f10358y = c2682g0.m11226a("gcm.n.default_light_settings");
            this.f10353t = c2682g0.m11234j("gcm.n.event_time");
            this.f10352s = c2682g0.m11229e();
            this.f10359z = c2682g0.m11241q();
        }
    }

    public C2699n0(Bundle bundle) {
        this.f10331a = bundle;
    }

    /* renamed from: g */
    public Map m11287g() {
        if (this.f10332b == null) {
            this.f10332b = AbstractC2675e.a.m11173a(this.f10331a);
        }
        return this.f10332b;
    }

    /* renamed from: i */
    public b m11288i() {
        if (this.f10333c == null && C2682g0.m11221t(this.f10331a)) {
            this.f10333c = new b(new C2682g0(this.f10331a));
        }
        return this.f10333c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        C2701o0.m11299c(this, parcel, i10);
    }
}
