package com.request.bean;

import ne.AbstractC5864g;
import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class SubtitleDownloadErrorEvent {
    private String errorMessage;
    private String programId;

    public SubtitleDownloadErrorEvent(String str, String str2) {
        AbstractC5868k.m23674f(str, "programId");
        AbstractC5868k.m23674f(str2, "errorMessage");
        this.programId = str;
        this.errorMessage = str2;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final String getProgramId() {
        return this.programId;
    }

    public final void setErrorMessage(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.errorMessage = str;
    }

    public final void setProgramId(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.programId = str;
    }

    public /* synthetic */ SubtitleDownloadErrorEvent(String str, String str2, int i10, AbstractC5864g abstractC5864g) {
        this(str, (i10 & 2) != 0 ? "" : str2);
    }
}
