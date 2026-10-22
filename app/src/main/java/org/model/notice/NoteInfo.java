package org.model.notice;

import java.util.List;

/* loaded from: classes3.dex */
public class NoteInfo {
    private long duration;
    private String info;
    private List<NoteInner> inner;
    private String status;
    private String type;

    public long getDuration() {
        return this.duration;
    }

    public String getInfo() {
        return this.info;
    }

    public List<NoteInner> getInner() {
        return this.inner;
    }

    public String getStatus() {
        return this.status;
    }

    public String getType() {
        return this.type;
    }

    public void setDuration(long j10) {
        this.duration = j10;
    }

    public void setInfo(String str) {
        this.info = str;
    }

    public void setInner(List<NoteInner> list) {
        this.inner = list;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    public String toString() {
        return "NoteInfo{status='" + this.status + "', info='" + this.info + "', duration=" + this.duration + ", type='" + this.type + "', inner=" + this.inner + '}';
    }
}
