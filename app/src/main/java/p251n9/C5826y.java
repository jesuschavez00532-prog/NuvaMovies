package p251n9;

import android.view.KeyEvent;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import be.AbstractC1314j;
import be.C1328x;
import be.InterfaceC1312h;
import com.mine.R$id;
import com.mine.R$layout;
import com.mine.R$string;
import com.zhy.autolayout.AutoFrameLayout;
import com.zhy.autolayout.AutoLinearLayout;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import me.InterfaceC5642a;
import me.InterfaceC5664p;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p043ce.AbstractC1500l;
import p100d9.C4010v;
import p160h9.InterfaceC4739o;
import p160h9.InterfaceC4740p;
import p192j9.C5037t;

/* renamed from: n9.y */
/* loaded from: classes2.dex */
public final class C5826y extends AbstractC5774c<InterfaceC4739o> implements InterfaceC4740p {

    /* renamed from: B0 */
    private boolean f23291B0;

    /* renamed from: C0 */
    private C4010v f23292C0;

    /* renamed from: D0 */
    private int f23293D0;

    /* renamed from: E0 */
    private AbstractC5774c f23294E0;

    /* renamed from: F0 */
    private List f23295F0;

    /* renamed from: G0 */
    private int f23296G0;

    /* renamed from: H0 */
    private final InterfaceC1312h f23297H0;

    /* renamed from: I0 */
    private final InterfaceC1312h f23298I0;

    /* renamed from: J0 */
    public Map f23299J0 = new LinkedHashMap();

    /* renamed from: n9.y$a */
    /* loaded from: classes2.dex */
    static final class a extends AbstractC5869l implements InterfaceC5664p {
        a() {
            super(2);
        }

        /* renamed from: a */
        public final void m23519a(int i10, boolean z10) {
            C4010v c4010v = C5826y.this.f23292C0;
            if (c4010v != null) {
                c4010v.m16948x(z10);
            }
            C5826y.this.f23296G0 = i10;
            C5826y.this.mo23280R9(i10, false);
        }

        @Override // me.InterfaceC5664p
        /* renamed from: h */
        public /* bridge */ /* synthetic */ Object mo2391h(Object obj, Object obj2) {
            m23519a(((Number) obj).intValue(), ((Boolean) obj2).booleanValue());
            return C1328x.f4998a;
        }
    }

    /* renamed from: n9.y$b */
    /* loaded from: classes2.dex */
    static final class b extends AbstractC5869l implements InterfaceC5642a {
        b() {
            super(0);
        }

        /* renamed from: a */
        public final void m23520a() {
            ((RecyclerView) C5826y.this.m23517U9(R$id.recyclerView)).getChildAt(C5826y.this.f23293D0).requestFocus();
        }

        @Override // me.InterfaceC5642a
        public /* bridge */ /* synthetic */ Object invoke() {
            m23520a();
            return C1328x.f4998a;
        }
    }

    /* renamed from: n9.y$c */
    /* loaded from: classes2.dex */
    static final class c extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final c f23302a = new c();

