package com.bigbee.bean.request;

import com.umeng.analytics.pro.C3384f;
import com.umeng.ccg.C3417a;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class CastAction {
    private String action;
    private String cast_ver;
    private String session;

    public CastAction(String str, String str2, String str3) {
        AbstractC5868k.m23674f(str, "cast_ver");
        AbstractC5868k.m23674f(str2, C3384f.f14569aC);
        AbstractC5868k.m23674f(str3, C3417a.f15001w);
        this.cast_ver = str;
        this.session = str2;
        this.action = str3;
    }

    public static /* synthetic */ CastAction copy$default(CastAction castAction, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = castAction.cast_ver;
        }
        if ((i10 & 2) != 0) {
            str2 = castAction.session;
        }
        if ((i10 & 4) != 0) {
            str3 = castAction.action;
        }
        return castAction.copy(str, str2, str3);
    }

    public final String component1() {
        return this.cast_ver;
    }

    public final String component2() {
        return this.session;
    }

    public final String component3() {
        return this.action;
    }

    public final CastAction copy(String str, String str2, String str3) {
        AbstractC5868k.m23674f(str, "cast_ver");
        AbstractC5868k.m23674f(str2, C3384f.f14569aC);
        AbstractC5868k.m23674f(str3, C3417a.f15001w);
        return new CastAction(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CastAction)) {
            return false;
        }
        CastAction castAction = (CastAction) obj;
        return AbstractC5868k.m23669a(this.cast_ver, castAction.cast_ver) && AbstractC5868k.m23669a(this.session, castAction.session) && AbstractC5868k.m23669a(this.action, castAction.action);
    }

    public final String getAction() {
        return this.action;
    }

    public final String getCast_ver() {
        return this.cast_ver;
    }

    public final String getSession() {
        return this.session;
    }

    public int hashCode() {
        return (((this.cast_ver.hashCode() * 31) + this.session.hashCode()) * 31) + this.action.hashCode();
    }

    public final void setAction(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.action = str;
    }

    public final void setCast_ver(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.cast_ver = str;
    }

    public final void setSession(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.session = str;
    }

    public String toString() {
        return "CastAction(cast_ver=" + this.cast_ver + ", session=" + this.session + ", action=" + this.action + ')';
    }
}
