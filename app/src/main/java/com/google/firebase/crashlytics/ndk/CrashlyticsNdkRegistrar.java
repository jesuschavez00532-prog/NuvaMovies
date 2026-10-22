package com.google.firebase.crashlytics.ndk;

import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.crashlytics.ndk.CrashlyticsNdkRegistrar;
import java.util.Arrays;
import java.util.List;
import p027b7.AbstractC1145h;
import p366v5.C7216d;
import p366v5.C7233r;
import p366v5.InterfaceC7218e;
import p366v5.InterfaceC7223h;
import p395x5.C7502e;
import p395x5.InterfaceC7498a;

/* loaded from: classes.dex */
public class CrashlyticsNdkRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public InterfaceC7498a m10856b(InterfaceC7218e interfaceC7218e) {
        return C2624c.m10877f((Context) interfaceC7218e.mo27905a(Context.class), !C7502e.m28710g(r2));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        return Arrays.asList(C7216d.m27909c(InterfaceC7498a.class).m27929b(C7233r.m27995j(Context.class)).m27933f(new InterfaceC7223h() { // from class: j6.a
            @Override // p366v5.InterfaceC7223h
            /* renamed from: a */
            public final Object mo5191a(InterfaceC7218e interfaceC7218e) {
                InterfaceC7498a m10856b;
                m10856b = CrashlyticsNdkRegistrar.this.m10856b(interfaceC7218e);
                return m10856b;
            }
        }).m27932e().m27931d(), AbstractC1145h.m5202b("fire-cls-ndk", "18.2.13"));
    }
}
