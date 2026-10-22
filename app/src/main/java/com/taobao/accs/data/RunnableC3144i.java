package com.taobao.accs.data;

import android.content.Intent;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.BaseMonitor;
import com.taobao.accs.utl.C3198k;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.taobao.accs.data.i */
/* loaded from: classes.dex */
public class RunnableC3144i implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f12947a;

    /* renamed from: b */
    final /* synthetic */ String f12948b;

    /* renamed from: c */
    final /* synthetic */ Intent f12949c;

    /* renamed from: d */
    final /* synthetic */ C3142g f12950d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3144i(C3142g c3142g, String str, String str2, Intent intent) {
        this.f12950d = c3142g;
        this.f12947a = str;
        this.f12948b = str2;
        this.f12949c = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        Set set;
        Set set2;
        Set set3;
        set = C3142g.f12943a;
        if (set != null) {
            set2 = C3142g.f12943a;
            if (set2.contains(this.f12947a)) {
                ALog.m12940e("MsgDistribute", "routing msg time out, try election", Constants.KEY_DATA_ID, this.f12947a, Constants.KEY_SERVICE_ID, this.f12948b);
                set3 = C3142g.f12943a;
                set3.remove(this.f12947a);
                C3198k.m13011a("accs", BaseMonitor.ALARM_MSG_ROUTING_RATE, "", "timeout", "pkg:" + this.f12949c.getPackage());
            }
        }
    }
}
