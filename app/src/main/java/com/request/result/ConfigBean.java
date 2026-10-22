package com.request.result;

import java.util.List;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class ConfigBean {
    private String apkDownloadUrl;
    private String apkWakeUrl;
    private String appId;
    private String bottomIcon;
    private String bottomLink;
    private String bottomText;
    private String commonUrl;
    private String feedbackUrl;
    private String group_name;
    private String helpCenterUrl;
    private List<String> iosMobileConfig;
    private List<String> iosProvision;
    private String iosProvisionDate;
    private String logoImage;
    private Integer memberTime;
    private String noResellers;
    private String officialWebsiteUrl;
    private String paymentUrl;
    private String redeemCenterUrl;
    private List<String> registerMethod;
    private String tvDownloadUrl;
    private String whatsAppUrl;
    private String whatsAppUrl1;
    private String whatsAppUrl2;
    private List<String> whatsAppUrlLogo1;
    private List<String> whatsAppUrlLogo2;
    private String winDownloadUrl;

    public ConfigBean(String str, List<String> list, List<String> list2, String str2, String str3, String str4, String str5, String str6, Integer num, String str7, String str8, String str9, String str10, List<String> list3, String str11, String str12, String str13, String str14, String str15, List<String> list4, List<String> list5, String str16, String str17, String str18, String str19, String str20, String str21) {
        this.appId = str;
        this.iosMobileConfig = list;
        this.iosProvision = list2;
        this.iosProvisionDate = str2;
        this.helpCenterUrl = str3;
        this.paymentUrl = str4;
        this.feedbackUrl = str5;
        this.commonUrl = str6;
        this.memberTime = num;
        this.apkDownloadUrl = str7;
        this.winDownloadUrl = str8;
        this.apkWakeUrl = str9;
        this.tvDownloadUrl = str10;
        this.registerMethod = list3;
        this.logoImage = str11;
        this.officialWebsiteUrl = str12;
        this.whatsAppUrl = str13;
        this.group_name = str14;
        this.noResellers = str15;
        this.whatsAppUrlLogo1 = list4;
        this.whatsAppUrlLogo2 = list5;
        this.whatsAppUrl1 = str16;
        this.whatsAppUrl2 = str17;
        this.redeemCenterUrl = str18;
        this.bottomIcon = str19;
        this.bottomText = str20;
        this.bottomLink = str21;
    }

    public final String component1() {
        return this.appId;
    }

    public final String component10() {
        return this.apkDownloadUrl;
    }

    public final String component11() {
        return this.winDownloadUrl;
    }

    public final String component12() {
        return this.apkWakeUrl;
    }

    public final String component13() {
        return this.tvDownloadUrl;
    }

    public final List<String> component14() {
        return this.registerMethod;
    }

    public final String component15() {
        return this.logoImage;
    }

    public final String component16() {
        return this.officialWebsiteUrl;
    }

    public final String component17() {
        return this.whatsAppUrl;
    }

    public final String component18() {
        return this.group_name;
    }

    public final String component19() {
        return this.noResellers;
    }

    public final List<String> component2() {
        return this.iosMobileConfig;
    }

    public final List<String> component20() {
        return this.whatsAppUrlLogo1;
    }

    public final List<String> component21() {
        return this.whatsAppUrlLogo2;
    }

    public final String component22() {
        return this.whatsAppUrl1;
    }

    public final String component23() {
        return this.whatsAppUrl2;
    }

    public final String component24() {
        return this.redeemCenterUrl;
    }

    public final String component25() {
        return this.bottomIcon;
    }

    public final String component26() {
        return this.bottomText;
    }

    public final String component27() {
        return this.bottomLink;
    }

    public final List<String> component3() {
        return this.iosProvision;
    }

    public final String component4() {
        return this.iosProvisionDate;
    }

    public final String component5() {
        return this.helpCenterUrl;
    }

    public final String component6() {
        return this.paymentUrl;
    }

    public final String component7() {
        return this.feedbackUrl;
    }

    public final String component8() {
        return this.commonUrl;
    }

    public final Integer component9() {
        return this.memberTime;
    }

    public final ConfigBean copy(String str, List<String> list, List<String> list2, String str2, String str3, String str4, String str5, String str6, Integer num, String str7, String str8, String str9, String str10, List<String> list3, String str11, String str12, String str13, String str14, String str15, List<String> list4, List<String> list5, String str16, String str17, String str18, String str19, String str20, String str21) {
        return new ConfigBean(str, list, list2, str2, str3, str4, str5, str6, num, str7, str8, str9, str10, list3, str11, str12, str13, str14, str15, list4, list5, str16, str17, str18, str19, str20, str21);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConfigBean)) {
            return false;
        }
        ConfigBean configBean = (ConfigBean) obj;
        return AbstractC5868k.m23669a(this.appId, configBean.appId) && AbstractC5868k.m23669a(this.iosMobileConfig, configBean.iosMobileConfig) && AbstractC5868k.m23669a(this.iosProvision, configBean.iosProvision) && AbstractC5868k.m23669a(this.iosProvisionDate, configBean.iosProvisionDate) && AbstractC5868k.m23669a(this.helpCenterUrl, configBean.helpCenterUrl) && AbstractC5868k.m23669a(this.paymentUrl, configBean.paymentUrl) && AbstractC5868k.m23669a(this.feedbackUrl, configBean.feedbackUrl) && AbstractC5868k.m23669a(this.commonUrl, configBean.commonUrl) && AbstractC5868k.m23669a(this.memberTime, configBean.memberTime) && AbstractC5868k.m23669a(this.apkDownloadUrl, configBean.apkDownloadUrl) && AbstractC5868k.m23669a(this.winDownloadUrl, configBean.winDownloadUrl) && AbstractC5868k.m23669a(this.apkWakeUrl, configBean.apkWakeUrl) && AbstractC5868k.m23669a(this.tvDownloadUrl, configBean.tvDownloadUrl) && AbstractC5868k.m23669a(this.registerMethod, configBean.registerMethod) && AbstractC5868k.m23669a(this.logoImage, configBean.logoImage) && AbstractC5868k.m23669a(this.officialWebsiteUrl, configBean.officialWebsiteUrl) && AbstractC5868k.m23669a(this.whatsAppUrl, configBean.whatsAppUrl) && AbstractC5868k.m23669a(this.group_name, configBean.group_name) && AbstractC5868k.m23669a(this.noResellers, configBean.noResellers) && AbstractC5868k.m23669a(this.whatsAppUrlLogo1, configBean.whatsAppUrlLogo1) && AbstractC5868k.m23669a(this.whatsAppUrlLogo2, configBean.whatsAppUrlLogo2) && AbstractC5868k.m23669a(this.whatsAppUrl1, configBean.whatsAppUrl1) && AbstractC5868k.m23669a(this.whatsAppUrl2, configBean.whatsAppUrl2) && AbstractC5868k.m23669a(this.redeemCenterUrl, configBean.redeemCenterUrl) && AbstractC5868k.m23669a(this.bottomIcon, configBean.bottomIcon) && AbstractC5868k.m23669a(this.bottomText, configBean.bottomText) && AbstractC5868k.m23669a(this.bottomLink, configBean.bottomLink);
    }

    public final String getApkDownloadUrl() {
        return this.apkDownloadUrl;
    }

    public final String getApkWakeUrl() {
        return this.apkWakeUrl;
    }

    public final String getAppId() {
        return this.appId;
    }

    public final String getBottomIcon() {
        return this.bottomIcon;
    }

    public final String getBottomLink() {
        return this.bottomLink;
    }

    public final String getBottomText() {
        return this.bottomText;
    }

    public final String getCommonUrl() {
        return this.commonUrl;
    }

    public final String getFeedbackUrl() {
        return this.feedbackUrl;
    }

    public final String getGroup_name() {
        return this.group_name;
    }

    public final String getHelpCenterUrl() {
        return this.helpCenterUrl;
    }

    public final List<String> getIosMobileConfig() {
        return this.iosMobileConfig;
    }

    public final List<String> getIosProvision() {
        return this.iosProvision;
    }

    public final String getIosProvisionDate() {
        return this.iosProvisionDate;
    }

    public final String getLogoImage() {
        return this.logoImage;
    }

    public final Integer getMemberTime() {
        return this.memberTime;
    }

    public final String getNoResellers() {
        return this.noResellers;
    }

    public final String getOfficialWebsiteUrl() {
        return this.officialWebsiteUrl;
    }

    public final String getPaymentUrl() {
        return this.paymentUrl;
    }

    public final String getRedeemCenterUrl() {
        return this.redeemCenterUrl;
    }

    public final List<String> getRegisterMethod() {
        return this.registerMethod;
    }

    public final String getTvDownloadUrl() {
        return this.tvDownloadUrl;
    }

    public final String getWhatsAppUrl() {
        return this.whatsAppUrl;
    }

    public final String getWhatsAppUrl1() {
        return this.whatsAppUrl1;
    }

    public final String getWhatsAppUrl2() {
        return this.whatsAppUrl2;
    }

    public final List<String> getWhatsAppUrlLogo1() {
        return this.whatsAppUrlLogo1;
    }

    public final List<String> getWhatsAppUrlLogo2() {
        return this.whatsAppUrlLogo2;
    }

    public final String getWinDownloadUrl() {
        return this.winDownloadUrl;
    }

    public int hashCode() {
        String str = this.appId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<String> list = this.iosMobileConfig;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.iosProvision;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str2 = this.iosProvisionDate;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.helpCenterUrl;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.paymentUrl;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.feedbackUrl;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.commonUrl;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num = this.memberTime;
        int hashCode9 = (hashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        String str7 = this.apkDownloadUrl;
        int hashCode10 = (hashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.winDownloadUrl;
        int hashCode11 = (hashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.apkWakeUrl;
        int hashCode12 = (hashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.tvDownloadUrl;
        int hashCode13 = (hashCode12 + (str10 == null ? 0 : str10.hashCode())) * 31;
        List<String> list3 = this.registerMethod;
        int hashCode14 = (hashCode13 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str11 = this.logoImage;
        int hashCode15 = (hashCode14 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.officialWebsiteUrl;
        int hashCode16 = (hashCode15 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.whatsAppUrl;
        int hashCode17 = (hashCode16 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.group_name;
        int hashCode18 = (hashCode17 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.noResellers;
        int hashCode19 = (hashCode18 + (str15 == null ? 0 : str15.hashCode())) * 31;
        List<String> list4 = this.whatsAppUrlLogo1;
        int hashCode20 = (hashCode19 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<String> list5 = this.whatsAppUrlLogo2;
        int hashCode21 = (hashCode20 + (list5 == null ? 0 : list5.hashCode())) * 31;
        String str16 = this.whatsAppUrl1;
        int hashCode22 = (hashCode21 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.whatsAppUrl2;
        int hashCode23 = (hashCode22 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.redeemCenterUrl;
        int hashCode24 = (hashCode23 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.bottomIcon;
        int hashCode25 = (hashCode24 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.bottomText;
        int hashCode26 = (hashCode25 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.bottomLink;
        return hashCode26 + (str21 != null ? str21.hashCode() : 0);
    }

    public final void setApkDownloadUrl(String str) {
        this.apkDownloadUrl = str;
    }

    public final void setApkWakeUrl(String str) {
        this.apkWakeUrl = str;
    }

    public final void setAppId(String str) {
        this.appId = str;
    }

    public final void setBottomIcon(String str) {
        this.bottomIcon = str;
    }

    public final void setBottomLink(String str) {
        this.bottomLink = str;
    }

    public final void setBottomText(String str) {
        this.bottomText = str;
    }

    public final void setCommonUrl(String str) {
        this.commonUrl = str;
    }

    public final void setFeedbackUrl(String str) {
        this.feedbackUrl = str;
    }

    public final void setGroup_name(String str) {
        this.group_name = str;
    }

    public final void setHelpCenterUrl(String str) {
        this.helpCenterUrl = str;
    }

    public final void setIosMobileConfig(List<String> list) {
        this.iosMobileConfig = list;
    }

    public final void setIosProvision(List<String> list) {
        this.iosProvision = list;
    }

    public final void setIosProvisionDate(String str) {
        this.iosProvisionDate = str;
    }

    public final void setLogoImage(String str) {
        this.logoImage = str;
    }

    public final void setMemberTime(Integer num) {
        this.memberTime = num;
    }

    public final void setNoResellers(String str) {
        this.noResellers = str;
    }

    public final void setOfficialWebsiteUrl(String str) {
        this.officialWebsiteUrl = str;
    }

    public final void setPaymentUrl(String str) {
        this.paymentUrl = str;
    }

    public final void setRedeemCenterUrl(String str) {
        this.redeemCenterUrl = str;
    }

    public final void setRegisterMethod(List<String> list) {
        this.registerMethod = list;
    }

    public final void setTvDownloadUrl(String str) {
        this.tvDownloadUrl = str;
    }

    public final void setWhatsAppUrl(String str) {
        this.whatsAppUrl = str;
    }

    public final void setWhatsAppUrl1(String str) {
        this.whatsAppUrl1 = str;
    }

    public final void setWhatsAppUrl2(String str) {
        this.whatsAppUrl2 = str;
    }

    public final void setWhatsAppUrlLogo1(List<String> list) {
        this.whatsAppUrlLogo1 = list;
    }

    public final void setWhatsAppUrlLogo2(List<String> list) {
        this.whatsAppUrlLogo2 = list;
    }

    public final void setWinDownloadUrl(String str) {
        this.winDownloadUrl = str;
    }

    public String toString() {
        return "ConfigBean(appId=" + this.appId + ", iosMobileConfig=" + this.iosMobileConfig + ", iosProvision=" + this.iosProvision + ", iosProvisionDate=" + this.iosProvisionDate + ", helpCenterUrl=" + this.helpCenterUrl + ", paymentUrl=" + this.paymentUrl + ", feedbackUrl=" + this.feedbackUrl + ", commonUrl=" + this.commonUrl + ", memberTime=" + this.memberTime + ", apkDownloadUrl=" + this.apkDownloadUrl + ", winDownloadUrl=" + this.winDownloadUrl + ", apkWakeUrl=" + this.apkWakeUrl + ", tvDownloadUrl=" + this.tvDownloadUrl + ", registerMethod=" + this.registerMethod + ", logoImage=" + this.logoImage + ", officialWebsiteUrl=" + this.officialWebsiteUrl + ", whatsAppUrl=" + this.whatsAppUrl + ", group_name=" + this.group_name + ", noResellers=" + this.noResellers + ", whatsAppUrlLogo1=" + this.whatsAppUrlLogo1 + ", whatsAppUrlLogo2=" + this.whatsAppUrlLogo2 + ", whatsAppUrl1=" + this.whatsAppUrl1 + ", whatsAppUrl2=" + this.whatsAppUrl2 + ", redeemCenterUrl=" + this.redeemCenterUrl + ", bottomIcon=" + this.bottomIcon + ", bottomText=" + this.bottomText + ", bottomLink=" + this.bottomLink + ')';
    }
}
