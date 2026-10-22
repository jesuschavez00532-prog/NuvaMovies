package com.efs.sdk.base.core.p051b;

import android.os.Handler;
import android.os.Message;
import com.efs.sdk.base.core.cache.C1695f;
import com.efs.sdk.base.core.cache.CacheManager;
import com.efs.sdk.base.core.cache.IFileFilter;
import com.efs.sdk.base.core.config.GlobalInfoManager;
import com.efs.sdk.base.core.controller.ControllerCenter;
import com.efs.sdk.base.core.model.LogDto;
import com.efs.sdk.base.core.p051b.C1677h;
import com.efs.sdk.base.core.p055d.C1707e;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.core.util.NetworkUtil;
import com.efs.sdk.base.core.util.concurrent.C1720a;
import com.efs.sdk.base.core.util.concurrent.WorkThreadUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.efs.sdk.base.core.b.e */
/* loaded from: classes.dex */
public final class HandlerC1674e extends Handler {

    /* renamed from: a */
    public int f7041a;

    /* renamed from: b */
    public int f7042b;

    /* renamed from: c */
    public InterfaceC1673d f7043c;

    /* renamed from: d */
    public IFileFilter f7044d;

    /* renamed from: e */
    private InterfaceC1673d f7045e;

    /* renamed from: f */
    private InterfaceC1673d f7046f;

    /* renamed from: g */
    private List<String> f7047g;

    /* renamed from: h */
    private List<String> f7048h;

    /* renamed from: i */
    private AtomicInteger f7049i;

    /* renamed from: j */
    private AtomicInteger f7050j;

