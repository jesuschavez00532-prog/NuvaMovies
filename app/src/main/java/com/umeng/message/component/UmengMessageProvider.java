package com.umeng.message.component;

import android.content.ContentProvider;
import android.content.ContentProviderOperation;
import android.content.ContentProviderResult;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import android.text.TextUtils;
import com.umeng.message.common.UPLog;
import com.umeng.message.proguard.C3585bc;
import com.umeng.message.proguard.C3682h;
import com.umeng.message.proguard.C3706y;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes3.dex */
public class UmengMessageProvider extends ContentProvider {

    /* renamed from: a */
    private final UriMatcher f15786a = new UriMatcher(-1);

    /* renamed from: b */
    private volatile C3537a f15787b;

    /* renamed from: c */
    private volatile C3538b f15788c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.umeng.message.component.UmengMessageProvider$a */
    /* loaded from: classes3.dex */
    public static class C3537a extends SQLiteOpenHelper {
        public C3537a(Context context) {
            super(context, "MessageStore.db", (SQLiteDatabase.CursorFactory) null, 5);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            try {
                sQLiteDatabase.execSQL(String.format("create table if not exists %s (time long, type varchar default NULL, alias varchar default NULL, exclusive int, ttl long, PRIMARY KEY(time))", "MsgAlias"));
            } catch (Throwable th) {
                UPLog.m15196e("MessageProvider", th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            try {
                if (UmengMessageProvider.m15204b(sQLiteDatabase, "MsgAlias")) {
                    sQLiteDatabase.execSQL("drop table MsgAlias");
                }
                onCreate(sQLiteDatabase);
            } catch (Throwable th) {
                UPLog.m15196e("MessageProvider", th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            if (i10 <= 3) {
                try {
                    if (UmengMessageProvider.m15204b(sQLiteDatabase, "MsgTemp")) {
                        sQLiteDatabase.execSQL("drop table MsgTemp");
                    }
                    if (UmengMessageProvider.m15204b(sQLiteDatabase, "MessageStore")) {
                        sQLiteDatabase.execSQL("drop table MessageStore");
                    }
                } catch (Throwable th) {
                    UPLog.m15196e("MessageProvider", th);
                    return;
                }
            }
            if (i10 <= 4 && UmengMessageProvider.m15204b(sQLiteDatabase, "MsgAlias")) {
                sQLiteDatabase.execSQL("drop table MsgAlias");
            }
            onCreate(sQLiteDatabase);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.umeng.message.component.UmengMessageProvider$b */
    /* loaded from: classes3.dex */
    public static class C3538b extends SQLiteOpenHelper {
        public C3538b(Context context) {
            super(context, "MsgLogStore.db", (SQLiteDatabase.CursorFactory) null, 8);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            try {
                sQLiteDatabase.execSQL(String.format("create table if not exists MsgLogStore (MsgId varchar, ActionType Integer, Time long, %s varchar, PRIMARY KEY(MsgId, ActionType))", "pa"));
                sQLiteDatabase.execSQL("create table if not exists InAppLogStore (Time long, MsgId varchar, MsgType Integer, NumDisplay Integer, NumOpenFull Integer, NumOpenTop Integer, NumOpenBottom Integer, NumClose Integer, NumDuration Integer, NumCustom Integer, PRIMARY KEY(Time))");
            } catch (Throwable th) {
                UPLog.m15196e("MessageProvider", th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            try {
                if (UmengMessageProvider.m15204b(sQLiteDatabase, "MsgLogStore")) {
                    sQLiteDatabase.execSQL("drop table MsgLogStore");
                }
                if (UmengMessageProvider.m15204b(sQLiteDatabase, "InAppLogStore")) {
                    sQLiteDatabase.execSQL("drop table InAppLogStore");
                }
                onCreate(sQLiteDatabase);
            } catch (Throwable th) {
                UPLog.m15196e("MessageProvider", th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            if (i10 <= 5) {
                try {
                    if (UmengMessageProvider.m15204b(sQLiteDatabase, "MsgLogStore")) {
                        sQLiteDatabase.execSQL(String.format("ALTER TABLE MsgLogStore ADD COLUMN %s varchar", "pa"));
                    }
                } catch (Throwable th) {
                    UPLog.m15196e("MessageProvider", th);
                    return;
                }
            }
            if (i10 <= 6 && UmengMessageProvider.m15204b(sQLiteDatabase, "InAppLogStore")) {
                sQLiteDatabase.execSQL(String.format("ALTER TABLE InAppLogStore ADD COLUMN %s Integer", "NumCustom"));
            }
            if (i10 <= 7) {
                if (UmengMessageProvider.m15204b(sQLiteDatabase, "MsgLogStoreForAgoo")) {
                    sQLiteDatabase.execSQL("drop table MsgLogStoreForAgoo");
                }
                if (UmengMessageProvider.m15204b(sQLiteDatabase, "MsgLogIdTypeStore")) {
                    sQLiteDatabase.execSQL("drop table MsgLogIdTypeStore");
                }
                if (UmengMessageProvider.m15204b(sQLiteDatabase, "MsgLogIdTypeStoreForAgoo")) {
                    sQLiteDatabase.execSQL("drop table MsgLogIdTypeStoreForAgoo");
                }
                if (UmengMessageProvider.m15204b(sQLiteDatabase, "MsgConfigInfo")) {
                    sQLiteDatabase.execSQL("drop table MsgConfigInfo");
                }
            }
            onCreate(sQLiteDatabase);
        }
    }

    /* renamed from: b */
    private C3538b m15203b() {
        if (this.f15788c == null) {
            synchronized (C3538b.class) {
                if (this.f15788c == null) {
                    this.f15788c = new C3538b(getContext());
                }
            }
        }
        return this.f15788c;
    }

    @Override // android.content.ContentProvider
    public ContentProviderResult[] applyBatch(ArrayList<ContentProviderOperation> arrayList) {
        SQLiteDatabase writableDatabase = m15203b().getWritableDatabase();
        try {
            if (writableDatabase == null) {
                return super.applyBatch(arrayList);
            }
            try {
                writableDatabase.beginTransaction();
                ContentProviderResult[] applyBatch = super.applyBatch(arrayList);
                writableDatabase.setTransactionSuccessful();
                return applyBatch;
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (Throwable unused) {
            return super.applyBatch(arrayList);
        }
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        SQLiteDatabase writableDatabase;
        try {
            int match = this.f15786a.match(uri);
            if (match != 2) {
                if (match != 3) {
                    if (match != 4) {
                        if (match != 5) {
                            if (match == 10 && (writableDatabase = m15203b().getWritableDatabase()) != null) {
                                return writableDatabase.delete("InAppLogStore", str, strArr);
                            }
                        } else {
                            SQLiteDatabase writableDatabase2 = m15203b().getWritableDatabase();
                            if (writableDatabase2 != null) {
                                return writableDatabase2.delete("MsgLogStore", str, strArr);
                            }
                        }
                    } else {
                        SQLiteDatabase writableDatabase3 = m15201a().getWritableDatabase();
                        if (writableDatabase3 != null) {
                            return writableDatabase3.delete("MsgAlias", null, null);
                        }
                    }
                } else {
                    SQLiteDatabase writableDatabase4 = m15201a().getWritableDatabase();
                    if (writableDatabase4 != null) {
                        return writableDatabase4.delete("MsgAlias", str, strArr);
                    }
                }
            } else if (strArr != null && strArr.length != 0) {
                C3585bc m15386a = C3585bc.m15386a();
                if (strArr.length == 0) {
                    return 0;
                }
                SharedPreferences.Editor edit = m15386a.f16055a.edit();
                int i10 = 0;
                for (String str2 : strArr) {
                    if (m15386a.f16055a.contains(str2)) {
                        edit.remove(str2);
                        i10++;
                    }
                }
                if (i10 > 0) {
                    edit.apply();
                }
                return i10;
            }
        } catch (Throwable th) {
            UPLog.m15196e("MessageProvider", th);
        }
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        int match = this.f15786a.match(uri);
        if (match != 2 && match != 3 && match != 5) {
            return null;
        }
        return "vnd.android.cursor.dir/vnd.umeng.message";
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        try {
            int match = this.f15786a.match(uri);
            if (match != 2) {
                if (match != 3) {
                    if (match != 5) {
                        if (match == 10) {
                            SQLiteDatabase writableDatabase = m15203b().getWritableDatabase();
                            if (writableDatabase == null) {
                                return null;
                            }
                            writableDatabase.insertWithOnConflict("InAppLogStore", null, contentValues, 5);
                        }
                    } else {
                        SQLiteDatabase writableDatabase2 = m15203b().getWritableDatabase();
                        if (writableDatabase2 == null) {
                            return null;
                        }
                        writableDatabase2.insertWithOnConflict("MsgLogStore", null, contentValues, 5);
                    }
                } else {
                    SQLiteDatabase writableDatabase3 = m15201a().getWritableDatabase();
                    if (writableDatabase3 == null) {
                        return null;
                    }
                    writableDatabase3.insertWithOnConflict("MsgAlias", null, contentValues, 5);
                }
            } else {
                if (contentValues == null) {
                    return null;
                }
                String asString = contentValues.getAsString("k");
                String asString2 = contentValues.getAsString("v");
                if (!TextUtils.isEmpty(asString)) {
                    C3585bc.m15386a().m15388a(asString, asString2);
                }
            }
        } catch (Throwable th) {
            UPLog.m15196e("MessageProvider", th);
        }
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        try {
            Context context = getContext();
            C3706y.m15841a(context);
            Uri m15767a = C3682h.m15767a(context);
            this.f15786a.addURI(m15767a.getAuthority(), m15767a.getPath(), 3);
            Uri m15768b = C3682h.m15768b(context);
            this.f15786a.addURI(m15768b.getAuthority(), m15768b.getPath(), 4);
            Uri m15770d = C3682h.m15770d(context);
            this.f15786a.addURI(m15770d.getAuthority(), m15770d.getPath(), 5);
            Uri m15771e = C3682h.m15771e(context);
            this.f15786a.addURI(m15771e.getAuthority(), m15771e.getPath(), 10);
            Uri m15769c = C3682h.m15769c(context);
            this.f15786a.addURI(m15769c.getAuthority(), m15769c.getPath(), 2);
            return true;
        } catch (Throwable th) {
            UPLog.m15196e("MessageProvider", th);
            return true;
        }
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        SQLiteDatabase readableDatabase;
        try {
            int match = this.f15786a.match(uri);
            if (match != 2) {
                if (match != 3) {
                    if (match != 5) {
                        if (match != 10 || (readableDatabase = m15203b().getReadableDatabase()) == null) {
                            return null;
                        }
                        return readableDatabase.query("InAppLogStore", strArr, str, strArr2, null, null, str2);
                    }
                    SQLiteDatabase readableDatabase2 = m15203b().getReadableDatabase();
                    if (readableDatabase2 == null) {
                        return null;
                    }
                    return readableDatabase2.query("MsgLogStore", strArr, str, strArr2, null, null, str2);
                }
                SQLiteDatabase readableDatabase3 = m15201a().getReadableDatabase();
                if (readableDatabase3 == null) {
                    return null;
                }
                return readableDatabase3.query("MsgAlias", strArr, str, strArr2, null, null, str2);
            }
            MatrixCursor matrixCursor = new MatrixCursor(new String[]{"k", "v"});
            Map<String, ?> all = C3585bc.m15386a().f16055a.getAll();
            if (strArr2 != null && strArr2.length != 0) {
                for (String str3 : strArr2) {
                    Object obj = all.get(str3);
                    if (obj instanceof String) {
                        matrixCursor.addRow(new Object[]{str3, obj});
                    }
                }
                return matrixCursor;
            }
            for (String str4 : all.keySet()) {
                Object obj2 = all.get(str4);
                if (obj2 instanceof String) {
                    matrixCursor.addRow(new Object[]{str4, obj2});
                }
            }
            return matrixCursor;
        } catch (Throwable th) {
            UPLog.m15196e("MessageProvider", th);
        }
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        SQLiteDatabase writableDatabase;
        try {
            int match = this.f15786a.match(uri);
            if (match != 2) {
                if (match != 3) {
                    if (match == 10 && (writableDatabase = m15203b().getWritableDatabase()) != null) {
                        return writableDatabase.updateWithOnConflict("InAppLogStore", contentValues, str, strArr, 5);
                    }
                } else {
                    SQLiteDatabase writableDatabase2 = m15201a().getWritableDatabase();
                    if (writableDatabase2 != null) {
                        return writableDatabase2.updateWithOnConflict("MsgAlias", contentValues, str, strArr, 5);
                    }
                }
            } else if (contentValues != null && strArr != null && strArr.length != 0) {
                String str2 = strArr[0];
                String asString = contentValues.getAsString("v");
                if (!TextUtils.isEmpty(str2)) {
                    C3585bc.m15386a().m15388a(str2, asString);
                    return 1;
                }
            }
        } catch (Throwable th) {
            UPLog.m15196e("MessageProvider", th);
        }
        return 0;
    }

    /* renamed from: a */
    private C3537a m15201a() {
        if (this.f15787b == null) {
            synchronized (C3537a.class) {
                if (this.f15787b == null) {
                    this.f15787b = new C3537a(getContext());
                }
            }
        }
        return this.f15787b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static boolean m15204b(SQLiteDatabase sQLiteDatabase, String str) {
        boolean z10 = false;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Cursor rawQuery = sQLiteDatabase.rawQuery(String.format("select count(*) as c from sqlite_master where type = 'table' and name = '%s'", str.trim()), null);
            if (rawQuery != null) {
                if (rawQuery.moveToNext() && rawQuery.getInt(0) > 0) {
                    z10 = true;
                }
                rawQuery.close();
            }
        } catch (Throwable th) {
            UPLog.m15196e("MessageProvider", th);
        }
        return z10;
    }
}
