package com.request.result;

import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class GetInviteCodeData {
    private String inviteCode;

    public GetInviteCodeData(String str) {
        this.inviteCode = str;
    }

    public static /* synthetic */ GetInviteCodeData copy$default(GetInviteCodeData getInviteCodeData, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = getInviteCodeData.inviteCode;
        }
        return getInviteCodeData.copy(str);
    }

    public final String component1() {
        return this.inviteCode;
    }

    public final GetInviteCodeData copy(String str) {
        return new GetInviteCodeData(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetInviteCodeData) && AbstractC5868k.m23669a(this.inviteCode, ((GetInviteCodeData) obj).inviteCode);
    }

    public final String getInviteCode() {
        return this.inviteCode;
    }

    public int hashCode() {
        String str = this.inviteCode;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final void setInviteCode(String str) {
        this.inviteCode = str;
    }

    public String toString() {
        return "GetInviteCodeData(inviteCode=" + this.inviteCode + ')';
    }
}
