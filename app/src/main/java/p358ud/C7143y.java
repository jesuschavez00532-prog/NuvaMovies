package p358ud;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import be.AbstractC1314j;
import be.InterfaceC1312h;
import com.bumptech.glide.ComponentCallbacks2C1586c;
import com.module.view.LoadingView;
import com.open.leanback.widget.AbstractC3057h;
import com.open.leanback.widget.VerticalGridView;
import com.request.result.PersonDetailInfo;
import com.vod.R$id;
import com.vod.R$layout;
import com.vod.R$string;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import me.InterfaceC5642a;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p212kd.C5229t2;
import p212kd.InterfaceC5152a1;
import p242n0.AbstractC5718e;
import p268od.InterfaceC5969e;
import p268od.InterfaceC5970f;
import p303qd.C6463d0;
import p317rb.AbstractC6567a;
import p399x9.C7531f;
import p400xa.AbstractC7555b0;
import p400xa.C7554b;
import p400xa.C7575i;
import p400xa.C7589m1;

/* renamed from: ud.y */
/* loaded from: classes3.dex */
public final class C7143y extends AbstractC7089d<InterfaceC5969e> implements InterfaceC5970f {

    /* renamed from: A0 */
    private int f26811A0;

    /* renamed from: B0 */
    private boolean f26812B0;

    /* renamed from: D0 */
    private TextView f26814D0;

    /* renamed from: E0 */
    private TextView f26815E0;

    /* renamed from: F0 */
    private ViewGroup f26816F0;

    /* renamed from: G0 */
    private InterfaceC7113l f26817G0;

    /* renamed from: H0 */
    private final InterfaceC1312h f26818H0;

    /* renamed from: I0 */
    private boolean f26819I0;

    /* renamed from: z0 */
    private boolean f26821z0;

    /* renamed from: J0 */
    public Map f26820J0 = new LinkedHashMap();

    /* renamed from: C0 */
    private String f26813C0 = "";

    /* renamed from: ud.y$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC5152a1 {
        a() {
        }

        @Override // p212kd.InterfaceC5152a1
        /* renamed from: a */
        public boolean mo20833a(View view, int i10, KeyEvent keyEvent, C7531f c7531f) {
            AbstractC5868k.m23674f(view, "v");
            AbstractC5868k.m23674f(keyEvent, "event");
            AbstractC5868k.m23674f(c7531f, "holder");
            int i11 = 5;
            if (keyEvent.getAction() == 0 && i10 == 22) {
                C7143y c7143y = C7143y.this;
                int i12 = R$id.mVgvShowResult;
                if (((VerticalGridView) c7143y.m27652J9(i12)).getSelectedPosition() + 1 == C7143y.this.m27650Q9().getItemCount()) {
                    new C7554b().m28941a(view).start();
                    return true;
                }
                if (c7531f.getAdapterPosition() % 5 == 4) {
                    ((VerticalGridView) C7143y.this.m27652J9(i12)).setSelectedPosition(c7531f.getAdapterPosition() + 1);
                    return true;
                }
                return false;
            }
            if (keyEvent.getAction() == 0 && i10 == 21) {
                if (c7531f.getAdapterPosition() % 5 == 0) {
                    InterfaceC7113l interfaceC7113l = C7143y.this.f26817G0;
                    if (interfaceC7113l != null) {
                        interfaceC7113l.mo16540F0();
                    }
                    return true;
                }
                return false;
            }
            if (keyEvent.getAction() == 0 && i10 == 20) {
                C7143y c7143y2 = C7143y.this;
                int i13 = R$id.mVgvShowResult;
                if (((VerticalGridView) c7143y2.m27652J9(i13)).getSelectedPosition() + 1 == C7143y.this.m27650Q9().getItemCount()) {
                    new C7554b().m28942b(view).start();
                    return true;
                }
                if (C7143y.this.f26811A0 > 0) {
                    int i14 = C7143y.this.f26811A0 % 5;
                    int i15 = C7143y.this.f26811A0;
                    if (i14 != 0) {
                        i11 = i14;
                    }
                    if (((VerticalGridView) C7143y.this.m27652J9(i13)).getSelectedPosition() >= i15 - i11) {
                        new C7554b().m28942b(view).start();
                        return true;
                    }
                    return false;
                }
                return false;
            }
            if (keyEvent.getAction() == 0 && i10 == 19 && ((VerticalGridView) C7143y.this.m27652J9(R$id.mVgvShowResult)).getSelectedPosition() < 5) {
                InterfaceC7113l interfaceC7113l2 = C7143y.this.f26817G0;
                if (interfaceC7113l2 != null) {
                    interfaceC7113l2.mo16541G();
                }
                return true;
            }
            return false;
        }

