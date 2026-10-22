package com.google.android.gms.measurement.internal;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import anet.channel.entity.ConnType;
import com.google.android.gms.internal.measurement.InterfaceC2124t0;
import com.raizlabs.android.dbflow.sql.language.Operator;
import com.umeng.analytics.pro.C3325bt;
import p259o4.C5915b;

/* renamed from: com.google.android.gms.measurement.internal.b4 */
/* loaded from: classes.dex */
final class RunnableC2250b4 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ InterfaceC2124t0 f8386a;

    /* renamed from: b */
    final /* synthetic */ ServiceConnection f8387b;

    /* renamed from: c */
    final /* synthetic */ ServiceConnectionC2261c4 f8388c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2250b4(ServiceConnectionC2261c4 serviceConnectionC2261c4, InterfaceC2124t0 interfaceC2124t0, ServiceConnection serviceConnection) {
        this.f8388c = serviceConnectionC2261c4;
        this.f8386a = interfaceC2124t0;
        this.f8387b = serviceConnection;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        ServiceConnectionC2261c4 serviceConnectionC2261c4 = this.f8388c;
        C2272d4 c2272d4 = serviceConnectionC2261c4.f8499b;
        str = serviceConnectionC2261c4.f8498a;
        InterfaceC2124t0 interfaceC2124t0 = this.f8386a;
        ServiceConnection serviceConnection = this.f8387b;
        c2272d4.f8535a.mo9575a().mo9428h();
        Bundle bundle = new Bundle();
        bundle.putString(C3325bt.f14273o, str);
        Bundle bundle2 = null;
        try {
            Bundle mo8866b = interfaceC2124t0.mo8866b(bundle);
            if (mo8866b == null) {
                c2272d4.f8535a.mo9577b().m9800r().m9699a("Install Referrer Service returned a null response");
            } else {
                bundle2 = mo8866b;
            }
        } catch (Exception e10) {
            c2272d4.f8535a.mo9577b().m9800r().m9700b("Exception occurred while retrieving the Install Referrer", e10.getMessage());
        }
        c2272d4.f8535a.mo9575a().mo9428h();
        C2415q4.m10015t();
        if (bundle2 != null) {
            long j10 = bundle2.getLong("install_begin_timestamp_seconds", 0L) * 1000;
            if (j10 == 0) {
                c2272d4.f8535a.mo9577b().m9805w().m9699a("Service response is missing Install Referrer install timestamp");
            } else {
                String string = bundle2.getString("install_referrer");
                if (string != null && !string.isEmpty()) {
                    c2272d4.f8535a.mo9577b().m9804v().m9700b("InstallReferrer API result", string);
                    Bundle m9951t0 = c2272d4.f8535a.m10031N().m9951t0(Uri.parse(Operator.Operation.EMPTY_PARAM.concat(string)));
                    if (m9951t0 == null) {
                        c2272d4.f8535a.mo9577b().m9800r().m9699a("No campaign params defined in Install Referrer result");
                    } else {
                        String string2 = m9951t0.getString("medium");
                        if (string2 != null && !"(not set)".equalsIgnoreCase(string2) && !"organic".equalsIgnoreCase(string2)) {
                            long j11 = bundle2.getLong("referrer_click_timestamp_seconds", 0L) * 1000;
                            if (j11 == 0) {
                                c2272d4.f8535a.mo9577b().m9800r().m9699a("Install Referrer is missing click timestamp for ad campaign");
                            } else {
                                m9951t0.putLong("click_timestamp", j11);
                            }
                        }
                        if (j10 == c2272d4.f8535a.m10024F().f8339f.m10097a()) {
                            c2272d4.f8535a.mo9577b().m9804v().m9699a("Logging Install Referrer campaign from module while it may have already been logged.");
                        }
                        if (c2272d4.f8535a.m10044o()) {
                            c2272d4.f8535a.m10024F().f8339f.m10098b(j10);
                            c2272d4.f8535a.mo9577b().m9804v().m9700b("Logging Install Referrer campaign from gmscore with ", "referrer API v2");
                            m9951t0.putString("_cis", "referrer API v2");
                            c2272d4.f8535a.m10026I().m10001t(ConnType.PK_AUTO, "_cmp", m9951t0, str);
                        }
                    }
                } else {
                    c2272d4.f8535a.mo9577b().m9800r().m9699a("No referrer defined in Install Referrer response");
                }
            }
        }
        C5915b.m23917b().m23923c(c2272d4.f8535a.mo9584f(), serviceConnection);
    }
}
