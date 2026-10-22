package com.taobao.accs.internal;

import androidx.annotation.Keep;
import com.taobao.accs.AccsClientConfig;
import com.taobao.accs.InterfaceC3130c;
import com.taobao.accs.base.AccsConnectStateListener;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.data.Message;
import com.taobao.accs.net.AbstractC3156a;
import com.taobao.accs.net.C3166k;

@Keep
/* renamed from: com.taobao.accs.internal.c */
/* loaded from: classes.dex */
public class C3151c implements InterfaceC3130c {

    /* renamed from: a */
    private AbstractC3156a f12971a;

    public C3151c(String str) {
        this.f12971a = new C3166k(GlobalClientInfo.f12843a, 1, str);
    }

    @Override // com.taobao.accs.InterfaceC3130c
    /* renamed from: a */
    public void mo12712a() {
        this.f12971a.mo12840a();
    }

    @Override // com.taobao.accs.InterfaceC3130c
    /* renamed from: b */
    public void mo12721b() {
        this.f12971a.m12865k();
    }

    @Override // com.taobao.accs.InterfaceC3130c
    /* renamed from: c */
    public String mo12723c() {
        return this.f12971a.m12863i();
    }

    @Override // com.taobao.accs.InterfaceC3130c
    /* renamed from: d */
    public String mo12725d() {
        return this.f12971a.f12986i.getAppSecret();
    }

    @Override // com.taobao.accs.InterfaceC3130c
    /* renamed from: e */
    public boolean mo12728e(String str) {
        return this.f12971a.m12864j().m12742c(str);
    }

    @Override // com.taobao.accs.InterfaceC3130c
    /* renamed from: f */
    public boolean mo12730f(String str) {
        return this.f12971a.m12864j().m12743d(str);
    }

    @Override // com.taobao.accs.InterfaceC3130c
    /* renamed from: a */
    public void mo12717a(boolean z10, boolean z11) {
        this.f12971a.mo12846a(z10, z11);
    }

    @Override // com.taobao.accs.InterfaceC3130c
    /* renamed from: b */
    public String mo12720b(String str) {
        return this.f12971a.mo12849b(str);
    }

    @Override // com.taobao.accs.InterfaceC3130c
    /* renamed from: c */
    public void mo12724c(String str) {
        this.f12971a.f12978a = str;
    }

    @Override // com.taobao.accs.InterfaceC3130c
    /* renamed from: d */
    public void mo12726d(String str) {
        this.f12971a.f12979b = str;
    }

    @Override // com.taobao.accs.InterfaceC3130c
    /* renamed from: e */
    public String mo12727e() {
        return this.f12971a.f12986i.getStoreId();
    }

    @Override // com.taobao.accs.InterfaceC3130c
    /* renamed from: f */
    public boolean mo12729f() {
        return this.f12971a.mo12867m();
    }

    @Override // com.taobao.accs.InterfaceC3130c
    /* renamed from: a */
    public boolean mo12718a(String str) {
        return this.f12971a.mo12848a(str);
    }

    @Override // com.taobao.accs.InterfaceC3130c
    /* renamed from: b */
    public void mo12722b(AccsConnectStateListener accsConnectStateListener) {
        this.f12971a.m12852b(accsConnectStateListener);
    }

    @Override // com.taobao.accs.InterfaceC3130c
    /* renamed from: a */
    public void mo12715a(Message message, int i10) {
        this.f12971a.m12853b(message, i10);
    }

    @Override // com.taobao.accs.InterfaceC3130c
    /* renamed from: a */
    public void mo12716a(Message message, boolean z10) {
        this.f12971a.m12854b(message, z10);
    }

    @Override // com.taobao.accs.InterfaceC3130c
    /* renamed from: a */
    public void mo12713a(AccsClientConfig accsClientConfig) {
        AbstractC3156a abstractC3156a = this.f12971a;
        if (abstractC3156a instanceof C3166k) {
            ((C3166k) abstractC3156a).m12889a(accsClientConfig);
        }
    }

    @Override // com.taobao.accs.InterfaceC3130c
    /* renamed from: a */
    public boolean mo12719a(String str, String str2) {
        return this.f12971a.m12864j().m12741b(str, str2);
    }

    @Override // com.taobao.accs.InterfaceC3130c
    /* renamed from: a */
    public void mo12714a(AccsConnectStateListener accsConnectStateListener) {
        this.f12971a.m12842a(accsConnectStateListener);
    }
}
