package com.download.bean;

import com.lzy.okgo.cookie.SerializableCookie;
import com.lzy.okgo.model.Progress;
import java.io.Serializable;
import java.util.List;
import ne.AbstractC5868k;
import p291q0.AbstractC6322a;

/* loaded from: classes.dex */
public final class DownloadModel implements Serializable {
    private String contentId;
    private String fileName;
    private String filePath;
    private String media_code;
    private String name;
    private List<DownloadParams> params;
    private String seriesContentId;
    private String tag;
    private long timeStamp;

    public DownloadModel(String str, String str2, String str3, String str4, String str5, String str6, long j10, String str7, List<DownloadParams> list) {
        AbstractC5868k.m23674f(str, SerializableCookie.NAME);
        AbstractC5868k.m23674f(str2, "contentId");
        AbstractC5868k.m23674f(str4, Progress.TAG);
        AbstractC5868k.m23674f(str5, Progress.FILE_NAME);
        AbstractC5868k.m23674f(str6, Progress.FILE_PATH);
        AbstractC5868k.m23674f(str7, "media_code");
        AbstractC5868k.m23674f(list, "params");
        this.name = str;
        this.contentId = str2;
        this.seriesContentId = str3;
        this.tag = str4;
        this.fileName = str5;
        this.filePath = str6;
        this.timeStamp = j10;
        this.media_code = str7;
        this.params = list;
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.contentId;
    }

    public final String component3() {
        return this.seriesContentId;
    }

    public final String component4() {
        return this.tag;
    }

    public final String component5() {
        return this.fileName;
    }

    public final String component6() {
        return this.filePath;
    }

    public final long component7() {
        return this.timeStamp;
    }

    public final String component8() {
        return this.media_code;
    }

    public final List<DownloadParams> component9() {
        return this.params;
    }

    public final DownloadModel copy(String str, String str2, String str3, String str4, String str5, String str6, long j10, String str7, List<DownloadParams> list) {
        AbstractC5868k.m23674f(str, SerializableCookie.NAME);
        AbstractC5868k.m23674f(str2, "contentId");
        AbstractC5868k.m23674f(str4, Progress.TAG);
        AbstractC5868k.m23674f(str5, Progress.FILE_NAME);
        AbstractC5868k.m23674f(str6, Progress.FILE_PATH);
        AbstractC5868k.m23674f(str7, "media_code");
        AbstractC5868k.m23674f(list, "params");
        return new DownloadModel(str, str2, str3, str4, str5, str6, j10, str7, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DownloadModel)) {
            return false;
        }
        DownloadModel downloadModel = (DownloadModel) obj;
        return AbstractC5868k.m23669a(this.name, downloadModel.name) && AbstractC5868k.m23669a(this.contentId, downloadModel.contentId) && AbstractC5868k.m23669a(this.seriesContentId, downloadModel.seriesContentId) && AbstractC5868k.m23669a(this.tag, downloadModel.tag) && AbstractC5868k.m23669a(this.fileName, downloadModel.fileName) && AbstractC5868k.m23669a(this.filePath, downloadModel.filePath) && this.timeStamp == downloadModel.timeStamp && AbstractC5868k.m23669a(this.media_code, downloadModel.media_code) && AbstractC5868k.m23669a(this.params, downloadModel.params);
    }

    public final String getContentId() {
        return this.contentId;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final String getFilePath() {
        return this.filePath;
    }

    public final String getMedia_code() {
        return this.media_code;
    }

    public final String getName() {
        return this.name;
    }

    public final List<DownloadParams> getParams() {
        return this.params;
    }

    public final String getSeriesContentId() {
        return this.seriesContentId;
    }

    public final String getTag() {
        return this.tag;
    }

    public final long getTimeStamp() {
        return this.timeStamp;
    }

    public int hashCode() {
        int hashCode = ((this.name.hashCode() * 31) + this.contentId.hashCode()) * 31;
        String str = this.seriesContentId;
        return ((((((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.tag.hashCode()) * 31) + this.fileName.hashCode()) * 31) + this.filePath.hashCode()) * 31) + AbstractC6322a.m25086a(this.timeStamp)) * 31) + this.media_code.hashCode()) * 31) + this.params.hashCode();
    }

    public final void setContentId(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.contentId = str;
    }

    public final void setFileName(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.fileName = str;
    }

    public final void setFilePath(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.filePath = str;
    }

    public final void setMedia_code(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.media_code = str;
    }

    public final void setName(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.name = str;
    }

    public final void setParams(List<DownloadParams> list) {
        AbstractC5868k.m23674f(list, "<set-?>");
        this.params = list;
    }

    public final void setSeriesContentId(String str) {
        this.seriesContentId = str;
    }

    public final void setTag(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.tag = str;
    }

    public final void setTimeStamp(long j10) {
        this.timeStamp = j10;
    }

    public String toString() {
        return "DownloadModel(name=" + this.name + ", contentId=" + this.contentId + ", seriesContentId=" + this.seriesContentId + ", tag=" + this.tag + ", fileName=" + this.fileName + ", filePath=" + this.filePath + ", timeStamp=" + this.timeStamp + ", media_code=" + this.media_code + ", params=" + this.params + ')';
    }
}
