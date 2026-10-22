package com.efs.sdk.base.core.controller;

import android.content.IntentFilter;
import android.os.Handler;
import android.os.Message;
import android.util.Pair;
import android.webkit.ValueCallback;
import com.efs.sdk.base.EfsReporter;
import com.efs.sdk.base.core.config.GlobalEnvStruct;
import com.efs.sdk.base.core.config.GlobalInfoManager;
import com.efs.sdk.base.core.config.remote.C1698b;
import com.efs.sdk.base.core.controller.p054a.RunnableC1702a;
import com.efs.sdk.base.core.model.LogDto;
import com.efs.sdk.base.core.p051b.C1677h;
import com.efs.sdk.base.core.p051b.HandlerC1674e;
import com.efs.sdk.base.core.p052c.C1687d;
import com.efs.sdk.base.core.p055d.C1704b;
import com.efs.sdk.base.core.p055d.C1705c;
import com.efs.sdk.base.core.p055d.C1708f;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.core.util.concurrent.C1720a;
import com.efs.sdk.base.core.util.concurrent.WorkThreadUtil;
import com.efs.sdk.base.http.HttpResponse;
import com.efs.sdk.base.protocol.ILogProtocol;
import java.io.File;
import java.util.HashMap;

/* loaded from: classes.dex */
public class ControllerCenter implements Handler.Callback {

    /* renamed from: h */
    private static GlobalEnvStruct f7132h;

    /* renamed from: a */
    private int f7133a = 0;

    /* renamed from: b */
    private final int f7134b = 0;

    /* renamed from: c */
    private final int f7135c = 1;

    /* renamed from: d */
    private final int f7136d = 2;

    /* renamed from: e */
    private final int f7137e = 3;

    /* renamed from: f */
    private volatile boolean f7138f = false;

    /* renamed from: g */
    private RunnableC1702a f7139g;

    /* renamed from: i */
    private boolean f7140i;

    /* renamed from: j */
    private Handler f7141j;

    public ControllerCenter(EfsReporter.Builder builder) {
        this.f7140i = false;
        GlobalEnvStruct globalEnvStruct = builder.getGlobalEnvStruct();
        f7132h = globalEnvStruct;
        this.f7140i = globalEnvStruct.isOpenCodeLog();
        Handler handler = new Handler(C1720a.f7206a.getLooper(), this);
        this.f7141j = handler;
        handler.sendEmptyMessage(0);
    }

    /* renamed from: a */
    private void m7706a() {
        if (this.f7139g == null) {
            this.f7139g = new RunnableC1702a();
        }
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            f7132h.mAppContext.registerReceiver(this.f7139g, intentFilter);
        } catch (Throwable th) {
            Log.m7739w("efs.base", "register network change receiver error", th);
            int i10 = this.f7133a + 1;
            this.f7133a = i10;
            if (i10 < 3) {
                this.f7141j.sendEmptyMessageDelayed(3, 6000L);
            }
        }
    }

    /* renamed from: b */
    private void m7708b(final ILogProtocol iLogProtocol) {
        if (iLogProtocol == null) {
            return;
        }
        WorkThreadUtil.submit(new Runnable() { // from class: com.efs.sdk.base.core.controller.ControllerCenter.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    iLogProtocol.insertGlobal(GlobalInfoManager.getInstance().getGlobalInfo());
                    if (!"wa".equalsIgnoreCase(iLogProtocol.getLogType())) {
                        ControllerCenter.m7707a(iLogProtocol);
                    }
                    if (!ControllerCenter.getGlobalEnvStruct().isEnableSendLog()) {
                        return;
                    }
                    final LogDto buildLogDto = LogDto.buildLogDto(iLogProtocol);
                    final C1687d m7651a = C1687d.a.m7651a();
                    WorkThreadUtil.submit(new Runnable() { // from class: com.efs.sdk.base.core.c.d.1

                        /* renamed from: a */
                        final /* synthetic */ LogDto f7068a;

                        public AnonymousClass1(final LogDto buildLogDto2) {
                            r2 = buildLogDto2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            C1687d.this.f7067a.m7647a(r2);
                        }
                    });
                } catch (Throwable th) {
                    Log.m7727e("efs.base", "log send error", th);
                }
            }
        });
    }

    public static GlobalEnvStruct getGlobalEnvStruct() {
        return f7132h;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 3) {
                    m7706a();
                }
            } else {
                Object obj = message.obj;
                if (obj != null && (obj instanceof ILogProtocol)) {
                    m7708b((ILogProtocol) obj);
                }
            }
        } else {
            GlobalInfoManager.getInstance().initGlobalInfo();
            C1677h.a.m7645a();
            C1698b.m7679a().m7695b();
            m7706a();
            C1708f m7718a = C1708f.a.m7718a();
            boolean isIntl = f7132h.isIntl();
            C1705c c1705c = m7718a.f7159a;
            if (isIntl) {
                c1705c.f7151a = "https://errnewlogos.umeng.com/api/crashsdk/logcollect";
                c1705c.f7152b = "4ea4e41a3993";
            } else {
                c1705c.f7151a = "https://errnewlog.umeng.com/api/crashsdk/logcollect";
                c1705c.f7152b = "28ef1713347d";
            }
            m7718a.f7160b = this;
            m7718a.f7161c.f7144a = this;
            m7718a.f7162d.f7144a = this;
            this.f7138f = true;
            HandlerC1674e.m7639a().sendEmptyMessageDelayed(0, f7132h.getLogSendDelayMills());
            if (this.f7140i) {
                HandlerC1674e.m7639a().sendEmptyMessageDelayed(10, f7132h.getLogSendDelayMills());
            }
            C1708f m7718a2 = C1708f.a.m7718a();
            if (m7718a2.f7160b != null && getGlobalEnvStruct().isEnableWaStat()) {
                m7718a2.f7160b.send(new C1704b("efs_core", "pvuv", m7718a2.f7159a.f7153c));
            }
        }
        return true;
    }

    public void send(ILogProtocol iLogProtocol) {
        if (!this.f7138f) {
            Message obtain = Message.obtain();
            obtain.what = 1;
            obtain.obj = iLogProtocol;
            this.f7141j.sendMessage(obtain);
            return;
        }
        m7708b(iLogProtocol);
    }

    public HttpResponse sendSyncImmediately(String str, int i10, String str2, boolean z10, File file) {
        LogDto logDto = new LogDto(str, (byte) 2);
        logDto.setLogBodyType(1);
        logDto.setFile(file);
        logDto.setCp(str2);
        logDto.setDe(i10);
        logDto.setLimitByFlow(z10);
        logDto.setSendImediately(true);
        C1687d.a.m7651a().f7067a.m7647a(logDto);
        return logDto.getResponseDto();
    }

    /* renamed from: a */
    static /* synthetic */ void m7707a(ILogProtocol iLogProtocol) {
        for (ValueCallback<Pair<Message, Message>> valueCallback : getGlobalEnvStruct().getCallback(9)) {
            HashMap hashMap = new HashMap(4);
            hashMap.put("log_type", iLogProtocol.getLogType());
            hashMap.put("log_data", iLogProtocol.generateString());
            hashMap.put("link_key", iLogProtocol.getLinkKey());
            hashMap.put("link_id", iLogProtocol.getLinkId());
            Message obtain = Message.obtain(null, 9, hashMap);
            Message obtain2 = Message.obtain();
            valueCallback.onReceiveValue(new Pair<>(obtain, obtain2));
            obtain.recycle();
            obtain2.recycle();
        }
    }
}
