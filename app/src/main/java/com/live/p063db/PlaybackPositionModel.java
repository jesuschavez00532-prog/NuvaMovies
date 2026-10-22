package com.live.p063db;

import com.taobao.accs.common.Constants;
import ne.AbstractC5868k;
import org.xutils.p274db.annotation.Column;
import org.xutils.p274db.annotation.Table;

@Table(name = "PlaybackPositionModel")
/* loaded from: classes2.dex */
public final class PlaybackPositionModel {

    @Column(isId = true, name = Constants.KEY_HTTP_CODE)
    private String code;

    @Column(name = "position")
    private String position;

    public PlaybackPositionModel() {
        this.position = "";
    }

    public final String getCode() {
        return this.code;
    }

    public final String getPosition() {
        return this.position;
    }

    public final void setCode(String str) {
        this.code = str;
    }

    public final void setPosition(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.position = str;
    }

    public String toString() {
        return "PlaybackPositionModel(code=" + this.code + ", position='" + this.position + "')";
    }

    public PlaybackPositionModel(String str, String str2) {
        AbstractC5868k.m23674f(str, Constants.KEY_HTTP_CODE);
        AbstractC5868k.m23674f(str2, "position");
        this.code = str;
        this.position = str2;
    }
}
