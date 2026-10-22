package com.umeng.analytics.pro;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import com.umeng.analytics.pro.C3385g;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.umeng.analytics.pro.h */
/* loaded from: classes3.dex */
public class C3386h extends SQLiteOpenHelper {

    /* renamed from: b */
    private static Context f14699b;

    /* renamed from: a */
    private String f14700a;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.umeng.analytics.pro.h$a */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a */
        private static final C3386h f14701a = new C3386h(C3386h.f14699b, C3388j.m14258b(C3386h.f14699b), C3385g.f14633b, null, 2);

        private a() {
        }
    }

    /* renamed from: a */
    public static C3386h m14237a(Context context) {
        if (f14699b == null) {
            f14699b = context.getApplicationContext();
        }
        return a.f14701a;
    }

    /* renamed from: c */
    private void m14242c(SQLiteDatabase sQLiteDatabase) {
        try {
            this.f14700a = "create table if not exists __sd(id INTEGER primary key autoincrement, __ii TEXT unique, __a TEXT, __b TEXT, __c TEXT, __d TEXT, __e TEXT, __f TEXT, __g TEXT, __sp TEXT, __pp TEXT, __av TEXT, __vc TEXT)";
            sQLiteDatabase.execSQL("create table if not exists __sd(id INTEGER primary key autoincrement, __ii TEXT unique, __a TEXT, __b TEXT, __c TEXT, __d TEXT, __e TEXT, __f TEXT, __g TEXT, __sp TEXT, __pp TEXT, __av TEXT, __vc TEXT)");
        } catch (SQLException unused) {
        }
    }

    /* renamed from: d */
    private void m14243d(SQLiteDatabase sQLiteDatabase) {
        try {
            this.f14700a = "create table if not exists __is(id INTEGER primary key autoincrement, __ii TEXT unique, __e TEXT, __sp TEXT, __pp TEXT, __av TEXT, __vc TEXT)";
            sQLiteDatabase.execSQL("create table if not exists __is(id INTEGER primary key autoincrement, __ii TEXT unique, __e TEXT, __sp TEXT, __pp TEXT, __av TEXT, __vc TEXT)");
        } catch (SQLException unused) {
        }
    }

    /* renamed from: e */
    private void m14244e(SQLiteDatabase sQLiteDatabase) {
        if (!C3388j.m14256a(sQLiteDatabase, C3385g.d.f14674a, "__av")) {
            C3388j.m14255a(sQLiteDatabase, C3385g.d.f14674a, "__sp", "TEXT");
            C3388j.m14255a(sQLiteDatabase, C3385g.d.f14674a, "__pp", "TEXT");
            C3388j.m14255a(sQLiteDatabase, C3385g.d.f14674a, "__av", "TEXT");
            C3388j.m14255a(sQLiteDatabase, C3385g.d.f14674a, "__vc", "TEXT");
        }
        if (!C3388j.m14256a(sQLiteDatabase, C3385g.b.f14648a, "__av")) {
            C3388j.m14255a(sQLiteDatabase, C3385g.b.f14648a, "__av", "TEXT");
            C3388j.m14255a(sQLiteDatabase, C3385g.b.f14648a, "__vc", "TEXT");
        }
        if (!C3388j.m14256a(sQLiteDatabase, C3385g.a.f14637a, "__av")) {
            C3388j.m14255a(sQLiteDatabase, C3385g.a.f14637a, "__av", "TEXT");
            C3388j.m14255a(sQLiteDatabase, C3385g.a.f14637a, "__vc", "TEXT");
        }
    }

    /* renamed from: f */
    private void m14245f(SQLiteDatabase sQLiteDatabase) {
        m14239a(sQLiteDatabase, C3385g.d.f14674a);
        m14239a(sQLiteDatabase, C3385g.b.f14648a);
        m14239a(sQLiteDatabase, C3385g.a.f14637a);
        m14246a();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            try {
                sQLiteDatabase.beginTransaction();
                m14242c(sQLiteDatabase);
                m14243d(sQLiteDatabase);
                m14241b(sQLiteDatabase);
                m14238a(sQLiteDatabase);
                sQLiteDatabase.setTransactionSuccessful();
            } catch (Throwable th) {
                if (sQLiteDatabase != null) {
                    try {
                        sQLiteDatabase.endTransaction();
                    } catch (Throwable unused) {
                    }
                }
                throw th;
            }
        } catch (SQLiteDatabaseCorruptException unused2) {
            C3388j.m14254a(f14699b);
            if (sQLiteDatabase == null) {
                return;
            }
        } catch (Throwable unused3) {
            if (sQLiteDatabase == null) {
                return;
            }
        }
        try {
            sQLiteDatabase.endTransaction();
        } catch (Throwable unused4) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        if (i11 > i10 && i10 == 1) {
            try {
                try {
                    m14244e(sQLiteDatabase);
                } catch (Exception unused) {
                    m14245f(sQLiteDatabase);
                }
            } catch (Exception unused2) {
                m14244e(sQLiteDatabase);
            }
        }
    }

    private C3386h(Context context, String str, String str2, SQLiteDatabase.CursorFactory cursorFactory, int i10) {
        this(new C3383e(context, str), str2, cursorFactory, i10);
    }

    /* renamed from: b */
    private void m14241b(SQLiteDatabase sQLiteDatabase) {
        try {
            this.f14700a = "create table if not exists __et(id INTEGER primary key autoincrement, __i TEXT, __e TEXT, __s TEXT, __t INTEGER, __av TEXT, __vc TEXT)";
            sQLiteDatabase.execSQL("create table if not exists __et(id INTEGER primary key autoincrement, __i TEXT, __e TEXT, __s TEXT, __t INTEGER, __av TEXT, __vc TEXT)");
        } catch (SQLException unused) {
        }
    }

    private C3386h(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i10) {
        super(context, TextUtils.isEmpty(str) ? C3385g.f14633b : str, cursorFactory, i10);
        this.f14700a = null;
        m14246a();
    }

    /* renamed from: a */
    public void m14246a() {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (!C3388j.m14257a(C3385g.d.f14674a, writableDatabase)) {
                m14242c(writableDatabase);
            }
            if (!C3388j.m14257a(C3385g.c.f14661a, writableDatabase)) {
                m14243d(writableDatabase);
            }
            if (!C3388j.m14257a(C3385g.b.f14648a, writableDatabase)) {
                m14241b(writableDatabase);
            }
            if (C3388j.m14257a(C3385g.a.f14637a, writableDatabase)) {
                return;
            }
            m14238a(writableDatabase);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private void m14238a(SQLiteDatabase sQLiteDatabase) {
        try {
            this.f14700a = "create table if not exists __er(id INTEGER primary key autoincrement, __i TEXT, __a TEXT, __t INTEGER, __av TEXT, __vc TEXT)";
            sQLiteDatabase.execSQL("create table if not exists __er(id INTEGER primary key autoincrement, __i TEXT, __a TEXT, __t INTEGER, __av TEXT, __vc TEXT)");
        } catch (SQLException unused) {
        }
    }

    /* renamed from: a */
    private void m14239a(SQLiteDatabase sQLiteDatabase, String str) {
        try {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str);
        } catch (SQLException unused) {
        }
    }
}
