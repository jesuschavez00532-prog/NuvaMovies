package com.efs.sdk.base.core.config;

import android.content.Context;
import android.text.TextUtils;
import com.efs.sdk.base.core.p050a.C1666a;
import com.efs.sdk.base.core.util.C1719c;
import com.efs.sdk.base.protocol.file.section.AbsSection;
import com.efs.sdk.base.protocol.file.section.KVSection;
import com.taobao.accs.common.Constants;
import com.umeng.ccg.C3417a;
import com.umeng.umcrash.UMCrash;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class GlobalInfo {

    /* renamed from: a */
    private Map<String, Object> f7105a = new ConcurrentHashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m7668a(String str, Object obj) {
        if (obj != null) {
            this.f7105a.put(str, obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final Object m7669b(String str, Object obj) {
        Object obj2 = this.f7105a.get(str);
        if (obj2 == null && !this.f7105a.containsKey(str)) {
            return obj;
        }
        return obj2;
    }

    public Map<String, Object> getGlobalInfoMap() {
        HashMap hashMap = new HashMap(this.f7105a);
        C1666a.m7610a();
        hashMap.put("ctime", Long.valueOf(C1666a.m7613b() / 1000));
        C1666a.m7610a();
        hashMap.put("w_tm", Long.valueOf(C1666a.m7613b() / 1000));
        return hashMap;
    }

    public List<AbsSection> getGlobalSectionList(String str) {
        ArrayList arrayList = new ArrayList();
        KVSection kVSection = new KVSection("global_head");
        KVSection put = kVSection.put("type", str).put("appid", this.f7105a.get("appid")).put("wid", this.f7105a.get("wid")).put("pid", this.f7105a.get("pid")).put("pkg", this.f7105a.get("pkg")).put("ver", this.f7105a.get("ver")).put("vcode", this.f7105a.get("vcode")).put("ps", this.f7105a.get("ps")).put("stime", this.f7105a.get("stime"));
        C1666a.m7610a();
        KVSection put2 = put.put("ctime", Long.valueOf(C1666a.m7613b() / 1000));
        C1666a.m7610a();
        put2.put("w_tm", Long.valueOf(C1666a.m7613b() / 1000)).put("sdk_ver", this.f7105a.get("sdk_ver"));
        String valueOf = String.valueOf(m7669b("uid", ""));
        if (!TextUtils.isEmpty(valueOf)) {
            kVSection.put("uid", valueOf);
        }
        arrayList.add(kVSection);
        KVSection kVSection2 = new KVSection("device_info");
        kVSection2.put("lang", this.f7105a.get("lang")).put(Constants.KEY_BRAND, this.f7105a.get(Constants.KEY_BRAND)).put(Constants.KEY_MODEL, this.f7105a.get(Constants.KEY_MODEL)).put("build_model", this.f7105a.get("build_model")).put("rom", this.f7105a.get("rom")).put(C3417a.f14999u, this.f7105a.get(C3417a.f14999u)).put("dsp_h", this.f7105a.get("dsp_h")).put("dsp_w", this.f7105a.get("dsp_w")).put("tzone", this.f7105a.get("tzone")).put("net", this.f7105a.get("net")).put("fr", this.f7105a.get("fr"));
        try {
            if (this.f7105a.containsKey(UMCrash.KEY_HEADER_ACCESS)) {
                kVSection2.put(UMCrash.KEY_HEADER_ACCESS, this.f7105a.get(UMCrash.KEY_HEADER_ACCESS));
            }
            if (this.f7105a.containsKey(UMCrash.KEY_HEADER_ACCESS_SUBTYPE)) {
                kVSection2.put(UMCrash.KEY_HEADER_ACCESS_SUBTYPE, this.f7105a.get(UMCrash.KEY_HEADER_ACCESS_SUBTYPE));
            }
            if (this.f7105a.containsKey(UMCrash.KEY_HEADER_NETWORK_TYPE)) {
                kVSection2.put(UMCrash.KEY_HEADER_NETWORK_TYPE, this.f7105a.get(UMCrash.KEY_HEADER_NETWORK_TYPE));
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        arrayList.add(kVSection2);
        return arrayList;
    }

    public String getUUID(Context context) {
        String valueOf = String.valueOf(m7669b("wid", ""));
        if (TextUtils.isEmpty(valueOf)) {
            String m7766a = C1719c.m7766a(context);
            m7668a("wid", m7766a);
            return m7766a;
        }
        return valueOf;
    }
}
