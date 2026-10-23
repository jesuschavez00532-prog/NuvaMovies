package p159h8;

import ac.C0192p1;
import ba.AbstractC1196d;
import com.live.R$string;
import com.request.result.HistoryStat;
import com.request.result.Match;
import com.request.result.MatchStat;
import com.request.result.MatchStatData;
import com.request.result.Team;
import com.request.result.TeamStat;
import java.util.ArrayList;
import ne.AbstractC5868k;
import p130f8.InterfaceC4292s;
import p130f8.InterfaceC4293t;
import p135fd.C4307b;
import p250n8.C5765a;
import p250n8.C5766b;
import p301qb.InterfaceC6373b1;
import p317rb.AbstractC6567a;

/* renamed from: h8.a4 */
/* loaded from: classes2.dex */
public final class C4569a4 implements InterfaceC4292s, InterfaceC6373b1 {

    /* renamed from: a */
    private AbstractC1196d f19672a;

    /* renamed from: b */
    private InterfaceC4293t f19673b;

    /* renamed from: c */
    private final C0192p1 f19674c;

    public C4569a4(AbstractC1196d abstractC1196d, InterfaceC4293t interfaceC4293t) {
        AbstractC5868k.m23674f(abstractC1196d, "frag");
        AbstractC5868k.m23674f(interfaceC4293t, "view");
        this.f19672a = abstractC1196d;
        this.f19673b = interfaceC4293t;
        this.f19674c = new C0192p1(this);
    }

    /* renamed from: E3 */
    private final void m18999E3(MatchStat matchStat) {
        TeamStat team_a = matchStat.getTeam_a();
        TeamStat team_b = matchStat.getTeam_b();
        ArrayList arrayList = new ArrayList();
        String fouls = team_a.getFouls();
        String fouls2 = team_b.getFouls();
        String m3172j7 = this.f19672a.m3172j7(R$string.match_stat_faults);
        AbstractC5868k.m23673e(m3172j7, "frag.getString(R.string.match_stat_faults)");
        arrayList.add(new C5765a(fouls, fouls2, m3172j7));
        String yellowCards = team_a.getYellowCards();
        String yellowCards2 = team_b.getYellowCards();
        String m3172j72 = this.f19672a.m3172j7(R$string.match_stat_yellow_cards);
        AbstractC5868k.m23673e(m3172j72, "frag.getString(R.string.match_stat_yellow_cards)");
        arrayList.add(new C5765a(yellowCards, yellowCards2, m3172j72));
        String redCards = team_a.getRedCards();
        String redCards2 = team_b.getRedCards();
        String m3172j73 = this.f19672a.m3172j7(R$string.match_stat_red_cards);
        AbstractC5868k.m23673e(m3172j73, "frag.getString(R.string.match_stat_red_cards)");
        arrayList.add(new C5765a(redCards, redCards2, m3172j73));
        String offsides = team_a.getOffsides();
        String offsides2 = team_b.getOffsides();
        String m3172j74 = this.f19672a.m3172j7(R$string.match_stat_offside);
        AbstractC5868k.m23673e(m3172j74, "frag.getString(R.string.match_stat_offside)");
        arrayList.add(new C5765a(offsides, offsides2, m3172j74));
        String cornerKicks = team_a.getCornerKicks();
        String cornerKicks2 = team_b.getCornerKicks();
        String m3172j75 = this.f19672a.m3172j7(R$string.match_stat_corner_kick);
        AbstractC5868k.m23673e(m3172j75, "frag.getString(R.string.match_stat_corner_kick)");
        arrayList.add(new C5765a(cornerKicks, cornerKicks2, m3172j75));
        String saveS = team_a.getSaveS();
        String saveS2 = team_b.getSaveS();
        String m3172j76 = this.f19672a.m3172j7(R$string.match_stat_save);
        AbstractC5868k.m23673e(m3172j76, "frag.getString(R.string.match_stat_save)");
        arrayList.add(new C5765a(saveS, saveS2, m3172j76));
        this.f19673b.mo17953A5(arrayList);
    }

