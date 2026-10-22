package p399x9;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.module.R$drawable;
import com.module.R$id;
import com.module.R$layout;
import com.module.R$string;
import com.request.result.SameSeasonSeriesBean;
import me.InterfaceC5664p;
import ne.AbstractC5868k;

/* renamed from: x9.p */
/* loaded from: classes2.dex */
public final class C7541p extends AbstractC7527b {

    /* renamed from: e */
    private int f27716e;

    /* renamed from: f */
    private InterfaceC5664p f27717f;

    public C7541p() {
        super(R$layout.item_select_season, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public static final void m28898s(C7541p c7541p, SameSeasonSeriesBean sameSeasonSeriesBean, C7531f c7531f, View view) {
        boolean z10;
        AbstractC5868k.m23674f(c7541p, "this$0");
        AbstractC5868k.m23674f(sameSeasonSeriesBean, "$bean");
        AbstractC5868k.m23674f(c7531f, "$holder");
        InterfaceC5664p interfaceC5664p = c7541p.f27717f;
        if (interfaceC5664p != null) {
            if (c7531f.getAdapterPosition() == c7541p.f27716e) {
                z10 = true;
            } else {
                z10 = false;
            }
            interfaceC5664p.mo2391h(sameSeasonSeriesBean, Boolean.valueOf(z10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public static final void m28899t(C7531f c7531f, View view, boolean z10) {
        AbstractC5868k.m23674f(c7531f, "$holder");
        ((TextView) c7531f.m28863b(R$id.tvSeanson)).setSelected(z10);
        if (z10) {
            ((ImageView) c7531f.m28863b(R$id.ivSelected)).setImageResource(R$drawable.icon_nation_selected_focus);
        } else {
            ((ImageView) c7531f.m28863b(R$id.ivSelected)).setImageResource(R$drawable.icon_nation_selected);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p399x9.AbstractC7527b
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public void mo5338e(final C7531f c7531f, final SameSeasonSeriesBean sameSeasonSeriesBean) {
        AbstractC5868k.m23674f(c7531f, "holder");
        AbstractC5868k.m23674f(sameSeasonSeriesBean, "bean");
        boolean z10 = true;
        C7531f m28865d = c7531f.m28865d(R$id.tvSeanson, m28850h().getString(R$string.detail_season, Integer.valueOf(sameSeasonSeriesBean.getSeasonNumber())));
        int i10 = R$id.ivSelected;
        if (c7531f.getAdapterPosition() != this.f27716e) {
            z10 = false;
        }
        m28865d.m28867f(i10, z10);
        c7531f.itemView.setOnClickListener(new View.OnClickListener() { // from class: x9.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C7541p.m28898s(C7541p.this, sameSeasonSeriesBean, c7531f, view);
            }
        });
        c7531f.itemView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: x9.o
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                C7541p.m28899t(C7531f.this, view, z11);
            }
        });
    }

    /* renamed from: u */
    public final void m28901u(InterfaceC5664p interfaceC5664p) {
        this.f27717f = interfaceC5664p;
    }

    /* renamed from: v */
    public final void m28902v(int i10) {
        this.f27716e = i10;
    }
}
