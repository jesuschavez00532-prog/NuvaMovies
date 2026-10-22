package com.umeng.message.proguard;

import android.app.Application;
import android.content.res.Resources;
import android.text.TextUtils;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.message.MessageSharedPrefs;
import com.umeng.message.common.UPLog;

/* renamed from: com.umeng.message.proguard.a */
/* loaded from: classes3.dex */
public final class C3553a {

    /* renamed from: a */
    private static final C3553a f15871a = new C3553a();

    /* renamed from: b */
    private String f15872b;

    /* renamed from: c */
    private Class<?> f15873c;

    /* renamed from: d */
    private Class<?> f15874d;

    /* renamed from: e */
    private Class<?> f15875e;

    /* renamed from: f */
    private Class<?> f15876f;

    private C3553a() {
    }

    /* renamed from: a */
    public static int m15272a(String str) {
        return f15871a.m15279g(str);
    }

    /* renamed from: b */
    public static int m15274b(String str) {
        return f15871a.m15277e(str);
    }

    /* renamed from: c */
    public static int m15275c(String str) {
        return f15871a.m15278f(str);
    }

    /* renamed from: d */
    public static int m15276d(String str) {
        return f15871a.m15280h(str);
    }

    /* renamed from: e */
    private int m15277e(String str) {
        if (this.f15873c == null) {
            try {
                this.f15873c = Class.forName(m15273a() + ".R$id");
            } catch (ClassNotFoundException e10) {
                UPLog.m15200w("R2", UPLog.getStackTrace(e10));
            }
        }
        return m15271a(this.f15873c, str);
    }

    /* renamed from: f */
    private int m15278f(String str) {
        if (this.f15874d == null) {
            try {
                this.f15874d = Class.forName(m15273a() + ".R$drawable");
            } catch (ClassNotFoundException e10) {
                UPLog.m15200w("R2", UPLog.getStackTrace(e10));
                UMLog.m14562aq(C3557ac.f15878b, 0, "\\|");
            }
        }
        return m15271a(this.f15874d, str);
    }

    /* renamed from: g */
    private int m15279g(String str) {
        if (this.f15875e == null) {
            try {
                this.f15875e = Class.forName(m15273a() + ".R$layout");
            } catch (ClassNotFoundException e10) {
                UPLog.m15200w("R2", UPLog.getStackTrace(e10));
            }
        }
        return m15271a(this.f15875e, str);
    }

    /* renamed from: h */
    private int m15280h(String str) {
        if (this.f15876f == null) {
            try {
                this.f15876f = Class.forName(m15273a() + ".R$raw");
            } catch (ClassNotFoundException e10) {
                UPLog.m15200w("R2", UPLog.getStackTrace(e10));
            }
        }
        return m15271a(this.f15876f, str);
    }

    /* renamed from: a */
    private String m15273a() {
        if (!TextUtils.isEmpty(this.f15872b)) {
            return this.f15872b;
        }
        Application m15840a = C3706y.m15840a();
        String m15175h = MessageSharedPrefs.getInstance(m15840a).m15175h();
        if (TextUtils.isEmpty(m15175h)) {
            m15175h = m15840a.getPackageName();
        }
        this.f15872b = m15175h;
        UPLog.m15198i("R2", "resPackage:", m15175h);
        return this.f15872b;
    }

    /* renamed from: a */
    private int m15271a(Class<?> cls, String str) {
        if (cls != null) {
            return cls.getField(str).getInt(str);
        }
        UPLog.m15197e("R2", "getRes(null,", str, ")");
        throw new Resources.NotFoundException(m15273a() + ".R$* field=" + str + " not exist.");
    }
}
