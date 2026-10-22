package com.efs.sdk.pa.p060a;

import android.app.Application;
import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import com.efs.sdk.base.integrationtesting.IntegrationTestingUtil;
import com.efs.sdk.pa.InterfaceC1769PA;
import com.efs.sdk.pa.PAANRListener;
import com.efs.sdk.pa.PAMsgListener;
import com.efs.sdk.pa.p060a.C1773b;
import com.efs.sdk.pa.p060a.C1778g;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

/* renamed from: com.efs.sdk.pa.a.c */
/* loaded from: classes.dex */
public final class C1774c implements InterfaceC1769PA {

    /* renamed from: a */
    private boolean f7449a;

    /* renamed from: c */
    private C1776e f7451c;

    /* renamed from: d */
    private C1777f f7452d;

    /* renamed from: e */
    private C1772a f7453e;

    /* renamed from: h */
    private boolean f7456h;

    /* renamed from: i */
    private boolean f7457i;

    /* renamed from: b */
    private Looper f7450b = Looper.myLooper();

    /* renamed from: f */
    private C1773b f7454f = new C1773b();

    /* renamed from: g */
    private C1778g f7455g = new C1778g();

    public C1774c(boolean z10) {
        this.f7457i = z10;
    }

    @Override // com.efs.sdk.pa.InterfaceC1769PA
    public final void enableDumpToFile(String str) {
        FileOutputStream fileOutputStream;
        C1777f c1777f = this.f7452d;
        if (c1777f != null && str != null && str.trim().length() != 0) {
            c1777f.f7466c = str;
            if (c1777f.f7467d == null) {
                try {
                    fileOutputStream = new FileOutputStream(str);
                } catch (Exception unused) {
                    fileOutputStream = null;
                }
                try {
                    c1777f.f7467d = new BufferedOutputStream(fileOutputStream);
                } catch (Exception unused2) {
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (Exception unused3) {
                        }
                    }
                }
            }
        }
    }

    @Override // com.efs.sdk.pa.InterfaceC1769PA
    public final void enableLog(boolean z10) {
        this.f7449a = z10;
        this.f7454f.f7443b = z10;
        this.f7455g.f7469b = z10;
        C1777f c1777f = this.f7452d;
        if (c1777f != null) {
            c1777f.f7465b = z10;
        }
    }

    @Override // com.efs.sdk.pa.InterfaceC1769PA
    public final int endCalFPS(String str) {
        if (!this.f7456h) {
            return -1;
        }
        C1773b c1773b = this.f7454f;
        int i10 = 0;
        if (str != null && str.trim().length() != 0) {
            C1773b.a aVar = c1773b.f7442a.get(str);
            if (aVar == null) {
                return 0;
            }
            View view = aVar.f7447d;
            if (view != null && aVar.f7446c != null) {
                view.getViewTreeObserver().removeOnPreDrawListener(aVar.f7446c);
            }
            c1773b.f7442a.remove(str);
            int currentTimeMillis = (int) (((float) aVar.f7445b) / (((float) (System.currentTimeMillis() - aVar.f7444a)) / 1000.0f));
            if (currentTimeMillis > 0) {
                i10 = currentTimeMillis;
            }
            if (c1773b.f7443b) {
                Log.e("PerformanceAnalyze", "key=" + str + ",fps=" + i10);
            }
        }
        return i10;
    }

    @Override // com.efs.sdk.pa.InterfaceC1769PA
    public final long endCalTime(String str) {
        if (!this.f7456h) {
            return -1L;
        }
        C1778g c1778g = this.f7455g;
        long j10 = 0;
        if (str != null && str.trim().length() != 0) {
            C1778g.a aVar = c1778g.f7468a.get(str);
            if (aVar == null) {
                return 0L;
            }
            c1778g.f7468a.remove(str);
            j10 = System.currentTimeMillis() - aVar.f7470a;
            if (c1778g.f7469b) {
                Log.e("PerformanceAnalyze", "key=" + str + ",consumeTime=" + j10);
            }
        }
        return j10;
    }

    @Override // com.efs.sdk.pa.InterfaceC1769PA
    public final void registerPAANRListener(Context context, PAANRListener pAANRListener) {
        registerPAANRListener(context, pAANRListener, 2000L);
    }

    @Override // com.efs.sdk.pa.InterfaceC1769PA
    public final void registerPAMsgListener(PAMsgListener pAMsgListener) {
        if (this.f7451c == null) {
            this.f7451c = new C1776e();
        }
        this.f7450b.setMessageLogging(this.f7451c);
        if (this.f7452d == null) {
            this.f7452d = new C1777f();
        }
        C1777f c1777f = this.f7452d;
        c1777f.f7465b = this.f7449a;
        c1777f.f7464a = pAMsgListener;
        this.f7451c.f7458a.add(c1777f);
    }

    @Override // com.efs.sdk.pa.InterfaceC1769PA
    public final void start() {
        if (!this.f7457i && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
            return;
        }
        this.f7456h = true;
        C1776e c1776e = this.f7451c;
        if (c1776e != null) {
            this.f7450b.setMessageLogging(c1776e);
        }
        C1772a c1772a = this.f7453e;
        if (c1772a != null && c1772a.f7429f) {
            c1772a.f7429f = false;
            c1772a.f7430g.post(c1772a.f7436m);
            c1772a.f7433j = SystemClock.uptimeMillis();
        }
    }

    @Override // com.efs.sdk.pa.InterfaceC1769PA
    public final void startCalFPS(String str, View view) {
        if (!this.f7456h) {
            return;
        }
        C1773b c1773b = this.f7454f;
        if (str != null && str.trim().length() != 0 && view != null && c1773b.f7442a.get(str) == null) {
            C1773b.a aVar = new C1773b.a((byte) 0);
            aVar.f7447d = view;
            C1773b.a.AnonymousClass1 anonymousClass1 = new ViewTreeObserver.OnPreDrawListener() { // from class: com.efs.sdk.pa.a.b.a.1
                public AnonymousClass1() {
                }

                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public final boolean onPreDraw() {
                    a.this.f7445b++;
                    return true;
                }
            };
            aVar.f7446c = anonymousClass1;
            aVar.f7447d.getViewTreeObserver().addOnPreDrawListener(anonymousClass1);
            aVar.f7444a = System.currentTimeMillis();
            c1773b.f7442a.put(str, aVar);
        }
    }

    @Override // com.efs.sdk.pa.InterfaceC1769PA
    public final void startCalTime(String str) {
        if (!this.f7456h) {
            return;
        }
        C1778g c1778g = this.f7455g;
        if (str != null && str.trim().length() != 0 && c1778g.f7468a.get(str) == null) {
            C1778g.a aVar = new C1778g.a((byte) 0);
            aVar.f7470a = System.currentTimeMillis();
            c1778g.f7468a.put(str, aVar);
        }
    }

    @Override // com.efs.sdk.pa.InterfaceC1769PA
    public final void stop() {
        this.f7456h = false;
        this.f7450b.setMessageLogging(null);
        C1772a c1772a = this.f7453e;
        if (c1772a != null) {
            c1772a.f7429f = true;
            c1772a.f7430g.removeCallbacksAndMessages(null);
            c1772a.f7424a = true;
        }
    }

    @Override // com.efs.sdk.pa.InterfaceC1769PA
    public final void unRegisterPAMsgListener() {
        C1777f c1777f = this.f7452d;
        if (c1777f != null) {
            c1777f.f7464a = null;
        }
        C1776e c1776e = this.f7451c;
        if (c1776e != null) {
            c1776e.f7458a.remove(c1777f);
        }
    }

    @Override // com.efs.sdk.pa.InterfaceC1769PA
    public final void unregisterPAANRListener() {
    }

    @Override // com.efs.sdk.pa.InterfaceC1769PA
    public final void registerPAANRListener(Context context, PAANRListener pAANRListener, long j10) {
        registerPAANRListener(context, pAANRListener, j10, Looper.getMainLooper().getThread());
    }

    @Override // com.efs.sdk.pa.InterfaceC1769PA
    public final void registerPAANRListener(Context context, PAANRListener pAANRListener, long j10, Thread thread) {
        if (this.f7453e == null) {
            if (thread != null) {
                this.f7453e = new C1772a((Application) context.getApplicationContext(), j10);
            } else {
                this.f7453e = new C1772a((Application) context.getApplicationContext(), j10, false);
            }
        }
        this.f7453e.f7431h = pAANRListener;
    }
}
