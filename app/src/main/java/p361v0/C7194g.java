package p361v0;

import android.content.Context;
import com.advertlib.bean.AdInfo;
import com.umeng.analytics.pro.C3384f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ne.AbstractC5868k;

/* renamed from: v0.g */
/* loaded from: classes.dex */
public final class C7194g {

    /* renamed from: a */
    public static final C7194g f26904a = new C7194g();

    /* renamed from: b */
    private static Integer f26905b;

    private C7194g() {
    }

    /* renamed from: a */
    public final AdInfo m27832a(Context context, String str, AdInfo adInfo, String str2, long j10, boolean z10, String str3) {
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        AbstractC5868k.m23674f(str, "adType");
        AbstractC5868k.m23674f(adInfo, "adInfo");
        AbstractC5868k.m23674f(str2, "userIdentity");
        AbstractC5868k.m23674f(str3, "hasPay");
        Integer identityFrequency = adInfo.getIdentityFrequency(str2, str3);
        if (identityFrequency != null && identityFrequency.intValue() == 0) {
            return null;
        }
        long longValue = ((Number) C7193f.f26903a.m27829b(context, str, adInfo.getAd_id(), 0L)).longValue();
        if (identityFrequency == null || (j10 - longValue <= identityFrequency.intValue() * 60 * 60 * 1000 && !m27835d(z10, longValue, j10))) {
            return null;
        }
        return adInfo;
    }

    /* renamed from: b */
    public final int m27833b(Context context) {
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        if (f26905b == null) {
            f26905b = Integer.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 64).versionCode);
        }
        Integer num = f26905b;
        AbstractC5868k.m23671c(num);
        return num.intValue();
    }

    /* renamed from: c */
    public final ArrayList m27834c(Context context, String str, List list, String str2, long j10, boolean z10, String str3) {
        boolean z11;
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        AbstractC5868k.m23674f(str, "adType");
        AbstractC5868k.m23674f(str2, "userIdentity");
        AbstractC5868k.m23674f(str3, "hasPay");
        if (list != null && !list.isEmpty()) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AdInfo m27832a = f26904a.m27832a(context, str, (AdInfo) it.next(), str2, j10, z10, str3);
            if (m27832a != null) {
                arrayList.add(m27832a);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    /* renamed from: d */
    public final boolean m27835d(boolean z10, long j10, long j11) {
        return z10 && j10 == j11 && j10 != 0;
    }
}
