package com.google.firebase.installations;

import p337t5.AbstractC6919j;

/* renamed from: com.google.firebase.installations.d */
/* loaded from: classes.dex */
public class C2656d extends AbstractC6919j {

    /* renamed from: a */
    private final a f10173a;

    /* renamed from: com.google.firebase.installations.d$a */
    /* loaded from: classes.dex */
    public enum a {
        BAD_CONFIG,
        UNAVAILABLE,
        TOO_MANY_REQUESTS
    }

    public C2656d(a aVar) {
        this.f10173a = aVar;
    }

    public C2656d(String str, a aVar) {
        super(str);
        this.f10173a = aVar;
    }
}
