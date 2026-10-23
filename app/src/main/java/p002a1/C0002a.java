package p002a1;

import be.C1328x;
import com.bigbee.bean.request.BBEventRequestBean;
import com.bigbee.bean.request.CustomizeEventBean;
import com.bigbee.p049db.EventDbModel;
import com.dcs.bean.DomainInfo;
import com.google.gson.Gson;
import com.lzy.okgo.model.Progress;
import com.taobao.accs.utl.BaseMonitor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ne.AbstractC5868k;
import okhttp3.Dns;
import okhttp3.Interceptor;
import org.android.agoo.message.MessageService;
import p021b1.C1032a;
import p033c1.C1337a;
import p033c1.EnumC1341e;
import p033c1.InterfaceC1338b;
import p033c1.InterfaceRunnableC1340d;
import p092d1.C3921a;
import p123f1.AbstractC4215g;
import p123f1.C4209a;
import p123f1.C4214f;
import p359ue.AbstractC7167u;
import p363v2.C7197a;
import p390x0.InterfaceC7483b;
import p406y0.AbstractC7656a;

/* renamed from: a1.a */
/* loaded from: classes.dex */
public final class C0002a implements InterfaceC0004c {

    /* renamed from: a */
    private InterfaceC7483b f3a;

    /* renamed from: b */
    private final Dns f4b;

    /* renamed from: c */
    private final Interceptor f5c;

    /* renamed from: d */
    private final String f6d;

    /* renamed from: e */
    private Gson f7e;

    /* renamed from: a1.a$a */
    /* loaded from: classes.dex */
    public static final class a implements InterfaceC1338b {

        /* renamed from: b */
        final /* synthetic */ List f9b;

        /* renamed from: c */
        final /* synthetic */ InterfaceC0003b f10c;

        a(List list, InterfaceC0003b interfaceC0003b) {
            this.f9b = list;
            this.f10c = interfaceC0003b;
        }

        @Override // p033c1.InterfaceC1338b
        /* renamed from: a */
        public void mo12a(InterfaceRunnableC1340d interfaceRunnableC1340d, Exception exc) {
            AbstractC5868k.m23674f(interfaceRunnableC1340d, Progress.REQUEST);
            AbstractC5868k.m23674f(exc, "e");
            C0002a.this.f3a.mo28676e(this.f9b, false);
            List list = this.f9b;
            if (list != null && list.size() > 998) {
                C0002a.this.m10e();
            }
            if (AbstractC7656a.f28098d != null) {
                C7197a c7197a = C7197a.f26917a;
                DomainInfo domainInfo = AbstractC7656a.f28098d;
                AbstractC5868k.m23673e(domainInfo, "TDC");
                c7197a.m27860t(domainInfo, "key_tdc");
            }
        }

        @Override // p033c1.InterfaceC1338b
        /* renamed from: b */
        public void mo13b(InterfaceRunnableC1340d interfaceRunnableC1340d, C3921a c3921a) {
            AbstractC5868k.m23674f(interfaceRunnableC1340d, Progress.REQUEST);
            AbstractC5868k.m23674f(c3921a, "response");
            InterfaceC0003b interfaceC0003b = this.f10c;
            if (interfaceC0003b != null) {
                interfaceC0003b.mo14a(c3921a.m16753a());
            }
            List list = this.f9b;
            if (list != null && list.size() > 998) {
                C0002a.this.m10e();
            }
            if (!c3921a.m16756d()) {
                if (c3921a.m16755c() != 200 && c3921a.m16755c() != 304 && c3921a.m16755c() != 403 && AbstractC7656a.f28098d != null) {
                    C7197a c7197a = C7197a.f26917a;
                    DomainInfo domainInfo = AbstractC7656a.f28098d;
                    AbstractC5868k.m23673e(domainInfo, "TDC");
                    c7197a.m27860t(domainInfo, "key_tdc");
                }
                C0002a.this.f3a.mo28676e(this.f9b, false);
                return;
            }
            C0002a.this.f3a.mo28678g(this.f9b);
        }
    }

    public C0002a(InterfaceC7483b interfaceC7483b, Dns dns, Interceptor interceptor) {
        AbstractC5868k.m23674f(interfaceC7483b, "mCollector");
        AbstractC5868k.m23674f(dns, BaseMonitor.COUNT_POINT_DNS);
        this.f3a = interfaceC7483b;
        this.f4b = dns;
        this.f5c = interceptor;
        String simpleName = C0002a.class.getSimpleName();
        AbstractC5868k.m23673e(simpleName, "this.javaClass.simpleName");
        this.f6d = simpleName;
        this.f7e = new Gson();
    }

