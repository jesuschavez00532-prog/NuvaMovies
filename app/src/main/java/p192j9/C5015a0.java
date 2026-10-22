package p192j9;

import ac.C0171k0;
import ac.C0211u0;
import ac.C0222x1;
import android.content.Context;
import android.util.Log;
import be.AbstractC1314j;
import be.C1328x;
import be.InterfaceC1312h;
import cc.C1466m0;
import com.request.result.ApkQueryCouponResult;
import com.request.result.ConfigInfoBean;
import com.request.result.GetPackageResult;
import com.request.result.PackageInfo;
import com.request.result.QueryCouponData;
import de.AbstractC4098b;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import me.InterfaceC5642a;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import org.android.agoo.message.MessageService;
import p043ce.AbstractC1504p;
import p100d9.C3989k0;
import p132fa.C4297a;
import p135fd.C4307b;
import p160h9.InterfaceC4747w;
import p160h9.InterfaceC4748x;
import p185j2.C4982a;
import p201k2.AbstractC5085b;
import p301qb.InterfaceC6371b;
import p301qb.InterfaceC6378d0;
import p301qb.InterfaceC6405m0;
import p317rb.AbstractC6567a;
import p348u2.AbstractC7027d;
import p348u2.AbstractC7029f;
import p400xa.C7581k;
import p400xa.C7615w;
import p415y9.AbstractApplicationC7689d;
import p430z9.AbstractC7765c;

/* renamed from: j9.a0 */
/* loaded from: classes2.dex */
public final class C5015a0 implements InterfaceC4747w, InterfaceC6371b, InterfaceC6405m0, InterfaceC6378d0 {

    /* renamed from: a */
    private AbstractC7765c f20761a;

    /* renamed from: b */
    private InterfaceC4748x f20762b;

    /* renamed from: c */
    private final InterfaceC1312h f20763c;

    /* renamed from: d */
    private final InterfaceC1312h f20764d;

    /* renamed from: e */
    private final InterfaceC1312h f20765e;

