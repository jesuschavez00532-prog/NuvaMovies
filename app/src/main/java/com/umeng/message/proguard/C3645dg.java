package com.umeng.message.proguard;

import android.app.Activity;
import android.view.View;
import anet.channel.entity.ConnType;
import com.lzy.okgo.OkGo;
import com.umeng.analytics.pro.C3325bt;
import com.umeng.message.proguard.C3608bz;
import com.umeng.message.proguard.C3640db;
import com.umeng.message.proguard.C3644df;
import com.umeng.message.proguard.InterfaceC3606bx;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: com.umeng.message.proguard.dg */
/* loaded from: classes3.dex */
public final class C3645dg extends C3608bz.b {

    /* renamed from: a */
    private static final C3645dg f16310a = new C3645dg();

    /* renamed from: b */
    private volatile Future<Void> f16311b;

    private C3645dg() {
    }

    /* renamed from: b */
    public static C3645dg m15643b() {
        return f16310a;
    }

    @Override // com.umeng.message.proguard.C3608bz.b
    /* renamed from: a */
    public final String mo15478a() {
        return ConnType.PK_AUTO;
    }

    @Override // com.umeng.message.proguard.C3608bz.b
    /* renamed from: c */
    public final void mo15481c(Activity activity) {
        if (activity instanceof InterfaceC3634cx) {
            return;
        }
        try {
            final C3658dt m15682a = C3658dt.m15682a();
            if (m15682a.f16442a.m15699c(ConnType.PK_AUTO)) {
                Future<Void> future = this.f16311b;
                if (future != null && !future.isDone() && !future.isCancelled()) {
                    future.cancel(false);
                }
                final Class<?> cls = activity.getClass();
                this.f16311b = C3612cb.m15497a(new Callable<Void>() { // from class: com.umeng.message.proguard.dg.1
                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ Void call() {
                        Activity m15472b;
                        C3644df c3644df;
                        C3644df c3644df2;
                        C3644df c3644df3;
                        C3636cz c3636cz;
                        AbstractC3641dc m15637a;
                        C3636cz c3636cz2;
                        AbstractC3641dc m15637a2;
                        C3636cz c3636cz3;
                        AbstractC3641dc m15637a3;
                        C3640db unused;
                        C3645dg.m15642a(C3645dg.this);
                        if (!m15682a.m15687a(cls)) {
                            long currentTimeMillis = System.currentTimeMillis();
                            if (Math.abs(currentTimeMillis - m15682a.f16442a.m15697b("req", 0L)) >= Math.max(m15682a.f16442a.m15697b(C3325bt.f14236ba, 300L) * 1000, OkGo.DEFAULT_MILLISECONDS) && (m15472b = C3608bz.m15464a().m15472b()) != null && !C3670ed.m15730a(m15472b) && cls.getName().equals(m15472b.getClass().getName())) {
                                m15682a.f16442a.m15693a("req", currentTimeMillis);
                                unused = C3640db.a.f16288a;
                                InterfaceC3606bx.b bVar = new InterfaceC3606bx.b() { // from class: com.umeng.message.proguard.dg.1.1
                                    @Override // com.umeng.message.proguard.InterfaceC3606bx.b
                                    /* renamed from: a */
                                    public final void mo15453a(final InterfaceC3606bx.c cVar, InterfaceC3606bx.a aVar) {
                                        aVar.mo15452a(new InterfaceC3606bx.d() { // from class: com.umeng.message.proguard.dg.1.1.1
                                            @Override // com.umeng.message.proguard.InterfaceC3606bx.d
                                            /* renamed from: a */
                                            public final void mo15455a() {
                                                C3615ce.m15510b("Auto", "onShow ", cVar.name());
                                            }

                                            @Override // com.umeng.message.proguard.InterfaceC3606bx.d
                                            /* renamed from: b */
                                            public final void mo15458b() {
                                                C3615ce.m15510b("Auto", "onDismiss ", cVar.name());
                                            }

                                            @Override // com.umeng.message.proguard.InterfaceC3606bx.d
                                            /* renamed from: a */
                                            public final void mo15457a(View view) {
                                                C3615ce.m15510b("Auto", "onClick ", cVar.name());
                                            }

                                            @Override // com.umeng.message.proguard.InterfaceC3606bx.d
                                            /* renamed from: a */
                                            public final void mo15456a(int i10, String str) {
                                                C3615ce.m15510b("Auto", "onError ", cVar.name(), " code: ", Integer.valueOf(i10), " message: ", str);
                                            }
                                        });
                                        aVar.mo15451a();
                                    }

                                    @Override // com.umeng.message.proguard.InterfaceC3606bx.b
                                    /* renamed from: a */
                                    public final void mo15454a(InterfaceC3606bx.c cVar, String str) {
                                        C3615ce.m15512d("Auto", "onFailure ", cVar.name(), " message: ", str);
                                    }
                                };
                                c3644df = C3644df.a.f16309a;
                                C3605bw c3605bw = c3644df.f16305b;
                                if (c3605bw != null && (m15637a3 = C3642dd.m15637a((c3636cz3 = new C3636cz(InterfaceC3606bx.c.BANNER, c3605bw)), bVar)) != null) {
                                    c3636cz3.f16278c = true;
                                    m15637a3.m15633a();
                                }
                                c3644df2 = C3644df.a.f16309a;
                                C3605bw c3605bw2 = c3644df2.f16304a;
                                if (c3605bw2 != null && (m15637a2 = C3642dd.m15637a((c3636cz2 = new C3636cz(InterfaceC3606bx.c.INTERSTITIAL, c3605bw2)), bVar)) != null) {
                                    c3636cz2.f16278c = true;
                                    m15637a2.m15633a();
                                }
                                c3644df3 = C3644df.a.f16309a;
                                C3605bw c3605bw3 = c3644df3.f16306c;
                                if (c3605bw3 != null && (m15637a = C3642dd.m15637a((c3636cz = new C3636cz(InterfaceC3606bx.c.FLOATING_ICON, c3605bw3)), bVar)) != null) {
                                    c3636cz.f16278c = true;
                                    m15637a.m15633a();
                                    return null;
                                }
                                return null;
                            }
                            return null;
                        }
                        return null;
                    }
                }, Math.max(m15682a.f16442a.m15697b("delay", 7L), 5L), TimeUnit.SECONDS);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    static /* synthetic */ Future m15642a(C3645dg c3645dg) {
        c3645dg.f16311b = null;
        return null;
    }
}
