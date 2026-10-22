package p212kd;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.open.leanback.widget.HorizontalGridView;
import com.umeng.analytics.pro.C3384f;
import com.vod.R$id;
import java.util.List;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p201k2.AbstractC5091h;
import p225ld.C5549c;
import p225ld.C5550d;
import p400xa.AbstractC7555b0;

/* renamed from: kd.y0 */
/* loaded from: classes3.dex */
public final class C5247y0 extends AbstractC5243x0 {

    /* renamed from: a */
    private final TextView f21417a;

    /* renamed from: b */
    private final HorizontalGridView f21418b;

    /* renamed from: kd.y0$a */
    /* loaded from: classes3.dex */
    static final class a extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: b */
        final /* synthetic */ C5203n0 f21420b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C5203n0 c5203n0) {
            super(1);
            this.f21420b = c5203n0;
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo542f(KeyEvent keyEvent) {
            AbstractC5868k.m23674f(keyEvent, "it");
            if (C5247y0.this.getAdapterPosition() == 0) {
                if (keyEvent.getRepeatCount() == 0) {
                    this.f21420b.m21025d().invoke();
                }
                return Boolean.TRUE;
            }
            return Boolean.FALSE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5247y0(View view) {
        super(view);
        AbstractC5868k.m23674f(view, "itemView");
        View findViewById = view.findViewById(R$id.mHorizonTitle);
        AbstractC5868k.m23673e(findViewById, "itemView.findViewById(R.id.mHorizonTitle)");
        this.f21417a = (TextView) findViewById;
        View findViewById2 = view.findViewById(R$id.mHorizonList);
        AbstractC5868k.m23673e(findViewById2, "itemView.findViewById(R.id.mHorizonList)");
        this.f21418b = (HorizontalGridView) findViewById2;
    }

    @Override // p212kd.AbstractC5243x0
    /* renamed from: b */
    public void mo21032b(C5203n0 c5203n0, Context context, C5550d c5550d, int i10, RecyclerView recyclerView) {
        C5182i c5182i;
        int i11;
        int i12;
        AbstractC5868k.m23674f(c5203n0, "homeVodAdapter");
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        AbstractC5868k.m23674f(c5550d, "data");
        super.mo21032b(c5203n0, context, c5550d, i10, recyclerView);
        List m22499b = c5550d.m22499b();
        AbstractC5868k.m23671c(m22499b);
        C5549c c5549c = (C5549c) m22499b.get(0);
        this.f21417a.setText(AbstractC5091h.m20660c(c5549c.m22495d(), c5549c.m22492a()));
        AbstractC7555b0.m28958l(this.f21418b, false, true, null, 5, null);
        RecyclerView.AbstractC0789h adapter = this.f21418b.getAdapter();
        if (adapter instanceof C5182i) {
            c5182i = (C5182i) adapter;
        } else {
            c5182i = null;
        }
        if (c5182i == null) {
            c5182i = new C5182i(context, new a(c5203n0));
        }
        c5182i.m20941p(c5550d.m22503f());
        List m22499b2 = c5550d.m22499b();
        AbstractC5868k.m23671c(m22499b2);
        String m22492a = ((C5549c) m22499b2.get(0)).m22492a();
        String str = "";
        if (m22492a == null) {
            m22492a = "";
        }
        c5182i.m20936k(m22492a);
        List m22499b3 = c5550d.m22499b();
        AbstractC5868k.m23671c(m22499b3);
        Integer m22494c = ((C5549c) m22499b3.get(0)).m22494c();
        if (m22494c != null) {
            i11 = m22494c.intValue();
        } else {
            i11 = 0;
        }
        c5182i.m20938m(i11);
        List m22499b4 = c5550d.m22499b();
        AbstractC5868k.m23671c(m22499b4);
        String m22493b = ((C5549c) m22499b4.get(0)).m22493b();
        if (m22493b != null) {
            str = m22493b;
        }
        c5182i.m20937l(str);
        List m22499b5 = c5550d.m22499b();
        AbstractC5868k.m23671c(m22499b5);
        Integer m22496e = ((C5549c) m22499b5.get(0)).m22496e();
        if (m22496e != null) {
            i12 = m22496e.intValue();
        } else {
            i12 = -1;
        }
        c5182i.m20940o(i12);
        c5182i.m20939n(c5203n0.m21023b());
        c5182i.m20942q(c5550d.m22498a());
        this.f21418b.setAdapter(c5182i);
    }
}
