package com.module.event;

import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class ToStartPlayEvent {
    private String parentType;

    public ToStartPlayEvent(String str) {
        AbstractC5868k.m23674f(str, "parentType");
        this.parentType = str;
    }

    public final String getParentType() {
        return this.parentType;
    }

    public final void setParentType(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.parentType = str;
    }
}
