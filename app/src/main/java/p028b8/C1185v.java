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
import ne.AbstractC5868k;
import p237m8.C5608b;
import p250n8.InterfaceC5767c;
import p317rb.AbstractC6567a;
import p433zd.AbstractC7786b;

/* renamed from: b8.v */
/* loaded from: classes2.dex */
public final class C1185v extends RecyclerView.AbstractC0789h {

    /* renamed from: a */
    private final Context f4699a;

    /* renamed from: b */
    private LayoutInflater f4700b;

    /* renamed from: c */
    private final ArrayList f4701c;

    /* renamed from: b8.v$a */
    /* loaded from: classes2.dex */
    public static class a extends RecyclerView.AbstractC0787f0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            AbstractC5868k.m23674f(view, "itemView");
            AbstractC7786b.m30161e(view);
        }

        /* renamed from: b */
        public void mo5440b(Context context, int i10, C1152c0 c1152c0) {
            AbstractC5868k.m23674f(context, C3384f.f14563X);
            AbstractC5868k.m23674f(c1152c0, "rank");
        }
    }

    /* renamed from: b8.v$b */
    /* loaded from: classes2.dex */
    public static final class b extends a {

        /* renamed from: a */
        private final TextView f4702a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(View view) {
            super(view);
            AbstractC5868k.m23674f(view, "itemView");
            this.f4702a = (TextView) view.findViewById(R$id.mTvGroupName);
        }

        @Override // p028b8.C1185v.a
        /* renamed from: b */
        public void mo5440b(Context context, int i10, C1152c0 c1152c0) {
            AbstractC5868k.m23674f(context, C3384f.f14563X);
            AbstractC5868k.m23674f(c1152c0, "rank");
            super.mo5440b(context, i10, c1152c0);
            TextView textView = this.f4702a;
            String m5277a = c1152c0.m5277a();
            if (m5277a == null) {
                m5277a = "";
            }
            textView.setText(m5277a);
        }
    }

    /* renamed from: b8.v$c */
    /* loaded from: classes2.dex */
    public static final class c extends a {

        /* renamed from: a */
        private final PlayOffView f4703a;

        /* renamed from: b8.v$c$a */
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
                View inflate = layoutInflater.inflate(R$layout.item_match_ranking_champion_small, (ViewGroup) null);
                AbstractC5868k.m23673e(inflate, "inflater.inflate(R.layou…ing_champion_small, null)");
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
        public c(View view) {
            super(view);
            AbstractC5868k.m23674f(view, "itemView");
            this.f4703a = (PlayOffView) view.findViewById(R$id.mPovPromotion);
        }

        @Override // p028b8.C1185v.a
        /* renamed from: b */
        public void mo5440b(Context context, int i10, C1152c0 c1152c0) {
            AbstractC5868k.m23674f(context, C3384f.f14563X);
            AbstractC5868k.m23674f(c1152c0, "rank");
            C1154d0 m5279c = c1152c0.m5279c();
            if (m5279c != null && !this.f4703a.m11671m()) {
                float m30166j = AbstractC7786b.m30166j(10);
                this.f4703a.m11674r(16 * m30166j, 5 * m30166j);
                float f10 = 32 * m30166j;
                this.f4703a.m11672p(f10, 6 * m30166j, f10, m30166j * 22);
                this.f4703a.m11675t(m5279c.m5291a(), m5279c.m5292b(), m5279c.m5293c(), m5279c.m5294d());
                this.f4703a.setAdapter(new a());
                this.f4703a.m11670c();
                this.f4703a.m11669a();
            }
        }
    }

    /* renamed from: b8.v$d */
    /* loaded from: classes2.dex */
    public static final class d extends a {

        /* renamed from: a */
        private final TextView f4704a;

        /* renamed from: b */
        private final ImageView f4705b;

        /* renamed from: c */
        private final TextView f4706c;

        /* renamed from: d */
        private final TextView f4707d;

        /* renamed from: e */
        private final TextView f4708e;

        /* renamed from: f */
        private final TextView f4709f;

        /* renamed from: g */
        private final TextView f4710g;

        /* renamed from: h */
        private final TextView f4711h;

        /* renamed from: i */
        private final TextView f4712i;

        /* renamed from: j */
        private final TextView f4713j;

        /* renamed from: k */
        private final TextView f4714k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(View view) {
            super(view);
            AbstractC5868k.m23674f(view, "itemView");
            this.f4704a = (TextView) view.findViewById(R$id.mTvRankIndex);
            this.f4705b = (ImageView) view.findViewById(R$id.mIvTeamLogo);
            this.f4706c = (TextView) view.findViewById(R$id.mTvTeamName);
            this.f4707d = (TextView) view.findViewById(R$id.mTvJ);
            this.f4708e = (TextView) view.findViewById(R$id.mTvV);
            this.f4709f = (TextView) view.findViewById(R$id.mTvE);
            this.f4710g = (TextView) view.findViewById(R$id.mTvD);
            this.f4711h = (TextView) view.findViewById(R$id.mTvPf);
            this.f4712i = (TextView) view.findViewById(R$id.mTvPc);
            this.f4713j = (TextView) view.findViewById(R$id.mTvDifPts);
            this.f4714k = (TextView) view.findViewById(R$id.mTvPts);
        }

        @Override // p028b8.C1185v.a
        /* renamed from: b */
        public void mo5440b(Context context, int i10, C1152c0 c1152c0) {
            AbstractC5868k.m23674f(context, C3384f.f14563X);
            AbstractC5868k.m23674f(c1152c0, "rank");
            super.mo5440b(context, i10, c1152c0);
            this.f4704a.setText(String.valueOf(c1152c0.m5278b()));
            MatchScoreTeam m5280d = c1152c0.m5280d();
            if (m5280d != null) {
                this.f4706c.setText(m5280d.getTeamName());
                C5608b c5608b = C5608b.f22632a;
                ImageView imageView = this.f4705b;
                AbstractC5868k.m23673e(imageView, "mIvTeamLogo");
                c5608b.m22780c(context, imageView, m5280d.getLogo());
                this.f4707d.setText(m5280d.getGameCount());
                this.f4708e.setText(m5280d.getWinCount());
                this.f4709f.setText(m5280d.getDrawCount());
                this.f4710g.setText(m5280d.getLossCount());
                this.f4711h.setText(m5280d.getGoalCount());
                this.f4712i.setText(m5280d.getConcedeCount());
                this.f4713j.setText(m5280d.getGoalDifference());
                this.f4714k.setText(m5280d.getPoint());
            }
        }
    }

    public C1185v(Context context) {
        AbstractC5868k.m23674f(context, "mContext");
        this.f4699a = context;
        this.f4701c = new ArrayList();
    }

    /* renamed from: a */
    public final void m5435a() {
        this.f4701c.clear();
        notifyDataSetChanged();
    }

    /* renamed from: b */
    public final void m5436b(C1152c0 c1152c0) {
        AbstractC5868k.m23674f(c1152c0, "rank");
        this.f4701c.add(0, c1152c0);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(a aVar, int i10) {
        AbstractC5868k.m23674f(aVar, "holder");
        Context context = this.f4699a;
        Object obj = this.f4701c.get(i10);
        AbstractC5868k.m23673e(obj, "mRankGroups[position]");
        aVar.mo5440b(context, i10, (C1152c0) obj);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(ViewGroup viewGroup, int i10) {
        AbstractC5868k.m23674f(viewGroup, "parent");
        if (this.f4700b == null) {
            this.f4700b = LayoutInflater.from(this.f4699a);
        }
        if (i10 != 0) {
            if (i10 != 3) {
                if (i10 != 4) {
                    LayoutInflater layoutInflater = this.f4700b;
                    AbstractC5868k.m23671c(layoutInflater);
                    View inflate = layoutInflater.inflate(R$layout.layout_match_rank_category_data_normal, viewGroup, false);
                    AbstractC5868k.m23673e(inflate, "mLayoutInflater!!.inflat…ta_normal, parent, false)");
                    return new d(inflate);
                }
                LayoutInflater layoutInflater2 = this.f4700b;
                AbstractC5868k.m23671c(layoutInflater2);
                View inflate2 = layoutInflater2.inflate(R$layout.layout_match_rank_categoty_promotion, viewGroup, false);
                AbstractC5868k.m23673e(inflate2, "mLayoutInflater!!.inflat…promotion, parent, false)");
                return new c(inflate2);
            }
            View view = new View(this.f4699a);
            view.setLayoutParams(new RecyclerView.C0798q(-1, 50));
            return new a(view);
        }
        LayoutInflater layoutInflater3 = this.f4700b;
        AbstractC5868k.m23671c(layoutInflater3);
        View inflate3 = layoutInflater3.inflate(R$layout.layout_match_rank_category_group, viewGroup, false);
        AbstractC5868k.m23673e(inflate3, "mLayoutInflater!!.inflat…ory_group, parent, false)");
        return new b(inflate3);
    }

    /* renamed from: e */
    public final void m5439e(ArrayList arrayList) {
        AbstractC5868k.m23674f(arrayList, "ranks");
        this.f4701c.clear();
        this.f4701c.addAll(arrayList);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    public int getItemCount() {
        return this.f4701c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    public int getItemViewType(int i10) {
        return ((C1152c0) this.f4701c.get(i10)).m5281e();
    }
}
