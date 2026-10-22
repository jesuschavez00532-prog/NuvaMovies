package p005a4;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import com.lzy.okgo.model.Progress;
import p024b4.InterfaceC1055d;
import p095d4.InterfaceC3935a;
import p111e4.AbstractC4130a;
import p324s3.AbstractC6667o;
import p393x3.AbstractC7492a;

/* renamed from: a4.a */
/* loaded from: classes.dex */
public class C0017a implements InterfaceC0052r0 {

    /* renamed from: a */
    private final Context f106a;

    /* renamed from: b */
    private final InterfaceC1055d f107b;

    /* renamed from: c */
    private AlarmManager f108c;

    /* renamed from: d */
    private final AbstractC0060z f109d;

    /* renamed from: e */
    private final InterfaceC3935a f110e;

    public C0017a(Context context, InterfaceC1055d interfaceC1055d, InterfaceC3935a interfaceC3935a, AbstractC0060z abstractC0060z) {
        this(context, interfaceC1055d, (AlarmManager) context.getSystemService("alarm"), interfaceC3935a, abstractC0060z);
    }

    @Override // p005a4.InterfaceC0052r0
    /* renamed from: a */
    public void mo138a(AbstractC6667o abstractC6667o, int i10, boolean z10) {
        int i11;
        Uri.Builder builder = new Uri.Builder();
        builder.appendQueryParameter("backendName", abstractC6667o.mo26004b());
        builder.appendQueryParameter(Progress.PRIORITY, String.valueOf(AbstractC4130a.m17312a(abstractC6667o.mo26006d())));
        if (abstractC6667o.mo26005c() != null) {
            builder.appendQueryParameter("extras", Base64.encodeToString(abstractC6667o.mo26005c(), 0));
        }
        Intent intent = new Intent(this.f106a, (Class<?>) AlarmManagerSchedulerBroadcastReceiver.class);
        intent.setData(builder.build());
        intent.putExtra("attemptNumber", i10);
        if (!z10 && m140c(intent)) {
            AbstractC7492a.m28688b("AlarmManagerScheduler", "Upload for context %s is already scheduled. Returning...", abstractC6667o);
            return;
        }
        long mo4926v = this.f107b.mo4926v(abstractC6667o);
        long m211g = this.f109d.m211g(abstractC6667o.mo26006d(), mo4926v, i10);
        AbstractC7492a.m28689c("AlarmManagerScheduler", "Scheduling upload for context %s in %dms(Backend next call timestamp %d). Attempt %d", abstractC6667o, Long.valueOf(m211g), Long.valueOf(mo4926v), Integer.valueOf(i10));
        Context context = this.f106a;
        if (Build.VERSION.SDK_INT >= 23) {
            i11 = 67108864;
        } else {
            i11 = 0;
        }
        this.f108c.set(3, this.f110e.mo16762a() + m211g, PendingIntent.getBroadcast(context, 0, intent, i11));
    }

    @Override // p005a4.InterfaceC0052r0
    /* renamed from: b */
    public void mo139b(AbstractC6667o abstractC6667o, int i10) {
        mo138a(abstractC6667o, i10, false);
    }

    /* renamed from: c */
    boolean m140c(Intent intent) {
        int i10;
        if (Build.VERSION.SDK_INT >= 23) {
            i10 = 603979776;
        } else {
            i10 = 536870912;
        }
        if (PendingIntent.getBroadcast(this.f106a, 0, intent, i10) == null) {
            return false;
        }
        return true;
    }

    C0017a(Context context, InterfaceC1055d interfaceC1055d, AlarmManager alarmManager, InterfaceC3935a interfaceC3935a, AbstractC0060z abstractC0060z) {
        this.f106a = context;
        this.f107b = interfaceC1055d;
        this.f108c = alarmManager;
        this.f110e = interfaceC3935a;
        this.f109d = abstractC0060z;
    }
}
