package com.alibaba.sdk.android.httpdns.probe;

/* loaded from: classes.dex */
public interface IPProbeService {

    /* renamed from: com.alibaba.sdk.android.httpdns.probe.IPProbeService$a */
    /* loaded from: classes.dex */
    public enum EnumC1555a {
        NO_PROBING,
        PROBING
    }

    EnumC1555a getProbeStatus(String str);

    void launchIPProbeTask(String str, int i10, String[] strArr);

    void setIPListUpdateCallback(InterfaceC1557b interfaceC1557b);

    boolean stopIPProbeTask(String str);
}
