package p028b8;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.live.R$color;
import com.live.R$id;
import com.live.R$layout;
import com.umeng.analytics.pro.C3384f;
import java.util.ArrayList;
import java.util.List;
import ne.AbstractC5868k;
import p028b8.C1166j0;
import p433zd.AbstractC7786b;

/* renamed from: b8.j0 */
/* loaded from: classes2.dex */
public final class C1166j0 extends RecyclerView.AbstractC0789h {

    /* renamed from: a */
    private Context f4604a;

    /* renamed from: b */
    private List f4605b;

    /* renamed from: c */
    private a f4606c;

    /* renamed from: d */
    private int f4607d;

    /* renamed from: e */
    private int f4608e;

    /* renamed from: b8.j0$a */
    /* loaded from: classes2.dex */
    public interface a {
        /* renamed from: a */
        void mo5352a(int i10);
    }

    /* renamed from: b8.j0$b */
    /* loaded from: classes2.dex */
    public static final class b extends RecyclerView.AbstractC0787f0 {

        /* renamed from: a */
        private TextView f4609a;

        /* renamed from: b */
        private ImageView f4610b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(View view) {
            super(view);
            AbstractC5868k.m23674f(view, "itemView");
            AbstractC7786b.m30161e(view);
            View findViewById = view.findViewById(R$id.mSubTitleText);
            AbstractC5868k.m23672d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
            this.f4609a = (TextView) findViewById;
            View findViewById2 = view.findViewById(R$id.mChooseImg);
            AbstractC5868k.m23672d(findViewById2, "null cannot be cast to non-null type android.widget.ImageView");
            this.f4610b = (ImageView) findViewById2;
        }

        /* renamed from: b */
        public final ImageView m5353b() {
            return this.f4610b;
        }

        /* renamed from: c */
        public final TextView m5354c() {
            return this.f4609a;
        }
    }

    public C1166j0(Context context) {
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        this.f4604a = context;
        this.f4605b = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static final void m5345d(C1166j0 c1166j0, int i10, View view) {
        AbstractC5868k.m23674f(c1166j0, "this$0");
        if (c1166j0.f4607d != i10) {
            a aVar = c1166j0.f4606c;
            if (aVar != null) {
                aVar.mo5352a(i10);
            }
            c1166j0.m5350h(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static final void m5346e(b bVar, C1166j0 c1166j0, int i10, View view, boolean z10) {
        AbstractC5868k.m23674f(bVar, "$holder");
        AbstractC5868k.m23674f(c1166j0, "this$0");
        bVar.m5354c().setSelected(z10);
        c1166j0.getClass();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(final b bVar, final int i10) {
        int i11;
        AbstractC5868k.m23674f(bVar, "holder");
        String str = (String) this.f4605b.get(i10);
        if (AbstractC5868k.m23669a(str, "UHD")) {
            bVar.m5354c().setTextColor(this.f4604a.getResources().getColor(R$color.color_ff9500));
        } else {
            bVar.m5354c().setTextColor(this.f4604a.getResources().getColor(R$color.color_f5f5f5));
        }
        bVar.m5354c().setText(str);
        ImageView m5353b = bVar.m5353b();
        if (this.f4607d == i10) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        m5353b.setVisibility(i11);
        bVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: b8.h0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1166j0.m5345d(C1166j0.this, i10, view);
            }
        });
        bVar.itemView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: b8.i0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                C1166j0.m5346e(C1166j0.b.this, this, i10, view, z10);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(ViewGroup viewGroup, int i10) {
        AbstractC5868k.m23674f(viewGroup, "parent");
        View inflate = LayoutInflater.from(this.f4604a).inflate(R$layout.layout_item_pop_vertical, viewGroup, false);
        AbstractC5868k.m23673e(inflate, "view");
        return new b(inflate);
    }

    /* renamed from: g */
    public final void m5349g(a aVar) {
        AbstractC5868k.m23674f(aVar, "listener");
        this.f4606c = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    public int getItemCount() {
        return this.f4605b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    public long getItemId(int i10) {
        return i10;
    }

    /* renamed from: h */
    public final void m5350h(int i10) {
        this.f4607d = i10;
        this.f4608e = 0;
        notifyDataSetChanged();
    }

    /* renamed from: i */
    public final void m5351i(List list) {
        AbstractC5868k.m23674f(list, "data");
        this.f4605b = list;
        notifyDataSetChanged();
    }
}
