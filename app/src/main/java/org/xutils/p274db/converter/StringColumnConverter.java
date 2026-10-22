package org.xutils.p274db.converter;

import android.database.Cursor;
import org.xutils.p274db.sqlite.ColumnDbType;

/* loaded from: classes3.dex */
public class StringColumnConverter implements ColumnConverter<String> {
    @Override // org.xutils.p274db.converter.ColumnConverter
    public Object fieldValue2DbValue(String str) {
        return str;
    }

    @Override // org.xutils.p274db.converter.ColumnConverter
    public ColumnDbType getColumnDbType() {
        return ColumnDbType.TEXT;
    }

    @Override // org.xutils.p274db.converter.ColumnConverter
    public String getFieldValue(Cursor cursor, int i10) {
        if (cursor.isNull(i10)) {
            return null;
        }
        return cursor.getString(i10);
    }
}
