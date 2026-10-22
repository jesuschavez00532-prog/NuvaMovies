package com.vod.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AbstractActivityC0302c;
import androidx.fragment.app.AbstractActivityC0712e;
import androidx.fragment.app.AbstractC0729o;
import be.C1328x;
import cf.AbstractC1516b;
import com.request.result.AssetData;
import com.request.result.SimpleProgramList;
import com.umeng.analytics.pro.C3384f;
import com.vod.R$id;
import com.vod.R$layout;
import com.vod.R$mipmap;
import com.vod.R$string;
import com.vod.view.VodDetailMenuPanel;
import com.zhy.autolayout.AutoLinearLayout;
import com.zhy.autolayout.AutoRelativeLayout;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import me.InterfaceC5642a;
import me.InterfaceC5664p;
import ne.AbstractC5864g;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import org.android.agoo.message.MessageService;
import p102db.C4053l;
import p170i2.C4842a;
import p198k.C5076a;
import p317rb.AbstractC6567a;
import p433zd.AbstractC7786b;

/* loaded from: classes3.dex */
public final class VodDetailMenuPanel extends AutoLinearLayout {

    /* renamed from: n */
    public static final C3887a f17517n = new C3887a(null);

    /* renamed from: a */
    private boolean f17518a;

    /* renamed from: b */
    private String f17519b;

    /* renamed from: c */
    private boolean f17520c;

    /* renamed from: d */
    private boolean f17521d;

    /* renamed from: e */
    private AssetData f17522e;

    /* renamed from: f */
    private Boolean f17523f;

    /* renamed from: g */
    private Boolean f17524g;

    /* renamed from: h */
    private Boolean f17525h;

    /* renamed from: i */
    private Boolean f17526i;

    /* renamed from: j */
    private Boolean f17527j;

    /* renamed from: k */
    private InterfaceC5664p f17528k;

    /* renamed from: l */
    private AbstractC0729o f17529l;

    /* renamed from: m */
    public Map f17530m;

    /* renamed from: com.vod.view.VodDetailMenuPanel$a */
    /* loaded from: classes3.dex */
    public static final class C3887a {
        private C3887a() {
        }

        public /* synthetic */ C3887a(AbstractC5864g abstractC5864g) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.vod.view.VodDetailMenuPanel$b */
    /* loaded from: classes3.dex */
    public static final class C3888b extends AbstractC5869l implements InterfaceC5642a {
        C3888b() {
            super(0);
        }

        /* renamed from: a */
        public final void m16725a() {
            VodDetailMenuPanel vodDetailMenuPanel = VodDetailMenuPanel.this;
            AutoLinearLayout autoLinearLayout = (AutoLinearLayout) vodDetailMenuPanel.m16721m(R$id.mLayoutSubtitle);
            AbstractC5868k.m23673e(autoLinearLayout, "mLayoutSubtitle");
            vodDetailMenuPanel.m16697M(autoLinearLayout);
        }

