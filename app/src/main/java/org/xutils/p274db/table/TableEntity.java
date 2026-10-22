package org.xutils.p274db.table;

import android.database.Cursor;
import android.text.TextUtils;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;
import org.xutils.DbManager;
import org.xutils.common.util.LogUtil;
import org.xutils.p274db.annotation.Table;
import org.xutils.p274db.sqlite.SqlInfoBuilder;
import org.xutils.p275ex.DbException;

/* loaded from: classes3.dex */
public final class TableEntity<T> {
    private final LinkedHashMap<String, ColumnEntity> columnMap;
    private final Constructor<T> constructor;

    /* renamed from: db */
    private final DbManager f24028db;
    private final Class<T> entityType;

    /* renamed from: id */
    private ColumnEntity f24029id;
    private final String name;
    private final String onCreated;
    private volatile Boolean tableCheckedStatus;

    /* JADX INFO: Access modifiers changed from: package-private */
    public TableEntity(DbManager dbManager, Class<T> cls) {
        this.f24028db = dbManager;
        this.entityType = cls;
        Table table = (Table) cls.getAnnotation(Table.class);
        if (table != null) {
            this.name = table.name();
            this.onCreated = table.onCreated();
            Constructor<T> constructor = cls.getConstructor(new Class[0]);
            this.constructor = constructor;
            constructor.setAccessible(true);
            LinkedHashMap<String, ColumnEntity> m24395b = AbstractC6094a.m24395b(cls);
            this.columnMap = m24395b;
            for (ColumnEntity columnEntity : m24395b.values()) {
                if (columnEntity.isId()) {
                    this.f24029id = columnEntity;
                    return;
                }
            }
            return;
        }
        throw new DbException("missing @Table on " + cls.getName());
    }

    public T createEntity() {
        return this.constructor.newInstance(new Object[0]);
    }

    public void createTableIfNotExists() {
        if (this.tableCheckedStatus != null && this.tableCheckedStatus.booleanValue()) {
            return;
        }
        synchronized (this.entityType) {
            if (!tableIsExists(true)) {
                this.f24028db.execNonQuery(SqlInfoBuilder.buildCreateTableSqlInfo(this));
                this.tableCheckedStatus = Boolean.TRUE;
                if (!TextUtils.isEmpty(this.onCreated)) {
                    this.f24028db.execNonQuery(this.onCreated);
                }
                DbManager.TableCreateListener tableCreateListener = this.f24028db.getDaoConfig().getTableCreateListener();
                if (tableCreateListener != null) {
                    try {
                        tableCreateListener.onTableCreated(this.f24028db, this);
                    } catch (Throwable th) {
                        LogUtil.m24376e(th.getMessage(), th);
                    }
                }
            }
        }
    }

    public LinkedHashMap<String, ColumnEntity> getColumnMap() {
        return this.columnMap;
    }

    public DbManager getDb() {
        return this.f24028db;
    }

    public Class<T> getEntityType() {
        return this.entityType;
    }

    public ColumnEntity getId() {
        return this.f24029id;
    }

    public String getName() {
        return this.name;
    }

    public String getOnCreated() {
        return this.onCreated;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setTableCheckedStatus(boolean z10) {
        this.tableCheckedStatus = Boolean.valueOf(z10);
    }

    public boolean tableIsExists() {
        return tableIsExists(false);
    }

    public String toString() {
        return this.name;
    }

    public boolean tableIsExists(boolean z10) {
        if (this.tableCheckedStatus != null && (this.tableCheckedStatus.booleanValue() || !z10)) {
            return this.tableCheckedStatus.booleanValue();
        }
        Cursor execQuery = this.f24028db.execQuery("SELECT COUNT(*) AS c FROM sqlite_master WHERE type='table' AND name='" + this.name + "'");
        if (execQuery != null) {
            try {
                if (execQuery.moveToNext() && execQuery.getInt(0) > 0) {
                    this.tableCheckedStatus = Boolean.TRUE;
                    return this.tableCheckedStatus.booleanValue();
                }
            } finally {
            }
        }
        this.tableCheckedStatus = Boolean.FALSE;
        return this.tableCheckedStatus.booleanValue();
    }
}
