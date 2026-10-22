package com.lzy.okgo.p066db;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Pair;
import com.lzy.okgo.utils.OkLogger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.Lock;

/* loaded from: classes2.dex */
public abstract class BaseDao<T> {
    protected static String TAG;
    protected SQLiteDatabase database;
    protected SQLiteOpenHelper helper;
    protected Lock lock;

    /* loaded from: classes2.dex */
    public interface Action {
        void call(SQLiteDatabase sQLiteDatabase);
    }

    public BaseDao(SQLiteOpenHelper sQLiteOpenHelper) {
        TAG = getClass().getSimpleName();
        this.lock = DBHelper.lock;
        this.helper = sQLiteOpenHelper;
        this.database = openWriter();
    }

    protected final void closeDatabase(SQLiteDatabase sQLiteDatabase, Cursor cursor) {
        if (cursor != null && !cursor.isClosed()) {
            cursor.close();
        }
        if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
            sQLiteDatabase.close();
        }
    }

    public boolean delete(String str, String[] strArr) {
        long currentTimeMillis = System.currentTimeMillis();
        this.lock.lock();
        try {
            try {
                this.database.beginTransaction();
                this.database.delete(getTableName(), str, strArr);
                this.database.setTransactionSuccessful();
                this.database.endTransaction();
                this.lock.unlock();
                OkLogger.m11765v(TAG, (System.currentTimeMillis() - currentTimeMillis) + " delete");
                return true;
            } catch (Exception e10) {
                OkLogger.printStackTrace(e10);
                this.database.endTransaction();
                this.lock.unlock();
                OkLogger.m11765v(TAG, (System.currentTimeMillis() - currentTimeMillis) + " delete");
                return false;
            }
        } catch (Throwable th) {
            this.database.endTransaction();
            this.lock.unlock();
            OkLogger.m11765v(TAG, (System.currentTimeMillis() - currentTimeMillis) + " delete");
            throw th;
        }
    }

    public boolean deleteAll() {
        return delete(null, null);
    }

    public boolean deleteList(List<Pair<String, String[]>> list) {
        long currentTimeMillis = System.currentTimeMillis();
        this.lock.lock();
        try {
            try {
                this.database.beginTransaction();
                for (Pair<String, String[]> pair : list) {
                    this.database.delete(getTableName(), (String) pair.first, (String[]) pair.second);
                }
                this.database.setTransactionSuccessful();
                this.database.endTransaction();
                this.lock.unlock();
                OkLogger.m11765v(TAG, (System.currentTimeMillis() - currentTimeMillis) + " deleteList");
                return true;
            } catch (Exception e10) {
                OkLogger.printStackTrace(e10);
                this.database.endTransaction();
                this.lock.unlock();
                OkLogger.m11765v(TAG, (System.currentTimeMillis() - currentTimeMillis) + " deleteList");
                return false;
            }
        } catch (Throwable th) {
            this.database.endTransaction();
            this.lock.unlock();
            OkLogger.m11765v(TAG, (System.currentTimeMillis() - currentTimeMillis) + " deleteList");
            throw th;
        }
    }

    public abstract ContentValues getContentValues(T t10);

    public abstract String getTableName();

    public boolean insert(T t10) {
        if (t10 == null) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.lock.lock();
        try {
            try {
                this.database.beginTransaction();
                this.database.insert(getTableName(), null, getContentValues(t10));
                this.database.setTransactionSuccessful();
                this.database.endTransaction();
                this.lock.unlock();
                OkLogger.m11765v(TAG, (System.currentTimeMillis() - currentTimeMillis) + " insertT");
                return true;
            } catch (Exception e10) {
                OkLogger.printStackTrace(e10);
                this.database.endTransaction();
                this.lock.unlock();
                OkLogger.m11765v(TAG, (System.currentTimeMillis() - currentTimeMillis) + " insertT");
                return false;
            }
        } catch (Throwable th) {
            this.database.endTransaction();
            this.lock.unlock();
            OkLogger.m11765v(TAG, (System.currentTimeMillis() - currentTimeMillis) + " insertT");
            throw th;
        }
    }

    public SQLiteDatabase openReader() {
        return this.helper.getReadableDatabase();
    }

    public SQLiteDatabase openWriter() {
        return this.helper.getWritableDatabase();
    }

    public abstract T parseCursorToBean(Cursor cursor);

    public List<T> query(SQLiteDatabase sQLiteDatabase, String str, String[] strArr) {
        return query(sQLiteDatabase, null, str, strArr, null, null, null, null);
    }

    public List<T> queryAll(SQLiteDatabase sQLiteDatabase) {
        return query(sQLiteDatabase, null, null);
    }

    public T queryOne(SQLiteDatabase sQLiteDatabase, String str, String[] strArr) {
        List<T> query = query(sQLiteDatabase, null, str, strArr, null, null, null, "1");
        if (query.size() > 0) {
            return query.get(0);
        }
        return null;
    }

    public boolean replace(T t10) {
        if (t10 == null) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.lock.lock();
        try {
            try {
                this.database.beginTransaction();
                this.database.replace(getTableName(), null, getContentValues(t10));
                this.database.setTransactionSuccessful();
                this.database.endTransaction();
                this.lock.unlock();
                OkLogger.m11765v(TAG, (System.currentTimeMillis() - currentTimeMillis) + " replaceT");
                return true;
            } catch (Exception e10) {
                OkLogger.printStackTrace(e10);
                this.database.endTransaction();
                this.lock.unlock();
                OkLogger.m11765v(TAG, (System.currentTimeMillis() - currentTimeMillis) + " replaceT");
                return false;
            }
        } catch (Throwable th) {
            this.database.endTransaction();
            this.lock.unlock();
            OkLogger.m11765v(TAG, (System.currentTimeMillis() - currentTimeMillis) + " replaceT");
            throw th;
        }
    }

    public void startTransaction(Action action) {
        this.lock.lock();
        try {
            try {
                this.database.beginTransaction();
                action.call(this.database);
                this.database.setTransactionSuccessful();
            } catch (Exception e10) {
                OkLogger.printStackTrace(e10);
            }
        } finally {
            this.database.endTransaction();
            this.lock.unlock();
        }
    }

    public abstract void unInit();

    public boolean update(T t10, String str, String[] strArr) {
        if (t10 == null) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.lock.lock();
        try {
            try {
                this.database.beginTransaction();
                this.database.update(getTableName(), getContentValues(t10), str, strArr);
                this.database.setTransactionSuccessful();
                this.database.endTransaction();
                this.lock.unlock();
                OkLogger.m11765v(TAG, (System.currentTimeMillis() - currentTimeMillis) + " updateT");
                return true;
            } catch (Exception e10) {
                OkLogger.printStackTrace(e10);
                this.database.endTransaction();
                this.lock.unlock();
                OkLogger.m11765v(TAG, (System.currentTimeMillis() - currentTimeMillis) + " updateT");
                return false;
            }
        } catch (Throwable th) {
            this.database.endTransaction();
            this.lock.unlock();
            OkLogger.m11765v(TAG, (System.currentTimeMillis() - currentTimeMillis) + " updateT");
            throw th;
        }
    }

    public long deleteAll(SQLiteDatabase sQLiteDatabase) {
        return delete(sQLiteDatabase, null, null);
    }

    public List<T> query(SQLiteDatabase sQLiteDatabase, String[] strArr, String str, String[] strArr2, String str2, String str3, String str4, String str5) {
        Cursor cursor;
        ArrayList arrayList = new ArrayList();
        try {
            try {
                cursor = sQLiteDatabase.query(getTableName(), strArr, str, strArr2, str2, str3, str4, str5);
                while (!cursor.isClosed() && cursor.moveToNext()) {
                    try {
                        arrayList.add(parseCursorToBean(cursor));
                    } catch (Exception e10) {
                        e = e10;
                        OkLogger.printStackTrace(e);
                        closeDatabase(null, cursor);
                        return arrayList;
                    }
                }
            } catch (Throwable th) {
                th = th;
                closeDatabase(null, null);
                throw th;
            }
        } catch (Exception e11) {
            e = e11;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            closeDatabase(null, null);
            throw th;
        }
        closeDatabase(null, cursor);
        return arrayList;
    }

    public List<T> queryAll() {
        return query(null, null);
    }

    public T queryOne(String str, String[] strArr) {
        long currentTimeMillis = System.currentTimeMillis();
        List<T> query = query(null, str, strArr, null, null, null, "1");
        OkLogger.m11765v(TAG, (System.currentTimeMillis() - currentTimeMillis) + " queryOne");
        if (query.size() > 0) {
            return query.get(0);
        }
        return null;
    }

    public List<T> query(String str, String[] strArr) {
        return query(null, str, strArr, null, null, null, null);
    }

    public List<T> query(String[] strArr, String str, String[] strArr2, String str2, String str3, String str4, String str5) {
        Cursor cursor;
        String str6;
        StringBuilder sb2;
        long currentTimeMillis = System.currentTimeMillis();
        this.lock.lock();
        ArrayList arrayList = new ArrayList();
        try {
            this.database.beginTransaction();
            cursor = this.database.query(getTableName(), strArr, str, strArr2, str2, str3, str4, str5);
            while (!cursor.isClosed() && cursor.moveToNext()) {
                try {
                    try {
                        arrayList.add(parseCursorToBean(cursor));
                    } catch (Exception e10) {
                        e = e10;
                        OkLogger.printStackTrace(e);
                        closeDatabase(null, cursor);
                        this.database.endTransaction();
                        this.lock.unlock();
                        str6 = TAG;
                        sb2 = new StringBuilder();
                        sb2.append(System.currentTimeMillis() - currentTimeMillis);
                        sb2.append(" query");
                        OkLogger.m11765v(str6, sb2.toString());
                        return arrayList;
                    }
                } catch (Throwable th) {
                    th = th;
                    closeDatabase(null, cursor);
                    this.database.endTransaction();
                    this.lock.unlock();
                    OkLogger.m11765v(TAG, (System.currentTimeMillis() - currentTimeMillis) + " query");
                    throw th;
                }
            }
            this.database.setTransactionSuccessful();
            closeDatabase(null, cursor);
            this.database.endTransaction();
            this.lock.unlock();
            str6 = TAG;
            sb2 = new StringBuilder();
        } catch (Exception e11) {
            e = e11;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
            closeDatabase(null, cursor);
            this.database.endTransaction();
            this.lock.unlock();
            OkLogger.m11765v(TAG, (System.currentTimeMillis() - currentTimeMillis) + " query");
            throw th;
        }
        sb2.append(System.currentTimeMillis() - currentTimeMillis);
        sb2.append(" query");
        OkLogger.m11765v(str6, sb2.toString());
        return arrayList;
    }

    public long delete(SQLiteDatabase sQLiteDatabase, String str, String[] strArr) {
        return sQLiteDatabase.delete(getTableName(), str, strArr);
    }

    public long insert(SQLiteDatabase sQLiteDatabase, T t10) {
        return sQLiteDatabase.insert(getTableName(), null, getContentValues(t10));
    }

    public long replace(SQLiteDatabase sQLiteDatabase, T t10) {
        return sQLiteDatabase.replace(getTableName(), null, getContentValues(t10));
    }

    public long update(SQLiteDatabase sQLiteDatabase, T t10, String str, String[] strArr) {
        return sQLiteDatabase.update(getTableName(), getContentValues(t10), str, strArr);
    }

    public boolean insert(List<T> list) {
        if (list == null) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.lock.lock();
        try {
            try {
                this.database.beginTransaction();
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    this.database.insert(getTableName(), null, getContentValues(it.next()));
                }
                this.database.setTransactionSuccessful();
                this.database.endTransaction();
                this.lock.unlock();
                OkLogger.m11765v(TAG, (System.currentTimeMillis() - currentTimeMillis) + " insertList");
                return true;
            } catch (Exception e10) {
                OkLogger.printStackTrace(e10);
                this.database.endTransaction();
                this.lock.unlock();
                OkLogger.m11765v(TAG, (System.currentTimeMillis() - currentTimeMillis) + " insertList");
                return false;
            }
        } catch (Throwable th) {
            this.database.endTransaction();
            this.lock.unlock();
            OkLogger.m11765v(TAG, (System.currentTimeMillis() - currentTimeMillis) + " insertList");
            throw th;
        }
    }

    public boolean replace(ContentValues contentValues) {
        long currentTimeMillis = System.currentTimeMillis();
        this.lock.lock();
        try {
            try {
                this.database.beginTransaction();
                this.database.replace(getTableName(), null, contentValues);
                this.database.setTransactionSuccessful();
                this.database.endTransaction();
                this.lock.unlock();
                OkLogger.m11765v(TAG, (System.currentTimeMillis() - currentTimeMillis) + " replaceContentValues");
                return true;
            } catch (Exception e10) {
                OkLogger.printStackTrace(e10);
                this.database.endTransaction();
                this.lock.unlock();
                OkLogger.m11765v(TAG, (System.currentTimeMillis() - currentTimeMillis) + " replaceContentValues");
                return false;
            }
        } catch (Throwable th) {
            this.database.endTransaction();
            this.lock.unlock();
            OkLogger.m11765v(TAG, (System.currentTimeMillis() - currentTimeMillis) + " replaceContentValues");
            throw th;
        }
    }

    public boolean update(ContentValues contentValues, String str, String[] strArr) {
        long currentTimeMillis = System.currentTimeMillis();
        this.lock.lock();
        try {
            try {
                this.database.beginTransaction();
                this.database.update(getTableName(), contentValues, str, strArr);
                this.database.setTransactionSuccessful();
                this.database.endTransaction();
                this.lock.unlock();
                OkLogger.m11765v(TAG, (System.currentTimeMillis() - currentTimeMillis) + " updateContentValues");
                return true;
            } catch (Exception e10) {
                OkLogger.printStackTrace(e10);
                this.database.endTransaction();
                this.lock.unlock();
                OkLogger.m11765v(TAG, (System.currentTimeMillis() - currentTimeMillis) + " updateContentValues");
                return false;
            }
        } catch (Throwable th) {
            this.database.endTransaction();
            this.lock.unlock();
            OkLogger.m11765v(TAG, (System.currentTimeMillis() - currentTimeMillis) + " updateContentValues");
            throw th;
        }
    }

    public long replace(SQLiteDatabase sQLiteDatabase, ContentValues contentValues) {
        return sQLiteDatabase.replace(getTableName(), null, contentValues);
    }

    public long update(SQLiteDatabase sQLiteDatabase, ContentValues contentValues, String str, String[] strArr) {
        return sQLiteDatabase.update(getTableName(), contentValues, str, strArr);
    }

    public boolean insert(SQLiteDatabase sQLiteDatabase, List<T> list) {
        try {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                sQLiteDatabase.insert(getTableName(), null, getContentValues(it.next()));
            }
            return true;
        } catch (Exception e10) {
            OkLogger.printStackTrace(e10);
            return false;
        }
    }

    public boolean replace(List<T> list) {
        if (list == null) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.lock.lock();
        try {
            try {
                this.database.beginTransaction();
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    this.database.replace(getTableName(), null, getContentValues(it.next()));
                }
                this.database.setTransactionSuccessful();
                this.database.endTransaction();
                this.lock.unlock();
                OkLogger.m11765v(TAG, (System.currentTimeMillis() - currentTimeMillis) + " replaceList");
                return true;
            } catch (Exception e10) {
                OkLogger.printStackTrace(e10);
                this.database.endTransaction();
                this.lock.unlock();
                OkLogger.m11765v(TAG, (System.currentTimeMillis() - currentTimeMillis) + " replaceList");
                return false;
            }
        } catch (Throwable th) {
            this.database.endTransaction();
            this.lock.unlock();
            OkLogger.m11765v(TAG, (System.currentTimeMillis() - currentTimeMillis) + " replaceList");
            throw th;
        }
    }

    public boolean replace(SQLiteDatabase sQLiteDatabase, List<T> list) {
        try {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                sQLiteDatabase.replace(getTableName(), null, getContentValues(it.next()));
            }
            return true;
        } catch (Exception e10) {
            OkLogger.printStackTrace(e10);
            return false;
        }
    }
}