        @Override // me.InterfaceC5642a
        public /* bridge */ /* synthetic */ Object invoke() {
            m16725a();
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.vod.view.VodDetailMenuPanel$c */
    /* loaded from: classes3.dex */
    public static final class C3889c extends AbstractC5869l implements InterfaceC5642a {
        C3889c() {
            super(0);
        }

        /* renamed from: a */
        public final void m16726a() {
            VodDetailMenuPanel vodDetailMenuPanel = VodDetailMenuPanel.this;
            int i10 = R$id.mLayoutQuality;
            if (((AutoRelativeLayout) vodDetailMenuPanel.m16721m(i10)).getVisibility() == 0) {
                VodDetailMenuPanel vodDetailMenuPanel2 = VodDetailMenuPanel.this;
                AutoRelativeLayout autoRelativeLayout = (AutoRelativeLayout) vodDetailMenuPanel2.m16721m(i10);
                AbstractC5868k.m23673e(autoRelativeLayout, "mLayoutQuality");
                vodDetailMenuPanel2.m16693I(autoRelativeLayout);
            }
        }

        @Override // me.InterfaceC5642a
        public /* bridge */ /* synthetic */ Object invoke() {
            m16726a();
            return C1328x.f4998a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VodDetailMenuPanel(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC5868k.m23674f(context, C3384f.f14563X);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A */
    public static final void m16685A(VodDetailMenuPanel vodDetailMenuPanel, View view) {
        AbstractC5868k.m23674f(vodDetailMenuPanel, "this$0");
        InterfaceC5664p interfaceC5664p = vodDetailMenuPanel.f17528k;
        if (interfaceC5664p != null) {
            AbstractC5868k.m23673e(view, "it");
            interfaceC5664p.mo2391h(view, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B */
    public static final void m16686B(VodDetailMenuPanel vodDetailMenuPanel, View view, boolean z10) {
        AbstractC5868k.m23674f(vodDetailMenuPanel, "this$0");
        ((TextView) vodDetailMenuPanel.m16721m(R$id.mTvFullScreen)).setSelected(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public static final void m16687C(VodDetailMenuPanel vodDetailMenuPanel, View view) {
        AbstractC5868k.m23674f(vodDetailMenuPanel, "this$0");
        InterfaceC5664p interfaceC5664p = vodDetailMenuPanel.f17528k;
        if (interfaceC5664p != null) {
            AbstractC5868k.m23673e(view, "it");
            interfaceC5664p.mo2391h(view, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D */
    public static final void m16688D(VodDetailMenuPanel vodDetailMenuPanel, View view) {
        AbstractC5868k.m23674f(vodDetailMenuPanel, "this$0");
        InterfaceC5664p interfaceC5664p = vodDetailMenuPanel.f17528k;
        if (interfaceC5664p != null) {
            AbstractC5868k.m23673e(view, "it");
            interfaceC5664p.mo2391h(view, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E */
    public static final void m16689E(VodDetailMenuPanel vodDetailMenuPanel, View view) {
        AbstractC5868k.m23674f(vodDetailMenuPanel, "this$0");
        InterfaceC5664p interfaceC5664p = vodDetailMenuPanel.f17528k;
        if (interfaceC5664p != null) {
            AbstractC5868k.m23673e(view, "it");
            interfaceC5664p.mo2391h(view, 5);
        }
    }

    /* renamed from: F */
    private final void m16690F() {
        String str;
        if (this.f17520c) {
            ((AutoLinearLayout) m16721m(R$id.mLayoutSubscribe)).setVisibility(8);
            return;
        }
        AssetData assetData = this.f17522e;
        if (assetData != null) {
            str = assetData.getHasSubscribe();
        } else {
            str = null;
        }
        if (AbstractC5868k.m23669a("1", str)) {
            ((TextView) m16721m(R$id.mTextSubscribe)).setText(getContext().getString(R$string.rm_subscription));
            ((ImageView) m16721m(R$id.mImgSubscribe)).setImageResource(R$mipmap.icon_detail_subscribed);
        } else {
            ((TextView) m16721m(R$id.mTextSubscribe)).setText(getContext().getString(R$string.subscription));
            ((ImageView) m16721m(R$id.mImgSubscribe)).setImageResource(R$mipmap.icon_detail_subscribe);
        }
    }

    /* renamed from: G */
    private final void m16691G(View view) {
        C4053l.a aVar = C4053l.f17879P0;
        if (!aVar.m17070a() && ((AutoLinearLayout) m16721m(R$id.mLayoutDownload)).getVisibility() == 0 && !aVar.m17071b(C4053l.c.VodDownload)) {
            aVar.m17072c(true);
            final C4053l c4053l = new C4053l();
            c4053l.m17069ea(view);
            c4053l.m17067ca(C4053l.b.BOTTOM_LEFT);
            c4053l.m17066ba(AbstractC7786b.m30166j(-50), AbstractC7786b.m30163g(-30));
            c4053l.m17065aa(R$layout.layout_guide_vod_detail_download);
            view.postDelayed(new Runnable() { // from class: wd.k0
                @Override // java.lang.Runnable
                public final void run() {
                    VodDetailMenuPanel.m16692H(C4053l.this, this);
                }
            }, 100L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H */
    public static final void m16692H(C4053l c4053l, VodDetailMenuPanel vodDetailMenuPanel) {
        AbstractC5868k.m23674f(c4053l, "$guideDialog");
        AbstractC5868k.m23674f(vodDetailMenuPanel, "this$0");
        Context context = vodDetailMenuPanel.getContext();
        AbstractC5868k.m23672d(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        AbstractC0729o m3294d4 = ((AbstractActivityC0712e) context).m3294d4();
        AbstractC5868k.m23673e(m3294d4, "context as FragmentActiv…y).supportFragmentManager");
        c4053l.mo3277E9(m3294d4, "GuideDialog");
        C4053l.f17879P0.m17073d(C4053l.c.VodDownload, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I */
    public final void m16693I(View view) {
        C4053l.a aVar = C4053l.f17879P0;
        if (aVar.m17070a()) {
            return;
        }
        boolean m19953b0 = C4842a.f20329a.m19920a().m19953b0();
        if (!aVar.m17071b(C4053l.c.VodDetailQuality)) {
            aVar.m17072c(true);
            final C4053l c4053l = new C4053l();
            c4053l.m17069ea(view);
            c4053l.m17067ca(C4053l.b.BOTTOM_RIGHT);
            c4053l.m17066ba(AbstractC7786b.m30166j(100), AbstractC7786b.m30163g(10));
            c4053l.m17065aa(R$layout.layout_guide_vod_play_quality);
            if (!m19953b0) {
                String string = getContext().getString(R$string.dialog_guide_ok);
                AbstractC5868k.m23673e(string, "context.getString(R.string.dialog_guide_ok)");
                c4053l.m17063Y9(string);
            }
            if (m19953b0) {
                if (((AutoLinearLayout) m16721m(R$id.mLayoutSubscribe)).getVisibility() == 0) {
                    m16695K();
                } else {
                    AutoLinearLayout autoLinearLayout = (AutoLinearLayout) m16721m(R$id.mLayoutDownload);
                    AbstractC5868k.m23673e(autoLinearLayout, "mLayoutDownload");
                    m16691G(autoLinearLayout);
                }
            }
            view.postDelayed(new Runnable() { // from class: wd.j0
                @Override // java.lang.Runnable
                public final void run() {
                    VodDetailMenuPanel.m16694J(C4053l.this, this);
                }
            }, 100L);
            return;
        }
        if (m19953b0) {
            AutoLinearLayout autoLinearLayout2 = (AutoLinearLayout) m16721m(R$id.mLayoutDownload);
            AbstractC5868k.m23673e(autoLinearLayout2, "mLayoutDownload");
            m16691G(autoLinearLayout2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J */
    public static final void m16694J(C4053l c4053l, VodDetailMenuPanel vodDetailMenuPanel) {
        AbstractC5868k.m23674f(c4053l, "$guideDialog");
        AbstractC5868k.m23674f(vodDetailMenuPanel, "this$0");
        Context context = vodDetailMenuPanel.getContext();
        AbstractC5868k.m23672d(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        AbstractC0729o m3294d4 = ((AbstractActivityC0712e) context).m3294d4();
        AbstractC5868k.m23673e(m3294d4, "context as FragmentActiv…y).supportFragmentManager");
        c4053l.mo3277E9(m3294d4, "GuideDialog");
        C4053l.f17879P0.m17073d(C4053l.c.VodDetailQuality, true);
    }

    /* renamed from: K */
    private final void m16695K() {
        C4053l.a aVar = C4053l.f17879P0;
        if (!aVar.m17070a()) {
            if (this.f17526i != null || !C4842a.f20329a.m19920a().m19953b0()) {
                if (!aVar.m17071b(C4053l.c.Subscribe)) {
                    aVar.m17072c(true);
                    final C4053l c4053l = new C4053l();
                    AutoLinearLayout autoLinearLayout = (AutoLinearLayout) m16721m(R$id.mLayoutSubscribe);
                    AbstractC5868k.m23673e(autoLinearLayout, "mLayoutSubscribe");
                    c4053l.m17069ea(autoLinearLayout);
                    c4053l.m17067ca(C4053l.b.BOTTOM_LEFT);
                    c4053l.m17065aa(R$layout.layout_guide_subscribe);
                    c4053l.m17066ba(AbstractC7786b.m30166j(-20), 0);
                    if (!aVar.m17071b(C4053l.c.VodDetailSubtitle)) {
                        String string = getContext().getString(R$string.dialog_guide_next);
                        AbstractC5868k.m23673e(string, "context.getString(R.string.dialog_guide_next)");
                        c4053l.m17063Y9(string);
                    }
                    c4053l.m17068da(new C3888b());
                    ((ImageView) m16721m(R$id.mImgSubscribe)).postDelayed(new Runnable() { // from class: wd.i0
                        @Override // java.lang.Runnable
                        public final void run() {
                            VodDetailMenuPanel.m16696L(VodDetailMenuPanel.this, c4053l);
                        }
                    }, 100L);
                    return;
                }
                AutoLinearLayout autoLinearLayout2 = (AutoLinearLayout) m16721m(R$id.mLayoutSubtitle);
                AbstractC5868k.m23673e(autoLinearLayout2, "mLayoutSubtitle");
                m16697M(autoLinearLayout2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L */
    public static final void m16696L(VodDetailMenuPanel vodDetailMenuPanel, C4053l c4053l) {
        AbstractC0729o abstractC0729o;
        AbstractC5868k.m23674f(vodDetailMenuPanel, "this$0");
        AbstractC5868k.m23674f(c4053l, "$guideDialog");
        if (!vodDetailMenuPanel.m16714q() && (abstractC0729o = vodDetailMenuPanel.f17529l) != null) {
            AbstractC5868k.m23671c(abstractC0729o);
            c4053l.mo3277E9(abstractC0729o, "GuideDialog");
            C4053l.f17879P0.m17073d(C4053l.c.Subscribe, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M */
    public final void m16697M(View view) {
        C4053l.a aVar = C4053l.f17879P0;
        if (aVar.m17070a()) {
            return;
        }
        if (!aVar.m17071b(C4053l.c.VodDetailSubtitle)) {
            aVar.m17072c(true);
            final C4053l c4053l = new C4053l();
            c4053l.m17069ea(view);
            c4053l.m17067ca(C4053l.b.BOTTOM_LEFT);
            c4053l.m17066ba(AbstractC7786b.m30166j(-30), AbstractC7786b.m30163g(-30));
            c4053l.m17065aa(R$layout.layout_guide_vod_detail_subtitle);
            c4053l.m17068da(new C3889c());
            view.postDelayed(new Runnable() { // from class: wd.t0
                @Override // java.lang.Runnable
                public final void run() {
                    VodDetailMenuPanel.m16698N(VodDetailMenuPanel.this, c4053l);
                }
            }, 100L);
            return;
        }
        AutoRelativeLayout autoRelativeLayout = (AutoRelativeLayout) m16721m(R$id.mLayoutQuality);
        AbstractC5868k.m23673e(autoRelativeLayout, "mLayoutQuality");
        m16693I(autoRelativeLayout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N */
    public static final void m16698N(VodDetailMenuPanel vodDetailMenuPanel, C4053l c4053l) {
        AbstractC0729o abstractC0729o;
        AbstractC5868k.m23674f(vodDetailMenuPanel, "this$0");
        AbstractC5868k.m23674f(c4053l, "$guideDialog");
        if (!vodDetailMenuPanel.m16714q() && (abstractC0729o = vodDetailMenuPanel.f17529l) != null) {
            AbstractC5868k.m23671c(abstractC0729o);
            c4053l.mo3277E9(abstractC0729o, "GuideDialog");
            C4053l.f17879P0.m17073d(C4053l.c.VodDetailSubtitle, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public static final void m16711n(VodDetailMenuPanel vodDetailMenuPanel, View view, int i10, ViewGroup viewGroup) {
        AbstractC5868k.m23674f(vodDetailMenuPanel, "this$0");
        AbstractC5868k.m23674f(view, "view");
        ViewGroup viewGroup2 = (ViewGroup) view;
        int childCount = viewGroup2.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = viewGroup2.getChildAt(0);
            viewGroup2.removeViewAt(0);
            vodDetailMenuPanel.addView(childAt);
        }
        vodDetailMenuPanel.f17518a = true;
        vodDetailMenuPanel.m16718x();
        AssetData assetData = vodDetailMenuPanel.f17522e;
        if (assetData != null) {
            vodDetailMenuPanel.m16724v(assetData, vodDetailMenuPanel.f17519b, vodDetailMenuPanel.f17520c, vodDetailMenuPanel.f17521d);
        }
        Boolean bool = vodDetailMenuPanel.f17523f;
        if (bool != null) {
            vodDetailMenuPanel.setDownloadSelectState(bool.booleanValue());
        }
        Boolean bool2 = vodDetailMenuPanel.f17524g;
        if (bool2 != null) {
            vodDetailMenuPanel.setFavoriteState(bool2.booleanValue());
        }
        Boolean bool3 = vodDetailMenuPanel.f17525h;
        if (bool3 != null) {
            vodDetailMenuPanel.setSubscribeState(bool3.booleanValue());
        }
    }

    /* renamed from: q */
    private final boolean m16714q() {
        Activity m16715r = m16715r(getContext());
        if (m16715r != null) {
            return m16715r.isFinishing();
        }
        return true;
    }

    /* renamed from: r */
    private final Activity m16715r(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        return m16715r(((ContextWrapper) context).getBaseContext());
    }

    private final void setUpdateInfo(AssetData assetData) {
        if (AbstractC5868k.m23669a(this.f17519b, MessageService.MSG_DB_READY_REPORT)) {
            if (assetData.getUpdateCount() != assetData.getVolumnCount() && !this.f17520c) {
                ((AutoLinearLayout) m16721m(R$id.mLayoutSubscribe)).setVisibility(0);
                m16695K();
                return;
            } else {
                ((AutoLinearLayout) m16721m(R$id.mLayoutSubscribe)).setVisibility(8);
                return;
            }
        }
        this.f17521d = AbstractC5868k.m23669a(assetData.getContentType(), "1");
        if (AbstractC5868k.m23669a(this.f17519b, "1") && this.f17521d) {
            ((AutoLinearLayout) m16721m(R$id.mLayoutSubscribe)).setVisibility(0);
            m16695K();
        }
    }

    /* renamed from: t */
    private final void m16716t(AssetData assetData) {
        if (AbstractC5868k.m23669a(this.f17519b, "1") && !this.f17521d && !AbstractC6567a.m25635e(assetData.getSimpleProgramList())) {
            List<SimpleProgramList> simpleProgramList = assetData.getSimpleProgramList();
            AbstractC5868k.m23671c(simpleProgramList);
            if (AbstractC5868k.m23669a(simpleProgramList.get(0).getHasPositive(), MessageService.MSG_DB_READY_REPORT)) {
                List<SimpleProgramList> simpleProgramList2 = assetData.getSimpleProgramList();
                AbstractC5868k.m23671c(simpleProgramList2);
                if (AbstractC5868k.m23669a(simpleProgramList2.get(0).getHasTrailer(), "1")) {
                    ((AutoLinearLayout) m16721m(R$id.mLayoutSubscribe)).setVisibility(0);
                    m16695K();
                }
            }
        }
    }

    /* renamed from: w */
    private final void m16717w() {
        String str;
        ((AutoLinearLayout) m16721m(R$id.mLayoutFavorite)).setVisibility(0);
        AssetData assetData = this.f17522e;
        if (assetData != null) {
            str = assetData.getHasFavorite();
        } else {
            str = null;
        }
        if (AbstractC5868k.m23669a("1", str)) {
            ((TextView) m16721m(R$id.mTextFavorite)).setText(getContext().getString(R$string.remove_from_favorite));
            ((ImageView) m16721m(R$id.mImgFavorite)).setImageResource(R$mipmap.icon_detail_favorited);
        } else {
            ((TextView) m16721m(R$id.mTextFavorite)).setText(getContext().getString(R$string.detail_collect));
            ((ImageView) m16721m(R$id.mImgFavorite)).setImageResource(R$mipmap.icon_detail_favorite);
        }
    }

    /* renamed from: x */
    private final void m16718x() {
        setShowDownload(this.f17526i);
        int i10 = R$id.mLayoutFullscreen;
        ((AutoLinearLayout) m16721m(i10)).setOnClickListener(new View.OnClickListener() { // from class: wd.m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VodDetailMenuPanel.m16685A(VodDetailMenuPanel.this, view);
            }
        });
        ((AutoLinearLayout) m16721m(i10)).setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: wd.n0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                VodDetailMenuPanel.m16686B(VodDetailMenuPanel.this, view, z10);
            }
        });
        ((AutoLinearLayout) m16721m(R$id.mLayoutFavorite)).setOnClickListener(new View.OnClickListener() { // from class: wd.o0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VodDetailMenuPanel.m16687C(VodDetailMenuPanel.this, view);
            }
        });
        ((AutoLinearLayout) m16721m(R$id.mLayoutDownload)).setOnClickListener(new View.OnClickListener() { // from class: wd.p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VodDetailMenuPanel.m16688D(VodDetailMenuPanel.this, view);
            }
        });
        ((AutoLinearLayout) m16721m(R$id.mLayoutSubscribe)).setOnClickListener(new View.OnClickListener() { // from class: wd.q0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VodDetailMenuPanel.m16689E(VodDetailMenuPanel.this, view);
            }
        });
        ((AutoLinearLayout) m16721m(R$id.mLayoutSubtitle)).setOnClickListener(new View.OnClickListener() { // from class: wd.r0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VodDetailMenuPanel.m16719y(VodDetailMenuPanel.this, view);
            }
        });
        ((AutoRelativeLayout) m16721m(R$id.mLayoutQuality)).setOnClickListener(new View.OnClickListener() { // from class: wd.s0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VodDetailMenuPanel.m16720z(VodDetailMenuPanel.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public static final void m16719y(VodDetailMenuPanel vodDetailMenuPanel, View view) {
        AbstractC5868k.m23674f(vodDetailMenuPanel, "this$0");
        InterfaceC5664p interfaceC5664p = vodDetailMenuPanel.f17528k;
        if (interfaceC5664p != null) {
            AbstractC5868k.m23673e(view, "it");
            interfaceC5664p.mo2391h(view, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public static final void m16720z(VodDetailMenuPanel vodDetailMenuPanel, View view) {
        AbstractC5868k.m23674f(vodDetailMenuPanel, "this$0");
        InterfaceC5664p interfaceC5664p = vodDetailMenuPanel.f17528k;
        if (interfaceC5664p != null) {
            AbstractC5868k.m23673e(view, "it");
            interfaceC5664p.mo2391h(view, 6);
        }
    }

    /* renamed from: m */
    public View m16721m(int i10) {
        Map map = this.f17530m;
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

    /* renamed from: s */
    public final boolean m16722s() {
        if (!this.f17518a) {
            return false;
        }
        if (!((AutoLinearLayout) m16721m(R$id.mLayoutFullscreen)).hasFocus() && !((AutoLinearLayout) m16721m(R$id.mLayoutSubtitle)).hasFocus() && !((AutoRelativeLayout) m16721m(R$id.mLayoutQuality)).hasFocus() && !((AutoLinearLayout) m16721m(R$id.mLayoutFavorite)).hasFocus()) {
            return false;
        }
        return true;
    }

    public final void setChildClickListener(InterfaceC5664p interfaceC5664p) {
        AbstractC5868k.m23674f(interfaceC5664p, "childClickListener");
        this.f17528k = interfaceC5664p;
    }

    public final void setDownloadSelectState(boolean z10) {
        this.f17523f = Boolean.valueOf(z10);
        if (!this.f17518a) {
            return;
        }
        ((AutoLinearLayout) m16721m(R$id.mLayoutDownload)).setSelected(z10);
    }

    public final void setFavoriteState(boolean z10) {
        this.f17524g = Boolean.valueOf(z10);
        if (!this.f17518a) {
            return;
        }
        if (z10) {
            ((TextView) m16721m(R$id.mTextFavorite)).setText(getContext().getString(R$string.remove_from_favorite));
            ((ImageView) m16721m(R$id.mImgFavorite)).setImageResource(R$mipmap.icon_detail_favorited);
        } else {
            ((TextView) m16721m(R$id.mTextFavorite)).setText(getContext().getString(R$string.detail_collect));
            ((ImageView) m16721m(R$id.mImgFavorite)).setImageResource(R$mipmap.icon_detail_favorite);
        }
    }

    public final void setShowDownload(Boolean bool) {
        int i10;
        this.f17526i = bool;
        if (this.f17518a && bool != null) {
            AutoLinearLayout autoLinearLayout = (AutoLinearLayout) m16721m(R$id.mLayoutDownload);
            if (bool.booleanValue() && C4842a.f20329a.m19920a().m19953b0() && !this.f17520c) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            autoLinearLayout.setVisibility(i10);
            if (((AutoLinearLayout) m16721m(R$id.mLayoutSubscribe)).getVisibility() == 0) {
                m16695K();
            }
        }
    }

    public final void setShowQuality(Boolean bool) {
        int i10;
        this.f17527j = bool;
        AbstractC1516b.m7037a("VodDetailMenuPanel", "setShowQuality:" + bool);
        if (this.f17518a && bool != null) {
            AbstractC1516b.m7037a("VodDetailMenuPanel", "setShowQuality:" + bool);
            AutoRelativeLayout autoRelativeLayout = (AutoRelativeLayout) m16721m(R$id.mLayoutQuality);
            if (bool.booleanValue()) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            autoRelativeLayout.setVisibility(i10);
            if (((AutoLinearLayout) m16721m(R$id.mLayoutSubscribe)).getVisibility() == 0) {
                m16695K();
            }
        }
    }

    public final void setSubscribeState(boolean z10) {
        this.f17525h = Boolean.valueOf(z10);
        if (!this.f17518a) {
            return;
        }
        if (z10) {
            ((TextView) m16721m(R$id.mTextSubscribe)).setText(getContext().getString(R$string.rm_subscription));
            ((ImageView) m16721m(R$id.mImgSubscribe)).setImageResource(R$mipmap.icon_detail_subscribed);
        } else {
            ((TextView) m16721m(R$id.mTextSubscribe)).setText(getContext().getString(R$string.subscription));
            ((ImageView) m16721m(R$id.mImgSubscribe)).setImageResource(R$mipmap.icon_detail_subscribe);
        }
    }

    /* renamed from: u */
    public final void m16723u(int i10) {
        if (!this.f17518a) {
            return;
        }
        ((AutoLinearLayout) m16721m(R$id.mLayoutFullscreen)).requestFocus(i10);
    }

    /* renamed from: v */
    public final void m16724v(AssetData assetData, String str, boolean z10, boolean z11) {
        AbstractC5868k.m23674f(assetData, "assetData");
        AbstractC5868k.m23674f(str, "type");
        this.f17522e = assetData;
        this.f17519b = str;
        this.f17520c = z10;
        this.f17521d = z11;
        if (!this.f17518a) {
            return;
        }
        setUpdateInfo(assetData);
        m16716t(assetData);
        AutoLinearLayout autoLinearLayout = (AutoLinearLayout) m16721m(R$id.mLayoutSubtitle);
        AbstractC5868k.m23673e(autoLinearLayout, "mLayoutSubtitle");
        m16697M(autoLinearLayout);
        m16717w();
        setShowDownload(this.f17526i);
        m16690F();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VodDetailMenuPanel(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        this.f17530m = new LinkedHashMap();
        this.f17519b = "";
        if (isInEditMode()) {
            LayoutInflater.from(context).inflate(R$layout.layout_vod_detail_menu_panel, this);
            this.f17518a = true;
        } else {
            this.f17529l = ((AbstractActivityC0302c) context).m3294d4();
            new C5076a(context).m20545a(R$layout.layout_vod_detail_menu_panel, this, new C5076a.e() { // from class: wd.l0
                @Override // p198k.C5076a.e
                /* renamed from: a */
                public final void mo11400a(View view, int i11, ViewGroup viewGroup) {
                    VodDetailMenuPanel.m16711n(VodDetailMenuPanel.this, view, i11, viewGroup);
                }
            });
        }
    }

    public /* synthetic */ VodDetailMenuPanel(Context context, AttributeSet attributeSet, int i10, int i11, AbstractC5864g abstractC5864g) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }
}
