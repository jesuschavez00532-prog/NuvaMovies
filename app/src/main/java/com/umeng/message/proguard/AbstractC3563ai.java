package com.umeng.message.proguard;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;

/* renamed from: com.umeng.message.proguard.ai */
/* loaded from: classes3.dex */
public abstract class AbstractC3563ai {

    /* renamed from: a */
    final long f15903a;

    /* renamed from: b */
    long f15904b;

    /* renamed from: d */
    private final long f15906d;

    /* renamed from: e */
    private long f15907e;

    /* renamed from: c */
    boolean f15905c = false;

    /* renamed from: f */
    private final Handler f15908f = new Handler(Looper.getMainLooper()) { // from class: com.umeng.message.proguard.ai.1
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            synchronized (AbstractC3563ai.this) {
                if (message.what == 1) {
                    AbstractC3563ai abstractC3563ai = AbstractC3563ai.this;
                    if (abstractC3563ai.f15905c) {
                        return;
                    }
                    long elapsedRealtime = abstractC3563ai.f15904b - SystemClock.elapsedRealtime();
                    if (elapsedRealtime <= 0) {
                        AbstractC3563ai.this.mo15269e();
                    } else {
                        AbstractC3563ai abstractC3563ai2 = AbstractC3563ai.this;
                        if (elapsedRealtime < abstractC3563ai2.f15903a) {
                            abstractC3563ai2.mo15268a(elapsedRealtime);
                            sendMessageDelayed(obtainMessage(1), elapsedRealtime);
                        } else {
                            long elapsedRealtime2 = SystemClock.elapsedRealtime();
                            AbstractC3563ai.this.mo15268a(elapsedRealtime);
                            long elapsedRealtime3 = (elapsedRealtime2 + AbstractC3563ai.this.f15903a) - SystemClock.elapsedRealtime();
                            while (elapsedRealtime3 < 0) {
                                elapsedRealtime3 += AbstractC3563ai.this.f15903a;
                            }
                            sendMessageDelayed(obtainMessage(1), elapsedRealtime3);
                        }
                    }
                }
            }
        }
    };

    public AbstractC3563ai(long j10, long j11) {
        this.f15906d = j10;
        this.f15903a = j11;
    }

    /* renamed from: a */
    public final synchronized void m15299a() {
        this.f15905c = true;
        this.f15908f.removeMessages(1);
    }

    /* renamed from: a */
    public abstract void mo15268a(long j10);

    /* renamed from: b */
    public final synchronized AbstractC3563ai m15300b() {
        this.f15905c = false;
        if (this.f15906d <= 0) {
            mo15269e();
            return this;
        }
        this.f15904b = SystemClock.elapsedRealtime() + this.f15906d;
        Handler handler = this.f15908f;
        handler.sendMessage(handler.obtainMessage(1));
        return this;
    }

    /* renamed from: c */
    public final synchronized AbstractC3563ai m15301c() {
        this.f15905c = false;
        long elapsedRealtime = this.f15904b - SystemClock.elapsedRealtime();
        this.f15907e = elapsedRealtime;
        if (elapsedRealtime <= 0) {
            return this;
        }
        this.f15908f.removeMessages(1);
        Handler handler = this.f15908f;
        handler.sendMessageAtFrontOfQueue(handler.obtainMessage(2));
        return this;
    }

    /* renamed from: d */
    public final synchronized AbstractC3563ai m15302d() {
        this.f15905c = false;
        if (this.f15907e <= 0) {
            return this;
        }
        this.f15908f.removeMessages(2);
        this.f15904b = this.f15907e + SystemClock.elapsedRealtime();
        Handler handler = this.f15908f;
        handler.sendMessageAtFrontOfQueue(handler.obtainMessage(1));
        return this;
    }

    /* renamed from: e */
    public abstract void mo15269e();
}
