package p251n9;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import be.AbstractC1314j;
import be.C1328x;
import be.InterfaceC1312h;
import cc.C1466m0;
import com.mine.R$id;
import com.mine.R$layout;
import com.mine.R$string;
import com.module.event.UpdateRestrictStateEvent;
import com.request.result.UserInfo;
import com.zhy.autolayout.AutoFrameLayout;
import com.zhy.autolayout.AutoLinearLayout;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import me.InterfaceC5642a;
import me.InterfaceC5664p;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import org.greenrobot.eventbus.ThreadMode;
import p043ce.AbstractC1500l;
import p100d9.C4010v;
import p160h9.InterfaceC4741q;
import p160h9.InterfaceC4742r;
import p170i2.C4842a;
import p192j9.C5038u;
import ye.InterfaceC7719m;

/* renamed from: n9.b0 */
/* loaded from: classes.dex */
public final class C5772b0 extends AbstractC5774c<InterfaceC4741q> implements InterfaceC4742r {

    /* renamed from: C0 */
    private final InterfaceC1312h f23115C0;

    /* renamed from: D0 */
    private final InterfaceC1312h f23116D0;

    /* renamed from: E0 */
    private final InterfaceC1312h f23117E0;

    /* renamed from: F0 */
    private final InterfaceC1312h f23118F0;

    /* renamed from: G0 */
    private List f23119G0;

    /* renamed from: H0 */
    private C4010v f23120H0;

    /* renamed from: I0 */
    private int f23121I0;

    /* renamed from: J0 */
    private AbstractC5774c f23122J0;

    /* renamed from: K0 */
    public Map f23123K0 = new LinkedHashMap();

    /* renamed from: B0 */
    private boolean f23114B0 = true;

    /* renamed from: n9.b0$a */
    /* loaded from: classes2.dex */
    static final class a extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final a f23124a = new a();

