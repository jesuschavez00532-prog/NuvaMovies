package com.alibaba.sdk.android.httpdns;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.text.TextUtils;
import com.alibaba.sdk.android.httpdns.p047d.C1538b;
import com.alibaba.sdk.android.httpdns.p047d.C1539c;
import com.alibaba.sdk.android.httpdns.p048e.C1541a;
import com.lzy.okgo.OkGo;
import com.raizlabs.android.dbflow.sql.language.Operator;

/* renamed from: com.alibaba.sdk.android.httpdns.n */
/* loaded from: classes.dex */
public class C1550n {

    /* renamed from: a */
    private static volatile C1550n f5970a = null;

    /* renamed from: d */
    private static boolean f5971d = false;

    /* renamed from: e */
    private static long f5972e = 0;

    /* renamed from: g */
    private static String f5973g = "https://";

    /* renamed from: h */
    private static String f5974h;

    /* renamed from: h */
    public static boolean f5975h;

    /* renamed from: c */
    private String f5978c;

    /* renamed from: e */
    private boolean f5980e;

    /* renamed from: e */
    private int f5979e = 0;

    /* renamed from: a */
    private SharedPreferences f5976a = null;

    /* renamed from: f */
    private long f5982f = 0;

    /* renamed from: g */
    private long f5984g = 0;

    /* renamed from: f */
    private int f5981f = 0;

    /* renamed from: f */
    private boolean f5983f = false;

    /* renamed from: g */
    private boolean f5985g = true;

    /* renamed from: i */
    private String f5986i = null;

    /* renamed from: a */
    private Handler f5977a = null;

    private C1550n() {
    }

    /* renamed from: a */
    public static C1550n m7176a() {
        if (f5970a == null) {
            synchronized (C1550n.class) {
                if (f5970a == null) {
                    f5970a = new C1550n();
                }
            }
        }
        return f5970a;
    }

    /* renamed from: e */
    private String m7181e() {
        return (this.f5980e || this.f5983f) ? C1542f.f5951b[this.f5981f] : C1542f.f5950a[this.f5979e];
    }

