package anet.channel.request;

import anet.channel.util.ALog;
import java.util.concurrent.Future;

/* renamed from: anet.channel.request.b */
/* loaded from: classes.dex */
public class C0956b implements Cancelable {
    public static final C0956b NULL = new C0956b(null, null);

    /* renamed from: a */
    private final Future<?> f3992a;

    /* renamed from: b */
    private final String f3993b;

    public C0956b(Future<?> future, String str) {
        this.f3992a = future;
        this.f3993b = str;
    }

    @Override // anet.channel.request.Cancelable
    public void cancel() {
        if (this.f3992a != null) {
            ALog.m4788i("awcn.FutureCancelable", "cancel request", this.f3993b, new Object[0]);
            this.f3992a.cancel(true);
        }
    }
}
