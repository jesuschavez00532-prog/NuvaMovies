package p412y6;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import androidx.core.content.AbstractC0547a;
import p297q6.InterfaceC6348c;

/* renamed from: y6.a */
/* loaded from: classes.dex */
public class C7680a {

    /* renamed from: a */
    private final Context f28115a;

    /* renamed from: b */
    private final SharedPreferences f28116b;

    /* renamed from: c */
    private final InterfaceC6348c f28117c;

    /* renamed from: d */
    private boolean f28118d;

    public C7680a(Context context, String str, InterfaceC6348c interfaceC6348c) {
        Context m29470a = m29470a(context);
        this.f28115a = m29470a;
        this.f28116b = m29470a.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f28117c = interfaceC6348c;
        this.f28118d = m29471c();
    }

    /* renamed from: a */
    private static Context m29470a(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return context;
        }
        return AbstractC0547a.m2320b(context);
    }

    /* renamed from: c */
    private boolean m29471c() {
        if (this.f28116b.contains("firebase_data_collection_default_enabled")) {
            return this.f28116b.getBoolean("firebase_data_collection_default_enabled", true);
        }
        return m29472d();
    }

    /* renamed from: d */
    private boolean m29472d() {
        ApplicationInfo applicationInfo = null;
        Bundle bundle = null;
        try {
            PackageManager packageManager = this.f28115a.getPackageManager();
            if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(this.f28115a.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_data_collection_default_enabled")) {
                return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    /* renamed from: b */
    public synchronized boolean m29473b() {
        return this.f28118d;
    }
}
