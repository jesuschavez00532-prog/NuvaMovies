package anet.channel;

import android.content.Context;
import anet.channel.SessionRequest;
import anet.channel.util.C1024i;

/* renamed from: anet.channel.i */
/* loaded from: classes.dex */
class RunnableC0945i implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Session f3913a;

    /* renamed from: b */
    final /* synthetic */ SessionRequest.C0892a f3914b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0945i(SessionRequest.C0892a c0892a, Session session) {
        this.f3914b = c0892a;
        this.f3913a = session;
    }

    @Override // java.lang.Runnable
    public void run() {
        Context context;
        try {
            SessionRequest.C0892a c0892a = this.f3914b;
            SessionRequest sessionRequest = SessionRequest.this;
            context = c0892a.f3775c;
            sessionRequest.m4495a(context, this.f3913a.getConnType().getType(), C1024i.m4812a(SessionRequest.this.f3761a.f3752c), (SessionGetCallback) null, 0L);
        } catch (Exception unused) {
        }
    }
}
