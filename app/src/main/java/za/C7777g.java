package za;

import android.content.Context;
import cc.AbstractC1468n0;
import cc.C1466m0;
import com.request.result.CdnListBeanResult;
import com.request.result.GetSlbInfoBeanResultData;
import com.request.result.UrlListBeanResult;
import com.titan.ranger.bean.Entry;
import com.titan.ranger.bean.Env;
import com.umeng.analytics.pro.C3384f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ne.AbstractC5868k;
import p134fc.AbstractC4305b;
import p170i2.C4842a;
import p201k2.AbstractC5085b;
import p287pb.AbstractApplicationC6253c;
import p317rb.AbstractC6567a;
import p400xa.C7597p0;
import p418yc.C7705h;

/* renamed from: za.g */
/* loaded from: classes2.dex */
public final class C7777g {

    /* renamed from: a */
    public static final C7777g f28678a = new C7777g();

    /* renamed from: b */
    private static final String f28679b = "TitanHelper";

    /* renamed from: c */
    private static Env f28680c;

    private C7777g() {
    }

    /* renamed from: a */
    public final void m30113a(GetSlbInfoBeanResultData getSlbInfoBeanResultData) {
        boolean z10;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        UrlListBeanResult urlListBeanResult;
        UrlListBeanResult urlListBeanResult2;
        AbstractC5868k.m23674f(getSlbInfoBeanResultData, "data");
        List<CdnListBeanResult> cdn_list = getSlbInfoBeanResultData.getCdn_list();
        if (cdn_list != null && !cdn_list.isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = cdn_list.iterator();
        while (it.hasNext()) {
            CdnListBeanResult cdnListBeanResult = (CdnListBeanResult) it.next();
            ArrayList arrayList2 = new ArrayList();
            List<UrlListBeanResult> url_list = cdnListBeanResult.getUrl_list();
            if (url_list != null) {
                Iterator<T> it2 = url_list.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((UrlListBeanResult) it2.next()).getUrl());
                }
            }
            String cdn_id_mark = cdnListBeanResult.getCdn_id_mark();
            if (cdn_id_mark == null) {
                str = "";
            } else {
                str = cdn_id_mark;
            }
            String tag = cdnListBeanResult.getTag();
            if (tag == null) {
                str2 = "";
            } else {
                str2 = tag;
            }
            String rule_id_mark = cdnListBeanResult.getRule_id_mark();
            if (rule_id_mark == null) {
                str3 = "";
            } else {
                str3 = rule_id_mark;
            }
            String main_addr = cdnListBeanResult.getMain_addr();
            if (main_addr == null) {
                str4 = "";
            } else {
                str4 = main_addr;
            }
            String main_addr_mark = cdnListBeanResult.getMain_addr_mark();
            if (main_addr_mark == null) {
                str5 = "";
            } else {
                str5 = main_addr_mark;
            }
            String spared_addr = cdnListBeanResult.getSpared_addr();
            if (spared_addr == null) {
                str6 = "";
            } else {
                str6 = spared_addr;
            }
            String spared_addr_mark = cdnListBeanResult.getSpared_addr_mark();
            if (spared_addr_mark == null) {
                str7 = "";
            } else {
                str7 = spared_addr_mark;
            }
            if (!AbstractC5868k.m23669a(cdnListBeanResult.getCdn_type(), "1")) {
                str8 = "";
            } else {
                str8 = "slb";
            }
            C7597p0.b bVar = C7597p0.f27965b;
            Iterator it3 = it;
            C7597p0 m29236a = bVar.m29236a();
            List<UrlListBeanResult> url_list2 = cdnListBeanResult.getUrl_list();
            if (url_list2 == null || (urlListBeanResult2 = url_list2.get(0)) == null || (str9 = urlListBeanResult2.getUrl()) == null) {
                str9 = "";
            }
            String m29234b = m29236a.m29234b(str9, "link");
            C7597p0 m29236a2 = bVar.m29236a();
            List<UrlListBeanResult> url_list3 = cdnListBeanResult.getUrl_list();
            if (url_list3 == null || (urlListBeanResult = url_list3.get(0)) == null || (str10 = urlListBeanResult.getUrl()) == null) {
                str10 = "";
            }
            String m29234b2 = m29236a2.m29234b(str10, "sign_type");
            int size = cdn_list.size() - cdnListBeanResult.getSerial_number();
            String group_id_mark = cdnListBeanResult.getGroup_id_mark();
            if (group_id_mark == null) {
                group_id_mark = "";
            }
            arrayList.add(new Entry(str, str2, str3, str4, str5, str6, str7, str8, m29234b, m29234b2, size, 1, arrayList2, group_id_mark));
            it = it3;
        }
        if (AbstractC6567a.m25638h(arrayList)) {
            C7705h.f28256m.m29771a().m29749A(arrayList);
        }
    }

    /* renamed from: b */
    public final void m30114b(Context context, String str) {
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        String mo19960i = C4842a.f20329a.m19920a().mo19960i(AbstractApplicationC6253c.f24484b.m24887a());
        String valueOf = String.valueOf(AbstractC5085b.m20602l(context));
        C1466m0 c1466m0 = C1466m0.f5627a;
        String m6878m = c1466m0.m6878m();
        String m6885t = c1466m0.m6885t();
        String str2 = AbstractC4305b.f18742a;
        AbstractC5868k.m23673e(str2, "KEY");
        if (str == null) {
            str = "";
        }
        String m6895c = AbstractC1468n0.m6895c();
        AbstractC5868k.m23673e(m6895c, "getAndroidId()");
        Env env = new Env(mo19960i, valueOf, m6878m, m6885t, str2, str, m6895c, 0, 128, null);
        if (AbstractC5868k.m23669a(f28680c, env)) {
            return;
        }
        f28680c = env;
        C7705h m29771a = C7705h.f28256m.m29771a();
        Env env2 = f28680c;
        AbstractC5868k.m23671c(env2);
        m29771a.m29750B(env2);
    }
}
