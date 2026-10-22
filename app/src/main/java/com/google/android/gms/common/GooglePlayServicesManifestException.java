package com.google.android.gms.common;

import com.google.android.gms.common.annotation.KeepName;

@KeepName
/* loaded from: classes.dex */
public abstract class GooglePlayServicesManifestException extends IllegalStateException {

    /* renamed from: a */
    private final int f7515a;

    public GooglePlayServicesManifestException(int i10, String str) {
        super(str);
        this.f7515a = i10;
    }
}