    /* renamed from: k */
    private IFileFilter f7051k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.efs.sdk.base.core.b.e$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        private static final HandlerC1674e f7052a = new HandlerC1674e(0);
    }

    /* synthetic */ HandlerC1674e(byte b10) {
        this();
    }

    /* renamed from: a */
    public static HandlerC1674e m7639a() {
        return a.f7052a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m7641b(Object obj, int i10) {
        Message obtain = Message.obtain();
        obtain.what = 11;
        obtain.obj = obj;
        obtain.arg1 = i10;
        sendMessage(obtain);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C1677h c1677h;
        int i10;
        int i11;
        super.handleMessage(message);
        c1677h = C1677h.a.f7063a;
        if (c1677h.m7644a()) {
            int i12 = message.what;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 10) {
                        if (i12 == 11) {
                            Object obj = message.obj;
                            if (obj != null) {
                                this.f7048h.remove(obj.toString());
                            }
                            if (message.arg1 != 0) {
                                i11 = this.f7050j.incrementAndGet();
                            } else {
                                i11 = 0;
                            }
                            if (this.f7048h.isEmpty()) {
                                if (i11 == 0) {
                                    Log.m7730i("efs.send_log", "send secess.");
                                    this.f7044d.finish();
                                }
                                if (i11 < 5) {
                                    sendEmptyMessage(10);
                                    return;
                                }
                                this.f7050j.set(0);
                                sendEmptyMessageDelayed(10, ControllerCenter.getGlobalEnvStruct().getLogSendDelayMills());
                                Log.m7730i("efs.send_log", "request error cnt gt 5, next request delay 10s");
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (!this.f7044d.hasTask()) {
                        Log.m7730i("efs.send_log", "-> none task. return.");
                        return;
                    }
                    String netStatus = GlobalInfoManager.getInstance().getNetStatus();
                    if (!NetworkUtil.NETWORK_CLASS_DENIED.equalsIgnoreCase(netStatus) && !NetworkUtil.NETWORK_CLASS_DISCONNECTED.equalsIgnoreCase(netStatus)) {
                        List<LogDto> emptyList = Collections.emptyList();
                        try {
                            emptyList = CacheManager.getInstance().getLogDtoCodeLog(this.f7042b, this.f7044d);
                        } catch (Throwable unused) {
                        }
                        for (LogDto logDto : emptyList) {
                            InterfaceC1673d interfaceC1673d = this.f7045e;
                            String uuid = UUID.randomUUID().toString();
                            this.f7048h.add(uuid);
                            if (WorkThreadUtil.submit(new RunnableC1676g(logDto, interfaceC1673d, uuid)) == null) {
                                m7641b(uuid, -1);
                            }
                        }
                        if (this.f7048h.size() <= 0) {
                            if (CacheManager.getInstance().getCodeLogList() != null && !CacheManager.getInstance().getCodeLogList().isEmpty()) {
                                if (this.f7044d.hasTask()) {
                                    Log.m7730i("efs.send_log", "-> deal done and has task. next interval.");
                                    this.f7044d.finish();
                                    sendEmptyMessageDelayed(10, ControllerCenter.getGlobalEnvStruct().getLogSendIntervalMills());
                                    return;
                                }
                                Log.m7730i("efs.send_log", "-> deal done and none task. return.");
                                return;
                            }
                            Log.m7730i("efs.send_log", "-> deal done and none log. return.");
                            sendEmptyMessageDelayed(10, 300000L);
                            return;
                        }
                        return;
                    }
                    Log.m7730i("efs.send_log", "log cann't be send because net status is ".concat(String.valueOf(netStatus)));
                    Log.m7730i("efs.send_log", "-> none net. over.");
                    sendEmptyMessageDelayed(10, 300000L);
                    return;
                }
                Object obj2 = message.obj;
                if (obj2 != null) {
                    this.f7047g.remove(obj2.toString());
                }
                if (message.arg1 != 0) {
                    i10 = this.f7049i.incrementAndGet();
                } else {
                    i10 = 0;
                }
                if (this.f7047g.isEmpty()) {
                    if (i10 < 5) {
                        sendEmptyMessage(0);
                        return;
                    }
                    this.f7049i.set(0);
                    sendEmptyMessageDelayed(0, ControllerCenter.getGlobalEnvStruct().getLogSendDelayMills());
                    Log.m7730i("efs.send_log", "request error cnt gt 5, next request delay 10s");
                    return;
                }
                return;
            }
            String netStatus2 = GlobalInfoManager.getInstance().getNetStatus();
            if (!NetworkUtil.NETWORK_CLASS_DENIED.equalsIgnoreCase(netStatus2) && !NetworkUtil.NETWORK_CLASS_DISCONNECTED.equalsIgnoreCase(netStatus2)) {
                List<LogDto> emptyList2 = Collections.emptyList();
                try {
                    emptyList2 = CacheManager.getInstance().getLogDto(this.f7041a, this.f7051k);
                } catch (Throwable unused2) {
                }
                for (LogDto logDto2 : emptyList2) {
                    if ("wa".equals(logDto2.getLogType()) || HandlerC1672c.m7631a().m7637a(logDto2.getLogType(), logDto2.getBodySize())) {
                        InterfaceC1673d interfaceC1673d2 = this.f7043c;
                        if ("wa".equals(logDto2.getLogType())) {
                            interfaceC1673d2 = this.f7046f;
                        }
                        String uuid2 = UUID.randomUUID().toString();
                        this.f7047g.add(uuid2);
                        if (WorkThreadUtil.submit(new RunnableC1675f(logDto2, interfaceC1673d2, uuid2)) == null) {
                            m7640a(uuid2, -1);
                        }
                    }
                }
                if (this.f7047g.size() <= 0) {
                    sendEmptyMessageDelayed(0, ControllerCenter.getGlobalEnvStruct().getLogSendIntervalMills());
                    return;
                }
                return;
            }
            Log.m7730i("efs.send_log", "log cann't be send because net status is ".concat(String.valueOf(netStatus2)));
            sendEmptyMessageDelayed(0, ControllerCenter.getGlobalEnvStruct().getLogSendIntervalMills());
        }
    }

    private HandlerC1674e() {
        super(C1720a.f7206a.getLooper());
        this.f7041a = 5;
        this.f7042b = 1000;
        this.f7047g = new ArrayList();
        this.f7048h = new ArrayList();
        this.f7049i = new AtomicInteger(0);
        this.f7050j = new AtomicInteger(0);
        this.f7043c = new C1670a();
        this.f7045e = new C1671b();
        this.f7046f = new C1707e();
        this.f7051k = new C1695f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m7640a(Object obj, int i10) {
        Message obtain = Message.obtain();
        obtain.what = 1;
        obtain.obj = obj;
        obtain.arg1 = i10;
        sendMessage(obtain);
    }
}
