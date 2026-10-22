package com.umeng.commonsdk;

import android.content.Context;
import android.content.SharedPreferences;
import com.umeng.analytics.pro.C3309bd;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.utils.onMessageSendListener;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class UMConfigureImpl {

    /* renamed from: e */
    private static final int f15081e = 1000;

    /* renamed from: f */
    private static ScheduledExecutorService f15082f;

    /* renamed from: g */
    private static Context f15083g;

    /* renamed from: a */
    private static String f15077a = C3309bd.m13860b().m13863b(C3309bd.f14108o);

    /* renamed from: b */
    private static CopyOnWriteArrayList<onMessageSendListener> f15078b = new CopyOnWriteArrayList<>();

    /* renamed from: c */
    private static int f15079c = 0;

    /* renamed from: d */
    private static boolean f15080d = false;

    /* renamed from: h */
    private static int f15084h = 0;

    /* renamed from: i */
    private static Runnable f15085i = new Runnable() { // from class: com.umeng.commonsdk.UMConfigureImpl.1
        @Override // java.lang.Runnable
        public void run() {
            try {
                if (UMConfigureImpl.f15079c == 0 || UMConfigureImpl.f15084h >= 10) {
                    if (!UMConfigureImpl.f15080d) {
                        boolean unused = UMConfigureImpl.f15080d = true;
                        UMConfigureImpl.m14534b(UMConfigureImpl.f15083g);
                    }
                    if (UMConfigureImpl.f15082f != null) {
                        UMConfigureImpl.f15082f.shutdown();
                        ScheduledExecutorService unused2 = UMConfigureImpl.f15082f = null;
                    }
                }
                UMConfigureImpl.m14540f();
            } catch (Exception unused3) {
            }
        }
    };

    /* renamed from: f */
    static /* synthetic */ int m14540f() {
        int i10 = f15084h;
        f15084h = i10 + 1;
        return i10;
    }

    public static void init(Context context) {
        if (context == null) {
            return;
        }
        f15083g = context;
        try {
            if (f15079c >= 1) {
                if (!m14538d(context)) {
                    UMEnvelopeBuild.setTransmissionSendFlag(false);
                    m14535c(context);
                    if (f15082f == null) {
                        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1);
                        f15082f = newScheduledThreadPool;
                        newScheduledThreadPool.scheduleAtFixedRate(f15085i, 0L, 100L, TimeUnit.MILLISECONDS);
                    }
                } else {
                    UMEnvelopeBuild.setTransmissionSendFlag(true);
                }
            } else {
                UMEnvelopeBuild.setTransmissionSendFlag(true);
            }
        } catch (Exception unused) {
        }
    }

    public static synchronized void registerInterruptFlag() {
        synchronized (UMConfigureImpl.class) {
            try {
                f15079c++;
            } catch (Exception unused) {
            }
        }
    }

    public static synchronized void registerMessageSendListener(onMessageSendListener onmessagesendlistener) {
        CopyOnWriteArrayList<onMessageSendListener> copyOnWriteArrayList;
        synchronized (UMConfigureImpl.class) {
            try {
                CopyOnWriteArrayList<onMessageSendListener> copyOnWriteArrayList2 = f15078b;
                if (copyOnWriteArrayList2 != null) {
                    copyOnWriteArrayList2.add(onmessagesendlistener);
                }
                if (UMEnvelopeBuild.getTransmissionSendFlag() && (copyOnWriteArrayList = f15078b) != null && copyOnWriteArrayList.size() > 0) {
                    Iterator<onMessageSendListener> it = f15078b.iterator();
                    while (it.hasNext()) {
                        it.next().onMessageSend();
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public static synchronized void removeInterruptFlag() {
        synchronized (UMConfigureImpl.class) {
            try {
                f15079c--;
            } catch (Exception unused) {
            }
        }
    }

    public static synchronized void removeMessageSendListener(onMessageSendListener onmessagesendlistener) {
        synchronized (UMConfigureImpl.class) {
            try {
                CopyOnWriteArrayList<onMessageSendListener> copyOnWriteArrayList = f15078b;
                if (copyOnWriteArrayList != null) {
                    copyOnWriteArrayList.remove(onmessagesendlistener);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static synchronized void m14534b(Context context) {
        synchronized (UMConfigureImpl.class) {
            try {
                UMEnvelopeBuild.setTransmissionSendFlag(true);
                CopyOnWriteArrayList<onMessageSendListener> copyOnWriteArrayList = f15078b;
                if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
                    Iterator<onMessageSendListener> it = f15078b.iterator();
                    while (it.hasNext()) {
                        it.next().onMessageSend();
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: c */
    private static void m14535c(Context context) {
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences(f15077a, 0);
            if (sharedPreferences != null) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putBoolean(f15077a, true);
                edit.commit();
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: d */
    private static boolean m14538d(Context context) {
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences(f15077a, 0);
            if (sharedPreferences != null) {
                return sharedPreferences.getBoolean(f15077a, false);
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }
}
