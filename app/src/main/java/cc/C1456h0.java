package cc;

import android.text.TextUtils;
import be.C1328x;
import cc.C1456h0;
import com.request.bean.RefreshUerInfoPlayEvent;
import com.request.result.CdnListBeanResult;
import com.request.result.GetSlbInfoBeanResultData;
import com.request.result.UrlListBeanResult;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p043ce.AbstractC1504p;
import p170i2.C4842a;
import p317rb.AbstractC6567a;
import p348u2.AbstractC7029f;
import ye.C7709c;

/* renamed from: cc.h0 */
/* loaded from: classes.dex */
public final class C1456h0 {

    /* renamed from: a */
    public static final C1456h0 f5574a;

    /* renamed from: b */
    private static final String f5575b;

    /* renamed from: c */
    private static final Object f5576c;

    /* renamed from: d */
    private static boolean f5577d;

    /* renamed from: e */
    private static String f5578e;

    /* renamed from: f */
    private static String f5579f;

    /* renamed from: g */
    private static String f5580g;

    /* renamed from: h */
    private static String f5581h;

    /* renamed from: i */
    private static GetSlbInfoBeanResultData f5582i;

    /* renamed from: j */
    private static HashMap f5583j;

    /* renamed from: k */
    private static HashMap f5584k;

    /* renamed from: l */
    private static HashMap f5585l;

    /* renamed from: m */
    private static HashMap f5586m;

    /* renamed from: n */
    private static HashMap f5587n;

    /* renamed from: o */
    private static String f5588o;

    /* renamed from: p */
    private static HashMap f5589p;

    /* renamed from: cc.h0$a */
    /* loaded from: classes.dex */
    public enum a {
        LIVE("live"),
        VOD("vod"),
        RECORD("record");


        /* renamed from: a */
        private String f5594a;

        a(String str) {
            this.f5594a = str;
        }

        /* renamed from: b */
        public final String m6784b() {
            return this.f5594a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: cc.h0$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final b f5595a = new b();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: cc.h0$b$a */
        /* loaded from: classes.dex */
        public static final class a extends AbstractC5869l implements InterfaceC5660l {

            /* renamed from: a */
            final /* synthetic */ a f5596a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(a aVar) {
                super(1);
                this.f5596a = aVar;
            }

            @Override // me.InterfaceC5660l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean mo542f(CdnListBeanResult cdnListBeanResult) {
                AbstractC5868k.m23674f(cdnListBeanResult, "it");
                return Boolean.valueOf(AbstractC5868k.m23669a(cdnListBeanResult.getTag(), this.f5596a.m6784b()));
            }
        }

