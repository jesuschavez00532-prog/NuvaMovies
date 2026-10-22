package com.live.p063db;

import ne.AbstractC5868k;
import org.xutils.p274db.annotation.Column;
import org.xutils.p274db.annotation.Table;

@Table(name = "reserve_channel")
/* loaded from: classes2.dex */
public final class ReserveChannel {

    /* renamed from: id */
    @Column(isId = true, name = "id")
    private long f10824id;

    @Column(name = "gid")
    private String gid = "";

    @Column(name = "c_code")
    private String code = "";

    @Column(name = "c_name")
    private String name = "";

    public final String getCode() {
        return this.code;
    }

    public final String getGid() {
        return this.gid;
    }

    public final long getId() {
        return this.f10824id;
    }

    public final String getName() {
        return this.name;
    }

    public final void setCode(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.code = str;
    }

    public final void setGid(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.gid = str;
    }

    public final void setId(long j10) {
        this.f10824id = j10;
    }

    public final void setName(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.name = str;
    }

    public String toString() {
        return "ReserveChannel(id='" + this.f10824id + "', gid='" + this.gid + "', code='" + this.code + "', name='" + this.name + "')";
    }
}
