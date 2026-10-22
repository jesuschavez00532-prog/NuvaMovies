package com.taobao.accs.net;

import anet.channel.session.TnetSpdySession;
import com.taobao.accs.p073ut.p074a.C3184d;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UTMini;
import com.taobao.accs.utl.UtilityImpl;

/* renamed from: com.taobao.accs.net.r */
/* loaded from: classes.dex */
class RunnableC3173r implements Runnable {

    /* renamed from: a */
    final /* synthetic */ int f13039a;

    /* renamed from: b */
    final /* synthetic */ byte[] f13040b;

    /* renamed from: c */
    final /* synthetic */ TnetSpdySession f13041c;

    /* renamed from: d */
    final /* synthetic */ C3166k f13042d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3173r(C3166k c3166k, int i10, byte[] bArr, TnetSpdySession tnetSpdySession) {
        this.f13042d = c3166k;
        this.f13039a = i10;
        this.f13040b = bArr;
        this.f13041c = tnetSpdySession;
    }

    @Override // java.lang.Runnable
    public void run() {
        String str;
        if (this.f13039a == 200) {
            try {
                long currentTimeMillis = System.currentTimeMillis();
                this.f13042d.f12982e.m12787a(this.f13040b, this.f13041c.getHost());
                C3184d m12795g = this.f13042d.f12982e.m12795g();
                if (m12795g != null) {
                    m12795g.f13113c = String.valueOf(currentTimeMillis);
                    if (this.f13042d.f12980c == 0) {
                        str = "service";
                    } else {
                        str = "inapp";
                    }
                    m12795g.f13117g = str;
                    m12795g.m12931a();
                    return;
                }
                return;
            } catch (Throwable th) {
                ALog.m12939e(this.f13042d.mo12858d(), "onDataReceive ", th, new Object[0]);
                UTMini.getInstance().commitEvent(66001, "DATA_RECEIVE", UtilityImpl.m12956a(th));
                return;
            }
        }
        ALog.m12940e(this.f13042d.mo12858d(), "drop frame len:" + this.f13040b.length + " frameType" + this.f13039a, new Object[0]);
    }
}
