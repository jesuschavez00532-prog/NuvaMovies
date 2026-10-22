package com.request.result;

import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class GetPlayUrlResult {
    private String cdn_type;
    private String code_desc;
    private String mark;
    private String redirect_url;
    private String redirect_url_ipv6;
    private int result_code;
    private int rst_flag;
    private int rst_port;

    public GetPlayUrlResult(int i10, String str, String str2, String str3, int i11, int i12, String str4, String str5) {
        AbstractC5868k.m23674f(str, "code_desc");
        AbstractC5868k.m23674f(str2, "mark");
        AbstractC5868k.m23674f(str3, "redirect_url");
        this.rst_flag = i10;
        this.code_desc = str;
        this.mark = str2;
        this.redirect_url = str3;
        this.result_code = i11;
        this.rst_port = i12;
        this.cdn_type = str4;
        this.redirect_url_ipv6 = str5;
    }

    public final int component1() {
        return this.rst_flag;
    }

    public final String component2() {
        return this.code_desc;
    }

    public final String component3() {
        return this.mark;
    }

    public final String component4() {
        return this.redirect_url;
    }

    public final int component5() {
        return this.result_code;
    }

    public final int component6() {
        return this.rst_port;
    }

    public final String component7() {
        return this.cdn_type;
    }

    public final String component8() {
        return this.redirect_url_ipv6;
    }

    public final GetPlayUrlResult copy(int i10, String str, String str2, String str3, int i11, int i12, String str4, String str5) {
        AbstractC5868k.m23674f(str, "code_desc");
        AbstractC5868k.m23674f(str2, "mark");
        AbstractC5868k.m23674f(str3, "redirect_url");
        return new GetPlayUrlResult(i10, str, str2, str3, i11, i12, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetPlayUrlResult)) {
            return false;
        }
        GetPlayUrlResult getPlayUrlResult = (GetPlayUrlResult) obj;
        return this.rst_flag == getPlayUrlResult.rst_flag && AbstractC5868k.m23669a(this.code_desc, getPlayUrlResult.code_desc) && AbstractC5868k.m23669a(this.mark, getPlayUrlResult.mark) && AbstractC5868k.m23669a(this.redirect_url, getPlayUrlResult.redirect_url) && this.result_code == getPlayUrlResult.result_code && this.rst_port == getPlayUrlResult.rst_port && AbstractC5868k.m23669a(this.cdn_type, getPlayUrlResult.cdn_type) && AbstractC5868k.m23669a(this.redirect_url_ipv6, getPlayUrlResult.redirect_url_ipv6);
    }

    public final String getCdn_type() {
        return this.cdn_type;
    }

    public final String getCode_desc() {
        return this.code_desc;
    }

    public final String getMark() {
        return this.mark;
    }

    public final String getRedirect_url() {
        return this.redirect_url;
    }

    public final String getRedirect_url_ipv6() {
        return this.redirect_url_ipv6;
    }

    public final int getResult_code() {
        return this.result_code;
    }

    public final int getRst_flag() {
        return this.rst_flag;
    }

    public final int getRst_port() {
        return this.rst_port;
    }

    public int hashCode() {
        int hashCode = ((((((((((this.rst_flag * 31) + this.code_desc.hashCode()) * 31) + this.mark.hashCode()) * 31) + this.redirect_url.hashCode()) * 31) + this.result_code) * 31) + this.rst_port) * 31;
        String str = this.cdn_type;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.redirect_url_ipv6;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setCdn_type(String str) {
        this.cdn_type = str;
    }

    public final void setCode_desc(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.code_desc = str;
    }

    public final void setMark(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.mark = str;
    }

    public final void setRedirect_url(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.redirect_url = str;
    }

    public final void setRedirect_url_ipv6(String str) {
        this.redirect_url_ipv6 = str;
    }

    public final void setResult_code(int i10) {
        this.result_code = i10;
    }

    public final void setRst_flag(int i10) {
        this.rst_flag = i10;
    }

    public final void setRst_port(int i10) {
        this.rst_port = i10;
    }

    public String toString() {
        return "GetPlayUrlResult(rst_flag=" + this.rst_flag + ", code_desc=" + this.code_desc + ", mark=" + this.mark + ", redirect_url=" + this.redirect_url + ", result_code=" + this.result_code + ", rst_port=" + this.rst_port + ", cdn_type=" + this.cdn_type + ", redirect_url_ipv6=" + this.redirect_url_ipv6 + ')';
    }
}
