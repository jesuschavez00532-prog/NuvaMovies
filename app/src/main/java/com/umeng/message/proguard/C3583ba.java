package com.umeng.message.proguard;

import android.app.Application;
import android.app.Notification;
import android.app.NotificationManager;
import android.os.Build;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import com.umeng.message.MessageSharedPrefs;
import com.umeng.message.UTrack;
import com.umeng.message.common.UPLog;
import com.umeng.message.entity.UMessage;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: com.umeng.message.proguard.ba */
/* loaded from: classes3.dex */
public final class C3583ba extends AbstractRunnableC3609c {

    /* renamed from: b */
    private static final Object f16046b = new Object();

    /* renamed from: c */
    private final C3558ad f16047c;

    /* renamed from: d */
    private long f16048d;

    public C3583ba(C3558ad c3558ad) {
        this.f16047c = c3558ad;
    }

    /* renamed from: a */
    private StatusBarNotification m15381a(NotificationManager notificationManager) {
        UMessage uMessage;
        StatusBarNotification[] activeNotifications;
        StatusBarNotification statusBarNotification;
        boolean z10;
        C3558ad c3558ad = this.f16047c;
        if (c3558ad != null && (uMessage = c3558ad.f15880b) != null && Build.VERSION.SDK_INT >= 23) {
            try {
                activeNotifications = notificationManager.getActiveNotifications();
                if (activeNotifications != null && activeNotifications.length != 0) {
                    int length = activeNotifications.length;
                    int i10 = 0;
                    while (true) {
                        if (i10 < length) {
                            statusBarNotification = activeNotifications[i10];
                            if (TextUtils.equals(statusBarNotification.getTag(), "um") && statusBarNotification.getId() == this.f16047c.f15879a) {
                                z10 = true;
                                break;
                            }
                            i10++;
                        } else {
                            statusBarNotification = null;
                            z10 = false;
                            break;
                        }
                    }
                    UPLog.m15198i("Repost", "showing:", Boolean.valueOf(z10), "msgId:", uMessage.getMsgId());
                    return statusBarNotification;
                }
                UPLog.m15198i("Repost", "notification list null");
                return null;
            } catch (Throwable th) {
                UPLog.m15196e("Repost", th);
                return null;
            }
        }
        return null;
    }

    @Override // com.umeng.message.proguard.AbstractRunnableC3609c
    /* renamed from: b */
    public final Future<?> mo15382b() {
        boolean z10;
        int repostInterval;
        if (m15485d()) {
            return this.f16121a;
        }
        C3558ad c3558ad = this.f16047c;
        if (c3558ad == null) {
            return this.f16121a;
        }
        UMessage uMessage = c3558ad.f15880b;
        if (uMessage == null) {
            return this.f16121a;
        }
        long j10 = this.f16048d;
        if (j10 == 0) {
            this.f16048d = System.currentTimeMillis();
            z10 = true;
        } else {
            boolean m15750a = C3678f.m15750a(j10);
            UPLog.m15198i("Repost", "is today:", Boolean.valueOf(m15750a));
            if (!m15750a) {
                return this.f16121a;
            }
            z10 = false;
        }
        Application m15840a = C3706y.m15840a();
        int m15183p = MessageSharedPrefs.getInstance(m15840a).m15183p();
        int m15182o = MessageSharedPrefs.getInstance(m15840a).m15182o();
        UPLog.m15198i("Repost", "total times:", Integer.valueOf(m15183p), "config:", Integer.valueOf(m15182o));
        if (m15183p >= m15182o) {
            return this.f16121a;
        }
        if (z10) {
            repostInterval = uMessage.getRepostStart();
        } else {
            repostInterval = uMessage.getRepostInterval();
        }
        long j11 = repostInterval;
        this.f16121a = C3581b.m15371a(this, j11, TimeUnit.MINUTES);
        UPLog.m15198i("Repost", "delay:", Long.valueOf(j11), "msgId:", uMessage.getMsgId());
        return this.f16121a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            synchronized (f16046b) {
                if (this.f16047c == null) {
                    this.f16121a = null;
                    return;
                }
                boolean m15750a = C3678f.m15750a(this.f16048d);
                UPLog.m15198i("Repost", "is today:", Boolean.valueOf(m15750a));
                if (!m15750a) {
                    this.f16121a = null;
                    return;
                }
                Application m15840a = C3706y.m15840a();
                NotificationManager notificationManager = (NotificationManager) m15840a.getSystemService(UMessage.DISPLAY_TYPE_NOTIFICATION);
                if (notificationManager == null) {
                    this.f16121a = null;
                    UPLog.m15198i("Repost", "mgr null!");
                    return;
                }
                StatusBarNotification m15381a = m15381a(notificationManager);
                if (m15381a == null) {
                    this.f16121a = null;
                    UPLog.m15198i("Repost", "sbn null! msgId:", this.f16047c.f15880b.getMsgId());
                    return;
                }
                int m15182o = MessageSharedPrefs.getInstance(m15840a).m15182o();
                int m15183p = MessageSharedPrefs.getInstance(m15840a).m15183p();
                UPLog.m15198i("Repost", "task total times:", Integer.valueOf(m15183p), "config:", Integer.valueOf(m15182o));
                if (m15183p >= m15182o) {
                    return;
                }
                Notification notification = m15381a.getNotification();
                if (notification != null) {
                    notificationManager.cancel("um", this.f16047c.f15879a);
                    notification.when = System.currentTimeMillis();
                    notificationManager.notify("um", this.f16047c.f15879a, notification);
                    this.f16121a = null;
                    this.f16047c.f15882d++;
                    MessageSharedPrefs messageSharedPrefs = MessageSharedPrefs.getInstance(m15840a);
                    Calendar calendar = Calendar.getInstance();
                    messageSharedPrefs.f15770b.m15396a("re_pop_times", String.format(Locale.getDefault(), "%d.%d.%d", Integer.valueOf(calendar.get(1)), Integer.valueOf(calendar.get(6)), Integer.valueOf(m15183p + 1)));
                    UTrack.getInstance().trackMsgRepost(this.f16047c.f15880b, notification);
                    UPLog.m15198i("Repost", "show msgId:", this.f16047c.f15880b.getMsgId(), "count:", Integer.valueOf(this.f16047c.f15882d));
                    m15483a();
                }
            }
        } catch (Throwable th) {
            UPLog.m15196e("Repost", th);
        }
    }
}
