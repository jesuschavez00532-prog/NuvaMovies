package com.umeng.analytics.pro;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteOpenHelper;
import com.umeng.commonsdk.debug.UMRTLog;

/* renamed from: com.umeng.analytics.pro.bv */
/* loaded from: classes3.dex */
public class C3327bv extends SQLiteOpenHelper {

    /* renamed from: b */
    private static final Object f14329b = new Object();

    /* renamed from: c */
    private static C3327bv f14330c = null;

    /* renamed from: d */
    private static final String f14331d = "CREATE TABLE IF NOT EXISTS stf(_id INTEGER PRIMARY KEY AUTOINCREMENT, _tp TEXT, _hd TEXT, _bd TEXT, _ts TEXT, _uuid TEXT, _re1 TEXT, _re2 TEXT)";

    /* renamed from: e */
    private static final String f14332e = "DROP TABLE IF EXISTS stf";

    /* renamed from: f */
    private static final String f14333f = "DELETE FROM stf WHERE _id IN( SELECT _id FROM stf ORDER BY _id LIMIT 1)";

    /* renamed from: a */
    private final Context f14334a;

    private C3327bv(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i10) {
        super(context, str, cursorFactory, i10);
        this.f14334a = context;
    }

    /* renamed from: a */
    public static final int m13984a() {
        return 1;
    }

