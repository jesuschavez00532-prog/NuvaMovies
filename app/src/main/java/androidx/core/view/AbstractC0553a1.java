package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import be.AbstractC1320p;
import be.C1328x;
import ee.InterfaceC4181d;
import ge.AbstractC4444k;
import me.InterfaceC5664p;
import ne.AbstractC5868k;
import p136fe.AbstractC4313d;
import p344te.AbstractC6944d;
import p344te.AbstractC6946f;
import p344te.InterfaceC6942b;

/* renamed from: androidx.core.view.a1 */
/* loaded from: classes.dex */
public abstract class AbstractC0553a1 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.view.a1$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC4444k implements InterfaceC5664p {

        /* renamed from: c */
        private /* synthetic */ Object f2320c;

        /* renamed from: d */
        int f2321d;

        /* renamed from: e */
        final /* synthetic */ View f2322e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(View view, InterfaceC4181d interfaceC4181d) {
            super(2, interfaceC4181d);
            this.f2322e = view;
        }

        @Override // ge.AbstractC4434a
        /* renamed from: a */
        public final InterfaceC4181d mo2390a(Object obj, InterfaceC4181d interfaceC4181d) {
            AbstractC5868k.m23674f(interfaceC4181d, "completion");
            a aVar = new a(this.f2322e, interfaceC4181d);
            aVar.f2320c = obj;
            return aVar;
        }

        @Override // me.InterfaceC5664p
        /* renamed from: h */
        public final Object mo2391h(Object obj, Object obj2) {
            return ((a) mo2390a(obj, (InterfaceC4181d) obj2)).mo2392l(C1328x.f4998a);
        }

        @Override // ge.AbstractC4434a
        /* renamed from: l */
        public final Object mo2392l(Object obj) {
            Object m18094c;
            AbstractC6944d abstractC6944d;
            m18094c = AbstractC4313d.m18094c();
            int i10 = this.f2321d;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        AbstractC1320p.m5976b(obj);
                        return C1328x.f4998a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                abstractC6944d = (AbstractC6944d) this.f2320c;
                AbstractC1320p.m5976b(obj);
            } else {
                AbstractC1320p.m5976b(obj);
                abstractC6944d = (AbstractC6944d) this.f2320c;
                View view = this.f2322e;
                this.f2320c = abstractC6944d;
                this.f2321d = 1;
                if (abstractC6944d.mo26978b(view, this) == m18094c) {
                    return m18094c;
                }
            }
            View view2 = this.f2322e;
            if (view2 instanceof ViewGroup) {
                InterfaceC6942b m2844b = AbstractC0652z0.m2844b((ViewGroup) view2);
                this.f2320c = null;
                this.f2321d = 2;
                if (abstractC6944d.m26981f(m2844b, this) == m18094c) {
                    return m18094c;
                }
            }
            return C1328x.f4998a;
        }
    }

    /* renamed from: a */
    public static final InterfaceC6942b m2389a(View view) {
        InterfaceC6942b m26988b;
        AbstractC5868k.m23674f(view, "$this$allViews");
        m26988b = AbstractC6946f.m26988b(new a(view, null));
        return m26988b;
    }
}
