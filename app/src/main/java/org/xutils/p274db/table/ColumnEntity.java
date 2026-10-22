package org.xutils.p274db.table;

import android.database.Cursor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import org.xutils.common.util.LogUtil;
import org.xutils.p274db.annotation.Column;
import org.xutils.p274db.converter.ColumnConverter;
import org.xutils.p274db.converter.ColumnConverterFactory;
import org.xutils.p274db.sqlite.ColumnDbType;

/* loaded from: classes3.dex */
public final class ColumnEntity {
    protected final ColumnConverter columnConverter;
    protected final Field columnField;
    protected final Method getMethod;
    private final boolean isAutoId;
    private final boolean isId;
    protected final String name;
    private final String property;
    protected final Method setMethod;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColumnEntity(Class<?> cls, Field field, Column column) {
        boolean z10;
        field.setAccessible(true);
        this.columnField = field;
        this.name = column.name();
        this.property = column.property();
        boolean isId = column.isId();
        this.isId = isId;
        Class<?> type = field.getType();
        if (isId && column.autoGen() && ColumnUtils.isAutoIdType(type)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.isAutoId = z10;
        this.columnConverter = ColumnConverterFactory.getColumnConverter(type);
        Method findGetMethod = ColumnUtils.findGetMethod(cls, field);
        this.getMethod = findGetMethod;
        if (findGetMethod != null && !findGetMethod.isAccessible()) {
            findGetMethod.setAccessible(true);
        }
        Method findSetMethod = ColumnUtils.findSetMethod(cls, field);
        this.setMethod = findSetMethod;
        if (findSetMethod != null && !findSetMethod.isAccessible()) {
            findSetMethod.setAccessible(true);
        }
    }

    public ColumnConverter getColumnConverter() {
        return this.columnConverter;
    }

    public ColumnDbType getColumnDbType() {
        return this.columnConverter.getColumnDbType();
    }

    public Field getColumnField() {
        return this.columnField;
    }

    public Object getColumnValue(Object obj) {
        Object fieldValue = getFieldValue(obj);
        if (this.isAutoId && (fieldValue.equals(0L) || fieldValue.equals(0))) {
            return null;
        }
        return this.columnConverter.fieldValue2DbValue(fieldValue);
    }

    public Object getFieldValue(Object obj) {
        if (obj != null) {
            Method method = this.getMethod;
            if (method != null) {
                try {
                    return method.invoke(obj, new Object[0]);
                } catch (Throwable th) {
                    LogUtil.m24376e(th.getMessage(), th);
                }
            } else {
                try {
                    return this.columnField.get(obj);
                } catch (Throwable th2) {
                    LogUtil.m24376e(th2.getMessage(), th2);
                }
            }
        }
        return null;
    }

    public String getName() {
        return this.name;
    }

    public String getProperty() {
        return this.property;
    }

    public boolean isAutoId() {
        return this.isAutoId;
    }

    public boolean isId() {
        return this.isId;
    }

    public void setAutoIdValue(Object obj, long j10) {
        Object valueOf = Long.valueOf(j10);
        if (ColumnUtils.isInteger(this.columnField.getType())) {
            valueOf = Integer.valueOf((int) j10);
        }
        Method method = this.setMethod;
        if (method != null) {
            try {
                method.invoke(obj, valueOf);
                return;
            } catch (Throwable th) {
                LogUtil.m24376e(th.getMessage(), th);
                return;
            }
        }
        try {
            this.columnField.set(obj, valueOf);
        } catch (Throwable th2) {
            LogUtil.m24376e(th2.getMessage(), th2);
        }
    }

    public void setValueFromCursor(Object obj, Cursor cursor, int i10) {
        Object fieldValue = this.columnConverter.getFieldValue(cursor, i10);
        if (fieldValue == null) {
            return;
        }
        Method method = this.setMethod;
        if (method != null) {
            try {
                method.invoke(obj, fieldValue);
                return;
            } catch (Throwable th) {
                LogUtil.m24376e(th.getMessage(), th);
                return;
            }
        }
        try {
            this.columnField.set(obj, fieldValue);
        } catch (Throwable th2) {
            LogUtil.m24376e(th2.getMessage(), th2);
        }
    }

    public String toString() {
        return this.name;
    }
}
