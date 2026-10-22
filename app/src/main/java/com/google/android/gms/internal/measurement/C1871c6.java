package com.google.android.gms.internal.measurement;

import android.net.Uri;
import p214l.C5311i;

/* renamed from: com.google.android.gms.internal.measurement.c6 */
/* loaded from: classes.dex */
public final class C1871c6 {

    /* renamed from: a */
    private final C5311i f7689a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1871c6(C5311i c5311i) {
        this.f7689a = c5311i;
    }

    /* renamed from: a */
    public final String m8174a(Uri uri, String str, String str2, String str3) {
        if (uri == null) {
            return null;
        }
        C5311i c5311i = (C5311i) this.f7689a.get(uri.toString());
        if (c5311i == null) {
            return null;
        }
        return (String) c5311i.get("".concat(String.valueOf(str3)));
    }
}
