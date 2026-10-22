package cc;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.lzy.okgo.cache.CacheEntity;
import com.request.bean.CouponQualificationEvent;
import com.request.result.AuthInfoList;
import com.request.result.GetAuthInfoResult;
import com.request.result.GetAuthInfoResultData;
import com.request.result.UserInfo;
import java.util.List;
import ne.AbstractC5868k;
import org.android.agoo.message.MessageService;
import p170i2.C4842a;
import p185j2.C4982a;
import p201k2.C5090g;
import p201k2.C5096m;
import p287pb.AbstractApplicationC6253c;
import p371vb.C7252a;
import ye.C7709c;

/* renamed from: cc.m0 */
/* loaded from: classes.dex */
public final class C1466m0 {

    /* renamed from: h */
    private static UserInfo f5634h;

    /* renamed from: k */
    private static boolean f5637k;

    /* renamed from: m */
    private static boolean f5639m;

    /* renamed from: n */
    private static boolean f5640n;

    /* renamed from: q */
    private static long f5643q;

    /* renamed from: r */
    private static int f5644r;

    /* renamed from: s */
    private static boolean f5645s;

    /* renamed from: a */
    public static final C1466m0 f5627a = new C1466m0();

    /* renamed from: b */
    private static String f5628b = "";

    /* renamed from: c */
    private static String f5629c = "";

    /* renamed from: d */
    private static String f5630d = "";

    /* renamed from: e */
    private static String f5631e = "";

    /* renamed from: f */
    private static String f5632f = "";

    /* renamed from: g */
    private static String f5633g = "";

    /* renamed from: i */
    private static String f5635i = "";

    /* renamed from: j */
    private static String f5636j = "";

    /* renamed from: l */
    private static String f5638l = "";

    /* renamed from: o */
    private static String f5641o = "";

    /* renamed from: p */
    private static String f5642p = "";

    private C1466m0() {
    }

