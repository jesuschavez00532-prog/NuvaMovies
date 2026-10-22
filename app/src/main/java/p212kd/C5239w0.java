package p212kd;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.request.result.RecommendList;
import com.umeng.analytics.pro.C3384f;
import com.vod.R$id;
import com.vod.view.PosterView;
import java.util.List;
import ne.AbstractC5868k;
import p225ld.C5550d;

/* renamed from: kd.w0 */
/* loaded from: classes3.dex */
public final class C5239w0 extends C5231u0 {

    /* renamed from: f */
    private final PosterView f21397f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5239w0(View view) {
        super(view);
        AbstractC5868k.m23674f(view, "itemView");
        View findViewById = view.findViewById(R$id.mRecommend06);
        AbstractC5868k.m23673e(findViewById, "itemView.findViewById(R.id.mRecommend06)");
        this.f21397f = (PosterView) findViewById;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public static final boolean m21104u(View view, int i10, KeyEvent keyEvent) {
        return false;
    }

    @Override // p212kd.C5231u0, p212kd.C5223s0, p212kd.AbstractC5243x0
    /* renamed from: b */
    public void mo21032b(C5203n0 c5203n0, Context context, C5550d c5550d, int i10, RecyclerView recyclerView) {
        AbstractC5868k.m23674f(c5203n0, "homeVodAdapter");
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        AbstractC5868k.m23674f(c5550d, "data");
        super.mo21032b(c5203n0, context, c5550d, i10, recyclerView);
        m21078i().setOnKeyListener(new View.OnKeyListener() { // from class: kd.v0
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i11, KeyEvent keyEvent) {
                boolean m21104u;
                m21104u = C5239w0.m21104u(view, i11, keyEvent);
                return m21104u;
            }
        });
        if (c5550d.m22503f()) {
            this.f21397f.m16618h();
        }
    }

    @Override // p212kd.C5231u0, p212kd.C5223s0
    /* renamed from: g */
    public void mo21077g(C5203n0 c5203n0, C5550d c5550d, List list) {
        int i10;
        AbstractC5868k.m23674f(c5203n0, "adappter");
        AbstractC5868k.m23674f(c5550d, "extra");
        super.mo21077g(c5203n0, c5550d, list);
        if (list != null) {
            i10 = list.size();
        } else {
            i10 = 0;
        }
        if (i10 >= 6) {
            PosterView posterView = this.f21397f;
            AbstractC5868k.m23671c(list);
            posterView.setRcmbData((RecommendList) list.get(5));
            m21079l(c5203n0, 6, this.f21397f, c5550d, (RecommendList) list.get(5));
            return;
        }
        this.f21397f.m16618h();
    }
}
