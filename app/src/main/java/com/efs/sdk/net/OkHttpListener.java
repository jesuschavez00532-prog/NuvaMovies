package com.efs.sdk.net;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.efs.sdk.base.EfsReporter;
import com.efs.sdk.base.core.controller.ControllerCenter;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.core.util.ProcessUtil;
import com.efs.sdk.base.integrationtesting.IntegrationTestingUtil;
import com.efs.sdk.base.protocol.record.EfsJSONLog;
import com.efs.sdk.base.samplingwhitelist.SamplingWhiteListUtil;
import com.efs.sdk.net.p057a.C1755a;
import com.efs.sdk.net.p057a.C1765b;
import com.efs.sdk.net.p057a.C1766c;
import com.efs.sdk.net.p057a.C1767d;
import com.efs.sdk.net.p059b.C1768a;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.Call;
import okhttp3.Connection;
import okhttp3.EventListener;
import okhttp3.Handshake;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import org.android.agoo.message.MessageService;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class OkHttpListener extends EventListener {

    /* renamed from: a */
    private static AtomicInteger f7338a = new AtomicInteger(0);

    /* renamed from: b */
    private String f7339b;

    /* renamed from: c */
    private boolean f7340c;

    /* renamed from: d */
    private List f7341d = new ArrayList();

    /* renamed from: a */
    private void m7835a(String str) {
        Map<String, Long> map;
        try {
            C1767d m7841c = C1755a.m7837a().m7841c(this.f7339b);
            if (m7841c == null || (map = m7841c.f7410E) == null) {
                return;
            }
            map.put(str, Long.valueOf(System.currentTimeMillis()));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: b */
    private void m7836b() {
        String str;
        try {
            final C1767d m7841c = C1755a.m7837a().m7841c(this.f7339b);
            final C1766c m7839a = C1755a.m7837a().m7839a(this.f7339b);
            if (m7841c != null && m7839a != null) {
                Map<String, Long> map = m7841c.f7410E;
                Map<String, Long> map2 = m7841c.f7411F;
                Log.m7730i("NetTrace-Listener", m7839a.toString());
                if (!TextUtils.isEmpty(m7841c.f7407B)) {
                    final EfsJSONLog efsJSONLog = new EfsJSONLog("netperf");
                    if (map.containsKey(C1767d.f7383d)) {
                        efsJSONLog.put("wd_dns", map.get(C1767d.f7383d));
                    }
                    if (map.containsKey(C1767d.f7384e)) {
                        efsJSONLog.put("wd_dnstm", map.get(C1767d.f7384e));
                    }
                    if (map2.containsKey(C1767d.f7399t)) {
                        efsJSONLog.put("wl_dns", map2.get(C1767d.f7399t));
                    }
                    if (map.containsKey(C1767d.f7385f)) {
                        efsJSONLog.put("wd_tcp", map.get(C1767d.f7385f));
                    }
                    if (map.containsKey(C1767d.f7388i)) {
                        efsJSONLog.put("wd_tcptm", map.get(C1767d.f7388i));
                    }
                    if (map2.containsKey(C1767d.f7401v)) {
                        efsJSONLog.put("wl_tcp", map2.get(C1767d.f7401v));
                    }
                    if (map.containsKey(C1767d.f7386g)) {
                        efsJSONLog.put("wd_ssl", map.get(C1767d.f7386g));
                    }
                    if (map.containsKey(C1767d.f7387h)) {
                        efsJSONLog.put("wd_ssltm", map.get(C1767d.f7387h));
                    }
                    if (map2.containsKey(C1767d.f7400u)) {
                        efsJSONLog.put("wl_ssl", map2.get(C1767d.f7400u));
                    }
                    if (map.containsKey(C1767d.f7390k)) {
                        efsJSONLog.put("wd_ds", map.get(C1767d.f7390k));
                    }
                    if (map.containsKey(C1767d.f7393n)) {
                        efsJSONLog.put("wd_dstm", map.get(C1767d.f7393n));
                    }
                    if (map2.containsKey(C1767d.f7402w) && map2.containsKey(C1767d.f7403x)) {
                        efsJSONLog.put("wl_ds", Long.valueOf(map2.get(C1767d.f7402w).longValue() + map2.get(C1767d.f7403x).longValue()));
                    }
                    if (map.containsKey(C1767d.f7394o)) {
                        efsJSONLog.put("wd_srt", map.get(C1767d.f7394o));
                    }
                    if (map.containsKey(C1767d.f7397r)) {
                        efsJSONLog.put("wd_srttm", map.get(C1767d.f7397r));
                    }
                    if (map2.containsKey(C1767d.f7404y) && map2.containsKey(C1767d.f7405z)) {
                        efsJSONLog.put("wl_srt", Long.valueOf(map2.get(C1767d.f7404y).longValue() + map2.get(C1767d.f7405z).longValue()));
                    }
                    String[] split = m7841c.f7407B.split("\\?");
                    if (split != null) {
                        str = split[0];
                    } else {
                        str = null;
                    }
                    List list = this.f7341d;
                    if (list != null && str != null && !list.contains(str)) {
                        this.f7341d.add(str);
                        if (map.containsKey(C1767d.f7393n)) {
                            efsJSONLog.put("wd_ttfb", map.get(C1767d.f7393n));
                        } else if (map.containsKey(C1767d.f7391l)) {
                            efsJSONLog.put("wd_ttfb", map.get(C1767d.f7391l));
                        }
                        if (map.containsKey(C1767d.f7394o)) {
                            efsJSONLog.put("wd_ttfbtm", map.get(C1767d.f7394o));
                        }
                        if (map.containsKey(C1767d.f7394o)) {
                            if (map.containsKey(C1767d.f7393n)) {
                                efsJSONLog.put("wl_ttfb", Long.valueOf(map.get(C1767d.f7394o).longValue() - map.get(C1767d.f7393n).longValue()));
                            } else if (map.containsKey(C1767d.f7391l)) {
                                efsJSONLog.put("wl_ttfb", Long.valueOf(map.get(C1767d.f7394o).longValue() - map.get(C1767d.f7391l).longValue()));
                            }
                        }
                    } else {
                        efsJSONLog.put("wd_ttfb", 0);
                        efsJSONLog.put("wd_ttfbtm", 0);
                        efsJSONLog.put("wl_ttfb", 0);
                    }
                    if (map.containsKey(C1767d.f7380a)) {
                        efsJSONLog.put("wd_rt", map.get(C1767d.f7380a));
                    }
                    if (map.containsKey(C1767d.f7381b)) {
                        efsJSONLog.put("wd_rttm", map.get(C1767d.f7381b));
                    }
                    if (map2.containsKey(C1767d.f7398s)) {
                        efsJSONLog.put("wl_rt", map2.get(C1767d.f7398s));
                    }
                    efsJSONLog.put("wk_res", m7839a.f7372c);
                    efsJSONLog.put("wk_res_ori", m7841c.f7407B);
                    efsJSONLog.put("wk_ip", m7841c.f7408C);
                    efsJSONLog.put("wk_method", m7839a.f7374e);
                    efsJSONLog.put("wk_rc", Integer.valueOf(m7839a.f7377h));
                    efsJSONLog.put("wl_up", Long.valueOf(m7839a.f7375f));
                    efsJSONLog.put("wl_down", Long.valueOf(m7839a.f7379j));
                    efsJSONLog.put("wl_total", Long.valueOf(m7839a.f7375f + m7839a.f7379j));
                    C1765b.m7860a(new Runnable() { // from class: com.efs.sdk.net.OkHttpListener.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            try {
                                try {
                                    if (NetManager.getNetConfigManager().getNetRequestBodyCollectState() && !TextUtils.isEmpty(m7839a.f7376g)) {
                                        String str2 = "";
                                        if (m7841c.f7410E.containsKey(C1767d.f7380a)) {
                                            str2 = String.valueOf(m7841c.f7410E.get(C1767d.f7380a));
                                        }
                                        efsJSONLog.put("wk_bd", C1768a.m7863a(C1768a.m7865a(m7839a.f7376g.getBytes(), C1768a.m7862a(str2 + ControllerCenter.getGlobalEnvStruct().getAppid() + ControllerCenter.getGlobalEnvStruct().getSecret()).getBytes())));
                                    }
                                } catch (Throwable th) {
                                    th.printStackTrace();
                                }
                                OkHttpListener.m7834a(m7841c, m7839a, efsJSONLog);
                            } catch (Throwable th2) {
                                th2.printStackTrace();
                            }
                        }
                    });
                    C1755a.m7837a().m7842d(this.f7339b);
                    C1755a.m7837a().m7840b(this.f7339b);
                    return;
                }
                Log.m7722d("NetTrace-Listener", "url is null.");
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static EventListener.Factory get() {
        return new EventListener.Factory() { // from class: com.efs.sdk.net.OkHttpListener.1
            @Override // okhttp3.EventListener.Factory
            public final EventListener create(Call call) {
                return new OkHttpListener();
            }
        };
    }

    @Override // okhttp3.EventListener
    public void callEnd(Call call) {
        super.callEnd(call);
        try {
            Log.m7722d("NetTrace-Listener", "callEnd");
            if (!this.f7340c && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.m7722d("NetTrace-Listener", "callEnd net enable false.");
                return;
            }
            m7835a(C1767d.f7381b);
            m7832a();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // okhttp3.EventListener
    public void callFailed(Call call, IOException iOException) {
        super.callFailed(call, iOException);
        try {
            Log.m7722d("NetTrace-Listener", "callFailed");
            if (!this.f7340c && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.m7722d("NetTrace-Listener", "callFailed net enable false.");
                return;
            }
            m7835a(C1767d.f7382c);
            m7832a();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // okhttp3.EventListener
    public void callStart(Call call) {
        super.callStart(call);
        try {
            Log.m7722d("NetTrace-Listener", "callStart");
            if (NetManager.getNetConfigManager() != null && NetManager.getNetConfigManager().enableTracer()) {
                this.f7340c = true;
            }
            if (!this.f7340c && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.m7722d("NetTrace-Listener", "callStart net enable false.");
                return;
            }
            this.f7339b = String.valueOf(f7338a.getAndIncrement());
            Log.m7730i("NetTrace-Listener", "requestId is" + this.f7339b);
            m7835a(C1767d.f7380a);
            String httpUrl = call.request().url().toString();
            try {
                C1767d m7841c = C1755a.m7837a().m7841c(this.f7339b);
                if (m7841c != null) {
                    m7841c.f7407B = httpUrl;
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    @Override // okhttp3.EventListener
    public void connectEnd(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
        super.connectEnd(call, inetSocketAddress, proxy, protocol);
        try {
            Log.m7722d("NetTrace-Listener", "connectEnd");
            if (!this.f7340c && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.m7722d("NetTrace-Listener", "connectEnd net enable false.");
                return;
            }
            m7835a(C1767d.f7388i);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // okhttp3.EventListener
    public void connectFailed(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol, IOException iOException) {
        super.connectFailed(call, inetSocketAddress, proxy, protocol, iOException);
        try {
            Log.m7722d("NetTrace-Listener", "connectFailed");
            if (!this.f7340c && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.m7722d("NetTrace-Listener", "connectFailed net enable false.");
                return;
            }
            m7835a(C1767d.f7389j);
            m7832a();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // okhttp3.EventListener
    public void connectStart(Call call, InetSocketAddress inetSocketAddress, Proxy proxy) {
        super.connectStart(call, inetSocketAddress, proxy);
        try {
            Log.m7722d("NetTrace-Listener", "connectStart");
            if (!this.f7340c && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.m7722d("NetTrace-Listener", "connectStart net enable false.");
                return;
            }
            m7835a(C1767d.f7385f);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // okhttp3.EventListener
    public void connectionAcquired(Call call, Connection connection) {
        super.connectionAcquired(call, connection);
        try {
            Log.m7722d("NetTrace-Listener", "connectionAcquired");
            if (!this.f7340c && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.m7722d("NetTrace-Listener", "callStart net enable false.");
                return;
            }
            InetAddress inetAddress = connection.socket().getInetAddress();
            if (inetAddress != null) {
                String hostAddress = inetAddress.getHostAddress();
                try {
                    C1767d m7841c = C1755a.m7837a().m7841c(this.f7339b);
                    if (m7841c != null) {
                        m7841c.f7408C = hostAddress;
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    @Override // okhttp3.EventListener
    public void dnsEnd(Call call, String str, List<InetAddress> list) {
        super.dnsEnd(call, str, list);
        try {
            Log.m7722d("NetTrace-Listener", "dnsEnd");
            if (!this.f7340c && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.m7722d("NetTrace-Listener", "dnsEnd net enable false.");
                return;
            }
            m7835a(C1767d.f7384e);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // okhttp3.EventListener
    public void dnsStart(Call call, String str) {
        super.dnsStart(call, str);
        try {
            Log.m7722d("NetTrace-Listener", "dnsStart");
            if (!this.f7340c && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.m7722d("NetTrace-Listener", "dnsStart net enable false.");
                return;
            }
            m7835a(C1767d.f7383d);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // okhttp3.EventListener
    public void requestBodyEnd(Call call, long j10) {
        super.requestBodyEnd(call, j10);
        try {
            Log.m7722d("NetTrace-Listener", "requestBodyEnd");
            call.request().body();
            if (!this.f7340c && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.m7722d("NetTrace-Listener", "requestBodyEnd net enable false.");
                return;
            }
            m7835a(C1767d.f7393n);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // okhttp3.EventListener
    public void requestBodyStart(Call call) {
        super.requestBodyStart(call);
        try {
            Log.m7722d("NetTrace-Listener", "requestBodyStart");
            if (!this.f7340c && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.m7722d("NetTrace-Listener", "requestBodyStart net enable false.");
                return;
            }
            m7835a(C1767d.f7392m);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // okhttp3.EventListener
    public void requestHeadersEnd(Call call, Request request) {
        super.requestHeadersEnd(call, request);
        try {
            Log.m7722d("NetTrace-Listener", "requestHeadersEnd");
            if (!this.f7340c && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.m7722d("NetTrace-Listener", "requestHeadersEnd net enable false.");
                return;
            }
            m7835a(C1767d.f7391l);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // okhttp3.EventListener
    public void requestHeadersStart(Call call) {
        super.requestHeadersStart(call);
        try {
            Log.m7722d("NetTrace-Listener", "requestHeadersStart");
            if (!this.f7340c && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.m7722d("NetTrace-Listener", "requestHeadersStart net enable false.");
                return;
            }
            m7835a(C1767d.f7390k);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // okhttp3.EventListener
    public void responseBodyEnd(Call call, long j10) {
        super.responseBodyEnd(call, j10);
        try {
            Log.m7722d("NetTrace-Listener", "responseBodyEnd");
            if (!this.f7340c && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.m7722d("NetTrace-Listener", "responseBodyEnd net enable false.");
                return;
            }
            m7835a(C1767d.f7397r);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // okhttp3.EventListener
    public void responseBodyStart(Call call) {
        super.responseBodyStart(call);
        try {
            Log.m7722d("NetTrace-Listener", "responseBodyStart");
            if (!this.f7340c && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.m7722d("NetTrace-Listener", "responseBodyStart net enable false.");
                return;
            }
            m7835a(C1767d.f7396q);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // okhttp3.EventListener
    public void responseHeadersEnd(Call call, Response response) {
        super.responseHeadersEnd(call, response);
        try {
            Log.m7722d("NetTrace-Listener", "responseHeadersEnd");
            if (!this.f7340c && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.m7722d("NetTrace-Listener", "responseHeadersEnd net enable false.");
                return;
            }
            m7835a(C1767d.f7395p);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // okhttp3.EventListener
    public void responseHeadersStart(Call call) {
        super.responseHeadersStart(call);
        try {
            Log.m7722d("NetTrace-Listener", "responseHeadersStart");
            if (!this.f7340c && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.m7722d("NetTrace-Listener", "responseHeadersStart net enable false.");
                return;
            }
            m7835a(C1767d.f7394o);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // okhttp3.EventListener
    public void secureConnectEnd(Call call, Handshake handshake) {
        super.secureConnectEnd(call, handshake);
        try {
            Log.m7722d("NetTrace-Listener", "secureConnectEnd");
            if (!this.f7340c && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.m7722d("NetTrace-Listener", "secureConnectEnd net enable false.");
                return;
            }
            m7835a(C1767d.f7387h);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // okhttp3.EventListener
    public void secureConnectStart(Call call) {
        super.secureConnectStart(call);
        try {
            Log.m7722d("NetTrace-Listener", "secureConnectStart");
            if (!this.f7340c && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.m7722d("NetTrace-Listener", "secureConnectStart net enable false.");
                return;
            }
            m7835a(C1767d.f7386g);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    private void m7832a() {
        try {
            C1767d m7841c = C1755a.m7837a().m7841c(this.f7339b);
            if (m7841c != null) {
                Map<String, Long> map = m7841c.f7410E;
                Map<String, Long> map2 = m7841c.f7411F;
                map2.put(C1767d.f7398s, Long.valueOf(C1768a.m7861a(map, C1767d.f7380a, C1767d.f7381b)));
                map2.put(C1767d.f7399t, Long.valueOf(C1768a.m7861a(map, C1767d.f7383d, C1767d.f7384e)));
                map2.put(C1767d.f7400u, Long.valueOf(C1768a.m7861a(map, C1767d.f7386g, C1767d.f7387h)));
                map2.put(C1767d.f7401v, Long.valueOf(C1768a.m7861a(map, C1767d.f7385f, C1767d.f7388i)));
                map2.put(C1767d.f7402w, Long.valueOf(C1768a.m7861a(map, C1767d.f7390k, C1767d.f7391l)));
                map2.put(C1767d.f7403x, Long.valueOf(C1768a.m7861a(map, C1767d.f7392m, C1767d.f7393n)));
                map2.put(C1767d.f7404y, Long.valueOf(C1768a.m7861a(map, C1767d.f7394o, C1767d.f7395p)));
                map2.put(C1767d.f7405z, Long.valueOf(C1768a.m7861a(map, C1767d.f7396q, C1767d.f7397r)));
                m7836b();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    private static void m7833a(EfsJSONLog efsJSONLog) {
        try {
            EfsReporter reporter = NetManager.getReporter();
            if (reporter != null) {
                reporter.send(efsJSONLog);
                if (SamplingWhiteListUtil.isHitWL()) {
                    return;
                }
                SharedPreferences sharedPreferences = ControllerCenter.getGlobalEnvStruct().mAppContext.getSharedPreferences("net_launch" + ProcessUtil.getCurrentProcessName(), 0);
                String format = new SimpleDateFormat("yyyy-MM-dd", Locale.CHINA).format(new Date(System.currentTimeMillis()));
                if (sharedPreferences != null) {
                    int i10 = sharedPreferences.getInt(format, 0);
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    if (edit != null) {
                        edit.putInt(format, i10 + 1);
                        edit.apply();
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private static String m7831a(Map<String, String> map, boolean z10, boolean z11) {
        try {
            StringBuilder sb2 = new StringBuilder();
            if (!SamplingWhiteListUtil.isHitWL()) {
                sb2.append(MessageService.MSG_DB_READY_REPORT);
            } else {
                sb2.append("1");
            }
            sb2.append("|");
            sb2.append(NetManager.getNetConfigManager().getExtraRateFlag());
            if (map.size() == 0) {
                sb2.append("|0");
            } else if (z10) {
                sb2.append("|0");
            } else if (z11) {
                sb2.append("|1");
            } else {
                sb2.append("|0");
            }
            sb2.append("|");
            sb2.append(new JSONObject(map).toString());
            return C1768a.m7863a(C1768a.m7865a(sb2.toString().getBytes(), ControllerCenter.getGlobalEnvStruct().getSecret().getBytes()));
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x012b, code lost:
    
        if (java.util.regex.Pattern.matches(r12, r16.f7407B) != false) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x015f A[Catch: all -> 0x0189, TryCatch #2 {all -> 0x0189, blocks: (B:23:0x008d, B:46:0x0094, B:48:0x00a4, B:51:0x00ab, B:53:0x00b1, B:55:0x00bd, B:57:0x00c9, B:59:0x00d2, B:63:0x00e3, B:64:0x011a, B:67:0x012d, B:70:0x0137, B:75:0x015f, B:77:0x0174, B:80:0x0145, B:82:0x014f, B:86:0x0103, B:87:0x0125, B:91:0x0179), top: B:22:0x008d }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0174 A[SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ void m7834a(com.efs.sdk.net.p057a.C1767d r16, com.efs.sdk.net.p057a.C1766c r17, com.efs.sdk.base.protocol.record.EfsJSONLog r18) {
        /*
            Method dump skipped, instructions count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.efs.sdk.net.OkHttpListener.m7834a(com.efs.sdk.net.a.d, com.efs.sdk.net.a.c, com.efs.sdk.base.protocol.record.EfsJSONLog):void");
    }
}
