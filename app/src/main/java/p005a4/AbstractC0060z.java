package p005a4;

import android.app.job.JobInfo;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p005a4.C0023d;
import p095d4.InterfaceC3935a;
import p294q3.EnumC6337d;

/* renamed from: a4.z */
/* loaded from: classes.dex */
public abstract class AbstractC0060z {

    /* renamed from: a4.z$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        private InterfaceC3935a f177a;

        /* renamed from: b */
        private Map f178b = new HashMap();

        /* renamed from: a */
        public a m212a(EnumC6337d enumC6337d, b bVar) {
            this.f178b.put(enumC6337d, bVar);
            return this;
        }

        /* renamed from: b */
        public AbstractC0060z m213b() {
            if (this.f177a != null) {
                if (this.f178b.keySet().size() >= EnumC6337d.values().length) {
                    Map map = this.f178b;
                    this.f178b = new HashMap();
                    return AbstractC0060z.m206d(this.f177a, map);
                }
                throw new IllegalStateException("Not all priorities have been configured");
            }
            throw new NullPointerException("missing required property: clock");
        }

        /* renamed from: c */
        public a m214c(InterfaceC3935a interfaceC3935a) {
            this.f177a = interfaceC3935a;
            return this;
        }
    }

    /* renamed from: a4.z$b */
    /* loaded from: classes.dex */
    public static abstract class b {

        /* renamed from: a4.z$b$a */
        /* loaded from: classes.dex */
        public static abstract class a {
            /* renamed from: a */
            public abstract b mo146a();

            /* renamed from: b */
            public abstract a mo147b(long j10);

            /* renamed from: c */
            public abstract a mo148c(Set set);

            /* renamed from: d */
            public abstract a mo149d(long j10);
        }

        /* renamed from: a */
        public static a m215a() {
            return new C0023d.b().mo148c(Collections.emptySet());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract long mo143b();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract Set mo144c();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: d */
        public abstract long mo145d();
    }

    /* renamed from: a4.z$c */
    /* loaded from: classes.dex */
    public enum c {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    /* renamed from: a */
    private long m204a(int i10, long j10) {
        long j11;
        int i11 = i10 - 1;
        if (j10 > 1) {
            j11 = j10;
        } else {
            j11 = 2;
        }
        double max = Math.max(1.0d, Math.log(10000.0d) / Math.log(j11 * i11));
        double pow = Math.pow(3.0d, i11);
        double d10 = j10;
        Double.isNaN(d10);
        return (long) (pow * d10 * max);
    }

    /* renamed from: b */
    public static a m205b() {
        return new a();
    }

    /* renamed from: d */
    static AbstractC0060z m206d(InterfaceC3935a interfaceC3935a, Map map) {
        return new C0021c(interfaceC3935a, map);
    }

    /* renamed from: f */
    public static AbstractC0060z m207f(InterfaceC3935a interfaceC3935a) {
        return m205b().m212a(EnumC6337d.DEFAULT, b.m215a().mo147b(30000L).mo149d(86400000L).mo146a()).m212a(EnumC6337d.HIGHEST, b.m215a().mo147b(1000L).mo149d(86400000L).mo146a()).m212a(EnumC6337d.VERY_LOW, b.m215a().mo147b(86400000L).mo149d(86400000L).mo148c(m208i(c.NETWORK_UNMETERED, c.DEVICE_IDLE)).mo146a()).m214c(interfaceC3935a).m213b();
    }

    /* renamed from: i */
    private static Set m208i(Object... objArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(objArr)));
    }

    /* renamed from: j */
    private void m209j(JobInfo.Builder builder, Set set) {
        if (set.contains(c.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(c.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(c.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }

    /* renamed from: c */
    public JobInfo.Builder m210c(JobInfo.Builder builder, EnumC6337d enumC6337d, long j10, int i10) {
        builder.setMinimumLatency(m211g(enumC6337d, j10, i10));
        m209j(builder, ((b) mo142h().get(enumC6337d)).mo144c());
        return builder;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract InterfaceC3935a mo141e();

    /* renamed from: g */
    public long m211g(EnumC6337d enumC6337d, long j10, int i10) {
        long mo16762a = j10 - mo141e().mo16762a();
        b bVar = (b) mo142h().get(enumC6337d);
        return Math.min(Math.max(m204a(i10, bVar.mo143b()), mo16762a), bVar.mo145d());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public abstract Map mo142h();
}
