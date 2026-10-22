package p223l8;

import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import anet.channel.util.ErrorConstant;
import ba.AbstractC1196d;
import com.live.R$id;
import com.live.R$layout;
import com.module.view.LoadingView;
import com.request.result.Match;
import com.request.result.Team;
import com.zhy.autolayout.AutoLinearLayout;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import ne.AbstractC5864g;
import ne.AbstractC5868k;
import p028b8.C1182s;
import p115e8.InterfaceC4149h;
import p115e8.InterfaceC4150i;
import p130f8.InterfaceC4284k;
import p130f8.InterfaceC4285l;
import p147g8.C4377l;
import p159h8.C4629k3;
import p237m8.C5608b;
import p433zd.AbstractC7786b;

/* renamed from: l8.f2 */
/* loaded from: classes2.dex */
public final class C5447f2 extends AbstractC1196d<InterfaceC4284k> implements InterfaceC4285l, InterfaceC4149h {

    /* renamed from: D0 */
    public static final a f22172D0 = new a(null);

    /* renamed from: A0 */
    private InterfaceC4150i f22173A0;

    /* renamed from: B0 */
    private boolean f22174B0;

    /* renamed from: C0 */
    public Map f22175C0 = new LinkedHashMap();

    /* renamed from: y0 */
    private Match f22176y0;

    /* renamed from: z0 */
    private C4377l f22177z0;

