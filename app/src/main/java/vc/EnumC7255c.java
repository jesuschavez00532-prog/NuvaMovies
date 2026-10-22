package vc;

import ne.AbstractC5868k;

/* renamed from: vc.c */
/* loaded from: classes3.dex */
public enum EnumC7255c {
    EVENT_TYPE_START("start"),
    EVENT_TYPE_PAUSE("pause"),
    EVENT_TYPE_RESUME("resume"),
    EVENT_TYPE_STOP("stop");


    /* renamed from: a */
    private String f27120a;

    EnumC7255c(String str) {
        AbstractC5868k.m23675g(str, "value");
        this.f27120a = str;
    }

    /* renamed from: a */
    public final String m28088a() {
        return this.f27120a;
    }
}
