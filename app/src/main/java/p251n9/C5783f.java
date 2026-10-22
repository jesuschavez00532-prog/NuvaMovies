package p251n9;

import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.fragment.app.AbstractC0729o;
import androidx.fragment.app.Fragment;
import be.AbstractC1314j;
import be.C1328x;
import be.InterfaceC1312h;
import cc.C1466m0;
import com.google.gson.reflect.TypeToken;
import com.mine.R$id;
import com.mine.R$layout;
import com.mine.R$string;
import com.module.event.UpdateCouponReceiveStatus;
import com.module.view.LoadingView;
import com.request.result.CouponCodeList;
import com.taobao.agoo.p075a.p076a.AbstractC3215b;
import com.widget.recyclerView.LinearLayoutManagerTV;
import com.widget.recyclerView.RecyclerViewTV;
import com.widget.utils.SimpleItemDecoration;
import com.zhy.autolayout.AutoLinearLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import me.InterfaceC5642a;
import me.InterfaceC5664p;
import ne.AbstractC5864g;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import org.android.agoo.message.MessageService;
import p043ce.AbstractC1500l;
import p100d9.C3974d;
import p160h9.InterfaceC4729e;
import p160h9.InterfaceC4730f;
import p161ha.InterfaceC4786n;
import p192j9.C5025h;
import p238m9.C5612d;
import p238m9.C5620l;
import p317rb.AbstractC6567a;
import p348u2.AbstractC7027d;
import p433zd.AbstractC7786b;
import ye.C7709c;

/* renamed from: n9.f */
/* loaded from: classes2.dex */
public final class C5783f extends AbstractC5774c<InterfaceC4729e> implements InterfaceC4730f {

    /* renamed from: L0 */
    public static final a f23162L0 = new a(null);

    /* renamed from: M0 */
    private static boolean f23163M0;

    /* renamed from: B0 */
    private boolean f23164B0;

    /* renamed from: D0 */
    public boolean f23166D0;

    /* renamed from: E0 */
    private List f23167E0;

    /* renamed from: F0 */
    private final InterfaceC1312h f23168F0;

    /* renamed from: G0 */
    private int f23169G0;

    /* renamed from: H0 */
    private final SimpleItemDecoration f23170H0;

    /* renamed from: I0 */
    public C5620l f23171I0;

    /* renamed from: J0 */
    public C5612d f23172J0;

    /* renamed from: K0 */
    public Map f23173K0 = new LinkedHashMap();

    /* renamed from: C0 */
    public String f23165C0 = "";

