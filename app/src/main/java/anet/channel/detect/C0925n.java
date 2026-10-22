package anet.channel.detect;

import anet.channel.statist.RequestStatistic;
import anet.channel.util.ALog;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: anet.channel.detect.n */
/* loaded from: classes.dex */
public class C0925n {

    /* renamed from: a */
    private static C0915d f3849a = new C0915d();

    /* renamed from: b */
    private static ExceptionDetector f3850b = new ExceptionDetector();

    /* renamed from: c */
    private static C0922k f3851c = new C0922k();

    /* renamed from: d */
    private static AtomicBoolean f3852d = new AtomicBoolean(false);

    /* renamed from: a */
    public static void m4546a() {
        try {
            if (f3852d.compareAndSet(false, true)) {
                ALog.m4788i("awcn.NetworkDetector", "registerListener", null, new Object[0]);
                f3849a.m4541b();
                f3850b.m4530a();
                f3851c.m4545a();
            }
        } catch (Exception e10) {
            ALog.m4786e("awcn.NetworkDetector", "[registerListener]error", null, e10, new Object[0]);
        }
    }

    /* renamed from: a */
    public static void m4547a(RequestStatistic requestStatistic) {
        if (f3852d.get()) {
            f3850b.m4531a(requestStatistic);
        }
    }
}
