package com.module.event;

import com.taobao.accs.common.Constants;
import ne.AbstractC5864g;
import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class ShowErrorMsgEvent {
    private String errorCode;
    private String uri;

    public ShowErrorMsgEvent(String str, String str2) {
        AbstractC5868k.m23674f(str, Constants.KEY_ERROR_CODE);
        AbstractC5868k.m23674f(str2, "uri");
        this.errorCode = str;
        this.uri = str2;
    }

    public final String getErrorCode() {
        return this.errorCode;
    }

    public final String getUri() {
        return this.uri;
    }

    public final void setErrorCode(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.errorCode = str;
    }

    public final void setUri(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.uri = str;
    }

    public /* synthetic */ ShowErrorMsgEvent(String str, String str2, int i10, AbstractC5864g abstractC5864g) {
        this(str, (i10 & 2) != 0 ? "" : str2);
    }
}
