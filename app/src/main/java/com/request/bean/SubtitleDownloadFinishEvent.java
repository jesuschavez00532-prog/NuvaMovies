package com.request.bean;

import ne.AbstractC5864g;
import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class SubtitleDownloadFinishEvent {
    private boolean isError;
    private String programId;

    public SubtitleDownloadFinishEvent(String str, boolean z10) {
        AbstractC5868k.m23674f(str, "programId");
        this.programId = str;
        this.isError = z10;
    }

    public final String getProgramId() {
        return this.programId;
    }

    public final boolean isError() {
        return this.isError;
    }

    public final void setError(boolean z10) {
        this.isError = z10;
    }

    public final void setProgramId(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.programId = str;
    }

    public /* synthetic */ SubtitleDownloadFinishEvent(String str, boolean z10, int i10, AbstractC5864g abstractC5864g) {
        this(str, (i10 & 2) != 0 ? false : z10);
    }
}
