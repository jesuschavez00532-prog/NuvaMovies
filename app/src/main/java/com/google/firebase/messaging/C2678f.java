package com.google.firebase.messaging;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import androidx.core.app.AbstractC0517l;
import com.google.firebase.messaging.AbstractC2672d;
import com.umeng.message.entity.UMessage;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p127f5.AbstractC4250l;
import p281p4.AbstractC6207k;

/* renamed from: com.google.firebase.messaging.f */
/* loaded from: classes.dex */
class C2678f {

    /* renamed from: a */
    private final ExecutorService f10288a;

    /* renamed from: b */
    private final Context f10289b;

    /* renamed from: c */
    private final C2682g0 f10290c;

    public C2678f(Context context, C2682g0 c2682g0, ExecutorService executorService) {
        this.f10288a = executorService;
        this.f10289b = context;
        this.f10290c = c2682g0;
    }

    /* renamed from: b */
    private boolean m11202b() {
        if (((KeyguardManager) this.f10289b.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            return false;
        }
        if (!AbstractC6207k.m24769f()) {
            SystemClock.sleep(10L);
        }
        int myPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.f10289b.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.pid == myPid) {
                if (runningAppProcessInfo.importance != 100) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    private void m11203c(AbstractC2672d.a aVar) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Showing notification");
        }
        ((NotificationManager) this.f10289b.getSystemService(UMessage.DISPLAY_TYPE_NOTIFICATION)).notify(aVar.f10281b, aVar.f10282c, aVar.f10280a.m2254b());
    }

    /* renamed from: d */
    private C2670c0 m11204d() {
        C2670c0 m11142d = C2670c0.m11142d(this.f10290c.m11240p("gcm.n.image"));
        if (m11142d != null) {
            m11142d.m11146h(this.f10288a);
        }
        return m11142d;
    }

    /* renamed from: e */
    private void m11205e(AbstractC0517l.e eVar, C2670c0 c2670c0) {
        if (c2670c0 == null) {
            return;
        }
        try {
            Bitmap bitmap = (Bitmap) AbstractC4250l.m17730b(c2670c0.m11145e(), 5L, TimeUnit.SECONDS);
            eVar.m2264o(bitmap);
            eVar.m2272w(new AbstractC0517l.b().m2241i(bitmap).m2240h(null));
        } catch (InterruptedException unused) {
            Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
            c2670c0.close();
            Thread.currentThread().interrupt();
        } catch (ExecutionException e10) {
            Log.w("FirebaseMessaging", "Failed to download image: " + e10.getCause());
        } catch (TimeoutException unused2) {
            Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
            c2670c0.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean m11206a() {
        if (this.f10290c.m11226a("gcm.n.noui")) {
            return true;
        }
        if (m11202b()) {
            return false;
        }
        C2670c0 m11204d = m11204d();
        AbstractC2672d.a m11152f = AbstractC2672d.m11152f(this.f10289b, this.f10290c);
        m11205e(m11152f.f10280a, m11204d);
        m11203c(m11152f);
        return true;
    }
}
