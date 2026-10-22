package p028b8;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.live.R$color;
import com.live.R$drawable;
import com.live.R$id;
import com.live.R$layout;
import com.request.result.Channel;
import java.util.ArrayList;
import ne.AbstractC5868k;
import p348u2.AbstractC7026c;
import p400xa.C7594o0;

/* renamed from: b8.o0 */
/* loaded from: classes2.dex */
public final class C1176o0 extends RecyclerView.AbstractC0789h {

    /* renamed from: a */
    private final Context f4636a;

    /* renamed from: b */
    private final ArrayList f4637b;

    /* renamed from: c */
    private a f4638c;

    /* renamed from: d */
    private b f4639d;

    /* renamed from: b8.o0$a */
    /* loaded from: classes2.dex */
    public interface a {
        /* renamed from: a */
        void mo5379a(int i10);
    }

    /* renamed from: b8.o0$b */
    /* loaded from: classes2.dex */
    public interface b {
        /* renamed from: a */
        void mo5380a(boolean z10, int i10, View view);
    }

    /* renamed from: b8.o0$c */
    /* loaded from: classes2.dex */
    public final class c extends RecyclerView.AbstractC0787f0 {

        /* renamed from: a */
        private TextView f4640a;

        /* renamed from: b */
        private ImageView f4641b;

        /* renamed from: c */
        final /* synthetic */ C1176o0 f4642c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C1176o0 c1176o0, View view) {
            super(view);
            AbstractC5868k.m23674f(view, "itemView");
            this.f4642c = c1176o0;
            this.f4640a = (TextView) view.findViewById(R$id.mTextChannel);
            this.f4641b = (ImageView) view.findViewById(R$id.mIvChannelIcon);
        }

        /* renamed from: b */
        public final ImageView m5381b() {
            return this.f4641b;
        }

        /* renamed from: c */
        public final TextView m5382c() {
            return this.f4640a;
        }
    }

    public C1176o0(Context context, ArrayList arrayList) {
        AbstractC5868k.m23674f(context, "mContext");
        AbstractC5868k.m23674f(arrayList, "mData");
        this.f4636a = context;
        this.f4637b = arrayList;
        setHasStableIds(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static final void m5373d(C1176o0 c1176o0, int i10, View view) {
        AbstractC5868k.m23674f(c1176o0, "this$0");
        a aVar = c1176o0.f4638c;
        if (aVar != null) {
            AbstractC5868k.m23671c(aVar);
            aVar.mo5379a(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static final void m5374e(C1176o0 c1176o0, int i10, c cVar, View view, boolean z10) {
        AbstractC5868k.m23674f(c1176o0, "this$0");
        AbstractC5868k.m23674f(cVar, "$holder");
        b bVar = c1176o0.f4639d;
        if (bVar != null) {
            AbstractC5868k.m23671c(bVar);
            AbstractC5868k.m23673e(view, "v");
            bVar.mo5380a(z10, i10, view);
        }
        if (z10) {
            cVar.itemView.setBackgroundResource(R$color.color_main);
        } else {
            cVar.itemView.setBackgroundResource(R$color.color_transparent);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(final c cVar, final int i10) {
        AbstractC5868k.m23674f(cVar, "holder");
        Object obj = this.f4637b.get(i10);
        AbstractC5868k.m23673e(obj, "mData[position]");
        Channel channel = (Channel) obj;
        Drawable m27111a = AbstractC7026c.m27111a(this.f4636a, R$drawable.live_channel_default_icon);
        C7594o0 c7594o0 = C7594o0.f27942a;
        String showIconUrl = channel.getShowIconUrl();
        ImageView m5381b = cVar.m5381b();
        AbstractC5868k.m23673e(m5381b, "holder.mIvChannelIcon");
        Context context = this.f4636a;
        AbstractC5868k.m23673e(m27111a, "placeholder");
        C7594o0.m29204m(c7594o0, showIconUrl, m5381b, context, m27111a, 0, null, 48, null);
        cVar.m5382c().setText(channel.getName());
        cVar.m5382c().setOnClickListener(new View.OnClickListener() { // from class: b8.m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1176o0.m5373d(C1176o0.this, i10, view);
            }
        });
        cVar.m5382c().setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: b8.n0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                C1176o0.m5374e(C1176o0.this, i10, cVar, view, z10);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public c onCreateViewHolder(ViewGroup viewGroup, int i10) {
        AbstractC5868k.m23674f(viewGroup, "parent");
        View inflate = LayoutInflater.from(this.f4636a).inflate(R$layout.layout_search_result, viewGroup, false);
        AbstractC5868k.m23673e(inflate, "view");
        return new c(this, inflate);
    }

    /* renamed from: g */
    public final void m5377g(a aVar) {
        AbstractC5868k.m23674f(aVar, "listener");
        this.f4638c = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    public int getItemCount() {
        return this.f4637b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    public long getItemId(int i10) {
        return i10;
    }

    /* renamed from: h */
    public final void m5378h(b bVar) {
        AbstractC5868k.m23674f(bVar, "listener");
        this.f4639d = bVar;
    }
}
