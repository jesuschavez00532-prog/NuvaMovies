package com.module.bean;

import java.io.Serializable;
import org.xutils.p274db.annotation.Column;
import org.xutils.p274db.annotation.Table;

@Table(name = "Link_2_0")
/* loaded from: classes2.dex */
public class Link implements Serializable {

    @Column(isId = true, name = "contentId")
    private String contentId;

    @Column(name = "albumId")
    private String programId;

    @Column(name = "recordTime")
    private int recordTime;

    public String getContentId() {
        return this.contentId;
    }

    public String getProgramId() {
        return this.programId;
    }

    public int getRecordTime() {
        return this.recordTime;
    }

    public void setContentId(String str) {
        this.contentId = str;
    }

    public void setProgramId(String str) {
        this.programId = str;
    }

    public void setRecordTime(int i10) {
        this.recordTime = i10;
    }

    public String toString() {
        return "Link{contentId='" + this.contentId + "', programId='" + this.programId + "', recordTime=" + this.recordTime + '}';
    }
}
