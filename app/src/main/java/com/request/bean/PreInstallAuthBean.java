package com.request.bean;

import com.taobao.accs.common.Constants;
import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class PreInstallAuthBean {
    private String androidId;
    private String apkVersion;
    private String appId;
    private String brand;
    private String channel;
    private String cpuAbi;
    private String device;
    private String display;
    private String fingerprint;
    private String hardware;
    private String host;
    private String manufacturer;
    private String metadata;
    private String model;
    private String product;
    private String serialNumber;
    private String signdata;
    private String sysVersion;
    private String tags;
    private String verId;
    private String wifiMac;

    public PreInstallAuthBean(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21) {
        AbstractC5868k.m23674f(str, "metadata");
        AbstractC5868k.m23674f(str2, "signdata");
        AbstractC5868k.m23674f(str3, "androidId");
        AbstractC5868k.m23674f(str4, "wifiMac");
        AbstractC5868k.m23674f(str5, "serialNumber");
        AbstractC5868k.m23674f(str6, "apkVersion");
        AbstractC5868k.m23674f(str7, "sysVersion");
        AbstractC5868k.m23674f(str8, "appId");
        AbstractC5868k.m23674f(str9, Constants.KEY_MODEL);
        AbstractC5868k.m23674f(str10, "product");
        AbstractC5868k.m23674f(str11, "channel");
        AbstractC5868k.m23674f(str12, "display");
        AbstractC5868k.m23674f(str13, Constants.KEY_BRAND);
        AbstractC5868k.m23674f(str14, "verId");
        AbstractC5868k.m23674f(str15, "cpuAbi");
        AbstractC5868k.m23674f(str16, "hardware");
        AbstractC5868k.m23674f(str17, "manufacturer");
        AbstractC5868k.m23674f(str18, "fingerprint");
        AbstractC5868k.m23674f(str19, "host");
        AbstractC5868k.m23674f(str20, "device");
        AbstractC5868k.m23674f(str21, "tags");
        this.metadata = str;
        this.signdata = str2;
        this.androidId = str3;
        this.wifiMac = str4;
        this.serialNumber = str5;
        this.apkVersion = str6;
        this.sysVersion = str7;
        this.appId = str8;
        this.model = str9;
        this.product = str10;
        this.channel = str11;
        this.display = str12;
        this.brand = str13;
        this.verId = str14;
        this.cpuAbi = str15;
        this.hardware = str16;
        this.manufacturer = str17;
        this.fingerprint = str18;
        this.host = str19;
        this.device = str20;
        this.tags = str21;
    }

    public final String component1() {
        return this.metadata;
    }

    public final String component10() {
        return this.product;
    }

    public final String component11() {
        return this.channel;
    }

    public final String component12() {
        return this.display;
    }

    public final String component13() {
        return this.brand;
    }

    public final String component14() {
        return this.verId;
    }

    public final String component15() {
        return this.cpuAbi;
    }

    public final String component16() {
        return this.hardware;
    }

    public final String component17() {
        return this.manufacturer;
    }

    public final String component18() {
        return this.fingerprint;
    }

    public final String component19() {
        return this.host;
    }

    public final String component2() {
        return this.signdata;
    }

    public final String component20() {
        return this.device;
    }

    public final String component21() {
        return this.tags;
    }

    public final String component3() {
        return this.androidId;
    }

    public final String component4() {
        return this.wifiMac;
    }

    public final String component5() {
        return this.serialNumber;
    }

    public final String component6() {
        return this.apkVersion;
    }

    public final String component7() {
        return this.sysVersion;
    }

    public final String component8() {
        return this.appId;
    }

    public final String component9() {
        return this.model;
    }

    public final PreInstallAuthBean copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21) {
        AbstractC5868k.m23674f(str, "metadata");
        AbstractC5868k.m23674f(str2, "signdata");
        AbstractC5868k.m23674f(str3, "androidId");
        AbstractC5868k.m23674f(str4, "wifiMac");
        AbstractC5868k.m23674f(str5, "serialNumber");
        AbstractC5868k.m23674f(str6, "apkVersion");
        AbstractC5868k.m23674f(str7, "sysVersion");
        AbstractC5868k.m23674f(str8, "appId");
        AbstractC5868k.m23674f(str9, Constants.KEY_MODEL);
        AbstractC5868k.m23674f(str10, "product");
        AbstractC5868k.m23674f(str11, "channel");
        AbstractC5868k.m23674f(str12, "display");
        AbstractC5868k.m23674f(str13, Constants.KEY_BRAND);
        AbstractC5868k.m23674f(str14, "verId");
        AbstractC5868k.m23674f(str15, "cpuAbi");
        AbstractC5868k.m23674f(str16, "hardware");
        AbstractC5868k.m23674f(str17, "manufacturer");
        AbstractC5868k.m23674f(str18, "fingerprint");
        AbstractC5868k.m23674f(str19, "host");
        AbstractC5868k.m23674f(str20, "device");
        AbstractC5868k.m23674f(str21, "tags");
        return new PreInstallAuthBean(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreInstallAuthBean)) {
            return false;
        }
        PreInstallAuthBean preInstallAuthBean = (PreInstallAuthBean) obj;
        return AbstractC5868k.m23669a(this.metadata, preInstallAuthBean.metadata) && AbstractC5868k.m23669a(this.signdata, preInstallAuthBean.signdata) && AbstractC5868k.m23669a(this.androidId, preInstallAuthBean.androidId) && AbstractC5868k.m23669a(this.wifiMac, preInstallAuthBean.wifiMac) && AbstractC5868k.m23669a(this.serialNumber, preInstallAuthBean.serialNumber) && AbstractC5868k.m23669a(this.apkVersion, preInstallAuthBean.apkVersion) && AbstractC5868k.m23669a(this.sysVersion, preInstallAuthBean.sysVersion) && AbstractC5868k.m23669a(this.appId, preInstallAuthBean.appId) && AbstractC5868k.m23669a(this.model, preInstallAuthBean.model) && AbstractC5868k.m23669a(this.product, preInstallAuthBean.product) && AbstractC5868k.m23669a(this.channel, preInstallAuthBean.channel) && AbstractC5868k.m23669a(this.display, preInstallAuthBean.display) && AbstractC5868k.m23669a(this.brand, preInstallAuthBean.brand) && AbstractC5868k.m23669a(this.verId, preInstallAuthBean.verId) && AbstractC5868k.m23669a(this.cpuAbi, preInstallAuthBean.cpuAbi) && AbstractC5868k.m23669a(this.hardware, preInstallAuthBean.hardware) && AbstractC5868k.m23669a(this.manufacturer, preInstallAuthBean.manufacturer) && AbstractC5868k.m23669a(this.fingerprint, preInstallAuthBean.fingerprint) && AbstractC5868k.m23669a(this.host, preInstallAuthBean.host) && AbstractC5868k.m23669a(this.device, preInstallAuthBean.device) && AbstractC5868k.m23669a(this.tags, preInstallAuthBean.tags);
    }

    public final String getAndroidId() {
        return this.androidId;
    }

    public final String getApkVersion() {
        return this.apkVersion;
    }

    public final String getAppId() {
        return this.appId;
    }

    public final String getBrand() {
        return this.brand;
    }

    public final String getChannel() {
        return this.channel;
    }

    public final String getCpuAbi() {
        return this.cpuAbi;
    }

    public final String getDevice() {
        return this.device;
    }

    public final String getDisplay() {
        return this.display;
    }

    public final String getFingerprint() {
        return this.fingerprint;
    }

    public final String getHardware() {
        return this.hardware;
    }

    public final String getHost() {
        return this.host;
    }

    public final String getManufacturer() {
        return this.manufacturer;
    }

    public final String getMetadata() {
        return this.metadata;
    }

    public final String getModel() {
        return this.model;
    }

    public final String getProduct() {
        return this.product;
    }

    public final String getSerialNumber() {
        return this.serialNumber;
    }

    public final String getSigndata() {
        return this.signdata;
    }

    public final String getSysVersion() {
        return this.sysVersion;
    }

    public final String getTags() {
        return this.tags;
    }

    public final String getVerId() {
        return this.verId;
    }

    public final String getWifiMac() {
        return this.wifiMac;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((this.metadata.hashCode() * 31) + this.signdata.hashCode()) * 31) + this.androidId.hashCode()) * 31) + this.wifiMac.hashCode()) * 31) + this.serialNumber.hashCode()) * 31) + this.apkVersion.hashCode()) * 31) + this.sysVersion.hashCode()) * 31) + this.appId.hashCode()) * 31) + this.model.hashCode()) * 31) + this.product.hashCode()) * 31) + this.channel.hashCode()) * 31) + this.display.hashCode()) * 31) + this.brand.hashCode()) * 31) + this.verId.hashCode()) * 31) + this.cpuAbi.hashCode()) * 31) + this.hardware.hashCode()) * 31) + this.manufacturer.hashCode()) * 31) + this.fingerprint.hashCode()) * 31) + this.host.hashCode()) * 31) + this.device.hashCode()) * 31) + this.tags.hashCode();
    }

    public final void setAndroidId(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.androidId = str;
    }

    public final void setApkVersion(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.apkVersion = str;
    }

    public final void setAppId(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.appId = str;
    }

    public final void setBrand(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.brand = str;
    }

    public final void setChannel(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.channel = str;
    }

    public final void setCpuAbi(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.cpuAbi = str;
    }

    public final void setDevice(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.device = str;
    }

    public final void setDisplay(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.display = str;
    }

    public final void setFingerprint(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.fingerprint = str;
    }

    public final void setHardware(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.hardware = str;
    }

    public final void setHost(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.host = str;
    }

    public final void setManufacturer(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.manufacturer = str;
    }

    public final void setMetadata(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.metadata = str;
    }

    public final void setModel(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.model = str;
    }

    public final void setProduct(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.product = str;
    }

    public final void setSerialNumber(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.serialNumber = str;
    }

    public final void setSigndata(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.signdata = str;
    }

    public final void setSysVersion(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.sysVersion = str;
    }

    public final void setTags(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.tags = str;
    }

    public final void setVerId(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.verId = str;
    }

    public final void setWifiMac(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.wifiMac = str;
    }

    public String toString() {
        return "PreInstallAuthBean(metadata=" + this.metadata + ", signdata=" + this.signdata + ", androidId=" + this.androidId + ", wifiMac=" + this.wifiMac + ", serialNumber=" + this.serialNumber + ", apkVersion=" + this.apkVersion + ", sysVersion=" + this.sysVersion + ", appId=" + this.appId + ", model=" + this.model + ", product=" + this.product + ", channel=" + this.channel + ", display=" + this.display + ", brand=" + this.brand + ", verId=" + this.verId + ", cpuAbi=" + this.cpuAbi + ", hardware=" + this.hardware + ", manufacturer=" + this.manufacturer + ", fingerprint=" + this.fingerprint + ", host=" + this.host + ", device=" + this.device + ", tags=" + this.tags + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ PreInstallAuthBean(java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, java.lang.String r40, java.lang.String r41, java.lang.String r42, java.lang.String r43, java.lang.String r44, java.lang.String r45, java.lang.String r46, int r47, ne.AbstractC5864g r48) {
        /*
            Method dump skipped, instructions count: 178
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.request.bean.PreInstallAuthBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, ne.g):void");
    }
}
