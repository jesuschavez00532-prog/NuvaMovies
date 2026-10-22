package com.google.firebase.crashlytics;

import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.crashlytics.CrashlyticsRegistrar;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import java.util.Arrays;
import java.util.List;
import p027b7.AbstractC1145h;
import p337t5.C6913d;
import p351u5.InterfaceC7041a;
import p352u6.InterfaceC7048d;
import p366v5.C7216d;
import p366v5.C7233r;
import p366v5.InterfaceC7218e;
import p366v5.InterfaceC7223h;
import p395x5.InterfaceC7498a;

/* loaded from: classes.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public FirebaseCrashlytics m10852b(InterfaceC7218e interfaceC7218e) {
        return FirebaseCrashlytics.m10853a((C6913d) interfaceC7218e.mo27905a(C6913d.class), (InterfaceC7048d) interfaceC7218e.mo27905a(InterfaceC7048d.class), interfaceC7218e.mo27945e(InterfaceC7498a.class), interfaceC7218e.mo27945e(InterfaceC7041a.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        return Arrays.asList(C7216d.m27909c(FirebaseCrashlytics.class).m27929b(C7233r.m27995j(C6913d.class)).m27929b(C7233r.m27995j(InterfaceC7048d.class)).m27929b(C7233r.m27991a(InterfaceC7498a.class)).m27929b(C7233r.m27991a(InterfaceC7041a.class)).m27933f(new InterfaceC7223h() { // from class: w5.f
            @Override // p366v5.InterfaceC7223h
            /* renamed from: a */
            public final Object mo5191a(InterfaceC7218e interfaceC7218e) {
                FirebaseCrashlytics m10852b;
                m10852b = CrashlyticsRegistrar.this.m10852b(interfaceC7218e);
                return m10852b;
            }
        }).m27932e().m27931d(), AbstractC1145h.m5202b("fire-cls", "18.2.13"));
    }
}
