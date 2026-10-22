package com.google.firebase;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import anet.channel.entity.ConnType;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
import p027b7.AbstractC1142e;
import p027b7.AbstractC1145h;
import p027b7.C1140c;
import p312r6.C6542g;

/* loaded from: classes.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static /* synthetic */ String m10835e(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo != null) {
            return String.valueOf(applicationInfo.targetSdkVersion);
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static /* synthetic */ String m10836f(Context context) {
        int i10;
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo != null && Build.VERSION.SDK_INT >= 24) {
            i10 = applicationInfo.minSdkVersion;
            return String.valueOf(i10);
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ String m10837g(Context context) {
        int i10 = Build.VERSION.SDK_INT;
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
            return "tv";
        }
        if (i10 >= 20 && context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            return "watch";
        }
        if (i10 >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            return ConnType.PK_AUTO;
        }
        if (i10 >= 26 && context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
            return "embedded";
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static /* synthetic */ String m10838h(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        if (installerPackageName != null) {
            return m10839i(installerPackageName);
        }
        return "";
    }

    /* renamed from: i */
    private static String m10839i(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(C1140c.m5193c());
        arrayList.add(C6542g.m25583h());
        arrayList.add(AbstractC1145h.m5202b("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(AbstractC1145h.m5202b("fire-core", "20.1.2"));
        arrayList.add(AbstractC1145h.m5202b("device-name", m10839i(Build.PRODUCT)));
        arrayList.add(AbstractC1145h.m5202b("device-model", m10839i(Build.DEVICE)));
        arrayList.add(AbstractC1145h.m5202b("device-brand", m10839i(Build.BRAND)));
        arrayList.add(AbstractC1145h.m5203c("android-target-sdk", new AbstractC1145h.a() { // from class: t5.f
            @Override // p027b7.AbstractC1145h.a
            /* renamed from: a */
            public final String mo5205a(Object obj) {
                String m10835e;
                m10835e = FirebaseCommonRegistrar.m10835e((Context) obj);
                return m10835e;
            }
        }));
        arrayList.add(AbstractC1145h.m5203c("android-min-sdk", new AbstractC1145h.a() { // from class: t5.g
            @Override // p027b7.AbstractC1145h.a
            /* renamed from: a */
            public final String mo5205a(Object obj) {
                String m10836f;
                m10836f = FirebaseCommonRegistrar.m10836f((Context) obj);
                return m10836f;
            }
        }));
        arrayList.add(AbstractC1145h.m5203c("android-platform", new AbstractC1145h.a() { // from class: t5.h
            @Override // p027b7.AbstractC1145h.a
            /* renamed from: a */
            public final String mo5205a(Object obj) {
                String m10837g;
                m10837g = FirebaseCommonRegistrar.m10837g((Context) obj);
                return m10837g;
            }
        }));
        arrayList.add(AbstractC1145h.m5203c("android-installer", new AbstractC1145h.a() { // from class: t5.i
            @Override // p027b7.AbstractC1145h.a
            /* renamed from: a */
            public final String mo5205a(Object obj) {
                String m10838h;
                m10838h = FirebaseCommonRegistrar.m10838h((Context) obj);
                return m10838h;
            }
        }));
        String m5199a = AbstractC1142e.m5199a();
        if (m5199a != null) {
            arrayList.add(AbstractC1145h.m5202b("kotlin", m5199a));
        }
        return arrayList;
    }
}
