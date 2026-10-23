package p212kd;

import android.view.View;
import android.widget.TextView;
import com.request.result.FilterInfo;
import com.vod.R$layout;
import ne.AbstractC5868k;
import p212kd.C5244x1;
import p399x9.AbstractC7528c;
import p399x9.C7531f;

/* renamed from: kd.g */
/* loaded from: classes3.dex */
public final class C5174g extends AbstractC7528c {

    /* renamed from: e */
    private final int f21191e;

    /* renamed from: f */
    private int f21192f;

    /* renamed from: g */
    private C5244x1.a f21193g;

    public C5174g(int i10) {
        super(R$layout.layout_item_filter_list, null, 2, null);
        this.f21191e = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public static final void m20898r(C5174g c5174g, int i10, View view) {
        AbstractC5868k.m23674f(c5174g, "this$0");
        if (c5174g.f21192f == i10) {
            return;
        }
        c5174g.m20902u(i10);
        C5244x1.a aVar = c5174g.f21193g;
        if (aVar != null) {
            aVar.mo16200i3(c5174g.f21191e, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p399x9.AbstractC7527b
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public void mo5338e(C7531f c7531f, FilterInfo filterInfo) {
        boolean z10 = false;
        AbstractC5868k.m23674f(c7531f, "holder");
        AbstractC5868k.m23674f(filterInfo, "bean");
        final int adapterPosition = c7531f.getAdapterPosition();
        View view = c7531f.itemView;
        AbstractC5868k.m23672d(view, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) view;
        textView.setText(filterInfo.getValue());
        if (this.f21192f == adapterPosition) {
            z10 = true;
        } else {
            z10 = false;
        }
        textView.setSelected(z10);
        textView.setOnClickListener(new View.OnClickListener() { // from class: kd.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C5174g.m20898r(C5174g.this, adapterPosition, view2);
            }
        });
    }

    /* renamed from: s */
    public final int m20900s() {
        return this.f21192f;
    }

    /* renamed from: t */
    public final void m20901t(C5244x1.a aVar) {
        AbstractC5868k.m23674f(aVar, "listener");
        this.f21193g = aVar;
    }

    /* renamed from: u */
    public final void m20902u(int i10) {
        this.f21192f = i10;
        notifyDataSetChanged();
    }
}
