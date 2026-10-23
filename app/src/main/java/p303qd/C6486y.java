package p303qd;

import ac.C0224y0;
import android.content.Intent;
import android.os.Handler;
import android.text.TextUtils;
import androidx.fragment.app.AbstractC0729o;
import be.AbstractC1314j;
import be.C1328x;
import be.InterfaceC1312h;
import cc.C1466m0;
import com.module.event.RecommendGetSucEvent;
import com.request.result.ActiveResult;
import com.request.result.ChildColumn;
import com.request.result.ContentList;
import com.request.result.GetRecommendsResult;
import com.request.result.LoginResult;
import com.request.result.PosterList;
import com.taobao.accs.common.Constants;
import com.titans.entity.CdnType;
import com.vod.R$string;
import com.vod.p089ui.activity.KidsCategoryActivity;
import com.vod.p089ui.activity.TopicActivity;
import com.vod.p089ui.activity.TopicMoreActivity;
import com.vod.p089ui.activity.VodCategoryActivity;
import com.vod.p089ui.activity.VodDetailsActivity;
import com.vod.view.PosterView;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.List;
import mc.C5634i;
import me.InterfaceC5642a;
import me.InterfaceC5660l;
import ne.AbstractC5864g;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import org.android.agoo.message.MessageService;
import p101da.ViewOnClickListenerC4018d;
import p101da.ViewOnClickListenerC4019e;
import p117ea.AbstractC4161e;
import p117ea.C4160d;
import p135fd.C4307b;
import p193ja.C5044a;
import p225ld.C5548b;
import p268od.InterfaceC5967c;
import p268od.InterfaceC5968d;
import p277p0.C6160q;
import p301qb.InterfaceC6417q0;
import p302qc.C6448c;
import p303qd.C6486y;
import p317rb.AbstractC6567a;
import p348u2.AbstractC7029f;
import p359ue.AbstractC7167u;
import p400xa.AbstractC7555b0;
import p400xa.C7589m1;
import p400xa.C7594o0;
import p400xa.C7619y;
import p430z9.AbstractActivityC7763a;
import ye.C7709c;
import za.C7776f;

/* renamed from: qd.y */
/* loaded from: classes3.dex */
public final class C6486y implements InterfaceC5967c, InterfaceC6417q0 {

    /* renamed from: g */
    public static final a f24913g = new a(null);

    /* renamed from: h */
    private static int f24914h = 2;

    /* renamed from: a */
    private AbstractActivityC7763a f24915a;

    /* renamed from: b */
    private InterfaceC5968d f24916b;

    /* renamed from: c */
    private final Handler f24917c;

    /* renamed from: d */
    private ArrayList f24918d;

    /* renamed from: e */
    private final InterfaceC1312h f24919e;

    /* renamed from: f */
    private final d f24920f;

    /* renamed from: qd.y$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC5864g abstractC5864g) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: qd.y$b */
    /* loaded from: classes3.dex */
    public static final class b extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final b f24921a = new b();

        b() {
            super(1);
        }

