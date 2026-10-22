package org.xutils.p274db;

import android.database.Cursor;
import android.text.TextUtils;
import com.raizlabs.android.dbflow.sql.language.Operator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.xutils.p274db.Selector;
import org.xutils.p274db.sqlite.WhereBuilder;
import org.xutils.p274db.table.DbModel;
import org.xutils.p274db.table.TableEntity;

/* loaded from: classes3.dex */
public final class DbModelSelector {
    private String[] columnExpressions;
    private String groupByColumnName;
    private WhereBuilder having;
    private Selector<?> selector;

    private DbModelSelector(TableEntity<?> tableEntity) {
        this.selector = Selector.from(tableEntity);
    }

    static DbModelSelector from(TableEntity<?> tableEntity) {
        return new DbModelSelector(tableEntity);
    }

    public DbModelSelector and(String str, String str2, Object obj) {
        this.selector.and(str, str2, obj);
        return this;
    }

    public DbModelSelector expr(String str) {
        this.selector.expr(str);
        return this;
    }

    public List<DbModel> findAll() {
        TableEntity<?> table = this.selector.getTable();
        ArrayList arrayList = null;
        if (!table.tableIsExists()) {
            return null;
        }
        Cursor execQuery = table.getDb().execQuery(toString());
        if (execQuery != null) {
            try {
                arrayList = new ArrayList();
                while (execQuery.moveToNext()) {
                    arrayList.add(AbstractC6092a.m24388a(execQuery));
                }
            } finally {
            }
        }
        return arrayList;
    }

    public DbModel findFirst() {
        TableEntity<?> table = this.selector.getTable();
        if (!table.tableIsExists()) {
            return null;
        }
        limit(1);
        Cursor execQuery = table.getDb().execQuery(toString());
        if (execQuery != null) {
            try {
                if (execQuery.moveToNext()) {
                    return AbstractC6092a.m24388a(execQuery);
                }
            } finally {
            }
        }
        return null;
    }

    public TableEntity<?> getTable() {
        return this.selector.getTable();
    }

    public DbModelSelector groupBy(String str) {
        this.groupByColumnName = str;
        return this;
    }

    public DbModelSelector having(WhereBuilder whereBuilder) {
        this.having = whereBuilder;
        return this;
    }

    public DbModelSelector limit(int i10) {
        this.selector.limit(i10);
        return this;
    }

    public DbModelSelector offset(int i10) {
        this.selector.offset(i10);
        return this;
    }

    /* renamed from: or */
    public DbModelSelector m24384or(String str, String str2, Object obj) {
        this.selector.m24386or(str, str2, obj);
        return this;
    }

    public DbModelSelector orderBy(String str) {
        this.selector.orderBy(str);
        return this;
    }

    public DbModelSelector select(String... strArr) {
        this.columnExpressions = strArr;
        return this;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SELECT ");
        String[] strArr = this.columnExpressions;
        if (strArr != null && strArr.length > 0) {
            for (String str : strArr) {
                sb2.append(str);
                sb2.append(",");
            }
            sb2.deleteCharAt(sb2.length() - 1);
        } else if (!TextUtils.isEmpty(this.groupByColumnName)) {
            sb2.append(this.groupByColumnName);
        } else {
            sb2.append(Operator.Operation.MULTIPLY);
        }
        sb2.append(" FROM ");
        sb2.append("\"");
        sb2.append(this.selector.getTable().getName());
        sb2.append("\"");
        WhereBuilder whereBuilder = this.selector.getWhereBuilder();
        if (whereBuilder != null && whereBuilder.getWhereItemSize() > 0) {
            sb2.append(" WHERE ");
            sb2.append(whereBuilder.toString());
        }
        if (!TextUtils.isEmpty(this.groupByColumnName)) {
            sb2.append(" GROUP BY ");
            sb2.append("\"");
            sb2.append(this.groupByColumnName);
            sb2.append("\"");
            WhereBuilder whereBuilder2 = this.having;
            if (whereBuilder2 != null && whereBuilder2.getWhereItemSize() > 0) {
                sb2.append(" HAVING ");
                sb2.append(this.having.toString());
            }
        }
        List<Selector.OrderBy> orderByList = this.selector.getOrderByList();
        if (orderByList != null && orderByList.size() > 0) {
            sb2.append(" ORDER BY ");
            Iterator<Selector.OrderBy> it = orderByList.iterator();
            while (it.hasNext()) {
                sb2.append(it.next().toString());
                sb2.append(',');
            }
            sb2.deleteCharAt(sb2.length() - 1);
        }
        if (this.selector.getLimit() > 0) {
            sb2.append(" LIMIT ");
            sb2.append(this.selector.getLimit());
            sb2.append(" OFFSET ");
            sb2.append(this.selector.getOffset());
        }
        return sb2.toString();
    }

    public DbModelSelector where(WhereBuilder whereBuilder) {
        this.selector.where(whereBuilder);
        return this;
    }

    public DbModelSelector and(WhereBuilder whereBuilder) {
        this.selector.and(whereBuilder);
        return this;
    }

    /* renamed from: or */
    public DbModelSelector m24385or(WhereBuilder whereBuilder) {
        this.selector.m24387or(whereBuilder);
        return this;
    }

    public DbModelSelector orderBy(String str, boolean z10) {
        this.selector.orderBy(str, z10);
        return this;
    }

    public DbModelSelector where(String str, String str2, Object obj) {
        this.selector.where(str, str2, obj);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public DbModelSelector(Selector<?> selector, String str) {
        this.selector = selector;
        this.groupByColumnName = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public DbModelSelector(Selector<?> selector, String[] strArr) {
        this.selector = selector;
        this.columnExpressions = strArr;
    }
}
