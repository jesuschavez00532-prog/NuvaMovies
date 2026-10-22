package com.google.firebase.messaging;

import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.google.firebase.messaging.g0 */
/* loaded from: classes.dex */
public class C2682g0 {

    /* renamed from: a */
    private final Bundle f10297a;

    public C2682g0(Bundle bundle) {
        if (bundle != null) {
            this.f10297a = new Bundle(bundle);
            return;
        }
        throw new NullPointerException("data");
    }

    /* renamed from: d */
    private static int m11219d(String str) {
        int parseColor = Color.parseColor(str);
        if (parseColor != -16777216) {
            return parseColor;
        }
        throw new IllegalArgumentException("Transparent color is invalid");
    }

    /* renamed from: s */
    private static boolean m11220s(String str) {
        if (!str.startsWith("google.c.a.") && !str.equals("from")) {
            return false;
        }
        return true;
    }

    /* renamed from: t */
    public static boolean m11221t(Bundle bundle) {
        if (!"1".equals(bundle.getString("gcm.n.e")) && !"1".equals(bundle.getString(m11223v("gcm.n.e")))) {
            return false;
        }
        return true;
    }

    /* renamed from: u */
    private static boolean m11222u(String str) {
        if (!str.startsWith("google.c.") && !str.startsWith("gcm.n.") && !str.startsWith("gcm.notification.")) {
            return false;
        }
        return true;
    }

    /* renamed from: v */
    private static String m11223v(String str) {
        if (!str.startsWith("gcm.n.")) {
            return str;
        }
        return str.replace("gcm.n.", "gcm.notification.");
    }

    /* renamed from: w */
    private String m11224w(String str) {
        if (!this.f10297a.containsKey(str) && str.startsWith("gcm.n.")) {
            String m11223v = m11223v(str);
            if (this.f10297a.containsKey(m11223v)) {
                return m11223v;
            }
        }
        return str;
    }

    /* renamed from: z */
    private static String m11225z(String str) {
        if (str.startsWith("gcm.n.")) {
            return str.substring(6);
        }
        return str;
    }

