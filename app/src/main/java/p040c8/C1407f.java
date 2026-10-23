package p040c8;

import android.text.TextUtils;
import be.C1328x;
import cc.C1466m0;
import com.live.p063db.ChannelList;
import com.module.event.PreAllLiveDataEvent;
import com.request.result.CdnListBeanResult;
import com.request.result.Channel;
import com.request.result.ChildColumn;
import com.request.result.GetLiveDataResult;
import com.request.result.GetLiveDataResultData;
import com.request.result.LiveAddress;
import com.request.result.MosaicChannelBean;
import com.request.result.UrlListBeanResult;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import me.InterfaceC5642a;
import me.InterfaceC5660l;
import me.InterfaceC5664p;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p043ce.AbstractC1508t;
import p132fa.C4297a;
import p185j2.C4982a;
import p287pb.AbstractApplicationC6253c;
import p317rb.AbstractC6567a;
import p348u2.AbstractC7027d;
import p348u2.AbstractC7029f;
import p359ue.AbstractC7166t;
import p359ue.AbstractC7167u;
import p400xa.C7581k;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
import ye.C7709c;

/* renamed from: c8.f */
/* loaded from: classes2.dex */
public final class C1407f {

    /* renamed from: A */
    private static boolean f5456A;

    /* renamed from: B */
    private static Channel f5457B;

    /* renamed from: a */
    public static final C1407f f5458a;

    /* renamed from: b */
    private static final String f5459b;

    /* renamed from: c */
    private static boolean f5460c;

    /* renamed from: d */
    private static boolean f5461d;

    /* renamed from: e */
    private static HashMap f5462e;

    /* renamed from: f */
    private static int f5463f;

    /* renamed from: g */
    private static ArrayList f5464g;

    /* renamed from: h */
    private static ChildColumn f5465h;

    /* renamed from: i */
    private static int f5466i;

    /* renamed from: j */
    private static ChildColumn f5467j;

    /* renamed from: k */
    private static int f5468k;

    /* renamed from: l */
    private static ChildColumn f5469l;

    /* renamed from: m */
    private static int f5470m;

    /* renamed from: n */
    private static int f5471n;

    /* renamed from: o */
    private static ArrayList f5472o;

    /* renamed from: p */
    private static int f5473p;

    /* renamed from: q */
    private static int f5474q;

    /* renamed from: r */
    private static boolean f5475r;

    /* renamed from: s */
    private static int f5476s;

    /* renamed from: t */
    private static ArrayList f5477t;

    /* renamed from: u */
    private static int f5478u;

    /* renamed from: v */
    private static int f5479v;

    /* renamed from: w */
    private static int f5480w;

    /* renamed from: x */
    private static boolean f5481x;

    /* renamed from: y */
    private static final Map f5482y;

    /* renamed from: z */
    private static ArrayList f5483z;

    /* renamed from: c8.f$a */
    /* loaded from: classes2.dex */
    static final class a extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final a f5484a = new a();

        a() {
            super(1);
        }

