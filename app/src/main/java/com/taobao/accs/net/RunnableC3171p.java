package com.taobao.accs.net;

import com.taobao.accs.data.Message;
import com.taobao.accs.utl.ALog;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.taobao.accs.net.p */
/* loaded from: classes.dex */
public class RunnableC3171p implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f13035a;

    /* renamed from: b */
    final /* synthetic */ boolean f13036b;

    /* renamed from: c */
    final /* synthetic */ C3166k f13037c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3171p(C3166k c3166k, String str, boolean z10) {
        this.f13037c = c3166k;
        this.f13035a = str;
        this.f13036b = z10;
    }

    @Override // java.lang.Runnable
    public void run() {
        Message m12778a = this.f13037c.f12982e.m12778a(this.f13035a);
        if (m12778a != null) {
            this.f13037c.f12982e.m12782a(m12778a, -9);
            this.f13037c.mo12845a(this.f13035a, this.f13036b, "receive data time out");
            ALog.m12940e(this.f13037c.mo12858d(), this.f13035a + "-> receive data time out!", new Object[0]);
        }
    }
}
