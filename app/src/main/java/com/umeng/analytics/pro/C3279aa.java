package com.umeng.analytics.pro;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.service.UMGlobalContext;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.utils.C3520d;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.umeng.analytics.pro.aa */
/* loaded from: classes3.dex */
public class C3279aa {

    /* renamed from: c */
    private static volatile C3279aa f13947c;

    /* renamed from: a */
    private InterfaceC3403y f13948a = new C3404z();

    /* renamed from: b */
    private String f13949b;

    /* renamed from: d */
    private List<a> f13950d;

    /* renamed from: e */
    private String f13951e;

    /* renamed from: com.umeng.analytics.pro.aa$a */
    /* loaded from: classes3.dex */
    public interface a {
        /* renamed from: a */
        void mo13729a(String str, long j10, long j11, long j12);

        /* renamed from: a */
        void mo13730a(String str, String str2, long j10, long j11, long j12);
    }

    private C3279aa() {
    }

    /* renamed from: a */
    public static C3279aa m13712a() {
        if (f13947c == null) {
            synchronized (C3279aa.class) {
                if (f13947c == null) {
                    f13947c = new C3279aa();
                }
            }
        }
        return f13947c;
    }

    /* renamed from: f */
    private String m13714f(Context context) {
        try {
            SharedPreferences.Editor edit = PreferenceWrapper.getDefault(context).edit();
            edit.putString(C3401w.f14914d, m13727d(context));
            edit.commit();
        } catch (Exception unused) {
        }
        long m13716h = m13716h(context);
        long m13717i = m13717i(context);
        String str = this.f13949b;
        long m14418a = C3401w.m14418a(context);
        long j10 = m14418a * 5000;
        UMRTLog.m14568e(UMRTLog.RTLOG_TAG, "--->>>*** 读取 foreground count 值完成，count次数：" + m14418a);
        if (FieldManager.allow(C3520d.f15634E)) {
            if (UMWorkDispatch.eventHasExist()) {
                UMRTLog.m14568e(UMRTLog.RTLOG_TAG, "--->>>*** 读取 foreground count druation值完成，终止checker timer.");
                UMWorkDispatch.removeEvent();
            } else {
                UMRTLog.m14568e(UMRTLog.RTLOG_TAG, "--->>>*** 读取 foreground count druation值完成，无未处理check timer事件。");
            }
        } else {
            UMRTLog.m14568e(UMRTLog.RTLOG_TAG, "--->>>*** foreground count druation云控参数关闭。");
        }
        m13713a(m13717i, m13716h, j10, str, false);
        this.f13949b = this.f13948a.mo14442a(context);
        m13713a(m13717i, m13716h, j10, str, true);
        this.f13948a.mo14444a(context, this.f13949b);
        return this.f13949b;
    }

    /* renamed from: g */
    private boolean m13715g(Context context) {
        if (TextUtils.isEmpty(this.f13949b) || C3389k.m14262a(context).m14274a(this.f13949b) <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    private long m13716h(Context context) {
        return m13711a(context, C3401w.f14916f);
    }

    /* renamed from: i */
    private long m13717i(Context context) {
        return m13711a(context, C3401w.f14911a);
    }

    /* renamed from: j */
    private boolean m13718j(Context context) {
        Context appContext = UMGlobalContext.getAppContext(context);
        try {
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(appContext);
            long j10 = sharedPreferences.getLong(C3401w.f14915e, 0L);
            long j11 = sharedPreferences.getLong(C3401w.f14916f, 0L);
            if (FieldManager.allow(C3520d.f15634E) && j10 > 0 && j11 == 0) {
                long m14418a = C3401w.m14418a(appContext);
                if (m14418a > 0) {
                    UMRTLog.m14568e(UMRTLog.RTLOG_TAG, "--->>> last session end time stamp = 0, reconstruct it by foreground count value.");
                    j11 = j10 + (m14418a * 5000);
                }
            }
            UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "--->>> interval of last session is: " + (j11 - j10));
            return this.f13948a.mo14445a(j10, j11);
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: b */
    public long m13723b() {
        return this.f13948a.mo14441a();
    }

    /* renamed from: c */
    public String m13726c(Context context) {
        Context appContext = UMGlobalContext.getAppContext(context);
        if (appContext == null) {
            return "";
        }
        try {
            this.f13949b = m13714f(appContext);
        } catch (Exception unused) {
        }
        return this.f13949b;
    }

    /* renamed from: d */
    public String m13727d(Context context) {
        if (TextUtils.isEmpty(this.f13949b)) {
            try {
                this.f13949b = PreferenceWrapper.getDefault(context).getString("session_id", null);
            } catch (Exception unused) {
            }
        }
        return this.f13949b;
    }

    /* renamed from: e */
    public boolean m13728e(Context context) {
        if (TextUtils.isEmpty(this.f13949b)) {
            this.f13949b = m13727d(context);
        }
        if (!TextUtils.isEmpty(this.f13949b) && !m13718j(context) && !m13715g(context)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public synchronized String m13724b(Context context) {
        Context appContext = UMGlobalContext.getAppContext(context);
        if (appContext == null) {
            return "";
        }
        this.f13949b = m13727d(appContext);
        if (m13728e(appContext)) {
            try {
                this.f13949b = m13714f(appContext);
            } catch (Exception unused) {
            }
        }
        return this.f13949b;
    }

    /* renamed from: a */
    public void m13721a(long j10) {
        this.f13948a.mo14443a(j10);
    }

    /* renamed from: a */
    public String m13719a(Context context) {
        Context appContext = UMGlobalContext.getAppContext(context);
        if (appContext == null) {
            return "";
        }
        String str = "";
        try {
            synchronized (C3279aa.class) {
                str = PreferenceWrapper.getDefault(appContext).getString(C3401w.f14914d, "");
            }
        } catch (Exception unused) {
        }
        return str;
    }

    /* renamed from: b */
    public void m13725b(a aVar) {
        List<a> list;
        if (aVar == null || (list = this.f13950d) == null || list.size() == 0) {
            return;
        }
        this.f13950d.remove(aVar);
    }

    /* renamed from: a */
    public String m13720a(Context context, long j10) {
        if (TextUtils.isEmpty(this.f13951e)) {
            String str = "SUB" + j10;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(String.format("%0" + (32 - str.length()) + "d", 0));
            this.f13951e = sb2.toString();
        }
        return this.f13951e;
    }

    /* renamed from: a */
    private long m13711a(Context context, String str) {
        long j10;
        try {
            j10 = PreferenceWrapper.getDefault(context).getLong(str, 0L);
        } catch (Exception unused) {
            j10 = 0;
        }
        return j10 <= 0 ? System.currentTimeMillis() : j10;
    }

    /* renamed from: a */
    private void m13713a(long j10, long j11, long j12, String str, boolean z10) {
        List<a> list = this.f13950d;
        if (list != null) {
            for (a aVar : list) {
                if (z10) {
                    try {
                        aVar.mo13730a(str, this.f13949b, j10, j11, j12);
                    } catch (Exception unused) {
                    }
                } else {
                    aVar.mo13729a(this.f13949b, j10, j11, j12);
                }
            }
        }
    }

    /* renamed from: a */
    public void m13722a(a aVar) {
        if (aVar == null) {
            return;
        }
        if (this.f13950d == null) {
            this.f13950d = new ArrayList();
        }
        if (this.f13950d.contains(aVar)) {
            return;
        }
        this.f13950d.add(aVar);
    }
}
