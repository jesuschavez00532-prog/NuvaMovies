package com.request.result;

import java.io.Serializable;
import java.util.List;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class GetSlbInfoBeanResultData implements Serializable {
    private List<CdnListBeanResult> cdn_list;
    private Integer error_code;
    private String invalidTime;
    private int merge_rst_status;
    private String nowTime;
    private String play_params;
    private String reserve_a;
    private String reserve_b;
    private int rst_status;
    private int switchLiveSourceTime;
    private String switchLiveSourceTimeV2;
    private int switchVodSourceTime;
    private String switchVodSourceTimeV2;

    public GetSlbInfoBeanResultData(int i10, Integer num, String str, String str2, int i11, int i12, String str3, String str4, int i13, String str5, String str6, String str7, List<CdnListBeanResult> list) {
        this.rst_status = i10;
        this.error_code = num;
        this.invalidTime = str;
        this.nowTime = str2;
        this.switchLiveSourceTime = i11;
        this.switchVodSourceTime = i12;
        this.switchLiveSourceTimeV2 = str3;
        this.switchVodSourceTimeV2 = str4;
        this.merge_rst_status = i13;
        this.reserve_a = str5;
        this.reserve_b = str6;
        this.play_params = str7;
        this.cdn_list = list;
    }

    public final int component1() {
        return this.rst_status;
    }

    public final String component10() {
        return this.reserve_a;
    }

    public final String component11() {
        return this.reserve_b;
    }

    public final String component12() {
        return this.play_params;
    }

    public final List<CdnListBeanResult> component13() {
        return this.cdn_list;
    }

    public final Integer component2() {
        return this.error_code;
    }

    public final String component3() {
        return this.invalidTime;
    }

    public final String component4() {
        return this.nowTime;
    }

    public final int component5() {
        return this.switchLiveSourceTime;
    }

    public final int component6() {
        return this.switchVodSourceTime;
    }

    public final String component7() {
        return this.switchLiveSourceTimeV2;
    }

    public final String component8() {
        return this.switchVodSourceTimeV2;
    }

    public final int component9() {
        return this.merge_rst_status;
    }

    public final GetSlbInfoBeanResultData copy(int i10, Integer num, String str, String str2, int i11, int i12, String str3, String str4, int i13, String str5, String str6, String str7, List<CdnListBeanResult> list) {
        return new GetSlbInfoBeanResultData(i10, num, str, str2, i11, i12, str3, str4, i13, str5, str6, str7, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetSlbInfoBeanResultData)) {
            return false;
        }
        GetSlbInfoBeanResultData getSlbInfoBeanResultData = (GetSlbInfoBeanResultData) obj;
        return this.rst_status == getSlbInfoBeanResultData.rst_status && AbstractC5868k.m23669a(this.error_code, getSlbInfoBeanResultData.error_code) && AbstractC5868k.m23669a(this.invalidTime, getSlbInfoBeanResultData.invalidTime) && AbstractC5868k.m23669a(this.nowTime, getSlbInfoBeanResultData.nowTime) && this.switchLiveSourceTime == getSlbInfoBeanResultData.switchLiveSourceTime && this.switchVodSourceTime == getSlbInfoBeanResultData.switchVodSourceTime && AbstractC5868k.m23669a(this.switchLiveSourceTimeV2, getSlbInfoBeanResultData.switchLiveSourceTimeV2) && AbstractC5868k.m23669a(this.switchVodSourceTimeV2, getSlbInfoBeanResultData.switchVodSourceTimeV2) && this.merge_rst_status == getSlbInfoBeanResultData.merge_rst_status && AbstractC5868k.m23669a(this.reserve_a, getSlbInfoBeanResultData.reserve_a) && AbstractC5868k.m23669a(this.reserve_b, getSlbInfoBeanResultData.reserve_b) && AbstractC5868k.m23669a(this.play_params, getSlbInfoBeanResultData.play_params) && AbstractC5868k.m23669a(this.cdn_list, getSlbInfoBeanResultData.cdn_list);
    }

    public final List<CdnListBeanResult> getCdn_list() {
        return this.cdn_list;
    }

    public final Integer getError_code() {
        return this.error_code;
    }

    public final String getInvalidTime() {
        return this.invalidTime;
    }

    public final int getMerge_rst_status() {
        return this.merge_rst_status;
    }

    public final String getNowTime() {
        return this.nowTime;
    }

    public final String getPlay_params() {
        return this.play_params;
    }

    public final String getReserve_a() {
        return this.reserve_a;
    }

    public final String getReserve_b() {
        return this.reserve_b;
    }

    public final int getRst_status() {
        return this.rst_status;
    }

    public final int getSwitchLiveSourceTime() {
        return this.switchLiveSourceTime;
    }

    public final String getSwitchLiveSourceTimeV2() {
        return this.switchLiveSourceTimeV2;
    }

    public final int getSwitchVodSourceTime() {
        return this.switchVodSourceTime;
    }

    public final String getSwitchVodSourceTimeV2() {
        return this.switchVodSourceTimeV2;
    }

    public int hashCode() {
        int i10 = this.rst_status * 31;
        Integer num = this.error_code;
        int hashCode = (i10 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.invalidTime;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.nowTime;
        int hashCode3 = (((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.switchLiveSourceTime) * 31) + this.switchVodSourceTime) * 31;
        String str3 = this.switchLiveSourceTimeV2;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.switchVodSourceTimeV2;
        int hashCode5 = (((hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.merge_rst_status) * 31;
        String str5 = this.reserve_a;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.reserve_b;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.play_params;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        List<CdnListBeanResult> list = this.cdn_list;
        return hashCode8 + (list != null ? list.hashCode() : 0);
    }

    public final void setCdn_list(List<CdnListBeanResult> list) {
        this.cdn_list = list;
    }

    public final void setError_code(Integer num) {
        this.error_code = num;
    }

    public final void setInvalidTime(String str) {
        this.invalidTime = str;
    }

    public final void setMerge_rst_status(int i10) {
        this.merge_rst_status = i10;
    }

    public final void setNowTime(String str) {
        this.nowTime = str;
    }

    public final void setPlay_params(String str) {
        this.play_params = str;
    }

    public final void setReserve_a(String str) {
        this.reserve_a = str;
    }

    public final void setReserve_b(String str) {
        this.reserve_b = str;
    }

    public final void setRst_status(int i10) {
        this.rst_status = i10;
    }

    public final void setSwitchLiveSourceTime(int i10) {
        this.switchLiveSourceTime = i10;
    }

    public final void setSwitchLiveSourceTimeV2(String str) {
        this.switchLiveSourceTimeV2 = str;
    }

    public final void setSwitchVodSourceTime(int i10) {
        this.switchVodSourceTime = i10;
    }

    public final void setSwitchVodSourceTimeV2(String str) {
        this.switchVodSourceTimeV2 = str;
    }

    public String toString() {
        return "GetSlbInfoBeanResultData(rst_status=" + this.rst_status + ", error_code=" + this.error_code + ", invalidTime=" + this.invalidTime + ", nowTime=" + this.nowTime + ", switchLiveSourceTime=" + this.switchLiveSourceTime + ", switchVodSourceTime=" + this.switchVodSourceTime + ", switchLiveSourceTimeV2=" + this.switchLiveSourceTimeV2 + ", switchVodSourceTimeV2=" + this.switchVodSourceTimeV2 + ", merge_rst_status=" + this.merge_rst_status + ", reserve_a=" + this.reserve_a + ", reserve_b=" + this.reserve_b + ", play_params=" + this.play_params + ", cdn_list=" + this.cdn_list + ')';
    }
}
