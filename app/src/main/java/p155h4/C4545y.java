package p155h4;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;
import p281p4.AbstractC6207k;
import p310r4.C6534e;

/* renamed from: h4.y */
/* loaded from: classes.dex */
public final class C4545y {

    /* renamed from: a */
    private final Context f19591a;

    /* renamed from: b */
    private int f19592b;

    /* renamed from: c */
    private int f19593c = 0;

    public C4545y(Context context) {
        this.f19591a = context;
    }

    /* renamed from: a */
    public final synchronized int m18942a() {
        PackageInfo packageInfo;
        if (this.f19592b == 0) {
            try {
                packageInfo = C6534e.m25570a(this.f19591a).m25567e("com.google.android.gms", 0);
            } catch (PackageManager.NameNotFoundException e10) {
                String valueOf = String.valueOf(e10);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 23);
                sb2.append("Failed to find package ");
                sb2.append(valueOf);
                Log.w("Metadata", sb2.toString());
                packageInfo = null;
            }
            if (packageInfo != null) {
                this.f19592b = packageInfo.versionCode;
            }
        }
        return this.f19592b;
    }

    /* renamed from: b */
    public final synchronized int m18943b() {
        int i10 = this.f19593c;
        if (i10 != 0) {
            return i10;
        }
        PackageManager packageManager = this.f19591a.getPackageManager();
        if (C6534e.m25570a(this.f19591a).m25564b("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        int i11 = 1;
        if (!AbstractC6207k.m24771h()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.f19593c = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
            this.f19593c = 2;
            return 2;
        }
        Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
        if (AbstractC6207k.m24771h()) {
            this.f19593c = 2;
            i11 = 2;
        } else {
            this.f19593c = 1;
        }
        return i11;
    }
}
