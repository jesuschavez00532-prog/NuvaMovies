package p157h6;

import org.json.JSONObject;
import p007a6.InterfaceC0096r;
import p157h6.C4552d;

/* renamed from: h6.b */
/* loaded from: classes.dex */
class C4550b implements InterfaceC4556h {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C4552d m18949b(InterfaceC0096r interfaceC0096r) {
        return new C4552d(3600000 + interfaceC0096r.mo435a(), new C4552d.b(8, 4), new C4552d.a(true, false), 0, 3600, 10.0d, 1.2d, 60);
    }

    @Override // p157h6.InterfaceC4556h
    /* renamed from: a */
    public C4552d mo18950a(InterfaceC0096r interfaceC0096r, JSONObject jSONObject) {
        return m18949b(interfaceC0096r);
    }
}
