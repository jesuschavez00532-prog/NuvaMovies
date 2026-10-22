package com.umeng.pagesdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.lzy.okgo.model.Progress;

/* renamed from: com.umeng.pagesdk.b */
/* loaded from: classes3.dex */
public final class C3714b {

    /* renamed from: a */
    private static boolean f16701a;

    /* renamed from: b */
    private static Context f16702b;

    /* renamed from: c */
    private b f16703c;

    /* renamed from: d */
    private BroadcastReceiver f16704d;

    /* renamed from: com.umeng.pagesdk.b$a */
    /* loaded from: classes3.dex */
    static class a {

        /* renamed from: a */
        private static final C3714b f16706a = new C3714b(0);
    }

    /* renamed from: com.umeng.pagesdk.b$b */
    /* loaded from: classes3.dex */
    public interface b {
        /* renamed from: a */
        void mo15870a(C3713a c3713a);
    }

    private C3714b() {
        this.f16704d = new BroadcastReceiver() { // from class: com.umeng.pagesdk.b.1
            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context, Intent intent) {
                try {
                    if (intent.getAction().equals("android.intent.action.BATTERY_CHANGED")) {
                        int i10 = 0;
                        int intExtra = intent.getIntExtra("level", 0);
                        int intExtra2 = intent.getIntExtra("voltage", 0);
                        int intExtra3 = intent.getIntExtra("temperature", 0);
                        int intExtra4 = intent.getIntExtra(Progress.STATUS, 0);
                        int i11 = -1;
                        if (intExtra4 != 1) {
                            if (intExtra4 == 2) {
                                i11 = 1;
                            } else if (intExtra4 == 4) {
                                i11 = 0;
                            } else if (intExtra4 == 5) {
                                i11 = 2;
                            }
                        }
                        int intExtra5 = intent.getIntExtra("plugged", 0);
                        if (intExtra5 == 1) {
                            i10 = 1;
                        } else if (intExtra5 == 2) {
                            i10 = 2;
                        }
                        C3713a c3713a = new C3713a();
                        c3713a.f16695a = intExtra;
                        c3713a.f16696b = intExtra2;
                        c3713a.f16698d = i11;
                        c3713a.f16697c = intExtra3;
                        c3713a.f16699e = i10;
                        c3713a.f16700f = System.currentTimeMillis();
                        if (C3714b.this.f16703c != null) {
                            C3714b.this.f16703c.mo15870a(c3713a);
                        }
                        C3714b.this.m15865b();
                    }
                } catch (Throwable unused) {
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public synchronized void m15865b() {
        try {
            f16702b.unregisterReceiver(this.f16704d);
            f16701a = false;
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public final synchronized C3713a m15867a() {
        C3713a c3713a;
        int i10;
        int intExtra;
        int intExtra2;
        int intExtra3;
        int i11;
        C3713a c3713a2 = null;
        try {
            Intent registerReceiver = f16702b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            i10 = 0;
            intExtra = registerReceiver.getIntExtra("level", 0);
            intExtra2 = registerReceiver.getIntExtra("voltage", 0);
            intExtra3 = registerReceiver.getIntExtra("temperature", 0);
            int intExtra4 = registerReceiver.getIntExtra(Progress.STATUS, 0);
            i11 = -1;
            if (intExtra4 != 1) {
                if (intExtra4 == 2) {
                    i11 = 1;
                } else if (intExtra4 == 4) {
                    i11 = 0;
                } else if (intExtra4 == 5) {
                    i11 = 2;
                }
            }
            int intExtra5 = registerReceiver.getIntExtra("plugged", 0);
            if (intExtra5 == 1) {
                i10 = 1;
            } else if (intExtra5 == 2) {
                i10 = 2;
            }
            c3713a = new C3713a();
        } catch (Throwable unused) {
        }
        try {
            c3713a.f16695a = intExtra;
            c3713a.f16696b = intExtra2;
            c3713a.f16698d = i11;
            c3713a.f16697c = intExtra3;
            c3713a.f16699e = i10;
            c3713a.f16700f = System.currentTimeMillis();
        } catch (Throwable unused2) {
            c3713a2 = c3713a;
            c3713a = c3713a2;
            return c3713a;
        }
        return c3713a;
    }

    /* synthetic */ C3714b(byte b10) {
        this();
    }

    /* renamed from: a */
    public static C3714b m15864a(Context context) {
        if (f16702b == null && context != null) {
            f16702b = context.getApplicationContext();
        }
        return a.f16706a;
    }

    /* renamed from: a */
    public final synchronized void m15868a(b bVar) {
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
            f16702b.registerReceiver(this.f16704d, intentFilter);
            f16701a = true;
            this.f16703c = bVar;
        } catch (Throwable unused) {
        }
    }
}
