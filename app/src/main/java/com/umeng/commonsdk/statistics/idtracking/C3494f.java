package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import android.text.TextUtils;
import com.taobao.accs.common.Constants;
import com.umeng.analytics.pro.C3309bd;
import com.umeng.analytics.pro.C3343ck;
import com.umeng.analytics.pro.C3349cq;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.common.HelperUtils;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.statistics.proto.C3512a;
import com.umeng.commonsdk.statistics.proto.C3513b;
import com.umeng.commonsdk.statistics.proto.C3514c;
import com.umeng.commonsdk.utils.C3520d;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.umeng.commonsdk.statistics.idtracking.f */
/* loaded from: classes3.dex */
public class C3494f {

    /* renamed from: a */
    public static final long f15461a = 86400000;

    /* renamed from: b */
    public static C3494f f15462b;

    /* renamed from: c */
    private static final String f15463c = C3309bd.m13860b().m13863b("id");

    /* renamed from: j */
    private static Object f15464j = new Object();

    /* renamed from: d */
    private File f15465d;

    /* renamed from: f */
    private long f15467f;

    /* renamed from: i */
    private a f15470i;

    /* renamed from: e */
    private C3514c f15466e = null;

    /* renamed from: h */
    private Set<AbstractC3489a> f15469h = new HashSet();

    /* renamed from: g */
    private long f15468g = 86400000;

    /* renamed from: com.umeng.commonsdk.statistics.idtracking.f$a */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a */
        private Context f15471a;

        /* renamed from: b */
        private Set<String> f15472b = new HashSet();

        public a(Context context) {
            this.f15471a = context;
        }

        /* renamed from: a */
        public synchronized boolean m14892a(String str) {
            return !this.f15472b.contains(str);
        }

        /* renamed from: b */
        public synchronized void m14894b(String str) {
            this.f15472b.add(str);
        }

        /* renamed from: c */
        public void m14895c(String str) {
            this.f15472b.remove(str);
        }

        /* renamed from: a */
        public synchronized void m14891a() {
            if (!this.f15472b.isEmpty()) {
                StringBuilder sb2 = new StringBuilder();
                Iterator<String> it = this.f15472b.iterator();
                while (it.hasNext()) {
                    sb2.append(it.next());
                    sb2.append(',');
                }
                sb2.deleteCharAt(sb2.length() - 1);
                PreferenceWrapper.getDefault(this.f15471a).edit().putString("invld_id", sb2.toString()).commit();
            }
        }

