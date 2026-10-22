package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import anet.channel.entity.ConnType;

/* renamed from: com.google.android.gms.measurement.internal.v9 */
/* loaded from: classes.dex */
public final class C2475v9 {

    /* renamed from: a */
    private final C2415q4 f9169a;

    public C2475v9(C2415q4 c2415q4) {
        this.f9169a = c2415q4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m10091a(String str, Bundle bundle) {
        String uri;
        this.f9169a.mo9575a().mo9428h();
        if (!this.f9169a.m10044o()) {
            if (bundle.isEmpty()) {
                uri = null;
            } else {
                if (true == str.isEmpty()) {
                    str = ConnType.PK_AUTO;
                }
                Uri.Builder builder = new Uri.Builder();
                builder.path(str);
                for (String str2 : bundle.keySet()) {
                    builder.appendQueryParameter(str2, bundle.getString(str2));
                }
                uri = builder.build().toString();
            }
            if (!TextUtils.isEmpty(uri)) {
                this.f9169a.m10024F().f8354u.m10116b(uri);
                this.f9169a.m10024F().f8355v.m10098b(this.f9169a.mo9578c().mo24747a());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m10092b() {
        String str;
        this.f9169a.mo9575a().mo9428h();
        if (!m10094d()) {
            return;
        }
        if (m10095e()) {
            this.f9169a.m10024F().f8354u.m10116b(null);
            Bundle bundle = new Bundle();
            bundle.putString("source", "(not set)");
            bundle.putString("medium", "(not set)");
            bundle.putString("_cis", "intent");
            bundle.putLong("_cc", 1L);
            this.f9169a.m10026I().m10002u(ConnType.PK_AUTO, "_cmpx", bundle);
        } else {
            String m10115a = this.f9169a.m10024F().f8354u.m10115a();
            if (TextUtils.isEmpty(m10115a)) {
                this.f9169a.mo9577b().m9802t().m9699a("Cache still valid but referrer not found");
            } else {
                long m10097a = ((this.f9169a.m10024F().f8355v.m10097a() / 3600000) - 1) * 3600000;
                Uri parse = Uri.parse(m10115a);
                Bundle bundle2 = new Bundle();
                Pair pair = new Pair(parse.getPath(), bundle2);
                for (String str2 : parse.getQueryParameterNames()) {
                    bundle2.putString(str2, parse.getQueryParameter(str2));
                }
                ((Bundle) pair.second).putLong("_cc", m10097a);
                Object obj = pair.first;
                if (obj == null) {
                    str = "app";
                } else {
                    str = (String) obj;
                }
                this.f9169a.m10026I().m10002u(str, "_cmp", (Bundle) pair.second);
            }
            this.f9169a.m10024F().f8354u.m10116b(null);
        }
        this.f9169a.m10024F().f8355v.m10098b(0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final void m10093c() {
        if (m10094d() && m10095e()) {
            this.f9169a.m10024F().f8354u.m10116b(null);
        }
    }

    /* renamed from: d */
    final boolean m10094d() {
        if (this.f9169a.m10024F().f8355v.m10097a() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    final boolean m10095e() {
        if (!m10094d() || this.f9169a.mo9578c().mo24747a() - this.f9169a.m10024F().f8355v.m10097a() <= this.f9169a.m10051z().m9628r(null, AbstractC2260c3.f8438S)) {
            return false;
        }
        return true;
    }
}
