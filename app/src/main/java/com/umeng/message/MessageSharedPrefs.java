package com.umeng.message;

import android.app.Application;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import com.umeng.analytics.pro.C3325bt;
import com.umeng.analytics.pro.C3384f;
import com.umeng.message.common.UPLog;
import com.umeng.message.proguard.C3586bd;
import com.umeng.message.proguard.C3678f;
import com.umeng.message.proguard.C3682h;
import com.umeng.message.proguard.C3706y;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import org.android.agoo.common.AgooConstants;

/* loaded from: classes3.dex */
public class MessageSharedPrefs {

    /* renamed from: d */
    private static volatile MessageSharedPrefs f15768d;

    /* renamed from: a */
    public final Context f15769a;

    /* renamed from: b */
    public final C3586bd f15770b = new C3586bd("push");

    /* renamed from: c */
    public Boolean f15771c = null;

    private MessageSharedPrefs(Context context) {
        this.f15769a = context.getApplicationContext();
    }

    public static MessageSharedPrefs getInstance(Context context) {
        if (f15768d == null) {
            synchronized (MessageSharedPrefs.class) {
                if (f15768d == null) {
                    f15768d = new MessageSharedPrefs(context);
                }
            }
        }
        return f15768d;
    }

    private void setMessageAppKey(String str) {
        if (C3678f.m15753b(this.f15769a)) {
            if (TextUtils.isEmpty(str)) {
                UPLog.m15197e("Prefs", "appkey is empty!");
            } else {
                this.f15770b.m15396a("appkey", str);
            }
        }
    }

    private void setMessageAppSecret(String str) {
        if (C3678f.m15753b(this.f15769a)) {
            if (TextUtils.isEmpty(str)) {
                UPLog.m15197e("Prefs", "message secret is empty!");
            } else {
                this.f15770b.m15396a("message_secret", str);
            }
        }
    }

    private void setMessageChannel(String str) {
        if (C3678f.m15753b(this.f15769a)) {
            this.f15770b.m15396a("channel", str);
        }
    }

    /* renamed from: a */
    public final boolean m15162a() {
        Throwable th;
        long j10;
        try {
            j10 = this.f15770b.m15400b(C3384f.f14621p, 0L);
            if (j10 > 0) {
                try {
                    UPLog.m15198i("Prefs", "today first start:", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(new Date(j10)));
                } catch (Throwable th2) {
                    th = th2;
                    UPLog.m15196e("Prefs", th);
                    return C3678f.m15750a(j10);
                }
            }
        } catch (Throwable th3) {
            th = th3;
            j10 = 0;
        }
        return C3678f.m15750a(j10);
    }

    /* renamed from: b */
    public final int m15165b() {
        return this.f15770b.m15399b("notification_number", 5);
    }

    /* renamed from: c */
    public final String m15169c() {
        return this.f15770b.m15401b("appkey", "");
    }

    /* renamed from: d */
    public final int m15171d() {
        return this.f15770b.m15399b("tag_remain", 64);
    }

    /* renamed from: e */
    public final String m15172e() {
        String m15401b = this.f15770b.m15401b("service_class", "");
        if (!TextUtils.isEmpty(m15401b)) {
            try {
                Class.forName(m15401b);
                return m15401b;
            } catch (Throwable unused) {
                UPLog.m15197e("Prefs", "custom service not exist:", m15401b, "if has removed. pls invoke PushAgent.setPushIntentServiceClass(null)");
            }
        }
        return "";
    }

    /* renamed from: f */
    public final String m15173f() {
        return this.f15770b.m15401b("last_click_msg_id", "");
    }

    /* renamed from: g */
    public final int m15174g() {
        return this.f15770b.m15399b("mute_duration", 60);
    }

    /* renamed from: h */
    public final String m15175h() {
        return this.f15770b.m15401b("res_pkg", "");
    }

    /* renamed from: i */
    public final int m15176i() {
        return this.f15770b.m15399b("notification_vibrate", 0);
    }

    /* renamed from: j */
    public final int m15177j() {
        return this.f15770b.m15399b("notification_light", 0);
    }

    /* renamed from: k */
    public final int m15178k() {
        return this.f15770b.m15399b("notification_sound", 0);
    }

