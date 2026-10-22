package com.vod.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import be.C1328x;
import com.bumptech.glide.ComponentCallbacks2C1586c;
import com.module.view.VodSelectionView;
import com.open.leanback.widget.AbstractC3050a;
import com.open.leanback.widget.HorizontalGridView;
import com.request.result.AssetData;
import com.request.result.SameSeasonSeriesBean;
import com.request.result.SimpleProgramList;
import com.umeng.analytics.pro.C3384f;
import com.vod.R$id;
import com.vod.R$layout;
import com.vod.view.VodDetailBottomScrollView;
import com.zhy.autolayout.AutoFrameLayout;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import me.InterfaceC5642a;
import me.InterfaceC5660l;
import me.InterfaceC5664p;
import ne.AbstractC5864g;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p102db.C4088y0;
import p198k.C5076a;
import p212kd.C5245x2;
import p242n0.AbstractC5718e;
import p400xa.AbstractC7555b0;

/* loaded from: classes3.dex */
public final class VodDetailBottomScrollView extends NestedScrollView {

    /* renamed from: C */
    private boolean f17476C;

    /* renamed from: D */
    private String f17477D;

    /* renamed from: E */
    private AssetData f17478E;

    /* renamed from: F */
    private int f17479F;

    /* renamed from: G */
    private int f17480G;

    /* renamed from: H */
    private InterfaceC5664p f17481H;

    /* renamed from: I */
    private C5245x2 f17482I;

    /* renamed from: J */
    private int f17483J;

    /* renamed from: K */
    private boolean f17484K;

    /* renamed from: L */
    private String f17485L;

    /* renamed from: M */
    private boolean f17486M;

    /* renamed from: N */
    private List f17487N;

    /* renamed from: O */
    private InterfaceC5642a f17488O;

    /* renamed from: V */
    private InterfaceC5660l f17489V;

    /* renamed from: W */
    private Boolean f17490W;

    /* renamed from: g0 */
    public Map f17491g0;

    /* renamed from: com.vod.view.VodDetailBottomScrollView$a */
    /* loaded from: classes3.dex */
    public static final class C3877a implements C5076a.e {
        C3877a() {
        }

        @Override // p198k.C5076a.e
        /* renamed from: a */
        public void mo11400a(View view, int i10, ViewGroup viewGroup) {
            AbstractC5868k.m23674f(view, "view");
            VodDetailBottomScrollView.this.addView(view);
            VodDetailBottomScrollView.this.m16642q0();
            VodDetailBottomScrollView.this.f17476C = true;
            AssetData assetData = VodDetailBottomScrollView.this.f17478E;
            if (assetData != null) {
                VodDetailBottomScrollView vodDetailBottomScrollView = VodDetailBottomScrollView.this;
                vodDetailBottomScrollView.m16653w0(assetData, vodDetailBottomScrollView.f17477D, vodDetailBottomScrollView.f17485L, vodDetailBottomScrollView.f17481H);
            }
            if (VodDetailBottomScrollView.this.f17486M) {
                VodDetailBottomScrollView vodDetailBottomScrollView2 = VodDetailBottomScrollView.this;
                vodDetailBottomScrollView2.m16654y0(vodDetailBottomScrollView2.f17487N, VodDetailBottomScrollView.this.f17483J, VodDetailBottomScrollView.this.f17484K);
            }
            Boolean bool = VodDetailBottomScrollView.this.f17490W;
            if (bool != null) {
                VodDetailBottomScrollView.this.setChildFocusable(bool.booleanValue());
            }
        }
    }

    /* renamed from: com.vod.view.VodDetailBottomScrollView$b */
    /* loaded from: classes3.dex */
    public static final class C3878b extends AbstractC3050a.f {
        C3878b() {
        }

        @Override // com.open.leanback.widget.AbstractC3050a.f
        /* renamed from: a */
        public void mo12522a() {
            Context context = VodDetailBottomScrollView.this.getContext();
            AbstractC5868k.m23673e(context, C3384f.f14563X);
            if (AbstractC5718e.m23111a(context)) {
                return;
            }
            ComponentCallbacks2C1586c.m7282u(VodDetailBottomScrollView.this.getContext().getApplicationContext()).m7391q();
        }

        @Override // com.open.leanback.widget.AbstractC3050a.f
        /* renamed from: b */
        public void mo12523b() {
        }

