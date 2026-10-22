package com.efs.sdk.memoryinfo;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.SystemClock;
import com.efs.sdk.base.EfsReporter;
import com.efs.sdk.base.integrationtesting.IntegrationTestingUtil;
import com.efs.sdk.base.observer.IConfigCallback;
import com.efs.sdk.base.samplingwhitelist.SamplingWhiteListUtil;
import com.umeng.commonsdk.utils.UMUtils;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Random;
import java.util.UUID;

/* renamed from: com.efs.sdk.memoryinfo.d */
/* loaded from: classes.dex */
final class C1744d implements UMMemoryMonitorApi {

    /* renamed from: A */
    private boolean f7295A;

    /* renamed from: u */
    private boolean f7296u;

    /* renamed from: v */
    private boolean f7297v = true;

    /* renamed from: w */
    private C1742b f7298w;

    /* renamed from: x */
    private WeakReference<Activity> f7299x;

    /* renamed from: y */
    private boolean f7300y;

    /* renamed from: z */
    private int f7301z;

    @Override // com.efs.sdk.memoryinfo.UMMemoryMonitorApi
    public final String getCurrentActivity() {
        Activity activity;
        WeakReference<Activity> weakReference = this.f7299x;
        if (weakReference == null || (activity = weakReference.get()) == null) {
            return "";
        }
        return activity.getClass().getName();
    }

    @Override // com.efs.sdk.memoryinfo.UMMemoryMonitorApi
    public final boolean isEnable() {
        C1742b c1742b;
        if (!this.f7297v || (c1742b = this.f7298w) == null || !c1742b.f7272b) {
            return false;
        }
        return true;
    }

    @Override // com.efs.sdk.memoryinfo.UMMemoryMonitorApi
    public final boolean isForeground() {
        return this.f7300y;
    }

    @Override // com.efs.sdk.memoryinfo.UMMemoryMonitorApi
    public final void onActivityResumed(Activity activity) {
        if (!this.f7297v) {
            return;
        }
        this.f7299x = new WeakReference<>(activity);
    }

    @Override // com.efs.sdk.memoryinfo.UMMemoryMonitorApi
    public final void onActivityStarted(Activity activity) {
        if (!this.f7297v || activity == null) {
            return;
        }
        if (this.f7295A) {
            this.f7295A = false;
            return;
        }
        int i10 = this.f7301z + 1;
        this.f7301z = i10;
        if (i10 == 1) {
            this.f7300y = true;
        }
    }

    @Override // com.efs.sdk.memoryinfo.UMMemoryMonitorApi
    public final void onActivityStopped(Activity activity) {
        if (!this.f7297v || activity == null) {
            return;
        }
        if (activity.isChangingConfigurations()) {
            this.f7295A = true;
            return;
        }
        int i10 = this.f7301z - 1;
        this.f7301z = i10;
        if (i10 == 0) {
            this.f7300y = false;
        }
    }

    @Override // com.efs.sdk.memoryinfo.UMMemoryMonitorApi
    public final void setEnable(boolean z10) {
        this.f7297v = z10;
    }

