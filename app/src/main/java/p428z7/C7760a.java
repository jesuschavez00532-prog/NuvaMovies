package p428z7;

import android.text.TextUtils;
import java.io.Serializable;
import java.util.List;
import p009a8.C0111a;
import p339t7.InterfaceC6924b;

/* renamed from: z7.a */
/* loaded from: classes2.dex */
public class C7760a implements Serializable {

    /* renamed from: a */
    private transient InterfaceC6924b f28590a;

    /* renamed from: b */
    private C0111a f28591b;

    /* renamed from: c */
    private String f28592c;

    /* renamed from: d */
    private long f28593d;

    /* renamed from: e */
    private String f28594e;

    /* renamed from: f */
    private String f28595f;

    /* renamed from: g */
    private String f28596g;

    /* renamed from: h */
    private long f28597h;

    /* renamed from: i */
    private long f28598i;

    /* renamed from: j */
    private int f28599j;

    /* renamed from: k */
    private String f28600k;

    /* renamed from: l */
    private int f28601l = -1;

    /* renamed from: m */
    private int f28602m;

    /* renamed from: n */
    private List f28603n;

    /* renamed from: z7.a$a */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a */
        private String f28604a;

        /* renamed from: b */
        private long f28605b = -1;

        /* renamed from: c */
        private String f28606c;

        /* renamed from: d */
        private String f28607d;

        /* renamed from: e */
        private String f28608e;

        /* renamed from: a */
        public C7760a m30028a() {
            C7760a c7760a = new C7760a();
            if (!TextUtils.isEmpty(this.f28606c)) {
                c7760a.m30001G(this.f28606c);
                if (!TextUtils.isEmpty(this.f28608e)) {
                    c7760a.m29995A(this.f28608e);
                    if (this.f28605b == -1) {
                        c7760a.m30022u(System.currentTimeMillis());
                    }
                    c7760a.m30020s(this.f28607d);
                    if (TextUtils.isEmpty(this.f28604a)) {
                        c7760a.m30027z(this.f28606c);
                    } else {
                        c7760a.m30027z(this.f28604a);
                    }
                    return c7760a;
                }
                throw new C0111a(1, "path cannot be null.");
            }
            throw new C0111a(0, "uri cannot be null.");
        }

        /* renamed from: b */
        public a m30029b(String str) {
            this.f28607d = str;
            return this;
        }

        /* renamed from: c */
        public a m30030c(String str) {
            this.f28604a = str;
            return this;
        }

        /* renamed from: d */
        public a m30031d(String str) {
            this.f28608e = str;
            return this;
        }

        /* renamed from: e */
        public a m30032e(String str) {
            this.f28606c = str;
            return this;
        }
    }

    /* renamed from: A */
    public void m29995A(String str) {
        this.f28596g = str;
    }

    /* renamed from: B */
    public void m29996B(long j10) {
        this.f28598i = j10;
    }

    /* renamed from: C */
    public void m29997C(long j10) {
        this.f28597h = j10;
    }

    /* renamed from: D */
    public void m29998D(int i10) {
        this.f28599j = i10;
    }

    /* renamed from: E */
    public void m29999E(int i10) {
        this.f28602m = i10;
    }

    /* renamed from: F */
    public void m30000F(boolean z10) {
        this.f28602m = !z10 ? 1 : 0;
    }

    /* renamed from: G */
    public void m30001G(String str) {
        this.f28594e = str;
    }

    /* renamed from: a */
    public String m30002a() {
        return this.f28595f;
    }

    /* renamed from: b */
    public int m30003b() {
        return this.f28601l;
    }

    /* renamed from: c */
    public long m30004c() {
        return this.f28593d;
    }

    /* renamed from: d */
    public InterfaceC6924b m30005d() {
        return this.f28590a;
    }

    /* renamed from: e */
    public List m30006e() {
        return this.f28603n;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass() && this.f28592c == ((C7760a) obj).f28592c) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public String m30007f() {
        return this.f28600k;
    }

    /* renamed from: g */
    public C0111a m30008g() {
        return this.f28591b;
    }

    /* renamed from: h */
    public String m30009h() {
        return this.f28592c;
    }

    public int hashCode() {
        return this.f28592c.hashCode();
    }

    /* renamed from: i */
    public String m30010i() {
        return this.f28596g;
    }

    /* renamed from: j */
    public long m30011j() {
        return this.f28598i;
    }

    /* renamed from: k */
    public long m30012k() {
        return this.f28597h;
    }

    /* renamed from: l */
    public int m30013l() {
        return this.f28599j;
    }

    /* renamed from: m */
    public int m30014m() {
        return this.f28602m;
    }

    /* renamed from: n */
    public String m30015n() {
        return this.f28594e;
    }

    /* renamed from: o */
    public boolean m30016o() {
        if (this.f28599j == 5) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public boolean m30017p() {
        int i10 = this.f28599j;
        if (i10 == 2 || i10 == 1 || i10 == 3) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    public boolean m30018q() {
        int i10 = this.f28599j;
        if (i10 != 4 && i10 != 6 && i10 != 7) {
            return false;
        }
        return true;
    }

    /* renamed from: r */
    public boolean m30019r() {
        if (this.f28602m == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: s */
    public void m30020s(String str) {
        this.f28595f = str;
    }

    /* renamed from: t */
    public void m30021t(int i10) {
        this.f28601l = i10;
    }

    /* renamed from: u */
    public void m30022u(long j10) {
        this.f28593d = j10;
    }

    /* renamed from: v */
    public void m30023v(InterfaceC6924b interfaceC6924b) {
        this.f28590a = interfaceC6924b;
    }

    /* renamed from: w */
    public void m30024w(List list) {
        this.f28603n = list;
    }

    /* renamed from: x */
    public void m30025x(String str) {
        this.f28600k = str;
    }

    /* renamed from: y */
    public void m30026y(C0111a c0111a) {
        this.f28591b = c0111a;
    }

    /* renamed from: z */
    public void m30027z(String str) {
        this.f28592c = str;
    }
}
