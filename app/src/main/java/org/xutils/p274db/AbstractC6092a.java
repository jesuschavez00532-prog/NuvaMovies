package org.xutils.p274db;

import android.database.Cursor;
import java.util.LinkedHashMap;
import org.xutils.p274db.table.ColumnEntity;
import org.xutils.p274db.table.DbModel;
import org.xutils.p274db.table.TableEntity;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: org.xutils.db.a */
/* loaded from: classes3.dex */
public abstract class AbstractC6092a {
    /* renamed from: a */
    public static DbModel m24388a(Cursor cursor) {
        DbModel dbModel = new DbModel();
        int columnCount = cursor.getColumnCount();
        for (int i10 = 0; i10 < columnCount; i10++) {
            dbModel.add(cursor.getColumnName(i10), cursor.getString(i10));
        }
        return dbModel;
    }

    /* renamed from: b */
    public static Object m24389b(TableEntity tableEntity, Cursor cursor) {
        Object createEntity = tableEntity.createEntity();
        LinkedHashMap<String, ColumnEntity> columnMap = tableEntity.getColumnMap();
        int columnCount = cursor.getColumnCount();
        for (int i10 = 0; i10 < columnCount; i10++) {
            ColumnEntity columnEntity = columnMap.get(cursor.getColumnName(i10));
            if (columnEntity != null) {
                columnEntity.setValueFromCursor(createEntity, cursor, i10);
            }
        }
        return createEntity;
    }
}
