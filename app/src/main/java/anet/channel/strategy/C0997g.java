package anet.channel.strategy;

import android.content.Context;
import android.text.TextUtils;
import anet.channel.strategy.C0987c;
import anet.channel.strategy.C1002l;
import anet.channel.strategy.dispatch.AmdcRuntimeInfo;
import anet.channel.strategy.dispatch.DispatchEvent;
import anet.channel.strategy.dispatch.HttpDispatcher;
import anet.channel.strategy.utils.C1006a;
import anet.channel.util.ALog;
import anet.channel.util.HttpConstant;
import anet.channel.util.HttpUrl;
import anet.channel.util.StringUtils;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: anet.channel.strategy.g */
/* loaded from: classes.dex */
public class C0997g implements IStrategyInstance, HttpDispatcher.IDispatchEventListener {

    /* renamed from: a */
    boolean f4135a = false;

    /* renamed from: b */
    StrategyInfoHolder f4136b = null;

    /* renamed from: c */
    long f4137c = 0;

    /* renamed from: d */
    CopyOnWriteArraySet<IStrategyListener> f4138d = new CopyOnWriteArraySet<>();

    /* renamed from: e */
    private IStrategyFilter f4139e = new C0998h(this);

    @Override // anet.channel.strategy.IStrategyInstance
    public void forceRefreshStrategy(String str) {
        if (!m4757a() && !TextUtils.isEmpty(str)) {
            ALog.m4788i("awcn.StrategyCenter", "force refresh strategy", null, "host", str);
            this.f4136b.m4718d().m4730a(str, true);
        }
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public String getCNameByHost(String str) {
        if (!m4757a() && !TextUtils.isEmpty(str)) {
            return this.f4136b.m4718d().getCnameByHost(str);
        }
        return null;
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public String getClientIp() {
        if (m4757a()) {
            return "";
        }
        return this.f4136b.m4718d().f4103b;
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public List<IConnStrategy> getConnStrategyListByHost(String str) {
        return getConnStrategyListByHost(str, this.f4139e);
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public String getFormalizeUrl(String str) {
        HttpUrl parse = HttpUrl.parse(str);
        if (parse == null) {
            ALog.m4787e("awcn.StrategyCenter", "url is invalid.", null, "URL", str);
            return null;
        }
        String urlString = parse.urlString();
        try {
            String schemeByHost = getSchemeByHost(parse.host(), parse.scheme());
            if (!schemeByHost.equalsIgnoreCase(parse.scheme())) {
                urlString = StringUtils.concatString(schemeByHost, ":", str.substring(str.indexOf("//")));
            }
            if (ALog.isPrintLog(1)) {
                ALog.m4785d("awcn.StrategyCenter", "", null, "raw", StringUtils.simplifyString(str, 128), "ret", StringUtils.simplifyString(urlString, 128));
            }
        } catch (Exception e10) {
            ALog.m4786e("awcn.StrategyCenter", "getFormalizeUrl failed", null, e10, "raw", str);
        }
        return urlString;
    }

    @Override // anet.channel.strategy.IStrategyInstance
    @Deprecated
    public String getSchemeByHost(String str) {
        return getSchemeByHost(str, null);
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public String getUnitByHost(String str) {
        if (m4757a()) {
            return null;
        }
        return this.f4136b.f4092b.m4707b(str);
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public synchronized void initialize(Context context) {
        if (!this.f4135a && context != null) {
            try {
                ALog.m4788i("awcn.StrategyCenter", "StrategyCenter initialize started.", null, new Object[0]);
                AmdcRuntimeInfo.setContext(context);
                C1003m.m4765a(context);
                HttpDispatcher.getInstance().addListener(this);
                this.f4136b = StrategyInfoHolder.m4709a();
                this.f4135a = true;
                ALog.m4788i("awcn.StrategyCenter", "StrategyCenter initialize finished.", null, new Object[0]);
            } catch (Exception e10) {
                ALog.m4786e("awcn.StrategyCenter", "StrategyCenter initialize failed.", null, e10, new Object[0]);
            }
        }
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public void notifyConnEvent(String str, IConnStrategy iConnStrategy, ConnEvent connEvent) {
        if (!m4757a() && iConnStrategy != null && (iConnStrategy instanceof IPConnStrategy)) {
            IPConnStrategy iPConnStrategy = (IPConnStrategy) iConnStrategy;
            if (iPConnStrategy.f4077b == 1) {
                this.f4136b.f4093c.m4735a(str, connEvent);
            } else if (iPConnStrategy.f4077b == 0) {
                this.f4136b.m4718d().m4729a(str, iConnStrategy, connEvent);
            }
        }
    }

    @Override // anet.channel.strategy.dispatch.HttpDispatcher.IDispatchEventListener
    public void onEvent(DispatchEvent dispatchEvent) {
        if (dispatchEvent.eventType == 1 && this.f4136b != null) {
            ALog.m4785d("awcn.StrategyCenter", "receive amdc event", null, new Object[0]);
            C1002l.d m4761a = C1002l.m4761a((JSONObject) dispatchEvent.extraObject);
            if (m4761a == null) {
                return;
            }
            this.f4136b.m4714a(m4761a);
            saveData();
            Iterator<IStrategyListener> it = this.f4138d.iterator();
            while (it.hasNext()) {
                try {
                    it.next().onStrategyUpdated(m4761a);
                } catch (Exception e10) {
                    ALog.m4786e("awcn.StrategyCenter", "onStrategyUpdated failed", null, e10, new Object[0]);
                }
            }
        }
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public void registerListener(IStrategyListener iStrategyListener) {
        ALog.m4787e("awcn.StrategyCenter", "registerListener", null, "listener", this.f4138d);
        if (iStrategyListener != null) {
            this.f4138d.add(iStrategyListener);
        }
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public synchronized void saveData() {
        ALog.m4788i("awcn.StrategyCenter", "saveData", null, new Object[0]);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f4137c > 30000) {
            this.f4137c = currentTimeMillis;
            C1006a.m4774a(new RunnableC0999i(this), 500L);
        }
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public synchronized void switchEnv() {
        C1003m.m4764a();
        HttpDispatcher.getInstance().switchENV();
        StrategyInfoHolder strategyInfoHolder = this.f4136b;
        if (strategyInfoHolder != null) {
            strategyInfoHolder.m4716b();
            this.f4136b = StrategyInfoHolder.m4709a();
        }
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public void unregisterListener(IStrategyListener iStrategyListener) {
        ALog.m4787e("awcn.StrategyCenter", "unregisterListener", null, "listener", this.f4138d);
        this.f4138d.remove(iStrategyListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public boolean m4757a() {
        if (this.f4136b != null) {
            return false;
        }
        ALog.m4790w("awcn.StrategyCenter", "StrategyCenter not initialized", null, "isInitialized", Boolean.valueOf(this.f4135a));
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006f, code lost:
    
        if (r17.f4136b.m4718d().m4731a(r2, anet.channel.AwcnConfig.getIpv6BlackListTtl()) != false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a7  */
    @Override // anet.channel.strategy.IStrategyInstance
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List<anet.channel.strategy.IConnStrategy> getConnStrategyListByHost(java.lang.String r18, anet.channel.strategy.IStrategyFilter r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            boolean r2 = android.text.TextUtils.isEmpty(r18)
            if (r2 != 0) goto Lc7
            boolean r2 = r17.m4757a()
            if (r2 == 0) goto L12
            goto Lc7
        L12:
            anet.channel.strategy.StrategyInfoHolder r2 = r0.f4136b
            anet.channel.strategy.StrategyTable r2 = r2.m4718d()
            r3 = r18
            java.lang.String r2 = r2.getCnameByHost(r3)
            boolean r4 = android.text.TextUtils.isEmpty(r2)
            if (r4 != 0) goto L25
            goto L26
        L25:
            r2 = r3
        L26:
            anet.channel.strategy.StrategyInfoHolder r3 = r0.f4136b
            anet.channel.strategy.StrategyTable r3 = r3.m4718d()
            java.util.List r3 = r3.queryByHost(r2)
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L3e
            anet.channel.strategy.StrategyInfoHolder r3 = r0.f4136b
            anet.channel.strategy.a r3 = r3.f4093c
            java.util.List r3 = r3.m4733a(r2)
        L3e:
            boolean r4 = r3.isEmpty()
            r5 = 3
            java.lang.String r6 = "result"
            r7 = 2
            java.lang.String r8 = "host"
            r9 = 4
            java.lang.String r11 = "getConnStrategyListByHost"
            java.lang.String r12 = "awcn.StrategyCenter"
            r13 = 0
            r14 = 1
            if (r4 != 0) goto Lb7
            if (r1 != 0) goto L54
            goto Lb7
        L54:
            boolean r4 = anet.channel.AwcnConfig.isIpv6Enable()
            if (r4 == 0) goto L75
            boolean r4 = anet.channel.AwcnConfig.isIpv6BlackListEnable()
            if (r4 == 0) goto L72
            anet.channel.strategy.StrategyInfoHolder r4 = r0.f4136b
            anet.channel.strategy.StrategyTable r4 = r4.m4718d()
            r15 = r11
            long r10 = anet.channel.AwcnConfig.getIpv6BlackListTtl()
            boolean r4 = r4.m4731a(r2, r10)
            if (r4 == 0) goto L73
            goto L76
        L72:
            r15 = r11
        L73:
            r4 = 0
            goto L77
        L75:
            r15 = r11
        L76:
            r4 = 1
        L77:
            java.util.ListIterator r10 = r3.listIterator()
        L7b:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto La1
            java.lang.Object r11 = r10.next()
            anet.channel.strategy.IConnStrategy r11 = (anet.channel.strategy.IConnStrategy) r11
            boolean r16 = r1.accept(r11)
            if (r16 != 0) goto L91
            r10.remove()
            goto L7b
        L91:
            if (r4 == 0) goto L7b
            java.lang.String r11 = r11.getIp()
            boolean r11 = anet.channel.strategy.utils.C1009d.m4780b(r11)
            if (r11 == 0) goto L7b
            r10.remove()
            goto L7b
        La1:
            boolean r1 = anet.channel.util.ALog.isPrintLog(r14)
            if (r1 == 0) goto Lb6
            java.lang.Object[] r1 = new java.lang.Object[r9]
            r1[r13] = r8
            r1[r14] = r2
            r1[r7] = r6
            r1[r5] = r3
            r10 = r15
            r4 = 0
            anet.channel.util.ALog.m4785d(r12, r10, r4, r1)
        Lb6:
            return r3
        Lb7:
            r10 = r11
            r4 = 0
            java.lang.Object[] r1 = new java.lang.Object[r9]
            r1[r13] = r8
            r1[r14] = r2
            r1[r7] = r6
            r1[r5] = r3
            anet.channel.util.ALog.m4785d(r12, r10, r4, r1)
            return r3
        Lc7:
            java.util.List r1 = java.util.Collections.EMPTY_LIST
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.strategy.C0997g.getConnStrategyListByHost(java.lang.String, anet.channel.strategy.IStrategyFilter):java.util.List");
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public String getSchemeByHost(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (m4757a()) {
            return str2;
        }
        String m4704a = this.f4136b.f4092b.m4704a(str);
        if (m4704a != null || TextUtils.isEmpty(str2)) {
            str2 = m4704a;
        }
        if (str2 == null && (str2 = C0987c.a.f4114a.m4738a(str)) == null) {
            str2 = HttpConstant.HTTP;
        }
        ALog.m4785d("awcn.StrategyCenter", "getSchemeByHost", null, "host", str, "scheme", str2);
        return str2;
    }
}
