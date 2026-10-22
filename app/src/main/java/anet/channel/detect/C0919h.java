package anet.channel.detect;

import anet.channel.Session;
import anet.channel.entity.C0935b;
import anet.channel.entity.EventCb;
import anet.channel.request.Request;
import anet.channel.session.TnetSpdySession;
import anet.channel.statist.HorseRaceStat;
import anet.channel.strategy.C1002l;
import anet.channel.util.ALog;
import anet.channel.util.HttpUrl;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: anet.channel.detect.h */
/* loaded from: classes.dex */
public class C0919h implements EventCb {

    /* renamed from: a */
    final /* synthetic */ HorseRaceStat f3836a;

    /* renamed from: b */
    final /* synthetic */ long f3837b;

    /* renamed from: c */
    final /* synthetic */ String f3838c;

    /* renamed from: d */
    final /* synthetic */ C1002l.e f3839d;

    /* renamed from: e */
    final /* synthetic */ TnetSpdySession f3840e;

    /* renamed from: f */
    final /* synthetic */ C0915d f3841f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0919h(C0915d c0915d, HorseRaceStat horseRaceStat, long j10, String str, C1002l.e eVar, TnetSpdySession tnetSpdySession) {
        this.f3841f = c0915d;
        this.f3836a = horseRaceStat;
        this.f3837b = j10;
        this.f3838c = str;
        this.f3839d = eVar;
        this.f3840e = tnetSpdySession;
    }

    @Override // anet.channel.entity.EventCb
    public void onEvent(Session session, int i10, C0935b c0935b) {
        if (this.f3836a.connTime != 0) {
            return;
        }
        this.f3836a.connTime = System.currentTimeMillis() - this.f3837b;
        if (i10 == 1) {
            ALog.m4788i("anet.HorseRaceDetector", "tnetSpdySession connect success", this.f3838c, new Object[0]);
            this.f3836a.connRet = 1;
            HttpUrl parse = HttpUrl.parse(session.getHost() + this.f3839d.f4179c);
            if (parse == null) {
                return;
            }
            this.f3840e.request(new Request.Builder().setUrl(parse).setReadTimeout(this.f3839d.f4178b.f4150d).setRedirectEnable(false).setSeq(this.f3838c).build(), new C0920i(this));
            return;
        }
        this.f3836a.connErrorCode = c0935b.f3881b;
        synchronized (this.f3836a) {
            this.f3836a.notify();
        }
    }
}
