package p147g8;

import ac.C0165i2;
import ac.C0188o1;
import be.AbstractC1314j;
import be.C1328x;
import be.InterfaceC1312h;
import com.raizlabs.android.dbflow.sql.language.Operator;
import com.request.result.MatchPromotion;
import com.request.result.MatchScoreBoardData;
import com.request.result.MatchScoreGroup;
import com.request.result.MatchScoreTeam;
import com.request.result.ShelveMatch;
import com.request.result.ShelveMatchList;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.List;
import me.InterfaceC5642a;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p028b8.C1152c0;
import p028b8.C1154d0;
import p043ce.AbstractC1500l;
import p115e8.InterfaceC4153l;
import p115e8.InterfaceC4154m;
import p135fd.C4307b;
import p301qb.InterfaceC6370a1;
import p301qb.InterfaceC6400k1;
import p317rb.AbstractC6567a;
import p348u2.AbstractC7029f;
import p359ue.AbstractC7167u;
import p430z9.AbstractActivityC7763a;

/* renamed from: g8.c0 */
/* loaded from: classes2.dex */
public final class C4360c0 implements InterfaceC4153l, InterfaceC6400k1, InterfaceC6370a1 {

    /* renamed from: a */
    private AbstractActivityC7763a f18971a;

    /* renamed from: b */
    private InterfaceC4154m f18972b;

    /* renamed from: c */
    private final InterfaceC1312h f18973c;

    /* renamed from: d */
    private final C0188o1 f18974d;

