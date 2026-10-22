package com.google.android.gms.internal.measurement;

import android.net.Uri;
import p214l.C5303a;

/* renamed from: com.google.android.gms.internal.measurement.n6 */
/* loaded from: classes.dex */
public abstract class AbstractC2040n6 {

    /* renamed from: a */
    private static final C5303a f7962a = new C5303a();

    /* renamed from: a */
    public static synchronized Uri m8736a(String str) {
        synchronized (AbstractC2040n6.class) {
            C5303a c5303a = f7962a;
            Uri uri = (Uri) c5303a.get("com.google.android.gms.measurement");
            if (uri == null) {
                Uri parse = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.measurement"))));
                c5303a.put("com.google.android.gms.measurement", parse);
                return parse;
            }
            return uri;
        }
    }
}
