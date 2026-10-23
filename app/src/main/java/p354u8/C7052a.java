package p354u8;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import be.AbstractC1314j;
import be.C1328x;
import be.InterfaceC1312h;
import com.main.R$layout;
import com.main.R$mipmap;
import com.request.result.ChildColumn;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import me.InterfaceC5642a;
import me.InterfaceC5660l;
import me.jessyan.autosize.utils.AutoSizeUtils;
import ne.AbstractC5864g;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p043ce.AbstractC1500l;
import p153h2.AbstractC4509b;
import p201k2.AbstractC5091h;

/* renamed from: u8.a */
/* loaded from: classes2.dex */
public final class C7052a extends RecyclerView.AbstractC0789h {

    /* renamed from: a */
    private List f26434a;

    /* renamed from: b */
    private final String f26435b;

    /* renamed from: c */
    private Context f26436c;

    /* renamed from: d */
    private final int f26437d;

    /* renamed from: e */
    private final int f26438e;

    /* renamed from: f */
    private List f26439f;

    /* renamed from: g */
    private HashMap f26440g;

    /* renamed from: h */
    private View f26441h;

    /* renamed from: i */
    private boolean f26442i;

    /* renamed from: j */
    private RecyclerView f26443j;

    /* renamed from: k */
    private final InterfaceC1312h f26444k;

    /* renamed from: u8.a$a */
    /* loaded from: classes2.dex */
    static final class a extends AbstractC5869l implements InterfaceC5642a {
        a() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke() {
            Drawable drawable;
            Drawable drawable2;
            Drawable drawable3;
            List m6989h;
            Resources resources;
            Resources resources2;
            Resources resources3;
            Resources resources4;
            Drawable[] drawableArr = new Drawable[4];
            Context context = C7052a.this.f26436c;
            Drawable drawable4 = null;
            if (context != null && (resources4 = context.getResources()) != null) {
                drawable = resources4.getDrawable(R$mipmap.icon_free_live);
            } else {
                drawable = null;
            }
            drawableArr[0] = drawable;
            Context context2 = C7052a.this.f26436c;
            if (context2 != null && (resources3 = context2.getResources()) != null) {
                drawable2 = resources3.getDrawable(R$mipmap.icon_free_movie);
            } else {
                drawable2 = null;
            }
            drawableArr[1] = drawable2;
            Context context3 = C7052a.this.f26436c;
            if (context3 != null && (resources2 = context3.getResources()) != null) {
                drawable3 = resources2.getDrawable(R$mipmap.icon_free_tv);
            } else {
                drawable3 = null;
            }
            drawableArr[2] = drawable3;
            Context context4 = C7052a.this.f26436c;
            if (context4 != null && (resources = context4.getResources()) != null) {
                drawable4 = resources.getDrawable(R$mipmap.icon_free_kids);
            }
            drawableArr[3] = drawable4;
            m6989h = AbstractC1500l.m6989h(drawableArr);
            return m6989h;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u8.a$b */
    /* loaded from: classes2.dex */
    public static final class b extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: b */
        final /* synthetic */ C7060i f26447b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C7060i c7060i) {
            super(1);
            this.f26447b = c7060i;
        }

        /* renamed from: a */
        public final void m27172a(View view) {
            int i10 = 0;
            ViewGroup.LayoutParams layoutParams;
            int i11 = 0;
            AbstractC5868k.m23674f(view, "it");
            C7052a.this.f26441h = view;
            RecyclerView recyclerView = C7052a.this.f26443j;
            boolean z10 = false;
            if (recyclerView != null) {
                i10 = recyclerView.getChildAdapterPosition(this.f26447b.itemView);
            } else {
                i10 = 0;
            }
            View view2 = C7052a.this.f26441h;
            RecyclerView.C0798q c0798q = null;
            if (view2 != null) {
                layoutParams = view2.getLayoutParams();
            } else {
                layoutParams = null;
            }
            if (layoutParams instanceof RecyclerView.C0798q) {
                c0798q = (RecyclerView.C0798q) layoutParams;
            }
            if (c0798q != null) {
                i11 = c0798q.m3925a();
            } else {
                i11 = 0;
            }
            C7052a c7052a = C7052a.this;
            if (i10 == 0 && i11 < 6) {
                z10 = true;
            }
            c7052a.f26442i = z10;
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m27172a((View) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u8.a$c */
    /* loaded from: classes2.dex */
    public static final class c extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: b */
        final /* synthetic */ C7060i f26449b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C7060i c7060i) {
            super(1);
            this.f26449b = c7060i;
        }

        /* renamed from: a */
        public final void m27173a(View view) {
            int i10 = 0;
            ViewGroup.LayoutParams layoutParams;
            int i11 = 0;
            AbstractC5868k.m23674f(view, "it");
            C7052a.this.f26441h = view;
            RecyclerView recyclerView = C7052a.this.f26443j;
            boolean z10 = false;
            if (recyclerView != null) {
                i10 = recyclerView.getChildAdapterPosition(this.f26449b.itemView);
            } else {
                i10 = 0;
            }
            View view2 = C7052a.this.f26441h;
            RecyclerView.C0798q c0798q = null;
            if (view2 != null) {
                layoutParams = view2.getLayoutParams();
            } else {
                layoutParams = null;
            }
            if (layoutParams instanceof RecyclerView.C0798q) {
                c0798q = (RecyclerView.C0798q) layoutParams;
            }
            if (c0798q != null) {
                i11 = c0798q.m3925a();
            } else {
                i11 = 0;
            }
            C7052a c7052a = C7052a.this;
            if (i10 == 0 && i11 < 6) {
                z10 = true;
            }
            c7052a.f26442i = z10;
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m27173a((View) obj);
            return C1328x.f4998a;
        }
    }