        c() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C5783f invoke() {
            return new C5783f();
        }
    }

    /* renamed from: n9.y$d */
    /* loaded from: classes2.dex */
    static final class d extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final d f23303a = new d();

        d() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C5817t0 invoke() {
            return new C5817t0();
        }
    }

    public C5826y() {
        InterfaceC1312h m5965b;
        InterfaceC1312h m5965b2;
        m5965b = AbstractC1314j.m5965b(d.f23303a);
        this.f23297H0 = m5965b;
        m5965b2 = AbstractC1314j.m5965b(c.f23302a);
        this.f23298I0 = m5965b2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y9 */
    public static final void m23513Y9(C5826y c5826y) {
        View view;
        AbstractC5868k.m23674f(c5826y, "this$0");
        RecyclerView recyclerView = (RecyclerView) c5826y.m23517U9(R$id.recyclerView);
        if (recyclerView != null) {
            view = recyclerView.getChildAt(0);
        } else {
            view = null;
        }
        if (view != null) {
            view.setSelected(true);
        }
    }

    /* renamed from: Z9 */
    private final C5783f m23514Z9() {
        return (C5783f) this.f23298I0.getValue();
    }

    /* renamed from: aa */
    private final C5817t0 m23515aa() {
        return (C5817t0) this.f23297H0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ca */
    public static final void m23516ca(C5826y c5826y) {
        View view;
        AbstractC5868k.m23674f(c5826y, "this$0");
        int i10 = R$id.recyclerView;
        RecyclerView recyclerView = (RecyclerView) c5826y.m23517U9(i10);
        View view2 = null;
        if (recyclerView != null) {
            view = recyclerView.getChildAt(1);
        } else {
            view = null;
        }
        if (view != null) {
            view.setSelected(true);
        }
        RecyclerView recyclerView2 = (RecyclerView) c5826y.m23517U9(i10);
        if (recyclerView2 != null) {
            view2 = recyclerView2.getChildAt(0);
        }
        if (view2 != null) {
            view2.setSelected(false);
        }
    }

    @Override // ba.AbstractC1196d
    /* renamed from: A9 */
    public int mo5451A9() {
        return R$layout.fragment_member_center;
    }

    @Override // p251n9.AbstractC5774c
    /* renamed from: H9 */
    protected boolean mo23232H9() {
        boolean z10 = false;
        boolean z11 = false;
        View childAt;
        AbstractC5774c abstractC5774c = this.f23294E0;
        if (abstractC5774c != null && abstractC5774c.mo23276M9()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            RecyclerView recyclerView = (RecyclerView) m23517U9(R$id.recyclerView);
            if (recyclerView != null && (childAt = recyclerView.getChildAt(0)) != null && childAt.hasFocus()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                return false;
            }
        }
        return true;
    }

    @Override // p251n9.AbstractC5774c
    /* renamed from: I9 */
    public boolean mo23265I9() {
        AbstractC5774c abstractC5774c = this.f23294E0;
        if (abstractC5774c == null || !abstractC5774c.mo23265I9()) {
            return false;
        }
        return true;
    }

    @Override // p251n9.AbstractC5774c
    /* renamed from: J9 */
    public boolean mo23244J9() {
        View view;
        AutoLinearLayout autoLinearLayout = (AutoLinearLayout) m23517U9(R$id.mRootLayout);
        if (autoLinearLayout != null) {
            view = autoLinearLayout.getFocusedChild();
        } else {
            view = null;
        }
        if (view != null) {
            return true;
        }
        return false;
    }

    @Override // p251n9.AbstractC5774c
    /* renamed from: L9 */
    public boolean mo23233L9() {
        AutoLinearLayout autoLinearLayout = (AutoLinearLayout) m23517U9(R$id.mRootLayout);
        if (autoLinearLayout == null || autoLinearLayout.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    @Override // p251n9.AbstractC5774c
    /* renamed from: O9 */
    public void mo23245O9() {
        View view;
        boolean z10 = false;
        View childAt;
        View childAt2;
        int i10 = R$id.recyclerView;
        RecyclerView recyclerView = (RecyclerView) m23517U9(i10);
        if (recyclerView != null && (childAt2 = recyclerView.getChildAt(0)) != null) {
            childAt2.requestFocus();
        }
        RecyclerView recyclerView2 = (RecyclerView) m23517U9(i10);
        View view2 = null;
        if (recyclerView2 != null) {
            view = recyclerView2.getChildAt(0);
        } else {
            view = null;
        }
        if (view != null) {
            view.setSelected(false);
        }
        RecyclerView recyclerView3 = (RecyclerView) m23517U9(i10);
        if (recyclerView3 != null && (childAt = recyclerView3.getChildAt(1)) != null && childAt.isSelected()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            RecyclerView recyclerView4 = (RecyclerView) m23517U9(i10);
            if (recyclerView4 != null) {
                view2 = recyclerView4.getChildAt(1);
            }
            if (view2 != null) {
                view2.setSelected(false);
            }
        }
    }

    @Override // p251n9.AbstractC5774c
    /* renamed from: R9 */
    public void mo23280R9(int i10, boolean z10) {
        View view;
        View childAt;
        if (this.f23293D0 == i10) {
            return;
        }
        if (i10 != 0) {
            if (i10 == 1) {
                this.f23294E0 = m23514Z9();
            }
        } else {
            this.f23294E0 = m23515aa();
        }
        AbstractC5774c abstractC5774c = this.f23294E0;
        if (abstractC5774c != null) {
            m3093I6().m3534m().m3644q(((AutoFrameLayout) m23517U9(R$id.fragmentContainer)).getId(), abstractC5774c).mo3228h();
        }
        this.f23293D0 = i10;
        if (z10) {
            if (i10 == 0) {
                int i11 = R$id.recyclerView;
                RecyclerView recyclerView = (RecyclerView) m23517U9(i11);
                if (recyclerView != null && (childAt = recyclerView.getChildAt(0)) != null) {
                    childAt.requestFocus();
                }
                RecyclerView recyclerView2 = (RecyclerView) m23517U9(i11);
                if (recyclerView2 != null) {
                    view = recyclerView2.getChildAt(1);
                } else {
                    view = null;
                }
                if (view != null) {
                    view.setSelected(false);
                    return;
                }
                return;
            }
            RecyclerView recyclerView3 = (RecyclerView) m23517U9(R$id.recyclerView);
            if (recyclerView3 != null) {
                recyclerView3.post(new Runnable() { // from class: n9.x
                    @Override // java.lang.Runnable
                    public final void run() {
                        C5826y.m23516ca(C5826y.this);
                    }
                });
            }
        }
    }

    @Override // p251n9.AbstractC5774c, ba.AbstractC1196d, p430z9.AbstractC7765c, p164hd.AbstractC4817b, androidx.fragment.app.Fragment
    /* renamed from: S7 */
    public /* synthetic */ void mo3123S7() {
        super.mo3123S7();
        mo5459m9();
    }

    /* renamed from: U9 */
    public View m23517U9(int i10) {
        View findViewById;
        Map map = this.f23299J0;
        View view = (View) map.get(Integer.valueOf(i10));
        if (view != null) {
            return view;
        }
        View m3182n7 = m3182n7();
        if (m3182n7 == null || (findViewById = m3182n7.findViewById(i10)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i10), findViewById);
        return findViewById;
    }

    @Override // ba.AbstractC1196d
    /* renamed from: ba, reason: merged with bridge method [inline-methods] */
    public InterfaceC4739o mo5465y9() {
        return new C5037t(this, this);
    }

    @Override // p251n9.AbstractC5774c, ba.AbstractC1196d, p430z9.AbstractC7765c
    /* renamed from: m9 */
    public void mo5459m9() {
        this.f23299J0.clear();
    }

    @Override // p430z9.AbstractC7765c
    /* renamed from: n9 */
    public void mo5460n9() {
        List m6989h;
        String string = m3154d7().getString(R$string.personal_package_charge);
        AbstractC5868k.m23673e(string, "resources.getString(R.st….personal_package_charge)");
        String string2 = m3154d7().getString(R$string.coupons_center);
        AbstractC5868k.m23673e(string2, "resources.getString(R.string.coupons_center)");
        m6989h = AbstractC1500l.m6989h(string, string2);
        this.f23295F0 = m6989h;
        int i10 = R$id.recyclerView;
        RecyclerView recyclerView = (RecyclerView) m23517U9(i10);
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(m3107M8(), 0, false));
        }
        C4010v c4010v = new C4010v();
        this.f23292C0 = c4010v;
        c4010v.m28856n(this.f23295F0);
        RecyclerView recyclerView2 = (RecyclerView) m23517U9(i10);
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(this.f23292C0);
        }
        C4010v c4010v2 = this.f23292C0;
        if (c4010v2 != null) {
            c4010v2.m16947w(new a());
        }
        RecyclerView recyclerView3 = (RecyclerView) m23517U9(i10);
        if (recyclerView3 != null) {
            recyclerView3.post(new Runnable() { // from class: n9.w
                @Override // java.lang.Runnable
                public final void run() {
                    C5826y.m23513Y9(C5826y.this);
                }
            });
        }
        C5817t0 m23515aa = m23515aa();
        this.f23294E0 = m23515aa;
        if (m23515aa != null) {
            m3093I6().m3534m().m3644q(((AutoFrameLayout) m23517U9(R$id.fragmentContainer)).getId(), m23515aa).mo3228h();
        }
        m23279Q9(new b());
    }

    @Override // p251n9.AbstractC5774c
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        boolean z10 = false;
        boolean z11 = false;
        AbstractC5868k.m23674f(keyEvent, "event");
        if (i10 == 22 && !((RecyclerView) m23517U9(R$id.recyclerView)).hasFocus()) {
            AbstractC5774c abstractC5774c = this.f23294E0;
            if (abstractC5774c != null) {
                z11 = abstractC5774c.onKeyDown(i10, keyEvent);
            } else {
                z11 = false;
            }
            if (z11) {
                return true;
            }
        }
        if (i10 == 20) {
            int i11 = R$id.recyclerView;
            if (((RecyclerView) m23517U9(i11)).hasFocus()) {
                AbstractC5774c abstractC5774c2 = this.f23294E0;
                if (abstractC5774c2 != null && abstractC5774c2.mo23233L9()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    C4010v c4010v = this.f23292C0;
                    if (c4010v != null) {
                        c4010v.m16948x(true);
                    }
                    AbstractC5774c abstractC5774c3 = this.f23294E0;
                    if (abstractC5774c3 != null) {
                        abstractC5774c3.mo23277N9();
                    }
                } else {
                    C4010v c4010v2 = this.f23292C0;
                    if (c4010v2 != null) {
                        c4010v2.m16948x(false);
                    }
                    View childAt = ((RecyclerView) m23517U9(i11)).getChildAt(this.f23293D0);
                    if (childAt != null) {
                        childAt.setSelected(false);
                    }
                }
                return true;
            }
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // p430z9.AbstractC7765c
    /* renamed from: q9 */
    protected void mo5463q9() {
    }

    @Override // ba.AbstractC1196d
    /* renamed from: x9 */
    public boolean mo5464x9() {
        return this.f23291B0;
    }
}
