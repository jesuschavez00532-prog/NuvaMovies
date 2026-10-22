package org.xutils.http.cookie;

import android.text.TextUtils;
import anet.channel.util.HttpConstant;
import com.lzy.okgo.cookie.SerializableCookie;
import com.raizlabs.android.dbflow.sql.language.Operator;
import java.net.CookieStore;
import java.net.HttpCookie;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import org.xutils.C6127x;
import org.xutils.DbManager;
import org.xutils.common.task.PriorityExecutor;
import org.xutils.common.util.LogUtil;
import org.xutils.config.DbConfigs;
import org.xutils.p274db.Selector;
import org.xutils.p274db.sqlite.WhereBuilder;
import org.xutils.p274db.table.DbModel;

/* loaded from: classes3.dex */
public enum DbCookieStore implements CookieStore {
    INSTANCE;

    private static final int LIMIT_COUNT = 5000;
    private static final long TRIM_TIME_SPAN = 1000;

    /* renamed from: db */
    private DbManager f24043db;
    private final Executor trimExecutor = new PriorityExecutor(1, true);
    private long lastTrimTime = 0;

    /* renamed from: org.xutils.http.cookie.DbCookieStore$a */
    /* loaded from: classes3.dex */
    class RunnableC6104a implements Runnable {
        RunnableC6104a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DbCookieStore.this.tryInit();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: org.xutils.http.cookie.DbCookieStore$b */
    /* loaded from: classes3.dex */
    public class RunnableC6105b implements Runnable {
        RunnableC6105b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            List findAll;
            DbCookieStore.this.tryInit();
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - DbCookieStore.this.lastTrimTime >= 1000) {
                DbCookieStore.this.lastTrimTime = currentTimeMillis;
                try {
                    DbCookieStore.this.f24043db.delete(C6106a.class, WhereBuilder.m24391b("expiry", Operator.Operation.LESS_THAN, Long.valueOf(System.currentTimeMillis())).and("expiry", Operator.Operation.NOT_EQUALS, -1L));
                } catch (Throwable th) {
                    LogUtil.m24376e(th.getMessage(), th);
                }
                try {
                    int count = (int) DbCookieStore.this.f24043db.selector(C6106a.class).count();
                    if (count > 5010 && (findAll = DbCookieStore.this.f24043db.selector(C6106a.class).where("expiry", Operator.Operation.NOT_EQUALS, -1L).orderBy("expiry").limit(count - 5000).findAll()) != null) {
                        DbCookieStore.this.f24043db.delete(findAll);
                    }
                } catch (Throwable th2) {
                    LogUtil.m24376e(th2.getMessage(), th2);
                }
            }
        }
    }

    DbCookieStore() {
        C6127x.task().run(new RunnableC6104a());
    }

    private URI getEffectiveURI(URI uri) {
        try {
            return new URI(HttpConstant.HTTP, uri.getHost(), uri.getPath(), null, null);
        } catch (Throwable th) {
            LogUtil.m24382w(th.getMessage(), th);
            return uri;
        }
    }

    private void trimSize() {
        this.trimExecutor.execute(new RunnableC6105b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tryInit() {
        if (this.f24043db == null) {
            synchronized (this) {
                if (this.f24043db == null) {
                    try {
                        DbManager db2 = C6127x.getDb(DbConfigs.COOKIE.getConfig());
                        this.f24043db = db2;
                        db2.delete(C6106a.class, WhereBuilder.m24391b("expiry", Operator.Operation.EQUALS, -1L));
                    } catch (Throwable th) {
                        LogUtil.m24376e(th.getMessage(), th);
                    }
                }
            }
        }
    }

    @Override // java.net.CookieStore
    public void add(URI uri, HttpCookie httpCookie) {
        if (httpCookie == null) {
            return;
        }
        tryInit();
        try {
            this.f24043db.replace(new C6106a(getEffectiveURI(uri), httpCookie));
        } catch (Throwable th) {
            LogUtil.m24376e(th.getMessage(), th);
        }
        trimSize();
    }

    @Override // java.net.CookieStore
    public List<HttpCookie> get(URI uri) {
        if (uri != null) {
            tryInit();
            URI effectiveURI = getEffectiveURI(uri);
            ArrayList arrayList = new ArrayList();
            try {
                Selector selector = this.f24043db.selector(C6106a.class);
                WhereBuilder m24390b = WhereBuilder.m24390b();
                String host = effectiveURI.getHost();
                if (!TextUtils.isEmpty(host)) {
                    WhereBuilder m24392or = WhereBuilder.m24391b("domain", Operator.Operation.EQUALS, host).m24392or("domain", Operator.Operation.EQUALS, "." + host);
                    int indexOf = host.indexOf(".");
                    int lastIndexOf = host.lastIndexOf(".");
                    if (indexOf > 0 && lastIndexOf > indexOf) {
                        String substring = host.substring(indexOf, host.length());
                        if (!TextUtils.isEmpty(substring)) {
                            m24392or.m24392or("domain", Operator.Operation.EQUALS, substring);
                        }
                    }
                    m24390b.and(m24392or);
                }
                String path = effectiveURI.getPath();
                if (!TextUtils.isEmpty(path)) {
                    WhereBuilder m24392or2 = WhereBuilder.m24391b("path", Operator.Operation.EQUALS, path).m24392or("path", Operator.Operation.EQUALS, Operator.Operation.DIVISION).m24392or("path", Operator.Operation.EQUALS, null);
                    int lastIndexOf2 = path.lastIndexOf(Operator.Operation.DIVISION);
                    while (lastIndexOf2 > 0) {
                        path = path.substring(0, lastIndexOf2);
                        m24392or2.m24392or("path", Operator.Operation.EQUALS, path);
                        lastIndexOf2 = path.lastIndexOf(Operator.Operation.DIVISION);
                    }
                    m24390b.and(m24392or2);
                }
                m24390b.m24392or("uri", Operator.Operation.EQUALS, effectiveURI.toString());
                List<C6106a> findAll = selector.where(m24390b).findAll();
                if (findAll != null) {
                    for (C6106a c6106a : findAll) {
                        if (!c6106a.isExpired()) {
                            arrayList.add(c6106a.toHttpCookie());
                        }
                    }
                }
            } catch (Throwable th) {
                LogUtil.m24376e(th.getMessage(), th);
            }
            return arrayList;
        }
        throw new NullPointerException("uri is null");
    }

    @Override // java.net.CookieStore
    public List<HttpCookie> getCookies() {
        tryInit();
        ArrayList arrayList = new ArrayList();
        try {
            List<C6106a> findAll = this.f24043db.findAll(C6106a.class);
            if (findAll != null) {
                for (C6106a c6106a : findAll) {
                    if (!c6106a.isExpired()) {
                        arrayList.add(c6106a.toHttpCookie());
                    }
                }
            }
        } catch (Throwable th) {
            LogUtil.m24376e(th.getMessage(), th);
        }
        return arrayList;
    }

    @Override // java.net.CookieStore
    public List<URI> getURIs() {
        tryInit();
        ArrayList arrayList = new ArrayList();
        try {
            List<DbModel> findAll = this.f24043db.selector(C6106a.class).select("uri").findAll();
            if (findAll != null) {
                Iterator<DbModel> it = findAll.iterator();
                while (it.hasNext()) {
                    String string = it.next().getString("uri");
                    if (!TextUtils.isEmpty(string)) {
                        try {
                            arrayList.add(new URI(string));
                        } catch (Throwable th) {
                            LogUtil.m24376e(th.getMessage(), th);
                            try {
                                this.f24043db.delete(C6106a.class, WhereBuilder.m24391b("uri", Operator.Operation.EQUALS, string));
                            } catch (Throwable th2) {
                                LogUtil.m24376e(th2.getMessage(), th2);
                            }
                        }
                    }
                }
            }
        } catch (Throwable th3) {
            LogUtil.m24376e(th3.getMessage(), th3);
        }
        return arrayList;
    }

    @Override // java.net.CookieStore
    public boolean remove(URI uri, HttpCookie httpCookie) {
        if (httpCookie == null) {
            return true;
        }
        tryInit();
        try {
            WhereBuilder m24391b = WhereBuilder.m24391b(SerializableCookie.NAME, Operator.Operation.EQUALS, httpCookie.getName());
            String domain = httpCookie.getDomain();
            if (!TextUtils.isEmpty(domain)) {
                m24391b.and("domain", Operator.Operation.EQUALS, domain);
            }
            String path = httpCookie.getPath();
            if (!TextUtils.isEmpty(path)) {
                if (path.length() > 1 && path.endsWith(Operator.Operation.DIVISION)) {
                    path = path.substring(0, path.length() - 1);
                }
                m24391b.and("path", Operator.Operation.EQUALS, path);
            }
            this.f24043db.delete(C6106a.class, m24391b);
            return true;
        } catch (Throwable th) {
            LogUtil.m24376e(th.getMessage(), th);
            return false;
        }
    }

    @Override // java.net.CookieStore
    public boolean removeAll() {
        tryInit();
        try {
            this.f24043db.delete(C6106a.class);
            return true;
        } catch (Throwable th) {
            LogUtil.m24376e(th.getMessage(), th);
            return true;
        }
    }
}
