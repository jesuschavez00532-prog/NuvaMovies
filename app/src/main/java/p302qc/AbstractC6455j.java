package p302qc;

import android.text.TextUtils;
import anet.channel.request.Request;
import be.C1328x;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.raizlabs.android.dbflow.sql.language.Operator;
import com.therouter.router.RouteItem;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import ke.AbstractC5252a;
import mc.AbstractC5627b;
import mc.AbstractC5629d;
import mc.AbstractC5635j;
import mc.AbstractC5637l;
import mc.C5634i;
import me.InterfaceC5642a;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p000a.TheRouterServiceProvideInjecter;
import p359ue.AbstractC7166t;

/* renamed from: qc.j */
/* loaded from: classes.dex */
public abstract class AbstractC6455j {

    /* renamed from: b */
    private static volatile boolean f24822b;

    /* renamed from: a */
    private static final C6452g f24821a = new C6452g();

    /* renamed from: c */
    private static final Gson f24823c = new Gson();

    /* renamed from: qc.j$a */
    /* loaded from: classes3.dex */
    public static final class a extends TypeToken<List<? extends RouteItem>> {
        a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: qc.j$b */
    /* loaded from: classes3.dex */
    public static final class b extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        final /* synthetic */ Exception f24824a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Exception exc) {
            super(0);
            this.f24824a = exc;
        }

        /* renamed from: a */
        public final void m25292a() {
            this.f24824a.printStackTrace();
        }

        @Override // me.InterfaceC5642a
        public /* bridge */ /* synthetic */ Object invoke() {
            m25292a();
            return C1328x.f4998a;
        }
    }

    /* renamed from: c */
    public static final synchronized void m25284c(RouteItem routeItem) {
        boolean m27722i;
        synchronized (AbstractC6455j.class) {
            AbstractC5868k.m23674f(routeItem, "routeItem");
            String path = routeItem.getPath();
            m27722i = AbstractC7166t.m27722i(path, Operator.Operation.DIVISION, false, 2, null);
            if (m27722i) {
                path = path.substring(0, path.length() - 1);
                AbstractC5868k.m23673e(path, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            AbstractC5635j.m22862d("addRouteItem", "add " + path, null, 4, null);
            f24821a.put(path, routeItem);
        }
    }

    /* renamed from: d */
    public static final synchronized void m25285d(Collection collection) {
        synchronized (AbstractC6455j.class) {
            if (collection != null) {
                if (!collection.isEmpty()) {
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        m25284c((RouteItem) it.next());
                    }
                }
            }
        }
    }

    /* renamed from: e */
    public static final void m25286e() {
        AbstractC5637l.m22872f(new Runnable() { // from class: qc.h
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC6455j.m25287f();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static final void m25287f() {
        AbstractC5635j.m22862d("RouteMap", "will be add route map from： initDefaultRouteMap()", null, 4, null);
        TheRouterServiceProvideInjecter.initDefaultRouteMap();
        f24822b = true;
        m25290i();
        AbstractC5637l.m22873g(new Runnable() { // from class: qc.i
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC6455j.m25288g();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static final void m25288g() {
        AbstractC6450e.m25270h();
    }

    /* renamed from: h */
    public static final boolean m25289h() {
        return f24822b;
    }

    /* renamed from: i */
    public static final void m25290i() {
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(AbstractC6446a.m25231a(AbstractC5629d.m22837c(), AbstractC5627b.m22831a()), Charset.forName(Request.DEFAULT_CHARSET));
            try {
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                try {
                    StringBuilder sb2 = new StringBuilder();
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        sb2.append(readLine);
                        sb2.append("\n");
                    }
                    String sb3 = sb2.toString();
                    AbstractC5868k.m23673e(sb3, "stringBuilder.toString()");
                    AbstractC5635j.m22862d("RouteMap", "will be add route map from assets: " + sb3, null, 4, null);
                    if (!TextUtils.isEmpty(sb3)) {
                        Object fromJson = f24823c.fromJson(sb3, new a().getType());
                        AbstractC5868k.m23673e(fromJson, "gson.fromJson(content, o…eItem?>?>() {}.getType())");
                        m25285d((List) fromJson);
                    }
                    C1328x c1328x = C1328x.f4998a;
                    AbstractC5252a.m21156a(bufferedReader, null);
                    AbstractC5252a.m21156a(inputStreamReader, null);
                } finally {
                }
            } finally {
            }
        } catch (Exception e10) {
            AbstractC5635j.m22861c("RouteMap", "initRouteMap InputStreamReader error", new b(e10));
        }
    }

    /* renamed from: j */
    public static final synchronized RouteItem m25291j(String str) {
        RouteItem routeItem;
        boolean m27722i;
        synchronized (AbstractC6455j.class) {
            if (str == null) {
                str = "";
            }
            String m25244h = C5634i.m22843d(str).m25244h();
            routeItem = null;
            m27722i = AbstractC7166t.m27722i(m25244h, Operator.Operation.DIVISION, false, 2, null);
            if (m27722i) {
                m25244h = m25244h.substring(0, m25244h.length() - 1);
                AbstractC5868k.m23673e(m25244h, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            RouteItem routeItem2 = (RouteItem) f24821a.get(m25244h);
            if (routeItem2 != null) {
                routeItem = routeItem2.copy();
            }
            if (routeItem != null) {
                routeItem.setPath(m25244h);
            }
        }
        return routeItem;
    }
}
