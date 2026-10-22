package anet.channel.p017d;

import anet.channel.util.ALog;
import com.taobao.tlog.adapter.AdapterForTLog;

/* renamed from: anet.channel.d.a */
/* loaded from: classes.dex */
public class C0910a implements ALog.ILog {
    /* renamed from: a */
    private int m4519a(char c10) {
        if (c10 == 'D') {
            return 1;
        }
        if (c10 == 'E') {
            return 4;
        }
        if (c10 == 'I') {
            return 2;
        }
        if (c10 != 'V') {
            return c10 != 'W' ? 5 : 3;
        }
        return 0;
    }

    @Override // anet.channel.util.ALog.ILog
    /* renamed from: d */
    public void mo4520d(String str, String str2) {
        AdapterForTLog.logd(str, str2);
    }

    @Override // anet.channel.util.ALog.ILog
    /* renamed from: e */
    public void mo4521e(String str, String str2) {
        AdapterForTLog.loge(str, str2);
    }

    @Override // anet.channel.util.ALog.ILog
    /* renamed from: i */
    public void mo4523i(String str, String str2) {
        AdapterForTLog.logi(str, str2);
    }

    @Override // anet.channel.util.ALog.ILog
    public boolean isPrintLog(int i10) {
        if (i10 < m4519a(AdapterForTLog.getLogLevel().charAt(0))) {
            return false;
        }
        return true;
    }

    @Override // anet.channel.util.ALog.ILog
    public boolean isValid() {
        return AdapterForTLog.isValid();
    }

    @Override // anet.channel.util.ALog.ILog
    public void setLogLevel(int i10) {
    }

    @Override // anet.channel.util.ALog.ILog
    /* renamed from: w */
    public void mo4524w(String str, String str2) {
        AdapterForTLog.logw(str, str2);
    }

    @Override // anet.channel.util.ALog.ILog
    /* renamed from: e */
    public void mo4522e(String str, String str2, Throwable th) {
        AdapterForTLog.loge(str, str2, th);
    }

    @Override // anet.channel.util.ALog.ILog
    /* renamed from: w */
    public void mo4525w(String str, String str2, Throwable th) {
        AdapterForTLog.logw(str, str2, th);
    }
}
