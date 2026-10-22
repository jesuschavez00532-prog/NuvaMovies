package com.request.result;

import java.io.Serializable;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class SlbInfo implements Serializable {
    private Integer dead_time_addr;
    private Integer error_code;
    private String main_slb_addr;
    private String main_slb_token;
    private Integer rst_status;
    private String spared_slb_addr;
    private String spared_slb_token;

    public SlbInfo(String str, String str2, Integer num, String str3, String str4, Integer num2, Integer num3) {
        this.main_slb_addr = str;
        this.spared_slb_addr = str2;
        this.dead_time_addr = num;
        this.main_slb_token = str3;
        this.spared_slb_token = str4;
        this.rst_status = num2;
        this.error_code = num3;
    }

    public static /* synthetic */ SlbInfo copy$default(SlbInfo slbInfo, String str, String str2, Integer num, String str3, String str4, Integer num2, Integer num3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = slbInfo.main_slb_addr;
        }
        if ((i10 & 2) != 0) {
            str2 = slbInfo.spared_slb_addr;
        }
        String str5 = str2;
        if ((i10 & 4) != 0) {
            num = slbInfo.dead_time_addr;
        }
        Integer num4 = num;
        if ((i10 & 8) != 0) {
            str3 = slbInfo.main_slb_token;
        }
        String str6 = str3;
        if ((i10 & 16) != 0) {
            str4 = slbInfo.spared_slb_token;
        }
        String str7 = str4;
        if ((i10 & 32) != 0) {
            num2 = slbInfo.rst_status;
        }
        Integer num5 = num2;
        if ((i10 & 64) != 0) {
            num3 = slbInfo.error_code;
        }
        return slbInfo.copy(str, str5, num4, str6, str7, num5, num3);
    }

    public final String component1() {
        return this.main_slb_addr;
    }

    public final String component2() {
        return this.spared_slb_addr;
    }

    public final Integer component3() {
        return this.dead_time_addr;
    }

    public final String component4() {
        return this.main_slb_token;
    }

    public final String component5() {
        return this.spared_slb_token;
    }

    public final Integer component6() {
        return this.rst_status;
    }

    public final Integer component7() {
        return this.error_code;
    }

    public final SlbInfo copy(String str, String str2, Integer num, String str3, String str4, Integer num2, Integer num3) {
        return new SlbInfo(str, str2, num, str3, str4, num2, num3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SlbInfo)) {
            return false;
        }
        SlbInfo slbInfo = (SlbInfo) obj;
        return AbstractC5868k.m23669a(this.main_slb_addr, slbInfo.main_slb_addr) && AbstractC5868k.m23669a(this.spared_slb_addr, slbInfo.spared_slb_addr) && AbstractC5868k.m23669a(this.dead_time_addr, slbInfo.dead_time_addr) && AbstractC5868k.m23669a(this.main_slb_token, slbInfo.main_slb_token) && AbstractC5868k.m23669a(this.spared_slb_token, slbInfo.spared_slb_token) && AbstractC5868k.m23669a(this.rst_status, slbInfo.rst_status) && AbstractC5868k.m23669a(this.error_code, slbInfo.error_code);
    }

    public final Integer getDead_time_addr() {
        return this.dead_time_addr;
    }

    public final Integer getError_code() {
        return this.error_code;
    }

    public final String getMain_slb_addr() {
        return this.main_slb_addr;
    }

    public final String getMain_slb_token() {
        return this.main_slb_token;
    }

    public final Integer getRst_status() {
        return this.rst_status;
    }

    public final String getSpared_slb_addr() {
        return this.spared_slb_addr;
    }

    public final String getSpared_slb_token() {
        return this.spared_slb_token;
    }

    public int hashCode() {
        String str = this.main_slb_addr;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.spared_slb_addr;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.dead_time_addr;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.main_slb_token;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.spared_slb_token;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num2 = this.rst_status;
        int hashCode6 = (hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.error_code;
        return hashCode6 + (num3 != null ? num3.hashCode() : 0);
    }

    public final void setDead_time_addr(Integer num) {
        this.dead_time_addr = num;
    }

    public final void setError_code(Integer num) {
        this.error_code = num;
    }

    public final void setMain_slb_addr(String str) {
        this.main_slb_addr = str;
    }

    public final void setMain_slb_token(String str) {
        this.main_slb_token = str;
    }

    public final void setRst_status(Integer num) {
        this.rst_status = num;
    }

    public final void setSpared_slb_addr(String str) {
        this.spared_slb_addr = str;
    }

    public final void setSpared_slb_token(String str) {
        this.spared_slb_token = str;
    }

    public String toString() {
        return "SlbInfo(main_slb_addr=" + this.main_slb_addr + ", spared_slb_addr=" + this.spared_slb_addr + ", dead_time_addr=" + this.dead_time_addr + ", main_slb_token=" + this.main_slb_token + ", spared_slb_token=" + this.spared_slb_token + ", rst_status=" + this.rst_status + ", error_code=" + this.error_code + ')';
    }
}
