package p127f5;

import java.util.concurrent.ExecutionException;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: f5.p */
/* loaded from: classes.dex */
public final class C4254p implements InterfaceC4253o {

    /* renamed from: a */
    private final Object f18552a = new Object();

    /* renamed from: b */
    private final int f18553b;

    /* renamed from: c */
    private final C4246i0 f18554c;

    /* renamed from: d */
    private int f18555d;

    /* renamed from: e */
    private int f18556e;

    /* renamed from: f */
    private int f18557f;

    /* renamed from: g */
    private Exception f18558g;

    /* renamed from: h */
    private boolean f18559h;

    public C4254p(int i10, C4246i0 c4246i0) {
        this.f18553b = i10;
        this.f18554c = c4246i0;
    }

    /* renamed from: a */
    private final void m17740a() {
        if (this.f18555d + this.f18556e + this.f18557f == this.f18553b) {
            if (this.f18558g != null) {
                this.f18554c.m17719q(new ExecutionException(this.f18556e + " out of " + this.f18553b + " underlying tasks failed", this.f18558g));
                return;
            }
            if (this.f18559h) {
                this.f18554c.m17721s();
            } else {
                this.f18554c.m17720r(null);
            }
        }
    }

    @Override // p127f5.InterfaceC4233c
    /* renamed from: b */
    public final void mo17694b() {
        synchronized (this.f18552a) {
            this.f18557f++;
            this.f18559h = true;
            m17740a();
        }
    }

    @Override // p127f5.InterfaceC4239f
    public final void onSuccess(Object obj) {
        synchronized (this.f18552a) {
            this.f18555d++;
            m17740a();
        }
    }

    @Override // p127f5.InterfaceC4237e
    /* renamed from: u0 */
    public final void mo17696u0(Exception exc) {
        synchronized (this.f18552a) {
            this.f18556e++;
            this.f18558g = exc;
            m17740a();
        }
    }
}
