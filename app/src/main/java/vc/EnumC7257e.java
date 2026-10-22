package vc;

import com.umeng.analytics.pro.C3325bt;
import ne.AbstractC5868k;

/* renamed from: vc.e */
/* loaded from: classes3.dex */
public enum EnumC7257e {
    NET_TYPE_WIRED("wired"),
    NET_TYPE_WLAN("wlan"),
    NET_TYPE_CELLULAR("cellular"),
    DEVICE_TYPE_DISK("disk"),
    DEVICE_TYPE_MOUSE("mouse"),
    DEVICE_TYPE_KEYBOARD("keyboard"),
    DEVICE_TYPE_RING("ring"),
    DEVICE_TYPE_BATTERY(C3325bt.f14181Z),
    KEY_TYPE_HOME("home"),
    KEY_TYPE_TASK("task"),
    NONE("");


    /* renamed from: a */
    private String f27142a;

    EnumC7257e(String str) {
        AbstractC5868k.m23675g(str, "value");
        this.f27142a = str;
    }

    /* renamed from: a */
    public final String m28090a() {
        return this.f27142a;
    }
}