    /* renamed from: l8.f2$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC5864g abstractC5864g) {
            this();
        }

        /* renamed from: a */
        public final C5447f2 m22006a(C4377l c4377l, Match match) {
            AbstractC5868k.m23674f(c4377l, "matchDetail");
            AbstractC5868k.m23674f(match, "match");
            C5447f2 c5447f2 = new C5447f2();
            Bundle bundle = new Bundle();
            bundle.putSerializable("key_match_detail", c4377l);
            bundle.putSerializable("key_match", match);
            c5447f2.m3132V8(bundle);
            return c5447f2;
        }
    }

    /* renamed from: K9 */
    private final void m22000K9() {
        String str;
        Team team_b;
        String teamLogo;
        Team team_a;
        if (this.f22176y0 == null) {
            return;
        }
        TextView textView = (TextView) m22003I9(R$id.mTvVisitTeam);
        Match match = this.f22176y0;
        AbstractC5868k.m23671c(match);
        textView.setText(match.getTeam_a().getTeamName());
        C5608b c5608b = C5608b.f22632a;
        Context m3107M8 = m3107M8();
        AbstractC5868k.m23673e(m3107M8, "requireContext()");
        ImageView imageView = (ImageView) m22003I9(R$id.mIvVisitTeam);
        AbstractC5868k.m23673e(imageView, "mIvVisitTeam");
        Match match2 = this.f22176y0;
        String str2 = "";
        if (match2 == null || (team_a = match2.getTeam_a()) == null || (str = team_a.getTeamLogo()) == null) {
            str = "";
        }
        c5608b.m22780c(m3107M8, imageView, str);
        TextView textView2 = (TextView) m22003I9(R$id.mTvHomeTeam);
        Match match3 = this.f22176y0;
        AbstractC5868k.m23671c(match3);
        textView2.setText(match3.getTeam_b().getTeamName());
        Context m3107M82 = m3107M8();
        AbstractC5868k.m23673e(m3107M82, "requireContext()");
        ImageView imageView2 = (ImageView) m22003I9(R$id.mIvHomeTeam);
        AbstractC5868k.m23673e(imageView2, "mIvHomeTeam");
        Match match4 = this.f22176y0;
        if (match4 != null && (team_b = match4.getTeam_b()) != null && (teamLogo = team_b.getTeamLogo()) != null) {
            str2 = teamLogo;
        }
        c5608b.m22780c(m3107M82, imageView2, str2);
        int i10 = R$id.mEventInfoWrapper;
        ((AutoLinearLayout) m22003I9(i10)).setOnKeyListener(new View.OnKeyListener() { // from class: l8.d2
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i11, KeyEvent keyEvent) {
                boolean m22001L9;
                m22001L9 = C5447f2.m22001L9(C5447f2.this, view, i11, keyEvent);
                return m22001L9;
            }
        });
        ((AutoLinearLayout) m22003I9(i10)).setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: l8.e2
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                C5447f2.m22002M9(C5447f2.this, view, z10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L9 */
    public static final boolean m22001L9(C5447f2 c5447f2, View view, int i10, KeyEvent keyEvent) {
        AbstractC5868k.m23674f(c5447f2, "this$0");
        if (keyEvent.getAction() == 0) {
            switch (i10) {
                case 19:
                    InterfaceC4150i interfaceC4150i = c5447f2.f22173A0;
                    if (interfaceC4150i != null) {
                        interfaceC4150i.mo11506G();
                    }
                    return true;
                case 21:
                    ((RecyclerView) c5447f2.m22003I9(R$id.mRvMatchEvent)).smoothScrollBy(ErrorConstant.ERROR_CONN_TIME_OUT, 0);
                case 20:
                    return true;
                case 22:
                    ((RecyclerView) c5447f2.m22003I9(R$id.mRvMatchEvent)).smoothScrollBy(400, 0);
                    return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M9 */
    public static final void m22002M9(C5447f2 c5447f2, View view, boolean z10) {
        AbstractC5868k.m23674f(c5447f2, "this$0");
        if (z10) {
            ((RecyclerView) c5447f2.m22003I9(R$id.mRvMatchEvent)).setScrollBarSize(AbstractC7786b.m30166j(9));
        } else {
            ((RecyclerView) c5447f2.m22003I9(R$id.mRvMatchEvent)).setScrollBarSize(0);
        }
        ((RecyclerView) c5447f2.m22003I9(R$id.mRvMatchEvent)).smoothScrollBy(1, 0);
    }

    @Override // ba.AbstractC1196d
    /* renamed from: A9 */
    public int mo5451A9() {
        return R$layout.frag_match_detail_nav;
    }

    @Override // p130f8.InterfaceC4285l
    /* renamed from: H2 */
    public void mo17931H2(ArrayList arrayList, ArrayList arrayList2) {
        AbstractC5868k.m23674f(arrayList, "visitTeamEvent");
        AbstractC5868k.m23674f(arrayList2, "homeTeamEvent");
        int i10 = R$id.mRvMatchEvent;
        ((RecyclerView) m22003I9(i10)).setVisibility(0);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(m3107M8());
        linearLayoutManager.setOrientation(0);
        ((RecyclerView) m22003I9(i10)).setLayoutManager(linearLayoutManager);
        C1182s c1182s = new C1182s();
        c1182s.m5422a(arrayList, arrayList2);
        ((RecyclerView) m22003I9(i10)).setAdapter(c1182s);
    }

    /* renamed from: I9 */
    public View m22003I9(int i10) {
        View findViewById;
        Map map = this.f22175C0;
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
    public InterfaceC4284k mo5465y9() {
        return new C4629k3(this, this);
    }

    /* renamed from: N9 */
    public void m22005N9(InterfaceC4150i interfaceC4150i) {
        AbstractC5868k.m23674f(interfaceC4150i, "operateView");
        this.f22173A0 = interfaceC4150i;
    }

    @Override // ba.AbstractC1196d, p430z9.AbstractC7765c, p164hd.AbstractC4817b, androidx.fragment.app.Fragment
    /* renamed from: S7 */
    public /* synthetic */ void mo3123S7() {
        super.mo3123S7();
        mo5459m9();
    }

    @Override // p130f8.InterfaceC4285l
    /* renamed from: T */
    public void mo17932T() {
        ((TextView) m22003I9(R$id.mTvHint)).setVisibility(0);
    }

    @Override // p130f8.InterfaceC4285l
    /* renamed from: a */
    public void mo17933a() {
        ((LoadingView) m22003I9(R$id.mLoading)).setVisibility(0);
    }

    @Override // p130f8.InterfaceC4285l
    /* renamed from: b */
    public void mo17934b() {
        ((LoadingView) m22003I9(R$id.mLoading)).setVisibility(8);
    }

    @Override // p130f8.InterfaceC4285l
    /* renamed from: f */
    public Match mo17935f() {
        return this.f22176y0;
    }

    @Override // p115e8.InterfaceC4149h
    /* renamed from: f2 */
    public boolean mo17362f2() {
        int i10;
        RecyclerView.AbstractC0789h adapter = ((RecyclerView) m22003I9(R$id.mRvMatchEvent)).getAdapter();
        if (adapter != null) {
            i10 = adapter.getItemCount();
        } else {
            i10 = 0;
        }
        if (i10 > 0) {
            ((AutoLinearLayout) m22003I9(R$id.mEventInfoWrapper)).requestFocus();
            return true;
        }
        return true;
    }

    @Override // ba.AbstractC1196d, p430z9.AbstractC7765c
    /* renamed from: m9 */
    public void mo5459m9() {
        this.f22175C0.clear();
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
        this.f22176y0 = (Match) serializable;
        Bundle m3090H62 = m3090H6();
        if (m3090H62 != null) {
            serializable2 = m3090H62.getSerializable("key_match_detail");
        }
        this.f22177z0 = (C4377l) serializable2;
        m22000K9();
    }

    @Override // p430z9.AbstractC7765c
    /* renamed from: q9 */
    protected void mo5463q9() {
    }

    @Override // ba.AbstractC1196d
    /* renamed from: x9 */
    public boolean mo5464x9() {
        return this.f22174B0;
    }
}
