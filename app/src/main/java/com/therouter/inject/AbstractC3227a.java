package com.therouter.inject;

import be.C1328x;
import mc.AbstractC5635j;
import me.InterfaceC5642a;
import ne.AbstractC5869l;

/* renamed from: com.therouter.inject.a */
/* loaded from: classes.dex */
public abstract class AbstractC3227a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.therouter.inject.a$a */
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final a f13325a = new a();

        a() {
            super(0);
        }

        /* renamed from: a */
        public final void m13084a() {
        }

        @Override // me.InterfaceC5642a
        public /* bridge */ /* synthetic */ Object invoke() {
            m13084a();
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final void m13082b(String str, InterfaceC5642a interfaceC5642a) {
        AbstractC5635j.m22861c("RouterInject", str, interfaceC5642a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static /* synthetic */ void m13083c(String str, InterfaceC5642a interfaceC5642a, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            interfaceC5642a = a.f13325a;
        }
        m13082b(str, interfaceC5642a);
    }
}
