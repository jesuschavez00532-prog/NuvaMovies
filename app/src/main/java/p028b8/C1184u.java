package p028b8;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.live.R$id;
import com.live.R$layout;
import com.live.view.match.PlayOffView;
import com.request.result.MatchPromotion;
import com.request.result.MatchScoreTeam;
import com.umeng.analytics.pro.C3384f;
import java.util.ArrayList;
import ne.AbstractC5864g;
import ne.AbstractC5868k;
import p237m8.C5608b;
import p250n8.InterfaceC5767c;
import p317rb.AbstractC6567a;
import p433zd.AbstractC7786b;

/* renamed from: b8.u */
/* loaded from: classes2.dex */
public final class C1184u extends RecyclerView.AbstractC0789h {

    /* renamed from: d */
    public static final b f4682d = new b(null);

    /* renamed from: a */
    private final Context f4683a;

    /* renamed from: b */
    private LayoutInflater f4684b;

    /* renamed from: c */
    private final ArrayList f4685c;

    /* renamed from: b8.u$a */
    /* loaded from: classes2.dex */
    public static class a extends RecyclerView.AbstractC0787f0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            AbstractC5868k.m23674f(view, "itemView");
            AbstractC7786b.m30161e(view);
        }

        /* renamed from: b */
        public void mo5428b(Context context, int i10, C1152c0 c1152c0) {
            AbstractC5868k.m23674f(context, C3384f.f14563X);
            AbstractC5868k.m23674f(c1152c0, "rank");
        }
    }

    /* renamed from: b8.u$b */
    /* loaded from: classes2.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC5864g abstractC5864g) {
            this();
        }
    }

    /* renamed from: b8.u$c */
    /* loaded from: classes2.dex */
    public static final class c extends a {

        /* renamed from: a */
        private final TextView f4686a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(View view) {
            super(view);
            AbstractC5868k.m23674f(view, "itemView");
            this.f4686a = (TextView) view.findViewById(R$id.mTvGroupName);
        }

        @Override // p028b8.C1184u.a
        /* renamed from: b */
        public void mo5428b(Context context, int i10, C1152c0 c1152c0) {
            AbstractC5868k.m23674f(context, C3384f.f14563X);
            AbstractC5868k.m23674f(c1152c0, "rank");
            super.mo5428b(context, i10, c1152c0);
            TextView textView = this.f4686a;
            String m5277a = c1152c0.m5277a();
            if (m5277a == null) {
                m5277a = "";
            }
            textView.setText(m5277a);
        }
    }

    /* renamed from: b8.u$d */
    /* loaded from: classes2.dex */
    public static final class d extends a {

        /* renamed from: a */
        private final PlayOffView f4687a;

        /* renamed from: b8.u$d$a */
        /* loaded from: classes2.dex */
        public static final class a implements InterfaceC5767c {
            a() {
            }

            @Override // p250n8.InterfaceC5767c
            /* renamed from: a */
            public void mo5429a(Context context, View view, MatchPromotion matchPromotion) {
                String str = null;
                String str2 = null;
                AbstractC5868k.m23674f(context, C3384f.f14563X);
                AbstractC5868k.m23674f(view, "view");
                ImageView imageView = (ImageView) view.findViewById(R$id.mIvLeftTeamLogo);
                C5608b c5608b = C5608b.f22632a;
                AbstractC5868k.m23673e(imageView, "leftTeamLogo");
                String str3 = null;
                if (matchPromotion != null) {
                    str = matchPromotion.getLeftLogo();
                } else {
                    str = null;
                }
                c5608b.m22779b(context, imageView, str);
                ImageView imageView2 = (ImageView) view.findViewById(R$id.mIvRightTeamLogo);
                AbstractC5868k.m23673e(imageView2, "rightTeamLogo");
                if (matchPromotion != null) {
                    str2 = matchPromotion.getRightLogo();
                } else {
                    str2 = null;
                }
                c5608b.m22779b(context, imageView2, str2);
                ImageView imageView3 = (ImageView) view.findViewById(R$id.mIvVs);
                TextView textView = (TextView) view.findViewById(R$id.mTvScore);
                if (matchPromotion != null) {
                    str3 = matchPromotion.getScore();
                }
                if (AbstractC6567a.m25634d(str3)) {
                    imageView3.setVisibility(0);
                    textView.setVisibility(8);
                } else {
                    imageView3.setVisibility(8);
                    textView.setVisibility(0);
                    AbstractC5868k.m23671c(matchPromotion);
                    textView.setText(matchPromotion.getScore());
                }
            }

            @Override // p250n8.InterfaceC5767c
            /* renamed from: b */
            public View mo5430b(LayoutInflater layoutInflater) {
                AbstractC5868k.m23674f(layoutInflater, "inflater");
                View inflate = layoutInflater.inflate(R$layout.item_match_ranking_champion_cup, (ViewGroup) null);
                AbstractC5868k.m23673e(inflate, "inflater.inflate(R.layou…nking_champion_cup, null)");
                return inflate;
            }

            @Override // p250n8.InterfaceC5767c
            /* renamed from: c */
            public void mo5431c(Context context, View view, MatchPromotion matchPromotion, boolean z10) {
                AbstractC5868k.m23674f(context, C3384f.f14563X);
                AbstractC5868k.m23674f(view, "view");
                AbstractC5868k.m23674f(matchPromotion, "data");
                ImageView imageView = (ImageView) view.findViewById(R$id.mIvTeamLogo);
                if (z10) {
                    C5608b c5608b = C5608b.f22632a;
                    AbstractC5868k.m23673e(imageView, "ivTeamLogo");
                    c5608b.m22778a(context, imageView, matchPromotion.getLeftLogo());
                } else {
                    C5608b c5608b2 = C5608b.f22632a;
                    AbstractC5868k.m23673e(imageView, "ivTeamLogo");
                    c5608b2.m22778a(context, imageView, matchPromotion.getRightLogo());
                }
                TextView textView = (TextView) view.findViewById(R$id.mTvTeamName);
                String str = "";
                if (z10) {
                    String leftName = matchPromotion.getLeftName();
                    if (leftName != null) {
                        str = leftName;
                    }
                    textView.setText(str);
                    return;
                }
                String rightName = matchPromotion.getRightName();
                if (rightName != null) {
                    str = rightName;
                }
                textView.setText(str);
            }

            @Override // p250n8.InterfaceC5767c
            /* renamed from: d */
            public void mo5432d(Context context, View view, MatchPromotion matchPromotion) {
                String str = null;
                AbstractC5868k.m23674f(context, C3384f.f14563X);
                AbstractC5868k.m23674f(view, "view");
                if (matchPromotion != null) {
                    str = matchPromotion.getScore();
                } else {
                    str = null;
                }
                if (AbstractC6567a.m25634d(str)) {
                    view.setVisibility(8);
                    return;
                }
                view.setVisibility(0);
                ImageView imageView = (ImageView) view.findViewById(R$id.mIvChampionTeamLogo);
                AbstractC5868k.m23671c(matchPromotion);
                if (matchPromotion.getLeftScore().compareTo(matchPromotion.getRightScore()) > 0) {
                    C5608b c5608b = C5608b.f22632a;
                    AbstractC5868k.m23673e(imageView, "ivChampionTeamLogo");
                    c5608b.m22779b(context, imageView, matchPromotion.getLeftLogo());
                } else {
                    C5608b c5608b2 = C5608b.f22632a;
                    AbstractC5868k.m23673e(imageView, "ivChampionTeamLogo");
                    c5608b2.m22779b(context, imageView, matchPromotion.getRightLogo());
                }
            }

            @Override // p250n8.InterfaceC5767c
            /* renamed from: e */
            public View mo5433e(LayoutInflater layoutInflater) {
                AbstractC5868k.m23674f(layoutInflater, "inflater");
                View inflate = layoutInflater.inflate(R$layout.item_match_ranking_champion_large, (ViewGroup) null);
                AbstractC5868k.m23673e(inflate, "inflater.inflate(R.layou…ing_champion_large, null)");
                return inflate;
            }

            @Override // p250n8.InterfaceC5767c
            /* renamed from: f */
            public View mo5434f(LayoutInflater layoutInflater, boolean z10) {
                View inflate;
                AbstractC5868k.m23674f(layoutInflater, "inflater");
                if (z10) {
                    inflate = layoutInflater.inflate(R$layout.item_match_ranking_left_team, (ViewGroup) null);
                } else {
                    inflate = layoutInflater.inflate(R$layout.item_match_ranking_right_team, (ViewGroup) null);
                }
                AbstractC5868k.m23673e(inflate, "view");
                return inflate;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(View view) {
            super(view);
            AbstractC5868k.m23674f(view, "itemView");
            this.f4687a = (PlayOffView) view.findViewById(R$id.mPovPromotion);
        }

        @Override // p028b8.C1184u.a
        /* renamed from: b */
        public void mo5428b(Context context, int i10, C1152c0 c1152c0) {
            AbstractC5868k.m23674f(context, C3384f.f14563X);
            AbstractC5868k.m23674f(c1152c0, "rank");
            C1154d0 m5279c = c1152c0.m5279c();
            if (m5279c != null && !this.f4687a.m11671m()) {
                float m30166j = AbstractC7786b.m30166j(10);
                this.f4687a.m11674r(20 * m30166j, 5 * m30166j);
                this.f4687a.m11672p(36 * m30166j, 6 * m30166j, 42 * m30166j, m30166j * 28);
                this.f4687a.m11675t(m5279c.m5291a(), m5279c.m5292b(), m5279c.m5293c(), m5279c.m5294d());
                this.f4687a.setAdapter(new a());
                this.f4687a.m11670c();
                this.f4687a.m11669a();
            }
        }
    }

    /* renamed from: b8.u$e */
    /* loaded from: classes2.dex */
    public static final class e extends a {

        /* renamed from: a */
        private final TextView f4688a;

        /* renamed from: b */
        private final ImageView f4689b;

        /* renamed from: c */
        private final TextView f4690c;

        /* renamed from: d */
        private final TextView f4691d;

        /* renamed from: e */
        private final TextView f4692e;

        /* renamed from: f */
        private final TextView f4693f;

        /* renamed from: g */
        private final TextView f4694g;

        /* renamed from: h */
        private final TextView f4695h;

        /* renamed from: i */
        private final TextView f4696i;

        /* renamed from: j */
        private final TextView f4697j;

        /* renamed from: k */
        private final TextView f4698k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(View view) {
            super(view);
            AbstractC5868k.m23674f(view, "itemView");
            this.f4688a = (TextView) view.findViewById(R$id.mTvRankIndex);
            this.f4689b = (ImageView) view.findViewById(R$id.mIvTeamLogo);
            this.f4690c = (TextView) view.findViewById(R$id.mTvTeamName);
            this.f4691d = (TextView) view.findViewById(R$id.mTvJ);
            this.f4692e = (TextView) view.findViewById(R$id.mTvV);
            this.f4693f = (TextView) view.findViewById(R$id.mTvE);
            this.f4694g = (TextView) view.findViewById(R$id.mTvD);
            this.f4695h = (TextView) view.findViewById(R$id.mTvPf);
            this.f4696i = (TextView) view.findViewById(R$id.mTvPc);
            this.f4697j = (TextView) view.findViewById(R$id.mTvDifPts);
            this.f4698k = (TextView) view.findViewById(R$id.mTvPts);
        }

        @Override // p028b8.C1184u.a
        /* renamed from: b */
        public void mo5428b(Context context, int i10, C1152c0 c1152c0) {
            AbstractC5868k.m23674f(context, C3384f.f14563X);
            AbstractC5868k.m23674f(c1152c0, "rank");
            super.mo5428b(context, i10, c1152c0);
            this.f4688a.setText(String.valueOf(c1152c0.m5278b()));
            MatchScoreTeam m5280d = c1152c0.m5280d();
            if (m5280d != null) {
                this.f4690c.setText(m5280d.getTeamName());
                C5608b c5608b = C5608b.f22632a;
                ImageView imageView = this.f4689b;
                AbstractC5868k.m23673e(imageView, "mIvTeamLogo");
                c5608b.m22780c(context, imageView, m5280d.getLogo());
                this.f4691d.setText(m5280d.getGameCount());
                this.f4692e.setText(m5280d.getWinCount());
                this.f4693f.setText(m5280d.getDrawCount());
                this.f4694g.setText(m5280d.getLossCount());
                this.f4695h.setText(m5280d.getGoalCount());
                this.f4696i.setText(m5280d.getConcedeCount());
                this.f4697j.setText(m5280d.getGoalDifference());
                this.f4698k.setText(m5280d.getPoint());
            }
        }
    }

    public C1184u(Context context) {
        AbstractC5868k.m23674f(context, "mContext");
        this.f4683a = context;
        this.f4685c = new ArrayList();
    }

    /* renamed from: a */
    public final void m5424a(C1152c0 c1152c0) {
        AbstractC5868k.m23674f(c1152c0, "rank");
        this.f4685c.add(0, c1152c0);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(a aVar, int i10) {
        AbstractC5868k.m23674f(aVar, "holder");
        Context context = this.f4683a;
        Object obj = this.f4685c.get(i10);
        AbstractC5868k.m23673e(obj, "mRankGroups[position]");
        aVar.mo5428b(context, i10, (C1152c0) obj);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(ViewGroup viewGroup, int i10) {
        AbstractC5868k.m23674f(viewGroup, "parent");
        if (this.f4684b == null) {
            this.f4684b = LayoutInflater.from(this.f4683a);
        }
        if (i10 != 0) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        LayoutInflater layoutInflater = this.f4684b;
                        AbstractC5868k.m23671c(layoutInflater);
                        View inflate = layoutInflater.inflate(R$layout.layout_match_rank_data_normal, viewGroup, false);
                        AbstractC5868k.m23673e(inflate, "mLayoutInflater!!.inflat…ta_normal, parent, false)");
                        return new e(inflate);
                    }
                    LayoutInflater layoutInflater2 = this.f4684b;
                    AbstractC5868k.m23671c(layoutInflater2);
                    View inflate2 = layoutInflater2.inflate(R$layout.layout_match_rank_promotion, viewGroup, false);
                    AbstractC5868k.m23673e(inflate2, "mLayoutInflater!!.inflat…promotion, parent, false)");
                    return new d(inflate2);
                }
                View view = new View(this.f4683a);
                view.setLayoutParams(new RecyclerView.C0798q(-1, 50));
                return new a(view);
            }
            LayoutInflater layoutInflater3 = this.f4684b;
            AbstractC5868k.m23671c(layoutInflater3);
            View inflate3 = layoutInflater3.inflate(R$layout.layout_match_rank_data_highlight, viewGroup, false);
            AbstractC5868k.m23673e(inflate3, "mLayoutInflater!!.inflat…highlight, parent, false)");
            return new e(inflate3);
        }
        LayoutInflater layoutInflater4 = this.f4684b;
        AbstractC5868k.m23671c(layoutInflater4);
        View inflate4 = layoutInflater4.inflate(R$layout.layout_match_rank_group, viewGroup, false);
        AbstractC5868k.m23673e(inflate4, "mLayoutInflater!!.inflat…ank_group, parent, false)");
        return new c(inflate4);
    }

    /* renamed from: d */
    public final void m5427d(ArrayList arrayList) {
        AbstractC5868k.m23674f(arrayList, "ranks");
        this.f4685c.clear();
        this.f4685c.addAll(arrayList);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    public int getItemCount() {
        return this.f4685c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    public int getItemViewType(int i10) {
        return ((C1152c0) this.f4685c.get(i10)).m5281e();
    }
}