        b() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public static final boolean m6787g(InterfaceC5660l interfaceC5660l, Object obj) {
            AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
            return ((Boolean) interfaceC5660l.mo542f(obj)).booleanValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: i */
        public static final int m6788i(CdnListBeanResult cdnListBeanResult, CdnListBeanResult cdnListBeanResult2) {
            return AbstractC5868k.m23676h(cdnListBeanResult.getSerial_number(), cdnListBeanResult2.getSerial_number());
        }

        @Override // me.InterfaceC5660l
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public final ObservableSource mo542f(a aVar) {
            AbstractC5868k.m23674f(aVar, "playType");
            GetSlbInfoBeanResultData getSlbInfoBeanResultData = C1456h0.f5582i;
            AbstractC5868k.m23671c(getSlbInfoBeanResultData);
            Observable fromIterable = Observable.fromIterable(getSlbInfoBeanResultData.getCdn_list());
            final a aVar2 = new a(aVar);
            List list = (List) fromIterable.filter(new Predicate() { // from class: cc.i0
                @Override // io.reactivex.functions.Predicate
                public final boolean test(Object obj) {
                    boolean m6787g;
                    m6787g = C1456h0.b.m6787g(InterfaceC5660l.this, obj);
                    return m6787g;
                }
            }).toList().blockingGet();
            AbstractC5868k.m23673e(list, "list");
            AbstractC1504p.m6994m(list, new Comparator() { // from class: cc.j0
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int m6788i;
                    m6788i = C1456h0.b.m6788i((CdnListBeanResult) obj, (CdnListBeanResult) obj2);
                    return m6788i;
                }
            });
            return Observable.fromArray(list);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: cc.h0$c */
    /* loaded from: classes.dex */
    public static final class c extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final c f5597a = new c();

        c() {
            super(1);
        }

        /* renamed from: a */
        public final void m6791a(List list) {
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            if (list.size() < 1) {
                return;
            }
            String tag = ((CdnListBeanResult) list.get(0)).getTag();
            if (tag == null) {
                tag = "";
            }
            HashMap hashMap = C1456h0.f5583j;
            AbstractC5868k.m23673e(list, "it");
            hashMap.put(tag, list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                CdnListBeanResult cdnListBeanResult = (CdnListBeanResult) it.next();
                String str6 = null;
                if (cdnListBeanResult != null) {
                    str = cdnListBeanResult.getMain_addr();
                } else {
                    str = null;
                }
                if (!TextUtils.isEmpty(str)) {
                    HashMap m6775k = C1456h0.f5574a.m6775k();
                    if (cdnListBeanResult != null) {
                        str4 = cdnListBeanResult.getMain_addr();
                    } else {
                        str4 = null;
                    }
                    AbstractC5868k.m23671c(str4);
                    if (cdnListBeanResult == null || (str5 = cdnListBeanResult.getMain_addr_mark()) == null) {
                        str5 = "";
                    }
                    m6775k.put(str4, str5);
                }
                if (cdnListBeanResult != null) {
                    str2 = cdnListBeanResult.getSpared_addr();
                } else {
                    str2 = null;
                }
                if (!TextUtils.isEmpty(str2)) {
                    HashMap m6775k2 = C1456h0.f5574a.m6775k();
                    if (cdnListBeanResult != null) {
                        str6 = cdnListBeanResult.getSpared_addr();
                    }
                    AbstractC5868k.m23671c(str6);
                    if (cdnListBeanResult == null || (str3 = cdnListBeanResult.getSpared_addr_mark()) == null) {
                        str3 = "";
                    }
                    m6775k2.put(str6, str3);
                }
            }
            if (AbstractC6567a.m25638h(((CdnListBeanResult) list.get(0)).getUrl_list())) {
                ArrayList arrayList = new ArrayList();
                List<UrlListBeanResult> url_list = ((CdnListBeanResult) list.get(0)).getUrl_list();
                AbstractC5868k.m23671c(url_list);
                for (UrlListBeanResult urlListBeanResult : url_list) {
                    if (AbstractC6567a.m25637g(urlListBeanResult.getUrl())) {
                        arrayList.add(urlListBeanResult.getTag());
                    }
                }
                C1456h0.f5584k.put(tag, arrayList);
            }
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m6791a((List) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: cc.h0$d */
    /* loaded from: classes.dex */
    public static final class d extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final d f5598a = new d();

        d() {
            super(1);
        }

        /* renamed from: a */
        public final void m6792a(Throwable th) {
            C1456h0.f5574a.m6781q(true);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m6792a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    static {
        C1456h0 c1456h0 = new C1456h0();
        f5574a = c1456h0;
        f5575b = c1456h0.getClass().getSimpleName();
        f5576c = new Object();
        f5578e = "198.168.1.1:8080";
        f5579f = "198.168.1.1:8080";
        f5580g = "198.168.1.1:8080";
        f5581h = "198.168.1.1:8080";
        f5583j = new HashMap();
        f5584k = new HashMap();
        f5585l = new HashMap();
        f5586m = new HashMap();
        f5587n = new HashMap();
        f5588o = "";
        f5589p = new HashMap();
    }

    private C1456h0() {
    }

    /* renamed from: s */
    public static /* synthetic */ void m6767s(C1456h0 c1456h0, GetSlbInfoBeanResultData getSlbInfoBeanResultData, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        c1456h0.m6782r(getSlbInfoBeanResultData, z10, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public static final ObservableSource m6768t(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (ObservableSource) interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public static final void m6769u(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public static final void m6770v(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public static final void m6771w(boolean z10) {
        f5577d = true;
        if (C4842a.f20329a.m19920a().m19942S() && z10) {
            C7709c.m29787d().m29801m(new RefreshUerInfoPlayEvent());
        }
    }

    /* renamed from: h */
    public final void m6772h() {
        m6767s(this, null, false, false, 6, null);
        f5577d = false;
    }

    /* renamed from: i */
    public final List m6773i(a aVar) {
        AbstractC5868k.m23674f(aVar, "mPlayType");
        List list = (List) f5583j.get(aVar.m6784b());
        if (list == null) {
            return new ArrayList();
        }
        return list;
    }

    /* renamed from: j */
    public final List m6774j(a aVar) {
        AbstractC5868k.m23674f(aVar, "mPlayType");
        List list = (List) f5584k.get(aVar.m6784b());
        if (list == null) {
            return new ArrayList();
        }
        return list;
    }

    /* renamed from: k */
    public final HashMap m6775k() {
        return f5589p;
    }

    /* renamed from: l */
    public final String m6776l() {
        return f5588o;
    }

    /* renamed from: m */
    public final GetSlbInfoBeanResultData m6777m() {
        return f5582i;
    }

    /* renamed from: n */
    public final boolean m6778n(a aVar) {
        AbstractC5868k.m23674f(aVar, "type");
        return !AbstractC6567a.m25635e((List) f5583j.get(aVar.m6784b()));
    }

    /* renamed from: o */
    public final boolean m6779o() {
        return f5577d;
    }

    /* renamed from: p */
    public final void m6780p(a aVar) {
        AbstractC5868k.m23674f(aVar, "type");
        f5585l.put(aVar, 0);
        f5586m.put(aVar, "");
        f5587n.put(aVar, "");
    }

    /* renamed from: q */
    public final void m6781q(boolean z10) {
        f5577d = z10;
    }

    /* renamed from: r */
    public final void m6782r(GetSlbInfoBeanResultData getSlbInfoBeanResultData, boolean z10, final boolean z11) {
        String str = null;
        List<CdnListBeanResult> list;
        f5582i = getSlbInfoBeanResultData;
        f5583j.clear();
        f5584k.clear();
        if (getSlbInfoBeanResultData == null || (str = getSlbInfoBeanResultData.getPlay_params()) == null) {
            str = "";
        }
        f5588o = str;
        a aVar = a.LIVE;
        m6780p(aVar);
        a aVar2 = a.VOD;
        m6780p(aVar2);
        a aVar3 = a.RECORD;
        m6780p(aVar3);
        GetSlbInfoBeanResultData getSlbInfoBeanResultData2 = f5582i;
        if (getSlbInfoBeanResultData2 != null) {
            list = getSlbInfoBeanResultData2.getCdn_list();
        } else {
            list = null;
        }
        if (!AbstractC6567a.m25635e(list)) {
            Observable just = Observable.just(aVar, aVar2, aVar3);
            final b bVar = b.f5595a;
            Observable compose = just.flatMap(new Function() { // from class: cc.d0
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    ObservableSource m6768t;
                    m6768t = C1456h0.m6768t(InterfaceC5660l.this, obj);
                    return m6768t;
                }
            }).compose(AbstractC7029f.m27122c());
            final c cVar = c.f5597a;
            Consumer consumer = new Consumer() { // from class: cc.e0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C1456h0.m6769u(InterfaceC5660l.this, obj);
                }
            };
            final d dVar = d.f5598a;
            compose.subscribe(consumer, new Consumer() { // from class: cc.f0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C1456h0.m6770v(InterfaceC5660l.this, obj);
                }
            }, new Action() { // from class: cc.g0
                @Override // io.reactivex.functions.Action
                public final void run() {
                    C1456h0.m6771w(z11);
                }
            });
        }
    }
}
