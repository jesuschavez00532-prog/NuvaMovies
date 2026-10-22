package com.alibaba.sdk.android.httpdns;

import android.content.Context;
import android.content.SharedPreferences;
import com.alibaba.sdk.android.httpdns.net64.C1551a;
import com.alibaba.sdk.android.httpdns.p045b.C1528b;
import com.alibaba.sdk.android.httpdns.p047d.C1538b;
import com.alibaba.sdk.android.httpdns.p047d.C1539c;
import com.lzy.okgo.model.Progress;
import java.net.SocketTimeoutException;

/* renamed from: com.alibaba.sdk.android.httpdns.u */
/* loaded from: classes.dex */
public class C1566u {

    /* renamed from: a */
    private static SharedPreferences f6034a;

    /* renamed from: a */
    private static a f6035a = a.ENABLE;

    /* renamed from: d */
    private static boolean f6036d;

    /* renamed from: e */
    private static long f6037e;

    /* renamed from: g */
    private static volatile int f6038g;

    /* renamed from: h */
    private static volatile int f6039h;

    /* renamed from: l */
    private static boolean f6040l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.alibaba.sdk.android.httpdns.u$a */
    /* loaded from: classes.dex */
    public enum a {
        ENABLE,
        PRE_DISABLE,
        DISABLE
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static synchronized String m7226a(EnumC1564s enumC1564s) {
        synchronized (C1566u.class) {
            try {
                EnumC1564s enumC1564s2 = EnumC1564s.QUERY_HOST;
                if (enumC1564s != enumC1564s2 && enumC1564s != EnumC1564s.SNIFF_HOST) {
                    return (enumC1564s == EnumC1564s.QUERY_SCHEDULE_CENTER || enumC1564s == EnumC1564s.SNIFF_SCHEDULE_CENTER) ? null : null;
                }
                if (f6035a == a.ENABLE || f6035a == a.PRE_DISABLE) {
                    return C1542f.f5950a[f6038g];
                }
                if (enumC1564s == enumC1564s2) {
                    return null;
                }
                return C1542f.f5950a[f6038g];
            } catch (Exception e10) {
                e10.printStackTrace();
                return null;
            }
        }
    }

    /* renamed from: b */
    static void m7232b(int i10) {
        if (f6034a == null || i10 < 0 || i10 >= C1542f.f5950a.length) {
            return;
        }
        f6038g = i10;
        SharedPreferences.Editor edit = f6034a.edit();
        edit.putInt("activiate_ip_index", i10);
        edit.putLong("activiated_ip_index_modified_time", System.currentTimeMillis());
        edit.commit();
    }

