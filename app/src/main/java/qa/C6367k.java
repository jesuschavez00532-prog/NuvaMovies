package qa;

import android.support.v4.media.session.AbstractC0272b;
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
import p265oa.C5956n;
import p433zd.AbstractC7786b;
import pa.InterfaceC6245b;

/* renamed from: qa.k */
/* loaded from: classes2.dex */
public final class C6367k extends AbstractC6358b {

    /* renamed from: a */
    private final HorizontalGridView f24774a;

    /* renamed from: b */
    private final TextView f24775b;

    /* renamed from: c */
    private InterfaceC5664p f24776c;

    /* renamed from: d */
    private final InterfaceC1312h f24777d;

    /* renamed from: qa.k$a */
    /* loaded from: classes2.dex */
    static final class a extends AbstractC5869l implements InterfaceC5660l {
        a() {
            super(1);
        }

        /* renamed from: a */
        public final void m25198a(int i10) {
            InterfaceC5664p interfaceC5664p = C6367k.this.f24776c;
            if (interfaceC5664p != null) {
                interfaceC5664p.mo2391h(Integer.valueOf(i10), 1);
            }
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m25198a(((Number) obj).intValue());
            return C1328x.f4998a;
        }
    }

    /* renamed from: qa.k$b */
    /* loaded from: classes2.dex */
    static final class b extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final b f24779a = new b();

        b() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C5956n invoke() {
            return new C5956n();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6367k(View view) {
        super(view);
        InterfaceC1312h m5965b;
        AbstractC5868k.m23674f(view, "view");
        View findViewById = this.itemView.findViewById(R$id.mGridView);
        AbstractC5868k.m23673e(findViewById, "itemView.findViewById(R.id.mGridView)");
        HorizontalGridView horizontalGridView = (HorizontalGridView) findViewById;
        this.f24774a = horizontalGridView;
        View findViewById2 = this.itemView.findViewById(R$id.mTvTitle);
        AbstractC5868k.m23673e(findViewById2, "itemView.findViewById(R.id.mTvTitle)");
        TextView textView = (TextView) findViewById2;
        this.f24775b = textView;
        m5965b = AbstractC1314j.m5965b(b.f24779a);
        this.f24777d = m5965b;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.height = AbstractC7786b.m30163g(72);
        layoutParams.topMargin = AbstractC7786b.m30163g(20);
        horizontalGridView.setLayoutParams(layoutParams);
        horizontalGridView.setClipChildren(false);
        horizontalGridView.setClipToPadding(false);
        horizontalGridView.setHorizontalSpacing(AbstractC7786b.m30166j(6));
        horizontalGridView.setAdapter(m25196g());
        m25196g().m24112t(new a());
        String string = this.itemView.getContext().getString(R$string.vod_menu_subtitle);
        AbstractC5868k.m23673e(string, "itemView.context.getStri…string.vod_menu_subtitle)");
        Locale locale = Locale.US;
        AbstractC5868k.m23673e(locale, "US");
        String upperCase = string.toUpperCase(locale);
        AbstractC5868k.m23673e(upperCase, "this as java.lang.String).toUpperCase(locale)");
        textView.setText(upperCase);
    }

    /* renamed from: g */
    private final C5956n m25196g() {
        return (C5956n) this.f24777d.getValue();
    }

    @Override // qa.AbstractC6358b
    /* renamed from: b */
    public void mo25160b(boolean z10) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        if (z10) {
            this.f24775b.setTextSize(0, AbstractC7786b.m30163g(40));
            this.f24775b.setTextColor(this.itemView.getContext().getResources().getColor(R$color.color_ffffff));
        } else {
            this.f24775b.setTextSize(0, AbstractC7786b.m30163g(32));
            this.f24775b.setTextColor(this.itemView.getContext().getResources().getColor(R$color.color_858d94));
        }
        this.f24775b.setLayoutParams(layoutParams);
    }

    @Override // qa.AbstractC6358b
    /* renamed from: c */
    public void mo25161c(InterfaceC6245b interfaceC6245b) {
        AbstractC5868k.m23674f(interfaceC6245b, "itemData");
        AbstractC0272b.m941a(interfaceC6245b);
        m25196g();
        throw null;
    }

    @Override // qa.AbstractC6358b
    /* renamed from: d */
    public void mo25162d(InterfaceC5664p interfaceC5664p) {
        AbstractC5868k.m23674f(interfaceC5664p, "listener");
        this.f24776c = interfaceC5664p;
    }

    @Override // qa.AbstractC6358b
    /* renamed from: e */
    public void mo25163e(boolean z10) {
        int i10 = 0;
        HorizontalGridView horizontalGridView = this.f24774a;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        horizontalGridView.setVisibility(i10);
        mo25160b(z10);
    }

    /* renamed from: h */
    public final void m25197h(int i10) {
        m25196g().m24113u(i10);
    }
}
