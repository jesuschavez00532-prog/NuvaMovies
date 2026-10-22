package com.efs.sdk.base.core.model;

/* renamed from: com.efs.sdk.base.core.model.a */
/* loaded from: classes.dex */
public final class C1710a {

    /* renamed from: a */
    String f7173a;

    /* renamed from: b */
    byte f7174b;

    /* renamed from: c */
    int f7175c = 0;

    /* renamed from: d */
    String f7176d = "none";

    /* renamed from: e */
    int f7177e = 1;

    /* renamed from: f */
    long f7178f = 0;

    /* renamed from: g */
    int f7179g = 1;

    /* renamed from: h */
    String f7180h = "";

    /* renamed from: i */
    String f7181i = "";

    /* renamed from: j */
    long f7182j = 0;

    /* renamed from: k */
    long f7183k = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1710a(String str, byte b10) {
        this.f7174b = (byte) 2;
        this.f7173a = str;
        if (b10 > 0 && 3 >= b10) {
            this.f7174b = b10;
            return;
        }
        throw new IllegalArgumentException("log protocol flag invalid : ".concat(String.valueOf((int) b10)));
    }
}
