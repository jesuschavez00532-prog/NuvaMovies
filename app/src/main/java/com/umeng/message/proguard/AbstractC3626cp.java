package com.umeng.message.proguard;

import com.umeng.message.proguard.AbstractC3627cq;
import org.json.JSONObject;

/* renamed from: com.umeng.message.proguard.cp */
/* loaded from: classes3.dex */
abstract class AbstractC3626cp {
    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final void m15547a(C3621ck c3621ck, int i10, int i11) {
        mo15549a(c3621ck, i10, i11, null, null);
    }

    /* renamed from: a */
    protected abstract void mo15549a(C3621ck c3621ck, int i10, int i11, String str, JSONObject jSONObject);

    /* renamed from: a */
    public abstract void mo15550a(C3621ck c3621ck, AbstractC3627cq.a aVar);

    /* renamed from: a */
    public abstract void mo15551a(C3621ck c3621ck, boolean z10, AbstractC3627cq.a aVar);

    /* renamed from: a */
    public abstract void mo15552a(String str, C3621ck c3621ck);

    /* renamed from: a */
    public abstract boolean mo15554a(C3621ck c3621ck);

    /* renamed from: b */
    public final void m15555b(C3621ck c3621ck, int i10) {
        m15547a(c3621ck, 2, i10);
    }

    /* renamed from: c */
    public final void m15556c(C3621ck c3621ck, int i10) {
        m15547a(c3621ck, 3, i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final void m15548a(C3621ck c3621ck, int i10, int i11, String str) {
        mo15549a(c3621ck, i10, i11, str, null);
    }

    /* renamed from: a */
    public final void m15546a(C3621ck c3621ck, int i10) {
        m15547a(c3621ck, 1, i10);
    }

    /* renamed from: a */
    public final void m15553a(boolean z10, C3621ck c3621ck, boolean z11, int i10, int i11, long j10) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("v_play", z11 ? 1 : 0);
            jSONObject.put("v_play_t", i10);
            jSONObject.put("v_duration", i11);
            jSONObject.put("v_view_t", j10);
            mo15549a(c3621ck, 6, z10 ? 6000 : 6001, null, jSONObject);
        } catch (Throwable unused) {
        }
    }
}
