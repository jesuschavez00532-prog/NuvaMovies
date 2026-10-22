package p321s0;

import com.advertlib.bean.AdInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import ne.AbstractC5868k;
import p359ue.AbstractC7166t;

/* renamed from: s0.d */
/* loaded from: classes.dex */
public final class C6609d implements InterfaceC6608c {

    /* renamed from: a */
    private final String f25399a = C6609d.class.getSimpleName();

    /* renamed from: b */
    private final HashMap f25400b = new HashMap();

    /* renamed from: c */
    private AdInfo f25401c;

    @Override // p321s0.InterfaceC6608c
    /* renamed from: a */
    public List mo25819a(String str, List list, String str2) {
        boolean z10;
        boolean m27723j;
        AbstractC5868k.m23674f(str, "adType");
        AbstractC5868k.m23674f(list, "adInfos");
        if (list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (str2 != null && str2.length() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            if (list.size() == 1) {
                return list;
            }
            List list2 = (List) this.f25400b.get(str);
            if (list2 == null) {
                list2 = new ArrayList();
                this.f25400b.put(str, list2);
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AdInfo adInfo = (AdInfo) it.next();
                if (!list2.contains(adInfo.getAd_id())) {
                    arrayList.add(adInfo);
                }
            }
            if (arrayList.isEmpty()) {
                arrayList.addAll(list);
                list2.clear();
                if (this.f25401c != null && arrayList.size() > 1) {
                    AdInfo adInfo2 = this.f25401c;
                    AbstractC5868k.m23671c(adInfo2);
                    arrayList.remove(adInfo2);
                    AdInfo adInfo3 = this.f25401c;
                    AbstractC5868k.m23671c(adInfo3);
                    list2.add(adInfo3.getAd_id());
                }
            }
        } else {
            String str3 = str + str2;
            List list3 = (List) this.f25400b.get(str3);
            if (list3 == null) {
                list3 = new ArrayList();
                this.f25400b.put(str3, list3);
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                AdInfo adInfo4 = (AdInfo) it2.next();
                m27723j = AbstractC7166t.m27723j(str2, adInfo4.getMedia_type(), true);
                if (m27723j) {
                    arrayList2.add(adInfo4);
                    if (!list3.contains(adInfo4.getAd_id())) {
                        arrayList.add(adInfo4);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                arrayList.addAll(arrayList2);
                list3.clear();
                if (this.f25401c != null && arrayList.size() > 1) {
                    AdInfo adInfo5 = this.f25401c;
                    AbstractC5868k.m23671c(adInfo5);
                    arrayList.remove(adInfo5);
                    AdInfo adInfo6 = this.f25401c;
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

    @Override // p321s0.InterfaceC6608c
    /* renamed from: b */
    public AdInfo mo25820b(String str, List list, String str2) {
        boolean z10;
        List list2;
        boolean m27723j;
        AbstractC5868k.m23674f(str, "adType");
        AbstractC5868k.m23674f(list, "adInfos");
        if (list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (str2 != null && str2.length() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            if (list.size() == 1) {
                return (AdInfo) list.get(0);
            }
            list2 = (List) this.f25400b.get(str);
            if (list2 == null) {
                list2 = new ArrayList();
                this.f25400b.put(str, list2);
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AdInfo adInfo = (AdInfo) it.next();
                if (!list2.contains(adInfo.getAd_id())) {
                    arrayList.add(adInfo);
                }
            }
            if (arrayList.isEmpty()) {
                arrayList.addAll(list);
                list2.clear();
                if (this.f25401c != null && arrayList.size() > 1) {
                    AdInfo adInfo2 = this.f25401c;
                    AbstractC5868k.m23671c(adInfo2);
                    arrayList.remove(adInfo2);
                    AdInfo adInfo3 = this.f25401c;
                    AbstractC5868k.m23671c(adInfo3);
                    list2.add(adInfo3.getAd_id());
                }
            }
        } else {
            String str3 = str + str2;
            List list3 = (List) this.f25400b.get(str3);
            if (list3 == null) {
                list3 = new ArrayList();
                this.f25400b.put(str3, list3);
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                AdInfo adInfo4 = (AdInfo) it2.next();
                m27723j = AbstractC7166t.m27723j(str2, adInfo4.getMedia_type(), true);
                if (m27723j) {
                    arrayList2.add(adInfo4);
                    if (!list3.contains(adInfo4.getAd_id())) {
                        arrayList.add(adInfo4);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                arrayList.addAll(arrayList2);
                list3.clear();
                if (this.f25401c != null && arrayList.size() > 1) {
                    AdInfo adInfo5 = this.f25401c;
                    AbstractC5868k.m23671c(adInfo5);
                    arrayList.remove(adInfo5);
                    AdInfo adInfo6 = this.f25401c;
                    AbstractC5868k.m23671c(adInfo6);
                    list3.add(adInfo6.getAd_id());
                }
            }
            list2 = list3;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        AdInfo adInfo7 = (AdInfo) arrayList.get(new Random().nextInt(arrayList.size()));
        list2.add(adInfo7.getAd_id());
        this.f25401c = adInfo7;
        return adInfo7;
    }

    @Override // p321s0.InterfaceC6608c
    /* renamed from: c */
    public void mo25821c(AdInfo adInfo) {
        AbstractC5868k.m23674f(adInfo, "adInfo");
        this.f25401c = adInfo;
    }
}
