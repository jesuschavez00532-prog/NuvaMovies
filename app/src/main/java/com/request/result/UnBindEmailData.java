package com.request.result;

import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class UnBindEmailData {
    private String userName;
    private String userToken;

    public UnBindEmailData(String str, String str2) {
        this.userToken = str;
        this.userName = str2;
    }

    public static /* synthetic */ UnBindEmailData copy$default(UnBindEmailData unBindEmailData, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = unBindEmailData.userToken;
        }
        if ((i10 & 2) != 0) {
            str2 = unBindEmailData.userName;
        }
        return unBindEmailData.copy(str, str2);
    }

    public final String component1() {
        return this.userToken;
    }

    public final String component2() {
        return this.userName;
    }

    public final UnBindEmailData copy(String str, String str2) {
        return new UnBindEmailData(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnBindEmailData)) {
            return false;
        }
        UnBindEmailData unBindEmailData = (UnBindEmailData) obj;
        return AbstractC5868k.m23669a(this.userToken, unBindEmailData.userToken) && AbstractC5868k.m23669a(this.userName, unBindEmailData.userName);
    }

    public final String getUserName() {
        return this.userName;
    }

    public final String getUserToken() {
        return this.userToken;
    }

    public int hashCode() {
        String str = this.userToken;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.userName;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setUserName(String str) {
        this.userName = str;
    }

    public final void setUserToken(String str) {
        this.userToken = str;
    }

    public String toString() {
        return "UnBindEmailData(userToken=" + this.userToken + ", userName=" + this.userName + ')';
    }
}
