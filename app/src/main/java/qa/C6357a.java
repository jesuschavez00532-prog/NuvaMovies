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
import p265oa.C5954l;
import p433zd.AbstractC7786b;
import pa.C6244a;
import pa.InterfaceC6245b;

/* renamed from: qa.a */
/* loaded from: classes2.dex */
public final class C6357a extends AbstractC6358b {

    /* renamed from: a */
    private final HorizontalGridView f24726a;

    /* renamed from: b */
    private final TextView f24727b;

    /* renamed from: c */
    private InterfaceC5664p f24728c;

    /* renamed from: d */
    private final InterfaceC1312h f24729d;

    /* renamed from: qa.a$a */
    /* loaded from: classes2.dex */
    static final class a extends AbstractC5869l implements InterfaceC5660l {
        a() {
            super(1);
        }

        /* renamed from: a */
        public final void m25164a(int i10) {
            InterfaceC5664p interfaceC5664p = C6357a.this.f24728c;
            if (interfaceC5664p != null) {
                interfaceC5664p.mo2391h(Integer.valueOf(i10), 6);
            }
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m25164a(((Number) obj).intValue());
            return C1328x.f4998a;
        }
    }

    /* renamed from: qa.a$b */
    /* loaded from: classes2.dex */
    static final class b extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final b f24731a = new b();

        b() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C5954l invoke() {
            return new C5954l(6);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6357a(View view) {
        super(view);
        InterfaceC1312h m5965b;
        AbstractC5868k.m23674f(view, "itemView");
        View findViewById = view.findViewById(R$id.mGridView);
        AbstractC5868k.m23673e(findViewById, "itemView.findViewById(R.id.mGridView)");
        HorizontalGridView horizontalGridView = (HorizontalGridView) findViewById;
        this.f24726a = horizontalGridView;
        View findViewById2 = view.findViewById(R$id.mTvTitle);
        AbstractC5868k.m23673e(findViewById2, "itemView.findViewById(R.id.mTvTitle)");
        TextView textView = (TextView) findViewById2;
        this.f24727b = textView;
        m5965b = AbstractC1314j.m5965b(b.f24731a);
        this.f24729d = m5965b;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.height = AbstractC7786b.m30163g(72);
        layoutParams.topMargin = AbstractC7786b.m30163g(20);
        horizontalGridView.setLayoutParams(layoutParams);
        horizontalGridView.setClipChildren(false);
        horizontalGridView.setClipToPadding(false);
        horizontalGridView.setHorizontalSpacing(AbstractC7786b.m30166j(6));
        horizontalGridView.setAdapter(m25159g());
        m25159g().m24107u(new a());
        String string = view.getContext().getString(R$string.vod_menu_feedback);
        AbstractC5868k.m23673e(string, "itemView.context.getStri…string.vod_menu_feedback)");
        Locale locale = Locale.US;
        AbstractC5868k.m23673e(locale, "US");
        String upperCase = string.toUpperCase(locale);
        AbstractC5868k.m23673e(upperCase, "this as java.lang.String).toUpperCase(locale)");
        textView.setText(upperCase);
    }

    /* renamed from: g */
    private final C5954l m25159g() {
        return (C5954l) this.f24729d.getValue();
    }

    @Override // qa.AbstractC6358b
    /* renamed from: b */
    public void mo25160b(boolean z10) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        if (z10) {
            this.f24727b.setTextSize(0, AbstractC7786b.m30163g(40));
            this.f24727b.setTextColor(this.itemView.getContext().getResources().getColor(R$color.color_ffffff));
        } else {
            this.f24727b.setTextSize(0, AbstractC7786b.m30163g(32));
            this.f24727b.setTextColor(this.itemView.getContext().getResources().getColor(R$color.color_858d94));
        }
        this.f24727b.setLayoutParams(layoutParams);
    }

    @Override // qa.AbstractC6358b
    /* renamed from: c */
    public void mo25161c(InterfaceC6245b interfaceC6245b) {
        AbstractC5868k.m23674f(interfaceC6245b, "itemData");
        m25159g().m28856n(((C6244a) interfaceC6245b).m24868a());
    }

    @Override // qa.AbstractC6358b
    /* renamed from: d */
    public void mo25162d(InterfaceC5664p interfaceC5664p) {
        AbstractC5868k.m23674f(interfaceC5664p, "listener");
        this.f24728c = interfaceC5664p;
    }

    @Override // qa.AbstractC6358b
    /* renamed from: e */
    public void mo25163e(boolean z10) {
        int i10 = 0;
        HorizontalGridView horizontalGridView = this.f24726a;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        horizontalGridView.setVisibility(i10);
        mo25160b(z10);
    }
}
