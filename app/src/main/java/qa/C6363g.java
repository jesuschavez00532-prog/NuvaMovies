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
import p265oa.C5951i;
import p287pb.AbstractApplicationC6253c;
import p415y9.AbstractApplicationC7689d;
import p433zd.AbstractC7786b;
import pa.C6248e;
import pa.InterfaceC6245b;

/* renamed from: qa.g */
/* loaded from: classes2.dex */
public final class C6363g extends AbstractC6358b {

    /* renamed from: a */
    private final RecyclerView f24753a;

    /* renamed from: b */
    private final HorizontalGridView f24754b;

    /* renamed from: c */
    private final TextView f24755c;

    /* renamed from: d */
    private InterfaceC5664p f24756d;

    /* renamed from: e */
    private C5951i f24757e;

    /* renamed from: f */
    private b f24758f;

    /* renamed from: qa.g$a */
    /* loaded from: classes2.dex */
    static final class a extends AbstractC5869l implements InterfaceC5660l {
        a() {
            super(1);
        }

        /* renamed from: a */
        public final void m25183a(int i10) {
            InterfaceC5664p interfaceC5664p = C6363g.this.f24756d;
            if (interfaceC5664p != null) {
                interfaceC5664p.mo2391h(Integer.valueOf(i10), 3);
            }
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m25183a(((Number) obj).intValue());
            return C1328x.f4998a;
        }
    }

    /* renamed from: qa.g$b */
    /* loaded from: classes2.dex */
    public static final class b extends RecyclerView.AbstractC0802u {

        /* renamed from: b */
        final /* synthetic */ View f24761b;

        b(View view) {
            this.f24761b = view;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0802u
        public void onScrollStateChanged(RecyclerView recyclerView, int i10) {
            AbstractC5868k.m23674f(recyclerView, "recyclerView");
            if (i10 == 0) {
                C6363g.this.m25180j(this.f24761b);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6363g(View view, RecyclerView recyclerView) {
        super(view);
        AbstractC5868k.m23674f(view, "itemView");
        AbstractC5868k.m23674f(recyclerView, "parent");
        this.f24753a = recyclerView;
        View findViewById = view.findViewById(R$id.mGridView);
        AbstractC5868k.m23673e(findViewById, "itemView.findViewById(R.id.mGridView)");
        HorizontalGridView horizontalGridView = (HorizontalGridView) findViewById;
        this.f24754b = horizontalGridView;
        View findViewById2 = view.findViewById(R$id.mTvTitle);
        AbstractC5868k.m23673e(findViewById2, "itemView.findViewById(R.id.mTvTitle)");
        TextView textView = (TextView) findViewById2;
        this.f24755c = textView;
        this.f24758f = new b(view);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.height = AbstractC7786b.m30163g(72);
        layoutParams.topMargin = AbstractC7786b.m30163g(20);
        horizontalGridView.setLayoutParams(layoutParams);
        horizontalGridView.setClipChildren(false);
        horizontalGridView.setClipToPadding(false);
        horizontalGridView.setHorizontalSpacing(AbstractC7786b.m30166j(6));
        String string = AbstractApplicationC6253c.f24484b.m24887a().getString(R$string.resolution);
        AbstractC5868k.m23673e(string, "BaseApp.context.getString(R.string.resolution)");
        Locale locale = Locale.US;
        AbstractC5868k.m23673e(locale, "US");
        String upperCase = string.toUpperCase(locale);
        AbstractC5868k.m23673e(upperCase, "this as java.lang.String).toUpperCase(locale)");
        textView.setText(upperCase);
        C5951i c5951i = new C5951i();
        this.f24757e = c5951i;
        horizontalGridView.setAdapter(c5951i);
        this.f24757e.m24099t(new a());
        if (!C4053l.f17879P0.m17071b(C4053l.c.VodPlayQuality)) {
            recyclerView.addOnScrollListener(this.f24758f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public final void m25180j(final View view) {
        C4053l.a aVar = C4053l.f17879P0;
        if (!aVar.m17070a() && !aVar.m17071b(C4053l.c.VodPlayQuality)) {
            view.postDelayed(new Runnable() { // from class: qa.f
                @Override // java.lang.Runnable
                public final void run() {
                    C6363g.m25181k(C6363g.this, view);
                }
            }, 100L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static final void m25181k(C6363g c6363g, View view) {
        AbstractC5868k.m23674f(c6363g, "this$0");
        AbstractC5868k.m23674f(view, "$securityView");
        if (c6363g.itemView.hasFocus()) {
            C4053l c4053l = new C4053l();
            c4053l.m17069ea(view);
            c4053l.m17067ca(C4053l.b.TOP_RIGHT);
            c4053l.m17066ba(AbstractC7786b.m30166j(70), AbstractC7786b.m30163g(20));
            c4053l.m17065aa(R$layout.layout_guide_vod_play_quality_land);
            String string = view.getContext().getString(R$string.dialog_guide_ok);
            AbstractC5868k.m23673e(string, "securityView.context.get…R.string.dialog_guide_ok)");
            c4053l.m17063Y9(string);
            Context context = view.getContext();
            AbstractC5868k.m23672d(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            AbstractC0729o m3294d4 = ((AbstractActivityC0712e) context).m3294d4();
            AbstractC5868k.m23673e(m3294d4, "securityView.context as …y).supportFragmentManager");
            c4053l.mo3277E9(m3294d4, "GuideDialog");
            C4053l.a aVar = C4053l.f17879P0;
            aVar.m17072c(true);
            aVar.m17073d(C4053l.c.VodPlayQuality, true);
        }
    }

    @Override // qa.AbstractC6358b
    /* renamed from: b */
    public void mo25160b(boolean z10) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        if (z10) {
            this.f24755c.setTextSize(0, AbstractC7786b.m30163g(40));
            this.f24755c.setTextColor(AbstractApplicationC7689d.f28135d.m29494a().getResources().getColor(R$color.color_ffffff));
        } else {
            this.f24755c.setTextSize(0, AbstractC7786b.m30163g(32));
            this.f24755c.setTextColor(AbstractApplicationC7689d.f28135d.m29494a().getResources().getColor(R$color.color_858d94));
        }
        this.f24755c.setLayoutParams(layoutParams);
    }

    @Override // qa.AbstractC6358b
    /* renamed from: c */
    public void mo25161c(InterfaceC6245b interfaceC6245b) {
        AbstractC5868k.m23674f(interfaceC6245b, "itemData");
        this.f24757e.m28854l(((C6248e) interfaceC6245b).m24874a());
    }

    @Override // qa.AbstractC6358b
    /* renamed from: d */
    public void mo25162d(InterfaceC5664p interfaceC5664p) {
        AbstractC5868k.m23674f(interfaceC5664p, "listener");
        this.f24756d = interfaceC5664p;
    }

    @Override // qa.AbstractC6358b
    /* renamed from: e */
    public void mo25163e(boolean z10) {
        int i10;
        HorizontalGridView horizontalGridView = this.f24754b;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        horizontalGridView.setVisibility(i10);
        mo25160b(z10);
    }

    /* renamed from: i */
    public final void m25182i(int i10) {
        this.f24757e.m24100u(i10);
    }
}