    /* renamed from: Y0 */
    private final void m19000Y0(MatchStat matchStat) {
        TeamStat team_a = matchStat.getTeam_a();
        TeamStat team_b = matchStat.getTeam_b();
        ArrayList arrayList = new ArrayList();
        int m25639i = AbstractC6567a.m25639i(team_a.getPossession());
        int m25639i2 = AbstractC6567a.m25639i(team_b.getPossession());
        if (m25639i == 0 && m25639i2 == 0) {
            m25639i = 50;
            m25639i2 = 50;
        }
        String m3172j7 = this.f19672a.m3172j7(R$string.match_stat_possession);
        AbstractC5868k.m23673e(m3172j7, "frag.getString(R.string.match_stat_possession)");
        arrayList.add(new C5766b(m25639i, m25639i2, m3172j7, true));
        int m25639i3 = AbstractC6567a.m25639i(team_a.getTargetCount());
        int m25639i4 = AbstractC6567a.m25639i(team_b.getTargetCount());
        String m3172j72 = this.f19672a.m3172j7(R$string.match_stat_inside_the_box);
        AbstractC5868k.m23673e(m3172j72, "frag.getString(R.string.match_stat_inside_the_box)");
        arrayList.add(new C5766b(m25639i3, m25639i4, m3172j72, false));
        int m25639i5 = AbstractC6567a.m25639i(team_a.getShotCount());
        int m25639i6 = AbstractC6567a.m25639i(team_b.getShotCount());
        String m3172j73 = this.f19672a.m3172j7(R$string.match_stat_outside_the_box);
        AbstractC5868k.m23673e(m3172j73, "frag.getString(R.string.…tch_stat_outside_the_box)");
        arrayList.add(new C5766b(m25639i5, m25639i6, m3172j73, false));
        this.f19673b.mo17956c4(arrayList);
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: B0 */
    public void mo6701B0() {
        String str = null;
        String str2 = null;
        Team team_b;
        String teamName = null;
        Team team_a;
        Match mo17957f = this.f19673b.mo17957f();
        String str3 = "";
        if (mo17957f == null || (str = mo17957f.getGameId()) == null) {
            str = "";
        }
        if (mo17957f == null || (team_a = mo17957f.getTeam_a()) == null || (str2 = team_a.getTeamName()) == null) {
            str2 = "";
        }
        if (mo17957f != null && (team_b = mo17957f.getTeam_b()) != null && (teamName = team_b.getTeamName()) != null) {
            str3 = teamName;
        }
        if (!AbstractC6567a.m25634d(str) && !AbstractC6567a.m25634d(str2) && !AbstractC6567a.m25634d(str3)) {
            this.f19673b.mo17954a();
            this.f19674c.m698b(str, str2, str3);
        } else {
            this.f19673b.mo17958o0();
        }
    }

    @Override // p301qb.InterfaceC6433v1
    /* renamed from: N3 */
    public C4307b mo523N3() {
        return this.f19672a.m19902N3();
    }

    @Override // p301qb.InterfaceC6373b1
    /* renamed from: d5 */
    public void mo19001d5(String str) {
        AbstractC5868k.m23674f(str, "errCode");
        this.f19673b.mo17955b();
        this.f19673b.mo17958o0();
    }

    @Override // p301qb.InterfaceC6373b1
    /* renamed from: g2 */
    public void mo19002g2(MatchStatData matchStatData) {
        this.f19673b.mo17955b();
        if (matchStatData != null && (matchStatData.getStatistics() != null || !AbstractC6567a.m25635e(matchStatData.getHistoryList()))) {
            MatchStat statistics = matchStatData.getStatistics();
            if (statistics != null) {
                this.f19673b.mo17959o3();
                m18999E3(statistics);
                m19000Y0(statistics);
            }
            ArrayList<HistoryStat> historyList = matchStatData.getHistoryList();
            if (historyList != null && !AbstractC6567a.m25635e(historyList)) {
                this.f19673b.mo17960t3(historyList);
                return;
            }
            return;
        }
        this.f19673b.mo17958o0();
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: n2 */
    public void mo6702n2() {
    }
}
