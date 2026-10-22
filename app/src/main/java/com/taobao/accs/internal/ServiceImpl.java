package com.taobao.accs.internal;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Process;
import android.text.TextUtils;
import com.lzy.okgo.cache.CacheEntity;
import com.raizlabs.android.dbflow.sql.language.Operator;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.client.C3131a;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;
import com.taobao.accs.common.ThreadPoolExecutorFactory;
import com.taobao.accs.data.C3142g;
import com.taobao.accs.data.Message;
import com.taobao.accs.net.AbstractC3156a;
import com.taobao.accs.net.C3166k;
import com.taobao.accs.net.C3177v;
import com.taobao.accs.p073ut.p074a.C3183c;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.BaseMonitor;
import com.taobao.accs.utl.C3198k;
import com.taobao.accs.utl.C3204q;
import com.taobao.accs.utl.UTMini;
import com.taobao.accs.utl.UtilityImpl;
import com.umeng.ccg.C3417a;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.android.agoo.message.MessageService;
import org.android.agoo.service.IMessageService;

/* loaded from: classes.dex */
public class ServiceImpl extends AbstractC3152d {

    /* renamed from: b */
    private Service f12963b;

    /* renamed from: c */
    private Context f12964c;

    /* renamed from: d */
    private long f12965d;

    /* renamed from: e */
    private String f12966e;

    /* renamed from: f */
    private final IMessageService.Stub f12967f;

    /* renamed from: com.taobao.accs.internal.ServiceImpl$1 */
    /* loaded from: classes.dex */
    class BinderC31481 extends IMessageService.Stub {
        BinderC31481() {
        }

        @Override // org.android.agoo.service.IMessageService
        public boolean ping() {
            return true;
        }

        @Override // org.android.agoo.service.IMessageService
        public void probe() {
            ALog.m12938d("ServiceImpl", "ReceiverImpl probeTaoBao begin......messageServiceBinder [probe]", new Object[0]);
            ThreadPoolExecutorFactory.execute(new RunnableC3153e(this));
        }
    }

    public ServiceImpl(Service service) {
        super(service);
        this.f12963b = null;
        this.f12966e = "unknown";
        this.f12967f = new BinderC31481();
        this.f12963b = service;
        this.f12964c = service.getApplicationContext();
    }

