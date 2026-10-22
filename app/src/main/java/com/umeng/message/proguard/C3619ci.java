package com.umeng.message.proguard;

import com.umeng.message.proguard.InterfaceC3606bx;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.umeng.message.proguard.ci */
/* loaded from: classes3.dex */
public final class C3619ci {

    /* renamed from: a */
    private static final ConcurrentHashMap<InterfaceC3606bx.c, AbstractC3618ch> f16158a = new ConcurrentHashMap<>(8);

    /* renamed from: a */
    public static AbstractC3618ch m15514a(InterfaceC3606bx.c cVar) {
        AbstractC3618ch abstractC3618ch;
        if (cVar != null) {
            ConcurrentHashMap<InterfaceC3606bx.c, AbstractC3618ch> concurrentHashMap = f16158a;
            AbstractC3618ch abstractC3618ch2 = concurrentHashMap.get(cVar);
            if (abstractC3618ch2 != null) {
                return abstractC3618ch2;
            }
            synchronized (concurrentHashMap) {
                abstractC3618ch = concurrentHashMap.get(cVar);
                if (abstractC3618ch == null) {
                    abstractC3618ch = new C3620cj(cVar);
                    concurrentHashMap.put(cVar, abstractC3618ch);
                }
            }
            return abstractC3618ch;
        }
        throw new IllegalArgumentException("type cant be null!");
    }
}
