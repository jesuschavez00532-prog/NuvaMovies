package p388we;

import android.os.Handler;
import android.os.Looper;
import be.C1328x;
import ee.InterfaceC4184g;
import me.InterfaceC5660l;
import ne.AbstractC5864g;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import re.AbstractC6578f;
import ve.InterfaceC7281h;

/* renamed from: we.a */
/* loaded from: classes3.dex */
public final class C7440a extends AbstractC7441b {
    private volatile C7440a _immediate;

    /* renamed from: b */
    private final C7440a f27477b;

    /* renamed from: c */
    private final Handler f27478c;

    /* renamed from: d */
    private final String f27479d;

    /* renamed from: e */
    private final boolean f27480e;

    /* renamed from: we.a$a */
    /* loaded from: classes3.dex */
    public static final class a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ InterfaceC7281h f27482b;

        public a(InterfaceC7281h interfaceC7281h) {
            this.f27482b = interfaceC7281h;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f27482b.mo28137g(C7440a.this, C1328x.f4998a);
        }
    }

    /* renamed from: we.a$b */
    /* loaded from: classes3.dex */
    static final class b extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: b */
        final /* synthetic */ Runnable f27484b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Runnable runnable) {
            super(1);
            this.f27484b = runnable;
        }

        /* renamed from: a */
        public final void m28548a(Throwable th) {
            C7440a.this.f27478c.removeCallbacks(this.f27484b);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m28548a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    private C7440a(Handler handler, String str, boolean z10) {
        super(null);
        this.f27478c = handler;
        this.f27479d = str;
        this.f27480e = z10;
        this._immediate = z10 ? this : null;
        C7440a c7440a = this._immediate;
        if (c7440a == null) {
            c7440a = new C7440a(handler, str, true);
            this._immediate = c7440a;
            C1328x c1328x = C1328x.f4998a;
        }
        this.f27477b = c7440a;
    }

    @Override // ve.AbstractC7292k1
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public C7440a mo21241z() {
        return this.f27477b;
    }

    @Override // ve.InterfaceC7282h0
    /* renamed from: e */
    public void mo21238e(long j10, InterfaceC7281h interfaceC7281h) {
        long m25676d;
        a aVar = new a(interfaceC7281h);
        Handler handler = this.f27478c;
        m25676d = AbstractC6578f.m25676d(j10, 4611686018427387903L);
        handler.postDelayed(aVar, m25676d);
        interfaceC7281h.mo28138j(new b(aVar));
    }

    public boolean equals(Object obj) {
        if ((obj instanceof C7440a) && ((C7440a) obj).f27478c == this.f27478c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return System.identityHashCode(this.f27478c);
    }

    @Override // ve.AbstractC7329x
    public String toString() {
        String m28244A = m28244A();
        if (m28244A == null) {
            String str = this.f27479d;
            if (str == null) {
                str = this.f27478c.toString();
            }
            if (this.f27480e) {
                return str + ".immediate";
            }
            return str;
        }
        return m28244A;
    }

    @Override // ve.AbstractC7329x
    /* renamed from: x */
    public void mo21239x(InterfaceC4184g interfaceC4184g, Runnable runnable) {
        this.f27478c.post(runnable);
    }

    @Override // ve.AbstractC7329x
    /* renamed from: y */
    public boolean mo21240y(InterfaceC4184g interfaceC4184g) {
        if (!this.f27480e || (!AbstractC5868k.m23669a(Looper.myLooper(), this.f27478c.getLooper()))) {
            return true;
        }
        return false;
    }

    public /* synthetic */ C7440a(Handler handler, String str, int i10, AbstractC5864g abstractC5864g) {
        this(handler, (i10 & 2) != 0 ? null : str);
    }

    public C7440a(Handler handler, String str) {
        this(handler, str, false);
    }
}
