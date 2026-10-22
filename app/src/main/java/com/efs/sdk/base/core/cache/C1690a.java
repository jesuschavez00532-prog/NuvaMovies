package com.efs.sdk.base.core.cache;

import com.efs.sdk.base.core.util.Log;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.efs.sdk.base.core.cache.a */
/* loaded from: classes.dex */
public final class C1690a {

    /* renamed from: a */
    private ConcurrentHashMap<Byte, InterfaceC1693d> f7077a = new ConcurrentHashMap<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final InterfaceC1693d m7657a(byte b10) {
        if (!this.f7077a.containsKey(Byte.valueOf(b10))) {
            if (b10 != 1) {
                if (b10 != 2) {
                    Log.m7738w("efs.cache", "Cache module not support protocol ".concat(String.valueOf((int) b10)));
                } else {
                    this.f7077a.putIfAbsent(Byte.valueOf(b10), new C1692c());
                }
            } else {
                this.f7077a.putIfAbsent(Byte.valueOf(b10), new HandlerC1694e());
            }
        }
        return this.f7077a.get(Byte.valueOf(b10));
    }
}
