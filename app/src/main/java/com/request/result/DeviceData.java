package com.request.result;

import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class DeviceData {
    private final String deviceName;
    private boolean isSelected;
    private final String loginCountry;
    private final String loginTime;
    private final String loginType;

    /* renamed from: sn */
    private final String f12706sn;

    public DeviceData(String str, String str2, String str3, String str4, String str5) {
        AbstractC5868k.m23674f(str5, "sn");
        this.deviceName = str;
        this.loginCountry = str2;
        this.loginTime = str3;
        this.loginType = str4;
        this.f12706sn = str5;
    }

    public static /* synthetic */ DeviceData copy$default(DeviceData deviceData, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = deviceData.deviceName;
        }
        if ((i10 & 2) != 0) {
            str2 = deviceData.loginCountry;
        }
        String str6 = str2;
        if ((i10 & 4) != 0) {
            str3 = deviceData.loginTime;
        }
        String str7 = str3;
        if ((i10 & 8) != 0) {
            str4 = deviceData.loginType;
        }
        String str8 = str4;
        if ((i10 & 16) != 0) {
            str5 = deviceData.f12706sn;
        }
        return deviceData.copy(str, str6, str7, str8, str5);
    }

    public final String component1() {
        return this.deviceName;
    }

    public final String component2() {
        return this.loginCountry;
    }

    public final String component3() {
        return this.loginTime;
    }

    public final String component4() {
        return this.loginType;
    }

    public final String component5() {
        return this.f12706sn;
    }

    public final DeviceData copy(String str, String str2, String str3, String str4, String str5) {
        AbstractC5868k.m23674f(str5, "sn");
        return new DeviceData(str, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceData)) {
            return false;
        }
        DeviceData deviceData = (DeviceData) obj;
        return AbstractC5868k.m23669a(this.deviceName, deviceData.deviceName) && AbstractC5868k.m23669a(this.loginCountry, deviceData.loginCountry) && AbstractC5868k.m23669a(this.loginTime, deviceData.loginTime) && AbstractC5868k.m23669a(this.loginType, deviceData.loginType) && AbstractC5868k.m23669a(this.f12706sn, deviceData.f12706sn);
    }

    public final String getDeviceName() {
        return this.deviceName;
    }

    public final String getLoginCountry() {
        return this.loginCountry;
    }

    public final String getLoginTime() {
        return this.loginTime;
    }

    public final String getLoginType() {
        return this.loginType;
    }

    public final String getSn() {
        return this.f12706sn;
    }

    public int hashCode() {
        String str = this.deviceName;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.loginCountry;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.loginTime;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.loginType;
        return ((hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.f12706sn.hashCode();
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final void setSelected(boolean z10) {
        this.isSelected = z10;
    }

    public String toString() {
        return "DeviceData(deviceName=" + this.deviceName + ", loginCountry=" + this.loginCountry + ", loginTime=" + this.loginTime + ", loginType=" + this.loginType + ", sn=" + this.f12706sn + ')';
    }
}
