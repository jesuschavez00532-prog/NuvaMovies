package anet.channel.detect;

import android.content.Context;
import anet.channel.AwcnConfig;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.RequestCb;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.entity.C0934a;
import anet.channel.entity.ConnType;
import anet.channel.request.Request;
import anet.channel.session.C0964b;
import anet.channel.session.TnetSpdySession;
import anet.channel.statist.HorseRaceStat;
import anet.channel.strategy.C1002l;
import anet.channel.strategy.ConnProtocol;
import anet.channel.strategy.IConnStrategy;
import anet.channel.strategy.StrategyCenter;
import anet.channel.strategy.utils.C1009d;
import anet.channel.util.ALog;
import anet.channel.util.AppLifecycle;
import anet.channel.util.C1025j;
import anet.channel.util.ErrorConstant;
import anet.channel.util.HttpConstant;
import anet.channel.util.HttpUrl;
import com.lzy.okgo.model.HttpHeaders;
import java.io.IOException;
import java.net.Socket;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.android.netutil.PingResponse;
import org.android.netutil.PingTask;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: anet.channel.detect.d */
/* loaded from: classes.dex */
public class C0915d {

    /* renamed from: a */
    TreeMap<String, C1002l.c> f3831a = new TreeMap<>();

    /* renamed from: b */
    private AtomicInteger f3832b = new AtomicInteger(1);

