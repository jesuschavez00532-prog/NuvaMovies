package com.request.result;

import java.util.List;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class ConfigInfoBean {
    private String SDKAD1;
    private String TVtutorialUrl;
    private List<String> bottomIcon;
    private String bottomLink;
    private String bottomText;
    private String customerEmail;
    private String downloadApkUrl;
    private String downloadNumber;
    private String downloadSpeed;
    private String downloadTVUrl;
    private String grupoDeTelegram;
    private String noResellers;
    private String officialWebsiteLink;
    private String purchaseUrl;
    private String redeemCenterUrl;
    private String sellerUrl;
    private String shareLinkUrl;
    private String updateDownloadUrl;
    private String whatsApp;
    private String whatsApp1;
    private String whatsApp2;
    private String whatsAppA;
    private String whatsAppB;
    private List<String> whatsAppUrlLogo1;
    private List<String> whatsAppUrlLogo2;

    public ConfigInfoBean(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, List<String> list, String str11, String str12, String str13, List<String> list2, List<String> list3, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22) {
        AbstractC5868k.m23674f(str16, "whatsApp");
        this.customerEmail = str;
        this.shareLinkUrl = str2;
        this.downloadNumber = str3;
        this.downloadSpeed = str4;
        this.officialWebsiteLink = str5;
        this.purchaseUrl = str6;
        this.sellerUrl = str7;
        this.downloadApkUrl = str8;
        this.whatsApp1 = str9;
        this.whatsApp2 = str10;
        this.bottomIcon = list;
        this.bottomLink = str11;
        this.bottomText = str12;
        this.redeemCenterUrl = str13;
        this.whatsAppUrlLogo1 = list2;
        this.whatsAppUrlLogo2 = list3;
        this.noResellers = str14;
        this.grupoDeTelegram = str15;
        this.whatsApp = str16;
        this.updateDownloadUrl = str17;
        this.SDKAD1 = str18;
        this.whatsAppA = str19;
        this.whatsAppB = str20;
        this.downloadTVUrl = str21;
        this.TVtutorialUrl = str22;
    }

    public final String component1() {
        return this.customerEmail;
    }

    public final String component10() {
        return this.whatsApp2;
    }

    public final List<String> component11() {
        return this.bottomIcon;
    }

    public final String component12() {
        return this.bottomLink;
    }

    public final String component13() {
        return this.bottomText;
    }

    public final String component14() {
        return this.redeemCenterUrl;
    }

    public final List<String> component15() {
        return this.whatsAppUrlLogo1;
    }

    public final List<String> component16() {
        return this.whatsAppUrlLogo2;
    }

    public final String component17() {
        return this.noResellers;
    }

    public final String component18() {
        return this.grupoDeTelegram;
    }

    public final String component19() {
        return this.whatsApp;
    }

    public final String component2() {
        return this.shareLinkUrl;
    }

    public final String component20() {
        return this.updateDownloadUrl;
    }

    public final String component21() {
        return this.SDKAD1;
    }

    public final String component22() {
        return this.whatsAppA;
    }

    public final String component23() {
        return this.whatsAppB;
    }

    public final String component24() {
        return this.downloadTVUrl;
    }

    public final String component25() {
        return this.TVtutorialUrl;
    }

    public final String component3() {
        return this.downloadNumber;
    }

    public final String component4() {
        return this.downloadSpeed;
    }

    public final String component5() {
        return this.officialWebsiteLink;
    }

    public final String component6() {
        return this.purchaseUrl;
    }

    public final String component7() {
        return this.sellerUrl;
    }

    public final String component8() {
        return this.downloadApkUrl;
    }

    public final String component9() {
        return this.whatsApp1;
    }

    public final ConfigInfoBean copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, List<String> list, String str11, String str12, String str13, List<String> list2, List<String> list3, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22) {
        AbstractC5868k.m23674f(str16, "whatsApp");
        return new ConfigInfoBean(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, list, str11, str12, str13, list2, list3, str14, str15, str16, str17, str18, str19, str20, str21, str22);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConfigInfoBean)) {
            return false;
        }
        ConfigInfoBean configInfoBean = (ConfigInfoBean) obj;
        return AbstractC5868k.m23669a(this.customerEmail, configInfoBean.customerEmail) && AbstractC5868k.m23669a(this.shareLinkUrl, configInfoBean.shareLinkUrl) && AbstractC5868k.m23669a(this.downloadNumber, configInfoBean.downloadNumber) && AbstractC5868k.m23669a(this.downloadSpeed, configInfoBean.downloadSpeed) && AbstractC5868k.m23669a(this.officialWebsiteLink, configInfoBean.officialWebsiteLink) && AbstractC5868k.m23669a(this.purchaseUrl, configInfoBean.purchaseUrl) && AbstractC5868k.m23669a(this.sellerUrl, configInfoBean.sellerUrl) && AbstractC5868k.m23669a(this.downloadApkUrl, configInfoBean.downloadApkUrl) && AbstractC5868k.m23669a(this.whatsApp1, configInfoBean.whatsApp1) && AbstractC5868k.m23669a(this.whatsApp2, configInfoBean.whatsApp2) && AbstractC5868k.m23669a(this.bottomIcon, configInfoBean.bottomIcon) && AbstractC5868k.m23669a(this.bottomLink, configInfoBean.bottomLink) && AbstractC5868k.m23669a(this.bottomText, configInfoBean.bottomText) && AbstractC5868k.m23669a(this.redeemCenterUrl, configInfoBean.redeemCenterUrl) && AbstractC5868k.m23669a(this.whatsAppUrlLogo1, configInfoBean.whatsAppUrlLogo1) && AbstractC5868k.m23669a(this.whatsAppUrlLogo2, configInfoBean.whatsAppUrlLogo2) && AbstractC5868k.m23669a(this.noResellers, configInfoBean.noResellers) && AbstractC5868k.m23669a(this.grupoDeTelegram, configInfoBean.grupoDeTelegram) && AbstractC5868k.m23669a(this.whatsApp, configInfoBean.whatsApp) && AbstractC5868k.m23669a(this.updateDownloadUrl, configInfoBean.updateDownloadUrl) && AbstractC5868k.m23669a(this.SDKAD1, configInfoBean.SDKAD1) && AbstractC5868k.m23669a(this.whatsAppA, configInfoBean.whatsAppA) && AbstractC5868k.m23669a(this.whatsAppB, configInfoBean.whatsAppB) && AbstractC5868k.m23669a(this.downloadTVUrl, configInfoBean.downloadTVUrl) && AbstractC5868k.m23669a(this.TVtutorialUrl, configInfoBean.TVtutorialUrl);
    }

    public final List<String> getBottomIcon() {
        return this.bottomIcon;
    }

    public final String getBottomLink() {
        return this.bottomLink;
    }

    public final String getBottomText() {
        return this.bottomText;
    }

    public final String getCustomerEmail() {
        return this.customerEmail;
    }

    public final String getDownloadApkUrl() {
        return this.downloadApkUrl;
    }

    public final String getDownloadNumber() {
        return this.downloadNumber;
    }

    public final String getDownloadSpeed() {
        return this.downloadSpeed;
    }

    public final String getDownloadTVUrl() {
        return this.downloadTVUrl;
    }

    public final String getGrupoDeTelegram() {
        return this.grupoDeTelegram;
    }

    public final String getNoResellers() {
        return this.noResellers;
    }

    public final String getOfficialWebsiteLink() {
        return this.officialWebsiteLink;
    }

    public final String getPurchaseUrl() {
        return this.purchaseUrl;
    }

    public final String getRedeemCenterUrl() {
        return this.redeemCenterUrl;
    }

    public final String getSDKAD1() {
        return this.SDKAD1;
    }

    public final String getSellerUrl() {
        return this.sellerUrl;
    }

    public final String getShareLinkUrl() {
        return this.shareLinkUrl;
    }

    public final String getTVtutorialUrl() {
        return this.TVtutorialUrl;
    }

    public final String getUpdateDownloadUrl() {
        return this.updateDownloadUrl;
    }

    public final String getWhatsApp() {
        return this.whatsApp;
    }

    public final String getWhatsApp1() {
        return this.whatsApp1;
    }

    public final String getWhatsApp2() {
        return this.whatsApp2;
    }

    public final String getWhatsAppA() {
        return this.whatsAppA;
    }

    public final String getWhatsAppB() {
        return this.whatsAppB;
    }

    public final List<String> getWhatsAppUrlLogo1() {
        return this.whatsAppUrlLogo1;
    }

    public final List<String> getWhatsAppUrlLogo2() {
        return this.whatsAppUrlLogo2;
    }

    public int hashCode() {
        String str = this.customerEmail;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.shareLinkUrl;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.downloadNumber;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.downloadSpeed;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.officialWebsiteLink;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.purchaseUrl;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.sellerUrl;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.downloadApkUrl;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.whatsApp1;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.whatsApp2;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        List<String> list = this.bottomIcon;
        int hashCode11 = (hashCode10 + (list == null ? 0 : list.hashCode())) * 31;
        String str11 = this.bottomLink;
        int hashCode12 = (hashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.bottomText;
        int hashCode13 = (hashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.redeemCenterUrl;
        int hashCode14 = (hashCode13 + (str13 == null ? 0 : str13.hashCode())) * 31;
        List<String> list2 = this.whatsAppUrlLogo1;
        int hashCode15 = (hashCode14 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.whatsAppUrlLogo2;
        int hashCode16 = (hashCode15 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str14 = this.noResellers;
        int hashCode17 = (hashCode16 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.grupoDeTelegram;
        int hashCode18 = (((hashCode17 + (str15 == null ? 0 : str15.hashCode())) * 31) + this.whatsApp.hashCode()) * 31;
        String str16 = this.updateDownloadUrl;
        int hashCode19 = (hashCode18 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.SDKAD1;
        int hashCode20 = (hashCode19 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.whatsAppA;
        int hashCode21 = (hashCode20 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.whatsAppB;
        int hashCode22 = (hashCode21 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.downloadTVUrl;
        int hashCode23 = (hashCode22 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.TVtutorialUrl;
        return hashCode23 + (str21 != null ? str21.hashCode() : 0);
    }

    public final void setBottomIcon(List<String> list) {
        this.bottomIcon = list;
    }

    public final void setBottomLink(String str) {
        this.bottomLink = str;
    }

    public final void setBottomText(String str) {
        this.bottomText = str;
    }

    public final void setCustomerEmail(String str) {
        this.customerEmail = str;
    }

    public final void setDownloadApkUrl(String str) {
        this.downloadApkUrl = str;
    }

    public final void setDownloadNumber(String str) {
        this.downloadNumber = str;
    }

    public final void setDownloadSpeed(String str) {
        this.downloadSpeed = str;
    }

    public final void setDownloadTVUrl(String str) {
        this.downloadTVUrl = str;
    }

    public final void setGrupoDeTelegram(String str) {
        this.grupoDeTelegram = str;
    }

    public final void setNoResellers(String str) {
        this.noResellers = str;
    }

    public final void setOfficialWebsiteLink(String str) {
        this.officialWebsiteLink = str;
    }

    public final void setPurchaseUrl(String str) {
        this.purchaseUrl = str;
    }

    public final void setRedeemCenterUrl(String str) {
        this.redeemCenterUrl = str;
    }

    public final void setSDKAD1(String str) {
        this.SDKAD1 = str;
    }

    public final void setSellerUrl(String str) {
        this.sellerUrl = str;
    }

    public final void setShareLinkUrl(String str) {
        this.shareLinkUrl = str;
    }

    public final void setTVtutorialUrl(String str) {
        this.TVtutorialUrl = str;
    }

    public final void setUpdateDownloadUrl(String str) {
        this.updateDownloadUrl = str;
    }

    public final void setWhatsApp(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.whatsApp = str;
    }

    public final void setWhatsApp1(String str) {
        this.whatsApp1 = str;
    }

    public final void setWhatsApp2(String str) {
        this.whatsApp2 = str;
    }

    public final void setWhatsAppA(String str) {
        this.whatsAppA = str;
    }

    public final void setWhatsAppB(String str) {
        this.whatsAppB = str;
    }

    public final void setWhatsAppUrlLogo1(List<String> list) {
        this.whatsAppUrlLogo1 = list;
    }

    public final void setWhatsAppUrlLogo2(List<String> list) {
        this.whatsAppUrlLogo2 = list;
    }

    public String toString() {
        return "ConfigInfoBean(customerEmail=" + this.customerEmail + ", shareLinkUrl=" + this.shareLinkUrl + ", downloadNumber=" + this.downloadNumber + ", downloadSpeed=" + this.downloadSpeed + ", officialWebsiteLink=" + this.officialWebsiteLink + ", purchaseUrl=" + this.purchaseUrl + ", sellerUrl=" + this.sellerUrl + ", downloadApkUrl=" + this.downloadApkUrl + ", whatsApp1=" + this.whatsApp1 + ", whatsApp2=" + this.whatsApp2 + ", bottomIcon=" + this.bottomIcon + ", bottomLink=" + this.bottomLink + ", bottomText=" + this.bottomText + ", redeemCenterUrl=" + this.redeemCenterUrl + ", whatsAppUrlLogo1=" + this.whatsAppUrlLogo1 + ", whatsAppUrlLogo2=" + this.whatsAppUrlLogo2 + ", noResellers=" + this.noResellers + ", grupoDeTelegram=" + this.grupoDeTelegram + ", whatsApp=" + this.whatsApp + ", updateDownloadUrl=" + this.updateDownloadUrl + ", SDKAD1=" + this.SDKAD1 + ", whatsAppA=" + this.whatsAppA + ", whatsAppB=" + this.whatsAppB + ", downloadTVUrl=" + this.downloadTVUrl + ", TVtutorialUrl=" + this.TVtutorialUrl + ')';
    }
}
