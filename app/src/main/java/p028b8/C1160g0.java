package p028b8;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.live.R$drawable;
import com.live.R$id;
import com.live.R$layout;
import com.umeng.analytics.pro.C3384f;
import com.zhy.autolayout.AutoLinearLayout;
import java.util.ArrayList;
import java.util.List;
import ne.AbstractC5868k;
import p028b8.C1160g0;
import p132fa.C4297a;
import p433zd.AbstractC7786b;

/* renamed from: b8.g0 */
/* loaded from: classes2.dex */
public final class C1160g0 extends RecyclerView.AbstractC0789h {

    /* renamed from: a */
    private Context f4584a;

    /* renamed from: b */
    private List f4585b;

    /* renamed from: c */
    private a f4586c;

    /* renamed from: d */
    private int f4587d;

    /* renamed from: e */
    private String f4588e;

    /* renamed from: b8.g0$a */
    /* loaded from: classes2.dex */
    public interface a {
        /* renamed from: a */
        void mo5330a(int i10, String str);
    }

    /* renamed from: b8.g0$b */
    /* loaded from: classes2.dex */
    public static final class b extends RecyclerView.AbstractC0787f0 {

        /* renamed from: a */
        private AutoLinearLayout f4589a;

        /* renamed from: b */
        private ImageView f4590b;

        /* renamed from: c */
        private TextView f4591c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(View view) {
            super(view);
            AbstractC5868k.m23674f(view, "itemView");
            AbstractC7786b.m30161e(view);
            View findViewById = view.findViewById(R$id.mLlPipSwitch);
            AbstractC5868k.m23672d(findViewById, "null cannot be cast to non-null type com.zhy.autolayout.AutoLinearLayout");
            this.f4589a = (AutoLinearLayout) findViewById;
            View findViewById2 = view.findViewById(R$id.mIvPipSwitch);
            AbstractC5868k.m23672d(findViewById2, "null cannot be cast to non-null type android.widget.ImageView");
            this.f4590b = (ImageView) findViewById2;
            View findViewById3 = view.findViewById(R$id.mTextPipOperate);
            AbstractC5868k.m23672d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
            this.f4591c = (TextView) findViewById3;
        }

        /* renamed from: b */
        public final ImageView m5331b() {
            return this.f4590b;
        }

        /* renamed from: c */
        public final AutoLinearLayout m5332c() {
            return this.f4589a;
        }

        /* renamed from: d */
        public final TextView m5333d() {
            return this.f4591c;
        }
    }

    public C1160g0(Context context) {
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        this.f4584a = context;
        this.f4585b = new ArrayList();
        this.f4588e = "PopPipAdapter";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static final void m5323d(C1160g0 c1160g0, int i10, b bVar, String str, View view) {
        AbstractC5868k.m23674f(c1160g0, "this$0");
        AbstractC5868k.m23674f(bVar, "$holder");
        AbstractC5868k.m23674f(str, "$language");
        if (i10 == 0) {
            if (C4297a.f18620a.m17986c()) {
                bVar.m5331b().setImageResource(R$drawable.live_info_pip_off);
                a aVar = c1160g0.f4586c;
                if (aVar != null) {
                    aVar.mo5330a(i10, "Off");
                    return;
                }
                return;
            }
            bVar.m5331b().setImageResource(R$drawable.live_info_pip_on);
            a aVar2 = c1160g0.f4586c;
            if (aVar2 != null) {
                aVar2.mo5330a(i10, "On");
                return;
            }
            return;
        }
        a aVar3 = c1160g0.f4586c;
        if (aVar3 != null) {
            aVar3.mo5330a(i10, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static final void m5324e(b bVar, C1160g0 c1160g0, int i10, View view, boolean z10) {
        AbstractC5868k.m23674f(bVar, "$holder");
        AbstractC5868k.m23674f(c1160g0, "this$0");
        bVar.m5333d().setSelected(z10);
        c1160g0.getClass();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(final b bVar, final int i10) {
        AbstractC5868k.m23674f(bVar, "holder");
        final String str = (String) this.f4585b.get(i10);
        if (AbstractC5868k.m23669a(str, "Off")) {
            bVar.m5332c().setVisibility(0);
            bVar.m5333d().setVisibility(8);
        } else {
            bVar.m5332c().setVisibility(8);
            bVar.m5333d().setVisibility(0);
            bVar.m5333d().setText(str);
        }
        bVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: b8.e0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1160g0.m5323d(C1160g0.this, i10, bVar, str, view);
            }
        });
        bVar.itemView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: b8.f0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                C1160g0.m5324e(C1160g0.b.this, this, i10, view, z10);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(ViewGroup viewGroup, int i10) {
        AbstractC5868k.m23674f(viewGroup, "parent");
        View inflate = LayoutInflater.from(this.f4584a).inflate(R$layout.layout_item_pop_pip, viewGroup, false);
        AbstractC5868k.m23673e(inflate, "view");
        return new b(inflate);
    }

    /* renamed from: g */
    public final void m5327g(a aVar) {
        AbstractC5868k.m23674f(aVar, "listener");
        this.f4586c = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    public int getItemCount() {
        return this.f4585b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    public long getItemId(int i10) {
        return i10;
    }

    /* renamed from: h */
    public final void m5328h(int i10) {
        this.f4587d = i10;
    }

    /* renamed from: i */
    public final void m5329i(List list) {
        AbstractC5868k.m23674f(list, "data");
        this.f4585b = list;
        notifyDataSetChanged();
    }
}
