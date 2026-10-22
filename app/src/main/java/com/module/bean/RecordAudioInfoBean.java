package com.module.bean;

import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class RecordAudioInfoBean {
    private String audio;
    private int audioIndex;
    private int sourceIndex;

    public RecordAudioInfoBean(int i10, String str, int i11) {
        AbstractC5868k.m23674f(str, "audio");
        this.sourceIndex = i10;
        this.audio = str;
        this.audioIndex = i11;
    }

    public static /* synthetic */ RecordAudioInfoBean copy$default(RecordAudioInfoBean recordAudioInfoBean, int i10, String str, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = recordAudioInfoBean.sourceIndex;
        }
        if ((i12 & 2) != 0) {
            str = recordAudioInfoBean.audio;
        }
        if ((i12 & 4) != 0) {
            i11 = recordAudioInfoBean.audioIndex;
        }
        return recordAudioInfoBean.copy(i10, str, i11);
    }

    public final int component1() {
        return this.sourceIndex;
    }

    public final String component2() {
        return this.audio;
    }

    public final int component3() {
        return this.audioIndex;
    }

    public final RecordAudioInfoBean copy(int i10, String str, int i11) {
        AbstractC5868k.m23674f(str, "audio");
        return new RecordAudioInfoBean(i10, str, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecordAudioInfoBean)) {
            return false;
        }
        RecordAudioInfoBean recordAudioInfoBean = (RecordAudioInfoBean) obj;
        return this.sourceIndex == recordAudioInfoBean.sourceIndex && AbstractC5868k.m23669a(this.audio, recordAudioInfoBean.audio) && this.audioIndex == recordAudioInfoBean.audioIndex;
    }

    public final String getAudio() {
        return this.audio;
    }

    public final int getAudioIndex() {
        return this.audioIndex;
    }

    public final int getSourceIndex() {
        return this.sourceIndex;
    }

    public int hashCode() {
        return (((this.sourceIndex * 31) + this.audio.hashCode()) * 31) + this.audioIndex;
    }

    public final void setAudio(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.audio = str;
    }

    public final void setAudioIndex(int i10) {
        this.audioIndex = i10;
    }

    public final void setSourceIndex(int i10) {
        this.sourceIndex = i10;
    }

    public String toString() {
        return "RecordAudioInfoBean(sourceIndex=" + this.sourceIndex + ", audio=" + this.audio + ", audioIndex=" + this.audioIndex + ')';
    }
}
