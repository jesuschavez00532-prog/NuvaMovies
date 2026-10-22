package com.umeng.commonsdk.stateless;

import android.content.Context;
import android.text.TextUtils;
import com.raizlabs.android.dbflow.sql.language.Operator;
import com.umeng.analytics.pro.C3330by;
import com.umeng.analytics.pro.C3335cc;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.statistics.C3482b;
import com.umeng.commonsdk.statistics.SdkVersion;
import com.umeng.commonsdk.statistics.common.DataHelper;

/* renamed from: com.umeng.commonsdk.stateless.c */
/* loaded from: classes3.dex */
public class C3479c {

    /* renamed from: a */
    private String f15378a = "10.0.0.172";

    /* renamed from: b */
    private int f15379b = 80;

    /* renamed from: c */
    private Context f15380c;

    public C3479c(Context context) {
        this.f15380c = context;
    }

    /* renamed from: a */
    public void m14717a() {
        String imprintProperty = UMEnvelopeBuild.imprintProperty(this.f15380c, "sl_domain_p", "");
        if (TextUtils.isEmpty(imprintProperty)) {
            return;
        }
        C3477a.f15362h = DataHelper.assembleStatelessURL(imprintProperty);
    }

    /* renamed from: b */
    public void m14719b() {
        String imprintProperty = UMEnvelopeBuild.imprintProperty(this.f15380c, "sl_domain_p", "");
        String imprintProperty2 = UMEnvelopeBuild.imprintProperty(this.f15380c, "oversea_sl_domain_p", "");
        if (!TextUtils.isEmpty(imprintProperty)) {
            C3477a.f15361g = DataHelper.assembleStatelessURL(imprintProperty);
        }
        if (!TextUtils.isEmpty(imprintProperty2)) {
            C3477a.f15364j = DataHelper.assembleStatelessURL(imprintProperty2);
        }
        C3477a.f15362h = C3477a.f15364j;
        if (!TextUtils.isEmpty(C3482b.f15389b)) {
            if (C3482b.f15389b.startsWith("460") || C3482b.f15389b.startsWith("461")) {
                C3477a.f15362h = C3477a.f15361g;
            }
        }
    }

    /* renamed from: a */
    public boolean m14718a(byte[] bArr, String str, String str2, String str3) {
        String str4 = str2 + Operator.Operation.DIVISION + str;
        if (SdkVersion.SDK_TYPE == 1) {
            return m14716a(bArr, str4, str3);
        }
        if (C3330by.m13997a().m14003b()) {
            String replace = str4.replace("ulogs", "cnlogs");
            String m14021c = C3335cc.m14018b().m14021c();
            if (!TextUtils.isEmpty(m14021c)) {
                replace = C3330by.m13998a(m14021c, str);
            }
            boolean m14716a = m14716a(bArr, replace, str3);
            if (!m14716a) {
                String m14002a = C3330by.m13997a().m14002a(str);
                if (!TextUtils.isEmpty(m14002a) && !replace.equalsIgnoreCase(m14002a)) {
                    return m14716a(bArr, m14002a, str3);
                }
            }
            return m14716a;
        }
        return m14716a(bArr, str4, str3);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0129 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0122 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean m14716a(byte[] r10, java.lang.String r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.stateless.C3479c.m14716a(byte[], java.lang.String, java.lang.String):boolean");
    }
}
