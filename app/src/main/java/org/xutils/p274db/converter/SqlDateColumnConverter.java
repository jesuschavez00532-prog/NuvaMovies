package org.xutils.p274db.converter;

import android.database.Cursor;
import java.sql.Date;
import org.xutils.p274db.sqlite.ColumnDbType;

/* loaded from: classes3.dex */
public class SqlDateColumnConverter implements ColumnConverter<Date> {
    @Override // org.xutils.p274db.converter.ColumnConverter
    public ColumnDbType getColumnDbType() {
        return ColumnDbType.INTEGER;
    }

    @Override // org.xutils.p274db.converter.ColumnConverter
    public Object fieldValue2DbValue(Date date) {
        if (date == null) {
            return null;
        }
        return Long.valueOf(date.getTime());
    }

    @Override // org.xutils.p274db.converter.ColumnConverter
    public Date getFieldValue(Cursor cursor, int i10) {
        if (cursor.isNull(i10)) {
            return null;
        }
        return new Date(cursor.getLong(i10));
    }
}
