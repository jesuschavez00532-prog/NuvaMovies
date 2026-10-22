package org.xutils;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.raizlabs.android.dbflow.sql.language.Operator;
import java.io.Closeable;
import java.io.File;
import java.util.List;
import org.xutils.common.util.KeyValue;
import org.xutils.p274db.Selector;
import org.xutils.p274db.sqlite.SqlInfo;
import org.xutils.p274db.sqlite.WhereBuilder;
import org.xutils.p274db.table.DbModel;
import org.xutils.p274db.table.TableEntity;

/* loaded from: classes3.dex */
public interface DbManager extends Closeable {

    /* loaded from: classes3.dex */
    public static class DaoConfig {
        private File dbDir;
        private DbOpenListener dbOpenListener;
        private DbUpgradeListener dbUpgradeListener;
        private TableCreateListener tableCreateListener;
        private String dbName = "xUtils.db";
        private int dbVersion = 1;
        private boolean allowTransaction = true;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            DaoConfig daoConfig = (DaoConfig) obj;
            if (!this.dbName.equals(daoConfig.dbName)) {
                return false;
            }
            File file = this.dbDir;
            File file2 = daoConfig.dbDir;
            if (file == null) {
                if (file2 == null) {
                    return true;
                }
                return false;
            }
            return file.equals(file2);
        }

        public File getDbDir() {
            return this.dbDir;
        }

        public String getDbName() {
            return this.dbName;
        }

        public DbOpenListener getDbOpenListener() {
            return this.dbOpenListener;
        }

        public DbUpgradeListener getDbUpgradeListener() {
            return this.dbUpgradeListener;
        }

        public int getDbVersion() {
            return this.dbVersion;
        }

        public TableCreateListener getTableCreateListener() {
            return this.tableCreateListener;
        }

        public int hashCode() {
            int i10;
            int hashCode = this.dbName.hashCode() * 31;
            File file = this.dbDir;
            if (file != null) {
                i10 = file.hashCode();
            } else {
                i10 = 0;
            }
            return hashCode + i10;
        }

        public boolean isAllowTransaction() {
            return this.allowTransaction;
        }

        public DaoConfig setAllowTransaction(boolean z10) {
            this.allowTransaction = z10;
            return this;
        }

        public DaoConfig setDbDir(File file) {
            this.dbDir = file;
            return this;
        }

        public DaoConfig setDbName(String str) {
            if (!TextUtils.isEmpty(str)) {
                this.dbName = str;
            }
            return this;
        }

        public DaoConfig setDbOpenListener(DbOpenListener dbOpenListener) {
            this.dbOpenListener = dbOpenListener;
            return this;
        }

        public DaoConfig setDbUpgradeListener(DbUpgradeListener dbUpgradeListener) {
            this.dbUpgradeListener = dbUpgradeListener;
            return this;
        }

        public DaoConfig setDbVersion(int i10) {
            this.dbVersion = i10;
            return this;
        }

        public DaoConfig setTableCreateListener(TableCreateListener tableCreateListener) {
            this.tableCreateListener = tableCreateListener;
            return this;
        }

        public String toString() {
            return String.valueOf(this.dbDir) + Operator.Operation.DIVISION + this.dbName;
        }
    }

    /* loaded from: classes3.dex */
    public interface DbOpenListener {
        void onDbOpened(DbManager dbManager);
    }

    /* loaded from: classes3.dex */
    public interface DbUpgradeListener {
        void onUpgrade(DbManager dbManager, int i10, int i11);
    }

    /* loaded from: classes3.dex */
    public interface TableCreateListener {
        void onTableCreated(DbManager dbManager, TableEntity<?> tableEntity);
    }

    void addColumn(Class<?> cls, String str);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    int delete(Class<?> cls, WhereBuilder whereBuilder);

    void delete(Class<?> cls);

    void delete(Object obj);

    void deleteById(Class<?> cls, Object obj);

    void dropDb();

    void dropTable(Class<?> cls);

    void execNonQuery(String str);

    void execNonQuery(SqlInfo sqlInfo);

    Cursor execQuery(String str);

    Cursor execQuery(SqlInfo sqlInfo);

    int executeUpdateDelete(String str);

    int executeUpdateDelete(SqlInfo sqlInfo);

    <T> List<T> findAll(Class<T> cls);

    <T> T findById(Class<T> cls, Object obj);

    List<DbModel> findDbModelAll(SqlInfo sqlInfo);

    DbModel findDbModelFirst(SqlInfo sqlInfo);

    <T> T findFirst(Class<T> cls);

    DaoConfig getDaoConfig();

    SQLiteDatabase getDatabase();

    <T> TableEntity<T> getTable(Class<T> cls);

    void replace(Object obj);

    void save(Object obj);

    boolean saveBindingId(Object obj);

    void saveOrUpdate(Object obj);

    <T> Selector<T> selector(Class<T> cls);

    int update(Class<?> cls, WhereBuilder whereBuilder, KeyValue... keyValueArr);

    void update(Object obj, String... strArr);
}
