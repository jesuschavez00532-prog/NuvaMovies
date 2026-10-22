package org.xutils.p274db.converter;

import android.database.Cursor;
import org.xutils.p274db.sqlite.ColumnDbType;

/* loaded from: classes3.dex */
public interface ColumnConverter<T> {
    Object fieldValue2DbValue(T t10);

    ColumnDbType getColumnDbType();

    T getFieldValue(Cursor cursor, int i10);
}
