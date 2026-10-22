package com.taobao.accs.net;

import android.annotation.SuppressLint;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import com.taobao.accs.internal.AccsJobService;
import com.umeng.analytics.pro.C3389k;
import p005a4.AbstractC0025e;

/* renamed from: com.taobao.accs.net.f */
/* loaded from: classes.dex */
class C3161f extends AbstractC3162g {

    /* renamed from: c */
    private JobScheduler f13003c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3161f(Context context) {
        super(context);
    }

    @Override // com.taobao.accs.net.AbstractC3162g
    @SuppressLint({"NewApi"})
    /* renamed from: a */
    protected void mo12869a(int i10) {
        JobInfo.Builder minimumLatency;
        JobInfo.Builder overrideDeadline;
        JobInfo.Builder requiredNetworkType;
        JobInfo build;
        if (this.f13003c == null) {
            this.f13003c = AbstractC0025e.m150a(this.f13006a.getSystemService("jobscheduler"));
        }
        this.f13003c.cancel(C3389k.f14708b);
        long j10 = i10 * 1000;
        minimumLatency = new JobInfo.Builder(C3389k.f14708b, new ComponentName(this.f13006a.getPackageName(), AccsJobService.class.getName())).setMinimumLatency(j10);
        overrideDeadline = minimumLatency.setOverrideDeadline(j10);
        requiredNetworkType = overrideDeadline.setRequiredNetworkType(1);
        build = requiredNetworkType.build();
        this.f13003c.schedule(build);
    }
}
