package p344te;

import ee.InterfaceC4181d;
import java.util.Iterator;
import me.InterfaceC5664p;
import ne.AbstractC5868k;
import p136fe.AbstractC4312c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: te.f */
/* loaded from: classes3.dex */
public abstract class AbstractC6946f {

    /* renamed from: te.f$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC6942b {

        /* renamed from: a */
        final /* synthetic */ InterfaceC5664p f26316a;

        public a(InterfaceC5664p interfaceC5664p) {
            this.f26316a = interfaceC5664p;
        }

        @Override // p344te.InterfaceC6942b
        public Iterator iterator() {
            return AbstractC6946f.m26987a(this.f26316a);
        }
    }

    /* renamed from: a */
    public static final Iterator m26987a(InterfaceC5664p interfaceC5664p) {
        InterfaceC4181d m18092a;
        AbstractC5868k.m23674f(interfaceC5664p, "block");
        C6943c c6943c = new C6943c();
        m18092a = AbstractC4312c.m18092a(interfaceC5664p, c6943c, c6943c);
        c6943c.m26980k(m18092a);
        return c6943c;
    }

    /* renamed from: b */
    public static InterfaceC6942b m26988b(InterfaceC5664p interfaceC5664p) {
        AbstractC5868k.m23674f(interfaceC5664p, "block");
        return new a(interfaceC5664p);
    }
}
