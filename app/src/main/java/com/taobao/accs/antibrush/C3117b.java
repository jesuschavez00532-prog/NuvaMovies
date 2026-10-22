package com.taobao.accs.antibrush;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.client.GlobalConfig;
import com.taobao.accs.utl.ALog;
import java.util.StringTokenizer;

/* renamed from: com.taobao.accs.antibrush.b */
/* loaded from: classes.dex */
public class C3117b {
    public static final String KEY_SEC = "sec";
    public static final String TAG = "CookieMgr";

    /* renamed from: a */
    public static CookieManager f12833a;

    /* renamed from: b */
    private static volatile boolean f12834b;

    /* renamed from: a */
    public static synchronized void m12666a(Context context) {
        synchronized (C3117b.class) {
            try {
            } catch (Throwable th) {
                ALog.m12939e(TAG, "setup", th, new Object[0]);
            }
            if (!GlobalConfig.enableCookie) {
                ALog.m12941i(TAG, "disable cookie", new Object[0]);
                return;
            }
            if (f12834b) {
                return;
            }
            int i10 = Build.VERSION.SDK_INT;
            if (i10 < 21) {
                CookieSyncManager.createInstance(context);
            }
            CookieManager cookieManager = CookieManager.getInstance();
            f12833a = cookieManager;
            cookieManager.setAcceptCookie(true);
            if (i10 < 21) {
                f12833a.removeExpiredCookie();
            }
            f12834b = true;
        }
    }

    /* renamed from: b */
    public static String m12668b(String str) {
        String str2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str, ";");
        do {
            try {
                String nextToken = stringTokenizer.nextToken();
                int indexOf = nextToken.indexOf(61);
                if (indexOf != -1) {
                    String trim = nextToken.substring(0, indexOf).trim();
                    String trim2 = nextToken.substring(indexOf + 1).trim();
                    if (KEY_SEC.equals(trim)) {
                        str2 = m12669c(trim2);
                    }
                } else {
                    throw new IllegalArgumentException("Invalid cookie name-value pair");
                }
            } catch (Throwable th) {
                ALog.m12939e(TAG, "parse", th, new Object[0]);
            }
        } while (stringTokenizer.hasMoreTokens());
        return str2;
    }

    /* renamed from: c */
    private static String m12669c(String str) {
        if (str != null && str.length() > 2 && str.charAt(0) == '\"' && str.charAt(str.length() - 1) == '\"') {
            return str.substring(1, str.length() - 1);
        }
        if (str != null && str.length() > 2 && str.charAt(0) == '\'' && str.charAt(str.length() - 1) == '\'') {
            return str.substring(1, str.length() - 1);
        }
        return str;
    }

    /* renamed from: a */
    private static boolean m12667a() {
        Context context;
        if (!f12834b && (context = GlobalClientInfo.f12843a) != null) {
            m12666a(context);
        }
        return f12834b;
    }

    /* renamed from: a */
    public static synchronized String m12665a(String str) {
        synchronized (C3117b.class) {
            String str2 = null;
            if (!m12667a()) {
                ALog.m12940e(TAG, "cookieMgr not setup", new Object[0]);
                return null;
            }
            try {
                str2 = m12668b(f12833a.getCookie(str));
            } catch (Throwable th) {
                ALog.m12939e(TAG, "get cookie failed. url=" + str, th, new Object[0]);
            }
            return str2;
        }
    }
}
