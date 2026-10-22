package com.google.firebase.iid;

import android.content.Context;
import android.util.Log;

/* renamed from: com.google.firebase.iid.t */
/* loaded from: classes.dex */
public class C2650t {

    /* renamed from: c */
    private static C2650t f10126c;

    /* renamed from: a */
    private Boolean f10127a = null;

    /* renamed from: b */
    private Boolean f10128b = null;

    private C2650t() {
    }

    /* renamed from: a */
    public static synchronized C2650t m10971a() {
        C2650t c2650t;
        synchronized (C2650t.class) {
            if (f10126c == null) {
                f10126c = new C2650t();
            }
            c2650t = f10126c;
        }
        return c2650t;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean m10972b(Context context) {
        boolean z10;
        if (this.f10128b == null) {
            if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f10128b = Boolean.valueOf(z10);
        }
        if (!this.f10127a.booleanValue() && Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f10128b.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean m10973c(Context context) {
        boolean z10;
        if (this.f10127a == null) {
            if (context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f10127a = Boolean.valueOf(z10);
        }
        if (!this.f10127a.booleanValue() && Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f10127a.booleanValue();
    }
}
