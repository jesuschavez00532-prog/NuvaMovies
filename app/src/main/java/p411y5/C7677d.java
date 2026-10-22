package p411y5;

import android.os.Bundle;
import com.lzy.okgo.cookie.SerializableCookie;
import org.json.JSONException;
import org.json.JSONObject;
import p395x5.C7503f;
import p426z5.InterfaceC7755a;
import p426z5.InterfaceC7756b;

/* renamed from: y5.d */
/* loaded from: classes.dex */
public class C7677d implements InterfaceC7675b, InterfaceC7756b {

    /* renamed from: a */
    private InterfaceC7755a f28113a;

    /* renamed from: c */
    private static String m29469c(String str, Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put(SerializableCookie.NAME, str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    @Override // p426z5.InterfaceC7756b
    /* renamed from: a */
    public void mo28426a(InterfaceC7755a interfaceC7755a) {
        this.f28113a = interfaceC7755a;
        C7503f.m28716f().m28717b("Registered Firebase Analytics event receiver for breadcrumbs");
    }

    @Override // p411y5.InterfaceC7675b
    /* renamed from: b */
    public void mo29468b(String str, Bundle bundle) {
        InterfaceC7755a interfaceC7755a = this.f28113a;
        if (interfaceC7755a != null) {
            try {
                interfaceC7755a.mo356a("$A$:" + m29469c(str, bundle));
            } catch (JSONException unused) {
                C7503f.m28716f().m28725k("Unable to serialize Firebase Analytics event to breadcrumb.");
            }
        }
    }
}
