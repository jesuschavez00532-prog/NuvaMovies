package p179ib;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.push.R$string;
import p194jb.AbstractC5046a;
import p194jb.AbstractC5047b;

/* renamed from: ib.c */
/* loaded from: classes2.dex */
public abstract class AbstractC4926c {

    /* renamed from: a */
    private static final String f20471a = "c";

    /* renamed from: a */
    public static Pair m20234a() {
        return m20237d(EnumC4927d.AD_MAIN, EnumC4927d.AD_BACKUP, R$string.ad_main, R$string.ad_backup);
    }

    /* renamed from: b */
    public static Pair m20235b() {
        return m20237d(EnumC4927d.BIGBEE_MAIN, EnumC4927d.BIGBEE_BACKUP, R$string.bigbee_main, R$string.bigbee_backup);
    }

    /* renamed from: c */
    private static String m20236c(int i10) {
        String string = AbstractC4929f.f20503b.getResources().getString(i10);
        if ("false".equals(AbstractC4929f.f20503b.getResources().getString(R$string.domain_is_security))) {
            return string;
        }
        return AbstractC5047b.m20499a(string, "*&@!6d5d-c483-4720-bb29-785b8f321c^%");
    }

    /* renamed from: d */
    public static Pair m20237d(EnumC4927d enumC4927d, EnumC4927d enumC4927d2, int i10, int i11) {
        if (m20244k(AbstractC4929f.f20503b)) {
            String m20496c = AbstractC5046a.m20496c(AbstractC4929f.f20503b, enumC4927d.m20246b());
            if (TextUtils.isEmpty(m20496c)) {
                m20496c = m20236c(i10);
            }
            String m20496c2 = AbstractC5046a.m20496c(AbstractC4929f.f20503b, enumC4927d2.m20246b());
            if (TextUtils.isEmpty(m20496c2)) {
                m20496c2 = m20236c(i11);
            }
            return new Pair(m20496c, m20496c2);
        }
        return null;
    }

    /* renamed from: e */
    public static String m20238e(EnumC4927d enumC4927d, int i10) {
        if (m20244k(AbstractC4929f.f20503b)) {
            String m20496c = AbstractC5046a.m20496c(AbstractC4929f.f20503b, enumC4927d.m20246b());
            if (TextUtils.isEmpty(m20496c)) {
                return m20236c(i10);
            }
            return m20496c;
        }
        return null;
    }

    /* renamed from: f */
    public static Pair m20239f() {
        return m20237d(EnumC4927d.EPG_MAIN, EnumC4927d.EPG_BACKUP, R$string.epg_main, R$string.epg_backup);
    }

    /* renamed from: g */
    public static Pair m20240g() {
        return m20237d(EnumC4927d.NOTICE_MAIN, EnumC4927d.NOTICE_BACKUP, R$string.notice_main, R$string.notice_backup);
    }

    /* renamed from: h */
    public static Pair m20241h() {
        return m20237d(EnumC4927d.PORTAL_MAIN, EnumC4927d.PORTAL_BACKUP, R$string.portal_main, R$string.portal_backup);
    }

    /* renamed from: i */
    public static String m20242i() {
        return m20238e(EnumC4927d.SCAN_QR_LOGIN, R$string.scan_qr_login);
    }

    /* renamed from: j */
    public static Pair m20243j() {
        return m20237d(EnumC4927d.UPGRADE_MAIN, EnumC4927d.UPGRADE_BACKUP, R$string.upgrade_main, R$string.upgrade_backup);
    }

    /* renamed from: k */
    private static boolean m20244k(Context context) {
        if (context == null) {
            Log.w(f20471a, "uMContext is NULL, domain get failed！！！");
        }
        if (context == null) {
            return false;
        }
        return true;
    }
}