        /* renamed from: a */
        public final void m25402a(Boolean bool) {
            AbstractC5868k.m23673e(bool, "it");
            if (bool.booleanValue()) {
                C6486y.f24914h = 1;
                C7709c.m29787d().m29801m(new RecommendGetSucEvent());
            }
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m25402a((Boolean) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: qd.y$c */
    /* loaded from: classes3.dex */
    public static final class c extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final c f24922a = new c();

        c() {
            super(1);
        }

        /* renamed from: a */
        public final void m25403a(Throwable th) {
            th.printStackTrace();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m25403a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: qd.y$d */
    /* loaded from: classes3.dex */
    public static final class d implements C7776f.a {

        /* renamed from: qd.y$d$a */
        /* loaded from: classes3.dex */
        static final class a extends AbstractC5869l implements InterfaceC5660l {

            /* renamed from: a */
            final /* synthetic */ C6486y f24924a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C6486y c6486y) {
                super(1);
                this.f24924a = c6486y;
            }

            @Override // me.InterfaceC5660l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ArrayList mo542f(ArrayList arrayList) {
                AbstractC5868k.m23674f(arrayList, "it");
                arrayList.addAll(this.f24924a.f24918d);
                return arrayList;
            }
        }

        /* renamed from: qd.y$d$b */
        /* loaded from: classes3.dex */
        static final class b extends AbstractC5869l implements InterfaceC5660l {

            /* renamed from: a */
            public static final b f24925a = new b();

            b() {
                super(1);
            }

            @Override // me.InterfaceC5660l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C5548b mo542f(ArrayList arrayList) {
                AbstractC5868k.m23674f(arrayList, "it");
                return new C5548b(false, arrayList);
            }
        }

        /* renamed from: qd.y$d$c */
        /* loaded from: classes3.dex */
        static final class c extends AbstractC5869l implements InterfaceC5660l {

            /* renamed from: a */
            final /* synthetic */ C6486y f24926a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(C6486y c6486y) {
                super(1);
                this.f24926a = c6486y;
            }

            /* renamed from: a */
            public final void m25414a(C5548b c5548b) {
                this.f24926a.m25398d4().mo24143t5(c5548b.m22490a(), c5548b.m22491b());
            }

            @Override // me.InterfaceC5660l
            /* renamed from: f */
            public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
                m25414a((C5548b) obj);
                return C1328x.f4998a;
            }
        }

        /* renamed from: qd.y$d$d, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        static final class C7859d extends AbstractC5869l implements InterfaceC5660l {

            /* renamed from: a */
            public static final C7859d f24927a = new C7859d();

            C7859d() {
                super(1);
            }

            /* renamed from: a */
            public final void m25415a(Throwable th) {
                th.printStackTrace();
            }

