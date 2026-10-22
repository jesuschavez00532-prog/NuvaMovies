package com.request.result;

import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.lzy.okgo.cookie.SerializableCookie;
import java.io.Serializable;
import java.util.List;
import ne.AbstractC5868k;
import p348u2.AbstractC7027d;

/* loaded from: classes.dex */
public final class Channel implements Serializable {
    private String alias;
    private String channelCode;
    private int channelNumber;
    private String fixedChannelNumber;
    private boolean isFav;
    private boolean isLock;
    private String keyWords;
    private List<LiveAddress> liveAddressList;
    private List<MosaicChannelBean> mosaicChanneArray;
    private String mosaicChannelList;
    private String name;
    private List<PosterList> posterList;
    private String posterUrl;
    private String quality;
    private String restricted;
    private String showChannelName;
    private String showIconUrl;
    private String showPosterUrl;
    private String supportBusiness;
    private String supportVideoType;
    private String tags;

    public Channel(String str, String str2, String str3, int i10, String str4, String str5, String str6, String str7, String str8, String str9, String str10, List<LiveAddress> list, boolean z10, boolean z11, String str11, List<PosterList> list2, String str12) {
        AbstractC5868k.m23674f(str, "channelCode");
        AbstractC5868k.m23674f(str2, SerializableCookie.NAME);
        AbstractC5868k.m23674f(str11, "tags");
        this.channelCode = str;
        this.name = str2;
        this.alias = str3;
        this.channelNumber = i10;
        this.fixedChannelNumber = str4;
        this.keyWords = str5;
        this.posterUrl = str6;
        this.supportVideoType = str7;
        this.restricted = str8;
        this.supportBusiness = str9;
        this.quality = str10;
        this.liveAddressList = list;
        this.isFav = z10;
        this.isLock = z11;
        this.tags = str11;
        this.posterList = list2;
        this.mosaicChannelList = str12;
        this.showIconUrl = "";
        this.showPosterUrl = "";
        this.showChannelName = "";
    }

    public final String component1() {
        return this.channelCode;
    }

    public final String component10() {
        return this.supportBusiness;
    }

    public final String component11() {
        return this.quality;
    }

    public final List<LiveAddress> component12() {
        return this.liveAddressList;
    }

    public final boolean component13() {
        return this.isFav;
    }

    public final boolean component14() {
        return this.isLock;
    }

    public final String component15() {
        return this.tags;
    }

    public final List<PosterList> component16() {
        return this.posterList;
    }

    public final String component17() {
        return this.mosaicChannelList;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.alias;
    }

    public final int component4() {
        return this.channelNumber;
    }

    public final String component5() {
        return this.fixedChannelNumber;
    }

    public final String component6() {
        return this.keyWords;
    }

    public final String component7() {
        return this.posterUrl;
    }

    public final String component8() {
        return this.supportVideoType;
    }

    public final String component9() {
        return this.restricted;
    }

