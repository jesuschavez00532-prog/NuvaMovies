package com.umeng.message.proguard;

import android.annotation.TargetApi;
import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import com.lzy.okgo.OkGo;
import com.umeng.message.common.UPLog;
import java.util.ArrayList;
import java.util.HashMap;
import p005a4.AbstractC0025e;

/* renamed from: com.umeng.message.proguard.r */
/* loaded from: classes3.dex */
public abstract class AbstractServiceC3699r extends Service {
    private static final String TAG = "BaseService";
    private static final int sJobIndex = 21000;
    final ArrayList<d> mCompatQueue;
    h mCompatWorkEnqueuer;
    a mCurProcessor;
    b mJobImpl;
    static final Object sLock = new Object();
    static final HashMap<ComponentName, h> sClassWorkEnqueuer = new HashMap<>();
    private static final HashMap<Class<?>, Integer> sJobMap = new HashMap<>();
    private static final Object mRealTimeModeLock = new Object();
    boolean mInterruptIfStopped = false;
    boolean mStopped = false;
    boolean mDestroyed = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.umeng.message.proguard.r$a */
    /* loaded from: classes3.dex */
    public static class a implements Runnable {

        /* renamed from: a */
        private AbstractServiceC3699r f16581a;

        a(AbstractServiceC3699r abstractServiceC3699r) {
            this.f16581a = abstractServiceC3699r;
        }

