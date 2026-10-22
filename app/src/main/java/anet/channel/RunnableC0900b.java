package anet.channel;

import anet.channel.entity.C0935b;
import anet.channel.entity.EventCb;
import anet.channel.util.ALog;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: anet.channel.b */
/* loaded from: classes.dex */
public class RunnableC0900b implements Runnable {

    /* renamed from: a */
    final /* synthetic */ int f3794a;

    /* renamed from: b */
    final /* synthetic */ C0935b f3795b;

    /* renamed from: c */
    final /* synthetic */ Session f3796c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0900b(Session session, int i10, C0935b c0935b) {
        this.f3796c = session;
        this.f3794a = i10;
        this.f3795b = c0935b;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            Map<EventCb, Integer> map = this.f3796c.f3724b;
            if (map != null) {
                for (EventCb eventCb : map.keySet()) {
                    if (eventCb != null) {
                        int intValue = this.f3796c.f3724b.get(eventCb).intValue();
                        int i10 = this.f3794a;
                        if ((intValue & i10) != 0) {
                            try {
                                eventCb.onEvent(this.f3796c, i10, this.f3795b);
                            } catch (Exception e10) {
                                ALog.m4787e("awcn.Session", e10.toString(), this.f3796c.f3738p, new Object[0]);
                            }
                        }
                    }
                }
            }
        } catch (Exception e11) {
            ALog.m4786e("awcn.Session", "handleCallbacks", this.f3796c.f3738p, e11, new Object[0]);
        }
    }
}