        @Override // p212kd.InterfaceC5152a1
        /* renamed from: b */
        public void mo20834b(PersonDetailInfo personDetailInfo, int i10) {
            AbstractC5868k.m23674f(personDetailInfo, "data");
            C7589m1.f27886a.m29157z(((InterfaceC5969e) C7143y.this.m5478w9()).mo24144F(), 2);
            if (personDetailInfo.getName() == null) {
                C7575i.f27835a.m29066b(((InterfaceC5969e) C7143y.this.m5478w9()).mo24144F(), "", "", i10 + 1);
            } else {
                C7575i c7575i = C7575i.f27835a;
                String mo24144F = ((InterfaceC5969e) C7143y.this.m5478w9()).mo24144F();
                String name = personDetailInfo.getName();
                AbstractC5868k.m23671c(name);
                c7575i.m29066b(mo24144F, "", name, i10 + 1);
            }
            InterfaceC7113l interfaceC7113l = C7143y.this.f26817G0;
            if (interfaceC7113l != null) {
                interfaceC7113l.mo16556p2(personDetailInfo);
            }
        }
    }

    /* renamed from: ud.y$b */
    /* loaded from: classes3.dex */
    public static final class b extends RecyclerView.AbstractC0802u {
        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0802u
        public void onScrollStateChanged(RecyclerView recyclerView, int i10) {
            AbstractC5868k.m23674f(recyclerView, "recyclerView");
            Context m3096J6 = C7143y.this.m3096J6();
            if (m3096J6 == null || AbstractC5718e.m23111a(m3096J6)) {
                return;
            }
            if (i10 != 0) {
                if (i10 == 1 || i10 == 2) {
                    ComponentCallbacks2C1586c.m7282u(m3096J6).m7390p();
                    return;
                }
                return;
            }
            ComponentCallbacks2C1586c.m7282u(m3096J6).m7391q();
        }
    }

    /* renamed from: ud.y$c */
    /* loaded from: classes3.dex */
    public static final class c extends AbstractC3057h {
        c() {
        }

        @Override // com.open.leanback.widget.AbstractC3057h
        /* renamed from: a */
        public void mo11995a(RecyclerView recyclerView, RecyclerView.AbstractC0787f0 abstractC0787f0, int i10, int i11) {
            int i12 = 0;
            super.mo11995a(recyclerView, abstractC0787f0, i10, i11);
            RecyclerView.AbstractC0789h adapter = ((VerticalGridView) C7143y.this.m27652J9(R$id.mVgvShowResult)).getAdapter();
            if (adapter != null) {
                i12 = adapter.getItemCount();
            } else {
                i12 = 0;
            }
            if (i12 < C7143y.this.f26811A0 && !C7143y.this.f26812B0 && i10 >= i12 - 10) {
                C7143y.this.f26812B0 = true;
                ((InterfaceC5969e) C7143y.this.m5478w9()).mo24146z();
            }
        }
    }

    /* renamed from: ud.y$d */
    /* loaded from: classes3.dex */
    static final class d extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final d f26825a = new d();

        d() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C5229t2 invoke() {
            return new C5229t2();
        }
    }

    public C7143y() {
        InterfaceC1312h m5965b;
        m5965b = AbstractC1314j.m5965b(d.f26825a);
        this.f26818H0 = m5965b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q9 */
    public final C5229t2 m27650Q9() {
        return (C5229t2) this.f26818H0.getValue();
    }

    /* renamed from: S9 */
    private final void m27651S9() {
        if (this.f26821z0) {
            return;
        }
        this.f26821z0 = true;
        m27650Q9().m21092w(new a());
        int i10 = R$id.mVgvShowResult;
        ((VerticalGridView) m27652J9(i10)).setItemAnimator(null);
        ((VerticalGridView) m27652J9(i10)).setAdapter(m27650Q9());
        VerticalGridView verticalGridView = (VerticalGridView) m27652J9(i10);
        AbstractC5868k.m23673e(verticalGridView, "mVgvShowResult");
        AbstractC7555b0.m28958l(verticalGridView, true, false, null, 6, null);
        ((VerticalGridView) m27652J9(i10)).addOnScrollListener(new b());
        ((VerticalGridView) m27652J9(i10)).setOnChildViewHolderSelectedListener(new c());
        if (AbstractC6567a.m25637g(this.f26813C0)) {
            mo27307I9(this.f26813C0);
            this.f26813C0 = "";
        }
    }

    @Override // ba.AbstractC1196d
    /* renamed from: A9 */
    public int mo5451A9() {
        return R$layout.frag_vod_director;
    }

    @Override // p358ud.AbstractC7089d
    /* renamed from: G9 */
    public void mo27305G9(TextView textView, TextView textView2) {
        AbstractC5868k.m23674f(textView, "navView");
        AbstractC5868k.m23674f(textView2, "numView");
        this.f26814D0 = textView;
        this.f26815E0 = textView2;
    }

    @Override // p358ud.AbstractC7089d
    /* renamed from: H9 */
    public boolean mo27306H9() {
        if (m27650Q9().getItemCount() > 0) {
            return ((VerticalGridView) m27652J9(R$id.mVgvShowResult)).requestFocus();
        }
        return false;
    }

    @Override // p358ud.AbstractC7089d
    /* renamed from: I9 */
    public void mo27307I9(String str) {
        AbstractC5868k.m23674f(str, "keyword");
        if (!m5472B9()) {
            this.f26813C0 = str;
        } else {
            ((InterfaceC5969e) m5478w9()).mo24145d(str);
        }
    }

    /* renamed from: J9 */
    public View m27652J9(int i10) {
        View findViewById;
        Map map = this.f26820J0;
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

    /* renamed from: P9 */
    public void m27653P9(InterfaceC7113l interfaceC7113l) {
        AbstractC5868k.m23674f(interfaceC7113l, "parent");
        this.f26817G0 = interfaceC7113l;
    }

    @Override // ba.AbstractC1196d
    /* renamed from: R9, reason: merged with bridge method [inline-methods] */
    public InterfaceC5969e mo5465y9() {
        return new C6463d0(this, this);
    }

    @Override // p268od.InterfaceC5970f
    /* renamed from: S */
    public void mo24147S() {
        TextView textView = this.f26815E0;
        if (textView != null) {
            textView.setText("");
        }
        m27650Q9().m28847d();
        ViewGroup viewGroup = this.f26816F0;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
    }

    @Override // p358ud.AbstractC7089d, ba.AbstractC1196d, p430z9.AbstractC7765c, p164hd.AbstractC4817b, androidx.fragment.app.Fragment
    /* renamed from: S7 */
    public /* synthetic */ void mo3123S7() {
        super.mo3123S7();
        mo5459m9();
    }

    @Override // p268od.InterfaceC5970f
    /* renamed from: a */
    public void mo24148a() {
        ((LoadingView) m27652J9(R$id.mLvLoading)).setVisibility(0);
    }

    @Override // p268od.InterfaceC5970f
    /* renamed from: b */
    public void mo24149b() {
        ((LoadingView) m27652J9(R$id.mLvLoading)).setVisibility(8);
    }

    @Override // p164hd.AbstractC4817b, androidx.fragment.app.Fragment
    /* renamed from: i8 */
    public void mo3170i8() {
        super.mo3170i8();
        m27651S9();
    }

    @Override // p268od.InterfaceC5970f
    /* renamed from: j */
    public void mo24150j(String str) {
        AbstractC5868k.m23674f(str, "errCode");
        this.f26812B0 = false;
        InterfaceC7113l interfaceC7113l = this.f26817G0;
        if (interfaceC7113l != null) {
            interfaceC7113l.mo16538D0(str);
        }
    }

    @Override // p268od.InterfaceC5970f
    /* renamed from: m */
    public void mo24151m() {
        this.f26812B0 = false;
        m27650Q9().m28847d();
        if (this.f26816F0 == null) {
            View inflate = ((ViewStub) m27652J9(R$id.mVsNoResult)).inflate();
            AbstractC5868k.m23672d(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
            this.f26816F0 = (ViewGroup) inflate;
        }
        ViewGroup viewGroup = this.f26816F0;
        AbstractC5868k.m23671c(viewGroup);
        viewGroup.setVisibility(0);
        TextView textView = this.f26815E0;
        if (textView != null) {
            textView.setText("(0)");
        }
        C7589m1.f27886a.m29126I(((InterfaceC5969e) m5478w9()).mo24144F(), 2);
    }

    @Override // p358ud.AbstractC7089d, ba.AbstractC1196d, p430z9.AbstractC7765c
    /* renamed from: m9 */
    public void mo5459m9() {
        this.f26820J0.clear();
    }

    @Override // p430z9.AbstractC7765c
    /* renamed from: n9 */
    public void mo5460n9() {
        TextView textView = this.f26814D0;
        if (textView != null) {
            textView.setText(m3107M8().getString(R$string.search_type_cast));
        }
    }

    @Override // p268od.InterfaceC5970f
    /* renamed from: o */
    public void mo24152o(List list) {
        AbstractC5868k.m23674f(list, "data");
        this.f26812B0 = false;
        m27650Q9().m28845b(list);
    }

    @Override // p430z9.AbstractC7765c
    /* renamed from: q9 */
    protected void mo5463q9() {
    }

    @Override // p268od.InterfaceC5970f
    /* renamed from: r */
    public void mo24153r(List list, int i10) {
        Object valueOf;
        AbstractC5868k.m23674f(list, "data");
        this.f26812B0 = false;
        m27650Q9().m28854l(list);
        this.f26811A0 = i10;
        TextView textView = this.f26815E0;
        if (textView != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('(');
            int i11 = this.f26811A0;
            if (i11 > 999) {
                valueOf = "999+";
            } else {
                valueOf = Integer.valueOf(i11);
            }
            sb2.append(valueOf);
            sb2.append(')');
            textView.setText(sb2.toString());
        }
    }

    @Override // ba.AbstractC1196d
    /* renamed from: x9 */
    public boolean mo5464x9() {
        return this.f26819I0;
    }
}
