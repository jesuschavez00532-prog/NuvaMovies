package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import com.lzy.okgo.model.Progress;
import p111e4.AbstractC4130a;
import p324s3.AbstractC6667o;
import p324s3.C6672t;

/* loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m7895b() {
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter(Progress.PRIORITY)).intValue();
        int i10 = intent.getExtras().getInt("attemptNumber");
        C6672t.m26046f(context);
        AbstractC6667o.a mo26010d = AbstractC6667o.m26037a().mo26008b(queryParameter).mo26010d(AbstractC4130a.m17313b(intValue));
        if (queryParameter2 != null) {
            mo26010d.mo26009c(Base64.decode(queryParameter2, 0));
        }
        C6672t.m26044c().m26047e().m179v(mo26010d.mo26007a(), i10, new Runnable() { // from class: a4.b
            @Override // java.lang.Runnable
            public final void run() {
                AlarmManagerSchedulerBroadcastReceiver.m7895b();
            }
        });
    }
}
