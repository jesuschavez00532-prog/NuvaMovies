package p028b8;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.live.R$drawable;
import com.live.R$id;
import com.live.R$layout;
import com.live.p063db.ReservationList;
import com.widget.custom.adapter.BaseAdapterImpl;
import java.util.ArrayList;
import java.util.List;
import ne.AbstractC5868k;
import p040c8.C1407f;

/* renamed from: b8.l0 */
/* loaded from: classes2.dex */
public final class C1170l0 extends BaseAdapter implements BaseAdapterImpl {

    /* renamed from: a */
    private final Context f4622a;

    /* renamed from: b */
    private final ArrayList f4623b;

    /* renamed from: b8.l0$a */
    /* loaded from: classes2.dex */
    private final class a {

        /* renamed from: a */
        private TextView f4624a;

        /* renamed from: b */
        private TextView f4625b;

        /* renamed from: c */
        private ImageView f4626c;

        public a() {
        }

        /* renamed from: a */
        public final ImageView m5365a() {
            return this.f4626c;
        }

        /* renamed from: b */
        public final TextView m5366b() {
            return this.f4624a;
        }

        /* renamed from: c */
        public final TextView m5367c() {
            return this.f4625b;
        }

        /* renamed from: d */
        public final void m5368d(ImageView imageView) {
            this.f4626c = imageView;
        }

        /* renamed from: e */
        public final void m5369e(TextView textView) {
            this.f4624a = textView;
        }

        /* renamed from: f */
        public final void m5370f(TextView textView) {
            this.f4625b = textView;
        }
    }

    public C1170l0(Context context) {
        AbstractC5868k.m23674f(context, "mContext");
        this.f4622a = context;
        this.f4623b = new ArrayList();
    }

    @Override // android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public ReservationList getItem(int i10) {
        Object obj = this.f4623b.get(i10);
        AbstractC5868k.m23673e(obj, "mListEpgData[position]");
        return (ReservationList) obj;
    }

    /* renamed from: b */
    public final void m5364b(List list) {
        this.f4623b.clear();
        if (list != null) {
            this.f4623b.addAll(list);
        }
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f4623b.size();
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
            view2 = LayoutInflater.from(this.f4622a).inflate(R$layout.layout_reserve_list, viewGroup, false);
            AbstractC5868k.m23671c(view2);
            View findViewById = view2.findViewById(R$id.tv_content);
            AbstractC5868k.m23672d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
            aVar.m5369e((TextView) findViewById);
            View findViewById2 = view2.findViewById(R$id.tv_time_channel);
            AbstractC5868k.m23672d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
            aVar.m5370f((TextView) findViewById2);
            View findViewById3 = view2.findViewById(R$id.iv_status);
            AbstractC5868k.m23672d(findViewById3, "null cannot be cast to non-null type android.widget.ImageView");
            aVar.m5368d((ImageView) findViewById3);
            view2.setTag(aVar);
        } else {
            Object tag = view.getTag();
            AbstractC5868k.m23672d(tag, "null cannot be cast to non-null type com.live.adapter.ReserveListAdapter.ViewHolder");
            a aVar2 = (a) tag;
            view2 = view;
            aVar = aVar2;
        }
        Object obj = this.f4623b.get(i10);
        AbstractC5868k.m23673e(obj, "mListEpgData[position]");
        ReservationList reservationList = (ReservationList) obj;
        TextView m5366b = aVar.m5366b();
        AbstractC5868k.m23671c(m5366b);
        m5366b.setText(reservationList.getContent());
        TextView m5367c = aVar.m5367c();
        AbstractC5868k.m23671c(m5367c);
        m5367c.setText(reservationList.getTime() + ' ' + reservationList.getName());
        if (C1407f.m6469G(C1407f.f5458a, reservationList.getChannelCode(), false, 2, null) && reservationList.isPlaying()) {
            ImageView m5365a = aVar.m5365a();
            AbstractC5868k.m23671c(m5365a);
            m5365a.setImageResource(R$drawable.play_icon);
        } else if (reservationList.isReserve()) {
            ImageView m5365a2 = aVar.m5365a();
            AbstractC5868k.m23671c(m5365a2);
            m5365a2.setImageResource(R$drawable.reservation_icon);
        } else {
            ImageView m5365a3 = aVar.m5365a();
            AbstractC5868k.m23671c(m5365a3);
            m5365a3.setImageResource(R$drawable.reservation_nomal);
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
