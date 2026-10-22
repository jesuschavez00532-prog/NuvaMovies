package p399x9;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import ne.AbstractC5864g;
import ne.AbstractC5868k;
import p317rb.AbstractC6567a;

/* renamed from: x9.b */
/* loaded from: classes2.dex */
public abstract class AbstractC7527b extends RecyclerView.AbstractC0789h {

    /* renamed from: a */
    private final int f27666a;

    /* renamed from: b */
    private List f27667b;

    /* renamed from: c */
    public Context f27668c;

    /* renamed from: d */
    private boolean f27669d;

    public AbstractC7527b(int i10, List list) {
        AbstractC5868k.m23674f(list, "datas");
        this.f27666a = i10;
        this.f27667b = list;
        this.f27669d = true;
    }

    /* renamed from: a */
    public final void m28844a(Object obj) {
        this.f27667b.add(obj);
        notifyDataSetChanged();
    }

    /* renamed from: b */
    public final void m28845b(List list) {
        if (AbstractC6567a.m25635e(list)) {
            return;
        }
        List list2 = this.f27667b;
        AbstractC5868k.m23671c(list);
        list2.addAll(list);
        notifyItemRangeInserted(this.f27667b.size() - list.size(), this.f27667b.size());
    }

    /* renamed from: c */
    public final void m28846c(int i10, List list) {
        if (!AbstractC6567a.m25635e(list) && i10 >= 0 && i10 <= this.f27667b.size()) {
            List list2 = this.f27667b;
            AbstractC5868k.m23671c(list);
            list2.addAll(0, list);
            notifyItemRangeInserted(i10, list.size());
        }
    }

    /* renamed from: d */
    public final void m28847d() {
        this.f27667b.clear();
        notifyDataSetChanged();
    }

    /* renamed from: e */
    protected abstract void mo5338e(C7531f c7531f, Object obj);

    /* renamed from: f */
    public final List m28848f() {
        return this.f27667b;
    }

    /* renamed from: g */
    public final List m28849g() {
        return this.f27667b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    public int getItemCount() {
        return this.f27667b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    public long getItemId(int i10) {
        if (hasStableIds()) {
            return i10;
        }
        return super.getItemId(i10);
    }

    /* renamed from: h */
    public final Context m28850h() {
        Context context = this.f27668c;
        if (context != null) {
            return context;
        }
        AbstractC5868k.m23686r("mContext");
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(C7531f c7531f, int i10) {
        AbstractC5868k.m23674f(c7531f, "holder");
        if (i10 >= 0 && i10 < getItemCount()) {
            mo5338e(c7531f, this.f27667b.get(i10));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public C7531f onCreateViewHolder(ViewGroup viewGroup, int i10) {
        AbstractC5868k.m23674f(viewGroup, "parent");
        Context context = viewGroup.getContext();
        AbstractC5868k.m23673e(context, "parent.context");
        m28855m(context);
        View inflate = LayoutInflater.from(m28850h()).inflate(this.f27666a, viewGroup, false);
        AbstractC5868k.m23673e(inflate, "from(mContext).inflate(layoutId,parent,false)");
        return new C7531f(inflate, this.f27669d);
    }

    /* renamed from: k */
    public final void m28853k(Object obj) {
        this.f27667b.remove(obj);
        notifyDataSetChanged();
    }

    /* renamed from: l */
    public final void m28854l(List list) {
        this.f27667b.clear();
        if (list != null) {
            this.f27667b.addAll(list);
        }
        notifyDataSetChanged();
    }

    /* renamed from: m */
    public final void m28855m(Context context) {
        AbstractC5868k.m23674f(context, "<set-?>");
        this.f27668c = context;
    }

    /* renamed from: n */
    public final void m28856n(List list) {
        if (!AbstractC5868k.m23669a(this.f27667b, list) && list != null) {
            this.f27667b = list;
            notifyDataSetChanged();
        }
    }

    /* renamed from: o */
    public final void m28857o(boolean z10) {
        this.f27669d = z10;
    }

    public /* synthetic */ AbstractC7527b(int i10, List list, int i11, AbstractC5864g abstractC5864g) {
        this(i10, (i11 & 2) != 0 ? new ArrayList() : list);
    }
}
