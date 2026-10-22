package anet.channel.strategy;

import anet.channel.util.HttpConstant;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: anet.channel.strategy.c */
/* loaded from: classes.dex */
public class C0987c {

    /* renamed from: a */
    private final ConcurrentHashMap<String, String> f4112a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private boolean f4113b = true;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: anet.channel.strategy.c$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public static C0987c f4114a = new C0987c();

        private a() {
        }
    }

    /* renamed from: a */
    public void m4739a(boolean z10) {
        this.f4113b = z10;
    }

    /* renamed from: b */
    public void m4740b(String str) {
        this.f4112a.put(str, HttpConstant.HTTP);
    }

    /* renamed from: a */
    public String m4738a(String str) {
        if (!this.f4113b) {
            return null;
        }
        String str2 = this.f4112a.get(str);
        if (str2 != null) {
            return str2;
        }
        this.f4112a.put(str, HttpConstant.HTTPS);
        return HttpConstant.HTTPS;
    }
}
