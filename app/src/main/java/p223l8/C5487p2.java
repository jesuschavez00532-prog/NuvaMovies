package p223l8;

import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import ba.AbstractC1196d;
import com.live.R$id;
import com.live.R$layout;
import com.live.view.match.MatchDataStat;
import com.live.view.match.MatchPercentStat;
import com.module.view.LoadingView;
import com.request.result.HistoryStat;
import com.request.result.Match;
import com.request.result.Team;
import com.zhy.autolayout.AutoLinearLayout;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import ne.AbstractC5864g;
import ne.AbstractC5868k;
import p043ce.AbstractC1500l;
import p115e8.InterfaceC4149h;
import p115e8.InterfaceC4150i;
import p130f8.InterfaceC4292s;
import p130f8.InterfaceC4293t;
import p147g8.C4377l;
import p159h8.C4569a4;
import p237m8.C5608b;
import p433zd.AbstractC7786b;

/* renamed from: l8.p2 */
/* loaded from: classes2.dex */
public final class C5487p2 extends AbstractC1196d<InterfaceC4292s> implements InterfaceC4293t, InterfaceC4149h {

    /* renamed from: F0 */
    public static final a f22286F0 = new a(null);

    /* renamed from: A0 */
    private Match f22287A0;

    /* renamed from: B0 */
    private C4377l f22288B0;

    /* renamed from: C0 */
    private InterfaceC4150i f22289C0;

    /* renamed from: D0 */
    private boolean f22290D0;

    /* renamed from: E0 */
    public Map f22291E0 = new LinkedHashMap();

    /* renamed from: y0 */
    private boolean f22292y0;

    /* renamed from: z0 */
    private boolean f22293z0;

