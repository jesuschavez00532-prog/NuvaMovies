package com.taobao.accs.p073ut.monitor;

import android.content.Context;
import android.text.TextUtils;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.statist.Dimension;
import anet.channel.statist.Measure;
import anet.channel.statist.Monitor;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.p072b.C3119a;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.BaseMonitor;
import com.taobao.accs.utl.UtilityImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.android.agoo.common.AgooConstants;

/* loaded from: classes.dex */
public class TrafficsMonitor {

    /* renamed from: d */
    private Context f13142d;

    /* renamed from: a */
    private Map<String, List<C3187a>> f13139a = new HashMap();

    /* renamed from: b */
    private Map<String, String> f13140b = new HashMap<String, String>() { // from class: com.taobao.accs.ut.monitor.TrafficsMonitor.1
        {
            put("im", "512");
            put("motu", "513");
            put("acds", "514");
            put(GlobalClientInfo.AGOO_SERVICE_ID, "515");
            put(AgooConstants.AGOO_SERVICE_AGOOACK, "515");
            put("agooTokenReport", "515");
            put("accsSelf", "1000");
        }
    };

    /* renamed from: c */
    private int f13141c = 0;

    /* renamed from: e */
    private String f13143e = "";

    @Monitor(module = "NetworkSDK", monitorPoint = "TrafficStats")
    /* loaded from: classes.dex */
    public static class StatTrafficMonitor extends BaseMonitor {

        @Dimension
        public String bizId;

        @Dimension
        public String date;

        @Dimension
        public String host;

        @Dimension
        public boolean isBackground;

        @Dimension
        public String serviceId;

        @Measure
        public long size;
    }

    public TrafficsMonitor(Context context) {
        this.f13142d = context;
    }

    /* renamed from: b */
    private void m12934b() {
        String str;
        boolean z10;
        synchronized (this.f13139a) {
            String m12953a = UtilityImpl.m12953a(System.currentTimeMillis());
            if (!TextUtils.isEmpty(this.f13143e) && !this.f13143e.equals(m12953a)) {
                str = this.f13143e;
                z10 = true;
            } else {
                str = m12953a;
                z10 = false;
            }
            Iterator<String> it = this.f13139a.keySet().iterator();
            while (it.hasNext()) {
                for (C3187a c3187a : this.f13139a.get(it.next())) {
                    if (c3187a != null) {
                        C3119a m12706a = C3119a.m12706a(this.f13142d);
                        String str2 = c3187a.f13149e;
                        String str3 = c3187a.f13147c;
                        m12706a.m12711a(str2, str3, this.f13140b.get(str3), c3187a.f13148d, c3187a.f13150f, str);
                    }
                }
            }
            ALog.Level level = ALog.Level.D;
            if (ALog.isPrintLog(level)) {
                ALog.m12938d("TrafficsMonitor", "savetoDay:" + str + " saveTraffics" + this.f13139a.toString(), new Object[0]);
            }
            if (z10) {
                this.f13139a.clear();
                m12935c();
            } else if (ALog.isPrintLog(level)) {
                ALog.m12938d("TrafficsMonitor", "no need commit lastsaveDay:" + this.f13143e + " currday:" + m12953a, new Object[0]);
            }
            this.f13143e = m12953a;
            this.f13141c = 0;
        }
    }

    /* renamed from: c */
    private void m12935c() {
        List<C3187a> m12709a = C3119a.m12706a(this.f13142d).m12709a(false);
        if (m12709a == null) {
            return;
        }
        try {
            for (C3187a c3187a : m12709a) {
                if (c3187a != null) {
                    StatTrafficMonitor statTrafficMonitor = new StatTrafficMonitor();
                    statTrafficMonitor.bizId = c3187a.f13146b;
                    statTrafficMonitor.date = c3187a.f13145a;
                    statTrafficMonitor.host = c3187a.f13149e;
                    statTrafficMonitor.isBackground = c3187a.f13148d;
                    statTrafficMonitor.size = c3187a.f13150f;
                    AppMonitor.getInstance().commitStat(statTrafficMonitor);
                }
            }
            C3119a.m12706a(this.f13142d).m12710a();
        } catch (Throwable th) {
            ALog.m12940e("", th.toString(), new Object[0]);
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public void m12937a(C3187a c3187a) {
        boolean z10;
        String str;
        if (c3187a == null || c3187a.f13149e == null || c3187a.f13150f <= 0) {
            return;
        }
        c3187a.f13147c = TextUtils.isEmpty(c3187a.f13147c) ? "accsSelf" : c3187a.f13147c;
        synchronized (this.f13139a) {
            String str2 = this.f13140b.get(c3187a.f13147c);
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            c3187a.f13146b = str2;
            ALog.isPrintLog(ALog.Level.D);
            List<C3187a> list = this.f13139a.get(str2);
            if (list != null) {
                Iterator<C3187a> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z10 = true;
                        break;
                    }
                    C3187a next = it.next();
                    if (next.f13148d == c3187a.f13148d && (str = next.f13149e) != null && str.equals(c3187a.f13149e)) {
                        next.f13150f += c3187a.f13150f;
                        z10 = false;
                        break;
                    }
                }
                if (z10) {
                    list.add(c3187a);
                }
            } else {
                list = new ArrayList<>();
                list.add(c3187a);
            }
            this.f13139a.put(str2, list);
            int i10 = this.f13141c + 1;
            this.f13141c = i10;
            if (i10 >= 10) {
                m12934b();
            }
        }
    }

    /* renamed from: com.taobao.accs.ut.monitor.TrafficsMonitor$a */
    /* loaded from: classes.dex */
    public static class C3187a {

        /* renamed from: a */
        String f13145a;

        /* renamed from: b */
        String f13146b;

        /* renamed from: c */
        String f13147c;

        /* renamed from: d */
        boolean f13148d;

        /* renamed from: e */
        String f13149e;

        /* renamed from: f */
        long f13150f;

        public C3187a(String str, boolean z10, String str2, long j10) {
            this.f13147c = str;
            this.f13148d = z10;
            this.f13149e = str2;
            this.f13150f = j10;
        }

        public String toString() {
            return "date:" + this.f13145a + " bizId:" + this.f13146b + " serviceId:" + this.f13147c + " host:" + this.f13149e + " isBackground:" + this.f13148d + " size:" + this.f13150f;
        }

        public C3187a(String str, String str2, String str3, boolean z10, String str4, long j10) {
            this.f13145a = str;
            this.f13146b = str2;
            this.f13147c = str3;
            this.f13148d = z10;
            this.f13149e = str4;
            this.f13150f = j10;
        }
    }

    /* renamed from: a */
    public void m12936a() {
        try {
            synchronized (this.f13139a) {
                this.f13139a.clear();
            }
            List<C3187a> m12709a = C3119a.m12706a(this.f13142d).m12709a(true);
            if (m12709a == null) {
                return;
            }
            Iterator<C3187a> it = m12709a.iterator();
            while (it.hasNext()) {
                m12937a(it.next());
            }
        } catch (Exception e10) {
            ALog.m12944w("TrafficsMonitor", e10.toString(), new Object[0]);
        }
    }
}
