package p192j9;

import ac.C0222x1;
import ac.C0225y1;
import android.content.Context;
import android.text.TextUtils;
import cc.C1466m0;
import com.module.event.UpdateCouponReceiveStatus;
import com.request.result.ApkQueryCouponResult;
import com.request.result.ApkReceiveCouponResult;
import com.request.result.AvailableCouponCodeList;
import com.request.result.CouponCodeList;
import com.request.result.QueryCouponData;
import com.taobao.agoo.p075a.p076a.AbstractC3215b;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import ne.AbstractC5868k;
import org.android.agoo.message.MessageService;
import p043ce.AbstractC1508t;
import p132fa.C4297a;
import p135fd.C4307b;
import p160h9.InterfaceC4729e;
import p160h9.InterfaceC4730f;
import p185j2.C4982a;
import p301qb.InterfaceC6371b;
import p301qb.InterfaceC6374c;
import p317rb.AbstractC6567a;
import p415y9.AbstractApplicationC7689d;
import p430z9.AbstractC7765c;
import ye.C7709c;

/* renamed from: j9.h */
/* loaded from: classes2.dex */
public final class C5025h implements InterfaceC4729e, InterfaceC6371b, InterfaceC6374c {

    /* renamed from: a */
    private AbstractC7765c f20800a;

    /* renamed from: b */
    private InterfaceC4730f f20801b;

    /* renamed from: c */
    private C0225y1 f20802c;

    /* renamed from: d */
    private C0222x1 f20803d;

    /* renamed from: e */
    private Map f20804e;

    /* renamed from: j9.h$a */
    /* loaded from: classes2.dex */
    public static final class a implements Observer {
        a() {
        }

