package org.repackage.com.meizu.flyme.openidsdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.text.TextUtils;
import android.util.Log;
import com.taobao.accs.common.Constants;

/* renamed from: org.repackage.com.meizu.flyme.openidsdk.b */
/* loaded from: classes3.dex */
class C6072b {

    /* renamed from: e */
    private static volatile C6072b f23862e;

    /* renamed from: f */
    private static boolean f23863f;

    /* renamed from: h */
    private BroadcastReceiver f23869h;

    /* renamed from: a */
    OpenId f23864a = new OpenId("udid");

    /* renamed from: b */
    OpenId f23865b = new OpenId("oaid");

    /* renamed from: d */
    OpenId f23867d = new OpenId("vaid");

    /* renamed from: c */
    OpenId f23866c = new OpenId("aaid");

    /* renamed from: g */
    private SupportInfo f23868g = new SupportInfo();

    private C6072b() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0095  */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String m24254b(android.content.Context r10, org.repackage.com.meizu.flyme.openidsdk.OpenId r11) {
        /*
            r9 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "queryId : "
            r0.<init>(r1)
            java.lang.String r1 = r11.f23853c
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            m24251a(r0)
            java.lang.String r0 = "content://com.meizu.flyme.openidsdk/"
            android.net.Uri r2 = android.net.Uri.parse(r0)
            r0 = 0
            android.content.ContentResolver r1 = r10.getContentResolver()     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La2
            r3 = 0
            r4 = 0
            r7 = 1
            java.lang.String[] r5 = new java.lang.String[r7]     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La2
            java.lang.String r6 = r11.f23853c     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La2
            r8 = 0
            r5[r8] = r6     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La2
            r6 = 0
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La2
            if (r1 == 0) goto L7e
            org.repackage.com.meizu.flyme.openidsdk.ValueData r2 = m24249a(r1)     // Catch: java.lang.Throwable -> L99 java.lang.Exception -> L9c
            java.lang.String r0 = r2.f23859a     // Catch: java.lang.Throwable -> L99 java.lang.Exception -> L9c
            r11.m24234a(r0)     // Catch: java.lang.Throwable -> L99 java.lang.Exception -> L9c
            long r3 = r2.f23861c     // Catch: java.lang.Throwable -> L99 java.lang.Exception -> L9c
            r11.m24233a(r3)     // Catch: java.lang.Throwable -> L99 java.lang.Exception -> L9c
            int r3 = r2.f23860b     // Catch: java.lang.Throwable -> L99 java.lang.Exception -> L9c
            r11.m24232a(r3)     // Catch: java.lang.Throwable -> L99 java.lang.Exception -> L9c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L99 java.lang.Exception -> L9c
            r3.<init>()     // Catch: java.lang.Throwable -> L99 java.lang.Exception -> L9c
            java.lang.String r4 = r11.f23853c     // Catch: java.lang.Throwable -> L99 java.lang.Exception -> L9c
            r3.append(r4)     // Catch: java.lang.Throwable -> L99 java.lang.Exception -> L9c
            java.lang.String r4 = " errorCode : "
            r3.append(r4)     // Catch: java.lang.Throwable -> L99 java.lang.Exception -> L9c
            int r11 = r11.f23854d     // Catch: java.lang.Throwable -> L99 java.lang.Exception -> L9c
            r3.append(r11)     // Catch: java.lang.Throwable -> L99 java.lang.Exception -> L9c
            java.lang.String r11 = r3.toString()     // Catch: java.lang.Throwable -> L99 java.lang.Exception -> L9c
            m24251a(r11)     // Catch: java.lang.Throwable -> L99 java.lang.Exception -> L9c
            int r11 = r2.f23860b     // Catch: java.lang.Throwable -> L99 java.lang.Exception -> L9c
            r2 = 1000(0x3e8, float:1.401E-42)
            if (r11 == r2) goto L93
            r9.m24256b(r10)     // Catch: java.lang.Throwable -> L99 java.lang.Exception -> L9c
            boolean r11 = r9.m24258a(r10, r8)     // Catch: java.lang.Throwable -> L99 java.lang.Exception -> L9c
            if (r11 != 0) goto L93
            boolean r10 = r9.m24258a(r10, r7)     // Catch: java.lang.Throwable -> L99 java.lang.Exception -> L9c
            java.lang.String r11 = "not support, forceQuery isSupported: "
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch: java.lang.Throwable -> L99 java.lang.Exception -> L9c
            java.lang.String r10 = r11.concat(r10)     // Catch: java.lang.Throwable -> L99 java.lang.Exception -> L9c
        L7a:
            m24251a(r10)     // Catch: java.lang.Throwable -> L99 java.lang.Exception -> L9c
            goto L93
        L7e:
            boolean r11 = r9.m24258a(r10, r8)     // Catch: java.lang.Throwable -> L99 java.lang.Exception -> L9c
            if (r11 == 0) goto L93
            boolean r10 = r9.m24258a(r10, r7)     // Catch: java.lang.Throwable -> L99 java.lang.Exception -> L9c
            java.lang.String r11 = "forceQuery isSupported : "
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch: java.lang.Throwable -> L99 java.lang.Exception -> L9c
            java.lang.String r10 = r11.concat(r10)     // Catch: java.lang.Throwable -> L99 java.lang.Exception -> L9c
            goto L7a
        L93:
            if (r1 == 0) goto Lbf
            r1.close()
            goto Lbf
        L99:
            r10 = move-exception
            r0 = r1
            goto Lc0
        L9c:
            r10 = move-exception
            r11 = r0
            r0 = r1
            goto La4
        La0:
            r10 = move-exception
            goto Lc0
        La2:
            r10 = move-exception
            r11 = r0
        La4:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La0
            java.lang.String r2 = "queryId, Exception : "
            r1.<init>(r2)     // Catch: java.lang.Throwable -> La0
            java.lang.String r10 = r10.getMessage()     // Catch: java.lang.Throwable -> La0
            r1.append(r10)     // Catch: java.lang.Throwable -> La0
            java.lang.String r10 = r1.toString()     // Catch: java.lang.Throwable -> La0
            m24251a(r10)     // Catch: java.lang.Throwable -> La0
            if (r0 == 0) goto Lbe
            r0.close()
        Lbe:
            r0 = r11
        Lbf:
            return r0
        Lc0:
            if (r0 == 0) goto Lc5
            r0.close()
        Lc5:
            goto Lc7
        Lc6:
            throw r10
        Lc7:
            goto Lc6
        */
        throw new UnsupportedOperationException("Method not decompiled: org.repackage.com.meizu.flyme.openidsdk.C6072b.m24254b(android.content.Context, org.repackage.com.meizu.flyme.openidsdk.OpenId):java.lang.String");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final String m24257a(Context context, OpenId openId) {
        String str;
        if (openId == null) {
            str = "getId, openId = null.";
        } else {
            if (openId.m24235a()) {
                return openId.f23852b;
            }
            if (m24258a(context, true)) {
                return m24254b(context, openId);
            }
            str = "getId, isSupported = false.";
        }
        m24251a(str);
        return null;
    }

    /* renamed from: a */
    private static String m24248a(PackageManager packageManager, String str) {
        ProviderInfo resolveContentProvider;
        if (packageManager == null || (resolveContentProvider = packageManager.resolveContentProvider(str, 0)) == null || (resolveContentProvider.applicationInfo.flags & 1) == 0) {
            return null;
        }
        return resolveContentProvider.packageName;
    }

    /* renamed from: b */
    private static String m24255b(PackageManager packageManager, String str) {
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
            if (packageInfo != null) {
                return packageInfo.versionName;
            }
            return null;
        } catch (Exception e10) {
            e10.printStackTrace();
            m24251a("getAppVersion, Exception : " + e10.getMessage());
            return null;
        }
    }

