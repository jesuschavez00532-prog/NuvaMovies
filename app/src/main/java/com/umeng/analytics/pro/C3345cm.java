package com.umeng.analytics.pro;

import java.lang.reflect.InvocationTargetException;

/* renamed from: com.umeng.analytics.pro.cm */
/* loaded from: classes3.dex */
public class C3345cm {
    /* renamed from: a */
    public static InterfaceC3344cl m14094a(Class<? extends InterfaceC3344cl> cls, int i10) {
        try {
            return (InterfaceC3344cl) cls.getMethod("findByValue", Integer.TYPE).invoke(null, Integer.valueOf(i10));
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }
}
