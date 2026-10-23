package p007a6;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.raizlabs.android.dbflow.sql.language.Operator;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;
import p352u6.InterfaceC7048d;
import p395x5.C7503f;

/* renamed from: a6.w */
/* loaded from: classes.dex */
public class C0104w implements InterfaceC0105x {

    /* renamed from: g */
    private static final Pattern f348g = Pattern.compile("[^\\p{Alnum}]");

    /* renamed from: h */
    private static final String f349h = Pattern.quote(Operator.Operation.DIVISION);

    /* renamed from: a */
    private final C0106y f350a;

    /* renamed from: b */
    private final Context f351b;

    /* renamed from: c */
    private final String f352c;

    /* renamed from: d */
    private final InterfaceC7048d f353d;

    /* renamed from: e */
    private final C0098s f354e;

    /* renamed from: f */
    private String f355f;

    public C0104w(Context context, String str, InterfaceC7048d interfaceC7048d, C0098s c0098s) {
        if (context != null) {
            if (str != null) {
                this.f351b = context;
                this.f352c = str;
                this.f353d = interfaceC7048d;
                this.f354e = c0098s;
                this.f350a = new C0106y();
                return;
            }
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        throw new IllegalArgumentException("appContext must not be null");
    }

    /* renamed from: b */
    private synchronized String m467b(String str, SharedPreferences sharedPreferences) {
        String m470e = null;
        m470e = m470e(UUID.randomUUID().toString());
        C7503f.m28716f().m28723i("Created new Crashlytics installation ID: " + m470e + " for FID: " + str);
        sharedPreferences.edit().putString("crashlytics.installation.id", m470e).putString("firebase.installation.id", str).apply();
        return m470e;
    }

    /* renamed from: c */
    static String m468c() {
        return "SYN_" + UUID.randomUUID().toString();
    }

    /* renamed from: d */
    private String m469d() {
        try {
            return (String) AbstractC0101t0.m453d(this.f353d.mo11028a());
        } catch (Exception e10) {
            C7503f.m28716f().m28726l("Failed to retrieve Firebase Installations ID.", e10);
            return null;
        }
    }

    /* renamed from: e */
    private static String m470e(String str) {
        if (str == null) {
            return null;
        }
        return f348g.matcher(str).replaceAll("").toLowerCase(Locale.US);
    }

    /* renamed from: k */
    static boolean m471k(String str) {
        if (str != null && str.startsWith("SYN_")) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    private String m472l(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString("crashlytics.installation.id", null);
    }

    /* renamed from: m */
    private String m473m(String str) {
        return str.replaceAll(f349h, "");
    }

    @Override // p007a6.InterfaceC0105x
    /* renamed from: a */
    public synchronized String mo474a() {
        String str = this.f355f;
        if (str != null) {
            return str;
        }
        C7503f.m28716f().m28723i("Determining Crashlytics installation ID...");
        SharedPreferences m268r = AbstractC0074g.m268r(this.f351b);
        String string = m268r.getString("firebase.installation.id", null);
        C7503f.m28716f().m28723i("Cached Firebase Installation ID: " + string);
        if (this.f354e.m444d()) {
            String m469d = m469d();
            C7503f.m28716f().m28723i("Fetched Firebase Installation ID: " + m469d);
            if (m469d == null) {
                if (string == null) {
                    m469d = m468c();
                } else {
                    m469d = string;
                }
            }
            if (m469d.equals(string)) {
                this.f355f = m472l(m268r);
            } else {
                this.f355f = m467b(m469d, m268r);
            }
        } else if (m471k(string)) {
            this.f355f = m472l(m268r);
        } else {
            this.f355f = m467b(m468c(), m268r);
        }
        if (this.f355f == null) {
            C7503f.m28716f().m28725k("Unable to determine Crashlytics Install Id, creating a new one.");
            this.f355f = m467b(m468c(), m268r);
        }
        C7503f.m28716f().m28723i("Crashlytics installation ID: " + this.f355f);
        return this.f355f;
    }

    /* renamed from: f */
    public String m475f() {
        return this.f352c;
    }

    /* renamed from: g */
    public String m476g() {
        return this.f350a.m481a(this.f351b);
    }

    /* renamed from: h */
    public String m477h() {
        return String.format(Locale.US, "%s/%s", m473m(Build.MANUFACTURER), m473m(Build.MODEL));
    }

    /* renamed from: i */
    public String m478i() {
        return m473m(Build.VERSION.INCREMENTAL);
    }

    /* renamed from: j */
    public String m479j() {
        return m473m(Build.VERSION.RELEASE);
    }
}
