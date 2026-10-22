package p232m3;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import com.taobao.accs.common.Constants;

/* renamed from: m3.d */
/* loaded from: classes.dex */
public class C5588d {

    /* renamed from: b */
    private static final String f22619b = Build.MANUFACTURER.toLowerCase();

    /* renamed from: a */
    private Activity f22620a;

    public C5588d(Activity activity) {
        this.f22620a = activity;
    }

    /* renamed from: a */
    private static Intent m22689a(Context context) {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setFlags(262144);
        intent.setData(Uri.fromParts(Constants.KEY_PACKAGE, context.getPackageName(), null));
        return intent;
    }

    /* renamed from: b */
    private static boolean m22690b(Context context, Intent intent) {
        if (context.getPackageManager().queryIntentActivities(intent, 65536).size() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private Intent m22691c(Context context) {
        Intent intent = new Intent();
        intent.setFlags(262144);
        intent.putExtra(Constants.KEY_PACKAGE, context.getPackageName());
        intent.putExtra(Constants.KEY_PACKAGE_NAME, context.getPackageName());
        intent.setData(Uri.fromParts(Constants.KEY_PACKAGE, context.getPackageName(), null));
        intent.setClassName("com.huawei.systemmanager", "com.huawei.permissionmanager.ui.MainActivity");
        if (m22690b(context, intent)) {
            return intent;
        }
        intent.setClassName("com.huawei.systemmanager", "com.huawei.systemmanager.addviewmonitor.AddViewMonitorActivity");
        if (m22690b(context, intent)) {
            return intent;
        }
        intent.setClassName("com.huawei.systemmanager", "com.huawei.notificationmanager.ui.NotificationManagmentActivity");
        if (m22690b(context, intent)) {
            return intent;
        }
        return m22689a(context);
    }

    /* renamed from: d */
    private Intent m22692d(Context context) {
        Intent intent = new Intent("com.meizu.safe.security.SHOW_APPSEC");
        intent.setFlags(262144);
        intent.putExtra(Constants.KEY_PACKAGE_NAME, context.getPackageName());
        intent.setComponent(new ComponentName("com.meizu.safe", "com.meizu.safe.security.AppSecActivity"));
        if (m22690b(context, intent)) {
            return intent;
        }
        return m22689a(context);
    }

    /* renamed from: e */
    private Intent m22693e(Context context) {
        Intent intent = new Intent();
        intent.setFlags(262144);
        intent.putExtra(Constants.KEY_PACKAGE_NAME, context.getPackageName());
        intent.setClassName("com.color.safecenter", "com.color.safecenter.permission.floatwindow.FloatWindowListActivity");
        if (m22690b(context, intent)) {
            return intent;
        }
        intent.setClassName("com.coloros.safecenter", "com.coloros.safecenter.sysfloatwindow.FloatWindowListActivity");
        if (m22690b(context, intent)) {
            return intent;
        }
        intent.setClassName("com.oppo.safe", "com.oppo.safe.permission.PermissionAppListActivity");
        if (m22690b(context, intent)) {
            return intent;
        }
        return m22689a(context);
    }

    /* renamed from: g */
    private Intent m22694g(Context context) {
        Intent intent = new Intent();
        intent.setFlags(262144);
        intent.setClassName("com.iqoo.secure", "com.iqoo.secure.ui.phoneoptimize.FloatWindowManager");
        intent.putExtra("packagename", context.getPackageName());
        if (m22690b(context, intent)) {
            return intent;
        }
        intent.setClassName("com.iqoo.secure", "com.iqoo.secure.safeguard.SoftPermissionDetailActivity");
        if (m22690b(context, intent)) {
            return intent;
        }
        return m22689a(context);
    }

    /* renamed from: h */
    private Intent m22695h(Context context) {
        Intent intent = new Intent("miui.intent.action.APP_PERM_EDITOR");
        intent.setFlags(262144);
        intent.putExtra("extra_pkgname", context.getPackageName());
        if (m22690b(context, intent)) {
            return intent;
        }
        intent.setClassName("com.miui.securitycenter", "com.miui.permcenter.permissions.AppPermissionsEditorActivity");
        if (m22690b(context, intent)) {
            return intent;
        }
        return m22689a(context);
    }

    /* renamed from: f */
    public void m22696f(int i10) {
        Intent m22689a;
        String str = f22619b;
        if (str.contains("huawei")) {
            m22689a = m22691c(this.f22620a);
        } else if (str.contains("xiaomi")) {
            m22689a = m22695h(this.f22620a);
        } else if (str.contains("oppo")) {
            m22689a = m22693e(this.f22620a);
        } else if (str.contains("vivo")) {
            m22689a = m22694g(this.f22620a);
        } else if (str.contains("meizu")) {
            m22689a = m22692d(this.f22620a);
        } else {
            m22689a = m22689a(this.f22620a);
        }
        try {
            this.f22620a.startActivityForResult(m22689a, i10);
        } catch (Exception unused) {
            this.f22620a.startActivityForResult(m22689a(this.f22620a), i10);
        }
    }
}
