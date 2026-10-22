package anet.channel.session;

import anet.channel.RequestCb;
import anet.channel.request.Request;
import anet.channel.statist.RequestStatistic;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: anet.channel.session.f */
/* loaded from: classes.dex */
public class RunnableC0968f implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Request f4030a;

    /* renamed from: b */
    final /* synthetic */ RequestCb f4031b;

    /* renamed from: c */
    final /* synthetic */ RequestStatistic f4032c;

    /* renamed from: d */
    final /* synthetic */ C0966d f4033d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0968f(C0966d c0966d, Request request, RequestCb requestCb, RequestStatistic requestStatistic) {
        this.f4033d = c0966d;
        this.f4030a = request;
        this.f4031b = requestCb;
        this.f4032c = requestStatistic;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f4030a.f3956a.sendBeforeTime = System.currentTimeMillis() - this.f4030a.f3956a.reqStart;
        C0964b.m4665a(this.f4030a, new C0969g(this));
    }
}
