package com.vod.ui.activity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import be.AbstractC1314j;
import be.C1328x;
import be.InterfaceC1312h;
import cc.C1466m0;
import com.bumptech.glide.ComponentCallbacks2C1586c;
import com.module.basemvp.AbstractActivityC2972a;
import com.module.view.LeftkeybordView;
import com.module.view.LoadingView;
import com.open.leanback.widget.AbstractC3057h;
import com.open.leanback.widget.VerticalGridView;
import com.request.result.AssetList;
import com.request.result.GetAuthInfoResult;
import com.request.result.GetAuthInfoResultData;
import com.request.result.UserInfo;
import com.vod.R$color;
import com.vod.R$id;
import com.vod.R$layout;
import com.vod.R$string;
import com.vod.ui.activity.RestrictLevelSearchActivity;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import me.InterfaceC5642a;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p132fa.C4300d;
import p170i2.C4842a;
import p201k2.AbstractC5085b;
import p201k2.AbstractC5091h;
import p212kd.C5213p2;
import p212kd.InterfaceC5156b1;
import p242n0.AbstractC5718e;
import p253nd.InterfaceC5847g;
import p253nd.InterfaceC5848h;
import p289pd.C6278p;
import p317rb.AbstractC6567a;
import p348u2.AbstractC7026c;
import p371vb.C7252a;
import p399x9.C7531f;
import p400xa.AbstractC7555b0;
import p400xa.C7554b;
import p400xa.C7589m1;
import p400xa.C7619y;

/* loaded from: classes3.dex */
public final class RestrictLevelSearchActivity extends AbstractActivityC2972a implements InterfaceC5848h {

    /* renamed from: F */
    private int f17276F;

    /* renamed from: G */
    private boolean f17277G;

    /* renamed from: H */
    private View f17278H;

    /* renamed from: I */
    private final InterfaceC1312h f17279I;

    /* renamed from: J */
    public Map f17280J = new LinkedHashMap();

    /* renamed from: E */
    private final String f17275E = "RestrictLevelSearchActivity";

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.vod.ui.activity.RestrictLevelSearchActivity$a */
    /* loaded from: classes3.dex */
    public static final class C3819a extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        final /* synthetic */ AssetList f17281a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C3819a(AssetList assetList) {
            super(1);
            this.f17281a = assetList;
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Intent mo542f(Intent intent) {
            AbstractC5868k.m23674f(intent, "intent");
            intent.putExtra("extra_play_type", "1");
            intent.putExtra("extra_type", this.f17281a.getType());
            intent.putExtra("extra_content_id", this.f17281a.getContentId());
            intent.putExtra("extra_umeng_event_key", C7589m1.c.f27901a.m29168f());
            intent.putExtra("extra_ts", AbstractC5868k.m23669a(this.f17281a.getContentType(), "1"));
            intent.putExtra("extra_play_entrance", "restrict_search");
            Intent putExtra = intent.putExtra("extra_restrict", true);
            AbstractC5868k.m23673e(putExtra, "intent.putExtra(VodDetai…ity.EXTRA_RESTRICT, true)");
            return putExtra;
        }
    }

    /* renamed from: com.vod.ui.activity.RestrictLevelSearchActivity$b */
    /* loaded from: classes3.dex */
    static final class C3820b extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final C3820b f17282a = new C3820b();

