package anet.channel.statist;

import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.C1002l;
import anet.channel.strategy.ConnProtocol;
import anet.channel.util.C1018c;

@Monitor(module = "networkPrefer", monitorPoint = "horseRace")
/* loaded from: classes.dex */
public class HorseRaceStat extends StatObject {

    @Dimension
    public volatile int connErrorCode;

    @Measure
    public volatile long connTime;

    @Dimension
    public volatile String host;

    /* renamed from: ip */
    @Dimension
    public volatile String f4039ip;

    @Dimension
    public volatile String localIP;

    @Dimension
    public volatile String path;

    @Dimension
    public volatile int pingSuccessCount;

    @Dimension
    public volatile int pingTimeoutCount;

    @Dimension
    public volatile int port;

    @Dimension
    public volatile String protocol;

    @Dimension
    public volatile int reqErrorCode;

    @Measure
    public volatile long reqTime;

    @Dimension
    public volatile int connRet = 0;

    @Dimension
    public volatile int reqRet = 0;

    @Dimension
    public volatile String nettype = NetworkStatusHelper.getNetworkSubType();

    @Dimension
    public volatile String mnc = NetworkStatusHelper.getSimOp();

    @Dimension
    public volatile String bssid = NetworkStatusHelper.getWifiBSSID();

    @Dimension
    public volatile int ipStackType = C1018c.m4799c();

    public HorseRaceStat(String str, C1002l.e eVar) {
        this.host = str;
        this.f4039ip = eVar.f4177a;
        this.port = eVar.f4178b.f4147a;
        this.protocol = ConnProtocol.valueOf(eVar.f4178b).name;
        this.path = eVar.f4179c;
    }
}
