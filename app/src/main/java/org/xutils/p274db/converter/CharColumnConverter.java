package org.xutils.p274db.converter;

import android.database.Cursor;
import org.xutils.p274db.sqlite.ColumnDbType;

/* loaded from: classes3.dex */
public class CharColumnConverter implements ColumnConverter<Character> {
    @Override // org.xutils.p274db.converter.ColumnConverter
    public ColumnDbType getColumnDbType() {
        return ColumnDbType.INTEGER;
    }

    @Override // org.xutils.p274db.converter.ColumnConverter
    public Object fieldValue2DbValue(Character ch) {
        if (ch == null) {
            return null;
        }
        return Integer.valueOf(ch.charValue());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.xutils.p274db.converter.ColumnConverter
    public Character getFieldValue(Cursor cursor, int i10) {
        if (cursor.isNull(i10)) {
            return null;
        }
        return Character.valueOf((char) cursor.getInt(i10));
    }
}
