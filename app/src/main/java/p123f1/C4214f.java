package p123f1;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.umeng.analytics.pro.C3384f;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Pattern;
import ne.AbstractC5868k;
import p043ce.AbstractC1500l;
import p043ce.AbstractC1508t;
import p359ue.AbstractC7167u;
import p359ue.C7155i;

/* renamed from: f1.f */
/* loaded from: classes.dex */
public final class C4214f {

    /* renamed from: a */
    public static final C4214f f18481a = new C4214f();

    private C4214f() {
    }

    /* renamed from: a */
    public final boolean m17614a(String str) {
        int m27735E;
        List m6985d;
        boolean z10;
        boolean z11;
        AbstractC5868k.m23674f(str, "addr");
        if (!TextUtils.isEmpty(str)) {
            m27735E = AbstractC7167u.m27735E(str, ":", 0, false, 6, null);
            if (m27735E != -1) {
                List m27681e = new C7155i(":").m27681e(str, 0);
                if (!m27681e.isEmpty()) {
                    ListIterator listIterator = m27681e.listIterator(m27681e.size());
                    while (listIterator.hasPrevious()) {
                        if (((String) listIterator.previous()).length() == 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (!z11) {
                            m6985d = AbstractC1508t.m6997B(m27681e, listIterator.nextIndex() + 1);
                            break;
                        }
                    }
                }
                m6985d = AbstractC1500l.m6985d();
                String[] strArr = (String[]) m6985d.toArray(new String[0]);
                if (strArr != null) {
                    if (strArr.length == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        str = strArr[0];
                    }
                }
            }
            if (str.length() < 7 || str.length() > 15 || AbstractC5868k.m23669a("", str)) {
                return false;
            }
            return Pattern.compile("([1-9]|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])(\\.(\\d|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])){3}").matcher(str).find();
        }
        return false;
    }

    /* renamed from: b */
    public final boolean m17615b(Context context) {
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        Object systemService = context.getSystemService("connectivity");
        AbstractC5868k.m23672d(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isAvailable()) {
            return true;
        }
        return false;
    }
}
