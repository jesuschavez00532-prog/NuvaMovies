package ac;

import be.C1328x;
import com.request.result.PersonResult;
import com.request.result.PersonWorksResult;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p030bc.C1224f;
import p301qb.InterfaceC6382e1;
import p317rb.AbstractC6567a;
import p317rb.AbstractC6570d;
import p343tb.AbstractC6929a;

/* renamed from: ac.v1 */
/* loaded from: classes2.dex */
public final class C0216v1 extends AbstractC0166j {

    /* renamed from: b */
    private Disposable f585b;

    /* renamed from: c */
    private Disposable f586c;

    /* renamed from: ac.v1$a */
    /* loaded from: classes2.dex */
    static final class a extends AbstractC5869l implements InterfaceC5660l {
        a() {
            super(1);
        }

        /* renamed from: a */
        public final void m764a(Disposable disposable) {
            C0216v1.this.f586c = disposable;
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m764a((Disposable) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: ac.v1$b */
    /* loaded from: classes2.dex */
    public static final class b extends AbstractC6929a {

        /* renamed from: c */
        final /* synthetic */ String f589c;

        b(String str) {
            this.f589c = str;
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onNext(PersonWorksResult personWorksResult) {
            AbstractC5868k.m23674f(personWorksResult, "t");
            super.onNext(personWorksResult);
            ((InterfaceC6382e1) C0216v1.this.m618a()).mo24907f4(this.f589c, personWorksResult.getData());
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        public void onError(Throwable th) {
            AbstractC5868k.m23674f(th, "e");
            super.onError(th);
            ((InterfaceC6382e1) C0216v1.this.m618a()).mo24905T5(this.f589c, AbstractC6570d.m25644a(th, "eb2", "500", "500"));
        }
    }

    /* renamed from: ac.v1$c */
    /* loaded from: classes2.dex */
    static final class c extends AbstractC5869l implements InterfaceC5660l {
        c() {
            super(1);
        }

        /* renamed from: a */
        public final void m766a(Disposable disposable) {
            C0216v1.this.f585b = disposable;
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m766a((Disposable) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: ac.v1$d */
    /* loaded from: classes2.dex */
    public static final class d extends AbstractC6929a {
        d() {
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onNext(PersonResult personResult) {
            AbstractC5868k.m23674f(personResult, "t");
            super.onNext(personResult);
            ((InterfaceC6382e1) C0216v1.this.m618a()).mo24908u5(personResult.getData());
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        public void onError(Throwable th) {
            AbstractC5868k.m23674f(th, "e");
            super.onError(th);
            ((InterfaceC6382e1) C0216v1.this.m618a()).mo24906c1(AbstractC6570d.m25644a(th, "eb2", "500", "500"));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0216v1(InterfaceC6382e1 interfaceC6382e1) {
        super(interfaceC6382e1);
        AbstractC5868k.m23674f(interfaceC6382e1, "view");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static final void m756k(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static final void m757l(C0216v1 c0216v1) {
        AbstractC5868k.m23674f(c0216v1, "this$0");
        c0216v1.f586c = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public static final void m758n(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public static final void m759o(C0216v1 c0216v1) {
        AbstractC5868k.m23674f(c0216v1, "this$0");
        c0216v1.f585b = null;
    }

    /* renamed from: h */
    public final void m760h() {
        Disposable disposable = this.f585b;
        if (disposable != null) {
            AbstractC6567a.m25632b(disposable);
        }
        this.f585b = null;
    }

    /* renamed from: i */
    public final void m761i() {
        Disposable disposable = this.f586c;
        if (disposable != null) {
            AbstractC6567a.m25632b(disposable);
        }
        this.f586c = null;
    }

    /* renamed from: j */
    public final void m762j(String str, String str2, int i10, int i11) {
        AbstractC5868k.m23674f(str, "puId");
        AbstractC5868k.m23674f(str2, "type");
        Observable m25631a = AbstractC6567a.m25631a(C1224f.f4816e.m5631a().m5561J(str, str2, i10, i11), ((InterfaceC6382e1) m618a()).mo523N3());
        final a aVar = new a();
        m25631a.doOnSubscribe(new Consumer() { // from class: ac.t1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C0216v1.m756k(InterfaceC5660l.this, obj);
            }
        }).doFinally(new Action() { // from class: ac.u1
            @Override // io.reactivex.functions.Action
            public final void run() {
                C0216v1.m757l(C0216v1.this);
            }
        }).subscribe(new b(str2));
    }

    /* renamed from: m */
    public final void m763m(String str, String str2, String str3) {
        AbstractC5868k.m23674f(str, "contentId");
        AbstractC5868k.m23674f(str2, "imdb");
        AbstractC5868k.m23674f(str3, "type");
        Observable m25631a = AbstractC6567a.m25631a(C1224f.f4816e.m5631a().m5574W(str, str2, str3), ((InterfaceC6382e1) m618a()).mo523N3());
        final c cVar = new c();
        m25631a.doOnSubscribe(new Consumer() { // from class: ac.r1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C0216v1.m758n(InterfaceC5660l.this, obj);
            }
        }).doFinally(new Action() { // from class: ac.s1
            @Override // io.reactivex.functions.Action
            public final void run() {
                C0216v1.m759o(C0216v1.this);
            }
        }).subscribe(new d());
    }
}