    /* renamed from: a */
    private static ValueData m24249a(Cursor cursor) {
        String str;
        ValueData valueData = new ValueData(null, 0);
        if (cursor == null) {
            str = "parseValue fail, cursor is null.";
        } else {
            if (!cursor.isClosed()) {
                cursor.moveToFirst();
                int columnIndex = cursor.getColumnIndex("value");
                if (columnIndex >= 0) {
                    valueData.f23859a = cursor.getString(columnIndex);
                } else {
                    m24251a("parseValue fail, index < 0.");
                }
                int columnIndex2 = cursor.getColumnIndex(Constants.KEY_HTTP_CODE);
                if (columnIndex2 >= 0) {
                    valueData.f23860b = cursor.getInt(columnIndex2);
                } else {
                    m24251a("parseCode fail, index < 0.");
                }
                int columnIndex3 = cursor.getColumnIndex("expired");
                if (columnIndex3 >= 0) {
                    valueData.f23861c = cursor.getLong(columnIndex3);
                } else {
                    m24251a("parseExpired fail, index < 0.");
                }
                return valueData;
            }
            str = "parseValue fail, cursor is closed.";
        }
        m24251a(str);
        return valueData;
    }

    /* renamed from: b */
    private synchronized void m24256b(Context context) {
        if (this.f23869h != null) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.meizu.flyme.openid.ACTION_OPEN_ID_CHANGE");
        C6071a c6071a = new C6071a();
        this.f23869h = c6071a;
        context.registerReceiver(c6071a, intentFilter, "com.meizu.flyme.openid.permission.OPEN_ID_CHANGE", null);
    }

