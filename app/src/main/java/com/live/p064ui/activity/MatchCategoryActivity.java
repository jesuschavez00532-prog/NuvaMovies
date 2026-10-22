package com.live.p064ui.activity;

import android.text.Html;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import be.AbstractC1314j;
import be.C1328x;
import be.InterfaceC1312h;
import com.live.R$id;
import com.live.R$layout;
import com.live.R$string;
import com.live.p064ui.activity.MatchCategoryActivity;
import com.module.basemvp.AbstractActivityC2972a;
import com.module.view.LoadingView;
import com.open.leanback.widget.VerticalGridView;
import com.request.result.Match;
import com.request.result.ShelveMatch;
import com.widget.recyclerView.LinearLayoutManagerTV;
import com.widget.recyclerView.RecyclerViewTV;
import com.widget.utils.SimpleItemDecoration;
import com.zhy.autolayout.AutoLinearLayout;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import me.InterfaceC5642a;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import ne.C5876s;
import p028b8.C1165j;
import p028b8.C1177p;
import p115e8.InterfaceC4147f;
import p115e8.InterfaceC4148g;
import p147g8.C4375k;
import p399x9.C7531f;
import p400xa.C7554b;
import p433zd.AbstractC7786b;

/* loaded from: classes2.dex */
public final class MatchCategoryActivity extends AbstractActivityC2972a implements InterfaceC4148g {

    /* renamed from: E */
    private final InterfaceC1312h f10854E;

    /* renamed from: F */
    private final InterfaceC1312h f10855F;

    /* renamed from: G */
    private final InterfaceC1312h f10856G;

    /* renamed from: H */
    public Map f10857H = new LinkedHashMap();

    /* renamed from: com.live.ui.activity.MatchCategoryActivity$a */
    /* loaded from: classes2.dex */
    static final class C2854a extends AbstractC5869l implements InterfaceC5660l {
        C2854a() {
            super(1);
        }

