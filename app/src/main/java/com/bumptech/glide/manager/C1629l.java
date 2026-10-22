package com.bumptech.glide.manager;

import android.content.Context;
import androidx.fragment.app.AbstractC0729o;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC0749c;
import com.bumptech.glide.ComponentCallbacks2C1586c;
import com.bumptech.glide.ComponentCallbacks2C1597l;
import com.bumptech.glide.manager.C1631n;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p109e2.AbstractC4122l;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.bumptech.glide.manager.l */
/* loaded from: classes.dex */
public final class C1629l {

    /* renamed from: a */
    final Map f6431a = new HashMap();

    /* renamed from: b */
    private final C1631n.b f6432b;

    /* renamed from: com.bumptech.glide.manager.l$a */
    /* loaded from: classes.dex */
    class a implements InterfaceC1628k {

        /* renamed from: a */
        final /* synthetic */ AbstractC0749c f6433a;

        a(AbstractC0749c abstractC0749c) {
            this.f6433a = abstractC0749c;
        }

        @Override // com.bumptech.glide.manager.InterfaceC1628k
        public void onDestroy() {
            C1629l.this.f6431a.remove(this.f6433a);
        }

        @Override // com.bumptech.glide.manager.InterfaceC1628k
        public void onStart() {
        }

        @Override // com.bumptech.glide.manager.InterfaceC1628k
        public void onStop() {
        }
    }

    /* renamed from: com.bumptech.glide.manager.l$b */
    /* loaded from: classes.dex */
    private final class b implements InterfaceC1632o {

        /* renamed from: a */
        private final AbstractC0729o f6435a;

        b(AbstractC0729o abstractC0729o) {
            this.f6435a = abstractC0729o;
        }

        /* renamed from: b */
        private void m7468b(AbstractC0729o abstractC0729o, Set set) {
            List m3544s0 = abstractC0729o.m3544s0();
            int size = m3544s0.size();
            for (int i10 = 0; i10 < size; i10++) {
                Fragment fragment = (Fragment) m3544s0.get(i10);
                m7468b(fragment.m3093I6(), set);
                ComponentCallbacks2C1597l m7466a = C1629l.this.m7466a(fragment.mo953f6());
                if (m7466a != null) {
                    set.add(m7466a);
                }
            }
        }

        @Override // com.bumptech.glide.manager.InterfaceC1632o
        /* renamed from: a */
        public Set mo7464a() {
            HashSet hashSet = new HashSet();
            m7468b(this.f6435a, hashSet);
            return hashSet;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1629l(C1631n.b bVar) {
        this.f6432b = bVar;
    }

    /* renamed from: a */
    ComponentCallbacks2C1597l m7466a(AbstractC0749c abstractC0749c) {
        AbstractC4122l.m17229b();
        return (ComponentCallbacks2C1597l) this.f6431a.get(abstractC0749c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public ComponentCallbacks2C1597l m7467b(Context context, ComponentCallbacks2C1586c componentCallbacks2C1586c, AbstractC0749c abstractC0749c, AbstractC0729o abstractC0729o, boolean z10) {
        AbstractC4122l.m17229b();
        ComponentCallbacks2C1597l m7466a = m7466a(abstractC0749c);
        if (m7466a == null) {
            LifecycleLifecycle lifecycleLifecycle = new LifecycleLifecycle(abstractC0749c);
            ComponentCallbacks2C1597l mo7274a = this.f6432b.mo7274a(componentCallbacks2C1586c, lifecycleLifecycle, new b(abstractC0729o), context);
            this.f6431a.put(abstractC0749c, mo7274a);
            lifecycleLifecycle.mo7458a(new a(abstractC0749c));
            if (z10) {
                mo7274a.onStart();
            }
            return mo7274a;
        }
        return m7466a;
    }
}