    /* renamed from: a */
    public static final C6072b m24250a() {
        if (f23862e == null) {
            synchronized (C6072b.class) {
                if (f23862e == null) {
                    f23862e = new C6072b();
                }
            }
        }
        return f23862e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m24251a(String str) {
        if (f23863f) {
            Log.d("OpenIdManager", str);
        }
    }

    /* renamed from: a */
    public static void m24252a(boolean z10) {
        f23863f = z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0058, code lost:
    
        if (r7 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0033, code lost:
    
        if (org.android.agoo.message.MessageService.MSG_DB_READY_REPORT.equals(r1.f23859a) != false) goto L9;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean m24253a(android.content.Context r8) {
        /*
            java.lang.String r0 = "querySupport version : 1.0.8"
            m24251a(r0)
            java.lang.String r0 = "content://com.meizu.flyme.openidsdk/"
            android.net.Uri r2 = android.net.Uri.parse(r0)
            r0 = 0
            r7 = 0
            android.content.ContentResolver r1 = r8.getContentResolver()     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L42
            r3 = 0
            r4 = 0
            r8 = 1
            java.lang.String[] r5 = new java.lang.String[r8]     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L42
            java.lang.String r6 = "supported"
            r5[r0] = r6     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L42
            r6 = 0
            android.database.Cursor r7 = r1.query(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L42
            if (r7 == 0) goto L3a
            org.repackage.com.meizu.flyme.openidsdk.ValueData r1 = m24249a(r7)     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L42
            int r2 = r1.f23860b     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L42
            r3 = 1000(0x3e8, float:1.401E-42)
            if (r3 != r2) goto L35
            java.lang.String r2 = "0"
            java.lang.String r1 = r1.f23859a     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L42
            boolean r1 = r2.equals(r1)     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L42
            if (r1 == 0) goto L36
        L35:
            r0 = 1
        L36:
            r7.close()
            return r0
        L3a:
            if (r7 == 0) goto L5b
        L3c:
            r7.close()
            goto L5b
        L40:
            r8 = move-exception
            goto L5c
        L42:
            r8 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L40
            java.lang.String r2 = "querySupport, Exception : "
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L40
            java.lang.String r8 = r8.getMessage()     // Catch: java.lang.Throwable -> L40
            r1.append(r8)     // Catch: java.lang.Throwable -> L40
            java.lang.String r8 = r1.toString()     // Catch: java.lang.Throwable -> L40
            m24251a(r8)     // Catch: java.lang.Throwable -> L40
            if (r7 == 0) goto L5b
            goto L3c
        L5b:
            return r0
        L5c:
            if (r7 == 0) goto L61
            r7.close()
        L61:
            goto L63
        L62:
            throw r8
        L63:
            goto L62
        */
        throw new UnsupportedOperationException("Method not decompiled: org.repackage.com.meizu.flyme.openidsdk.C6072b.m24253a(android.content.Context):boolean");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean m24258a(Context context, boolean z10) {
        if (this.f23868g.m24244a() && !z10) {
            return this.f23868g.m24247b();
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return false;
        }
        String m24248a = m24248a(packageManager, "com.meizu.flyme.openidsdk");
        if (TextUtils.isEmpty(m24248a)) {
            return false;
        }
        String m24255b = m24255b(packageManager, m24248a);
        if (this.f23868g.m24244a() && this.f23868g.m24245a(m24255b)) {
            m24251a("use same version cache, safeVersion : ".concat(String.valueOf(m24255b)));
            return this.f23868g.m24247b();
        }
        this.f23868g.m24246b(m24255b);
        boolean m24253a = m24253a(context);
        m24251a("query support, result : ".concat(String.valueOf(m24253a)));
        this.f23868g.m24243a(m24253a);
        return m24253a;
    }
}
