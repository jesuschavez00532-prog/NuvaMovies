package com.taobao.accs.net;

import com.taobao.accs.data.Message;
import com.taobao.accs.utl.ALog;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.taobao.accs.net.b */
/* loaded from: classes.dex */
public class RunnableC3157b implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f12996a;

    /* renamed from: b */
    final /* synthetic */ boolean f12997b;

    /* renamed from: c */
    final /* synthetic */ AbstractC3156a f12998c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3157b(AbstractC3156a abstractC3156a, String str, boolean z10) {
        this.f12998c = abstractC3156a;
        this.f12996a = str;
        this.f12997b = z10;
    }

    @Override // java.lang.Runnable
    public void run() {
        Message m12778a = this.f12998c.f12982e.m12778a(this.f12996a);
        if (m12778a != null) {
            this.f12998c.f12982e.m12782a(m12778a, -9);
            this.f12998c.mo12845a(this.f12996a, this.f12997b, "receive data time out");
            ALog.m12940e(this.f12998c.mo12858d(), this.f12996a + "-> receive data time out!", new Object[0]);
        }
    }
}
