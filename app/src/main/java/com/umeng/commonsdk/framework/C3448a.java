package com.umeng.commonsdk.framework;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.FileObserver;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.umeng.analytics.pro.C3330by;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.internal.C3452a;
import com.umeng.commonsdk.internal.C3453b;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.service.UMGlobalContext;
import com.umeng.commonsdk.statistics.C3483c;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.common.ULog;
import com.umeng.commonsdk.statistics.idtracking.ImprintHandler;
import com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import org.android.agoo.common.AgooConstants;

/* renamed from: com.umeng.commonsdk.framework.a */
/* loaded from: classes3.dex */
public class C3448a implements UMImprintChangeCallback {

    /* renamed from: a */
    private static HandlerThread f15223a = null;

    /* renamed from: b */
    private static Handler f15224b = null;

    /* renamed from: c */
    private static Handler f15225c = null;

    /* renamed from: d */
    private static final int f15226d = 200;

    /* renamed from: e */
    private static final int f15227e = 273;

    /* renamed from: f */
    private static final int f15228f = 274;

    /* renamed from: g */
    private static final int f15229g = 512;

    /* renamed from: h */
    private static final int f15230h = 769;

    /* renamed from: i */
    private static a f15231i = null;

    /* renamed from: j */
    private static ConnectivityManager f15232j = null;

    /* renamed from: k */
    private static IntentFilter f15233k = null;

    /* renamed from: l */
    private static volatile boolean f15234l = false;

    /* renamed from: m */
    private static ArrayList<UMSenderStateNotify> f15235m = null;

    /* renamed from: p */
    private static final String f15238p = "report_policy";

    /* renamed from: q */
    private static final String f15239q = "report_interval";

    /* renamed from: s */
    private static final int f15241s = 15;

    /* renamed from: t */
    private static final int f15242t = 3;

    /* renamed from: u */
    private static final int f15243u = 90;

    /* renamed from: x */
    private static BroadcastReceiver f15246x;

    /* renamed from: n */
    private static Object f15236n = new Object();

    /* renamed from: o */
    private static ReentrantLock f15237o = new ReentrantLock();

    /* renamed from: r */
    private static boolean f15240r = false;

    /* renamed from: v */
    private static int f15244v = 15;

    /* renamed from: w */
    private static Object f15245w = new Object();

    /* renamed from: com.umeng.commonsdk.framework.a$a */
    /* loaded from: classes3.dex */
    static class a extends FileObserver {
        public a(String str) {
            super(str);
        }

