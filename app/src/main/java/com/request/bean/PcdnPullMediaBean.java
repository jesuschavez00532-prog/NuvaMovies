package com.request.bean;

import anet.channel.util.HttpConstant;
import ne.AbstractC5864g;
import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class PcdnPullMediaBean {
    private String mediaCode;
    private String name;
    private String protocol;
    private String sourceUrl;
    private String type;
    public static final Companion Companion = new Companion(null);
    private static final String MEDIA_INFO_STREAM = "stream";
    private static final String MEDIA_INFO_ENTITY = "entity";
    private static final String MEDIA_INFO_HLS = "hls";
    private static final String MEDIA_INFO_HTTP = HttpConstant.HTTP;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC5864g abstractC5864g) {
            this();
        }

        public final String getMEDIA_INFO_ENTITY() {
            return PcdnPullMediaBean.MEDIA_INFO_ENTITY;
        }

        public final String getMEDIA_INFO_HLS() {
            return PcdnPullMediaBean.MEDIA_INFO_HLS;
        }

        public final String getMEDIA_INFO_HTTP() {
            return PcdnPullMediaBean.MEDIA_INFO_HTTP;
        }

        public final String getMEDIA_INFO_STREAM() {
            return PcdnPullMediaBean.MEDIA_INFO_STREAM;
        }
    }

    public PcdnPullMediaBean(String str, String str2, String str3, String str4, String str5) {
        this.name = str;
        this.mediaCode = str2;
        this.type = str3;
        this.protocol = str4;
        this.sourceUrl = str5;
    }

    public static /* synthetic */ PcdnPullMediaBean copy$default(PcdnPullMediaBean pcdnPullMediaBean, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = pcdnPullMediaBean.name;
        }
        if ((i10 & 2) != 0) {
            str2 = pcdnPullMediaBean.mediaCode;
        }
        String str6 = str2;
        if ((i10 & 4) != 0) {
            str3 = pcdnPullMediaBean.type;
        }
        String str7 = str3;
        if ((i10 & 8) != 0) {
            str4 = pcdnPullMediaBean.protocol;
        }
        String str8 = str4;
        if ((i10 & 16) != 0) {
            str5 = pcdnPullMediaBean.sourceUrl;
        }
        return pcdnPullMediaBean.copy(str, str6, str7, str8, str5);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.mediaCode;
    }

    public final String component3() {
        return this.type;
    }

    public final String component4() {
        return this.protocol;
    }

    public final String component5() {
        return this.sourceUrl;
    }

    public final PcdnPullMediaBean copy(String str, String str2, String str3, String str4, String str5) {
        return new PcdnPullMediaBean(str, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PcdnPullMediaBean)) {
            return false;
        }
        PcdnPullMediaBean pcdnPullMediaBean = (PcdnPullMediaBean) obj;
        return AbstractC5868k.m23669a(this.name, pcdnPullMediaBean.name) && AbstractC5868k.m23669a(this.mediaCode, pcdnPullMediaBean.mediaCode) && AbstractC5868k.m23669a(this.type, pcdnPullMediaBean.type) && AbstractC5868k.m23669a(this.protocol, pcdnPullMediaBean.protocol) && AbstractC5868k.m23669a(this.sourceUrl, pcdnPullMediaBean.sourceUrl);
    }

    public final String getMediaCode() {
        return this.mediaCode;
    }

    public final String getName() {
        return this.name;
    }

    public final String getProtocol() {
        return this.protocol;
    }

    public final String getSourceUrl() {
        return this.sourceUrl;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.name;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.mediaCode;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.type;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.protocol;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.sourceUrl;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final void setMediaCode(String str) {
        this.mediaCode = str;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setProtocol(String str) {
        this.protocol = str;
    }

    public final void setSourceUrl(String str) {
        this.sourceUrl = str;
    }

    public final void setType(String str) {
        this.type = str;
    }

    public String toString() {
        return "PcdnPullMediaBean(name=" + this.name + ", mediaCode=" + this.mediaCode + ", type=" + this.type + ", protocol=" + this.protocol + ", sourceUrl=" + this.sourceUrl + ')';
    }
}
