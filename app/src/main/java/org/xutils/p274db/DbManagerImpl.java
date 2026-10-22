package org.xutils.p274db;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import com.raizlabs.android.dbflow.sql.language.Operator;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.xutils.C6127x;
import org.xutils.DbManager;
import org.xutils.common.util.IOUtil;
import org.xutils.common.util.KeyValue;
import org.xutils.common.util.LogUtil;
import org.xutils.p274db.sqlite.SqlInfo;
import org.xutils.p274db.sqlite.SqlInfoBuilder;
import org.xutils.p274db.sqlite.WhereBuilder;
import org.xutils.p274db.table.ColumnEntity;
import org.xutils.p274db.table.DbBase;
import org.xutils.p274db.table.DbModel;
import org.xutils.p274db.table.TableEntity;
import org.xutils.p275ex.DbException;

/* loaded from: classes3.dex */
public final class DbManagerImpl extends DbBase {
    private static final HashMap<DbManager.DaoConfig, DbManagerImpl> DAO_MAP = new HashMap<>();
    private boolean allowTransaction;
    private DbManager.DaoConfig daoConfig;
    private SQLiteDatabase database;

    private DbManagerImpl(DbManager.DaoConfig daoConfig) {
        if (daoConfig != null) {
            this.daoConfig = daoConfig;
            this.allowTransaction = daoConfig.isAllowTransaction();
            try {
                this.database = openOrCreateDatabase(daoConfig);
                DbManager.DbOpenListener dbOpenListener = daoConfig.getDbOpenListener();
                if (dbOpenListener != null) {
                    dbOpenListener.onDbOpened(this);
                    return;
                }
                return;
            } catch (DbException e10) {
                IOUtil.closeQuietly(this.database);
                throw e10;
            } catch (Throwable th) {
                IOUtil.closeQuietly(this.database);
                throw new DbException(th.getMessage(), th);
            }
        }
        throw new IllegalArgumentException("daoConfig may not be null");
    }

    private void beginTransaction() {
        if (this.allowTransaction) {
            if (this.database.isWriteAheadLoggingEnabled()) {
                this.database.beginTransactionNonExclusive();
            } else {
                this.database.beginTransaction();
            }
        }
    }

    private void endTransaction() {
        if (this.allowTransaction) {
            this.database.endTransaction();
        }
    }

    public static synchronized DbManager getInstance(DbManager.DaoConfig daoConfig) {
        DbManagerImpl dbManagerImpl;
        synchronized (DbManagerImpl.class) {
            if (daoConfig == null) {
                daoConfig = new DbManager.DaoConfig();
            }
            HashMap<DbManager.DaoConfig, DbManagerImpl> hashMap = DAO_MAP;
            dbManagerImpl = hashMap.get(daoConfig);
            if (dbManagerImpl == null) {
                dbManagerImpl = new DbManagerImpl(daoConfig);
                hashMap.put(daoConfig, dbManagerImpl);
            } else {
                dbManagerImpl.daoConfig = daoConfig;
            }
            SQLiteDatabase sQLiteDatabase = dbManagerImpl.database;
            int version = sQLiteDatabase.getVersion();
            int dbVersion = daoConfig.getDbVersion();
            if (version != dbVersion) {
                if (version != 0) {
                    DbManager.DbUpgradeListener dbUpgradeListener = daoConfig.getDbUpgradeListener();
                    if (dbUpgradeListener != null) {
                        dbUpgradeListener.onUpgrade(dbManagerImpl, version, dbVersion);
                    } else {
                        dbManagerImpl.dropDb();
                    }
                }
                sQLiteDatabase.setVersion(dbVersion);
            }
        }
        return dbManagerImpl;
    }

    private long getLastAutoIncrementId(String str) {
        Cursor execQuery = execQuery("SELECT seq FROM sqlite_sequence WHERE name='" + str + "' LIMIT 1");
        long j10 = -1;
        if (execQuery != null) {
            try {
                if (execQuery.moveToNext()) {
                    j10 = execQuery.getLong(0);
                }
            } finally {
            }
        }
        return j10;
    }

    private SQLiteDatabase openOrCreateDatabase(DbManager.DaoConfig daoConfig) {
        File dbDir = daoConfig.getDbDir();
        if (dbDir != null && (dbDir.exists() || dbDir.mkdirs())) {
            return SQLiteDatabase.openOrCreateDatabase(new File(dbDir, daoConfig.getDbName()), (SQLiteDatabase.CursorFactory) null);
        }
        return C6127x.app().openOrCreateDatabase(daoConfig.getDbName(), 0, null);
    }

