package p232m3;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import com.taobao.accs.common.Constants;

/* renamed from: m3.f */
/* loaded from: classes.dex */
public class C5590f {

    /* renamed from: b */
    private static final String f22621b = Build.MANUFACTURER.toLowerCase();

    /* renamed from: a */
    private Activity f22622a;

    public C5590f(Activity activity) {
        this.f22622a = activity;
    }

    /* renamed from: a */
    private static Intent m22697a(Context context) {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setFlags(262144);
        intent.setData(Uri.fromParts(Constants.KEY_PACKAGE, context.getPackageName(), null));
        return intent;
    }

    /* renamed from: b */
    private static Intent m22698b(Context context) {
        Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION");
        intent.setFlags(262144);
        intent.setData(Uri.fromParts(Constants.KEY_PACKAGE, context.getPackageName(), null));
        if (m22699c(context, intent)) {
            return intent;
        }
        return m22697a(context);
    }

    /* renamed from: c */
    private static boolean m22699c(Context context, Intent intent) {
        if (context.getPackageManager().queryIntentActivities(intent, 65536).size() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private static Intent m22700d(Context context) {
        Intent intent = new Intent("com.meizu.safe.security.SHOW_APPSEC");
        intent.setFlags(262144);
        intent.putExtra(Constants.KEY_PACKAGE_NAME, context.getPackageName());
        intent.setClassName("com.meizu.safe", "com.meizu.safe.security.AppSecActivity");
        if (m22699c(context, intent)) {
            return intent;
        }
        return m22698b(context);
    }

    /* renamed from: e */
    public void m22701e(int i10) {
        Intent m22698b;
        if (f22621b.contains("meizu")) {
            m22698b = m22700d(this.f22622a);
        } else {
            m22698b = m22698b(this.f22622a);
        }
        try {
            this.f22622a.startActivityForResult(m22698b, i10);
        } catch (Exception unused) {
            this.f22622a.startActivityForResult(m22697a(this.f22622a), i10);
        }
    }
}
