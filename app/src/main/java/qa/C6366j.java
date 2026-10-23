package qa;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import be.C1328x;
import com.module.R$color;
import com.module.R$id;
import com.module.R$string;
import com.module.view.SelectionView;
import com.request.result.SimpleProgramList;
import java.util.Locale;
import me.InterfaceC5642a;
import me.InterfaceC5664p;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p433zd.AbstractC7786b;
import pa.C6250g;
import pa.InterfaceC6245b;

/* renamed from: qa.j */
/* loaded from: classes2.dex */
public final class C6366j extends AbstractC6358b {

    /* renamed from: a */
    private final SelectionView f24769a;

    /* renamed from: b */
    private final TextView f24770b;

    /* renamed from: c */
    private InterfaceC5664p f24771c;

    /* renamed from: qa.j$a */
    /* loaded from: classes2.dex */
    static final class a extends AbstractC5869l implements InterfaceC5664p {
        a() {
            super(2);
        }

        /* renamed from: a */
        public final Boolean m25193a(int i10, SimpleProgramList simpleProgramList) {
            AbstractC5868k.m23674f(simpleProgramList, "simpleProgramList");
            InterfaceC5664p interfaceC5664p = C6366j.this.f24771c;
            if (interfaceC5664p != null) {
                interfaceC5664p.mo2391h(Integer.valueOf(i10), 0);
            }
            return Boolean.FALSE;
        }

        @Override // me.InterfaceC5664p
        /* renamed from: h */
        public /* bridge */ /* synthetic */ Object mo2391h(Object obj, Object obj2) {
            return m25193a(((Number) obj).intValue(), (SimpleProgramList) obj2);
        }
    }

    /* renamed from: qa.j$b */
    /* loaded from: classes2.dex */
    static final class b extends AbstractC5869l implements InterfaceC5642a {
        b() {
            super(0);
        }

        /* renamed from: a */
        public final void m25194a() {
            C6366j.this.m25192j(SelectionView.f12294t.m12278a());
        }

        @Override // me.InterfaceC5642a
        public /* bridge */ /* synthetic */ Object invoke() {
            m25194a();
            return C1328x.f4998a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6366j(View view) {
        super(view);
        AbstractC5868k.m23674f(view, "itemView");
        View findViewById = view.findViewById(R$id.mSelectionView);
        AbstractC5868k.m23673e(findViewById, "itemView.findViewById(R.id.mSelectionView)");
        SelectionView selectionView = (SelectionView) findViewById;
        this.f24769a = selectionView;
        View findViewById2 = view.findViewById(R$id.mTvTitle);
        AbstractC5868k.m23673e(findViewById2, "itemView.findViewById(R.id.mTvTitle)");
        TextView textView = (TextView) findViewById2;
        this.f24770b = textView;
        view.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: qa.i
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z10) {
                C6366j.m25189g(C6366j.this, view2, z10);
            }
        });
        selectionView.setOnItemClickListener(new a());
        String string = view.getContext().getString(R$string.vod_menu_selection);
        AbstractC5868k.m23673e(string, "itemView.context.getStri…tring.vod_menu_selection)");
        Locale locale = Locale.US;
        AbstractC5868k.m23673e(locale, "US");
        String upperCase = string.toUpperCase(locale);
        AbstractC5868k.m23673e(upperCase, "this as java.lang.String).toUpperCase(locale)");
        textView.setText(upperCase);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static final void m25189g(C6366j c6366j, View view, boolean z10) {
        AbstractC5868k.m23674f(c6366j, "this$0");
        if (z10) {
            c6366j.f24769a.requestFocus();
        }
    }

    @Override // qa.AbstractC6358b
    /* renamed from: b */
    public void mo25160b(boolean z10) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        if (z10) {
            this.f24770b.setTextSize(0, AbstractC7786b.m30163g(40));
            this.f24770b.setTextColor(this.itemView.getContext().getResources().getColor(R$color.color_ffffff));
        } else {
            this.f24770b.setTextSize(0, AbstractC7786b.m30163g(32));
            this.f24770b.setTextColor(this.itemView.getContext().getResources().getColor(R$color.color_858d94));
        }
        this.f24770b.setLayoutParams(layoutParams);
    }

    @Override // qa.AbstractC6358b
    /* renamed from: c */
    public void mo25161c(InterfaceC6245b interfaceC6245b) {
        AbstractC5868k.m23674f(interfaceC6245b, "itemData");
        this.f24769a.m12275J(((C6250g) interfaceC6245b).m24878a(), new b());
    }

    @Override // qa.AbstractC6358b
    /* renamed from: d */
    public void mo25162d(InterfaceC5664p interfaceC5664p) {
        AbstractC5868k.m23674f(interfaceC5664p, "listener");
        this.f24771c = interfaceC5664p;
    }

    @Override // qa.AbstractC6358b
    /* renamed from: e */
    public void mo25163e(boolean z10) {
        int i10 = 0;
        SelectionView selectionView = this.f24769a;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        selectionView.setVisibility(i10);
        mo25160b(z10);
    }

    /* renamed from: i */
    public final void m25191i() {
        this.f24769a.m12277x();
    }

    /* renamed from: j */
    public final void m25192j(int i10) {
        SelectionView.m12241I(this.f24769a, i10, 0, 2, null);
    }
}