    public final Channel copy(String str, String str2, String str3, int i10, String str4, String str5, String str6, String str7, String str8, String str9, String str10, List<LiveAddress> list, boolean z10, boolean z11, String str11, List<PosterList> list2, String str12) {
        AbstractC5868k.m23674f(str, "channelCode");
        AbstractC5868k.m23674f(str2, SerializableCookie.NAME);
        AbstractC5868k.m23674f(str11, "tags");
        return new Channel(str, str2, str3, i10, str4, str5, str6, str7, str8, str9, str10, list, z10, z11, str11, list2, str12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Channel)) {
            return false;
        }
        Channel channel = (Channel) obj;
        return AbstractC5868k.m23669a(this.channelCode, channel.channelCode) && AbstractC5868k.m23669a(this.name, channel.name) && AbstractC5868k.m23669a(this.alias, channel.alias) && this.channelNumber == channel.channelNumber && AbstractC5868k.m23669a(this.fixedChannelNumber, channel.fixedChannelNumber) && AbstractC5868k.m23669a(this.keyWords, channel.keyWords) && AbstractC5868k.m23669a(this.posterUrl, channel.posterUrl) && AbstractC5868k.m23669a(this.supportVideoType, channel.supportVideoType) && AbstractC5868k.m23669a(this.restricted, channel.restricted) && AbstractC5868k.m23669a(this.supportBusiness, channel.supportBusiness) && AbstractC5868k.m23669a(this.quality, channel.quality) && AbstractC5868k.m23669a(this.liveAddressList, channel.liveAddressList) && this.isFav == channel.isFav && this.isLock == channel.isLock && AbstractC5868k.m23669a(this.tags, channel.tags) && AbstractC5868k.m23669a(this.posterList, channel.posterList) && AbstractC5868k.m23669a(this.mosaicChannelList, channel.mosaicChannelList);
    }

    public final String getAlias() {
        return this.alias;
    }

    public final String getChannelCode() {
        return this.channelCode;
    }

    public final int getChannelNumber() {
        return this.channelNumber;
    }

    public final String getFixedChannelNumber() {
        return this.fixedChannelNumber;
    }

    public final String getKeyWords() {
        return this.keyWords;
    }

    public final List<LiveAddress> getLiveAddressList() {
        return this.liveAddressList;
    }

    public final String getMosaicChannelList() {
        return this.mosaicChannelList;
    }

    public final List<MosaicChannelBean> getMosaicChannes() {
        if (!TextUtils.isEmpty(this.mosaicChannelList)) {
            try {
                if (this.mosaicChanneArray == null) {
                    this.mosaicChanneArray = (List) AbstractC7027d.m27114a().fromJson(this.mosaicChannelList, new TypeToken<List<MosaicChannelBean>>() { // from class: com.request.result.Channel$getMosaicChannes$type$1
                    }.getType());
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return this.mosaicChanneArray;
    }

    public final String getName() {
        return this.name;
    }

    public final List<PosterList> getPosterList() {
        return this.posterList;
    }

    public final String getPosterUrl() {
        return this.posterUrl;
    }

    public final String getQuality() {
        return this.quality;
    }

    public final String getRestricted() {
        return this.restricted;
    }

    public final String getShowChannelName() {
        return this.showChannelName;
    }

    public final String getShowIconUrl() {
        return this.showIconUrl;
    }

    public final String getShowPosterUrl() {
        return this.showPosterUrl;
    }

    public final String getSupportBusiness() {
        return this.supportBusiness;
    }

    public final String getSupportVideoType() {
        return this.supportVideoType;
    }

    public final String getTags() {
        return this.tags;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.channelCode.hashCode() * 31) + this.name.hashCode()) * 31;
        String str = this.alias;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.channelNumber) * 31;
        String str2 = this.fixedChannelNumber;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.keyWords;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.posterUrl;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.supportVideoType;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.restricted;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.supportBusiness;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.quality;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        List<LiveAddress> list = this.liveAddressList;
        int hashCode10 = (hashCode9 + (list == null ? 0 : list.hashCode())) * 31;
        boolean z10 = this.isFav;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode10 + i10) * 31;
        boolean z11 = this.isLock;
        int hashCode11 = (((i11 + (z11 ? 1 : z11 ? 1 : 0)) * 31) + this.tags.hashCode()) * 31;
        List<PosterList> list2 = this.posterList;
        int hashCode12 = (hashCode11 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str9 = this.mosaicChannelList;
        return hashCode12 + (str9 != null ? str9.hashCode() : 0);
    }

    public final boolean isFav() {
        return this.isFav;
    }

    public final boolean isLock() {
        return this.isLock;
    }

    public final void setAlias(String str) {
        this.alias = str;
    }

    public final void setChannelCode(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.channelCode = str;
    }

    public final void setChannelNumber(int i10) {
        this.channelNumber = i10;
    }

    public final void setFav(boolean z10) {
        this.isFav = z10;
    }

    public final void setFixedChannelNumber(String str) {
        this.fixedChannelNumber = str;
    }

    public final void setKeyWords(String str) {
        this.keyWords = str;
    }

    public final void setLiveAddressList(List<LiveAddress> list) {
        this.liveAddressList = list;
    }

    public final void setLock(boolean z10) {
        this.isLock = z10;
    }

    public final void setMosaicChannelList(String str) {
        this.mosaicChannelList = str;
    }

    public final void setName(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.name = str;
    }

    public final void setPosterList(List<PosterList> list) {
        this.posterList = list;
    }

    public final void setPosterUrl(String str) {
        this.posterUrl = str;
    }

    public final void setQuality(String str) {
        this.quality = str;
    }

    public final void setRestricted(String str) {
        this.restricted = str;
    }

    public final void setShowChannelName(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.showChannelName = str;
    }

    public final void setShowIconUrl(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.showIconUrl = str;
    }

    public final void setShowPosterUrl(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.showPosterUrl = str;
    }

    public final void setSupportBusiness(String str) {
        this.supportBusiness = str;
    }

    public final void setSupportVideoType(String str) {
        this.supportVideoType = str;
    }

    public final void setTags(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.tags = str;
    }

    public String toString() {
        return "Channel(channelCode=" + this.channelCode + ", name=" + this.name + ", alias=" + this.alias + ", channelNumber=" + this.channelNumber + ", fixedChannelNumber=" + this.fixedChannelNumber + ", keyWords=" + this.keyWords + ", posterUrl=" + this.posterUrl + ", supportVideoType=" + this.supportVideoType + ", restricted=" + this.restricted + ", supportBusiness=" + this.supportBusiness + ", quality=" + this.quality + ", liveAddressList=" + this.liveAddressList + ", isFav=" + this.isFav + ", isLock=" + this.isLock + ", tags=" + this.tags + ", posterList=" + this.posterList + ", mosaicChannelList=" + this.mosaicChannelList + ')';
    }
}