    /* renamed from: l8.p2$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC5864g abstractC5864g) {
            this();
        }

        /* renamed from: a */
        public final C5487p2 m22144a(C4377l c4377l, Match match) {
            AbstractC5868k.m23674f(c4377l, "matchDetail");
            AbstractC5868k.m23674f(match, "match");
            C5487p2 c5487p2 = new C5487p2();
            Bundle bundle = new Bundle();
            bundle.putSerializable("key_match_detail", c4377l);
            bundle.putSerializable("key_match", match);
            c5487p2.m3132V8(bundle);
            return c5487p2;
        }
    }

    /* renamed from: K9 */
    private final void m22137K9() {
        if (this.f22287A0 == null) {
            return;
        }
        int i10 = R$id.mSvStat;
        ((ScrollView) m22141I9(i10)).setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: l8.n2
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                C5487p2.m22138L9(C5487p2.this, view, z10);
            }
        });
        ((ScrollView) m22141I9(i10)).setOnKeyListener(new View.OnKeyListener() { // from class: l8.o2
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i11, KeyEvent keyEvent) {
                boolean m22139M9;
                m22139M9 = C5487p2.m22139M9(C5487p2.this, view, i11, keyEvent);
                return m22139M9;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L9 */
    public static final void m22138L9(C5487p2 c5487p2, View view, boolean z10) {
        AbstractC5868k.m23674f(c5487p2, "this$0");
        if (z10) {
            int i10 = R$id.mSvStat;
            ((ScrollView) c5487p2.m22141I9(i10)).setScrollBarSize(AbstractC7786b.m30166j(36));
            ((ScrollView) c5487p2.m22141I9(i10)).setScrollBarStyle(33554432);
        } else {
            int i11 = R$id.mSvStat;
            ((ScrollView) c5487p2.m22141I9(i11)).setScrollBarSize(0);
            ((ScrollView) c5487p2.m22141I9(i11)).setScrollBarStyle(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M9 */
    public static final boolean m22139M9(C5487p2 c5487p2, View view, int i10, KeyEvent keyEvent) {
        AbstractC5868k.m23674f(c5487p2, "this$0");
        if (keyEvent.getAction() == 0) {
            if (i10 != 4) {
                switch (i10) {
                    case 19:
                        if (!((ScrollView) c5487p2.m22141I9(R$id.mSvStat)).canScrollVertically(-1)) {
                            InterfaceC4150i interfaceC4150i = c5487p2.f22289C0;
                            if (interfaceC4150i != null) {
                                interfaceC4150i.mo11506G();
                            }
                            return true;
                        }
                        return false;
                    case 20:
                        if (!((ScrollView) c5487p2.m22141I9(R$id.mSvStat)).canScrollVertically(1)) {
                            return true;
                        }
                        return false;
                    case 21:
                    case 22:
                        return true;
                    default:
                        return false;
                }
            }
            ((ScrollView) c5487p2.m22141I9(R$id.mSvStat)).fullScroll(33);
            InterfaceC4150i interfaceC4150i2 = c5487p2.f22289C0;
            if (interfaceC4150i2 != null) {
                interfaceC4150i2.mo11506G();
            }
            return true;
        }
        return false;
    }

    /* renamed from: O9 */
    private final void m22140O9(ImageView imageView, String str, String str2, String str3, String str4, String str5) {
        if (AbstractC5868k.m23669a(str, str2)) {
            C5608b c5608b = C5608b.f22632a;
            Context m3107M8 = m3107M8();
            AbstractC5868k.m23673e(m3107M8, "requireContext()");
            c5608b.m22780c(m3107M8, imageView, str3);
            return;
        }
        if (AbstractC5868k.m23669a(str, str4)) {
            C5608b c5608b2 = C5608b.f22632a;
            Context m3107M82 = m3107M8();
            AbstractC5868k.m23673e(m3107M82, "requireContext()");
            c5608b2.m22780c(m3107M82, imageView, str5);
        }
    }

    @Override // p130f8.InterfaceC4293t
    /* renamed from: A5 */
    public void mo17953A5(ArrayList arrayList) {
        AbstractC5868k.m23674f(arrayList, "dataStats");
        if (!this.f22292y0) {
            ((ViewStub) m22141I9(R$id.mVbMatchStatistics)).inflate();
            this.f22292y0 = true;
        }
        ((MatchDataStat) m22141I9(R$id.mMdsDataStat)).setDataStats(arrayList);
    }

    @Override // ba.AbstractC1196d
    /* renamed from: A9 */
    public int mo5451A9() {
        return R$layout.frag_match_stat;
    }

    /* renamed from: I9 */
    public View m22141I9(int i10) {
        View findViewById;
        Map map = this.f22291E0;
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
    public InterfaceC4292s mo5465y9() {
        return new C4569a4(this, this);
    }

    /* renamed from: N9 */
    public void m22143N9(InterfaceC4150i interfaceC4150i) {
        AbstractC5868k.m23674f(interfaceC4150i, "operateView");
        this.f22289C0 = interfaceC4150i;
    }

    @Override // ba.AbstractC1196d, p430z9.AbstractC7765c, p164hd.AbstractC4817b, androidx.fragment.app.Fragment
    /* renamed from: S7 */
    public /* synthetic */ void mo3123S7() {
        super.mo3123S7();
        mo5459m9();
    }

    @Override // p130f8.InterfaceC4293t
    /* renamed from: a */
    public void mo17954a() {
        ((LoadingView) m22141I9(R$id.mLoading)).setVisibility(0);
    }

    @Override // p130f8.InterfaceC4293t
    /* renamed from: b */
    public void mo17955b() {
        ((LoadingView) m22141I9(R$id.mLoading)).setVisibility(8);
    }

    @Override // p130f8.InterfaceC4293t
    /* renamed from: c4 */
    public void mo17956c4(ArrayList arrayList) {
        AbstractC5868k.m23674f(arrayList, "percentStats");
        if (!this.f22292y0) {
            ((ViewStub) m22141I9(R$id.mVbMatchStatistics)).inflate();
            this.f22292y0 = true;
        }
        ((MatchPercentStat) m22141I9(R$id.mMpsPercentStat)).setPercentStats(arrayList);
    }

    @Override // p130f8.InterfaceC4293t
    /* renamed from: f */
    public Match mo17957f() {
        return this.f22287A0;
    }

    @Override // p115e8.InterfaceC4149h
    /* renamed from: f2 */
    public boolean mo17362f2() {
        int i10 = R$id.mSvStat;
        if (((ScrollView) m22141I9(i10)).canScrollVertically(-1) || ((ScrollView) m22141I9(i10)).canScrollVertically(1)) {
            ((ScrollView) m22141I9(i10)).requestFocus();
            return false;
        }
        return false;
    }

    @Override // ba.AbstractC1196d, p430z9.AbstractC7765c
    /* renamed from: m9 */
    public void mo5459m9() {
        this.f22291E0.clear();
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
        this.f22287A0 = (Match) serializable;
        Bundle m3090H62 = m3090H6();
        if (m3090H62 != null) {
            serializable2 = m3090H62.getSerializable("key_match_detail");
        }
        this.f22288B0 = (C4377l) serializable2;
        m22137K9();
    }

    @Override // p130f8.InterfaceC4293t
    /* renamed from: o0 */
    public void mo17958o0() {
        ((AutoLinearLayout) m22141I9(R$id.mAllNoData)).setVisibility(0);
    }

    @Override // p130f8.InterfaceC4293t
    /* renamed from: o3 */
    public void mo17959o3() {
        String str = null;
        String str2 = null;
        String str3 = null;
        Team team_b;
        String teamLogo = null;
        Team team_b2;
        Team team_a;
        Team team_a2;
        if (!this.f22292y0) {
            ((ViewStub) m22141I9(R$id.mVbMatchStatistics)).inflate();
            this.f22292y0 = true;
        }
        Match match = this.f22287A0;
        String str4 = "";
        if (match == null || (team_a2 = match.getTeam_a()) == null || (str = team_a2.getTeamName()) == null) {
            str = "";
        }
        Match match2 = this.f22287A0;
        if (match2 == null || (team_a = match2.getTeam_a()) == null || (str2 = team_a.getTeamLogo()) == null) {
            str2 = "";
        }
        Match match3 = this.f22287A0;
        if (match3 == null || (team_b2 = match3.getTeam_b()) == null || (str3 = team_b2.getTeamName()) == null) {
            str3 = "";
        }
        Match match4 = this.f22287A0;
        if (match4 != null && (team_b = match4.getTeam_b()) != null && (teamLogo = team_b.getTeamLogo()) != null) {
            str4 = teamLogo;
        }
        C5608b c5608b = C5608b.f22632a;
        Context m3107M8 = m3107M8();
        AbstractC5868k.m23673e(m3107M8, "requireContext()");
        ImageView imageView = (ImageView) m22141I9(R$id.mIvLeftVisitLogo);
        AbstractC5868k.m23673e(imageView, "mIvLeftVisitLogo");
        c5608b.m22780c(m3107M8, imageView, str2);
        ((TextView) m22141I9(R$id.mTvLeftVisitName)).setText(str);
        ((TextView) m22141I9(R$id.mTvLeftHomeName)).setText(str3);
        Context m3107M82 = m3107M8();
        AbstractC5868k.m23673e(m3107M82, "requireContext()");
        ImageView imageView2 = (ImageView) m22141I9(R$id.mIvLeftHomeLogo);
        AbstractC5868k.m23673e(imageView2, "mIvLeftHomeLogo");
        c5608b.m22780c(m3107M82, imageView2, str4);
        Context m3107M83 = m3107M8();
        AbstractC5868k.m23673e(m3107M83, "requireContext()");
        ImageView imageView3 = (ImageView) m22141I9(R$id.mIvRightVisitLogo);
        AbstractC5868k.m23673e(imageView3, "mIvRightVisitLogo");
        c5608b.m22780c(m3107M83, imageView3, str2);
        ((TextView) m22141I9(R$id.mTvRightVisitName)).setText(str);
        ((TextView) m22141I9(R$id.mTvRightHomeName)).setText(str3);
        Context m3107M84 = m3107M8();
        AbstractC5868k.m23673e(m3107M84, "requireContext()");
        ImageView imageView4 = (ImageView) m22141I9(R$id.mIvRightHomeLogo);
        AbstractC5868k.m23673e(imageView4, "mIvRightHomeLogo");
        c5608b.m22780c(m3107M84, imageView4, str4);
    }

    @Override // p430z9.AbstractC7765c
    /* renamed from: q9 */
    protected void mo5463q9() {
    }

    @Override // p130f8.InterfaceC4293t
    /* renamed from: t3 */
    public void mo17960t3(ArrayList arrayList) {
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        List m6988g;
        Team team_b;
        String teamLogo = null;
        Team team_b2;
        String teamName = null;
        Team team_a;
        String teamLogo2 = null;
        Team team_a2;
        String teamName2 = null;
        AbstractC5868k.m23674f(arrayList, "historyStats");
        if (!this.f22293z0) {
            ((ViewStub) m22141I9(R$id.mVbConfrontationRecords)).inflate();
            this.f22293z0 = true;
        }
        Match match = this.f22287A0;
        if (match == null || (team_a2 = match.getTeam_a()) == null || (teamName2 = team_a2.getTeamName()) == null) {
            str = "";
        } else {
            str = teamName2;
        }
        Match match2 = this.f22287A0;
        if (match2 == null || (team_a = match2.getTeam_a()) == null || (teamLogo2 = team_a.getTeamLogo()) == null) {
            str2 = "";
        } else {
            str2 = teamLogo2;
        }
        Match match3 = this.f22287A0;
        if (match3 == null || (team_b2 = match3.getTeam_b()) == null || (teamName = team_b2.getTeamName()) == null) {
            str3 = "";
        } else {
            str3 = teamName;
        }
        Match match4 = this.f22287A0;
        if (match4 == null || (team_b = match4.getTeam_b()) == null || (teamLogo = team_b.getTeamLogo()) == null) {
            str4 = "";
        } else {
            str4 = teamLogo;
        }
        ViewStub viewStub = (ViewStub) m22141I9(R$id.mFirstRecord);
        AbstractC5868k.m23673e(viewStub, "mFirstRecord");
        int i10 = 0;
        ViewStub viewStub2 = (ViewStub) m22141I9(R$id.mSecondRecord);
        AbstractC5868k.m23673e(viewStub2, "mSecondRecord");
        ViewStub viewStub3 = (ViewStub) m22141I9(R$id.mThirdRecord);
        AbstractC5868k.m23673e(viewStub3, "mThirdRecord");
        ViewStub viewStub4 = (ViewStub) m22141I9(R$id.mFourthRecord);
        AbstractC5868k.m23673e(viewStub4, "mFourthRecord");
        ViewStub viewStub5 = (ViewStub) m22141I9(R$id.mFifthRecord);
        AbstractC5868k.m23673e(viewStub5, "mFifthRecord");
        int i11 = 4;
        m6988g = AbstractC1500l.m6988g(viewStub, viewStub2, viewStub3, viewStub4, viewStub5);
        for (Object obj : arrayList) {
            int i12 = i10 + 1;
            if (i10 < 0) {
                AbstractC1500l.m6991j();
            }
            HistoryStat historyStat = (HistoryStat) obj;
            if (i10 <= i11) {
                View inflate = ((ViewStub) m6988g.get(i10)).inflate();
                TextView textView = (TextView) inflate.findViewById(R$id.mTvVisitTeamName);
                TextView textView2 = (TextView) inflate.findViewById(R$id.mTvScore);
                TextView textView3 = (TextView) inflate.findViewById(R$id.mTvHomeTeamName);
                TextView textView4 = (TextView) inflate.findViewById(R$id.mTvDate);
                TextView textView5 = (TextView) inflate.findViewById(R$id.mTvChampionship);
                ImageView imageView = (ImageView) inflate.findViewById(R$id.mIvVisitTeamLogo);
                ImageView imageView2 = (ImageView) inflate.findViewById(R$id.mIvHomeTeamLogo);
                textView.setText(historyStat.getTeam_a_name());
                textView2.setText(historyStat.getScore());
                textView3.setText(historyStat.getTeam_b_name());
                textView4.setText(historyStat.getGameTime());
                textView5.setText(historyStat.getLeague());
                AbstractC5868k.m23673e(imageView, "ivVisitTeamLogo");
                String str5 = str;
                String str6 = str2;
                String str7 = str3;
                String str8 = str4;
                m22140O9(imageView, historyStat.getTeam_a_name(), str5, str6, str7, str8);
                AbstractC5868k.m23673e(imageView2, "ivHomeTeamLogo");
                m22140O9(imageView2, historyStat.getTeam_b_name(), str5, str6, str7, str8);
            }
            i10 = i12;
            i11 = 4;
        }
    }

    @Override // ba.AbstractC1196d
    /* renamed from: x9 */
    public boolean mo5464x9() {
        return this.f22290D0;
    }
}
