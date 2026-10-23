package p321s0;

import android.content.Context;
import com.advertlib.bean.AdInfo;
import com.umeng.analytics.pro.C3384f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import ne.AbstractC5868k;
import p359ue.AbstractC7166t;
import p361v0.C7194g;

/* renamed from: s0.e */
/* loaded from: classes.dex */
public final class C6610e {

    /* renamed from: a */
    private final String f25402a = C6610e.class.getSimpleName();

    /* renamed from: b */
    private final HashMap f25403b = new HashMap();

    /* renamed from: c */
    private AdInfo f25404c;

    /* renamed from: a */
    public final List m25823a(Context context, String str, List list, String str2, String str3, long j10, boolean z10, String str4) {
        boolean z11 = false;
        boolean m27723j;
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        AbstractC5868k.m23674f(str, "adType");
        AbstractC5868k.m23674f(list, "adInfos");
        AbstractC5868k.m23674f(str3, "userIdentity");
        AbstractC5868k.m23674f(str4, "hasPay");
        ArrayList m27834c = C7194g.f26904a.m27834c(context, str, list, str3, j10, z10, str4);
        if (m27834c == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (str2 != null && str2.length() != 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            if (m27834c.size() == 1) {
                return m27834c;
            }
            List list2 = (List) this.f25403b.get(str);
            if (list2 == null) {
                list2 = new ArrayList();
                this.f25403b.put(str, list2);
            }
            Iterator it = m27834c.iterator();
            while (it.hasNext()) {
                AdInfo adInfo = (AdInfo) it.next();
                if (!list2.contains(adInfo.getAd_id())) {
                    AbstractC5868k.m23673e(adInfo, "item");
                    arrayList.add(adInfo);
                }
            }
            if (arrayList.isEmpty()) {
                arrayList.addAll(m27834c);
                list2.clear();
                if (this.f25404c != null && arrayList.size() > 1) {
                    AdInfo adInfo2 = this.f25404c;
                    AbstractC5868k.m23671c(adInfo2);
                    arrayList.remove(adInfo2);
                    AdInfo adInfo3 = this.f25404c;
                    AbstractC5868k.m23671c(adInfo3);
                    list2.add(adInfo3.getAd_id());
                }
            }
        } else {
            String str5 = str + str2;
            List list3 = (List) this.f25403b.get(str5);
            if (list3 == null) {
                list3 = new ArrayList();
                this.f25403b.put(str5, list3);
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = m27834c.iterator();
            while (it2.hasNext()) {
                AdInfo adInfo4 = (AdInfo) it2.next();
                m27723j = AbstractC7166t.m27723j(str2, adInfo4.getMedia_type(), true);
                if (m27723j) {
                    AbstractC5868k.m23673e(adInfo4, "item");
                    arrayList2.add(adInfo4);
                    if (!list3.contains(adInfo4.getAd_id())) {
                        arrayList.add(adInfo4);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                arrayList.addAll(arrayList2);
                list3.clear();
                if (this.f25404c != null && arrayList.size() > 1) {
                    AdInfo adInfo5 = this.f25404c;
                    AbstractC5868k.m23671c(adInfo5);
                    arrayList.remove(adInfo5);
                    AdInfo adInfo6 = this.f25404c;
                    AbstractC5868k.m23671c(adInfo6);
                    list3.add(adInfo6.getAd_id());
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    /* renamed from: b */
    public final void m25824b(AdInfo adInfo) {
        AbstractC5868k.m23674f(adInfo, "adInfo");
        this.f25404c = adInfo;
    }
}
