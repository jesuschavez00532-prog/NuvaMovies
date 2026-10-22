package p375w1;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bumptech.glide.C1596k;
import com.bumptech.glide.ComponentCallbacks2C1586c;
import com.bumptech.glide.ComponentCallbacks2C1597l;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import p003a2.C0012h;
import p022b2.AbstractC1035c;
import p034c2.InterfaceC1344b;
import p093d2.C3923b;
import p109e2.AbstractC4121k;
import p109e2.AbstractC4122l;
import p152h1.InterfaceC4503a;
import p184j1.InterfaceC4975f;
import p184j1.InterfaceC4981l;
import p216l1.AbstractC5323j;
import p230m1.InterfaceC5571d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: w1.g */
/* loaded from: classes.dex */
public class C7350g {

    /* renamed from: a */
    private final InterfaceC4503a f27268a;

    /* renamed from: b */
    private final Handler f27269b;

    /* renamed from: c */
    private final List f27270c;

    /* renamed from: d */
    final ComponentCallbacks2C1597l f27271d;

    /* renamed from: e */
    private final InterfaceC5571d f27272e;

    /* renamed from: f */
    private boolean f27273f;

    /* renamed from: g */
    private boolean f27274g;

    /* renamed from: h */
    private boolean f27275h;

    /* renamed from: i */
    private C1596k f27276i;

    /* renamed from: j */
    private a f27277j;

    /* renamed from: k */
    private boolean f27278k;

    /* renamed from: l */
    private a f27279l;

    /* renamed from: m */
    private Bitmap f27280m;

    /* renamed from: n */
    private InterfaceC4981l f27281n;

    /* renamed from: o */
    private a f27282o;

    /* renamed from: p */
    private int f27283p;

    /* renamed from: q */
    private int f27284q;

    /* renamed from: r */
    private int f27285r;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w1.g$a */
    /* loaded from: classes.dex */
    public static class a extends AbstractC1035c {

        /* renamed from: d */
        private final Handler f27286d;

        /* renamed from: e */
        final int f27287e;

        /* renamed from: f */
        private final long f27288f;

        /* renamed from: g */
        private Bitmap f27289g;

        a(Handler handler, int i10, long j10) {
            this.f27286d = handler;
            this.f27287e = i10;
            this.f27288f = j10;
        }

        /* renamed from: a */
        Bitmap m28376a() {
            return this.f27289g;
        }

        @Override // p022b2.InterfaceC1042j
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onResourceReady(Bitmap bitmap, InterfaceC1344b interfaceC1344b) {
            this.f27289g = bitmap;
            this.f27286d.sendMessageAtTime(this.f27286d.obtainMessage(1, this), this.f27288f);
        }

        @Override // p022b2.InterfaceC1042j
        public void onLoadCleared(Drawable drawable) {
            this.f27289g = null;
        }
    }

