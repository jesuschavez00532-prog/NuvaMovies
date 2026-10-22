package vc;

import com.lzy.okgo.cache.CacheEntity;
import ne.AbstractC5868k;

/* renamed from: vc.d */
/* loaded from: classes3.dex */
public enum EnumC7256d {
    SYS_EVENT_TYPE_NET("net"),
    SYS_EVENT_TYPE_DEVICE("device"),
    SYS_EVENT_TYPE_KEY(CacheEntity.KEY),
    SYS_EVENT_TYPE_APP("app"),
    SYS_EVENT_TYPE_SCREEN("screen"),
    SYS_EVENT_TYPE_FOREGROUND("foreground"),
    SYS_EVENT_TYPE_DOZE("doze");


    /* renamed from: a */
    private String f27129a;

    EnumC7256d(String str) {
        AbstractC5868k.m23675g(str, "value");
        this.f27129a = str;
    }

    /* renamed from: a */
    public final String m28089a() {
        return this.f27129a;
    }
}
