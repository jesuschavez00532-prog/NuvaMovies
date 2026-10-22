package anet.channel.session;

import android.content.Context;
import anet.channel.AwcnConfig;
import anet.channel.RequestCb;
import anet.channel.Session;
import anet.channel.entity.C0934a;
import anet.channel.entity.C0935b;
import anet.channel.entity.ConnType;
import anet.channel.request.C0956b;
import anet.channel.request.Cancelable;
import anet.channel.request.Request;
import anet.channel.statist.RequestStatistic;
import anet.channel.strategy.IConnStrategy;
import anet.channel.strategy.utils.C1009d;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import anet.channel.util.C1018c;
import anet.channel.util.C1023h;
import anet.channel.util.C1025j;
import anet.channel.util.ErrorConstant;
import anet.channel.util.HttpConstant;
import anet.channel.util.Utils;
import javax.net.ssl.SSLSocketFactory;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;

/* renamed from: anet.channel.session.d */
/* loaded from: classes.dex */
public class C0966d extends Session {

    /* renamed from: w */
    private SSLSocketFactory f4027w;

    public C0966d(Context context, C0934a c0934a) {
        super(context, c0934a);
        ConnType connType;
        if (this.f3733k == null) {
            String str = this.f3725c;
            if (str != null && str.startsWith(HttpConstant.HTTPS)) {
                connType = ConnType.HTTPS;
            } else {
                connType = ConnType.HTTP;
            }
            this.f3732j = connType;
            return;
        }
        if (AwcnConfig.isHttpsSniEnable() && this.f3732j.equals(ConnType.HTTPS)) {
            this.f4027w = new C1025j(this.f3726d);
        }
    }

    @Override // anet.channel.Session
    public void close() {
        notifyStatus(6, null);
    }

    @Override // anet.channel.Session
    public void connect() {
        try {
            IConnStrategy iConnStrategy = this.f3733k;
            if (iConnStrategy != null && iConnStrategy.getIpSource() == 1) {
                notifyStatus(4, new C0935b(1));
                return;
            }
            Request.Builder redirectEnable = new Request.Builder().setUrl(this.f3725c).setSeq(this.f3738p).setConnectTimeout((int) (this.f3740r * Utils.getNetworkTimeFactor())).setReadTimeout((int) (this.f3741s * Utils.getNetworkTimeFactor())).setRedirectEnable(false);
            SSLSocketFactory sSLSocketFactory = this.f4027w;
            if (sSLSocketFactory != null) {
                redirectEnable.setSslSocketFactory(sSLSocketFactory);
            }
            if (this.f3735m) {
                redirectEnable.addHeader(HttpConstant.HOST, this.f3727e);
            }
            if (C1018c.m4795a() && C1009d.m4779a(this.f3727e)) {
                try {
                    this.f3728f = C1018c.m4793a(this.f3727e);
                } catch (Exception unused) {
                }
            }
            ALog.m4788i("awcn.HttpSession", "HttpSession connect", null, "host", this.f3725c, IjkMediaPlayer.OnNativeInvokeListener.ARG_IP, this.f3728f, IjkMediaPlayer.OnNativeInvokeListener.ARG_PORT, Integer.valueOf(this.f3729g));
            Request build = redirectEnable.build();
            build.setDnsOptimize(this.f3728f, this.f3729g);
            ThreadPoolExecutorFactory.submitPriorityTask(new RunnableC0967e(this, build), ThreadPoolExecutorFactory.Priority.LOW);
        } catch (Throwable th) {
            ALog.m4786e("awcn.HttpSession", "HTTP connect fail.", null, th, new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // anet.channel.Session
    public Runnable getRecvTimeOutRunnable() {
        return null;
    }

    @Override // anet.channel.Session
    public boolean isAvailable() {
        if (this.f3736n == 4) {
            return true;
        }
        return false;
    }

    @Override // anet.channel.Session
    public Cancelable request(Request request, RequestCb requestCb) {
        RequestStatistic requestStatistic;
        C0956b c0956b = C0956b.NULL;
        Request.Builder builder = null;
        if (request != null) {
            requestStatistic = request.f3956a;
        } else {
            requestStatistic = new RequestStatistic(this.f3726d, null);
        }
        requestStatistic.setConnType(this.f3732j);
        if (requestStatistic.start == 0) {
            long currentTimeMillis = System.currentTimeMillis();
            requestStatistic.reqStart = currentTimeMillis;
            requestStatistic.start = currentTimeMillis;
        }
        if (request != null && requestCb != null) {
            try {
                if (request.getSslSocketFactory() == null && this.f4027w != null) {
                    builder = request.newBuilder().setSslSocketFactory(this.f4027w);
                }
                if (this.f3735m) {
                    if (builder == null) {
                        builder = request.newBuilder();
                    }
                    builder.addHeader(HttpConstant.HOST, this.f3727e);
                }
                if (builder != null) {
                    request = builder.build();
                }
                if (this.f3728f == null) {
                    String host = request.getHttpUrl().host();
                    if (C1018c.m4795a() && C1009d.m4779a(host)) {
                        try {
                            this.f3728f = C1018c.m4793a(host);
                        } catch (Exception unused) {
                        }
                    }
                }
                request.setDnsOptimize(this.f3728f, this.f3729g);
                request.setUrlScheme(this.f3732j.isSSL());
                IConnStrategy iConnStrategy = this.f3733k;
                if (iConnStrategy != null) {
                    request.f3956a.setIpInfo(iConnStrategy.getIpSource(), this.f3733k.getIpType());
                } else {
                    request.f3956a.setIpInfo(1, 1);
                }
                request.f3956a.unit = this.f3734l;
                return new C0956b(ThreadPoolExecutorFactory.submitPriorityTask(new RunnableC0968f(this, request, requestCb, requestStatistic), C1023h.m4811a(request)), request.getSeq());
            } catch (Throwable th) {
                requestCb.onFinish(ErrorConstant.ERROR_EXCEPTION, ErrorConstant.formatMsg(ErrorConstant.ERROR_EXCEPTION, th.toString()), requestStatistic);
                return c0956b;
            }
        }
        if (requestCb != null) {
            requestCb.onFinish(ErrorConstant.ERROR_PARAM_ILLEGAL, ErrorConstant.getErrMsg(ErrorConstant.ERROR_PARAM_ILLEGAL), requestStatistic);
        }
        return c0956b;
    }

    @Override // anet.channel.Session
    public void close(boolean z10) {
        this.f3742t = false;
        close();
    }
}
