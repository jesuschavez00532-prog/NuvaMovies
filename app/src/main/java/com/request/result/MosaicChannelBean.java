package com.request.result;

import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class MosaicChannelBean {
    private Integer audioTrackInx;
    private String channelCode;
    private String language;

    public MosaicChannelBean(String str, Integer num, String str2) {
        this.language = str;
        this.audioTrackInx = num;
        this.channelCode = str2;
    }

    public static /* synthetic */ MosaicChannelBean copy$default(MosaicChannelBean mosaicChannelBean, String str, Integer num, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = mosaicChannelBean.language;
        }
        if ((i10 & 2) != 0) {
            num = mosaicChannelBean.audioTrackInx;
        }
        if ((i10 & 4) != 0) {
            str2 = mosaicChannelBean.channelCode;
        }
        return mosaicChannelBean.copy(str, num, str2);
    }

    public final String component1() {
        return this.language;
    }

    public final Integer component2() {
        return this.audioTrackInx;
    }

    public final String component3() {
        return this.channelCode;
    }

    public final MosaicChannelBean copy(String str, Integer num, String str2) {
        return new MosaicChannelBean(str, num, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MosaicChannelBean)) {
            return false;
        }
        MosaicChannelBean mosaicChannelBean = (MosaicChannelBean) obj;
        return AbstractC5868k.m23669a(this.language, mosaicChannelBean.language) && AbstractC5868k.m23669a(this.audioTrackInx, mosaicChannelBean.audioTrackInx) && AbstractC5868k.m23669a(this.channelCode, mosaicChannelBean.channelCode);
    }

    public final Integer getAudioTrackInx() {
        return this.audioTrackInx;
    }

    public final String getChannelCode() {
        return this.channelCode;
    }

    public final String getLanguage() {
        return this.language;
    }

    public int hashCode() {
        String str = this.language;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.audioTrackInx;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.channelCode;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setAudioTrackInx(Integer num) {
        this.audioTrackInx = num;
    }

    public final void setChannelCode(String str) {
        this.channelCode = str;
    }

    public final void setLanguage(String str) {
        this.language = str;
    }

    public String toString() {
        return "MosaicChannelBean(language=" + this.language + ", audioTrackInx=" + this.audioTrackInx + ", channelCode=" + this.channelCode + ')';
    }
}