        C3820b() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C5213p2 invoke() {
            return new C5213p2(R$layout.item_vod_program_new_search_list);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.vod.ui.activity.RestrictLevelSearchActivity$c */
    /* loaded from: classes3.dex */
    public static final class C3821c extends AbstractC5869l implements InterfaceC5660l {
        C3821c() {
            super(1);
        }

        /* renamed from: a */
        public final void m16306a(String str) {
            AbstractC5868k.m23674f(str, "it");
            RestrictLevelSearchActivity.this.m16292w6().m28847d();
            ((RelativeLayout) RestrictLevelSearchActivity.this.m16298h6(R$id.mArlTotal)).setVisibility(8);
            ((LinearLayout) RestrictLevelSearchActivity.this.m16298h6(R$id.mNoResultView)).setVisibility(8);
            if (AbstractC6567a.m25634d(str)) {
                ((TextView) RestrictLevelSearchActivity.this.m16298h6(R$id.mTvSearchHint)).setVisibility(0);
            } else {
                ((TextView) RestrictLevelSearchActivity.this.m16298h6(R$id.mTvSearchHint)).setVisibility(8);
                ((InterfaceC5847g) RestrictLevelSearchActivity.this.m11977r5()).mo23643d(str);
            }
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m16306a((String) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.vod.ui.activity.RestrictLevelSearchActivity$d */
    /* loaded from: classes3.dex */
    public static final class C3822d extends AbstractC5869l implements InterfaceC5642a {
        C3822d() {
            super(0);
        }

        /* renamed from: a */
        public final void m16307a() {
            RestrictLevelSearchActivity.this.m16281C6();
        }

        @Override // me.InterfaceC5642a
        public /* bridge */ /* synthetic */ Object invoke() {
            m16307a();
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.vod.ui.activity.RestrictLevelSearchActivity$e */
    /* loaded from: classes3.dex */
    public static final class C3823e extends AbstractC5869l implements InterfaceC5642a {
        C3823e() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            if (RestrictLevelSearchActivity.this.m16292w6().getItemCount() > 0) {
                ((VerticalGridView) RestrictLevelSearchActivity.this.m16298h6(R$id.mVgvResult)).requestFocus();
            }
            return Boolean.TRUE;
        }
    }

    /* renamed from: com.vod.ui.activity.RestrictLevelSearchActivity$f */
    /* loaded from: classes3.dex */
    public static final class C3824f extends RecyclerView.AbstractC0802u {
        C3824f() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0802u
        public void onScrollStateChanged(RecyclerView recyclerView, int i10) {
            AbstractC5868k.m23674f(recyclerView, "recyclerView");
            if (AbstractC5718e.m23111a(RestrictLevelSearchActivity.this.m30049S4())) {
                return;
            }
            if (i10 != 0) {
                if (i10 == 1 || i10 == 2) {
                    ComponentCallbacks2C1586c.m7282u(RestrictLevelSearchActivity.this.m30049S4().getApplicationContext()).m7390p();
                    return;
                }
                return;
            }
            ComponentCallbacks2C1586c.m7282u(RestrictLevelSearchActivity.this.m30049S4().getApplicationContext()).m7391q();
        }
    }

    /* renamed from: com.vod.ui.activity.RestrictLevelSearchActivity$g */
    /* loaded from: classes3.dex */
    public static final class C3825g extends AbstractC3057h {
        C3825g() {
        }

        @Override // com.open.leanback.widget.AbstractC3057h
        /* renamed from: a */
        public void mo11995a(RecyclerView recyclerView, RecyclerView.AbstractC0787f0 abstractC0787f0, int i10, int i11) {
            int i12;
            super.mo11995a(recyclerView, abstractC0787f0, i10, i11);
            RecyclerView.AbstractC0789h adapter = ((VerticalGridView) RestrictLevelSearchActivity.this.m16298h6(R$id.mVgvResult)).getAdapter();
            if (adapter != null) {
                i12 = adapter.getItemCount();
            } else {
                i12 = 0;
            }
            if (i12 < RestrictLevelSearchActivity.this.f17276F && !RestrictLevelSearchActivity.this.f17277G && i10 >= i12 - 10) {
                RestrictLevelSearchActivity.this.f17277G = true;
                ((InterfaceC5847g) RestrictLevelSearchActivity.this.m11977r5()).mo23642c2();
            }
        }
    }

    /* renamed from: com.vod.ui.activity.RestrictLevelSearchActivity$h */
    /* loaded from: classes3.dex */
    public static final class C3826h implements InterfaceC5156b1 {
        C3826h() {
        }

        @Override // p212kd.InterfaceC5156b1
        /* renamed from: a */
        public boolean mo16309a(View view, int i10, KeyEvent keyEvent, C7531f c7531f) {
            AbstractC5868k.m23674f(view, "v");
            AbstractC5868k.m23674f(keyEvent, "event");
            AbstractC5868k.m23674f(c7531f, "holder");
            int i11 = 5;
            if (keyEvent.getAction() == 0 && i10 == 22) {
                RestrictLevelSearchActivity restrictLevelSearchActivity = RestrictLevelSearchActivity.this;
                int i12 = R$id.mVgvResult;
                if (((VerticalGridView) restrictLevelSearchActivity.m16298h6(i12)).getSelectedPosition() + 1 == RestrictLevelSearchActivity.this.m16292w6().getItemCount()) {
                    new C7554b().m28941a(view).start();
                    return true;
                }
                if (c7531f.getAdapterPosition() % 5 == 4) {
                    ((VerticalGridView) RestrictLevelSearchActivity.this.m16298h6(i12)).setSelectedPosition(c7531f.getAdapterPosition() + 1);
                    return true;
                }
                return false;
            }
            if (keyEvent.getAction() == 0 && i10 == 19) {
                if (c7531f.getAdapterPosition() < 5) {
                    return true;
                }
                return false;
            }
            if (keyEvent.getAction() == 0 && i10 == 21) {
                if (c7531f.getAdapterPosition() % 5 == 0) {
                    ((LeftkeybordView) RestrictLevelSearchActivity.this.m16298h6(R$id.leftKeybord)).m12115i();
                    return true;
                }
                return false;
            }
            if (keyEvent.getAction() == 0 && i10 == 20) {
                RestrictLevelSearchActivity restrictLevelSearchActivity2 = RestrictLevelSearchActivity.this;
                int i13 = R$id.mVgvResult;
                if (((VerticalGridView) restrictLevelSearchActivity2.m16298h6(i13)).getSelectedPosition() + 1 == RestrictLevelSearchActivity.this.m16292w6().getItemCount()) {
                    new C7554b().m28942b(view).start();
                    return true;
                }
                if (RestrictLevelSearchActivity.this.f17276F > 0) {
                    int i14 = RestrictLevelSearchActivity.this.f17276F % 5;
                    int i15 = RestrictLevelSearchActivity.this.f17276F;
                    if (i14 != 0) {
                        i11 = i14;
                    }
                    if (((VerticalGridView) RestrictLevelSearchActivity.this.m16298h6(i13)).getSelectedPosition() >= i15 - i11) {
                        new C7554b().m28942b(view).start();
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }

        @Override // p212kd.InterfaceC5156b1
        /* renamed from: b */
        public void mo16310b(AssetList assetList, int i10) {
            AbstractC5868k.m23674f(assetList, "data");
            RestrictLevelSearchActivity.this.m16291t6(assetList);
        }
    }

    public RestrictLevelSearchActivity() {
        InterfaceC1312h m5965b;
        m5965b = AbstractC1314j.m5965b(C3820b.f17282a);
        this.f17279I = m5965b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A6 */
    public static final boolean m16279A6(RestrictLevelSearchActivity restrictLevelSearchActivity, View view, int i10, KeyEvent keyEvent) {
        AbstractC5868k.m23674f(restrictLevelSearchActivity, "this$0");
        if (i10 == 4) {
            View view2 = restrictLevelSearchActivity.f17278H;
            if (view2 != null) {
                view2.setVisibility(8);
            }
            ((LeftkeybordView) restrictLevelSearchActivity.m16298h6(R$id.leftKeybord)).getFeedbackView().requestFocus();
            return true;
        }
        return true;
    }

    /* renamed from: B6 */
    private final void m16280B6() {
        int i10 = R$id.leftKeybord;
        ((LeftkeybordView) m16298h6(i10)).setTextChangeListener(new C3821c());
        ((LeftkeybordView) m16298h6(i10)).setFeedbackClickListener(new C3822d());
        ((LeftkeybordView) m16298h6(i10)).setSearchRightKeyListener(new C3823e());
        ((LeftkeybordView) m16298h6(i10)).setInputRightKeyListener(((LeftkeybordView) m16298h6(i10)).getSearchRightKeyListener());
        int i11 = R$id.mVgvResult;
        ((VerticalGridView) m16298h6(i11)).addOnScrollListener(new C3824f());
        ((VerticalGridView) m16298h6(i11)).setOnChildViewHolderSelectedListener(new C3825g());
        m16292w6().m21048w(new C3826h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C6 */
    public final void m16281C6() {
        m16294z6();
        m16293y6();
        View view = this.f17278H;
        if (view != null) {
            view.setVisibility(0);
        }
        View view2 = this.f17278H;
        if (view2 != null) {
            view2.requestFocus();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s6 */
    public static final void m16290s6(RestrictLevelSearchActivity restrictLevelSearchActivity) {
        AbstractC5868k.m23674f(restrictLevelSearchActivity, "this$0");
        ((LeftkeybordView) restrictLevelSearchActivity.m16298h6(R$id.leftKeybord)).m12114h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t6 */
    public final void m16291t6(AssetList assetList) {
        C7619y.m29367d(C7619y.f28056a, m30049S4(), VodDetailsActivity.class, null, new C3819a(assetList), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w6 */
    public final C5213p2 m16292w6() {
        return (C5213p2) this.f17279I.getValue();
    }

    /* renamed from: y6 */
    private final void m16293y6() {
        String str;
        GetAuthInfoResultData data;
        String userType;
        C1466m0 c1466m0 = C1466m0.f5627a;
        UserInfo m6887v = c1466m0.m6887v();
        String str2 = "";
        if (m6887v == null || (str = m6887v.getEmail()) == null) {
            str = "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("http://");
        sb2.append(C4300d.f18678a.m18049o());
        sb2.append("/#/feedback?appId=");
        sb2.append(C4842a.f20329a.m19920a().mo19960i(m30049S4()));
        sb2.append("&userId=");
        sb2.append(c1466m0.m6878m());
        sb2.append("&lang=");
        sb2.append(AbstractC5091h.m20659b());
        sb2.append("&appVersion=");
        sb2.append(AbstractC5085b.m20602l(m30049S4()));
        sb2.append("&email=");
        sb2.append(str);
        sb2.append("&tvType=1&userType=");
        GetAuthInfoResult m28073h = C7252a.f27087a.m28073h();
        if (m28073h != null && (data = m28073h.getData()) != null && (userType = data.getUserType()) != null) {
            str2 = userType;
        }
        sb2.append(str2);
        sb2.append("&timeStamp=");
        sb2.append(new Date().getTime());
        ((InterfaceC5847g) m11977r5()).mo23644u(sb2.toString());
    }

    /* renamed from: z6 */
    private final void m16294z6() {
        if (this.f17278H != null) {
            return;
        }
        View inflate = ((ViewStub) m16298h6(R$id.flSearchFeedback)).inflate();
        this.f17278H = inflate;
        if (inflate != null) {
            inflate.setOnKeyListener(new View.OnKeyListener() { // from class: sd.q0
                @Override // android.view.View.OnKeyListener
                public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
                    boolean m16279A6;
                    m16279A6 = RestrictLevelSearchActivity.m16279A6(RestrictLevelSearchActivity.this, view, i10, keyEvent);
                    return m16279A6;
                }
            });
        }
    }

    @Override // p253nd.InterfaceC5848h
    /* renamed from: a */
    public void mo16295a() {
        ((LoadingView) m16298h6(R$id.loadingView)).setVisibility(0);
    }

    @Override // p253nd.InterfaceC5848h
    /* renamed from: b */
    public void mo16296b() {
        ((LoadingView) m16298h6(R$id.loadingView)).setVisibility(8);
    }

    @Override // p253nd.InterfaceC5848h
    /* renamed from: f */
    public void mo16297f(Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled()) {
            ((ImageView) m16298h6(R$id.ivFeedbackQr)).setImageBitmap(bitmap);
        }
    }

    @Override // com.module.basemvp.AbstractActivityC2972a
    /* renamed from: g5 */
    protected void mo7513g5() {
        ((FrameLayout) m16298h6(R$id.mRootView)).setBackgroundDrawable(AbstractC7026c.m27111a(this, R$color.color_0b0b0b));
        int i10 = R$id.mVgvResult;
        VerticalGridView verticalGridView = (VerticalGridView) m16298h6(i10);
        AbstractC5868k.m23673e(verticalGridView, "mVgvResult");
        AbstractC7555b0.m28958l(verticalGridView, true, false, null, 6, null);
        ((VerticalGridView) m16298h6(i10)).setAdapter(m16292w6());
        ((VerticalGridView) m16298h6(i10)).setItemAnimator(null);
        m16280B6();
        int i11 = R$id.leftKeybord;
        ((LeftkeybordView) m16298h6(i11)).setHintSize(R$string.bl_search_input_hint);
        ((LeftkeybordView) m16298h6(i11)).post(new Runnable() { // from class: sd.p0
            @Override // java.lang.Runnable
            public final void run() {
                RestrictLevelSearchActivity.m16290s6(RestrictLevelSearchActivity.this);
            }
        });
    }

    /* renamed from: h6 */
    public View m16298h6(int i10) {
        Map map = this.f17280J;
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

    @Override // p253nd.InterfaceC5848h
    /* renamed from: j */
    public void mo16299j(String str) {
        AbstractC5868k.m23674f(str, "errCode");
        this.f17277G = false;
        AbstractActivityC2972a.m11957W5(this, str, true, null, null, null, null, null, 124, null);
    }

    @Override // p253nd.InterfaceC5848h
    /* renamed from: m */
    public void mo16300m() {
        this.f17277G = false;
        m16292w6().m28847d();
        LinearLayout linearLayout = (LinearLayout) m16298h6(R$id.mNoResultView);
        AbstractC5868k.m23671c(linearLayout);
        linearLayout.setVisibility(0);
    }

    @Override // p253nd.InterfaceC5848h
    /* renamed from: o */
    public void mo16301o(List list) {
        AbstractC5868k.m23674f(list, "assetLists");
        this.f17277G = false;
        m16292w6().m28845b(list);
    }

    @Override // p253nd.InterfaceC5848h
    /* renamed from: r */
    public void mo16302r(List list, int i10) {
        AbstractC5868k.m23674f(list, "assetLists");
        this.f17277G = false;
        m16292w6().m28854l(list);
        this.f17276F = i10;
        ((RelativeLayout) m16298h6(R$id.mArlTotal)).setVisibility(0);
        ((TextView) m16298h6(R$id.mTvTotal)).setText(String.valueOf(this.f17276F));
    }

    @Override // com.module.basemvp.AbstractActivityC2972a
    /* renamed from: x6, reason: merged with bridge method [inline-methods] */
    public InterfaceC5847g mo7516s5() {
        return new C6278p(this, this);
    }

    @Override // com.module.basemvp.AbstractActivityC2972a
    /* renamed from: z5 */
    protected int mo7518z5() {
        return R$layout.activity_restrict_level_search;
    }
}
