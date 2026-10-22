package p136fe;

import be.AbstractC1320p;
import ee.C4185h;
import ee.InterfaceC4181d;
import ee.InterfaceC4184g;
import ge.AbstractC4434a;
import ge.AbstractC4437d;
import ge.AbstractC4441h;
import ge.AbstractC4443j;
import me.InterfaceC5664p;
import ne.AbstractC5868k;
import ne.AbstractC5882y;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: fe.c */
/* loaded from: classes3.dex */
public abstract class AbstractC4312c {

    /* renamed from: fe.c$a */
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC4443j {

        /* renamed from: b */
        private int f18752b;

        /* renamed from: c */
        final /* synthetic */ InterfaceC5664p f18753c;

        /* renamed from: d */
        final /* synthetic */ Object f18754d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC4181d interfaceC4181d, InterfaceC5664p interfaceC5664p, Object obj) {
            super(interfaceC4181d);
            this.f18753c = interfaceC5664p;
            this.f18754d = obj;
            AbstractC5868k.m23672d(interfaceC4181d, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // ge.AbstractC4434a
        /* renamed from: l */
        protected Object mo2392l(Object obj) {
            int i10 = this.f18752b;
            if (i10 != 0) {
                if (i10 == 1) {
                    this.f18752b = 2;
                    AbstractC1320p.m5976b(obj);
                    return obj;
                }
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.f18752b = 1;
            AbstractC1320p.m5976b(obj);
            AbstractC5868k.m23672d(this.f18753c, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
            return ((InterfaceC5664p) AbstractC5882y.m23704d(this.f18753c, 2)).mo2391h(this.f18754d, this);
        }
    }

    /* renamed from: fe.c$b */
    /* loaded from: classes3.dex */
    public static final class b extends AbstractC4437d {

        /* renamed from: d */
        private int f18755d;

        /* renamed from: e */
        final /* synthetic */ InterfaceC5664p f18756e;

        /* renamed from: f */
        final /* synthetic */ Object f18757f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC4181d interfaceC4181d, InterfaceC4184g interfaceC4184g, InterfaceC5664p interfaceC5664p, Object obj) {
            super(interfaceC4181d, interfaceC4184g);
            this.f18756e = interfaceC5664p;
            this.f18757f = obj;
            AbstractC5868k.m23672d(interfaceC4181d, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // ge.AbstractC4434a
        /* renamed from: l */
        protected Object mo2392l(Object obj) {
            int i10 = this.f18755d;
            if (i10 != 0) {
                if (i10 == 1) {
                    this.f18755d = 2;
                    AbstractC1320p.m5976b(obj);
                    return obj;
                }
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.f18755d = 1;
            AbstractC1320p.m5976b(obj);
            AbstractC5868k.m23672d(this.f18756e, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
            return ((InterfaceC5664p) AbstractC5882y.m23704d(this.f18756e, 2)).mo2391h(this.f18757f, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static InterfaceC4181d m18092a(InterfaceC5664p interfaceC5664p, Object obj, InterfaceC4181d interfaceC4181d) {
        AbstractC5868k.m23674f(interfaceC5664p, "<this>");
        AbstractC5868k.m23674f(interfaceC4181d, "completion");
        InterfaceC4181d m18637a = AbstractC4441h.m18637a(interfaceC4181d);
        if (interfaceC5664p instanceof AbstractC4434a) {
            return ((AbstractC4434a) interfaceC5664p).mo2390a(obj, m18637a);
        }
        InterfaceC4184g mo17487e = m18637a.mo17487e();
        if (mo17487e == C4185h.f18299a) {
            return new a(m18637a, interfaceC5664p, obj);
        }
        return new b(m18637a, mo17487e, interfaceC5664p, obj);
    }

    /* renamed from: b */
    public static InterfaceC4181d m18093b(InterfaceC4181d interfaceC4181d) {
        AbstractC4437d abstractC4437d;
        InterfaceC4181d m18627n;
        AbstractC5868k.m23674f(interfaceC4181d, "<this>");
        if (interfaceC4181d instanceof AbstractC4437d) {
            abstractC4437d = (AbstractC4437d) interfaceC4181d;
        } else {
            abstractC4437d = null;
        }
        if (abstractC4437d != null && (m18627n = abstractC4437d.m18627n()) != null) {
            return m18627n;
        }
        return interfaceC4181d;
    }
}