        /* renamed from: a */
        public final void m6535a(Integer num) {
            C7709c.m29787d().m29802p(new PreAllLiveDataEvent(C1407f.f5458a.m6523o()));
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m6535a((Integer) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: c8.f$b */
    /* loaded from: classes2.dex */
    static final class b extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final b f5485a = new b();

        b() {
            super(1);
        }

        /* renamed from: a */
        public final void m6536a(Throwable th) {
            th.printStackTrace();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m6536a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c8.f$c */
    /* loaded from: classes2.dex */
    public static final class c extends AbstractC5869l implements InterfaceC5664p {

        /* renamed from: a */
        public static final c f5486a = new c();

        c() {
            super(2);
        }

        @Override // me.InterfaceC5664p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer mo2391h(Channel channel, Channel channel2) {
            int m27720g;
            m27720g = AbstractC7166t.m27720g(channel.getName(), channel2.getName(), true);
            return Integer.valueOf(m27720g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c8.f$d */
    /* loaded from: classes2.dex */
    public static final class d extends AbstractC5869l implements InterfaceC5664p {

        /* renamed from: a */
        public static final d f5487a = new d();

        d() {
            super(2);
        }

        @Override // me.InterfaceC5664p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer mo2391h(Channel channel, Channel channel2) {
            int m27720g;
            m27720g = AbstractC7166t.m27720g(channel2.getName(), channel.getName(), true);
            return Integer.valueOf(m27720g);
        }
    }

    static {
        C1407f c1407f = new C1407f();
        f5458a = c1407f;
        f5459b = c1407f.getClass().getSimpleName();
        f5461d = true;
        f5462e = new HashMap();
        f5463f = -1;
        f5464g = new ArrayList();
        f5466i = -1;
        f5468k = -1;
        f5470m = -1;
        f5471n = -1;
        f5472o = new ArrayList();
        f5473p = -1;
        f5474q = -1;
        f5477t = new ArrayList();
        f5478u = -1;
        f5479v = -1;
        f5480w = -1;
        f5482y = new LinkedHashMap();
        f5483z = new ArrayList();
    }

    private C1407f() {
    }

    /* renamed from: G */
    public static /* synthetic */ boolean m6469G(C1407f c1407f, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return c1407f.m6485F(str, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J */
    public static final void m6470J(ObservableEmitter observableEmitter) {
        AbstractC5868k.m23674f(observableEmitter, "it");
        boolean z10 = true;
        f5460c = true;
        int intValue = ((Number) C4982a.f20721a.m20333a(AbstractApplicationC6253c.f24484b.m24887a(), "all_Column_key", -1)).intValue();
        f5480w = intValue;
        if (intValue != -1) {
            String m29097f = C7581k.f27855a.m29097f(String.valueOf(f5480w));
            if (m29097f != null && m29097f.length() != 0) {
                z10 = false;
            }
            if (!z10) {
                GetLiveDataResult getLiveDataResult = (GetLiveDataResult) AbstractC7027d.m27114a().fromJson(m29097f, GetLiveDataResult.class);
                C1407f c1407f = f5458a;
                int i10 = f5480w;
                GetLiveDataResultData data = getLiveDataResult.getData();
                AbstractC5868k.m23671c(data);
                List<Channel> channelList = data.getChannelList();
                AbstractC5868k.m23671c(channelList);
                c1407f.m6489N(i10, channelList);
                observableEmitter.onNext(0);
            }
        }
        observableEmitter.onComplete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K */
    public static final void m6471K(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L */
    public static final void m6472L(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j0 */
    public static final int m6478j0(InterfaceC5664p interfaceC5664p, Object obj, Object obj2) {
        AbstractC5868k.m23674f(interfaceC5664p, "$tmp0");
        return ((Number) interfaceC5664p.mo2391h(obj, obj2)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k0 */
    public static final int m6479k0(InterfaceC5664p interfaceC5664p, Object obj, Object obj2) {
        AbstractC5868k.m23674f(interfaceC5664p, "$tmp0");
        return ((Number) interfaceC5664p.mo2391h(obj, obj2)).intValue();
    }

    /* renamed from: A */
    public final void m6480A() {
        Object m7008t;
        String str;
        if (!f5481x) {
            return;
        }
        f5482y.clear();
        int size = f5477t.size();
        for (int i10 = 0; i10 < size; i10++) {
            m7008t = AbstractC1508t.m7008t(f5477t, i10);
            Channel channel = (Channel) m7008t;
            if (channel != null) {
                str = channel.getFixedChannelNumber();
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                Map map = f5482y;
                AbstractC5868k.m23671c(str);
                map.put(str, Integer.valueOf(i10));
            }
        }
    }

    /* renamed from: B */
    public final boolean m6481B() {
        return !AbstractC6567a.m25636f(f5462e);
    }

    /* renamed from: C */
    public final boolean m6482C() {
        return !AbstractC6567a.m25635e(f5477t);
    }

    /* renamed from: D */
    public final boolean m6483D() {
        return f5461d;
    }

    /* renamed from: E */
    public final boolean m6484E() {
        List<MosaicChannelBean> list;
        Channel m6531w = m6531w();
        if (m6531w != null) {
            list = m6531w.getMosaicChannes();
        } else {
            list = null;
        }
        if (list == null || list.size() != 4) {
            return false;
        }
        return true;
    }

    /* renamed from: F */
    public final boolean m6485F(String str, boolean z10) {
        Channel m6531w;
        if (AbstractC6567a.m25634d(str)) {
            return false;
        }
        if (z10) {
            m6531w = C1427v.f5519a.m6630P();
        } else {
            m6531w = m6531w();
        }
        if (m6531w == null || !AbstractC5868k.m23669a(str, m6531w.getChannelCode())) {
            return false;
        }
        return true;
    }

    /* renamed from: H */
    public final boolean m6486H() {
        return f5460c;
    }

    /* renamed from: I */
    public final void m6487I() {
        if (f5480w == -1) {
            Observable compose = Observable.create(new ObservableOnSubscribe() { // from class: c8.c
                @Override // io.reactivex.ObservableOnSubscribe
                public final void subscribe(ObservableEmitter observableEmitter) {
                    C1407f.m6470J(observableEmitter);
                }
            }).compose(AbstractC7029f.m27121b());
            final a aVar = a.f5484a;
            Consumer consumer = new Consumer() { // from class: c8.d
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C1407f.m6471K(InterfaceC5660l.this, obj);
                }
            };
            final b bVar = b.f5485a;
            compose.subscribe(consumer, new Consumer() { // from class: c8.e
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C1407f.m6472L(InterfaceC5660l.this, obj);
                }
            });
        }
    }

    /* renamed from: M */
    public final void m6488M() {
        String str;
        Channel m6531w = m6531w();
        if (m6531w != null) {
            str = m6531w.getRestricted();
        } else {
            str = null;
        }
        if (AbstractC5868k.m23669a(str, "1")) {
            return;
        }
        f5475r = false;
        f5471n = m6532x();
        f5472o.clear();
        f5472o.addAll(f5477t);
        f5473p = f5478u;
        f5474q = f5479v;
    }

    /* renamed from: N */
    public final void m6489N(int i10, List list) {
        AbstractC5868k.m23674f(list, "channelList");
        f5462e.put(Integer.valueOf(i10), list);
    }

    /* renamed from: O */
    public final void m6490O(Channel channel, ArrayList arrayList, List list, boolean z10) {
        List<UrlListBeanResult> url_list;
        boolean m27724k;
        boolean m27724k2;
        boolean m27724k3;
        AbstractC5868k.m23674f(channel, "channelList");
        AbstractC5868k.m23674f(arrayList, "definitions");
        AbstractC5868k.m23674f(list, "cdnList");
        arrayList.clear();
        List<LiveAddress> liveAddressList = channel.getLiveAddressList();
        if (liveAddressList != null && (!liveAddressList.isEmpty())) {
            boolean z11 = false;
            boolean z12 = false;
            boolean z13 = false;
            for (LiveAddress liveAddress : liveAddressList) {
                if (!TextUtils.isEmpty(liveAddress.getCdnType())) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        CdnListBeanResult cdnListBeanResult = (CdnListBeanResult) it.next();
                        if (AbstractC5868k.m23669a(cdnListBeanResult.getCdn_type(), liveAddress.getCdnType()) && (url_list = cdnListBeanResult.getUrl_list()) != null) {
                            Iterator<T> it2 = url_list.iterator();
                            while (it2.hasNext()) {
                                if (AbstractC5868k.m23669a(((UrlListBeanResult) it2.next()).getTag(), liveAddress.getTag())) {
                                    if (!z11) {
                                        if (liveAddress.getQuality() != null) {
                                            m27724k3 = AbstractC7166t.m27724k(liveAddress.getQuality(), "1", false, 2, null);
                                            if (m27724k3) {
                                            }
                                        }
                                        arrayList.add("HD");
                                        z11 = true;
                                    }
                                    if (!z12 && liveAddress.getQuality() != null) {
                                        m27724k2 = AbstractC7166t.m27724k(liveAddress.getQuality(), "2", false, 2, null);
                                        if (m27724k2) {
                                            if (!arrayList.isEmpty()) {
                                                if (AbstractC5868k.m23669a("UHD", arrayList.get(0))) {
                                                    arrayList.add(1, "HD+");
                                                } else {
                                                    arrayList.add(0, "HD+");
                                                }
                                            } else {
                                                arrayList.add("HD+");
                                            }
                                            z12 = true;
                                        }
                                    }
                                    if (!z13 && liveAddress.getQuality() != null) {
                                        m27724k = AbstractC7166t.m27724k(liveAddress.getQuality(), "3", false, 2, null);
                                        if (m27724k) {
                                            arrayList.add(0, "UHD");
                                            z13 = true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: P */
    public final void m6491P(ChildColumn childColumn) {
        f5467j = childColumn;
    }

    /* renamed from: Q */
    public final void m6492Q(int i10) {
        f5468k = i10;
    }

    /* renamed from: R */
    public final void m6493R(int i10) {
        f5480w = i10;
    }

    /* renamed from: S */
    public final void m6494S(ChildColumn childColumn) {
        f5469l = childColumn;
    }

    /* renamed from: T */
    public final void m6495T(int i10) {
        f5470m = i10;
    }

    /* renamed from: U */
    public final void m6496U(ChildColumn childColumn) {
        f5465h = childColumn;
    }

    /* renamed from: V */
    public final void m6497V(int i10) {
        f5463f = i10;
    }

    /* renamed from: W */
    public final void m6498W(int i10) {
        f5466i = i10;
    }

    /* renamed from: X */
    public final void m6499X(boolean z10) {
        f5475r = z10;
    }

    /* renamed from: Y */
    public final void m6500Y(boolean z10) {
        f5481x = z10;
    }

    /* renamed from: Z */
    public final void m6501Z(int i10) {
        f5479v = i10;
    }

    /* renamed from: a0 */
    public final void m6502a0(int i10) {
        f5478u = i10;
    }

    /* renamed from: b0 */
    public final void m6503b0(boolean z10) {
        f5456A = z10;
    }

    /* renamed from: c0 */
    public final void m6504c0(boolean z10) {
        f5461d = z10;
    }

    /* renamed from: d0 */
    public final void m6505d0(Channel channel) {
        if (!C4297a.f18620a.m17985b() || channel != null) {
            f5457B = channel;
        }
    }

    /* renamed from: e0 */
    public final void m6506e0(int i10) {
        f5476s = i10;
    }

    /* renamed from: f */
    public final boolean m6507f() {
        if (f5471n == -1) {
            return false;
        }
        f5475r = false;
        int m6532x = m6532x();
        ArrayList arrayList = new ArrayList(m6533y());
        int i10 = f5478u;
        int i11 = f5479v;
        m6506e0(f5471n);
        m6508f0(f5472o);
        f5478u = f5473p;
        f5479v = f5474q;
        f5471n = m6532x;
        f5472o.clear();
        f5472o.addAll(arrayList);
        f5473p = i10;
        f5474q = i11;
        return true;
    }

    /* renamed from: f0 */
    public final void m6508f0(List list) {
        AbstractC5868k.m23674f(list, IjkMediaMeta.IJKM_KEY_CHANNELS);
        f5477t.clear();
        f5477t.addAll(list);
        m6480A();
    }

    /* renamed from: g */
    public final List m6509g(int i10) {
        List m6515j = m6515j(i10);
        ArrayList arrayList = new ArrayList();
        if (!AbstractC6567a.m25635e(m6515j)) {
            AbstractC5868k.m23671c(m6515j);
            arrayList.addAll(m6515j);
        }
        return arrayList;
    }

    /* renamed from: g0 */
    public final void m6510g0(boolean z10) {
        f5460c = z10;
    }

    /* renamed from: h */
    public final Integer m6511h(int i10) {
        if (!f5481x) {
            return Integer.valueOf(i10 - 1);
        }
        return (Integer) f5482y.get(String.valueOf(i10));
    }

    /* renamed from: h0 */
    public final boolean m6512h0(int i10, String str, List list, InterfaceC5642a interfaceC5642a, InterfaceC5660l interfaceC5660l) {
        boolean z10;
        Channel m6531w;
        AbstractC5868k.m23674f(str, "lastPlayChannelCode");
        AbstractC5868k.m23674f(list, "oldChannels");
        AbstractC5868k.m23674f(interfaceC5642a, "getOriginPlayList");
        AbstractC5868k.m23674f(interfaceC5660l, "updateIndex");
        int i11 = 0;
        if (str.length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && ((m6531w = m6531w()) == null || (str = m6531w.getChannelCode()) == null)) {
            str = "";
        }
        m6514i0(i10, list, interfaceC5642a);
        int size = list.size();
        while (true) {
            if (i11 < size) {
                if (AbstractC5868k.m23669a(((Channel) list.get(i11)).getChannelCode(), str)) {
                    break;
                }
                i11++;
            } else {
                i11 = -1;
                break;
            }
        }
        interfaceC5660l.mo542f(Integer.valueOf(i11));
        return true;
    }

    /* renamed from: i */
    public final ArrayList m6513i() {
        if (!AbstractC6567a.m25636f(f5462e) && f5462e.get(Integer.valueOf(f5480w)) != null) {
            Object obj = f5462e.get(Integer.valueOf(f5480w));
            AbstractC5868k.m23672d(obj, "null cannot be cast to non-null type java.util.ArrayList<com.request.result.Channel>{ kotlin.collections.TypeAliasesKt.ArrayList<com.request.result.Channel> }");
            return (ArrayList) obj;
        }
        return new ArrayList();
    }

    /* renamed from: i0 */
    public final boolean m6514i0(int i10, List list, InterfaceC5642a interfaceC5642a) {
        AbstractC5868k.m23674f(list, "oldChannels");
        AbstractC5868k.m23674f(interfaceC5642a, "getOriginPlayList");
        if (i10 != 0) {
            if (i10 != 1) {
                final d dVar = d.f5487a;
                Collections.sort(list, new Comparator() { // from class: c8.b
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        int m6479k0;
                        m6479k0 = C1407f.m6479k0(InterfaceC5664p.this, obj, obj2);
                        return m6479k0;
                    }
                });
            } else {
                final c cVar = c.f5486a;
                Collections.sort(list, new Comparator() { // from class: c8.a
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        int m6478j0;
                        m6478j0 = C1407f.m6478j0(InterfaceC5664p.this, obj, obj2);
                        return m6478j0;
                    }
                });
            }
        } else {
            List list2 = (List) interfaceC5642a.invoke();
            if (AbstractC6567a.m25635e(list2)) {
                return false;
            }
            if (list2 != list) {
                ArrayList arrayList = (ArrayList) list;
                arrayList.clear();
                AbstractC5868k.m23671c(list2);
                arrayList.addAll(list2);
            }
        }
        return true;
    }

    /* renamed from: j */
    public final List m6515j(int i10) {
        return (List) f5462e.get(Integer.valueOf(i10));
    }

    /* renamed from: k */
    public final void m6516k(ArrayList arrayList) {
        List<Channel> list;
        int i10 = 0;
        List<Channel> channelList;
        AbstractC5868k.m23674f(arrayList, "freeColumnList");
        if (C1466m0.f5627a.m6836I() && f5463f != -1) {
            if (!AbstractC6567a.m25635e(f5464g)) {
                arrayList.clear();
                arrayList.addAll(f5464g);
                return;
            }
            String m29097f = C7581k.f27855a.m29097f(String.valueOf(f5463f));
            if (!TextUtils.isEmpty(m29097f)) {
                GetLiveDataResult getLiveDataResult = (GetLiveDataResult) AbstractC7027d.m27114a().fromJson(m29097f, GetLiveDataResult.class);
                GetLiveDataResultData data = getLiveDataResult.getData();
                List<Channel> list2 = null;
                if (data != null) {
                    list = data.getChannelList();
                } else {
                    list = null;
                }
                if (list != null) {
                    GetLiveDataResultData data2 = getLiveDataResult.getData();
                    if (data2 != null && (channelList = data2.getChannelList()) != null) {
                        i10 = channelList.size();
                    } else {
                        i10 = 0;
                    }
                    if (i10 > 0) {
                        f5464g.clear();
                        ArrayList arrayList2 = f5464g;
                        GetLiveDataResultData data3 = getLiveDataResult.getData();
                        if (data3 != null) {
                            list2 = data3.getChannelList();
                        }
                        AbstractC5868k.m23671c(list2);
                        arrayList2.addAll(list2);
                        arrayList.clear();
                        arrayList.addAll(f5464g);
                    }
                }
            }
        }
    }

    /* renamed from: l */
    public final String m6517l() {
        String alias;
        ArrayList arrayList = f5483z;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            boolean z10 = false;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((ChildColumn) next).getId() == f5479v) {
                z10 = true;
            }
            if (z10) {
                arrayList2.add(next);
            }
        }
        if (AbstractC6567a.m25635e(arrayList2) || (alias = ((ChildColumn) arrayList2.get(0)).getAlias()) == null) {
            return "";
        }
        return alias;
    }

    /* renamed from: l0 */
    public final void m6518l0(ArrayList arrayList) {
        AbstractC5868k.m23674f(arrayList, "categories");
        f5483z.clear();
        f5483z.addAll(arrayList);
    }

    /* renamed from: m */
    public final ChildColumn m6519m() {
        return f5467j;
    }

    /* renamed from: m0 */
    public final void m6520m0(List list) {
        if (AbstractC6567a.m25635e(list)) {
            return;
        }
        ArrayList m6572m = C1415j.f5500a.m6572m();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Channel channel = (Channel) it.next();
                Iterator it2 = m6572m.iterator();
                while (it2.hasNext()) {
                    if (AbstractC5868k.m23669a(channel.getChannelCode(), ((ChannelList) it2.next()).getChannelCode())) {
                        channel.setLock(true);
                    }
                }
            }
        }
    }

    /* renamed from: n */
    public final int m6521n() {
        return f5468k;
    }

    /* renamed from: n0 */
    public final boolean m6522n0(Channel channel) {
        String str;
        boolean z10;
        String str2;
        boolean m27763v;
        if (channel != null) {
            str = channel.getSupportBusiness();
        } else {
            str = null;
        }
        if (str != null && str.length() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            if (channel != null) {
                str2 = channel.getSupportBusiness();
            } else {
                str2 = null;
            }
            AbstractC5868k.m23671c(str2);
            m27763v = AbstractC7167u.m27763v(str2, "TVOD", false, 2, null);
            if (m27763v) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: o */
    public final int m6523o() {
        return f5480w;
    }

    /* renamed from: p */
    public final ChildColumn m6524p() {
        return f5469l;
    }

    /* renamed from: q */
    public final int m6525q() {
        return f5463f;
    }

    /* renamed from: r */
    public final boolean m6526r() {
        return f5475r;
    }

    /* renamed from: s */
    public final boolean m6527s() {
        return f5481x;
    }

    /* renamed from: t */
    public final int m6528t() {
        return f5479v;
    }

    /* renamed from: u */
    public final int m6529u() {
        return f5478u;
    }

    /* renamed from: v */
    public final boolean m6530v() {
        return f5456A;
    }

    /* renamed from: w */
    public final Channel m6531w() {
        int i10 = 0;
        Channel channel = f5457B;
        if (channel != null) {
            return channel;
        }
        if (!AbstractC6567a.m25635e(f5477t) && (i10 = f5476s) >= 0 && i10 < f5477t.size()) {
            return (Channel) f5477t.get(f5476s);
        }
        return null;
    }

    /* renamed from: x */
    public final int m6532x() {
        return f5476s;
    }

    /* renamed from: y */
    public final ArrayList m6533y() {
        return f5477t;
    }

    /* renamed from: z */
    public final Channel m6534z() {
        Object m7008t;
        ArrayList arrayList = f5472o;
        if (arrayList != null) {
            m7008t = AbstractC1508t.m7008t(arrayList, f5471n);
            return (Channel) m7008t;
        }
        return null;
    }
}