        @Override // android.os.FileObserver
        public void onEvent(int i10, String str) {
            if ((i10 & 8) == 8) {
                ULog.m14789d("--->>> envelope file created >>> " + str);
                UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "--->>> envelope file created >>> " + str);
                C3448a.m14590c(273);
            }
        }
    }

    static {
        Context appContext = UMGlobalContext.getAppContext();
        if (appContext != null) {
            f15232j = (ConnectivityManager) appContext.getSystemService("connectivity");
        }
        f15246x = new BroadcastReceiver() { // from class: com.umeng.commonsdk.framework.a.2
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                if (intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                    UMWorkDispatch.sendEvent(context, C3452a.f15253E, C3453b.m14605a(context).m14606a(), null);
                }
            }
        };
    }

    public C3448a(Context context, Handler handler) {
        if (f15232j == null) {
            Context appContext = UMGlobalContext.getAppContext();
            if (f15232j != null) {
                f15232j = (ConnectivityManager) appContext.getSystemService("connectivity");
            }
        }
        f15225c = handler;
        try {
            if (f15223a == null) {
                HandlerThread handlerThread = new HandlerThread("NetWorkSender");
                f15223a = handlerThread;
                handlerThread.start();
                if (f15231i == null) {
                    a aVar = new a(UMFrUtils.getEnvelopeDirPath(context));
                    f15231i = aVar;
                    aVar.startWatching();
                    ULog.m14789d("--->>> FileMonitor has already started!");
                }
                m14597j();
                if (f15224b == null) {
                    f15224b = new Handler(f15223a.getLooper()) { // from class: com.umeng.commonsdk.framework.a.3
                        @Override // android.os.Handler
                        public void handleMessage(Message message) {
                            int i10 = message.what;
                            if (i10 != 273) {
                                if (i10 == C3448a.f15228f) {
                                    C3448a.m14599l();
                                    return;
                                } else {
                                    if (i10 == 512) {
                                        C3448a.m14600m();
                                        return;
                                    }
                                    return;
                                }
                            }
                            ULog.m14789d("--->>> handleMessage: recv MSG_PROCESS_NEXT msg.");
                            try {
                                C3448a.f15237o.tryLock(1L, TimeUnit.SECONDS);
                                try {
                                    C3448a.m14601n();
                                } catch (Throwable unused) {
                                }
                                C3448a.f15237o.unlock();
                            } catch (Throwable unused2) {
                            }
                        }
                    };
                }
                ImprintHandler.getImprintService(context).registImprintCallback(f15238p, this);
                ImprintHandler.getImprintService(context).registImprintCallback(f15239q, this);
            }
        } catch (Throwable th) {
            UMCrashManager.reportCrash(context, th);
        }
    }

    /* renamed from: b */
    public static int m14586b() {
        int i10;
        synchronized (f15245w) {
            i10 = f15244v;
        }
        return i10;
    }

    /* renamed from: c */
    public static void m14589c() {
    }

    /* renamed from: d */
    public static void m14591d() {
        if (f15237o.tryLock()) {
            try {
                m14587b(273);
            } finally {
                f15237o.unlock();
            }
        }
    }

    /* renamed from: e */
    public static void m14592e() {
        m14580a(f15228f, 3000);
    }

    /* renamed from: j */
    private void m14597j() {
        synchronized (f15245w) {
            if (AgooConstants.ACK_BODY_NULL.equals(UMEnvelopeBuild.imprintProperty(UMModuleRegister.getAppContext(), f15238p, ""))) {
                UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "--->>> switch to report_policy 11");
                f15240r = true;
                f15244v = 15;
                int intValue = Integer.valueOf(UMEnvelopeBuild.imprintProperty(UMModuleRegister.getAppContext(), f15239q, AgooConstants.ACK_PACK_ERROR)).intValue();
                UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "--->>> set report_interval value to: " + intValue);
                if (intValue >= 3 && intValue <= 90) {
                    f15244v = intValue * 1000;
                }
                f15244v = 15;
            } else {
                f15240r = false;
            }
        }
    }

    /* renamed from: k */
    private static void m14598k() {
        if (f15223a != null) {
            f15223a = null;
        }
        if (f15224b != null) {
            f15224b = null;
        }
        if (f15225c != null) {
            f15225c = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static void m14599l() {
        int size;
        synchronized (f15236n) {
            ArrayList<UMSenderStateNotify> arrayList = f15235m;
            if (arrayList != null && (size = arrayList.size()) > 0) {
                for (int i10 = 0; i10 < size; i10++) {
                    f15235m.get(i10).onSenderIdle();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static void m14600m() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public static void m14601n() {
        ULog.m14789d("--->>> handleProcessNext: Enter...");
        if (!f15234l) {
            return;
        }
        Context appContext = UMModuleRegister.getAppContext();
        try {
            if (UMFrUtils.envelopeFileNumber(appContext) > 0) {
                ULog.m14789d("--->>> The envelope file exists.");
                if (UMFrUtils.envelopeFileNumber(appContext) > 200) {
                    ULog.m14789d("--->>> Number of envelope files is greater than 200, remove old files first.");
                    UMFrUtils.removeRedundantEnvelopeFiles(appContext, 200);
                }
                File envelopeFile = UMFrUtils.getEnvelopeFile(appContext);
                if (envelopeFile != null) {
                    String path = envelopeFile.getPath();
                    ULog.m14789d("--->>> Ready to send envelope file [" + path + "].");
                    UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "--->>> send envelope file [ " + path + "].");
                    if (new C3483c(appContext).m14758a(envelopeFile)) {
                        ULog.m14789d("--->>> Send envelope file success, delete it.");
                        if (!UMFrUtils.removeEnvelopeFile(envelopeFile)) {
                            ULog.m14789d("--->>> Failed to delete already processed file. We try again after delete failed.");
                            UMFrUtils.removeEnvelopeFile(envelopeFile);
                        }
                        m14590c(273);
                        return;
                    }
                    ULog.m14789d("--->>> Send envelope file failed, abandon and wait next trigger!");
                    return;
                }
            }
            m14592e();
        } catch (Throwable th) {
            UMCrashManager.reportCrash(appContext, th);
        }
    }

    @Override // com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback
    public void onImprintValueChanged(String str, String str2) {
        synchronized (f15245w) {
            if (f15238p.equals(str)) {
                if (AgooConstants.ACK_BODY_NULL.equals(str2)) {
                    UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "--->>> switch to report_policy 11");
                    f15240r = true;
                } else {
                    f15240r = false;
                }
            }
            if (f15239q.equals(str)) {
                int intValue = Integer.valueOf(str2).intValue();
                UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "--->>> set report_interval value to: " + intValue);
                if (intValue >= 3 && intValue <= 90) {
                    f15244v = intValue * 1000;
                    UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "--->>> really set report_interval value to: " + f15244v);
                }
                f15244v = C3330by.f14355b;
                UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "--->>> really set report_interval value to: " + f15244v);
            }
        }
    }

    /* renamed from: a */
    public static void m14582a(Context context) {
        if (f15232j != null || context == null) {
            return;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        f15232j = connectivityManager;
        if (connectivityManager != null) {
            UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "--->>> createCMIfNeeded:注册网络状态监听器。");
            m14588b(context);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static void m14590c(int i10) {
        Handler handler;
        if (!f15234l || (handler = f15224b) == null) {
            return;
        }
        Message obtainMessage = handler.obtainMessage();
        obtainMessage.what = i10;
        f15224b.sendMessage(obtainMessage);
    }

    @SuppressLint({"NewApi", "MissingPermission"})
    /* renamed from: b */
    public static void m14588b(Context context) {
        NetworkRequest.Builder addTransportType;
        NetworkRequest.Builder addTransportType2;
        NetworkRequest build;
        if (context == null) {
            UMRTLog.m14568e(UMRTLog.RTLOG_TAG, "--->>> registerNetReceiver: context is null, registerNetReceiver failed.");
            return;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            if (DeviceConfig.checkPermission(context, "android.permission.ACCESS_NETWORK_STATE")) {
                addTransportType = new NetworkRequest.Builder().addTransportType(0);
                addTransportType2 = addTransportType.addTransportType(1);
                build = addTransportType2.build();
                if (f15232j != null) {
                    final Context applicationContext = context.getApplicationContext();
                    UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "--->>> 注册网络状态监听器:registerNetworkCallback");
                    f15232j.registerNetworkCallback(build, new ConnectivityManager.NetworkCallback() { // from class: com.umeng.commonsdk.framework.a.1
                        @Override // android.net.ConnectivityManager.NetworkCallback
                        public void onAvailable(Network network) {
                            Context context2 = applicationContext;
                            UMWorkDispatch.sendEvent(context2, C3452a.f15253E, C3453b.m14605a(context2).m14606a(), null);
                        }

                        @Override // android.net.ConnectivityManager.NetworkCallback
                        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
                            super.onCapabilitiesChanged(network, networkCapabilities);
                        }

                        @Override // android.net.ConnectivityManager.NetworkCallback
                        public void onLost(Network network) {
                            UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "--->>> onLost");
                            Context context2 = applicationContext;
                            UMWorkDispatch.sendEvent(context2, C3452a.f15253E, C3453b.m14605a(context2).m14606a(), null, 2000L);
                        }
                    });
                    return;
                }
                return;
            }
            UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "--->>> ACCESS_NETWORK_STATE permission access denied.");
            return;
        }
        if (DeviceConfig.checkPermission(context, "android.permission.ACCESS_NETWORK_STATE")) {
            if (f15232j == null || f15233k != null) {
                return;
            }
            IntentFilter intentFilter = new IntentFilter();
            f15233k = intentFilter;
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            if (f15246x != null) {
                UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "--->>> 注册网络状态监听器:registerReceiver");
                context.registerReceiver(f15246x, f15233k);
                return;
            }
            return;
        }
        UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "--->>> ACCESS_NETWORK_STATE permission access denied.");
    }

    /* renamed from: a */
    public static void m14583a(UMSenderStateNotify uMSenderStateNotify) {
        synchronized (f15236n) {
            try {
                if (f15235m == null) {
                    f15235m = new ArrayList<>();
                }
                if (uMSenderStateNotify != null) {
                    for (int i10 = 0; i10 < f15235m.size(); i10++) {
                        if (uMSenderStateNotify == f15235m.get(i10)) {
                            UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "--->>> addConnStateObserver: input item has exist.");
                            return;
                        }
                    }
                    f15235m.add(uMSenderStateNotify);
                }
            } catch (Throwable th) {
                UMCrashManager.reportCrash(UMModuleRegister.getAppContext(), th);
            }
        }
    }

    /* renamed from: a */
    public static boolean m14585a() {
        boolean z10;
        synchronized (f15245w) {
            z10 = f15240r;
        }
        return z10;
    }

    /* renamed from: a */
    public static void m14584a(boolean z10) {
        int size;
        f15234l = z10;
        if (z10) {
            synchronized (f15236n) {
                ArrayList<UMSenderStateNotify> arrayList = f15235m;
                if (arrayList != null && (size = arrayList.size()) > 0) {
                    for (int i10 = 0; i10 < size; i10++) {
                        f15235m.get(i10).onConnectionAvailable();
                    }
                }
            }
            UMRTLog.m14568e(UMRTLog.RTLOG_TAG, "网络状态通知：尝试发送 MSG_PROCESS_NEXT");
            m14591d();
            return;
        }
        ULog.m14801i("--->>> network disconnected.");
        f15234l = false;
    }

    /* renamed from: b */
    private static void m14587b(int i10) {
        Handler handler;
        if (!f15234l || (handler = f15224b) == null || handler.hasMessages(i10)) {
            return;
        }
        Message obtainMessage = f15224b.obtainMessage();
        obtainMessage.what = i10;
        f15224b.sendMessage(obtainMessage);
    }

    /* renamed from: a */
    private static void m14581a(int i10, long j10) {
        Handler handler;
        if (!f15234l || (handler = f15224b) == null) {
            return;
        }
        Message obtainMessage = handler.obtainMessage();
        obtainMessage.what = i10;
        UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "--->>> sendMsgDelayed: " + j10);
        f15224b.sendMessageDelayed(obtainMessage, j10);
    }

    /* renamed from: a */
    private static void m14580a(int i10, int i11) {
        Handler handler;
        if (!f15234l || (handler = f15224b) == null) {
            return;
        }
        handler.removeMessages(i10);
        Message obtainMessage = f15224b.obtainMessage();
        obtainMessage.what = i10;
        f15224b.sendMessageDelayed(obtainMessage, i11);
    }
}
