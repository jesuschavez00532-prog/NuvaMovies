package p157h6;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;
import p007a6.AbstractC0074g;
import p007a6.C0093p0;
import p007a6.C0098s;
import p007a6.C0104w;
import p007a6.EnumC0100t;
import p007a6.InterfaceC0096r;
import p113e6.C4137b;
import p127f5.AbstractC4245i;
import p127f5.AbstractC4250l;
import p127f5.C4247j;
import p127f5.InterfaceC4243h;
import p128f6.C4270f;
import p395x5.C7503f;

/* renamed from: h6.f */
/* loaded from: classes.dex */
public class C4554f implements InterfaceC4557i {

    /* renamed from: a */
    private final Context f19616a;

    /* renamed from: b */
    private final C4558j f19617b;

    /* renamed from: c */
    private final C4555g f19618c;

    /* renamed from: d */
    private final InterfaceC0096r f19619d;

    /* renamed from: e */
    private final C4549a f19620e;

    /* renamed from: f */
    private final InterfaceC4559k f19621f;

    /* renamed from: g */
    private final C0098s f19622g;

    /* renamed from: h */
    private final AtomicReference f19623h;

    /* renamed from: i */
    private final AtomicReference f19624i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h6.f$a */
    /* loaded from: classes.dex */
    public class a implements InterfaceC4243h {
        a() {
        }

        @Override // p127f5.InterfaceC4243h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public AbstractC4245i mo346a(Void r52) {
            JSONObject mo18955a = C4554f.this.f19621f.mo18955a(C4554f.this.f19617b, true);
            if (mo18955a != null) {
                C4552d m18980b = C4554f.this.f19618c.m18980b(mo18955a);
                C4554f.this.f19620e.m18948c(m18980b.f19602c, mo18955a);
                C4554f.this.m18971q(mo18955a, "Loaded settings: ");
                C4554f c4554f = C4554f.this;
                c4554f.m18972r(c4554f.f19617b.f19632f);
                C4554f.this.f19623h.set(m18980b);
                ((C4247j) C4554f.this.f19624i.get()).m17728e(m18980b);
            }
            return AbstractC4250l.m17733e(null);
        }
    }

    C4554f(Context context, C4558j c4558j, InterfaceC0096r interfaceC0096r, C4555g c4555g, C4549a c4549a, InterfaceC4559k interfaceC4559k, C0098s c0098s) {
        AtomicReference atomicReference = new AtomicReference();
        this.f19623h = atomicReference;
        this.f19624i = new AtomicReference(new C4247j());
        this.f19616a = context;
        this.f19617b = c4558j;
        this.f19619d = interfaceC0096r;
        this.f19618c = c4555g;
        this.f19620e = c4549a;
        this.f19621f = interfaceC4559k;
        this.f19622g = c0098s;
        atomicReference.set(C4550b.m18949b(interfaceC0096r));
    }

    /* renamed from: l */
    public static C4554f m18968l(Context context, String str, C0104w c0104w, C4137b c4137b, String str2, String str3, C4270f c4270f, C0098s c0098s) {
        String m476g = c0104w.m476g();
        C0093p0 c0093p0 = new C0093p0();
        return new C4554f(context, new C4558j(str, c0104w.m477h(), c0104w.m478i(), c0104w.m479j(), c0104w, AbstractC0074g.m258h(AbstractC0074g.m264n(context), str, str3, str2), str3, str2, EnumC0100t.m448a(m476g).m449b()), c0093p0, new C4555g(c0093p0), new C4549a(c4270f), new C4551c(String.format(Locale.US, "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings", str), c4137b), c0098s);
    }

    /* renamed from: m */
    private C4552d m18969m(EnumC4553e enumC4553e) {
        C4552d c4552d = null;
        try {
            if (!EnumC4553e.SKIP_CACHE_LOOKUP.equals(enumC4553e)) {
                JSONObject m18947b = this.f19620e.m18947b();
                if (m18947b != null) {
                    C4552d m18980b = this.f19618c.m18980b(m18947b);
                    if (m18980b != null) {
                        m18971q(m18947b, "Loaded cached settings: ");
                        long mo435a = this.f19619d.mo435a();
                        if (!EnumC4553e.IGNORE_CACHE_EXPIRATION.equals(enumC4553e) && m18980b.m18959a(mo435a)) {
                            C7503f.m28716f().m28723i("Cached settings have expired.");
                        }
                        try {
                            C7503f.m28716f().m28723i("Returning cached settings.");
                            c4552d = m18980b;
                        } catch (Exception e10) {
                            e = e10;
                            c4552d = m18980b;
                            C7503f.m28716f().m28720e("Failed to get cached settings", e);
                            return c4552d;
                        }
                    } else {
                        C7503f.m28716f().m28720e("Failed to parse cached settings data.", null);
                    }
                } else {
                    C7503f.m28716f().m28717b("No cached settings data found.");
                }
            }
        } catch (Exception e11) {
            e = e11;
        }
        return c4552d;
    }

    /* renamed from: n */
    private String m18970n() {
        return AbstractC0074g.m268r(this.f19616a).getString("existing_instance_identifier", "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public void m18971q(JSONObject jSONObject, String str) {
        C7503f.m28716f().m28717b(str + jSONObject.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public boolean m18972r(String str) {
        SharedPreferences.Editor edit = AbstractC0074g.m268r(this.f19616a).edit();
        edit.putString("existing_instance_identifier", str);
        edit.apply();
        return true;
    }

    @Override // p157h6.InterfaceC4557i
    /* renamed from: a */
    public AbstractC4245i mo18973a() {
        return ((C4247j) this.f19624i.get()).m17724a();
    }

    @Override // p157h6.InterfaceC4557i
    /* renamed from: b */
    public C4552d mo18974b() {
        return (C4552d) this.f19623h.get();
    }

    /* renamed from: k */
    boolean m18975k() {
        return !m18970n().equals(this.f19617b.f19632f);
    }

    /* renamed from: o */
    public AbstractC4245i m18976o(EnumC4553e enumC4553e, Executor executor) {
        C4552d m18969m;
        if (!m18975k() && (m18969m = m18969m(enumC4553e)) != null) {
            this.f19623h.set(m18969m);
            ((C4247j) this.f19624i.get()).m17728e(m18969m);
            return AbstractC4250l.m17733e(null);
        }
        C4552d m18969m2 = m18969m(EnumC4553e.IGNORE_CACHE_EXPIRATION);
        if (m18969m2 != null) {
            this.f19623h.set(m18969m2);
            ((C4247j) this.f19624i.get()).m17728e(m18969m2);
        }
        return this.f19622g.m447j(executor).mo17714p(executor, new a());
    }

    /* renamed from: p */
    public AbstractC4245i m18977p(Executor executor) {
        return m18976o(EnumC4553e.USE_CACHE, executor);
    }
}
