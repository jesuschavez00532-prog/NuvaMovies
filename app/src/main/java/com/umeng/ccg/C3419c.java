package com.umeng.ccg;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.HashMap;

/* renamed from: com.umeng.ccg.c */
/* loaded from: classes3.dex */
public class C3419c {

    /* renamed from: a */
    public static Handler f15012a = null;

    /* renamed from: b */
    public static final int f15013b = 101;

    /* renamed from: c */
    public static final int f15014c = 102;

    /* renamed from: d */
    public static final int f15015d = 103;

    /* renamed from: e */
    public static final int f15016e = 104;

    /* renamed from: f */
    public static final int f15017f = 105;

    /* renamed from: g */
    public static final int f15018g = 106;

    /* renamed from: h */
    public static final int f15019h = 107;

    /* renamed from: i */
    public static final int f15020i = 0;

    /* renamed from: j */
    public static final int f15021j = 1;

    /* renamed from: k */
    public static final int f15022k = 2;

    /* renamed from: l */
    public static final int f15023l = 201;

    /* renamed from: m */
    public static final int f15024m = 202;

    /* renamed from: n */
    public static final int f15025n = 203;

    /* renamed from: o */
    public static final int f15026o = 301;

    /* renamed from: p */
    public static final int f15027p = 302;

    /* renamed from: q */
    public static final int f15028q = 303;

    /* renamed from: r */
    public static final int f15029r = 304;

    /* renamed from: s */
    public static final int f15030s = 305;

    /* renamed from: t */
    private static HandlerThread f15031t = null;

    /* renamed from: u */
    private static HashMap<Integer, a> f15032u = null;

    /* renamed from: v */
    private static final int f15033v = 256;

    /* renamed from: com.umeng.ccg.c$a */
    /* loaded from: classes3.dex */
    public interface a {
        /* renamed from: a */
        void mo14474a(Object obj, int i10);
    }

    private C3419c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static void m14473b(Message message) {
        a aVar;
        int i10 = message.arg1;
        Object obj = message.obj;
        Integer valueOf = Integer.valueOf(i10 / 100);
        HashMap<Integer, a> hashMap = f15032u;
        if (hashMap == null) {
            return;
        }
        if (hashMap.containsKey(valueOf)) {
            aVar = f15032u.get(valueOf);
        } else {
            aVar = null;
        }
        if (aVar != null) {
            aVar.mo14474a(obj, i10);
        }
    }

    /* renamed from: a */
    public static void m14469a(Context context, int i10, int i11, a aVar, Object obj, long j10) {
        if (context == null || aVar == null) {
            return;
        }
        if (f15032u == null) {
            f15032u = new HashMap<>();
        }
        Integer valueOf = Integer.valueOf(i11 / 100);
        if (!f15032u.containsKey(valueOf)) {
            f15032u.put(valueOf, aVar);
        }
        if (f15031t == null || f15012a == null) {
            m14468a();
        }
        try {
            Handler handler = f15012a;
            if (handler != null) {
                Message obtainMessage = handler.obtainMessage();
                obtainMessage.what = i10;
                obtainMessage.arg1 = i11;
                obtainMessage.obj = obj;
                f15012a.sendMessageDelayed(obtainMessage, j10);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static void m14470a(Context context, int i10, a aVar, Object obj) {
        m14469a(context, 256, i10, aVar, obj, 0L);
    }

    /* renamed from: a */
    public static void m14471a(Context context, int i10, a aVar, Object obj, long j10) {
        m14469a(context, 256, i10, aVar, obj, j10);
    }

    /* renamed from: a */
    private static synchronized void m14468a() {
        synchronized (C3419c.class) {
            try {
                if (f15031t == null) {
                    HandlerThread handlerThread = new HandlerThread("ccg_dispatch");
                    f15031t = handlerThread;
                    handlerThread.start();
                    if (f15012a == null) {
                        f15012a = new Handler(f15031t.getLooper()) { // from class: com.umeng.ccg.c.1
                            @Override // android.os.Handler
                            public void handleMessage(Message message) {
                                if (message.what == 256) {
                                    C3419c.m14473b(message);
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