    /* renamed from: w1.g$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        void mo28344a();
    }

    /* renamed from: w1.g$c */
    /* loaded from: classes.dex */
    private class c implements Handler.Callback {
        c() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 1) {
                C7350g.this.m28371n((a) message.obj);
                return true;
            }
            if (i10 == 2) {
                C7350g.this.f27271d.m7381f((a) message.obj);
                return false;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7350g(ComponentCallbacks2C1586c componentCallbacks2C1586c, InterfaceC4503a interfaceC4503a, int i10, int i11, InterfaceC4981l interfaceC4981l, Bitmap bitmap) {
        this(componentCallbacks2C1586c.m7288g(), ComponentCallbacks2C1586c.m7282u(componentCallbacks2C1586c.m7290i()), interfaceC4503a, null, m28356j(ComponentCallbacks2C1586c.m7282u(componentCallbacks2C1586c.m7290i()), i10, i11), interfaceC4981l, bitmap);
    }

    /* renamed from: g */
    private static InterfaceC4975f m28355g() {
        return new C3923b(Double.valueOf(Math.random()));
    }

    /* renamed from: j */
    private static C1596k m28356j(ComponentCallbacks2C1597l componentCallbacks2C1597l, int i10, int i11) {
        return componentCallbacks2C1597l.mo7377b().mo43a(((C0012h) ((C0012h) C0012h.m106u0(AbstractC5323j.f21744b).mo74s0(true)).mo64m0(true)).mo46b0(i10, i11));
    }

    /* renamed from: m */
    private void m28357m() {
        boolean z10;
        if (this.f27273f && !this.f27274g) {
            if (this.f27275h) {
                if (this.f27282o == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                AbstractC4121k.m17223a(z10, "Pending target must be null when starting from the first frame");
                this.f27268a.mo18825x();
                this.f27275h = false;
            }
            a aVar = this.f27282o;
            if (aVar != null) {
                this.f27282o = null;
                m28371n(aVar);
                return;
            }
            this.f27274g = true;
            long uptimeMillis = SystemClock.uptimeMillis() + this.f27268a.mo18823v();
            this.f27268a.mo18821t();
            this.f27279l = new a(this.f27269b, this.f27268a.mo18826y(), uptimeMillis);
            this.f27276i.mo43a(C0012h.m107v0(m28355g())).mo7367H0(this.f27268a).m7363B0(this.f27279l);
        }
    }

    /* renamed from: o */
    private void m28358o() {
        Bitmap bitmap = this.f27280m;
        if (bitmap != null) {
            this.f27272e.mo22617c(bitmap);
            this.f27280m = null;
        }
    }

    /* renamed from: r */
    private void m28359r() {
        if (this.f27273f) {
            return;
        }
        this.f27273f = true;
        this.f27278k = false;
        m28357m();
    }

    /* renamed from: s */
    private void m28360s() {
        this.f27273f = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m28361a() {
        this.f27270c.clear();
        m28358o();
        m28360s();
        a aVar = this.f27277j;
        if (aVar != null) {
            this.f27271d.m7381f(aVar);
            this.f27277j = null;
        }
        a aVar2 = this.f27279l;
        if (aVar2 != null) {
            this.f27271d.m7381f(aVar2);
            this.f27279l = null;
        }
        a aVar3 = this.f27282o;
        if (aVar3 != null) {
            this.f27271d.m7381f(aVar3);
            this.f27282o = null;
        }
        this.f27268a.clear();
        this.f27278k = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public ByteBuffer m28362b() {
        return this.f27268a.mo18819r().asReadOnlyBuffer();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public Bitmap m28363c() {
        a aVar = this.f27277j;
        if (aVar != null) {
            return aVar.m28376a();
        }
        return this.f27280m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public int m28364d() {
        a aVar = this.f27277j;
        if (aVar != null) {
            return aVar.f27287e;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public Bitmap m28365e() {
        return this.f27280m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public int m28366f() {
        return this.f27268a.mo18822u();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public int m28367h() {
        return this.f27285r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public int m28368i() {
        return this.f27268a.mo18818A();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public int m28369k() {
        return this.f27268a.mo18827z() + this.f27283p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public int m28370l() {
        return this.f27284q;
    }

    /* renamed from: n */
    void m28371n(a aVar) {
        this.f27274g = false;
        if (this.f27278k) {
            this.f27269b.obtainMessage(2, aVar).sendToTarget();
            return;
        }
        if (!this.f27273f) {
            if (this.f27275h) {
                this.f27269b.obtainMessage(2, aVar).sendToTarget();
                return;
            } else {
                this.f27282o = aVar;
                return;
            }
        }
        if (aVar.m28376a() != null) {
            m28358o();
            a aVar2 = this.f27277j;
            this.f27277j = aVar;
            for (int size = this.f27270c.size() - 1; size >= 0; size--) {
                ((b) this.f27270c.get(size)).mo28344a();
            }
            if (aVar2 != null) {
                this.f27269b.obtainMessage(2, aVar2).sendToTarget();
            }
        }
        m28357m();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public void m28372p(InterfaceC4981l interfaceC4981l, Bitmap bitmap) {
        this.f27281n = (InterfaceC4981l) AbstractC4121k.m17226d(interfaceC4981l);
        this.f27280m = (Bitmap) AbstractC4121k.m17226d(bitmap);
        this.f27276i = this.f27276i.mo43a(new C0012h().mo67o0(interfaceC4981l));
        this.f27283p = AbstractC4122l.m17236i(bitmap);
        this.f27284q = bitmap.getWidth();
        this.f27285r = bitmap.getHeight();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public void m28373q() {
        AbstractC4121k.m17223a(!this.f27273f, "Can't restart a running animation");
        this.f27275h = true;
        a aVar = this.f27282o;
        if (aVar != null) {
            this.f27271d.m7381f(aVar);
            this.f27282o = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public void m28374t(b bVar) {
        if (!this.f27278k) {
            if (!this.f27270c.contains(bVar)) {
                boolean isEmpty = this.f27270c.isEmpty();
                this.f27270c.add(bVar);
                if (isEmpty) {
                    m28359r();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public void m28375u(b bVar) {
        this.f27270c.remove(bVar);
        if (this.f27270c.isEmpty()) {
            m28360s();
        }
    }

    C7350g(InterfaceC5571d interfaceC5571d, ComponentCallbacks2C1597l componentCallbacks2C1597l, InterfaceC4503a interfaceC4503a, Handler handler, C1596k c1596k, InterfaceC4981l interfaceC4981l, Bitmap bitmap) {
        this.f27270c = new ArrayList();
        this.f27271d = componentCallbacks2C1597l;
        handler = handler == null ? new Handler(Looper.getMainLooper(), new c()) : handler;
        this.f27272e = interfaceC5571d;
        this.f27269b = handler;
        this.f27276i = c1596k;
        this.f27268a = interfaceC4503a;
        m28372p(interfaceC4981l, bitmap);
    }
}