    /* renamed from: b */
    private void m12827b(Intent intent) {
        Message message;
        Message.ReqType reqType;
        URL url;
        Message buildRequest;
        int intExtra = intent.getIntExtra("command", -1);
        ALog.m12941i("ServiceImpl", "handleCommand", "command", Integer.valueOf(intExtra));
        String stringExtra = intent.getStringExtra(Constants.KEY_PACKAGE_NAME);
        String stringExtra2 = intent.getStringExtra(Constants.KEY_SERVICE_ID);
        String stringExtra3 = intent.getStringExtra(Constants.KEY_USER_ID);
        String stringExtra4 = intent.getStringExtra(Constants.KEY_APP_KEY);
        String stringExtra5 = intent.getStringExtra(Constants.KEY_CONFIG_TAG);
        String stringExtra6 = intent.getStringExtra(Constants.KEY_TTID);
        intent.getStringExtra("sid");
        intent.getStringExtra(Constants.KEY_ANTI_BRUSH_COOKIE);
        if (intExtra == 201) {
            m12824a(Message.BuildPing(true, 0), true);
            m12829d();
        }
        if (intExtra <= 0 || TextUtils.isEmpty(stringExtra)) {
            return;
        }
        AbstractC3156a m12835b = AbstractC3152d.m12835b(this.f12964c, stringExtra5, true);
        if (m12835b == null) {
            ALog.m12940e("ServiceImpl", "no connection", Constants.KEY_CONFIG_TAG, stringExtra5, "command", Integer.valueOf(intExtra));
            return;
        }
        m12835b.mo12840a();
        if (intExtra != 1) {
            message = null;
            if (intExtra == 2) {
                ALog.m12940e("ServiceImpl", "onHostStartCommand COMMAND_UNBIND_APP", new Object[0]);
                if (m12835b.m12864j().m12743d(stringExtra)) {
                    Message buildUnbindApp = Message.buildUnbindApp(m12835b.mo12849b((String) null), stringExtra);
                    ALog.m12941i("ServiceImpl", stringExtra + " isAppUnbinded", new Object[0]);
                    m12835b.m12853b(buildUnbindApp, 200);
                    return;
                }
            } else if (intExtra == 5) {
                message = Message.buildBindService(m12835b.mo12849b((String) null), stringExtra2);
            } else if (intExtra == 6) {
                message = Message.buildUnbindService(stringExtra, stringExtra2);
            } else if (intExtra == 3) {
                message = Message.buildBindUser(stringExtra, stringExtra3);
                if (m12835b.m12864j().m12741b(stringExtra, stringExtra3) && !intent.getBooleanExtra(Constants.KEY_FOUCE_BIND, false)) {
                    ALog.m12941i("ServiceImpl", stringExtra + Operator.Operation.DIVISION + stringExtra3 + " isUserBinded", new Object[0]);
                    if (message != null) {
                        m12835b.m12853b(message, 200);
                        return;
                    }
                    return;
                }
            } else if (intExtra == 4) {
                message = Message.buildUnbindUser(stringExtra);
            } else if (intExtra == 100) {
                byte[] byteArrayExtra = intent.getByteArrayExtra("data");
                String stringExtra7 = intent.getStringExtra(Constants.KEY_DATA_ID);
                String stringExtra8 = intent.getStringExtra("target");
                String stringExtra9 = intent.getStringExtra(Constants.KEY_BUSINESSID);
                String stringExtra10 = intent.getStringExtra(Constants.KEY_EXT_TAG);
                try {
                    reqType = (Message.ReqType) intent.getSerializableExtra(Constants.KEY_SEND_TYPE);
                } catch (Exception unused) {
                    reqType = null;
                }
                if (byteArrayExtra != null) {
                    try {
                        url = new URL("https://" + ((C3177v) m12835b).m12919p());
                    } catch (MalformedURLException e10) {
                        e10.printStackTrace();
                        url = null;
                    }
                    ACCSManager.AccsRequest accsRequest = new ACCSManager.AccsRequest(stringExtra3, stringExtra2, byteArrayExtra, stringExtra7, stringExtra8, url, stringExtra9);
                    accsRequest.setTag(stringExtra10);
                    if (reqType == null) {
                        buildRequest = Message.buildSendData(m12835b.mo12849b((String) null), stringExtra5, m12835b.f12986i.getStoreId(), this.f12964c, stringExtra, accsRequest, false);
                    } else if (reqType == Message.ReqType.REQ) {
                        buildRequest = Message.buildRequest(this.f12964c, m12835b.mo12849b((String) null), stringExtra5, m12835b.f12986i.getStoreId(), stringExtra, Constants.TARGET_SERVICE_PRE, accsRequest, false);
                    }
                    message = buildRequest;
                }
            } else if (intExtra == 106) {
                intent.setAction(Constants.ACTION_RECEIVE);
                intent.putExtra("command", -1);
                C3142g.m12797a().m12808b(this.f12964c, intent);
                return;
            }
        } else {
            if (!stringExtra.equals(this.f12964c.getPackageName())) {
                ALog.m12940e("ServiceImpl", "handleCommand bindapp pkg error", new Object[0]);
                return;
            }
            message = Message.buildBindApp(this.f12964c, stringExtra5, stringExtra4, intent.getStringExtra("app_sercet"), stringExtra, stringExtra6, intent.getStringExtra("appVersion"));
            m12835b.f12978a = stringExtra6;
            if (m12835b.m12864j().m12742c(stringExtra) && !intent.getBooleanExtra(Constants.KEY_FOUCE_BIND, false)) {
                ALog.m12941i("ServiceImpl", stringExtra + " isAppBinded", new Object[0]);
                m12835b.m12853b(message, 200);
                return;
            }
        }
        if (message != null) {
            ALog.m12938d("ServiceImpl", "try send message", new Object[0]);
            if (message.getNetPermanceMonitor() != null) {
                message.getNetPermanceMonitor().onSend();
            }
            m12835b.m12854b(message, true);
            return;
        }
        ALog.m12940e("ServiceImpl", "message is null", new Object[0]);
        m12835b.m12853b(Message.buildParameterError(stringExtra, intExtra), -2);
    }

    /* renamed from: c */
    private void m12828c() {
        ConcurrentHashMap<String, AbstractC3156a> concurrentHashMap = AbstractC3152d.f12972a;
        if (concurrentHashMap != null && concurrentHashMap.size() != 0) {
            Iterator<Map.Entry<String, AbstractC3156a>> it = AbstractC3152d.f12972a.entrySet().iterator();
            while (it.hasNext()) {
                it.next().getValue().mo12850b();
            }
        }
    }

    /* renamed from: d */
    private void m12829d() {
        ConcurrentHashMap<String, AbstractC3156a> concurrentHashMap = AbstractC3152d.f12972a;
        if (concurrentHashMap != null && concurrentHashMap.size() != 0) {
            Iterator<Map.Entry<String, AbstractC3156a>> it = AbstractC3152d.f12972a.entrySet().iterator();
            while (it.hasNext()) {
                C3183c mo12855c = it.next().getValue().mo12855c();
                if (mo12855c != null) {
                    mo12855c.f13107h = this.f12965d;
                    mo12855c.m12930a();
                }
            }
        }
    }

