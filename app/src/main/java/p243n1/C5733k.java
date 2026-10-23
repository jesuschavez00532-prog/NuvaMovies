package p243n1;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import p109e2.AbstractC4121k;
import p109e2.AbstractC4122l;
import p109e2.C4118h;
import p124f2.AbstractC4219a;
import p124f2.AbstractC4221c;
import p184j1.InterfaceC4975f;
import p373w.InterfaceC7339d;

/* renamed from: n1.k */
/* loaded from: classes.dex */
public class C5733k {

    /* renamed from: a */
    private final C4118h f23019a = new C4118h(1000);

    /* renamed from: b */
    private final InterfaceC7339d f23020b = AbstractC4219a.m17633d(10, new a());

    /* renamed from: n1.k$a */
    /* loaded from: classes.dex */
    class a implements AbstractC4219a.d {
        a() {
        }

        @Override // p124f2.AbstractC4219a.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b mo17637a() {
            try {
                return new b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n1.k$b */
    /* loaded from: classes.dex */
    public static final class b implements AbstractC4219a.f {

        /* renamed from: a */
        final MessageDigest f23022a;

        /* renamed from: b */
        private final AbstractC4221c f23023b = AbstractC4221c.m17647a();

        b(MessageDigest messageDigest) {
            this.f23022a = messageDigest;
        }

        @Override // p124f2.AbstractC4219a.f
        /* renamed from: e */
        public AbstractC4221c mo17640e() {
            return this.f23023b;
        }
    }

    /* renamed from: a */
    private String m23145a(InterfaceC4975f interfaceC4975f) {
        b bVar = (b) AbstractC4121k.m17226d(this.f23020b.mo16818b());
        try {
            interfaceC4975f.mo16761a(bVar.f23022a);
            return AbstractC4122l.m17252y(bVar.f23022a.digest());
        } finally {
            this.f23020b.mo16817a(bVar);
        }
    }

    /* renamed from: b */
    public String m23146b(InterfaceC4975f interfaceC4975f) {
        String str = null;
        synchronized (this.f23019a) {
            str = (String) this.f23019a.m17213g(interfaceC4975f);
        }
        if (str == null) {
            str = m23145a(interfaceC4975f);
        }
        synchronized (this.f23019a) {
            this.f23019a.m17217k(interfaceC4975f, str);
        }
        return str;
    }
}
