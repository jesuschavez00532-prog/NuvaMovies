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
import com.live.bean.EpgDate;
import com.widget.custom.adapter.BaseAdapterImpl;
import java.util.ArrayList;
import java.util.List;
import ne.AbstractC5868k;
import p201k2.AbstractC5086c;

/* renamed from: b8.d */
/* loaded from: classes2.dex */
public final class C1153d extends BaseAdapter implements BaseAdapterImpl {

    /* renamed from: a */
    private Context f4541a;

    /* renamed from: b */
    private ListView f4542b;

    /* renamed from: c */
    private ArrayList f4543c;

    /* renamed from: d */
    private int f4544d;

    /* renamed from: b8.d$a */
    /* loaded from: classes2.dex */
    private final class a {

        /* renamed from: a */
        private TextView f4545a;

        /* renamed from: b */
        private TextView f4546b;

        public a() {
        }

        /* renamed from: a */
        public final TextView m5287a() {
            return this.f4545a;
        }

        /* renamed from: b */
        public final TextView m5288b() {
            return this.f4546b;
        }

        /* renamed from: c */
        public final void m5289c(TextView textView) {
            this.f4545a = textView;
        }

        /* renamed from: d */
        public final void m5290d(TextView textView) {
            this.f4546b = textView;
        }
    }

    public C1153d(Context context, ListView listView) {
        AbstractC5868k.m23674f(context, "mContext");
        AbstractC5868k.m23674f(listView, "mListView");
        this.f4541a = context;
        this.f4542b = listView;
        this.f4543c = new ArrayList();
        this.f4544d = -1;
    }

    /* renamed from: a */
    public final boolean m5282a(int i10) {
        if (i10 < 0) {
            return false;
        }
        return AbstractC5086c.m20622o(((EpgDate) this.f4543c.get(i10)).getYearInfo(), "yyyy-MM-dd");
    }

    /* renamed from: b */
    public final ArrayList m5283b() {
        return this.f4543c;
    }

    @Override // android.widget.Adapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public EpgDate getItem(int i10) {
        Object obj = this.f4543c.get(i10);
        AbstractC5868k.m23673e(obj, "mEpgDate[position]");
        return (EpgDate) obj;
    }

    /* renamed from: d */
    public final void m5285d(List list) {
        AbstractC5868k.m23674f(list, "data");
        this.f4543c.clear();
        this.f4543c.addAll(list);
        notifyDataSetChanged();
    }

    /* renamed from: e */
    public final void m5286e(int i10) {
        this.f4544d = i10;
        int firstVisiblePosition = this.f4542b.getFirstVisiblePosition();
        View childAt = this.f4542b.getChildAt(this.f4542b.getSelectedItemPosition() - firstVisiblePosition);
        if (childAt != null) {
            Object tag = childAt.getTag();
            AbstractC5868k.m23672d(tag, "null cannot be cast to non-null type com.live.adapter.EpgDateAdapter.ViewHolder");
            a aVar = (a) tag;
            if (this.f4544d == -1) {
                TextView m5287a = aVar.m5287a();
                if (m5287a != null) {
                    m5287a.setTextColor(this.f4541a.getResources().getColor(R$color.color_c4c4c4));
                }
                TextView m5288b = aVar.m5288b();
                if (m5288b != null) {
                    m5288b.setTextColor(this.f4541a.getResources().getColor(R$color.color_c4c4c4));
                }
                childAt.setBackgroundResource(R$color.transparent);
                return;
            }
            TextView m5287a2 = aVar.m5287a();
            if (m5287a2 != null) {
                m5287a2.setTextColor(this.f4541a.getResources().getColor(R$color.color_main));
            }
            TextView m5288b2 = aVar.m5288b();
            if (m5288b2 != null) {
                m5288b2.setTextColor(this.f4541a.getResources().getColor(R$color.color_main));
            }
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f4543c.size();
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
            view2 = LayoutInflater.from(this.f4541a).inflate(R$layout.layout_epg_date, viewGroup, false);
            if (view2 != null) {
                view3 = view2.findViewById(R$id.mTvDate);
            } else {
                view3 = null;
            }
            AbstractC5868k.m23672d(view3, "null cannot be cast to non-null type android.widget.TextView");
            aVar.m5289c((TextView) view3);
            View findViewById = view2.findViewById(R$id.mTvWeekday);
            AbstractC5868k.m23672d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
            aVar.m5290d((TextView) findViewById);
            view2.setTag(aVar);
        } else {
            Object tag = view.getTag();
            AbstractC5868k.m23672d(tag, "null cannot be cast to non-null type com.live.adapter.EpgDateAdapter.ViewHolder");
            a aVar2 = (a) tag;
            view2 = view;
            aVar = aVar2;
        }
        if (AbstractC5086c.m20622o(((EpgDate) this.f4543c.get(i10)).getYearInfo(), "yyyy-MM-dd")) {
            TextView m5287a = aVar.m5287a();
            AbstractC5868k.m23671c(m5287a);
            m5287a.setText(this.f4541a.getResources().getString(R$string.today));
        } else {
            TextView m5287a2 = aVar.m5287a();
            AbstractC5868k.m23671c(m5287a2);
            m5287a2.setText(((EpgDate) this.f4543c.get(i10)).getMonthInfo());
        }
        TextView m5288b = aVar.m5288b();
        AbstractC5868k.m23671c(m5288b);
        m5288b.setText(AbstractC5086c.m20612e(((EpgDate) this.f4543c.get(i10)).getYearInfo()));
        if (this.f4544d == i10) {
            TextView m5287a3 = aVar.m5287a();
            if (m5287a3 != null) {
                m5287a3.setTextColor(this.f4541a.getResources().getColor(R$color.color_main));
            }
            TextView m5288b2 = aVar.m5288b();
            if (m5288b2 != null) {
                m5288b2.setTextColor(this.f4541a.getResources().getColor(R$color.color_main));
            }
        } else {
            TextView m5287a4 = aVar.m5287a();
            if (m5287a4 != null) {
                m5287a4.setTextColor(this.f4541a.getResources().getColor(R$color.color_c4c4c4));
            }
            TextView m5288b3 = aVar.m5288b();
            if (m5288b3 != null) {
                m5288b3.setTextColor(this.f4541a.getResources().getColor(R$color.color_c4c4c4));
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
