package qa;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import be.AbstractC1314j;
import be.C1328x;
import be.InterfaceC1312h;
import com.module.R$color;
import com.module.R$id;
import com.module.R$string;
import com.open.leanback.widget.HorizontalGridView;
import java.util.Locale;
import me.InterfaceC5642a;
import me.InterfaceC5660l;
import me.InterfaceC5664p;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p265oa.C5949g;
import p433zd.AbstractC7786b;
import pa.C6247d;
import pa.InterfaceC6245b;

/* renamed from: qa.e */
/* loaded from: classes2.dex */
public final class C6361e extends AbstractC6358b {

    /* renamed from: a */
    private int f24743a;

    /* renamed from: b */
    private final HorizontalGridView f24744b;

    /* renamed from: c */
    private final TextView f24745c;

    /* renamed from: d */
    private final TextView f24746d;

    /* renamed from: e */
    private InterfaceC5664p f24747e;

    /* renamed from: f */
    private final InterfaceC1312h f24748f;

    /* renamed from: qa.e$a */
    /* loaded from: classes2.dex */
    static final class a extends AbstractC5869l implements InterfaceC5660l {
        a() {
            super(1);
        }

        /* renamed from: a */
        public final void m25175a(int i10) {
            InterfaceC5664p interfaceC5664p = C6361e.this.f24747e;
            if (interfaceC5664p != null) {
                interfaceC5664p.mo2391h(Integer.valueOf(i10), 5);
            }
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m25175a(((Number) obj).intValue());
            return C1328x.f4998a;
        }
    }

    /* renamed from: qa.e$b */
    /* loaded from: classes2.dex */
    static final class b extends AbstractC5869l implements InterfaceC5642a {
        b() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C5949g invoke() {
            return new C5949g(C6361e.this.m25174h());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6361e(View view, int i10) {
        super(view);
        InterfaceC1312h m5965b;
        AbstractC5868k.m23674f(view, "itemView");
        this.f24743a = i10;
        View findViewById = view.findViewById(R$id.mGridView);
        AbstractC5868k.m23673e(findViewById, "itemView.findViewById(R.id.mGridView)");
        HorizontalGridView horizontalGridView = (HorizontalGridView) findViewById;
        this.f24744b = horizontalGridView;
        View findViewById2 = view.findViewById(R$id.mTvTitle);
        AbstractC5868k.m23673e(findViewById2, "itemView.findViewById(R.id.mTvTitle)");
        TextView textView = (TextView) findViewById2;
        this.f24745c = textView;
        View findViewById3 = view.findViewById(R$id.mTvSubTitle);
        AbstractC5868k.m23673e(findViewById3, "itemView.findViewById(R.id.mTvSubTitle)");
        this.f24746d = (TextView) findViewById3;
        m5965b = AbstractC1314j.m5965b(new b());
        this.f24748f = m5965b;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.height = AbstractC7786b.m30163g(72);
        layoutParams.topMargin = AbstractC7786b.m30163g(20);
        horizontalGridView.setLayoutParams(layoutParams);
        horizontalGridView.setClipChildren(false);
        horizontalGridView.setClipToPadding(false);
        horizontalGridView.setHorizontalSpacing(AbstractC7786b.m30166j(6));
        m25173g().setHasStableIds(true);
        horizontalGridView.setAdapter(m25173g());
        m25173g().m24093v(new a());
        String string = view.getContext().getString(R$string.vod_menu_player);
        AbstractC5868k.m23673e(string, "itemView.context.getStri…R.string.vod_menu_player)");
        Locale locale = Locale.US;
        AbstractC5868k.m23673e(locale, "US");
        String upperCase = string.toUpperCase(locale);
        AbstractC5868k.m23673e(upperCase, "this as java.lang.String).toUpperCase(locale)");
        textView.setText(upperCase);
    }

    /* renamed from: g */
    private final C5949g m25173g() {
        return (C5949g) this.f24748f.getValue();
    }

    @Override // qa.AbstractC6358b
    /* renamed from: b */
    public void mo25160b(boolean z10) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        if (z10) {
            this.f24745c.setTextSize(0, AbstractC7786b.m30163g(40));
            this.f24745c.setTextColor(this.itemView.getContext().getResources().getColor(R$color.color_ffffff));
            this.f24746d.setVisibility(0);
        } else {
            this.f24745c.setTextSize(0, AbstractC7786b.m30163g(32));
            this.f24745c.setTextColor(this.itemView.getContext().getResources().getColor(R$color.color_858d94));
            this.f24746d.setVisibility(8);
        }
        this.f24745c.setLayoutParams(layoutParams);
    }

    @Override // qa.AbstractC6358b
    /* renamed from: c */
    public void mo25161c(InterfaceC6245b interfaceC6245b) {
        AbstractC5868k.m23674f(interfaceC6245b, "itemData");
        m25173g().m28856n(((C6247d) interfaceC6245b).m24872a());
    }

    @Override // qa.AbstractC6358b
    /* renamed from: d */
    public void mo25162d(InterfaceC5664p interfaceC5664p) {
        AbstractC5868k.m23674f(interfaceC5664p, "listener");
        this.f24747e = interfaceC5664p;
    }

    @Override // qa.AbstractC6358b
    /* renamed from: e */
    public void mo25163e(boolean z10) {
        mo25160b(z10);
        if (z10) {
            m25173g().m24094w();
        }
    }

    /* renamed from: h */
    public final int m25174h() {
        return this.f24743a;
    }
}