        /* renamed from: a */
        public final void m11472a(ShelveMatch shelveMatch) {
            AbstractC5868k.m23674f(shelveMatch, "bean");
            String matchName = shelveMatch.getMatchName();
            if (matchName != null) {
                MatchCategoryActivity matchCategoryActivity = MatchCategoryActivity.this;
                ((InterfaceC4147f) matchCategoryActivity.m11977r5()).mo17359q3();
                matchCategoryActivity.m11462x6().m28847d();
                matchCategoryActivity.m11462x6().m5399H(null);
                ((InterfaceC4147f) matchCategoryActivity.m11977r5()).mo17355A2(matchName, "");
            }
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m11472a((ShelveMatch) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: com.live.ui.activity.MatchCategoryActivity$b */
    /* loaded from: classes2.dex */
    static final class C2855b extends AbstractC5869l implements InterfaceC5642a {
        C2855b() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            if (MatchCategoryActivity.this.m11462x6().m28848f().size() > 0) {
                MatchCategoryActivity.this.m11461w6().m5340u(true);
                C1177p m11462x6 = MatchCategoryActivity.this.m11462x6();
                RecyclerViewTV recyclerViewTV = (RecyclerViewTV) MatchCategoryActivity.this.m11469i6(R$id.mRvMatchSchedule);
                AbstractC5868k.m23673e(recyclerViewTV, "mRvMatchSchedule");
                m11462x6.m5398G(recyclerViewTV);
            }
            return Boolean.TRUE;
        }
    }

    /* renamed from: com.live.ui.activity.MatchCategoryActivity$c */
    /* loaded from: classes2.dex */
    public static final class ViewOnKeyListenerC2856c implements View.OnKeyListener {
        ViewOnKeyListenerC2856c() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i10, KeyEvent keyEvent) {
            boolean z10;
            AbstractC5868k.m23674f(view, "v");
            if (keyEvent != null && keyEvent.getAction() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                int childAdapterPosition = ((RecyclerViewTV) MatchCategoryActivity.this.m11469i6(R$id.mRvMatchSchedule)).getChildAdapterPosition(view);
                if (i10 != 19) {
                    if (i10 == 20 && childAdapterPosition == MatchCategoryActivity.this.m11462x6().getItemCount() - 1) {
                        if (!((InterfaceC4147f) MatchCategoryActivity.this.m11977r5()).mo17360v3()) {
                            MatchCategoryActivity.this.m11448B6(view);
                        } else {
                            ((InterfaceC4147f) MatchCategoryActivity.this.m11977r5()).mo17361x3();
                        }
                        return true;
                    }
                } else if (childAdapterPosition == 0) {
                    if (!((InterfaceC4147f) MatchCategoryActivity.this.m11977r5()).mo17356d2()) {
                        MatchCategoryActivity.this.m11448B6(view);
                    } else {
                        ((InterfaceC4147f) MatchCategoryActivity.this.m11977r5()).mo17357i2();
                    }
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: com.live.ui.activity.MatchCategoryActivity$d */
    /* loaded from: classes2.dex */
    static final class C2857d extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final C2857d f10861a = new C2857d();

        C2857d() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1165j invoke() {
            return new C1165j();
        }
    }

    /* renamed from: com.live.ui.activity.MatchCategoryActivity$e */
    /* loaded from: classes2.dex */
    static final class C2858e extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final C2858e f10862a = new C2858e();

        C2858e() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1177p invoke() {
            return new C1177p();
        }
    }

    /* renamed from: com.live.ui.activity.MatchCategoryActivity$f */
    /* loaded from: classes2.dex */
    static final class C2859f extends AbstractC5869l implements InterfaceC5642a {
        C2859f() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LinearLayoutManagerTV invoke() {
            return new LinearLayoutManagerTV(MatchCategoryActivity.this);
        }
    }

    public MatchCategoryActivity() {
        InterfaceC1312h m5965b;
        InterfaceC1312h m5965b2;
        InterfaceC1312h m5965b3;
        m5965b = AbstractC1314j.m5965b(C2857d.f10861a);
        this.f10854E = m5965b;
        m5965b2 = AbstractC1314j.m5965b(C2858e.f10862a);
        this.f10855F = m5965b2;
        m5965b3 = AbstractC1314j.m5965b(new C2859f());
        this.f10856G = m5965b3;
    }

    /* renamed from: A6 */
    private final void m11447A6() {
        ((LoadingView) m11469i6(R$id.mLoadingView)).setVisibility(8);
        ((AutoLinearLayout) m11469i6(R$id.mLlNoInternet)).setVisibility(8);
        ((AutoLinearLayout) m11469i6(R$id.mLlNoSchedule)).setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B6 */
    public final void m11448B6(View view) {
        new C7554b().m28941a(view).start();
    }

    /* renamed from: C6 */
    private final void m11449C6() {
        int i10 = R$id.mRvMatchSchedule;
        View childAt = ((RecyclerViewTV) m11469i6(i10)).getChildAt(((RecyclerViewTV) m11469i6(i10)).getChildCount() - 1);
        if (childAt == null || ((RecyclerViewTV) m11469i6(i10)).getChildAdapterPosition(childAt) == m11462x6().getItemCount() - 1) {
            return;
        }
        ((RecyclerViewTV) m11469i6(i10)).smoothScrollBy(0, childAt.getHeight());
    }

    /* renamed from: D6 */
    private final void m11450D6() {
        int i10 = R$id.mRvMatchSchedule;
        View childAt = ((RecyclerViewTV) m11469i6(i10)).getChildAt(0);
        if (childAt == null || ((RecyclerViewTV) m11469i6(i10)).getChildAdapterPosition(childAt) == 0) {
            return;
        }
        ((RecyclerViewTV) m11469i6(i10)).smoothScrollBy(0, -childAt.getHeight());
    }

    /* renamed from: q6 */
    private final void m11457q6(ArrayList arrayList) {
        final C5876s c5876s = new C5876s();
        int size = arrayList.size() - 1;
        Match match = null;
        while (true) {
            if (-1 >= size) {
                break;
            }
            Object obj = arrayList.get(size);
            AbstractC5868k.m23673e(obj, "matchList[index]");
            Match match2 = (Match) obj;
            if (match2.isGameEnd()) {
                if (match == null) {
                    c5876s.f23410a = size;
                } else {
                    c5876s.f23410a = size + 1;
                }
            } else {
                size--;
                match = match2;
            }
        }
        m11463y6().scrollToPositionWithOffset(c5876s.f23410a, AbstractC7786b.m30163g(412));
        ((RecyclerViewTV) m11469i6(R$id.mRvMatchSchedule)).postDelayed(new Runnable() { // from class: j8.c
            @Override // java.lang.Runnable
            public final void run() {
                MatchCategoryActivity.m11458r6(MatchCategoryActivity.this, c5876s);
            }
        }, 70L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r6 */
    public static final void m11458r6(MatchCategoryActivity matchCategoryActivity, C5876s c5876s) {
        AbstractC5868k.m23674f(matchCategoryActivity, "this$0");
        AbstractC5868k.m23674f(c5876s, "$focusIndex");
        matchCategoryActivity.m11462x6().m5399H(matchCategoryActivity.m11463y6().findViewByPosition(c5876s.f23410a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s6 */
    public static final void m11459s6(MatchCategoryActivity matchCategoryActivity) {
        AbstractC5868k.m23674f(matchCategoryActivity, "this$0");
        matchCategoryActivity.m11450D6();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t6 */
    public static final void m11460t6(MatchCategoryActivity matchCategoryActivity) {
        AbstractC5868k.m23674f(matchCategoryActivity, "this$0");
        matchCategoryActivity.m11449C6();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w6 */
    public final C1165j m11461w6() {
        return (C1165j) this.f10854E.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x6 */
    public final C1177p m11462x6() {
        return (C1177p) this.f10855F.getValue();
    }

    /* renamed from: y6 */
    private final LinearLayoutManagerTV m11463y6() {
        return (LinearLayoutManagerTV) this.f10856G.getValue();
    }

    @Override // p115e8.InterfaceC4148g
    /* renamed from: G2 */
    public void mo11464G2(Match match) {
        AbstractC5868k.m23674f(match, "match");
        C1177p m11462x6 = m11462x6();
        RecyclerViewTV recyclerViewTV = (RecyclerViewTV) m11469i6(R$id.mRvMatchSchedule);
        AbstractC5868k.m23673e(recyclerViewTV, "mRvMatchSchedule");
        C7531f m5402x = m11462x6.m5402x(recyclerViewTV);
        if (m5402x != null) {
            m11462x6().m5397F(m5402x, match);
        }
    }

    @Override // p115e8.InterfaceC4148g
    /* renamed from: K */
    public void mo11465K(List list) {
        AbstractC5868k.m23674f(list, "matchList");
        m11461w6().m28854l(list);
    }

    @Override // p115e8.InterfaceC4148g
    /* renamed from: b2 */
    public void mo11466b2(ArrayList arrayList, int i10) {
        AbstractC5868k.m23674f(arrayList, "matchList");
        if (i10 < 0) {
            m11462x6().m28846c(0, arrayList);
            ((RecyclerViewTV) m11469i6(R$id.mRvMatchSchedule)).post(new Runnable() { // from class: j8.a
                @Override // java.lang.Runnable
                public final void run() {
                    MatchCategoryActivity.m11459s6(MatchCategoryActivity.this);
                }
            });
            return;
        }
        m11462x6().m28845b(arrayList);
        if (i10 == 0) {
            m11457q6(arrayList);
        } else {
            ((RecyclerViewTV) m11469i6(R$id.mRvMatchSchedule)).post(new Runnable() { // from class: j8.b
                @Override // java.lang.Runnable
                public final void run() {
                    MatchCategoryActivity.m11460t6(MatchCategoryActivity.this);
                }
            });
        }
    }

    @Override // p115e8.InterfaceC4148g
    /* renamed from: c0 */
    public void mo11467c0(boolean z10) {
        m11447A6();
        if (z10) {
            ((LoadingView) m11469i6(R$id.mLoadingView)).setVisibility(0);
        }
    }

    @Override // p115e8.InterfaceC4148g
    /* renamed from: g */
    public void mo11468g() {
        m11447A6();
        ((AutoLinearLayout) m11469i6(R$id.mLlNoSchedule)).setVisibility(0);
    }

    @Override // com.module.basemvp.AbstractActivityC2972a
    /* renamed from: g5 */
    protected void mo7513g5() {
        ((TextView) m11469i6(R$id.mTvMatchScheduleHint)).setText(Html.fromHtml(getResources().getString(R$string.match_schedule_hint)));
        ((VerticalGridView) m11469i6(R$id.mRvMatch)).setAdapter(m11461w6());
        int i10 = R$id.mRvMatchSchedule;
        ((RecyclerViewTV) m11469i6(i10)).setLayoutManager(m11463y6());
        ((RecyclerViewTV) m11469i6(i10)).addItemDecoration(new SimpleItemDecoration(AbstractC7786b.m30166j(10), false, false, 4, null));
        ((RecyclerViewTV) m11469i6(i10)).setAdapter(m11462x6());
        m11461w6().m5341v(new C2854a());
        m11461w6().m5342w(new C2855b());
        m11462x6().m5400I(new ViewOnKeyListenerC2856c());
    }

    /* renamed from: i6 */
    public View m11469i6(int i10) {
        Map map = this.f10857H;
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

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.module.basemvp.AbstractActivityC2972a, android.app.Activity
    public void onRestart() {
        super.onRestart();
        C1177p m11462x6 = m11462x6();
        RecyclerViewTV recyclerViewTV = (RecyclerViewTV) m11469i6(R$id.mRvMatchSchedule);
        AbstractC5868k.m23673e(recyclerViewTV, "mRvMatchSchedule");
        C7531f m5402x = m11462x6.m5402x(recyclerViewTV);
        if (m5402x != null) {
            List m28848f = m11462x6().m28848f();
            if (m28848f.size() > m5402x.getAdapterPosition()) {
                ((InterfaceC4147f) m11977r5()).mo17358o3((Match) m28848f.get(m5402x.getAdapterPosition()));
            }
        }
    }

    @Override // p115e8.InterfaceC4148g
    /* renamed from: t */
    public void mo11470t() {
        m11447A6();
        ((AutoLinearLayout) m11469i6(R$id.mLlNoInternet)).setVisibility(0);
    }

    @Override // com.module.basemvp.AbstractActivityC2972a
    /* renamed from: z5 */
    protected int mo7518z5() {
        return R$layout.activity_match_category;
    }

    @Override // com.module.basemvp.AbstractActivityC2972a
    /* renamed from: z6, reason: merged with bridge method [inline-methods] */
    public InterfaceC4147f mo7516s5() {
        return new C4375k(this, this);
    }
}
