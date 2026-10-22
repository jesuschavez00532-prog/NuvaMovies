package p223l8;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import ba.AbstractC1196d;
import com.live.R$id;
import com.live.R$layout;
import com.live.view.LineUpView;
import com.module.view.LoadingView;
import com.request.result.LineupPlayer;
import com.request.result.Match;
import com.request.result.Team;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import ne.AbstractC5864g;
import ne.AbstractC5868k;
import p115e8.InterfaceC4149h;
import p115e8.InterfaceC4150i;
import p130f8.InterfaceC4286m;
import p130f8.InterfaceC4287n;
import p147g8.C4377l;
import p159h8.C4635l3;
import p237m8.C5608b;

/* renamed from: l8.g2 */
/* loaded from: classes2.dex */
public final class C5451g2 extends AbstractC1196d<InterfaceC4286m> implements InterfaceC4287n, InterfaceC4149h {

    /* renamed from: D0 */
    public static final a f22181D0 = new a(null);

    /* renamed from: A0 */
    private InterfaceC4150i f22182A0;

    /* renamed from: B0 */
    private boolean f22183B0;

    /* renamed from: C0 */
    public Map f22184C0 = new LinkedHashMap();

    /* renamed from: y0 */
    private Match f22185y0;

    /* renamed from: z0 */
    private C4377l f22186z0;

    /* renamed from: l8.g2$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC5864g abstractC5864g) {
            this();
        }

        /* renamed from: a */
        public final C5451g2 m22011a(C4377l c4377l, Match match) {
            AbstractC5868k.m23674f(c4377l, "matchDetail");
            AbstractC5868k.m23674f(match, "match");
            C5451g2 c5451g2 = new C5451g2();
            Bundle bundle = new Bundle();
            bundle.putSerializable("key_match_detail", c4377l);
            bundle.putSerializable("key_match", match);
            c5451g2.m3132V8(bundle);
            return c5451g2;
        }
    }

    /* renamed from: I9 */
    private final void m22007I9() {
        String str;
        Team team_b;
        String teamLogo;
        Team team_a;
        if (this.f22185y0 == null) {
            return;
        }
        TextView textView = (TextView) m22008G9(R$id.mTvVisitTeam);
        Match match = this.f22185y0;
        AbstractC5868k.m23671c(match);
        textView.setText(match.getTeam_a().getTeamName());
        C5608b c5608b = C5608b.f22632a;
        Context m3107M8 = m3107M8();
        AbstractC5868k.m23673e(m3107M8, "requireContext()");
        ImageView imageView = (ImageView) m22008G9(R$id.mIvVisitTeam);
        AbstractC5868k.m23673e(imageView, "mIvVisitTeam");
        Match match2 = this.f22185y0;
        String str2 = "";
        if (match2 == null || (team_a = match2.getTeam_a()) == null || (str = team_a.getTeamLogo()) == null) {
            str = "";
        }
        c5608b.m22780c(m3107M8, imageView, str);
        TextView textView2 = (TextView) m22008G9(R$id.mTvHomeTeam);
        Match match3 = this.f22185y0;
        AbstractC5868k.m23671c(match3);
        textView2.setText(match3.getTeam_b().getTeamName());
        Context m3107M82 = m3107M8();
        AbstractC5868k.m23673e(m3107M82, "requireContext()");
        ImageView imageView2 = (ImageView) m22008G9(R$id.mIvHomeTeam);
        AbstractC5868k.m23673e(imageView2, "mIvHomeTeam");
        Match match4 = this.f22185y0;
        if (match4 != null && (team_b = match4.getTeam_b()) != null && (teamLogo = team_b.getTeamLogo()) != null) {
            str2 = teamLogo;
        }
        c5608b.m22780c(m3107M82, imageView2, str2);
    }

    @Override // ba.AbstractC1196d
    /* renamed from: A9 */
    public int mo5451A9() {
        return R$layout.frag_match_line_up;
    }

    /* renamed from: G9 */
    public View m22008G9(int i10) {
        View findViewById;
        Map map = this.f22184C0;
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
    /* renamed from: H9, reason: merged with bridge method [inline-methods] */
    public InterfaceC4286m mo5465y9() {
        return new C4635l3(this, this);
    }

    /* renamed from: J9 */
    public void m22010J9(InterfaceC4150i interfaceC4150i) {
        AbstractC5868k.m23674f(interfaceC4150i, "operateView");
        this.f22182A0 = interfaceC4150i;
    }

    @Override // ba.AbstractC1196d, p430z9.AbstractC7765c, p164hd.AbstractC4817b, androidx.fragment.app.Fragment
    /* renamed from: S7 */
    public /* synthetic */ void mo3123S7() {
        super.mo3123S7();
        mo5459m9();
    }

    @Override // p130f8.InterfaceC4287n
    /* renamed from: T */
    public void mo17936T() {
        ((TextView) m22008G9(R$id.mTvHint)).setVisibility(0);
    }

    @Override // p130f8.InterfaceC4287n
    /* renamed from: a */
    public void mo17937a() {
        ((LoadingView) m22008G9(R$id.mLoading)).setVisibility(0);
    }

    @Override // p130f8.InterfaceC4287n
    /* renamed from: b */
    public void mo17938b() {
        ((LoadingView) m22008G9(R$id.mLoading)).setVisibility(8);
    }

    @Override // p130f8.InterfaceC4287n
    /* renamed from: f */
    public Match mo17939f() {
        return this.f22185y0;
    }

    @Override // p115e8.InterfaceC4149h
    /* renamed from: f2 */
    public boolean mo17362f2() {
        return false;
    }

    @Override // p130f8.InterfaceC4287n
    /* renamed from: i2 */
    public void mo17940i2(LineupPlayer lineupPlayer, List list, LineupPlayer lineupPlayer2, List list2) {
        AbstractC5868k.m23674f(lineupPlayer, "visitKeeper");
        AbstractC5868k.m23674f(list, "visitPlayers");
        AbstractC5868k.m23674f(lineupPlayer2, "homeKeeper");
        AbstractC5868k.m23674f(list2, "homePlayers");
        ((LineUpView) m22008G9(R$id.mLvLineUp)).m11582j(lineupPlayer, list, lineupPlayer2, list2);
    }

    @Override // ba.AbstractC1196d, p430z9.AbstractC7765c
    /* renamed from: m9 */
    public void mo5459m9() {
        this.f22184C0.clear();
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
        this.f22185y0 = (Match) serializable;
        Bundle m3090H62 = m3090H6();
        if (m3090H62 != null) {
            serializable2 = m3090H62.getSerializable("key_match_detail");
        }
        this.f22186z0 = (C4377l) serializable2;
        m22007I9();
    }

    @Override // p430z9.AbstractC7765c
    /* renamed from: q9 */
    protected void mo5463q9() {
    }

    @Override // ba.AbstractC1196d
    /* renamed from: x9 */
    public boolean mo5464x9() {
        return this.f22183B0;
    }
}
