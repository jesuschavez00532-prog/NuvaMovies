package anet.channel.detect;

import anet.channel.AwcnConfig;
import anet.channel.strategy.C1002l;
import anet.channel.strategy.IStrategyListener;
import anet.channel.util.ALog;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: anet.channel.detect.e */
/* loaded from: classes.dex */
public class C0916e implements IStrategyListener {

    /* renamed from: a */
    final /* synthetic */ C0915d f3833a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0916e(C0915d c0915d) {
        this.f3833a = c0915d;
    }

    @Override // anet.channel.strategy.IStrategyListener
    public void onStrategyUpdated(C1002l.d dVar) {
        C1002l.c[] cVarArr;
        int i10 = 0;
        ALog.m4788i("anet.HorseRaceDetector", "onStrategyUpdated", null, new Object[0]);
        if (AwcnConfig.isHorseRaceEnable() && (cVarArr = dVar.f4171c) != null && cVarArr.length != 0) {
            synchronized (this.f3833a.f3831a) {
                while (true) {
                    C1002l.c[] cVarArr2 = dVar.f4171c;
                    if (i10 < cVarArr2.length) {
                        C1002l.c cVar = cVarArr2[i10];
                        this.f3833a.f3831a.put(cVar.f4167a, cVar);
                        i10++;
                    }
                }
            }
        }
    }
}
