package com.raizlabs.android.dbflow.sql.language;

import com.raizlabs.android.dbflow.annotation.Collate;
import com.raizlabs.android.dbflow.sql.Query;
import com.raizlabs.android.dbflow.sql.language.property.IProperty;

/* loaded from: classes2.dex */
public class OrderBy implements Query {
    public static final String ASCENDING = "ASC";
    public static final String DESCENDING = "DESC";
    private Collate collation;
    private NameAlias column;
    private boolean isAscending;
    private String orderByString;

    OrderBy(NameAlias nameAlias) {
        this.column = nameAlias;
    }

    public static OrderBy fromNameAlias(NameAlias nameAlias) {
        return new OrderBy(nameAlias);
    }

    public static OrderBy fromProperty(IProperty iProperty) {
        return new OrderBy(iProperty.getNameAlias());
    }

    public static OrderBy fromString(String str) {
        return new OrderBy(str);
    }

    public OrderBy ascending() {
        this.isAscending = true;
        return this;
    }

    public OrderBy collate(Collate collate) {
        this.collation = collate;
        return this;
    }

    public OrderBy descending() {
        this.isAscending = false;
        return this;
    }

    @Override // com.raizlabs.android.dbflow.sql.Query
    public String getQuery() {
        String str;
        String str2 = this.orderByString;
        if (str2 == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.column);
            sb2.append(" ");
            if (this.collation != null) {
                sb2.append("COLLATE");
                sb2.append(" ");
                sb2.append(this.collation);
                sb2.append(" ");
            }
            if (this.isAscending) {
                str = ASCENDING;
            } else {
                str = DESCENDING;
            }
            sb2.append(str);
            return sb2.toString();
        }
        return str2;
    }

    public String toString() {
        return getQuery();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public OrderBy(NameAlias nameAlias, boolean z10) {
        this(nameAlias);
        this.isAscending = z10;
    }

    OrderBy(String str) {
        this.orderByString = str;
    }
}
