package org.xutils.p274db.converter;

import android.database.Cursor;
import org.xutils.p274db.sqlite.ColumnDbType;

/* loaded from: classes3.dex */
public class DoubleColumnConverter implements ColumnConverter<Double> {
    @Override // org.xutils.p274db.converter.ColumnConverter
    public Object fieldValue2DbValue(Double d10) {
        return d10;
    }

    @Override // org.xutils.p274db.converter.ColumnConverter
    public ColumnDbType getColumnDbType() {
        return ColumnDbType.REAL;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.xutils.p274db.converter.ColumnConverter
    public Double getFieldValue(Cursor cursor, int i10) {
        if (cursor.isNull(i10)) {
            return null;
        }
        return Double.valueOf(cursor.getDouble(i10));
    }
}
