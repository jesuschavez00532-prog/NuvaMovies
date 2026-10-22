package p400xa;

import android.content.SharedPreferences;

/* renamed from: xa.q1 */
/* loaded from: classes2.dex */
public abstract class AbstractC7601q1 {
    /* renamed from: a */
    public static boolean m29247a() {
        SharedPreferences m29075g = C7577i1.f27838b.m29086e().m29075g();
        if (m29075g.getInt("key_last_version", 0) == m29075g.getInt("key_current_version", 0)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static void m29248b(int i10) {
        SharedPreferences m29075g = C7577i1.f27838b.m29086e().m29075g();
        int i11 = m29075g.getInt("key_current_version", 0);
        if (i11 == i10) {
            return;
        }
        m29075g.edit().putInt("key_last_version", i11).putInt("key_current_version", i10).apply();
    }

    /* renamed from: c */
    public static void m29249c(int i10, int i11) {
        C7577i1.f27838b.m29086e().m29075g().edit().putInt("key_last_version", i10).putInt("key_current_version", i11).apply();
    }
}
