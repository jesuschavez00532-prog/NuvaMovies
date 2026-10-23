package p159h8;

import ac.C0177l2;
import android.content.Context;
import androidx.fragment.app.AbstractActivityC0712e;
import be.AbstractC1314j;
import be.C1328x;
import be.InterfaceC1312h;
import cc.C1456h0;
import cc.C1473s;
import com.live.p063db.PlayBackDao;
import com.live.p063db.PlaybackPositionModel;
import com.request.bean.EpgProgram;
import com.request.result.Channel;
import com.request.result.LicenseBTVData;
import com.request.result.StartPlayBTVResult;
import com.request.result.StartPlayBTVResultData;
import com.request.result.StartPlayBTVResultLicenseList;
import com.titan.ranger.bean.Media;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import me.InterfaceC5642a;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import org.android.agoo.message.MessageService;
import p040c8.C1407f;
import p130f8.InterfaceC4282i;
import p130f8.InterfaceC4283j;
import p135fd.C4307b;
import p223l8.C5435c2;
import p301qb.InterfaceC6406m1;
import p317rb.AbstractC6567a;
import p348u2.AbstractC7029f;
import p363v2.C7197a;
import p400xa.C7597p0;
import p400xa.C7617x;
import p421z0.C7729c;
import p430z9.AbstractC7765c;

/* renamed from: h8.j3 */
/* loaded from: classes2.dex */
public final class C4623j3 implements InterfaceC4282i, InterfaceC6406m1 {

    /* renamed from: a */
    private AbstractC7765c f19843a;

    /* renamed from: b */
    private InterfaceC4283j f19844b;

    /* renamed from: c */
    private final String f19845c;

    /* renamed from: d */
    private Disposable f19846d;

    /* renamed from: e */
    private C0177l2 f19847e;

    /* renamed from: f */
    private final InterfaceC1312h f19848f;

    /* renamed from: h8.j3$a */
    /* loaded from: classes2.dex */
    static final class a extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final a f19849a = new a();

