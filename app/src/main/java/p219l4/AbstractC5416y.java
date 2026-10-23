package p219l4;

import android.R;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.base.R$string;
import java.util.Locale;
import p172i4.AbstractC4874l;
import p214l.C5311i;
import p281p4.AbstractC6204h;
import p310r4.C6534e;
import p331t.AbstractC6872c;

/* renamed from: l4.y */
/* loaded from: classes.dex */
public abstract class AbstractC5416y {

    /* renamed from: a */
    private static final C5311i f22052a = new C5311i();

    /* renamed from: b */
    private static Locale f22053b;

    /* renamed from: a */
    public static String m21819a(Context context) {
        String packageName = context.getPackageName();
        try {
            return C6534e.m25570a(context).m25566d(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            if (TextUtils.isEmpty(str)) {
                return packageName;
            }
            return str;
        }
    }

    /* renamed from: b */
    public static String m21820b(Context context) {
        return context.getResources().getString(R$string.common_google_play_services_notification_channel_name);
    }

    /* renamed from: c */
    public static String m21821c(Context context, int i10) {
        Resources resources = context.getResources();
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return resources.getString(R.string.ok);
                }
                return resources.getString(R$string.common_google_play_services_enable_button);
            }
            return resources.getString(R$string.common_google_play_services_update_button);
        }
        return resources.getString(R$string.common_google_play_services_install_button);
    }

    /* renamed from: d */
    public static String m21822d(Context context, int i10) {
        Resources resources = context.getResources();
        String m21819a = m21819a(context);
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 5) {
                        if (i10 != 7) {
                            if (i10 != 9) {
                                if (i10 != 20) {
                                    switch (i10) {
                                        case 16:
                                            return m21826h(context, "common_google_play_services_api_unavailable_text", m21819a);
                                        case 17:
                                            return m21826h(context, "common_google_play_services_sign_in_failed_text", m21819a);
                                        case 18:
                                            return resources.getString(R$string.common_google_play_services_updating_text, m21819a);
                                        default:
                                            return resources.getString(com.google.android.gms.common.R$string.common_google_play_services_unknown_issue, m21819a);
                                    }
                                }
                                return m21826h(context, "common_google_play_services_restricted_profile_text", m21819a);
                            }
                            return resources.getString(R$string.common_google_play_services_unsupported_text, m21819a);
                        }
                        return m21826h(context, "common_google_play_services_network_error_text", m21819a);
                    }
                    return m21826h(context, "common_google_play_services_invalid_account_text", m21819a);
                }
                return resources.getString(R$string.common_google_play_services_enable_text, m21819a);
            }
            if (AbstractC6204h.m24758d(context)) {
                return resources.getString(R$string.common_google_play_services_wear_update_text);
            }
            return resources.getString(R$string.common_google_play_services_update_text, m21819a);
        }
        return resources.getString(R$string.common_google_play_services_install_text, m21819a);
    }

    /* renamed from: e */
    public static String m21823e(Context context, int i10) {
        if (i10 != 6 && i10 != 19) {
            return m21822d(context, i10);
        }
        return m21826h(context, "common_google_play_services_resolution_required_text", m21819a(context));
    }

    /* renamed from: f */
    public static String m21824f(Context context, int i10) {
        String m21825g = null;
        if (i10 == 6) {
            m21825g = m21827i(context, "common_google_play_services_resolution_required_title");
        } else {
            m21825g = m21825g(context, i10);
        }
        if (m21825g == null) {
            return context.getResources().getString(R$string.common_google_play_services_notification_ticker);
        }
        return m21825g;
    }

    /* renamed from: g */
    public static String m21825g(Context context, int i10) {
        Resources resources = context.getResources();
        switch (i10) {
            case 1:
                return resources.getString(R$string.common_google_play_services_install_title);
            case 2:
                return resources.getString(R$string.common_google_play_services_update_title);
            case 3:
                return resources.getString(R$string.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return m21827i(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return m21827i(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                Log.e("GoogleApiAvailability", "Unexpected error code " + i10);
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return m21827i(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return m21827i(context, "common_google_play_services_restricted_profile_title");
        }
    }

    /* renamed from: h */
    private static String m21826h(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String m21827i = m21827i(context, str);
        if (m21827i == null) {
            m21827i = resources.getString(com.google.android.gms.common.R$string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, m21827i, str2);
    }

    /* renamed from: i */
    private static String m21827i(Context context, String str) {
        C5311i c5311i = f22052a;
        synchronized (c5311i) {
            Locale m26786c = AbstractC6872c.m26782a(context.getResources().getConfiguration()).m26786c(0);
            if (!m26786c.equals(f22053b)) {
                c5311i.clear();
                f22053b = m26786c;
            }
            String str2 = (String) c5311i.get(str);
            if (str2 != null) {
                return str2;
            }
            Resources m20068c = AbstractC4874l.m20068c(context);
            if (m20068c == null) {
                return null;
            }
            int identifier = m20068c.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier == 0) {
                Log.w("GoogleApiAvailability", "Missing resource: " + str);
                return null;
            }
            String string = m20068c.getString(identifier);
            if (TextUtils.isEmpty(string)) {
                Log.w("GoogleApiAvailability", "Got empty resource: " + str);
                return null;
            }
            c5311i.put(str, string);
            return string;
        }
    }
}
