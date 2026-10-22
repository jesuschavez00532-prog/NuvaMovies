package com.request.bean;

import java.io.Serializable;
import ne.AbstractC5864g;
import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class SubTitleFileList implements Serializable {
    private boolean downloadError;
    private boolean downloadFinished;
    private String fileType;
    private String md5;
    private String url;

    public SubTitleFileList(String str, String str2, String str3, boolean z10, boolean z11) {
        this.url = str;
        this.fileType = str2;
        this.md5 = str3;
        this.downloadFinished = z10;
        this.downloadError = z11;
    }

    public static /* synthetic */ SubTitleFileList copy$default(SubTitleFileList subTitleFileList, String str, String str2, String str3, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = subTitleFileList.url;
        }
        if ((i10 & 2) != 0) {
            str2 = subTitleFileList.fileType;
        }
        String str4 = str2;
        if ((i10 & 4) != 0) {
            str3 = subTitleFileList.md5;
        }
        String str5 = str3;
        if ((i10 & 8) != 0) {
            z10 = subTitleFileList.downloadFinished;
        }
        boolean z12 = z10;
        if ((i10 & 16) != 0) {
            z11 = subTitleFileList.downloadError;
        }
        return subTitleFileList.copy(str, str4, str5, z12, z11);
    }

    public final String component1() {
        return this.url;
    }

    public final String component2() {
        return this.fileType;
    }

    public final String component3() {
        return this.md5;
    }

    public final boolean component4() {
        return this.downloadFinished;
    }

    public final boolean component5() {
        return this.downloadError;
    }

    public final SubTitleFileList copy(String str, String str2, String str3, boolean z10, boolean z11) {
        return new SubTitleFileList(str, str2, str3, z10, z11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubTitleFileList)) {
            return false;
        }
        SubTitleFileList subTitleFileList = (SubTitleFileList) obj;
        return AbstractC5868k.m23669a(this.url, subTitleFileList.url) && AbstractC5868k.m23669a(this.fileType, subTitleFileList.fileType) && AbstractC5868k.m23669a(this.md5, subTitleFileList.md5) && this.downloadFinished == subTitleFileList.downloadFinished && this.downloadError == subTitleFileList.downloadError;
    }

    public final boolean getDownloadError() {
        return this.downloadError;
    }

    public final boolean getDownloadFinished() {
        return this.downloadFinished;
    }

    public final String getFileType() {
        return this.fileType;
    }

    public final String getMd5() {
        return this.md5;
    }

    public final String getUrl() {
        return this.url;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.url;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.fileType;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.md5;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        boolean z10 = this.downloadFinished;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode3 + i10) * 31;
        boolean z11 = this.downloadError;
        return i11 + (z11 ? 1 : z11 ? 1 : 0);
    }

    public final void setDownloadError(boolean z10) {
        this.downloadError = z10;
    }

    public final void setDownloadFinished(boolean z10) {
        this.downloadFinished = z10;
    }

    public final void setFileType(String str) {
        this.fileType = str;
    }

    public final void setMd5(String str) {
        this.md5 = str;
    }

    public final void setUrl(String str) {
        this.url = str;
    }

    public String toString() {
        return "SubTitleFileList(url=" + this.url + ", fileType=" + this.fileType + ", md5=" + this.md5 + ", downloadFinished=" + this.downloadFinished + ", downloadError=" + this.downloadError + ')';
    }

    public /* synthetic */ SubTitleFileList(String str, String str2, String str3, boolean z10, boolean z11, int i10, AbstractC5864g abstractC5864g) {
        this(str, str2, str3, (i10 & 8) != 0 ? false : z10, (i10 & 16) != 0 ? false : z11);
    }
}