    /* renamed from: a */
    public boolean m11226a(String str) {
        String m11240p = m11240p(str);
        if (!"1".equals(m11240p) && !Boolean.parseBoolean(m11240p)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public Integer m11227b(String str) {
        String m11240p = m11240p(str);
        if (!TextUtils.isEmpty(m11240p)) {
            try {
                return Integer.valueOf(Integer.parseInt(m11240p));
            } catch (NumberFormatException unused) {
                Log.w("NotificationParams", "Couldn't parse value of " + m11225z(str) + "(" + m11240p + ") into an int");
                return null;
            }
        }
        return null;
    }

    /* renamed from: c */
    public JSONArray m11228c(String str) {
        String m11240p = m11240p(str);
        if (!TextUtils.isEmpty(m11240p)) {
            try {
                return new JSONArray(m11240p);
            } catch (JSONException unused) {
                Log.w("NotificationParams", "Malformed JSON for key " + m11225z(str) + ": " + m11240p + ", falling back to default");
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public int[] m11229e() {
        JSONArray m11228c = m11228c("gcm.n.light_settings");
        if (m11228c == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (m11228c.length() == 3) {
                iArr[0] = m11219d(m11228c.optString(0));
                iArr[1] = m11228c.optInt(1);
                iArr[2] = m11228c.optInt(2);
                return iArr;
            }
            throw new JSONException("lightSettings don't have all three fields");
        } catch (IllegalArgumentException e10) {
            Log.w("NotificationParams", "LightSettings is invalid: " + m11228c + ". " + e10.getMessage() + ". Skipping setting LightSettings");
            return null;
        } catch (JSONException unused) {
            Log.w("NotificationParams", "LightSettings is invalid: " + m11228c + ". Skipping setting LightSettings");
            return null;
        }
    }

    /* renamed from: f */
    public Uri m11230f() {
        String m11240p = m11240p("gcm.n.link_android");
        if (TextUtils.isEmpty(m11240p)) {
            m11240p = m11240p("gcm.n.link");
        }
        if (!TextUtils.isEmpty(m11240p)) {
            return Uri.parse(m11240p);
        }
        return null;
    }

    /* renamed from: g */
    public Object[] m11231g(String str) {
        JSONArray m11228c = m11228c(str + "_loc_args");
        if (m11228c == null) {
            return null;
        }
        int length = m11228c.length();
        String[] strArr = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            strArr[i10] = m11228c.optString(i10);
        }
        return strArr;
    }

    /* renamed from: h */
    public String m11232h(String str) {
        return m11240p(str + "_loc_key");
    }

    /* renamed from: i */
    public String m11233i(Resources resources, String str, String str2) {
        String m11232h = m11232h(str2);
        if (TextUtils.isEmpty(m11232h)) {
            return null;
        }
        int identifier = resources.getIdentifier(m11232h, "string", str);
        if (identifier == 0) {
            Log.w("NotificationParams", m11225z(str2 + "_loc_key") + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        Object[] m11231g = m11231g(str2);
        if (m11231g == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, m11231g);
        } catch (MissingFormatArgumentException e10) {
            Log.w("NotificationParams", "Missing format argument for " + m11225z(str2) + ": " + Arrays.toString(m11231g) + " Default value will be used.", e10);
            return null;
        }
    }

    /* renamed from: j */
    public Long m11234j(String str) {
        String m11240p = m11240p(str);
        if (!TextUtils.isEmpty(m11240p)) {
            try {
                return Long.valueOf(Long.parseLong(m11240p));
            } catch (NumberFormatException unused) {
                Log.w("NotificationParams", "Couldn't parse value of " + m11225z(str) + "(" + m11240p + ") into a long");
                return null;
            }
        }
        return null;
    }

    /* renamed from: k */
    public String m11235k() {
        return m11240p("gcm.n.android_channel_id");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public Integer m11236l() {
        Integer m11227b = m11227b("gcm.n.notification_count");
        if (m11227b == null) {
            return null;
        }
        if (m11227b.intValue() < 0) {
            Log.w("FirebaseMessaging", "notificationCount is invalid: " + m11227b + ". Skipping setting notificationCount.");
            return null;
        }
        return m11227b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public Integer m11237m() {
        Integer m11227b = m11227b("gcm.n.notification_priority");
        if (m11227b == null) {
            return null;
        }
        if (m11227b.intValue() >= -2 && m11227b.intValue() <= 2) {
            return m11227b;
        }
        Log.w("FirebaseMessaging", "notificationPriority is invalid " + m11227b + ". Skipping setting notificationPriority.");
        return null;
    }

    /* renamed from: n */
    public String m11238n(Resources resources, String str, String str2) {
        String m11240p = m11240p(str2);
        if (!TextUtils.isEmpty(m11240p)) {
            return m11240p;
        }
        return m11233i(resources, str, str2);
    }

    /* renamed from: o */
    public String m11239o() {
        String m11240p = m11240p("gcm.n.sound2");
        if (TextUtils.isEmpty(m11240p)) {
            return m11240p("gcm.n.sound");
        }
        return m11240p;
    }

    /* renamed from: p */
    public String m11240p(String str) {
        return this.f10297a.getString(m11224w(str));
    }

    /* renamed from: q */
    public long[] m11241q() {
        JSONArray m11228c = m11228c("gcm.n.vibrate_timings");
        if (m11228c == null) {
            return null;
        }
        try {
            if (m11228c.length() > 1) {
                int length = m11228c.length();
                long[] jArr = new long[length];
                for (int i10 = 0; i10 < length; i10++) {
                    jArr[i10] = m11228c.optLong(i10);
                }
                return jArr;
            }
            throw new JSONException("vibrateTimings have invalid length");
        } catch (NumberFormatException | JSONException unused) {
            Log.w("NotificationParams", "User defined vibrateTimings is invalid: " + m11228c + ". Skipping setting vibrateTimings.");
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public Integer m11242r() {
        Integer m11227b = m11227b("gcm.n.visibility");
        if (m11227b == null) {
            return null;
        }
        if (m11227b.intValue() >= -1 && m11227b.intValue() <= 1) {
            return m11227b;
        }
        Log.w("NotificationParams", "visibility is invalid: " + m11227b + ". Skipping setting visibility.");
        return null;
    }

    /* renamed from: x */
    public Bundle m11243x() {
        Bundle bundle = new Bundle(this.f10297a);
        for (String str : this.f10297a.keySet()) {
            if (!m11220s(str)) {
                bundle.remove(str);
            }
        }
        return bundle;
    }

    /* renamed from: y */
    public Bundle m11244y() {
        Bundle bundle = new Bundle(this.f10297a);
        for (String str : this.f10297a.keySet()) {
            if (m11222u(str)) {
                bundle.remove(str);
            }
        }
        return bundle;
    }
}