    /* renamed from: n9.f$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC5864g abstractC5864g) {
            this();
        }

        /* renamed from: a */
        public final void m23338a(boolean z10) {
            C5783f.f23163M0 = z10;
        }
    }

    /* renamed from: n9.f$b */
    /* loaded from: classes2.dex */
    static final class b extends AbstractC5869l implements InterfaceC5664p {
        b() {
            super(2);
        }

        /* renamed from: a */
        public final void m23339a(int i10, CouponCodeList couponCodeList) {
            C5826y c5826y;
            AbstractC5868k.m23674f(couponCodeList, "bean");
            C5783f.this.f23169G0 = i10;
            if (AbstractC5868k.m23669a(couponCodeList.getStatus(), MessageService.MSG_DB_READY_REPORT)) {
                C5783f.f23162L0.m23338a(true);
                Fragment m3133W6 = C5783f.this.m3133W6();
                if (m3133W6 instanceof C5826y) {
                    c5826y = (C5826y) m3133W6;
                } else {
                    c5826y = null;
                }
                if (c5826y != null) {
                    c5826y.mo23280R9(0, true);
                }
            }
        }

        @Override // me.InterfaceC5664p
        /* renamed from: h */
        public /* bridge */ /* synthetic */ Object mo2391h(Object obj, Object obj2) {
            m23339a(((Number) obj).intValue(), (CouponCodeList) obj2);
            return C1328x.f4998a;
        }
    }

    /* renamed from: n9.f$c */
    /* loaded from: classes2.dex */
    public static final class c extends TypeToken<List<String>> {
        c() {
        }
    }

    /* renamed from: n9.f$d */
    /* loaded from: classes2.dex */
    public static final class d implements InterfaceC4786n {
        d() {
        }

        @Override // p161ha.InterfaceC4786n
        /* renamed from: a */
        public void mo11901a() {
            ((InterfaceC4729e) C5783f.this.m5478w9()).mo19593s1();
        }

        @Override // p161ha.InterfaceC4786n
        public void cancel() {
            C5783f.this.mo19600e6();
            C5783f.this.m23334Z9().mo3278o9();
        }
    }

    /* renamed from: n9.f$e */
    /* loaded from: classes2.dex */
    static final class e extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final e f23176a = new e();

        e() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3974d invoke() {
            return new C3974d();
        }
    }

    public C5783f() {
        InterfaceC1312h m5965b;
        m5965b = AbstractC1314j.m5965b(e.f23176a);
        this.f23168F0 = m5965b;
        this.f23170H0 = new SimpleItemDecoration(AbstractC7786b.m30166j(1), true, false, 4, null);
    }

    /* renamed from: X9 */
    private final C3974d m23326X9() {
        return (C3974d) this.f23168F0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ba */
    public static final void m23327ba(C5783f c5783f) {
        View childAt;
        AbstractC5868k.m23674f(c5783f, "this$0");
        RecyclerViewTV recyclerViewTV = (RecyclerViewTV) c5783f.m23332U9(R$id.mRvList);
        if (recyclerViewTV != null && (childAt = recyclerViewTV.getChildAt(0)) != null) {
            childAt.requestFocus();
        }
    }

    /* renamed from: ca */
    private final void m23328ca() {
        LoadingView loadingView = (LoadingView) m23332U9(R$id.mLoadingView);
        if (loadingView != null) {
            loadingView.setVisibility(8);
        }
        AutoLinearLayout autoLinearLayout = (AutoLinearLayout) m23332U9(R$id.mLLEmpty);
        if (autoLinearLayout != null) {
            autoLinearLayout.setVisibility(8);
        }
        RecyclerViewTV recyclerViewTV = (RecyclerViewTV) m23332U9(R$id.mRvList);
        if (recyclerViewTV != null) {
            recyclerViewTV.setVisibility(0);
        }
    }

    /* renamed from: da */
    private final void m23329da() {
        ((Button) m23332U9(R$id.mShowCouponBtn)).setOnClickListener(new View.OnClickListener() { // from class: n9.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C5783f.m23330ea(C5783f.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ea */
    public static final void m23330ea(C5783f c5783f, View view) {
        AbstractC5868k.m23674f(c5783f, "this$0");
        c5783f.m23331ha();
    }

    /* renamed from: ha */
    private final void m23331ha() {
        if (m23334Z9() != null) {
            C5620l m23334Z9 = m23334Z9();
            AbstractC0729o m3093I6 = m3093I6();
            AbstractC5868k.m23673e(m3093I6, "childFragmentManager");
            m23334Z9.mo3277E9(m3093I6, "ReceivableCouponDialog");
            return;
        }
        String string = m3154d7().getString(R$string.coupons_activity_expired);
        AbstractC5868k.m23673e(string, "resources.getString(R.st…coupons_activity_expired)");
        Toast.makeText(m3096J6(), string, 0).show();
    }

    @Override // ba.AbstractC1196d
    /* renamed from: A9 */
    public int mo5451A9() {
        return R$layout.fragment_coupon;
    }

    @Override // p160h9.InterfaceC4730f
    /* renamed from: H0 */
    public void mo19594H0(List list) {
        if (list != null) {
            m23337ga(new C5620l());
            m23334Z9().m22820L9(new d());
            m23334Z9().m22819K9(list);
            if (!f23163M0) {
                C5620l m23334Z9 = m23334Z9();
                AbstractC0729o m3093I6 = m3093I6();
                AbstractC5868k.m23673e(m3093I6, "childFragmentManager");
                m23334Z9.mo3277E9(m3093I6, "ReceivableCouponDialog");
                return;
            }
            f23163M0 = false;
            mo19600e6();
        }
    }

    @Override // p251n9.AbstractC5774c
    /* renamed from: H9 */
    protected boolean mo23232H9() {
        return false;
    }

    @Override // p251n9.AbstractC5774c
    /* renamed from: I9 */
    public boolean mo23265I9() {
        boolean z10;
        boolean z11;
        View childAt;
        AutoLinearLayout autoLinearLayout = (AutoLinearLayout) m23332U9(R$id.mLlCouponGetHint);
        if (autoLinearLayout != null && autoLinearLayout.hasFocus()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return true;
        }
        RecyclerViewTV recyclerViewTV = (RecyclerViewTV) m23332U9(R$id.mRvList);
        if (recyclerViewTV != null && (childAt = recyclerViewTV.getChildAt(0)) != null && childAt.hasFocus()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            return true;
        }
        return false;
    }

    @Override // p160h9.InterfaceC4730f
    /* renamed from: J */
    public void mo19595J() {
        LoadingView loadingView = (LoadingView) m23332U9(R$id.mLoadingView);
        if (loadingView != null) {
            loadingView.setVisibility(8);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        if (r0 != false) goto L16;
     */
    @Override // p251n9.AbstractC5774c
    /* renamed from: L9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean mo23233L9() {
        /*
            r4 = this;
            int r0 = com.mine.R$id.mRvList
            android.view.View r0 = r4.m23332U9(r0)
            com.widget.recyclerView.RecyclerViewTV r0 = (com.widget.recyclerView.RecyclerViewTV) r0
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L14
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L14
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            if (r0 != 0) goto L2c
            int r0 = com.mine.R$id.mLlCouponGetHint
            android.view.View r0 = r4.m23332U9(r0)
            com.zhy.autolayout.AutoLinearLayout r0 = (com.zhy.autolayout.AutoLinearLayout) r0
            if (r0 == 0) goto L29
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L29
            r0 = 1
            goto L2a
        L29:
            r0 = 0
        L2a:
            if (r0 == 0) goto L44
        L2c:
            int r0 = com.mine.R$id.mLoadingView
            android.view.View r0 = r4.m23332U9(r0)
            com.module.view.LoadingView r0 = (com.module.view.LoadingView) r0
            if (r0 == 0) goto L40
            int r0 = r0.getVisibility()
            r3 = 8
            if (r0 != r3) goto L40
            r0 = 1
            goto L41
        L40:
            r0 = 0
        L41:
            if (r0 == 0) goto L44
            goto L45
        L44:
            r1 = 0
        L45:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p251n9.C5783f.mo23233L9():boolean");
    }

    @Override // p160h9.InterfaceC4730f
    /* renamed from: M4 */
    public void mo19596M4() {
        LoadingView loadingView = (LoadingView) m23332U9(R$id.mLoadingView);
        if (loadingView != null) {
            loadingView.setVisibility(8);
        }
        AutoLinearLayout autoLinearLayout = (AutoLinearLayout) m23332U9(R$id.mLLEmpty);
        if (autoLinearLayout != null) {
            autoLinearLayout.setVisibility(0);
        }
        RecyclerViewTV recyclerViewTV = (RecyclerViewTV) m23332U9(R$id.mRvList);
        if (recyclerViewTV != null) {
            recyclerViewTV.setVisibility(8);
        }
    }

    @Override // p251n9.AbstractC5774c
    /* renamed from: M9 */
    public boolean mo23276M9() {
        boolean z10;
        boolean z11;
        RecyclerViewTV recyclerViewTV = (RecyclerViewTV) m23332U9(R$id.mRvList);
        if (recyclerViewTV != null && recyclerViewTV.hasFocus()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return true;
        }
        AutoLinearLayout autoLinearLayout = (AutoLinearLayout) m23332U9(R$id.mLlCouponGetHint);
        if (autoLinearLayout != null && autoLinearLayout.hasFocus()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            return true;
        }
        return false;
    }

    @Override // p251n9.AbstractC5774c
    /* renamed from: N9 */
    public void mo23277N9() {
        boolean z10;
        RecyclerViewTV recyclerViewTV;
        AutoLinearLayout autoLinearLayout = (AutoLinearLayout) m23332U9(R$id.mLlCouponGetHint);
        boolean z11 = true;
        if (autoLinearLayout != null && autoLinearLayout.getVisibility() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            Button button = (Button) m23332U9(R$id.mShowCouponBtn);
            if (button != null) {
                button.requestFocus();
                return;
            }
            return;
        }
        int i10 = R$id.mRvList;
        RecyclerViewTV recyclerViewTV2 = (RecyclerViewTV) m23332U9(i10);
        if (recyclerViewTV2 == null || recyclerViewTV2.getVisibility() != 0) {
            z11 = false;
        }
        if (z11 && (recyclerViewTV = (RecyclerViewTV) m23332U9(i10)) != null) {
            recyclerViewTV.post(new Runnable() { // from class: n9.d
                @Override // java.lang.Runnable
                public final void run() {
                    C5783f.m23327ba(C5783f.this);
                }
            });
        }
    }

    @Override // p251n9.AbstractC5774c, ba.AbstractC1196d, p430z9.AbstractC7765c, p164hd.AbstractC4817b, androidx.fragment.app.Fragment
    /* renamed from: S7 */
    public /* synthetic */ void mo3123S7() {
        super.mo3123S7();
        mo5459m9();
    }

    /* renamed from: U9 */
    public View m23332U9(int i10) {
        View findViewById;
        Map map = this.f23173K0;
        View view = (View) map.get(Integer.valueOf(i10));
        if (view != null) {
            return view;
        }
        View m3182n7 = m3182n7();
        if (m3182n7 == null || (findViewById = m3182n7.findViewById(i10)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i10), findViewById);
        return findViewById;
    }

    @Override // p160h9.InterfaceC4730f
    /* renamed from: X4 */
    public void mo19597X4(String str) {
        AbstractC5868k.m23674f(str, "msg");
        int hashCode = str.hashCode();
        if (hashCode != -1867169789) {
            if (hashCode != -1787829842) {
                if (hashCode == -1281977283 && str.equals("failed")) {
                    if (C1466m0.f5627a.m6883r() > 2) {
                        String string = m3154d7().getString(R$string.coupons_retrieve_failed_again);
                        AbstractC5868k.m23673e(string, "resources.getString(R.st…ns_retrieve_failed_again)");
                        Toast.makeText(m3096J6(), string, 1).show();
                        return;
                    } else {
                        String string2 = m3154d7().getString(R$string.coupons_retrieve_failed);
                        AbstractC5868k.m23673e(string2, "resources.getString(R.st….coupons_retrieve_failed)");
                        Toast.makeText(m3096J6(), string2, 0).show();
                        return;
                    }
                }
                return;
            }
            if (str.equals("noQualification")) {
                String string3 = m3154d7().getString(R$string.coupons_activity_expired);
                AbstractC5868k.m23673e(string3, "resources.getString(R.st…coupons_activity_expired)");
                Toast.makeText(m3096J6(), string3, 0).show();
                C1466m0 c1466m0 = C1466m0.f5627a;
                c1466m0.m6856b();
                C7709c.m29787d().m29801m(new UpdateCouponReceiveStatus());
                c1466m0.m6861d0(0);
                c1466m0.m6850W(false);
                m23334Z9().mo3278o9();
                mo19600e6();
                return;
            }
            return;
        }
        if (str.equals(AbstractC3215b.JSON_SUCCESS)) {
            C1466m0 c1466m02 = C1466m0.f5627a;
            c1466m02.m6850W(false);
            c1466m02.m6856b();
            c1466m02.m6861d0(0);
            C7709c.m29787d().m29801m(new UpdateCouponReceiveStatus());
            String string4 = m3154d7().getString(R$string.coupons_retrieve_success);
            AbstractC5868k.m23673e(string4, "resources.getString(R.st…coupons_retrieve_success)");
            Toast.makeText(m3096J6(), string4, 0).show();
            m23334Z9().mo3278o9();
            mo19600e6();
        }
    }

    /* renamed from: Y9 */
    public final C5612d m23333Y9() {
        C5612d c5612d = this.f23172J0;
        if (c5612d != null) {
            return c5612d;
        }
        AbstractC5868k.m23686r("mCouponDialog");
        return null;
    }

    /* renamed from: Z9 */
    public final C5620l m23334Z9() {
        C5620l c5620l = this.f23171I0;
        if (c5620l != null) {
            return c5620l;
        }
        AbstractC5868k.m23686r("mReceivableCouponDialog");
        return null;
    }

    @Override // p160h9.InterfaceC4730f
    /* renamed from: a */
    public void mo19598a() {
        LoadingView loadingView = (LoadingView) m23332U9(R$id.mLoadingView);
        if (loadingView != null) {
            loadingView.setVisibility(0);
        }
    }

    @Override // ba.AbstractC1196d
    /* renamed from: aa, reason: merged with bridge method [inline-methods] */
    public InterfaceC4729e mo5465y9() {
        return new C5025h(this, this);
    }

    @Override // p160h9.InterfaceC4730f
    /* renamed from: d2 */
    public void mo19599d2(List list) {
        int i10;
        if (list != null) {
            i10 = list.size();
        } else {
            i10 = 0;
        }
        if (i10 > 0) {
            AbstractC5868k.m23671c(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
            }
            m23328ca();
            m23326X9().m28856n(list);
            if (this.f23166D0) {
                ArrayList arrayList = new ArrayList();
                int i11 = 0;
                for (Object obj : list) {
                    int i12 = i11 + 1;
                    if (i11 < 0) {
                        AbstractC1500l.m6991j();
                    }
                    arrayList.add(((CouponCodeList) list.get(i11)).getId());
                    i11 = i12;
                }
                List list2 = this.f23167E0;
                if (list2 == null) {
                    AbstractC5868k.m23686r("mCouponIdList");
                    list2 = null;
                }
                int i13 = 0;
                for (Object obj2 : list2) {
                    int i14 = i13 + 1;
                    if (i13 < 0) {
                        AbstractC1500l.m6991j();
                    }
                    String str = (String) obj2;
                    if (arrayList.contains(str)) {
                        arrayList.remove(str);
                    }
                    i13 = i14;
                }
                ArrayList arrayList2 = new ArrayList();
                int i15 = 0;
                for (Object obj3 : list) {
                    int i16 = i15 + 1;
                    if (i15 < 0) {
                        AbstractC1500l.m6991j();
                    }
                    CouponCodeList couponCodeList = (CouponCodeList) obj3;
                    if (arrayList.contains(couponCodeList.getId())) {
                        arrayList2.add(couponCodeList);
                    }
                    i15 = i16;
                }
                m23336fa(new C5612d(arrayList2));
                if (AbstractC6567a.m25638h(arrayList2)) {
                    C5612d m23333Y9 = m23333Y9();
                    AbstractC0729o m3093I6 = m3093I6();
                    AbstractC5868k.m23673e(m3093I6, "childFragmentManager");
                    m23333Y9.mo3277E9(m3093I6, "ReceivedCouponDialog");
                }
                this.f23166D0 = false;
                return;
            }
            return;
        }
        mo19596M4();
    }

    @Override // p160h9.InterfaceC4730f
    /* renamed from: e6 */
    public void mo19600e6() {
        if (C1466m0.f5627a.m6832E()) {
            AutoLinearLayout autoLinearLayout = (AutoLinearLayout) m23332U9(R$id.mLlCouponGetHint);
            if (autoLinearLayout != null) {
                autoLinearLayout.setVisibility(0);
            }
            AutoLinearLayout autoLinearLayout2 = (AutoLinearLayout) m23332U9(R$id.mLayoutCouponTips);
            if (autoLinearLayout2 != null) {
                autoLinearLayout2.setVisibility(8);
                return;
            }
            return;
        }
        AutoLinearLayout autoLinearLayout3 = (AutoLinearLayout) m23332U9(R$id.mLayoutCouponTips);
        if (autoLinearLayout3 != null) {
            autoLinearLayout3.setVisibility(0);
        }
        AutoLinearLayout autoLinearLayout4 = (AutoLinearLayout) m23332U9(R$id.mLlCouponGetHint);
        if (autoLinearLayout4 != null) {
            autoLinearLayout4.setVisibility(8);
        }
    }

    /* renamed from: fa */
    public final void m23336fa(C5612d c5612d) {
        AbstractC5868k.m23674f(c5612d, "<set-?>");
        this.f23172J0 = c5612d;
    }

    @Override // p164hd.AbstractC4817b, androidx.fragment.app.Fragment
    /* renamed from: g8 */
    public void mo3164g8() {
        super.mo3164g8();
        ((InterfaceC4729e) m5478w9()).mo19592X2();
    }

    /* renamed from: ga */
    public final void m23337ga(C5620l c5620l) {
        AbstractC5868k.m23674f(c5620l, "<set-?>");
        this.f23171I0 = c5620l;
    }

    @Override // p251n9.AbstractC5774c, ba.AbstractC1196d, p430z9.AbstractC7765c
    /* renamed from: m9 */
    public void mo5459m9() {
        this.f23173K0.clear();
    }

    @Override // p430z9.AbstractC7765c
    /* renamed from: n9 */
    public void mo5460n9() {
        AutoLinearLayout autoLinearLayout = (AutoLinearLayout) m23332U9(R$id.mLayoutCouponTips);
        boolean z10 = false;
        if (autoLinearLayout != null) {
            autoLinearLayout.setVisibility(0);
        }
        m23326X9().setHasStableIds(true);
        int i10 = R$id.mRvList;
        RecyclerViewTV recyclerViewTV = (RecyclerViewTV) m23332U9(i10);
        if (recyclerViewTV != null) {
            recyclerViewTV.setHasFixedSize(true);
        }
        RecyclerViewTV recyclerViewTV2 = (RecyclerViewTV) m23332U9(i10);
        if (recyclerViewTV2 != null) {
            recyclerViewTV2.setLayoutManager(new LinearLayoutManagerTV(m3096J6(), 1, false));
        }
        RecyclerViewTV recyclerViewTV3 = (RecyclerViewTV) m23332U9(i10);
        if (recyclerViewTV3 != null) {
            recyclerViewTV3.setAdapter(m23326X9());
        }
        RecyclerViewTV recyclerViewTV4 = (RecyclerViewTV) m23332U9(i10);
        if (recyclerViewTV4 != null) {
            recyclerViewTV4.addItemDecoration(this.f23170H0);
        }
        m23326X9().m16842x(new b());
        if (this.f23166D0) {
            if (this.f23165C0.length() > 0) {
                z10 = true;
            }
            if (z10) {
                Object fromJson = AbstractC7027d.m27114a().fromJson(this.f23165C0, new c().getType());
                AbstractC5868k.m23673e(fromJson, "getJsoner().fromJson(cou…eList<String>>() {}.type)");
                this.f23167E0 = (List) fromJson;
            } else {
                this.f23167E0 = new ArrayList();
            }
        }
        m23329da();
    }

    @Override // p430z9.AbstractC7765c
    /* renamed from: q9 */
    protected void mo5463q9() {
    }

    @Override // ba.AbstractC1196d
    /* renamed from: x9 */
    public boolean mo5464x9() {
        return this.f23164B0;
    }
}
