package p399x9;

import android.content.Context;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.module.R$id;
import com.module.R$layout;
import com.module.bean.TabBean;
import java.util.ArrayList;
import ne.AbstractC5868k;
import p102db.C4035f;
import p400xa.C7584l;

/* renamed from: x9.x */
/* loaded from: classes2.dex */
public final class C7549x extends RecyclerView.AbstractC0789h {

    /* renamed from: a */
    private Context f27733a;

    /* renamed from: b */
    private final ArrayList f27734b;

    /* renamed from: c */
    private a f27735c;

    /* renamed from: d */
    private boolean f27736d;

    /* renamed from: e */
    private int f27737e;

    /* renamed from: f */
    private boolean f27738f;

    /* renamed from: x9.x$a */
    /* loaded from: classes2.dex */
    public interface a {
        /* renamed from: a */
        void mo11894a(int i10);

        /* renamed from: b */
        void mo11895b(int i10, boolean z10);
    }

    /* renamed from: x9.x$b */
    /* loaded from: classes2.dex */
    public final class b extends RecyclerView.AbstractC0787f0 {

        /* renamed from: a */
        private FrameLayout f27739a;

        /* renamed from: b */
        private FrameLayout f27740b;

        /* renamed from: c */
        private TextView f27741c;

        /* renamed from: d */
        private ImageView f27742d;

        /* renamed from: e */
        final /* synthetic */ C7549x f27743e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C7549x c7549x, View view) {
            super(view);
            AbstractC5868k.m23674f(view, "itemView");
            this.f27743e = c7549x;
            View findViewById = view.findViewById(R$id.mRlTabItem);
            AbstractC5868k.m23672d(findViewById, "null cannot be cast to non-null type android.widget.FrameLayout");
            this.f27739a = (FrameLayout) findViewById;
            View findViewById2 = view.findViewById(R$id.mRlTitle);
            AbstractC5868k.m23672d(findViewById2, "null cannot be cast to non-null type android.widget.FrameLayout");
            this.f27740b = (FrameLayout) findViewById2;
            View findViewById3 = view.findViewById(R$id.mTextTitle);
            AbstractC5868k.m23672d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
            this.f27741c = (TextView) findViewById3;
            View findViewById4 = view.findViewById(R$id.mIvTitle);
            AbstractC5868k.m23672d(findViewById4, "null cannot be cast to non-null type android.widget.ImageView");
            this.f27742d = (ImageView) findViewById4;
        }

        /* renamed from: b */
        public final ImageView m28926b() {
            return this.f27742d;
        }

        /* renamed from: c */
        public final TextView m28927c() {
            return this.f27741c;
        }
    }

    public C7549x(Context context) {
        AbstractC5868k.m23674f(context, "mContext");
        this.f27733a = context;
        this.f27734b = new ArrayList();
    }

    /* renamed from: e */
    private final boolean m28916e(b bVar, String str) {
        C4035f m29106d = C7584l.f27868a.m29106d(this.f27733a, str);
        if (m29106d == null) {
            bVar.m28926b().setVisibility(8);
            this.f27738f = false;
            return false;
        }
        bVar.m28926b().setVisibility(0);
        bVar.m28926b().setImageDrawable(m29106d);
        this.f27738f = true;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static final void m28917g(C7549x c7549x, int i10, b bVar, View view, boolean z10) {
        AbstractC5868k.m23674f(c7549x, "this$0");
        AbstractC5868k.m23674f(bVar, "$holder");
        a aVar = c7549x.f27735c;
        if (aVar != null) {
            aVar.mo11895b(i10, z10);
        }
        boolean z11 = false;
        if (z10) {
            c7549x.f27736d = false;
            c7549x.f27737e = i10;
            view.setSelected(false);
            return;
        }
        if (c7549x.f27736d && c7549x.f27737e == i10) {
            z11 = true;
        }
        view.setSelected(z11);
        if (bVar.m28926b().getVisibility() == 0) {
            bVar.m28926b().setSelected(view.isSelected());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static final boolean m28918h(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && i10 == 22) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static final void m28919i(C7549x c7549x, int i10, View view) {
        AbstractC5868k.m23674f(c7549x, "this$0");
        a aVar = c7549x.f27735c;
        if (aVar != null) {
            aVar.mo11894a(i10);
        }
    }

    /* renamed from: d */
    public final boolean m28920d() {
        return this.f27738f;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(final b bVar, final int i10) {
        AbstractC5868k.m23674f(bVar, "holder");
        Object obj = this.f27734b.get(i10);
        AbstractC5868k.m23673e(obj, "mTabTitles[position]");
        TabBean tabBean = (TabBean) obj;
        bVar.m28927c().setText(tabBean.getTitleStr());
        boolean z10 = false;
        if (!m28916e(bVar, tabBean.getTitleStr())) {
            if (tabBean.getDefaultIconResId() != -1) {
                bVar.m28926b().setVisibility(0);
                bVar.m28926b().setImageDrawable(null);
                bVar.m28926b().setImageResource(tabBean.getDefaultIconResId());
            } else {
                bVar.m28926b().setVisibility(8);
            }
        }
        View view = bVar.itemView;
        if (this.f27736d && this.f27737e == i10) {
            z10 = true;
        }
        view.setSelected(z10);
        bVar.itemView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: x9.u
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z11) {
                C7549x.m28917g(C7549x.this, i10, bVar, view2, z11);
            }
        });
        if (i10 == getItemCount() - 1) {
            bVar.itemView.setOnKeyListener(new View.OnKeyListener() { // from class: x9.v
                @Override // android.view.View.OnKeyListener
                public final boolean onKey(View view2, int i11, KeyEvent keyEvent) {
                    boolean m28918h;
                    m28918h = C7549x.m28918h(view2, i11, keyEvent);
                    return m28918h;
                }
            });
        } else {
            bVar.itemView.setOnKeyListener(null);
        }
        bVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: x9.w
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C7549x.m28919i(C7549x.this, i10, view2);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    public int getItemCount() {
        return this.f27734b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(ViewGroup viewGroup, int i10) {
        AbstractC5868k.m23674f(viewGroup, "parent");
        View inflate = LayoutInflater.from(this.f27733a).inflate(R$layout.item_tab_recyclerview, viewGroup, false);
        AbstractC5868k.m23673e(inflate, "from(mContext).inflate(R…yclerview, parent, false)");
        return new b(this, inflate);
    }

    /* renamed from: k */
    public final void m28923k(ArrayList arrayList) {
        AbstractC5868k.m23674f(arrayList, "list");
        this.f27734b.clear();
        this.f27734b.addAll(arrayList);
        notifyDataSetChanged();
    }

    /* renamed from: l */
    public final void m28924l(a aVar) {
        AbstractC5868k.m23674f(aVar, "listener");
        this.f27735c = aVar;
    }

    /* renamed from: m */
    public final void m28925m(boolean z10) {
        this.f27736d = z10;
    }
}
