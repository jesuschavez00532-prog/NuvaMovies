package p007a6;

import android.content.Context;
import android.content.pm.PackageInfo;
import p395x5.C7502e;

/* renamed from: a6.a */
/* loaded from: classes.dex */
public class C0062a {

    /* renamed from: a */
    public final String f184a;

    /* renamed from: b */
    public final String f185b;

    /* renamed from: c */
    public final String f186c;

    /* renamed from: d */
    public final String f187d;

    /* renamed from: e */
    public final String f188e;

    /* renamed from: f */
    public final String f189f;

    /* renamed from: g */
    public final C7502e f190g;

    public C0062a(String str, String str2, String str3, String str4, String str5, String str6, C7502e c7502e) {
        this.f184a = str;
        this.f185b = str2;
        this.f186c = str3;
        this.f187d = str4;
        this.f188e = str5;
        this.f189f = str6;
        this.f190g = c7502e;
    }

    /* renamed from: a */
    public static C0062a m219a(Context context, C0104w c0104w, String str, String str2, C7502e c7502e) {
        String packageName = context.getPackageName();
        String m476g = c0104w.m476g();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String num = Integer.toString(packageInfo.versionCode);
        String str3 = packageInfo.versionName;
        if (str3 == null) {
            str3 = "0.0";
        }
        return new C0062a(str, str2, m476g, packageName, num, str3, c7502e);
    }
}