    /* renamed from: g8.c0$a */
    /* loaded from: classes2.dex */
    static final class a extends AbstractC5869l implements InterfaceC5642a {
        a() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0165i2 invoke() {
            return new C0165i2(C4360c0.this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g8.c0$b */
    /* loaded from: classes2.dex */
    public static final class b extends AbstractC5869l implements InterfaceC5660l {
        b() {
            super(1);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1152c0 mo542f(MatchPromotion matchPromotion) {
            AbstractC5868k.m23674f(matchPromotion, "it");
            C4360c0.this.m18296T3(matchPromotion);
            C4360c0.this.m18307s4(matchPromotion);
            ArrayList arrayList = new ArrayList();
            int m18297W3 = C4360c0.this.m18297W3(matchPromotion, 0) - 1;
            int m18299Y3 = C4360c0.this.m18299Y3(m18297W3);
            C4360c0.this.m18301e4(matchPromotion, arrayList);
            return new C1152c0(4, 0, "", null, new C1154d0(matchPromotion, arrayList, m18297W3, m18299Y3));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g8.c0$c */
    /* loaded from: classes2.dex */
    public static final class c extends AbstractC5869l implements InterfaceC5660l {
        c() {
            super(1);
        }

        /* renamed from: a */
        public final void m18317a(C1152c0 c1152c0) {
            InterfaceC4154m m18313d4 = C4360c0.this.m18313d4();
            AbstractC5868k.m23673e(c1152c0, "it");
            m18313d4.mo11545t0(c1152c0);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m18317a((C1152c0) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g8.c0$d */
    /* loaded from: classes2.dex */
    public static final class d extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final d f18978a = new d();

        d() {
            super(1);
        }

        /* renamed from: a */
        public final void m18318a(Throwable th) {
            th.printStackTrace();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m18318a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    public C4360c0(AbstractActivityC7763a abstractActivityC7763a, InterfaceC4154m interfaceC4154m) {
        InterfaceC1312h m5965b;
        AbstractC5868k.m23674f(abstractActivityC7763a, "act");
        AbstractC5868k.m23674f(interfaceC4154m, "view");
        this.f18971a = abstractActivityC7763a;
        this.f18972b = interfaceC4154m;
        m5965b = AbstractC1314j.m5965b(new a());
        this.f18973c = m5965b;
        this.f18974d = new C0188o1(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T3 */
    public final void m18296T3(MatchPromotion matchPromotion) {
        if (matchPromotion == null) {
            return;
        }
        if (matchPromotion.getLeft() == null && matchPromotion.getRight() == null) {
            matchPromotion.setLeft(new MatchPromotion(matchPromotion.getScore(), matchPromotion.getLeftName(), "", matchPromotion.getLeftLogo(), "", null, null));
            matchPromotion.setRight(new MatchPromotion(matchPromotion.getScore(), "", matchPromotion.getRightName(), "", matchPromotion.getRightLogo(), null, null));
        } else {
            m18296T3(matchPromotion.getLeft());
            m18296T3(matchPromotion.getRight());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W3 */
    public final int m18297W3(MatchPromotion matchPromotion, int i10) {
        if (matchPromotion != null) {
            if (matchPromotion.getLeft() == null) {
                return i10 + 1;
            }
            return m18297W3(matchPromotion.getLeft(), i10 + 1);
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y3 */
    public final int m18299Y3(int i10) {
        int i11 = 1;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 *= 2;
        }
        return i11;
    }

    /* renamed from: b4 */
    private final C0165i2 m18300b4() {
        return (C0165i2) this.f18973c.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e4 */
    public final void m18301e4(MatchPromotion matchPromotion, ArrayList arrayList) {
        MatchPromotion right;
        MatchPromotion left;
        if (matchPromotion != null && matchPromotion.getLeft() == null && matchPromotion.getRight() == null) {
            arrayList.add(matchPromotion);
        }
        if (matchPromotion != null && (left = matchPromotion.getLeft()) != null) {
            m18301e4(left, arrayList);
        }
        if (matchPromotion != null && (right = matchPromotion.getRight()) != null) {
            m18301e4(right, arrayList);
        }
    }

    /* renamed from: g4 */
    private final void m18302g4(ArrayList arrayList) {
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
                arrayList2.add(new C1152c0(1, i13, "", (MatchScoreTeam) obj2, null));
                i12 = i13;
            }
            i10 = i11;
        }
        this.f18972b.mo11539M(arrayList2);
    }

    /* renamed from: h4 */
    private final void m18303h4(MatchPromotion matchPromotion) {
        Observable just = Observable.just(matchPromotion);
        final b bVar = new b();
        Observable map = just.map(new Function() { // from class: g8.z
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                C1152c0 m18304k4;
                m18304k4 = C4360c0.m18304k4(InterfaceC5660l.this, obj);
                return m18304k4;
            }
        });
        AbstractC5868k.m23673e(map, "@SuppressLint(\"CheckResu…\n                })\n    }");
        Observable compose = AbstractC6567a.m25631a(map, mo523N3()).compose(AbstractC7029f.m27120a());
        final c cVar = new c();
        Consumer consumer = new Consumer() { // from class: g8.a0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4360c0.m18305q4(InterfaceC5660l.this, obj);
            }
        };
        final d dVar = d.f18978a;
        compose.subscribe(consumer, new Consumer() { // from class: g8.b0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4360c0.m18306r4(InterfaceC5660l.this, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k4 */
    public static final C1152c0 m18304k4(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (C1152c0) interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q4 */
    public static final void m18305q4(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r4 */
    public static final void m18306r4(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s4 */
    public final void m18307s4(MatchPromotion matchPromotion) {
        List list;
        int i10;
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
        m18307s4(matchPromotion.getLeft());
        m18307s4(matchPromotion.getRight());
    }

    /* renamed from: u4 */
    private final void m18308u4(MatchScoreBoardData matchScoreBoardData, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new C1152c0(0, 0, matchScoreBoardData.getSeasonNum() + ' ' + matchScoreBoardData.getMatchName(), null, null));
        int i10 = 0;
        for (Object obj : arrayList) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC1500l.m6991j();
            }
            arrayList2.add(new C1152c0(1, i11, "", (MatchScoreTeam) obj, null));
            i10 = i11;
        }
        this.f18972b.mo11539M(arrayList2);
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: B0 */
    public void mo6701B0() {
        m18311c4();
    }

    @Override // p301qb.InterfaceC6370a1
    /* renamed from: I5 */
    public void mo18309I5(String str) {
        AbstractC5868k.m23674f(str, "errCode");
        this.f18972b.mo11540c0(false);
        this.f18972b.mo11541g();
    }

    @Override // p301qb.InterfaceC6433v1
    /* renamed from: N3 */
    public C4307b mo523N3() {
        return this.f18971a.m19900N3();
    }

    @Override // p301qb.InterfaceC6400k1
    /* renamed from: V5 */
    public void mo18310V5(String str) {
        AbstractC5868k.m23674f(str, "errCode");
        this.f18972b.mo11540c0(false);
        this.f18972b.mo11544t();
    }

    /* renamed from: c4 */
    public void m18311c4() {
        this.f18972b.mo11540c0(true);
        m18300b4().m616b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x007e, code lost:
    
        if (ne.AbstractC5868k.m23669a(r4, "3") != false) goto L38;
     */
    @Override // p301qb.InterfaceC6370a1
    /* renamed from: c5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo18312c5(com.request.result.MatchScoreBoardData r7) {
        /*
            r6 = this;
            r0 = 0
            if (r7 == 0) goto L8
            java.util.ArrayList r1 = r7.getTeamList()
            goto L9
        L8:
            r1 = r0
        L9:
            boolean r1 = p317rb.AbstractC6567a.m25635e(r1)
            r2 = 0
            if (r1 == 0) goto L33
            if (r7 == 0) goto L17
            java.util.ArrayList r1 = r7.getGroupList()
            goto L18
        L17:
            r1 = r0
        L18:
            boolean r1 = p317rb.AbstractC6567a.m25635e(r1)
            if (r1 == 0) goto L33
            if (r7 == 0) goto L25
            com.request.result.MatchPromotion r1 = r7.getPromotionList()
            goto L26
        L25:
            r1 = r0
        L26:
            if (r1 == 0) goto L33
            e8.m r7 = r6.f18972b
            r7.mo11540c0(r2)
            e8.m r7 = r6.f18972b
            r7.mo11541g()
            return
        L33:
            if (r7 == 0) goto L3a
            java.lang.String r1 = r7.getType()
            goto L3b
        L3a:
            r1 = r0
        L3b:
            java.lang.String r3 = "1"
            boolean r1 = ne.AbstractC5868k.m23669a(r1, r3)
            r3 = 1
            if (r1 == 0) goto L5f
            java.util.ArrayList r1 = r7.getTeamList()
            boolean r1 = p317rb.AbstractC6567a.m25638h(r1)
            if (r1 == 0) goto L5f
            e8.m r1 = r6.f18972b
            r1.mo11540c0(r2)
            java.util.ArrayList r1 = r7.getTeamList()
            ne.AbstractC5868k.m23671c(r1)
            r6.m18308u4(r7, r1)
            r1 = 1
            goto L60
        L5f:
            r1 = 0
        L60:
            if (r7 == 0) goto L67
            java.lang.String r4 = r7.getType()
            goto L68
        L67:
            r4 = r0
        L68:
            java.lang.String r5 = "2"
            boolean r4 = ne.AbstractC5868k.m23669a(r4, r5)
            java.lang.String r5 = "3"
            if (r4 != 0) goto L80
            if (r7 == 0) goto L79
            java.lang.String r4 = r7.getType()
            goto L7a
        L79:
            r4 = r0
        L7a:
            boolean r4 = ne.AbstractC5868k.m23669a(r4, r5)
            if (r4 == 0) goto L9a
        L80:
            java.util.ArrayList r4 = r7.getGroupList()
            boolean r4 = p317rb.AbstractC6567a.m25638h(r4)
            if (r4 == 0) goto L9a
            e8.m r1 = r6.f18972b
            r1.mo11540c0(r2)
            java.util.ArrayList r1 = r7.getGroupList()
            ne.AbstractC5868k.m23671c(r1)
            r6.m18302g4(r1)
            r1 = 1
        L9a:
            if (r7 == 0) goto La0
            java.lang.String r0 = r7.getType()
        La0:
            boolean r0 = ne.AbstractC5868k.m23669a(r0, r5)
            if (r0 == 0) goto Lbc
            com.request.result.MatchPromotion r0 = r7.getPromotionList()
            if (r0 == 0) goto Lbc
            e8.m r0 = r6.f18972b
            r0.mo11540c0(r2)
            com.request.result.MatchPromotion r7 = r7.getPromotionList()
            ne.AbstractC5868k.m23671c(r7)
            r6.m18303h4(r7)
            goto Lbd
        Lbc:
            r3 = r1
        Lbd:
            if (r3 != 0) goto Lc9
            e8.m r7 = r6.f18972b
            r7.mo11540c0(r2)
            e8.m r7 = r6.f18972b
            r7.mo11541g()
        Lc9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p147g8.C4360c0.mo18312c5(com.request.result.MatchScoreBoardData):void");
    }

    /* renamed from: d4 */
    public final InterfaceC4154m m18313d4() {
        return this.f18972b;
    }

    @Override // p115e8.InterfaceC4153l
    /* renamed from: n1 */
    public void mo17367n1(String str) {
        AbstractC5868k.m23674f(str, "matchName");
        this.f18972b.mo11537I0();
        this.f18972b.mo11540c0(true);
        this.f18974d.m683c(str, "", "");
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: n2 */
    public void mo6702n2() {
    }

    @Override // p301qb.InterfaceC6400k1
    /* renamed from: q2 */
    public void mo18314q2(ShelveMatchList shelveMatchList) {
        List<ShelveMatch> matchList;
        int i10 = 0;
        this.f18972b.mo11540c0(false);
        if (shelveMatchList != null && (matchList = shelveMatchList.getMatchList()) != null) {
            i10 = matchList.size();
        }
        if (i10 > 0) {
            InterfaceC4154m interfaceC4154m = this.f18972b;
            AbstractC5868k.m23671c(shelveMatchList);
            List<ShelveMatch> matchList2 = shelveMatchList.getMatchList();
            AbstractC5868k.m23671c(matchList2);
            interfaceC4154m.mo11538K(matchList2);
            return;
        }
        this.f18972b.mo11541g();
    }
}
