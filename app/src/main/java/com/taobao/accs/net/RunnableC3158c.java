package com.taobao.accs.net;

import com.taobao.accs.utl.ALog;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.taobao.accs.net.c */
/* loaded from: classes.dex */
public class RunnableC3158c implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AbstractC3156a f12999a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3158c(AbstractC3156a abstractC3156a) {
        this.f12999a = abstractC3156a;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f12999a.f12982e.m12791c()) {
            ALog.m12940e(this.f12999a.mo12858d(), "receive ping time out! ", new Object[0]);
            AbstractC3162g.m12870a(this.f12999a.f12981d).m12874c();
            this.f12999a.mo12845a("", false, "receive ping timeout");
            this.f12999a.f12982e.m12780a(-12);
        }
    }
}
