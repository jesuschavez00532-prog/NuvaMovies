package com.uyumao;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.HashMap;

/* renamed from: com.uyumao.g */
/* loaded from: classes3.dex */
public class C3775g {

    /* renamed from: a */
    public static HandlerThread f16954a;

    /* renamed from: b */
    public static Handler f16955b;

    /* renamed from: c */
    public static HashMap<Integer, a> f16956c;

    /* renamed from: com.uyumao.g$a */
    /* loaded from: classes3.dex */
    public interface a {
        /* renamed from: a */
        void mo16001a(Object obj, int i10);
    }

    /* renamed from: a */
    public static void m16024a(Context context, int i10, int i11, a aVar, Object obj, long j10) {
        if (context == null || aVar == null) {
            return;
        }
        if (f16956c == null) {
            f16956c = new HashMap<>();
        }
        Integer valueOf = Integer.valueOf(i11 / 100);
        if (!f16956c.containsKey(valueOf)) {
            f16956c.put(valueOf, aVar);
        }
        if (f16954a == null || f16955b == null) {
            synchronized (C3775g.class) {
                try {
                    if (f16954a == null) {
                        HandlerThread handlerThread = new HandlerThread("yumao_ccg");
                        f16954a = handlerThread;
                        handlerThread.start();
                        if (f16955b == null) {
                            f16955b = new HandlerC3774f(f16954a.getLooper());
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        }
        try {
            Handler handler = f16955b;
            if (handler != null) {
                Message obtainMessage = handler.obtainMessage();
                obtainMessage.what = i10;
                obtainMessage.arg1 = i11;
                obtainMessage.obj = obj;
                f16955b.sendMessageDelayed(obtainMessage, j10);
            }
        } catch (Throwable unused2) {
        }
    }

    /* renamed from: a */
    public static void m16025a(Context context, int i10, a aVar, Object obj) {
        m16024a(context, 256, i10, aVar, obj, 0L);
    }
}
