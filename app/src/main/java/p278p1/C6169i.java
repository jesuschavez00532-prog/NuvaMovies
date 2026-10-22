package p278p1;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;
import p109e2.AbstractC4121k;
import p184j1.InterfaceC4975f;

/* renamed from: p1.i */
/* loaded from: classes.dex */
public class C6169i implements InterfaceC4975f {

    /* renamed from: b */
    private final InterfaceC6170j f24257b;

    /* renamed from: c */
    private final URL f24258c;

    /* renamed from: d */
    private final String f24259d;

    /* renamed from: e */
    private String f24260e;

    /* renamed from: f */
    private URL f24261f;

    /* renamed from: g */
    private volatile byte[] f24262g;

    /* renamed from: h */
    private int f24263h;

    public C6169i(URL url) {
        this(url, InterfaceC6170j.f24265b);
    }

    /* renamed from: d */
    private byte[] m24639d() {
        if (this.f24262g == null) {
            this.f24262g = m24642c().getBytes(InterfaceC4975f.f20711a);
        }
        return this.f24262g;
    }

    /* renamed from: f */
    private String m24640f() {
        if (TextUtils.isEmpty(this.f24260e)) {
            String str = this.f24259d;
            if (TextUtils.isEmpty(str)) {
                str = ((URL) AbstractC4121k.m17226d(this.f24258c)).toString();
            }
            this.f24260e = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
        }
        return this.f24260e;
    }

    /* renamed from: g */
    private URL m24641g() {
        if (this.f24261f == null) {
            this.f24261f = new URL(m24640f());
        }
        return this.f24261f;
    }

    @Override // p184j1.InterfaceC4975f
    /* renamed from: a */
    public void mo16761a(MessageDigest messageDigest) {
        messageDigest.update(m24639d());
    }

    /* renamed from: c */
    public String m24642c() {
        String str = this.f24259d;
        if (str == null) {
            return ((URL) AbstractC4121k.m17226d(this.f24258c)).toString();
        }
        return str;
    }

    /* renamed from: e */
    public Map m24643e() {
        return this.f24257b.mo24646a();
    }

    @Override // p184j1.InterfaceC4975f
    public boolean equals(Object obj) {
        if (!(obj instanceof C6169i)) {
            return false;
        }
        C6169i c6169i = (C6169i) obj;
        if (!m24642c().equals(c6169i.m24642c()) || !this.f24257b.equals(c6169i.f24257b)) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public String m24644h() {
        return m24640f();
    }

    @Override // p184j1.InterfaceC4975f
    public int hashCode() {
        if (this.f24263h == 0) {
            int hashCode = m24642c().hashCode();
            this.f24263h = hashCode;
            this.f24263h = (hashCode * 31) + this.f24257b.hashCode();
        }
        return this.f24263h;
    }

    /* renamed from: i */
    public URL m24645i() {
        return m24641g();
    }

    public String toString() {
        return m24642c();
    }

    public C6169i(String str) {
        this(str, InterfaceC6170j.f24265b);
    }

    public C6169i(URL url, InterfaceC6170j interfaceC6170j) {
        this.f24258c = (URL) AbstractC4121k.m17226d(url);
        this.f24259d = null;
        this.f24257b = (InterfaceC6170j) AbstractC4121k.m17226d(interfaceC6170j);
    }

    public C6169i(String str, InterfaceC6170j interfaceC6170j) {
        this.f24258c = null;
        this.f24259d = AbstractC4121k.m17224b(str);
        this.f24257b = (InterfaceC6170j) AbstractC4121k.m17226d(interfaceC6170j);
    }
}
