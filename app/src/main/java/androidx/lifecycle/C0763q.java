package androidx.lifecycle;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: androidx.lifecycle.q */
/* loaded from: classes.dex */
public class C0763q {

    /* renamed from: a */
    private final HashMap f3150a = new HashMap();

    /* renamed from: a */
    public final void m3744a() {
        Iterator it = this.f3150a.values().iterator();
        while (it.hasNext()) {
            ((AbstractC0761o) it.next()).m3740a();
        }
        this.f3150a.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final AbstractC0761o m3745b(String str) {
        return (AbstractC0761o) this.f3150a.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public Set m3746c() {
        return new HashSet(this.f3150a.keySet());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final void m3747d(String str, AbstractC0761o abstractC0761o) {
        AbstractC0761o abstractC0761o2 = (AbstractC0761o) this.f3150a.put(str, abstractC0761o);
        if (abstractC0761o2 != null) {
            abstractC0761o2.mo3574d();
        }
    }
}