    /* renamed from: l */
    public final String m15179l() {
        return this.f15770b.m15401b("device_token", "");
    }

    /* renamed from: m */
    public final boolean m15180m() {
        return this.f15770b.m15403b("l_u_e", false);
    }

    /* renamed from: n */
    public final long m15181n() {
        return this.f15770b.m15400b("smart_lc", 0L);
    }

    /* renamed from: o */
    public final int m15182o() {
        return this.f15770b.m15399b("re_pop_cfg", 0);
    }

    /* renamed from: p */
    public final int m15183p() {
        Calendar calendar = Calendar.getInstance();
        String format = String.format(Locale.getDefault(), "%d.%d.", Integer.valueOf(calendar.get(1)), Integer.valueOf(calendar.get(6)));
        String m15401b = this.f15770b.m15401b("re_pop_times", "");
        if (m15401b.startsWith(format)) {
            try {
                return Integer.parseInt(m15401b.replace(format, ""));
            } catch (Throwable unused) {
            }
        }
        return 0;
    }

    /* renamed from: q */
    public final long m15184q() {
        return this.f15770b.m15400b("ia_last", 0L);
    }

    /* renamed from: r */
    public final long m15185r() {
        return Math.max(0L, this.f15770b.m15400b("ia_ttl", 0L));
    }

    /* renamed from: s */
    public final int m15186s() {
        Calendar calendar = Calendar.getInstance();
        String format = String.format(Locale.getDefault(), "%d.%d.", Integer.valueOf(calendar.get(1)), Integer.valueOf(calendar.get(6)));
        String m15401b = this.f15770b.m15401b("ia_times", "");
        if (m15401b.startsWith(format)) {
            try {
                return Integer.parseInt(m15401b.replace(format, ""));
            } catch (Throwable unused) {
            }
        }
        return 0;
    }

    /* renamed from: b */
    public final void m15168b(String str) {
        this.f15770b.m15393a(str + C3325bt.f14236ba);
        this.f15770b.m15393a(str + "ts");
    }

    /* renamed from: c */
    public final void m15170c(String str) {
        this.f15770b.m15396a("last_click_msg_id", str);
    }

    /* renamed from: b */
    public final void m15167b(long j10) {
        this.f15770b.m15395a("ia_ttl", j10);
    }

    /* renamed from: a */
    public final void m15160a(String str, String str2, int i10, long j10) {
        Cursor cursor = null;
        try {
            Application m15840a = C3706y.m15840a();
            try {
                this.f15769a.getContentResolver().delete(C3682h.m15767a(this.f15769a), "type=?", new String[]{str2});
            } catch (Exception e10) {
                UPLog.m15196e("Prefs", e10);
            }
            String[] strArr = {str, str2, String.valueOf(i10)};
            cursor = m15840a.getContentResolver().query(C3682h.m15767a(m15840a), null, "alias=? and type=? and exclusive=?", strArr, "time desc");
            ContentValues contentValues = new ContentValues();
            contentValues.put(AgooConstants.MESSAGE_TIME, Long.valueOf(System.currentTimeMillis()));
            contentValues.put("ttl", Long.valueOf(j10));
            contentValues.put("type", str2);
            contentValues.put("alias", str);
            contentValues.put("exclusive", Integer.valueOf(i10));
            if (cursor != null && cursor.getCount() > 0) {
                this.f15769a.getContentResolver().update(C3682h.m15767a(m15840a), contentValues, "alias=? and type=? and exclusive=?", strArr);
            } else {
                this.f15769a.getContentResolver().insert(C3682h.m15767a(m15840a), contentValues);
            }
        } catch (Exception e11) {
            UPLog.m15196e("Prefs", e11);
        }
        if (cursor != null) {
            try {
                cursor.close();
            } catch (Throwable th) {
                UPLog.m15196e("Prefs", th);
            }
        }
    }

