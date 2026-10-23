package p400xa;

import me.InterfaceC5660l;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p278p1.C6169i;
import p278p1.C6172l;
import p317rb.AbstractC6567a;
import p359ue.C7155i;
import p359ue.InterfaceC7153g;
import p363v2.C7197a;

/* renamed from: xa.j1 */
/* loaded from: classes2.dex */
public final class C7580j1 {

    /* renamed from: a */
    public static final C7580j1 f27853a = new C7580j1();

    /* renamed from: xa.j1$a */
    /* loaded from: classes2.dex */
    static final class a extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        final /* synthetic */ String f27854a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str) {
            super(1);
            this.f27854a = str;
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence mo542f(InterfaceC7153g interfaceC7153g) {
            AbstractC5868k.m23674f(interfaceC7153g, "matchResult");
            return ((String) interfaceC7153g.mo27666a().get(1)) + this.f27854a + ((String) interfaceC7153g.mo27666a().get(3));
        }
    }

    private C7580j1() {
    }

    /* renamed from: a */
    public final String m29088a(String str) {
        if (AbstractC6567a.m25637g(str)) {
            AbstractC5868k.m23671c(str);
            return (String) new C7155i(";").m27681e(str, 2).get(0);
        }
        return null;
    }

    /* renamed from: b */
    public final C6169i m29089b(String str, String str2) {
        boolean z10 = false;
        AbstractC5868k.m23674f(str, "url");
        AbstractC5868k.m23674f(str2, "domainKey");
        String m27854k = C7197a.f26917a.m27854k(str2);
        boolean z11 = true;
        if (m27854k.length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (str.length() != 0) {
                z11 = false;
            }
            if (!z11) {
                str = new C7155i("^(https?://)([^/]+)(.*)").m27680d(str, new a(m27854k));
            }
        }
        return m29090c(str);
    }

    /* renamed from: c */
    public final C6169i m29090c(String str) {
        AbstractC5868k.m23674f(str, "<this>");
        try {
            return new C6169i(str, new C6172l.a().m24654a("ReqSource", "own").m24656c());
        } catch (Exception unused) {
            return null;
        }
    }
}
