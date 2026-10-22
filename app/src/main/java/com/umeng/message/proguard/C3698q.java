package com.umeng.message.proguard;

import android.util.Log;
import anet.channel.util.ALog;
import com.taobao.accs.utl.ALog;

/* renamed from: com.umeng.message.proguard.q */
/* loaded from: classes3.dex */
public final class C3698q implements ALog.ILog, ALog.ILog {

    /* renamed from: c */
    private static final C3698q f16573c = new C3698q();

    /* renamed from: a */
    public boolean f16574a = false;

    /* renamed from: d */
    private final boolean f16576d = "1".equals(C3637d.m15617k());

    /* renamed from: b */
    public final C3697p f16575b = new C3697p();

    private C3698q() {
    }

    /* renamed from: a */
    public static C3698q m15801a() {
        return f16573c;
    }

    /* renamed from: b */
    private static void m15803b(int i10, String str, String str2) {
        switch (i10) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                Log.println(i10, str, str2);
                return;
            default:
                return;
        }
    }

    @Override // anet.channel.util.ALog.ILog
    /* renamed from: d */
    public final void mo4520d(String str, String str2) {
        if (!this.f16574a) {
            return;
        }
        m15802a(3, str, str2);
    }

    @Override // anet.channel.util.ALog.ILog
    /* renamed from: e */
    public final void mo4521e(String str, String str2) {
        if (this.f16576d || this.f16574a) {
            m15802a(6, str, str2);
        }
        if (this.f16575b.m15795a()) {
            this.f16575b.m15794a(6, str, str2);
        }
    }

    @Override // anet.channel.util.ALog.ILog
    /* renamed from: i */
    public final void mo4523i(String str, String str2) {
        if (this.f16576d || this.f16574a) {
            m15802a(4, str, str2);
        }
        if (this.f16575b.m15795a()) {
            this.f16575b.m15794a(4, str, str2);
        }
    }

    @Override // anet.channel.util.ALog.ILog
    public final boolean isPrintLog(int i10) {
        return true;
    }

    @Override // anet.channel.util.ALog.ILog
    public final boolean isValid() {
        return true;
    }

    @Override // anet.channel.util.ALog.ILog
    public final void setLogLevel(int i10) {
    }

    @Override // anet.channel.util.ALog.ILog
    /* renamed from: w */
    public final void mo4524w(String str, String str2) {
        if (this.f16576d || this.f16574a) {
            m15802a(5, str, str2);
        }
        if (this.f16575b.m15795a()) {
            this.f16575b.m15794a(5, str, str2);
        }
    }

    /* renamed from: a */
    private static void m15802a(int i10, String str, String str2) {
        if (str2 == null) {
            return;
        }
        while (str2.length() > 3072) {
            m15803b(i10, str, str2.substring(0, 3072));
            str2 = str2.substring(3072);
        }
        if (str2.length() > 0) {
            m15803b(i10, str, str2);
        }
    }

    @Override // anet.channel.util.ALog.ILog
    /* renamed from: e */
    public final void mo4522e(String str, String str2, Throwable th) {
        if (this.f16576d || this.f16574a) {
            m15802a(6, str, str2 + "\n" + Log.getStackTraceString(th));
        }
        if (this.f16575b.m15795a()) {
            this.f16575b.m15794a(6, str, str2 + "\n" + Log.getStackTraceString(th));
        }
    }

    @Override // anet.channel.util.ALog.ILog
    /* renamed from: w */
    public final void mo4525w(String str, String str2, Throwable th) {
        if (this.f16576d || this.f16574a) {
            m15802a(5, str, str2 + "\n" + Log.getStackTraceString(th));
        }
        if (this.f16575b.m15795a()) {
            this.f16575b.m15794a(5, str, str2 + "\n" + Log.getStackTraceString(th));
        }
    }
}
