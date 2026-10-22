package org.xutils.p274db.table;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.LinkedHashMap;
import org.xutils.common.util.LogUtil;
import org.xutils.p274db.annotation.Column;
import org.xutils.p274db.converter.ColumnConverterFactory;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: org.xutils.db.table.a */
/* loaded from: classes3.dex */
public abstract class AbstractC6094a {
    /* renamed from: a */
    private static void m24394a(Class cls, HashMap hashMap) {
        Column column;
        if (Object.class.equals(cls)) {
            return;
        }
        try {
            for (Field field : cls.getDeclaredFields()) {
                int modifiers = field.getModifiers();
                if (!Modifier.isStatic(modifiers) && !Modifier.isTransient(modifiers) && (column = (Column) field.getAnnotation(Column.class)) != null && ColumnConverterFactory.isSupportColumnConverter(field.getType())) {
                    ColumnEntity columnEntity = new ColumnEntity(cls, field, column);
                    if (!hashMap.containsKey(columnEntity.getName())) {
                        hashMap.put(columnEntity.getName(), columnEntity);
                    }
                }
            }
            m24394a(cls.getSuperclass(), hashMap);
        } catch (Throwable th) {
            LogUtil.m24376e(th.getMessage(), th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static LinkedHashMap m24395b(Class cls) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        m24394a(cls, linkedHashMap);
        return linkedHashMap;
    }
}
