package com.module.event;

import com.request.result.LoginResult;
import ne.AbstractC5864g;

/* loaded from: classes2.dex */
public final class LoginSuccessRequestDataEvent {
    private boolean getAuthInfoFromCache;
    private boolean isSwitchAccount;
    private LoginResult loginResult;

    public LoginSuccessRequestDataEvent() {
        this(false, false, null, 7, null);
    }

    public final boolean getGetAuthInfoFromCache() {
        return this.getAuthInfoFromCache;
    }

    public final LoginResult getLoginResult() {
        return this.loginResult;
    }

    public final boolean isSwitchAccount() {
        return this.isSwitchAccount;
    }

    public final void setGetAuthInfoFromCache(boolean z10) {
        this.getAuthInfoFromCache = z10;
    }

    public final void setLoginResult(LoginResult loginResult) {
        this.loginResult = loginResult;
    }

    public final void setSwitchAccount(boolean z10) {
        this.isSwitchAccount = z10;
    }

    public LoginSuccessRequestDataEvent(boolean z10, boolean z11, LoginResult loginResult) {
        this.isSwitchAccount = z10;
        this.getAuthInfoFromCache = z11;
        this.loginResult = loginResult;
    }

    public /* synthetic */ LoginSuccessRequestDataEvent(boolean z10, boolean z11, LoginResult loginResult, int i10, AbstractC5864g abstractC5864g) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, (i10 & 4) != 0 ? null : loginResult);
    }
}
