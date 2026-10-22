package p262o7;

import android.content.Context;
import androidx.fragment.app.AbstractC0729o;
import androidx.lifecycle.AbstractC0749c;
import cc.C1466m0;
import com.download.util.AutoDownloadObserver;
import com.lzy.okgo.model.Progress;
import com.module.event.CloseDialogEvent;
import com.umeng.analytics.pro.C3384f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import p125f3.C4224c;
import p170i2.C4842a;
import p170i2.InterfaceC4844c;
import p258o3.C5911g;
import p317rb.AbstractC6567a;
import p355u9.AbstractC7062b;
import p356ub.AbstractC7073a;
import p400xa.C7581k;
import p400xa.C7615w;
import p415y9.AbstractApplicationC7689d;
import p421z0.C7729c;
import ye.C7709c;

/* renamed from: o7.a */
/* loaded from: classes.dex */
public final class C5922a implements InterfaceC4844c {

    /* renamed from: a */
    private HashMap f23559a;

    @Override // p170i2.InterfaceC4844c
    /* renamed from: a */
    public void mo19978a(InterfaceC5660l interfaceC5660l) {
        C7615w.m29301w(C7615w.f27995a, interfaceC5660l, null, null, 6, null);
    }

    @Override // p170i2.InterfaceC4844c
    /* renamed from: b */
    public String mo19979b() {
        return "4.99.4";
    }

    @Override // p170i2.InterfaceC4844c
    /* renamed from: c */
    public String mo19980c(String str, String str2) {
        AbstractC5868k.m23674f(str, "plainData");
        AbstractC5868k.m23674f(str2, "encryptKey");
        String m27213a = AbstractC7062b.m27213a(str, str2);
        AbstractC5868k.m23673e(m27213a, "encryption(plainData, encryptKey)");
        return m27213a;
    }

    @Override // p170i2.InterfaceC4844c
    /* renamed from: d */
    public boolean mo19981d() {
        if (C4842a.f20329a.m19920a().m19953b0() && AbstractC6567a.m25638h(C4224c.m17666u().m17675w())) {
            return true;
        }
        return false;
    }

    @Override // p170i2.InterfaceC4844c
    /* renamed from: e */
    public ArrayList mo19982e() {
        return C5911g.f23514h.m23905a().m23898m(AbstractApplicationC7689d.f28135d.m29494a());
    }

    @Override // p170i2.InterfaceC4844c
    /* renamed from: f */
    public void mo19983f(HashMap hashMap) {
        AbstractC5868k.m23674f(hashMap, "parameters");
        if (this.f23559a != null) {
            for (Map.Entry entry : hashMap.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                HashMap hashMap2 = this.f23559a;
                if (hashMap2 != null) {
                    hashMap2.put(str, value);
                }
            }
        } else {
            this.f23559a = hashMap;
        }
        HashMap hashMap3 = this.f23559a;
        if (hashMap3 != null) {
            C7729c.f28423a.m29855i(hashMap3);
        }
    }

    @Override // p170i2.InterfaceC4844c
    /* renamed from: g */
    public void mo19984g(AbstractC0749c abstractC0749c) {
        AbstractC5868k.m23674f(abstractC0749c, "lifecycle");
        AutoDownloadObserver.f6984a.m7595c(abstractC0749c);
    }

    @Override // p170i2.InterfaceC4844c
    /* renamed from: h */
    public void mo19985h(String str, String str2) {
        AbstractC5868k.m23674f(str, Progress.FILE_NAME);
        AbstractC5868k.m23674f(str2, "fileContent");
        C7581k.f27855a.m29098g(str, str2);
    }

    @Override // p170i2.InterfaceC4844c
    /* renamed from: i */
    public int mo19986i() {
        return 49902;
    }

    @Override // p170i2.InterfaceC4844c
    /* renamed from: j */
    public void mo19987j(AbstractC0729o abstractC0729o, Context context) {
        AbstractC5868k.m23674f(abstractC0729o, "supportFragmentManager");
        AbstractC5868k.m23674f(context, C3384f.f14563X);
    }

    @Override // p170i2.InterfaceC4844c
    /* renamed from: k */
    public void mo19988k() {
        C7709c.m29787d().m29801m(new CloseDialogEvent());
    }

    @Override // p170i2.InterfaceC4844c
    /* renamed from: l */
    public String mo19989l() {
        String str = AbstractC7073a.f26506a;
        AbstractC5868k.m23673e(str, "MAC_DES_KEY");
        return str;
    }

    @Override // p170i2.InterfaceC4844c
    /* renamed from: m */
    public void mo19990m() {
        if (C1466m0.f5627a.m6835H()) {
            AutoDownloadObserver.f6984a.m7594b();
        }
    }
}
