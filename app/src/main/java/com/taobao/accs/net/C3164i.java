package com.taobao.accs.net;

import anet.channel.strategy.dispatch.DispatchEvent;
import anet.channel.strategy.dispatch.HttpDispatcher;
import com.taobao.accs.common.ThreadPoolExecutorFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.taobao.accs.net.i */
/* loaded from: classes.dex */
public class C3164i implements HttpDispatcher.IDispatchEventListener {

    /* renamed from: a */
    final /* synthetic */ C3163h f13014a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3164i(C3163h c3163h) {
        this.f13014a = c3163h;
    }

    @Override // anet.channel.strategy.dispatch.HttpDispatcher.IDispatchEventListener
    public void onEvent(DispatchEvent dispatchEvent) {
        ThreadPoolExecutorFactory.schedule(new RunnableC3165j(this), 2000L, TimeUnit.MILLISECONDS);
    }
}
