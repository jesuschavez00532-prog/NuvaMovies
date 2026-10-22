package com.request.converterFactory.bean;

import java.io.IOException;

/* loaded from: classes2.dex */
public class ResultException extends IOException {
    private String errorMessage;
    private String returnCode;

    public ResultException(String str, String str2) {
        this.returnCode = str;
        this.errorMessage = str2;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public String getReturnCode() {
        return this.returnCode;
    }

    public void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public void setReturnCode(String str) {
        this.returnCode = str;
    }
}
