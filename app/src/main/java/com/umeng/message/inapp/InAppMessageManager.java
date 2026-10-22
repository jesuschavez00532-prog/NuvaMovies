package com.umeng.message.inapp;

import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.message.common.UPLog;
import com.umeng.message.entity.UInAppMessage;
import com.umeng.message.proguard.C3560af;
import com.umeng.message.proguard.C3562ah;
import com.umeng.message.proguard.C3564aj;
import com.umeng.message.proguard.C3581b;
import com.umeng.message.proguard.C3586bd;
import com.umeng.message.proguard.C3678f;
import com.umeng.message.proguard.C3682h;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Locale;
import org.android.agoo.message.MessageService;

/* loaded from: classes3.dex */
public class InAppMessageManager {

    /* renamed from: a */
    public static boolean f15792a = false;

    /* renamed from: d */
    public static int f15793d = 1800000;

    /* renamed from: e */
    public static int f15794e = 1000;

    /* renamed from: f */
    private static InAppMessageManager f15795f;

    /* renamed from: b */
    public final Context f15796b;

    /* renamed from: c */
    String f15797c;

    /* renamed from: h */
    private final C3586bd f15799h = new C3586bd("in_app");

    /* renamed from: g */
    private UInAppHandler f15798g = new UmengInAppClickHandler();

    private InAppMessageManager(Context context) {
        this.f15796b = context.getApplicationContext();
    }

    /* renamed from: d */
    private int m15211d(String str) {
        return Integer.parseInt(m15214a(str, MessageService.MSG_DB_READY_REPORT));
    }

    public static InAppMessageManager getInstance(Context context) {
        if (f15795f == null) {
            synchronized (InAppMessageManager.class) {
                if (f15795f == null) {
                    f15795f = new InAppMessageManager(context);
                }
            }
        }
        return f15795f;
    }

    /* renamed from: c */
    public final long m15222c(String str) {
        return Long.parseLong(m15214a("KEY_LAST_SHOW_CARD_TS_".concat(String.valueOf(str)), MessageService.MSG_DB_READY_REPORT));
    }

    public UInAppHandler getInAppHandler() {
        return this.f15798g;
    }

    public void setInAppHandler(UInAppHandler uInAppHandler) {
        this.f15798g = uInAppHandler;
    }

    public void setInAppMsgDebugMode(boolean z10) {
        f15792a = z10;
    }

    public void setMainActivityPath(String str) {
        this.f15797c = str;
    }

    public void setPlainTextSize(int i10, int i11, int i12) {
        if (i10 > 0 && i11 > 0 && i12 > 0) {
            m15221b("KEY_PLAIN_TEXT_SIZE", i10 + "," + i11 + "," + i12);
            return;
        }
        UMLog.mutlInfo("InAppMessageManager", 0, "纯文本字体大小不能小于0");
    }

    public void showCardMessage(Activity activity, String str, IUmengInAppMsgCloseCallback iUmengInAppMsgCloseCallback) {
        if (C3678f.m15752b()) {
            UPLog.m15198i("InAppMessageManager", "showCardMessage failed, silent mode!");
            return;
        }
        C3562ah c3562ah = new C3562ah(activity, str, iUmengInAppMsgCloseCallback);
        if (TextUtils.isEmpty(c3562ah.f15899c.trim())) {
            UMLog.mutlInfo(C3562ah.f15897a, 0, "插屏消息的标签不能为空");
            return;
        }
        if (c3562ah.m15298a(c3562ah.f15899c)) {
            if (f15792a) {
                C3564aj.m15304a(c3562ah.f15898b).m15311a(c3562ah.f15899c, c3562ah);
                return;
            } else if (System.currentTimeMillis() - Long.parseLong(getInstance(c3562ah.f15898b).m15214a("KEY_CARD_TS_".concat(String.valueOf(c3562ah.f15899c)), MessageService.MSG_DB_READY_REPORT)) > f15793d) {
                C3564aj.m15304a(c3562ah.f15898b).m15311a(c3562ah.f15899c, c3562ah);
                return;
            } else {
                c3562ah.mo15267b((UInAppMessage) null);
                return;
            }
        }
        UMLog.mutlInfo(C3562ah.f15897a, 0, "插屏消息的最大标签数为 10");
    }

    /* renamed from: a */
    public final void m15215a(UInAppMessage uInAppMessage) {
        if (uInAppMessage == null) {
            m15221b("KEY_LAST_SPLASH_ID", "");
        } else if (uInAppMessage.getRaw() != null) {
            m15221b("KEY_LAST_SPLASH_ID", uInAppMessage.getRaw().toString());
        }
    }

