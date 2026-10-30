package com.vod.ui.activity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.AbstractC0729o;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import be.AbstractC1314j;
import be.C1328x;
import be.InterfaceC1312h;
import cc.C1466m0;
import com.bumptech.glide.ComponentCallbacks2C1586c;
import com.module.R$string;
import com.module.basemvp.AbstractActivityC2972a;
import com.module.view.HorizontalNavBar;
import com.module.view.LeftkeybordView;
import com.module.view.LoadingView;
import com.open.leanback.widget.VerticalGridView;
import com.request.result.AssetList;
import com.request.result.ChildColumn;
import com.request.result.GetAuthInfoResult;
import com.request.result.GetAuthInfoResultData;
import com.request.result.PersonDetailInfo;
import com.request.result.UserInfo;
import com.taobao.accs.common.Constants;
import com.vod.R$color;
import com.vod.R$id;
import com.vod.R$layout;
import com.vod.ui.activity.VodSearchActivity;
import com.widget.custom.CustomViewPager;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import me.InterfaceC5642a;
import me.InterfaceC5660l;
import me.jessyan.autosize.utils.AutoSizeUtils;
import ne.AbstractC5864g;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p102db.InterfaceC4078t0;
import p132fa.C4300d;
import p170i2.C4842a;
import p201k2.AbstractC5085b;
import p201k2.AbstractC5091h;
import p212kd.C5213p2;
import p212kd.C5233u2;
import p212kd.InterfaceC5156b1;
import p242n0.AbstractC5718e;
import p253nd.InterfaceC5856p;
import p253nd.InterfaceC5857q;
import p289pd.C6288z;
import p348u2.AbstractC7026c;
import p358ud.AbstractC7089d;
import p358ud.C7124o1;
import p358ud.C7143y;
import p358ud.InterfaceC7113l;
import p371vb.C7252a;
import p399x9.C7531f;
import p400xa.AbstractC7555b0;
import p400xa.C7589m1;
import p400xa.C7619y;

/* loaded from: classes3.dex */
public final class VodSearchActivity extends AbstractActivityC2972a implements InterfaceC5857q, InterfaceC4078t0, InterfaceC7113l {

    /* renamed from: W */
    public static final C3862a f17413W = new C3862a(null);

    /* renamed from: G */
    private ChildColumn f17416G;

    /* renamed from: I */
    private int f17418I;

    /* renamed from: J */
    private List f17419J;

    /* renamed from: K */
    private View f17420K;

    /* renamed from: L */
    private C5233u2 f17421L;

    /* renamed from: M */
    private ViewGroup f17422M;

    /* renamed from: N */
    private final InterfaceC1312h f17423N;

    /* renamed from: O */
    private String f17424O;

    /* renamed from: V */
    public Map f17425V = new LinkedHashMap();

    /* renamed from: E */
    private final String f17414E = "VodSearchActivity";

    /* renamed from: F */
    private String f17415F = C4300d.f18678a.m18067x();

    /* renamed from: H */
    private int f17417H = -1;

    /* renamed from: com.vod.ui.activity.VodSearchActivity$a */
    /* loaded from: classes3.dex */
    public static final class C3862a {
        private C3862a() {
        }

        public /* synthetic */ C3862a(AbstractC5864g abstractC5864g) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.vod.ui.activity.VodSearchActivity$b */
    /* loaded from: classes3.dex */
    public static final class C3863b extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        final /* synthetic */ AssetList f17426a;

        /* renamed from: b */
        final /* synthetic */ VodSearchActivity f17427b;

        /* renamed from: c */
        final /* synthetic */ boolean f17428c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C3863b(AssetList assetList, VodSearchActivity vodSearchActivity, boolean z10) {
            super(1);
            this.f17426a = assetList;
            this.f17427b = vodSearchActivity;
            this.f17428c = z10;
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Intent mo542f(Intent intent) {
            Integer num;
            AbstractC5868k.m23674f(intent, "intent");
            intent.putExtra("extra_play_type", "1");
            intent.putExtra("extra_type", this.f17426a.getType());
            if (this.f17427b.m16536A6() != null) {
                ChildColumn m16536A6 = this.f17427b.m16536A6();
                if (m16536A6 != null) {
                    num = Integer.valueOf(m16536A6.getId());
                } else {
                    num = null;
                }
                intent.putExtra("extra_column_id", num);
            }
            intent.putExtra("extra_content_id", this.f17426a.getContentId());
            intent.putExtra("extra_restrict", false);
            intent.putExtra("extra_umeng_event_key", C7589m1.c.f27901a.m29168f());
            intent.putExtra("extra_ts", AbstractC5868k.m23669a(this.f17426a.getContentType(), "1"));
            if (this.f17428c) {
                Intent putExtra = intent.putExtra("extra_play_entrance", "hotSearch");
                AbstractC5868k.m23673e(putExtra, "{\n                intent…hotSearch\")\n            }");
                return putExtra;
            }
            Intent putExtra2 = intent.putExtra("extra_play_entrance", "search");
            AbstractC5868k.m23673e(putExtra2, "{\n                intent…, \"search\")\n            }");
            return putExtra2;
        }
    }

