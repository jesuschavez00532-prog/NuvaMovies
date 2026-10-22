package org.xutils.p274db.table;

import android.database.Cursor;
import java.util.HashMap;
import java.util.Iterator;
import org.xutils.DbManager;
import org.xutils.common.util.IOUtil;
import org.xutils.common.util.LogUtil;
import org.xutils.p275ex.DbException;

/* loaded from: classes3.dex */
public abstract class DbBase implements DbManager {
    private final HashMap<Class<?>, TableEntity<?>> tableMap = new HashMap<>();

    @Override // org.xutils.DbManager
    public void addColumn(Class<?> cls, String str) {
        TableEntity table = getTable(cls);
        ColumnEntity columnEntity = table.getColumnMap().get(str);
        if (columnEntity != null) {
            if (!table.tableIsExists()) {
                return;
            }
            execNonQuery("ALTER TABLE \"" + table.getName() + "\" ADD COLUMN \"" + columnEntity.getName() + "\" " + columnEntity.getColumnDbType() + " " + columnEntity.getProperty());
            return;
        }
        throw new DbException("the column(" + str + ") is not defined in table: " + table.getName());
    }

    @Override // org.xutils.DbManager
    public void dropDb() {
        Cursor execQuery = execQuery("SELECT name FROM sqlite_master WHERE type='table' AND name<>'sqlite_sequence'");
        if (execQuery != null) {
            while (execQuery.moveToNext()) {
                try {
                    try {
                        execNonQuery("DROP TABLE " + execQuery.getString(0));
                    } catch (Throwable th) {
                        LogUtil.m24376e(th.getMessage(), th);
                    }
                } catch (Throwable th2) {
                    try {
                        throw new DbException(th2);
                    } finally {
                        IOUtil.closeQuietly(execQuery);
                    }
                }
            }
            synchronized (this.tableMap) {
                Iterator<TableEntity<?>> it = this.tableMap.values().iterator();
                while (it.hasNext()) {
                    it.next().setTableCheckedStatus(false);
                }
                this.tableMap.clear();
            }
        }
    }

    @Override // org.xutils.DbManager
    public void dropTable(Class<?> cls) {
        TableEntity table = getTable(cls);
        if (!table.tableIsExists()) {
            return;
        }
        execNonQuery("DROP TABLE \"" + table.getName() + "\"");
        table.setTableCheckedStatus(false);
        removeTable(cls);
    }

    @Override // org.xutils.DbManager
    public <T> TableEntity<T> getTable(Class<T> cls) {
        TableEntity<T> tableEntity;
        synchronized (this.tableMap) {
            tableEntity = (TableEntity) this.tableMap.get(cls);
            if (tableEntity == null) {
                try {
                    tableEntity = new TableEntity<>(this, cls);
                    this.tableMap.put(cls, tableEntity);
                } catch (DbException e10) {
                    throw e10;
                } catch (Throwable th) {
                    throw new DbException(th);
                }
            }
        }
        return tableEntity;
    }

    protected void removeTable(Class<?> cls) {
        synchronized (this.tableMap) {
            this.tableMap.remove(cls);
        }
    }
}
