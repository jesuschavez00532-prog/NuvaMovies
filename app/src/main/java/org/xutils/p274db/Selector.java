package org.xutils.p274db;

import android.database.Cursor;
import com.raizlabs.android.dbflow.sql.language.Operator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.xutils.p274db.sqlite.WhereBuilder;
import org.xutils.p274db.table.DbModel;
import org.xutils.p274db.table.TableEntity;

/* loaded from: classes3.dex */
public final class Selector<T> {
    private int limit = 0;
    private int offset = 0;
    private List<OrderBy> orderByList;
    private final TableEntity<T> table;
    private WhereBuilder whereBuilder;

    private Selector(TableEntity<T> tableEntity) {
        this.table = tableEntity;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> Selector<T> from(TableEntity<T> tableEntity) {
        return new Selector<>(tableEntity);
    }

    public Selector<T> and(String str, String str2, Object obj) {
        this.whereBuilder.and(str, str2, obj);
        return this;
    }

    public long count() {
        if (!this.table.tableIsExists()) {
            return 0L;
        }
        DbModel findFirst = select("count(\"" + this.table.getId().getName() + "\") as count").findFirst();
        if (findFirst == null) {
            return 0L;
        }
        return findFirst.getLong("count", 0L);
    }

    public Selector<T> expr(String str) {
        if (this.whereBuilder == null) {
            this.whereBuilder = WhereBuilder.m24390b();
        }
        this.whereBuilder.expr(str);
        return this;
    }

    public List<T> findAll() {
        ArrayList arrayList = null;
        if (!this.table.tableIsExists()) {
            return null;
        }
        Cursor execQuery = this.table.getDb().execQuery(toString());
        if (execQuery != null) {
            try {
                arrayList = new ArrayList();
                while (execQuery.moveToNext()) {
                    arrayList.add(AbstractC6092a.m24389b(this.table, execQuery));
                }
            } finally {
            }
        }
        return arrayList;
    }

    public T findFirst() {
        if (!this.table.tableIsExists()) {
            return null;
        }
        limit(1);
        Cursor execQuery = this.table.getDb().execQuery(toString());
        if (execQuery != null) {
            try {
                if (execQuery.moveToNext()) {
                    return (T) AbstractC6092a.m24389b(this.table, execQuery);
                }
            } finally {
            }
        }
        return null;
    }

    public int getLimit() {
        return this.limit;
    }

    public int getOffset() {
        return this.offset;
    }

    public List<OrderBy> getOrderByList() {
        return this.orderByList;
    }

    public TableEntity<T> getTable() {
        return this.table;
    }

    public WhereBuilder getWhereBuilder() {
        return this.whereBuilder;
    }

    public DbModelSelector groupBy(String str) {
        return new DbModelSelector((Selector<?>) this, str);
    }

    public Selector<T> limit(int i10) {
        this.limit = i10;
        return this;
    }

    public Selector<T> offset(int i10) {
        this.offset = i10;
        return this;
    }

    /* renamed from: or */
    public Selector<T> m24386or(String str, String str2, Object obj) {
        this.whereBuilder.m24392or(str, str2, obj);
        return this;
    }

    public Selector<T> orderBy(String str) {
        if (this.orderByList == null) {
            this.orderByList = new ArrayList(5);
        }
        this.orderByList.add(new OrderBy(str));
        return this;
    }

    public DbModelSelector select(String... strArr) {
        return new DbModelSelector((Selector<?>) this, strArr);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SELECT ");
        sb2.append(Operator.Operation.MULTIPLY);
        sb2.append(" FROM ");
        sb2.append("\"");
        sb2.append(this.table.getName());
        sb2.append("\"");
        WhereBuilder whereBuilder = this.whereBuilder;
        if (whereBuilder != null && whereBuilder.getWhereItemSize() > 0) {
            sb2.append(" WHERE ");
            sb2.append(this.whereBuilder.toString());
        }
        List<OrderBy> list = this.orderByList;
        if (list != null && list.size() > 0) {
            sb2.append(" ORDER BY ");
            Iterator<OrderBy> it = this.orderByList.iterator();
            while (it.hasNext()) {
                sb2.append(it.next().toString());
                sb2.append(',');
            }
            sb2.deleteCharAt(sb2.length() - 1);
        }
        if (this.limit > 0) {
            sb2.append(" LIMIT ");
            sb2.append(this.limit);
            sb2.append(" OFFSET ");
            sb2.append(this.offset);
        }
        return sb2.toString();
    }

    public Selector<T> where(WhereBuilder whereBuilder) {
        this.whereBuilder = whereBuilder;
        return this;
    }

    /* loaded from: classes3.dex */
    public static class OrderBy {
        private String columnName;
        private boolean desc;

        public OrderBy(String str) {
            this.columnName = str;
        }

        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("\"");
            sb2.append(this.columnName);
            sb2.append("\"");
            if (this.desc) {
                str = " DESC";
            } else {
                str = " ASC";
            }
            sb2.append(str);
            return sb2.toString();
        }

        public OrderBy(String str, boolean z10) {
            this.columnName = str;
            this.desc = z10;
        }
    }

    public Selector<T> and(WhereBuilder whereBuilder) {
        this.whereBuilder.and(whereBuilder);
        return this;
    }

    /* renamed from: or */
    public Selector<T> m24387or(WhereBuilder whereBuilder) {
        this.whereBuilder.m24393or(whereBuilder);
        return this;
    }

    public Selector<T> where(String str, String str2, Object obj) {
        this.whereBuilder = WhereBuilder.m24391b(str, str2, obj);
        return this;
    }

    public Selector<T> orderBy(String str, boolean z10) {
        if (this.orderByList == null) {
            this.orderByList = new ArrayList(5);
        }
        this.orderByList.add(new OrderBy(str, z10));
        return this;
    }
}
