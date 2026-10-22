package p003a2;

import android.graphics.drawable.Drawable;
import anet.channel.util.HttpConstant;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p022b2.InterfaceC1041i;
import p022b2.InterfaceC1042j;
import p034c2.InterfaceC1344b;
import p109e2.AbstractC4122l;
import p184j1.EnumC4970a;
import p216l1.C5330q;

/* renamed from: a2.f */
/* loaded from: classes.dex */
public class C0010f implements InterfaceFutureC0007c, InterfaceC0011g {

    /* renamed from: k */
    private static final a f50k = new a();

    /* renamed from: a */
    private final int f51a;

    /* renamed from: b */
    private final int f52b;

    /* renamed from: c */
    private final boolean f53c;

    /* renamed from: d */
    private final a f54d;

    /* renamed from: e */
    private Object f55e;

    /* renamed from: f */
    private InterfaceC0008d f56f;

    /* renamed from: g */
    private boolean f57g;

    /* renamed from: h */
    private boolean f58h;

    /* renamed from: i */
    private boolean f59i;

    /* renamed from: j */
    private C5330q f60j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a2.f$a */
    /* loaded from: classes.dex */
    public static class a {
        a() {
        }

        /* renamed from: a */
        void m103a(Object obj) {
            obj.notifyAll();
        }

        /* renamed from: b */
        void m104b(Object obj, long j10) {
            obj.wait(j10);
        }
    }

    public C0010f(int i10, int i11) {
        this(i10, i11, true, f50k);
    }

    /* renamed from: c */
    private synchronized Object m100c(Long l10) {
        if (this.f53c && !isDone()) {
            AbstractC4122l.m17228a();
        }
        if (!this.f57g) {
            if (!this.f59i) {
                if (this.f58h) {
                    return this.f55e;
                }
                if (l10 == null) {
                    this.f54d.m104b(this, 0L);
                } else if (l10.longValue() > 0) {
                    long currentTimeMillis = System.currentTimeMillis();
                    long longValue = l10.longValue() + currentTimeMillis;
                    while (!isDone() && currentTimeMillis < longValue) {
                        this.f54d.m104b(this, longValue - currentTimeMillis);
                        currentTimeMillis = System.currentTimeMillis();
                    }
                }
                if (!Thread.interrupted()) {
                    if (!this.f59i) {
                        if (!this.f57g) {
                            if (this.f58h) {
                                return this.f55e;
                            }
                            throw new TimeoutException();
                        }
                        throw new CancellationException();
                    }
                    throw new ExecutionException(this.f60j);
                }
                throw new InterruptedException();
            }
            throw new ExecutionException(this.f60j);
        }
        throw new CancellationException();
    }

    @Override // p003a2.InterfaceC0011g
    /* renamed from: a */
    public synchronized boolean mo101a(C5330q c5330q, Object obj, InterfaceC1042j interfaceC1042j, boolean z10) {
        this.f59i = true;
        this.f60j = c5330q;
        this.f54d.m103a(this);
        return false;
    }

    @Override // p003a2.InterfaceC0011g
    /* renamed from: b */
    public synchronized boolean mo102b(Object obj, Object obj2, InterfaceC1042j interfaceC1042j, EnumC4970a enumC4970a, boolean z10) {
        this.f58h = true;
        this.f55e = obj;
        this.f54d.m103a(this);
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        synchronized (this) {
            if (isDone()) {
                return false;
            }
            this.f57g = true;
            this.f54d.m103a(this);
            InterfaceC0008d interfaceC0008d = null;
            if (z10) {
                InterfaceC0008d interfaceC0008d2 = this.f56f;
                this.f56f = null;
                interfaceC0008d = interfaceC0008d2;
            }
            if (interfaceC0008d != null) {
                interfaceC0008d.clear();
            }
            return true;
        }
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        try {
            return m100c(null);
        } catch (TimeoutException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // p022b2.InterfaceC1042j
    public synchronized InterfaceC0008d getRequest() {
        return this.f56f;
    }

    @Override // p022b2.InterfaceC1042j
    public void getSize(InterfaceC1041i interfaceC1041i) {
        interfaceC1041i.mo130e(this.f51a, this.f52b);
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean isCancelled() {
        return this.f57g;
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean isDone() {
        boolean z10;
        if (!this.f57g && !this.f58h) {
            if (!this.f59i) {
                z10 = false;
            }
        }
        z10 = true;
        return z10;
    }

    @Override // com.bumptech.glide.manager.InterfaceC1628k
    public void onDestroy() {
    }

    @Override // p022b2.InterfaceC1042j
    public void onLoadCleared(Drawable drawable) {
    }

    @Override // p022b2.InterfaceC1042j
    public synchronized void onLoadFailed(Drawable drawable) {
    }

    @Override // p022b2.InterfaceC1042j
    public void onLoadStarted(Drawable drawable) {
    }

    @Override // p022b2.InterfaceC1042j
    public synchronized void onResourceReady(Object obj, InterfaceC1344b interfaceC1344b) {
    }

    @Override // com.bumptech.glide.manager.InterfaceC1628k
    public void onStart() {
    }

    @Override // com.bumptech.glide.manager.InterfaceC1628k
    public void onStop() {
    }

    @Override // p022b2.InterfaceC1042j
    public void removeCallback(InterfaceC1041i interfaceC1041i) {
    }

    @Override // p022b2.InterfaceC1042j
    public synchronized void setRequest(InterfaceC0008d interfaceC0008d) {
        this.f56f = interfaceC0008d;
    }

    public String toString() {
        InterfaceC0008d interfaceC0008d;
        String str;
        String str2 = super.toString() + "[status=";
        synchronized (this) {
            interfaceC0008d = null;
            if (this.f57g) {
                str = "CANCELLED";
            } else if (this.f59i) {
                str = "FAILURE";
            } else if (this.f58h) {
                str = HttpConstant.SUCCESS;
            } else {
                str = "PENDING";
                interfaceC0008d = this.f56f;
            }
        }
        if (interfaceC0008d != null) {
            return str2 + str + ", request=[" + interfaceC0008d + "]]";
        }
        return str2 + str + "]";
    }

    C0010f(int i10, int i11, boolean z10, a aVar) {
        this.f51a = i10;
        this.f52b = i11;
        this.f53c = z10;
        this.f54d = aVar;
    }

    @Override // java.util.concurrent.Future
    public Object get(long j10, TimeUnit timeUnit) {
        return m100c(Long.valueOf(timeUnit.toMillis(j10)));
    }
}