    /* renamed from: A */
    public final boolean m6828A() {
        String str;
        UserInfo userInfo = f5634h;
        String str2 = null;
        if (userInfo != null) {
            str = userInfo.getBindMobile();
        } else {
            str = null;
        }
        if (AbstractC5868k.m23669a(str, MessageService.MSG_DB_READY_REPORT)) {
            UserInfo userInfo2 = f5634h;
            if (userInfo2 != null) {
                str2 = userInfo2.getBindMail();
            }
            if (AbstractC5868k.m23669a(str2, MessageService.MSG_DB_READY_REPORT)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: B */
    public final boolean m6829B() {
        String str;
        GetAuthInfoResultData data;
        GetAuthInfoResultData data2;
        C7252a c7252a = C7252a.f27087a;
        GetAuthInfoResult m28073h = c7252a.m28073h();
        String str2 = null;
        if (m28073h != null && (data2 = m28073h.getData()) != null) {
            str = data2.getBindMail();
        } else {
            str = null;
        }
        if (AbstractC5868k.m23669a(str, MessageService.MSG_DB_READY_REPORT)) {
            GetAuthInfoResult m28073h2 = c7252a.m28073h();
            if (m28073h2 != null && (data = m28073h2.getData()) != null) {
                str2 = data.getBindMobile();
            }
            if (AbstractC5868k.m23669a(str2, MessageService.MSG_DB_READY_REPORT) && C5096m.f20979a.m20692c()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: C */
    public final boolean m6830C() {
        return f5639m;
    }

    /* renamed from: D */
    public final boolean m6831D() {
        String str;
        UserInfo userInfo = f5634h;
        if (userInfo != null) {
            if (userInfo != null) {
                str = userInfo.getUserIdentity();
            } else {
                str = null;
            }
            if (AbstractC5868k.m23669a(str, "2")) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: E */
    public final boolean m6832E() {
        return f5645s;
    }

    /* renamed from: F */
    public final boolean m6833F() {
        return f5637k;
    }

    /* renamed from: G */
    public final boolean m6834G() {
        return f5640n;
    }

    /* renamed from: H */
    public final boolean m6835H() {
        String str;
        UserInfo userInfo = f5634h;
        if (userInfo != null) {
            if (userInfo != null) {
                str = userInfo.getUserIdentity();
            } else {
                str = null;
            }
            if (!AbstractC5868k.m23669a(str, "4")) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0051, code lost:
    
        r0 = r0.getUserIdentity();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005b, code lost:
    
        if (ne.AbstractC5868k.m23669a(r0, "1") != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x005d, code lost:
    
        r0 = cc.C1466m0.f5634h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005f, code lost:
    
        if (r0 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0061, code lost:
    
        r4 = r0.getUserIdentity();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0069, code lost:
    
        if (ne.AbstractC5868k.m23669a(r4, "2") == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006b, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x003b, code lost:
    
        if (ne.AbstractC5868k.m23669a("3", r0) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x004b, code lost:
    
        if (ne.AbstractC5868k.m23669a(r0, "1") != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001f, code lost:
    
        if (ne.AbstractC5868k.m23669a("2", r1) == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x004d, code lost:
    
        r0 = cc.C1466m0.f5634h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x004f, code lost:
    
        if (r0 == null) goto L27;
     */
    /* renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m6836I() {
        /*
            r5 = this;
            i2.a r0 = p170i2.C4842a.f20329a
            i2.b r1 = r0.m19920a()
            boolean r1 = r1.mo19974w()
            java.lang.String r2 = "1"
            java.lang.String r3 = "2"
            r4 = 0
            if (r1 == 0) goto L21
            com.request.result.UserInfo r1 = cc.C1466m0.f5634h
            if (r1 == 0) goto L1a
            java.lang.String r1 = r1.getAccountType()
            goto L1b
        L1a:
            r1 = r4
        L1b:
            boolean r1 = ne.AbstractC5868k.m23669a(r3, r1)
            if (r1 != 0) goto L4d
        L21:
            i2.b r0 = r0.m19920a()
            boolean r0 = r0.m19948Y()
            if (r0 == 0) goto L3d
            com.request.result.UserInfo r0 = cc.C1466m0.f5634h
            if (r0 == 0) goto L34
            java.lang.String r0 = r0.getAccountType()
            goto L35
        L34:
            r0 = r4
        L35:
            java.lang.String r1 = "3"
            boolean r0 = ne.AbstractC5868k.m23669a(r1, r0)
            if (r0 != 0) goto L4d
        L3d:
            com.request.result.UserInfo r0 = cc.C1466m0.f5634h
            if (r0 == 0) goto L46
            java.lang.String r0 = r0.getAccountType()
            goto L47
        L46:
            r0 = r4
        L47:
            boolean r0 = ne.AbstractC5868k.m23669a(r0, r2)
            if (r0 == 0) goto L6d
        L4d:
            com.request.result.UserInfo r0 = cc.C1466m0.f5634h
            if (r0 == 0) goto L56
            java.lang.String r0 = r0.getUserIdentity()
            goto L57
        L56:
            r0 = r4
        L57:
            boolean r0 = ne.AbstractC5868k.m23669a(r0, r2)
            if (r0 != 0) goto L6b
            com.request.result.UserInfo r0 = cc.C1466m0.f5634h
            if (r0 == 0) goto L65
            java.lang.String r4 = r0.getUserIdentity()
        L65:
            boolean r0 = ne.AbstractC5868k.m23669a(r4, r3)
            if (r0 == 0) goto L6d
        L6b:
            r0 = 1
            goto L6e
        L6d:
            r0 = 0
        L6e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: cc.C1466m0.m6836I():boolean");
    }

    /* renamed from: J */
    public final boolean m6837J() {
        GetAuthInfoResultData getAuthInfoResultData;
        GetAuthInfoResult m28073h = C7252a.f27087a.m28073h();
        String str = null;
        if (m28073h != null) {
            getAuthInfoResultData = m28073h.getData();
        } else {
            getAuthInfoResultData = null;
        }
        if (getAuthInfoResultData != null) {
            str = getAuthInfoResultData.getChargeFlag();
        }
        if (AbstractC5868k.m23669a(str, "1") && AbstractC5868k.m23669a(getAuthInfoResultData.getShowFlag(), "1")) {
            return true;
        }
        return false;
    }

    /* renamed from: K */
    public final boolean m6838K() {
        GetAuthInfoResultData getAuthInfoResultData;
        GetAuthInfoResult m28073h = C7252a.f27087a.m28073h();
        String str = null;
        if (m28073h != null) {
            getAuthInfoResultData = m28073h.getData();
        } else {
            getAuthInfoResultData = null;
        }
        if (getAuthInfoResultData != null) {
            str = getAuthInfoResultData.getChargeFlag();
        }
        if (AbstractC5868k.m23669a(str, "1") && AbstractC5868k.m23669a(getAuthInfoResultData.getRenewFlag(), "2")) {
            return true;
        }
        return false;
    }

    /* renamed from: L */
    public final boolean m6839L() {
        GetAuthInfoResultData getAuthInfoResultData;
        GetAuthInfoResult m28073h = C7252a.f27087a.m28073h();
        String str = null;
        if (m28073h != null) {
            getAuthInfoResultData = m28073h.getData();
        } else {
            getAuthInfoResultData = null;
        }
        if (getAuthInfoResultData != null) {
            str = getAuthInfoResultData.getChargeFlag();
        }
        if (AbstractC5868k.m23669a(str, "1") && AbstractC5868k.m23669a(getAuthInfoResultData.getShowType(), "1")) {
            return true;
        }
        return false;
    }

    /* renamed from: M */
    public final boolean m6840M() {
        GetAuthInfoResultData getAuthInfoResultData;
        GetAuthInfoResult m28073h = C7252a.f27087a.m28073h();
        String str = null;
        if (m28073h != null) {
            getAuthInfoResultData = m28073h.getData();
        } else {
            getAuthInfoResultData = null;
        }
        if (getAuthInfoResultData != null) {
            str = getAuthInfoResultData.getChargeFlag();
        }
        if (AbstractC5868k.m23669a(str, "1") && (AbstractC5868k.m23669a(getAuthInfoResultData.getRenewFlag(), "2") || AbstractC5868k.m23669a(getAuthInfoResultData.getShowType(), "1"))) {
            return true;
        }
        return false;
    }

    /* renamed from: N */
    public final boolean m6841N() {
        return true;
    }

    /* renamed from: O */
    public final boolean m6842O() {
        String str;
        UserInfo userInfo = f5634h;
        if (userInfo != null) {
            if (userInfo != null) {
                str = userInfo.getUserIdentity();
            } else {
                str = null;
            }
            if (AbstractC5868k.m23669a(str, "1")) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: P */
    public final void m6843P(String str, Object obj) {
        AbstractC5868k.m23674f(str, CacheEntity.KEY);
        SharedPreferences.Editor edit = AbstractApplicationC6253c.f24484b.m24887a().getSharedPreferences("config", 0).edit();
        if (obj instanceof Integer) {
            edit.putInt(str, ((Number) obj).intValue());
        } else if (obj instanceof String) {
            edit.putString(str, (String) obj);
        } else if (obj instanceof Float) {
            edit.putFloat(str, ((Number) obj).floatValue());
        } else if (obj instanceof Boolean) {
            edit.putBoolean(str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof Long) {
            edit.putLong(str, ((Number) obj).longValue());
        } else {
            throw new IllegalArgumentException("不支持该类型的数据");
        }
        edit.apply();
    }

    /* renamed from: Q */
    public final void m6844Q(String str) {
        AbstractC5868k.m23674f(str, "accountType");
        m6843P("account_type", AbstractC1459j.m6799d(str, C4842a.f20329a.m19920a().mo19967p()));
    }

    /* renamed from: R */
    public final void m6845R(String str) {
        AbstractC5868k.m23674f(str, "areaCode");
        m6843P("area_code", AbstractC1459j.m6799d(str, C4842a.f20329a.m19920a().mo19967p()));
    }

    /* renamed from: S */
    public final void m6846S(String str) {
        AbstractC5868k.m23674f(str, "areaFlag");
        m6843P("area_flag", str);
    }

    /* renamed from: T */
    public final void m6847T(boolean z10) {
        f5639m = z10;
    }

    /* renamed from: U */
    public final void m6848U(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        f5633g = str;
    }

    /* renamed from: V */
    public final void m6849V(boolean z10) {
        f5637k = z10;
    }

    /* renamed from: W */
    public final void m6850W(boolean z10) {
        f5645s = z10;
        C7709c.m29787d().m29801m(new CouponQualificationEvent(f5645s));
    }

    /* renamed from: X */
    public final void m6851X(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        f5638l = str;
    }

    /* renamed from: Y */
    public final void m6852Y(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        f5629c = str;
    }

    /* renamed from: Z */
    public final void m6853Z(long j10) {
        f5643q = j10;
    }

    /* renamed from: a */
    public final void m6854a() {
        m6873j0("");
        m6875k0("");
        m6844Q("");
        m6877l0("");
        m6845R("");
        m6856b();
        if (C4842a.f20329a.m19920a().m19976y()) {
            C5090g c5090g = C5090g.f20948a;
            c5090g.m20656x(c5090g.m20641f(), "");
            c5090g.m20656x(c5090g.m20645j(), "");
            c5090g.m20656x(c5090g.m20651p(), "");
            c5090g.m20656x(c5090g.m20642g(), "");
            c5090g.m20656x(c5090g.m20643h(), "");
        }
    }

    /* renamed from: a0 */
    public final void m6855a0(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        f5641o = str;
    }

    /* renamed from: b */
    public final void m6856b() {
        String str = f5628b + "isHasCouponQualification";
        String str2 = f5628b + "couponQualificationTime";
        String str3 = f5628b + "couponQualificationInvalidTime";
        C4982a c4982a = C4982a.f20721a;
        AbstractApplicationC6253c.a aVar = AbstractApplicationC6253c.f24484b;
        c4982a.m20335c(aVar.m24887a(), str, Boolean.FALSE);
        c4982a.m20335c(aVar.m24887a(), str2, MessageService.MSG_DB_READY_REPORT);
        c4982a.m20335c(aVar.m24887a(), str3, MessageService.MSG_DB_READY_REPORT);
    }

    /* renamed from: b0 */
    public final void m6857b0(boolean z10) {
        f5640n = z10;
    }

    /* renamed from: c */
    public final String m6858c(String str) {
        AbstractC5868k.m23674f(str, "string");
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String m6797b = AbstractC1459j.m6797b(str, C4842a.f20329a.m19920a().mo19967p());
        if (TextUtils.isEmpty(m6797b)) {
            return "";
        }
        AbstractC5868k.m23673e(m6797b, "decrypt");
        return m6797b;
    }

    /* renamed from: c0 */
    public final void m6859c0(String str) {
        AbstractC5868k.m23674f(str, "portalCode");
        m6843P("portal_code", AbstractC1459j.m6799d(str, C4842a.f20329a.m19920a().mo19967p()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0062, code lost:
    
        if (r0 != false) goto L23;
     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String m6860d() {
        /*
            r8 = this;
            java.lang.String r0 = "account_type"
            java.lang.String r1 = ""
            java.lang.Object r0 = r8.m6872j(r0, r1)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r8.m6858c(r0)
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L1b
            int r4 = r0.length()
            if (r4 != 0) goto L19
            goto L1b
        L19:
            r4 = 0
            goto L1c
        L1b:
            r4 = 1
        L1c:
            if (r4 == 0) goto L65
            java.lang.String r0 = r8.m6888w()
            int r4 = r0.length()
            if (r4 != 0) goto L29
            goto L2a
        L29:
            r2 = 0
        L2a:
            if (r2 == 0) goto L2d
            return r1
        L2d:
            i2.a r1 = p170i2.C4842a.f20329a
            i2.b r1 = r1.m19920a()
            boolean r1 = r1.mo19939P()
            java.lang.String r2 = "2"
            java.lang.String r4 = "1"
            r5 = 0
            r6 = 2
            java.lang.String r7 = "@"
            if (r1 == 0) goto L5e
            java.lang.String r1 = "[0-9]*"
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1)
            java.util.regex.Matcher r1 = r1.matcher(r0)
            boolean r1 = r1.matches()
            if (r1 == 0) goto L53
        L51:
            r0 = r4
            goto L6f
        L53:
            boolean r0 = p359ue.AbstractC7157k.m27713v(r0, r7, r3, r6, r5)
            if (r0 == 0) goto L5b
        L59:
            r0 = r2
            goto L6f
        L5b:
            java.lang.String r0 = "6"
            goto L6f
        L5e:
            boolean r0 = p359ue.AbstractC7157k.m27713v(r0, r7, r3, r6, r5)
            if (r0 == 0) goto L51
            goto L59
        L65:
            java.lang.String r1 = "4"
            boolean r1 = ne.AbstractC5868k.m23669a(r0, r1)
            if (r1 == 0) goto L6f
            java.lang.String r0 = "5"
        L6f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: cc.C1466m0.m6860d():java.lang.String");
    }

    /* renamed from: d0 */
    public final void m6861d0(int i10) {
        f5644r = i10;
    }

    /* renamed from: e */
    public final List m6862e() {
        GetAuthInfoResultData getAuthInfoResultData;
        GetAuthInfoResult m28073h = C7252a.f27087a.m28073h();
        if (m28073h != null) {
            getAuthInfoResultData = m28073h.getData();
        } else {
            getAuthInfoResultData = null;
        }
        if (getAuthInfoResultData == null) {
            return null;
        }
        return getAuthInfoResultData.getAuthInfoList();
    }

    /* renamed from: e0 */
    public final void m6863e0(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        f5631e = str;
    }

    /* renamed from: f */
    public final String m6864f() {
        return "";
    }

    /* renamed from: f0 */
    public final void m6865f0(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        f5632f = str;
    }

    /* renamed from: g */
    public final String m6866g() {
        return "";
    }

    /* renamed from: g0 */
    public final void m6867g0(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        f5642p = str;
    }

    /* renamed from: h */
    public final String m6868h() {
        return f5635i;
    }

    /* renamed from: h0 */
    public final void m6869h0(UserInfo userInfo) {
        f5634h = userInfo;
    }

    /* renamed from: i */
    public final String m6870i() {
        return f5633g;
    }

    /* renamed from: i0 */
    public final void m6871i0(String str, String str2, String str3) {
        AbstractC5868k.m23674f(str, "userId");
        AbstractC5868k.m23674f(str2, "userToken");
        AbstractC5868k.m23674f(str3, "portalCode");
        f5628b = str;
        f5629c = str2;
        f5630d = str3;
        m6859c0(str3);
    }

    /* renamed from: j */
    public final Object m6872j(String str, Object obj) {
        AbstractC5868k.m23674f(str, CacheEntity.KEY);
        SharedPreferences sharedPreferences = AbstractApplicationC6253c.f24484b.m24887a().getSharedPreferences("config", 0);
        if (obj instanceof Integer) {
            return Integer.valueOf(sharedPreferences.getInt(str, ((Number) obj).intValue()));
        }
        if (obj instanceof String) {
            return sharedPreferences.getString(str, (String) obj);
        }
        if (obj instanceof Float) {
            return Float.valueOf(sharedPreferences.getFloat(str, ((Number) obj).floatValue()));
        }
        if (obj instanceof Boolean) {
            return Boolean.valueOf(sharedPreferences.getBoolean(str, ((Boolean) obj).booleanValue()));
        }
        if (obj instanceof Long) {
            return Long.valueOf(sharedPreferences.getLong(str, ((Number) obj).longValue()));
        }
        throw new IllegalArgumentException("不支持该类型的数据");
    }

    /* renamed from: j0 */
    public final void m6873j0(String str) {
        AbstractC5868k.m23674f(str, "accountNumber");
        m6843P("user_name", AbstractC1459j.m6799d(str, C4842a.f20329a.m19920a().mo19967p()));
    }

    /* renamed from: k */
    public final String m6874k() {
        return f5630d;
    }

    /* renamed from: k0 */
    public final void m6875k0(String str) {
        AbstractC5868k.m23674f(str, "userPassword");
        if (str.length() > 32) {
            str = str.substring(0, 32);
            AbstractC5868k.m23673e(str, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        m6843P("user_password_new", str);
    }

    /* renamed from: l */
    public final String m6876l() {
        return f5638l;
    }

    /* renamed from: l0 */
    public final void m6877l0(String str) {
        AbstractC5868k.m23674f(str, "verificationToken");
        m6843P("verification_token", AbstractC1459j.m6799d(str, C4842a.f20329a.m19920a().mo19967p()));
    }

    /* renamed from: m */
    public final String m6878m() {
        return f5628b;
    }

    /* renamed from: n */
    public final String m6879n() {
        return f5629c;
    }

    /* renamed from: o */
    public final long m6880o() {
        return f5643q;
    }

    /* renamed from: p */
    public final String m6881p() {
        return f5641o;
    }

    /* renamed from: q */
    public final String m6882q() {
        if (!TextUtils.isEmpty(f5630d)) {
            return f5630d;
        }
        String m6858c = m6858c((String) m6872j("portal_code", ""));
        f5630d = m6858c;
        return m6858c;
    }

    /* renamed from: r */
    public final int m6883r() {
        return f5644r;
    }

    /* renamed from: s */
    public final String m6884s() {
        return f5631e;
    }

    /* renamed from: t */
    public final String m6885t() {
        return f5632f;
    }

    /* renamed from: u */
    public final String m6886u() {
        return f5642p;
    }

    /* renamed from: v */
    public final UserInfo m6887v() {
        return f5634h;
    }

    /* renamed from: w */
    public final String m6888w() {
        return m6858c((String) m6872j("user_name", ""));
    }

    /* renamed from: x */
    public final String m6889x() {
        boolean z10;
        String str = (String) m6872j("user_password_new", "");
        if (str.length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return m6858c((String) m6872j("user_password", ""));
        }
        return str;
    }

    /* renamed from: y */
    public final String m6890y() {
        return m6858c((String) m6872j("verification_token", ""));
    }

    /* renamed from: z */
    public final AuthInfoList m6891z() {
        GetAuthInfoResultData getAuthInfoResultData;
        List<AuthInfoList> authInfoList;
        List<AuthInfoList> authInfoList2;
        GetAuthInfoResult m28073h = C7252a.f27087a.m28073h();
        if (m28073h != null) {
            getAuthInfoResultData = m28073h.getData();
        } else {
            getAuthInfoResultData = null;
        }
        if (getAuthInfoResultData == null || (authInfoList = getAuthInfoResultData.getAuthInfoList()) == null || authInfoList.size() <= 0 || (authInfoList2 = getAuthInfoResultData.getAuthInfoList()) == null) {
            return null;
        }
        return authInfoList2.get(0);
    }
}
