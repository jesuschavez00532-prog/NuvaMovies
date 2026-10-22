package p390x0;

import android.text.TextUtils;
import be.AbstractC1314j;
import be.InterfaceC1312h;
import com.bigbee.bean.CommonParamBean;
import com.bigbee.bean.body.CustomizeBodyBean;
import com.bigbee.bean.body.KeyValueBean;
import com.bigbee.bean.request.BBEventRequestBean;
import com.bigbee.bean.request.CustomizeEventBean;
import com.bigbee.bean.request.EventNameValueBean;
import com.bigbee.p049db.DbOperations;
import com.bigbee.p049db.EventDbModel;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.InterfaceC5642a;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p123f1.C4209a;
import p421z0.C7737k;

/* renamed from: x0.a */
/* loaded from: classes.dex */
public final class C7482a implements InterfaceC7483b {

    /* renamed from: a */
    private final String f27540a;

    /* renamed from: b */
    private boolean f27541b;

    /* renamed from: c */
    private String f27542c;

    /* renamed from: d */
    private String f27543d;

    /* renamed from: e */
    private String f27544e;

    /* renamed from: f */
    private String f27545f;

    /* renamed from: g */
    private String f27546g;

    /* renamed from: h */
    private String f27547h;

    /* renamed from: i */
    private String f27548i;

    /* renamed from: j */
    private String f27549j;

    /* renamed from: k */
    private final InterfaceC1312h f27550k;

    /* renamed from: l */
    private Gson f27551l;

    /* renamed from: x0.a$a */
    /* loaded from: classes.dex */
    static final class a extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final a f27552a = new a();

        a() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DbOperations invoke() {
            return new DbOperations();
        }
    }

    public C7482a() {
        InterfaceC1312h m5965b;
        String simpleName = C7482a.class.getSimpleName();
        AbstractC5868k.m23673e(simpleName, "javaClass.simpleName");
        this.f27540a = simpleName;
        this.f27541b = true;
        this.f27542c = "";
        this.f27543d = "";
        this.f27544e = "";
        this.f27545f = "";
        this.f27546g = "";
        this.f27547h = "";
        this.f27548i = "";
        this.f27549j = "";
        m5965b = AbstractC1314j.m5965b(a.f27552a);
        this.f27550k = m5965b;
        this.f27551l = new Gson();
    }

    /* renamed from: h */
    private final DbOperations m28671h() {
        return (DbOperations) this.f27550k.getValue();
    }

    @Override // p390x0.InterfaceC7483b
    /* renamed from: a */
    public void mo28672a() {
        m28671h().deleteNum();
    }

    @Override // p390x0.InterfaceC7483b
    /* renamed from: b */
    public void mo28673b(Object obj) {
        DbOperations m28671h = m28671h();
        AbstractC5868k.m23672d(obj, "null cannot be cast to non-null type com.bigbee.db.EventDbModel");
        m28671h.saveEvent((EventDbModel) obj);
    }

    @Override // p390x0.InterfaceC7483b
    /* renamed from: c */
    public BBEventRequestBean mo28674c(List list) {
        List<KeyValueBean> parameter;
        AbstractC5868k.m23674f(list, "collectInfos");
        CommonParamBean m29914a = C7737k.f28482a.m29914a();
        if (TextUtils.isEmpty(m29914a.getAppId())) {
            return null;
        }
        BBEventRequestBean bBEventRequestBean = new BBEventRequestBean(m29914a.getSn(), m29914a.getAppId(), m29914a.getModel(), m29914a.getMacAddr(), m29914a.getReserve1(), new ArrayList());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            EventDbModel eventDbModel = (EventDbModel) it.next();
            if (!TextUtils.isEmpty(eventDbModel.eventId)) {
                long j10 = eventDbModel.startTime;
                if (j10 > 0) {
                    long j11 = eventDbModel.endTime;
                    if (j11 == 0 || j11 >= j10) {
                        String str = eventDbModel.eventId;
                        AbstractC5868k.m23673e(str, "it.eventId");
                        String str2 = eventDbModel.appVer;
                        AbstractC5868k.m23673e(str2, "it.appVer");
                        CustomizeEventBean customizeEventBean = new CustomizeEventBean(str, str2, eventDbModel.sysVer, eventDbModel.startTime, eventDbModel.endTime, new ArrayList());
                        if (!TextUtils.isEmpty(eventDbModel.reserveA)) {
                            try {
                                CustomizeBodyBean customizeBodyBean = (CustomizeBodyBean) this.f27551l.fromJson(eventDbModel.reserveA, CustomizeBodyBean.class);
                                if (customizeBodyBean != null && (parameter = customizeBodyBean.getParameter()) != null) {
                                    AbstractC5868k.m23673e(parameter, "parameter");
                                    for (KeyValueBean keyValueBean : parameter) {
                                        ArrayList<EventNameValueBean> parameter2 = customizeEventBean.getParameter();
                                        if (parameter2 != null) {
                                            String name = keyValueBean.getName();
                                            AbstractC5868k.m23673e(name, "listParameter.name");
                                            Object value = keyValueBean.getValue();
                                            AbstractC5868k.m23673e(value, "listParameter.value");
                                            parameter2.add(new EventNameValueBean(name, value));
                                        }
                                    }
                                }
                            } catch (Exception e10) {
                                e10.printStackTrace();
                            }
                        }
                        ArrayList<CustomizeEventBean> event = bBEventRequestBean.getEvent();
                        if (event != null) {
                            event.add(customizeEventBean);
                        }
                    }
                }
            }
        }
        return bBEventRequestBean;
    }

    @Override // p390x0.InterfaceC7483b
    /* renamed from: d */
    public void mo28675d(Object obj) {
        DbOperations m28671h = m28671h();
        AbstractC5868k.m23672d(obj, "null cannot be cast to non-null type com.bigbee.db.EventDbModel");
        m28671h.updateEvent((EventDbModel) obj);
    }

    @Override // p390x0.InterfaceC7483b
    /* renamed from: e */
    public void mo28676e(List list, boolean z10) {
        AbstractC5868k.m23674f(list, "collectInfos");
        m28671h().updateReportingStatus(list, z10);
    }

    @Override // p390x0.InterfaceC7483b
    /* renamed from: f */
    public List mo28677f() {
        List<EventDbModel> queryLimitNum;
        if (this.f27541b) {
            m28671h().updateAllReportingStatus(false);
            this.f27541b = false;
        }
        C4209a c4209a = C4209a.f18456a;
        if (c4209a.m17583a()) {
            c4209a.m17590h(false);
            queryLimitNum = m28671h().queryAllList(false);
        } else {
            queryLimitNum = m28671h().queryLimitNum(false);
        }
        AbstractC5868k.m23673e(queryLimitNum, "collectInfos");
        mo28676e(queryLimitNum, true);
        return queryLimitNum;
    }

    @Override // p390x0.InterfaceC7483b
    /* renamed from: g */
    public void mo28678g(List list) {
        AbstractC5868k.m23674f(list, "t");
        m28671h().deleteListEvent(list);
    }
}
