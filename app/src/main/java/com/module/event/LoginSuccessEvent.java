package com.module.event;

import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class LoginSuccessEvent {
    private String userId;
    private String userSn;

    public LoginSuccessEvent(String str, String str2) {
        AbstractC5868k.m23674f(str, "userId");
        AbstractC5868k.m23674f(str2, "userSn");
        this.userId = str;
        this.userSn = str2;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getUserSn() {
        return this.userSn;
    }

    public final void setUserId(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.userId = str;
    }

    public final void setUserSn(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.userSn = str;
    }
}
