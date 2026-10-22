package qa;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.AbstractActivityC0712e;
import androidx.fragment.app.AbstractC0729o;
import androidx.recyclerview.widget.RecyclerView;
import be.C1328x;
import com.module.R$color;
import com.module.R$id;
import com.module.R$layout;
import com.module.R$string;
import com.open.leanback.widget.HorizontalGridView;
import java.util.Locale;
import me.InterfaceC5660l;
import me.InterfaceC5664p;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p102db.C4053l;
import p265oa.C5945c;
import p433zd.AbstractC7786b;
import pa.C6246c;
import pa.InterfaceC6245b;

/* renamed from: qa.d */
/* loaded from: classes2.dex */
public final class C6360d extends AbstractC6358b {

    /* renamed from: a */
    private final RecyclerView f24734a;

    /* renamed from: b */
    private final HorizontalGridView f24735b;

    /* renamed from: c */
    private final TextView f24736c;

    /* renamed from: d */
    private InterfaceC5664p f24737d;

    /* renamed from: e */
    private C5945c f24738e;

    /* renamed from: f */
    private b f24739f;

    /* renamed from: qa.d$a */
    /* loaded from: classes2.dex */
    static final class a extends AbstractC5869l implements InterfaceC5660l {
        a() {
            super(1);
        }

        /* renamed from: a */
        public final void m25171a(int i10) {
            InterfaceC5664p interfaceC5664p = C6360d.this.f24737d;
            if (interfaceC5664p != null) {
                interfaceC5664p.mo2391h(Integer.valueOf(i10), 2);
            }
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m25171a(((Number) obj).intValue());
            return C1328x.f4998a;
        }
    }

    /* renamed from: qa.d$b */
    /* loaded from: classes2.dex */
    public static final class b extends RecyclerView.AbstractC0802u {

        /* renamed from: b */
        final /* synthetic */ View f24742b;

        b(View view) {
            this.f24742b = view;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0802u
        public void onScrollStateChanged(RecyclerView recyclerView, int i10) {
            AbstractC5868k.m23674f(recyclerView, "recyclerView");
            if (i10 == 0) {
                C6360d.this.m25169i(this.f24742b);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6360d(View view, RecyclerView recyclerView) {
        super(view);
        AbstractC5868k.m23674f(view, "itemView");
        AbstractC5868k.m23674f(recyclerView, "parent");
        this.f24734a = recyclerView;
        View findViewById = view.findViewById(R$id.mGridView);
        AbstractC5868k.m23673e(findViewById, "itemView.findViewById(R.id.mGridView)");
        HorizontalGridView horizontalGridView = (HorizontalGridView) findViewById;
        this.f24735b = horizontalGridView;
        View findViewById2 = view.findViewById(R$id.mTvTitle);
        AbstractC5868k.m23673e(findViewById2, "itemView.findViewById(R.id.mTvTitle)");
        TextView textView = (TextView) findViewById2;
        this.f24736c = textView;
        this.f24739f = new b(view);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.height = AbstractC7786b.m30163g(72);
        layoutParams.topMargin = AbstractC7786b.m30163g(20);
        horizontalGridView.setLayoutParams(layoutParams);
        horizontalGridView.setClipChildren(false);
        horizontalGridView.setClipToPadding(false);
        horizontalGridView.setHorizontalSpacing(AbstractC7786b.m30166j(6));
        String string = view.getContext().getString(R$string.vod_menu_audio);
        AbstractC5868k.m23673e(string, "itemView.context.getStri…(R.string.vod_menu_audio)");
        Locale locale = Locale.US;
        AbstractC5868k.m23673e(locale, "US");
        String upperCase = string.toUpperCase(locale);
        AbstractC5868k.m23673e(upperCase, "this as java.lang.String).toUpperCase(locale)");
        textView.setText(upperCase);
        C5945c c5945c = new C5945c();
        this.f24738e = c5945c;
        horizontalGridView.setAdapter(c5945c);
        this.f24738e.m24080u(new a());
        if (!C4053l.f17879P0.m17071b(C4053l.c.VodPlaySubtitle)) {
            recyclerView.addOnScrollListener(this.f24739f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public final void m25169i(final View view) {
        C4053l.a aVar = C4053l.f17879P0;
        if (!aVar.m17070a() && !aVar.m17071b(C4053l.c.VodPlaySubtitle)) {
            aVar.m17072c(true);
            view.postDelayed(new Runnable() { // from class: qa.c
                @Override // java.lang.Runnable
                public final void run() {
                    C6360d.m25170j(C6360d.this, view);
                }
            }, 100L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static final void m25170j(C6360d c6360d, View view) {
        AbstractC5868k.m23674f(c6360d, "this$0");
        AbstractC5868k.m23674f(view, "$securityView");
        if (c6360d.itemView.hasFocus()) {
            C4053l c4053l = new C4053l();
            c4053l.m17069ea(view);
            c4053l.m17067ca(C4053l.b.TOP_RIGHT);
            c4053l.m17066ba(AbstractC7786b.m30166j(20), AbstractC7786b.m30163g(20));
            c4053l.m17065aa(R$layout.layout_guide_vod_play_subtitle);
            String string = view.getContext().getString(R$string.dialog_guide_ok);
            AbstractC5868k.m23673e(string, "securityView.context.get…R.string.dialog_guide_ok)");
            c4053l.m17063Y9(string);
            Context context = view.getContext();
            AbstractC5868k.m23672d(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            AbstractC0729o m3294d4 = ((AbstractActivityC0712e) context).m3294d4();
            AbstractC5868k.m23673e(m3294d4, "securityView.context as …y).supportFragmentManager");
            c4053l.mo3277E9(m3294d4, "GuideDialog");
            C4053l.f17879P0.m17073d(C4053l.c.VodPlaySubtitle, true);
        }
    }

    @Override // qa.AbstractC6358b
    /* renamed from: b */
    public void mo25160b(boolean z10) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        if (z10) {
            if (!C4053l.f17879P0.m17071b(C4053l.c.VodPlaySubtitle)) {
                this.f24734a.smoothScrollBy(0, 10);
            }
            this.f24736c.setTextSize(0, AbstractC7786b.m30163g(40));
            this.f24736c.setTextColor(this.itemView.getContext().getResources().getColor(R$color.color_ffffff));
        } else {
            this.f24736c.setTextSize(0, AbstractC7786b.m30163g(32));
            this.f24736c.setTextColor(this.itemView.getContext().getResources().getColor(R$color.color_858d94));
        }
        this.f24736c.setLayoutParams(layoutParams);
    }

    @Override // qa.AbstractC6358b
    /* renamed from: c */
    public void mo25161c(InterfaceC6245b interfaceC6245b) {
        AbstractC5868k.m23674f(interfaceC6245b, "itemData");
        this.f24738e.m28854l(((C6246c) interfaceC6245b).m24870a());
    }

    @Override // qa.AbstractC6358b
    /* renamed from: d */
    public void mo25162d(InterfaceC5664p interfaceC5664p) {
        AbstractC5868k.m23674f(interfaceC5664p, "listener");
        this.f24737d = interfaceC5664p;
    }

    @Override // qa.AbstractC6358b
    /* renamed from: e */
    public void mo25163e(boolean z10) {
        int i10;
        HorizontalGridView horizontalGridView = this.f24735b;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        horizontalGridView.setVisibility(i10);
        mo25160b(z10);
    }
}