    private boolean saveBindingIdWithoutTransaction(TableEntity<?> tableEntity, Object obj) {
        ColumnEntity id2 = tableEntity.getId();
        if (id2.isAutoId()) {
            execNonQuery(SqlInfoBuilder.buildInsertSqlInfo(tableEntity, obj));
            long lastAutoIncrementId = getLastAutoIncrementId(tableEntity.getName());
            if (lastAutoIncrementId == -1) {
                return false;
            }
            id2.setAutoIdValue(obj, lastAutoIncrementId);
            return true;
        }
        execNonQuery(SqlInfoBuilder.buildInsertSqlInfo(tableEntity, obj));
        return true;
    }

    private void saveOrUpdateWithoutTransaction(TableEntity<?> tableEntity, Object obj) {
        ColumnEntity id2 = tableEntity.getId();
        if (id2.isAutoId()) {
            if (id2.getColumnValue(obj) != null) {
                execNonQuery(SqlInfoBuilder.buildUpdateSqlInfo(tableEntity, obj, new String[0]));
                return;
            } else {
                saveBindingIdWithoutTransaction(tableEntity, obj);
                return;
            }
        }
        execNonQuery(SqlInfoBuilder.buildReplaceSqlInfo(tableEntity, obj));
    }

    private void setTransactionSuccessful() {
        if (this.allowTransaction) {
            this.database.setTransactionSuccessful();
        }
    }

