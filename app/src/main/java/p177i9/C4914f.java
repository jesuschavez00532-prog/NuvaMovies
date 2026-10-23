package p177i9;

import ac.C0154g;
import ac.C0215v0;
import ac.C0218w0;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import be.C1328x;
import cc.C1466m0;
import com.mine.R$mipmap;
import com.request.result.BaseResult;
import com.request.result.GetQrResult;
import com.request.result.GetQrTokenResult;
import com.taobao.accs.common.Constants;
import com.titans.entity.CdnType;
import gd.EnumC4431a;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p135fd.C4307b;
import p148g9.InterfaceC4405a;
import p148g9.InterfaceC4406b;
import p170i2.C4842a;
import p201k2.AbstractC5091h;
import p201k2.AbstractC5095l;
import p301qb.InterfaceC6389h;
import p301qb.InterfaceC6408n0;
import p301qb.InterfaceC6411o0;
import p348u2.AbstractC7029f;
import p430z9.AbstractActivityC7763a;
import p433zd.AbstractC7786b;

/* renamed from: i9.f */
/* loaded from: classes2.dex */
public final class C4914f implements InterfaceC4405a, InterfaceC6411o0, InterfaceC6389h, InterfaceC6408n0 {

    /* renamed from: a */
    private AbstractActivityC7763a f20435a;

    /* renamed from: b */
    private InterfaceC4406b f20436b;

    /* renamed from: c */
    private final String f20437c;

    /* renamed from: d */
    private C0218w0 f20438d;

    /* renamed from: e */
    private C0154g f20439e;

    /* renamed from: f */
    private C0215v0 f20440f;

    /* renamed from: g */
    private Disposable f20441g;

