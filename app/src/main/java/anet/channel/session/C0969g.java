package anet.channel.session;

import anet.channel.RequestCb;
import anet.channel.bytes.ByteArray;
import anet.channel.entity.C0935b;
import anet.channel.statist.RequestStatistic;
import anet.channel.util.ALog;
import anet.channel.util.HttpHelper;
import java.util.List;
import java.util.Map;

/* renamed from: anet.channel.session.g */
/* loaded from: classes.dex */
class C0969g implements RequestCb {

    /* renamed from: a */
    final /* synthetic */ RunnableC0968f f4034a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0969g(RunnableC0968f runnableC0968f) {
        this.f4034a = runnableC0968f;
    }

    @Override // anet.channel.RequestCb
    public void onDataReceive(ByteArray byteArray, boolean z10) {
        this.f4034a.f4031b.onDataReceive(byteArray, z10);
    }

    @Override // anet.channel.RequestCb
    public void onFinish(int i10, String str, RequestStatistic requestStatistic) {
        if (i10 <= 0 && i10 != -204) {
            this.f4034a.f4033d.handleCallbacks(2, new C0935b(2, 0, "Http connect fail"));
        }
        this.f4034a.f4031b.onFinish(i10, str, requestStatistic);
    }

    @Override // anet.channel.RequestCb
    public void onResponseCode(int i10, Map<String, List<String>> map) {
        ALog.m4788i("awcn.HttpSession", "", this.f4034a.f4030a.getSeq(), "httpStatusCode", Integer.valueOf(i10));
        ALog.m4788i("awcn.HttpSession", "", this.f4034a.f4030a.getSeq(), "response headers", map);
        this.f4034a.f4031b.onResponseCode(i10, map);
        this.f4034a.f4032c.serverRT = HttpHelper.parseServerRT(map);
        RunnableC0968f runnableC0968f = this.f4034a;
        runnableC0968f.f4033d.handleResponseCode(runnableC0968f.f4030a, i10);
        RunnableC0968f runnableC0968f2 = this.f4034a;
        runnableC0968f2.f4033d.handleResponseHeaders(runnableC0968f2.f4030a, map);
    }
}
