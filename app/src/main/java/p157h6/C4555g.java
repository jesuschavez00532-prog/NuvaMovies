package p157h6;

import org.json.JSONObject;
import p007a6.InterfaceC0096r;
import p395x5.C7503f;

/* renamed from: h6.g */
/* loaded from: classes.dex */
public class C4555g {

    /* renamed from: a */
    private final InterfaceC0096r f19626a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4555g(InterfaceC0096r interfaceC0096r) {
        this.f19626a = interfaceC0096r;
    }

    /* renamed from: a */
    private static InterfaceC4556h m18979a(int i10) {
        if (i10 != 3) {
            C7503f.m28716f().m28719d("Could not determine SettingsJsonTransform for settings version " + i10 + ". Using default settings values.");
            return new C4550b();
        }
        return new C4560l();
    }

    /* renamed from: b */
    public C4552d m18980b(JSONObject jSONObject) {
        return m18979a(jSONObject.getInt("settings_version")).mo18950a(this.f19626a, jSONObject);
    }
}
