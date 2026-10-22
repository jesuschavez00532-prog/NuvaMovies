package com.module.event;

import ne.AbstractC5864g;

/* loaded from: classes2.dex */
public final class GetLiveDataSuccessEvent {
    private int columnId;
    private String from;

    public GetLiveDataSuccessEvent(int i10, String str) {
        this.columnId = i10;
        this.from = str;
    }

    public final int getColumnId() {
        return this.columnId;
    }

    public final String getFrom() {
        return this.from;
    }

    public final void setColumnId(int i10) {
        this.columnId = i10;
    }

    public final void setFrom(String str) {
        this.from = str;
    }

    public /* synthetic */ GetLiveDataSuccessEvent(int i10, String str, int i11, AbstractC5864g abstractC5864g) {
        this(i10, (i11 & 2) != 0 ? null : str);
    }
}