    /* renamed from: f */
    private void m7183f() {
        int i10 = this.f5981f;
        this.f5981f = i10 < C1542f.f5951b.length + (-1) ? i10 + 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized void m7187b(Context context, String str) {
        try {
            if (str.equals(this.f5986i)) {
                C1545i.m7166e("region should be different");
            } else {
                this.f5986i = str;
                if (System.currentTimeMillis() - this.f5984g >= 300000) {
                    m7179d();
                } else {
                    long currentTimeMillis = 300000 - (System.currentTimeMillis() - this.f5984g);
                    C1545i.m7166e("The call time should be greater than 5 minutes. SDK will initiate an update request after " + (currentTimeMillis / OkGo.DEFAULT_MILLISECONDS) + " minutes.");
                    if (this.f5977a == null) {
                        Handler handler = new Handler();
                        this.f5977a = handler;
                        handler.postDelayed(new Runnable() { // from class: com.alibaba.sdk.android.httpdns.n.1
                            @Override // java.lang.Runnable
                            public void run() {
                                C1550n.this.m7179d();
                            }
                        }, currentTimeMillis);
                    }
                }
                if (this.f5976a == null) {
                    if (context == null) {
                        C1545i.m7167f("sp failed to save, does not affect the current settings");
                        return;
                    }
                    this.f5976a = context.getSharedPreferences("httpdns_config_cache", 0);
                }
                SharedPreferences.Editor edit = this.f5976a.edit();
                edit.putString("httpdns_region", this.f5986i);
                edit.putBoolean("httpdns_first_start", true);
                edit.putLong("schedule_center_last_request_time", 0L);
                edit.commit();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public synchronized void m7188c() {
        CallableC1549m m7173a;
        int length;
        if (System.currentTimeMillis() - this.f5982f >= 300000) {
            C1545i.m7165d("update server ips from StartIp schedule center.");
            this.f5979e = 0;
            this.f5981f = 0;
            this.f5983f = false;
            this.f5985g = true;
            f5975h = false;
            if (this.f5980e) {
                m7173a = CallableC1549m.m7173a();
                length = C1542f.f5951b.length;
            } else {
                m7173a = CallableC1549m.m7173a();
                length = C1542f.f5950a.length;
            }
            m7173a.m7174a(length - 1);
            C1534c.m7102a().submit(CallableC1549m.m7173a());
        } else {
            C1545i.m7165d("update server ips from StartIp schedule center too often, give up. ");
            C1566u.m7239j();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public synchronized String m7190d() {
        StringBuilder sb2;
        String str;
        try {
            sb2 = new StringBuilder();
            sb2.append(f5973g);
            sb2.append(m7181e());
            sb2.append(Operator.Operation.DIVISION);
            String str2 = this.f5978c;
            if (str2 == null) {
                str2 = C1542f.f5952c;
            }
            sb2.append(str2);
            sb2.append("/ss?platform=android&sdk_version=");
            sb2.append("1.3.2.3-no-bssid-ssid");
            sb2.append("&sid=");
            sb2.append(C1541a.m7156a().getSessionId());
            sb2.append("&net=");
            sb2.append(C1541a.m7156a().m7157l());
            if (TextUtils.isEmpty(this.f5986i)) {
                str = "";
            } else {
                str = "&region=" + this.f5986i;
            }
            sb2.append(str);
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
        return sb2.toString();
    }

    public void setAccountId(String str) {
        this.f5978c = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public void m7179d() {
        C1545i.m7165d("update server ips from StartIp schedule center.");
        this.f5984g = System.currentTimeMillis();
        this.f5979e = 0;
        this.f5981f = 0;
        this.f5983f = false;
        this.f5980e = true;
        this.f5985g = true;
        f5975h = false;
        CallableC1549m.m7173a().m7174a(C1542f.f5951b.length - 1);
        C1534c.m7102a().submit(CallableC1549m.m7173a());
        this.f5977a = null;
    }

    /* renamed from: e */
    private void m7182e() {
        int i10 = this.f5979e;
        this.f5979e = i10 < C1542f.f5950a.length + (-1) ? i10 + 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void m7184a(Context context, String str) {
        try {
            if (!f5971d) {
                synchronized (C1550n.class) {
                    if (!f5971d) {
                        setAccountId(str);
                        if (context != null) {
                            this.f5976a = context.getSharedPreferences("httpdns_config_cache", 0);
                        }
                        this.f5980e = this.f5976a.getBoolean("httpdns_first_start", true);
                        f5974h = this.f5976a.getString("httpdns_server_ips", null);
                        this.f5986i = this.f5976a.getString("httpdns_region", null);
                        String str2 = f5974h;
                        if (str2 != null) {
                            C1542f.m7160a(str2.split(";"));
                        }
                        long j10 = this.f5976a.getLong("schedule_center_last_request_time", 0L);
                        f5972e = j10;
                        if (j10 == 0 || System.currentTimeMillis() - f5972e >= 86400000) {
                            C1565t.m7220a().m7223c(false);
                            m7188c();
                        }
                        f5971d = true;
                    }
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public synchronized void m7189c(Throwable th) {
        try {
            f5975h = false;
            m7180d(th);
            if (this.f5980e) {
                m7183f();
            } else {
                if (!this.f5983f) {
                    m7182e();
                }
                if (this.f5979e == 0) {
                    this.f5983f = true;
                    if (this.f5985g) {
                        this.f5985g = false;
                        this.f5981f = 0;
                        C1545i.m7165d("StartIp Scheduler center update from StartIp");
                        CallableC1549m.m7173a().m7174a(C1542f.f5951b.length - 1);
                        C1534c.m7102a().submit(CallableC1549m.m7173a());
                    } else {
                        m7183f();
                        if (this.f5981f == 0) {
                            this.f5982f = System.currentTimeMillis();
                            C1545i.m7167f("StartIp Scheduler center update failed");
                            C1566u.m7239j();
                        }
                    }
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* renamed from: d */
    private void m7180d(Throwable th) {
        try {
            C1538b m7126a = C1538b.m7126a();
            if (m7126a != null) {
                int m7147a = C1539c.m7147a(th);
                m7126a.m7132a(m7190d(), String.valueOf(m7147a), th.getMessage(), C1539c.m7146a());
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void m7185a(C1553o c1553o, long j10) {
        try {
            m7178a(m7190d(), j10);
            this.f5979e = 0;
            this.f5981f = 0;
            this.f5983f = false;
            this.f5985g = true;
            HttpDns.switchDnsService(c1553o.isEnabled());
            if (m7186a(c1553o.m7197b())) {
                C1545i.m7165d("StartIp Scheduler center update success    StartIp isFirstStart：" + this.f5980e);
                f5975h = true;
                this.f5982f = System.currentTimeMillis();
                C1566u.m7238i();
                if (this.f5980e) {
                    SharedPreferences.Editor edit = this.f5976a.edit();
                    edit.putBoolean("httpdns_first_start", false);
                    edit.commit();
                    this.f5980e = false;
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* renamed from: a */
    private void m7178a(String str, long j10) {
        try {
            C1538b m7126a = C1538b.m7126a();
            if (m7126a != null) {
                m7126a.m7130a(str, j10, C1539c.m7146a());
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* renamed from: a */
    synchronized boolean m7186a(String[] strArr) {
        try {
            if (!C1542f.m7160a(strArr)) {
                return false;
            }
            StringBuilder sb2 = new StringBuilder();
            for (String str : strArr) {
                sb2.append(str);
                sb2.append(";");
            }
            sb2.deleteCharAt(sb2.length() - 1);
            SharedPreferences sharedPreferences = this.f5976a;
            if (sharedPreferences == null) {
                return false;
            }
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putString("httpdns_server_ips", sb2.toString());
            edit.putLong("schedule_center_last_request_time", System.currentTimeMillis());
            edit.commit();
            return true;
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }
}
