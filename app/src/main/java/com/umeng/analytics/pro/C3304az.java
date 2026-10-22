package com.umeng.analytics.pro;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.HashMap;

/* renamed from: com.umeng.analytics.pro.az */
/* loaded from: classes3.dex */
public class C3304az {

    /* renamed from: a */
    public static Handler f14058a = null;

    /* renamed from: b */
    public static final int f14059b = 101;

    /* renamed from: c */
    private static HandlerThread f14060c = null;

    /* renamed from: d */
    private static HashMap<Integer, a> f14061d = null;

    /* renamed from: e */
    private static final int f14062e = 256;

    /* renamed from: com.umeng.analytics.pro.az$a */
    /* loaded from: classes3.dex */
    public interface a {
        /* renamed from: a */
        void mo13825a(Object obj, int i10);
    }

    private C3304az() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static void m13824b(Message message) {
        a aVar;
        int i10 = message.arg1;
        Object obj = message.obj;
        Integer valueOf = Integer.valueOf(i10 / 100);
        HashMap<Integer, a> hashMap = f14061d;
        if (hashMap == null) {
            return;
        }
        if (hashMap.containsKey(valueOf)) {
            aVar = f14061d.get(valueOf);
        } else {
            aVar = null;
        }
        if (aVar != null) {
            aVar.mo13825a(obj, i10);
        }
    }

    /* renamed from: a */
    public static void m13820a(Context context, int i10, int i11, a aVar, Object obj, long j10) {
        if (context == null || aVar == null) {
            return;
        }
        if (f14061d == null) {
            f14061d = new HashMap<>();
        }
        Integer valueOf = Integer.valueOf(i11 / 100);
        if (!f14061d.containsKey(valueOf)) {
            f14061d.put(valueOf, aVar);
        }
        if (f14060c == null || f14058a == null) {
            m13819a();
        }
        try {
            Handler handler = f14058a;
            if (handler != null) {
                Message obtainMessage = handler.obtainMessage();
                obtainMessage.what = i10;
                obtainMessage.arg1 = i11;
                obtainMessage.obj = obj;
                f14058a.sendMessageDelayed(obtainMessage, j10);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static void m13821a(Context context, int i10, a aVar, Object obj) {
        m13820a(context, 256, i10, aVar, obj, 0L);
    }

    /* renamed from: a */
    public static void m13822a(Context context, int i10, a aVar, Object obj, long j10) {
        m13820a(context, 256, i10, aVar, obj, j10);
    }

    /* renamed from: a */
    private static synchronized void m13819a() {
        synchronized (C3304az.class) {
            try {
                if (f14060c == null) {
                    HandlerThread handlerThread = new HandlerThread("ck_dispatch");
                    f14060c = handlerThread;
                    handlerThread.start();
                    if (f14058a == null) {
                        f14058a = new Handler(f14060c.getLooper()) { // from class: com.umeng.analytics.pro.az.1
                            @Override // android.os.Handler
                            public void handleMessage(Message message) {
                                if (message.what == 256) {
                                    C3304az.m13824b(message);
                                }
                            }
                        };
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }
}
