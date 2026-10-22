package p216l1;

import java.util.HashMap;
import java.util.Map;
import p184j1.InterfaceC4975f;

/* renamed from: l1.s */
/* loaded from: classes.dex */
final class C5332s {

    /* renamed from: a */
    private final Map f21832a = new HashMap();

    /* renamed from: b */
    private final Map f21833b = new HashMap();

    /* renamed from: b */
    private Map m21594b(boolean z10) {
        if (z10) {
            return this.f21833b;
        }
        return this.f21832a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public C5325l m21595a(InterfaceC4975f interfaceC4975f, boolean z10) {
        return (C5325l) m21594b(z10).get(interfaceC4975f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m21596c(InterfaceC4975f interfaceC4975f, C5325l c5325l) {
        m21594b(c5325l.m21565p()).put(interfaceC4975f, c5325l);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m21597d(InterfaceC4975f interfaceC4975f, C5325l c5325l) {
        Map m21594b = m21594b(c5325l.m21565p());
        if (c5325l.equals(m21594b.get(interfaceC4975f))) {
            m21594b.remove(interfaceC4975f);
        }
    }
}