        a() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ViewOnClickListenerC5800l invoke() {
            Bundle bundle = new Bundle();
            bundle.putBoolean("is_restricted", true);
            ViewOnClickListenerC5800l viewOnClickListenerC5800l = new ViewOnClickListenerC5800l();
            viewOnClickListenerC5800l.m3132V8(bundle);
            return viewOnClickListenerC5800l;
        }
    }

    /* renamed from: n9.b0$b */
    /* loaded from: classes2.dex */
    static final class b extends AbstractC5869l implements InterfaceC5642a {
        b() {
            super(0);
        }

        /* renamed from: a */
        public final void m23269a() {
            View childAt;
            RecyclerView recyclerView = (RecyclerView) C5772b0.this.m23266U9(R$id.recyclerView);
            if (recyclerView != null && (childAt = recyclerView.getChildAt(C5772b0.this.f23121I0)) != null) {
                childAt.requestFocus();
            }
        }

        @Override // me.InterfaceC5642a
        public /* bridge */ /* synthetic */ Object invoke() {
            m23269a();
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n9.b0$c */
    /* loaded from: classes2.dex */
    public static final class c extends AbstractC5869l implements InterfaceC5664p {
        c() {
            super(2);
        }

        /* renamed from: a */
        public final void m23270a(int i10, boolean z10) {
            C4010v c4010v = C5772b0.this.f23120H0;
            if (c4010v != null) {
                c4010v.m16948x(z10);
            }
            C5772b0.this.m23264fa(i10);
        }

        @Override // me.InterfaceC5664p
        /* renamed from: h */
        public /* bridge */ /* synthetic */ Object mo2391h(Object obj, Object obj2) {
            m23270a(((Number) obj).intValue(), ((Boolean) obj2).booleanValue());
            return C1328x.f4998a;
        }
    }

    /* renamed from: n9.b0$d */
    /* loaded from: classes2.dex */
    static final class d extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final d f23127a = new d();

        d() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ViewOnClickListenerC5800l invoke() {
            return new ViewOnClickListenerC5800l();
        }
    }

    /* renamed from: n9.b0$e */
    /* loaded from: classes2.dex */
    static final class e extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final e f23128a = new e();

        e() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ViewOnClickListenerC5820v invoke() {
            return new ViewOnClickListenerC5820v();
        }
    }

    /* renamed from: n9.b0$f */
    /* loaded from: classes2.dex */
    static final class f extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final f f23129a = new f();

        f() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ViewOnClickListenerC5779d1 invoke() {
            return new ViewOnClickListenerC5779d1();
        }
    }

    public C5772b0() {
        InterfaceC1312h m5965b;
        InterfaceC1312h m5965b2;
        InterfaceC1312h m5965b3;
        InterfaceC1312h m5965b4;
        m5965b = AbstractC1314j.m5965b(e.f23128a);
        this.f23115C0 = m5965b;
        m5965b2 = AbstractC1314j.m5965b(d.f23127a);
        this.f23116D0 = m5965b2;
        m5965b3 = AbstractC1314j.m5965b(f.f23129a);
        this.f23117E0 = m5965b3;
        m5965b4 = AbstractC1314j.m5965b(a.f23124a);
        this.f23118F0 = m5965b4;
    }

    /* renamed from: W0 */
    private final void m23255W0() {
        List m6989h;
        String str = null;
        List list;
        String string = m3154d7().getString(R$string.personal_recorde);
        AbstractC5868k.m23673e(string, "resources.getString(R.string.personal_recorde)");
        String string2 = m3154d7().getString(R$string.personal_my_collection);
        AbstractC5868k.m23673e(string2, "resources.getString(R.st…g.personal_my_collection)");
        String string3 = m3154d7().getString(R$string.personal_my_list);
        AbstractC5868k.m23673e(string3, "resources.getString(R.string.personal_my_list)");
        m6989h = AbstractC1500l.m6989h(string, string2, string3);
        this.f23119G0 = m6989h;
        UserInfo m6887v = C1466m0.f5627a.m6887v();
        if (m6887v != null) {
            str = m6887v.getRestrictedStatus();
        } else {
            str = null;
        }
        if (AbstractC5868k.m23669a(str, "1")) {
            C4842a c4842a = C4842a.f20329a;
            if ((c4842a.m19920a().m19931H() || c4842a.m19920a().mo19970s()) && (list = this.f23119G0) != null) {
                String string4 = m3154d7().getString(R$string.personal_my_favorite_adult);
                AbstractC5868k.m23673e(string4, "resources.getString(R.st…rsonal_my_favorite_adult)");
                list.add(string4);
            }
        }
        int i10 = R$id.recyclerView;
        RecyclerView recyclerView = (RecyclerView) m23266U9(i10);
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(m3107M8(), 0, false));
        }
        C4010v c4010v = new C4010v();
        this.f23120H0 = c4010v;
        c4010v.m28856n(this.f23119G0);
        RecyclerView recyclerView2 = (RecyclerView) m23266U9(i10);
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(this.f23120H0);
        }
        C4010v c4010v2 = this.f23120H0;
        if (c4010v2 != null) {
            c4010v2.m16947w(new c());
        }
        RecyclerView recyclerView3 = (RecyclerView) m23266U9(i10);
        if (recyclerView3 != null) {
            recyclerView3.post(new Runnable() { // from class: n9.a0
                @Override // java.lang.Runnable
                public final void run() {
                    C5772b0.m23263ea(C5772b0.this);
                }
            });
        }
    }

    /* renamed from: Y9 */
    private final ViewOnClickListenerC5800l m23258Y9() {
        return (ViewOnClickListenerC5800l) this.f23118F0.getValue();
    }

    /* renamed from: Z9 */
    private final ViewOnClickListenerC5800l m23259Z9() {
        return (ViewOnClickListenerC5800l) this.f23116D0.getValue();
    }

    /* renamed from: aa */
    private final ViewOnClickListenerC5820v m23260aa() {
        return (ViewOnClickListenerC5820v) this.f23115C0.getValue();
    }

    /* renamed from: ba */
    private final ViewOnClickListenerC5779d1 m23261ba() {
        return (ViewOnClickListenerC5779d1) this.f23117E0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: da */
    public static final void m23262da(C5772b0 c5772b0) {
        View view;
        AbstractC5868k.m23674f(c5772b0, "this$0");
        RecyclerView recyclerView = (RecyclerView) c5772b0.m23266U9(R$id.recyclerView);
        if (recyclerView != null) {
            view = recyclerView.getChildAt(c5772b0.f23121I0);
        } else {
            view = null;
        }
        if (view != null) {
            view.setSelected(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ea */
    public static final void m23263ea(C5772b0 c5772b0) {
        View view;
        AbstractC5868k.m23674f(c5772b0, "this$0");
        RecyclerView recyclerView = (RecyclerView) c5772b0.m23266U9(R$id.recyclerView);
        if (recyclerView != null) {
            view = recyclerView.getChildAt(0);
        } else {
            view = null;
        }
        if (view != null) {
            view.setSelected(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fa */
    public final void m23264fa(int i10) {
        if (this.f23121I0 != i10) {
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 == 3) {
                            this.f23122J0 = m23258Y9();
                        }
                    } else {
                        this.f23122J0 = m23261ba();
                    }
                } else {
                    this.f23122J0 = m23259Z9();
                }
            } else {
                this.f23122J0 = m23260aa();
            }
            AbstractC5774c abstractC5774c = this.f23122J0;
            if (abstractC5774c != null) {
                m3093I6().m3534m().m3644q(((AutoFrameLayout) m23266U9(R$id.fragmentContainer)).getId(), abstractC5774c).mo3228h();
            }
        }
        this.f23121I0 = i10;
    }

    @Override // ba.AbstractC1196d
    /* renamed from: A9 */
    public int mo5451A9() {
        return R$layout.fragment_my_list;
    }

    @Override // p251n9.AbstractC5774c
    /* renamed from: H9 */
    protected boolean mo23232H9() {
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        View childAt;
        RecyclerView recyclerView;
        AbstractC5774c abstractC5774c = this.f23122J0;
        if (abstractC5774c != null && abstractC5774c.mo23276M9()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && (recyclerView = (RecyclerView) m23266U9(R$id.recyclerView)) != null) {
            recyclerView.post(new Runnable() { // from class: n9.z
                @Override // java.lang.Runnable
                public final void run() {
                    C5772b0.m23262da(C5772b0.this);
                }
            });
        }
        AbstractC5774c abstractC5774c2 = this.f23122J0;
        if (abstractC5774c2 != null && abstractC5774c2.mo23276M9()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            RecyclerView recyclerView2 = (RecyclerView) m23266U9(R$id.recyclerView);
            if (recyclerView2 != null && (childAt = recyclerView2.getChildAt(0)) != null && childAt.hasFocus()) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (!z12) {
                return false;
            }
        }
        return true;
    }

    @Override // p251n9.AbstractC5774c
    /* renamed from: I9 */
    public boolean mo23265I9() {
        AbstractC5774c abstractC5774c = this.f23122J0;
        if (abstractC5774c == null || !abstractC5774c.mo23265I9()) {
            return false;
        }
        return true;
    }

    @Override // p251n9.AbstractC5774c
    /* renamed from: J9 */
    public boolean mo23244J9() {
        View view;
        AutoLinearLayout autoLinearLayout = (AutoLinearLayout) m23266U9(R$id.mRootLayout);
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
        AutoLinearLayout autoLinearLayout = (AutoLinearLayout) m23266U9(R$id.mRootLayout);
        if (autoLinearLayout == null || autoLinearLayout.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
    
        if (r5.isSelected() == true) goto L23;
     */
    @Override // p251n9.AbstractC5774c
    /* renamed from: O9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo23245O9() {
        /*
            r7 = this;
            int r0 = com.mine.R$id.recyclerView
            android.view.View r0 = r7.m23266U9(r0)
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            r1 = 0
            if (r0 == 0) goto L14
            android.view.View r0 = r0.getChildAt(r1)
            if (r0 == 0) goto L14
            r0.requestFocus()
        L14:
            java.util.List r0 = r7.f23119G0
            if (r0 == 0) goto L61
            java.util.Iterator r0 = r0.iterator()
            r2 = 0
        L1d:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L61
            java.lang.Object r3 = r0.next()
            int r4 = r2 + 1
            if (r2 >= 0) goto L2e
            p043ce.AbstractC1498j.m6972j()
        L2e:
            java.lang.String r3 = (java.lang.String) r3
            int r3 = com.mine.R$id.recyclerView
            android.view.View r5 = r7.m23266U9(r3)
            androidx.recyclerview.widget.RecyclerView r5 = (androidx.recyclerview.widget.RecyclerView) r5
            if (r5 == 0) goto L48
            android.view.View r5 = r5.getChildAt(r2)
            if (r5 == 0) goto L48
            boolean r5 = r5.isSelected()
            r6 = 1
            if (r5 != r6) goto L48
            goto L49
        L48:
            r6 = 0
        L49:
            if (r6 == 0) goto L5f
            android.view.View r3 = r7.m23266U9(r3)
            androidx.recyclerview.widget.RecyclerView r3 = (androidx.recyclerview.widget.RecyclerView) r3
            if (r3 == 0) goto L58
            android.view.View r2 = r3.getChildAt(r2)
            goto L59
        L58:
            r2 = 0
        L59:
            if (r2 != 0) goto L5c
            goto L5f
        L5c:
            r2.setSelected(r1)
        L5f:
            r2 = r4
            goto L1d
        L61:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p251n9.C5772b0.mo23245O9():void");
    }

    @Override // p251n9.AbstractC5774c, ba.AbstractC1196d, p430z9.AbstractC7765c, p164hd.AbstractC4817b, androidx.fragment.app.Fragment
    /* renamed from: S7 */
    public /* synthetic */ void mo3123S7() {
        super.mo3123S7();
        mo5459m9();
    }

    /* renamed from: U9 */
    public View m23266U9(int i10) {
        View findViewById;
        Map map = this.f23123K0;
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
    /* renamed from: ca, reason: merged with bridge method [inline-methods] */
    public InterfaceC4741q mo5465y9() {
        return new C5038u(this, this);
    }

    @Override // p251n9.AbstractC5774c, ba.AbstractC1196d, p430z9.AbstractC7765c
    /* renamed from: m9 */
    public void mo5459m9() {
        this.f23123K0.clear();
    }

    @Override // p430z9.AbstractC7765c
    /* renamed from: n9 */
    public void mo5460n9() {
        m23255W0();
        ViewOnClickListenerC5820v viewOnClickListenerC5820v = new ViewOnClickListenerC5820v();
        this.f23122J0 = viewOnClickListenerC5820v;
        m3093I6().m3534m().m3644q(((AutoFrameLayout) m23266U9(R$id.fragmentContainer)).getId(), viewOnClickListenerC5820v).mo3228h();
        m23279Q9(new b());
    }

    @Override // p251n9.AbstractC5774c
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        boolean z10 = false;
        boolean z11 = false;
        View view;
        boolean z12 = false;
        boolean z13 = false;
        AbstractC5868k.m23674f(keyEvent, "event");
        if (i10 == 4) {
            RecyclerView recyclerView = (RecyclerView) m23266U9(R$id.recyclerView);
            if (recyclerView != null && recyclerView.hasFocus()) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (!z12) {
                AbstractC5774c abstractC5774c = this.f23122J0;
                if (abstractC5774c != null) {
                    z13 = abstractC5774c.onKeyDown(i10, keyEvent);
                } else {
                    z13 = false;
                }
                if (z13) {
                    return true;
                }
            }
        }
        if (i10 == 20) {
            int i11 = R$id.recyclerView;
            RecyclerView recyclerView2 = (RecyclerView) m23266U9(i11);
            if (recyclerView2 != null && recyclerView2.hasFocus()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                AbstractC5774c abstractC5774c2 = this.f23122J0;
                if (abstractC5774c2 != null && !abstractC5774c2.mo23275K9()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    RecyclerView recyclerView3 = (RecyclerView) m23266U9(i11);
                    if (recyclerView3 != null) {
                        view = recyclerView3.getChildAt(this.f23121I0);
                    } else {
                        view = null;
                    }
                    if (view != null) {
                        view.setSelected(false);
                    }
                } else {
                    C4010v c4010v = this.f23120H0;
                    if (c4010v != null) {
                        c4010v.m16948x(true);
                    }
                    AbstractC5774c abstractC5774c3 = this.f23122J0;
                    if (abstractC5774c3 != null) {
                        abstractC5774c3.mo23277N9();
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

    @InterfaceC7719m(threadMode = ThreadMode.MAIN)
    public final void updateRestrictStateEvent(UpdateRestrictStateEvent updateRestrictStateEvent) {
        AbstractC5868k.m23674f(updateRestrictStateEvent, "event");
        m23255W0();
    }

    @Override // ba.AbstractC1196d
    /* renamed from: x9 */
    public boolean mo5464x9() {
        return this.f23114B0;
    }
}
