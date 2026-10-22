package anet.channel;

import android.content.Intent;
import android.text.TextUtils;
import anet.channel.entity.ConnType;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.IStrategyInstance;
import anet.channel.strategy.StrategyCenter;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import anet.channel.util.HttpConstant;
import anet.channel.util.StringUtils;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class AccsSessionManager {

    /* renamed from: c */
    private static CopyOnWriteArraySet<ISessionListener> f3672c = new CopyOnWriteArraySet<>();

    /* renamed from: a */
    SessionCenter f3673a;

    /* renamed from: b */
    Set<String> f3674b = Collections.EMPTY_SET;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AccsSessionManager(SessionCenter sessionCenter) {
        this.f3673a = null;
        this.f3673a = sessionCenter;
    }

    /* renamed from: b */
    private boolean m4465b() {
        if ((GlobalAppRuntimeInfo.isAppBackground() && AwcnConfig.isAccsSessionCreateForbiddenInBg()) || !NetworkStatusHelper.isConnected()) {
            return false;
        }
        return true;
    }

    public synchronized void checkAndStartSession() {
        String str;
        Collection<SessionInfo> m4514a = this.f3673a.f3756g.m4514a();
        Set<String> set = Collections.EMPTY_SET;
        if (!m4514a.isEmpty()) {
            set = new TreeSet<>();
        }
        for (SessionInfo sessionInfo : m4514a) {
            if (sessionInfo.isKeepAlive) {
                IStrategyInstance strategyCenter = StrategyCenter.getInstance();
                String str2 = sessionInfo.host;
                if (sessionInfo.isAccs) {
                    str = HttpConstant.HTTPS;
                } else {
                    str = HttpConstant.HTTP;
                }
                set.add(StringUtils.concatString(strategyCenter.getSchemeByHost(str2, str), HttpConstant.SCHEME_SPLIT, sessionInfo.host));
            }
        }
        for (String str3 : this.f3674b) {
            if (!set.contains(str3)) {
                m4464a(str3);
            }
        }
        if (!m4465b()) {
            return;
        }
        for (String str4 : set) {
            try {
                this.f3673a.get(str4, ConnType.TypeLevel.SPDY, 0L);
            } catch (Exception unused) {
                ALog.m4787e("start session failed", null, "host", str4);
            }
        }
        this.f3674b = set;
    }

    public synchronized void forceCloseSession(boolean z10) {
        if (ALog.isPrintLog(1)) {
            ALog.m4785d("awcn.AccsSessionManager", "forceCloseSession", this.f3673a.f3752c, "reCreate", Boolean.valueOf(z10));
        }
        Iterator<String> it = this.f3674b.iterator();
        while (it.hasNext()) {
            m4464a(it.next());
        }
        if (z10) {
            checkAndStartSession();
        }
    }

    public void notifyListener(Intent intent) {
        ThreadPoolExecutorFactory.submitScheduledTask(new RunnableC0895a(this, intent));
    }

    public void registerListener(ISessionListener iSessionListener) {
        if (iSessionListener != null) {
            f3672c.add(iSessionListener);
        }
    }

    public void unregisterListener(ISessionListener iSessionListener) {
        f3672c.remove(iSessionListener);
    }

    /* renamed from: a */
    private void m4464a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ALog.m4785d("awcn.AccsSessionManager", "closeSessions", this.f3673a.f3752c, "host", str);
        this.f3673a.m4482a(str).m4503b(false);
    }
}
