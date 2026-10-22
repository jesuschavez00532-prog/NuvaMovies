package p223l8;

import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import anet.channel.util.ErrorConstant;
import ba.AbstractC1196d;
import com.live.R$id;
import com.live.R$layout;
import com.module.view.LoadingView;
import com.request.result.Match;
import com.zhy.autolayout.AutoFrameLayout;
import com.zhy.autolayout.AutoLinearLayout;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import ne.AbstractC5864g;
import ne.AbstractC5868k;
import p028b8.C1152c0;
import p028b8.C1184u;
import p115e8.InterfaceC4149h;
import p115e8.InterfaceC4150i;
import p130f8.InterfaceC4290q;
import p130f8.InterfaceC4291r;
import p147g8.C4377l;
import p159h8.C4719z3;
import p433zd.AbstractC7786b;

/* renamed from: l8.m2 */
/* loaded from: classes2.dex */
public final class C5475m2 extends AbstractC1196d<InterfaceC4290q> implements InterfaceC4291r, InterfaceC4149h {

    /* renamed from: D0 */
    public static final a f22269D0 = new a(null);

    /* renamed from: A0 */
    private InterfaceC4150i f22270A0;

    /* renamed from: B0 */
    private boolean f22271B0;

    /* renamed from: C0 */
    public Map f22272C0 = new LinkedHashMap();

    /* renamed from: y0 */
    private Match f22273y0;

    /* renamed from: z0 */
    private C4377l f22274z0;