        @Override // java.lang.Runnable
        public final void run() {
            while (true) {
                try {
                    e dequeueWork = this.f16581a.dequeueWork();
                    if (dequeueWork != null) {
                        UPLog.m15198i(AbstractServiceC3699r.TAG, this.f16581a.getClass().getSimpleName(), "onHandleWork");
                        this.f16581a.onHandleWork(dequeueWork.mo15810a());
                        dequeueWork.mo15811b();
                    }
                } catch (Throwable th) {
                    UPLog.m15196e(AbstractServiceC3699r.TAG, th);
                }
                try {
                    break;
                } catch (Throwable th2) {
                    UPLog.m15196e(AbstractServiceC3699r.TAG, th2);
                }
            }
            this.f16581a.processorFinished();
            this.f16581a = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.umeng.message.proguard.r$b */
    /* loaded from: classes3.dex */
    public interface b {
        /* renamed from: a */
        IBinder mo15804a();

        /* renamed from: b */
        e mo15805b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.umeng.message.proguard.r$d */
    /* loaded from: classes3.dex */
    public final class d implements e {

        /* renamed from: a */
        final Intent f16587a;

        /* renamed from: b */
        final int f16588b;

        d(Intent intent, int i10) {
            this.f16587a = intent;
            this.f16588b = i10;
        }

        @Override // com.umeng.message.proguard.AbstractServiceC3699r.e
        /* renamed from: a */
        public final Intent mo15810a() {
            return this.f16587a;
        }

        @Override // com.umeng.message.proguard.AbstractServiceC3699r.e
        /* renamed from: b */
        public final void mo15811b() {
            try {
                AbstractServiceC3699r.this.stopSelf(this.f16588b);
            } catch (Throwable th) {
                UPLog.m15196e(AbstractServiceC3699r.TAG, th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.umeng.message.proguard.r$e */
    /* loaded from: classes3.dex */
    public interface e {
        /* renamed from: a */
        Intent mo15810a();

        /* renamed from: b */
        void mo15811b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @TargetApi(26)
    /* renamed from: com.umeng.message.proguard.r$f */
    /* loaded from: classes3.dex */
    public static final class f extends JobServiceEngine implements b {

        /* renamed from: a */
        final AbstractServiceC3699r f16590a;

        /* renamed from: b */
        final Object f16591b;

        /* renamed from: c */
        JobParameters f16592c;

        /* renamed from: com.umeng.message.proguard.r$f$a */
        /* loaded from: classes3.dex */
        final class a implements e {

            /* renamed from: a */
            final JobWorkItem f16593a;

            a(JobWorkItem jobWorkItem) {
                this.f16593a = jobWorkItem;
            }

            @Override // com.umeng.message.proguard.AbstractServiceC3699r.e
            /* renamed from: a */
            public final Intent mo15810a() {
                Intent intent;
                intent = this.f16593a.getIntent();
                return intent;
            }

            @Override // com.umeng.message.proguard.AbstractServiceC3699r.e
            /* renamed from: b */
            public final void mo15811b() {
                try {
                    synchronized (f.this.f16591b) {
                        JobParameters jobParameters = f.this.f16592c;
                        if (jobParameters != null) {
                            try {
                                jobParameters.completeWork(this.f16593a);
                            } catch (Throwable th) {
                                UPLog.m15196e(AbstractServiceC3699r.TAG, th);
                            }
                        }
                    }
                } catch (Throwable th2) {
                    UPLog.m15196e(AbstractServiceC3699r.TAG, th2);
                }
            }
        }

        f(AbstractServiceC3699r abstractServiceC3699r) {
            super(abstractServiceC3699r);
            this.f16591b = new Object();
            this.f16590a = abstractServiceC3699r;
        }

        @Override // com.umeng.message.proguard.AbstractServiceC3699r.b
        /* renamed from: a */
        public final IBinder mo15804a() {
            IBinder binder;
            binder = getBinder();
            return binder;
        }

        @Override // com.umeng.message.proguard.AbstractServiceC3699r.b
        /* renamed from: b */
        public final e mo15805b() {
            JobWorkItem dequeueWork;
            Intent intent;
            try {
                synchronized (this.f16591b) {
                    JobParameters jobParameters = this.f16592c;
                    if (jobParameters == null) {
                        return null;
                    }
                    dequeueWork = jobParameters.dequeueWork();
                    if (dequeueWork != null) {
                        intent = dequeueWork.getIntent();
                        intent.setExtrasClassLoader(this.f16590a.getClassLoader());
                        return new a(dequeueWork);
                    }
                    return null;
                }
            } catch (Throwable th) {
                UPLog.m15196e(AbstractServiceC3699r.TAG, th);
                return null;
            }
        }

        @Override // android.app.job.JobServiceEngine
        public final boolean onStartJob(JobParameters jobParameters) {
            this.f16592c = jobParameters;
            this.f16590a.ensureProcessorRunningLocked(false);
            return true;
        }

        @Override // android.app.job.JobServiceEngine
        public final boolean onStopJob(JobParameters jobParameters) {
            boolean doStopCurrentWork = this.f16590a.doStopCurrentWork();
            synchronized (this.f16591b) {
                this.f16592c = null;
            }
            return doStopCurrentWork;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @TargetApi(21)
    /* renamed from: com.umeng.message.proguard.r$g */
    /* loaded from: classes3.dex */
    public static final class g extends h {

        /* renamed from: a */
        private final JobInfo f16595a;

        /* renamed from: b */
        private JobScheduler f16596b;

        g(Context context, ComponentName componentName, int i10) {
            super(componentName);
            JobInfo.Builder overrideDeadline;
            JobInfo build;
            m15812a(i10);
            overrideDeadline = new JobInfo.Builder(i10, this.f16597c).setOverrideDeadline(0L);
            build = overrideDeadline.build();
            this.f16595a = build;
            try {
                this.f16596b = AbstractC0025e.m150a(context.getApplicationContext().getSystemService("jobscheduler"));
            } catch (Throwable th) {
                UPLog.m15196e(AbstractServiceC3699r.TAG, th);
            }
        }

        @Override // com.umeng.message.proguard.AbstractServiceC3699r.h
        /* renamed from: a */
        final void mo15807a(Intent intent) {
            try {
                if (Build.VERSION.SDK_INT >= 26) {
                    this.f16596b.enqueue(this.f16595a, new JobWorkItem(intent));
                }
            } catch (Throwable th) {
                UPLog.m15196e(AbstractServiceC3699r.TAG, th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.umeng.message.proguard.r$h */
    /* loaded from: classes3.dex */
    public static abstract class h {

        /* renamed from: c */
        final ComponentName f16597c;

        /* renamed from: d */
        boolean f16598d;

        /* renamed from: e */
        int f16599e;

        h(ComponentName componentName) {
            this.f16597c = componentName;
        }

        /* renamed from: a */
        public void mo15806a() {
        }

        /* renamed from: a */
        abstract void mo15807a(Intent intent);

        /* renamed from: b */
        public void mo15808b() {
        }

        /* renamed from: c */
        public void mo15809c() {
        }

        /* renamed from: a */
        final void m15812a(int i10) {
            if (!this.f16598d) {
                this.f16598d = true;
                this.f16599e = i10;
            } else {
                if (this.f16599e == i10) {
                    return;
                }
                throw new IllegalArgumentException("Given job ID " + i10 + " is different than previous " + this.f16599e);
            }
        }
    }

    public AbstractServiceC3699r() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.mCompatQueue = null;
        } else {
            this.mCompatQueue = new ArrayList<>();
        }
    }

    private static void enqueueWork(Context context, Class<?> cls, int i10, Intent intent) {
        if (context == null || cls == null || intent == null) {
            return;
        }
        try {
            enqueueWork(context, new ComponentName(context, cls), i10, intent);
        } catch (Throwable th) {
            UPLog.m15197e(TAG, "jobId:", Integer.valueOf(i10), "failed:", th.getMessage());
        }
    }

    static h getWorkEnqueuer(Context context, ComponentName componentName, boolean z10, int i10) {
        h cVar;
        HashMap<ComponentName, h> hashMap = sClassWorkEnqueuer;
        h hVar = hashMap.get(componentName);
        if (hVar == null) {
            if (Build.VERSION.SDK_INT >= 26) {
                if (z10) {
                    cVar = new g(context, componentName, i10);
                } else {
                    throw new IllegalArgumentException("Can't be here without a job id");
                }
            } else {
                cVar = new c(context, componentName);
            }
            h hVar2 = cVar;
            hashMap.put(componentName, hVar2);
            return hVar2;
        }
        return hVar;
    }

    private void init() {
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                this.mJobImpl = new f(this);
                this.mCompatWorkEnqueuer = null;
            } else {
                this.mJobImpl = null;
                this.mCompatWorkEnqueuer = getWorkEnqueuer(this, new ComponentName(this, getClass()), false, 0);
            }
        } catch (Throwable th) {
            UPLog.m15196e(TAG, th);
        }
    }

    e dequeueWork() {
        b bVar = this.mJobImpl;
        if (bVar != null) {
            return bVar.mo15805b();
        }
        ArrayList<d> arrayList = this.mCompatQueue;
        d dVar = null;
        if (arrayList == null) {
            return null;
        }
        synchronized (arrayList) {
            if (this.mCompatQueue.size() > 0) {
                dVar = this.mCompatQueue.remove(0);
            }
        }
        return dVar;
    }

    boolean doStopCurrentWork() {
        this.mStopped = true;
        return onStopCurrentWork();
    }

    void ensureProcessorRunningLocked(boolean z10) {
        try {
            if (this.mCurProcessor == null) {
                this.mCurProcessor = new a(this);
                h hVar = this.mCompatWorkEnqueuer;
                if (hVar != null && z10) {
                    hVar.mo15808b();
                }
                C3581b.m15373a(this.mCurProcessor);
            }
        } catch (Throwable th) {
            UPLog.m15196e(TAG, th);
        }
    }

    public boolean isStopped() {
        return this.mStopped;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        try {
            b bVar = this.mJobImpl;
            if (bVar == null) {
                return null;
            }
            return bVar.mo15804a();
        } catch (Throwable th) {
            UPLog.m15196e(TAG, th);
            return null;
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        init();
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        try {
            ArrayList<d> arrayList = this.mCompatQueue;
            if (arrayList != null) {
                synchronized (arrayList) {
                    this.mDestroyed = true;
                    this.mCompatWorkEnqueuer.mo15809c();
                }
            }
        } catch (Throwable th) {
            UPLog.m15196e(TAG, th);
        }
    }

    protected void onHandleWork(Intent intent) {
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        if (intent != null) {
            try {
                if (this.mCompatQueue == null) {
                    return 2;
                }
                if (this.mCompatWorkEnqueuer == null) {
                    init();
                }
                this.mCompatWorkEnqueuer.mo15806a();
                synchronized (this.mCompatQueue) {
                    this.mCompatQueue.add(new d(intent, i11));
                    ensureProcessorRunningLocked(true);
                }
                return 3;
            } catch (Throwable th) {
                UPLog.m15196e(TAG, th);
            }
        }
        return 2;
    }

    public boolean onStopCurrentWork() {
        return true;
    }

    void processorFinished() {
        try {
            ArrayList<d> arrayList = this.mCompatQueue;
            if (arrayList != null) {
                synchronized (arrayList) {
                    this.mCurProcessor = null;
                    if (this.mCompatQueue.size() > 0) {
                        ensureProcessorRunningLocked(false);
                    } else if (!this.mDestroyed) {
                        this.mCompatWorkEnqueuer.mo15809c();
                    }
                }
            }
        } catch (Throwable th) {
            UPLog.m15196e(TAG, th);
        }
    }

    public void setInterruptIfStopped(boolean z10) {
        this.mInterruptIfStopped = z10;
    }

    private static void enqueueWork(final Context context, final ComponentName componentName, final int i10, final Intent intent) {
        if (intent == null) {
            throw new IllegalArgumentException("work must not be null");
        }
        if (context == null || componentName == null) {
            return;
        }
        C3581b.m15378c(new Runnable() { // from class: com.umeng.message.proguard.r.1
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (AbstractServiceC3699r.sLock) {
                    h workEnqueuer = AbstractServiceC3699r.getWorkEnqueuer(context, componentName, true, i10);
                    workEnqueuer.m15812a(i10);
                    workEnqueuer.mo15807a(intent);
                }
            }
        });
    }

    public static <T extends AbstractServiceC3699r> void enqueueWork(Context context, Class<T> cls, Intent intent) {
        int intValue;
        synchronized (mRealTimeModeLock) {
            if (context == null || cls == null || intent == null) {
                return;
            }
            UPLog.m15198i(TAG, "enqueue cls:", cls.getSimpleName());
            HashMap<Class<?>, Integer> hashMap = sJobMap;
            if (!hashMap.containsKey(cls)) {
                intValue = hashMap.size() + sJobIndex;
                hashMap.put(cls, Integer.valueOf(intValue));
            } else {
                Integer num = hashMap.get(cls);
                if (num == null) {
                    return;
                } else {
                    intValue = num.intValue();
                }
            }
            UPLog.m15198i(TAG, "jobId:", Integer.valueOf(intValue));
            enqueueWork(context, (Class<?>) cls, intValue, intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.umeng.message.proguard.r$c */
    /* loaded from: classes3.dex */
    public static final class c extends h {

        /* renamed from: a */
        boolean f16582a;

        /* renamed from: b */
        boolean f16583b;

        /* renamed from: f */
        private final Context f16584f;

        /* renamed from: g */
        private final PowerManager.WakeLock f16585g;

        /* renamed from: h */
        private final PowerManager.WakeLock f16586h;

        c(Context context, ComponentName componentName) {
            super(componentName);
            this.f16584f = context.getApplicationContext();
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, componentName.getClassName() + ":launch");
            this.f16585g = newWakeLock;
            newWakeLock.setReferenceCounted(false);
            PowerManager.WakeLock newWakeLock2 = powerManager.newWakeLock(1, componentName.getClassName() + ":run");
            this.f16586h = newWakeLock2;
            newWakeLock2.setReferenceCounted(false);
        }

        @Override // com.umeng.message.proguard.AbstractServiceC3699r.h
        /* renamed from: a */
        final void mo15807a(Intent intent) {
            try {
                Intent intent2 = new Intent(intent);
                intent2.setComponent(this.f16597c);
                if (this.f16584f.startService(intent2) != null) {
                    synchronized (this) {
                        if (!this.f16582a) {
                            this.f16582a = true;
                            if (!this.f16583b) {
                                this.f16585g.acquire(OkGo.DEFAULT_MILLISECONDS);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                UPLog.m15196e(AbstractServiceC3699r.TAG, th);
            }
        }

        @Override // com.umeng.message.proguard.AbstractServiceC3699r.h
        /* renamed from: b */
        public final void mo15808b() {
            try {
                synchronized (this) {
                    if (!this.f16583b) {
                        this.f16583b = true;
                        this.f16586h.acquire(600000L);
                        this.f16585g.release();
                    }
                }
            } catch (Throwable th) {
                UPLog.m15196e(AbstractServiceC3699r.TAG, th);
            }
        }

        @Override // com.umeng.message.proguard.AbstractServiceC3699r.h
        /* renamed from: c */
        public final void mo15809c() {
            try {
                synchronized (this) {
                    if (this.f16583b) {
                        if (this.f16582a) {
                            this.f16585g.acquire(OkGo.DEFAULT_MILLISECONDS);
                        }
                        this.f16583b = false;
                        this.f16586h.release();
                    }
                }
            } catch (Throwable th) {
                UPLog.m15196e(AbstractServiceC3699r.TAG, th);
            }
        }

        @Override // com.umeng.message.proguard.AbstractServiceC3699r.h
        /* renamed from: a */
        public final void mo15806a() {
            synchronized (this) {
                this.f16582a = false;
            }
        }
    }
}
