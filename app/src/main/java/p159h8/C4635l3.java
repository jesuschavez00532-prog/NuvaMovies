package p159h8;

import ac.C0156g1;
import ba.AbstractC1196d;
import com.request.result.LineupData;
import com.request.result.LineupPlayer;
import com.request.result.LineupTeam;
import com.request.result.Match;
import java.util.ArrayList;
import ne.AbstractC5868k;
import p130f8.InterfaceC4286m;
import p130f8.InterfaceC4287n;
import p135fd.C4307b;
import p301qb.InterfaceC6435w0;
import p317rb.AbstractC6567a;

/* renamed from: h8.l3 */
/* loaded from: classes2.dex */
public final class C4635l3 implements InterfaceC4286m, InterfaceC6435w0 {

    /* renamed from: a */
    private AbstractC1196d f19910a;

    /* renamed from: b */
    private InterfaceC4287n f19911b;

    /* renamed from: c */
    private final C0156g1 f19912c;

    public C4635l3(AbstractC1196d abstractC1196d, InterfaceC4287n interfaceC4287n) {
        AbstractC5868k.m23674f(abstractC1196d, "frag");
        AbstractC5868k.m23674f(interfaceC4287n, "view");
        this.f19910a = abstractC1196d;
        this.f19911b = interfaceC4287n;
        this.f19912c = new C0156g1(this);
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: B0 */
    public void mo6701B0() {
        String str;
        Match mo17939f = this.f19911b.mo17939f();
        if (mo17939f != null) {
            str = mo17939f.getGameId();
        } else {
            str = null;
        }
        if (AbstractC6567a.m25634d(str)) {
            this.f19911b.mo17936T();
            return;
        }
        this.f19911b.mo17937a();
        C0156g1 c0156g1 = this.f19912c;
        AbstractC5868k.m23671c(str);
        c0156g1.m600b(str);
    }

    @Override // p301qb.InterfaceC6435w0
    /* renamed from: C1 */
    public void mo19389C1(String str) {
        AbstractC5868k.m23674f(str, "errCode");
        this.f19911b.mo17938b();
        this.f19911b.mo17936T();
    }

    @Override // p301qb.InterfaceC6435w0
    /* renamed from: D3 */
    public void mo19390D3(LineupData lineupData) {
        AbstractC5868k.m23674f(lineupData, "lineupData");
        this.f19911b.mo17938b();
        if (lineupData.getTeam_a() != null && lineupData.getTeam_b() != null) {
            InterfaceC4287n interfaceC4287n = this.f19911b;
            LineupTeam team_a = lineupData.getTeam_a();
            AbstractC5868k.m23671c(team_a);
            LineupPlayer goalkeeper = team_a.getGoalkeeper();
            LineupTeam team_a2 = lineupData.getTeam_a();
            AbstractC5868k.m23671c(team_a2);
            ArrayList<ArrayList<LineupPlayer>> playerList = team_a2.getPlayerList();
            LineupTeam team_b = lineupData.getTeam_b();
            AbstractC5868k.m23671c(team_b);
            LineupPlayer goalkeeper2 = team_b.getGoalkeeper();
            LineupTeam team_b2 = lineupData.getTeam_b();
            AbstractC5868k.m23671c(team_b2);
            interfaceC4287n.mo17940i2(goalkeeper, playerList, goalkeeper2, team_b2.getPlayerList());
            return;
        }
        this.f19911b.mo17936T();
    }

    @Override // p301qb.InterfaceC6433v1
    /* renamed from: N3 */
    public C4307b mo523N3() {
        return this.f19910a.m19902N3();
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: n2 */
    public void mo6702n2() {
    }
}
