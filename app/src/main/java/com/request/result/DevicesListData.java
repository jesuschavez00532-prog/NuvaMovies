package com.request.result;

import java.util.List;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class DevicesListData {
    private final List<DeviceData> deviceList;

    public DevicesListData(List<DeviceData> list) {
        AbstractC5868k.m23674f(list, "deviceList");
        this.deviceList = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DevicesListData copy$default(DevicesListData devicesListData, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = devicesListData.deviceList;
        }
        return devicesListData.copy(list);
    }

    public final List<DeviceData> component1() {
        return this.deviceList;
    }

    public final DevicesListData copy(List<DeviceData> list) {
        AbstractC5868k.m23674f(list, "deviceList");
        return new DevicesListData(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DevicesListData) && AbstractC5868k.m23669a(this.deviceList, ((DevicesListData) obj).deviceList);
    }

    public final List<DeviceData> getDeviceList() {
        return this.deviceList;
    }

    public int hashCode() {
        return this.deviceList.hashCode();
    }

    public String toString() {
        return "DevicesListData(deviceList=" + this.deviceList + ')';
    }
}
