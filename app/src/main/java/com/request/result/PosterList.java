package com.request.result;

import com.lzy.okgo.cookie.SerializableCookie;
import java.io.Serializable;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class PosterList implements Serializable {
    private String channelCode;
    private String fileType;
    private String fileUrl;
    private String name;
    private String size;

    public PosterList(String str, String str2, String str3, String str4, String str5) {
        AbstractC5868k.m23674f(str, SerializableCookie.NAME);
        AbstractC5868k.m23674f(str3, "fileType");
        AbstractC5868k.m23674f(str4, "fileUrl");
        AbstractC5868k.m23674f(str5, "size");
        this.name = str;
        this.channelCode = str2;
        this.fileType = str3;
        this.fileUrl = str4;
        this.size = str5;
    }

    public static /* synthetic */ PosterList copy$default(PosterList posterList, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = posterList.name;
        }
        if ((i10 & 2) != 0) {
            str2 = posterList.channelCode;
        }
        String str6 = str2;
        if ((i10 & 4) != 0) {
            str3 = posterList.fileType;
        }
        String str7 = str3;
        if ((i10 & 8) != 0) {
            str4 = posterList.fileUrl;
        }
        String str8 = str4;
        if ((i10 & 16) != 0) {
            str5 = posterList.size;
        }
        return posterList.copy(str, str6, str7, str8, str5);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.channelCode;
    }

    public final String component3() {
        return this.fileType;
    }

    public final String component4() {
        return this.fileUrl;
    }

    public final String component5() {
        return this.size;
    }

    public final PosterList copy(String str, String str2, String str3, String str4, String str5) {
        AbstractC5868k.m23674f(str, SerializableCookie.NAME);
        AbstractC5868k.m23674f(str3, "fileType");
        AbstractC5868k.m23674f(str4, "fileUrl");
        AbstractC5868k.m23674f(str5, "size");
        return new PosterList(str, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PosterList)) {
            return false;
        }
        PosterList posterList = (PosterList) obj;
        return AbstractC5868k.m23669a(this.name, posterList.name) && AbstractC5868k.m23669a(this.channelCode, posterList.channelCode) && AbstractC5868k.m23669a(this.fileType, posterList.fileType) && AbstractC5868k.m23669a(this.fileUrl, posterList.fileUrl) && AbstractC5868k.m23669a(this.size, posterList.size);
    }

    public final String getChannelCode() {
        return this.channelCode;
    }

    public final String getFileType() {
        return this.fileType;
    }

    public final String getFileUrl() {
        return this.fileUrl;
    }

    public final String getName() {
        return this.name;
    }

    public final String getSize() {
        return this.size;
    }

    public int hashCode() {
        int hashCode = this.name.hashCode() * 31;
        String str = this.channelCode;
        return ((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.fileType.hashCode()) * 31) + this.fileUrl.hashCode()) * 31) + this.size.hashCode();
    }

    public final void setChannelCode(String str) {
        this.channelCode = str;
    }

    public final void setFileType(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.fileType = str;
    }

    public final void setFileUrl(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.fileUrl = str;
    }

    public final void setName(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.name = str;
    }

    public final void setSize(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.size = str;
    }

    public String toString() {
        return "PosterList(name=" + this.name + ", channelCode=" + this.channelCode + ", fileType=" + this.fileType + ", fileUrl=" + this.fileUrl + ", size=" + this.size + ')';
    }
}
