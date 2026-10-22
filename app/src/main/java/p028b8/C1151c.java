package p028b8;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.live.R$id;
import com.live.bean.MatchEventBean;
import ne.AbstractC5868k;

/* renamed from: b8.c */
/* loaded from: classes2.dex */
public final class C1151c extends RecyclerView.AbstractC0787f0 {

    /* renamed from: a */
    private TextView f4533a;

    /* renamed from: b */
    private RecyclerView f4534b;

    /* renamed from: c */
    private RecyclerView f4535c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1151c(View view) {
        super(view);
        AbstractC5868k.m23674f(view, "itemView");
        View findViewById = view.findViewById(R$id.tvTime);
        AbstractC5868k.m23673e(findViewById, "itemView.findViewById(R.id.tvTime)");
        this.f4533a = (TextView) findViewById;
        View findViewById2 = view.findViewById(R$id.rlTeamA);
        AbstractC5868k.m23673e(findViewById2, "itemView.findViewById(R.id.rlTeamA)");
        this.f4534b = (RecyclerView) findViewById2;
        View findViewById3 = view.findViewById(R$id.rlTeamB);
        AbstractC5868k.m23673e(findViewById3, "itemView.findViewById(R.id.rlTeamB)");
        this.f4535c = (RecyclerView) findViewById3;
    }

    /* renamed from: b */
    public final void m5276b(MatchEventBean matchEventBean) {
        C1183t c1183t;
        AbstractC5868k.m23674f(matchEventBean, "item");
        this.f4533a.setText(matchEventBean.getEventTime() + '\'');
        C1183t c1183t2 = null;
        if (matchEventBean.getATeamEventList().size() > 0) {
            this.f4534b.setVisibility(0);
            if (this.f4534b.getLayoutManager() == null) {
                this.f4534b.setLayoutManager(new LinearLayoutManager(this.itemView.getContext()));
            }
            RecyclerView.AbstractC0789h adapter = this.f4534b.getAdapter();
            if (adapter == null) {
                adapter = new C1183t();
                this.f4534b.setAdapter(adapter);
            }
            if (adapter instanceof C1183t) {
                c1183t = (C1183t) adapter;
            } else {
                c1183t = null;
            }
            if (c1183t != null) {
                c1183t.m28854l(matchEventBean.getATeamEventList());
            }
        } else {
            this.f4534b.setVisibility(8);
        }
        if (matchEventBean.getBTeamEventList().size() > 0) {
            this.f4535c.setVisibility(0);
            if (this.f4535c.getLayoutManager() == null) {
                this.f4535c.setLayoutManager(new LinearLayoutManager(this.itemView.getContext()));
            }
            RecyclerView.AbstractC0789h adapter2 = this.f4535c.getAdapter();
            if (adapter2 == null) {
                adapter2 = new C1183t();
                this.f4535c.setAdapter(adapter2);
            }
            if (adapter2 instanceof C1183t) {
                c1183t2 = (C1183t) adapter2;
            }
            if (c1183t2 != null) {
                c1183t2.m28854l(matchEventBean.getBTeamEventList());
                return;
            }
            return;
        }
        this.f4535c.setVisibility(8);
    }
}
