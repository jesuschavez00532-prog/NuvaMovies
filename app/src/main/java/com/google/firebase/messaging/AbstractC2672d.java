package com.google.firebase.messaging;

import android.R;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.app.AbstractC0517l;
import androidx.core.content.AbstractC0547a;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.firebase.messaging.d */
/* loaded from: classes.dex */
public abstract class AbstractC2672d {

    /* renamed from: a */
    private static final AtomicInteger f10279a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    /* renamed from: com.google.firebase.messaging.d$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public final AbstractC0517l.e f10280a;

        /* renamed from: b */
        public final String f10281b;

        /* renamed from: c */
        public final int f10282c;

        a(AbstractC0517l.e eVar, String str, int i10) {
            this.f10280a = eVar;
            this.f10281b = str;
            this.f10282c = i10;
        }
    }

    /* renamed from: a */
    private static PendingIntent m11147a(Context context, C2682g0 c2682g0, String str, PackageManager packageManager) {
        Intent m11153g = m11153g(str, c2682g0, packageManager);
        if (m11153g == null) {
            return null;
        }
        m11153g.addFlags(67108864);
        m11153g.putExtras(c2682g0.m11244y());
        if (m11164r(c2682g0)) {
            m11153g.putExtra("gcm.n.analytics_data", c2682g0.m11243x());
        }
        return PendingIntent.getActivity(context, m11154h(), m11153g, m11159m(1073741824));
    }

    /* renamed from: b */
    private static PendingIntent m11148b(Context context, Context context2, C2682g0 c2682g0) {
        if (!m11164r(c2682g0)) {
            return null;
        }
        return m11149c(context, context2, new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(c2682g0.m11243x()));
    }

    /* renamed from: c */
    private static PendingIntent m11149c(Context context, Context context2, Intent intent) {
        return PendingIntent.getBroadcast(context, m11154h(), new Intent("com.google.firebase.MESSAGING_EVENT").setComponent(new ComponentName(context2, "com.google.firebase.iid.FirebaseInstanceIdReceiver")).putExtra("wrapped_intent", intent), m11159m(1073741824));
    }

    /* renamed from: d */
    public static a m11150d(Context context, Context context2, C2682g0 c2682g0, String str, Bundle bundle) {
        return m11151e(context, context2, c2682g0, str, bundle, context2.getPackageName(), context2.getResources(), context2.getPackageManager());
    }

    /* renamed from: e */
    public static a m11151e(Context context, Context context2, C2682g0 c2682g0, String str, Bundle bundle, String str2, Resources resources, PackageManager packageManager) {
        AbstractC0517l.e eVar = new AbstractC0517l.e(context2, str);
        String m11238n = c2682g0.m11238n(resources, str2, "gcm.n.title");
        if (!TextUtils.isEmpty(m11238n)) {
            eVar.m2261k(m11238n);
        }
        String m11238n2 = c2682g0.m11238n(resources, str2, "gcm.n.body");
        if (!TextUtils.isEmpty(m11238n2)) {
            eVar.m2260j(m11238n2);
            eVar.m2272w(new AbstractC0517l.c().m2247h(m11238n2));
        }
        eVar.m2270u(m11160n(packageManager, resources, str2, c2682g0.m11240p("gcm.n.icon"), bundle));
        Uri m11161o = m11161o(str2, c2682g0, resources);
        if (m11161o != null) {
            eVar.m2271v(m11161o);
        }
        eVar.m2259i(m11147a(context, c2682g0, str2, packageManager));
        PendingIntent m11148b = m11148b(context, context2, c2682g0);
        if (m11148b != null) {
            eVar.m2263m(m11148b);
        }
        Integer m11155i = m11155i(context2, c2682g0.m11240p("gcm.n.color"), bundle);
        if (m11155i != null) {
            eVar.m2258h(m11155i.intValue());
        }
        eVar.m2256f(!c2682g0.m11226a("gcm.n.sticky"));
        eVar.m2266q(c2682g0.m11226a("gcm.n.local_only"));
        String m11240p = c2682g0.m11240p("gcm.n.ticker");
        if (m11240p != null) {
            eVar.m2273x(m11240p);
        }
        Integer m11237m = c2682g0.m11237m();
        if (m11237m != null) {
            eVar.m2268s(m11237m.intValue());
        }
        Integer m11242r = c2682g0.m11242r();
        if (m11242r != null) {
            eVar.m2275z(m11242r.intValue());
        }
        Integer m11236l = c2682g0.m11236l();
        if (m11236l != null) {
            eVar.m2267r(m11236l.intValue());
        }
        Long m11234j = c2682g0.m11234j("gcm.n.event_time");
        if (m11234j != null) {
            eVar.m2269t(true);
            eVar.m2252A(m11234j.longValue());
        }
        long[] m11241q = c2682g0.m11241q();
        if (m11241q != null) {
            eVar.m2274y(m11241q);
        }
        int[] m11229e = c2682g0.m11229e();
        if (m11229e != null) {
            eVar.m2265p(m11229e[0], m11229e[1], m11229e[2]);
        }
        eVar.m2262l(m11156j(c2682g0));
        return new a(eVar, m11162p(c2682g0), 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static a m11152f(Context context, C2682g0 c2682g0) {
        Bundle m11157k = m11157k(context.getPackageManager(), context.getPackageName());
        return m11150d(context, context, c2682g0, m11158l(context, c2682g0.m11235k(), m11157k), m11157k);
    }

    /* renamed from: g */
    private static Intent m11153g(String str, C2682g0 c2682g0, PackageManager packageManager) {
        String m11240p = c2682g0.m11240p("gcm.n.click_action");
        if (!TextUtils.isEmpty(m11240p)) {
            Intent intent = new Intent(m11240p);
            intent.setPackage(str);
            intent.setFlags(268435456);
            return intent;
        }
        Uri m11230f = c2682g0.m11230f();
        if (m11230f != null) {
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setPackage(str);
            intent2.setData(m11230f);
            return intent2;
        }
        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            Log.w("FirebaseMessaging", "No activity found to launch app");
        }
        return launchIntentForPackage;
    }

    /* renamed from: h */
    private static int m11154h() {
        return f10279a.incrementAndGet();
    }

    /* renamed from: i */
    private static Integer m11155i(Context context, String str, Bundle bundle) {
        if (Build.VERSION.SDK_INT < 21) {
            return null;
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (IllegalArgumentException unused) {
                Log.w("FirebaseMessaging", "Color is invalid: " + str + ". Notification will use default color.");
            }
        }
        int i10 = bundle.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i10 != 0) {
            try {
                return Integer.valueOf(AbstractC0547a.m2322d(context, i10));
            } catch (Resources.NotFoundException unused2) {
                Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* renamed from: j */
    private static int m11156j(C2682g0 c2682g0) {
        boolean m11226a = c2682g0.m11226a("gcm.n.default_sound");
        Object r02 = m11226a;
        if (c2682g0.m11226a("gcm.n.default_vibrate_timings")) {
            r02 = (m11226a ? 1 : 0) | 2;
        }
        if (c2682g0.m11226a("gcm.n.default_light_settings")) {
            return r02 | 4;
        }
        return r02;
    }

    /* renamed from: k */
    private static Bundle m11157k(PackageManager packageManager, String str) {
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 128);
            if (applicationInfo != null) {
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null) {
                    return bundle;
                }
            }
        } catch (PackageManager.NameNotFoundException e10) {
            Log.w("FirebaseMessaging", "Couldn't get own application info: " + e10);
        }
        return Bundle.EMPTY;
    }

    /* renamed from: l */
    public static String m11158l(Context context, String str, Bundle bundle) {
        Object systemService;
        NotificationChannel notificationChannel;
        String string;
        NotificationChannel notificationChannel2;
        NotificationChannel notificationChannel3;
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        try {
            if (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion >= 26) {
                systemService = context.getSystemService((Class<Object>) NotificationManager.class);
                NotificationManager notificationManager = (NotificationManager) systemService;
                if (!TextUtils.isEmpty(str)) {
                    notificationChannel3 = notificationManager.getNotificationChannel(str);
                    if (notificationChannel3 != null) {
                        return str;
                    }
                    Log.w("FirebaseMessaging", "Notification Channel requested (" + str + ") has not been created by the app. Manifest configuration, or default, value will be used.");
                }
                String string2 = bundle.getString("com.google.firebase.messaging.default_notification_channel_id");
                if (!TextUtils.isEmpty(string2)) {
                    notificationChannel2 = notificationManager.getNotificationChannel(string2);
                    if (notificationChannel2 != null) {
                        return string2;
                    }
                    Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
                } else {
                    Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
                }
                notificationChannel = notificationManager.getNotificationChannel("fcm_fallback_notification_channel");
                if (notificationChannel == null) {
                    int identifier = context.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", context.getPackageName());
                    if (identifier == 0) {
                        Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                        string = "Misc";
                    } else {
                        string = context.getString(identifier);
                    }
                    notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", string, 3));
                }
                return "fcm_fallback_notification_channel";
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: m */
    private static int m11159m(int i10) {
        if (Build.VERSION.SDK_INT >= 23) {
            return i10 | 67108864;
        }
        return i10;
    }

    /* renamed from: n */
    private static int m11160n(PackageManager packageManager, Resources resources, String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str2)) {
            int identifier = resources.getIdentifier(str2, "drawable", str);
            if (identifier != 0 && m11163q(resources, identifier)) {
                return identifier;
            }
            int identifier2 = resources.getIdentifier(str2, "mipmap", str);
            if (identifier2 != 0 && m11163q(resources, identifier2)) {
                return identifier2;
            }
            Log.w("FirebaseMessaging", "Icon resource " + str2 + " not found. Notification will use default icon.");
        }
        int i10 = bundle.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i10 == 0 || !m11163q(resources, i10)) {
            try {
                i10 = packageManager.getApplicationInfo(str, 0).icon;
            } catch (PackageManager.NameNotFoundException e10) {
                Log.w("FirebaseMessaging", "Couldn't get own application info: " + e10);
            }
        }
        if (i10 == 0 || !m11163q(resources, i10)) {
            return R.drawable.sym_def_app_icon;
        }
        return i10;
    }

    /* renamed from: o */
    private static Uri m11161o(String str, C2682g0 c2682g0, Resources resources) {
        String m11239o = c2682g0.m11239o();
        if (TextUtils.isEmpty(m11239o)) {
            return null;
        }
        if (!"default".equals(m11239o) && resources.getIdentifier(m11239o, "raw", str) != 0) {
            return Uri.parse("android.resource://" + str + "/raw/" + m11239o);
        }
        return RingtoneManager.getDefaultUri(2);
    }

    /* renamed from: p */
    private static String m11162p(C2682g0 c2682g0) {
        String m11240p = c2682g0.m11240p("gcm.n.tag");
        if (!TextUtils.isEmpty(m11240p)) {
            return m11240p;
        }
        return "FCM-Notification:" + SystemClock.uptimeMillis();
    }

    /* renamed from: q */
    private static boolean m11163q(Resources resources, int i10) {
        Drawable drawable;
        if (Build.VERSION.SDK_INT == 26) {
            try {
                drawable = resources.getDrawable(i10, null);
                if (!AbstractC2669c.m11139a(drawable)) {
                    return true;
                }
                Log.e("FirebaseMessaging", "Adaptive icons cannot be used in notifications. Ignoring icon id: " + i10);
                return false;
            } catch (Resources.NotFoundException unused) {
                Log.e("FirebaseMessaging", "Couldn't find resource " + i10 + ", treating it as an invalid icon");
                return false;
            }
        }
        return true;
    }

    /* renamed from: r */
    static boolean m11164r(C2682g0 c2682g0) {
        return c2682g0.m11226a("google.c.a.e");
    }
}
