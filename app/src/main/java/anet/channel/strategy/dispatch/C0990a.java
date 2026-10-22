package anet.channel.strategy.dispatch;

import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.utils.C1006a;
import anet.channel.util.ALog;
import com.youth.banner.BannerConfig;
import java.util.Map;
import java.util.Random;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: anet.channel.strategy.dispatch.a */
/* loaded from: classes.dex */
public class C0990a {
    public static final String TAG = "awcn.AmdcThreadPoolExecutor";

    /* renamed from: b */
    private static Random f4124b = new Random();

    /* renamed from: a */
    private Map<String, Object> f4125a;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: anet.channel.strategy.dispatch.a$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: b */
        private Map<String, Object> f4127b;

        a(Map<String, Object> map) {
            this.f4127b = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            Map<String, Object> map;
            try {
                Map<String, Object> map2 = this.f4127b;
                if (map2 == null) {
                    synchronized (C0990a.class) {
                        map = C0990a.this.f4125a;
                        C0990a.this.f4125a = null;
                    }
                    map2 = map;
                }
                if (!NetworkStatusHelper.isConnected()) {
                    return;
                }
                if (GlobalAppRuntimeInfo.getEnv() != map2.get("Env")) {
                    ALog.m4790w(C0990a.TAG, "task's env changed", null, new Object[0]);
                } else {
                    C0991b.m4752a(C0993d.m4755a(map2));
                }
            } catch (Exception e10) {
                ALog.m4786e(C0990a.TAG, "exec amdc task failed.", null, e10, new Object[0]);
            }
        }

        a() {
        }
    }

    /* renamed from: a */
    public void m4745a(Map<String, Object> map) {
        try {
            map.put("Env", GlobalAppRuntimeInfo.getEnv());
            synchronized (this) {
                Map<String, Object> map2 = this.f4125a;
                if (map2 == null) {
                    this.f4125a = map;
                    int nextInt = f4124b.nextInt(3000) + BannerConfig.TIME;
                    ALog.m4788i(TAG, "merge amdc request", null, "delay", Integer.valueOf(nextInt));
                    C1006a.m4774a(new a(), nextInt);
                } else {
                    Set set = (Set) map2.get(DispatchConstants.HOSTS);
                    Set set2 = (Set) map.get(DispatchConstants.HOSTS);
                    if (map.get("Env") != this.f4125a.get("Env")) {
                        this.f4125a = map;
                    } else if (set.size() + set2.size() <= 40) {
                        set2.addAll(set);
                        this.f4125a = map;
                    } else {
                        C1006a.m4773a(new a(map));
                    }
                }
            }
        } catch (Exception unused) {
        }
    }
}
