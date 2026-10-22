package com.alibaba.sdk.android.utils.crashdefend;

import android.util.Log;

/* renamed from: com.alibaba.sdk.android.utils.crashdefend.c */
/* loaded from: classes.dex */
public class C1571c implements Cloneable {

    /* renamed from: a */
    public int f6071a;

    /* renamed from: a */
    public long f6072a;

    /* renamed from: a */
    public String f6074a;

    /* renamed from: b */
    public int f6075b;

    /* renamed from: b */
    public long f6076b;

    /* renamed from: b */
    public String f6077b;
    public int crashCount;

    /* renamed from: c */
    public int f6078c = 0;

    /* renamed from: c */
    public volatile boolean f6079c = false;

    /* renamed from: a */
    public SDKMessageCallback f6073a = null;

    public Object clone() {
        try {
            return (C1571c) super.clone();
        } catch (CloneNotSupportedException e10) {
            Log.e("CrashSDK", "clone fail:", e10);
            return null;
        }
    }
}
