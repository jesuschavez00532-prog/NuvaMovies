package p399x9;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;
import java.util.List;
import ne.AbstractC5864g;
import ne.AbstractC5868k;

/* renamed from: x9.a */
/* loaded from: classes2.dex */
public abstract class AbstractC7526a extends BaseAdapter {

    /* renamed from: a */
    private final int f27663a;

    /* renamed from: b */
    private List f27664b;

    /* renamed from: c */
    private Context f27665c;

    public AbstractC7526a(int i10, List list) {
        AbstractC5868k.m23674f(list, "datas");
        this.f27663a = i10;
        this.f27664b = list;
    }

    /* renamed from: a */
    public final void m28839a() {
        this.f27664b.clear();
        notifyDataSetChanged();
    }

    /* renamed from: b */
    public abstract void mo21036b(C7532g c7532g, Object obj);

    /* renamed from: c */
    public final List m28840c() {
        return this.f27664b;
    }

    /* renamed from: d */
    public final List m28841d() {
        return this.f27664b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public final Context m28842e() {
        return this.f27665c;
    }

    /* renamed from: f */
    public final void m28843f(List list) {
        if (!AbstractC5868k.m23669a(this.f27664b, list)) {
            this.f27664b.clear();
            if (list != null) {
                this.f27664b.addAll(list);
            }
        }
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f27664b.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i10) {
        return this.f27664b.get(i10);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        C7532g c7532g;
        Context context;
        if (this.f27665c == null) {
            if (viewGroup != null) {
                context = viewGroup.getContext();
            } else {
                context = null;
            }
            this.f27665c = context;
        }
        if (view != null) {
            Object tag = view.getTag();
            AbstractC5868k.m23672d(tag, "null cannot be cast to non-null type com.module.adapter.ListItemViewHolder");
            c7532g = (C7532g) tag;
        } else {
            Context context2 = this.f27665c;
            AbstractC5868k.m23671c(context2);
            View inflate = LayoutInflater.from(context2).inflate(this.f27663a, viewGroup, false);
            C7532g c7532g2 = new C7532g(inflate);
            inflate.setTag(c7532g2);
            c7532g = c7532g2;
        }
        c7532g.m28871d(i10);
        mo21036b(c7532g, this.f27664b.get(i10));
        return c7532g.m28868a();
    }

    public /* synthetic */ AbstractC7526a(int i10, List list, int i11, AbstractC5864g abstractC5864g) {
        this(i10, (i11 & 2) != 0 ? new ArrayList() : list);
    }
}
