package org.xutils.p274db.sqlite;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import java.util.ArrayList;
import java.util.List;
import org.xutils.common.util.KeyValue;
import org.xutils.p274db.converter.ColumnConverter;
import org.xutils.p274db.converter.ColumnConverterFactory;
import org.xutils.p274db.table.ColumnUtils;

/* loaded from: classes3.dex */
public final class SqlInfo {
    private List<KeyValue> bindArgs;
    private String sql;

    /* renamed from: org.xutils.db.sqlite.SqlInfo$a */
    /* loaded from: classes3.dex */
    static /* synthetic */ class C6093a {

        /* renamed from: a */
        static final /* synthetic */ int[] f24027a;

        static {
            int[] iArr = new int[ColumnDbType.values().length];
            f24027a = iArr;
            try {
                iArr[ColumnDbType.INTEGER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24027a[ColumnDbType.REAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24027a[ColumnDbType.TEXT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24027a[ColumnDbType.BLOB.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public SqlInfo() {
    }

    public void addBindArg(KeyValue keyValue) {
        if (this.bindArgs == null) {
            this.bindArgs = new ArrayList();
        }
        this.bindArgs.add(keyValue);
    }

    public void addBindArgs(List<KeyValue> list) {
        List<KeyValue> list2 = this.bindArgs;
        if (list2 == null) {
            this.bindArgs = list;
        } else {
            list2.addAll(list);
        }
    }

    public SQLiteStatement buildStatement(SQLiteDatabase sQLiteDatabase) {
        SQLiteStatement compileStatement = sQLiteDatabase.compileStatement(this.sql);
        if (this.bindArgs != null) {
            for (int i10 = 1; i10 < this.bindArgs.size() + 1; i10++) {
                KeyValue keyValue = this.bindArgs.get(i10 - 1);
                Object obj = keyValue.value;
                if (obj == null) {
                    compileStatement.bindNull(i10);
                } else {
                    ColumnConverter columnConverter = ColumnConverterFactory.getColumnConverter(obj.getClass());
                    Object fieldValue2DbValue = columnConverter.fieldValue2DbValue(keyValue.value);
                    int i11 = C6093a.f24027a[columnConverter.getColumnDbType().ordinal()];
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                if (i11 != 4) {
                                    compileStatement.bindNull(i10);
                                } else {
                                    compileStatement.bindBlob(i10, (byte[]) fieldValue2DbValue);
                                }
                            } else {
                                compileStatement.bindString(i10, fieldValue2DbValue.toString());
                            }
                        } else {
                            compileStatement.bindDouble(i10, ((Number) fieldValue2DbValue).doubleValue());
                        }
                    } else {
                        compileStatement.bindLong(i10, ((Number) fieldValue2DbValue).longValue());
                    }
                }
            }
        }
        return compileStatement;
    }

    public Object[] getBindArgs() {
        List<KeyValue> list = this.bindArgs;
        if (list != null) {
            Object[] objArr = new Object[list.size()];
            for (int i10 = 0; i10 < this.bindArgs.size(); i10++) {
                objArr[i10] = ColumnUtils.convert2DbValueIfNeeded(this.bindArgs.get(i10).value);
            }
            return objArr;
        }
        return null;
    }

    public String[] getBindArgsAsStrArray() {
        String obj;
        List<KeyValue> list = this.bindArgs;
        if (list == null) {
            return null;
        }
        String[] strArr = new String[list.size()];
        for (int i10 = 0; i10 < this.bindArgs.size(); i10++) {
            Object convert2DbValueIfNeeded = ColumnUtils.convert2DbValueIfNeeded(this.bindArgs.get(i10).value);
            if (convert2DbValueIfNeeded == null) {
                obj = null;
            } else {
                obj = convert2DbValueIfNeeded.toString();
            }
            strArr[i10] = obj;
        }
        return strArr;
    }

    public String getSql() {
        return this.sql;
    }

    public void setSql(String str) {
        this.sql = str;
    }

    public SqlInfo(String str) {
        this.sql = str;
    }
}
