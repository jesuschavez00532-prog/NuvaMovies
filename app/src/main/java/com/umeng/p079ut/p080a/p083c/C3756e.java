package com.umeng.p079ut.p080a.p083c;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import com.raizlabs.android.dbflow.sql.language.Operator;

/* renamed from: com.umeng.ut.a.c.e */
/* loaded from: classes3.dex */
public class C3756e {

    /* renamed from: b */
    private static boolean f16794b;

    /* renamed from: c */
    private static boolean f16795c;

    /* renamed from: a */
    public static boolean m15955a() {
        return f16794b;
    }

    /* renamed from: b */
    public static void m15957b(String str, Object... objArr) {
        if (f16795c) {
            Log.d(m15959d(), m15952a(str, objArr));
        }
    }

    /* renamed from: c */
    public static void m15958c() {
        if (f16794b) {
            Log.d(m15959d(), m15952a((String) null, new Object[0]));
        }
    }

    /* renamed from: d */
    private static String m15959d() {
        String str;
        String str2;
        StackTraceElement m15950a = m15950a();
        if (m15950a == null) {
            str = "";
            str2 = str;
        } else {
            String className = m15950a.getClassName();
            if (TextUtils.isEmpty(className)) {
                str2 = "";
            } else {
                str2 = className.substring(className.lastIndexOf(46) + 1);
            }
            str = m15950a.getMethodName();
        }
        return "Utdid." + str2 + "." + str + "." + String.valueOf(Process.myPid()) + "." + (Thread.currentThread().getId() + "");
    }

    /* renamed from: a */
    public static void m15954a(String str, Object... objArr) {
        if (f16794b) {
            Log.d(m15959d(), m15952a(str, objArr));
        }
    }

    /* renamed from: b */
    public static void m15956b(String str, Throwable th, Object... objArr) {
        if (f16795c) {
            Log.e(m15959d(), m15952a(str, objArr), th);
        }
    }

    /* renamed from: a */
    public static void m15953a(String str, Throwable th, Object... objArr) {
        if (f16794b) {
            Log.e(m15959d(), m15952a(str, objArr), th);
        }
    }

    /* renamed from: a */
    private static String m15951a(Object obj, Object obj2) {
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

    /* renamed from: a */
    private static String m15952a(String str, Object... objArr) {
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
                sb2.append(m15951a(objArr[i10], objArr[i11]));
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
    private static StackTraceElement m15950a() {
        try {
            for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
                if (!stackTraceElement.isNativeMethod() && !stackTraceElement.getClassName().equals(Thread.class.getName()) && !stackTraceElement.getClassName().equals(C3756e.class.getName())) {
                    return stackTraceElement;
                }
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