    /* renamed from: b */
    public final void m15220b(String str) {
        String concat = "KEY_LAST_SHOW_CARD_TS_".concat(String.valueOf(str));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(System.currentTimeMillis());
        m15221b(concat, sb2.toString());
    }

    /* renamed from: c */
    public final boolean m15223c(UInAppMessage uInAppMessage) {
        return uInAppMessage.show_times == 0 || m15211d(uInAppMessage.msg_id) < uInAppMessage.show_times;
    }

    /* renamed from: b */
    public static boolean m15210b(UInAppMessage uInAppMessage) {
        try {
            return System.currentTimeMillis() < new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINA).parse(uInAppMessage.expire_time).getTime();
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    /* renamed from: a */
    public final String m15212a() {
        return m15214a("KEY_LAST_SPLASH_ID", "");
    }

    /* renamed from: a */
    public final void m15216a(UInAppMessage uInAppMessage, String str) {
        if (uInAppMessage == null) {
            m15221b("KEY_LAST_CARD_ID_".concat(String.valueOf(str)), "");
        } else if (uInAppMessage.getRaw() != null) {
            m15221b("KEY_LAST_CARD_ID_".concat(String.valueOf(str)), uInAppMessage.getRaw().toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        if (r1 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003a, code lost:
    
        if (r1 == null) goto L18;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList<com.umeng.message.proguard.C3560af> m15219b() {
        /*
            r9 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            android.content.Context r2 = r9.f15796b     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L36
            android.content.ContentResolver r3 = r2.getContentResolver()     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L36
            android.content.Context r2 = r9.f15796b     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L36
            android.net.Uri r4 = com.umeng.message.proguard.C3682h.m15771e(r2)     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L36
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r1 = r3.query(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L36
            if (r1 == 0) goto L21
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L36
            goto L22
        L21:
            r2 = 0
        L22:
            if (r2 == 0) goto L31
            com.umeng.message.proguard.af r2 = new com.umeng.message.proguard.af     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L36
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L36
            r0.add(r2)     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L36
            boolean r2 = r1.moveToNext()     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L36
            goto L22
        L31:
            if (r1 == 0) goto L3f
            goto L3c
        L34:
            r0 = move-exception
            goto L40
        L36:
            r2 = move-exception
            r2.printStackTrace()     // Catch: java.lang.Throwable -> L34
            if (r1 == 0) goto L3f
        L3c:
            r1.close()
        L3f:
            return r0
        L40:
            if (r1 == 0) goto L45
            r1.close()
        L45:
            goto L47
        L46:
            throw r0
        L47:
            goto L46
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.message.inapp.InAppMessageManager.m15219b():java.util.ArrayList");
    }

    /* renamed from: a */
    public final String m15213a(String str) {
        return m15214a("KEY_LAST_CARD_ID_".concat(String.valueOf(str)), "");
    }

    /* renamed from: a */
    public final void m15218a(String str, int i10) {
        if (i10 == 0) {
            m15221b(str, MessageService.MSG_DB_READY_REPORT);
        }
        if (i10 == 1) {
            m15221b(str, String.valueOf(m15211d(str) + 1));
        }
    }

    /* renamed from: a */
    public final String m15214a(String str, String str2) {
        return this.f15799h.m15401b(str, str2);
    }

    /* renamed from: a */
    public final void m15217a(final File file) {
        C3581b.m15378c(new Runnable() { // from class: com.umeng.message.inapp.InAppMessageManager.3
            @Override // java.lang.Runnable
            public final void run() {
                File file2 = file;
                if (file2 != null && file2.exists() && file.canWrite() && file.isDirectory()) {
                    for (File file3 : file.listFiles()) {
                        if (!file3.isDirectory()) {
                            file3.delete();
                        }
                    }
                    file.delete();
                }
            }
        });
    }

    /* renamed from: a */
    static /* synthetic */ C3560af m15208a(InAppMessageManager inAppMessageManager, String str) {
        Cursor query = inAppMessageManager.f15796b.getContentResolver().query(C3682h.m15771e(inAppMessageManager.f15796b), null, "MsgId=?", new String[]{str}, null);
        C3560af c3560af = query != null ? query.moveToFirst() : false ? new C3560af(query) : null;
        if (query != null) {
            query.close();
        }
        return c3560af;
    }

    /* renamed from: b */
    public final void m15221b(final String str, final String str2) {
        C3581b.m15378c(new Runnable() { // from class: com.umeng.message.inapp.InAppMessageManager.2
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    InAppMessageManager.this.f15799h.m15396a(str, str2);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        });
    }
}
