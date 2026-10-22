package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import p027b7.AbstractC1145h;
import p297q6.InterfaceC6349d;
import p337t5.C6913d;
import p351u5.C7042b;
import p351u5.InterfaceC7041a;
import p366v5.C7216d;
import p366v5.C7233r;
import p366v5.InterfaceC7218e;
import p366v5.InterfaceC7223h;

@Keep
/* loaded from: classes.dex */
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    @SuppressLint({"MissingPermission"})
    public List<C7216d> getComponents() {
        return Arrays.asList(C7216d.m27909c(InterfaceC7041a.class).m27929b(C7233r.m27995j(C6913d.class)).m27929b(C7233r.m27995j(Context.class)).m27929b(C7233r.m27995j(InterfaceC6349d.class)).m27933f(new InterfaceC7223h() { // from class: com.google.firebase.analytics.connector.internal.a
            @Override // p366v5.InterfaceC7223h
            /* renamed from: a */
            public final Object mo5191a(InterfaceC7218e interfaceC7218e) {
                InterfaceC7041a m27144d;
                m27144d = C7042b.m27144d((C6913d) interfaceC7218e.mo27905a(C6913d.class), (Context) interfaceC7218e.mo27905a(Context.class), (InterfaceC6349d) interfaceC7218e.mo27905a(InterfaceC6349d.class));
                return m27144d;
            }
        }).m27932e().m27931d(), AbstractC1145h.m5202b("fire-analytics", "21.1.1"));
    }
}
