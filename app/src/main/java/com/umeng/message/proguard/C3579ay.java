package com.umeng.message.proguard;

import android.text.TextUtils;
import com.lzy.okgo.OkGo;
import org.android.agoo.common.AgooConstants;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.umeng.message.proguard.ay */
/* loaded from: classes3.dex */
public final class C3579ay {

    /* renamed from: a */
    final C3586bd f16039a = new C3586bd(AgooConstants.MESSAGE_NOTIFICATION);

    /* renamed from: e */
    private long m15362e() {
        return this.f16039a.m15400b("rep_ts", 0L);
    }

    /* renamed from: a */
    public final boolean m15365a() {
        return this.f16039a.m15403b("e_u", true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final long m15366b() {
        return this.f16039a.m15400b("req_ts", 0L);
    }

    /* renamed from: c */
    public final boolean m15368c() {
        if (Math.abs(System.currentTimeMillis() - m15362e()) < OkGo.DEFAULT_MILLISECONDS) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final String m15369d() {
        String m15401b = this.f16039a.m15401b("info", "");
        if (!TextUtils.isEmpty(m15401b)) {
            try {
                return new String(C3588bf.m15405a(m15401b));
            } catch (Exception unused) {
            }
        }
        return "";
    }

    /* renamed from: a */
    public final void m15364a(boolean z10) {
        this.f16039a.m15398a("e_s", z10);
    }

    /* renamed from: b */
    public final void m15367b(boolean z10) {
        this.f16039a.m15398a("sync", z10);
    }

    /* renamed from: a */
    public final void m15363a(long j10) {
        this.f16039a.m15395a("rep_ts", j10);
    }
}
