package com.live.p064ui.activity;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import anet.channel.util.ErrorConstant;
import be.AbstractC1314j;
import be.C1328x;
import be.InterfaceC1312h;
import com.live.R$id;
import com.live.R$layout;
import com.live.p064ui.activity.MatchRankCategoryActivity;
import com.module.basemvp.AbstractActivityC2972a;
import com.module.view.LoadingView;
import com.open.leanback.widget.VerticalGridView;
import com.request.result.ShelveMatch;
import com.zhy.autolayout.AutoFrameLayout;
import com.zhy.autolayout.AutoLinearLayout;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import me.InterfaceC5642a;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p028b8.C1152c0;
import p028b8.C1165j;
import p028b8.C1185v;
import p115e8.InterfaceC4153l;
import p115e8.InterfaceC4154m;
import p147g8.C4360c0;
import p433zd.AbstractC7786b;

/* loaded from: classes2.dex */
public final class MatchRankCategoryActivity extends AbstractActivityC2972a implements InterfaceC4154m {

    /* renamed from: E */
    private final InterfaceC1312h f10882E;

    /* renamed from: F */
    private final InterfaceC1312h f10883F;

    /* renamed from: G */
    public Map f10884G = new LinkedHashMap();

    /* renamed from: com.live.ui.activity.MatchRankCategoryActivity$a */
    /* loaded from: classes2.dex */
    static final class C2864a extends AbstractC5869l implements InterfaceC5660l {
        C2864a() {
            super(1);
        }

        /* renamed from: a */
        public final void m11546a(ShelveMatch shelveMatch) {
            AbstractC5868k.m23674f(shelveMatch, "bean");
            String matchName = shelveMatch.getMatchName();
            if (matchName != null) {
                MatchRankCategoryActivity matchRankCategoryActivity = MatchRankCategoryActivity.this;
                matchRankCategoryActivity.m11542h6(R$id.mMatchDesc).setVisibility(8);
                matchRankCategoryActivity.m11536r6().m5435a();
                ((InterfaceC4153l) matchRankCategoryActivity.m11977r5()).mo17367n1(matchName);
            }
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m11546a((ShelveMatch) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: com.live.ui.activity.MatchRankCategoryActivity$b */
    /* loaded from: classes2.dex */
    static final class C2865b extends AbstractC5869l implements InterfaceC5642a {
        C2865b() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            if (MatchRankCategoryActivity.this.m11536r6().getItemCount() > 0) {
                MatchRankCategoryActivity matchRankCategoryActivity = MatchRankCategoryActivity.this;
                int i10 = R$id.mRvRank;
                if (((RecyclerView) matchRankCategoryActivity.m11542h6(i10)).canScrollVertically(1) || ((RecyclerView) MatchRankCategoryActivity.this.m11542h6(i10)).canScrollVertically(-1)) {
                    MatchRankCategoryActivity.this.m11535q6().m5340u(true);
                    ((RecyclerView) MatchRankCategoryActivity.this.m11542h6(i10)).requestFocus();
                }
            }
            return Boolean.TRUE;
        }
    }

    /* renamed from: com.live.ui.activity.MatchRankCategoryActivity$c */
    /* loaded from: classes2.dex */
    static final class C2866c extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final C2866c f10887a = new C2866c();

        C2866c() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1165j invoke() {
            return new C1165j();
        }
    }

    /* renamed from: com.live.ui.activity.MatchRankCategoryActivity$d */
    /* loaded from: classes2.dex */
    static final class C2867d extends AbstractC5869l implements InterfaceC5642a {
        C2867d() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1185v invoke() {
            return new C1185v(MatchRankCategoryActivity.this);
        }
    }

