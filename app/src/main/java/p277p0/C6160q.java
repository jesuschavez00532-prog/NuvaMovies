package p277p0;

import android.content.Context;
import android.os.SystemClock;
import be.C1328x;
import com.advertlib.bean.AdInfo;
import com.advertlib.bean.AdReportBean;
import com.advertlib.bean.ReportWrapperBean;
import com.advertlib.bean.TimeInfoBean;
import com.umeng.analytics.pro.C3384f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ne.AbstractC5868k;
import p306r0.C6492a;
import p348u2.AbstractC7030g;
import p361v0.C7194g;

/* renamed from: p0.q */
/* loaded from: classes.dex */
public final class C6160q {

    /* renamed from: b */
    private static volatile C6492a f24222b;

    /* renamed from: a */
    public static final C6160q f24221a = new C6160q();

    /* renamed from: c */
    private static List f24223c = new ArrayList();

    /* renamed from: d */
    private static final String f24224d = C6160q.class.getSimpleName();

    private C6160q() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static final void m24592e(List list) {
        AbstractC5868k.m23674f(list, "$ids");
        C6492a c6492a = f24222b;
        if (c6492a != null) {
            c6492a.m25436m(list);
        }
    }

    /* renamed from: j */
    private final void m24593j(final ReportWrapperBean reportWrapperBean) {
        C6156m c6156m = C6156m.f24180a;
        final TimeInfoBean m24568U = c6156m.m24568U();
        if (m24568U != null && f24222b != null) {
            c6156m.m24567T().execute(new AbstractC7030g.f("report event", new Runnable() { // from class: p0.o
                @Override // java.lang.Runnable
                public final void run() {
                    C6160q.m24594k(ReportWrapperBean.this, m24568U);
                }
            }, false));
        } else {
            f24223c.add(reportWrapperBean);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static final void m24594k(ReportWrapperBean reportWrapperBean, TimeInfoBean timeInfoBean) {
        AbstractC5868k.m23674f(reportWrapperBean, "$bean");
        boolean isClickEvent = reportWrapperBean.isClickEvent();
        int i10 = !isClickEvent ? 1 : 0;
        String ad_id = reportWrapperBean.getAdInfo().getAd_id();
        String ad_name = reportWrapperBean.getAdInfo().getAd_name();
        if (ad_name == null) {
            ad_name = "unknown";
        }
        String userName = reportWrapperBean.getUserName();
        int appVersion = reportWrapperBean.getAppVersion();
        String pagekegeName = reportWrapperBean.getPagekegeName();
        String media_type = reportWrapperBean.getAdInfo().getMedia_type();
        if (media_type == null) {
            media_type = "";
        }
        AdReportBean adReportBean = new AdReportBean(ad_id, ad_name, i10, isClickEvent ? 1 : 0, "", "", userName, appVersion, pagekegeName, media_type, reportWrapperBean.getAdType(), timeInfoBean.getCurrTime(reportWrapperBean.getLocalTime()), reportWrapperBean.getGameStayTime());
        C6492a c6492a = f24222b;
        if (c6492a != null) {
            c6492a.m25438q(adReportBean);
        }
    }

    /* renamed from: c */
    public final void m24595c() {
        if (f24223c.isEmpty()) {
            return;
        }
        List list = f24223c;
        f24223c = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            f24221a.m24593j((ReportWrapperBean) it.next());
        }
    }

    /* renamed from: d */
    public final void m24596d(final List list) {
        AbstractC5868k.m23674f(list, "ids");
        C6156m.f24180a.m24567T().execute(new AbstractC7030g.f("delete report", new Runnable() { // from class: p0.p
            @Override // java.lang.Runnable
            public final void run() {
                C6160q.m24592e(list);
            }
        }, false));
    }

    /* renamed from: f */
    public final List m24597f(Context context) {
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        C6492a c6492a = f24222b;
        if (c6492a != null) {
            return c6492a.m25437n();
        }
        return null;
    }

    /* renamed from: g */
    public final void m24598g(Context context) {
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        if (f24222b == null) {
            synchronized (C6160q.class) {
                if (f24222b == null) {
                    f24222b = new C6492a(context);
                }
                C1328x c1328x = C1328x.f4998a;
            }
        }
    }

    /* renamed from: h */
    public final void m24599h(Context context, String str, String str2, AdInfo adInfo) {
        String str3 = null;
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        AbstractC5868k.m23674f(str2, "adType");
        if (adInfo == null) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        String packageName = context.getPackageName();
        AbstractC5868k.m23673e(packageName, "context.packageName");
        int m27833b = C7194g.f26904a.m27833b(context);
        if (str == null) {
            str3 = "unknown";
        } else {
            str3 = str;
        }
        m24593j(new ReportWrapperBean(true, elapsedRealtime, packageName, m27833b, str3, str2, adInfo, 0L, 128, null));
    }

    /* renamed from: i */
    public final void m24600i(Context context, String str, String str2, AdInfo adInfo) {
        String str3 = null;
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        AbstractC5868k.m23674f(str2, "adType");
        AbstractC5868k.m23674f(adInfo, "adInfo");
        long elapsedRealtime = SystemClock.elapsedRealtime();
        String packageName = context.getPackageName();
        AbstractC5868k.m23673e(packageName, "context.packageName");
        int m27833b = C7194g.f26904a.m27833b(context);
        if (str == null) {
            str3 = "unknown";
        } else {
            str3 = str;
        }
        m24593j(new ReportWrapperBean(false, elapsedRealtime, packageName, m27833b, str3, str2, adInfo, 0L, 128, null));
    }
}
