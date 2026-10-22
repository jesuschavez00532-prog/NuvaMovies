package com.umeng.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import com.umeng.analytics.pro.C3309bd;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.statistics.common.DataHelper;
import com.umeng.commonsdk.utils.UMUtils;

/* renamed from: com.umeng.common.a */
/* loaded from: classes3.dex */
public class C3421a {

    /* renamed from: a */
    private static String f15059a = null;

    /* renamed from: b */
    private static final String f15060b = "umeng+";

    /* renamed from: c */
    private static final String f15061c = "ek__id";

    /* renamed from: d */
    private static final String f15062d = "ek_key";

    /* renamed from: e */
    private static String f15063e = "";

    /* renamed from: f */
    private static final String f15064f = C3309bd.m13860b().m13863b(C3309bd.f14107n);

    /* renamed from: g */
    private static String f15065g = "";

    /* renamed from: h */
    private static C3421a f15066h;

    private C3421a() {
    }

    /* renamed from: a */
    public static C3421a m14511a() {
        if (f15066h == null) {
            synchronized (C3421a.class) {
                if (f15066h == null) {
                    f15066h = new C3421a();
                }
            }
        }
        return f15066h;
    }

    /* renamed from: c */
    private String m14512c(String str) {
        String str2 = "";
        try {
            String substring = str.substring(1, 9);
            StringBuilder sb2 = new StringBuilder();
            for (int i10 = 0; i10 < substring.length(); i10++) {
                char charAt = substring.charAt(i10);
                if (Character.isDigit(charAt)) {
                    if (Integer.parseInt(Character.toString(charAt)) == 0) {
                        sb2.append(0);
                    } else {
                        sb2.append(10 - Integer.parseInt(Character.toString(charAt)));
                    }
                } else {
                    sb2.append(charAt);
                }
            }
            str2 = sb2.toString();
            return str2 + new StringBuilder(str2).reverse().toString();
        } catch (Throwable unused) {
            return str2;
        }
    }

    /* renamed from: b */
    public String m14515b(String str) {
        String str2;
        String str3;
        try {
            if (!TextUtils.isEmpty(f15059a)) {
                return new String(DataHelper.decrypt(Base64.decode(str.getBytes(), 0), f15059a.getBytes()));
            }
            return str;
        } catch (Exception unused) {
            UMRTLog.m14568e(UMRTLog.RTLOG_TAG, "--->>> 子进程事件数据解密失败!");
            String str4 = null;
            if (TextUtils.isEmpty(f15063e)) {
                return null;
            }
            UMRTLog.m14568e(UMRTLog.RTLOG_TAG, "--->>> 子进程事件数据解密失败，换老秘钥重试");
            try {
                str3 = new String(DataHelper.decrypt(Base64.decode(str.getBytes(), 0), f15063e.getBytes()));
            } catch (Exception unused2) {
            }
            try {
                UMRTLog.m14568e(UMRTLog.RTLOG_TAG, "--->>> 子进程事件数据解密失败，换老秘钥重试成功。");
                return str3;
            } catch (Exception unused3) {
                str4 = str3;
                UMRTLog.m14568e(UMRTLog.RTLOG_TAG, "--->>> 子进程事件数据解密失败，换老秘钥重试失败。换子进程备份key重试。");
                try {
                    String str5 = new String(DataHelper.decrypt(Base64.decode(str.getBytes(), 0), f15065g.getBytes()));
                    try {
                        UMRTLog.m14568e(UMRTLog.RTLOG_TAG, "--->>> 子进程事件数据解密失败，子进程备份key重试成功。");
                        return str5;
                    } catch (Throwable unused4) {
                        str2 = str5;
                        UMRTLog.m14568e(UMRTLog.RTLOG_TAG, "--->>> 子进程事件数据解密失败，子进程备份key重试失败。");
                        return str2;
                    }
                } catch (Throwable unused5) {
                    str2 = str4;
                }
            }
        }
    }

    /* renamed from: a */
    public void m14514a(Context context) {
        try {
            if (TextUtils.isEmpty(f15059a)) {
                String multiProcessSP = UMUtils.getMultiProcessSP(context, f15061c);
                if (!TextUtils.isEmpty(multiProcessSP)) {
                    f15063e = m14512c(multiProcessSP);
                    UMRTLog.m14568e(UMRTLog.RTLOG_TAG, "--->>>> primaryKey: " + f15063e);
                }
                SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(f15064f, 0);
                if (sharedPreferences != null) {
                    f15065g = sharedPreferences.getString(f15061c, null);
                    UMRTLog.m14568e(UMRTLog.RTLOG_TAG, "--->>> 子进程备份秘钥：主进程key: " + f15065g);
                }
                f15059a = m14512c(UMUtils.genId());
                UMRTLog.m14568e(UMRTLog.RTLOG_TAG, "--->>>> 正式秘钥：key: " + f15059a);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public String m14513a(String str) {
        try {
            return TextUtils.isEmpty(f15059a) ? str : Base64.encodeToString(DataHelper.encrypt(str.getBytes(), f15059a.getBytes()), 0);
        } catch (Exception unused) {
            return null;
        }
    }
}
