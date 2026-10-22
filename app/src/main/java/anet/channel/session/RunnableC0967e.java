package anet.channel.session;

import anet.channel.RequestCb;
import anet.channel.entity.C0935b;
import anet.channel.request.Request;

/* renamed from: anet.channel.session.e */
/* loaded from: classes.dex */
class RunnableC0967e implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Request f4028a;

    /* renamed from: b */
    final /* synthetic */ C0966d f4029b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0967e(C0966d c0966d, Request request) {
        this.f4029b = c0966d;
        this.f4028a = request;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i10 = C0964b.m4665a(this.f4028a, (RequestCb) null).f4021a;
        if (i10 > 0) {
            this.f4029b.notifyStatus(4, new C0935b(1));
        } else {
            this.f4029b.handleCallbacks(256, new C0935b(256, i10, "Http connect fail"));
        }
    }
}
