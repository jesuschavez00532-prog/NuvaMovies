package com.efs.sdk.memoryinfo;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.efs.sdk.base.EfsReporter;
import com.efs.sdk.base.protocol.record.EfsJSONLog;
import com.umeng.analytics.pro.C3325bt;
import com.umeng.commonsdk.statistics.idtracking.ImprintHandler;
import com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback;
import com.umeng.commonsdk.utils.UMUtils;
import com.umeng.umcrash.UMCrash;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.efs.sdk.memoryinfo.e */
/* loaded from: classes.dex */
public class C1745e {

    /* renamed from: B */
    final List<EfsJSONLog> f7302B = new ArrayList();

    /* renamed from: C */
    volatile boolean f7303C;

    /* renamed from: a */
    private final EfsReporter f7304a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1745e(final Context context, EfsReporter efsReporter) {
        this.f7304a = efsReporter;
        String uMId = UMUtils.getUMId(context);
        this.f7303C = !TextUtils.isEmpty(uMId);
        if (!this.f7303C) {
            ImprintHandler.getImprintService(context).registImprintCallback(C3325bt.f14265g, new UMImprintChangeCallback() { // from class: com.efs.sdk.memoryinfo.e.1
                @Override // com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback
                public final void onImprintValueChanged(String str, String str2) {
                    try {
                        if (C3325bt.f14265g.equals(str)) {
                            HashMap hashMap = new HashMap(1);
                            hashMap.put(UMCrash.KEY_HEADER_UMID, str2);
                            C1745e.this.f7304a.addPublicParams(hashMap);
                            synchronized (C1745e.class) {
                                C1745e.m7811b(C1745e.this);
                            }
                            Iterator it = C1745e.this.f7302B.iterator();
                            while (it.hasNext()) {
                                C1745e.this.m7813a((EfsJSONLog) it.next());
                            }
                            String str3 = "send cache:" + C1745e.this.f7302B.size();
                            if (C1741a.DEBUG) {
                                Log.d("MemoryCollect", str3);
                            }
                            C1745e.this.f7302B.clear();
                            ImprintHandler.getImprintService(context).unregistImprintCallback(C3325bt.f14265g, this);
                        }
                    } catch (Throwable th) {
                        C1746f.m7816a("umid ", th);
                    }
                }
            });
            return;
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put(UMCrash.KEY_HEADER_UMID, uMId);
        efsReporter.addPublicParams(hashMap);
    }

    /* renamed from: b */
    static /* synthetic */ boolean m7811b(C1745e c1745e) {
        c1745e.f7303C = true;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m7813a(EfsJSONLog efsJSONLog) {
        try {
            this.f7304a.send(efsJSONLog);
        } catch (Throwable th) {
            C1746f.m7816a("send", th);
        }
    }
}
