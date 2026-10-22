package com.umeng.commonsdk.vchannel;

/* renamed from: com.umeng.commonsdk.vchannel.a */
/* loaded from: classes3.dex */
public class C3521a {

    /* renamed from: a */
    public static String f15705a = "https://pslog.umeng.com";

    /* renamed from: b */
    public static String f15706b = "https://pslog.umeng.com/";

    /* renamed from: c */
    public static String f15707c = "explog";

    /* renamed from: d */
    public static final String f15708d = "analytics";

    /* renamed from: e */
    public static final String f15709e = "ekv";

    /* renamed from: f */
    public static final String f15710f = "id";

    /* renamed from: g */
    public static final String f15711g = "ts";

    /* renamed from: h */
    public static final String f15712h = "ds";

    /* renamed from: i */
    public static final String f15713i = "pn";

    /* renamed from: j */
    public static String f15714j = "";

    static {
        String str = "SUB" + System.currentTimeMillis();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(String.format("%0" + (32 - str.length()) + "d", 0));
        f15714j = sb2.toString();
    }
}