    @Override // com.efs.sdk.memoryinfo.UMMemoryMonitorApi
    public final void start(Context context, EfsReporter efsReporter) {
        if ((!this.f7297v && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) || this.f7296u) {
            return;
        }
        this.f7296u = true;
        final C1742b c1742b = new C1742b(context, efsReporter);
        this.f7298w = c1742b;
        c1742b.f7271a.getAllSdkConfig(new String[]{"apm_memperf_sampling_rate", "apm_memperf_collect_interval", "apm_memperf_collect_max_period_sec"}, new IConfigCallback() { // from class: com.efs.sdk.memoryinfo.b.1

            /* renamed from: com.efs.sdk.memoryinfo.b$1$1 */
            /* loaded from: classes.dex */
            final class HandlerC78211 extends Handler {

                /* renamed from: d */
                final /* synthetic */ HandlerThread f7274d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                HandlerC78211(Looper looper, HandlerThread handlerThread) {
                    super(looper);
                    r3 = handlerThread;
                }

                @Override // android.os.Handler
                public final void handleMessage(Message message) {
                    super.handleMessage(message);
                    if (message.what == 1) {
                        try {
                            r3.quit();
                        } catch (Throwable unused) {
                        }
                    }
                }
            }

            /* renamed from: com.efs.sdk.memoryinfo.b$1$2 */
            /* loaded from: classes.dex */
            final class AnonymousClass2 implements Runnable {

                /* renamed from: f */
                final /* synthetic */ Handler f7277f;

                /* renamed from: g */
                final /* synthetic */ int f7278g;

                /* renamed from: h */
                final /* synthetic */ int f7279h;

                AnonymousClass2(Handler handler, int i10, int i11) {
                    r2 = handler;
                    r3 = i10;
                    r4 = i11;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        String uuid = UUID.randomUUID().toString();
                        String lowerCase = UMUtils.MD5(Process.myPid() + uuid).toLowerCase();
                        C1742b c1742b = C1742b.this;
                        Handler handler = r2;
                        handler.post(new Runnable() { // from class: com.efs.sdk.memoryinfo.b.2

                            /* renamed from: f */
                            final /* synthetic */ Handler f7281f;

                            /* renamed from: i */
                            final /* synthetic */ long f7282i;

                            /* renamed from: j */
                            final /* synthetic */ int f7283j;

                            /* renamed from: k */
                            final /* synthetic */ C1745e f7284k;

                            /* renamed from: l */
                            final /* synthetic */ String f7285l;

                            /* renamed from: m */
                            final /* synthetic */ int f7286m;

                            AnonymousClass2(long j10, int i10, Handler handler2, C1745e c1745e, String lowerCase2, int i11) {
                                r2 = j10;
                                r4 = i10;
                                r5 = handler2;
                                r6 = c1745e;
                                r7 = lowerCase2;
                                r8 = i11;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                if (SystemClock.elapsedRealtime() - r2 > r4 * 1000) {
                                    r5.sendEmptyMessage(1);
                                    return;
                                }
                                try {
                                    C1742b.m7808a(C1742b.this, r6, r7);
                                } catch (Throwable th) {
                                    C1746f.m7816a("collect ", th);
                                }
                                r5.postDelayed(this, r8 * 1000);
                            }
                        });
                    } catch (Throwable unused) {
                        r2.sendEmptyMessage(1);
                    }
                }
            }

            public AnonymousClass1() {
            }

            @Override // com.efs.sdk.base.observer.IConfigCallback
            public final void onChange(Map<String, Object> map) {
                Object obj;
                boolean z10;
                Object obj2;
                Object obj3;
                try {
                    if (C1742b.this.f7272b || (obj = map.get("apm_memperf_sampling_rate")) == null) {
                        return;
                    }
                    int parseInt = Integer.parseInt(obj.toString());
                    if (parseInt == 0 || (parseInt != 100 && !SamplingWhiteListUtil.isHitWL() && new Random().nextInt(100) > parseInt)) {
                        z10 = false;
                        if ((z10 && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) || (obj2 = map.get("apm_memperf_collect_interval")) == null || (obj3 = map.get("apm_memperf_collect_max_period_sec")) == null) {
                            return;
                        }
                        int parseInt2 = Integer.parseInt(obj2.toString());
                        int parseInt3 = Integer.parseInt(obj3.toString());
                        HandlerThread handlerThread = new HandlerThread("mem-info");
                        handlerThread.start();
                        HandlerC78211 handlerC78211 = new Handler(handlerThread.getLooper()) { // from class: com.efs.sdk.memoryinfo.b.1.1

                            /* renamed from: d */
                            final /* synthetic */ HandlerThread f7274d;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            HandlerC78211(Looper looper, HandlerThread handlerThread2) {
                                super(looper);
                                r3 = handlerThread2;
                            }

                            @Override // android.os.Handler
                            public final void handleMessage(Message message) {
                                super.handleMessage(message);
                                if (message.what == 1) {
                                    try {
                                        r3.quit();
                                    } catch (Throwable unused) {
                                    }
                                }
                            }
                        };
                        handlerC78211.post(new Runnable() { // from class: com.efs.sdk.memoryinfo.b.1.2

                            /* renamed from: f */
                            final /* synthetic */ Handler f7277f;

                            /* renamed from: g */
                            final /* synthetic */ int f7278g;

                            /* renamed from: h */
                            final /* synthetic */ int f7279h;

                            AnonymousClass2(Handler handlerC782112, int parseInt22, int parseInt32) {
                                r2 = handlerC782112;
                                r3 = parseInt22;
                                r4 = parseInt32;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                try {
                                    String uuid = UUID.randomUUID().toString();
                                    String lowerCase2 = UMUtils.MD5(Process.myPid() + uuid).toLowerCase();
                                    C1742b c1742b2 = C1742b.this;
                                    Handler handler2 = r2;
                                    handler2.post(new Runnable() { // from class: com.efs.sdk.memoryinfo.b.2

                                        /* renamed from: f */
                                        final /* synthetic */ Handler f7281f;

                                        /* renamed from: i */
                                        final /* synthetic */ long f7282i;

                                        /* renamed from: j */
                                        final /* synthetic */ int f7283j;

                                        /* renamed from: k */
                                        final /* synthetic */ C1745e f7284k;

                                        /* renamed from: l */
                                        final /* synthetic */ String f7285l;

                                        /* renamed from: m */
                                        final /* synthetic */ int f7286m;

                                        AnonymousClass2(long j10, int i10, Handler handler22, C1745e c1745e, String lowerCase22, int i11) {
                                            r2 = j10;
                                            r4 = i10;
                                            r5 = handler22;
                                            r6 = c1745e;
                                            r7 = lowerCase22;
                                            r8 = i11;
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            if (SystemClock.elapsedRealtime() - r2 > r4 * 1000) {
                                                r5.sendEmptyMessage(1);
                                                return;
                                            }
                                            try {
                                                C1742b.m7808a(C1742b.this, r6, r7);
                                            } catch (Throwable th) {
                                                C1746f.m7816a("collect ", th);
                                            }
                                            r5.postDelayed(this, r8 * 1000);
                                        }
                                    });
                                } catch (Throwable unused) {
                                    r2.sendEmptyMessage(1);
                                }
                            }
                        });
                        C1742b.this.f7272b = true;
                    }
                    z10 = true;
                    if (z10) {
                    }
                    int parseInt22 = Integer.parseInt(obj2.toString());
                    int parseInt32 = Integer.parseInt(obj3.toString());
                    HandlerThread handlerThread2 = new HandlerThread("mem-info");
                    handlerThread2.start();
                    Handler handlerC782112 = new Handler(handlerThread2.getLooper()) { // from class: com.efs.sdk.memoryinfo.b.1.1

                        /* renamed from: d */
                        final /* synthetic */ HandlerThread f7274d;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        HandlerC78211(Looper looper, HandlerThread handlerThread22) {
                            super(looper);
                            r3 = handlerThread22;
                        }

                        @Override // android.os.Handler
                        public final void handleMessage(Message message) {
                            super.handleMessage(message);
                            if (message.what == 1) {
                                try {
                                    r3.quit();
                                } catch (Throwable unused) {
                                }
                            }
                        }
                    };
                    handlerC782112.post(new Runnable() { // from class: com.efs.sdk.memoryinfo.b.1.2

                        /* renamed from: f */
                        final /* synthetic */ Handler f7277f;

                        /* renamed from: g */
                        final /* synthetic */ int f7278g;

                        /* renamed from: h */
                        final /* synthetic */ int f7279h;

                        AnonymousClass2(Handler handlerC7821122, int parseInt222, int parseInt322) {
                            r2 = handlerC7821122;
                            r3 = parseInt222;
                            r4 = parseInt322;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            try {
                                String uuid = UUID.randomUUID().toString();
                                String lowerCase22 = UMUtils.MD5(Process.myPid() + uuid).toLowerCase();
                                C1742b c1742b2 = C1742b.this;
                                Handler handler22 = r2;
                                handler22.post(new Runnable() { // from class: com.efs.sdk.memoryinfo.b.2

                                    /* renamed from: f */
                                    final /* synthetic */ Handler f7281f;

                                    /* renamed from: i */
                                    final /* synthetic */ long f7282i;

                                    /* renamed from: j */
                                    final /* synthetic */ int f7283j;

                                    /* renamed from: k */
                                    final /* synthetic */ C1745e f7284k;

                                    /* renamed from: l */
                                    final /* synthetic */ String f7285l;

                                    /* renamed from: m */
                                    final /* synthetic */ int f7286m;

                                    AnonymousClass2(long j10, int i10, Handler handler222, C1745e c1745e, String lowerCase222, int i11) {
                                        r2 = j10;
                                        r4 = i10;
                                        r5 = handler222;
                                        r6 = c1745e;
                                        r7 = lowerCase222;
                                        r8 = i11;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        if (SystemClock.elapsedRealtime() - r2 > r4 * 1000) {
                                            r5.sendEmptyMessage(1);
                                            return;
                                        }
                                        try {
                                            C1742b.m7808a(C1742b.this, r6, r7);
                                        } catch (Throwable th) {
                                            C1746f.m7816a("collect ", th);
                                        }
                                        r5.postDelayed(this, r8 * 1000);
                                    }
                                });
                            } catch (Throwable unused) {
                                r2.sendEmptyMessage(1);
                            }
                        }
                    });
                    C1742b.this.f7272b = true;
                } catch (Throwable th) {
                    C1746f.m7816a("collect ", th);
                }
            }
        });
    }
}
