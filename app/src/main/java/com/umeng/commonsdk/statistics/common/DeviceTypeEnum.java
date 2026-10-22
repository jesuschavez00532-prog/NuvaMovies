package com.umeng.commonsdk.statistics.common;

import com.taobao.accs.common.Constants;

/* loaded from: classes3.dex */
public enum DeviceTypeEnum {
    IMEI(Constants.KEY_IMEI, Constants.KEY_IMEI),
    OAID("oaid", "oaid"),
    ANDROIDID("android_id", "android_id"),
    MAC("mac", "mac"),
    SERIALNO("serial_no", "serial_no"),
    IDFA("idfa", "idfa"),
    DEFAULT("null", "null");

    private String description;
    private String deviceIdType;

    DeviceTypeEnum(String str, String str2) {
        this.deviceIdType = str;
        this.description = str2;
    }

    public String getDescription() {
        return this.description;
    }

    public String getDeviceIdType() {
        return this.deviceIdType;
    }
}
