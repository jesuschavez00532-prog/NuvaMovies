package p212kd;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.open.leanback.widget.VerticalGridView;
import com.umeng.analytics.pro.C3384f;
import com.vod.R$id;
import java.util.List;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p225ld.C5550d;
import p400xa.AbstractC7555b0;

/* renamed from: kd.o0 */
/* loaded from: classes3.dex */
public class C5207o0 extends AbstractC5243x0 {

    /* renamed from: a */
    private final VerticalGridView f21307a;

    /* renamed from: kd.o0$a */
    /* loaded from: classes3.dex */
    static final class a extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: b */
        final /* synthetic */ C5203n0 f21309b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C5203n0 c5203n0) {
            super(1);
            this.f21309b = c5203n0;
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo542f(KeyEvent keyEvent) {
            AbstractC5868k.m23674f(keyEvent, "it");
            if (C5207o0.this.getAdapterPosition() == 0) {
                if (keyEvent.getRepeatCount() == 0) {
                    this.f21309b.m21025d().invoke();
                }
                return Boolean.TRUE;
            }
            return Boolean.FALSE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5207o0(View view) {
        super(view);
        AbstractC5868k.m23674f(view, "itemView");
        View findViewById = view.findViewById(R$id.mPersonRoot);
        AbstractC5868k.m23673e(findViewById, "itemView.findViewById(R.id.mPersonRoot)");
        this.f21307a = (VerticalGridView) findViewById;
    }

    @Override // p212kd.AbstractC5243x0
    /* renamed from: b */
    public void mo21032b(C5203n0 c5203n0, Context context, C5550d c5550d, int i10, RecyclerView recyclerView) {
        C5242x c5242x;
        AbstractC5868k.m23674f(c5203n0, "homeVodAdapter");
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        AbstractC5868k.m23674f(c5550d, "data");
        AbstractC7555b0.m28958l(this.f21307a, true, false, null, 6, null);
        RecyclerView.AbstractC0789h adapter = this.f21307a.getAdapter();
        if (adapter instanceof C5242x) {
            c5242x = (C5242x) adapter;
        } else {
            c5242x = null;
        }
        if (c5242x == null) {
            c5242x = new C5242x(context, new a(c5203n0));
        }
        c5242x.m21115k(c5203n0.m21023b());
        List m22499b = c5550d.m22499b();
        AbstractC5868k.m23671c(m22499b);
        c5242x.m21116l(m22499b);
        this.f21307a.setAdapter(c5242x);
    }
}
