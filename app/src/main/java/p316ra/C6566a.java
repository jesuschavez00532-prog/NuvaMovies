package p316ra;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.module.R$layout;
import ne.AbstractC5868k;
import qa.AbstractC6358b;
import qa.C6357a;
import qa.C6360d;
import qa.C6361e;
import qa.C6363g;
import qa.C6364h;
import qa.C6366j;
import qa.C6367k;

/* renamed from: ra.a */
/* loaded from: classes2.dex */
public final class C6566a {

    /* renamed from: a */
    public static final C6566a f25180a = new C6566a();

    private C6566a() {
    }

    /* renamed from: a */
    public final AbstractC6358b m25630a(ViewGroup viewGroup, int i10, int i11) {
        AbstractC5868k.m23674f(viewGroup, "parent");
        switch (i10) {
            case 0:
                View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.layout_item_type_selection, viewGroup, false);
                AbstractC5868k.m23673e(inflate, "from(parent.context).inf…selection, parent, false)");
                return new C6366j(inflate);
            case 1:
                View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.layout_item_type_subtitle, viewGroup, false);
                AbstractC5868k.m23673e(inflate2, "from(parent.context).inf…_subtitle, parent, false)");
                return new C6367k(inflate2);
            case 2:
                View inflate3 = LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.layout_item_type_subtitle, viewGroup, false);
                AbstractC5868k.m23673e(inflate3, "from(parent.context).inf…_subtitle, parent, false)");
                return new C6360d(inflate3, (RecyclerView) viewGroup);
            case 3:
                View inflate4 = LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.layout_item_type_quality, viewGroup, false);
                AbstractC5868k.m23673e(inflate4, "from(parent.context).inf…e_quality, parent, false)");
                return new C6363g(inflate4, (RecyclerView) viewGroup);
            case 4:
                View inflate5 = LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.layout_item_type_subtitle, viewGroup, false);
                AbstractC5868k.m23673e(inflate5, "from(parent.context).inf…_subtitle, parent, false)");
                return new C6364h(inflate5);
            case 5:
                View inflate6 = LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.layout_item_type_player, viewGroup, false);
                AbstractC5868k.m23673e(inflate6, "from(parent.context).inf…pe_player, parent, false)");
                return new C6361e(inflate6, i11);
            case 6:
                View inflate7 = LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.layout_item_type_subtitle, viewGroup, false);
                AbstractC5868k.m23673e(inflate7, "from(parent.context).inf…_subtitle, parent, false)");
                return new C6357a(inflate7);
            default:
                View inflate8 = LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.layout_item_type_subtitle, viewGroup, false);
                AbstractC5868k.m23673e(inflate8, "from(parent.context).inf…_subtitle, parent, false)");
                return new C6357a(inflate8);
        }
    }
}
