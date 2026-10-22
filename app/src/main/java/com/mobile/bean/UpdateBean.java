package com.mobile.bean;

import java.io.Serializable;

/* loaded from: classes2.dex */
public class UpdateBean implements Serializable {
    public int appDownloadCount;
    public int appStar;
    public String defaultDownloadUrl;
    public int forceUpdate;
    public String icon;

    /* renamed from: id */
    public int f11852id;
    public String img;
    public String md5;
    public int minSdk;
    public String name;
    public String note;
    public String packageName;
    public String spareUrl;
    public String url;
    public int versionCode;
    public String versionName;

    public int getAppDownloadCount() {
        return this.appDownloadCount;
    }

    public int getAppStar() {
        return this.appStar;
    }

    public String getDefaultDownloadUrl() {
        return this.defaultDownloadUrl;
    }

    public int getForceUpdate() {
        return this.forceUpdate;
    }

    public String getIcon() {
        return this.icon;
    }

    public int getId() {
        return this.f11852id;
    }

    public String getImg() {
        return this.img;
    }

    public String getMd5() {
        return this.md5;
    }

    public int getMinSdk() {
        return this.minSdk;
    }

    public String getName() {
        return this.name;
    }

    public String getNote() {
        return this.note;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public String getSpareUrl() {
        return this.spareUrl;
    }

    public String getUrl() {
        return this.url;
    }

    public int getVersionCode() {
        return this.versionCode;
    }

    public String getVersionName() {
        return this.versionName;
    }

    public void setAppDownloadCount(int i10) {
        this.appDownloadCount = i10;
    }

    public void setAppStar(int i10) {
        this.appStar = i10;
    }

    public void setDefaultDownloadUrl(String str) {
        this.defaultDownloadUrl = str;
    }

    public void setForceUpdate(int i10) {
        this.forceUpdate = i10;
    }

    public void setIcon(String str) {
        this.icon = str;
    }

    public void setId(int i10) {
        this.f11852id = i10;
    }

    public void setImg(String str) {
        this.img = str;
    }

    public void setMd5(String str) {
        this.md5 = str;
    }

    public void setMinSdk(int i10) {
        this.minSdk = i10;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setNote(String str) {
        this.note = str;
    }

    public void setPackageName(String str) {
        this.packageName = str;
    }

    public void setSpareUrl(String str) {
        this.spareUrl = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public void setVersionCode(int i10) {
        this.versionCode = i10;
    }

    public void setVersionName(String str) {
        this.versionName = str;
    }

    public String toString() {
        return "UpdateBean{id=" + this.f11852id + ", name='" + this.name + "', appDownloadCount=" + this.appDownloadCount + ", packageName='" + this.packageName + "', icon='" + this.icon + "', versionName='" + this.versionName + "', versionCode=" + this.versionCode + ", minSdk=" + this.minSdk + ", img='" + this.img + "', url='" + this.url + "', spareUrl='" + this.spareUrl + "', appStar=" + this.appStar + ", note='" + this.note + "', forceUpdate=" + this.forceUpdate + ", md5='" + this.md5 + "', defaultDownloadUrl='" + this.defaultDownloadUrl + "'}";
    }
}
