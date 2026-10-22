package anet.channel;

import anet.channel.security.ISecurity;
import anet.channel.strategy.dispatch.IAmdcSign;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: anet.channel.d */
/* loaded from: classes.dex */
public class C0909d implements IAmdcSign {

    /* renamed from: a */
    final /* synthetic */ String f3810a;

    /* renamed from: b */
    final /* synthetic */ ISecurity f3811b;

    /* renamed from: c */
    final /* synthetic */ SessionCenter f3812c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0909d(SessionCenter sessionCenter, String str, ISecurity iSecurity) {
        this.f3812c = sessionCenter;
        this.f3810a = str;
        this.f3811b = iSecurity;
    }

    @Override // anet.channel.strategy.dispatch.IAmdcSign
    public String getAppkey() {
        return this.f3810a;
    }

    @Override // anet.channel.strategy.dispatch.IAmdcSign
    public String sign(String str) {
        return this.f3811b.sign(this.f3812c.f3751b, ISecurity.SIGN_ALGORITHM_HMAC_SHA1, getAppkey(), str);
    }

    @Override // anet.channel.strategy.dispatch.IAmdcSign
    public boolean useSecurityGuard() {
        return !this.f3811b.isSecOff();
    }
}
