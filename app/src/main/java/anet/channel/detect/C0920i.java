package anet.channel.detect;

import anet.channel.RequestCb;
import anet.channel.bytes.ByteArray;
import anet.channel.statist.HorseRaceStat;
import anet.channel.statist.RequestStatistic;
import anet.channel.util.ALog;
import java.util.List;
import java.util.Map;

/* renamed from: anet.channel.detect.i */
/* loaded from: classes.dex */
class C0920i implements RequestCb {

    /* renamed from: a */
    final /* synthetic */ C0919h f3842a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0920i(C0919h c0919h) {
        this.f3842a = c0919h;
    }

    @Override // anet.channel.RequestCb
    public void onDataReceive(ByteArray byteArray, boolean z10) {
    }

    @Override // anet.channel.RequestCb
    public void onFinish(int i10, String str, RequestStatistic requestStatistic) {
        int i11 = 0;
        ALog.m4788i("anet.HorseRaceDetector", "LongLinkTask request finish", this.f3842a.f3838c, "statusCode", Integer.valueOf(i10), "msg", str);
        if (this.f3842a.f3836a.reqErrorCode == 0) {
            this.f3842a.f3836a.reqErrorCode = i10;
        } else {
            HorseRaceStat horseRaceStat = this.f3842a.f3836a;
            if (horseRaceStat.reqErrorCode == 200) {
                i11 = 1;
            }
            horseRaceStat.reqRet = i11;
        }
        HorseRaceStat horseRaceStat2 = this.f3842a.f3836a;
        long currentTimeMillis = System.currentTimeMillis();
        C0919h c0919h = this.f3842a;
        horseRaceStat2.reqTime = (currentTimeMillis - c0919h.f3837b) + c0919h.f3836a.connTime;
        synchronized (this.f3842a.f3836a) {
            this.f3842a.f3836a.notify();
        }
    }

    @Override // anet.channel.RequestCb
    public void onResponseCode(int i10, Map<String, List<String>> map) {
        this.f3842a.f3836a.reqErrorCode = i10;
    }
}
