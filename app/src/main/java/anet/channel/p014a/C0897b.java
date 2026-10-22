package anet.channel.p014a;

import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.flow.FlowStat;
import anet.channel.flow.INetworkAnalysis;
import anet.channel.util.ALog;
import com.taobao.analysis.FlowCenter;

/* renamed from: anet.channel.a.b */
/* loaded from: classes.dex */
public class C0897b implements INetworkAnalysis {

    /* renamed from: a */
    private boolean f3786a;

    public C0897b() {
        try {
            Class.forName("com.taobao.analysis.FlowCenter");
            this.f3786a = true;
        } catch (Exception unused) {
            this.f3786a = false;
            ALog.m4787e("DefaultNetworkAnalysis", "no NWNetworkAnalysisSDK sdk", null, new Object[0]);
        }
    }

    @Override // anet.channel.flow.INetworkAnalysis
    public void commitFlow(FlowStat flowStat) {
        if (this.f3786a) {
            FlowCenter.getInstance().commitFlow(GlobalAppRuntimeInfo.getContext(), flowStat.refer, flowStat.protocoltype, flowStat.req_identifier, flowStat.upstream, flowStat.downstream);
        }
    }
}
