package com.live.p063db;

import ne.AbstractC5868k;
import org.xutils.p274db.annotation.Column;
import org.xutils.p274db.annotation.Table;

@Table(name = "reserve_team")
/* loaded from: classes2.dex */
public final class ReserveTeam {

    /* renamed from: id */
    @Column(isId = true, name = "id")
    private long f10825id;

    @Column(name = "gid")
    private String gid = "";

    @Column(name = "t_id")
    private String teamId = "";

    @Column(name = "t_name")
    private String name = "";

    @Column(name = "t_alias")
    private String alias = "";

    @Column(name = "t_logo")
    private String logo = "";

    public final String getAlias() {
        return this.alias;
    }

    public final String getGid() {
        return this.gid;
    }

    public final long getId() {
        return this.f10825id;
    }

    public final String getLogo() {
        return this.logo;
    }

    public final String getName() {
        return this.name;
    }

    public final String getTeamId() {
        return this.teamId;
    }

    public final void setAlias(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.alias = str;
    }

    public final void setGid(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.gid = str;
    }

    public final void setId(long j10) {
        this.f10825id = j10;
    }

    public final void setLogo(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.logo = str;
    }

    public final void setName(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.name = str;
    }

    public final void setTeamId(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.teamId = str;
    }

    public String toString() {
        return "ReserveTeam(id=" + this.f10825id + ", gid='" + this.gid + "', teamId='" + this.teamId + "', name='" + this.name + "', alias='" + this.alias + "', logo='" + this.logo + "')";
    }
}
