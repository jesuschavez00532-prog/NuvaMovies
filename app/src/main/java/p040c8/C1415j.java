package p040c8;

import android.text.TextUtils;
import be.C1328x;
import com.live.p063db.ChannelList;
import com.live.p063db.LiveLockedUpDao;
import com.request.result.Channel;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p117ea.AbstractC4161e;
import p117ea.C4160d;
import p201k2.AbstractC5086c;
import p317rb.AbstractC6567a;
import p348u2.AbstractC7029f;
import p359ue.AbstractC7166t;

/* renamed from: c8.j */
/* loaded from: classes2.dex */
public final class C1415j {

    /* renamed from: a */
    public static final C1415j f5500a;

    /* renamed from: b */
    private static final String f5501b;

    /* renamed from: c */
    private static HashMap f5502c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c8.j$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        final /* synthetic */ InterfaceC1409g f5503a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC1409g interfaceC1409g) {
            super(1);
            this.f5503a = interfaceC1409g;
        }

        /* renamed from: a */
        public final void m6575a(String str) {
            if (!C4160d.f18217d.m17392d()) {
                return;
            }
            InterfaceC1409g interfaceC1409g = this.f5503a;
            if (interfaceC1409g != null) {
                interfaceC1409g.mo6540G();
            }
            InterfaceC1409g interfaceC1409g2 = this.f5503a;
            if (interfaceC1409g2 != null) {
                interfaceC1409g2.mo6539F();
            }
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m6575a((String) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c8.j$b */
    /* loaded from: classes2.dex */
    public static final class b extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final b f5504a = new b();

        b() {
            super(1);
        }

        /* renamed from: a */
        public final void m6576a(Throwable th) {
            th.printStackTrace();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m6576a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    static {
        C1415j c1415j = new C1415j();
        f5500a = c1415j;
        f5501b = c1415j.getClass().getSimpleName();
        f5502c = new HashMap();
    }

    private C1415j() {
    }

    /* renamed from: d */
    public static /* synthetic */ boolean m6561d(C1415j c1415j, Channel channel, InterfaceC1409g interfaceC1409g, String str, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str = "LiveFragment";
        }
        return c1415j.m6568c(channel, interfaceC1409g, str);
    }

    /* renamed from: e */
    private final boolean m6562e(ChannelList channelList, InterfaceC1409g interfaceC1409g) {
        boolean m27723j;
        boolean z10 = false;
        boolean z11 = false;
        String locked_start_time = channelList.getLocked_start_time();
        String locked_end_time = channelList.getLocked_end_time();
        String locked_time_zone = channelList.getLocked_time_zone();
        try {
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        if (!TextUtils.isEmpty(locked_start_time) && !TextUtils.isEmpty(locked_end_time)) {
            String m20618k = AbstractC5086c.m20618k();
            if (TextUtils.isEmpty(locked_time_zone)) {
                AbstractC5868k.m23673e(m20618k, "curZone");
                locked_time_zone = m20618k;
            }
            String format = new SimpleDateFormat("HH:mm", Locale.US).format(new Date());
            m27723j = AbstractC7166t.m27723j(m20618k, locked_time_zone, true);
            if (!m27723j) {
                String m20614g = AbstractC5086c.m20614g("yyyy-MM-dd");
                locked_start_time = AbstractC5086c.m20627t(locked_time_zone, m20614g + ' ' + locked_start_time, "yyyy-MM-dd HH:mm");
                AbstractC5868k.m23673e(locked_start_time, "transferTimeToLocal(time…startTime\", localPattern)");
                locked_end_time = AbstractC5086c.m20627t(locked_time_zone, m20614g + ' ' + locked_end_time, "yyyy-MM-dd HH:mm");
                AbstractC5868k.m23673e(locked_end_time, "transferTimeToLocal(time… $endTime\", localPattern)");
            }
            if (locked_start_time.compareTo(locked_end_time) < 0) {
                AbstractC5868k.m23673e(format, "nowTime");
                if (locked_start_time.compareTo(format) <= 0 && locked_end_time.compareTo(format) >= 0) {
                    if (AbstractC4161e.f18225a.m17399b().length() == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        if (interfaceC1409g != null) {
                            interfaceC1409g.mo6541H();
                        }
                    } else if (interfaceC1409g != null) {
                        interfaceC1409g.mo6542I();
                    }
                    return true;
                }
            } else {
                AbstractC5868k.m23673e(format, "nowTime");
                if ((locked_start_time.compareTo(format) <= 0 && format.compareTo("23:59") <= 0) || (locked_start_time.compareTo("00:00") >= 0 && format.compareTo(locked_end_time) <= 0)) {
                    if (AbstractC4161e.f18225a.m17399b().length() == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        if (interfaceC1409g != null) {
                            interfaceC1409g.mo6541H();
                        }
                    } else if (interfaceC1409g != null) {
                        interfaceC1409g.mo6542I();
                    }
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    /* renamed from: g */
    public static /* synthetic */ void m6563g(C1415j c1415j, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "LiveFragment";
        }
        c1415j.m6569f(str);
    }

    /* renamed from: j */
    private final void m6564j(long j10, InterfaceC1409g interfaceC1409g, String str) {
        m6569f(str);
        if (interfaceC1409g == null) {
            return;
        }
        Observable compose = Observable.just("find lock time range, request input password.").delay(j10 / 1000, TimeUnit.SECONDS).compose(AbstractC7029f.m27121b());
        final a aVar = new a(interfaceC1409g);
        Consumer consumer = new Consumer() { // from class: c8.h
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C1415j.m6565k(InterfaceC5660l.this, obj);
            }
        };
        final b bVar = b.f5504a;
        Disposable subscribe = compose.subscribe(consumer, new Consumer() { // from class: c8.i
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C1415j.m6566l(InterfaceC5660l.this, obj);
            }
        });
        HashMap hashMap = f5502c;
        AbstractC5868k.m23673e(subscribe, "lockMonitorDisposable");
        hashMap.put(str, subscribe);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static final void m6565k(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static final void m6566l(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* renamed from: p */
    public static /* synthetic */ void m6567p(C1415j c1415j, ChannelList channelList, InterfaceC1409g interfaceC1409g, String str, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str = "LiveFragment";
        }
        c1415j.m6574o(channelList, interfaceC1409g, str);
    }

    /* renamed from: c */
    public final boolean m6568c(Channel channel, InterfaceC1409g interfaceC1409g, String str) {
        AbstractC5868k.m23674f(channel, "channel");
        AbstractC5868k.m23674f(str, "form");
        AbstractC5868k.m23669a(channel.getRestricted(), "1");
        C1415j c1415j = f5500a;
        ChannelList m6573n = c1415j.m6573n(channel.getChannelCode());
        if (!C4160d.f18217d.m17392d()) {
            if (m6573n != null) {
                c1415j.m6574o(m6573n, interfaceC1409g, str);
            }
            return false;
        }
        if (m6573n != null) {
            if (m6562e(m6573n, interfaceC1409g)) {
                return true;
            }
            m6574o(m6573n, interfaceC1409g, str);
        }
        return false;
    }

    /* renamed from: f */
    public final void m6569f(String str) {
        AbstractC5868k.m23674f(str, "form");
        Disposable disposable = (Disposable) f5502c.get(str);
        boolean z10 = false;
        if (disposable != null && !disposable.isDisposed()) {
            z10 = true;
        }
        if (z10) {
            disposable.dispose();
            f5502c.remove(str);
        }
    }

    /* renamed from: h */
    public final boolean m6570h(String str) {
        AbstractC5868k.m23674f(str, "programCode");
        return LiveLockedUpDao.Companion.getInstance().deleteItemById(str);
    }

    /* renamed from: i */
    public final boolean m6571i(ChannelList channelList) {
        return LiveLockedUpDao.Companion.getInstance().insert(channelList);
    }

    /* renamed from: m */
    public final ArrayList m6572m() {
        return LiveLockedUpDao.Companion.getInstance().queryAll();
    }

    /* renamed from: n */
    public final ChannelList m6573n(String str) {
        if (AbstractC6567a.m25634d(str)) {
            return null;
        }
        LiveLockedUpDao companion = LiveLockedUpDao.Companion.getInstance();
        AbstractC5868k.m23671c(str);
        return companion.queryByCode(str);
    }

    /* renamed from: o */
    public final void m6574o(ChannelList channelList, InterfaceC1409g interfaceC1409g, String str) {
        boolean m27723j;
        Long m20625r;
        AbstractC5868k.m23674f(channelList, "lockedChannel");
        AbstractC5868k.m23674f(str, "form");
        String locked_start_time = channelList.getLocked_start_time();
        String locked_time_zone = channelList.getLocked_time_zone();
        try {
            if (AbstractC6567a.m25634d(locked_start_time)) {
                return;
            }
            String m20618k = AbstractC5086c.m20618k();
            if (TextUtils.isEmpty(locked_time_zone)) {
                AbstractC5868k.m23673e(m20618k, "curZone");
                locked_time_zone = m20618k;
            }
            String m20614g = AbstractC5086c.m20614g("yyyy-MM-dd");
            m27723j = AbstractC7166t.m27723j(m20618k, locked_time_zone, true);
            if (!m27723j) {
                m20625r = AbstractC5086c.m20626s(m20618k, m20614g + ' ' + locked_start_time, "yyyy-MM-dd HH:mm");
            } else {
                m20625r = AbstractC5086c.m20625r(m20614g + ' ' + locked_start_time, "yyyy-MM-dd HH:mm");
            }
            long longValue = m20625r.longValue() - System.currentTimeMillis();
            if (longValue >= 0) {
                m6564j(longValue, interfaceC1409g, str);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
