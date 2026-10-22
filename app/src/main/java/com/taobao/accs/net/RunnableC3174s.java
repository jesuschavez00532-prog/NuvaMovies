package com.taobao.accs.net;

import com.taobao.accs.data.Message;
import com.taobao.accs.utl.BaseMonitor;
import com.taobao.accs.utl.C3198k;
import com.youth.banner.BannerConfig;
import java.util.Iterator;

/* renamed from: com.taobao.accs.net.s */
/* loaded from: classes.dex */
class RunnableC3174s implements Runnable {

    /* renamed from: a */
    final /* synthetic */ int f13043a;

    /* renamed from: b */
    final /* synthetic */ boolean f13044b;

    /* renamed from: c */
    final /* synthetic */ int f13045c;

    /* renamed from: d */
    final /* synthetic */ C3166k f13046d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3174s(C3166k c3166k, int i10, boolean z10, int i11) {
        this.f13046d = c3166k;
        this.f13043a = i10;
        this.f13044b = z10;
        this.f13045c = i11;
    }

    @Override // java.lang.Runnable
    public void run() {
        Message.C3135Id c3135Id;
        Message m12788b;
        int i10 = this.f13043a;
        if (i10 > 0) {
            Message.C3135Id c3135Id2 = new Message.C3135Id(i10, "");
            Iterator<Message.C3135Id> it = this.f13046d.f12982e.m12794f().iterator();
            while (true) {
                if (it.hasNext()) {
                    c3135Id = it.next();
                    if (c3135Id.equals(c3135Id2)) {
                        break;
                    }
                } else {
                    c3135Id = null;
                    break;
                }
            }
            if (c3135Id != null && (m12788b = this.f13046d.f12982e.m12788b(c3135Id.getDataId())) != null) {
                if (this.f13044b) {
                    if (!this.f13046d.m12847a(m12788b, BannerConfig.TIME)) {
                        this.f13046d.f12982e.m12782a(m12788b, this.f13045c);
                    }
                    if (m12788b.getNetPermanceMonitor() != null) {
                        C3198k.m13010a("accs", BaseMonitor.COUNT_POINT_RESEND, "total_tnet", 0.0d);
                    }
                } else {
                    this.f13046d.f12982e.m12782a(m12788b, this.f13045c);
                }
            }
        }
        int i11 = this.f13043a;
        if (i11 < 0 && this.f13044b) {
            this.f13046d.m12851b(i11);
        }
    }
}
