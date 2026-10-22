package p337t5;

import android.content.Context;
import android.text.TextUtils;
import p219l4.AbstractC5388m;
import p219l4.AbstractC5391n;
import p219l4.C5400q;
import p281p4.AbstractC6209m;

/* renamed from: t5.k */
/* loaded from: classes.dex */
public final class C6920k {

    /* renamed from: a */
    private final String f26253a;

    /* renamed from: b */
    private final String f26254b;

    /* renamed from: c */
    private final String f26255c;

    /* renamed from: d */
    private final String f26256d;

    /* renamed from: e */
    private final String f26257e;

    /* renamed from: f */
    private final String f26258f;

    /* renamed from: g */
    private final String f26259g;

    private C6920k(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        AbstractC5391n.m21787m(!AbstractC6209m.m24777a(str), "ApplicationId must be set.");
        this.f26254b = str;
        this.f26253a = str2;
        this.f26255c = str3;
        this.f26256d = str4;
        this.f26257e = str5;
        this.f26258f = str6;
        this.f26259g = str7;
    }

    /* renamed from: a */
    public static C6920k m26879a(Context context) {
        C5400q c5400q = new C5400q(context);
        String m21802a = c5400q.m21802a("google_app_id");
        if (TextUtils.isEmpty(m21802a)) {
            return null;
        }
        return new C6920k(m21802a, c5400q.m21802a("google_api_key"), c5400q.m21802a("firebase_database_url"), c5400q.m21802a("ga_trackingId"), c5400q.m21802a("gcm_defaultSenderId"), c5400q.m21802a("google_storage_bucket"), c5400q.m21802a("project_id"));
    }

    /* renamed from: b */
    public String m26880b() {
        return this.f26253a;
    }

    /* renamed from: c */
    public String m26881c() {
        return this.f26254b;
    }

    /* renamed from: d */
    public String m26882d() {
        return this.f26257e;
    }

    /* renamed from: e */
    public String m26883e() {
        return this.f26259g;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C6920k)) {
            return false;
        }
        C6920k c6920k = (C6920k) obj;
        if (!AbstractC5388m.m21771a(this.f26254b, c6920k.f26254b) || !AbstractC5388m.m21771a(this.f26253a, c6920k.f26253a) || !AbstractC5388m.m21771a(this.f26255c, c6920k.f26255c) || !AbstractC5388m.m21771a(this.f26256d, c6920k.f26256d) || !AbstractC5388m.m21771a(this.f26257e, c6920k.f26257e) || !AbstractC5388m.m21771a(this.f26258f, c6920k.f26258f) || !AbstractC5388m.m21771a(this.f26259g, c6920k.f26259g)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AbstractC5388m.m21772b(this.f26254b, this.f26253a, this.f26255c, this.f26256d, this.f26257e, this.f26258f, this.f26259g);
    }

    public String toString() {
        return AbstractC5388m.m21773c(this).m21774a("applicationId", this.f26254b).m21774a("apiKey", this.f26253a).m21774a("databaseUrl", this.f26255c).m21774a("gcmSenderId", this.f26257e).m21774a("storageBucket", this.f26258f).m21774a("projectId", this.f26259g).toString();
    }
}