    /* renamed from: l8.m2$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC5864g abstractC5864g) {
            this();
        }

        /* renamed from: a */
        public final C5475m2 m22134a(C4377l c4377l, Match match) {
            AbstractC5868k.m23674f(c4377l, "matchDetail");
            AbstractC5868k.m23674f(match, "match");
            C5475m2 c5475m2 = new C5475m2();
            Bundle bundle = new Bundle();
            bundle.putSerializable("key_match_detail", c4377l);
            bundle.putSerializable("key_match", match);
            c5475m2.m3132V8(bundle);
            return c5475m2;
        }
    }

    /* renamed from: K9 */
    private final void m22128K9() {
        if (this.f22273y0 == null) {
            return;
        }
        int i10 = R$id.mRvRank;
        ((RecyclerView) m22131I9(i10)).setOnKeyListener(new View.OnKeyListener() { // from class: l8.k2
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i11, KeyEvent keyEvent) {
                boolean m22129L9;
                m22129L9 = C5475m2.m22129L9(C5475m2.this, view, i11, keyEvent);
                return m22129L9;
            }
        });
        ((RecyclerView) m22131I9(i10)).setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: l8.l2
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                C5475m2.m22130M9(C5475m2.this, view, z10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L9 */
    public static final boolean m22129L9(C5475m2 c5475m2, View view, int i10, KeyEvent keyEvent) {
        AbstractC5868k.m23674f(c5475m2, "this$0");
        if (keyEvent.getAction() == 0) {
            if (i10 != 4) {
                switch (i10) {
                    case 19:
                        int i11 = R$id.mRvRank;
                        if (((RecyclerView) c5475m2.m22131I9(i11)).canScrollVertically(-1)) {
                            ((RecyclerView) c5475m2.m22131I9(i11)).smoothScrollBy(0, ErrorConstant.ERROR_CONN_TIME_OUT);
                        } else {
                            InterfaceC4150i interfaceC4150i = c5475m2.f22270A0;
                            if (interfaceC4150i != null) {
                                interfaceC4150i.mo11506G();
                            }
                        }
                        return true;
                    case 20:
                        int i12 = R$id.mRvRank;
                        if (((RecyclerView) c5475m2.m22131I9(i12)).canScrollVertically(1)) {
                            ((RecyclerView) c5475m2.m22131I9(i12)).smoothScrollBy(0, 400);
                        }
                        return true;
                    case 21:
                    case 22:
                        return true;
                }
            }
            ((RecyclerView) c5475m2.m22131I9(R$id.mRvRank)).smoothScrollToPosition(0);
            InterfaceC4150i interfaceC4150i2 = c5475m2.f22270A0;
            if (interfaceC4150i2 != null) {
                interfaceC4150i2.mo11506G();
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M9 */
    public static final void m22130M9(C5475m2 c5475m2, View view, boolean z10) {
        AbstractC5868k.m23674f(c5475m2, "this$0");
        if (z10) {
            int i10 = R$id.mRvRank;
            ((RecyclerView) c5475m2.m22131I9(i10)).setScrollBarSize(AbstractC7786b.m30166j(6));
            ((RecyclerView) c5475m2.m22131I9(i10)).setScrollBarStyle(33554432);
        } else {
            int i11 = R$id.mRvRank;
            ((RecyclerView) c5475m2.m22131I9(i11)).setScrollBarSize(0);
            ((RecyclerView) c5475m2.m22131I9(i11)).setScrollBarStyle(33554432);
        }
    }

    @Override // ba.AbstractC1196d
    /* renamed from: A9 */
    public int mo5451A9() {
        return R$layout.frag_match_rank;
    }

    /* renamed from: I9 */
    public View m22131I9(int i10) {
        View findViewById;
        Map map = this.f22272C0;
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
    /* renamed from: J9, reason: merged with bridge method [inline-methods] */
    public InterfaceC4290q mo5465y9() {
        return new C4719z3(this, this);
    }

    @Override // p130f8.InterfaceC4291r
    /* renamed from: M */
    public void mo17947M(ArrayList arrayList) {
        AbstractC5868k.m23674f(arrayList, "ranks");
        ((AutoFrameLayout) m22131I9(R$id.mAflContent)).setVisibility(0);
        int i10 = R$id.mRvRank;
        ((RecyclerView) m22131I9(i10)).setVisibility(0);
        ((RecyclerView) m22131I9(i10)).setLayoutManager(new LinearLayoutManager(m3096J6()));
        Context m3107M8 = m3107M8();
        AbstractC5868k.m23673e(m3107M8, "requireContext()");
        C1184u c1184u = new C1184u(m3107M8);
        ((RecyclerView) m22131I9(i10)).setAdapter(c1184u);
        c1184u.m5427d(arrayList);
    }

    /* renamed from: N9 */
    public void m22133N9(InterfaceC4150i interfaceC4150i) {
        AbstractC5868k.m23674f(interfaceC4150i, "operateView");
        this.f22270A0 = interfaceC4150i;
    }

    @Override // ba.AbstractC1196d, p430z9.AbstractC7765c, p164hd.AbstractC4817b, androidx.fragment.app.Fragment
    /* renamed from: S7 */
    public /* synthetic */ void mo3123S7() {
        super.mo3123S7();
        mo5459m9();
    }

    @Override // p130f8.InterfaceC4291r
    /* renamed from: a */
    public void mo17948a() {
        ((LoadingView) m22131I9(R$id.mLoading)).setVisibility(0);
    }

    @Override // p130f8.InterfaceC4291r
    /* renamed from: b */
    public void mo17949b() {
        ((LoadingView) m22131I9(R$id.mLoading)).setVisibility(8);
    }

    @Override // p130f8.InterfaceC4291r
    /* renamed from: f */
    public Match mo17950f() {
        return this.f22273y0;
    }

    @Override // p115e8.InterfaceC4149h
    /* renamed from: f2 */
    public boolean mo17362f2() {
        int i10 = R$id.mRvRank;
        if (((RecyclerView) m22131I9(i10)).canScrollVertically(1) || ((RecyclerView) m22131I9(i10)).canScrollVertically(-1)) {
            ((RecyclerView) m22131I9(i10)).requestFocus();
            return false;
        }
        return false;
    }

    @Override // ba.AbstractC1196d, p430z9.AbstractC7765c
    /* renamed from: m9 */
    public void mo5459m9() {
        this.f22272C0.clear();
    }

    @Override // p430z9.AbstractC7765c
    /* renamed from: n9 */
    public void mo5460n9() {
        Serializable serializable;
        Bundle m3090H6 = m3090H6();
        Serializable serializable2 = null;
        if (m3090H6 != null) {
            serializable = m3090H6.getSerializable("key_match");
        } else {
            serializable = null;
        }
        this.f22273y0 = (Match) serializable;
        Bundle m3090H62 = m3090H6();
        if (m3090H62 != null) {
            serializable2 = m3090H62.getSerializable("key_match_detail");
        }
        this.f22274z0 = (C4377l) serializable2;
        m22128K9();
    }

    @Override // p130f8.InterfaceC4291r
    /* renamed from: o0 */
    public void mo17951o0() {
        ((AutoLinearLayout) m22131I9(R$id.mAllNoData)).setVisibility(0);
    }

    @Override // p430z9.AbstractC7765c
    /* renamed from: q9 */
    protected void mo5463q9() {
    }

    @Override // p130f8.InterfaceC4291r
    /* renamed from: t0 */
    public void mo17952t0(C1152c0 c1152c0) {
        AbstractC5868k.m23674f(c1152c0, "rank");
        m22131I9(R$id.mMatchDesc).setVisibility(8);
        int i10 = R$id.mRvRank;
        ViewGroup.LayoutParams layoutParams = ((RecyclerView) m22131I9(i10)).getLayoutParams();
        AbstractC5868k.m23672d(layoutParams, "null cannot be cast to non-null type com.zhy.autolayout.AutoFrameLayout.LayoutParams");
        AutoFrameLayout.C3910a c3910a = (AutoFrameLayout.C3910a) layoutParams;
        AutoFrameLayout.C3910a c3910a2 = new AutoFrameLayout.C3910a(((FrameLayout.LayoutParams) c3910a).width, ((FrameLayout.LayoutParams) c3910a).height + ((FrameLayout.LayoutParams) c3910a).topMargin);
        ((FrameLayout.LayoutParams) c3910a2).topMargin = 0;
        ((FrameLayout.LayoutParams) c3910a2).leftMargin = ((FrameLayout.LayoutParams) c3910a).leftMargin;
        ((FrameLayout.LayoutParams) c3910a2).rightMargin = ((FrameLayout.LayoutParams) c3910a).rightMargin;
        ((RecyclerView) m22131I9(i10)).setLayoutParams(c3910a2);
        if (((RecyclerView) m22131I9(i10)).getAdapter() == null) {
            ((AutoFrameLayout) m22131I9(R$id.mAflContent)).setVisibility(0);
            ((RecyclerView) m22131I9(i10)).setVisibility(0);
            ((RecyclerView) m22131I9(i10)).setLayoutManager(new LinearLayoutManager(m3096J6()));
            Context m3107M8 = m3107M8();
            AbstractC5868k.m23673e(m3107M8, "requireContext()");
            ((RecyclerView) m22131I9(i10)).setAdapter(new C1184u(m3107M8));
        }
        RecyclerView.AbstractC0789h adapter = ((RecyclerView) m22131I9(i10)).getAdapter();
        AbstractC5868k.m23672d(adapter, "null cannot be cast to non-null type com.live.adapter.MatchRankAdapter");
        ((C1184u) adapter).m5424a(c1152c0);
    }

    @Override // ba.AbstractC1196d
    /* renamed from: x9 */
    public boolean mo5464x9() {
        return this.f22271B0;
    }
}
