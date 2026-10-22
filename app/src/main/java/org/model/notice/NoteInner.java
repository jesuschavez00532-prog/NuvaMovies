package org.model.notice;

import java.util.List;

/* loaded from: classes3.dex */
public class NoteInner {
    private List<String> channels;
    private long duration;
    private String info;

    public List<String> getChannels() {
        return this.channels;
    }

    public long getDuration() {
        return this.duration;
    }

    public String getInfo() {
        return this.info;
    }

    public void setChannels(List<String> list) {
        this.channels = list;
    }

    public void setDuration(long j10) {
        this.duration = j10;
    }

    public void setInfo(String str) {
        this.info = str;
    }

    public String toString() {
        return "NoteInner{info='" + this.info + "', duration=" + this.duration + ", channels=" + this.channels + '}';
    }
}
