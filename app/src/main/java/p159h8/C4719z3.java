package p159h8;

import ac.C0188o1;
import ba.AbstractC1196d;
import be.C1328x;
import com.raizlabs.android.dbflow.sql.language.Operator;
import com.request.result.Match;
import com.request.result.MatchPromotion;
import com.request.result.MatchScoreBoardData;
import com.request.result.MatchScoreGroup;
import com.request.result.MatchScoreTeam;
import com.request.result.Team;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.List;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p028b8.C1152c0;
import p028b8.C1154d0;
import p043ce.AbstractC1500l;
import p130f8.InterfaceC4290q;
import p130f8.InterfaceC4291r;
import p135fd.C4307b;
import p301qb.InterfaceC6370a1;
import p317rb.AbstractC6567a;
import p348u2.AbstractC7029f;
import p359ue.AbstractC7167u;

/* renamed from: h8.z3 */
/* loaded from: classes2.dex */
public final class C4719z3 implements InterfaceC4290q, InterfaceC6370a1 {

    /* renamed from: a */
    private AbstractC1196d f20079a;

    /* renamed from: b */
    private InterfaceC4291r f20080b;

    /* renamed from: c */
    private final C0188o1 f20081c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h8.z3$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC5869l implements InterfaceC5660l {
        a() {
            super(1);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1152c0 mo542f(MatchPromotion matchPromotion) {
            AbstractC5868k.m23674f(matchPromotion, "it");
            C4719z3.this.m19560T3(matchPromotion);
            C4719z3.this.m19570q4(matchPromotion);
            ArrayList arrayList = new ArrayList();
            int m19561W3 = C4719z3.this.m19561W3(matchPromotion, 0) - 1;
            int m19563Y3 = C4719z3.this.m19563Y3(m19561W3);
            C4719z3.this.m19564c4(matchPromotion, arrayList);
            return new C1152c0(4, 0, "", null, new C1154d0(matchPromotion, arrayList, m19561W3, m19563Y3));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h8.z3$b */
    /* loaded from: classes2.dex */
    public static final class b extends AbstractC5869l implements InterfaceC5660l {
        b() {
            super(1);
        }

        /* renamed from: a */
        public final void m19574a(C1152c0 c1152c0) {
            InterfaceC4291r m19572b4 = C4719z3.this.m19572b4();
            AbstractC5868k.m23673e(c1152c0, "it");
            m19572b4.mo17952t0(c1152c0);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m19574a((C1152c0) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h8.z3$c */
    /* loaded from: classes2.dex */
    public static final class c extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final c f20084a = new c();

        c() {
            super(1);
        }

        /* renamed from: a */
        public final void m19575a(Throwable th) {
            th.printStackTrace();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m19575a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    public C4719z3(AbstractC1196d abstractC1196d, InterfaceC4291r interfaceC4291r) {
        AbstractC5868k.m23674f(abstractC1196d, "frag");
        AbstractC5868k.m23674f(interfaceC4291r, "view");
        this.f20079a = abstractC1196d;
        this.f20080b = interfaceC4291r;
        this.f20081c = new C0188o1(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T3 */
    public final void m19560T3(MatchPromotion matchPromotion) {
        if (matchPromotion == null) {
            return;
        }
        if (matchPromotion.getLeft() == null && matchPromotion.getRight() == null) {
            matchPromotion.setLeft(new MatchPromotion(matchPromotion.getScore(), matchPromotion.getLeftName(), "", matchPromotion.getLeftLogo(), "", null, null));
            matchPromotion.setRight(new MatchPromotion(matchPromotion.getScore(), "", matchPromotion.getRightName(), "", matchPromotion.getRightLogo(), null, null));
        } else {
            m19560T3(matchPromotion.getLeft());
            m19560T3(matchPromotion.getRight());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W3 */
    public final int m19561W3(MatchPromotion matchPromotion, int i10) {
        if (matchPromotion != null) {
            if (matchPromotion.getLeft() == null) {
                return i10 + 1;
            }
            return m19561W3(matchPromotion.getLeft(), i10 + 1);
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y3 */
    public final int m19563Y3(int i10) {
        int i11 = 1;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 *= 2;
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c4 */
    public final void m19564c4(MatchPromotion matchPromotion, ArrayList arrayList) {
        MatchPromotion right;
        MatchPromotion left;
        if (matchPromotion != null && matchPromotion.getLeft() == null && matchPromotion.getRight() == null) {
            arrayList.add(matchPromotion);
        }
        if (matchPromotion != null && (left = matchPromotion.getLeft()) != null) {
            m19564c4(left, arrayList);
        }
        if (matchPromotion != null && (right = matchPromotion.getRight()) != null) {
            m19564c4(right, arrayList);
        }
    }

    /* renamed from: d4 */
    private final void m19565d4(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int i10 = 0;
        for (Object obj : arrayList) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC1500l.m6991j();
            }
            MatchScoreGroup matchScoreGroup = (MatchScoreGroup) obj;
            if (i10 != 0) {
                arrayList2.add(new C1152c0(3, 0, "", null, null));
            }
            arrayList2.add(new C1152c0(0, 0, matchScoreGroup.getGroupName(), null, null));
            int i12 = 0;
            for (Object obj2 : matchScoreGroup.getTeamList()) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    AbstractC1500l.m6991j();
                }
                MatchScoreTeam matchScoreTeam = (MatchScoreTeam) obj2;
                if (AbstractC5868k.m23669a(matchScoreTeam.isLight(), "1")) {
                    arrayList2.add(new C1152c0(2, i13, "", matchScoreTeam, null));
                } else {
                    arrayList2.add(new C1152c0(1, i13, "", matchScoreTeam, null));
                }
                i12 = i13;
            }
            i10 = i11;
        }
        this.f20080b.mo17947M(arrayList2);
    }

    /* renamed from: e4 */
    private final void m19566e4(MatchPromotion matchPromotion) {
        Observable just = Observable.just(matchPromotion);
        final a aVar = new a();
        Observable map = just.map(new Function() { // from class: h8.w3
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                C1152c0 m19567g4;
                m19567g4 = C4719z3.m19567g4(InterfaceC5660l.this, obj);
                return m19567g4;
            }
        });
        AbstractC5868k.m23673e(map, "@SuppressLint(\"CheckResu…\n                })\n    }");
        Observable compose = AbstractC6567a.m25631a(map, mo523N3()).compose(AbstractC7029f.m27121b());
        final b bVar = new b();
        Consumer consumer = new Consumer() { // from class: h8.x3
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4719z3.m19568h4(InterfaceC5660l.this, obj);
            }
        };
        final c cVar = c.f20084a;
        compose.subscribe(consumer, new Consumer() { // from class: h8.y3
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4719z3.m19569k4(InterfaceC5660l.this, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g4 */
    public static final C1152c0 m19567g4(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (C1152c0) interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h4 */
    public static final void m19568h4(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k4 */
    public static final void m19569k4(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q4 */
    public final void m19570q4(MatchPromotion matchPromotion) {
        List list;
        int i10 = 0;
        if (matchPromotion == null) {
            return;
        }
        if (AbstractC6567a.m25634d(matchPromotion.getScore())) {
            matchPromotion.setLeftScore("-1");
            matchPromotion.setRightScore("-1");
        } else {
            String score = matchPromotion.getScore();
            if (score != null) {
                list = AbstractC7167u.m27748R(score, new String[]{Operator.Operation.MINUS}, false, 0, 6, null);
            } else {
                list = null;
            }
            if (list != null) {
                i10 = list.size();
            } else {
                i10 = 0;
            }
            if (i10 >= 2) {
                AbstractC5868k.m23671c(list);
                matchPromotion.setLeftScore((String) list.get(0));
                matchPromotion.setRightScore((String) list.get(1));
            } else {
                matchPromotion.setLeftScore("-1");
                matchPromotion.setRightScore("-1");
            }
        }
        m19570q4(matchPromotion.getLeft());
        m19570q4(matchPromotion.getRight());
    }

    /* renamed from: r4 */
    private final void m19571r4(MatchScoreBoardData matchScoreBoardData, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new C1152c0(0, 0, matchScoreBoardData.getSeasonNum() + ' ' + matchScoreBoardData.getMatchName(), null, null));
        int i10 = 0;
        for (Object obj : arrayList) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC1500l.m6991j();
            }
            MatchScoreTeam matchScoreTeam = (MatchScoreTeam) obj;
            if (AbstractC5868k.m23669a(matchScoreTeam.isLight(), "1")) {
                arrayList2.add(new C1152c0(2, i11, "", matchScoreTeam, null));
            } else {
                arrayList2.add(new C1152c0(1, i11, "", matchScoreTeam, null));
            }
            i10 = i11;
        }
        this.f20080b.mo17947M(arrayList2);
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: B0 */
    public void mo6701B0() {
        String str = null;
        String str2 = null;
        Team team_b;
        String teamName = null;
        Team team_a;
        Match mo17950f = this.f20080b.mo17950f();
        String str3 = "";
        if (mo17950f == null || (str = mo17950f.getMatchName()) == null) {
            str = "";
        }
        if (mo17950f == null || (team_a = mo17950f.getTeam_a()) == null || (str2 = team_a.getTeamName()) == null) {
            str2 = "";
        }
        if (mo17950f != null && (team_b = mo17950f.getTeam_b()) != null && (teamName = team_b.getTeamName()) != null) {
            str3 = teamName;
        }
        if (!AbstractC6567a.m25634d(str) && !AbstractC6567a.m25634d(str2) && !AbstractC6567a.m25634d(str3)) {
            this.f20080b.mo17948a();
            this.f20081c.m683c(str, str2, str3);
        } else {
            this.f20080b.mo17951o0();
        }
    }

    @Override // p301qb.InterfaceC6370a1
    /* renamed from: I5 */
    public void mo18309I5(String str) {
        AbstractC5868k.m23674f(str, "errCode");
        this.f20080b.mo17949b();
        this.f20080b.mo17951o0();
    }

    @Override // p301qb.InterfaceC6433v1
    /* renamed from: N3 */
    public C4307b mo523N3() {
        return this.f20079a.m19902N3();
    }

    /* renamed from: b4 */
    public final InterfaceC4291r m19572b4() {
        return this.f20080b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x007d, code lost:
    
        if (ne.AbstractC5868k.m23669a(r3, "3") != false) goto L38;
     */
    @Override // p301qb.InterfaceC6370a1
    /* renamed from: c5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo18312c5(com.request.result.MatchScoreBoardData r6) {
        /*
            r5 = this;
            r0 = 0
            if (r6 == 0) goto L8
            java.util.ArrayList r1 = r6.getTeamList()
            goto L9
        L8:
            r1 = r0
        L9:
            boolean r1 = p317rb.AbstractC6567a.m25635e(r1)
            if (r1 == 0) goto L32
            if (r6 == 0) goto L16
            java.util.ArrayList r1 = r6.getGroupList()
            goto L17
        L16:
            r1 = r0
        L17:
            boolean r1 = p317rb.AbstractC6567a.m25635e(r1)
            if (r1 == 0) goto L32
            if (r6 == 0) goto L24
            com.request.result.MatchPromotion r1 = r6.getPromotionList()
            goto L25
        L24:
            r1 = r0
        L25:
            if (r1 == 0) goto L32
            f8.r r6 = r5.f20080b
            r6.mo17949b()
            f8.r r6 = r5.f20080b
            r6.mo17951o0()
            return
        L32:
            if (r6 == 0) goto L39
            java.lang.String r1 = r6.getType()
            goto L3a
        L39:
            r1 = r0
        L3a:
            java.lang.String r2 = "1"
            boolean r1 = ne.AbstractC5868k.m23669a(r1, r2)
            r2 = 1
            if (r1 == 0) goto L5e
            java.util.ArrayList r1 = r6.getTeamList()
            boolean r1 = p317rb.AbstractC6567a.m25638h(r1)
            if (r1 == 0) goto L5e
            f8.r r1 = r5.f20080b
            r1.mo17949b()
            java.util.ArrayList r1 = r6.getTeamList()
            ne.AbstractC5868k.m23671c(r1)
            r5.m19571r4(r6, r1)
            r1 = 1
            goto L5f
        L5e:
            r1 = 0
        L5f:
            if (r6 == 0) goto L66
            java.lang.String r3 = r6.getType()
            goto L67
        L66:
            r3 = r0
        L67:
            java.lang.String r4 = "2"
            boolean r3 = ne.AbstractC5868k.m23669a(r3, r4)
            java.lang.String r4 = "3"
            if (r3 != 0) goto L7f
            if (r6 == 0) goto L78
            java.lang.String r3 = r6.getType()
            goto L79
        L78:
            r3 = r0
        L79:
            boolean r3 = ne.AbstractC5868k.m23669a(r3, r4)
            if (r3 == 0) goto L99
        L7f:
            java.util.ArrayList r3 = r6.getGroupList()
            boolean r3 = p317rb.AbstractC6567a.m25638h(r3)
            if (r3 == 0) goto L99
            f8.r r1 = r5.f20080b
            r1.mo17949b()
            java.util.ArrayList r1 = r6.getGroupList()
            ne.AbstractC5868k.m23671c(r1)
            r5.m19565d4(r1)
            r1 = 1
        L99:
            if (r6 == 0) goto L9f
            java.lang.String r0 = r6.getType()
        L9f:
            boolean r0 = ne.AbstractC5868k.m23669a(r0, r4)
            if (r0 == 0) goto Lbb
            com.request.result.MatchPromotion r0 = r6.getPromotionList()
            if (r0 == 0) goto Lbb
            f8.r r0 = r5.f20080b
            r0.mo17949b()
            com.request.result.MatchPromotion r6 = r6.getPromotionList()
            ne.AbstractC5868k.m23671c(r6)
            r5.m19566e4(r6)
            goto Lbc
        Lbb:
            r2 = r1
        Lbc:
            if (r2 != 0) goto Lc8
            f8.r r6 = r5.f20080b
            r6.mo17949b()
            f8.r r6 = r5.f20080b
            r6.mo17951o0()
        Lc8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p159h8.C4719z3.mo18312c5(com.request.result.MatchScoreBoardData):void");
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: n2 */
    public void mo6702n2() {
    }
}
