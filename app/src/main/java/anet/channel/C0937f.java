package anet.channel;

import anet.channel.SessionRequest;
import anet.channel.entity.C0935b;
import anet.channel.entity.EventCb;
import anet.channel.util.ALog;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: anet.channel.f */
/* loaded from: classes.dex */
public class C0937f implements EventCb {

    /* renamed from: a */
    final /* synthetic */ SessionRequest.IConnCb f3886a;

    /* renamed from: b */
    final /* synthetic */ long f3887b;

    /* renamed from: c */
    final /* synthetic */ SessionRequest f3888c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0937f(SessionRequest sessionRequest, SessionRequest.IConnCb iConnCb, long j10) {
        this.f3888c = sessionRequest;
        this.f3886a = iConnCb;
        this.f3887b = j10;
    }

    @Override // anet.channel.entity.EventCb
    public void onEvent(Session session, int i10, C0935b c0935b) {
        int i11;
        String str;
        if (session == null) {
            return;
        }
        if (c0935b == null) {
            i11 = 0;
        } else {
            i11 = c0935b.f3881b;
        }
        if (c0935b == null) {
            str = "";
        } else {
            str = c0935b.f3882c;
        }
        if (i10 != 2) {
            if (i10 != 256) {
                if (i10 == 512) {
                    ALog.m4785d("awcn.SessionRequest", null, session.f3738p, "Session", session, "EventType", Integer.valueOf(i10), "Event", c0935b);
                    this.f3888c.m4498a(session, 0, (String) null);
                    this.f3886a.onSuccess(session, this.f3887b);
                    return;
                }
                return;
            }
            ALog.m4785d("awcn.SessionRequest", null, session.f3738p, "Session", session, "EventType", Integer.valueOf(i10), "Event", c0935b);
            this.f3886a.onFailed(session, this.f3887b, i10, i11);
            return;
        }
        ALog.m4785d("awcn.SessionRequest", null, session.f3738p, "Session", session, "EventType", Integer.valueOf(i10), "Event", c0935b);
        this.f3888c.m4498a(session, i11, str);
        SessionRequest sessionRequest = this.f3888c;
        if (sessionRequest.f3762b.m4553c(sessionRequest, session)) {
            this.f3886a.onDisConnect(session, this.f3887b, i10);
        } else {
            this.f3886a.onFailed(session, this.f3887b, i10, i11);
        }
    }
}
