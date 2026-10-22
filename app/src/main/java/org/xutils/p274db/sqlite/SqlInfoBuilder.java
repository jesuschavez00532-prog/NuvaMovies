package org.xutils.p274db.sqlite;

import com.raizlabs.android.dbflow.sql.language.Operator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.xutils.common.util.KeyValue;
import org.xutils.p274db.table.ColumnEntity;
import org.xutils.p274db.table.TableEntity;
import org.xutils.p275ex.DbException;

/* loaded from: classes3.dex */
public final class SqlInfoBuilder {
    private static final ConcurrentHashMap<TableEntity<?>, String> INSERT_SQL_CACHE = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<TableEntity<?>, String> REPLACE_SQL_CACHE = new ConcurrentHashMap<>();

    private SqlInfoBuilder() {
    }

    public static SqlInfo buildCreateTableSqlInfo(TableEntity<?> tableEntity) {
        ColumnEntity id2 = tableEntity.getId();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("CREATE TABLE IF NOT EXISTS ");
        sb2.append("\"");
        sb2.append(tableEntity.getName());
        sb2.append("\"");
        sb2.append(" ( ");
        if (id2.isAutoId()) {
            sb2.append("\"");
            sb2.append(id2.getName());
            sb2.append("\"");
            sb2.append(" INTEGER PRIMARY KEY AUTOINCREMENT, ");
        } else {
            sb2.append("\"");
            sb2.append(id2.getName());
            sb2.append("\"");
            sb2.append(id2.getColumnDbType());
            sb2.append(" PRIMARY KEY, ");
        }
        for (ColumnEntity columnEntity : tableEntity.getColumnMap().values()) {
            if (!columnEntity.isId()) {
                sb2.append("\"");
                sb2.append(columnEntity.getName());
                sb2.append("\"");
                sb2.append(' ');
                sb2.append(columnEntity.getColumnDbType());
                sb2.append(' ');
                sb2.append(columnEntity.getProperty());
                sb2.append(',');
            }
        }
        sb2.deleteCharAt(sb2.length() - 1);
        sb2.append(" )");
        return new SqlInfo(sb2.toString());
    }

    public static SqlInfo buildDeleteSqlInfo(TableEntity<?> tableEntity, Object obj) {
        SqlInfo sqlInfo = new SqlInfo();
        ColumnEntity id2 = tableEntity.getId();
        Object columnValue = id2.getColumnValue(obj);
        if (columnValue != null) {
            sqlInfo.setSql("DELETE FROM \"" + tableEntity.getName() + "\" WHERE " + WhereBuilder.m24391b(id2.getName(), Operator.Operation.EQUALS, columnValue));
            return sqlInfo;
        }
        throw new DbException("this entity[" + tableEntity.getEntityType() + "]'s id value is null");
    }

    public static SqlInfo buildDeleteSqlInfoById(TableEntity<?> tableEntity, Object obj) {
        SqlInfo sqlInfo = new SqlInfo();
        ColumnEntity id2 = tableEntity.getId();
        if (obj != null) {
            sqlInfo.setSql("DELETE FROM \"" + tableEntity.getName() + "\" WHERE " + WhereBuilder.m24391b(id2.getName(), Operator.Operation.EQUALS, obj));
            return sqlInfo;
        }
        throw new DbException("this entity[" + tableEntity.getEntityType() + "]'s id value is null");
    }

    public static SqlInfo buildInsertSqlInfo(TableEntity<?> tableEntity, Object obj) {
        List<KeyValue> entity2KeyValueList = entity2KeyValueList(tableEntity, obj);
        if (entity2KeyValueList.size() == 0) {
            return null;
        }
        SqlInfo sqlInfo = new SqlInfo();
        String str = INSERT_SQL_CACHE.get(tableEntity);
        if (str == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("INSERT INTO ");
            sb2.append("\"");
            sb2.append(tableEntity.getName());
            sb2.append("\"");
            sb2.append(" (");
            for (KeyValue keyValue : entity2KeyValueList) {
                sb2.append("\"");
                sb2.append(keyValue.key);
                sb2.append("\"");
                sb2.append(',');
            }
            sb2.deleteCharAt(sb2.length() - 1);
            sb2.append(") VALUES (");
            int size = entity2KeyValueList.size();
            for (int i10 = 0; i10 < size; i10++) {
                sb2.append("?,");
            }
            sb2.deleteCharAt(sb2.length() - 1);
            sb2.append(")");
            String sb3 = sb2.toString();
            sqlInfo.setSql(sb3);
            sqlInfo.addBindArgs(entity2KeyValueList);
            INSERT_SQL_CACHE.put(tableEntity, sb3);
        } else {
            sqlInfo.setSql(str);
            sqlInfo.addBindArgs(entity2KeyValueList);
        }
        return sqlInfo;
    }

