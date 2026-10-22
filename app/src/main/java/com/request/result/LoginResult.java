package com.request.result;

import java.io.Serializable;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class LoginResult implements Serializable {
    private LoginResultData data;
    private String errorMessage;
    private String returnCode;

    public LoginResult(String str, String str2, LoginResultData loginResultData) {
        AbstractC5868k.m23674f(str, "returnCode");
        AbstractC5868k.m23674f(loginResultData, "data");
        this.returnCode = str;
        this.errorMessage = str2;
        this.data = loginResultData;
    }

    public static /* synthetic */ LoginResult copy$default(LoginResult loginResult, String str, String str2, LoginResultData loginResultData, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = loginResult.returnCode;
        }
        if ((i10 & 2) != 0) {
            str2 = loginResult.errorMessage;
        }
        if ((i10 & 4) != 0) {
            loginResultData = loginResult.data;
        }
        return loginResult.copy(str, str2, loginResultData);
    }

    public final String component1() {
        return this.returnCode;
    }

    public final String component2() {
        return this.errorMessage;
    }

    public final LoginResultData component3() {
        return this.data;
    }

    public final LoginResult copy(String str, String str2, LoginResultData loginResultData) {
        AbstractC5868k.m23674f(str, "returnCode");
        AbstractC5868k.m23674f(loginResultData, "data");
        return new LoginResult(str, str2, loginResultData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoginResult)) {
            return false;
        }
        LoginResult loginResult = (LoginResult) obj;
        return AbstractC5868k.m23669a(this.returnCode, loginResult.returnCode) && AbstractC5868k.m23669a(this.errorMessage, loginResult.errorMessage) && AbstractC5868k.m23669a(this.data, loginResult.data);
    }

    public final LoginResultData getData() {
        return this.data;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final String getReturnCode() {
        return this.returnCode;
    }

    public int hashCode() {
        int hashCode = this.returnCode.hashCode() * 31;
        String str = this.errorMessage;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.data.hashCode();
    }

    public final void setData(LoginResultData loginResultData) {
        AbstractC5868k.m23674f(loginResultData, "<set-?>");
        this.data = loginResultData;
    }

    public final void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public final void setReturnCode(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.returnCode = str;
    }

    public String toString() {
        return "LoginResult(returnCode=" + this.returnCode + ", errorMessage=" + this.errorMessage + ", data=" + this.data + ')';
    }
}
