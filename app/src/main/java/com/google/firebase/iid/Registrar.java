package com.google.firebase.iid;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import p027b7.AbstractC1145h;
import p027b7.InterfaceC1146i;
import p127f5.AbstractC4245i;
import p127f5.AbstractC4250l;
import p312r6.InterfaceC6546k;
import p327s6.InterfaceC6694a;
import p337t5.C6913d;
import p352u6.InterfaceC7048d;
import p366v5.C7216d;
import p366v5.C7233r;
import p366v5.InterfaceC7218e;

@Keep
/* loaded from: classes.dex */
public final class Registrar implements ComponentRegistrar {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.firebase.iid.Registrar$a */
    /* loaded from: classes.dex */
    public static class C2630a implements InterfaceC6694a {

        /* renamed from: a */
        final FirebaseInstanceId f10085a;

        public C2630a(FirebaseInstanceId firebaseInstanceId) {
            this.f10085a = firebaseInstanceId;
        }

        @Override // p327s6.InterfaceC6694a
        /* renamed from: a */
        public void mo10945a(InterfaceC6694a.a aVar) {
            this.f10085a.m10926a(aVar);
        }

        @Override // p327s6.InterfaceC6694a
        /* renamed from: b */
        public String mo10946b() {
            return this.f10085a.m10932n();
        }

        @Override // p327s6.InterfaceC6694a
        /* renamed from: c */
        public AbstractC4245i mo10947c() {
            String m10932n = this.f10085a.m10932n();
            if (m10932n != null) {
                return AbstractC4250l.m17733e(m10932n);
            }
            return this.f10085a.m10931j().mo17704f(C2647q.f10121a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ FirebaseInstanceId lambda$getComponents$0$Registrar(InterfaceC7218e interfaceC7218e) {
        return new FirebaseInstanceId((C6913d) interfaceC7218e.mo27905a(C6913d.class), interfaceC7218e.mo27943b(InterfaceC1146i.class), interfaceC7218e.mo27943b(InterfaceC6546k.class), (InterfaceC7048d) interfaceC7218e.mo27905a(InterfaceC7048d.class));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ InterfaceC6694a lambda$getComponents$1$Registrar(InterfaceC7218e interfaceC7218e) {
        return new C2630a((FirebaseInstanceId) interfaceC7218e.mo27905a(FirebaseInstanceId.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<C7216d> getComponents() {
        return Arrays.asList(C7216d.m27909c(FirebaseInstanceId.class).m27929b(C7233r.m27995j(C6913d.class)).m27929b(C7233r.m27994i(InterfaceC1146i.class)).m27929b(C7233r.m27994i(InterfaceC6546k.class)).m27929b(C7233r.m27995j(InterfaceC7048d.class)).m27933f(C2645o.f10119a).m27930c().m27931d(), C7216d.m27909c(InterfaceC6694a.class).m27929b(C7233r.m27995j(FirebaseInstanceId.class)).m27933f(C2646p.f10120a).m27931d(), AbstractC1145h.m5202b("fire-iid", "21.1.0"));
    }
}
