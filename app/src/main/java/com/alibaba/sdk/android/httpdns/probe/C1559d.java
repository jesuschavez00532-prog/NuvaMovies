package com.alibaba.sdk.android.httpdns.probe;

/* renamed from: com.alibaba.sdk.android.httpdns.probe.d */
/* loaded from: classes.dex */
public final class C1559d {

    /* renamed from: a */
    private static IPProbeService f6007a;

    /* renamed from: a */
    public static synchronized IPProbeService m7208a(InterfaceC1557b interfaceC1557b) {
        IPProbeService iPProbeService;
        synchronized (C1559d.class) {
            if (f6007a == null) {
                C1560e c1560e = new C1560e();
                f6007a = c1560e;
                c1560e.setIPListUpdateCallback(interfaceC1557b);
            }
            iPProbeService = f6007a;
        }
        return iPProbeService;
    }
}
