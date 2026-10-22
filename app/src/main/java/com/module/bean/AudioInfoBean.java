package com.module.bean;

import anet.channel.strategy.dispatch.DispatchConstants;
import ne.AbstractC5864g;
import ne.AbstractC5868k;
import p170i2.C4842a;

/* loaded from: classes2.dex */
public final class AudioInfoBean implements Comparable<AudioInfoBean> {
    private Integer audioPlayIndex;
    private final String contentId;
    private final String language;
    private final String quality;
    private final String transLanguage;

    public AudioInfoBean(String str, String str2, String str3, Integer num) {
        AbstractC5868k.m23674f(str, "contentId");
        AbstractC5868k.m23674f(str2, "quality");
        AbstractC5868k.m23674f(str3, "language");
        this.contentId = str;
        this.quality = str2;
        this.language = str3;
        this.audioPlayIndex = num;
        this.transLanguage = AudioInfoUtil.INSTANCE.getTranslateString(str3);
    }

    public static /* synthetic */ AudioInfoBean copy$default(AudioInfoBean audioInfoBean, String str, String str2, String str3, Integer num, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = audioInfoBean.contentId;
        }
        if ((i10 & 2) != 0) {
            str2 = audioInfoBean.quality;
        }
        if ((i10 & 4) != 0) {
            str3 = audioInfoBean.language;
        }
        if ((i10 & 8) != 0) {
            num = audioInfoBean.audioPlayIndex;
        }
        return audioInfoBean.copy(str, str2, str3, num);
    }

    public final String component1() {
        return this.contentId;
    }

    public final String component2() {
        return this.quality;
    }

    public final String component3() {
        return this.language;
    }

    public final Integer component4() {
        return this.audioPlayIndex;
    }

    public final AudioInfoBean copy(String str, String str2, String str3, Integer num) {
        AbstractC5868k.m23674f(str, "contentId");
        AbstractC5868k.m23674f(str2, "quality");
        AbstractC5868k.m23674f(str3, "language");
        return new AudioInfoBean(str, str2, str3, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioInfoBean)) {
            return false;
        }
        AudioInfoBean audioInfoBean = (AudioInfoBean) obj;
        return AbstractC5868k.m23669a(this.contentId, audioInfoBean.contentId) && AbstractC5868k.m23669a(this.quality, audioInfoBean.quality) && AbstractC5868k.m23669a(this.language, audioInfoBean.language) && AbstractC5868k.m23669a(this.audioPlayIndex, audioInfoBean.audioPlayIndex);
    }

    public final Integer getAudioPlayIndex() {
        return this.audioPlayIndex;
    }

    public final String getContentId() {
        return this.contentId;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final String getQuality() {
        return this.quality;
    }

    public final String getTransLanguage() {
        return this.transLanguage;
    }

    public int hashCode() {
        int hashCode = ((((this.contentId.hashCode() * 31) + this.quality.hashCode()) * 31) + this.language.hashCode()) * 31;
        Integer num = this.audioPlayIndex;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final void setAudioPlayIndex(Integer num) {
        this.audioPlayIndex = num;
    }

    public String toString() {
        return "AudioInfoBean(contentId=" + this.contentId + ", quality=" + this.quality + ", language=" + this.language + ", audioPlayIndex=" + this.audioPlayIndex + ')';
    }

    @Override // java.lang.Comparable
    public int compareTo(AudioInfoBean audioInfoBean) {
        AbstractC5868k.m23674f(audioInfoBean, DispatchConstants.OTHER);
        if (AbstractC5868k.m23669a(this.language, audioInfoBean.language)) {
            return 0;
        }
        for (String str : C4842a.f20329a.m19920a().mo19956e()) {
            if (AbstractC5868k.m23669a(this.language, str)) {
                return -1;
            }
            if (AbstractC5868k.m23669a(audioInfoBean.language, str)) {
                return 1;
            }
        }
        return 0;
    }

    public /* synthetic */ AudioInfoBean(String str, String str2, String str3, Integer num, int i10, AbstractC5864g abstractC5864g) {
        this(str, str2, str3, (i10 & 8) != 0 ? null : num);
    }
}
