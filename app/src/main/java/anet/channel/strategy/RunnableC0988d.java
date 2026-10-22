package anet.channel.strategy;

import android.text.TextUtils;
import anet.channel.AwcnConfig;
import anet.channel.util.ALog;
import java.io.File;

/* renamed from: anet.channel.strategy.d */
/* loaded from: classes.dex */
class RunnableC0988d implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f4115a;

    /* renamed from: b */
    final /* synthetic */ StrategyInfoHolder f4116b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0988d(StrategyInfoHolder strategyInfoHolder, String str) {
        this.f4116b = strategyInfoHolder;
        this.f4115a = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            ALog.m4788i("awcn.StrategyInfoHolder", "start loading strategy files", null, new Object[0]);
            long currentTimeMillis = System.currentTimeMillis();
            if (AwcnConfig.isAsyncLoadStrategyEnable()) {
                ALog.m4788i("awcn.StrategyInfoHolder", "load strategy async", null, new Object[0]);
                if (!TextUtils.isEmpty(this.f4115a)) {
                    this.f4116b.m4715a(this.f4115a, true);
                }
                StrategyConfig strategyConfig = (StrategyConfig) C1003m.m4763a("StrategyConfig", null);
                if (strategyConfig != null) {
                    strategyConfig.m4708b();
                    strategyConfig.m4705a(this.f4116b);
                    synchronized (this.f4116b) {
                        this.f4116b.f4092b = strategyConfig;
                    }
                }
            }
            File[] m4768b = C1003m.m4768b();
            if (m4768b == null) {
                return;
            }
            int i10 = 0;
            for (int i11 = 0; i11 < m4768b.length && i10 < 2; i11++) {
                File file = m4768b[i11];
                if (!file.isDirectory()) {
                    String name = file.getName();
                    if (!name.equals(this.f4115a) && !name.startsWith("StrategyConfig")) {
                        this.f4116b.m4715a(name, false);
                        i10++;
                    }
                }
            }
            ALog.m4788i("awcn.StrategyInfoHolder", "end loading strategy files", null, "total cost", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        } catch (Exception unused) {
        }
    }
}
