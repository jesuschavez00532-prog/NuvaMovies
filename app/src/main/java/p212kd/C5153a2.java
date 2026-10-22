package p212kd;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.umeng.analytics.pro.C3384f;
import com.vod.R$id;
import com.vod.R$layout;
import java.util.ArrayList;
import ne.AbstractC5868k;
import p212kd.C5153a2;
import p433zd.AbstractC7786b;

/* renamed from: kd.a2 */
/* loaded from: classes3.dex */
public final class C5153a2 extends RecyclerView.AbstractC0789h {

    /* renamed from: a */
    private Context f21126a;

    /* renamed from: b */
    private ArrayList f21127b;

    /* renamed from: c */
    private a f21128c;

    /* renamed from: kd.a2$a */
    /* loaded from: classes3.dex */
    public interface a {
        /* renamed from: a */
        void mo16507a(String str, int i10);
    }

    /* renamed from: kd.a2$b */
    /* loaded from: classes3.dex */
    public final class b extends RecyclerView.AbstractC0787f0 {

        /* renamed from: a */
        private TextView f21129a;

        /* renamed from: b */
        final /* synthetic */ C5153a2 f21130b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C5153a2 c5153a2, View view) {
            super(view);
            AbstractC5868k.m23674f(view, "itemView");
            this.f21130b = c5153a2;
            AbstractC7786b.m30161e(view);
            View findViewById = view.findViewById(R$id.mTvGenre);
            AbstractC5868k.m23672d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
            this.f21129a = (TextView) findViewById;
        }

        /* renamed from: b */
        public final TextView m20843b() {
            return this.f21129a;
        }
    }

    public C5153a2(Context context) {
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        this.f21126a = context;
        this.f21127b = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static final void m20837d(b bVar, View view, boolean z10) {
        AbstractC5868k.m23674f(bVar, "$holder");
        bVar.m20843b().setSelected(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static final void m20838e(C5153a2 c5153a2, int i10, View view) {
        AbstractC5868k.m23674f(c5153a2, "this$0");
        a aVar = c5153a2.f21128c;
        if (aVar != null) {
            Object obj = c5153a2.f21127b.get(i10);
            AbstractC5868k.m23673e(obj, "mGenreList[position]");
            aVar.mo16507a((String) obj, i10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(final b bVar, final int i10) {
        AbstractC5868k.m23674f(bVar, "holder");
        bVar.m20843b().setText((CharSequence) this.f21127b.get(i10));
        bVar.itemView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: kd.y1
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                C5153a2.m20837d(C5153a2.b.this, view, z10);
            }
        });
        bVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: kd.z1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C5153a2.m20838e(C5153a2.this, i10, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(ViewGroup viewGroup, int i10) {
        AbstractC5868k.m23674f(viewGroup, "parent");
        View inflate = LayoutInflater.from(this.f21126a).inflate(R$layout.layout_item_vod_genre, viewGroup, false);
        AbstractC5868k.m23673e(inflate, "view");
        return new b(this, inflate);
    }

    /* renamed from: g */
    public final void m20841g(ArrayList arrayList) {
        AbstractC5868k.m23674f(arrayList, "genreList");
        this.f21127b.clear();
        this.f21127b.addAll(arrayList);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    public int getItemCount() {
        if (this.f21127b.size() >= 5) {
            return 5;
        }
        return this.f21127b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    public long getItemId(int i10) {
        return i10;
    }

    /* renamed from: h */
    public final void m20842h(a aVar) {
        AbstractC5868k.m23674f(aVar, "listener");
        this.f21128c = aVar;
    }
}
