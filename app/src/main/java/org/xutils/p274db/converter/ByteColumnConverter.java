package org.xutils.p274db.converter;

import android.database.Cursor;
import org.xutils.p274db.sqlite.ColumnDbType;

/* loaded from: classes3.dex */
public class ByteColumnConverter implements ColumnConverter<Byte> {
    @Override // org.xutils.p274db.converter.ColumnConverter
    public Object fieldValue2DbValue(Byte b10) {
        return b10;
    }

    @Override // org.xutils.p274db.converter.ColumnConverter
    public ColumnDbType getColumnDbType() {
        return ColumnDbType.INTEGER;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.xutils.p274db.converter.ColumnConverter
    public Byte getFieldValue(Cursor cursor, int i10) {
        if (cursor.isNull(i10)) {
            return null;
        }
        return Byte.valueOf((byte) cursor.getInt(i10));
    }
}
