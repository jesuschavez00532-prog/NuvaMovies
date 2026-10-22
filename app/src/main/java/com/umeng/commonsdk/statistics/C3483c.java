package com.umeng.commonsdk.statistics;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.umeng.analytics.pro.C3343ck;
import com.umeng.analytics.pro.C3358cz;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.framework.UMFrUtils;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.internal.C3452a;
import com.umeng.commonsdk.internal.C3453b;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.stateless.C3480d;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.commonsdk.statistics.idtracking.C3494f;
import com.umeng.commonsdk.statistics.idtracking.ImprintHandler;
import com.umeng.commonsdk.statistics.internal.C3502a;
import com.umeng.commonsdk.statistics.internal.C3504c;
import com.umeng.commonsdk.statistics.internal.InterfaceC3505d;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.statistics.internal.StatTracer;
import com.umeng.commonsdk.statistics.noise.ABTest;
import com.umeng.commonsdk.statistics.noise.Defcon;
import com.umeng.commonsdk.statistics.proto.Response;
import com.umeng.commonsdk.utils.C3519c;
import java.io.File;
import org.android.agoo.message.MessageService;

/* renamed from: com.umeng.commonsdk.statistics.c */
/* loaded from: classes3.dex */
public class C3483c {

    /* renamed from: b */
    private static final int f15400b = 1;

    /* renamed from: c */
    private static final int f15401c = 2;

    /* renamed from: d */
    private static final int f15402d = 3;

    /* renamed from: o */
    private static final String f15403o = "thtstart";

    /* renamed from: p */
    private static final String f15404p = "gkvc";

    /* renamed from: q */
    private static final String f15405q = "ekvc";

    /* renamed from: a */
    String f15406a;

    /* renamed from: f */
    private C3504c f15408f;

    /* renamed from: g */
    private ImprintHandler f15409g;

    /* renamed from: h */
    private C3494f f15410h;

    /* renamed from: i */
    private ImprintHandler.C3488a f15411i;

    /* renamed from: k */
    private Defcon f15413k;

    /* renamed from: l */
    private long f15414l;

    /* renamed from: m */
    private int f15415m;

    /* renamed from: n */
    private int f15416n;

    /* renamed from: r */
    private Context f15417r;

    /* renamed from: e */
    private final int f15407e = 1;

    /* renamed from: j */
    private ABTest f15412j = null;

    public C3483c(Context context) {
        this.f15410h = null;
        this.f15411i = null;
        this.f15413k = null;
        this.f15414l = 0L;
        this.f15415m = 0;
        this.f15416n = 0;
        this.f15406a = null;
        this.f15417r = context;
        this.f15411i = ImprintHandler.getImprintService(context).m14860c();
        this.f15413k = Defcon.getService(this.f15417r);
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(this.f15417r);
        this.f15414l = sharedPreferences.getLong(f15403o, 0L);
        this.f15415m = sharedPreferences.getInt(f15404p, 0);
        this.f15416n = sharedPreferences.getInt(f15405q, 0);
        this.f15406a = UMEnvelopeBuild.imprintProperty(this.f15417r, "track_list", null);
        ImprintHandler imprintService = ImprintHandler.getImprintService(this.f15417r);
        this.f15409g = imprintService;
        imprintService.m14854a(new InterfaceC3505d() { // from class: com.umeng.commonsdk.statistics.c.1
            @Override // com.umeng.commonsdk.statistics.internal.InterfaceC3505d
            public void onImprintChanged(ImprintHandler.C3488a c3488a) {
                C3483c.this.f15413k.onImprintChanged(c3488a);
                C3483c c3483c = C3483c.this;
                c3483c.f15406a = UMEnvelopeBuild.imprintProperty(c3483c.f15417r, "track_list", null);
            }
        });
        if (!UMConfigure.needSendZcfgEnv(this.f15417r)) {
            this.f15410h = C3494f.m14877a(this.f15417r);
        }
        C3504c c3504c = new C3504c(this.f15417r);
        this.f15408f = c3504c;
        c3504c.m14916a(StatTracer.getInstance(this.f15417r));
    }

