package org.xutils.p274db.converter;

import android.database.Cursor;
import org.xutils.p274db.sqlite.ColumnDbType;

/* loaded from: classes3.dex */
public class ShortColumnConverter implements ColumnConverter<Short> {
    @Override // org.xutils.p274db.converter.ColumnConverter
    public Object fieldValue2DbValue(Short sh) {
        return sh;
    }

    @Override // org.xutils.p274db.converter.ColumnConverter
    public ColumnDbType getColumnDbType() {
        return ColumnDbType.INTEGER;
    }

    @Override // org.xutils.p274db.converter.ColumnConverter
    public Short getFieldValue(Cursor cursor, int i10) {
        if (cursor.isNull(i10)) {
            return null;
        }
        return Short.valueOf(cursor.getShort(i10));
    }
}
