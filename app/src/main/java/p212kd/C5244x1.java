package p212kd;

import android.view.View;
import android.widget.TextView;
import com.vod.R$layout;
import ne.AbstractC5868k;
import p399x9.AbstractC7528c;
import p399x9.C7531f;

/* renamed from: kd.x1 */
/* loaded from: classes3.dex */
public final class C5244x1 extends AbstractC7528c {

    /* renamed from: e */
    private final int f21406e;

    /* renamed from: f */
    private int f21407f;

    /* renamed from: g */
    private a f21408g;

    /* renamed from: kd.x1$a */
    /* loaded from: classes3.dex */
    public interface a {
        /* renamed from: i3 */
        void mo16200i3(int i10, int i11);
    }

    public C5244x1(int i10) {
        super(R$layout.layout_item_filter_list, null, 2, null);
        this.f21406e = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public static final void m21118r(C5244x1 c5244x1, int i10, View view) {
        AbstractC5868k.m23674f(c5244x1, "this$0");
        if (c5244x1.f21407f == i10) {
            return;
        }
        c5244x1.m21122u(i10);
        a aVar = c5244x1.f21408g;
        if (aVar != null) {
            aVar.mo16200i3(c5244x1.f21406e, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p399x9.AbstractC7527b
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public void mo5338e(C7531f c7531f, String str) {
        boolean z10;
        AbstractC5868k.m23674f(c7531f, "holder");
        AbstractC5868k.m23674f(str, "bean");
        final int adapterPosition = c7531f.getAdapterPosition();
        View view = c7531f.itemView;
        AbstractC5868k.m23672d(view, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) view;
        textView.setText(str);
        if (this.f21407f == adapterPosition) {
            z10 = true;
        } else {
            z10 = false;
        }
        textView.setSelected(z10);
        textView.setOnClickListener(new View.OnClickListener() { // from class: kd.w1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C5244x1.m21118r(C5244x1.this, adapterPosition, view2);
            }
        });
    }

    /* renamed from: s */
    public final int m21120s() {
        return this.f21407f;
    }

    /* renamed from: t */
    public final void m21121t(a aVar) {
        AbstractC5868k.m23674f(aVar, "listener");
        this.f21408g = aVar;
    }

    /* renamed from: u */
    public final void m21122u(int i10) {
        this.f21407f = i10;
        notifyDataSetChanged();
    }
}
