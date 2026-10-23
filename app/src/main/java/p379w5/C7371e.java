package p379w5;

import android.os.Bundle;
import com.lzy.okgo.cookie.SerializableCookie;
import java.util.Locale;
import p351u5.InterfaceC7041a;
import p395x5.C7503f;
import p411y5.InterfaceC7675b;

/* renamed from: w5.e */
/* loaded from: classes.dex */
class C7371e implements InterfaceC7041a.b {

    /* renamed from: a */
    private InterfaceC7675b f27349a;

    /* renamed from: b */
    private InterfaceC7675b f27350b;

    /* renamed from: b */
    private static void m28438b(InterfaceC7675b interfaceC7675b, String str, Bundle bundle) {
        if (interfaceC7675b == null) {
            return;
        }
        interfaceC7675b.mo29468b(str, bundle);
    }

    /* renamed from: c */
    private void m28439c(String str, Bundle bundle) {
        InterfaceC7675b interfaceC7675b;
        if ("clx".equals(bundle.getString("_o"))) {
            interfaceC7675b = this.f27349a;
        } else {
            interfaceC7675b = this.f27350b;
        }
        m28438b(interfaceC7675b, str, bundle);
    }

    @Override // p351u5.InterfaceC7041a.b
    /* renamed from: a */
    public void mo27143a(int i10, Bundle bundle) {
        String string = null;
        C7503f.m28716f().m28723i(String.format(Locale.US, "Analytics listener received message. ID: %d, Extras: %s", Integer.valueOf(i10), bundle));
        if (bundle != null && (string = bundle.getString(SerializableCookie.NAME)) != null) {
            Bundle bundle2 = bundle.getBundle("params");
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            m28439c(string, bundle2);
        }
    }

    /* renamed from: d */
    public void m28440d(InterfaceC7675b interfaceC7675b) {
        this.f27350b = interfaceC7675b;
    }

    /* renamed from: e */
    public void m28441e(InterfaceC7675b interfaceC7675b) {
        this.f27349a = interfaceC7675b;
    }
}
