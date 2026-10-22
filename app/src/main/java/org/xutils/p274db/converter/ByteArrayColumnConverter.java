package org.xutils.p274db.converter;

import android.database.Cursor;
import org.xutils.p274db.sqlite.ColumnDbType;

/* loaded from: classes3.dex */
public class ByteArrayColumnConverter implements ColumnConverter<byte[]> {
    @Override // org.xutils.p274db.converter.ColumnConverter
    public Object fieldValue2DbValue(byte[] bArr) {
        return bArr;
    }

    @Override // org.xutils.p274db.converter.ColumnConverter
    public ColumnDbType getColumnDbType() {
        return ColumnDbType.BLOB;
    }

    @Override // org.xutils.p274db.converter.ColumnConverter
    public byte[] getFieldValue(Cursor cursor, int i10) {
        if (cursor.isNull(i10)) {
            return null;
        }
        return cursor.getBlob(i10);
    }
}
