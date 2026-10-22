package p028b8;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.live.R$color;
import com.live.R$id;
import com.live.R$layout;
import com.live.R$string;
import com.live.bean.MatchDate;
import com.widget.custom.adapter.BaseAdapterImpl;
import java.util.ArrayList;
import java.util.List;
import ne.AbstractC5868k;
import p201k2.AbstractC5086c;
import p433zd.AbstractC7786b;

/* renamed from: b8.q */
/* loaded from: classes2.dex */
public final class C1179q extends BaseAdapter implements BaseAdapterImpl {

    /* renamed from: a */
    private Context f4657a;

    /* renamed from: b */
    private ListView f4658b;

    /* renamed from: c */
    private ArrayList f4659c;

    /* renamed from: d */
    private int f4660d;

    /* renamed from: e */
    private String[] f4661e;

    /* renamed from: b8.q$a */
    /* loaded from: classes2.dex */
    private final class a {

        /* renamed from: a */
        private TextView f4662a;

        /* renamed from: b */
        private TextView f4663b;

        public a() {
        }

        /* renamed from: a */
        public final TextView m5411a() {
            return this.f4663b;
        }

        /* renamed from: b */
        public final TextView m5412b() {
            return this.f4662a;
        }

        /* renamed from: c */
        public final void m5413c(TextView textView) {
            this.f4663b = textView;
        }

        /* renamed from: d */
        public final void m5414d(TextView textView) {
            this.f4662a = textView;
        }
    }

    public C1179q(Context context, ListView listView) {
        AbstractC5868k.m23674f(context, "mContext");
        AbstractC5868k.m23674f(listView, "mListView");
        this.f4657a = context;
        this.f4658b = listView;
        this.f4659c = new ArrayList();
        this.f4660d = -1;
        this.f4661e = new String[]{this.f4657a.getResources().getString(R$string.sun), this.f4657a.getResources().getString(R$string.mon), this.f4657a.getResources().getString(R$string.tue), this.f4657a.getResources().getString(R$string.wed), this.f4657a.getResources().getString(R$string.thu), this.f4657a.getResources().getString(R$string.fri), this.f4657a.getResources().getString(R$string.sat)};
    }

    @Override // android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public MatchDate getItem(int i10) {
        Object obj = this.f4659c.get(i10);
        AbstractC5868k.m23673e(obj, "mMatchDate[position]");
        return (MatchDate) obj;
    }

    /* renamed from: b */
    public final ArrayList m5408b() {
        return this.f4659c;
    }

    /* renamed from: c */
    public final void m5409c(List list) {
        AbstractC5868k.m23674f(list, "data");
        this.f4659c.clear();
        this.f4659c.addAll(list);
        notifyDataSetChanged();
    }

    /* renamed from: d */
    public final void m5410d(int i10) {
        this.f4660d = i10;
        int firstVisiblePosition = this.f4658b.getFirstVisiblePosition();
        View childAt = this.f4658b.getChildAt(this.f4658b.getSelectedItemPosition() - firstVisiblePosition);
        if (childAt != null) {
            Object tag = childAt.getTag();
            AbstractC5868k.m23672d(tag, "null cannot be cast to non-null type com.live.adapter.MatchDateAdapter.ViewHolder");
            a aVar = (a) tag;
            if (this.f4660d == -1) {
                TextView m5411a = aVar.m5411a();
                if (m5411a != null) {
                    m5411a.setTextColor(this.f4657a.getResources().getColor(R$color.color_font_main));
                }
                TextView m5412b = aVar.m5412b();
                if (m5412b != null) {
                    m5412b.setTextColor(this.f4657a.getResources().getColor(R$color.color_font_main));
                }
                childAt.setBackgroundResource(R$color.transparent);
                return;
            }
            TextView m5411a2 = aVar.m5411a();
            if (m5411a2 != null) {
                m5411a2.setTextColor(this.f4657a.getResources().getColor(R$color.color_main));
            }
            TextView m5412b2 = aVar.m5412b();
            if (m5412b2 != null) {
                m5412b2.setTextColor(this.f4657a.getResources().getColor(R$color.color_main));
            }
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f4659c.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        View view2;
        a aVar;
        View view3;
        AbstractC5868k.m23674f(viewGroup, "parent");
        if (view == null) {
            aVar = new a();
            view2 = LayoutInflater.from(this.f4657a).inflate(R$layout.layout_match_date, viewGroup, false);
            AbstractC7786b.m30161e(view2);
            View view4 = null;
            if (view2 != null) {
                view3 = view2.findViewById(R$id.mTvDate);
            } else {
                view3 = null;
            }
            AbstractC5868k.m23672d(view3, "null cannot be cast to non-null type android.widget.TextView");
            aVar.m5413c((TextView) view3);
            if (view2 != null) {
                view4 = view2.findViewById(R$id.mTvWeekday);
            }
            AbstractC5868k.m23672d(view4, "null cannot be cast to non-null type android.widget.TextView");
            aVar.m5414d((TextView) view4);
            view2.setTag(aVar);
        } else {
            Object tag = view.getTag();
            AbstractC5868k.m23672d(tag, "null cannot be cast to non-null type com.live.adapter.MatchDateAdapter.ViewHolder");
            a aVar2 = (a) tag;
            view2 = view;
            aVar = aVar2;
        }
        if (AbstractC5086c.m20622o(((MatchDate) this.f4659c.get(i10)).getYearInfo(), "yyyy-MM-dd")) {
            TextView m5412b = aVar.m5412b();
            AbstractC5868k.m23671c(m5412b);
            m5412b.setText(this.f4657a.getResources().getString(R$string.today));
        } else {
            TextView m5412b2 = aVar.m5412b();
            AbstractC5868k.m23671c(m5412b2);
            m5412b2.setText(AbstractC5086c.m20613f(((MatchDate) this.f4659c.get(i10)).getYearInfo(), this.f4661e));
        }
        TextView m5411a = aVar.m5411a();
        AbstractC5868k.m23671c(m5411a);
        StringBuilder sb2 = new StringBuilder();
        String substring = ((MatchDate) this.f4659c.get(i10)).getMonthInfo().substring(3);
        AbstractC5868k.m23673e(substring, "this as java.lang.String).substring(startIndex)");
        sb2.append(substring);
        sb2.append('/');
        String substring2 = ((MatchDate) this.f4659c.get(i10)).getMonthInfo().substring(0, 2);
        AbstractC5868k.m23673e(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
        sb2.append(substring2);
        m5411a.setText(sb2.toString());
        if (this.f4660d == i10) {
            TextView m5411a2 = aVar.m5411a();
            if (m5411a2 != null) {
                m5411a2.setTextColor(this.f4657a.getResources().getColor(R$color.color_main));
            }
            TextView m5412b3 = aVar.m5412b();
            if (m5412b3 != null) {
                m5412b3.setTextColor(this.f4657a.getResources().getColor(R$color.color_main));
            }
        } else {
            TextView m5411a3 = aVar.m5411a();
            if (m5411a3 != null) {
                m5411a3.setTextColor(this.f4657a.getResources().getColor(R$color.color_c4c4c4));
            }
            TextView m5412b4 = aVar.m5412b();
            if (m5412b4 != null) {
                m5412b4.setTextColor(this.f4657a.getResources().getColor(R$color.color_c4c4c4));
            }
            view2.setBackgroundResource(R$color.transparent);
        }
        return view2;
    }

    @Override // com.widget.custom.adapter.BaseAdapterImpl
    public void setSecondPosition(int i10) {
    }

    @Override // com.widget.custom.adapter.BaseAdapterImpl
    public void setSelectPosition(int i10) {
    }
}