        @Override // com.open.leanback.widget.AbstractC3050a.f
        /* renamed from: c */
        public void mo12524c() {
            Context context = VodDetailBottomScrollView.this.getContext();
            AbstractC5868k.m23673e(context, C3384f.f14563X);
            if (AbstractC5718e.m23111a(context)) {
                return;
            }
            ComponentCallbacks2C1586c.m7282u(VodDetailBottomScrollView.this.getContext().getApplicationContext()).m7390p();
        }
    }

    /* renamed from: com.vod.view.VodDetailBottomScrollView$c */
    /* loaded from: classes3.dex */
    public static final class C3879c implements VodSelectionView.InterfaceC3028b {
        C3879c() {
        }

        @Override // com.module.view.VodSelectionView.InterfaceC3028b
        /* renamed from: a */
        public boolean mo12329a() {
            boolean z10;
            AutoFrameLayout autoFrameLayout = (AutoFrameLayout) VodDetailBottomScrollView.this.m16649X(R$id.llSeanson);
            if (autoFrameLayout != null && autoFrameLayout.getVisibility() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                return false;
            }
            ((AutoFrameLayout) VodDetailBottomScrollView.this.m16649X(R$id.flChoose)).requestFocus();
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.vod.view.VodDetailBottomScrollView$d */
    /* loaded from: classes3.dex */
    public static final class C3880d extends AbstractC5869l implements InterfaceC5664p {

        /* renamed from: a */
        public static final C3880d f17495a = new C3880d();

        C3880d() {
            super(2);
        }

        @Override // me.InterfaceC5664p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer mo2391h(SameSeasonSeriesBean sameSeasonSeriesBean, SameSeasonSeriesBean sameSeasonSeriesBean2) {
            return Integer.valueOf(sameSeasonSeriesBean2.getSeasonNumber() - sameSeasonSeriesBean.getSeasonNumber());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.vod.view.VodDetailBottomScrollView$e */
    /* loaded from: classes3.dex */
    public static final class C3881e extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: b */
        final /* synthetic */ AssetData f17497b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.vod.view.VodDetailBottomScrollView$e$a */
        /* loaded from: classes3.dex */
        public static final class a extends AbstractC5869l implements InterfaceC5664p {

            /* renamed from: a */
            final /* synthetic */ VodDetailBottomScrollView f17498a;

            /* renamed from: b */
            final /* synthetic */ AssetData f17499b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(VodDetailBottomScrollView vodDetailBottomScrollView, AssetData assetData) {
                super(2);
                this.f17498a = vodDetailBottomScrollView;
                this.f17499b = assetData;
            }

            /* renamed from: a */
            public final Boolean m16657a(int i10, SimpleProgramList simpleProgramList) {
                boolean z10;
                AbstractC5868k.m23674f(simpleProgramList, "simpleProgramList");
                if (this.f17498a.f17479F == i10) {
                    InterfaceC5664p interfaceC5664p = this.f17498a.f17481H;
                    if (interfaceC5664p != null) {
                        interfaceC5664p.mo2391h(Integer.valueOf(i10), Boolean.FALSE);
                    }
                    z10 = true;
                } else {
                    int i11 = this.f17498a.f17479F;
                    List<SimpleProgramList> simpleProgramList2 = this.f17499b.getSimpleProgramList();
                    AbstractC5868k.m23671c(simpleProgramList2);
                    if (i11 < simpleProgramList2.size()) {
                        InterfaceC5664p interfaceC5664p2 = this.f17498a.f17481H;
                        if (interfaceC5664p2 != null) {
                            interfaceC5664p2.mo2391h(Integer.valueOf(i10), Boolean.TRUE);
                        }
                        this.f17498a.f17479F = i10;
                        ((VodSelectionView) this.f17498a.m16649X(R$id.mSelectionView)).m12325D(this.f17498a.f17479F, simpleProgramList.getSeriesNumber());
                    }
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            }

            @Override // me.InterfaceC5664p
            /* renamed from: h */
            public /* bridge */ /* synthetic */ Object mo2391h(Object obj, Object obj2) {
                return m16657a(((Number) obj).intValue(), (SimpleProgramList) obj2);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C3881e(AssetData assetData) {
            super(0);
            this.f17497b = assetData;
        }

        /* renamed from: a */
        public final void m16656a() {
            int i10 = VodDetailBottomScrollView.this.f17479F;
            List<SimpleProgramList> simpleProgramList = this.f17497b.getSimpleProgramList();
            AbstractC5868k.m23671c(simpleProgramList);
            if (i10 < simpleProgramList.size()) {
                VodSelectionView vodSelectionView = (VodSelectionView) VodDetailBottomScrollView.this.m16649X(R$id.mSelectionView);
                int i11 = VodDetailBottomScrollView.this.f17479F;
                List<SimpleProgramList> simpleProgramList2 = this.f17497b.getSimpleProgramList();
                AbstractC5868k.m23671c(simpleProgramList2);
                vodSelectionView.m12325D(i11, simpleProgramList2.get(VodDetailBottomScrollView.this.f17479F).getSeriesNumber());
            }
            ((VodSelectionView) VodDetailBottomScrollView.this.m16649X(R$id.mSelectionView)).setOnItemClickListener(new a(VodDetailBottomScrollView.this, this.f17497b));
        }

        @Override // me.InterfaceC5642a
        public /* bridge */ /* synthetic */ Object invoke() {
            m16656a();
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.vod.view.VodDetailBottomScrollView$f */
    /* loaded from: classes3.dex */
    public static final class C3882f extends AbstractC5869l implements InterfaceC5660l {
        C3882f() {
            super(1);
        }

        /* renamed from: a */
        public final void m16658a(SameSeasonSeriesBean sameSeasonSeriesBean) {
            AbstractC5868k.m23674f(sameSeasonSeriesBean, "it");
            VodDetailBottomScrollView.this.f17485L = sameSeasonSeriesBean.getContentId();
            InterfaceC5660l interfaceC5660l = VodDetailBottomScrollView.this.f17489V;
            if (interfaceC5660l != null) {
                interfaceC5660l.mo542f(sameSeasonSeriesBean.getContentId());
            }
            ((VodSelectionView) VodDetailBottomScrollView.this.m16649X(R$id.mSelectionView)).m12328z();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m16658a((SameSeasonSeriesBean) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VodDetailBottomScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC5868k.m23674f(context, C3384f.f14563X);
    }

    /* renamed from: n0 */
    private final String m16641n0(int i10, Object... objArr) {
        String string = getContext().getString(i10, Arrays.copyOf(objArr, objArr.length));
        AbstractC5868k.m23673e(string, "context.getString(resId, *formatArgs)");
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q0 */
    public final void m16642q0() {
        this.f17482I = new C5245x2(this.f17488O);
        int i10 = R$id.mGridRelated;
        ((HorizontalGridView) m16649X(i10)).setAdapter(this.f17482I);
        HorizontalGridView horizontalGridView = (HorizontalGridView) m16649X(i10);
        AbstractC5868k.m23673e(horizontalGridView, "mGridRelated");
        AbstractC7555b0.m28958l(horizontalGridView, false, true, null, 4, null);
        ((HorizontalGridView) m16649X(i10)).setOnScrollChangeListener(new C3878b());
        ((HorizontalGridView) m16649X(i10)).setOnKeyInterceptListener(new AbstractC3050a.c() { // from class: wd.x
            @Override // com.open.leanback.widget.AbstractC3050a.c
            /* renamed from: a */
            public final boolean mo12521a(KeyEvent keyEvent) {
                boolean m16643r0;
                m16643r0 = VodDetailBottomScrollView.m16643r0(VodDetailBottomScrollView.this, keyEvent);
                return m16643r0;
            }
        });
        int i11 = R$id.llSeanson;
        ((AutoFrameLayout) m16649X(i11)).setOnKeyListener(new View.OnKeyListener() { // from class: wd.y
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i12, KeyEvent keyEvent) {
                boolean m16644s0;
                m16644s0 = VodDetailBottomScrollView.m16644s0(VodDetailBottomScrollView.this, view, i12, keyEvent);
                return m16644s0;
            }
        });
        ((AutoFrameLayout) m16649X(i11)).setOnClickListener(new View.OnClickListener() { // from class: wd.z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VodDetailBottomScrollView.m16645t0(VodDetailBottomScrollView.this, view);
            }
        });
        ((VodSelectionView) m16649X(R$id.mSelectionView)).setFocusListener(new C3879c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r0 */
    public static final boolean m16643r0(VodDetailBottomScrollView vodDetailBottomScrollView, KeyEvent keyEvent) {
        AbstractC5868k.m23674f(vodDetailBottomScrollView, "this$0");
        if (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 19 || vodDetailBottomScrollView.getScrollY() <= 0) {
            return false;
        }
        vodDetailBottomScrollView.scrollTo(0, 0);
        int i10 = R$id.mSelectionView;
        if (((VodSelectionView) vodDetailBottomScrollView.m16649X(i10)).getVisibility() == 0) {
            ((VodSelectionView) vodDetailBottomScrollView.m16649X(i10)).requestFocus(33);
        } else {
            int i11 = R$id.flChoose;
            if (((AutoFrameLayout) vodDetailBottomScrollView.m16649X(i11)).getVisibility() == 0) {
                int i12 = R$id.llSeanson;
                if (((AutoFrameLayout) vodDetailBottomScrollView.m16649X(i12)).getVisibility() == 0) {
                    ((AutoFrameLayout) vodDetailBottomScrollView.m16649X(i12)).requestFocus();
                } else {
                    ((AutoFrameLayout) vodDetailBottomScrollView.m16649X(i11)).requestFocus(33);
                }
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s0 */
    public static final boolean m16644s0(VodDetailBottomScrollView vodDetailBottomScrollView, View view, int i10, KeyEvent keyEvent) {
        AbstractC5868k.m23674f(vodDetailBottomScrollView, "this$0");
        if (keyEvent.getAction() == 0 && i10 == 20) {
            int i11 = R$id.mSelectionView;
            if (((VodSelectionView) vodDetailBottomScrollView.m16649X(i11)).getVisibility() == 0) {
                ((VodSelectionView) vodDetailBottomScrollView.m16649X(i11)).m12327x();
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t0 */
    public static final void m16645t0(VodDetailBottomScrollView vodDetailBottomScrollView, View view) {
        AbstractC5868k.m23674f(vodDetailBottomScrollView, "this$0");
        vodDetailBottomScrollView.m16648z0();
    }

    /* renamed from: v0 */
    public static /* synthetic */ void m16646v0(VodDetailBottomScrollView vodDetailBottomScrollView, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        vodDetailBottomScrollView.m16652u0(i10, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x0 */
    public static final int m16647x0(InterfaceC5664p interfaceC5664p, Object obj, Object obj2) {
        AbstractC5868k.m23674f(interfaceC5664p, "$tmp0");
        return ((Number) interfaceC5664p.mo2391h(obj, obj2)).intValue();
    }

    /* renamed from: z0 */
    private final void m16648z0() {
        List<SameSeasonSeriesBean> list;
        Context context = getContext();
        AbstractC5868k.m23673e(context, C3384f.f14563X);
        C4088y0 c4088y0 = new C4088y0(context);
        AutoFrameLayout autoFrameLayout = (AutoFrameLayout) m16649X(R$id.llSeanson);
        AbstractC5868k.m23673e(autoFrameLayout, "llSeanson");
        AssetData assetData = this.f17478E;
        if (assetData != null) {
            list = assetData.getSameSeasonSeriesList();
        } else {
            list = null;
        }
        int i10 = this.f17480G;
        ImageView imageView = (ImageView) m16649X(R$id.ivArrow);
        AbstractC5868k.m23673e(imageView, "ivArrow");
        c4088y0.m17121c(autoFrameLayout, list, i10, imageView, new C3882f());
    }

    /* renamed from: X */
    public View m16649X(int i10) {
        Map map = this.f17491g0;
        View view = (View) map.get(Integer.valueOf(i10));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i10);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i10), findViewById);
        return findViewById;
    }

    public final int getPlayIndex() {
        return this.f17479F;
    }

    /* renamed from: o0 */
    public final Boolean m16650o0() {
        boolean z10;
        if (!this.f17476C || ((HorizontalGridView) m16649X(R$id.mGridRelated)).getFocusedChild() == null) {
            return null;
        }
        int i10 = R$id.mSelectionView;
        if (((VodSelectionView) m16649X(i10)).getVisibility() == 0) {
            ((VodSelectionView) m16649X(i10)).requestFocus(33);
            return Boolean.TRUE;
        }
        int i11 = R$id.llSeanson;
        AutoFrameLayout autoFrameLayout = (AutoFrameLayout) m16649X(i11);
        boolean z11 = true;
        if (autoFrameLayout != null && autoFrameLayout.getVisibility() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            AutoFrameLayout autoFrameLayout2 = (AutoFrameLayout) m16649X(R$id.flChoose);
            if (autoFrameLayout2 == null || autoFrameLayout2.getVisibility() != 0) {
                z11 = false;
            }
            if (z11) {
                ((AutoFrameLayout) m16649X(i11)).requestFocus(33);
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    /* renamed from: p0 */
    public final boolean m16651p0() {
        boolean z10;
        boolean z11;
        if (!this.f17476C) {
            return false;
        }
        AutoFrameLayout autoFrameLayout = (AutoFrameLayout) m16649X(R$id.llSeanson);
        if (autoFrameLayout != null && autoFrameLayout.getVisibility() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            int i10 = R$id.flChoose;
            AutoFrameLayout autoFrameLayout2 = (AutoFrameLayout) m16649X(i10);
            if (autoFrameLayout2 != null && autoFrameLayout2.getVisibility() == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                ((AutoFrameLayout) m16649X(i10)).requestFocus(130);
                return true;
            }
        }
        int i11 = R$id.mSelectionView;
        if (((VodSelectionView) m16649X(i11)).getVisibility() != 0) {
            return false;
        }
        ((VodSelectionView) m16649X(i11)).requestFocus(130);
        return true;
    }

    public final void setChildFocusable(boolean z10) {
        this.f17490W = Boolean.valueOf(z10);
        if (!this.f17476C) {
            return;
        }
        if (z10) {
            int i10 = R$id.mGridRelated;
            ((HorizontalGridView) m16649X(i10)).setDescendantFocusability(262144);
            ((HorizontalGridView) m16649X(i10)).setFocusable(true);
            int i11 = R$id.mSelectionView;
            ((VodSelectionView) m16649X(i11)).setDescendantFocusability(262144);
            ((VodSelectionView) m16649X(i11)).setFocusable(true);
            ((AutoFrameLayout) m16649X(R$id.llSeanson)).setFocusable(true);
            return;
        }
        int i12 = R$id.mGridRelated;
        ((HorizontalGridView) m16649X(i12)).setDescendantFocusability(393216);
        ((HorizontalGridView) m16649X(i12)).setFocusable(false);
        int i13 = R$id.mSelectionView;
        ((VodSelectionView) m16649X(i13)).setDescendantFocusability(393216);
        ((VodSelectionView) m16649X(i13)).setFocusable(false);
        ((AutoFrameLayout) m16649X(R$id.llSeanson)).setFocusable(false);
    }

    public final void setSelectSeaonListener(InterfaceC5660l interfaceC5660l) {
        AbstractC5868k.m23674f(interfaceC5660l, "selecteSeaonListener");
        this.f17489V = interfaceC5660l;
    }

    public final void setStartNewVodAtyListener(InterfaceC5642a interfaceC5642a) {
        AbstractC5868k.m23674f(interfaceC5642a, "startNewVodAtyListener");
        this.f17488O = interfaceC5642a;
    }

    /* renamed from: u0 */
    public final void m16652u0(int i10, boolean z10) {
        this.f17479F = i10;
        if (!z10 && this.f17476C) {
            VodSelectionView vodSelectionView = (VodSelectionView) m16649X(R$id.mSelectionView);
            AbstractC5868k.m23673e(vodSelectionView, "mSelectionView");
            VodSelectionView.m12295E(vodSelectionView, this.f17479F, 0, 2, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
    
        if (r8 <= 1) goto L12;
     */
    /* renamed from: w0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m16653w0(com.request.result.AssetData r7, java.lang.String r8, java.lang.String r9, me.InterfaceC5664p r10) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vod.view.VodDetailBottomScrollView.m16653w0(com.request.result.AssetData, java.lang.String, java.lang.String, me.p):void");
    }

    /* renamed from: y0 */
    public final void m16654y0(List list, int i10, boolean z10) {
        this.f17487N = list;
        this.f17483J = i10;
        this.f17484K = z10;
        this.f17486M = true;
        if (!this.f17476C) {
            return;
        }
        C5245x2 c5245x2 = this.f17482I;
        if (c5245x2 != null) {
            c5245x2.m21132w(i10);
        }
        C5245x2 c5245x22 = this.f17482I;
        if (c5245x22 != null) {
            c5245x22.m21133x(z10);
        }
        if (list != null) {
            ((HorizontalGridView) m16649X(R$id.mGridRelated)).setVisibility(0);
            C5245x2 c5245x23 = this.f17482I;
            if (c5245x23 != null) {
                c5245x23.m28856n(list);
                return;
            }
            return;
        }
        ((HorizontalGridView) m16649X(R$id.mGridRelated)).setVisibility(8);
        ((TextView) m16649X(R$id.mTextNoRelatedTip)).setVisibility(0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VodDetailBottomScrollView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        this.f17491g0 = new LinkedHashMap();
        this.f17477D = "";
        this.f17480G = -1;
        this.f17485L = "";
        if (isInEditMode()) {
            LayoutInflater.from(context).inflate(R$layout.layout_vod_detail_bottom_panel, (ViewGroup) this, true);
            this.f17476C = true;
            m16642q0();
            return;
        }
        new C5076a(context).m20545a(R$layout.layout_vod_detail_bottom_panel, this, new C3877a());
    }

    public /* synthetic */ VodDetailBottomScrollView(Context context, AttributeSet attributeSet, int i10, int i11, AbstractC5864g abstractC5864g) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }
}
