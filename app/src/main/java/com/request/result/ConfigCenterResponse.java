package com.request.result;

import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class ConfigCenterResponse {
    private Integer code;
    private ConfigCenterData data;
    private String msg;

    public ConfigCenterResponse(Integer num, String str, ConfigCenterData configCenterData) {
        this.code = num;
        this.msg = str;
        this.data = configCenterData;
    }

    public static /* synthetic */ ConfigCenterResponse copy$default(ConfigCenterResponse configCenterResponse, Integer num, String str, ConfigCenterData configCenterData, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = configCenterResponse.code;
        }
        if ((i10 & 2) != 0) {
            str = configCenterResponse.msg;
        }
        if ((i10 & 4) != 0) {
            configCenterData = configCenterResponse.data;
        }
        return configCenterResponse.copy(num, str, configCenterData);
    }

    public final Integer component1() {
        return this.code;
    }

    public final String component2() {
        return this.msg;
    }

    public final ConfigCenterData component3() {
        return this.data;
    }

    public final ConfigCenterResponse copy(Integer num, String str, ConfigCenterData configCenterData) {
        return new ConfigCenterResponse(num, str, configCenterData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConfigCenterResponse)) {
            return false;
        }
        ConfigCenterResponse configCenterResponse = (ConfigCenterResponse) obj;
        return AbstractC5868k.m23669a(this.code, configCenterResponse.code) && AbstractC5868k.m23669a(this.msg, configCenterResponse.msg) && AbstractC5868k.m23669a(this.data, configCenterResponse.data);
    }

    public final Integer getCode() {
        return this.code;
    }

    public final ConfigCenterData getData() {
        return this.data;
    }

    public final String getMsg() {
        return this.msg;
    }

    public int hashCode() {
        Integer num = this.code;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.msg;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        ConfigCenterData configCenterData = this.data;
        return hashCode2 + (configCenterData != null ? configCenterData.hashCode() : 0);
    }

    public final void setCode(Integer num) {
        this.code = num;
    }

    public final void setData(ConfigCenterData configCenterData) {
        this.data = configCenterData;
    }

    public final void setMsg(String str) {
        this.msg = str;
    }

    public String toString() {
        return "ConfigCenterResponse(code=" + this.code + ", msg=" + this.msg + ", data=" + this.data + ')';
    }
}
