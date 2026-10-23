package p159h8;

import ac.C0184n1;
import ba.AbstractC1196d;
import com.request.result.Match;
import com.request.result.MatchEventData;
import com.request.result.MatchEventTeam;
import com.request.result.TeamEvent;
import java.util.ArrayList;
import ne.AbstractC5868k;
import p130f8.InterfaceC4284k;
import p130f8.InterfaceC4285l;
import p135fd.C4307b;
import p301qb.InterfaceC6376c1;
import p317rb.AbstractC6567a;

/* renamed from: h8.k3 */
/* loaded from: classes2.dex */
public final class C4629k3 implements InterfaceC4284k, InterfaceC6376c1 {

    /* renamed from: a */
    private AbstractC1196d f19891a;

    /* renamed from: b */
    private InterfaceC4285l f19892b;

    /* renamed from: c */
    private final C0184n1 f19893c;

    public C4629k3(AbstractC1196d abstractC1196d, InterfaceC4285l interfaceC4285l) {
        AbstractC5868k.m23674f(abstractC1196d, "frag");
        AbstractC5868k.m23674f(interfaceC4285l, "view");
        this.f19891a = abstractC1196d;
        this.f19892b = interfaceC4285l;
        this.f19893c = new C0184n1(this);
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: B0 */
    public void mo6701B0() {
        String str = null;
        boolean z10 = false;
        Match mo17935f = this.f19892b.mo17935f();
        if (mo17935f == null || (str = mo17935f.getGameId()) == null) {
            str = "";
        }
        if (mo17935f != null) {
            z10 = mo17935f.isNotStarted();
        } else {
            z10 = true;
        }
        if (!z10 && !AbstractC6567a.m25634d(str)) {
            this.f19892b.mo17933a();
            this.f19893c.m676b(str);
        } else {
            this.f19892b.mo17932T();
        }
    }

    @Override // p301qb.InterfaceC6433v1
    /* renamed from: N3 */
    public C4307b mo523N3() {
        return this.f19891a.m19902N3();
    }

    @Override // p301qb.InterfaceC6376c1
    /* renamed from: l1 */
    public void mo19353l1(MatchEventData matchEventData) {
        ArrayList<TeamEvent> arrayList;
        ArrayList<TeamEvent> arrayList2;
        MatchEventTeam team_b;
        MatchEventTeam team_a;
        this.f19892b.mo17934b();
        if (matchEventData == null || (team_a = matchEventData.getTeam_a()) == null || (arrayList = team_a.getTeamEvent()) == null) {
            arrayList = new ArrayList<>();
        }
        if (matchEventData == null || (team_b = matchEventData.getTeam_b()) == null || (arrayList2 = team_b.getTeamEvent()) == null) {
            arrayList2 = new ArrayList<>();
        }
        if (AbstractC6567a.m25635e(arrayList) && AbstractC6567a.m25635e(arrayList2)) {
            this.f19892b.mo17932T();
        } else {
            this.f19892b.mo17931H2(arrayList, arrayList2);
        }
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: n2 */
    public void mo6702n2() {
    }

    @Override // p301qb.InterfaceC6376c1
    /* renamed from: p5 */
    public void mo19354p5(String str) {
        AbstractC5868k.m23674f(str, "errCode");
        this.f19892b.mo17934b();
        this.f19892b.mo17932T();
    }
}
