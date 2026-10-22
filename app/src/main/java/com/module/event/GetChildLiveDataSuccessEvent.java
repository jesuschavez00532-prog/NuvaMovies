package com.module.event;

import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class GetChildLiveDataSuccessEvent {
    private int columnId;
    private String parentType;

    public GetChildLiveDataSuccessEvent(int i10, String str) {
        AbstractC5868k.m23674f(str, "parentType");
        this.columnId = i10;
        this.parentType = str;
    }

    public final int getColumnId() {
        return this.columnId;
    }

    public final String getParentType() {
        return this.parentType;
    }

    public final void setColumnId(int i10) {
        this.columnId = i10;
    }

    public final void setParentType(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.parentType = str;
    }
}
