package com.taobao.accs.internal;

import com.taobao.accs.AccsClientConfig;
import com.taobao.accs.InterfaceC3130c;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.C3199l;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.taobao.accs.internal.a */
/* loaded from: classes.dex */
public class C3149a implements C3199l.b {

    /* renamed from: a */
    final /* synthetic */ ACCSManagerImpl f12968a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3149a(ACCSManagerImpl aCCSManagerImpl) {
        this.f12968a = aCCSManagerImpl;
    }

    @Override // com.taobao.accs.utl.C3199l.b
    /* renamed from: a */
    public void mo12832a() {
        String str;
        String str2;
        String str3;
        InterfaceC3130c interfaceC3130c;
        try {
            str2 = ACCSManagerImpl.f12957c;
            ALog.m12940e(str2, "onForeState", new Object[0]);
            str3 = this.f12968a.f12959b;
            if (AccsClientConfig.getConfigByTag(str3).isForePingEnable()) {
                ACCSManagerImpl aCCSManagerImpl = this.f12968a;
                interfaceC3130c = aCCSManagerImpl.f12960d;
                aCCSManagerImpl.m12816a(interfaceC3130c);
            }
        } catch (Exception e10) {
            str = ACCSManagerImpl.f12957c;
            ALog.m12939e(str, "onForeState error, Error:", e10, new Object[0]);
        }
    }

    @Override // com.taobao.accs.utl.C3199l.b
    /* renamed from: b */
    public void mo12833b() {
        String str;
        str = ACCSManagerImpl.f12957c;
        ALog.m12940e(str, "onBackState", new Object[0]);
    }
}
