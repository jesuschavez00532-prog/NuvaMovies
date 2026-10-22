package p419yd;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import p433zd.AbstractC7788d;
import p433zd.AbstractC7789e;

/* renamed from: yd.a */
/* loaded from: classes3.dex */
public class C7706a {

    /* renamed from: f */
    private static C7706a f28315f = new C7706a();

    /* renamed from: a */
    private int f28316a;

    /* renamed from: b */
    private int f28317b;

    /* renamed from: c */
    private int f28318c;

    /* renamed from: d */
    private int f28319d;

    /* renamed from: e */
    private boolean f28320e;

    private C7706a() {
    }

    /* renamed from: d */
    public static C7706a m29774d() {
        return f28315f;
    }

    /* renamed from: e */
    private void m29775e(Context context) {
        Bundle bundle;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo != null && (bundle = applicationInfo.metaData) != null) {
                this.f28318c = ((Integer) bundle.get("design_width")).intValue();
                this.f28319d = ((Integer) applicationInfo.metaData.get("design_height")).intValue();
            }
            AbstractC7788d.m30170a(" designWidth =" + this.f28318c + " , designHeight = " + this.f28319d);
        } catch (PackageManager.NameNotFoundException e10) {
            throw new RuntimeException("you must set design_width and design_height  in your manifest file.", e10);
        }
    }

    /* renamed from: a */
    public void m29776a() {
        if (this.f28319d > 0 && this.f28318c > 0) {
        } else {
            throw new RuntimeException("you must set design_width and design_height  in your manifest file.");
        }
    }

    /* renamed from: b */
    public int m29777b() {
        return this.f28319d;
    }

    /* renamed from: c */
    public int m29778c() {
        return this.f28318c;
    }

    /* renamed from: f */
    public int m29779f() {
        return this.f28317b;
    }

    /* renamed from: g */
    public int m29780g() {
        return this.f28316a;
    }

    /* renamed from: h */
    public void m29781h(Context context) {
        m29775e(context);
        int[] m30171a = AbstractC7789e.m30171a(context, this.f28320e);
        this.f28316a = m30171a[0];
        this.f28317b = m30171a[1];
        AbstractC7788d.m30170a(" screenWidth =" + this.f28316a + " ,screenHeight = " + this.f28317b);
    }

    /* renamed from: i */
    public C7706a m29782i() {
        this.f28320e = true;
        return this;
    }
}
