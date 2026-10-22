package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import be.C1328x;
import ee.InterfaceC4181d;
import ge.AbstractC4444k;
import java.util.Iterator;
import me.InterfaceC5664p;
import ne.AbstractC5868k;
import p269oe.InterfaceC5974a;
import p344te.AbstractC6946f;
import p344te.InterfaceC6942b;

/* renamed from: androidx.core.view.z0 */
/* loaded from: classes.dex */
public abstract class AbstractC0652z0 {

    /* renamed from: androidx.core.view.z0$a */
    /* loaded from: classes.dex */
    public static final class a implements InterfaceC6942b {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f2423a;

        a(ViewGroup viewGroup) {
            this.f2423a = viewGroup;
        }

        @Override // p344te.InterfaceC6942b
        public Iterator iterator() {
            return AbstractC0652z0.m2845c(this.f2423a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.view.z0$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC4444k implements InterfaceC5664p {

        /* renamed from: c */
        private /* synthetic */ Object f2424c;

        /* renamed from: d */
        Object f2425d;

        /* renamed from: e */
        Object f2426e;

        /* renamed from: f */
        int f2427f;

        /* renamed from: g */
        int f2428g;

        /* renamed from: h */
        int f2429h;

        /* renamed from: i */
        final /* synthetic */ ViewGroup f2430i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ViewGroup viewGroup, InterfaceC4181d interfaceC4181d) {
            super(2, interfaceC4181d);
            this.f2430i = viewGroup;
        }

        @Override // ge.AbstractC4434a
        /* renamed from: a */
        public final InterfaceC4181d mo2390a(Object obj, InterfaceC4181d interfaceC4181d) {
            AbstractC5868k.m23674f(interfaceC4181d, "completion");
            b bVar = new b(this.f2430i, interfaceC4181d);
            bVar.f2424c = obj;
            return bVar;
        }

        @Override // me.InterfaceC5664p
        /* renamed from: h */
        public final Object mo2391h(Object obj, Object obj2) {
            return ((b) mo2390a(obj, (InterfaceC4181d) obj2)).mo2392l(C1328x.f4998a);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0075  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0098  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00a1  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x004e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x008f -> B:6:0x0091). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0098 -> B:7:0x009c). Please report as a decompilation issue!!! */
        @Override // ge.AbstractC4434a
        /* renamed from: l */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object mo2392l(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = p136fe.AbstractC4311b.m18091c()
                int r1 = r11.f2429h
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L3d
                if (r1 == r3) goto L28
                if (r1 != r2) goto L20
                int r1 = r11.f2428g
                int r4 = r11.f2427f
                java.lang.Object r5 = r11.f2425d
                android.view.ViewGroup r5 = (android.view.ViewGroup) r5
                java.lang.Object r6 = r11.f2424c
                te.d r6 = (p344te.AbstractC6944d) r6
                be.AbstractC1320p.m5976b(r12)
                r12 = r11
                goto L91
            L20:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L28:
                int r1 = r11.f2428g
                int r4 = r11.f2427f
                java.lang.Object r5 = r11.f2426e
                android.view.View r5 = (android.view.View) r5
                java.lang.Object r6 = r11.f2425d
                android.view.ViewGroup r6 = (android.view.ViewGroup) r6
                java.lang.Object r7 = r11.f2424c
                te.d r7 = (p344te.AbstractC6944d) r7
                be.AbstractC1320p.m5976b(r12)
                r12 = r11
                goto L71
            L3d:
                be.AbstractC1320p.m5976b(r12)
                java.lang.Object r12 = r11.f2424c
                te.d r12 = (p344te.AbstractC6944d) r12
                android.view.ViewGroup r1 = r11.f2430i
                int r4 = r1.getChildCount()
                r5 = 0
                r6 = r11
            L4c:
                if (r5 >= r4) goto La1
                android.view.View r7 = r1.getChildAt(r5)
                java.lang.String r8 = "getChildAt(index)"
                ne.AbstractC5868k.m23673e(r7, r8)
                r6.f2424c = r12
                r6.f2425d = r1
                r6.f2426e = r7
                r6.f2427f = r5
                r6.f2428g = r4
                r6.f2429h = r3
                java.lang.Object r8 = r12.mo26978b(r7, r6)
                if (r8 != r0) goto L6a
                return r0
            L6a:
                r9 = r7
                r7 = r12
                r12 = r6
                r6 = r1
                r1 = r4
                r4 = r5
                r5 = r9
            L71:
                boolean r8 = r5 instanceof android.view.ViewGroup
                if (r8 == 0) goto L98
                android.view.ViewGroup r5 = (android.view.ViewGroup) r5
                te.b r5 = androidx.core.view.AbstractC0652z0.m2844b(r5)
                r12.f2424c = r7
                r12.f2425d = r6
                r8 = 0
                r12.f2426e = r8
                r12.f2427f = r4
                r12.f2428g = r1
                r12.f2429h = r2
                java.lang.Object r5 = r7.m26981f(r5, r12)
                if (r5 != r0) goto L8f
                return r0
            L8f:
                r5 = r6
                r6 = r7
            L91:
                r9 = r6
                r6 = r12
                r12 = r9
                r10 = r5
                r5 = r1
                r1 = r10
                goto L9c
            L98:
                r5 = r1
                r1 = r6
                r6 = r12
                r12 = r7
            L9c:
                int r4 = r4 + r3
                r9 = r5
                r5 = r4
                r4 = r9
                goto L4c
            La1:
                be.x r12 = be.C1328x.f4998a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.AbstractC0652z0.b.mo2392l(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: androidx.core.view.z0$c */
    /* loaded from: classes.dex */
    public static final class c implements Iterator, InterfaceC5974a {

        /* renamed from: a */
        private int f2431a;

        /* renamed from: b */
        final /* synthetic */ ViewGroup f2432b;

        c(ViewGroup viewGroup) {
            this.f2432b = viewGroup;
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public View next() {
            ViewGroup viewGroup = this.f2432b;
            int i10 = this.f2431a;
            this.f2431a = i10 + 1;
            View childAt = viewGroup.getChildAt(i10);
            if (childAt != null) {
                return childAt;
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f2431a < this.f2432b.getChildCount()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            ViewGroup viewGroup = this.f2432b;
            int i10 = this.f2431a - 1;
            this.f2431a = i10;
            viewGroup.removeViewAt(i10);
        }
    }

    /* renamed from: a */
    public static final InterfaceC6942b m2843a(ViewGroup viewGroup) {
        AbstractC5868k.m23674f(viewGroup, "$this$children");
        return new a(viewGroup);
    }

    /* renamed from: b */
    public static final InterfaceC6942b m2844b(ViewGroup viewGroup) {
        InterfaceC6942b m26988b;
        AbstractC5868k.m23674f(viewGroup, "$this$descendants");
        m26988b = AbstractC6946f.m26988b(new b(viewGroup, null));
        return m26988b;
    }

    /* renamed from: c */
    public static final Iterator m2845c(ViewGroup viewGroup) {
        AbstractC5868k.m23674f(viewGroup, "$this$iterator");
        return new c(viewGroup);
    }
}
