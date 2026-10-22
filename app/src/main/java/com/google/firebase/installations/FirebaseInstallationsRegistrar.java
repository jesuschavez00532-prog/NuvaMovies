package com.google.firebase.installations;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import java.util.Arrays;
import java.util.List;
import p027b7.AbstractC1145h;
import p312r6.AbstractC6544i;
import p312r6.InterfaceC6545j;
import p337t5.C6913d;
import p352u6.InterfaceC7048d;
import p366v5.C7216d;
import p366v5.C7233r;
import p366v5.InterfaceC7218e;
import p366v5.InterfaceC7223h;

@Keep
/* loaded from: classes.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InterfaceC7048d lambda$getComponents$0(InterfaceC7218e interfaceC7218e) {
        return new C2655c((C6913d) interfaceC7218e.mo27905a(C6913d.class), interfaceC7218e.mo27943b(InterfaceC6545j.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C7216d> getComponents() {
        return Arrays.asList(C7216d.m27909c(InterfaceC7048d.class).m27929b(C7233r.m27995j(C6913d.class)).m27929b(C7233r.m27994i(InterfaceC6545j.class)).m27933f(new InterfaceC7223h() { // from class: u6.e
            @Override // p366v5.InterfaceC7223h
            /* renamed from: a */
            public final Object mo5191a(InterfaceC7218e interfaceC7218e) {
                InterfaceC7048d lambda$getComponents$0;
                lambda$getComponents$0 = FirebaseInstallationsRegistrar.lambda$getComponents$0(interfaceC7218e);
                return lambda$getComponents$0;
            }
        }).m27931d(), AbstractC6544i.m25592a(), AbstractC1145h.m5202b("fire-installations", "17.0.2"));
    }
}
