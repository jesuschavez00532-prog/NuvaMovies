package p212kd;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vod.R$layout;
import java.util.ArrayList;
import java.util.List;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import p317rb.AbstractC6567a;
import p400xa.C7554b;

/* renamed from: kd.i */
/* loaded from: classes3.dex */
public final class C5182i extends RecyclerView.AbstractC0789h {

    /* renamed from: a */
    private Context f21212a;

    /* renamed from: b */
    private InterfaceC5660l f21213b;

    /* renamed from: c */
    private boolean f21214c;

    /* renamed from: d */
    private String f21215d;

    /* renamed from: e */
    private int f21216e;

    /* renamed from: f */
    private String f21217f;

    /* renamed from: g */
    private int f21218g;

    /* renamed from: h */
    private String f21219h;

    /* renamed from: i */
    private C7554b f21220i;

    /* renamed from: j */
    private ArrayList f21221j;

    public C5182i(Context context, InterfaceC5660l interfaceC5660l) {
        AbstractC5868k.m23674f(context, "mContext");
        AbstractC5868k.m23674f(interfaceC5660l, "mPressUpListener");
        this.f21212a = context;
        this.f21213b = interfaceC5660l;
        this.f21215d = "";
        this.f21217f = "";
        this.f21219h = "";
        this.f21220i = new C7554b();
        this.f21221j = new ArrayList();
    }

    /* renamed from: a */
    public final String m20926a() {
        return this.f21215d;
    }

    /* renamed from: b */
    public final C7554b m20927b() {
        return this.f21220i;
    }

    /* renamed from: c */
    public final String m20928c() {
        return this.f21217f;
    }

    /* renamed from: d */
    public final int m20929d() {
        return this.f21216e;
    }

    /* renamed from: e */
    public final String m20930e() {
        return this.f21219h;
    }

    /* renamed from: f */
    public final int m20931f() {
        return this.f21218g;
    }

    /* renamed from: g */
    public final InterfaceC5660l m20932g() {
        return this.f21213b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    public int getItemCount() {
        if (this.f21214c) {
            return 10;
        }
        if (this.f21221j.size() <= 10) {
            return this.f21221j.size() + 1;
        }
        return 11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    public int getItemViewType(int i10) {
        if (this.f21214c || i10 + 1 != getItemCount()) {
            return 0;
        }
        return 1;
    }

    /* renamed from: h */
    public final boolean m20933h() {
        return this.f21214c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(AbstractC5178h abstractC5178h, int i10) {
        AbstractC5868k.m23674f(abstractC5178h, "holder");
        abstractC5178h.mo20903b(this, this.f21212a, this.f21221j, i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public AbstractC5178h onCreateViewHolder(ViewGroup viewGroup, int i10) {
        AbstractC5868k.m23674f(viewGroup, "parent");
        LayoutInflater from = LayoutInflater.from(this.f21212a);
        if (i10 == 0) {
            View inflate = from.inflate(R$layout.item_column_horizon, viewGroup, false);
            AbstractC5868k.m23673e(inflate, "inflater.inflate(R.layou…n_horizon, parent, false)");
            return new C5202n(inflate);
        }
        View inflate2 = from.inflate(R$layout.item_asset_horizon_more, viewGroup, false);
        AbstractC5868k.m23673e(inflate2, "inflater.inflate(R.layou…izon_more, parent, false)");
        return new C5218r(inflate2);
    }

    /* renamed from: k */
    public final void m20936k(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.f21215d = str;
    }

    /* renamed from: l */
    public final void m20937l(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.f21217f = str;
    }

    /* renamed from: m */
    public final void m20938m(int i10) {
        this.f21216e = i10;
    }

    /* renamed from: n */
    public final void m20939n(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.f21219h = str;
    }

    /* renamed from: o */
    public final void m20940o(int i10) {
        this.f21218g = i10;
    }

    /* renamed from: p */
    public final void m20941p(boolean z10) {
        this.f21214c = z10;
    }

    /* renamed from: q */
    public final void m20942q(List list) {
        if (AbstractC6567a.m25635e(list)) {
            return;
        }
        this.f21221j.clear();
        ArrayList arrayList = this.f21221j;
        AbstractC5868k.m23671c(list);
        arrayList.addAll(list);
        notifyDataSetChanged();
    }
}
