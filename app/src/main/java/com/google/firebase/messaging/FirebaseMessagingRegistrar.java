package com.google.firebase.messaging;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import p027b7.AbstractC1145h;
import p027b7.InterfaceC1146i;
import p294q3.InterfaceC6340g;
import p297q6.InterfaceC6349d;
import p312r6.InterfaceC6546k;
import p327s6.InterfaceC6694a;
import p337t5.C6913d;
import p352u6.InterfaceC7048d;
import p366v5.C7216d;
import p366v5.C7233r;
import p366v5.InterfaceC7218e;
import p366v5.InterfaceC7223h;

@Keep
/* loaded from: classes.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(InterfaceC7218e interfaceC7218e) {
        return new FirebaseMessaging((C6913d) interfaceC7218e.mo27905a(C6913d.class), (InterfaceC6694a) interfaceC7218e.mo27905a(InterfaceC6694a.class), interfaceC7218e.mo27943b(InterfaceC1146i.class), interfaceC7218e.mo27943b(InterfaceC6546k.class), (InterfaceC7048d) interfaceC7218e.mo27905a(InterfaceC7048d.class), (InterfaceC6340g) interfaceC7218e.mo27905a(InterfaceC6340g.class), (InterfaceC6349d) interfaceC7218e.mo27905a(InterfaceC6349d.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<C7216d> getComponents() {
        return Arrays.asList(C7216d.m27909c(FirebaseMessaging.class).m27929b(C7233r.m27995j(C6913d.class)).m27929b(C7233r.m27993h(InterfaceC6694a.class)).m27929b(C7233r.m27994i(InterfaceC1146i.class)).m27929b(C7233r.m27994i(InterfaceC6546k.class)).m27929b(C7233r.m27993h(InterfaceC6340g.class)).m27929b(C7233r.m27995j(InterfaceC7048d.class)).m27929b(C7233r.m27995j(InterfaceC6349d.class)).m27933f(new InterfaceC7223h() { // from class: com.google.firebase.messaging.y
            @Override // p366v5.InterfaceC7223h
            /* renamed from: a */
            public final Object mo5191a(InterfaceC7218e interfaceC7218e) {
                FirebaseMessaging lambda$getComponents$0;
                lambda$getComponents$0 = FirebaseMessagingRegistrar.lambda$getComponents$0(interfaceC7218e);
                return lambda$getComponents$0;
            }
        }).m27930c().m27931d(), AbstractC1145h.m5202b("fire-fcm", "23.0.8"));
    }
}
