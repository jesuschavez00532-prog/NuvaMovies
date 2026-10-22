package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.android.datatransport.cct.C1782a;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.datatransport.TransportRegistrar;
import java.util.Arrays;
import java.util.List;
import p027b7.AbstractC1145h;
import p294q3.InterfaceC6340g;
import p324s3.C6672t;
import p366v5.C7216d;
import p366v5.C7233r;
import p366v5.InterfaceC7218e;
import p366v5.InterfaceC7223h;

@Keep
/* loaded from: classes.dex */
public class TransportRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InterfaceC6340g lambda$getComponents$0(InterfaceC7218e interfaceC7218e) {
        C6672t.m26046f((Context) interfaceC7218e.mo27905a(Context.class));
        return C6672t.m26044c().m26048g(C1782a.f7482h);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C7216d> getComponents() {
        return Arrays.asList(C7216d.m27909c(InterfaceC6340g.class).m27929b(C7233r.m27995j(Context.class)).m27933f(new InterfaceC7223h() { // from class: k6.a
            @Override // p366v5.InterfaceC7223h
            /* renamed from: a */
            public final Object mo5191a(InterfaceC7218e interfaceC7218e) {
                InterfaceC6340g lambda$getComponents$0;
                lambda$getComponents$0 = TransportRegistrar.lambda$getComponents$0(interfaceC7218e);
                return lambda$getComponents$0;
            }
        }).m27931d(), AbstractC1145h.m5202b("fire-transport", "18.1.6"));
    }
}
