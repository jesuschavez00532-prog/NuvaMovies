package anet.channel.p014a;

import android.text.TextUtils;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.fulltrace.C0939b;
import anet.channel.fulltrace.IFullTraceAnalysis;
import anet.channel.statist.RequestStatistic;
import anet.channel.util.ALog;
import com.taobao.analysis.abtest.ABTestCenter;
import com.taobao.analysis.fulltrace.FullTraceAnalysis;
import com.taobao.analysis.fulltrace.RequestInfo;
import com.taobao.analysis.scene.SceneIdentifier;

/* renamed from: anet.channel.a.a */
/* loaded from: classes.dex */
public class C0896a implements IFullTraceAnalysis {

    /* renamed from: a */
    private boolean f3785a;

    public C0896a() {
        try {
            Class.forName("com.taobao.analysis.fulltrace.FullTraceAnalysis");
            SceneIdentifier.setContext(GlobalAppRuntimeInfo.getContext());
            this.f3785a = true;
        } catch (Exception unused) {
            this.f3785a = false;
            ALog.m4787e("awcn.DefaultFullTraceAnalysis", "not supoort FullTraceAnalysis", null, new Object[0]);
        }
    }

    @Override // anet.channel.fulltrace.IFullTraceAnalysis
    public void commitRequest(String str, RequestStatistic requestStatistic) {
        if (this.f3785a && requestStatistic != null && !TextUtils.isEmpty(str)) {
            RequestInfo requestInfo = new RequestInfo();
            requestInfo.host = requestStatistic.host;
            requestInfo.bizId = requestStatistic.bizId;
            requestInfo.url = requestStatistic.url;
            requestInfo.retryTimes = requestStatistic.retryTimes;
            requestInfo.netType = requestStatistic.netType;
            requestInfo.protocolType = requestStatistic.protocolType;
            requestInfo.ret = requestStatistic.ret;
            requestInfo.isCbMain = false;
            requestInfo.isReqMain = requestStatistic.isReqMain;
            requestInfo.isReqSync = requestStatistic.isReqSync;
            requestInfo.netErrorCode = String.valueOf(requestStatistic.statusCode);
            requestInfo.pTraceId = requestStatistic.pTraceId;
            requestInfo.netReqStart = requestStatistic.netReqStart;
            requestInfo.netReqServiceBindEnd = requestStatistic.reqServiceTransmissionEnd;
            requestInfo.netReqProcessStart = requestStatistic.reqStart;
            requestInfo.netReqSendStart = requestStatistic.sendStart;
            requestInfo.netRspRecvEnd = requestStatistic.rspEnd;
            requestInfo.netRspCbDispatch = requestStatistic.rspCbDispatch;
            requestInfo.netRspCbStart = requestStatistic.rspCbStart;
            requestInfo.netRspCbEnd = requestStatistic.rspCbEnd;
            requestInfo.reqDeflateSize = requestStatistic.reqHeadDeflateSize + requestStatistic.reqBodyDeflateSize;
            requestInfo.reqInflateSize = requestStatistic.reqHeadInflateSize + requestStatistic.reqBodyInflateSize;
            requestInfo.rspDeflateSize = requestStatistic.rspHeadDeflateSize + requestStatistic.rspBodyDeflateSize;
            requestInfo.rspInflateSize = requestStatistic.rspHeadInflateSize + requestStatistic.rspBodyInflateSize;
            requestInfo.serverRT = requestStatistic.serverRT;
            requestInfo.sendDataTime = requestStatistic.sendDataTime;
            requestInfo.firstDataTime = requestStatistic.firstDataTime;
            requestInfo.recvDataTime = requestStatistic.recDataTime;
            FullTraceAnalysis.getInstance().commitRequest(str, "network", requestInfo);
        }
    }

    @Override // anet.channel.fulltrace.IFullTraceAnalysis
    public String createRequest() {
        if (this.f3785a) {
            return FullTraceAnalysis.getInstance().createRequest("network");
        }
        return null;
    }

    @Override // anet.channel.fulltrace.IFullTraceAnalysis
    public C0939b getSceneInfo() {
        if (this.f3785a) {
            C0939b c0939b = new C0939b();
            c0939b.f3893b = SceneIdentifier.isUrlLaunch();
            c0939b.f3894c = SceneIdentifier.getAppLaunchTime();
            c0939b.f3895d = SceneIdentifier.getLastLaunchTime();
            c0939b.f3896e = SceneIdentifier.getDeviceLevel();
            c0939b.f3892a = SceneIdentifier.getStartType();
            c0939b.f3897f = SceneIdentifier.getBucketInfo();
            c0939b.f3898g = ABTestCenter.getUTABTestBucketId("networksdk");
            return c0939b;
        }
        return null;
    }
}