    /* renamed from: j9.a0$a */
    /* loaded from: classes2.dex */
    static final class a extends AbstractC5869l implements InterfaceC5642a {
        a() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0211u0 invoke() {
            return new C0211u0(C5015a0.this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j9.a0$b */
    /* loaded from: classes2.dex */
    public static final class b extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: b */
        final /* synthetic */ ArrayList f20768b;

        /* renamed from: c */
        final /* synthetic */ HashMap f20769c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ArrayList arrayList, HashMap hashMap) {
            super(1);
            this.f20768b = arrayList;
            this.f20769c = hashMap;
        }

        /* renamed from: a */
        public final void m20397a(HashMap hashMap) {
            C5015a0.this.m20391P3().mo19640s4(this.f20768b, this.f20769c);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m20397a((HashMap) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j9.a0$c */
    /* loaded from: classes2.dex */
    public static final class c extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final c f20770a = new c();

        c() {
            super(1);
        }

        /* renamed from: a */
        public final void m20398a(Throwable th) {
            th.printStackTrace();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m20398a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: j9.a0$d */
    /* loaded from: classes2.dex */
    public static final class d implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m17160a;
            m17160a = AbstractC4098b.m17160a(Integer.valueOf(((C3989k0) obj).m16879c()), Integer.valueOf(((C3989k0) obj2).m16879c()));
            return m17160a;
        }
    }

    /* renamed from: j9.a0$e */
    /* loaded from: classes2.dex */
    static final class e extends AbstractC5869l implements InterfaceC5642a {
        e() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0171k0 invoke() {
            return new C0171k0(C5015a0.this);
        }
    }

    /* renamed from: j9.a0$f */
    /* loaded from: classes2.dex */
    static final class f extends AbstractC5869l implements InterfaceC5642a {
        f() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0222x1 invoke() {
            return new C0222x1(C5015a0.this);
        }
    }

    public C5015a0(AbstractC7765c abstractC7765c, InterfaceC4748x interfaceC4748x) {
        InterfaceC1312h m5965b;
        InterfaceC1312h m5965b2;
        InterfaceC1312h m5965b3;
        AbstractC5868k.m23674f(abstractC7765c, "fragment");
        AbstractC5868k.m23674f(interfaceC4748x, "view");
        this.f20761a = abstractC7765c;
        this.f20762b = interfaceC4748x;
        m5965b = AbstractC1314j.m5965b(new a());
        this.f20763c = m5965b;
        m5965b2 = AbstractC1314j.m5965b(new e());
        this.f20764d = m5965b2;
        m5965b3 = AbstractC1314j.m5965b(new f());
        this.f20765e = m5965b3;
    }

    /* renamed from: G3 */
    private final C0211u0 m20381G3() {
        return (C0211u0) this.f20763c.getValue();
    }

    /* renamed from: J3 */
    private final C0171k0 m20382J3() {
        return (C0171k0) this.f20764d.getValue();
    }

    /* renamed from: O3 */
    private final C0222x1 m20383O3() {
        return (C0222x1) this.f20765e.getValue();
    }

    /* renamed from: Q3 */
    private final void m20384Q3(final List list) {
        boolean z10;
        if (list != null && !list.isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            this.f20762b.mo19633O4();
            return;
        }
        final HashMap hashMap = new HashMap();
        final ArrayList arrayList = new ArrayList();
        Observable create = Observable.create(new ObservableOnSubscribe() { // from class: j9.x
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                C5015a0.m20385T3(list, hashMap, arrayList, observableEmitter);
            }
        });
        AbstractC5868k.m23673e(create, "create<HashMap<String, M…packageMap)\n            }");
        Observable compose = AbstractC6567a.m25631a(create, this.f20761a.m19902N3()).compose(AbstractC7029f.m27120a());
        final b bVar = new b(arrayList, hashMap);
        Consumer consumer = new Consumer() { // from class: j9.y
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C5015a0.m20386W3(InterfaceC5660l.this, obj);
            }
        };
        final c cVar = c.f20770a;
        compose.subscribe(consumer, new Consumer() { // from class: j9.z
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C5015a0.m20388Y3(InterfaceC5660l.this, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T3 */
    public static final void m20385T3(List list, HashMap hashMap, ArrayList arrayList, ObservableEmitter observableEmitter) {
        AbstractC5868k.m23674f(hashMap, "$packageMap");
        AbstractC5868k.m23674f(arrayList, "$arrayTab");
        AbstractC5868k.m23674f(observableEmitter, "it");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            PackageInfo packageInfo = (PackageInfo) it.next();
            if (!hashMap.containsKey(packageInfo.getLabelTitle())) {
                hashMap.put(packageInfo.getLabelTitle(), new ArrayList());
            }
            List list2 = (List) hashMap.get(packageInfo.getLabelTitle());
            if (list2 != null) {
                list2.add(packageInfo);
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            String str = (String) entry.getKey();
            String labelRemark = ((PackageInfo) ((List) entry.getValue()).get(0)).getLabelRemark();
            if (labelRemark == null) {
                labelRemark = "";
            }
            arrayList.add(new C3989k0(str, labelRemark, ((PackageInfo) ((List) entry.getValue()).get(0)).getLabelSequence()));
        }
        if (arrayList.size() > 1) {
            AbstractC1504p.m6994m(arrayList, new d());
        }
        observableEmitter.onNext(hashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W3 */
    public static final void m20386W3(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y3 */
    public static final void m20388Y3(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: B0 */
    public void mo6701B0() {
        String str;
        C1466m0 c1466m0 = C1466m0.f5627a;
        String str2 = c1466m0.m6878m() + "isHasCouponQualification";
        String str3 = c1466m0.m6878m() + "couponQualificationTime";
        String str4 = c1466m0.m6878m() + "couponQualificationInvalidTime";
        C4982a c4982a = C4982a.f20721a;
        AbstractApplicationC7689d.a aVar = AbstractApplicationC7689d.f28135d;
        if (System.currentTimeMillis() - Long.parseLong((String) c4982a.m20333a(aVar.m29494a(), str3, MessageService.MSG_DB_READY_REPORT)) < Long.parseLong((String) c4982a.m20333a(aVar.m29494a(), str4, MessageService.MSG_DB_READY_REPORT))) {
            c1466m0.m6850W(((Boolean) c4982a.m20333a(aVar.m29494a(), str2, Boolean.FALSE)).booleanValue());
            str = null;
        } else {
            str = "1";
        }
        m20383O3().m780c(c1466m0.m6878m(), c1466m0.m6879n(), MessageService.MSG_DB_READY_REPORT, str);
    }

    @Override // p160h9.InterfaceC4747w
    /* renamed from: H2 */
    public void mo19631H2() {
        this.f20762b.mo19635c();
        m20381G3().m740b("2", String.valueOf(AbstractC5085b.m20602l(this.f20761a.m3096J6())));
    }

    @Override // p301qb.InterfaceC6371b
    /* renamed from: J5 */
    public void mo20389J5(ApkQueryCouponResult apkQueryCouponResult) {
        String str;
        boolean z10;
        AbstractC5868k.m23674f(apkQueryCouponResult, "apkQueryCouponResult");
        C4297a c4297a = C4297a.f18620a;
        QueryCouponData data = apkQueryCouponResult.getData();
        AbstractC5868k.m23671c(data);
        c4297a.m17987d(data.getCouponCodeList());
        C1466m0 c1466m0 = C1466m0.f5627a;
        String str2 = c1466m0.m6878m() + "isHasCouponQualification";
        String str3 = c1466m0.m6878m() + "couponQualificationTime";
        String str4 = c1466m0.m6878m() + "couponQualificationInvalidTime";
        long currentTimeMillis = System.currentTimeMillis();
        QueryCouponData data2 = apkQueryCouponResult.getData();
        if (data2 != null) {
            str = data2.getReceiveFlag();
        } else {
            str = null;
        }
        if (str != null && str.length() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            QueryCouponData data3 = apkQueryCouponResult.getData();
            AbstractC5868k.m23671c(data3);
            boolean m23669a = AbstractC5868k.m23669a(data3.getReceiveFlag(), "1");
            c1466m0.m6850W(m23669a);
            C4982a c4982a = C4982a.f20721a;
            AbstractApplicationC7689d.a aVar = AbstractApplicationC7689d.f28135d;
            c4982a.m20335c(aVar.m29494a(), str2, Boolean.valueOf(m23669a));
            c4982a.m20335c(aVar.m29494a(), str3, String.valueOf(currentTimeMillis));
            Context m29494a = aVar.m29494a();
            AbstractC5868k.m23671c(apkQueryCouponResult.getData());
            c4982a.m20335c(m29494a, str4, String.valueOf(r11.getDataCacheTime() * 60 * 1000));
            this.f20762b.mo19637g4(m23669a);
        }
    }

    @Override // p301qb.InterfaceC6378d0
    /* renamed from: L4 */
    public void mo20390L4(String str) {
        AbstractC5868k.m23674f(str, "bean");
        C7581k.f27855a.m29098g("Properties", str);
        Object fromJson = AbstractC7027d.m27114a().fromJson(str, (Class<Object>) ConfigInfoBean.class);
        AbstractC5868k.m23673e(fromJson, "jsoner.fromJson(bean, ConfigInfoBean::class.java)");
        C7615w c7615w = C7615w.f27995a;
        c7615w.m29312T(true);
        c7615w.m29310P(true);
        this.f20762b.mo19634Z5((ConfigInfoBean) fromJson);
    }

    @Override // p301qb.InterfaceC6433v1
    /* renamed from: N3 */
    public C4307b mo523N3() {
        return this.f20761a.m19902N3();
    }

    /* renamed from: P3 */
    public final InterfaceC4748x m20391P3() {
        return this.f20762b;
    }

    @Override // p301qb.InterfaceC6371b
    /* renamed from: U2 */
    public void mo20392U2(String str, String str2) {
        AbstractC5868k.m23674f(str, "errCode");
        C4297a.f18620a.m17987d(null);
        if (str2 != null) {
            C1466m0.f5627a.m6850W(false);
        }
    }

    @Override // p160h9.InterfaceC4747w
    /* renamed from: c */
    public void mo19632c() {
        m20382J3().m626d();
    }

    @Override // p301qb.InterfaceC6378d0
    /* renamed from: c3 */
    public void mo20393c3(int i10, String str) {
        this.f20762b.mo19639r6(i10);
    }

    @Override // p301qb.InterfaceC6405m0
    /* renamed from: j4 */
    public void mo20394j4(GetPackageResult getPackageResult) {
        AbstractC5868k.m23674f(getPackageResult, "result");
        Log.d("PurchasePresenter", "result: " + getPackageResult.getData() + ";dismissLoadingView");
        this.f20762b.mo19636d();
        m20384Q3(getPackageResult.getData());
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: n2 */
    public void mo6702n2() {
    }

    @Override // p301qb.InterfaceC6405m0
    /* renamed from: r0 */
    public void mo20395r0(String str) {
        AbstractC5868k.m23674f(str, "errCode");
        this.f20762b.mo19636d();
        this.f20762b.mo19638r0(str);
    }
}