    public MatchRankCategoryActivity() {
        InterfaceC1312h m5965b;
        InterfaceC1312h m5965b2;
        m5965b = AbstractC1314j.m5965b(C2866c.f10887a);
        this.f10882E = m5965b;
        m5965b2 = AbstractC1314j.m5965b(new C2867d());
        this.f10883F = m5965b2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l6 */
    public static final boolean m11533l6(MatchRankCategoryActivity matchRankCategoryActivity, View view, int i10, KeyEvent keyEvent) {
        AbstractC5868k.m23674f(matchRankCategoryActivity, "this$0");
        if (keyEvent.getAction() == 0) {
            if (i10 != 19) {
                if (i10 != 20) {
                    if (i10 == 22) {
                        return true;
                    }
                } else {
                    int i11 = R$id.mRvRank;
                    if (((RecyclerView) matchRankCategoryActivity.m11542h6(i11)).canScrollVertically(1)) {
                        ((RecyclerView) matchRankCategoryActivity.m11542h6(i11)).smoothScrollBy(0, 400);
                    }
                    return true;
                }
            } else {
                int i12 = R$id.mRvRank;
                if (((RecyclerView) matchRankCategoryActivity.m11542h6(i12)).canScrollVertically(-1)) {
                    ((RecyclerView) matchRankCategoryActivity.m11542h6(i12)).smoothScrollBy(0, ErrorConstant.ERROR_CONN_TIME_OUT);
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p6 */
    public static final void m11534p6(MatchRankCategoryActivity matchRankCategoryActivity, View view, boolean z10) {
        AbstractC5868k.m23674f(matchRankCategoryActivity, "this$0");
        if (z10) {
            int i10 = R$id.mRvRank;
            ((RecyclerView) matchRankCategoryActivity.m11542h6(i10)).setScrollBarSize(AbstractC7786b.m30166j(6));
            ((RecyclerView) matchRankCategoryActivity.m11542h6(i10)).setScrollBarStyle(33554432);
        } else {
            int i11 = R$id.mRvRank;
            ((RecyclerView) matchRankCategoryActivity.m11542h6(i11)).setScrollBarSize(0);
            ((RecyclerView) matchRankCategoryActivity.m11542h6(i11)).setScrollBarStyle(33554432);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q6 */
    public final C1165j m11535q6() {
        return (C1165j) this.f10882E.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r6 */
    public final C1185v m11536r6() {
        return (C1185v) this.f10883F.getValue();
    }

    @Override // p115e8.InterfaceC4154m
    /* renamed from: I0 */
    public void mo11537I0() {
        ((LoadingView) m11542h6(R$id.mLoading)).setVisibility(8);
        ((AutoLinearLayout) m11542h6(R$id.mLlNoInternet)).setVisibility(8);
        ((AutoLinearLayout) m11542h6(R$id.mAllNoData)).setVisibility(8);
    }

    @Override // p115e8.InterfaceC4154m
    /* renamed from: K */
    public void mo11538K(List list) {
        AbstractC5868k.m23674f(list, "matchList");
        ((VerticalGridView) m11542h6(R$id.mRvMatch)).setVisibility(0);
        m11542h6(R$id.mVLine).setVisibility(0);
        m11535q6().m28854l(list);
    }

    @Override // p115e8.InterfaceC4154m
    /* renamed from: M */
    public void mo11539M(ArrayList arrayList) {
        AbstractC5868k.m23674f(arrayList, "ranks");
        m11542h6(R$id.mMatchDesc).setVisibility(0);
        int i10 = R$id.mRvRank;
        ViewGroup.LayoutParams layoutParams = ((RecyclerView) m11542h6(i10)).getLayoutParams();
        AbstractC5868k.m23672d(layoutParams, "null cannot be cast to non-null type com.zhy.autolayout.AutoFrameLayout.LayoutParams");
        AutoFrameLayout.C3910a c3910a = (AutoFrameLayout.C3910a) layoutParams;
        AutoFrameLayout.C3910a c3910a2 = new AutoFrameLayout.C3910a(-1, -1);
        ((FrameLayout.LayoutParams) c3910a2).topMargin = AbstractC7786b.m30166j(140);
        ((FrameLayout.LayoutParams) c3910a2).leftMargin = ((FrameLayout.LayoutParams) c3910a).leftMargin;
        ((FrameLayout.LayoutParams) c3910a2).rightMargin = ((FrameLayout.LayoutParams) c3910a).rightMargin;
        ((RecyclerView) m11542h6(i10)).setLayoutParams(c3910a2);
        ((RecyclerView) m11542h6(i10)).setVisibility(0);
        ((RecyclerView) m11542h6(i10)).setLayoutManager(new LinearLayoutManager(m30049S4()));
        ((RecyclerView) m11542h6(i10)).setAdapter(m11536r6());
        m11536r6().m5439e(arrayList);
    }

    @Override // p115e8.InterfaceC4154m
    /* renamed from: c0 */
    public void mo11540c0(boolean z10) {
        if (z10) {
            ((LoadingView) m11542h6(R$id.mLoading)).setVisibility(0);
        } else {
            ((LoadingView) m11542h6(R$id.mLoading)).setVisibility(8);
        }
    }

    @Override // p115e8.InterfaceC4154m
    /* renamed from: g */
    public void mo11541g() {
        ((AutoLinearLayout) m11542h6(R$id.mAllNoData)).setVisibility(0);
    }

    @Override // com.module.basemvp.AbstractActivityC2972a
    /* renamed from: g5 */
    protected void mo7513g5() {
        ((VerticalGridView) m11542h6(R$id.mRvMatch)).setAdapter(m11535q6());
        m11535q6().m5341v(new C2864a());
        m11535q6().m5342w(new C2865b());
        int i10 = R$id.mRvRank;
        ((RecyclerView) m11542h6(i10)).setOnKeyListener(new View.OnKeyListener() { // from class: j8.l
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i11, KeyEvent keyEvent) {
                boolean m11533l6;
                m11533l6 = MatchRankCategoryActivity.m11533l6(MatchRankCategoryActivity.this, view, i11, keyEvent);
                return m11533l6;
            }
        });
        ((RecyclerView) m11542h6(i10)).setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: j8.m
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                MatchRankCategoryActivity.m11534p6(MatchRankCategoryActivity.this, view, z10);
            }
        });
    }

    /* renamed from: h6 */
    public View m11542h6(int i10) {
        Map map = this.f10884G;
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

    @Override // com.module.basemvp.AbstractActivityC2972a
    /* renamed from: s6, reason: merged with bridge method [inline-methods] */
    public InterfaceC4153l mo7516s5() {
        return new C4360c0(this, this);
    }

    @Override // p115e8.InterfaceC4154m
    /* renamed from: t */
    public void mo11544t() {
        ((AutoLinearLayout) m11542h6(R$id.mLlNoInternet)).setVisibility(0);
    }

    @Override // p115e8.InterfaceC4154m
    /* renamed from: t0 */
    public void mo11545t0(C1152c0 c1152c0) {
        AbstractC5868k.m23674f(c1152c0, "rank");
        int i10 = R$id.mMatchDesc;
        m11542h6(i10).setVisibility(8);
        int i11 = R$id.mRvRank;
        ViewGroup.LayoutParams layoutParams = ((RecyclerView) m11542h6(i11)).getLayoutParams();
        AbstractC5868k.m23672d(layoutParams, "null cannot be cast to non-null type com.zhy.autolayout.AutoFrameLayout.LayoutParams");
        AutoFrameLayout.C3910a c3910a = (AutoFrameLayout.C3910a) layoutParams;
        AutoFrameLayout.C3910a c3910a2 = new AutoFrameLayout.C3910a(-1, -1);
        ((FrameLayout.LayoutParams) c3910a2).topMargin = 0;
        ((FrameLayout.LayoutParams) c3910a2).leftMargin = ((FrameLayout.LayoutParams) c3910a).leftMargin;
        ((FrameLayout.LayoutParams) c3910a2).rightMargin = ((FrameLayout.LayoutParams) c3910a).rightMargin;
        ((RecyclerView) m11542h6(i11)).setLayoutParams(c3910a2);
        if (((RecyclerView) m11542h6(i11)).getAdapter() == null) {
            m11542h6(i10).setVisibility(0);
            ((RecyclerView) m11542h6(i11)).setVisibility(0);
            ((RecyclerView) m11542h6(i11)).setLayoutManager(new LinearLayoutManager(m30049S4()));
            ((RecyclerView) m11542h6(i11)).setAdapter(m11536r6());
        }
        m11536r6().m5436b(c1152c0);
    }

    @Override // com.module.basemvp.AbstractActivityC2972a
    /* renamed from: z5 */
    protected int mo7518z5() {
        return R$layout.activity_match_rank_category;
    }
}
