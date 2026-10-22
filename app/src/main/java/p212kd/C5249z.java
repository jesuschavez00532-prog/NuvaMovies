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

/* renamed from: kd.z */
/* loaded from: classes3.dex */
public final class C5249z extends RecyclerView.AbstractC0789h {

    /* renamed from: a */
    private Context f21422a;

    /* renamed from: b */
    private InterfaceC5660l f21423b;

    /* renamed from: c */
    private boolean f21424c;

    /* renamed from: d */
    private String f21425d;

    /* renamed from: e */
    private int f21426e;

    /* renamed from: f */
    private String f21427f;

    /* renamed from: g */
    private int f21428g;

    /* renamed from: h */
    private String f21429h;

    /* renamed from: i */
    private final C7554b f21430i;

    /* renamed from: j */
    private ArrayList f21431j;

    public C5249z(Context context, InterfaceC5660l interfaceC5660l) {
        AbstractC5868k.m23674f(context, "mContext");
        AbstractC5868k.m23674f(interfaceC5660l, "mPressUpListener");
        this.f21422a = context;
        this.f21423b = interfaceC5660l;
        this.f21425d = "";
        this.f21427f = "";
        this.f21429h = "";
        this.f21430i = new C7554b();
        this.f21431j = new ArrayList();
    }

    /* renamed from: a */
    public final String m21136a() {
        return this.f21425d;
    }

    /* renamed from: b */
    public final C7554b m21137b() {
        return this.f21430i;
    }

    /* renamed from: c */
    public final String m21138c() {
        return this.f21427f;
    }

    /* renamed from: d */
    public final int m21139d() {
        return this.f21426e;
    }

    /* renamed from: e */
    public final String m21140e() {
        return this.f21429h;
    }

    /* renamed from: f */
    public final int m21141f() {
        return this.f21428g;
    }

    /* renamed from: g */
    public final InterfaceC5660l m21142g() {
        return this.f21423b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    public int getItemCount() {
        if (this.f21424c) {
            return 10;
        }
        if (this.f21431j.size() <= 10) {
            return this.f21431j.size() + 1;
        }
        return 11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    public int getItemViewType(int i10) {
        if (this.f21424c || i10 + 1 != getItemCount()) {
            return 0;
        }
        return 1;
    }

    /* renamed from: h */
    public final boolean m21143h() {
        return this.f21424c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(AbstractC5246y abstractC5246y, int i10) {
        AbstractC5868k.m23674f(abstractC5246y, "holder");
        abstractC5246y.mo20884b(this, this.f21422a, this.f21431j, i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public AbstractC5246y onCreateViewHolder(ViewGroup viewGroup, int i10) {
        AbstractC5868k.m23674f(viewGroup, "parent");
        LayoutInflater from = LayoutInflater.from(this.f21422a);
        if (i10 == 0) {
            View inflate = from.inflate(R$layout.item_column_vertical, viewGroup, false);
            AbstractC5868k.m23673e(inflate, "inflater.inflate(R.layou…_vertical, parent, false)");
            return new C5167e0(inflate);
        }
        View inflate2 = from.inflate(R$layout.item_asset_vertical_more, viewGroup, false);
        AbstractC5868k.m23673e(inflate2, "inflater.inflate(R.layou…ical_more, parent, false)");
        return new C5183i0(inflate2);
    }

    /* renamed from: k */
    public final void m21146k(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.f21425d = str;
    }

    /* renamed from: l */
    public final void m21147l(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.f21427f = str;
    }

    /* renamed from: m */
    public final void m21148m(int i10) {
        this.f21426e = i10;
    }

    /* renamed from: n */
    public final void m21149n(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.f21429h = str;
    }

    /* renamed from: o */
    public final void m21150o(int i10) {
        this.f21428g = i10;
    }

    /* renamed from: p */
    public final void m21151p(boolean z10) {
        this.f21424c = z10;
    }

    /* renamed from: q */
    public final void m21152q(List list) {
        if (AbstractC6567a.m25635e(list)) {
            return;
        }
        this.f21431j.clear();
        ArrayList arrayList = this.f21431j;
        AbstractC5868k.m23671c(list);
        arrayList.addAll(list);
        notifyDataSetChanged();
    }
}