    public C7052a(List list) {
        InterfaceC1312h m5965b;
        AbstractC5868k.m23674f(list, "datas");
        this.f26434a = list;
        this.f26435b = "FreeAreaAdapter";
        this.f26438e = 1;
        this.f26439f = new ArrayList();
        this.f26440g = new HashMap();
        this.f26442i = true;
        m5965b = AbstractC1314j.m5965b(new a());
        this.f26444k = m5965b;
    }

    /* renamed from: f */
    private final List m27163f() {
        return (List) this.f26444k.getValue();
    }

    /* renamed from: i */
    private final boolean m27164i() {
        if (this.f26439f.size() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final boolean m27165g() {
        if (this.f26434a.size() > 0 && this.f26439f.size() > 0 && this.f26440g.size() > 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    public int getItemCount() {
        return this.f26434a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    public int getItemViewType(int i10) {
        if (m27164i() && i10 == 0) {
            return this.f26437d;
        }
        return this.f26438e;
    }

    /* renamed from: h */
    public final boolean m27166h() {
        View view = this.f26441h;
        if (view != null) {
            return view.hasFocus();
        }
        return false;
    }

    /* renamed from: j */
    public final boolean m27167j() {
        return this.f26442i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(C7060i c7060i, int i10) {
        int i11 = 0;
        int i12 = 0;
        AbstractC5868k.m23674f(c7060i, "holder");
        ChildColumn childColumn = (ChildColumn) this.f26434a.get(i10);
        c7060i.m27211d().setText(AbstractC5091h.m20660c(childColumn.getName(), childColumn.getAlias()));
        c7060i.m27209b().setImageDrawable((Drawable) m27163f().get(i10));
        int itemViewType = c7060i.getItemViewType();
        if (itemViewType == this.f26437d) {
            C7055d c7055d = new C7055d();
            c7055d.m28857o(false);
            c7055d.m27180v(new b(c7060i));
            c7055d.m27179u(childColumn.getId());
            c7055d.m28854l(this.f26439f);
            ViewGroup.LayoutParams layoutParams = c7060i.m27210c().getLayoutParams();
            int itemCount = c7055d.getItemCount() / 6;
            if (c7055d.getItemCount() % 6 != 0) {
                itemCount++;
            }
            layoutParams.height = (AutoSizeUtils.dp2px(this.f26436c, 173.0f) * itemCount) + ((itemCount - 1) * 10) + AutoSizeUtils.dp2px(this.f26436c, 27.0f);
            c7060i.m27210c().setLayoutParams(layoutParams);
            c7060i.m27210c().setAdapter(c7055d);
            return;
        }
        if (itemViewType == this.f26438e) {
            String m20660c = AbstractC5091h.m20660c(childColumn.getAlias(), childColumn.getName());
            AbstractC5868k.m23673e(m20660c, "getTitleByLang(childColu….alias, childColumn.name)");
            Integer parentId = childColumn.getParentId();
            if (parentId != null) {
                i11 = parentId.intValue();
            } else {
                i11 = -1;
            }
            C7058g c7058g = new C7058g(m20660c, i11);
            c7058g.m28857o(false);
            c7058g.m27188C(new c(c7060i));
            c7060i.m27210c().setFocusScrollStrategy(1);
            c7058g.m27187B(childColumn.getId());
            c7058g.m27186A(childColumn.getCode());
            String alias = childColumn.getAlias();
            if (alias == null) {
                alias = "";
            }
            c7058g.m27195z(alias);
            List list = (List) this.f26440g.get(Integer.valueOf(childColumn.getId()));
            c7060i.m27210c().setAdapter(c7058g);
            c7058g.m28854l(list);
            String str = this.f26435b;
            int id2 = childColumn.getId();
            if (list != null) {
                i12 = list.size();
            } else {
                i12 = 0;
            }
            AbstractC4509b.m18869b(str, "col: " + id2 + " and size: " + i12, new Object[0]);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public C7060i onCreateViewHolder(ViewGroup viewGroup, int i10) {
        AbstractC5868k.m23674f(viewGroup, "parent");
        Context context = viewGroup.getContext();
        this.f26436c = context;
        if (i10 == this.f26437d) {
            View inflate = LayoutInflater.from(context).inflate(R$layout.item_free_live_area_outer, viewGroup, false);
            AbstractC5868k.m23673e(inflate, "view");
            return new C7060i(inflate);
        }
        View inflate2 = LayoutInflater.from(context).inflate(R$layout.item_free_vod_area_outer, viewGroup, false);
        AbstractC5868k.m23673e(inflate2, "view");
        return new C7060i(inflate2);
    }

    /* renamed from: m */
    public final void m27170m(List list, List list2, HashMap hashMap) {
        AbstractC5868k.m23674f(list, "freeColumnList");
        AbstractC5868k.m23674f(list2, "freeChannelList");
        AbstractC5868k.m23674f(hashMap, "freeAssetMap");
        this.f26434a = list;
        this.f26439f = list2;
        this.f26440g = hashMap;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        AbstractC5868k.m23674f(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.f26443j = recyclerView;
    }

    public /* synthetic */ C7052a(List list, int i10, AbstractC5864g abstractC5864g) {
        this((i10 & 1) != 0 ? new ArrayList() : list);
    }
}