        /* renamed from: b */
        public synchronized void m14893b() {
            String[] split;
            String string = PreferenceWrapper.getDefault(this.f15471a).getString("invld_id", null);
            if (!TextUtils.isEmpty(string) && (split = string.split(",")) != null) {
                for (String str : split) {
                    if (!TextUtils.isEmpty(str)) {
                        this.f15472b.add(str);
                    }
                }
            }
        }
    }

    C3494f(Context context) {
        this.f15470i = null;
        this.f15465d = new File(context.getFilesDir(), f15463c);
        a aVar = new a(context);
        this.f15470i = aVar;
        aVar.m14893b();
    }

    /* renamed from: a */
    public static synchronized void m14878a() {
        synchronized (C3494f.class) {
            C3494f c3494f = f15462b;
            if (c3494f != null) {
                c3494f.m14888e();
                f15462b = null;
            }
        }
    }

    /* renamed from: h */
    private synchronized void m14882h() {
        C3514c c3514c = new C3514c();
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (AbstractC3489a abstractC3489a : this.f15469h) {
            if (abstractC3489a.m14873c()) {
                if (abstractC3489a.m14874d() != null) {
                    hashMap.put(abstractC3489a.m14872b(), abstractC3489a.m14874d());
                }
                if (abstractC3489a.m14875e() != null && !abstractC3489a.m14875e().isEmpty()) {
                    arrayList.addAll(abstractC3489a.m14875e());
                }
            }
        }
        c3514c.m15009a(arrayList);
        c3514c.m15010a(hashMap);
        synchronized (this) {
            this.f15466e = c3514c;
        }
    }

    /* renamed from: i */
    private C3514c m14883i() {
        Throwable th;
        FileInputStream fileInputStream;
        synchronized (f15464j) {
            if (!this.f15465d.exists()) {
                return null;
            }
            try {
                fileInputStream = new FileInputStream(this.f15465d);
                try {
                    try {
                        byte[] readStreamToByteArray = HelperUtils.readStreamToByteArray(fileInputStream);
                        C3514c c3514c = new C3514c();
                        new C3343ck().m14084a(c3514c, readStreamToByteArray);
                        HelperUtils.safeClose(fileInputStream);
                        return c3514c;
                    } catch (Exception e10) {
                        e = e10;
                        e.printStackTrace();
                        HelperUtils.safeClose(fileInputStream);
                        return null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    HelperUtils.safeClose(fileInputStream);
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
                fileInputStream = null;
            } catch (Throwable th3) {
                th = th3;
                fileInputStream = null;
                HelperUtils.safeClose(fileInputStream);
                throw th;
            }
        }
    }

    /* renamed from: b */
    public synchronized void m14885b() {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f15467f >= this.f15468g) {
            boolean z10 = false;
            for (AbstractC3489a abstractC3489a : this.f15469h) {
                if (abstractC3489a.m14873c() && abstractC3489a.m14871a()) {
                    if (!abstractC3489a.m14873c()) {
                        this.f15470i.m14894b(abstractC3489a.m14872b());
                    }
                    z10 = true;
                }
            }
            if (z10) {
                m14882h();
                this.f15470i.m14891a();
                m14890g();
            }
            this.f15467f = currentTimeMillis;
        }
    }

    /* renamed from: c */
    public synchronized C3514c m14886c() {
        return this.f15466e;
    }

    /* renamed from: d */
    public String m14887d() {
        return null;
    }

    /* renamed from: e */
    public synchronized void m14888e() {
        if (f15462b == null) {
            return;
        }
        boolean z10 = false;
        for (AbstractC3489a abstractC3489a : this.f15469h) {
            if (abstractC3489a.m14873c() && abstractC3489a.m14875e() != null && !abstractC3489a.m14875e().isEmpty()) {
                abstractC3489a.m14870a((List<C3512a>) null);
                z10 = true;
            }
        }
        if (z10) {
            this.f15466e.m15015b(false);
            m14890g();
        }
    }

    /* renamed from: f */
    public synchronized void m14889f() {
        C3514c m14883i = m14883i();
        if (m14883i == null) {
            return;
        }
        m14879a(m14883i);
        ArrayList arrayList = new ArrayList(this.f15469h.size());
        synchronized (this) {
            this.f15466e = m14883i;
            for (AbstractC3489a abstractC3489a : this.f15469h) {
                abstractC3489a.m14869a(this.f15466e);
                if (!abstractC3489a.m14873c()) {
                    arrayList.add(abstractC3489a);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.f15469h.remove((AbstractC3489a) it.next());
            }
            m14882h();
        }
    }

    /* renamed from: g */
    public synchronized void m14890g() {
        C3514c c3514c = this.f15466e;
        if (c3514c != null) {
            m14881b(c3514c);
        }
    }

    /* renamed from: a */
    public static synchronized C3494f m14877a(Context context) {
        C3494f c3494f;
        synchronized (C3494f.class) {
            if (f15462b == null) {
                C3494f c3494f2 = new C3494f(context);
                f15462b = c3494f2;
                c3494f2.m14880a(new C3495g(context));
                f15462b.m14880a(new C3490b(context));
                f15462b.m14880a(new C3499k(context));
                f15462b.m14880a(new C3493e(context));
                f15462b.m14880a(new C3492d(context));
                f15462b.m14880a(new C3496h(context));
                f15462b.m14880a(new C3498j());
                if (FieldManager.allow(C3520d.f15636G)) {
                    f15462b.m14880a(new C3497i(context));
                    if (DeviceConfig.isHonorDevice()) {
                        f15462b.m14880a(new C3491c(context));
                    }
                }
                f15462b.m14889f();
            }
            c3494f = f15462b;
        }
        return c3494f;
    }

    /* renamed from: b */
    private void m14881b(C3514c c3514c) {
        byte[] m14096a;
        synchronized (f15464j) {
            if (c3514c != null) {
                try {
                    synchronized (this) {
                        m14879a(c3514c);
                        m14096a = new C3349cq().m14096a(c3514c);
                    }
                    if (m14096a != null) {
                        HelperUtils.writeFile(this.f15465d, m14096a);
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
        }
    }

    /* renamed from: a */
    private boolean m14880a(AbstractC3489a abstractC3489a) {
        if (this.f15470i.m14892a(abstractC3489a.m14872b())) {
            return this.f15469h.add(abstractC3489a);
        }
        if (!AnalyticsConstants.UM_DEBUG) {
            return false;
        }
        MLog.m14783w("invalid domain: " + abstractC3489a.m14872b());
        return false;
    }

    /* renamed from: a */
    public void m14884a(long j10) {
        this.f15468g = j10;
    }

    /* renamed from: a */
    private void m14879a(C3514c c3514c) {
        Map<String, C3513b> map;
        if (c3514c == null || (map = c3514c.f15557a) == null) {
            return;
        }
        if (map.containsKey("mac") && !FieldManager.allow(C3520d.f15686h)) {
            c3514c.f15557a.remove("mac");
        }
        if (c3514c.f15557a.containsKey(Constants.KEY_IMEI) && !FieldManager.allow(C3520d.f15685g)) {
            c3514c.f15557a.remove(Constants.KEY_IMEI);
        }
        if (c3514c.f15557a.containsKey("android_id") && !FieldManager.allow(C3520d.f15687i)) {
            c3514c.f15557a.remove("android_id");
        }
        if (c3514c.f15557a.containsKey("serial") && !FieldManager.allow(C3520d.f15688j)) {
            c3514c.f15557a.remove("serial");
        }
        if (c3514c.f15557a.containsKey("idfa") && !FieldManager.allow(C3520d.f15701w)) {
            c3514c.f15557a.remove("idfa");
        }
        if (!c3514c.f15557a.containsKey("oaid") || FieldManager.allow(C3520d.f15636G)) {
            return;
        }
        c3514c.f15557a.remove("oaid");
    }
}
