package p399x9;

import android.content.Context;
import android.content.res.Resources;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.module.R$array;
import com.module.R$color;
import com.module.R$drawable;
import com.module.R$id;
import com.module.R$layout;
import com.zhy.autolayout.AutoRelativeLayout;
import ne.AbstractC5868k;
import p359ue.AbstractC7167u;
import p433zd.AbstractC7786b;

/* renamed from: x9.k */
/* loaded from: classes2.dex */
public final class C7536k extends RecyclerView.AbstractC0789h {

    /* renamed from: a */
    private Context f27686a;

    /* renamed from: b */
    private String[] f27687b;

    /* renamed from: c */
    private String[] f27688c;

    /* renamed from: d */
    private int f27689d;

    /* renamed from: e */
    private int f27690e;

    /* renamed from: f */
    private b f27691f;

    /* renamed from: g */
    private a f27692g;

    /* renamed from: h */
    private c f27693h;

    /* renamed from: i */
    private final int f27694i;

    /* renamed from: j */
    private final int f27695j;

    /* renamed from: x9.k$a */
    /* loaded from: classes2.dex */
    public interface a {
        /* renamed from: a */
        void mo17094a(int i10, String str, String str2);
    }

    /* renamed from: x9.k$b */
    /* loaded from: classes2.dex */
    public interface b {
        /* renamed from: a */
        void mo17093a(View view, boolean z10);
    }

    /* renamed from: x9.k$c */
    /* loaded from: classes2.dex */
    public interface c {
        /* renamed from: a */
        boolean mo17095a(View view, int i10, KeyEvent keyEvent, int i11);
    }

    /* renamed from: x9.k$d */
    /* loaded from: classes2.dex */
    public static final class d extends RecyclerView.AbstractC0787f0 {

        /* renamed from: a */
        private AutoRelativeLayout f27696a;

        /* renamed from: b */
        private TextView f27697b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(View view) {
            super(view);
            AbstractC5868k.m23674f(view, "itemView");
            AbstractC7786b.m30161e(view);
            View findViewById = view.findViewById(R$id.mLayoutNationTitle);
            AbstractC5868k.m23672d(findViewById, "null cannot be cast to non-null type com.zhy.autolayout.AutoRelativeLayout");
            this.f27696a = (AutoRelativeLayout) findViewById;
            View findViewById2 = view.findViewById(R$id.mTextNationTitle);
            AbstractC5868k.m23672d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
            this.f27697b = (TextView) findViewById2;
        }

        /* renamed from: b */
        public final TextView m28884b() {
            return this.f27697b;
        }
    }

    /* renamed from: x9.k$e */
    /* loaded from: classes2.dex */
    public static final class e extends RecyclerView.AbstractC0787f0 {

        /* renamed from: a */
        private AutoRelativeLayout f27698a;

        /* renamed from: b */
        private ImageView f27699b;

        /* renamed from: c */
        private TextView f27700c;

        /* renamed from: d */
        private TextView f27701d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(View view) {
            super(view);
            AbstractC5868k.m23674f(view, "itemView");
            AbstractC7786b.m30161e(view);
            View findViewById = view.findViewById(R$id.mLayoutNation);
            AbstractC5868k.m23672d(findViewById, "null cannot be cast to non-null type com.zhy.autolayout.AutoRelativeLayout");
            this.f27698a = (AutoRelativeLayout) findViewById;
            View findViewById2 = view.findViewById(R$id.mImageSelected);
            AbstractC5868k.m23672d(findViewById2, "null cannot be cast to non-null type android.widget.ImageView");
            this.f27699b = (ImageView) findViewById2;
            View findViewById3 = view.findViewById(R$id.mTextNation);
            AbstractC5868k.m23672d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
            this.f27700c = (TextView) findViewById3;
            View findViewById4 = view.findViewById(R$id.mTextNationCode);
            AbstractC5868k.m23672d(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
            this.f27701d = (TextView) findViewById4;
        }

        /* renamed from: b */
        public final ImageView m28885b() {
            return this.f27699b;
        }

        /* renamed from: c */
        public final AutoRelativeLayout m28886c() {
            return this.f27698a;
        }

        /* renamed from: d */
        public final TextView m28887d() {
            return this.f27700c;
        }

        /* renamed from: e */
        public final TextView m28888e() {
            return this.f27701d;
        }
    }

