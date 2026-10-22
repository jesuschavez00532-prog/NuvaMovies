package p102db;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import be.AbstractC1314j;
import be.C1328x;
import be.InterfaceC1312h;
import com.module.R$id;
import com.module.R$layout;
import com.request.result.SameSeasonSeriesBean;
import com.umeng.analytics.pro.C3384f;
import java.util.List;
import me.InterfaceC5642a;
import me.InterfaceC5660l;
import me.InterfaceC5664p;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p399x9.C7541p;

/* renamed from: db.y0 */
/* loaded from: classes2.dex */
public final class C4088y0 extends PopupWindow {

    /* renamed from: a */
    private RecyclerView f17980a;

    /* renamed from: b */
    private final InterfaceC1312h f17981b;

    /* renamed from: db.y0$a */
    /* loaded from: classes2.dex */
    static final class a extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final a f17982a = new a();

        a() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C7541p invoke() {
            return new C7541p();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: db.y0$b */
    /* loaded from: classes2.dex */
    public static final class b extends AbstractC5869l implements InterfaceC5664p {

        /* renamed from: b */
        final /* synthetic */ InterfaceC5660l f17984b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC5660l interfaceC5660l) {
            super(2);
            this.f17984b = interfaceC5660l;
        }

        /* renamed from: a */
        public final void m17123a(SameSeasonSeriesBean sameSeasonSeriesBean, boolean z10) {
            InterfaceC5660l interfaceC5660l;
            AbstractC5868k.m23674f(sameSeasonSeriesBean, "item");
            C4088y0.this.dismiss();
            if (!z10 && (interfaceC5660l = this.f17984b) != null) {
                interfaceC5660l.mo542f(sameSeasonSeriesBean);
            }
        }

        @Override // me.InterfaceC5664p
        /* renamed from: h */
        public /* bridge */ /* synthetic */ Object mo2391h(Object obj, Object obj2) {
            m17123a((SameSeasonSeriesBean) obj, ((Boolean) obj2).booleanValue());
            return C1328x.f4998a;
        }
    }

    public C4088y0(Context context) {
        InterfaceC1312h m5965b;
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        m5965b = AbstractC1314j.m5965b(a.f17982a);
        this.f17981b = m5965b;
        View inflate = LayoutInflater.from(context).inflate(R$layout.pop_select_season, (ViewGroup) null);
        setContentView(inflate);
        setFocusable(true);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R$id.mVgSelectList);
        this.f17980a = recyclerView;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(context));
        }
        RecyclerView recyclerView2 = this.f17980a;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(m17120b());
        }
        setBackgroundDrawable(new ColorDrawable(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static final void m17119d(ObjectAnimator objectAnimator) {
        objectAnimator.reverse();
    }

    /* renamed from: b */
    public final C7541p m17120b() {
        return (C7541p) this.f17981b.getValue();
    }

    /* renamed from: c */
    public final void m17121c(View view, List list, int i10, View view2, InterfaceC5660l interfaceC5660l) {
        AbstractC5868k.m23674f(view, "view");
        AbstractC5868k.m23674f(view2, "arrow");
        if (list == null) {
            return;
        }
        setWidth(view.getMeasuredWidth());
        setHeight(-2);
        m17120b().m28902v(i10);
        final ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, "Rotation", 0.0f, 180.0f);
        ofFloat.setDuration(500L);
        ofFloat.start();
        setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: db.x0
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                C4088y0.m17119d(ofFloat);
            }
        });
        m17120b().m28854l(list);
        m17120b().m28901u(new b(interfaceC5660l));
        showAsDropDown(view);
    }
}
