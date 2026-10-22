package p261o6;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import p235m6.C5598b;
import p235m6.InterfaceC5597a;
import p235m6.InterfaceC5600d;
import p235m6.InterfaceC5601e;
import p235m6.InterfaceC5602f;
import p235m6.InterfaceC5603g;
import p248n6.InterfaceC5746a;
import p248n6.InterfaceC5747b;

/* renamed from: o6.d */
/* loaded from: classes.dex */
public final class C5920d implements InterfaceC5747b {

    /* renamed from: e */
    private static final InterfaceC5600d f23542e = new InterfaceC5600d() { // from class: o6.a
        @Override // p235m6.InterfaceC5600d
        /* renamed from: a */
        public final void mo6142a(Object obj, Object obj2) {
            C5920d.m23932l(obj, (InterfaceC5601e) obj2);
        }
    };

    /* renamed from: f */
    private static final InterfaceC5602f f23543f = new InterfaceC5602f() { // from class: o6.b
        @Override // p235m6.InterfaceC5602f
        /* renamed from: a */
        public final void mo22771a(Object obj, Object obj2) {
            ((InterfaceC5603g) obj2).mo22772d((String) obj);
        }
    };

    /* renamed from: g */
    private static final InterfaceC5602f f23544g = new InterfaceC5602f() { // from class: o6.c
        @Override // p235m6.InterfaceC5602f
        /* renamed from: a */
        public final void mo22771a(Object obj, Object obj2) {
            C5920d.m23934n((Boolean) obj, (InterfaceC5603g) obj2);
        }
    };

    /* renamed from: h */
    private static final b f23545h = new b(null);

    /* renamed from: a */
    private final Map f23546a = new HashMap();

    /* renamed from: b */
    private final Map f23547b = new HashMap();

    /* renamed from: c */
    private InterfaceC5600d f23548c = f23542e;

    /* renamed from: d */
    private boolean f23549d = false;

    /* renamed from: o6.d$a */
    /* loaded from: classes.dex */
    class a implements InterfaceC5597a {
        a() {
        }

        @Override // p235m6.InterfaceC5597a
        /* renamed from: a */
        public void mo22759a(Object obj, Writer writer) {
            C5921e c5921e = new C5921e(writer, C5920d.this.f23546a, C5920d.this.f23547b, C5920d.this.f23548c, C5920d.this.f23549d);
            c5921e.m23947i(obj, false);
            c5921e.m23955r();
        }

        @Override // p235m6.InterfaceC5597a
        /* renamed from: b */
        public String mo22760b(Object obj) {
            StringWriter stringWriter = new StringWriter();
            try {
                mo22759a(obj, stringWriter);
            } catch (IOException unused) {
            }
            return stringWriter.toString();
        }
    }

    /* renamed from: o6.d$b */
    /* loaded from: classes.dex */
    private static final class b implements InterfaceC5602f {

        /* renamed from: a */
        private static final DateFormat f23551a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f23551a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        private b() {
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // p235m6.InterfaceC5602f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo22771a(Date date, InterfaceC5603g interfaceC5603g) {
            interfaceC5603g.mo22772d(f23551a.format(date));
        }
    }

    public C5920d() {
        m23939p(String.class, f23543f);
        m23939p(Boolean.class, f23544g);
        m23939p(Date.class, f23545h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static /* synthetic */ void m23932l(Object obj, InterfaceC5601e interfaceC5601e) {
        throw new C5598b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public static /* synthetic */ void m23934n(Boolean bool, InterfaceC5603g interfaceC5603g) {
        interfaceC5603g.mo22773e(bool.booleanValue());
    }

    /* renamed from: i */
    public InterfaceC5597a m23935i() {
        return new a();
    }

    /* renamed from: j */
    public C5920d m23936j(InterfaceC5746a interfaceC5746a) {
        interfaceC5746a.mo6141a(this);
        return this;
    }

    /* renamed from: k */
    public C5920d m23937k(boolean z10) {
        this.f23549d = z10;
        return this;
    }

    @Override // p248n6.InterfaceC5747b
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public C5920d mo23161a(Class cls, InterfaceC5600d interfaceC5600d) {
        this.f23546a.put(cls, interfaceC5600d);
        this.f23547b.remove(cls);
        return this;
    }

    /* renamed from: p */
    public C5920d m23939p(Class cls, InterfaceC5602f interfaceC5602f) {
        this.f23547b.put(cls, interfaceC5602f);
        this.f23546a.remove(cls);
        return this;
    }
}
