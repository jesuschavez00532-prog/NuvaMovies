package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.installations.C2655c;
import com.umeng.message.api.UPushThirdTokenCallback;
import com.umeng.message.entity.UMessage;
import java.util.concurrent.ExecutionException;
import p127f5.AbstractC4250l;
import p294q3.AbstractC6336c;
import p294q3.C6335b;
import p294q3.InterfaceC6338e;
import p294q3.InterfaceC6340g;
import p337t5.C6913d;
import p351u5.InterfaceC7041a;
import p427z6.C7758a;
import p427z6.C7759b;

/* renamed from: com.google.firebase.messaging.e0 */
/* loaded from: classes.dex */
public abstract class AbstractC2676e0 {
    /* renamed from: A */
    public static boolean m11174A(Intent intent) {
        if (intent != null && !m11193r(intent)) {
            return m11175B(intent.getExtras());
        }
        return false;
    }

    /* renamed from: B */
    public static boolean m11175B(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        return "1".equals(bundle.getString("google.c.a.e"));
    }

    /* renamed from: a */
    static boolean m11176a() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            C6913d.m26856k();
            Context m26867j = C6913d.m26856k().m26867j();
            SharedPreferences sharedPreferences = m26867j.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("export_to_big_query")) {
                return sharedPreferences.getBoolean("export_to_big_query", false);
            }
            try {
                PackageManager packageManager = m26867j.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(m26867j.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
                    return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return false;
        } catch (IllegalStateException unused2) {
            Log.i("FirebaseMessaging", "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
            return false;
        }
    }

    /* renamed from: b */
    static C7758a m11177b(C7758a.b bVar, Intent intent) {
        if (intent == null) {
            return null;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = Bundle.EMPTY;
        }
        C7758a.a m29984h = C7758a.m29961p().m29989m(m11191p(extras)).m29981e(bVar).m29982f(m11181f(extras)).m29985i(m11188m()).m29987k(C7758a.d.ANDROID).m29984h(m11186k(extras));
        String m11183h = m11183h(extras);
        if (m11183h != null) {
            m29984h.m29983g(m11183h);
        }
        String m11190o = m11190o(extras);
        if (m11190o != null) {
            m29984h.m29988l(m11190o);
        }
        String m11178c = m11178c(extras);
        if (m11178c != null) {
            m29984h.m29979c(m11178c);
        }
        String m11184i = m11184i(extras);
        if (m11184i != null) {
            m29984h.m29978b(m11184i);
        }
        String m11180e = m11180e(extras);
        if (m11180e != null) {
            m29984h.m29980d(m11180e);
        }
        long m11189n = m11189n(extras);
        if (m11189n > 0) {
            m29984h.m29986j(m11189n);
        }
        return m29984h.m29977a();
    }

    /* renamed from: c */
    static String m11178c(Bundle bundle) {
        return bundle.getString("collapse_key");
    }

    /* renamed from: d */
    static String m11179d(Bundle bundle) {
        return bundle.getString("google.c.a.c_id");
    }

    /* renamed from: e */
    static String m11180e(Bundle bundle) {
        return bundle.getString("google.c.a.c_l");
    }

    /* renamed from: f */
    static String m11181f(Bundle bundle) {
        String string = bundle.getString("google.to");
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        try {
            return (String) AbstractC4250l.m17729a(C2655c.m11018p(C6913d.m26856k()).mo11028a());
        } catch (InterruptedException | ExecutionException e10) {
            throw new RuntimeException(e10);
        }
    }

    /* renamed from: g */
    static String m11182g(Bundle bundle) {
        return bundle.getString("google.c.a.m_c");
    }

    /* renamed from: h */
    static String m11183h(Bundle bundle) {
        String string = bundle.getString("google.message_id");
        if (string == null) {
            return bundle.getString("message_id");
        }
        return string;
    }

    /* renamed from: i */
    static String m11184i(Bundle bundle) {
        return bundle.getString("google.c.a.m_l");
    }

    /* renamed from: j */
    static String m11185j(Bundle bundle) {
        return bundle.getString("google.c.a.ts");
    }

    /* renamed from: k */
    static C7758a.c m11186k(Bundle bundle) {
        if (bundle != null && C2682g0.m11221t(bundle)) {
            return C7758a.c.DISPLAY_NOTIFICATION;
        }
        return C7758a.c.DATA_MESSAGE;
    }

    /* renamed from: l */
    static String m11187l(Bundle bundle) {
        if (bundle != null && C2682g0.m11221t(bundle)) {
            return "display";
        }
        return "data";
    }

    /* renamed from: m */
    static String m11188m() {
        return C6913d.m26856k().m26867j().getPackageName();
    }

    /* renamed from: n */
    static long m11189n(Bundle bundle) {
        if (bundle.containsKey("google.c.sender.id")) {
            try {
                return Long.parseLong(bundle.getString("google.c.sender.id"));
            } catch (NumberFormatException e10) {
                Log.w("FirebaseMessaging", "error parsing project number", e10);
            }
        }
        C6913d m26856k = C6913d.m26856k();
        String m26882d = m26856k.m26869m().m26882d();
        if (m26882d != null) {
            try {
                return Long.parseLong(m26882d);
            } catch (NumberFormatException e11) {
                Log.w("FirebaseMessaging", "error parsing sender ID", e11);
            }
        }
        String m26881c = m26856k.m26869m().m26881c();
        if (!m26881c.startsWith("1:")) {
            try {
                return Long.parseLong(m26881c);
            } catch (NumberFormatException e12) {
                Log.w("FirebaseMessaging", "error parsing app ID", e12);
            }
        } else {
            String[] split = m26881c.split(":");
            if (split.length < 2) {
                return 0L;
            }
            String str = split[1];
            if (str.isEmpty()) {
                return 0L;
            }
            try {
                return Long.parseLong(str);
            } catch (NumberFormatException e13) {
                Log.w("FirebaseMessaging", "error parsing app ID", e13);
            }
        }
        return 0L;
    }

    /* renamed from: o */
    static String m11190o(Bundle bundle) {
        String string = bundle.getString("from");
        if (string == null || !string.startsWith("/topics/")) {
            return null;
        }
        return string;
    }

    /* renamed from: p */
    static int m11191p(Bundle bundle) {
        Object obj = bundle.get("google.ttl");
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (obj instanceof String) {
            try {
                return Integer.parseInt((String) obj);
            } catch (NumberFormatException unused) {
                Log.w("FirebaseMessaging", "Invalid TTL: " + obj);
                return 0;
            }
        }
        return 0;
    }

    /* renamed from: q */
    static String m11192q(Bundle bundle) {
        if (bundle.containsKey("google.c.a.udt")) {
            return bundle.getString("google.c.a.udt");
        }
        return null;
    }

    /* renamed from: r */
    private static boolean m11193r(Intent intent) {
        return "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction());
    }

    /* renamed from: s */
    public static void m11194s(Intent intent) {
        m11199x("_nd", intent.getExtras());
    }

    /* renamed from: t */
    public static void m11195t(Intent intent) {
        m11199x("_nf", intent.getExtras());
    }

    /* renamed from: u */
    public static void m11196u(Bundle bundle) {
        m11200y(bundle);
        m11199x("_no", bundle);
    }

    /* renamed from: v */
    public static void m11197v(Intent intent) {
        if (m11174A(intent)) {
            m11199x("_nr", intent.getExtras());
        }
        if (m11201z(intent)) {
            m11198w(C7758a.b.MESSAGE_DELIVERED, intent, FirebaseMessaging.m11055o());
        }
    }

    /* renamed from: w */
    private static void m11198w(C7758a.b bVar, Intent intent, InterfaceC6340g interfaceC6340g) {
        if (interfaceC6340g == null) {
            Log.e("FirebaseMessaging", "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
            return;
        }
        C7758a m11177b = m11177b(bVar, intent);
        if (m11177b == null) {
            return;
        }
        try {
            interfaceC6340g.mo25123a("FCM_CLIENT_EVENT_LOGGING", C7759b.class, C6335b.m25117b("proto"), new InterfaceC6338e() { // from class: com.google.firebase.messaging.d0
                @Override // p294q3.InterfaceC6338e
                public final Object apply(Object obj) {
                    return ((C7759b) obj).m29992c();
                }
            }).mo25121a(AbstractC6336c.m25119d(C7759b.m29990b().m29994b(m11177b).m29993a()));
        } catch (RuntimeException e10) {
            Log.w("FirebaseMessaging", "Failed to send big query analytics payload.", e10);
        }
    }

    /* renamed from: x */
    static void m11199x(String str, Bundle bundle) {
        try {
            C6913d.m26856k();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String m11179d = m11179d(bundle);
            if (m11179d != null) {
                bundle2.putString("_nmid", m11179d);
            }
            String m11180e = m11180e(bundle);
            if (m11180e != null) {
                bundle2.putString("_nmn", m11180e);
            }
            String m11184i = m11184i(bundle);
            if (!TextUtils.isEmpty(m11184i)) {
                bundle2.putString("label", m11184i);
            }
            String m11182g = m11182g(bundle);
            if (!TextUtils.isEmpty(m11182g)) {
                bundle2.putString("message_channel", m11182g);
            }
            String m11190o = m11190o(bundle);
            if (m11190o != null) {
                bundle2.putString("_nt", m11190o);
            }
            String m11185j = m11185j(bundle);
            if (m11185j != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(m11185j));
                } catch (NumberFormatException e10) {
                    Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e10);
                }
            }
            String m11192q = m11192q(bundle);
            if (m11192q != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(m11192q));
                } catch (NumberFormatException e11) {
                    Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e11);
                }
            }
            String m11187l = m11187l(bundle);
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", m11187l);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Logging to scion event=" + str + " scionPayload=" + bundle2);
            }
            InterfaceC7041a interfaceC7041a = (InterfaceC7041a) C6913d.m26856k().m26866i(InterfaceC7041a.class);
            if (interfaceC7041a != null) {
                interfaceC7041a.mo27141b(UPushThirdTokenCallback.TYPE_FCM, str, bundle2);
            } else {
                Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
            }
        } catch (IllegalStateException unused) {
            Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    /* renamed from: y */
    private static void m11200y(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if ("1".equals(bundle.getString("google.c.a.tc"))) {
            InterfaceC7041a interfaceC7041a = (InterfaceC7041a) C6913d.m26856k().m26866i(InterfaceC7041a.class);
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
            }
            if (interfaceC7041a != null) {
                String string = bundle.getString("google.c.a.c_id");
                interfaceC7041a.mo27142c(UPushThirdTokenCallback.TYPE_FCM, "_ln", string);
                Bundle bundle2 = new Bundle();
                bundle2.putString("source", "Firebase");
                bundle2.putString("medium", UMessage.DISPLAY_TYPE_NOTIFICATION);
                bundle2.putString("campaign", string);
                interfaceC7041a.mo27141b(UPushThirdTokenCallback.TYPE_FCM, "_cmp", bundle2);
                return;
            }
            Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
            return;
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
        }
    }

    /* renamed from: z */
    public static boolean m11201z(Intent intent) {
        if (intent != null && !m11193r(intent)) {
            return m11176a();
        }
        return false;
    }
}
