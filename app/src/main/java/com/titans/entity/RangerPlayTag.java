package com.titans.entity;

import ne.AbstractC5868k;

/* loaded from: classes3.dex */
public enum RangerPlayTag {
    LIVE("live"),
    VOD("vod"),
    RECORD("record");

    private String value;

    RangerPlayTag(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }

    public final void setValue(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.value = str;
    }
}