    /* renamed from: b */
    public final void m15166b(int i10) {
        this.f15770b.m15394a("ia_count", i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String m15156a(int r10, java.lang.String r11) {
        /*
            r9 = this;
            java.lang.String r0 = "alias"
            java.lang.String r1 = "Prefs"
            r2 = 0
            java.lang.String r6 = "type=? and exclusive=?"
            r3 = 2
            java.lang.String[] r7 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L57
            r3 = 0
            r7[r3] = r11     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L57
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L57
            r11 = 1
            r7[r11] = r10     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L57
            java.lang.String r8 = "time desc"
            android.content.Context r10 = r9.f15769a     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L57
            android.content.ContentResolver r10 = r10.getContentResolver()     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L57
            android.content.Context r4 = r9.f15769a     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L57
            android.net.Uri r4 = com.umeng.message.proguard.C3682h.m15767a(r4)     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L57
            java.lang.String[] r5 = new java.lang.String[r11]     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L57
            r5[r3] = r0     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L57
            r3 = r10
            android.database.Cursor r10 = r3.query(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L57
            if (r10 == 0) goto L4a
            int r11 = r10.getCount()     // Catch: java.lang.Exception -> L48 java.lang.Throwable -> L67
            if (r11 > 0) goto L34
            goto L4a
        L34:
            r10.moveToFirst()     // Catch: java.lang.Exception -> L48 java.lang.Throwable -> L67
            int r11 = r10.getColumnIndex(r0)     // Catch: java.lang.Exception -> L48 java.lang.Throwable -> L67
            java.lang.String r11 = r10.getString(r11)     // Catch: java.lang.Exception -> L48 java.lang.Throwable -> L67
            r10.close()     // Catch: java.lang.Throwable -> L43
            goto L47
        L43:
            r10 = move-exception
            com.umeng.message.common.UPLog.m15196e(r1, r10)
        L47:
            return r11
        L48:
            r11 = move-exception
            goto L59
        L4a:
            if (r10 == 0) goto L54
            r10.close()     // Catch: java.lang.Throwable -> L50
            goto L54
        L50:
            r10 = move-exception
            com.umeng.message.common.UPLog.m15196e(r1, r10)
        L54:
            return r2
        L55:
            r11 = move-exception
            goto L69
        L57:
            r11 = move-exception
            r10 = r2
        L59:
            com.umeng.message.common.UPLog.m15196e(r1, r11)     // Catch: java.lang.Throwable -> L67
            if (r10 == 0) goto L66
            r10.close()     // Catch: java.lang.Throwable -> L62
            goto L66
        L62:
            r10 = move-exception
            com.umeng.message.common.UPLog.m15196e(r1, r10)
        L66:
            return r2
        L67:
            r11 = move-exception
            r2 = r10
        L69:
            if (r2 == 0) goto L73
            r2.close()     // Catch: java.lang.Throwable -> L6f
            goto L73
        L6f:
            r10 = move-exception
            com.umeng.message.common.UPLog.m15196e(r1, r10)
        L73:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.message.MessageSharedPrefs.m15156a(int, java.lang.String):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x011e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x0115 -> B:33:0x0119). Please report as a decompilation issue!!! */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m15163a(int r25, java.lang.String r26, java.lang.String r27) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.message.MessageSharedPrefs.m15163a(int, java.lang.String, java.lang.String):boolean");
    }

    /* renamed from: a */
    public final void m15161a(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            return;
        }
        Set<String> m15402b = this.f15770b.m15402b("tags", new HashSet());
        m15402b.addAll(Arrays.asList(strArr));
        this.f15770b.m15397a("tags", m15402b);
    }

    /* renamed from: a */
    public final void m15158a(long j10) {
        m15159a("smart_", j10);
    }

    /* renamed from: a */
    public final void m15159a(String str, long j10) {
        this.f15770b.m15395a(str + C3325bt.f14236ba, j10);
        this.f15770b.m15395a(str + "ts", System.currentTimeMillis());
    }

    /* renamed from: a */
    public final boolean m15164a(String str) {
        long m15400b = this.f15770b.m15400b(str + C3325bt.f14236ba, 0L);
        if (m15400b <= 0) {
            return true;
        }
        C3586bd c3586bd = this.f15770b;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("ts");
        return Math.abs(System.currentTimeMillis() - c3586bd.m15400b(sb2.toString(), 0L)) / 1000 >= m15400b;
    }

    /* renamed from: a */
    public final void m15157a(int i10) {
        this.f15770b.m15394a("tag_remain", i10);
    }
}
