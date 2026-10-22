package com.request.bean;

import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class GetInviteCodeBean {

    /* renamed from: tk */
    private String f12697tk;
    private String uid;

    public GetInviteCodeBean(String str, String str2) {
        AbstractC5868k.m23674f(str, "uid");
        AbstractC5868k.m23674f(str2, "tk");
        this.uid = str;
        this.f12697tk = str2;
    }

    public static /* synthetic */ GetInviteCodeBean copy$default(GetInviteCodeBean getInviteCodeBean, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = getInviteCodeBean.uid;
        }
        if ((i10 & 2) != 0) {
            str2 = getInviteCodeBean.f12697tk;
        }
        return getInviteCodeBean.copy(str, str2);
    }

    public final String component1() {
        return this.uid;
    }

    public final String component2() {
        return this.f12697tk;
    }

    public final GetInviteCodeBean copy(String str, String str2) {
        AbstractC5868k.m23674f(str, "uid");
        AbstractC5868k.m23674f(str2, "tk");
        return new GetInviteCodeBean(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetInviteCodeBean)) {
            return false;
        }
        GetInviteCodeBean getInviteCodeBean = (GetInviteCodeBean) obj;
        return AbstractC5868k.m23669a(this.uid, getInviteCodeBean.uid) && AbstractC5868k.m23669a(this.f12697tk, getInviteCodeBean.f12697tk);
    }

    public final String getTk() {
        return this.f12697tk;
    }

    public final String getUid() {
        return this.uid;
    }

    public int hashCode() {
        return (this.uid.hashCode() * 31) + this.f12697tk.hashCode();
    }

    public final void setTk(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.f12697tk = str;
    }

    public final void setUid(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.uid = str;
    }

    public String toString() {
        return "GetInviteCodeBean(uid=" + this.uid + ", tk=" + this.f12697tk + ')';
    }
}
