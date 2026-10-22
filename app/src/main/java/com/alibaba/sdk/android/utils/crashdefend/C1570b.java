package com.alibaba.sdk.android.utils.crashdefend;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.sdk.android.utils.C1567a;
import com.taobao.accs.common.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* renamed from: com.alibaba.sdk.android.utils.crashdefend.b */
/* loaded from: classes.dex */
public class C1570b {

    /* renamed from: b */
    private static C1570b f6061b;

    /* renamed from: a */
    private C1567a f6062a;

    /* renamed from: a */
    private C1571c f6064a;

    /* renamed from: a */
    private ExecutorService f6066a;
    private Context context;

    /* renamed from: a */
    private C1569a f6063a = new C1569a();

    /* renamed from: a */
    private final List<C1571c> f6065a = new ArrayList();

    /* renamed from: d */
    private Map<String, String> f6068d = new HashMap();

    /* renamed from: a */
    private final int[] f6067a = new int[5];

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.alibaba.sdk.android.utils.crashdefend.b$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: a */
        private C1572d f6069a;

        a(C1572d c1572d) {
            this.f6069a = c1572d;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1572d c1572d;
            int i10;
            do {
                try {
                    Thread.sleep(1000L);
                    c1572d = this.f6069a;
                    i10 = c1572d.f6081d - 1;
                    c1572d.f6081d = i10;
                } catch (InterruptedException unused) {
                    return;
                } catch (Exception e10) {
                    Log.d("UtilsSDK", e10.getMessage(), e10);
                    return;
                }
            } while (i10 > 0);
            if (i10 <= 0) {
                C1570b.this.m7254b(c1572d.f6080b);
                C1573e.m7260a(C1570b.this.context, C1570b.this.f6063a, (List<C1571c>) C1570b.this.f6065a);
            }
        }
    }

    private C1570b(Context context, C1567a c1567a) {
        this.f6066a = null;
        this.context = context;
        this.f6062a = c1567a;
        this.f6066a = new C1574f().m7265a();
        for (int i10 = 0; i10 < 5; i10++) {
            this.f6067a[i10] = (i10 * 5) + 5;
        }
        this.f6068d.put("sdkId", "utils");
        this.f6068d.put(Constants.KEY_SDK_VERSION, "2.0.0");
        try {
            m7247a();
            m7253b();
        } catch (Exception e10) {
            Log.d("UtilsSDK", e10.getMessage(), e10);
        }
    }

    /* renamed from: b */
    public void m7257b(String str, String str2) {
    }

    /* renamed from: b */
    private void m7253b() {
        this.f6064a = null;
        ArrayList arrayList = new ArrayList();
        synchronized (this.f6065a) {
            for (C1571c c1571c : this.f6065a) {
                if (c1571c.crashCount >= c1571c.f6071a) {
                    arrayList.add(c1571c);
                }
            }
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C1571c c1571c2 = (C1571c) it.next();
                if (c1571c2.f6078c < 5) {
                    long j10 = this.f6063a.f6060a - this.f6067a[r3];
                    C1575g.m7266a("UtilsSDK", "after restart " + ((c1571c2.f6072a - j10) + 1) + " times, sdk will be restore");
                    if (c1571c2.f6072a < j10) {
                        this.f6064a = c1571c2;
                        break;
                    }
                } else {
                    Log.i("UtilsSDK", "SDK " + c1571c2.f6074a + " has been closed");
                }
            }
            C1571c c1571c3 = this.f6064a;
            if (c1571c3 == null) {
                Log.i("UtilsSDK", "NO SDK restore");
            } else {
                c1571c3.f6078c++;
                Log.i("UtilsSDK", this.f6064a.f6074a + " will restore --- startSerialNumber:" + this.f6064a.f6072a + "   crashCount:" + this.f6064a.crashCount);
            }
        }
    }

    /* renamed from: a */
    public static synchronized C1570b m7244a(Context context, C1567a c1567a) {
        C1570b c1570b;
        synchronized (C1570b.class) {
            if (f6061b == null) {
                f6061b = new C1570b(context, c1567a);
            }
            c1570b = f6061b;
        }
        return c1570b;
    }

    /* renamed from: a */
    private void m7247a() {
        if (C1573e.m7262a(this.context, this.f6063a, this.f6065a)) {
            this.f6063a.f6060a++;
        } else {
            this.f6063a.f6060a = 1L;
        }
    }

    /* renamed from: a */
    public boolean m7256a(C1571c c1571c, SDKMessageCallback sDKMessageCallback) {
        C1571c m7245a;
        if (c1571c != null && sDKMessageCallback != null) {
            try {
                if (TextUtils.isEmpty(c1571c.f6077b) || TextUtils.isEmpty(c1571c.f6074a) || (m7245a = m7245a(c1571c, sDKMessageCallback)) == null) {
                    return false;
                }
                boolean m7252a = m7252a(m7245a);
                int i10 = m7245a.crashCount;
                int i11 = m7245a.f6071a;
                if (i10 == i11) {
                    m7251a(m7245a.f6074a, m7245a.f6077b, i10, i11);
                }
                m7245a.crashCount++;
                C1573e.m7260a(this.context, this.f6063a, this.f6065a);
                if (m7252a) {
                    m7249a(m7245a);
                    Log.i("UtilsSDK", "START:" + m7245a.f6074a + " --- limit:" + m7245a.f6071a + "  count:" + (m7245a.crashCount - 1) + "  restore:" + m7245a.f6078c + "  startSerialNumber:" + m7245a.f6072a + "  registerSerialNumber:" + m7245a.f6076b);
                } else {
                    sDKMessageCallback.crashDefendMessage(m7245a.f6071a, m7245a.crashCount - 1);
                    Log.i("UtilsSDK", "STOP:" + m7245a.f6074a + " --- limit:" + m7245a.f6071a + "  count:" + (m7245a.crashCount - 1) + "  restore:" + m7245a.f6078c + "  startSerialNumber:" + m7245a.f6072a + "  registerSerialNumber:" + m7245a.f6076b);
                }
                return true;
            } catch (Exception e10) {
                Log.d("UtilsSDK", e10.getMessage(), e10);
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m7254b(C1571c c1571c) {
        if (c1571c == null) {
            return;
        }
        int i10 = c1571c.f6078c;
        if (i10 > 0) {
            m7255b(c1571c.f6074a, c1571c.f6077b, i10, 5);
        }
        c1571c.crashCount = 0;
        c1571c.f6078c = 0;
    }

    /* renamed from: a */
    private C1571c m7245a(C1571c c1571c, SDKMessageCallback sDKMessageCallback) {
        synchronized (this.f6065a) {
            List<C1571c> list = this.f6065a;
            C1571c c1571c2 = null;
            if (list != null && list.size() > 0) {
                Iterator<C1571c> it = this.f6065a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C1571c next = it.next();
                    if (next != null && next.f6074a.equals(c1571c.f6074a)) {
                        if (!next.f6077b.equals(c1571c.f6077b)) {
                            next.f6077b = c1571c.f6077b;
                            next.f6071a = c1571c.f6071a;
                            next.f6075b = c1571c.f6075b;
                            next.crashCount = 0;
                            next.f6078c = 0;
                        }
                        if (next.f6079c) {
                            Log.i("UtilsSDK", "SDK " + c1571c.f6074a + " has been registered");
                            return null;
                        }
                        next.f6079c = true;
                        next.f6073a = sDKMessageCallback;
                        next.f6076b = this.f6063a.f6060a;
                        c1571c2 = next;
                    }
                }
            }
            if (c1571c2 == null) {
                c1571c2 = (C1571c) c1571c.clone();
                c1571c2.f6079c = true;
                c1571c2.f6073a = sDKMessageCallback;
                c1571c2.crashCount = 0;
                c1571c2.f6076b = this.f6063a.f6060a;
                this.f6065a.add(c1571c2);
            }
            return c1571c2;
        }
    }

    /* renamed from: b */
    private void m7255b(String str, String str2, int i10, int i11) {
        if (this.f6062a == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.putAll(this.f6068d);
        hashMap.put("crashSdkId", str);
        hashMap.put("crashSdkVer", str2);
        hashMap.put("recoverCount", String.valueOf(i10));
        hashMap.put("recoverThreshold", String.valueOf(i11));
        this.f6062a.sendCustomHit("utils_biz_recover", 0L, hashMap);
    }

    /* renamed from: a */
    private boolean m7252a(C1571c c1571c) {
        if (c1571c.crashCount < c1571c.f6071a) {
            c1571c.f6072a = c1571c.f6076b;
            return true;
        }
        C1571c c1571c2 = this.f6064a;
        if (c1571c2 == null || !c1571c2.f6074a.equals(c1571c.f6074a)) {
            return false;
        }
        c1571c.crashCount = c1571c.f6071a - 1;
        c1571c.f6072a = c1571c.f6076b;
        return true;
    }

    /* renamed from: a */
    private void m7249a(C1571c c1571c) {
        if (c1571c == null) {
            return;
        }
        C1572d c1572d = new C1572d();
        c1572d.f6080b = c1571c;
        c1572d.f6081d = c1571c.f6075b;
        m7250a(c1572d);
        SDKMessageCallback sDKMessageCallback = c1571c.f6073a;
        if (sDKMessageCallback != null) {
            sDKMessageCallback.crashDefendMessage(c1571c.f6071a, c1571c.crashCount - 1);
        }
    }

    /* renamed from: a */
    private void m7250a(C1572d c1572d) {
        if (c1572d == null || c1572d.f6080b == null) {
            return;
        }
        this.f6066a.execute(new a(c1572d));
    }

    /* renamed from: a */
    private void m7251a(String str, String str2, int i10, int i11) {
        if (this.f6062a == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.putAll(this.f6068d);
        hashMap.put("crashSdkId", str);
        hashMap.put("crashSdkVer", str2);
        hashMap.put("curCrashCount", String.valueOf(i10));
        hashMap.put("crashThreshold", String.valueOf(i11));
        this.f6062a.sendCustomHit("utils_biz_crash", 0L, hashMap);
    }
}