    /* renamed from: e */
    private void m12830e() {
        ConcurrentHashMap<String, AbstractC3156a> concurrentHashMap = AbstractC3152d.f12972a;
        if (concurrentHashMap != null && concurrentHashMap.size() != 0) {
            Iterator<Map.Entry<String, AbstractC3156a>> it = AbstractC3152d.f12972a.entrySet().iterator();
            while (it.hasNext()) {
                it.next().getValue().mo12859e();
            }
        }
    }

    @Override // com.taobao.accs.internal.AbstractC3152d, com.taobao.accs.base.IBaseService
    public IBinder onBind(Intent intent) {
        String action = intent.getAction();
        ALog.m12938d("ServiceImpl", "accs probeTaoBao begin......action=" + action, new Object[0]);
        if (!TextUtils.isEmpty(action) && TextUtils.equals(action, "org.agoo.android.intent.action.PING_V4")) {
            UTMini.getInstance().commitEvent(66001, "probeChannelService", UtilityImpl.m12986j(this.f12964c), intent.getStringExtra("source"));
            return this.f12967f;
        }
        return null;
    }

    @Override // com.taobao.accs.internal.AbstractC3152d, com.taobao.accs.base.IBaseService
    public void onCreate() {
        super.onCreate();
        m12822a();
    }

    @Override // com.taobao.accs.internal.AbstractC3152d, com.taobao.accs.base.IBaseService
    public void onDestroy() {
        super.onDestroy();
        ALog.m12940e("ServiceImpl", "Service onDestroy", new Object[0]);
        UtilityImpl.m12959a(this.f12964c, Constants.SP_KEY_SERVICE_END, System.currentTimeMillis());
        this.f12963b = null;
        this.f12964c = null;
        m12830e();
        Process.killProcess(Process.myPid());
    }

    @Override // com.taobao.accs.internal.AbstractC3152d, com.taobao.accs.base.IBaseService
    public boolean onUnbind(Intent intent) {
        return false;
    }

    @Override // com.taobao.accs.internal.AbstractC3152d
    /* renamed from: a */
    public int mo12831a(Intent intent) {
        String action;
        Bundle extras;
        if (ALog.isPrintLog(ALog.Level.I)) {
            ALog.m12941i("ServiceImpl", "onHostStartCommand", "intent", intent);
        }
        try {
            if (ALog.isPrintLog(ALog.Level.D) && intent != null && (extras = intent.getExtras()) != null) {
                for (String str : extras.keySet()) {
                    ALog.m12938d("ServiceImpl", "onHostStartCommand", CacheEntity.KEY, str, " value", extras.get(str));
                }
            }
            int m13026c = C3204q.m13026c();
            if (m13026c > 3) {
                ALog.m12940e("ServiceImpl", "onHostStartCommand load SO fail 4 times, don't auto restart", new Object[0]);
                C3198k.m13010a("accs", BaseMonitor.COUNT_POINT_SOFAIL, UtilityImpl.m12952a(m13026c), 0.0d);
            }
            action = intent == null ? null : intent.getAction();
        } finally {
            try {
                return 2;
            } finally {
            }
        }
        if (TextUtils.isEmpty(action)) {
            m12826b();
            m12825a(false, false);
            return 2;
        }
        m12823a(intent, action);
        return 2;
    }

    /* renamed from: a */
    private void m12822a() {
        ALog.m12938d("ServiceImpl", "init start", new Object[0]);
        GlobalClientInfo.getInstance(this.f12964c);
        C3131a.f12862f.incrementAndGet();
        this.f12965d = System.currentTimeMillis();
        this.f12966e = UtilityImpl.m12983h(this.f12964c);
        if (ALog.isPrintLog(ALog.Level.I)) {
            ALog.m12941i("ServiceImpl", "init", Constants.KEY_SDK_VERSION, Integer.valueOf(Constants.SDK_VERSION_CODE), "procStart", Integer.valueOf(C3131a.f12862f.intValue()));
        }
        UTMini.getInstance().commitEvent(66001, "START", UtilityImpl.m12982h(), "PROXY");
        long m12988k = UtilityImpl.m12988k(this.f12964c);
        ALog.m12938d("ServiceImpl", "getServiceAliveTime", "aliveTime", Long.valueOf(m12988k));
        if (m12988k > 20000) {
            C3198k.m13010a("accs", BaseMonitor.COUNT_SERVICE_ALIVE, "", m12988k / 1000);
        }
        UtilityImpl.m12959a(this.f12964c, Constants.SP_KEY_SERVICE_START, System.currentTimeMillis());
        UTMini.getInstance().commitEvent(66001, "NOTIFY", UtilityImpl.m12993o(this.f12964c));
    }

