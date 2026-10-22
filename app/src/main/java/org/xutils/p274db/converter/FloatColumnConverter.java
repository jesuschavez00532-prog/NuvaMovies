package org.xutils.p274db.converter;

import android.database.Cursor;
import org.xutils.p274db.sqlite.ColumnDbType;

/* loaded from: classes3.dex */
public class FloatColumnConverter implements ColumnConverter<Float> {
    @Override // org.xutils.p274db.converter.ColumnConverter
    public Object fieldValue2DbValue(Float f10) {
        return f10;
    }

    @Override // org.xutils.p274db.converter.ColumnConverter
    public ColumnDbType getColumnDbType() {
        return ColumnDbType.REAL;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.xutils.p274db.converter.ColumnConverter
    public Float getFieldValue(Cursor cursor, int i10) {
        if (cursor.isNull(i10)) {
            return null;
        }
        return Float.valueOf(cursor.getFloat(i10));
    }
}
