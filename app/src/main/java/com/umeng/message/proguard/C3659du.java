package com.umeng.message.proguard;

import android.content.ContentValues;
import android.content.Context;
import android.text.TextUtils;
import java.util.HashSet;
import java.util.Set;
import org.android.agoo.message.MessageService;
import org.json.JSONArray;

/* renamed from: com.umeng.message.proguard.du */
/* loaded from: classes3.dex */
public final class C3659du {

    /* renamed from: a */
    private final String f16444a;

    public C3659du(String str) {
        if (!TextUtils.isEmpty(str)) {
            str = str + "_";
        }
        this.f16444a = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0057, code lost:
    
        if (0 == 0) goto L25;
     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String m15689d(java.lang.String r8, java.lang.String r9) {
        /*
            r0 = 0
            android.content.Context r1 = com.umeng.message.proguard.C3643de.m15638a()     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L53
            boolean r2 = com.umeng.message.proguard.C3663dy.m15711a(r1)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L53
            if (r2 == 0) goto L14
            com.umeng.message.proguard.ds r1 = com.umeng.message.proguard.C3657ds.m15679a()     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L53
            java.lang.String r8 = r1.m15681b(r8, r9)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L53
            return r8
        L14:
            java.lang.String[] r5 = new java.lang.String[]{r8}     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L53
            android.content.ContentResolver r2 = r1.getContentResolver()     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L53
            android.net.Uri r3 = com.umeng.message.proguard.C3635cy.m15591a(r1)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L53
            r4 = 0
            r6 = 0
            r7 = 0
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r6
            r6 = r7
            android.database.Cursor r0 = r1.query(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L53
            if (r0 != 0) goto L3c
            com.umeng.message.proguard.ds r1 = com.umeng.message.proguard.C3657ds.m15679a()     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L53
            java.lang.String r8 = r1.m15681b(r8, r9)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L53
            if (r0 == 0) goto L3b
            r0.close()     // Catch: java.lang.Throwable -> L3b
        L3b:
            return r8
        L3c:
            boolean r8 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L53
            if (r8 == 0) goto L4d
            java.lang.String r8 = "v"
            int r8 = r0.getColumnIndex(r8)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L53
            java.lang.String r8 = r0.getString(r8)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L53
            r9 = r8
        L4d:
            r0.close()     // Catch: java.lang.Throwable -> L5a
            goto L5a
        L51:
            r8 = move-exception
            goto L5b
        L53:
            r8 = move-exception
            r8.printStackTrace()     // Catch: java.lang.Throwable -> L51
            if (r0 == 0) goto L5a
            goto L4d
        L5a:
            return r9
        L5b:
            if (r0 == 0) goto L60
            r0.close()     // Catch: java.lang.Throwable -> L60
        L60:
            goto L62
        L61:
            throw r8
        L62:
            goto L61
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.message.proguard.C3659du.m15689d(java.lang.String, java.lang.String):java.lang.String");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final String m15690a(String str) {
        return this.f16444a + str;
    }

    /* renamed from: b */
    public final int m15696b(String str) {
        try {
            return Integer.parseInt(m15689d(m15690a(str), MessageService.MSG_DB_READY_REPORT));
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: c */
    public final boolean m15699c(String str) {
        try {
            return Boolean.parseBoolean(m15689d(m15690a(str), "false"));
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final void m15692a(String str, int i10) {
        m15688c(m15690a(str), String.valueOf(i10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static void m15688c(String str, String str2) {
        try {
            Context m15638a = C3643de.m15638a();
            if (C3663dy.m15711a(m15638a)) {
                C3657ds.m15679a().m15680a(str, str2);
                return;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("k", str);
            contentValues.put("v", str2);
            try {
                m15638a.getContentResolver().insert(C3635cy.m15591a(m15638a), contentValues);
            } catch (Throwable unused) {
                C3657ds.m15679a().m15680a(str, str2);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public final void m15693a(String str, long j10) {
        m15688c(m15690a(str), String.valueOf(j10));
    }

    /* renamed from: b */
    public final long m15697b(String str, long j10) {
        try {
            return Long.parseLong(m15689d(m15690a(str), String.valueOf(j10)));
        } catch (Exception unused) {
            return j10;
        }
    }

    /* renamed from: a */
    public final void m15694a(String str, String str2) {
        m15688c(m15690a(str), String.valueOf(str2));
    }

    /* renamed from: a */
    public final void m15695a(String str, boolean z10) {
        m15688c(m15690a(str), String.valueOf(z10));
    }

    /* renamed from: b */
    public final String m15698b(String str, String str2) {
        return m15689d(m15690a(str), String.valueOf(str2));
    }

    /* renamed from: a */
    public final Set<String> m15691a(String str, Set<String> set) {
        try {
            String m15689d = m15689d(m15690a(str), "");
            HashSet hashSet = new HashSet();
            JSONArray jSONArray = new JSONArray(m15689d);
            int length = jSONArray.length();
            if (length > 0) {
                for (int i10 = 0; i10 < length; i10++) {
                    hashSet.add(jSONArray.optString(i10));
                }
            }
            return hashSet;
        } catch (Throwable unused) {
            return set;
        }
    }
}
