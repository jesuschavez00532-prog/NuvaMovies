package anet.channel;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.entity.C0934a;
import anet.channel.entity.C0936c;
import anet.channel.entity.ConnType;
import anet.channel.entity.EventType;
import anet.channel.session.C0966d;
import anet.channel.session.TnetSpdySession;
import anet.channel.statist.AlarmObject;
import anet.channel.statist.SessionConnStat;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.IConnStrategy;
import anet.channel.strategy.StrategyCenter;
import anet.channel.strategy.utils.C1009d;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import anet.channel.util.C1018c;
import anet.channel.util.C1024i;
import anet.channel.util.HttpConstant;
import anet.channel.util.HttpUrl;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.C3197j;
import com.umeng.analytics.pro.C3325bt;
import com.umeng.analytics.pro.C3384f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class SessionRequest {

    /* renamed from: a */
    SessionCenter f3761a;

    /* renamed from: b */
    C0926e f3762b;

    /* renamed from: c */
    SessionInfo f3763c;

    /* renamed from: e */
    volatile Session f3765e;

    /* renamed from: i */
    private String f3769i;

    /* renamed from: j */
    private String f3770j;

    /* renamed from: k */
    private volatile Future f3771k;

    /* renamed from: d */
    volatile boolean f3764d = false;

    /* renamed from: f */
    volatile boolean f3766f = false;

    /* renamed from: g */
    HashMap<SessionGetCallback, RunnableC0894c> f3767g = new HashMap<>();

    /* renamed from: h */
    SessionConnStat f3768h = null;

    /* renamed from: l */
    private Object f3772l = new Object();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface IConnCb {
        void onDisConnect(Session session, long j10, int i10);

        void onFailed(Session session, long j10, int i10, int i11);

        void onSuccess(Session session, long j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: anet.channel.SessionRequest$a */
    /* loaded from: classes.dex */
    public class C0892a implements IConnCb {

        /* renamed from: a */
        boolean f3773a = false;

        /* renamed from: c */
        private Context f3775c;

        /* renamed from: d */
        private List<C0934a> f3776d;

        /* renamed from: e */
        private C0934a f3777e;

        C0892a(Context context, List<C0934a> list, C0934a c0934a) {
            this.f3775c = context;
            this.f3776d = list;
            this.f3777e = c0934a;
        }

        @Override // anet.channel.SessionRequest.IConnCb
        public void onDisConnect(Session session, long j10, int i10) {
            int i11;
            SessionInfo sessionInfo;
            boolean isAppBackground = GlobalAppRuntimeInfo.isAppBackground();
            ALog.m4785d("awcn.SessionRequest", "Connect Disconnect", this.f3777e.m4579h(), C3384f.f14569aC, session, "host", SessionRequest.this.m4493a(), "appIsBg", Boolean.valueOf(isAppBackground), "isHandleFinish", Boolean.valueOf(this.f3773a));
            SessionRequest sessionRequest = SessionRequest.this;
            sessionRequest.f3762b.m4552b(sessionRequest, session);
            if (this.f3773a) {
                return;
            }
            this.f3773a = true;
            if (!session.f3742t) {
                return;
            }
            if (isAppBackground && ((sessionInfo = SessionRequest.this.f3763c) == null || !sessionInfo.isAccs || AwcnConfig.isAccsSessionCreateForbiddenInBg())) {
                ALog.m4787e("awcn.SessionRequest", "[onDisConnect]app background, don't Recreate", this.f3777e.m4579h(), C3384f.f14569aC, session);
                return;
            }
            if (!NetworkStatusHelper.isConnected()) {
                ALog.m4787e("awcn.SessionRequest", "[onDisConnect]no network, don't Recreate", this.f3777e.m4579h(), C3384f.f14569aC, session);
                return;
            }
            try {
                ALog.m4785d("awcn.SessionRequest", "session disconnected, try to recreate session", this.f3777e.m4579h(), new Object[0]);
                SessionInfo sessionInfo2 = SessionRequest.this.f3763c;
                if (sessionInfo2 != null && sessionInfo2.isAccs) {
                    i11 = AwcnConfig.getAccsReconnectionDelayPeriod();
                } else {
                    i11 = 10000;
                }
                RunnableC0945i runnableC0945i = new RunnableC0945i(this, session);
                double random = Math.random();
                double d10 = i11;
                Double.isNaN(d10);
                ThreadPoolExecutorFactory.submitScheduledTask(runnableC0945i, (long) (random * d10), TimeUnit.MILLISECONDS);
            } catch (Exception unused) {
            }
        }

        @Override // anet.channel.SessionRequest.IConnCb
        public void onFailed(Session session, long j10, int i10, int i11) {
            if (ALog.isPrintLog(1)) {
                ALog.m4785d("awcn.SessionRequest", "Connect failed", this.f3777e.m4579h(), C3384f.f14569aC, session, "host", SessionRequest.this.m4493a(), "isHandleFinish", Boolean.valueOf(this.f3773a));
            }
            if (SessionRequest.this.f3766f) {
                SessionRequest.this.f3766f = false;
                return;
            }
            if (this.f3773a) {
                return;
            }
            this.f3773a = true;
            SessionRequest sessionRequest = SessionRequest.this;
            sessionRequest.f3762b.m4552b(sessionRequest, session);
            if (session.f3743u && NetworkStatusHelper.isConnected() && !this.f3776d.isEmpty()) {
                if (ALog.isPrintLog(1)) {
                    ALog.m4785d("awcn.SessionRequest", "use next connInfo to create session", this.f3777e.m4579h(), "host", SessionRequest.this.m4493a());
                }
                C0934a c0934a = this.f3777e;
                if (c0934a.f3876b == c0934a.f3877c && (i11 == -2003 || i11 == -2410)) {
                    ListIterator<C0934a> listIterator = this.f3776d.listIterator();
                    while (listIterator.hasNext()) {
                        if (session.getIp().equals(listIterator.next().f3875a.getIp())) {
                            listIterator.remove();
                        }
                    }
                }
                if (C1009d.m4780b(session.getIp())) {
                    ListIterator<C0934a> listIterator2 = this.f3776d.listIterator();
                    while (listIterator2.hasNext()) {
                        if (C1009d.m4780b(listIterator2.next().f3875a.getIp())) {
                            listIterator2.remove();
                        }
                    }
                }
                if (this.f3776d.isEmpty()) {
                    SessionRequest.this.m4504c();
                    SessionRequest.this.m4497a(session, i10, i11);
                    synchronized (SessionRequest.this.f3767g) {
                        for (Map.Entry<SessionGetCallback, RunnableC0894c> entry : SessionRequest.this.f3767g.entrySet()) {
                            RunnableC0894c value = entry.getValue();
                            if (value.f3781b.compareAndSet(false, true)) {
                                ThreadPoolExecutorFactory.removeScheduleTask(value);
                                entry.getKey().onSessionGetFail();
                            }
                        }
                        SessionRequest.this.f3767g.clear();
                    }
                    return;
                }
                C0934a remove = this.f3776d.remove(0);
                SessionRequest sessionRequest2 = SessionRequest.this;
                Context context = this.f3775c;
                sessionRequest2.m4488a(context, remove, new C0892a(context, this.f3776d, remove), remove.m4579h());
                return;
            }
            SessionRequest.this.m4504c();
            SessionRequest.this.m4497a(session, i10, i11);
            synchronized (SessionRequest.this.f3767g) {
                for (Map.Entry<SessionGetCallback, RunnableC0894c> entry2 : SessionRequest.this.f3767g.entrySet()) {
                    RunnableC0894c value2 = entry2.getValue();
                    if (value2.f3781b.compareAndSet(false, true)) {
                        ThreadPoolExecutorFactory.removeScheduleTask(value2);
                        entry2.getKey().onSessionGetFail();
                    }
                }
                SessionRequest.this.f3767g.clear();
            }
        }

        @Override // anet.channel.SessionRequest.IConnCb
        public void onSuccess(Session session, long j10) {
            ALog.m4785d("awcn.SessionRequest", "Connect Success", this.f3777e.m4579h(), C3384f.f14569aC, session, "host", SessionRequest.this.m4493a());
            try {
                if (SessionRequest.this.f3766f) {
                    SessionRequest.this.f3766f = false;
                    session.close(false);
                    return;
                }
                SessionRequest sessionRequest = SessionRequest.this;
                sessionRequest.f3762b.m4551a(sessionRequest, session);
                SessionRequest.this.m4496a(session);
                synchronized (SessionRequest.this.f3767g) {
                    for (Map.Entry<SessionGetCallback, RunnableC0894c> entry : SessionRequest.this.f3767g.entrySet()) {
                        RunnableC0894c value = entry.getValue();
                        if (value.f3781b.compareAndSet(false, true)) {
                            ThreadPoolExecutorFactory.removeScheduleTask(value);
                            entry.getKey().onSessionGetSuccess(session);
                        }
                    }
                    SessionRequest.this.f3767g.clear();
                }
            } catch (Exception e10) {
                ALog.m4786e("awcn.SessionRequest", "[onSuccess]:", this.f3777e.m4579h(), e10, new Object[0]);
            } finally {
                SessionRequest.this.m4504c();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: anet.channel.SessionRequest$b */
    /* loaded from: classes.dex */
    public class RunnableC0893b implements Runnable {

        /* renamed from: a */
        String f3778a;

        RunnableC0893b(String str) {
            this.f3778a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (SessionRequest.this.f3764d) {
                ALog.m4787e("awcn.SessionRequest", "Connecting timeout!!! reset status!", this.f3778a, new Object[0]);
                SessionConnStat sessionConnStat = SessionRequest.this.f3768h;
                sessionConnStat.ret = 2;
                sessionConnStat.totalTime = System.currentTimeMillis() - SessionRequest.this.f3768h.start;
                if (SessionRequest.this.f3765e != null) {
                    SessionRequest.this.f3765e.f3743u = false;
                    SessionRequest.this.f3765e.close();
                    SessionRequest sessionRequest = SessionRequest.this;
                    sessionRequest.f3768h.syncValueFromSession(sessionRequest.f3765e);
                }
                AppMonitor.getInstance().commitStat(SessionRequest.this.f3768h);
                SessionRequest.this.m4500a(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: anet.channel.SessionRequest$c */
    /* loaded from: classes.dex */
    public class RunnableC0894c implements Runnable {

        /* renamed from: a */
        SessionGetCallback f3780a;

        /* renamed from: b */
        AtomicBoolean f3781b = new AtomicBoolean(false);

        protected RunnableC0894c(SessionGetCallback sessionGetCallback) {
            this.f3780a = null;
            this.f3780a = sessionGetCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f3781b.compareAndSet(false, true)) {
                ALog.m4787e("awcn.SessionRequest", "get session timeout", null, new Object[0]);
                synchronized (SessionRequest.this.f3767g) {
                    SessionRequest.this.f3767g.remove(this.f3780a);
                }
                this.f3780a.onSessionGetFail();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SessionRequest(String str, SessionCenter sessionCenter) {
        this.f3769i = str;
        String substring = str.substring(str.indexOf(HttpConstant.SCHEME_SPLIT) + 3);
        this.f3770j = substring;
        this.f3761a = sessionCenter;
        this.f3763c = sessionCenter.f3756g.m4517b(substring);
        this.f3762b = sessionCenter.f3754e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public synchronized void m4502b(Context context, int i10, String str, SessionGetCallback sessionGetCallback, long j10) {
        Session m4548a = this.f3762b.m4548a(this, i10);
        if (m4548a != null) {
            ALog.m4785d("awcn.SessionRequest", "Available Session exist!!!", str, new Object[0]);
            sessionGetCallback.onSessionGetSuccess(m4548a);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            str = C1024i.m4812a(null);
        }
        ALog.m4785d("awcn.SessionRequest", "SessionRequest start", str, "host", this.f3769i, "type", Integer.valueOf(i10));
        if (this.f3764d) {
            ALog.m4785d("awcn.SessionRequest", "session connecting", str, "host", m4493a());
            if (m4501b() == i10) {
                RunnableC0894c runnableC0894c = new RunnableC0894c(sessionGetCallback);
                synchronized (this.f3767g) {
                    this.f3767g.put(sessionGetCallback, runnableC0894c);
                }
                ThreadPoolExecutorFactory.submitScheduledTask(runnableC0894c, j10, TimeUnit.MILLISECONDS);
            } else {
                sessionGetCallback.onSessionGetFail();
            }
            return;
        }
        m4500a(true);
        this.f3771k = ThreadPoolExecutorFactory.submitScheduledTask(new RunnableC0893b(str), 45L, TimeUnit.SECONDS);
        SessionConnStat sessionConnStat = new SessionConnStat();
        this.f3768h = sessionConnStat;
        sessionConnStat.start = System.currentTimeMillis();
        if (!NetworkStatusHelper.isConnected()) {
            if (ALog.isPrintLog(1)) {
                ALog.m4785d("awcn.SessionRequest", "network is not available, can't create session", str, "isConnected", Boolean.valueOf(NetworkStatusHelper.isConnected()));
            }
            m4504c();
            throw new RuntimeException("no network");
        }
        List<IConnStrategy> m4486a = m4486a(i10, str);
        if (!m4486a.isEmpty()) {
            List<C0934a> m4487a = m4487a(m4486a, str);
            try {
                C0934a remove = m4487a.remove(0);
                m4488a(context, remove, new C0892a(context, m4487a, remove), remove.m4579h());
                RunnableC0894c runnableC0894c2 = new RunnableC0894c(sessionGetCallback);
                synchronized (this.f3767g) {
                    this.f3767g.put(sessionGetCallback, runnableC0894c2);
                }
                ThreadPoolExecutorFactory.submitScheduledTask(runnableC0894c2, j10, TimeUnit.MILLISECONDS);
            } catch (Throwable unused) {
                m4504c();
            }
            return;
        }
        ALog.m4788i("awcn.SessionRequest", "no avalible strategy, can't create session", str, "host", this.f3769i, "type", Integer.valueOf(i10));
        m4504c();
        throw new NoAvailStrategyException("no avalible strategy");
    }

    /* renamed from: c */
    void m4504c() {
        m4500a(false);
        synchronized (this.f3772l) {
            this.f3772l.notifyAll();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public String m4493a() {
        return this.f3769i;
    }

    /* renamed from: a */
    void m4500a(boolean z10) {
        this.f3764d = z10;
        if (z10) {
            return;
        }
        if (this.f3771k != null) {
            this.f3771k.cancel(true);
            this.f3771k = null;
        }
        this.f3765e = null;
    }

    /* renamed from: c */
    private void m4492c(Session session, int i10, String str) {
        SessionInfo sessionInfo = this.f3763c;
        if (sessionInfo == null || !sessionInfo.isAccs) {
            return;
        }
        ALog.m4787e("awcn.SessionRequest", "sendConnectInfoToAccsByCallBack", null, new Object[0]);
        Intent intent = new Intent(Constants.ACTION_ACCS_CONNECT_INFO);
        intent.putExtra("command", 103);
        intent.putExtra("host", session.getHost());
        intent.putExtra(Constants.KEY_CENTER_HOST, true);
        boolean isAvailable = session.isAvailable();
        if (!isAvailable) {
            intent.putExtra(Constants.KEY_ERROR_CODE, i10);
            intent.putExtra(Constants.KEY_ERROR_DETAIL, str);
        }
        intent.putExtra(Constants.KEY_CONNECT_AVAILABLE, isAvailable);
        intent.putExtra(Constants.KEY_TYPE_INAPP, true);
        this.f3761a.f3757h.notifyListener(intent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public synchronized void m4495a(Context context, int i10, String str, SessionGetCallback sessionGetCallback, long j10) {
        Session m4548a = this.f3762b.m4548a(this, i10);
        if (m4548a != null) {
            ALog.m4785d("awcn.SessionRequest", "Available Session exist!!!", str, new Object[0]);
            if (sessionGetCallback != null) {
                sessionGetCallback.onSessionGetSuccess(m4548a);
            }
            return;
        }
        if (TextUtils.isEmpty(str)) {
            str = C1024i.m4812a(null);
        }
        ALog.m4785d("awcn.SessionRequest", "SessionRequest start", str, "host", this.f3769i, "type", Integer.valueOf(i10));
        if (this.f3764d) {
            ALog.m4785d("awcn.SessionRequest", "session connecting", str, "host", m4493a());
            if (sessionGetCallback != null) {
                if (m4501b() == i10) {
                    RunnableC0894c runnableC0894c = new RunnableC0894c(sessionGetCallback);
                    synchronized (this.f3767g) {
                        this.f3767g.put(sessionGetCallback, runnableC0894c);
                    }
                    ThreadPoolExecutorFactory.submitScheduledTask(runnableC0894c, j10, TimeUnit.MILLISECONDS);
                } else {
                    sessionGetCallback.onSessionGetFail();
                }
            }
            return;
        }
        m4500a(true);
        this.f3771k = ThreadPoolExecutorFactory.submitScheduledTask(new RunnableC0893b(str), 45L, TimeUnit.SECONDS);
        SessionConnStat sessionConnStat = new SessionConnStat();
        this.f3768h = sessionConnStat;
        sessionConnStat.start = System.currentTimeMillis();
        if (!NetworkStatusHelper.isConnected()) {
            if (ALog.isPrintLog(1)) {
                ALog.m4785d("awcn.SessionRequest", "network is not available, can't create session", str, "isConnected", Boolean.valueOf(NetworkStatusHelper.isConnected()));
            }
            m4504c();
            throw new RuntimeException("no network");
        }
        List<IConnStrategy> m4486a = m4486a(i10, str);
        if (!m4486a.isEmpty()) {
            List<C0934a> m4487a = m4487a(m4486a, str);
            try {
                C0934a remove = m4487a.remove(0);
                m4488a(context, remove, new C0892a(context, m4487a, remove), remove.m4579h());
                if (sessionGetCallback != null) {
                    RunnableC0894c runnableC0894c2 = new RunnableC0894c(sessionGetCallback);
                    synchronized (this.f3767g) {
                        this.f3767g.put(sessionGetCallback, runnableC0894c2);
                    }
                    ThreadPoolExecutorFactory.submitScheduledTask(runnableC0894c2, j10, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable unused) {
                m4504c();
            }
            return;
        }
        ALog.m4788i("awcn.SessionRequest", "no avalible strategy, can't create session", str, "host", this.f3769i, "type", Integer.valueOf(i10));
        m4504c();
        throw new NoAvailStrategyException("no avalible strategy");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public void m4503b(boolean z10) {
        ALog.m4785d("awcn.SessionRequest", "closeSessions", this.f3761a.f3752c, "host", this.f3769i, "autoCreate", Boolean.valueOf(z10));
        if (!z10 && this.f3765e != null) {
            this.f3765e.f3743u = false;
            this.f3765e.close(false);
        }
        List<Session> m4550a = this.f3762b.m4550a(this);
        if (m4550a != null) {
            for (Session session : m4550a) {
                if (session != null) {
                    session.close(z10);
                }
            }
        }
    }

    /* renamed from: a */
    void m4496a(Session session) {
        AlarmObject alarmObject = new AlarmObject();
        alarmObject.module = "networkPrefer";
        alarmObject.modulePoint = C3325bt.f14260by;
        alarmObject.arg = this.f3769i;
        alarmObject.isSuccess = true;
        AppMonitor.getInstance().commitAlarm(alarmObject);
        this.f3768h.syncValueFromSession(session);
        SessionConnStat sessionConnStat = this.f3768h;
        sessionConnStat.ret = 1;
        sessionConnStat.totalTime = System.currentTimeMillis() - this.f3768h.start;
        AppMonitor.getInstance().commitStat(this.f3768h);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public int m4501b() {
        Session session = this.f3765e;
        if (session != null) {
            return session.f3732j.getType();
        }
        return -1;
    }

    /* renamed from: b */
    private void m4491b(Session session, int i10, String str) {
        SessionInfo sessionInfo;
        Context context = GlobalAppRuntimeInfo.getContext();
        if (context == null || (sessionInfo = this.f3763c) == null || !sessionInfo.isAccs) {
            return;
        }
        ALog.m4787e("awcn.SessionRequest", "sendConnectInfoToAccsByService", null, new Object[0]);
        try {
            Intent intent = new Intent(Constants.ACTION_RECEIVE);
            intent.setPackage(context.getPackageName());
            intent.setClassName(context, C3197j.msgService);
            intent.putExtra("command", 103);
            intent.putExtra("host", session.getHost());
            intent.putExtra(Constants.KEY_CENTER_HOST, true);
            boolean isAvailable = session.isAvailable();
            if (!isAvailable) {
                intent.putExtra(Constants.KEY_ERROR_CODE, i10);
                intent.putExtra(Constants.KEY_ERROR_DETAIL, str);
            }
            intent.putExtra(Constants.KEY_CONNECT_AVAILABLE, isAvailable);
            intent.putExtra(Constants.KEY_TYPE_INAPP, true);
            if (Build.VERSION.SDK_INT >= 26) {
                context.bindService(intent, new ServiceConnectionC0941h(this, intent, context), 1);
            } else {
                context.startService(intent);
            }
        } catch (Throwable th) {
            ALog.m4786e("awcn.SessionRequest", "sendConnectInfoToAccsByService", null, th, new Object[0]);
        }
    }

    /* renamed from: a */
    void m4497a(Session session, int i10, int i11) {
        if (256 != i10 || i11 == -2613 || i11 == -2601) {
            return;
        }
        AlarmObject alarmObject = new AlarmObject();
        alarmObject.module = "networkPrefer";
        alarmObject.modulePoint = C3325bt.f14260by;
        alarmObject.arg = this.f3769i;
        alarmObject.errorCode = String.valueOf(i11);
        alarmObject.isSuccess = false;
        AppMonitor.getInstance().commitAlarm(alarmObject);
        SessionConnStat sessionConnStat = this.f3768h;
        sessionConnStat.ret = 0;
        sessionConnStat.appendErrorTrace(i11);
        this.f3768h.errorCode = String.valueOf(i11);
        this.f3768h.totalTime = System.currentTimeMillis() - this.f3768h.start;
        this.f3768h.syncValueFromSession(session);
        AppMonitor.getInstance().commitStat(this.f3768h);
    }

    /* renamed from: a */
    private List<IConnStrategy> m4486a(int i10, String str) {
        HttpUrl parse;
        List<IConnStrategy> list = Collections.EMPTY_LIST;
        try {
            parse = HttpUrl.parse(m4493a());
        } catch (Throwable th) {
            ALog.m4786e("awcn.SessionRequest", "", str, th, new Object[0]);
        }
        if (parse == null) {
            return list;
        }
        list = StrategyCenter.getInstance().getConnStrategyListByHost(parse.host());
        if (!list.isEmpty()) {
            boolean equalsIgnoreCase = HttpConstant.HTTPS.equalsIgnoreCase(parse.scheme());
            boolean m4798b = C1018c.m4798b();
            ListIterator<IConnStrategy> listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                IConnStrategy next = listIterator.next();
                ConnType valueOf = ConnType.valueOf(next.getProtocol());
                if (valueOf != null) {
                    if (valueOf.isSSL() == equalsIgnoreCase && (i10 == C0936c.f3885c || valueOf.getType() == i10)) {
                        if (m4798b && C1009d.m4780b(next.getIp())) {
                            listIterator.remove();
                        }
                    }
                    listIterator.remove();
                }
            }
        }
        if (ALog.isPrintLog(1)) {
            ALog.m4785d("awcn.SessionRequest", "[getAvailStrategy]", str, "strategies", list);
        }
        return list;
    }

    /* renamed from: a */
    private List<C0934a> m4487a(List<IConnStrategy> list, String str) {
        if (list.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            IConnStrategy iConnStrategy = list.get(i11);
            int retryTimes = iConnStrategy.getRetryTimes();
            for (int i12 = 0; i12 <= retryTimes; i12++) {
                i10++;
                C0934a c0934a = new C0934a(m4493a(), str + "_" + i10, iConnStrategy);
                c0934a.f3876b = i12;
                c0934a.f3877c = retryTimes;
                arrayList.add(c0934a);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m4488a(Context context, C0934a c0934a, IConnCb iConnCb, String str) {
        ConnType m4574c = c0934a.m4574c();
        if (context != null && !m4574c.isHttpType()) {
            TnetSpdySession tnetSpdySession = new TnetSpdySession(context, c0934a);
            tnetSpdySession.initConfig(this.f3761a.f3753d);
            tnetSpdySession.initSessionInfo(this.f3763c);
            tnetSpdySession.setTnetPublicKey(this.f3761a.f3756g.m4518c(this.f3770j));
            this.f3765e = tnetSpdySession;
        } else {
            this.f3765e = new C0966d(context, c0934a);
        }
        ALog.m4788i("awcn.SessionRequest", "create connection...", str, HttpConstant.HOST, m4493a(), "Type", c0934a.m4574c(), "IP", c0934a.m4572a(), "Port", Integer.valueOf(c0934a.m4573b()), "heartbeat", Integer.valueOf(c0934a.m4578g()), C3384f.f14569aC, this.f3765e);
        m4489a(this.f3765e, iConnCb, System.currentTimeMillis());
        this.f3765e.connect();
        SessionConnStat sessionConnStat = this.f3768h;
        sessionConnStat.retryTimes++;
        sessionConnStat.startConnect = System.currentTimeMillis();
        SessionConnStat sessionConnStat2 = this.f3768h;
        if (sessionConnStat2.retryTimes == 0) {
            sessionConnStat2.putExtra("firstIp", c0934a.m4572a());
        }
    }

    /* renamed from: a */
    private void m4489a(Session session, IConnCb iConnCb, long j10) {
        if (iConnCb == null) {
            return;
        }
        session.registerEventcb(EventType.ALL, new C0937f(this, iConnCb, j10));
        session.registerEventcb(1792, new C0940g(this, session));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m4499a(String str) {
        ALog.m4785d("awcn.SessionRequest", "reCreateSession", str, "host", this.f3769i);
        m4503b(true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m4494a(long j10) {
        ALog.m4785d("awcn.SessionRequest", "[await]", null, "timeoutMs", Long.valueOf(j10));
        if (j10 <= 0) {
            return;
        }
        synchronized (this.f3772l) {
            long currentTimeMillis = System.currentTimeMillis() + j10;
            while (this.f3764d) {
                long currentTimeMillis2 = System.currentTimeMillis();
                if (currentTimeMillis2 >= currentTimeMillis) {
                    break;
                } else {
                    this.f3772l.wait(currentTimeMillis - currentTimeMillis2);
                }
            }
            if (this.f3764d) {
                throw new TimeoutException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m4498a(Session session, int i10, String str) {
        if (AwcnConfig.isSendConnectInfoByService()) {
            m4491b(session, i10, str);
        }
        m4492c(session, i10, str);
    }
}