            @Override // me.InterfaceC5660l
            /* renamed from: f */
            public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
                m25415a((Throwable) obj);
                return C1328x.f4998a;
            }
        }

        d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public static final ArrayList m25408f(InterfaceC5660l interfaceC5660l, Object obj) {
            AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
            return (ArrayList) interfaceC5660l.mo542f(obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public static final C5548b m25409g(InterfaceC5660l interfaceC5660l, Object obj) {
            AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
            return (C5548b) interfaceC5660l.mo542f(obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h */
        public static final void m25410h(InterfaceC5660l interfaceC5660l, Object obj) {
            AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
            interfaceC5660l.mo542f(obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: i */
        public static final void m25411i(InterfaceC5660l interfaceC5660l, Object obj) {
            AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
            interfaceC5660l.mo542f(obj);
        }

        @Override // za.C7776f.a
        /* renamed from: a */
        public void mo11443a(boolean z10, String str, ActiveResult activeResult, LoginResult loginResult, String str2, String str3) {
            AbstractC5868k.m23674f(str, Constants.KEY_ERROR_CODE);
            AbstractC5868k.m23674f(str2, "uri");
            AbstractC5868k.m23674f(str3, "accountType");
            C6486y.this.m25389P3();
            Observable just = Observable.just(new ArrayList());
            final a aVar = new a(C6486y.this);
            Observable map = just.map(new Function() { // from class: qd.z
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    ArrayList m25408f;
                    m25408f = C6486y.d.m25408f(InterfaceC5660l.this, obj);
                    return m25408f;
                }
            });
            final b bVar = b.f24925a;
            Observable compose = map.map(new Function() { // from class: qd.a0
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    C5548b m25409g;
                    m25409g = C6486y.d.m25409g(InterfaceC5660l.this, obj);
                    return m25409g;
                }
            }).compose(AbstractC7029f.m27121b());
            final c cVar = new c(C6486y.this);
            Consumer consumer = new Consumer() { // from class: qd.b0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C6486y.d.m25410h(InterfaceC5660l.this, obj);
                }
            };
            final C7859d c7859d = C7859d.f24927a;
            compose.subscribe(consumer, new Consumer() { // from class: qd.c0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C6486y.d.m25411i(InterfaceC5660l.this, obj);
                }
            });
        }
    }

    /* renamed from: qd.y$e */
    /* loaded from: classes3.dex */
    static final class e extends AbstractC5869l implements InterfaceC5642a {
        e() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0224y0 invoke() {
            return new C0224y0(C6486y.this, null, 2, 0 == true ? 1 : 0);
        }
    }

    /* renamed from: qd.y$f */
    /* loaded from: classes3.dex */
    public static final class f implements ViewOnClickListenerC4019e.a {

        /* renamed from: b */
        final /* synthetic */ ContentList f24930b;

        /* renamed from: c */
        final /* synthetic */ String f24931c;

        /* renamed from: d */
        final /* synthetic */ String f24932d;

        f(ContentList contentList, String str, String str2) {
            this.f24930b = contentList;
            this.f24931c = str;
            this.f24932d = str2;
        }

        @Override // p101da.ViewOnClickListenerC4019e.a
        /* renamed from: Z2 */
        public void mo17006Z2() {
        }

        @Override // p101da.ViewOnClickListenerC4019e.a
        /* renamed from: b2 */
        public void mo17007b2() {
        }

        @Override // p101da.ViewOnClickListenerC4019e.a
        /* renamed from: n2 */
        public void mo17008n2() {
            String str = null;
            String str2 = null;
            C4160d.b bVar = C4160d.f18217d;
            AbstractActivityC7763a m25396b4 = C6486y.this.m25396b4();
            String string = C6486y.this.m25396b4().getString(R$string.pwd_set_suc);
            AbstractC5868k.m23673e(string, "activity.getString(R.string.pwd_set_suc)");
            C4160d.b.m17389f(bVar, m25396b4, string, false, 4, null);
            C6486y c6486y = C6486y.this;
            String contentId = this.f24930b.getContentId();
            String str3 = this.f24931c;
            String name = this.f24930b.getName();
            if (name == null) {
                str = "";
            } else {
                str = name;
            }
            String str4 = this.f24932d;
            String columnAlias = this.f24930b.getColumnAlias();
            if (columnAlias == null) {
                str2 = "";
            } else {
                str2 = columnAlias;
            }
            c6486y.mo24139a1(contentId, true, str3, str, str4, str2, true);
            C7589m1.f27886a.m29156y("VOD");
        }

        @Override // p101da.ViewOnClickListenerC4019e.a
        /* renamed from: q0 */
        public void mo17009q0() {
            ViewOnClickListenerC4019e.a.C7837a.m17010a(this);
        }
    }

    /* renamed from: qd.y$g */
    /* loaded from: classes3.dex */
    public static final class g implements ViewOnClickListenerC4018d.a {

        /* renamed from: b */
        final /* synthetic */ ContentList f24934b;

        /* renamed from: c */
        final /* synthetic */ String f24935c;

        /* renamed from: d */
        final /* synthetic */ String f24936d;

        g(ContentList contentList, String str, String str2) {
            this.f24934b = contentList;
            this.f24935c = str;
            this.f24936d = str2;
        }

        @Override // p101da.ViewOnClickListenerC4018d.a
        public void cancel() {
        }

        @Override // p101da.ViewOnClickListenerC4018d.a
        /* renamed from: q0 */
        public void mo11609q0() {
            ViewOnClickListenerC4018d.a.C7836a.m16992a(this);
        }

        @Override // p101da.ViewOnClickListenerC4018d.a
        /* renamed from: r0 */
        public void mo11610r0() {
            C6486y c6486y = C6486y.this;
            String contentId = this.f24934b.getContentId();
            String str = this.f24935c;
            String name = this.f24934b.getName();
            if (name == null) {
                name = "";
            }
            String str2 = this.f24936d;
            String columnAlias = this.f24934b.getColumnAlias();
            if (columnAlias == null) {
                columnAlias = "";
            }
            c6486y.mo24139a1(contentId, true, str, name, str2, columnAlias, true);
            C7589m1.f27886a.m29156y("VOD");
        }

        @Override // p101da.ViewOnClickListenerC4018d.a
        /* renamed from: x */
        public void mo11611x() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: qd.y$h */
    /* loaded from: classes3.dex */
    public static final class h extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        final /* synthetic */ ChildColumn f24937a;

        /* renamed from: b */
        final /* synthetic */ String f24938b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(ChildColumn childColumn, String str) {
            super(1);
            this.f24937a = childColumn;
            this.f24938b = str;
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Intent mo542f(Intent intent) {
            AbstractC5868k.m23674f(intent, "intent");
            C7594o0 c7594o0 = C7594o0.f27942a;
            intent.putExtra("extra_topic_poster", c7594o0.m29220i(this.f24937a.getPosterList(), C7594o0.a.SpecialTopic));
            intent.putExtra("extra_topic_background", c7594o0.m29220i(this.f24937a.getPosterList(), C7594o0.a.Background));
            intent.putExtra("extra_topic_column_id", String.valueOf(this.f24937a.getId()));
            intent.putExtra("extra_topic_name", this.f24937a.getName());
            intent.putExtra("extra_topic_alias", this.f24937a.getAlias());
            Intent putExtra = intent.putExtra("extra_play_entrance", this.f24938b);
            AbstractC5868k.m23673e(putExtra, "intent.putExtra(TopicAct…Y_ENTRANCE, playEntrance)");
            return putExtra;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: qd.y$i */
    /* loaded from: classes3.dex */
    public static final class i extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        final /* synthetic */ String f24939a;

        /* renamed from: b */
        final /* synthetic */ String f24940b;

        /* renamed from: c */
        final /* synthetic */ boolean f24941c;

        /* renamed from: d */
        final /* synthetic */ String f24942d;

        /* renamed from: e */
        final /* synthetic */ String f24943e;

        /* renamed from: f */
        final /* synthetic */ String f24944f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(String str, String str2, boolean z10, String str3, String str4, String str5) {
            super(1);
            this.f24939a = str;
            this.f24940b = str2;
            this.f24941c = z10;
            this.f24942d = str3;
            this.f24943e = str4;
            this.f24944f = str5;
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Intent mo542f(Intent intent) {
            AbstractC5868k.m23674f(intent, "intent");
            intent.putExtra("extra_column_id", Integer.parseInt(this.f24939a));
            intent.putExtra("extra_column_code", "");
            intent.putExtra("extra_column_name", this.f24940b);
            intent.putExtra("extra_restrict", this.f24941c);
            intent.putExtra("extra_category_type", this.f24942d);
            intent.putExtra("extra_play_entrance", this.f24943e);
            Intent putExtra = intent.putExtra("extra_category_selected_alias", this.f24944f);
            AbstractC5868k.m23673e(putExtra, "intent.putExtra(VodCateg…ECTED_ALIAS, columnAlias)");
            return putExtra;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: qd.y$j */
    /* loaded from: classes3.dex */
    public static final class j extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        final /* synthetic */ ContentList f24945a;

        /* renamed from: b */
        final /* synthetic */ String f24946b;

        /* renamed from: c */
        final /* synthetic */ String f24947c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(ContentList contentList, String str, String str2) {
            super(1);
            this.f24945a = contentList;
            this.f24946b = str;
            this.f24947c = str2;
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Intent mo542f(Intent intent) {
            AbstractC5868k.m23674f(intent, "intent");
            intent.putExtra("extra_content_id", this.f24945a.getContentId());
            intent.putExtra("extra_type", this.f24945a.getType());
            intent.putExtra("extra_play_type", "1");
            intent.putExtra("extra_umeng_event_key", C7589m1.c.f27901a.m29166d());
            intent.putExtra("extra_umeng_event_category", this.f24946b);
            Intent putExtra = intent.putExtra("extra_play_entrance", this.f24947c);
            AbstractC5868k.m23673e(putExtra, "intent.putExtra(VodDetai…Y_ENTRANCE, playEntrance)");
            return putExtra;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: qd.y$k */
    /* loaded from: classes3.dex */
    public static final class k extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        final /* synthetic */ String f24948a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(String str) {
            super(1);
            this.f24948a = str;
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Intent mo542f(Intent intent) {
            AbstractC5868k.m23674f(intent, "it");
            Intent putExtra = intent.putExtra("extra_play_entrance", this.f24948a);
            AbstractC5868k.m23673e(putExtra, "it.putExtra(TopicMoreAct…Y_ENTRANCE, playEntrance)");
            return putExtra;
        }
    }

    public C6486y(AbstractActivityC7763a abstractActivityC7763a, InterfaceC5968d interfaceC5968d) {
        InterfaceC1312h m5965b;
        AbstractC5868k.m23674f(abstractActivityC7763a, "activity");
        AbstractC5868k.m23674f(interfaceC5968d, "view");
        this.f24915a = abstractActivityC7763a;
        this.f24916b = interfaceC5968d;
        this.f24917c = new Handler();
        this.f24918d = new ArrayList();
        m5965b = AbstractC1314j.m5965b(new e());
        this.f24919e = m5965b;
        this.f24920f = new d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P3 */
    public final void m25389P3() {
        synchronized (C6486y.class) {
            if (f24914h != 2) {
                return;
            }
            f24914h = 0;
            C1328x c1328x = C1328x.f4998a;
            Observable compose = Observable.create(new ObservableOnSubscribe() { // from class: qd.v
                @Override // io.reactivex.ObservableOnSubscribe
                public final void subscribe(ObservableEmitter observableEmitter) {
                    C6486y.m25390Q3(observableEmitter);
                }
            }).compose(AbstractC7029f.m27126g());
            final b bVar = b.f24921a;
            Consumer consumer = new Consumer() { // from class: qd.w
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C6486y.m25391T3(InterfaceC5660l.this, obj);
                }
            };
            final c cVar = c.f24922a;
            compose.subscribe(consumer, new Consumer() { // from class: qd.x
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C6486y.m25392W3(InterfaceC5660l.this, obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q3 */
    public static final void m25390Q3(ObservableEmitter observableEmitter) {
        AbstractC5868k.m23674f(observableEmitter, "it");
        observableEmitter.onNext(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T3 */
    public static final void m25391T3(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W3 */
    public static final void m25392W3(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* renamed from: e4 */
    private final void m25394e4(ContentList contentList, String str, String str2) {
        if (TextUtils.isEmpty(AbstractC4161e.f18225a.m17399b())) {
            C4160d m17390a = C4160d.f18217d.m17390a();
            AbstractC0729o m3294d4 = this.f24915a.m3294d4();
            AbstractC5868k.m23673e(m3294d4, "activity.supportFragmentManager");
            C4160d.m17381p(m17390a, m3294d4, new f(contentList, str, str2), false, false, 12, null);
            return;
        }
        C4160d m17390a2 = C4160d.f18217d.m17390a();
        AbstractC0729o m3294d42 = this.f24915a.m3294d4();
        AbstractC5868k.m23673e(m3294d42, "activity.supportFragmentManager");
        C4160d.m17379m(m17390a2, m3294d42, new g(contentList, str, str2), false, 4, null);
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: B0 */
    public void mo6701B0() {
        this.f24916b.mo24142h();
    }

    @Override // p301qb.InterfaceC6417q0
    /* renamed from: E5 */
    public void mo25224E5(GetRecommendsResult getRecommendsResult) {
        AbstractC5868k.m23674f(getRecommendsResult, "getRecommendsResult");
        f24914h = 1;
    }

    @Override // p268od.InterfaceC5967c
    /* renamed from: M2 */
    public void mo24138M2(ContentList contentList, String str, String str2, boolean z10) {
        boolean m27763v;
        boolean m27763v2;
        AbstractC5868k.m23674f(str, "programType");
        AbstractC5868k.m23674f(str2, "rcmCode");
        if (contentList != null) {
            String type = contentList.getType();
            boolean z11 = false;
            switch (type.hashCode()) {
                case 48:
                    if (type.equals(MessageService.MSG_DB_READY_REPORT)) {
                        m25400h4(contentList, str, str2);
                        return;
                    }
                    return;
                case 49:
                    if (type.equals("1")) {
                        m25400h4(contentList, str, str2);
                        return;
                    }
                    return;
                case 50:
                    type.equals("2");
                    return;
                case 51:
                    if (type.equals("3")) {
                        if (AbstractC5868k.m23669a(contentList.getRestricted(), "1")) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(str2);
                            sb2.append('/');
                            String columnAlias = contentList.getColumnAlias();
                            sb2.append(columnAlias != null ? columnAlias : "");
                            m25394e4(contentList, str, sb2.toString());
                            return;
                        }
                        if (AbstractC5868k.m23669a(contentList.getSpecialFlag(), "1") && TextUtils.isDigitsOnly(contentList.getContentId())) {
                            Object m20485a = C5044a.f20862a.m20485a("Special_root");
                            ChildColumn childColumn = m20485a instanceof ChildColumn ? (ChildColumn) m20485a : null;
                            if (childColumn != null && Integer.parseInt(contentList.getContentId()) == childColumn.getId()) {
                                z11 = true;
                            }
                            if (z11) {
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(str2);
                                sb3.append('/');
                                String columnAlias2 = contentList.getColumnAlias();
                                sb3.append(columnAlias2 != null ? columnAlias2 : "");
                                m25401k4(sb3.toString());
                                return;
                            }
                            ChildColumn childColumn2 = new ChildColumn();
                            String name = contentList.getName();
                            AbstractC5868k.m23671c(name);
                            childColumn2.setName(name);
                            childColumn2.setId(Integer.parseInt(contentList.getContentId()));
                            childColumn2.setAlias(contentList.getName());
                            childColumn2.setPosterList(contentList.getPosterList());
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append(str2);
                            sb4.append("_special/");
                            String columnAlias3 = contentList.getColumnAlias();
                            sb4.append(columnAlias3 != null ? columnAlias3 : "");
                            m25399g4(childColumn2, sb4.toString());
                            return;
                        }
                        if (z10) {
                            KidsCategoryActivity.C3809a c3809a = KidsCategoryActivity.f17235s0;
                            AbstractActivityC7763a abstractActivityC7763a = this.f24915a;
                            int parseInt = Integer.parseInt(contentList.getContentId());
                            String name2 = contentList.getName();
                            if (name2 == null) {
                                name2 = "";
                            }
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append(str2);
                            sb5.append('/');
                            String columnAlias4 = contentList.getColumnAlias();
                            if (columnAlias4 == null) {
                                columnAlias4 = "";
                            }
                            sb5.append(columnAlias4);
                            String sb6 = sb5.toString();
                            List<PosterList> columnPosterList = contentList.getColumnPosterList();
                            String columnAlias5 = contentList.getColumnAlias();
                            c3809a.m16269a(abstractActivityC7763a, parseInt, name2, str, sb6, columnPosterList, columnAlias5 != null ? columnAlias5 : "");
                            return;
                        }
                        String contentId = contentList.getContentId();
                        String name3 = contentList.getName();
                        if (name3 == null) {
                            name3 = "";
                        }
                        StringBuilder sb7 = new StringBuilder();
                        sb7.append(str2);
                        sb7.append('/');
                        String columnAlias6 = contentList.getColumnAlias();
                        if (columnAlias6 == null) {
                            columnAlias6 = "";
                        }
                        sb7.append(columnAlias6);
                        String sb8 = sb7.toString();
                        String columnAlias7 = contentList.getColumnAlias();
                        InterfaceC5967c.a.m24141b(this, contentId, true, str, name3, sb8, columnAlias7 != null ? columnAlias7 : "", false, 64, null);
                        return;
                    }
                    return;
                case 52:
                    if (type.equals("4")) {
                        if (!TextUtils.isEmpty(contentList.getUrl())) {
                            String url = contentList.getUrl();
                            AbstractC5868k.m23671c(url);
                            m27763v = AbstractC7167u.m27763v(url, "toInviteFriends", false, 2, null);
                            if (m27763v) {
                                C6448c.m25240q(C5634i.m22843d("http://module_mine/InviteFriendsActivity").m25254t(262144), this.f24915a, null, 2, null);
                                return;
                            }
                        }
                        AbstractC7555b0.m28950d(contentList.getUrl(), this.f24915a);
                        return;
                    }
                    return;
                case 53:
                    if (type.equals(CdnType.DIGITAL_TYPE_PCDN) && !TextUtils.isEmpty(contentList.getUrl()) && AbstractC5868k.m23669a(contentList.getRemark(), "1")) {
                        String url2 = contentList.getUrl();
                        AbstractC5868k.m23671c(url2);
                        m27763v2 = AbstractC7167u.m27763v(url2, "toInviteFriends", false, 2, null);
                        if (m27763v2) {
                            C7589m1.f27886a.m29148q("2");
                            C6448c.m25240q(C5634i.m22843d("http://module_mine/InviteFriendsActivity").m25254t(262144), this.f24915a, null, 2, null);
                        } else {
                            AbstractC7555b0.m28950d(contentList.getUrl(), this.f24915a);
                        }
                        C6160q c6160q = C6160q.f24221a;
                        AbstractActivityC7763a abstractActivityC7763a2 = this.f24915a;
                        String m6888w = C1466m0.f5627a.m6888w();
                        String description = contentList.getDescription();
                        c6160q.m24599h(abstractActivityC7763a2, m6888w, description != null ? description : "", PosterView.f17456l.m16620b(contentList));
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    @Override // p301qb.InterfaceC6433v1
    /* renamed from: N3 */
    public C4307b mo523N3() {
        return null;
    }

    @Override // p301qb.InterfaceC6417q0
    /* renamed from: V4 */
    public void mo25225V4(String str) {
        AbstractC5868k.m23674f(str, "errCode");
        f24914h = 2;
    }

    /* renamed from: Y3 */
    public boolean m25395Y3() {
        return AbstractC6567a.m25638h(this.f24918d);
    }

    @Override // p268od.InterfaceC5967c
    /* renamed from: a1 */
    public void mo24139a1(String str, boolean z10, String str2, String str3, String str4, String str5, boolean z11) {
        AbstractC5868k.m23674f(str, "idOrCode");
        AbstractC5868k.m23674f(str2, "type");
        AbstractC5868k.m23674f(str3, "columnName");
        AbstractC5868k.m23674f(str4, "playEntrance");
        AbstractC5868k.m23674f(str5, "columnAlias");
        C7619y.m29367d(C7619y.f28056a, this.f24915a, VodCategoryActivity.class, null, new i(str, str3, z11, str2, str4, str5), 2, null);
    }

    /* renamed from: b4 */
    public final AbstractActivityC7763a m25396b4() {
        return this.f24915a;
    }

    /* renamed from: c4 */
    public void m25397c4() {
        C7776f c7776f = C7776f.f28648a;
        c7776f.m30098e0(this.f24920f);
        c7776f.m30102r(this.f24920f);
    }

    /* renamed from: d4 */
    public final InterfaceC5968d m25398d4() {
        return this.f24916b;
    }

    /* renamed from: g4 */
    public void m25399g4(ChildColumn childColumn, String str) {
        AbstractC5868k.m23674f(str, "playEntrance");
        if (childColumn != null) {
            C7619y.m29367d(C7619y.f28056a, this.f24915a, TopicActivity.class, null, new h(childColumn, str), 2, null);
        }
    }

    /* renamed from: h4 */
    public void m25400h4(ContentList contentList, String str, String str2) {
        AbstractC5868k.m23674f(contentList, "contentList");
        AbstractC5868k.m23674f(str, "type");
        AbstractC5868k.m23674f(str2, "playEntrance");
        C7619y.m29367d(C7619y.f28056a, this.f24915a, VodDetailsActivity.class, null, new j(contentList, str, str2), 2, null);
    }

    /* renamed from: k4 */
    public void m25401k4(String str) {
        AbstractC5868k.m23674f(str, "playEntrance");
        if (C5044a.f20862a.m20485a("Special_root") == null) {
            return;
        }
        C7619y.m29367d(C7619y.f28056a, this.f24915a, TopicMoreActivity.class, null, new k(str), 2, null);
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: n2 */
    public void mo6702n2() {
    }
}
