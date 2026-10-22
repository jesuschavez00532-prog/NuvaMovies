package p028b8;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.live.R$layout;
import com.live.bean.MatchEventBean;
import com.request.result.TeamEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ne.AbstractC5868k;

/* renamed from: b8.s */
/* loaded from: classes2.dex */
public final class C1182s extends RecyclerView.AbstractC0789h {

    /* renamed from: b */
    private final int f4679b;

    /* renamed from: a */
    private List f4678a = new ArrayList();

    /* renamed from: c */
    private final int f4680c = 1;

    /* renamed from: d */
    private final int f4681d = 2;

    /* renamed from: a */
    public final void m5422a(List list, List list2) {
        HashMap hashMap = new HashMap();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                TeamEvent teamEvent = (TeamEvent) it.next();
                MatchEventBean matchEventBean = (MatchEventBean) hashMap.get(teamEvent.getEventTime());
                if (matchEventBean == null) {
                    matchEventBean = new MatchEventBean(teamEvent.getEventTime());
                    hashMap.put(teamEvent.getEventTime(), matchEventBean);
                }
                matchEventBean.getATeamEventList().add(teamEvent);
            }
        }
        if (list2 != null) {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                TeamEvent teamEvent2 = (TeamEvent) it2.next();
                MatchEventBean matchEventBean2 = (MatchEventBean) hashMap.get(teamEvent2.getEventTime());
                if (matchEventBean2 == null) {
                    matchEventBean2 = new MatchEventBean(teamEvent2.getEventTime());
                    hashMap.put(teamEvent2.getEventTime(), matchEventBean2);
                }
                matchEventBean2.getBTeamEventList().add(teamEvent2);
            }
        }
        this.f4678a.clear();
        for (Map.Entry entry : hashMap.entrySet()) {
            this.f4678a.add((MatchEventBean) entry.getValue());
        }
        Collections.sort(this.f4678a);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    public int getItemCount() {
        return this.f4678a.size() + 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    public int getItemViewType(int i10) {
        if (i10 == 0) {
            return this.f4679b;
        }
        if (i10 == getItemCount() - 1) {
            return this.f4681d;
        }
        return this.f4680c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    public void onBindViewHolder(RecyclerView.AbstractC0787f0 abstractC0787f0, int i10) {
        AbstractC5868k.m23674f(abstractC0787f0, "holder");
        if (getItemViewType(i10) == this.f4680c) {
            ((C1151c) abstractC0787f0).m5276b((MatchEventBean) this.f4678a.get(i10 - 1));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    public RecyclerView.AbstractC0787f0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        AbstractC5868k.m23674f(viewGroup, "parent");
        if (i10 == this.f4679b) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.item_match_event_head, viewGroup, false);
            AbstractC5868k.m23673e(inflate, "from(parent.context).inf…_event_head,parent,false)");
            return new C1157f(inflate);
        }
        if (i10 == this.f4681d) {
            View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.item_match_event_footer, viewGroup, false);
            AbstractC5868k.m23673e(inflate2, "from(parent.context).inf…vent_footer,parent,false)");
            return new C1157f(inflate2);
        }
        View inflate3 = LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.item_match_event_content, viewGroup, false);
        AbstractC5868k.m23673e(inflate3, "from(parent.context).inf…ent_content,parent,false)");
        return new C1151c(inflate3);
    }
}
