package anet.channel.strategy;

import android.text.TextUtils;
import anet.channel.strategy.C1002l;
import anet.channel.strategy.utils.C1009d;
import anet.channel.strategy.utils.SerialLruCache;
import anet.channel.util.ALog;
import anet.channel.util.HttpConstant;
import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class StrategyConfig implements Serializable {
    public static final String NO_RESULT = "No_Result";

    /* renamed from: a */
    private SerialLruCache<String, String> f4088a = null;

    /* renamed from: b */
    private Map<String, String> f4089b = null;

    /* renamed from: c */
    private transient StrategyInfoHolder f4090c = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public StrategyConfig m4703a() {
        StrategyConfig strategyConfig = new StrategyConfig();
        synchronized (this) {
            strategyConfig.f4088a = new SerialLruCache<>(this.f4088a, 256);
            strategyConfig.f4089b = new ConcurrentHashMap(this.f4089b);
            strategyConfig.f4090c = this.f4090c;
        }
        return strategyConfig;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m4708b() {
        if (this.f4088a == null) {
            this.f4088a = new SerialLruCache<>(256);
        }
        if (this.f4089b == null) {
            this.f4089b = new ConcurrentHashMap();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public String m4707b(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this) {
            str2 = this.f4089b.get(str);
        }
        return str2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m4705a(StrategyInfoHolder strategyInfoHolder) {
        this.f4090c = strategyInfoHolder;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m4706a(C1002l.d dVar) {
        if (dVar.f4170b == null) {
            return;
        }
        synchronized (this) {
            TreeMap treeMap = null;
            int i10 = 0;
            while (true) {
                C1002l.b[] bVarArr = dVar.f4170b;
                if (i10 >= bVarArr.length) {
                    break;
                }
                C1002l.b bVar = bVarArr[i10];
                if (bVar.f4164j) {
                    this.f4088a.remove(bVar.f4155a);
                } else if (bVar.f4158d != null) {
                    if (treeMap == null) {
                        treeMap = new TreeMap();
                    }
                    treeMap.put(bVar.f4155a, bVar.f4158d);
                } else {
                    if (!HttpConstant.HTTP.equalsIgnoreCase(bVar.f4157c) && !HttpConstant.HTTPS.equalsIgnoreCase(bVar.f4157c)) {
                        this.f4088a.put(bVar.f4155a, NO_RESULT);
                    } else {
                        this.f4088a.put(bVar.f4155a, bVar.f4157c);
                    }
                    if (!TextUtils.isEmpty(bVar.f4159e)) {
                        this.f4089b.put(bVar.f4155a, bVar.f4159e);
                    } else {
                        this.f4089b.remove(bVar.f4155a);
                    }
                }
                i10++;
            }
            if (treeMap != null) {
                for (Map.Entry entry : treeMap.entrySet()) {
                    String str = (String) entry.getValue();
                    if (this.f4088a.containsKey(str)) {
                        this.f4088a.put(entry.getKey(), this.f4088a.get(str));
                    } else {
                        this.f4088a.put(entry.getKey(), NO_RESULT);
                    }
                }
            }
        }
        if (ALog.isPrintLog(1)) {
            ALog.m4785d("awcn.StrategyConfig", "", null, "SchemeMap", this.f4088a.toString());
            ALog.m4785d("awcn.StrategyConfig", "", null, "UnitMap", this.f4089b.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public String m4704a(String str) {
        String str2;
        if (TextUtils.isEmpty(str) || !C1009d.m4781c(str)) {
            return null;
        }
        synchronized (this) {
            str2 = this.f4088a.get(str);
            if (str2 == null) {
                this.f4088a.put(str, NO_RESULT);
            }
        }
        if (str2 == null) {
            this.f4090c.m4718d().m4730a(str, false);
        } else if (NO_RESULT.equals(str2)) {
            return null;
        }
        return str2;
    }
}