    /* renamed from: f */
    private final List m6f(List list) {
        boolean m27763v;
        int m27735E;
        int m27735E2;
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            EventDbModel eventDbModel = (EventDbModel) it.next();
            if (!AbstractC5868k.m23669a(eventDbModel.eventId, "app_cast")) {
                arrayList.add(eventDbModel);
            } else {
                String str = eventDbModel.reserveA;
                AbstractC5868k.m23673e(str, "it.reserveA");
                m27763v = AbstractC7167u.m27763v(str, "\"errorCode\",\"value\":\"\"", false, 2, null);
                if (m27763v) {
                    String str2 = eventDbModel.reserveA;
                    AbstractC5868k.m23673e(str2, "it.reserveA");
                    m27735E = AbstractC7167u.m27735E(str2, "transId", 0, false, 6, null);
                    String str3 = eventDbModel.reserveA;
                    AbstractC5868k.m23673e(str3, "it.reserveA");
                    m27735E2 = AbstractC7167u.m27735E(str3, "currId", 0, false, 6, null);
                    String str4 = eventDbModel.reserveA;
                    AbstractC5868k.m23673e(str4, "it.reserveA");
                    String substring = str4.substring(m27735E + 18, m27735E + 54);
                    AbstractC5868k.m23673e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    String str5 = eventDbModel.reserveA;
                    AbstractC5868k.m23673e(str5, "it.reserveA");
                    String substring2 = str5.substring(m27735E2 + 17, m27735E2 + 18);
                    AbstractC5868k.m23673e(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    if (hashMap.get(substring) != null) {
                        String str6 = (String) hashMap2.get(substring);
                        if (str6 == null) {
                            str6 = MessageService.MSG_DB_READY_REPORT;
                        }
                        if (str6.compareTo(substring2) < 0) {
                        }
                    }
                    hashMap.put(substring, eventDbModel);
                    hashMap2.put(substring, substring2);
                } else {
                    arrayList.add(eventDbModel);
                }
            }
        }
        if (!hashMap.isEmpty()) {
            Iterator it2 = hashMap.entrySet().iterator();
            while (it2.hasNext()) {
                arrayList.add(((Map.Entry) it2.next()).getValue());
            }
        }
        return arrayList;
    }

    @Override // p002a1.InterfaceC0004c
    /* renamed from: a */
    public void mo7a(InterfaceC0003b interfaceC0003b) {
        BBEventRequestBean mo28674c;
        String str = null;
        List m11g = m11g();
        if (m11g == null || AbstractC4215g.m17617b(m11g) || (mo28674c = this.f3a.mo28674c(m6f(m11g))) == null) {
            return;
        }
        ArrayList<CustomizeEventBean> event = mo28674c.getEvent();
        boolean z10 = false;
        if (event != null && AbstractC4215g.m17617b(event)) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        String json = this.f7e.toJson(mo28674c);
        if (AbstractC4215g.m17616a(json)) {
            return;
        }
        C4214f c4214f = C4214f.f18481a;
        String str2 = AbstractC7656a.f28099e;
        AbstractC5868k.m23673e(str2, "URL_HOST_MAIN");
        if (c4214f.m17614a(str2)) {
            str = "http://";
        } else {
            str = "https://";
        }
        C1337a m6100e = new C1337a().m6104i(str + AbstractC7656a.f28099e + AbstractC7656a.f28097c + AbstractC7656a.f28095a, str + AbstractC7656a.f28100f + AbstractC7656a.f28097c + AbstractC7656a.f28095a).m6103h(EnumC1341e.POST).m6100e("Content-Type", "application/json;charset=utf-8");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{\"data\":");
        sb2.append(json);
        sb2.append('}');
        C1032a.f4269b.m4836a().m4834c(m6100e.m6102g(sb2.toString()).m6101f(this.f5c).m6099b(this.f4b).m6098a(new a(m11g, interfaceC0003b)));
    }

    @Override // p002a1.InterfaceC0004c
    /* renamed from: b */
    public void mo8b(EventDbModel eventDbModel) {
        AbstractC5868k.m23674f(eventDbModel, "dbModel");
        this.f3a.mo28673b(eventDbModel);
    }

    @Override // p002a1.InterfaceC0004c
    /* renamed from: c */
    public void mo9c(EventDbModel eventDbModel) {
        AbstractC5868k.m23674f(eventDbModel, "dbModel");
        this.f3a.mo28675d(eventDbModel);
    }

    /* renamed from: e */
    public final void m10e() {
        C4209a c4209a = C4209a.f18456a;
        if (c4209a.m17584b()) {
            this.f3a.mo28672a();
        }
        c4209a.m17591i(false);
    }

    /* renamed from: g */
    protected List m11g() {
        List mo28677f;
        synchronized (this) {
            mo28677f = this.f3a.mo28677f();
            C1328x c1328x = C1328x.f4998a;
        }
        return mo28677f;
    }
}
