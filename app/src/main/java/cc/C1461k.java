package cc;

import com.request.bean.AutoLoginBean;
import ne.AbstractC5868k;

/* renamed from: cc.k */
/* loaded from: classes.dex */
public final class C1461k {

    /* renamed from: a */
    public static final C1461k f5605a = new C1461k();

    /* renamed from: b */
    private static String f5606b = "";

    /* renamed from: c */
    private static String f5607c = "";

    /* renamed from: d */
    private static String f5608d = "";

    /* renamed from: e */
    private static String f5609e = "";

    /* renamed from: f */
    private static String f5610f = "";

    /* renamed from: g */
    private static String f5611g = "";

    /* renamed from: h */
    private static String f5612h = "";

    /* renamed from: i */
    private static String f5613i = "";

    private C1461k() {
    }

    /* renamed from: a */
    public final void m6801a() {
        f5608d = "";
        f5609e = "";
        f5610f = "";
        f5611g = "";
        f5612h = "";
        f5613i = "";
    }

    /* renamed from: b */
    public final String m6802b() {
        return f5608d;
    }

    /* renamed from: c */
    public final String m6803c() {
        return f5611g;
    }

    /* renamed from: d */
    public final AutoLoginBean m6804d() {
        return new AutoLoginBean(f5608d, f5609e, f5610f, f5611g, f5612h, f5613i, f5607c);
    }

    /* renamed from: e */
    public final String m6805e() {
        return f5610f;
    }

    /* renamed from: f */
    public final String m6806f() {
        return f5606b;
    }

    /* renamed from: g */
    public final String m6807g() {
        return f5607c;
    }

    /* renamed from: h */
    public final String m6808h() {
        return f5609e;
    }

    /* renamed from: i */
    public final String m6809i() {
        return f5613i;
    }

    /* renamed from: j */
    public final String m6810j() {
        return f5612h;
    }

    /* renamed from: k */
    public final void m6811k(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        f5606b = str;
    }

    /* renamed from: l */
    public final void m6812l(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        f5607c = str;
    }

    /* renamed from: m */
    public final void m6813m(String str, String str2, String str3, String str4, String str5, String str6) {
        AbstractC5868k.m23674f(str, "accountType");
        AbstractC5868k.m23674f(str2, "username");
        AbstractC5868k.m23674f(str3, "password");
        AbstractC5868k.m23674f(str4, "areaCode");
        AbstractC5868k.m23674f(str5, "verificationToken");
        AbstractC5868k.m23674f(str6, "verificationCode");
        f5608d = str;
        f5609e = str2;
        f5610f = str3;
        f5611g = str4;
        f5612h = str5;
        f5613i = str6;
    }
}
