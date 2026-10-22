package com.efs.sdk.pa;

/* renamed from: com.efs.sdk.pa.a */
/* loaded from: classes.dex */
public final class C1771a implements PAANRListener {

    /* renamed from: a */
    private PAFactory f7422a;

    /* renamed from: b */
    private PATraceListener f7423b;

    public C1771a(PAFactory pAFactory) {
        this.f7422a = pAFactory;
        this.f7423b = pAFactory.getTraceListener();
        boolean enableTracer = pAFactory.getConfigManager().enableTracer();
        PATraceListener pATraceListener = this.f7423b;
        if (pATraceListener != null) {
            pATraceListener.onCheck(enableTracer);
        }
    }

    @Override // com.efs.sdk.pa.PAANRListener
    public final void anrStack(String str) {
        if (str != null && str.length() > 200) {
            C1780c.m7871a(this.f7422a, "patrace", str);
            PATraceListener pATraceListener = this.f7423b;
            if (pATraceListener != null) {
                pATraceListener.onAnrTrace();
            }
        }
    }

    @Override // com.efs.sdk.pa.PAANRListener
    public final void unexcept(Object obj) {
        PATraceListener pATraceListener = this.f7423b;
        if (pATraceListener != null) {
            pATraceListener.onUnexcept(obj);
        }
    }
}
