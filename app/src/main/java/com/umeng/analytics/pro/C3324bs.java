package com.umeng.analytics.pro;

import android.util.Log;
import com.raizlabs.android.dbflow.sql.language.Operator;

/* renamed from: com.umeng.analytics.pro.bs */
/* loaded from: classes3.dex */
public class C3324bs {

    /* renamed from: a */
    private static final String f14154a = "OpenId";

    /* renamed from: b */
    private static boolean f14155b;

    /* renamed from: a */
    public static void m13897a(boolean z10) {
        Log.d(f14154a, "setDebug:" + z10);
        f14155b = z10;
    }

    /* renamed from: b */
    public static void m13898b(String str, Object... objArr) {
        if (f14155b) {
            Log.i(f14154a, m13901e(str, objArr));
        }
    }

    /* renamed from: c */
    public static void m13899c(String str, Object... objArr) {
        if (f14155b) {
            Log.w(f14154a, m13901e(str, objArr));
        }
    }

    /* renamed from: d */
    public static void m13900d(String str, Object... objArr) {
        if (f14155b) {
            Log.e(f14154a, m13901e(str, objArr));
        }
    }

    /* renamed from: e */
    private static String m13901e(String str, Object... objArr) {
        if (str == null && objArr == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        Object[] objArr2 = new Object[1];
        if (str == null) {
            str = Operator.Operation.MINUS;
        }
        int i10 = 0;
        objArr2[0] = str;
        sb2.append(String.format("[%s] ", objArr2));
        if (objArr != null) {
            int length = objArr.length;
            while (true) {
                int i11 = i10 + 1;
                if (i11 >= objArr.length) {
                    break;
                }
                sb2.append(m13895a(objArr[i10], objArr[i11]));
                if (i11 < length - 1) {
                    sb2.append(",");
                }
                i10 = i11 + 1;
            }
            if (i10 == objArr.length - 1) {
                sb2.append(objArr[i10]);
            }
        }
        return sb2.toString();
    }

    /* renamed from: a */
    public static void m13896a(String str, Object... objArr) {
        if (f14155b) {
            Log.d(f14154a, m13901e(str, objArr));
        }
    }

    /* renamed from: a */
    private static String m13895a(Object obj, Object obj2) {
        Object[] objArr = new Object[2];
        if (obj == null) {
            obj = "";
        }
        objArr[0] = obj;
        if (obj2 == null) {
            obj2 = "";
        }
        objArr[1] = obj2;
        return String.format("%s:%s", objArr);
    }
}