    public C7536k(Context context) {
        AbstractC5868k.m23674f(context, "mContext");
        this.f27686a = context;
        String[] stringArray = context.getResources().getStringArray(R$array.nation);
        AbstractC5868k.m23673e(stringArray, "mContext.resources.getStringArray(R.array.nation)");
        this.f27687b = stringArray;
        String[] stringArray2 = this.f27686a.getResources().getStringArray(R$array.code);
        AbstractC5868k.m23673e(stringArray2, "mContext.resources.getStringArray(R.array.code)");
        this.f27688c = stringArray2;
        this.f27689d = -1;
        this.f27690e = -1;
        this.f27695j = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static final void m28877e(RecyclerView.AbstractC0787f0 abstractC0787f0, C7536k c7536k, int i10, View view, boolean z10) {
        AbstractC5868k.m23674f(abstractC0787f0, "$holder");
        AbstractC5868k.m23674f(c7536k, "this$0");
        if (z10) {
            e eVar = (e) abstractC0787f0;
            TextView m28887d = eVar.m28887d();
            Resources resources = c7536k.f27686a.getResources();
            int i11 = R$color.color_ffffff;
            m28887d.setTextColor(resources.getColor(i11));
            eVar.m28888e().setTextColor(c7536k.f27686a.getResources().getColor(i11));
            if (eVar.m28885b().getVisibility() == 0) {
                eVar.m28885b().setImageResource(R$drawable.icon_nation_selected_focus);
            }
            eVar.m28887d().setSelected(true);
            c7536k.f27690e = i10;
        } else {
            e eVar2 = (e) abstractC0787f0;
            TextView m28887d2 = eVar2.m28887d();
            Resources resources2 = c7536k.f27686a.getResources();
            int i12 = R$color.color_333333;
            m28887d2.setTextColor(resources2.getColor(i12));
            eVar2.m28888e().setTextColor(c7536k.f27686a.getResources().getColor(i12));
            if (eVar2.m28885b().getVisibility() == 0) {
                eVar2.m28885b().setImageResource(R$drawable.icon_nation_selected);
            }
            eVar2.m28887d().setSelected(false);
        }
        b bVar = c7536k.f27691f;
        if (bVar != null) {
            AbstractC5868k.m23673e(view, "v");
            bVar.mo17093a(view, z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static final void m28878f(C7536k c7536k, int i10, View view) {
        AbstractC5868k.m23674f(c7536k, "this$0");
        c7536k.f27689d = i10;
        c7536k.notifyDataSetChanged();
        a aVar = c7536k.f27692g;
        if (aVar != null) {
            String str = c7536k.f27687b[i10];
            AbstractC5868k.m23673e(str, "nationList[position]");
            String str2 = c7536k.f27688c[i10];
            AbstractC5868k.m23673e(str2, "nationCodeList[position]");
            aVar.mo17094a(i10, str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static final boolean m28879g(C7536k c7536k, int i10, View view, int i11, KeyEvent keyEvent) {
        AbstractC5868k.m23674f(c7536k, "this$0");
        c cVar = c7536k.f27693h;
        if (cVar != null) {
            AbstractC5868k.m23671c(cVar);
            AbstractC5868k.m23673e(view, "v");
            AbstractC5868k.m23673e(keyEvent, "event");
            return cVar.mo17095a(view, i11, keyEvent, i10);
        }
        return false;
    }

    /* renamed from: d */
    public final int m28880d() {
        return this.f27690e;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    public int getItemCount() {
        return this.f27687b.length;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    public long getItemId(int i10) {
        return i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    public int getItemViewType(int i10) {
        boolean m27763v;
        String str = this.f27687b[i10];
        AbstractC5868k.m23673e(str, "nationList[position]");
        m27763v = AbstractC7167u.m27763v(str, "#", false, 2, null);
        if (m27763v) {
            return this.f27694i;
        }
        return this.f27695j;
    }

    /* renamed from: h */
    public final void m28881h(a aVar) {
        AbstractC5868k.m23674f(aVar, "listener");
        this.f27692g = aVar;
    }

    /* renamed from: i */
    public final void m28882i(b bVar) {
        AbstractC5868k.m23674f(bVar, "listener");
        this.f27691f = bVar;
    }

    /* renamed from: j */
    public final void m28883j(c cVar) {
        AbstractC5868k.m23674f(cVar, "listener");
        this.f27693h = cVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    public void onBindViewHolder(final RecyclerView.AbstractC0787f0 abstractC0787f0, final int i10) {
        AbstractC5868k.m23674f(abstractC0787f0, "holder");
        if (abstractC0787f0 instanceof d) {
            TextView m28884b = ((d) abstractC0787f0).m28884b();
            String str = this.f27687b[i10];
            AbstractC5868k.m23673e(str, "nationList[position]");
            String substring = str.substring(1);
            AbstractC5868k.m23673e(substring, "this as java.lang.String).substring(startIndex)");
            m28884b.setText(substring);
            return;
        }
        if (abstractC0787f0 instanceof e) {
            if (i10 == this.f27689d) {
                ((e) abstractC0787f0).m28885b().setVisibility(0);
            } else {
                ((e) abstractC0787f0).m28885b().setVisibility(8);
            }
            e eVar = (e) abstractC0787f0;
            eVar.m28887d().setText(this.f27687b[i10]);
            eVar.m28888e().setText('+' + this.f27688c[i10]);
            eVar.m28886c().setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: x9.h
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z10) {
                    C7536k.m28877e(RecyclerView.AbstractC0787f0.this, this, i10, view, z10);
                }
            });
            eVar.m28886c().setOnClickListener(new View.OnClickListener() { // from class: x9.i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C7536k.m28878f(C7536k.this, i10, view);
                }
            });
            eVar.m28886c().setOnKeyListener(new View.OnKeyListener() { // from class: x9.j
                @Override // android.view.View.OnKeyListener
                public final boolean onKey(View view, int i11, KeyEvent keyEvent) {
                    boolean m28879g;
                    m28879g = C7536k.m28879g(C7536k.this, i10, view, i11, keyEvent);
                    return m28879g;
                }
            });
            if (i10 == this.f27689d) {
                abstractC0787f0.itemView.requestFocus();
                ((e) abstractC0787f0).m28886c().requestFocus();
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    public RecyclerView.AbstractC0787f0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        AbstractC5868k.m23674f(viewGroup, "parent");
        if (i10 == this.f27694i) {
            View inflate = LayoutInflater.from(this.f27686a).inflate(R$layout.item_nation_title, viewGroup, false);
            AbstractC5868k.m23673e(inflate, "nationView");
            return new d(inflate);
        }
        View inflate2 = LayoutInflater.from(this.f27686a).inflate(R$layout.item_nation, viewGroup, false);
        AbstractC5868k.m23673e(inflate2, "nationView");
        return new e(inflate2);
    }
}
