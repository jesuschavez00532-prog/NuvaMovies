package com.umeng.message.proguard;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.taobao.agoo.p075a.p076a.AbstractC3215b;
import com.umeng.ccg.C3417a;
import com.umeng.message.MessageSharedPrefs;
import com.umeng.message.api.UPushInAppMessageHandler;
import com.umeng.message.common.UPLog;
import com.umeng.message.proguard.C3569ao;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.umeng.message.proguard.ak */
/* loaded from: classes3.dex */
public final class C3565ak extends AbstractC3566al {

    /* renamed from: e */
    private static final C3565ak f15929e = new C3565ak();

    /* renamed from: a */
    private Future<?> f15930a;

    /* renamed from: b */
    private Future<?> f15931b;

    /* renamed from: d */
    private final C3568an f15933d = new C3568an();

    /* renamed from: c */
    private final C3567am f15932c = new C3567am();

    private C3565ak() {
    }

    @Override // com.umeng.message.proguard.AbstractC3566al
    /* renamed from: c */
    public final C3568an mo15323c() {
        return this.f15933d;
    }

    @Override // com.umeng.message.proguard.AbstractC3566al
    /* renamed from: b */
    public final void mo15322b() {
        if (this.f15933d.m15332a() || this.f15932c.f15943a) {
            return;
        }
        Future<?> future = this.f15930a;
        if (future == null || future.isDone() || future.isCancelled()) {
            long m15822e = C3702u.m15822e();
            long j10 = this.f15933d.f15951c;
            long j11 = 500;
            if (m15822e < j10) {
                long j12 = j10 - m15822e;
                if (j12 >= 500) {
                    j11 = j12;
                }
            }
            this.f15930a = C3581b.m15371a(new Runnable() { // from class: com.umeng.message.proguard.ak.2
                @Override // java.lang.Runnable
                public final void run() {
                    boolean z10;
                    boolean z11;
                    boolean z12;
                    try {
                        C3570ap m15326a = C3565ak.this.f15932c.m15326a();
                        if (m15326a == null || !C3702u.m15819c()) {
                            return;
                        }
                        final MessageSharedPrefs messageSharedPrefs = MessageSharedPrefs.getInstance(C3706y.m15840a());
                        if (messageSharedPrefs.m15186s() >= messageSharedPrefs.f15770b.m15399b("ia_count", 0)) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            UPLog.m15198i("Pop", "count not allow");
                            return;
                        }
                        long j13 = 0;
                        if (Math.abs(System.currentTimeMillis() - messageSharedPrefs.f15770b.m15400b("ia_last", 0L)) < messageSharedPrefs.m15185r()) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            UPLog.m15198i("Pop", "ttl not allow");
                            long m15185r = messageSharedPrefs.m15185r() - Math.abs(System.currentTimeMillis() - messageSharedPrefs.f15770b.m15400b("ia_last", 0L));
                            if (!C3565ak.this.f15932c.f15943a) {
                                C3565ak.this.m15314a(m15185r);
                                return;
                            }
                            return;
                        }
                        Activity m15820d = C3702u.m15820d();
                        if (m15820d != null && !m15820d.isFinishing()) {
                            C3568an c3568an = C3565ak.this.f15933d;
                            String name = m15820d.getClass().getName();
                            String[] strArr = c3568an.f15956h;
                            if (strArr != null) {
                                for (String str : strArr) {
                                    if (TextUtils.equals(str, name)) {
                                        z12 = true;
                                        break;
                                    }
                                }
                            }
                            z12 = false;
                            if (z12) {
                                UPLog.m15198i("Pop", "trigger activity name not match ", m15820d.getClass().getName());
                                return;
                            }
                            UPushInAppMessageHandler inAppMessageHandler = C3703v.m15825a().getInAppMessageHandler();
                            if (inAppMessageHandler != null && !inAppMessageHandler.canShowMessage(C3706y.m15840a(), m15326a.f15961a)) {
                                C3565ak.this.f15932c.m15330b(m15326a);
                                UPLog.m15198i("Pop", "show allowed: false. msgId:", m15326a.f15961a.getMsgId());
                                inAppMessageHandler.onMessageIgnored(C3706y.m15840a(), m15326a.f15961a);
                                long currentTimeMillis = System.currentTimeMillis() - messageSharedPrefs.m15184q();
                                if (currentTimeMillis < C3565ak.this.f15933d.f15949a) {
                                    j13 = currentTimeMillis;
                                }
                                C3565ak c3565ak = C3565ak.this;
                                c3565ak.m15314a(Math.max(c3565ak.f15933d.f15952d, C3565ak.this.f15933d.f15949a) - j13);
                                return;
                            }
                            C3569ao.m15335a(m15820d, m15326a, new C3569ao.a() { // from class: com.umeng.message.proguard.ak.2.1
                                @Override // com.umeng.message.proguard.C3569ao.a
                                /* renamed from: a */
                                public final void mo15324a(C3570ap c3570ap, boolean z13) {
                                    if (z13) {
                                        C3565ak.this.f15932c.m15330b(c3570ap);
                                        messageSharedPrefs.f15770b.m15395a("ia_latest_ts", c3570ap.f15961a.getMsgTime());
                                        messageSharedPrefs.f15770b.m15395a("ia_last", System.currentTimeMillis());
                                        int m15186s = messageSharedPrefs.m15186s() + 1;
                                        MessageSharedPrefs messageSharedPrefs2 = messageSharedPrefs;
                                        Calendar calendar = Calendar.getInstance();
                                        messageSharedPrefs2.f15770b.m15396a("ia_times", String.format(Locale.getDefault(), "%d.%d.%d", Integer.valueOf(calendar.get(1)), Integer.valueOf(calendar.get(6)), Integer.valueOf(m15186s)));
                                        if (!C3565ak.this.f15932c.f15943a) {
                                            C3565ak c3565ak2 = C3565ak.this;
                                            c3565ak2.m15314a(Math.max(c3565ak2.f15933d.f15952d, C3565ak.this.f15933d.f15949a));
                                            return;
                                        }
                                        return;
                                    }
                                    UPLog.m15198i("Pop", "trigger not show msgId:", c3570ap.f15961a.getMsgId());
                                    long currentTimeMillis2 = System.currentTimeMillis() - messageSharedPrefs.m15184q();
                                    if (currentTimeMillis2 >= C3565ak.this.f15933d.f15949a) {
                                        currentTimeMillis2 = 0;
                                    }
                                    C3565ak c3565ak3 = C3565ak.this;
                                    c3565ak3.m15314a(Math.max(c3565ak3.f15933d.f15952d, C3565ak.this.f15933d.f15949a) - currentTimeMillis2);
                                }
                            });
                            return;
                        }
                        UPLog.m15198i("Pop", "trigger activity finish");
                    } catch (Throwable unused) {
                    }
                }
            }, j11, TimeUnit.MILLISECONDS);
            UPLog.m15198i("Pop", "trigger msg task delay:", Long.valueOf(j11));
        }
    }

    /* renamed from: a */
    public static AbstractC3566al m15312a() {
        return f15929e;
    }

    @Override // com.umeng.message.proguard.AbstractC3566al
    /* renamed from: a */
    public final void mo15318a(final Context context) {
        C3581b.m15374b(new Runnable() { // from class: com.umeng.message.proguard.ak.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    if (C3565ak.this.f15933d.m15332a()) {
                        String m15401b = MessageSharedPrefs.getInstance(context).f15770b.m15401b("ia_cfg", (String) null);
                        if (m15401b != null && m15401b.length() > 0) {
                            m15401b = new String(C3588bf.m15405a(m15401b));
                        }
                        if (m15401b != null && m15401b.length() > 0) {
                            UPLog.m15198i("Pop", "init config", m15401b);
                            C3565ak.this.f15933d.m15331a(new JSONObject(m15401b));
                            MessageSharedPrefs messageSharedPrefs = MessageSharedPrefs.getInstance(C3706y.m15840a());
                            messageSharedPrefs.m15166b(C3565ak.this.f15933d.f15950b);
                            messageSharedPrefs.m15167b(C3565ak.this.f15933d.f15952d);
                        }
                    }
                    C3565ak.this.f15932c.m15329b();
                } catch (Throwable unused) {
                }
            }
        });
    }

    @Override // com.umeng.message.proguard.AbstractC3566al
    /* renamed from: a */
    public final void mo15317a(Activity activity) {
        C3569ao.m15334a(activity);
    }

    @Override // com.umeng.message.proguard.AbstractC3566al
    /* renamed from: a */
    public final void mo15319a(C3570ap c3570ap) {
        try {
            if (this.f15933d.m15332a()) {
                this.f15932c.m15328a(c3570ap);
                UPLog.m15198i("Pop", "config empty. cached");
            } else {
                this.f15932c.m15328a(c3570ap);
                m15314a(500L);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m15314a(long j10) {
        if (j10 < 500) {
            j10 = 500;
        }
        Future<?> future = this.f15931b;
        if (future != null && !future.isDone() && !future.isCancelled()) {
            future.cancel(false);
        }
        Runnable runnable = new Runnable() { // from class: com.umeng.message.proguard.ak.3
            @Override // java.lang.Runnable
            public final void run() {
                if (C3702u.m15819c() && C3702u.m15820d() != null) {
                    C3565ak.this.mo15322b();
                }
            }
        };
        UPLog.m15198i("Pop", "check delay:", Long.valueOf(j10));
        this.f15931b = C3581b.m15371a(runnable, j10, TimeUnit.MILLISECONDS);
    }

    @Override // com.umeng.message.proguard.AbstractC3566al
    /* renamed from: a */
    public final void mo15320a(String str) {
        C3569ao.m15336a(str);
        C3567am c3567am = this.f15932c;
        C3570ap m15327a = c3567am.m15327a(str);
        boolean m15330b = m15327a != null ? c3567am.m15330b(m15327a) : false;
        Object[] objArr = new Object[3];
        objArr[0] = "recall";
        objArr[1] = str;
        objArr[2] = m15330b ? AbstractC3215b.JSON_SUCCESS : "not exist";
        UPLog.m15198i("Pop", objArr);
    }

    @Override // com.umeng.message.proguard.AbstractC3566al
    /* renamed from: a */
    public final void mo15321a(final String str, final Object obj) {
        C3581b.m15374b(new Runnable() { // from class: com.umeng.message.proguard.ak.4
            @Override // java.lang.Runnable
            public final void run() {
                JSONObject optJSONObject;
                JSONArray optJSONArray;
                JSONObject optJSONObject2;
                MessageSharedPrefs messageSharedPrefs = MessageSharedPrefs.getInstance(C3706y.m15840a());
                try {
                    Object obj2 = obj;
                    if (!(obj2 instanceof JSONObject)) {
                        return;
                    }
                    JSONObject jSONObject = (JSONObject) obj2;
                    if (jSONObject.length() == 0 || (optJSONObject = jSONObject.optJSONObject(C3417a.f14979a)) == null) {
                        return;
                    }
                    UPLog.m15198i("Pop", "tag:", str);
                    JSONObject optJSONObject3 = optJSONObject.optJSONObject("push_inapp");
                    if (optJSONObject3 == null || (optJSONArray = optJSONObject3.optJSONArray(C3417a.f14990l)) == null || optJSONArray.length() == 0 || (optJSONObject2 = optJSONArray.optJSONObject(0)) == null) {
                        return;
                    }
                    UPLog.m15198i("Pop", "config:", optJSONObject2);
                    String jSONObject2 = optJSONObject2.toString();
                    if (jSONObject2 != null && jSONObject2.length() > 0) {
                        jSONObject2 = C3588bf.m15404a(jSONObject2.getBytes());
                    } else if (jSONObject2 == null) {
                        jSONObject2 = "";
                    }
                    messageSharedPrefs.f15770b.m15396a("ia_cfg", jSONObject2);
                    C3565ak.this.f15933d.m15331a(optJSONObject2);
                    messageSharedPrefs.m15166b(C3565ak.this.f15933d.f15950b);
                    messageSharedPrefs.m15167b(C3565ak.this.f15933d.f15952d);
                } catch (Throwable unused) {
                }
            }
        });
    }
}