    /* renamed from: c */
    private void m4539c(String str, C1002l.e eVar) {
        String str2 = "HR" + this.f3832b.getAndIncrement();
        ALog.m4788i("anet.HorseRaceDetector", "startTcpTask", str2, IjkMediaPlayer.OnNativeInvokeListener.ARG_IP, eVar.f4177a, IjkMediaPlayer.OnNativeInvokeListener.ARG_PORT, Integer.valueOf(eVar.f4178b.f4147a));
        HorseRaceStat horseRaceStat = new HorseRaceStat(str, eVar);
        long currentTimeMillis = System.currentTimeMillis();
        try {
            Socket socket = new Socket(eVar.f4177a, eVar.f4178b.f4147a);
            int i10 = eVar.f4178b.f4149c;
            if (i10 == 0) {
                i10 = 10000;
            }
            socket.setSoTimeout(i10);
            ALog.m4788i("anet.HorseRaceDetector", "socket connect success", str2, new Object[0]);
            horseRaceStat.connRet = 1;
            horseRaceStat.connTime = System.currentTimeMillis() - currentTimeMillis;
            socket.close();
        } catch (IOException unused) {
            horseRaceStat.connTime = System.currentTimeMillis() - currentTimeMillis;
            horseRaceStat.connErrorCode = ErrorConstant.ERROR_IO_EXCEPTION;
        }
        AppMonitor.getInstance().commitStat(horseRaceStat);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m4540a() {
        ALog.m4787e("anet.HorseRaceDetector", "network detect thread start", null, new Object[0]);
        while (true) {
            synchronized (this.f3831a) {
                if (!AwcnConfig.isHorseRaceEnable()) {
                    this.f3831a.clear();
                    return;
                }
                Map.Entry<String, C1002l.c> pollFirstEntry = this.f3831a.pollFirstEntry();
                if (pollFirstEntry == null) {
                    return;
                }
                try {
                    m4535a(pollFirstEntry.getValue());
                } catch (Exception e10) {
                    ALog.m4786e("anet.HorseRaceDetector", "start hr task failed", null, e10, new Object[0]);
                }
            }
        }
    }

    /* renamed from: b */
    public void m4541b() {
        StrategyCenter.getInstance().registerListener(new C0916e(this));
        AppLifecycle.registerLifecycleListener(new C0917f(this));
    }

    /* renamed from: b */
    private void m4538b(String str, C1002l.e eVar) {
        ConnProtocol valueOf = ConnProtocol.valueOf(eVar.f4178b);
        ConnType valueOf2 = ConnType.valueOf(valueOf);
        if (valueOf2 == null) {
            return;
        }
        ALog.m4788i("anet.HorseRaceDetector", "startLongLinkTask", null, "host", str, IjkMediaPlayer.OnNativeInvokeListener.ARG_IP, eVar.f4177a, IjkMediaPlayer.OnNativeInvokeListener.ARG_PORT, Integer.valueOf(eVar.f4178b.f4147a), "protocol", valueOf);
        String str2 = "HR" + this.f3832b.getAndIncrement();
        Context context = GlobalAppRuntimeInfo.getContext();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(valueOf2.isSSL() ? "https://" : "http://");
        sb2.append(str);
        TnetSpdySession tnetSpdySession = new TnetSpdySession(context, new C0934a(sb2.toString(), str2, m4534a(valueOf, eVar)));
        HorseRaceStat horseRaceStat = new HorseRaceStat(str, eVar);
        long currentTimeMillis = System.currentTimeMillis();
        tnetSpdySession.registerEventcb(257, new C0919h(this, horseRaceStat, currentTimeMillis, str2, eVar, tnetSpdySession));
        tnetSpdySession.connect();
        synchronized (horseRaceStat) {
            try {
                int i10 = eVar.f4178b.f4149c;
                if (i10 == 0) {
                    i10 = 10000;
                }
                horseRaceStat.wait(i10);
                if (horseRaceStat.connTime == 0) {
                    horseRaceStat.connTime = System.currentTimeMillis() - currentTimeMillis;
                }
                m4536a(eVar.f4177a, horseRaceStat);
                AppMonitor.getInstance().commitStat(horseRaceStat);
            } catch (InterruptedException unused) {
            }
        }
        tnetSpdySession.close(false);
    }

    /* renamed from: a */
    private void m4535a(C1002l.c cVar) {
        C1002l.e[] eVarArr = cVar.f4168b;
        if (eVarArr == null || eVarArr.length == 0) {
            return;
        }
        String str = cVar.f4167a;
        int i10 = 0;
        while (true) {
            C1002l.e[] eVarArr2 = cVar.f4168b;
            if (i10 >= eVarArr2.length) {
                return;
            }
            C1002l.e eVar = eVarArr2[i10];
            String str2 = eVar.f4178b.f4148b;
            if (!str2.equalsIgnoreCase(HttpConstant.HTTP) && !str2.equalsIgnoreCase(HttpConstant.HTTPS)) {
                if (!str2.equalsIgnoreCase(ConnType.HTTP2) && !str2.equalsIgnoreCase(ConnType.SPDY) && !str2.equalsIgnoreCase(ConnType.QUIC)) {
                    if (str2.equalsIgnoreCase("tcp")) {
                        m4539c(str, eVar);
                    }
                } else {
                    m4538b(str, eVar);
                }
            } else {
                m4537a(str, eVar);
            }
            i10++;
        }
    }

    /* renamed from: a */
    private void m4537a(String str, C1002l.e eVar) {
        HttpUrl parse = HttpUrl.parse(eVar.f4178b.f4148b + HttpConstant.SCHEME_SPLIT + str + eVar.f4179c);
        if (parse == null) {
            return;
        }
        ALog.m4788i("anet.HorseRaceDetector", "startShortLinkTask", null, "url", parse);
        Request build = new Request.Builder().setUrl(parse).addHeader(HttpHeaders.HEAD_KEY_CONNECTION, HttpHeaders.HEAD_VALUE_CONNECTION_CLOSE).setConnectTimeout(eVar.f4178b.f4149c).setReadTimeout(eVar.f4178b.f4150d).setRedirectEnable(false).setSslSocketFactory(new C1025j(str)).setSeq("HR" + this.f3832b.getAndIncrement()).build();
        build.setDnsOptimize(eVar.f4177a, eVar.f4178b.f4147a);
        long currentTimeMillis = System.currentTimeMillis();
        C0964b.a m4665a = C0964b.m4665a(build, (RequestCb) null);
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        HorseRaceStat horseRaceStat = new HorseRaceStat(str, eVar);
        horseRaceStat.connTime = currentTimeMillis2;
        int i10 = m4665a.f4021a;
        if (i10 <= 0) {
            horseRaceStat.connErrorCode = i10;
        } else {
            horseRaceStat.connRet = 1;
            horseRaceStat.reqRet = m4665a.f4021a == 200 ? 1 : 0;
            horseRaceStat.reqErrorCode = m4665a.f4021a;
            horseRaceStat.reqTime = horseRaceStat.connTime;
        }
        m4536a(eVar.f4177a, horseRaceStat);
        AppMonitor.getInstance().commitStat(horseRaceStat);
    }

    /* renamed from: a */
    private static IConnStrategy m4534a(ConnProtocol connProtocol, C1002l.e eVar) {
        return new C0921j(eVar, connProtocol);
    }

    /* renamed from: a */
    private void m4536a(String str, HorseRaceStat horseRaceStat) {
        if (AwcnConfig.isPing6Enable() && C1009d.m4780b(str)) {
            try {
                PingResponse pingResponse = (PingResponse) new PingTask(str, 1000, 3, 0, 0).launch().get();
                if (pingResponse == null) {
                    return;
                }
                horseRaceStat.pingSuccessCount = pingResponse.getSuccessCnt();
                horseRaceStat.pingTimeoutCount = 3 - horseRaceStat.pingSuccessCount;
                horseRaceStat.localIP = pingResponse.getLocalIPStr();
            } catch (Throwable th) {
                ALog.m4786e("anet.HorseRaceDetector", "ping6 task fail.", null, th, new Object[0]);
            }
        }
    }
}
