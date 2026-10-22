package com.umeng.message.proguard;

import android.graphics.Bitmap;
import android.text.TextUtils;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.umeng.message.proguard.dk */
/* loaded from: classes3.dex */
public final class C3649dk {

    /* renamed from: a */
    final C3621ck f16346a;

    /* renamed from: b */
    final Bitmap f16347b;

    /* renamed from: c */
    private final String f16348c;

    public C3649dk(C3621ck c3621ck, Bitmap bitmap) {
        this.f16346a = c3621ck;
        this.f16348c = c3621ck.m15523c();
        this.f16347b = bitmap;
    }

    /* renamed from: a */
    public final boolean m15667a() {
        if (C3601bs.m15446a(this.f16346a.m15521a()) == C3601bs.f16092a) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3649dk)) {
            return false;
        }
        C3649dk c3649dk = (C3649dk) obj;
        if (hashCode() != c3649dk.hashCode()) {
            return false;
        }
        return TextUtils.equals(this.f16348c, c3649dk.f16348c);
    }

    public final int hashCode() {
        String str = this.f16348c;
        if (str != null) {
            return str.hashCode();
        }
        return super.hashCode();
    }
}