    /* renamed from: a */
    public boolean m14758a(File file) {
        String str;
        if (file == null) {
            return false;
        }
        try {
            byte[] byteArray = UMFrUtils.toByteArray(file.getPath());
            if (byteArray == null) {
                return false;
            }
            String name = file.getName();
            if (TextUtils.isEmpty(name)) {
                return false;
            }
            C3502a m14898a = C3502a.m14898a(this.f15417r);
            m14898a.m14907e(name);
            boolean m14902a = m14898a.m14902a(name);
            boolean m14904b = m14898a.m14904b(name);
            boolean m14905c = m14898a.m14905c(name);
            boolean m14906d = m14898a.m14906d(name);
            String m14735d = C3480d.m14735d(name);
            if (!TextUtils.isEmpty(m14735d)) {
                str = C3480d.m14733c(m14735d);
            } else if (m14906d) {
                str = UMServerURL.SILENT_HEART_BEAT;
            } else if (m14905c) {
                str = UMServerURL.ZCFG_PATH;
            } else {
                str = UMServerURL.PATH_ANALYTICS;
            }
            byte[] m14918a = this.f15408f.m14918a(byteArray, m14902a, m14905c, str);
            int m14755a = m14918a == null ? 1 : m14755a(m14918a);
            if (UMConfigure.isDebugLog()) {
                if (m14906d && m14755a == 2) {
                    UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "heart beat req: succeed.");
                } else if (m14905c && m14755a == 2) {
                    UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "Zero req: succeed.");
                } else if (m14904b && m14755a == 2) {
                    MLog.m14759d("本次启动数据: 发送成功!");
                    UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "Send instant data: succeed.");
                } else if (m14902a && m14755a == 2) {
                    MLog.m14759d("普通统计数据: 发送成功!");
                    UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "Send analytics data: succeed.");
                } else if (m14755a == 2) {
                    UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "Inner req: succeed.");
                }
            }
            if (m14755a == 2) {
                C3494f c3494f = this.f15410h;
                if (c3494f != null) {
                    c3494f.m14888e();
                }
                StatTracer.getInstance(this.f15417r).saveSate();
                if (m14906d) {
                    String imprintProperty = UMEnvelopeBuild.imprintProperty(this.f15417r, "iss", "");
                    if (!TextUtils.isEmpty(imprintProperty)) {
                        if ("1".equalsIgnoreCase(imprintProperty)) {
                            UMRTLog.m14568e(UMRTLog.RTLOG_TAG, "--->>> 更新静默心跳最后一次成功请求时间.");
                            C3519c.m15121a(this.f15417r, System.currentTimeMillis());
                        } else if (MessageService.MSG_DB_READY_REPORT.equalsIgnoreCase(imprintProperty)) {
                            UMRTLog.m14568e(UMRTLog.RTLOG_TAG, "--->>> 静默模式 -> 正常模式。重置 last req time");
                            C3519c.m15121a(this.f15417r, 0L);
                            C3519c.m15126d(this.f15417r);
                        }
                    }
                }
            } else if (m14755a == 3) {
                StatTracer.getInstance(this.f15417r).saveSate();
                if (m14905c) {
                    FieldManager.m14542a().m14544a(this.f15417r);
                    UMRTLog.m14568e(UMRTLog.RTLOG_TAG, "--->>> 零号报文应答内容报错!!! ，特殊处理!，继续正常流程。");
                    Context context = this.f15417r;
                    UMWorkDispatch.sendEvent(context, C3452a.f15279s, C3453b.m14605a(context).m14606a(), null);
                    return true;
                }
            }
            return m14755a == 2;
        } catch (Throwable th) {
            UMCrashManager.reportCrash(this.f15417r, th);
            return false;
        }
    }

    /* renamed from: a */
    private int m14755a(byte[] bArr) {
        Response response = new Response();
        try {
            new C3343ck(new C3358cz.a()).m14084a(response, bArr);
            if (response.resp_code == 1) {
                this.f15409g.m14859b(response.getImprint());
                this.f15409g.m14861d();
            }
        } catch (Throwable th) {
            UMCrashManager.reportCrash(this.f15417r, th);
        }
        return response.resp_code == 1 ? 2 : 3;
    }
}
