package org.xutils.p274db.sqlite;

import android.text.TextUtils;
import com.raizlabs.android.dbflow.sql.language.Operator;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.xutils.p274db.table.ColumnUtils;

/* loaded from: classes3.dex */
public class WhereBuilder {
    private final List<String> whereItems = new ArrayList();

    private WhereBuilder() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.List, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Iterable] */
    private void appendCondition(String str, String str2, String str3, Object obj) {
        StringBuilder sb2 = new StringBuilder();
        if (this.whereItems.size() > 0) {
            sb2.append(" ");
        }
        if (!TextUtils.isEmpty(str)) {
            sb2.append(str);
            sb2.append(" ");
        }
        sb2.append("\"");
        sb2.append(str2);
        sb2.append("\"");
        if (Operator.Operation.NOT_EQUALS.equals(str3)) {
            str3 = "<>";
        } else if ("==".equals(str3)) {
            str3 = Operator.Operation.EQUALS;
        }
        if (obj == null) {
            if (Operator.Operation.EQUALS.equals(str3)) {
                sb2.append(" IS NULL");
            } else if ("<>".equals(str3)) {
                sb2.append(" IS NOT NULL");
            } else {
                sb2.append(" ");
                sb2.append(str3);
                sb2.append(" NULL");
            }
        } else {
            sb2.append(" ");
            sb2.append(str3);
            sb2.append(" ");
            int i10 = 0;
            Object r22 = 0;
            Object arrayList = 0;
            if (Operator.Operation.f12581IN.equalsIgnoreCase(str3)) {
                if (obj instanceof Iterable) {
                    arrayList = (Iterable) obj;
                } else if (obj.getClass().isArray()) {
                    int length = Array.getLength(obj);
                    arrayList = new ArrayList(length);
                    while (i10 < length) {
                        arrayList.add(Array.get(obj, i10));
                        i10++;
                    }
                }
                if (arrayList != 0) {
                    StringBuilder sb3 = new StringBuilder("(");
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Object convert2DbValueIfNeeded = ColumnUtils.convert2DbValueIfNeeded(it.next());
                        if (ColumnUtils.isTextColumnDbType(convert2DbValueIfNeeded)) {
                            String convert2SafeExpr = ColumnUtils.convert2SafeExpr(convert2DbValueIfNeeded);
                            sb3.append("'");
                            sb3.append(convert2SafeExpr);
                            sb3.append("'");
                        } else {
                            sb3.append(convert2DbValueIfNeeded);
                        }
                        sb3.append(",");
                    }
                    if (sb3.length() > 1) {
                        sb3.deleteCharAt(sb3.length() - 1);
                    }
                    sb3.append(")");
                    sb2.append(sb3.toString());
                } else {
                    throw new IllegalArgumentException("value must be an Array or an Iterable.");
                }
            } else if (Operator.Operation.BETWEEN.equalsIgnoreCase(str3)) {
                if (obj instanceof Iterable) {
                    r22 = (Iterable) obj;
                } else if (obj.getClass().isArray()) {
                    int length2 = Array.getLength(obj);
                    r22 = new ArrayList(length2);
                    while (i10 < length2) {
                        r22.add(Array.get(obj, i10));
                        i10++;
                    }
                }
                if (r22 != 0) {
                    Iterator it2 = r22.iterator();
                    if (it2.hasNext()) {
                        Object next = it2.next();
                        if (it2.hasNext()) {
                            Object next2 = it2.next();
                            Object convert2DbValueIfNeeded2 = ColumnUtils.convert2DbValueIfNeeded(next);
                            Object convert2DbValueIfNeeded3 = ColumnUtils.convert2DbValueIfNeeded(next2);
                            if (ColumnUtils.isTextColumnDbType(convert2DbValueIfNeeded2)) {
                                String convert2SafeExpr2 = ColumnUtils.convert2SafeExpr(convert2DbValueIfNeeded2);
                                String convert2SafeExpr3 = ColumnUtils.convert2SafeExpr(convert2DbValueIfNeeded3);
                                sb2.append("'");
                                sb2.append(convert2SafeExpr2);
                                sb2.append("'");
                                sb2.append(" AND ");
                                sb2.append("'");
                                sb2.append(convert2SafeExpr3);
                                sb2.append("'");
                            } else {
                                sb2.append(convert2DbValueIfNeeded2);
                                sb2.append(" AND ");
                                sb2.append(convert2DbValueIfNeeded3);
                            }
                        } else {
                            throw new IllegalArgumentException("value must contains tow items.");
                        }
                    } else {
                        throw new IllegalArgumentException("value must contains tow items.");
                    }
                } else {
                    throw new IllegalArgumentException("value must be an Array or an Iterable.");
                }
            } else {
                Object convert2DbValueIfNeeded4 = ColumnUtils.convert2DbValueIfNeeded(obj);
                if (ColumnUtils.isTextColumnDbType(convert2DbValueIfNeeded4)) {
                    String convert2SafeExpr4 = ColumnUtils.convert2SafeExpr(convert2DbValueIfNeeded4);
                    sb2.append("'");
                    sb2.append(convert2SafeExpr4);
                    sb2.append("'");
                } else {
                    sb2.append(convert2DbValueIfNeeded4);
                }
            }
        }
        this.whereItems.add(sb2.toString());
    }

    /* renamed from: b */
    public static WhereBuilder m24390b() {
        return new WhereBuilder();
    }

    public WhereBuilder and(String str, String str2, Object obj) {
        appendCondition(this.whereItems.size() == 0 ? null : Operator.Operation.AND, str, str2, obj);
        return this;
    }

    public WhereBuilder expr(String str) {
        this.whereItems.add(" " + str);
        return this;
    }

    public int getWhereItemSize() {
        return this.whereItems.size();
    }

    /* renamed from: or */
    public WhereBuilder m24392or(String str, String str2, Object obj) {
        appendCondition(this.whereItems.size() == 0 ? null : Operator.Operation.f12582OR, str, str2, obj);
        return this;
    }

    public String toString() {
        if (this.whereItems.size() == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        Iterator<String> it = this.whereItems.iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
        }
        return sb2.toString();
    }

    /* renamed from: b */
    public static WhereBuilder m24391b(String str, String str2, Object obj) {
        WhereBuilder whereBuilder = new WhereBuilder();
        whereBuilder.appendCondition(null, str, str2, obj);
        return whereBuilder;
    }

    public WhereBuilder and(WhereBuilder whereBuilder) {
        return expr((this.whereItems.size() == 0 ? " " : "AND ") + "(" + whereBuilder.toString() + ")");
    }

    /* renamed from: or */
    public WhereBuilder m24393or(WhereBuilder whereBuilder) {
        return expr((this.whereItems.size() == 0 ? " " : "OR ") + "(" + whereBuilder.toString() + ")");
    }
}