        @Override // io.reactivex.Observer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onNext(List list) {
            AbstractC5868k.m23674f(list, "sortedAvailableList");
            C5025h.this.m20432O3().mo19594H0(list);
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            AbstractC5868k.m23674f(th, "e");
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            AbstractC5868k.m23674f(disposable, "d");
        }
    }

    /* renamed from: j9.h$b */
    /* loaded from: classes2.dex */
    public static final class b implements Observer {
        b() {
        }

        @Override // io.reactivex.Observer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onNext(List list) {
            AbstractC5868k.m23674f(list, "sortedList");
            C5025h.this.m20432O3().mo19599d2(null);
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            AbstractC5868k.m23674f(th, "e");
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            AbstractC5868k.m23674f(disposable, "d");
        }
    }

    /* renamed from: j9.h$c */
    /* loaded from: classes2.dex */
    public static final class c implements Observer {
        c() {
        }

        @Override // io.reactivex.Observer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onNext(List list) {
            AbstractC5868k.m23674f(list, "sortedList");
            C5025h.this.m20432O3().mo19599d2(list);
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            AbstractC5868k.m23674f(th, "e");
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            AbstractC5868k.m23674f(disposable, "d");
        }
    }

    public C5025h(AbstractC7765c abstractC7765c, InterfaceC4730f interfaceC4730f) {
        AbstractC5868k.m23674f(abstractC7765c, "fragment");
        AbstractC5868k.m23674f(interfaceC4730f, "view");
        this.f20800a = abstractC7765c;
        this.f20801b = interfaceC4730f;
        this.f20804e = new LinkedHashMap();
    }

    /* renamed from: P3 */
    private final List m20421P3(List list) {
        List m6996A;
        List m7001F;
        if (list != null && !list.isEmpty()) {
            m6996A = AbstractC1508t.m6996A(list, new Comparator() { // from class: j9.g
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int m20422Q3;
                    m20422Q3 = C5025h.m20422Q3((AvailableCouponCodeList) obj, (AvailableCouponCodeList) obj2);
                    return m20422Q3;
                }
            });
            m7001F = AbstractC1508t.m7001F(m6996A);
            return m7001F;
        }
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q3 */
    public static final int m20422Q3(AvailableCouponCodeList availableCouponCodeList, AvailableCouponCodeList availableCouponCodeList2) {
        float f10 = 0.0f;
        Float f11;
        Float f12;
        String couponCurrency = availableCouponCodeList.getCouponCurrency();
        String str = "";
        if (couponCurrency == null) {
            couponCurrency = "";
        }
        Map<String, Float> couponAmount = availableCouponCodeList.getCouponAmount();
        float f13 = 0.0f;
        if (couponAmount != null && (f12 = couponAmount.get(couponCurrency)) != null) {
            f10 = f12.floatValue();
        } else {
            f10 = 0.0f;
        }
        String couponCurrency2 = availableCouponCodeList2.getCouponCurrency();
        if (couponCurrency2 != null) {
            str = couponCurrency2;
        }
        Map<String, Float> couponAmount2 = availableCouponCodeList2.getCouponAmount();
        if (couponAmount2 != null && (f11 = couponAmount2.get(str)) != null) {
            f13 = f11.floatValue();
        }
        return Float.compare(f13, f10);
    }

    /* renamed from: T3 */
    private final List m20423T3(List list) {
        List m6996A;
        List m7001F;
        if (list != null && !list.isEmpty()) {
            m6996A = AbstractC1508t.m6996A(list, new Comparator() { // from class: j9.f
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int m20424W3;
                    m20424W3 = C5025h.m20424W3((CouponCodeList) obj, (CouponCodeList) obj2);
                    return m20424W3;
                }
            });
            m7001F = AbstractC1508t.m7001F(m6996A);
            return m7001F;
        }
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W3 */
    public static final int m20424W3(CouponCodeList couponCodeList, CouponCodeList couponCodeList2) {
        float f10 = 0.0f;
        Float f11;
        Float f12;
        float f13 = 0.0f;
        Float f14;
        Float f15;
        float f16 = 0.0f;
        Float f17;
        Float f18;
        if (TextUtils.equals(couponCodeList.getStatus(), MessageService.MSG_DB_READY_REPORT) && !TextUtils.equals(couponCodeList2.getStatus(), MessageService.MSG_DB_READY_REPORT)) {
            return -1;
        }
        if (!TextUtils.equals(couponCodeList.getStatus(), MessageService.MSG_DB_READY_REPORT) && TextUtils.equals(couponCodeList2.getStatus(), MessageService.MSG_DB_READY_REPORT)) {
            return 1;
        }
        if (TextUtils.equals(couponCodeList.getStatus(), "1") && TextUtils.equals(couponCodeList2.getStatus(), "2")) {
            return -1;
        }
        if (TextUtils.equals(couponCodeList.getStatus(), "2") && TextUtils.equals(couponCodeList2.getStatus(), "1")) {
            return 1;
        }
        float f19 = 0.0f;
        String str = "";
        if (TextUtils.equals(couponCodeList.getStatus(), MessageService.MSG_DB_READY_REPORT) && TextUtils.equals(couponCodeList2.getStatus(), MessageService.MSG_DB_READY_REPORT)) {
            String couponCurrency = couponCodeList.getCouponCurrency();
            if (couponCurrency == null) {
                couponCurrency = "";
            }
            Map<String, Float> couponAmount = couponCodeList.getCouponAmount();
            if (couponAmount != null && (f18 = couponAmount.get(couponCurrency)) != null) {
                f16 = f18.floatValue();
            } else {
                f16 = 0.0f;
            }
            String couponCurrency2 = couponCodeList2.getCouponCurrency();
            if (couponCurrency2 != null) {
                str = couponCurrency2;
            }
            Map<String, Float> couponAmount2 = couponCodeList2.getCouponAmount();
            if (couponAmount2 != null && (f17 = couponAmount2.get(str)) != null) {
                f19 = f17.floatValue();
            }
            return Float.compare(f19, f16);
        }
        if (TextUtils.equals(couponCodeList.getStatus(), "1") && TextUtils.equals(couponCodeList2.getStatus(), "1")) {
            String couponCurrency3 = couponCodeList.getCouponCurrency();
            if (couponCurrency3 == null) {
                couponCurrency3 = "";
            }
            Map<String, Float> couponAmount3 = couponCodeList.getCouponAmount();
            if (couponAmount3 != null && (f15 = couponAmount3.get(couponCurrency3)) != null) {
                f13 = f15.floatValue();
            } else {
                f13 = 0.0f;
            }
            String couponCurrency4 = couponCodeList2.getCouponCurrency();
            if (couponCurrency4 != null) {
                str = couponCurrency4;
            }
            Map<String, Float> couponAmount4 = couponCodeList2.getCouponAmount();
            if (couponAmount4 != null && (f14 = couponAmount4.get(str)) != null) {
                f19 = f14.floatValue();
            }
            return Float.compare(f19, f13);
        }
        if (TextUtils.equals(couponCodeList.getStatus(), "2") && TextUtils.equals(couponCodeList2.getStatus(), "2")) {
            String couponCurrency5 = couponCodeList.getCouponCurrency();
            if (couponCurrency5 == null) {
                couponCurrency5 = "";
            }
            Map<String, Float> couponAmount5 = couponCodeList.getCouponAmount();
            if (couponAmount5 != null && (f12 = couponAmount5.get(couponCurrency5)) != null) {
                f10 = f12.floatValue();
            } else {
                f10 = 0.0f;
            }
            String couponCurrency6 = couponCodeList2.getCouponCurrency();
            if (couponCurrency6 != null) {
                str = couponCurrency6;
            }
            Map<String, Float> couponAmount6 = couponCodeList2.getCouponAmount();
            if (couponAmount6 != null && (f11 = couponAmount6.get(str)) != null) {
                f19 = f11.floatValue();
            }
            return Float.compare(f19, f10);
        }
        return 0;
    }

    /* renamed from: Y3 */
    private final void m20426Y3(final List list) {
        Observable.create(new ObservableOnSubscribe() { // from class: j9.e
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                C5025h.m20427b4(C5025h.this, list, observableEmitter);
            }
        }).compose(this.f20800a.m19902N3()).observeOn(AndroidSchedulers.mainThread()).subscribe(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b4 */
    public static final void m20427b4(C5025h c5025h, List list, ObservableEmitter observableEmitter) {
        AbstractC5868k.m23674f(c5025h, "this$0");
        AbstractC5868k.m23674f(list, "$receiveCouponCodeList");
        AbstractC5868k.m23674f(observableEmitter, "emitter");
        List m20421P3 = c5025h.m20421P3(list);
        AbstractC5868k.m23671c(m20421P3);
        observableEmitter.onNext(m20421P3);
    }

    /* renamed from: c4 */
    private final void m20428c4(final List list) {
        boolean z10 = false;
        if (list != null && !list.isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            Observable.create(new ObservableOnSubscribe() { // from class: j9.c
                @Override // io.reactivex.ObservableOnSubscribe
                public final void subscribe(ObservableEmitter observableEmitter) {
                    C5025h.m20429d4(C5025h.this, list, observableEmitter);
                }
            }).compose(this.f20800a.m19902N3()).observeOn(AndroidSchedulers.mainThread()).subscribe(new b());
        } else {
            Observable.create(new ObservableOnSubscribe() { // from class: j9.d
                @Override // io.reactivex.ObservableOnSubscribe
                public final void subscribe(ObservableEmitter observableEmitter) {
                    C5025h.m20430e4(C5025h.this, list, observableEmitter);
                }
            }).compose(this.f20800a.m19902N3()).observeOn(AndroidSchedulers.mainThread()).subscribe(new c());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d4 */
    public static final void m20429d4(C5025h c5025h, List list, ObservableEmitter observableEmitter) {
        AbstractC5868k.m23674f(c5025h, "this$0");
        AbstractC5868k.m23674f(observableEmitter, "emitter");
        List m20423T3 = c5025h.m20423T3(list);
        AbstractC5868k.m23671c(m20423T3);
        observableEmitter.onNext(m20423T3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e4 */
    public static final void m20430e4(C5025h c5025h, List list, ObservableEmitter observableEmitter) {
        AbstractC5868k.m23674f(c5025h, "this$0");
        AbstractC5868k.m23674f(observableEmitter, "emitter");
        List m20423T3 = c5025h.m20423T3(list);
        AbstractC5868k.m23671c(m20423T3);
        observableEmitter.onNext(m20423T3);
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: B0 */
    public void mo6701B0() {
    }

    @Override // p301qb.InterfaceC6371b
    /* renamed from: J5 */
    public void mo20389J5(ApkQueryCouponResult apkQueryCouponResult) {
        List<CouponCodeList> list;
        String str = null;
        boolean z10 = false;
        AbstractC5868k.m23674f(apkQueryCouponResult, "apkQueryCouponResult");
        this.f20801b.mo19595J();
        C1466m0 c1466m0 = C1466m0.f5627a;
        String str2 = c1466m0.m6878m() + "isHasCouponQualification";
        String str3 = c1466m0.m6878m() + "couponQualificationTime";
        String str4 = c1466m0.m6878m() + "couponQualificationInvalidTime";
        long currentTimeMillis = System.currentTimeMillis();
        C4297a c4297a = C4297a.f18620a;
        QueryCouponData data = apkQueryCouponResult.getData();
        AbstractC5868k.m23671c(data);
        c4297a.m17987d(data.getCouponCodeList());
        if (apkQueryCouponResult.getData() != null) {
            QueryCouponData data2 = apkQueryCouponResult.getData();
            List<AvailableCouponCodeList> list2 = null;
            if (data2 != null) {
                list = data2.getCouponCodeList();
            } else {
                list = null;
            }
            m20428c4(list);
            QueryCouponData data3 = apkQueryCouponResult.getData();
            if (data3 != null) {
                str = data3.getReceiveFlag();
            } else {
                str = null;
            }
            if (str != null && str.length() != 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10) {
                QueryCouponData data4 = apkQueryCouponResult.getData();
                AbstractC5868k.m23671c(data4);
                boolean m23669a = AbstractC5868k.m23669a(data4.getReceiveFlag(), "1");
                c1466m0.m6850W(m23669a);
                C4982a c4982a = C4982a.f20721a;
                AbstractApplicationC7689d.a aVar = AbstractApplicationC7689d.f28135d;
                c4982a.m20335c(aVar.m29494a(), str2, Boolean.valueOf(m23669a));
                c4982a.m20335c(aVar.m29494a(), str3, String.valueOf(currentTimeMillis));
                Context m29494a = aVar.m29494a();
                AbstractC5868k.m23671c(apkQueryCouponResult.getData());
                c4982a.m20335c(m29494a, str4, String.valueOf(r2.getDataCacheTime() * 60 * 1000));
                QueryCouponData data5 = apkQueryCouponResult.getData();
                if (data5 != null) {
                    list2 = data5.getReceiveCouponCodeList();
                }
                if (AbstractC6567a.m25638h(list2)) {
                    QueryCouponData data6 = apkQueryCouponResult.getData();
                    AbstractC5868k.m23671c(data6);
                    List<AvailableCouponCodeList> receiveCouponCodeList = data6.getReceiveCouponCodeList();
                    AbstractC5868k.m23671c(receiveCouponCodeList);
                    m20426Y3(receiveCouponCodeList);
                }
                C7709c.m29787d().m29801m(new UpdateCouponReceiveStatus());
            }
            this.f20801b.mo19600e6();
            return;
        }
        this.f20801b.mo19596M4();
    }

    @Override // p301qb.InterfaceC6374c
    /* renamed from: M0 */
    public void mo20431M0(String str, String str2) {
        AbstractC5868k.m23674f(str, "errCode");
        AbstractC5868k.m23674f(str2, "userid");
        if (AbstractC5868k.m23669a(str, "aaa7000")) {
            this.f20801b.mo19597X4("noQualification");
        } else {
            C1466m0 c1466m0 = C1466m0.f5627a;
            c1466m0.m6861d0(c1466m0.m6883r() + 1);
            this.f20801b.mo19597X4("failed");
        }
        this.f20804e.put(str2, Boolean.FALSE);
    }

    @Override // p301qb.InterfaceC6433v1
    /* renamed from: N3 */
    public C4307b mo523N3() {
        return this.f20800a.m19902N3();
    }

    /* renamed from: O3 */
    public final InterfaceC4730f m20432O3() {
        return this.f20801b;
    }

    @Override // p301qb.InterfaceC6371b
    /* renamed from: U2 */
    public void mo20392U2(String str, String str2) {
        AbstractC5868k.m23674f(str, "errCode");
        this.f20801b.mo19595J();
        this.f20801b.mo19596M4();
        if (str2 != null) {
            C1466m0.f5627a.m6850W(false);
        }
    }

    @Override // p160h9.InterfaceC4729e
    /* renamed from: X2 */
    public void mo19592X2() {
        this.f20801b.mo19598a();
        C1466m0 c1466m0 = C1466m0.f5627a;
        String str = c1466m0.m6878m() + "isHasCouponQualification";
        String str2 = c1466m0.m6878m() + "couponQualificationTime";
        String str3 = c1466m0.m6878m() + "couponQualificationInvalidTime";
        C4982a c4982a = C4982a.f20721a;
        AbstractApplicationC7689d.a aVar = AbstractApplicationC7689d.f28135d;
        long parseLong = Long.parseLong((String) c4982a.m20333a(aVar.m29494a(), str2, MessageService.MSG_DB_READY_REPORT));
        long parseLong2 = Long.parseLong((String) c4982a.m20333a(aVar.m29494a(), str3, MessageService.MSG_DB_READY_REPORT));
        long currentTimeMillis = System.currentTimeMillis() - parseLong;
        String str4 = "1";
        if (currentTimeMillis < parseLong2) {
            boolean booleanValue = ((Boolean) c4982a.m20333a(aVar.m29494a(), str, Boolean.FALSE)).booleanValue();
            c1466m0.m6850W(booleanValue);
            if (!booleanValue) {
                str4 = null;
            }
        }
        C0222x1 c0222x1 = new C0222x1(this);
        this.f20803d = c0222x1;
        c0222x1.m780c(c1466m0.m6878m(), c1466m0.m6879n(), null, str4);
    }

    @Override // p301qb.InterfaceC6374c
    /* renamed from: m4 */
    public void mo20433m4(String str) {
        AbstractC5868k.m23674f(str, "userid");
        this.f20804e.put(str, Boolean.TRUE);
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: n2 */
    public void mo6702n2() {
    }

    @Override // p160h9.InterfaceC4729e
    /* renamed from: s1 */
    public void mo19593s1() {
        Map map = this.f20804e;
        C1466m0 c1466m0 = C1466m0.f5627a;
        if (AbstractC5868k.m23669a(map.get(c1466m0.m6878m()), Boolean.TRUE)) {
            return;
        }
        C0225y1 c0225y1 = new C0225y1(this);
        this.f20802c = c0225y1;
        c0225y1.m788b(c1466m0.m6878m(), c1466m0.m6879n());
    }

    @Override // p301qb.InterfaceC6374c
    /* renamed from: w3 */
    public void mo20434w3(ApkReceiveCouponResult apkReceiveCouponResult, String str) {
        AbstractC5868k.m23674f(apkReceiveCouponResult, "t");
        AbstractC5868k.m23674f(str, "userid");
        this.f20801b.mo19597X4(AbstractC3215b.JSON_SUCCESS);
        C0222x1 c0222x1 = this.f20803d;
        if (c0222x1 == null) {
            AbstractC5868k.m23686r("mQueryCouponModel");
            c0222x1 = null;
        }
        C1466m0 c1466m0 = C1466m0.f5627a;
        c0222x1.m780c(c1466m0.m6878m(), c1466m0.m6879n(), null, null);
        this.f20804e.put(str, Boolean.FALSE);
    }
}
