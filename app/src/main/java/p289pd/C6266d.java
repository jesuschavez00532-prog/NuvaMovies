package p289pd;

import ac.C0216v1;
import be.AbstractC1314j;
import be.C1328x;
import be.InterfaceC1312h;
import com.request.result.PersonData;
import com.request.result.PersonDetailInfo;
import com.request.result.PersonWorksData;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import me.InterfaceC5642a;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p135fd.C4307b;
import p253nd.InterfaceC5841a;
import p253nd.InterfaceC5842b;
import p301qb.InterfaceC6382e1;
import p317rb.AbstractC6567a;
import p348u2.AbstractC7029f;
import p430z9.AbstractActivityC7763a;

/* renamed from: pd.d */
/* loaded from: classes3.dex */
public final class C6266d implements InterfaceC5841a, InterfaceC6382e1 {

    /* renamed from: a */
    private AbstractActivityC7763a f24504a;

    /* renamed from: b */
    private InterfaceC5842b f24505b;

    /* renamed from: c */
    private final String f24506c;

    /* renamed from: d */
    private final InterfaceC1312h f24507d;

    /* renamed from: pd.d$a */
    /* loaded from: classes3.dex */
    static final class a extends AbstractC5869l implements InterfaceC5660l {
        a() {
            super(1);
        }

        /* renamed from: a */
        public final void m24909a(ArrayList arrayList) {
            if (arrayList.size() == 0) {
                C6266d.this.m24904Q3().mo16125H0();
                return;
            }
            InterfaceC5842b m24904Q3 = C6266d.this.m24904Q3();
            AbstractC5868k.m23673e(arrayList, "it");
            m24904Q3.mo16132M1(arrayList);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m24909a((ArrayList) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: pd.d$b */
    /* loaded from: classes3.dex */
    static final class b extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final b f24509a = new b();

        b() {
            super(1);
        }

        /* renamed from: a */
        public final void m24910a(Throwable th) {
            th.printStackTrace();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m24910a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: pd.d$c */
    /* loaded from: classes3.dex */
    static final class c extends AbstractC5869l implements InterfaceC5642a {
        c() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0216v1 invoke() {
            return new C0216v1(C6266d.this);
        }
    }

    public C6266d(AbstractActivityC7763a abstractActivityC7763a, InterfaceC5842b interfaceC5842b) {
        InterfaceC1312h m5965b;
        AbstractC5868k.m23674f(abstractActivityC7763a, "activity");
        AbstractC5868k.m23674f(interfaceC5842b, "view");
        this.f24504a = abstractActivityC7763a;
        this.f24505b = interfaceC5842b;
        this.f24506c = C6266d.class.getSimpleName();
        m5965b = AbstractC1314j.m5965b(new c());
        this.f24507d = m5965b;
    }

    /* renamed from: G3 */
    private final C0216v1 m24899G3() {
        return (C0216v1) this.f24507d.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J3 */
    public static final ArrayList m24900J3(PersonData personData) {
        List<PersonDetailInfo> actorDisplayList;
        List<PersonDetailInfo> directorList;
        ArrayList arrayList = new ArrayList();
        if (personData != null && (directorList = personData.getDirectorList()) != null) {
            for (PersonDetailInfo personDetailInfo : directorList) {
                personDetailInfo.setPersonType(0);
                arrayList.add(personDetailInfo);
            }
        }
        if (personData != null && (actorDisplayList = personData.getActorDisplayList()) != null) {
            for (PersonDetailInfo personDetailInfo2 : actorDisplayList) {
                personDetailInfo2.setPersonType(1);
                arrayList.add(personDetailInfo2);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O3 */
    public static final void m24901O3(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P3 */
    public static final void m24902P3(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: B0 */
    public void mo6701B0() {
    }

    @Override // p301qb.InterfaceC6433v1
    /* renamed from: N3 */
    public C4307b mo523N3() {
        return this.f24504a.m19900N3();
    }

    /* renamed from: Q3 */
    public final InterfaceC5842b m24904Q3() {
        return this.f24505b;
    }

    @Override // p253nd.InterfaceC5841a
    /* renamed from: S1 */
    public void mo23636S1(String str, String str2, int i10, int i11) {
        AbstractC5868k.m23674f(str, "puId");
        AbstractC5868k.m23674f(str2, "type");
        this.f24505b.mo16139c();
        m24899G3().m762j(str, str2, i10, i11);
    }

    @Override // p301qb.InterfaceC6382e1
    /* renamed from: T5 */
    public void mo24905T5(String str, String str2) {
        AbstractC5868k.m23674f(str, "type");
        AbstractC5868k.m23674f(str2, "errCode");
        if (!AbstractC5868k.m23669a(str, this.f24505b.mo16131L1())) {
            return;
        }
        this.f24505b.mo16140d();
        this.f24505b.mo16144q0(str, str2);
    }

    @Override // p301qb.InterfaceC6382e1
    /* renamed from: c1 */
    public void mo24906c1(String str) {
        AbstractC5868k.m23674f(str, "errCode");
        this.f24505b.mo16140d();
        this.f24505b.mo16143i2(str);
    }

    @Override // p301qb.InterfaceC6382e1
    /* renamed from: f4 */
    public void mo24907f4(String str, PersonWorksData personWorksData) {
        AbstractC5868k.m23674f(str, "type");
        if (!AbstractC5868k.m23669a(str, this.f24505b.mo16131L1())) {
            return;
        }
        this.f24505b.mo16140d();
        if (personWorksData != null) {
            this.f24505b.mo16128J2(str, personWorksData);
        }
    }

    @Override // p253nd.InterfaceC5841a
    /* renamed from: g */
    public void mo23637g(String str, String str2, String str3) {
        AbstractC5868k.m23674f(str, "contentId");
        AbstractC5868k.m23674f(str2, "imdb");
        AbstractC5868k.m23674f(str3, "type");
        this.f24505b.mo16139c();
        m24899G3().m763m(str, str2, str3);
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: n2 */
    public void mo6702n2() {
        m24899G3().m760h();
        m24899G3().m761i();
    }

    @Override // p301qb.InterfaceC6382e1
    /* renamed from: u5 */
    public void mo24908u5(final PersonData personData) {
        this.f24505b.mo16140d();
        Observable compose = Observable.fromCallable(new Callable() { // from class: pd.a
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ArrayList m24900J3;
                m24900J3 = C6266d.m24900J3(PersonData.this);
                return m24900J3;
            }
        }).compose(AbstractC7029f.m27121b());
        AbstractC5868k.m23673e(compose, "fromCallable {\n         …chedulerHelper.io2main())");
        Observable m25631a = AbstractC6567a.m25631a(compose, this.f24504a.m19900N3());
        final a aVar = new a();
        Consumer consumer = new Consumer() { // from class: pd.b
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C6266d.m24901O3(InterfaceC5660l.this, obj);
            }
        };
        final b bVar = b.f24509a;
        m25631a.subscribe(consumer, new Consumer() { // from class: pd.c
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C6266d.m24902P3(InterfaceC5660l.this, obj);
            }
        });
    }
}