    public static SqlInfo buildReplaceSqlInfo(TableEntity<?> tableEntity, Object obj) {
        List<KeyValue> entity2KeyValueList = entity2KeyValueList(tableEntity, obj);
        if (entity2KeyValueList.size() == 0) {
            return null;
        }
        SqlInfo sqlInfo = new SqlInfo();
        String str = REPLACE_SQL_CACHE.get(tableEntity);
        if (str == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("REPLACE INTO ");
            sb2.append("\"");
            sb2.append(tableEntity.getName());
            sb2.append("\"");
            sb2.append(" (");
            for (KeyValue keyValue : entity2KeyValueList) {
                sb2.append("\"");
                sb2.append(keyValue.key);
                sb2.append("\"");
                sb2.append(',');
            }
            sb2.deleteCharAt(sb2.length() - 1);
            sb2.append(") VALUES (");
            int size = entity2KeyValueList.size();
            for (int i10 = 0; i10 < size; i10++) {
                sb2.append("?,");
            }
            sb2.deleteCharAt(sb2.length() - 1);
            sb2.append(")");
            String sb3 = sb2.toString();
            sqlInfo.setSql(sb3);
            sqlInfo.addBindArgs(entity2KeyValueList);
            REPLACE_SQL_CACHE.put(tableEntity, sb3);
        } else {
            sqlInfo.setSql(str);
            sqlInfo.addBindArgs(entity2KeyValueList);
        }
        return sqlInfo;
    }

    public static SqlInfo buildUpdateSqlInfo(TableEntity<?> tableEntity, Object obj, String... strArr) {
        List<KeyValue> entity2KeyValueList = entity2KeyValueList(tableEntity, obj);
        HashSet hashSet = null;
        if (entity2KeyValueList.size() == 0) {
            return null;
        }
        if (strArr != null && strArr.length > 0) {
            hashSet = new HashSet(strArr.length);
            Collections.addAll(hashSet, strArr);
        }
        ColumnEntity id2 = tableEntity.getId();
        Object columnValue = id2.getColumnValue(obj);
        if (columnValue != null) {
            SqlInfo sqlInfo = new SqlInfo();
            StringBuilder sb2 = new StringBuilder("UPDATE ");
            sb2.append("\"");
            sb2.append(tableEntity.getName());
            sb2.append("\"");
            sb2.append(" SET ");
            for (KeyValue keyValue : entity2KeyValueList) {
                if (hashSet == null || hashSet.contains(keyValue.key)) {
                    sb2.append("\"");
                    sb2.append(keyValue.key);
                    sb2.append("\"");
                    sb2.append("=?,");
                    sqlInfo.addBindArg(keyValue);
                }
            }
            sb2.deleteCharAt(sb2.length() - 1);
            sb2.append(" WHERE ");
            sb2.append(WhereBuilder.m24391b(id2.getName(), Operator.Operation.EQUALS, columnValue));
            sqlInfo.setSql(sb2.toString());
            return sqlInfo;
        }
        throw new DbException("this entity[" + tableEntity.getEntityType() + "]'s id value is null");
    }

    private static KeyValue column2KeyValue(Object obj, ColumnEntity columnEntity) {
        if (columnEntity.isAutoId()) {
            return null;
        }
        return new KeyValue(columnEntity.getName(), columnEntity.getFieldValue(obj));
    }

    public static List<KeyValue> entity2KeyValueList(TableEntity<?> tableEntity, Object obj) {
        Collection<ColumnEntity> values = tableEntity.getColumnMap().values();
        ArrayList arrayList = new ArrayList(values.size());
        Iterator<ColumnEntity> it = values.iterator();
        while (it.hasNext()) {
            KeyValue column2KeyValue = column2KeyValue(obj, it.next());
            if (column2KeyValue != null) {
                arrayList.add(column2KeyValue);
            }
        }
        return arrayList;
    }

    public static SqlInfo buildDeleteSqlInfo(TableEntity<?> tableEntity, WhereBuilder whereBuilder) {
        StringBuilder sb2 = new StringBuilder("DELETE FROM ");
        sb2.append("\"");
        sb2.append(tableEntity.getName());
        sb2.append("\"");
        if (whereBuilder != null && whereBuilder.getWhereItemSize() > 0) {
            sb2.append(" WHERE ");
            sb2.append(whereBuilder.toString());
        }
        return new SqlInfo(sb2.toString());
    }

    public static SqlInfo buildUpdateSqlInfo(TableEntity<?> tableEntity, WhereBuilder whereBuilder, KeyValue... keyValueArr) {
        if (keyValueArr == null || keyValueArr.length == 0) {
            return null;
        }
        SqlInfo sqlInfo = new SqlInfo();
        StringBuilder sb2 = new StringBuilder("UPDATE ");
        sb2.append("\"");
        sb2.append(tableEntity.getName());
        sb2.append("\"");
        sb2.append(" SET ");
        for (KeyValue keyValue : keyValueArr) {
            sb2.append("\"");
            sb2.append(keyValue.key);
            sb2.append("\"");
            sb2.append("=?,");
            sqlInfo.addBindArg(keyValue);
        }
        sb2.deleteCharAt(sb2.length() - 1);
        if (whereBuilder != null && whereBuilder.getWhereItemSize() > 0) {
            sb2.append(" WHERE ");
            sb2.append(whereBuilder.toString());
        }
        sqlInfo.setSql(sb2.toString());
        return sqlInfo;
    }
}
