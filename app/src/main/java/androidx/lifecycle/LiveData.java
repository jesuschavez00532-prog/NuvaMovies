package androidx.lifecycle;

import androidx.lifecycle.AbstractC0749c;
import java.util.Map;
import p167i.C4836a;
import p182j.C4966b;

/* loaded from: classes.dex */
public abstract class LiveData {

    /* renamed from: k */
    static final Object f3093k = new Object();

    /* renamed from: a */
    final Object f3094a = new Object();

    /* renamed from: b */
    private C4966b f3095b = new C4966b();

    /* renamed from: c */
    int f3096c = 0;

    /* renamed from: d */
    private boolean f3097d;

    /* renamed from: e */
    private volatile Object f3098e;

    /* renamed from: f */
    volatile Object f3099f;

    /* renamed from: g */
    private int f3100g;

    /* renamed from: h */
    private boolean f3101h;

    /* renamed from: i */
    private boolean f3102i;

    /* renamed from: j */
    private final Runnable f3103j;

    /* loaded from: classes.dex */
    class LifecycleBoundObserver extends androidx.lifecycle.LiveData.c implements InterfaceC0750d {

        /* renamed from: e */
        final InterfaceC0752f f3104e;

        /* renamed from: f */
        final /* synthetic */ LiveData f3105f;

        /* renamed from: b */
        void m3685b() {
            this.f3104e.mo953f6().mo3705c(this);
        }

        /* renamed from: c */
        boolean m3686c() {
            return this.f3104e.mo953f6().mo3704b().m3709a(AbstractC0749c.c.STARTED);
        }

        @Override // androidx.lifecycle.InterfaceC0750d
        public void onStateChanged(InterfaceC0752f interfaceC0752f, AbstractC0749c.b bVar) {
            AbstractC0749c.c mo3704b = this.f3104e.mo953f6().mo3704b();
            if (mo3704b == AbstractC0749c.c.DESTROYED) {
                this.f3105f.m3683h(this.f3108a);
                return;
            }
            AbstractC0749c.c cVar = null;
            while (cVar != mo3704b) {
                m3688a(m3686c());
                cVar = mo3704b;
                mo3704b = this.f3104e.mo953f6().mo3704b();
            }
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$a */
    /* loaded from: classes.dex */
    class RunnableC0742a implements Runnable {
        RunnableC0742a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (LiveData.this.f3094a) {
                obj = LiveData.this.f3099f;
                LiveData.this.f3099f = LiveData.f3093k;
            }
            LiveData.this.mo3684i(obj);
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$b */
    /* loaded from: classes.dex */
    private class C0743b extends AbstractC0744c {
        C0743b(InterfaceC0757k interfaceC0757k) {
            super(interfaceC0757k);
        }

        @Override // androidx.lifecycle.LiveData.AbstractC0744c
        /* renamed from: c */
        boolean mo3687c() {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.lifecycle.LiveData$c */
    /* loaded from: classes.dex */
    public abstract class AbstractC0744c {

        /* renamed from: a */
        final InterfaceC0757k f3108a;

        /* renamed from: b */
        boolean f3109b;

        /* renamed from: c */
        int f3110c = -1;

        AbstractC0744c(InterfaceC0757k interfaceC0757k) {
            this.f3108a = interfaceC0757k;
        }

        /* renamed from: a */
        void m3688a(boolean z10) {
            int i10;
            if (z10 == this.f3109b) {
                return;
            }
            this.f3109b = z10;
            LiveData liveData = LiveData.this;
            if (z10) {
                i10 = 1;
            } else {
                i10 = -1;
            }
            liveData.m3678b(i10);
            if (this.f3109b) {
                LiveData.this.m3679d(this);
            }
        }

        /* renamed from: b */
        void m3689b() {
        }

        /* renamed from: c */
        abstract boolean mo3687c();
    }

    public LiveData() {
        Object obj = f3093k;
        this.f3099f = obj;
        this.f3103j = new RunnableC0742a();
        this.f3098e = obj;
        this.f3100g = -1;
    }

    /* renamed from: a */
    static void m3676a(String str) {
        if (C4836a.m19914d().mo19916b()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    /* renamed from: c */
    private void m3677c(AbstractC0744c abstractC0744c) {
        if (!abstractC0744c.f3109b) {
            return;
        }
        if (!abstractC0744c.mo3687c()) {
            abstractC0744c.m3688a(false);
            return;
        }
        int i10 = abstractC0744c.f3110c;
        int i11 = this.f3100g;
        if (i10 >= i11) {
            return;
        }
        abstractC0744c.f3110c = i11;
        abstractC0744c.f3108a.mo3288a(this.f3098e);
    }

    /* renamed from: b */
    void m3678b(int i10) {
        boolean z10;
        boolean z11;
        int i11 = this.f3096c;
        this.f3096c = i10 + i11;
        if (this.f3097d) {
            return;
        }
        this.f3097d = true;
        while (true) {
            try {
                int i12 = this.f3096c;
                if (i11 != i12) {
                    if (i11 == 0 && i12 > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (i11 > 0 && i12 == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z10) {
                        m3681f();
                    } else if (z11) {
                        m3682g();
                    }
                    i11 = i12;
                } else {
                    return;
                }
            } finally {
                this.f3097d = false;
            }
        }
    }

    /* renamed from: d */
    void m3679d(AbstractC0744c abstractC0744c) {
        if (this.f3101h) {
            this.f3102i = true;
            return;
        }
        this.f3101h = true;
        do {
            this.f3102i = false;
            if (abstractC0744c != null) {
                m3677c(abstractC0744c);
                abstractC0744c = null;
            } else {
                C4966b.d m20300i = this.f3095b.m20300i();
                while (m20300i.hasNext()) {
                    m3677c((AbstractC0744c) ((Map.Entry) m20300i.next()).getValue());
                    if (this.f3102i) {
                        break;
                    }
                }
            }
        } while (this.f3102i);
        this.f3101h = false;
    }

    /* renamed from: e */
    public void m3680e(InterfaceC0757k interfaceC0757k) {
        m3676a("observeForever");
        C0743b c0743b = new C0743b(interfaceC0757k);
        AbstractC0744c abstractC0744c = (AbstractC0744c) this.f3095b.mo20296n(interfaceC0757k, c0743b);
        if (!(abstractC0744c instanceof LifecycleBoundObserver)) {
            if (abstractC0744c != null) {
                return;
            }
            c0743b.m3688a(true);
            return;
        }
        throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
    }

    /* renamed from: f */
    protected void m3681f() {
    }

    /* renamed from: g */
    protected void m3682g() {
    }

    /* renamed from: h */
    public void m3683h(InterfaceC0757k interfaceC0757k) {
        m3676a("removeObserver");
        AbstractC0744c abstractC0744c = (AbstractC0744c) this.f3095b.mo20297o(interfaceC0757k);
        if (abstractC0744c == null) {
            return;
        }
        abstractC0744c.m3689b();
        abstractC0744c.m3688a(false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: i */
    public void mo3684i(Object obj) {
        m3676a("setValue");
        this.f3100g++;
        this.f3098e = obj;
        m3679d(null);
    }
}
