package com.interactive.brasiliptv.app;

import af.InterfaceC0238d;
import cc.C1446c0;
import cc.C1466m0;
import com.interactive.brasiliptv.app.AppWrapper;
import com.umeng.umcrash.UMCrash;
import com.umeng.umcrash.UMCrashCallback;
import mc.C5634i;
import p170i2.C4842a;
import p190j7.C5000b;
import p201k2.AbstractC5086c;
import p217l2.InterfaceC5340a;
import p217l2.InterfaceC5344e;
import p217l2.InterfaceC5348i;
import p231m2.AbstractC5584b;
import p257o2.AbstractC5904b;
import p258o3.C5905a;
import p262o7.C5922a;
import p298q7.C6350a;
import p313r7.C6555a;
import p313r7.C6556b;
import p348u2.AbstractC7028e;
import p383w9.C7383a;
import p415y9.AbstractApplicationC7689d;
import ye.C7709c;
import ye.C7710d;

/* loaded from: classes.dex */
public final class AppWrapper extends AbstractApplicationC7689d {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D */
    public static final String m11352D() {
        return AbstractC5086c.m20614g("yyyy-MM-dd HH:mm:ss:SSS_") + C1466m0.f5627a.m6878m() + "_" + C1446c0.f5559a.m6748t() + "_" + AbstractC7028e.m27116b();
    }

    @Override // p287pb.AbstractApplicationC6253c
    /* renamed from: j */
    public String mo11353j() {
        return "com.interactive.brasiliptv";
    }

    @Override // p287pb.AbstractApplicationC6253c
    /* renamed from: k */
    public void mo11354k() {
        InterfaceC0238d interfaceC0238d;
        InterfaceC0238d interfaceC0238d2;
        InterfaceC5348i interfaceC5348i = (InterfaceC5348i) C5634i.m22844e(InterfaceC5348i.class, new Object[0]);
        InterfaceC0238d interfaceC0238d3 = null;
        if (interfaceC5348i != null) {
            interfaceC0238d = interfaceC5348i.mo21634a();
        } else {
            interfaceC0238d = null;
        }
        InterfaceC5344e interfaceC5344e = (InterfaceC5344e) C5634i.m22844e(InterfaceC5344e.class, new Object[0]);
        if (interfaceC5344e != null) {
            interfaceC0238d2 = interfaceC5344e.mo20783a();
        } else {
            interfaceC0238d2 = null;
        }
        InterfaceC5340a interfaceC5340a = (InterfaceC5340a) C5634i.m22844e(InterfaceC5340a.class, new Object[0]);
        if (interfaceC5340a != null) {
            interfaceC0238d3 = interfaceC5340a.mo20169a();
        }
        C7710d m29785b = C7709c.m29785b();
        m29785b.m29809a(new C6555a());
        m29785b.m29809a(new C6556b());
        if (interfaceC0238d != null) {
            m29785b.m29809a(interfaceC0238d);
        }
        if (interfaceC0238d2 != null) {
            m29785b.m29809a(interfaceC0238d2);
        }
        if (interfaceC0238d3 != null) {
            m29785b.m29809a(interfaceC0238d3);
        }
        m29785b.m29813f();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p287pb.AbstractApplicationC6253c
    /* renamed from: l */
    public void mo11355l() {
        super.mo11355l();
        UMCrashCallback uMCrashCallback = new UMCrashCallback() { // from class: k7.a
            @Override // com.umeng.umcrash.UMCrashCallback
            public final String onCallback() {
                String m11352D;
                m11352D = AppWrapper.m11352D();
                return m11352D;
            }
        };
        UMCrash.registerUMCrashCallback(uMCrashCallback);
        AbstractC5904b.m23853c(uMCrashCallback);
    }

    @Override // p287pb.AbstractApplicationC6253c, android.app.Application
    public void onCreate() {
        C7383a c7383a = C7383a.f27389a;
        C7383a.m28494e(c7383a, null, 1, null);
        C4842a c4842a = C4842a.f20329a;
        c4842a.m19923d(new C5000b());
        c4842a.m19922c(new C5922a());
        AbstractC5584b.m22680b(new C6350a());
        AbstractC5904b.m23855e(this);
        super.onCreate();
        C7383a.m28493c(c7383a, null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p415y9.AbstractApplicationC7689d, p287pb.AbstractApplicationC6253c
    /* renamed from: q */
    public void mo11356q() {
        System.setProperty("rx2.io-priority", "1");
        AbstractC5904b.m23852b(this);
        m29493v("mgs", "00");
        super.mo11356q();
        C5905a.f23499a.m23856a(this);
    }
}