    /* renamed from: b */
    private void m13987b(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL(f14331d);
        } catch (SQLiteDatabaseCorruptException unused) {
            m13986a(sQLiteDatabase);
        } catch (Throwable th) {
            UMRTLog.m14568e(UMRTLog.RTLOG_TAG, "--->>> [有状态]创建二级缓存数据库失败: " + th.getMessage());
        }
    }

    /* renamed from: d */
    private void m13988d() {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (writableDatabase != null && writableDatabase.isOpen()) {
                try {
                    writableDatabase.execSQL(f14333f);
                } catch (Throwable unused) {
                }
                writableDatabase.close();
            }
        } catch (Throwable unused2) {
        }
    }

    /* renamed from: c */
    public boolean m13996c() {
        if (!m13995b(C3329bx.f14343c)) {
            return true;
        }
        return false;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        m13987b(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }

    /* renamed from: a */
    public static C3327bv m13985a(Context context) {
        C3327bv c3327bv;
        synchronized (f14329b) {
            if (f14330c == null) {
                f14330c = new C3327bv(context, C3329bx.f14342b, null, 1);
            }
            c3327bv = f14330c;
        }
        return c3327bv;
    }

    /* renamed from: b */
    public void m13994b() {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (writableDatabase == null || !writableDatabase.isOpen()) {
                return;
            }
            writableDatabase.close();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private void m13986a(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL(f14332e);
            sQLiteDatabase.execSQL(f14331d);
        } catch (SQLException unused) {
        }
    }

    /* renamed from: b */
    public boolean m13995b(String str) {
        SQLiteDatabase sQLiteDatabase;
        Cursor cursor = null;
        try {
            sQLiteDatabase = getWritableDatabase();
            if (sQLiteDatabase != null) {
                try {
                    if (sQLiteDatabase.isOpen()) {
                        cursor = sQLiteDatabase.query(str, null, null, null, null, null, null, null);
                    }
                } catch (Throwable unused) {
                    if (cursor != null) {
                        cursor.close();
                    }
                    if (sQLiteDatabase == null) {
                        return false;
                    }
                    sQLiteDatabase.close();
                    return false;
                }
            }
            if (cursor != null) {
                if (cursor.getCount() > 0) {
                    cursor.close();
                    if (sQLiteDatabase == null) {
                        return true;
                    }
                    sQLiteDatabase.close();
                    return true;
                }
            }
            if (cursor != null) {
                cursor.close();
            }
            if (sQLiteDatabase == null) {
                return false;
            }
        } catch (Throwable unused2) {
            sQLiteDatabase = null;
        }
        sQLiteDatabase.close();
        return false;
    }

    /* renamed from: a */
    public void m13991a(String str, ContentValues contentValues) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (writableDatabase == null || !writableDatabase.isOpen()) {
                return;
            }
            try {
                writableDatabase.beginTransaction();
                writableDatabase.insert(str, null, contentValues);
                writableDatabase.setTransactionSuccessful();
                UMRTLog.m14568e(UMRTLog.RTLOG_TAG, "--->>> [有状态]插入二级缓存数据记录 成功。");
            } catch (Throwable unused) {
            }
            writableDatabase.endTransaction();
            writableDatabase.close();
        } catch (Throwable unused2) {
        }
    }

    /* renamed from: a */
    public void m13993a(String str, String str2, String[] strArr) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (writableDatabase == null || !writableDatabase.isOpen()) {
                return;
            }
            try {
                writableDatabase.beginTransaction();
                writableDatabase.delete(str, str2, strArr);
                writableDatabase.setTransactionSuccessful();
            } catch (Throwable unused) {
            }
            writableDatabase.endTransaction();
            writableDatabase.close();
        } catch (Throwable unused2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0087  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.umeng.analytics.pro.C3328bw m13990a(java.lang.String r19) {
        /*
            r18 = this;
            r10 = r18
            r0 = 6
            java.lang.String[] r3 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L8b
            java.lang.String r0 = "_uuid"
            r12 = 0
            r3[r12] = r0     // Catch: java.lang.Throwable -> L8b
            java.lang.String r0 = "_tp"
            r13 = 1
            r3[r13] = r0     // Catch: java.lang.Throwable -> L8b
            java.lang.String r0 = "_hd"
            r14 = 2
            r3[r14] = r0     // Catch: java.lang.Throwable -> L8b
            java.lang.String r0 = "_bd"
            r15 = 3
            r3[r15] = r0     // Catch: java.lang.Throwable -> L8b
            java.lang.String r0 = "_re1"
            r9 = 4
            r3[r9] = r0     // Catch: java.lang.Throwable -> L8b
            java.lang.String r0 = "_re2"
            r8 = 5
            r3[r8] = r0     // Catch: java.lang.Throwable -> L8b
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r0 = 0
            java.lang.String r16 = "1"
            r1 = r18
            r2 = r19
            r11 = 5
            r8 = r0
            r0 = 4
            r9 = r16
            android.database.Cursor r1 = r1.m13989a(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L8b
            if (r1 == 0) goto L84
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L82
            if (r2 == 0) goto L84
            com.umeng.analytics.pro.bw r2 = new com.umeng.analytics.pro.bw     // Catch: java.lang.Throwable -> L82
            r2.<init>()     // Catch: java.lang.Throwable -> L82
            java.lang.String r3 = r1.getString(r12)     // Catch: java.lang.Throwable -> L7e
            r2.f14335a = r3     // Catch: java.lang.Throwable -> L7e
            java.lang.String r3 = r1.getString(r13)     // Catch: java.lang.Throwable -> L7e
            r2.f14336b = r3     // Catch: java.lang.Throwable -> L7e
            java.lang.String r3 = r1.getString(r14)     // Catch: java.lang.Throwable -> L7e
            java.lang.String r4 = r1.getString(r15)     // Catch: java.lang.Throwable -> L7e
            android.content.Context r5 = r10.f14334a     // Catch: java.lang.Throwable -> L7e
            com.umeng.analytics.pro.k r5 = com.umeng.analytics.pro.C3389k.m14262a(r5)     // Catch: java.lang.Throwable -> L7e
            java.lang.String r3 = r5.m14288d(r3)     // Catch: java.lang.Throwable -> L7e
            r2.f14337c = r3     // Catch: java.lang.Throwable -> L7e
            android.content.Context r3 = r10.f14334a     // Catch: java.lang.Throwable -> L7e
            com.umeng.analytics.pro.k r3 = com.umeng.analytics.pro.C3389k.m14262a(r3)     // Catch: java.lang.Throwable -> L7e
            java.lang.String r3 = r3.m14288d(r4)     // Catch: java.lang.Throwable -> L7e
            r2.f14338d = r3     // Catch: java.lang.Throwable -> L7e
            java.lang.String r0 = r1.getString(r0)     // Catch: java.lang.Throwable -> L7e
            r2.f14339e = r0     // Catch: java.lang.Throwable -> L7e
            java.lang.String r0 = r1.getString(r11)     // Catch: java.lang.Throwable -> L7e
            r2.f14340f = r0     // Catch: java.lang.Throwable -> L7e
            r11 = r2
            goto L85
        L7e:
            r11 = r1
            r17 = r2
            goto L8e
        L82:
            r11 = r1
            goto L8c
        L84:
            r11 = 0
        L85:
            if (r1 == 0) goto L98
            r1.close()
            goto L98
        L8b:
            r11 = 0
        L8c:
            r17 = 0
        L8e:
            r18.m13988d()     // Catch: java.lang.Throwable -> L99
            if (r11 == 0) goto L96
            r11.close()
        L96:
            r11 = r17
        L98:
            return r11
        L99:
            r0 = move-exception
            r1 = r0
            if (r11 == 0) goto La0
            r11.close()
        La0:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.C3327bv.m13990a(java.lang.String):com.umeng.analytics.pro.bw");
    }

    /* renamed from: a */
    public void m13992a(String str, String str2) {
        m13993a(str, "_uuid=?", new String[]{str2});
    }

    /* renamed from: a */
    public Cursor m13989a(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (writableDatabase == null || !writableDatabase.isOpen()) {
                return null;
            }
            return writableDatabase.query(str, strArr, str2, strArr2, str3, str4, str5, str6);
        } catch (Throwable unused) {
            return null;
        }
    }
}
