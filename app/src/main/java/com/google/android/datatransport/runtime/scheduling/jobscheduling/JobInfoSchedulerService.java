package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.lzy.okgo.model.Progress;
import p111e4.AbstractC4130a;
import p324s3.AbstractC6667o;
import p324s3.C6672t;

/* loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m7897b(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(final JobParameters jobParameters) {
        PersistableBundle extras;
        String string;
        PersistableBundle extras2;
        String string2;
        PersistableBundle extras3;
        int i10;
        PersistableBundle extras4;
        int i11;
        Context applicationContext;
        extras = jobParameters.getExtras();
        string = extras.getString("backendName");
        extras2 = jobParameters.getExtras();
        string2 = extras2.getString("extras");
        extras3 = jobParameters.getExtras();
        i10 = extras3.getInt(Progress.PRIORITY);
        extras4 = jobParameters.getExtras();
        i11 = extras4.getInt("attemptNumber");
        applicationContext = getApplicationContext();
        C6672t.m26046f(applicationContext);
        AbstractC6667o.a mo26010d = AbstractC6667o.m26037a().mo26008b(string).mo26010d(AbstractC4130a.m17313b(i10));
        if (string2 != null) {
            mo26010d.mo26009c(Base64.decode(string2, 0));
        }
        C6672t.m26044c().m26047e().m179v(mo26010d.mo26007a(), i11, new Runnable() { // from class: a4.u
            @Override // java.lang.Runnable
            public final void run() {
                JobInfoSchedulerService.this.m7897b(jobParameters);
            }
        });
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
