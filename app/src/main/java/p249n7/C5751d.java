package p249n7;

import android.graphics.drawable.Drawable;
import be.C1328x;
import ca.InterfaceC1439a;
import com.google.android.youtube.tv.R;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import java.util.concurrent.Callable;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p236m7.InterfaceC5604a;
import p348u2.AbstractC7026c;
import p348u2.AbstractC7029f;
import p430z9.AbstractActivityC7763a;

/* renamed from: n7.d */
/* loaded from: classes2.dex */
public final class C5751d implements InterfaceC1439a {

    /* renamed from: a */
    private AbstractActivityC7763a f23057a;

    /* renamed from: b */
    private InterfaceC5604a f23058b;

    /* renamed from: c */
    private boolean f23059c;

    /* renamed from: n7.d$a */
    /* loaded from: classes2.dex */
    static final class a extends AbstractC5869l implements InterfaceC5660l {
        a() {
            super(1);
        }

        /* renamed from: a */
        public final void m23170a(Drawable drawable) {
            C5751d.this.m23168i().mo11360n2();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m23170a((Drawable) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: n7.d$b */
    /* loaded from: classes2.dex */
    static final class b extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final b f23061a = new b();

        b() {
            super(1);
        }

        /* renamed from: a */
        public final void m23171a(Throwable th) {
            th.printStackTrace();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m23171a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    public C5751d(AbstractActivityC7763a abstractActivityC7763a, InterfaceC5604a interfaceC5604a) {
        AbstractC5868k.m23674f(abstractActivityC7763a, "activity");
        AbstractC5868k.m23674f(interfaceC5604a, "view");
        this.f23057a = abstractActivityC7763a;
        this.f23058b = interfaceC5604a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static final Drawable m23165l(C5751d c5751d) {
        AbstractC5868k.m23674f(c5751d, "this$0");
        return AbstractC7026c.m27112b(c5751d.f23057a, R.color.color_0b0b0b, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public static final void m23166n(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public static final void m23167p(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: B0 */
    public void mo6701B0() {
    }

    /* renamed from: i */
    public final InterfaceC5604a m23168i() {
        return this.f23058b;
    }

    /* renamed from: k */
    public void m23169k() {
        if (this.f23059c) {
            return;
        }
        this.f23059c = true;
        Observable compose = Observable.fromCallable(new Callable() { // from class: n7.a
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Drawable m23165l;
                m23165l = C5751d.m23165l(C5751d.this);
                return m23165l;
            }
        }).compose(AbstractC7029f.m27121b());
        final a aVar = new a();
        Consumer consumer = new Consumer() { // from class: n7.b
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C5751d.m23166n(InterfaceC5660l.this, obj);
            }
        };
        final b bVar = b.f23061a;
        compose.subscribe(consumer, new Consumer() { // from class: n7.c
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C5751d.m23167p(InterfaceC5660l.this, obj);
            }
        });
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: n2 */
    public void mo6702n2() {
    }
}
