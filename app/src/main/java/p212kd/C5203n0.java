package p212kd;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vod.R$layout;
import java.util.ArrayList;
import me.InterfaceC5642a;
import ne.AbstractC5868k;
import p043ce.AbstractC1500l;
import p225ld.AbstractC5551e;
import p225ld.C5550d;

/* renamed from: kd.n0 */
/* loaded from: classes3.dex */
public final class C5203n0 extends RecyclerView.AbstractC0789h {

    /* renamed from: a */
    private Context f21295a;

    /* renamed from: b */
    private InterfaceC5642a f21296b;

    /* renamed from: c */
    private String f21297c;

    /* renamed from: d */
    private RecyclerView f21298d;

    /* renamed from: e */
    private ArrayList f21299e;

    public C5203n0(Context context, InterfaceC5642a interfaceC5642a) {
        AbstractC5868k.m23674f(context, "mContext");
        AbstractC5868k.m23674f(interfaceC5642a, "mPressUpListener");
        this.f21295a = context;
        this.f21296b = interfaceC5642a;
        setHasStableIds(true);
        this.f21297c = "";
        this.f21299e = new ArrayList();
    }

    /* renamed from: a */
    public final void m21022a(ArrayList arrayList) {
        AbstractC5868k.m23674f(arrayList, "beans");
        this.f21299e.addAll(arrayList);
        int i10 = 0;
        for (Object obj : this.f21299e) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC1500l.m6991j();
            }
            C5550d c5550d = (C5550d) obj;
            c5550d.m22505h(i10);
            notifyItemChanged(c5550d.m22501d());
            i10 = i11;
        }
    }

    /* renamed from: b */
    public final String m21023b() {
        return this.f21297c;
    }

    /* renamed from: c */
    public final Context m21024c() {
        return this.f21295a;
    }

    /* renamed from: d */
    public final InterfaceC5642a m21025d() {
        return this.f21296b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(AbstractC5243x0 abstractC5243x0, int i10) {
        AbstractC5868k.m23674f(abstractC5243x0, "holder");
        Context context = this.f21295a;
        Object obj = this.f21299e.get(i10);
        AbstractC5868k.m23673e(obj, "mDatas[position]");
        abstractC5243x0.mo21032b(this, context, (C5550d) obj, i10, this.f21298d);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public AbstractC5243x0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        AbstractC5868k.m23674f(viewGroup, "parent");
        LayoutInflater from = LayoutInflater.from(this.f21295a);
        if (i10 == AbstractC5551e.m22509c()) {
            View inflate = from.inflate(R$layout.item_recommend4, viewGroup, false);
            AbstractC5868k.m23673e(inflate, "inflater.inflate(R.layou…ecommend4, parent, false)");
            return new C5223s0(inflate);
        }
        if (i10 == AbstractC5551e.m22510d()) {
            View inflate2 = from.inflate(R$layout.item_recommend5, viewGroup, false);
            AbstractC5868k.m23673e(inflate2, "inflater.inflate(R.layou…ecommend5, parent, false)");
            return new C5231u0(inflate2);
        }
        if (i10 == AbstractC5551e.m22511e()) {
            View inflate3 = from.inflate(R$layout.item_recommend6, viewGroup, false);
            AbstractC5868k.m23673e(inflate3, "inflater.inflate(R.layou…ecommend6, parent, false)");
            return new C5239w0(inflate3);
        }
        if (i10 == AbstractC5551e.m22508b()) {
            View inflate4 = from.inflate(R$layout.item_column_person_list, viewGroup, false);
            AbstractC5868k.m23673e(inflate4, "inflater.inflate(R.layou…rson_list, parent, false)");
            return new C5207o0(inflate4);
        }
        if (i10 == AbstractC5551e.m22507a()) {
            View inflate5 = from.inflate(R$layout.item_column_horizon_list, viewGroup, false);
            AbstractC5868k.m23673e(inflate5, "inflater.inflate(R.layou…izon_list, parent, false)");
            return new C5247y0(inflate5);
        }
        View inflate6 = from.inflate(R$layout.item_column_vertical_list, viewGroup, false);
        AbstractC5868k.m23673e(inflate6, "inflater.inflate(R.layou…ical_list, parent, false)");
        return new C5224s1(inflate6);
    }

    /* renamed from: g */
    public final void m21028g(C5550d c5550d) {
        boolean z10;
        AbstractC5868k.m23674f(c5550d, "homeVodExtra");
        int size = this.f21299e.size();
        int m22501d = c5550d.m22501d();
        if (size > 0) {
            int i10 = 0;
            if (m22501d >= 0 && m22501d < size) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                this.f21299e.remove(m22501d);
                for (Object obj : this.f21299e) {
                    int i11 = i10 + 1;
                    if (i10 < 0) {
                        AbstractC1500l.m6991j();
                    }
                    ((C5550d) obj).m22505h(i10);
                    i10 = i11;
                }
                notifyDataSetChanged();
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    public int getItemCount() {
        return this.f21299e.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    public long getItemId(int i10) {
        return i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    public int getItemViewType(int i10) {
        return ((C5550d) this.f21299e.get(i10)).m22500c();
    }

    /* renamed from: h */
    public final void m21029h(String str) {
        AbstractC5868k.m23674f(str, "concreteColumnCode");
        this.f21297c = str;
    }

    /* renamed from: i */
    public final void m21030i(ArrayList arrayList) {
        AbstractC5868k.m23674f(arrayList, "beans");
        this.f21299e.clear();
        this.f21299e.addAll(arrayList);
        notifyDataSetChanged();
    }

    /* renamed from: j */
    public final void m21031j(C5550d c5550d) {
        AbstractC5868k.m23674f(c5550d, "homeVodExtra");
        c5550d.m22506i(false);
        notifyItemChanged(c5550d.m22501d());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        AbstractC5868k.m23674f(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.f21298d = recyclerView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        AbstractC5868k.m23674f(recyclerView, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
        this.f21298d = null;
    }
}
