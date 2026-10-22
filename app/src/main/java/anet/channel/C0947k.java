package anet.channel;

import anet.channel.util.HttpConstant;
import java.util.Map;
import p183j0.InterfaceC4969c;

/* renamed from: anet.channel.k */
/* loaded from: classes.dex */
class C0947k implements InterfaceC4969c {

    /* renamed from: a */
    final /* synthetic */ RunnableC0946j f3915a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0947k(RunnableC0946j runnableC0946j) {
        this.f3915a = runnableC0946j;
    }

    public boolean handleCache(String str, Map<String, String> map) {
        return "weex".equals(map.get(HttpConstant.F_REFER));
    }
}