    /* renamed from: com.vod.ui.activity.VodSearchActivity$c */
    /* loaded from: classes3.dex */
    static final class C3864c extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final C3864c f17429a = new C3864c();

        C3864c() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C5213p2 invoke() {
            return new C5213p2(R$layout.item_vod_program_new_search_list);
        }
    }

    /* renamed from: com.vod.ui.activity.VodSearchActivity$d */
    /* loaded from: classes3.dex */
    static final class C3865d extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        final /* synthetic */ PersonDetailInfo f17430a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C3865d(PersonDetailInfo personDetailInfo) {
            super(1);
            this.f17430a = personDetailInfo;
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Intent mo542f(Intent intent) {
            AbstractC5868k.m23674f(intent, "intent");
            intent.putExtra("extra_detail", this.f17430a);
            Intent putExtra = intent.putExtra("extra_has_detail", true);
            AbstractC5868k.m23673e(putExtra, "intent.putExtra(ActorDet…y.EXTRA_HAS_DETAIL, true)");
            return putExtra;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.vod.ui.activity.VodSearchActivity$e */
    /* loaded from: classes3.dex */
    public static final class C3866e extends AbstractC5869l implements InterfaceC5660l {
        C3866e() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public static final void m16563e(VodSearchActivity vodSearchActivity, String str) {
            int i10;
            Fragment fragment;
            AbstractC5868k.m23674f(vodSearchActivity, "this$0");
            AbstractC5868k.m23674f(str, "$it");
            int selectedIndex = ((HorizontalNavBar) vodSearchActivity.m16552i6(R$id.mHnbSearchNavBar)).getSelectedIndex();
            if (selectedIndex > -1) {
                C5233u2 c5233u2 = vodSearchActivity.f17421L;
                if (c5233u2 != null) {
                    i10 = c5233u2.getCount();
                } else {
                    i10 = 0;
                }
                if (i10 > selectedIndex) {
                    C5233u2 c5233u22 = vodSearchActivity.f17421L;
                    if (c5233u22 != null) {
                        fragment = c5233u22.mo3587a(selectedIndex);
                    } else {
                        fragment = null;
                    }
                    AbstractC5868k.m23672d(fragment, "null cannot be cast to non-null type com.vod.ui.fragment.BaseVodSearchResultFrag<*>");
                    ((AbstractC7089d) fragment).mo27307I9(str);
                }
            }
        }

        /* renamed from: d */
        public final void m16564d(final String str) {
            boolean z10;
            AbstractC5868k.m23674f(str, "it");
            VodSearchActivity.this.m16514C6().m28847d();
            VodSearchActivity.this.f17424O = str;
            if (str.length() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                VodSearchActivity.this.m16518H6(str);
                ((LinearLayout) VodSearchActivity.this.m16552i6(R$id.mAllHotSearchPanel)).setVisibility(8);
                ViewGroup viewGroup = VodSearchActivity.this.f17422M;
                if (viewGroup != null) {
                    viewGroup.setVisibility(0);
                }
                ViewGroup viewGroup2 = VodSearchActivity.this.f17422M;
                if (viewGroup2 != null) {
                    final VodSearchActivity vodSearchActivity = VodSearchActivity.this;
                    viewGroup2.post(new Runnable() { // from class: com.vod.ui.activity.a
                        @Override // java.lang.Runnable
                        public final void run() {
                            VodSearchActivity.C3866e.m16563e(VodSearchActivity.this, str);
                        }
                    });
                    return;
                }
                return;
            }
            ((VerticalGridView) VodSearchActivity.this.m16552i6(R$id.searchGridview)).setAdapter(VodSearchActivity.this.m16514C6());
            VodSearchActivity.this.m16513B6();
            ((LinearLayout) VodSearchActivity.this.m16552i6(R$id.mAllHotSearchPanel)).setVisibility(0);
            ViewGroup viewGroup3 = VodSearchActivity.this.f17422M;
            if (viewGroup3 != null) {
                viewGroup3.setVisibility(8);
            }
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m16564d((String) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.vod.ui.activity.VodSearchActivity$f */
    /* loaded from: classes3.dex */
    public static final class C3867f extends AbstractC5869l implements InterfaceC5642a {
        C3867f() {
            super(0);
        }

        /* renamed from: a */
        public final void m16565a() {
            VodSearchActivity.this.m16521M6();
        }

        @Override // me.InterfaceC5642a
        public /* bridge */ /* synthetic */ Object invoke() {
            m16565a();
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.vod.ui.activity.VodSearchActivity$g */
    /* loaded from: classes3.dex */
    public static final class C3868g extends AbstractC5869l implements InterfaceC5642a {
        C3868g() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            boolean z10;
            ViewGroup viewGroup = VodSearchActivity.this.f17422M;
            boolean z11 = true;
            if (viewGroup != null && viewGroup.getVisibility() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                ((HorizontalNavBar) VodSearchActivity.this.m16552i6(R$id.mHnbSearchNavBar)).m12101h();
            } else if (((LinearLayout) VodSearchActivity.this.m16552i6(R$id.mAllHotSearchPanel)).getVisibility() == 0) {
                if (VodSearchActivity.this.m16514C6().getItemCount() > 0) {
                    ((VerticalGridView) VodSearchActivity.this.m16552i6(R$id.searchGridview)).requestFocus();
                }
            } else {
                z11 = false;
            }
            return Boolean.valueOf(z11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.vod.ui.activity.VodSearchActivity$h */
    /* loaded from: classes3.dex */
    public static final class C3869h extends AbstractC5869l implements InterfaceC5642a {
        C3869h() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            boolean z10;
            Fragment fragment;
            ViewGroup viewGroup = VodSearchActivity.this.f17422M;
            boolean z11 = true;
            if (viewGroup != null && viewGroup.getVisibility() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                VodSearchActivity vodSearchActivity = VodSearchActivity.this;
                int i10 = R$id.mHnbSearchNavBar;
                int selectedIndex = ((HorizontalNavBar) vodSearchActivity.m16552i6(i10)).getSelectedIndex();
                if (selectedIndex >= 0) {
                    C5233u2 c5233u2 = VodSearchActivity.this.f17421L;
                    if (c5233u2 != null) {
                        fragment = c5233u2.mo3587a(selectedIndex);
                    } else {
                        fragment = null;
                    }
                    AbstractC5868k.m23672d(fragment, "null cannot be cast to non-null type com.vod.ui.fragment.BaseVodSearchResultFrag<*>");
                    if (!((AbstractC7089d) fragment).mo27306H9()) {
                        ((HorizontalNavBar) VodSearchActivity.this.m16552i6(i10)).m12101h();
                    }
                } else {
                    ((HorizontalNavBar) VodSearchActivity.this.m16552i6(i10)).m12101h();
                    return Boolean.TRUE;
                }
            } else if (((LinearLayout) VodSearchActivity.this.m16552i6(R$id.mAllHotSearchPanel)).getVisibility() == 0) {
                if (VodSearchActivity.this.m16514C6().getItemCount() > 0) {
                    ((VerticalGridView) VodSearchActivity.this.m16552i6(R$id.searchGridview)).requestFocus();
                }
            } else {
                z11 = false;
            }
            return Boolean.valueOf(z11);
        }
    }

    /* renamed from: com.vod.ui.activity.VodSearchActivity$i */
    /* loaded from: classes3.dex */
    public static final class C3870i extends RecyclerView.AbstractC0802u {
        C3870i() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0802u
        public void onScrollStateChanged(RecyclerView recyclerView, int i10) {
            AbstractC5868k.m23674f(recyclerView, "recyclerView");
            if (AbstractC5718e.m23111a(VodSearchActivity.this.m30049S4())) {
                return;
            }
            if (i10 != 0) {
                if (i10 == 1 || i10 == 2) {
                    ComponentCallbacks2C1586c.m7282u(VodSearchActivity.this.m30049S4().getApplicationContext()).m7390p();
                    return;
                }
                return;
            }
            ComponentCallbacks2C1586c.m7282u(VodSearchActivity.this.m30049S4().getApplicationContext()).m7391q();
        }
    }

    /* renamed from: com.vod.ui.activity.VodSearchActivity$j */
    /* loaded from: classes3.dex */
    public static final class C3871j implements InterfaceC5156b1 {
        C3871j() {
        }

        @Override // p212kd.InterfaceC5156b1
        /* renamed from: a */
        public boolean mo16309a(View view, int i10, KeyEvent keyEvent, C7531f c7531f) {
            AbstractC5868k.m23674f(view, "v");
            AbstractC5868k.m23674f(keyEvent, "event");
            AbstractC5868k.m23674f(c7531f, "holder");
            if (keyEvent.getAction() == 0 && i10 == 22) {
                if (c7531f.getAdapterPosition() % 5 == 4) {
                    ((VerticalGridView) VodSearchActivity.this.m16552i6(R$id.searchGridview)).setSelectedPosition(c7531f.getAdapterPosition() + 1);
                    return true;
                }
                return false;
            }
            if (keyEvent.getAction() == 0 && i10 == 19) {
                if (c7531f.getAdapterPosition() < 5) {
                    ((TextView) VodSearchActivity.this.m16552i6(R$id.llRefresh)).requestFocus();
                    return true;
                }
                return false;
            }
            if (keyEvent.getAction() == 0 && i10 == 21 && c7531f.getAdapterPosition() % 5 == 0) {
                ((LeftkeybordView) VodSearchActivity.this.m16552i6(R$id.leftKeybord)).m12115i();
                return true;
            }
            return false;
        }

        @Override // p212kd.InterfaceC5156b1
        /* renamed from: b */
        public void mo16310b(AssetList assetList, int i10) {
            AbstractC5868k.m23674f(assetList, "data");
            VodSearchActivity.this.m16534y6(assetList, true);
        }
    }

    public VodSearchActivity() {
        InterfaceC1312h m5965b;
        m5965b = AbstractC1314j.m5965b(C3864c.f17429a);
        this.f17423N = m5965b;
        this.f17424O = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B6 */
    public final void m16513B6() {
        int i10;
        if (this.f17419J == null) {
            ((InterfaceC5856p) m11977r5()).mo23655D0();
            return;
        }
        mo16549d();
        List list = this.f17419J;
        if (list != null) {
            i10 = list.size();
        } else {
            i10 = 0;
        }
        this.f17418I = i10;
        ((TextView) m16552i6(R$id.tvTotalText)).setVisibility(0);
        ((TextView) m16552i6(R$id.llRefresh)).setVisibility(0);
        int i11 = R$id.tvMovelistNumb;
        ((TextView) m16552i6(i11)).setVisibility(0);
        ((TextView) m16552i6(i11)).setText(String.valueOf(this.f17418I));
        m16514C6().m28854l(this.f17419J);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C6 */
    public final C5213p2 m16514C6() {
        return (C5213p2) this.f17423N.getValue();
    }

    /* renamed from: E6 */
    private final void m16515E6() {
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
        ((InterfaceC5856p) m11977r5()).mo23656u(sb2.toString());
    }

    /* renamed from: F6 */
    private final void m16516F6() {
        if (this.f17420K != null) {
            return;
        }
        View inflate = ((ViewStub) m16552i6(R$id.flSearchFeedback)).inflate();
        this.f17420K = inflate;
        if (inflate != null) {
            inflate.setOnKeyListener(new View.OnKeyListener() { // from class: sd.x1
                @Override // android.view.View.OnKeyListener
                public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
                    boolean m16517G6;
                    m16517G6 = VodSearchActivity.m16517G6(VodSearchActivity.this, view, i10, keyEvent);
                    return m16517G6;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G6 */
    public static final boolean m16517G6(VodSearchActivity vodSearchActivity, View view, int i10, KeyEvent keyEvent) {
        AbstractC5868k.m23674f(vodSearchActivity, "this$0");
        if (i10 == 4) {
            View view2 = vodSearchActivity.f17420K;
            if (view2 != null) {
                view2.setVisibility(8);
            }
            ((LeftkeybordView) vodSearchActivity.m16552i6(R$id.leftKeybord)).getFeedbackView().requestFocus();
            return true;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H6 */
    public final void m16518H6(String str) {
        if (this.f17422M != null) {
            return;
        }
        View inflate = ((ViewStub) m16552i6(R$id.mVsSearchResult)).inflate();
        AbstractC5868k.m23672d(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        this.f17422M = (ViewGroup) inflate;
        int i10 = R$id.mVpSearchResult;
        ((CustomViewPager) m16552i6(i10)).setScrollable(false);
        AbstractC0729o m3294d4 = m3294d4();
        AbstractC5868k.m23673e(m3294d4, "supportFragmentManager");
        this.f17421L = new C5233u2(m3294d4);
        ArrayList arrayList = new ArrayList();
        C7124o1 c7124o1 = new C7124o1();
        c7124o1.m27611P9(this);
        arrayList.add(c7124o1);
        C7143y c7143y = new C7143y();
        c7143y.m27653P9(this);
        arrayList.add(c7143y);
        C5233u2 c5233u2 = this.f17421L;
        AbstractC5868k.m23671c(c5233u2);
        c5233u2.m21095d(arrayList);
        ((CustomViewPager) m16552i6(i10)).setAdapter(this.f17421L);
        int i11 = R$id.mHnbSearchNavBar;
        ((HorizontalNavBar) m16552i6(i11)).setOnNavListener(this);
        ((HorizontalNavBar) m16552i6(i11)).setNavData(arrayList);
    }

    /* renamed from: I6 */
    private final void m16519I6() {
        int i10 = R$id.leftKeybord;
        ((LeftkeybordView) m16552i6(i10)).setTextChangeListener(new C3866e());
        ((LeftkeybordView) m16552i6(i10)).setFeedbackClickListener(new C3867f());
        ((LeftkeybordView) m16552i6(i10)).setInputRightKeyListener(new C3868g());
        ((LeftkeybordView) m16552i6(i10)).setSearchRightKeyListener(new C3869h());
        int i11 = R$id.searchGridview;
        VerticalGridView verticalGridView = (VerticalGridView) m16552i6(i11);
        AbstractC5868k.m23673e(verticalGridView, "searchGridview");
        AbstractC7555b0.m28958l(verticalGridView, true, false, null, 6, null);
        ((VerticalGridView) m16552i6(i11)).addOnScrollListener(new C3870i());
        ((TextView) m16552i6(R$id.llRefresh)).setOnClickListener(new View.OnClickListener() { // from class: sd.w1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VodSearchActivity.m16520J6(VodSearchActivity.this, view);
            }
        });
        m16514C6().m21048w(new C3871j());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J6 */
    public static final void m16520J6(VodSearchActivity vodSearchActivity, View view) {
        AbstractC5868k.m23674f(vodSearchActivity, "this$0");
        ((InterfaceC5856p) vodSearchActivity.m11977r5()).mo23655D0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M6 */
    public final void m16521M6() {
        m16516F6();
        m16515E6();
        View view = this.f17420K;
        if (view != null) {
            view.setVisibility(0);
        }
        View view2 = this.f17420K;
        if (view2 != null) {
            view2.requestFocus();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x6 */
    public static final void m16533x6(VodSearchActivity vodSearchActivity) {
        AbstractC5868k.m23674f(vodSearchActivity, "this$0");
        ((LeftkeybordView) vodSearchActivity.m16552i6(R$id.leftKeybord)).m12114h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y6 */
    public final void m16534y6(AssetList assetList, boolean z10) {
        C7619y.m29367d(C7619y.f28056a, m30049S4(), VodDetailsActivity.class, null, new C3863b(assetList, this, z10), 2, null);
    }

    /* renamed from: z6 */
    static /* synthetic */ void m16535z6(VodSearchActivity vodSearchActivity, AssetList assetList, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        vodSearchActivity.m16534y6(assetList, z10);
    }

    /* renamed from: A6 */
    public final ChildColumn m16536A6() {
        return this.f17416G;
    }

    @Override // p102db.InterfaceC4078t0
    /* renamed from: B1 */
    public View mo16537B1(int i10, Object obj) {
        AbstractC5868k.m23674f(obj, "data");
        Fragment fragment = null;
        View inflate = LayoutInflater.from(this).inflate(R$layout.layout_vod_search_nav, (ViewGroup) null);
        AbstractC5868k.m23672d(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) inflate;
        TextView textView = (TextView) viewGroup.findViewById(R$id.mTvNav);
        TextView textView2 = (TextView) viewGroup.findViewById(R$id.mTvNum);
        C5233u2 c5233u2 = this.f17421L;
        if (c5233u2 != null) {
            fragment = c5233u2.mo3587a(i10);
        }
        AbstractC5868k.m23672d(fragment, "null cannot be cast to non-null type com.vod.ui.fragment.BaseVodSearchResultFrag<*>");
        AbstractC5868k.m23673e(textView, "tvNav");
        AbstractC5868k.m23673e(textView2, "tvNum");
        ((AbstractC7089d) fragment).mo27305G9(textView, textView2);
        return viewGroup;
    }

    @Override // p358ud.InterfaceC7113l
    /* renamed from: D0 */
    public void mo16538D0(String str) {
        AbstractC5868k.m23674f(str, "errCode");
        AbstractActivityC2972a.m11957W5(this, str, true, null, null, null, null, null, 124, null);
    }

    @Override // com.module.basemvp.AbstractActivityC2972a
    /* renamed from: D6, reason: merged with bridge method [inline-methods] */
    public InterfaceC5856p mo7516s5() {
        return new C6288z(this, this);
    }

    @Override // p358ud.InterfaceC7113l
    /* renamed from: F0 */
    public void mo16540F0() {
        ((LeftkeybordView) m16552i6(R$id.leftKeybord)).m12115i();
    }

    @Override // p358ud.InterfaceC7113l
    /* renamed from: G */
    public void mo16541G() {
        ((HorizontalNavBar) m16552i6(R$id.mHnbSearchNavBar)).m12101h();
    }

    /* renamed from: K6 */
    public void m16542K6(int i10) {
        this.f17417H = i10;
    }

    /* renamed from: L6 */
    public void m16543L6(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.f17415F = str;
    }

    @Override // p102db.InterfaceC4078t0
    /* renamed from: O3 */
    public boolean mo16544O3(int i10) {
        ((LeftkeybordView) m16552i6(R$id.leftKeybord)).m12115i();
        ((HorizontalNavBar) m16552i6(R$id.mHnbSearchNavBar)).m12102k(i10);
        return true;
    }

    @Override // p102db.InterfaceC4078t0
    /* renamed from: S */
    public boolean mo16545S(int i10) {
        Fragment fragment;
        C5233u2 c5233u2 = this.f17421L;
        if (c5233u2 != null) {
            fragment = c5233u2.mo3587a(i10);
        } else {
            fragment = null;
        }
        AbstractC5868k.m23672d(fragment, "null cannot be cast to non-null type com.vod.ui.fragment.BaseVodSearchResultFrag<*>");
        if (((AbstractC7089d) fragment).mo27306H9()) {
            ((HorizontalNavBar) m16552i6(R$id.mHnbSearchNavBar)).m12102k(i10);
            return true;
        }
        return true;
    }

    @Override // p102db.InterfaceC4078t0
    /* renamed from: Y */
    public void mo16546Y(int i10) {
        Fragment fragment;
        int i11 = 0;
        ((CustomViewPager) m16552i6(R$id.mVpSearchResult)).setCurrentItem(i10, false);
        C7589m1.f27886a.m29129L(String.valueOf(i10 + 1));
        C5233u2 c5233u2 = this.f17421L;
        if (c5233u2 != null) {
            i11 = c5233u2.getCount();
        }
        if (i11 > i10) {
            C5233u2 c5233u22 = this.f17421L;
            if (c5233u22 != null) {
                fragment = c5233u22.mo3587a(i10);
            } else {
                fragment = null;
            }
            AbstractC5868k.m23672d(fragment, "null cannot be cast to non-null type com.vod.ui.fragment.BaseVodSearchResultFrag<*>");
            ((AbstractC7089d) fragment).mo27307I9(this.f17424O);
        }
    }

    @Override // p253nd.InterfaceC5857q
    /* renamed from: c */
    public void mo16547c() {
        ((LoadingView) m16552i6(R$id.loadingView)).setVisibility(0);
    }

    @Override // p102db.InterfaceC4078t0
    /* renamed from: c2 */
    public void mo16548c2(int i10, LinearLayout.LayoutParams layoutParams) {
        AbstractC5868k.m23674f(layoutParams, "lps");
        layoutParams.width = AutoSizeUtils.dp2px(this, 157.0f);
        layoutParams.height = AutoSizeUtils.dp2px(this, 45.0f);
        if (i10 != 0) {
            layoutParams.leftMargin = AutoSizeUtils.dp2px(this, 27.0f);
        }
    }

    @Override // p253nd.InterfaceC5857q
    /* renamed from: d */
    public void mo16549d() {
        ((LoadingView) m16552i6(R$id.loadingView)).setVisibility(8);
    }

    @Override // p253nd.InterfaceC5857q
    /* renamed from: f */
    public void mo16550f(Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled()) {
            ((ImageView) m16552i6(R$id.ivFeedbackQr)).setImageBitmap(bitmap);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.module.basemvp.AbstractActivityC2972a
    /* renamed from: g5 */
    protected void mo7513g5() {
        ((FrameLayout) m16552i6(R$id.mRootView)).setBackgroundDrawable(AbstractC7026c.m27111a(this, R$color.color_1a1a1a));
        String stringExtra = getIntent().getStringExtra("vod_type");
        if (stringExtra == null) {
            stringExtra = "";
        }
        m16543L6(stringExtra);
        this.f17416G = (ChildColumn) getIntent().getShortArrayExtra("childColumn");
        m16542K6(getIntent().getIntExtra("COLUMN_ALL_ID", -1));
        ((VerticalGridView) m16552i6(R$id.searchGridview)).setAdapter(m16514C6());
        m16519I6();
        int i10 = R$id.leftKeybord;
        ((LeftkeybordView) m16552i6(i10)).setHintSize(R$string.vod_search_text_hint);
        ((LeftkeybordView) m16552i6(i10)).post(new Runnable() { // from class: sd.v1
            @Override // java.lang.Runnable
            public final void run() {
                VodSearchActivity.m16533x6(VodSearchActivity.this);
            }
        });
    }

    @Override // p358ud.InterfaceC7113l
    /* renamed from: i1 */
    public void mo16551i1(AssetList assetList) {
        AbstractC5868k.m23674f(assetList, "data");
        m16535z6(this, assetList, false, 2, null);
    }

    /* renamed from: i6 */
    public View m16552i6(int i10) {
        Map map = this.f17425V;
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

    @Override // p253nd.InterfaceC5857q
    /* renamed from: j0 */
    public void mo16553j0(String str) {
        AbstractC5868k.m23674f(str, Constants.KEY_ERROR_CODE);
        if (isFinishing()) {
            return;
        }
        AbstractC5868k.m23672d(this, "null cannot be cast to non-null type com.module.basemvp.BaseMVPActivity<*>");
        AbstractActivityC2972a.m11957W5(this, str, false, null, null, null, null, null, 126, null);
    }

    @Override // p102db.InterfaceC4078t0
    /* renamed from: j3 */
    public boolean mo16554j3(int i10) {
        return true;
    }

    @Override // p102db.InterfaceC4078t0
    /* renamed from: n1 */
    public boolean mo16555n1(int i10) {
        return true;
    }

    @Override // p358ud.InterfaceC7113l
    /* renamed from: p2 */
    public void mo16556p2(PersonDetailInfo personDetailInfo) {
        AbstractC5868k.m23674f(personDetailInfo, "data");
        C7619y.m29367d(C7619y.f28056a, m30049S4(), ActorDetailsActivity.class, null, new C3865d(personDetailInfo), 2, null);
    }

    @Override // p253nd.InterfaceC5857q
    /* renamed from: q */
    public void mo16557q(String str, int i10) {
        AbstractC5868k.m23674f(str, "errCode");
    }

    @Override // p253nd.InterfaceC5857q
    /* renamed from: q3 */
    public void mo16558q3(List list) {
        int i10;
        this.f17419J = list;
        if (list != null) {
            i10 = list.size();
        } else {
            i10 = 0;
        }
        this.f17418I = i10;
        ((TextView) m16552i6(R$id.tvTotalText)).setVisibility(0);
        ((TextView) m16552i6(R$id.llRefresh)).setVisibility(0);
        int i11 = R$id.tvMovelistNumb;
        ((TextView) m16552i6(i11)).setVisibility(0);
        ((TextView) m16552i6(i11)).setText(String.valueOf(this.f17418I));
        int i12 = R$id.searchGridview;
        if (!(((VerticalGridView) m16552i6(i12)).getAdapter() instanceof C5213p2)) {
            ((VerticalGridView) m16552i6(i12)).setAdapter(m16514C6());
        }
        m16514C6().m28854l(list);
    }

    @Override // com.module.basemvp.AbstractActivityC2972a
    /* renamed from: z5 */
    protected int mo7518z5() {
        return R$layout.activity_vodsearch;
    }
}