        a() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PlayBackDao invoke() {
            return new PlayBackDao();
        }
    }

    /* renamed from: h8.j3$b */
    /* loaded from: classes2.dex */
    static final class b extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        final /* synthetic */ InterfaceC5660l f19850a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC5660l interfaceC5660l) {
            super(1);
            this.f19850a = interfaceC5660l;
        }

        /* renamed from: a */
        public final void m19296a(Integer num) {
            InterfaceC5660l interfaceC5660l = this.f19850a;
            AbstractC5868k.m23673e(num, "it");
            interfaceC5660l.mo542f(num);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m19296a((Integer) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: h8.j3$c */
    /* loaded from: classes2.dex */
    static final class c extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final c f19851a = new c();

        c() {
            super(1);
        }

        /* renamed from: a */
        public final void m19297a(Throwable th) {
            th.printStackTrace();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m19297a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: h8.j3$d */
    /* loaded from: classes2.dex */
    static final class d extends AbstractC5869l implements InterfaceC5660l {
        d() {
            super(1);
        }

        /* renamed from: a */
        public final void m19298a(Integer num) {
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m19298a((Integer) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: h8.j3$e */
    /* loaded from: classes2.dex */
    static final class e extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final e f19853a = new e();

        e() {
            super(1);
        }

        /* renamed from: a */
        public final void m19299a(Throwable th) {
            th.printStackTrace();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m19299a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h8.j3$f */
    /* loaded from: classes2.dex */
    public static final class f extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final f f19854a = new f();

        f() {
            super(1);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo542f(Long l10) {
            AbstractC5868k.m23674f(l10, "it");
            return Boolean.valueOf(C1456h0.f5574a.m6779o());
        }
    }

    /* renamed from: h8.j3$g */
    /* loaded from: classes2.dex */
    public static final class g implements Observer {
        g() {
        }

        /* renamed from: a */
        public void m19301a(long j10) {
            Disposable disposable = C4623j3.this.f19846d;
            if (disposable != null) {
                disposable.dispose();
            }
            C4623j3.this.m19294W3();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            C1473s.f5656a.m6918b(32600);
            C1456h0.f5574a.m6781q(true);
            C4623j3.this.m19294W3();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            AbstractC5868k.m23674f(th, "e");
        }

        @Override // io.reactivex.Observer
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            m19301a(((Number) obj).longValue());
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            AbstractC5868k.m23674f(disposable, "d");
            C4623j3.this.f19846d = disposable;
        }
    }

    public C4623j3(AbstractC7765c abstractC7765c, InterfaceC4283j interfaceC4283j) {
        InterfaceC1312h m5965b;
        AbstractC5868k.m23674f(abstractC7765c, "fragment");
        AbstractC5868k.m23674f(interfaceC4283j, "view");
        this.f19843a = abstractC7765c;
        this.f19844b = interfaceC4283j;
        this.f19845c = C4623j3.class.getSimpleName();
        m5965b = AbstractC1314j.m5965b(a.f19849a);
        this.f19848f = m5965b;
    }

    /* renamed from: Y3 */
    private final void m19280Y3() {
        Disposable disposable;
        Disposable disposable2 = this.f19846d;
        boolean z10 = false;
        if (disposable2 != null && !disposable2.isDisposed()) {
            z10 = true;
        }
        if (z10 && (disposable = this.f19846d) != null) {
            disposable.dispose();
        }
    }

    /* renamed from: b4 */
    private final PlayBackDao m19281b4() {
        return (PlayBackDao) this.f19848f.getValue();
    }

    /* renamed from: c4 */
    private final List m19282c4(StartPlayBTVResult startPlayBTVResult, List list) {
        boolean z10 = false;
        ArrayList arrayList = new ArrayList();
        StartPlayBTVResultData data = startPlayBTVResult.getData();
        AbstractC5868k.m23671c(data);
        List<StartPlayBTVResultLicenseList> totalPlayUrlList = data.getTotalPlayUrlList();
        AbstractC5868k.m23671c(totalPlayUrlList);
        Iterator<StartPlayBTVResultLicenseList> it = totalPlayUrlList.iterator();
        while (it.hasNext()) {
            List<LicenseBTVData> licenseList = it.next().getLicenseList();
            if (licenseList != null && !licenseList.isEmpty()) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10) {
                for (LicenseBTVData licenseBTVData : licenseList) {
                    if (!AbstractC6567a.m25634d(licenseBTVData.getLicense())) {
                        String m29234b = C7597p0.f27965b.m29236a().m29234b(licenseBTVData.getLicense(), "media_code");
                        if (list.contains(licenseBTVData.getTag())) {
                            arrayList.add(new Media(m29234b, licenseBTVData.getLicense(), "", "", "", ""));
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d4 */
    public static final void m19283d4(C4623j3 c4623j3, String str, ObservableEmitter observableEmitter) {
        AbstractC5868k.m23674f(c4623j3, "this$0");
        AbstractC5868k.m23674f(observableEmitter, "it");
        PlaybackPositionModel query = c4623j3.m19281b4().query(str);
        if (query != null && Integer.parseInt(query.getPosition()) > 0) {
            observableEmitter.onNext(Integer.valueOf(Integer.parseInt(query.getPosition())));
        } else {
            observableEmitter.onNext(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e4 */
    public static final void m19284e4(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g4 */
    public static final void m19285g4(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h4 */
    public static final void m19286h4(C4623j3 c4623j3, String str, int i10, ObservableEmitter observableEmitter) {
        AbstractC5868k.m23674f(c4623j3, "this$0");
        AbstractC5868k.m23674f(str, "$contentId");
        AbstractC5868k.m23674f(observableEmitter, "it");
        c4623j3.m19281b4().insert(new PlaybackPositionModel(str, String.valueOf(i10)));
        observableEmitter.onNext(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k4 */
    public static final void m19287k4(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q4 */
    public static final void m19288q4(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* renamed from: r4 */
    private final void m19289r4() {
        AbstractActivityC0712e m3075C6 = this.f19843a.m3075C6();
        boolean z10 = false;
        if (m3075C6 != null && !m3075C6.isFinishing()) {
            z10 = true;
        }
        if (z10) {
            int m6917a = C1473s.f5656a.m6917a();
            if (m6917a == 0) {
                m6917a = 20900;
            }
            this.f19844b.mo17929z(5);
            C7617x c7617x = C7617x.f28030a;
            Context m3107M8 = this.f19843a.m3107M8();
            AbstractC5868k.m23673e(m3107M8, "fragment.requireContext()");
            C7729c.f28423a.m29853g("", "", C7197a.f26917a.m27847d(), "match", "", c7617x.m29330d(m3107M8, 5), String.valueOf(m6917a), "/getSlbInfo");
        }
    }

    /* renamed from: s4 */
    private final void m19290s4(String str, int i10, String str2) {
        if (this.f19847e == null) {
            this.f19847e = new C0177l2(this);
        }
        C0177l2 c0177l2 = this.f19847e;
        if (c0177l2 != null) {
            c0177l2.m646b(MessageService.MSG_DB_READY_REPORT, i10, str, str2);
        }
    }

    /* renamed from: u4 */
    private final void m19291u4() {
        m19280Y3();
        Observable<Long> intervalRange = Observable.intervalRange(0L, 45L, 0L, 2L, TimeUnit.SECONDS);
        final f fVar = f.f19854a;
        Observable<Long> filter = intervalRange.filter(new Predicate() { // from class: h8.f3
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                boolean m19292v4;
                m19292v4 = C4623j3.m19292v4(InterfaceC5660l.this, obj);
                return m19292v4;
            }
        });
        AbstractC5868k.m23673e(filter, "intervalRange(0, 45, 0, …bFinish\n                }");
        AbstractC6567a.m25631a(filter, this.f19843a.m19902N3()).compose(AbstractC7029f.m27120a()).subscribe(new g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v4 */
    public static final boolean m19292v4(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return ((Boolean) interfaceC5660l.mo542f(obj)).booleanValue();
    }

    /* renamed from: w4 */
    private final void m19293w4() {
        boolean z10 = false;
        this.f19844b.mo17927Q();
        Channel m21860a = C5435c2.f22079P0.m21860a();
        int m6523o = C1407f.f5458a.m6523o();
        EpgProgram mo17926I4 = this.f19844b.mo17926I4();
        if (mo17926I4 != null) {
            String contentId = mo17926I4.getContentId();
            if (contentId != null && contentId.length() != 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10 && m6523o != -1 && m21860a != null) {
                String channelCode = m21860a.getChannelCode();
                String contentId2 = mo17926I4.getContentId();
                AbstractC5868k.m23671c(contentId2);
                m19290s4(channelCode, m6523o, contentId2);
            }
        }
    }

    @Override // p130f8.InterfaceC4282i
    /* renamed from: B */
    public void mo17922B() {
        if (C1456h0.f5574a.m6779o()) {
            m19294W3();
        } else {
            m19291u4();
        }
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: B0 */
    public void mo6701B0() {
    }

    @Override // p301qb.InterfaceC6433v1
    /* renamed from: N3 */
    public C4307b mo523N3() {
        return this.f19843a.m19902N3();
    }

    @Override // p301qb.InterfaceC6406m1
    /* renamed from: R2 */
    public void mo19226R2(String str) {
        AbstractC5868k.m23674f(str, "errCode");
        InterfaceC4283j.a.m17930a(this.f19844b, str, false, 2, null);
    }

    /* renamed from: W3 */
    public final void m19294W3() {
        if (C1456h0.f5574a.m6778n(C1456h0.a.RECORD)) {
            m19293w4();
        } else {
            m19289r4();
        }
    }

    @Override // p301qb.InterfaceC6406m1
    /* renamed from: f5 */
    public void mo19230f5(StartPlayBTVResult startPlayBTVResult) {
        boolean z10 = false;
        List<StartPlayBTVResultLicenseList> totalPlayUrlList;
        AbstractC5868k.m23674f(startPlayBTVResult, "result");
        StartPlayBTVResultData data = startPlayBTVResult.getData();
        boolean z11 = true;
        if (data != null && (totalPlayUrlList = data.getTotalPlayUrlList()) != null) {
            z10 = totalPlayUrlList.isEmpty();
        } else {
            z10 = true;
        }
        if (z10) {
            InterfaceC4283j.a.m17930a(this.f19844b, "portal100041", false, 2, null);
            return;
        }
        List m6774j = C1456h0.f5574a.m6774j(C1456h0.a.RECORD);
        if (m6774j != null && !m6774j.isEmpty()) {
            z11 = false;
        }
        if (z11) {
            InterfaceC4283j.a.m17930a(this.f19844b, "20900", false, 2, null);
            return;
        }
        List m19282c4 = m19282c4(startPlayBTVResult, m6774j);
        if (m19282c4.size() == 0) {
            InterfaceC4283j.a.m17930a(this.f19844b, "20900", false, 2, null);
        } else {
            this.f19844b.mo17928k3(m19282c4);
        }
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: n2 */
    public void mo6702n2() {
    }

    @Override // p130f8.InterfaceC4282i
    /* renamed from: o */
    public void mo17923o(final String str, final int i10) {
        AbstractC5868k.m23674f(str, "contentId");
        Observable compose = Observable.create(new ObservableOnSubscribe() { // from class: h8.c3
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                C4623j3.m19286h4(C4623j3.this, str, i10, observableEmitter);
            }
        }).compose(AbstractC7029f.m27121b());
        final d dVar = new d();
        Consumer consumer = new Consumer() { // from class: h8.d3
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4623j3.m19287k4(InterfaceC5660l.this, obj);
            }
        };
        final e eVar = e.f19853a;
        compose.subscribe(consumer, new Consumer() { // from class: h8.e3
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4623j3.m19288q4(InterfaceC5660l.this, obj);
            }
        });
    }

    @Override // p130f8.InterfaceC4282i
    /* renamed from: x */
    public void mo17924x(final String str, InterfaceC5660l interfaceC5660l) {
        AbstractC5868k.m23674f(interfaceC5660l, "callback");
        Observable compose = Observable.create(new ObservableOnSubscribe() { // from class: h8.g3
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                C4623j3.m19283d4(C4623j3.this, str, observableEmitter);
            }
        }).compose(AbstractC7029f.m27121b());
        final b bVar = new b(interfaceC5660l);
        Consumer consumer = new Consumer() { // from class: h8.h3
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4623j3.m19284e4(InterfaceC5660l.this, obj);
            }
        };
        final c cVar = c.f19851a;
        compose.subscribe(consumer, new Consumer() { // from class: h8.i3
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4623j3.m19285g4(InterfaceC5660l.this, obj);
            }
        });
    }
}