    @Override // org.xutils.DbManager, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        HashMap<DbManager.DaoConfig, DbManagerImpl> hashMap = DAO_MAP;
        if (hashMap.containsKey(this.daoConfig)) {
            hashMap.remove(this.daoConfig);
            this.database.close();
        }
    }

    @Override // org.xutils.DbManager
    public void delete(Object obj) {
        try {
            beginTransaction();
            if (obj instanceof List) {
                List list = (List) obj;
                if (list.isEmpty()) {
                    return;
                }
                TableEntity table = getTable(list.get(0).getClass());
                if (!table.tableIsExists()) {
                    return;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    execNonQuery(SqlInfoBuilder.buildDeleteSqlInfo((TableEntity<?>) table, it.next()));
                }
            } else {
                TableEntity table2 = getTable(obj.getClass());
                if (!table2.tableIsExists()) {
                    return;
                } else {
                    execNonQuery(SqlInfoBuilder.buildDeleteSqlInfo((TableEntity<?>) table2, obj));
                }
            }
            setTransactionSuccessful();
        } finally {
            endTransaction();
        }
    }

    @Override // org.xutils.DbManager
    public void deleteById(Class<?> cls, Object obj) {
        TableEntity table = getTable(cls);
        if (!table.tableIsExists()) {
            return;
        }
        try {
            beginTransaction();
            execNonQuery(SqlInfoBuilder.buildDeleteSqlInfoById(table, obj));
            setTransactionSuccessful();
        } finally {
            endTransaction();
        }
    }

    @Override // org.xutils.DbManager
    public void execNonQuery(SqlInfo sqlInfo) {
        SQLiteStatement sQLiteStatement = null;
        try {
            sQLiteStatement = sqlInfo.buildStatement(this.database);
            sQLiteStatement.execute();
            try {
                sQLiteStatement.releaseReference();
            } catch (Throwable th) {
                LogUtil.m24376e(th.getMessage(), th);
            }
        } catch (Throwable th2) {
            try {
                throw new DbException(th2);
            } catch (Throwable th3) {
                if (sQLiteStatement != null) {
                    try {
                        sQLiteStatement.releaseReference();
                    } catch (Throwable th4) {
                        LogUtil.m24376e(th4.getMessage(), th4);
                    }
                }
                throw th3;
            }
        }
    }

    @Override // org.xutils.DbManager
    public Cursor execQuery(SqlInfo sqlInfo) {
        try {
            return this.database.rawQuery(sqlInfo.getSql(), sqlInfo.getBindArgsAsStrArray());
        } catch (Throwable th) {
            throw new DbException(th);
        }
    }

    @Override // org.xutils.DbManager
    public int executeUpdateDelete(SqlInfo sqlInfo) {
        SQLiteStatement sQLiteStatement = null;
        try {
            sQLiteStatement = sqlInfo.buildStatement(this.database);
            int executeUpdateDelete = sQLiteStatement.executeUpdateDelete();
            try {
                sQLiteStatement.releaseReference();
            } catch (Throwable th) {
                LogUtil.m24376e(th.getMessage(), th);
            }
            return executeUpdateDelete;
        } catch (Throwable th2) {
            try {
                throw new DbException(th2);
            } catch (Throwable th3) {
                if (sQLiteStatement != null) {
                    try {
                        sQLiteStatement.releaseReference();
                    } catch (Throwable th4) {
                        LogUtil.m24376e(th4.getMessage(), th4);
                    }
                }
                throw th3;
            }
        }
    }

    @Override // org.xutils.DbManager
    public <T> List<T> findAll(Class<T> cls) {
        return selector(cls).findAll();
    }

    @Override // org.xutils.DbManager
    public <T> T findById(Class<T> cls, Object obj) {
        Cursor execQuery;
        TableEntity<T> table = getTable(cls);
        if (table.tableIsExists() && (execQuery = execQuery(Selector.from(table).where(table.getId().getName(), Operator.Operation.EQUALS, obj).limit(1).toString())) != null) {
            try {
                if (execQuery.moveToNext()) {
                    return (T) AbstractC6092a.m24389b(table, execQuery);
                }
            } finally {
            }
        }
        return null;
    }

    @Override // org.xutils.DbManager
    public List<DbModel> findDbModelAll(SqlInfo sqlInfo) {
        ArrayList arrayList = new ArrayList();
        Cursor execQuery = execQuery(sqlInfo);
        if (execQuery != null) {
            while (execQuery.moveToNext()) {
                try {
                    arrayList.add(AbstractC6092a.m24388a(execQuery));
                } finally {
                }
            }
        }
        return arrayList;
    }

    @Override // org.xutils.DbManager
    public DbModel findDbModelFirst(SqlInfo sqlInfo) {
        Cursor execQuery = execQuery(sqlInfo);
        if (execQuery != null) {
            try {
                if (execQuery.moveToNext()) {
                    return AbstractC6092a.m24388a(execQuery);
                }
                return null;
            } catch (Throwable th) {
                try {
                    throw new DbException(th);
                } finally {
                    IOUtil.closeQuietly(execQuery);
                }
            }
        }
        return null;
    }

    @Override // org.xutils.DbManager
    public <T> T findFirst(Class<T> cls) {
        return selector(cls).findFirst();
    }

    @Override // org.xutils.DbManager
    public DbManager.DaoConfig getDaoConfig() {
        return this.daoConfig;
    }

    @Override // org.xutils.DbManager
    public SQLiteDatabase getDatabase() {
        return this.database;
    }

    @Override // org.xutils.DbManager
    public void replace(Object obj) {
        try {
            beginTransaction();
            if (obj instanceof List) {
                List list = (List) obj;
                if (list.isEmpty()) {
                    return;
                }
                TableEntity table = getTable(list.get(0).getClass());
                table.createTableIfNotExists();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    execNonQuery(SqlInfoBuilder.buildReplaceSqlInfo(table, it.next()));
                }
            } else {
                TableEntity table2 = getTable(obj.getClass());
                table2.createTableIfNotExists();
                execNonQuery(SqlInfoBuilder.buildReplaceSqlInfo(table2, obj));
            }
            setTransactionSuccessful();
        } finally {
            endTransaction();
        }
    }

    @Override // org.xutils.DbManager
    public void save(Object obj) {
        try {
            beginTransaction();
            if (obj instanceof List) {
                List list = (List) obj;
                if (list.isEmpty()) {
                    return;
                }
                TableEntity table = getTable(list.get(0).getClass());
                table.createTableIfNotExists();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    execNonQuery(SqlInfoBuilder.buildInsertSqlInfo(table, it.next()));
                }
            } else {
                TableEntity table2 = getTable(obj.getClass());
                table2.createTableIfNotExists();
                execNonQuery(SqlInfoBuilder.buildInsertSqlInfo(table2, obj));
            }
            setTransactionSuccessful();
        } finally {
            endTransaction();
        }
    }

    @Override // org.xutils.DbManager
    public boolean saveBindingId(Object obj) {
        boolean saveBindingIdWithoutTransaction;
        try {
            beginTransaction();
            if (obj instanceof List) {
                List list = (List) obj;
                saveBindingIdWithoutTransaction = false;
                if (list.isEmpty()) {
                    return false;
                }
                TableEntity<?> table = getTable(list.get(0).getClass());
                table.createTableIfNotExists();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (!saveBindingIdWithoutTransaction(table, it.next())) {
                        throw new DbException("saveBindingId error, transaction will not commit!");
                    }
                }
            } else {
                TableEntity<?> table2 = getTable(obj.getClass());
                table2.createTableIfNotExists();
                saveBindingIdWithoutTransaction = saveBindingIdWithoutTransaction(table2, obj);
            }
            setTransactionSuccessful();
            return saveBindingIdWithoutTransaction;
        } finally {
            endTransaction();
        }
    }

    @Override // org.xutils.DbManager
    public void saveOrUpdate(Object obj) {
        try {
            beginTransaction();
            if (obj instanceof List) {
                List list = (List) obj;
                if (list.isEmpty()) {
                    return;
                }
                TableEntity<?> table = getTable(list.get(0).getClass());
                table.createTableIfNotExists();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    saveOrUpdateWithoutTransaction(table, it.next());
                }
            } else {
                TableEntity<?> table2 = getTable(obj.getClass());
                table2.createTableIfNotExists();
                saveOrUpdateWithoutTransaction(table2, obj);
            }
            setTransactionSuccessful();
        } finally {
            endTransaction();
        }
    }

    @Override // org.xutils.DbManager
    public <T> Selector<T> selector(Class<T> cls) {
        return Selector.from(getTable(cls));
    }

    @Override // org.xutils.DbManager
    public void update(Object obj, String... strArr) {
        try {
            beginTransaction();
            if (obj instanceof List) {
                List list = (List) obj;
                if (list.isEmpty()) {
                    return;
                }
                TableEntity table = getTable(list.get(0).getClass());
                if (!table.tableIsExists()) {
                    return;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    execNonQuery(SqlInfoBuilder.buildUpdateSqlInfo((TableEntity<?>) table, it.next(), strArr));
                }
            } else {
                TableEntity table2 = getTable(obj.getClass());
                if (!table2.tableIsExists()) {
                    return;
                } else {
                    execNonQuery(SqlInfoBuilder.buildUpdateSqlInfo((TableEntity<?>) table2, obj, strArr));
                }
            }
            setTransactionSuccessful();
        } finally {
            endTransaction();
        }
    }

    @Override // org.xutils.DbManager
    public Cursor execQuery(String str) {
        try {
            return this.database.rawQuery(str, null);
        } catch (Throwable th) {
            throw new DbException(th);
        }
    }

    @Override // org.xutils.DbManager
    public void execNonQuery(String str) {
        try {
            this.database.execSQL(str);
        } catch (Throwable th) {
            throw new DbException(th);
        }
    }

    @Override // org.xutils.DbManager
    public int executeUpdateDelete(String str) {
        SQLiteStatement sQLiteStatement = null;
        try {
            sQLiteStatement = this.database.compileStatement(str);
            int executeUpdateDelete = sQLiteStatement.executeUpdateDelete();
            try {
                sQLiteStatement.releaseReference();
            } catch (Throwable th) {
                LogUtil.m24376e(th.getMessage(), th);
            }
            return executeUpdateDelete;
        } catch (Throwable th2) {
            try {
                throw new DbException(th2);
            } catch (Throwable th3) {
                if (sQLiteStatement != null) {
                    try {
                        sQLiteStatement.releaseReference();
                    } catch (Throwable th4) {
                        LogUtil.m24376e(th4.getMessage(), th4);
                    }
                }
                throw th3;
            }
        }
    }

    @Override // org.xutils.DbManager
    public void delete(Class<?> cls) {
        delete(cls, null);
    }

    @Override // org.xutils.DbManager
    public int update(Class<?> cls, WhereBuilder whereBuilder, KeyValue... keyValueArr) {
        TableEntity table = getTable(cls);
        if (!table.tableIsExists()) {
            return 0;
        }
        try {
            beginTransaction();
            int executeUpdateDelete = executeUpdateDelete(SqlInfoBuilder.buildUpdateSqlInfo((TableEntity<?>) table, whereBuilder, keyValueArr));
            setTransactionSuccessful();
            return executeUpdateDelete;
        } finally {
            endTransaction();
        }
    }

    @Override // org.xutils.DbManager
    public int delete(Class<?> cls, WhereBuilder whereBuilder) {
        TableEntity table = getTable(cls);
        if (!table.tableIsExists()) {
            return 0;
        }
        try {
            beginTransaction();
            int executeUpdateDelete = executeUpdateDelete(SqlInfoBuilder.buildDeleteSqlInfo((TableEntity<?>) table, whereBuilder));
            setTransactionSuccessful();
            return executeUpdateDelete;
        } finally {
            endTransaction();
        }
    }
}
