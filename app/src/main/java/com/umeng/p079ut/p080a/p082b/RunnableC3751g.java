package com.umeng.p079ut.p080a.p082b;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.p079ut.p080a.p081a.C3743a;
import com.umeng.p079ut.p080a.p081a.C3744b;
import com.umeng.p079ut.p080a.p083c.C3754c;
import com.umeng.p079ut.p080a.p083c.C3756e;
import com.umeng.p079ut.p084b.p087b.C3762a;
import com.umeng.p079ut.p084b.p087b.C3765d;
import com.umeng.p079ut.p084b.p087b.C3766e;

/* renamed from: com.umeng.ut.a.b.g */
/* loaded from: classes3.dex */
public class RunnableC3751g implements Runnable {

    /* renamed from: a */
    private static volatile boolean f16788a;

    /* renamed from: a */
    private Context f16789a;

    public RunnableC3751g(Context context) {
        this.f16789a = context;
    }

    /* renamed from: a */
    private void m15936a() {
        C3756e.m15958c();
        if (C3754c.m15946b(this.f16789a) && !f16788a) {
            f16788a = true;
            if (C3765d.m15978a(this.f16789a).m15991b()) {
                try {
                    m15939b();
                } catch (Throwable unused) {
                }
                f16788a = false;
            }
        }
    }

    /* renamed from: b */
    private void m15939b() {
        C3756e.m15958c();
        String m15938b = m15938b();
        if (TextUtils.isEmpty(m15938b)) {
            C3756e.m15954a("postData is empty", new Object[0]);
        } else if (m15937a(m15938b)) {
            C3756e.m15954a("", "upload success");
        } else {
            C3756e.m15954a("", "upload fail");
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            try {
                Thread.sleep(C3762a.m15972b());
            } catch (Exception unused) {
            }
            m15936a();
        } catch (Throwable th) {
            C3756e.m15953a("", th, new Object[0]);
        }
    }

    /* renamed from: a */
    private boolean m15937a(String str) {
        C3745a m15935a = C3746b.m15935a("https://audid.umeng.com/v3/a/audid/req", str, true);
        if (m15935a == null) {
            return false;
        }
        return C3766e.m15995a(m15935a);
    }

    /* renamed from: b */
    private String m15938b() {
        String m15974i = C3762a.m15971a().m15974i();
        if (TextUtils.isEmpty(m15974i)) {
            return null;
        }
        String m15931a = C3743a.m15931a(m15974i);
        if (C3756e.m15955a()) {
            C3756e.m15957b("", m15931a);
        }
        return C3744b.m15933b(m15931a);
    }
}
