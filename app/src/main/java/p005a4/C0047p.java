package p005a4;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import anet.channel.request.Request;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.lzy.okgo.model.Progress;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;
import java.util.zip.Adler32;
import p024b4.InterfaceC1055d;
import p111e4.AbstractC4130a;
import p324s3.AbstractC6667o;
import p393x3.AbstractC7492a;

/* renamed from: a4.p */
/* loaded from: classes.dex */
public class C0047p implements InterfaceC0052r0 {

    /* renamed from: a */
    private final Context f164a;

    /* renamed from: b */
    private final InterfaceC1055d f165b;

    /* renamed from: c */
    private final AbstractC0060z f166c;

    public C0047p(Context context, InterfaceC1055d interfaceC1055d, AbstractC0060z abstractC0060z) {
        this.f164a = context;
        this.f165b = interfaceC1055d;
        this.f166c = abstractC0060z;
    }

    /* renamed from: d */
    private boolean m186d(JobScheduler jobScheduler, int i10, int i11) {
        List allPendingJobs;
        PersistableBundle extras;
        int i12 = 0;
        int id2;
        allPendingJobs = jobScheduler.getAllPendingJobs();
        Iterator it = allPendingJobs.iterator();
        while (it.hasNext()) {
            JobInfo m180a = AbstractC0041m.m180a(it.next());
            extras = m180a.getExtras();
            i12 = extras.getInt("attemptNumber");
            id2 = m180a.getId();
            if (id2 == i10) {
                if (i12 < i11) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    @Override // p005a4.InterfaceC0052r0
    /* renamed from: a */
    public void mo138a(AbstractC6667o abstractC6667o, int i10, boolean z10) {
        JobInfo build;
        ComponentName componentName = new ComponentName(this.f164a, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler m150a = AbstractC0025e.m150a(this.f164a.getSystemService("jobscheduler"));
        int m187c = m187c(abstractC6667o);
        if (!z10 && m186d(m150a, m187c, i10)) {
            AbstractC7492a.m28688b("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", abstractC6667o);
            return;
        }
        long mo4926v = this.f165b.mo4926v(abstractC6667o);
        JobInfo.Builder m210c = this.f166c.m210c(new JobInfo.Builder(m187c, componentName), abstractC6667o.mo26006d(), mo4926v, i10);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i10);
        persistableBundle.putString("backendName", abstractC6667o.mo26004b());
        persistableBundle.putInt(Progress.PRIORITY, AbstractC4130a.m17312a(abstractC6667o.mo26006d()));
        if (abstractC6667o.mo26005c() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(abstractC6667o.mo26005c(), 0));
        }
        m210c.setExtras(persistableBundle);
        AbstractC7492a.m28689c("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", abstractC6667o, Integer.valueOf(m187c), Long.valueOf(this.f166c.m211g(abstractC6667o.mo26006d(), mo4926v, i10)), Long.valueOf(mo4926v), Integer.valueOf(i10));
        build = m210c.build();
        m150a.schedule(build);
    }

    @Override // p005a4.InterfaceC0052r0
    /* renamed from: b */
    public void mo139b(AbstractC6667o abstractC6667o, int i10) {
        mo138a(abstractC6667o, i10, false);
    }

    /* renamed from: c */
    int m187c(AbstractC6667o abstractC6667o) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.f164a.getPackageName().getBytes(Charset.forName(Request.DEFAULT_CHARSET)));
        adler32.update(abstractC6667o.mo26004b().getBytes(Charset.forName(Request.DEFAULT_CHARSET)));
        adler32.update(ByteBuffer.allocate(4).putInt(AbstractC4130a.m17312a(abstractC6667o.mo26006d())).array());
        if (abstractC6667o.mo26005c() != null) {
            adler32.update(abstractC6667o.mo26005c());
        }
        return (int) adler32.getValue();
    }
}