    /* renamed from: h */
    private String f20442h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i9.f$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC5869l implements InterfaceC5660l {
        a() {
            super(1);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bitmap mo542f(String str) {
            AbstractC5868k.m23674f(str, "it");
            return AbstractC5095l.m20688b(str, AbstractC7786b.m30166j(240), BitmapFactory.decodeResource(C4914f.this.m20191c4().getResources(), R$mipmap.icon_logo_qrcode));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i9.f$b */
    /* loaded from: classes2.dex */
    public static final class b extends AbstractC5869l implements InterfaceC5660l {
        b() {
            super(1);
        }

        /* renamed from: a */
        public final void m20200a(Bitmap bitmap) {
            C4914f.this.m20193h4().mo11913f(bitmap);
            C4914f c4914f = C4914f.this;
            c4914f.m20192d4(c4914f.f20442h);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m20200a((Bitmap) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i9.f$c */
    /* loaded from: classes2.dex */
    public static final class c extends AbstractC5869l implements InterfaceC5660l {
        c() {
            super(1);
        }

        /* renamed from: a */
        public final void m20201a(Throwable th) {
            th.printStackTrace();
            C4914f.this.m20193h4().mo11913f(null);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m20201a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i9.f$d */
    /* loaded from: classes2.dex */
    public static final class d extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: b */
        final /* synthetic */ String f20447b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str) {
            super(1);
            this.f20447b = str;
        }

        /* renamed from: a */
        public final void m20202a(Long l10) {
            C0215v0.m747c(C4914f.this.f20440f, this.f20447b, null, 2, null);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m20202a((Long) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i9.f$e */
    /* loaded from: classes2.dex */
    public static final class e extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final e f20448a = new e();

        e() {
            super(1);
        }

        /* renamed from: a */
        public final void m20203a(Throwable th) {
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m20203a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    public C4914f(AbstractActivityC7763a abstractActivityC7763a, InterfaceC4406b interfaceC4406b) {
        AbstractC5868k.m23674f(abstractActivityC7763a, "activity");
        AbstractC5868k.m23674f(interfaceC4406b, "view");
        this.f20435a = abstractActivityC7763a;
        this.f20436b = interfaceC4406b;
        this.f20437c = C4914f.class.getSimpleName();
        this.f20442h = "";
        this.f20438d = new C0218w0(this);
        this.f20439e = new C0154g(this);
        this.f20440f = new C0215v0(this);
    }

    /* renamed from: T3 */
    private final void m20182T3(String str) {
        Observable just = Observable.just(str);
        final a aVar = new a();
        Observable compose = just.map(new Function() { // from class: i9.a
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Bitmap m20183W3;
                m20183W3 = C4914f.m20183W3(InterfaceC5660l.this, obj);
                return m20183W3;
            }
        }).compose(this.f20435a.m19900N3()).compose(AbstractC7029f.m27120a());
        final b bVar = new b();
        Consumer consumer = new Consumer() { // from class: i9.b
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4914f.m20185Y3(InterfaceC5660l.this, obj);
            }
        };
        final c cVar = new c();
        compose.subscribe(consumer, new Consumer() { // from class: i9.c
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4914f.m20186b4(InterfaceC5660l.this, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W3 */
    public static final Bitmap m20183W3(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (Bitmap) interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y3 */
    public static final void m20185Y3(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b4 */
    public static final void m20186b4(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e4 */
    public static final void m20187e4(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g4 */
    public static final void m20188g4(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: B0 */
    public void mo6701B0() {
        mo18491G(true);
    }

    @Override // p148g9.InterfaceC4405a
    /* renamed from: G */
    public void mo18491G(boolean z10) {
        if (z10) {
            this.f20436b.mo11911a();
        }
        C0218w0.m770c(this.f20438d, null, 1, null);
    }

    @Override // p301qb.InterfaceC6433v1
    /* renamed from: N3 */
    public C4307b mo523N3() {
        return this.f20435a.m19901Q4(EnumC4431a.DESTROY);
    }

    /* renamed from: Q3 */
    public void m20189Q3(String str, String str2) {
        AbstractC5868k.m23674f(str, "isAllow");
        AbstractC5868k.m23674f(str2, "qrToken");
        C0154g.m591c(this.f20439e, str, str2, null, 4, null);
    }

    @Override // p301qb.InterfaceC6411o0
    /* renamed from: b1 */
    public void mo20190b1(GetQrTokenResult getQrTokenResult) {
        AbstractC5868k.m23674f(getQrTokenResult, "getQrTokenResponse");
        this.f20436b.mo11910J();
        this.f20442h = getQrTokenResult.getData().getQrtoken();
        m20182T3(this.f20436b.mo11915m2() + "?lang=" + AbstractC5091h.m20659b() + "&qrtoken=" + this.f20442h + "&userId=" + C1466m0.f5627a.m6878m() + "&appId=" + C4842a.f20329a.m19920a().mo19960i(this.f20435a) + "&timeStamp=" + new Date().getTime());
    }

    /* renamed from: c4 */
    public final AbstractActivityC7763a m20191c4() {
        return this.f20435a;
    }

    /* renamed from: d4 */
    public void m20192d4(String str) {
        Disposable disposable;
        AbstractC5868k.m23674f(str, "qrToken");
        Disposable disposable2 = this.f20441g;
        boolean z10 = false;
        if (disposable2 != null && !disposable2.isDisposed()) {
            z10 = true;
        }
        if (z10 && (disposable = this.f20441g) != null) {
            disposable.dispose();
        }
        Observable<Long> interval = Observable.interval(0L, 2L, TimeUnit.SECONDS);
        final d dVar = new d(str);
        Consumer<? super Long> consumer = new Consumer() { // from class: i9.d
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4914f.m20187e4(InterfaceC5660l.this, obj);
            }
        };
        final e eVar = e.f20448a;
        this.f20441g = interval.subscribe(consumer, new Consumer() { // from class: i9.e
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4914f.m20188g4(InterfaceC5660l.this, obj);
            }
        });
    }

    /* renamed from: h4 */
    public final InterfaceC4406b m20193h4() {
        return this.f20436b;
    }

    @Override // p301qb.InterfaceC6408n0
    /* renamed from: j5 */
    public void mo20194j5(GetQrResult getQrResult) {
        String str = null;
        boolean z10 = false;
        Disposable disposable;
        AbstractC5868k.m23674f(getQrResult, "qrResultResponse");
        String status = getQrResult.getData().getStatus();
        switch (status.hashCode()) {
            case 49:
                status.equals("1");
                return;
            case 50:
                if (status.equals("2")) {
                    m20189Q3("1", this.f20442h);
                    return;
                }
                return;
            case 51:
                str = "3";
                break;
            case 52:
                str = "4";
                break;
            case 53:
                if (status.equals(CdnType.DIGITAL_TYPE_PCDN)) {
                    Disposable disposable2 = this.f20441g;
                    if (disposable2 != null && !disposable2.isDisposed()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10 && (disposable = this.f20441g) != null) {
                        disposable.dispose();
                    }
                    InterfaceC4405a.a.m18492a(this, false, 1, null);
                    return;
                }
                return;
            default:
                return;
        }
        status.equals(str);
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: n2 */
    public void mo6702n2() {
        Disposable disposable;
        Disposable disposable2 = this.f20441g;
        boolean z10 = false;
        if (disposable2 != null && !disposable2.isDisposed()) {
            z10 = true;
        }
        if (z10 && (disposable = this.f20441g) != null) {
            disposable.dispose();
        }
    }

    @Override // p301qb.InterfaceC6389h
    /* renamed from: p1 */
    public void mo20195p1(String str) {
        AbstractC5868k.m23674f(str, Constants.KEY_ERROR_CODE);
    }

    @Override // p301qb.InterfaceC6411o0
    /* renamed from: s0 */
    public void mo20196s0(String str) {
        AbstractC5868k.m23674f(str, Constants.KEY_ERROR_CODE);
        this.f20436b.mo11910J();
        this.f20436b.mo11916s0(str);
    }

    @Override // p301qb.InterfaceC6408n0
    /* renamed from: t1 */
    public void mo20197t1(String str) {
        Disposable disposable;
        AbstractC5868k.m23674f(str, Constants.KEY_ERROR_CODE);
        Disposable disposable2 = this.f20441g;
        boolean z10 = false;
        if (disposable2 != null && !disposable2.isDisposed()) {
            z10 = true;
        }
        if (z10 && (disposable = this.f20441g) != null) {
            disposable.dispose();
        }
        this.f20436b.mo11916s0(str);
    }

    @Override // p301qb.InterfaceC6389h
    /* renamed from: y5 */
    public void mo20198y5(BaseResult baseResult) {
        AbstractC5868k.m23674f(baseResult, "result");
    }
}
