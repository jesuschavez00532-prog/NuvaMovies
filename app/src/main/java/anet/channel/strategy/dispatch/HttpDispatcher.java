package anet.channel.strategy.dispatch;

import android.text.TextUtils;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.util.ALog;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class HttpDispatcher {

    /* renamed from: a */
    private CopyOnWriteArraySet<IDispatchEventListener> f4117a;

    /* renamed from: b */
    private C0990a f4118b;

    /* renamed from: c */
    private volatile boolean f4119c;

    /* renamed from: d */
    private Set<String> f4120d;

    /* renamed from: e */
    private Set<String> f4121e;

    /* renamed from: f */
    private AtomicBoolean f4122f;

    /* loaded from: classes.dex */
    public interface IDispatchEventListener {
        void onEvent(DispatchEvent dispatchEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: anet.channel.strategy.dispatch.HttpDispatcher$a */
    /* loaded from: classes.dex */
    public static class C0989a {

        /* renamed from: a */
        static HttpDispatcher f4123a = new HttpDispatcher();

        private C0989a() {
        }
    }

    public static HttpDispatcher getInstance() {
        return C0989a.f4123a;
    }

    public static void setInitHosts(List<String> list) {
        if (list != null) {
            DispatchConstants.initHostArray = (String[]) list.toArray(new String[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m4742a(DispatchEvent dispatchEvent) {
        Iterator<IDispatchEventListener> it = this.f4117a.iterator();
        while (it.hasNext()) {
            try {
                it.next().onEvent(dispatchEvent);
            } catch (Exception unused) {
            }
        }
    }

    public synchronized void addHosts(List<String> list) {
        if (list != null) {
            this.f4121e.addAll(list);
            this.f4120d.clear();
        }
    }

    public void addListener(IDispatchEventListener iDispatchEventListener) {
        this.f4117a.add(iDispatchEventListener);
    }

    public synchronized Set<String> getInitHosts() {
        m4741a();
        return new HashSet(this.f4121e);
    }

    public boolean isInitHostsChanged(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        boolean contains = this.f4120d.contains(str);
        if (!contains) {
            this.f4120d.add(str);
        }
        return !contains;
    }

    public void removeListener(IDispatchEventListener iDispatchEventListener) {
        this.f4117a.remove(iDispatchEventListener);
    }

    public void sendAmdcRequest(Set<String> set, int i10) {
        if (this.f4119c && set != null && !set.isEmpty()) {
            if (ALog.isPrintLog(2)) {
                ALog.m4788i("awcn.HttpDispatcher", "sendAmdcRequest", null, DispatchConstants.HOSTS, set.toString());
            }
            HashMap hashMap = new HashMap();
            hashMap.put(DispatchConstants.HOSTS, set);
            hashMap.put(DispatchConstants.CONFIG_VERSION, String.valueOf(i10));
            this.f4118b.m4745a(hashMap);
            return;
        }
        ALog.m4787e("awcn.HttpDispatcher", "invalid parameter", null, new Object[0]);
    }

    public void setEnable(boolean z10) {
        this.f4119c = z10;
    }

    public void switchENV() {
        this.f4120d.clear();
        this.f4121e.clear();
        this.f4122f.set(false);
    }

    private HttpDispatcher() {
        this.f4117a = new CopyOnWriteArraySet<>();
        this.f4118b = new C0990a();
        this.f4119c = true;
        this.f4120d = Collections.newSetFromMap(new ConcurrentHashMap());
        this.f4121e = new TreeSet();
        this.f4122f = new AtomicBoolean();
        m4741a();
    }

    /* renamed from: a */
    private void m4741a() {
        if (this.f4122f.get() || GlobalAppRuntimeInfo.getContext() == null || !this.f4122f.compareAndSet(false, true)) {
            return;
        }
        this.f4121e.add(DispatchConstants.getAmdcServerDomain());
        if (GlobalAppRuntimeInfo.isTargetProcess()) {
            this.f4121e.addAll(Arrays.asList(DispatchConstants.initHostArray));
        }
    }
}
