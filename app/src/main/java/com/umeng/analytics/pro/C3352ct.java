package com.umeng.analytics.pro;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.umeng.analytics.pro.ct */
/* loaded from: classes3.dex */
public class C3352ct implements Serializable {

    /* renamed from: d */
    private static Map<Class<? extends InterfaceC3340ch>, Map<? extends InterfaceC3347co, C3352ct>> f14418d = new HashMap();

    /* renamed from: a */
    public final String f14419a;

    /* renamed from: b */
    public final byte f14420b;

    /* renamed from: c */
    public final C3353cu f14421c;

    public C3352ct(String str, byte b10, C3353cu c3353cu) {
        this.f14419a = str;
        this.f14420b = b10;
        this.f14421c = c3353cu;
    }

    /* renamed from: a */
    public static void m14126a(Class<? extends InterfaceC3340ch> cls, Map<? extends InterfaceC3347co, C3352ct> map) {
        f14418d.put(cls, map);
    }

    /* renamed from: a */
    public static Map<? extends InterfaceC3347co, C3352ct> m14125a(Class<? extends InterfaceC3340ch> cls) {
        if (!f14418d.containsKey(cls)) {
            try {
                cls.newInstance();
            } catch (IllegalAccessException e10) {
                throw new RuntimeException("IllegalAccessException for TBase class: " + cls.getName() + ", message: " + e10.getMessage());
            } catch (InstantiationException e11) {
                throw new RuntimeException("InstantiationException for TBase class: " + cls.getName() + ", message: " + e11.getMessage());
            }
        }
        return f14418d.get(cls);
    }
}
