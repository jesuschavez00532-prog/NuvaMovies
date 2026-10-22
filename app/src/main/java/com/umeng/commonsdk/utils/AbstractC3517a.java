package com.umeng.commonsdk.utils;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;

/* renamed from: com.umeng.commonsdk.utils.a */
/* loaded from: classes3.dex */
public abstract class AbstractC3517a {

    /* renamed from: e */
    private static final int f15607e = 1;

    /* renamed from: a */
    private final long f15608a;

    /* renamed from: b */
    private final long f15609b;

    /* renamed from: c */
    private long f15610c;

    /* renamed from: f */
    private HandlerThread f15612f;

    /* renamed from: g */
    private Handler f15613g;

    /* renamed from: d */
    private boolean f15611d = false;

    /* renamed from: h */
    private Handler.Callback f15614h = new Handler.Callback() { // from class: com.umeng.commonsdk.utils.a.1
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            synchronized (AbstractC3517a.this) {
                if (AbstractC3517a.this.f15611d) {
                    return true;
                }
                long elapsedRealtime = AbstractC3517a.this.f15610c - SystemClock.elapsedRealtime();
                if (elapsedRealtime <= 0) {
                    AbstractC3517a.this.m15115c();
                    if (AbstractC3517a.this.f15612f != null) {
                        AbstractC3517a.this.f15612f.quit();
                    }
                } else if (elapsedRealtime < AbstractC3517a.this.f15609b) {
                    AbstractC3517a.this.f15613g.sendMessageDelayed(AbstractC3517a.this.f15613g.obtainMessage(1), elapsedRealtime);
                } else {
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    AbstractC3517a.this.m15113a(elapsedRealtime);
                    long elapsedRealtime3 = (elapsedRealtime2 + AbstractC3517a.this.f15609b) - SystemClock.elapsedRealtime();
                    while (elapsedRealtime3 < 0) {
                        elapsedRealtime3 += AbstractC3517a.this.f15609b;
                    }
                    AbstractC3517a.this.f15613g.sendMessageDelayed(AbstractC3517a.this.f15613g.obtainMessage(1), elapsedRealtime3);
                }
                return false;
            }
        }
    };

    public AbstractC3517a(long j10, long j11) {
        this.f15608a = j10;
        this.f15609b = j11;
        if (!m15110d()) {
            HandlerThread handlerThread = new HandlerThread("CountDownTimerThread");
            this.f15612f = handlerThread;
            handlerThread.start();
            this.f15613g = new Handler(this.f15612f.getLooper(), this.f15614h);
            return;
        }
        this.f15613g = new Handler(this.f15614h);
    }

    /* renamed from: a */
    public abstract void m15113a(long j10);

    /* renamed from: c */
    public abstract void m15115c();

    /* renamed from: d */
    private boolean m15110d() {
        return Looper.getMainLooper().getThread().equals(Thread.currentThread());
    }

    /* renamed from: a */
    public final synchronized void m15112a() {
        this.f15611d = true;
        this.f15613g.removeMessages(1);
    }

    /* renamed from: b */
    public final synchronized AbstractC3517a m15114b() {
        this.f15611d = false;
        if (this.f15608a <= 0) {
            m15115c();
            return this;
        }
        this.f15610c = SystemClock.elapsedRealtime() + this.f15608a;
        Handler handler = this.f15613g;
        handler.sendMessage(handler.obtainMessage(1));
        return this;
    }
}
