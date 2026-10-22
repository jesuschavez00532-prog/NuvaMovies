package p028b8;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.live.R$color;
import com.live.R$drawable;
import com.live.R$id;
import com.live.R$layout;
import com.live.R$string;
import com.live.bean.ReserveDate;
import com.umeng.analytics.pro.C3384f;
import com.widget.custom.adapter.BaseAdapterImpl;
import java.util.ArrayList;
import java.util.List;
import ne.AbstractC5868k;
import p201k2.AbstractC5086c;

/* renamed from: b8.k0 */
/* loaded from: classes2.dex */
public final class C1168k0 extends BaseAdapter implements BaseAdapterImpl {

    /* renamed from: a */
    private ListView f4612a;

    /* renamed from: b */
    private Context f4613b;

    /* renamed from: c */
    private ArrayList f4614c;

    /* renamed from: d */
    private int f4615d;

    /* renamed from: b8.k0$a */
    /* loaded from: classes2.dex */
    private final class a {

        /* renamed from: a */
        private TextView f4616a;

        /* renamed from: b */
        private TextView f4617b;

        public a() {
        }

        /* renamed from: a */
        public final TextView m5359a() {
            return this.f4616a;
        }

        /* renamed from: b */
        public final TextView m5360b() {
            return this.f4617b;
        }

        /* renamed from: c */
        public final void m5361c(TextView textView) {
            this.f4616a = textView;
        }

        /* renamed from: d */
        public final void m5362d(TextView textView) {
            this.f4617b = textView;
        }
    }

    public C1168k0(Context context, ListView listView) {
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        AbstractC5868k.m23674f(listView, "mListView");
        this.f4612a = listView;
        this.f4613b = context;
        this.f4614c = new ArrayList();
        this.f4615d = -1;
    }

    /* renamed from: a */
    public final String m5355a(int i10) {
        return ((ReserveDate) this.f4614c.get(i10)).getYearInfo();
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public String getItem(int i10) {
        return ((ReserveDate) this.f4614c.get(i10)).getMonthInfo();
    }

    /* renamed from: c */
    public final void m5357c(List list) {
        AbstractC5868k.m23674f(list, "datas");
        this.f4614c.clear();
        this.f4614c.addAll(list);
        notifyDataSetChanged();
    }

    /* renamed from: d */
    public final void m5358d(int i10) {
        this.f4615d = i10;
        int firstVisiblePosition = this.f4612a.getFirstVisiblePosition();
        View childAt = this.f4612a.getChildAt(this.f4612a.getSelectedItemPosition() - firstVisiblePosition);
        if (childAt != null) {
            if (this.f4615d == -1) {
                childAt.setBackgroundResource(R$color.transparent);
            } else {
                childAt.setBackgroundResource(R$drawable.reservation_date_select);
            }
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f4614c.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        View view2;
        a aVar;
        AbstractC5868k.m23674f(viewGroup, "parent");
        if (view == null) {
            aVar = new a();
            view2 = LayoutInflater.from(this.f4613b).inflate(R$layout.layout_reverse_date, viewGroup, false);
            View findViewById = view2.findViewById(R$id.mTvDate);
            AbstractC5868k.m23672d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
            aVar.m5361c((TextView) findViewById);
            View findViewById2 = view2.findViewById(R$id.mTvWeekday);
            AbstractC5868k.m23672d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
            aVar.m5362d((TextView) findViewById2);
            view2.setTag(aVar);
        } else {
            Object tag = view.getTag();
            AbstractC5868k.m23672d(tag, "null cannot be cast to non-null type com.live.adapter.ReserveDateAdapter.ViewHolder");
            a aVar2 = (a) tag;
            view2 = view;
            aVar = aVar2;
        }
        if (AbstractC5086c.m20622o(((ReserveDate) this.f4614c.get(i10)).getYearInfo(), "yyyy-MM-dd")) {
            TextView m5359a = aVar.m5359a();
            AbstractC5868k.m23671c(m5359a);
            m5359a.setText(this.f4613b.getResources().getString(R$string.today));
        } else {
            TextView m5359a2 = aVar.m5359a();
            AbstractC5868k.m23671c(m5359a2);
            m5359a2.setText(((ReserveDate) this.f4614c.get(i10)).getMonthInfo());
        }
        TextView m5360b = aVar.m5360b();
        AbstractC5868k.m23671c(m5360b);
        m5360b.setText(AbstractC5086c.m20612e(((ReserveDate) this.f4614c.get(i10)).getYearInfo()));
        if (this.f4615d == i10) {
            AbstractC5868k.m23671c(view2);
            view2.setBackgroundResource(R$drawable.reservation_date_select);
        } else {
            AbstractC5868k.m23671c(view2);
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
