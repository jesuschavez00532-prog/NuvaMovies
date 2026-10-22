package com.lzy.okgo.p066db;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.lzy.okgo.utils.OkLogger;

/* loaded from: classes2.dex */
public class DBUtils {
    public static boolean isFieldExists(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        boolean z10 = false;
        if (str == null || sQLiteDatabase == null || str2 == null || !sQLiteDatabase.isOpen()) {
            return false;
        }
        Cursor cursor = null;
        try {
            try {
                cursor = sQLiteDatabase.rawQuery("SELECT * FROM " + str + " LIMIT 0", null);
                if (cursor != null) {
                    if (cursor.getColumnIndex(str2) != -1) {
                        z10 = true;
                    }
                }
                if (cursor != null) {
                    cursor.close();
                }
                return z10;
            } catch (Exception e10) {
                OkLogger.printStackTrace(e10);
                if (cursor != null) {
                    cursor.close();
                }
                return false;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public static boolean isNeedUpgradeTable(SQLiteDatabase sQLiteDatabase, TableEntity tableEntity) {
        if (!isTableExists(sQLiteDatabase, tableEntity.tableName)) {
            return true;
        }
        Cursor rawQuery = sQLiteDatabase.rawQuery("select * from " + tableEntity.tableName, null);
        if (rawQuery == null) {
            return false;
        }
        try {
            int columnCount = tableEntity.getColumnCount();
            if (columnCount != rawQuery.getColumnCount()) {
                return true;
            }
            for (int i10 = 0; i10 < columnCount; i10++) {
                if (tableEntity.getColumnIndex(rawQuery.getColumnName(i10)) == -1) {
                    return true;
                }
            }
            return false;
        } finally {
            rawQuery.close();
        }
    }

    public static boolean isTableExists(SQLiteDatabase sQLiteDatabase, String str) {
        int i10;
        if (str == null || sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
            return false;
        }
        Cursor cursor = null;
        try {
            try {
                cursor = sQLiteDatabase.rawQuery("SELECT COUNT(*) FROM sqlite_master WHERE type = ? AND name = ?", new String[]{"table", str});
            } catch (Exception e10) {
                OkLogger.printStackTrace(e10);
                if (cursor != null) {
                    cursor.close();
                }
                i10 = 0;
            }
            if (!cursor.moveToFirst()) {
                cursor.close();
                return false;
            }
            i10 = cursor.getInt(0);
            cursor.close();
            if (i10 <= 0) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }
}
