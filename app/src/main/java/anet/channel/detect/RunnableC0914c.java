package anet.channel.detect;

import android.text.TextUtils;
import android.util.Pair;
import anet.channel.statist.RequestStatistic;
import anet.channel.util.ALog;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: anet.channel.detect.c */
/* loaded from: classes.dex */
public class RunnableC0914c implements Runnable {

    /* renamed from: a */
    final /* synthetic */ RequestStatistic f3829a;

    /* renamed from: b */
    final /* synthetic */ ExceptionDetector f3830b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0914c(ExceptionDetector exceptionDetector, RequestStatistic requestStatistic) {
        this.f3830b = exceptionDetector;
        this.f3829a = requestStatistic;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            RequestStatistic requestStatistic = this.f3829a;
            if (requestStatistic == null) {
                return;
            }
            if (!TextUtils.isEmpty(requestStatistic.f4042ip) && this.f3829a.ret == 0) {
                if ("guide-acs.m.taobao.com".equalsIgnoreCase(this.f3829a.host)) {
                    this.f3830b.f3814b = this.f3829a.f4042ip;
                } else if ("msgacs.m.taobao.com".equalsIgnoreCase(this.f3829a.host)) {
                    this.f3830b.f3815c = this.f3829a.f4042ip;
                } else if ("gw.alicdn.com".equalsIgnoreCase(this.f3829a.host)) {
                    this.f3830b.f3816d = this.f3829a.f4042ip;
                }
            }
            if (!TextUtils.isEmpty(this.f3829a.url)) {
                this.f3830b.f3817e.add(Pair.create(this.f3829a.url, Integer.valueOf(this.f3829a.statusCode)));
            }
            if (!this.f3830b.m4533c()) {
                return;
            }
            this.f3830b.m4532b();
        } catch (Throwable th) {
            ALog.m4786e("anet.ExceptionDetector", "network detect fail.", null, th, new Object[0]);
        }
    }
}