    /* renamed from: d */
    static synchronized void m7234d(boolean z10) {
        synchronized (C1566u.class) {
            if (f6040l != z10) {
                f6040l = z10;
                SharedPreferences sharedPreferences = f6034a;
                if (sharedPreferences != null) {
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.putBoolean(Progress.STATUS, f6040l);
                    edit.putLong("disable_modified_time", System.currentTimeMillis());
                    edit.commit();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static synchronized boolean m7235e() {
        boolean z10;
        synchronized (C1566u.class) {
            z10 = f6040l;
        }
        return z10;
    }

    /* renamed from: h */
    private static void m7236h() {
        f6038g = f6038g == C1542f.f5950a.length + (-1) ? 0 : f6038g + 1;
        m7232b(f6038g);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static void m7238i() {
        m7232b(0);
        f6039h = f6038g;
        C1565t.m7220a().m7223c(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static void m7239j() {
        C1565t.m7220a().m7223c(true);
    }

    public static void reportHttpDnsSuccess(String str, int i10) {
        try {
            C1538b m7126a = C1538b.m7126a();
            if (m7126a != null) {
                m7126a.m7129a(str, i10, C1539c.m7146a(), C1528b.m7078a() ? 1 : 0);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static synchronized void m7227a(Context context) {
        synchronized (C1566u.class) {
            if (!f6036d) {
                synchronized (C1566u.class) {
                    if (!f6036d) {
                        if (context != null) {
                            f6034a = context.getSharedPreferences("httpdns_config_cache", 0);
                        }
                        f6040l = f6034a.getBoolean(Progress.STATUS, false);
                        f6038g = f6034a.getInt("activiate_ip_index", 0);
                        f6039h = f6038g;
                        f6037e = f6034a.getLong("disable_modified_time", 0L);
                        if (System.currentTimeMillis() - f6037e >= 86400000) {
                            m7234d(false);
                        }
                        f6035a = f6040l ? a.DISABLE : a.ENABLE;
                        f6036d = true;
                    }
                }
            }
        }
    }

    /* renamed from: b */
    private static void m7233b(String str, String str2, long j10) {
        try {
            C1538b m7126a = C1538b.m7126a();
            if (m7126a != null) {
                m7126a.m7137b(str2, j10, C1539c.m7146a());
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* renamed from: h */
    private static void m7237h(String str) {
        try {
            C1538b m7126a = C1538b.m7126a();
            if (m7126a != null) {
                String m7190d = C1550n.m7176a().m7190d();
                int i10 = f6038g;
                if (i10 == 0) {
                    i10 = C1542f.f5950a.length;
                }
                int i11 = i10 - 1;
                int length = i11 == 0 ? C1542f.f5950a.length - 1 : i11 - 1;
                if (i11 >= 0) {
                    String[] strArr = C1542f.f5950a;
                    if (i11 >= strArr.length || length < 0 || length >= strArr.length) {
                        return;
                    }
                    String str2 = strArr[i11];
                    m7126a.m7138b(str, m7190d, strArr[length] + "," + str2);
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static synchronized void m7228a(String str, String str2, long j10) {
        synchronized (C1566u.class) {
            try {
                m7233b(str, str2, j10);
                reportHttpDnsSuccess(str, 1);
                a aVar = f6035a;
                a aVar2 = a.ENABLE;
                if (aVar != aVar2 && str2 != null && str2.equals(C1542f.f5950a[f6038g])) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(f6035a == a.DISABLE ? "Disable " : "Pre_disable ");
                    sb2.append("mode finished. Enter enable mode.");
                    C1545i.m7167f(sb2.toString());
                    f6035a = aVar2;
                    m7234d(false);
                    C1565t.m7220a().m7224g();
                    f6039h = f6038g;
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static synchronized void m7229a(String str, String str2, Throwable th) {
        synchronized (C1566u.class) {
            try {
                m7230a(str2, th);
                if (m7231a(th) && str2 != null && str2.equals(C1542f.f5950a[f6038g])) {
                    m7236h();
                    if (f6039h == f6038g) {
                        C1565t.m7220a().m7223c(false);
                        C1550n.m7176a().m7188c();
                    }
                    if (f6035a == a.ENABLE) {
                        f6035a = a.PRE_DISABLE;
                        C1545i.m7167f("enter pre_disable mode");
                    } else if (f6035a == a.PRE_DISABLE) {
                        f6035a = a.DISABLE;
                        C1545i.m7167f("enter disable mode");
                        m7234d(true);
                        m7237h(str);
                        C1565t.m7220a().m7225g(str);
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    private static void m7230a(String str, Throwable th) {
        try {
            C1538b m7126a = C1538b.m7126a();
            if (m7126a != null) {
                int m7147a = C1539c.m7147a(th);
                m7126a.m7133a(str, String.valueOf(m7147a), C1539c.m7148a(th), C1539c.m7146a(), C1551a.m7191a().m7195i() ? 1 : 0);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* renamed from: a */
    private static boolean m7231a(Throwable th) {
        if (th instanceof SocketTimeoutException) {
            return true;
        }
        if (th instanceof C1544h) {
            C1544h c1544h = (C1544h) th;
            if (c1544h.getErrorCode() == 403 && c1544h.getMessage().equals("ServiceLevelDeny")) {
                return true;
            }
        }
        return false;
    }
}
