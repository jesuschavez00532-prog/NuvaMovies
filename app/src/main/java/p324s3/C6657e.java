package p324s3;

import android.content.Context;
import javax.inject.Provider;
import p005a4.C0042m0;
import p005a4.C0050q0;
import p024b4.C1061g;
import p024b4.C1063h;
import p024b4.C1065i;
import p024b4.C1067j;
import p024b4.C1076n0;
import p024b4.C1090u0;
import p024b4.InterfaceC1055d;
import p095d4.C3937c;
import p095d4.C3938d;
import p324s3.AbstractC6673u;
import p335t3.C6902j;
import p335t3.C6904l;
import p364v3.AbstractC7201d;
import p364v3.C7198a;
import p364v3.C7200c;
import p364v3.InterfaceC7199b;
import p424z3.C7748d;
import p424z3.C7751g;
import p424z3.C7753i;

/* renamed from: s3.e */
/* loaded from: classes.dex */
final class C6657e extends AbstractC6673u {

    /* renamed from: a */
    private Provider f25558a;

    /* renamed from: b */
    private Provider f25559b;

    /* renamed from: c */
    private Provider f25560c;

    /* renamed from: d */
    private Provider f25561d;

    /* renamed from: e */
    private Provider f25562e;

    /* renamed from: f */
    private Provider f25563f;

    /* renamed from: g */
    private Provider f25564g;

    /* renamed from: h */
    private Provider f25565h;

    /* renamed from: i */
    private Provider f25566i;

    /* renamed from: j */
    private Provider f25567j;

    /* renamed from: k */
    private Provider f25568k;

    /* renamed from: l */
    private Provider f25569l;

    /* renamed from: m */
    private Provider f25570m;

    /* renamed from: s3.e$b */
    /* loaded from: classes.dex */
    private static final class b implements AbstractC6673u.a {

        /* renamed from: a */
        private Context f25571a;

        private b() {
        }

        @Override // p324s3.AbstractC6673u.a
        /* renamed from: a */
        public AbstractC6673u mo26015a() {
            AbstractC7201d.m27893a(this.f25571a, Context.class);
            return new C6657e(this.f25571a);
        }

        @Override // p324s3.AbstractC6673u.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public b mo26016b(Context context) {
            this.f25571a = (Context) AbstractC7201d.m27894b(context);
            return this;
        }
    }

    /* renamed from: c */
    public static AbstractC6673u.a m26011c() {
        return new b();
    }

    /* renamed from: d */
    private void m26012d(Context context) {
        this.f25558a = C7198a.m27890b(C6663k.m26030a());
        InterfaceC7199b m27892a = C7200c.m27892a(context);
        this.f25559b = m27892a;
        C6902j m26835a = C6902j.m26835a(m27892a, C3937c.m16765a(), C3938d.m16769a());
        this.f25560c = m26835a;
        this.f25561d = C7198a.m27890b(C6904l.m26842a(this.f25559b, m26835a));
        this.f25562e = C1090u0.m5040a(this.f25559b, C1061g.m4933a(), C1065i.m4941a());
        this.f25563f = C1063h.m4938a(this.f25559b);
        this.f25564g = C7198a.m27890b(C1076n0.m5023a(C3937c.m16765a(), C3938d.m16769a(), C1067j.m4945a(), this.f25562e, this.f25563f));
        C7751g m29955b = C7751g.m29955b(C3937c.m16765a());
        this.f25565h = m29955b;
        C7753i m29958a = C7753i.m29958a(this.f25559b, this.f25564g, m29955b, C3938d.m16769a());
        this.f25566i = m29958a;
        Provider provider = this.f25558a;
        Provider provider2 = this.f25561d;
        Provider provider3 = this.f25564g;
        this.f25567j = C7748d.m29950a(provider, provider2, m29958a, provider3, provider3);
        Provider provider4 = this.f25559b;
        Provider provider5 = this.f25561d;
        Provider provider6 = this.f25564g;
        this.f25568k = C0042m0.m181a(provider4, provider5, provider6, this.f25566i, this.f25558a, provider6, C3937c.m16765a(), C3938d.m16769a(), this.f25564g);
        Provider provider7 = this.f25558a;
        Provider provider8 = this.f25564g;
        this.f25569l = C0050q0.m194a(provider7, provider8, this.f25566i, provider8);
        this.f25570m = C7198a.m27890b(C6674v.m26049a(C3937c.m16765a(), C3938d.m16769a(), this.f25567j, this.f25568k, this.f25569l));
    }

    @Override // p324s3.AbstractC6673u
    /* renamed from: a */
    InterfaceC1055d mo26013a() {
        return (InterfaceC1055d) this.f25564g.get();
    }

    @Override // p324s3.AbstractC6673u
    /* renamed from: b */
    C6672t mo26014b() {
        return (C6672t) this.f25570m.get();
    }

    private C6657e(Context context) {
        m26012d(context);
    }
}
