package p216l1;

import android.util.Log;
import com.bumptech.glide.load.data.InterfaceC1604d;
import com.bumptech.glide.load.data.InterfaceC1605e;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import p109e2.AbstractC4117g;
import p184j1.EnumC4970a;
import p184j1.InterfaceC4973d;
import p184j1.InterfaceC4975f;
import p216l1.InterfaceC5319f;
import p243n1.InterfaceC5723a;
import p278p1.InterfaceC6175o;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: l1.z */
/* loaded from: classes.dex */
public class C5339z implements InterfaceC5319f, InterfaceC5319f.a {

    /* renamed from: a */
    private final C5320g f21864a;

    /* renamed from: b */
    private final InterfaceC5319f.a f21865b;

    /* renamed from: c */
    private volatile int f21866c;

    /* renamed from: d */
    private volatile C5316c f21867d;

    /* renamed from: e */
    private volatile Object f21868e;

    /* renamed from: f */
    private volatile InterfaceC6175o.a f21869f;

    /* renamed from: g */
    private volatile C5317d f21870g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l1.z$a */
    /* loaded from: classes.dex */
    public class a implements InterfaceC1604d.a {

        /* renamed from: a */
        final /* synthetic */ InterfaceC6175o.a f21871a;

        a(InterfaceC6175o.a aVar) {
            this.f21871a = aVar;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC1604d.a
        /* renamed from: c */
        public void mo7430c(Exception exc) {
            if (C5339z.this.m21611g(this.f21871a)) {
                C5339z.this.m21613i(this.f21871a, exc);
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC1604d.a
        /* renamed from: e */
        public void mo7431e(Object obj) {
            if (C5339z.this.m21611g(this.f21871a)) {
                C5339z.this.m21612h(this.f21871a, obj);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5339z(C5320g c5320g, InterfaceC5319f.a aVar) {
        this.f21864a = c5320g;
        this.f21865b = aVar;
    }

    /* renamed from: e */
    private boolean m21608e(Object obj) {
        long m17210b = AbstractC4117g.m17210b();
        boolean z10 = false;
        try {
            InterfaceC1605e m21475o = this.f21864a.m21475o(obj);
            Object mo7412a = m21475o.mo7412a();
            InterfaceC4973d m21477q = this.f21864a.m21477q(mo7412a);
            C5318e c5318e = new C5318e(m21477q, mo7412a, this.f21864a.m21471k());
            C5317d c5317d = new C5317d(this.f21869f.f24285a, this.f21864a.m21476p());
            InterfaceC5723a m21464d = this.f21864a.m21464d();
            m21464d.mo23117a(c5317d, c5318e);
            if (Log.isLoggable("SourceGenerator", 2)) {
                Log.v("SourceGenerator", "Finished encoding source to cache, key: " + c5317d + ", data: " + obj + ", encoder: " + m21477q + ", duration: " + AbstractC4117g.m17209a(m17210b));
            }
            if (m21464d.mo23118b(c5317d) != null) {
                this.f21870g = c5317d;
                this.f21867d = new C5316c(Collections.singletonList(this.f21869f.f24285a), this.f21864a, this);
                this.f21869f.f24287c.mo7423b();
                return true;
            }
            if (Log.isLoggable("SourceGenerator", 3)) {
                Log.d("SourceGenerator", "Attempt to write: " + this.f21870g + ", data: " + obj + " to the disk cache failed, maybe the disk cache is disabled? Trying to decode the data directly...");
            }
            try {
                this.f21865b.mo21460d(this.f21869f.f24285a, m21475o.mo7412a(), this.f21869f.f24287c, this.f21869f.f24287c.getDataSource(), this.f21869f.f24285a);
                return false;
            } catch (Throwable th) {
                th = th;
                z10 = true;
                if (!z10) {
                    this.f21869f.f24287c.mo7423b();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: f */
    private boolean m21609f() {
        if (this.f21866c < this.f21864a.m21467g().size()) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    private void m21610j(InterfaceC6175o.a aVar) {
        this.f21869f.f24287c.mo7425d(this.f21864a.m21472l(), new a(aVar));
    }

    @Override // p216l1.InterfaceC5319f
    /* renamed from: a */
    public boolean mo21456a() {
        if (this.f21868e != null) {
            Object obj = this.f21868e;
            this.f21868e = null;
            try {
                if (!m21608e(obj)) {
                    return true;
                }
            } catch (IOException e10) {
                if (Log.isLoggable("SourceGenerator", 3)) {
                    Log.d("SourceGenerator", "Failed to properly rewind or write data to cache", e10);
                }
            }
        }
        if (this.f21867d != null && this.f21867d.mo21456a()) {
            return true;
        }
        this.f21867d = null;
        this.f21869f = null;
        boolean z10 = false;
        while (!z10 && m21609f()) {
            List m21467g = this.f21864a.m21467g();
            int i10 = this.f21866c;
            this.f21866c = i10 + 1;
            this.f21869f = (InterfaceC6175o.a) m21467g.get(i10);
            if (this.f21869f != null && (this.f21864a.m21465e().mo21533c(this.f21869f.f24287c.getDataSource()) || this.f21864a.m21481u(this.f21869f.f24287c.mo7418a()))) {
                m21610j(this.f21869f);
                z10 = true;
            }
        }
        return z10;
    }

    @Override // p216l1.InterfaceC5319f.a
    /* renamed from: b */
    public void mo21458b(InterfaceC4975f interfaceC4975f, Exception exc, InterfaceC1604d interfaceC1604d, EnumC4970a enumC4970a) {
        this.f21865b.mo21458b(interfaceC4975f, exc, interfaceC1604d, this.f21869f.f24287c.getDataSource());
    }

    @Override // p216l1.InterfaceC5319f.a
    /* renamed from: c */
    public void mo21459c() {
        throw new UnsupportedOperationException();
    }

    @Override // p216l1.InterfaceC5319f
    public void cancel() {
        InterfaceC6175o.a aVar = this.f21869f;
        if (aVar != null) {
            aVar.f24287c.cancel();
        }
    }

    @Override // p216l1.InterfaceC5319f.a
    /* renamed from: d */
    public void mo21460d(InterfaceC4975f interfaceC4975f, Object obj, InterfaceC1604d interfaceC1604d, EnumC4970a enumC4970a, InterfaceC4975f interfaceC4975f2) {
        this.f21865b.mo21460d(interfaceC4975f, obj, interfaceC1604d, this.f21869f.f24287c.getDataSource(), interfaceC4975f);
    }

    /* renamed from: g */
    boolean m21611g(InterfaceC6175o.a aVar) {
        InterfaceC6175o.a aVar2 = this.f21869f;
        if (aVar2 != null && aVar2 == aVar) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    void m21612h(InterfaceC6175o.a aVar, Object obj) {
        AbstractC5323j m21465e = this.f21864a.m21465e();
        if (obj != null && m21465e.mo21533c(aVar.f24287c.getDataSource())) {
            this.f21868e = obj;
            this.f21865b.mo21459c();
        } else {
            InterfaceC5319f.a aVar2 = this.f21865b;
            InterfaceC4975f interfaceC4975f = aVar.f24285a;
            InterfaceC1604d interfaceC1604d = aVar.f24287c;
            aVar2.mo21460d(interfaceC4975f, obj, interfaceC1604d, interfaceC1604d.getDataSource(), this.f21870g);
        }
    }

    /* renamed from: i */
    void m21613i(InterfaceC6175o.a aVar, Exception exc) {
        InterfaceC5319f.a aVar2 = this.f21865b;
        C5317d c5317d = this.f21870g;
        InterfaceC1604d interfaceC1604d = aVar.f24287c;
        aVar2.mo21458b(c5317d, exc, interfaceC1604d, interfaceC1604d.getDataSource());
    }
}