    /* renamed from: a */
    private void m12823a(Intent intent, String str) {
        ALog.m12938d("ServiceImpl", "handleAction", C3417a.f15001w, str);
        try {
            if (!TextUtils.isEmpty(str) && "org.agoo.android.intent.action.PING_V4".equals(str)) {
                String stringExtra = intent.getStringExtra("source");
                ALog.m12941i("ServiceImpl", "org.agoo.android.intent.action.PING_V4,start channel by brothers", "serviceStart", Integer.valueOf(C3131a.f12862f.intValue()), "source" + stringExtra);
                C3198k.m13010a("accs", "startChannel", stringExtra, 0.0d);
                if (C3131a.m12734c()) {
                    C3198k.m13010a("accs", "createChannel", stringExtra, 0.0d);
                }
            }
            m12826b();
            if (TextUtils.equals(str, "android.intent.action.PACKAGE_REMOVED")) {
                return;
            }
            if (TextUtils.equals(str, "android.net.conn.CONNECTIVITY_CHANGE")) {
                String m12983h = UtilityImpl.m12983h(this.f12964c);
                boolean m12985i = UtilityImpl.m12985i(this.f12964c);
                ALog.m12941i("ServiceImpl", "network change:" + this.f12966e + " to " + m12983h, new Object[0]);
                if (m12985i) {
                    this.f12966e = m12983h;
                    m12828c();
                    m12825a(true, false);
                    UTMini.getInstance().commitEvent(66001, "CONNECTIVITY_CHANGE", m12983h, UtilityImpl.m12982h(), MessageService.MSG_DB_READY_REPORT);
                }
                if (m12983h.equals("unknown")) {
                    m12828c();
                    this.f12966e = m12983h;
                    return;
                }
                return;
            }
            if (TextUtils.equals(str, "android.intent.action.BOOT_COMPLETED")) {
                m12825a(true, false);
                return;
            }
            if (TextUtils.equals(str, "android.intent.action.USER_PRESENT")) {
                ALog.m12938d("ServiceImpl", "action android.intent.action.USER_PRESENT", new Object[0]);
                m12825a(true, false);
            } else if (str.equals(Constants.ACTION_COMMAND)) {
                m12827b(intent);
            } else if (str.equals(Constants.ACTION_START_FROM_AGOO)) {
                ALog.m12941i("ServiceImpl", "ACTION_START_FROM_AGOO", new Object[0]);
            }
        } catch (Throwable th) {
            ALog.m12939e("ServiceImpl", "handleAction", th, new Object[0]);
        }
    }

    /* renamed from: b */
    private synchronized void m12826b() {
        ConcurrentHashMap<String, AbstractC3156a> concurrentHashMap = AbstractC3152d.f12972a;
        if (concurrentHashMap != null && concurrentHashMap.size() != 0) {
            for (Map.Entry<String, AbstractC3156a> entry : AbstractC3152d.f12972a.entrySet()) {
                AbstractC3156a value = entry.getValue();
                if (value == null) {
                    ALog.m12940e("ServiceImpl", "tryConnect connection null", "appkey", value.m12863i());
                    return;
                }
                ALog.m12941i("ServiceImpl", "tryConnect", "appkey", value.m12863i(), Constants.KEY_CONFIG_TAG, entry.getKey());
                if (value.m12866l() && TextUtils.isEmpty(value.f12986i.getAppSecret())) {
                    ALog.m12940e("ServiceImpl", "tryConnect secret is null", new Object[0]);
                } else {
                    value.mo12840a();
                }
            }
            return;
        }
        ALog.m12944w("ServiceImpl", "tryConnect no connections", new Object[0]);
    }

    /* renamed from: a */
    private void m12824a(Message message, boolean z10) {
        ConcurrentHashMap<String, AbstractC3156a> concurrentHashMap = AbstractC3152d.f12972a;
        if (concurrentHashMap == null || concurrentHashMap.size() == 0) {
            return;
        }
        Iterator<Map.Entry<String, AbstractC3156a>> it = AbstractC3152d.f12972a.entrySet().iterator();
        while (it.hasNext()) {
            AbstractC3156a value = it.next().getValue();
            if (value instanceof C3166k) {
                value.mo12846a(true, false);
            } else {
                value.m12854b(message, z10);
            }
        }
    }

    /* renamed from: a */
    private void m12825a(boolean z10, boolean z11) {
        ConcurrentHashMap<String, AbstractC3156a> concurrentHashMap = AbstractC3152d.f12972a;
        if (concurrentHashMap == null || concurrentHashMap.size() == 0) {
            return;
        }
        Iterator<Map.Entry<String, AbstractC3156a>> it = AbstractC3152d.f12972a.entrySet().iterator();
        while (it.hasNext()) {
            AbstractC3156a value = it.next().getValue();
            value.mo12846a(z10, z11);
            ALog.m12941i("ServiceImpl", "ping connection", "appkey", value.m12863i());
        }
    }
}
