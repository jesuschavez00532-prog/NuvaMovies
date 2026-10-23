package p040c8;

import android.content.Context;
import android.text.TextUtils;
import be.C1328x;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.live.bean.EpgDate;
import com.live.bean.ReserveDate;
import com.live.p063db.LiveEpgDao;
import com.live.p063db.LiveReserveDao;
import com.live.p063db.ReservationList;
import com.lzy.okgo.model.Progress;
import com.module.event.ToStartPlayBackEvent;
import com.request.bean.BackProgram;
import com.request.bean.ChannelEpg;
import com.request.bean.EpgProgram;
import com.request.result.Channel;
import com.umeng.analytics.pro.C3384f;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import me.InterfaceC5660l;
import me.InterfaceC5664p;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p043ce.AbstractC1500l;
import p043ce.AbstractC1504p;
import p099d8.C3964a;
import p099d8.C3965b;
import p099d8.C3966c;
import p099d8.InterfaceC3967d;
import p201k2.AbstractC5086c;
import p317rb.AbstractC6567a;
import p348u2.AbstractC7027d;
import p348u2.AbstractC7029f;
import p359ue.AbstractC7166t;
import p400xa.C7594o0;
import p401xb.C7626d;
import p401xb.InterfaceC7623a;
import ye.C7709c;

/* renamed from: c8.v */
/* loaded from: classes2.dex */
public final class C1427v implements InterfaceC7623a {

    /* renamed from: a */
    public static final C1427v f5519a;

    /* renamed from: b */
    private static final String f5520b;

    /* renamed from: c */
    private static String f5521c;

    /* renamed from: d */
    private static HashMap f5522d;

    /* renamed from: e */
    private static final ArrayList f5523e;

    /* renamed from: f */
    private static final ArrayList f5524f;

    /* renamed from: g */
    private static int f5525g;

    /* renamed from: h */
    private static String f5526h;

    /* renamed from: i */
    private static Channel f5527i;

    /* renamed from: j */
    private static Channel f5528j;

    /* renamed from: k */
    private static int f5529k;

    /* renamed from: l */
    private static boolean f5530l;

    /* renamed from: m */
    private static HashMap f5531m;

    /* renamed from: c8.v$a */
    /* loaded from: classes2.dex */
    static final class a extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        final /* synthetic */ String f5532a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str) {
            super(1);
            this.f5532a = str;
        }

        /* renamed from: a */
        public final void m6661a(ArrayList arrayList) {
            C1427v c1427v = C1427v.f5519a;
            AbstractC5868k.m23673e(arrayList, "it");
            c1427v.m6656r0(arrayList);
            C7709c.m29787d().m29801m(new ToStartPlayBackEvent(this.f5532a));
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m6661a((ArrayList) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: c8.v$b */
    /* loaded from: classes2.dex */
    static final class b extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final b f5533a = new b();

        b() {
            super(1);
        }

        /* renamed from: a */
        public final void m6662a(Throwable th) {
            th.printStackTrace();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m6662a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: c8.v$c */
    /* loaded from: classes2.dex */
    public static final class c extends TypeToken<List<? extends EpgProgram>> {
        c() {
        }
    }

    /* renamed from: c8.v$d */
    /* loaded from: classes2.dex */
    public static final class d extends TypeToken<ArrayList<EpgProgram>> {
        d() {
        }
    }

    /* renamed from: c8.v$e */
    /* loaded from: classes2.dex */
    static final class e extends AbstractC5869l implements InterfaceC5664p {

        /* renamed from: a */
        public static final e f5534a = new e();

        e() {
            super(2);
        }

        @Override // me.InterfaceC5664p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer mo2391h(EpgProgram epgProgram, EpgProgram epgProgram2) {
            int i10 = 0;
            String startTime = epgProgram.getStartTime();
            if (startTime != null) {
                String startTime2 = epgProgram2.getStartTime();
                if (startTime2 == null) {
                    startTime2 = "";
                }
                i10 = startTime.compareTo(startTime2);
            } else {
                i10 = 0;
            }
            return Integer.valueOf(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c8.v$f */
    /* loaded from: classes2.dex */
    public static final class f extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final f f5535a = new f();

        f() {
            super(1);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ArrayList mo542f(String str) {
            AbstractC5868k.m23674f(str, "it");
            StringBuilder sb2 = new StringBuilder();
            String substring = str.substring(0, 4);
            AbstractC5868k.m23673e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            sb2.append(substring);
            sb2.append('-');
            String substring2 = str.substring(4, 6);
            AbstractC5868k.m23673e(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
            sb2.append(substring2);
            sb2.append('-');
            String substring3 = str.substring(6, 8);
            AbstractC5868k.m23673e(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
            sb2.append(substring3);
            return C1427v.f5519a.m6581F(sb2.toString(), str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c8.v$g */
    /* loaded from: classes2.dex */
    public static final class g extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final g f5536a = new g();

        g() {
            super(1);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HashMap mo542f(ArrayList arrayList) {
            AbstractC5868k.m23674f(arrayList, "epgList");
            HashMap hashMap = new HashMap(arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ChannelEpg channelEpg = (ChannelEpg) it.next();
                channelEpg.setEpgJson(null);
                if (!AbstractC6567a.m25634d(channelEpg.getChannelCode()) && !AbstractC6567a.m25635e(channelEpg.getProgramList())) {
                    String channelCode = channelEpg.getChannelCode();
                    AbstractC5868k.m23671c(channelCode);
                    AbstractC5868k.m23673e(channelEpg, "downloadEpg");
                    hashMap.put(channelCode, channelEpg);
                }
            }
            return hashMap;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c8.v$h */
    /* loaded from: classes2.dex */
    public static final class h extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final h f5537a = new h();

        h() {
            super(1);
        }

        /* renamed from: a */
        public final void m6666a(HashMap hashMap) {
            synchronized (C1427v.f5521c) {
                AbstractC5868k.m23673e(hashMap, "it");
                C1427v.f5522d = hashMap;
                C1328x c1328x = C1328x.f4998a;
            }
            if (AbstractC6567a.m25635e(C1427v.f5524f)) {
                return;
            }
            Iterator it = C1427v.f5524f.iterator();
            while (it.hasNext()) {
                ((InterfaceC1416k) it.next()).mo6577Y0(C1427v.f5522d);
            }
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m6666a((HashMap) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c8.v$i */
    /* loaded from: classes2.dex */
    public static final class i extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final i f5538a = new i();

        i() {
            super(1);
        }

        /* renamed from: a */
        public final void m6667a(Throwable th) {
            th.printStackTrace();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m6667a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    static {
        C1427v c1427v = new C1427v();
        f5519a = c1427v;
        f5520b = c1427v.getClass().getSimpleName();
        f5521c = "";
        f5522d = new HashMap();
        f5523e = new ArrayList();
        f5524f = new ArrayList();
        f5525g = -1;
        f5529k = -1;
        f5531m = new HashMap();
    }

    private C1427v() {
    }

    /* renamed from: A0 */
    private final void m6579A0() {
        C1414i0.f5493a.m6555i();
    }

    /* renamed from: E */
    private final List m6580E(String str, String str2) {
        ChannelEpg queryByCodeAndDate;
        if (!AbstractC6567a.m25634d(str) && (queryByCodeAndDate = new LiveEpgDao().queryByCodeAndDate(str, str2)) != null && !AbstractC6567a.m25634d(queryByCodeAndDate.getEpgJson())) {
            try {
                Object fromJson = AbstractC7027d.m27114a().fromJson(queryByCodeAndDate.getEpgJson(), new c().getType());
                AbstractC5868k.m23673e(fromJson, "getJsoner().fromJson(cha…t<EpgProgram>>() {}.type)");
                List list = (List) fromJson;
                if (AbstractC6567a.m25635e(list)) {
                    return null;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((EpgProgram) it.next()).setType("1");
                }
                return list;
            } catch (JsonSyntaxException e10) {
                e10.printStackTrace();
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F */
    public final ArrayList m6581F(String str, String str2) {
        ArrayList<ChannelEpg> queryByDate = new LiveEpgDao().queryByDate(str);
        if (AbstractC6567a.m25635e(queryByDate)) {
            return new ArrayList();
        }
        Gson m27114a = AbstractC7027d.m27114a();
        AbstractC5868k.m23673e(queryByDate, "queryChannelEpgs");
        for (ChannelEpg channelEpg : queryByDate) {
            if (!AbstractC6567a.m25634d(channelEpg.getEpgJson())) {
                Object fromJson = m27114a.fromJson(channelEpg.getEpgJson(), new d().getType());
                if (AbstractC6567a.m25638h((List) fromJson)) {
                    AbstractC5868k.m23671c(fromJson);
                    ArrayList<EpgProgram> arrayList = (ArrayList) fromJson;
                    int size = arrayList.size();
                    while (true) {
                        size--;
                        if (-1 >= size) {
                            break;
                        }
                        EpgProgram epgProgram = arrayList.get(size);
                        AbstractC5868k.m23673e(epgProgram, "epgPrograms!![index]");
                        EpgProgram epgProgram2 = epgProgram;
                        String endTime = epgProgram2.getEndTime();
                        if (endTime == null) {
                            endTime = "";
                        }
                        if (str2.compareTo(endTime) > 0) {
                            arrayList.remove(epgProgram2);
                        } else {
                            epgProgram2.setType("1");
                        }
                    }
                    channelEpg.setProgramList(arrayList);
                }
            }
        }
        return queryByDate;
    }

    /* renamed from: T */
    private final boolean m6582T(EpgProgram epgProgram) {
        String date = epgProgram.getDate();
        String start = epgProgram.getStart();
        String stop = epgProgram.getStop();
        if (TextUtils.isEmpty(stop) || TextUtils.isEmpty(date) || TextUtils.isEmpty(start)) {
            return true;
        }
        if (!TextUtils.isEmpty(stop) && AbstractC5868k.m23669a(stop, "00:00")) {
            return false;
        }
        String startTime = epgProgram.getStartTime();
        String str = "";
        if (startTime == null) {
            startTime = "";
        }
        String endTime = epgProgram.getEndTime();
        if (endTime != null) {
            str = endTime;
        }
        if (startTime.compareTo(str) > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: g0 */
    private final void m6589g0(Gson gson, LiveEpgDao liveEpgDao, ArrayList arrayList, HashMap hashMap, ChannelEpg channelEpg, String str) {
        if (channelEpg == null) {
            return;
        }
        ArrayList<EpgProgram> programList = channelEpg.getProgramList();
        if (programList != null) {
            AbstractC1504p.m6994m(programList, new Comparator() { // from class: c8.u
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int m6591h0;
                    m6591h0 = C1427v.m6591h0((EpgProgram) obj, (EpgProgram) obj2);
                    return m6591h0;
                }
            });
        }
        ArrayList<EpgProgram> programList2 = channelEpg.getProgramList();
        if (programList2 != null) {
            for (EpgProgram epgProgram : programList2) {
                if (epgProgram.getYearAndDate().compareTo(str) >= 0) {
                    ArrayList arrayList2 = (ArrayList) hashMap.get(epgProgram.getDate());
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList(56);
                        hashMap.put(epgProgram.getDate(), arrayList2);
                    }
                    arrayList2.add(epgProgram);
                }
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            Object value = entry.getValue();
            AbstractC5868k.m23673e(value, "entry.value");
            ArrayList arrayList3 = (ArrayList) value;
            if (AbstractC6567a.m25638h(arrayList3)) {
                ChannelEpg m16814e = C3964a.m16814e();
                m16814e.setChannelCode(channelEpg.getChannelCode());
                m16814e.setEpgDate((String) entry.getKey());
                m16814e.setEpgJson(gson.toJson(arrayList3));
                arrayList.add(m16814e);
            }
        }
        liveEpgDao.insertChannelEpg(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h0 */
    public static final int m6591h0(EpgProgram epgProgram, EpgProgram epgProgram2) {
        String startTime = epgProgram.getStartTime();
        String str = "";
        if (startTime == null) {
            startTime = "";
        }
        String startTime2 = epgProgram2.getStartTime();
        if (startTime2 != null) {
            str = startTime2;
        }
        return startTime.compareTo(str);
    }

    /* renamed from: i0 */
    private final void m6593i0(File file) {
        final LiveEpgDao liveEpgDao = new LiveEpgDao();
        liveEpgDao.deleteTable();
        final Gson m27114a = AbstractC7027d.m27114a();
        final String format = new SimpleDateFormat("yyyyMMdd", Locale.getDefault()).format(new Date());
        final ArrayList arrayList = new ArrayList(8);
        final HashMap hashMap = new HashMap(16);
        try {
            new C3965b().m16824c(file, new InterfaceC3967d() { // from class: c8.p
                @Override // p099d8.InterfaceC3967d
                /* renamed from: a */
                public final void mo6578a(ChannelEpg channelEpg) {
                    C1427v.m6595j0(Gson.this, liveEpgDao, arrayList, hashMap, format, channelEpg);
                }
            });
            C3966c.m16827h();
            C3964a.m16815h();
        } catch (IOException e10) {
            e10.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j0 */
    public static final void m6595j0(Gson gson, LiveEpgDao liveEpgDao, ArrayList arrayList, HashMap hashMap, String str, ChannelEpg channelEpg) {
        AbstractC5868k.m23674f(liveEpgDao, "$liveEpgDao");
        AbstractC5868k.m23674f(arrayList, "$saveEpgList");
        AbstractC5868k.m23674f(hashMap, "$everyDayEpg");
        C1427v c1427v = f5519a;
        AbstractC5868k.m23673e(gson, "gson");
        AbstractC5868k.m23673e(str, "today");
        c1427v.m6589g0(gson, liveEpgDao, arrayList, hashMap, channelEpg, str);
        C3966c.m16829j(channelEpg.getProgramList());
        C3964a.m16816i(channelEpg);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C3964a.m16816i((ChannelEpg) it.next());
        }
        arrayList.clear();
        f5519a.m6609x(hashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public static final void m6602s(ArrayList arrayList, int i10, ObservableEmitter observableEmitter) {
        AbstractC5868k.m23674f(observableEmitter, "it");
        ArrayList arrayList2 = new ArrayList();
        if (arrayList != null) {
            int i11 = 0;
            for (Object obj : arrayList) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    AbstractC1500l.m6991j();
                }
                EpgProgram epgProgram = (EpgProgram) obj;
                if (i11 >= i10 && f5519a.m6635V(epgProgram) == 0) {
                    arrayList2.add(epgProgram);
                }
                i11 = i12;
            }
        }
        observableEmitter.onNext(arrayList2);
        observableEmitter.onComplete();
    }

    /* renamed from: s0 */
    private final void m6603s0(ArrayList arrayList) {
        boolean z10 = false;
        String m27728o = null;
        String m27728o2 = null;
        int m20615h = AbstractC5086c.m20615h();
        if (arrayList != null && arrayList.size() > 0) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj = arrayList.get(i10);
                AbstractC5868k.m23673e(obj, "reservationLists[i]");
                ReservationList reservationList = (ReservationList) obj;
                String time = reservationList.getTime();
                if (time != null && time.length() == 11) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    String substring = time.substring(0, 5);
                    AbstractC5868k.m23673e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    m27728o = AbstractC7166t.m27728o(substring, ":", "", false, 4, null);
                    Integer valueOf = Integer.valueOf(m27728o);
                    String substring2 = time.substring(6, time.length());
                    AbstractC5868k.m23673e(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    m27728o2 = AbstractC7166t.m27728o(substring2, ":", "", false, 4, null);
                    Integer valueOf2 = Integer.valueOf(m27728o2);
                    if (valueOf.intValue() > valueOf2.intValue()) {
                        if (m20615h >= valueOf.intValue() || m20615h < valueOf2.intValue()) {
                            reservationList.setPlaying(true);
                        }
                    } else if (m20615h >= valueOf.intValue() && m20615h < valueOf2.intValue()) {
                        reservationList.setPlaying(true);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public static final void m6604t(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public static final void m6605u(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u0 */
    public static final int m6606u0(InterfaceC5664p interfaceC5664p, Object obj, Object obj2) {
        AbstractC5868k.m23674f(interfaceC5664p, "$tmp0");
        return ((Number) interfaceC5664p.mo2391h(obj, obj2)).intValue();
    }

    /* renamed from: v0 */
    private final void m6607v0() {
        if (!C7626d.f28065a.m29394k()) {
            m6619D();
            return;
        }
        String format = new SimpleDateFormat("yyyyMMddHHmmss", Locale.getDefault()).format(new Date());
        synchronized (f5521c) {
            AbstractC5868k.m23673e(format, "curTime");
            String substring = format.substring(0, 8);
            AbstractC5868k.m23673e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            if (AbstractC5868k.m23669a(f5521c, substring)) {
                ArrayList arrayList = f5524f;
                if (AbstractC6567a.m25635e(arrayList)) {
                    return;
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((InterfaceC1416k) it.next()).mo6577Y0(f5522d);
                }
                return;
            }
            f5521c = substring;
            C1328x c1328x = C1328x.f4998a;
            Observable just = Observable.just(format);
            final f fVar = f.f5535a;
            Observable map = just.map(new Function() { // from class: c8.l
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    ArrayList m6608w0;
                    m6608w0 = C1427v.m6608w0(InterfaceC5660l.this, obj);
                    return m6608w0;
                }
            });
            final g gVar = g.f5536a;
            Observable compose = map.map(new Function() { // from class: c8.m
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    HashMap m6610x0;
                    m6610x0 = C1427v.m6610x0(InterfaceC5660l.this, obj);
                    return m6610x0;
                }
            }).compose(AbstractC7029f.m27121b());
            final h hVar = h.f5537a;
            Consumer consumer = new Consumer() { // from class: c8.n
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C1427v.m6612y0(InterfaceC5660l.this, obj);
                }
            };
            final i iVar = i.f5538a;
            compose.subscribe(consumer, new Consumer() { // from class: c8.o
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C1427v.m6613z0(InterfaceC5660l.this, obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w0 */
    public static final ArrayList m6608w0(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (ArrayList) interfaceC5660l.mo542f(obj);
    }

    /* renamed from: x */
    private final void m6609x(HashMap hashMap) {
        if (hashMap.size() <= 0) {
            return;
        }
        Collection<ArrayList> values = hashMap.values();
        AbstractC5868k.m23673e(values, "everyDayEpg.values");
        for (ArrayList arrayList : values) {
            if (AbstractC6567a.m25638h(arrayList)) {
                arrayList.clear();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x0 */
    public static final HashMap m6610x0(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (HashMap) interfaceC5660l.mo542f(obj);
    }

    /* renamed from: y */
    private final boolean m6611y(boolean z10) {
        String m20614g = AbstractC5086c.m20614g("yyyyMMddHHmm");
        LiveReserveDao liveReserveDao = LiveReserveDao.INSTANCE;
        AbstractC5868k.m23673e(m20614g, "curDate");
        boolean deleteExpireData = liveReserveDao.deleteExpireData(Long.parseLong(m20614g));
        if (z10) {
            m6579A0();
        }
        return deleteExpireData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y0 */
    public static final void m6612y0(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z0 */
    public static final void m6613z0(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* renamed from: A */
    public final boolean m6614A(String str) {
        AbstractC5868k.m23674f(str, Progress.DATE);
        boolean deleteByDate = LiveReserveDao.INSTANCE.deleteByDate(str);
        m6579A0();
        return deleteByDate;
    }

    /* renamed from: B */
    public final void m6615B(ReservationList reservationList) {
        if (reservationList == null) {
            return;
        }
        LiveReserveDao.INSTANCE.deleteItemById(reservationList.getChannelCode(), reservationList.getContent(), reservationList.getTime());
        m6579A0();
    }

    /* renamed from: B0 */
    public final void m6616B0(InterfaceC1416k interfaceC1416k) {
        AbstractC5868k.m23674f(interfaceC1416k, "callback");
        ArrayList arrayList = f5524f;
        if (!arrayList.contains(interfaceC1416k)) {
            return;
        }
        arrayList.remove(interfaceC1416k);
    }

    /* renamed from: C */
    public final void m6617C(Channel channel, EpgProgram epgProgram) {
        String str = null;
        String str2 = null;
        String str3 = null;
        LiveReserveDao liveReserveDao = LiveReserveDao.INSTANCE;
        String str4 = null;
        if (channel != null) {
            str = channel.getChannelCode();
        } else {
            str = null;
        }
        if (epgProgram != null) {
            str2 = epgProgram.getProgramName();
        } else {
            str2 = null;
        }
        StringBuilder sb2 = new StringBuilder();
        if (epgProgram != null) {
            str3 = epgProgram.getStart();
        } else {
            str3 = null;
        }
        sb2.append(str3);
        sb2.append('-');
        if (epgProgram != null) {
            str4 = epgProgram.getStop();
        }
        sb2.append(str4);
        liveReserveDao.deleteItemById(str, str2, sb2.toString());
    }

    /* renamed from: C0 */
    public final void m6618C0(ReservationList reservationList) {
        AbstractC5868k.m23674f(reservationList, "reserve");
        LiveReserveDao.INSTANCE.updateItemByDCT(reservationList.getChannelCode(), reservationList.getDate(), reservationList.getContent(), reservationList.getTime(), reservationList.isRestore());
        m6579A0();
    }

    /* renamed from: D */
    public final void m6619D() {
        C7626d.f28065a.m29395s();
    }

    /* renamed from: D0 */
    public final void m6620D0(ReservationList reservationList) {
        AbstractC5868k.m23674f(reservationList, "reserve");
        LiveReserveDao.INSTANCE.updateNotifyByDCT(reservationList.getChannelCode(), reservationList.getDate(), reservationList.getContent(), reservationList.getTime(), reservationList.isNotified());
    }

    /* renamed from: G */
    public final boolean m6621G() {
        return f5530l;
    }

    /* renamed from: H */
    public final Channel m6622H() {
        return f5527i;
    }

    /* renamed from: I */
    public final String m6623I() {
        String str = f5526h;
        if (str == null) {
            return "";
        }
        return str;
    }

    /* renamed from: J */
    public final int m6624J() {
        return f5525g;
    }

    /* renamed from: K */
    public final int m6625K() {
        return f5529k;
    }

    /* renamed from: L */
    public final ArrayList m6626L(String str) {
        ArrayList<EpgProgram> backProgramList;
        if (str == null) {
            return new ArrayList();
        }
        BackProgram backProgram = (BackProgram) f5531m.get(str);
        if (backProgram == null || (backProgramList = backProgram.getBackProgramList()) == null) {
            return new ArrayList();
        }
        return backProgramList;
    }

    /* renamed from: M */
    public final long m6627M(String str) {
        AbstractC5868k.m23674f(str, "channelCode");
        BackProgram backProgram = (BackProgram) f5531m.get(str);
        if (backProgram != null) {
            return backProgram.getRequestTime();
        }
        return 0L;
    }

    /* renamed from: N */
    public final ArrayList m6628N(String str, EpgDate epgDate) {
        ArrayList arrayList = new ArrayList();
        if (!C7626d.f28065a.m29394k()) {
            m6619D();
            return arrayList;
        }
        if (!AbstractC6567a.m25634d(str) && epgDate != null) {
            List<EpgProgram> m6580E = m6580E(str, epgDate.getYearInfo());
            String format = new SimpleDateFormat("yyyyMMddHHmmss", Locale.getDefault()).format(new Date());
            if (AbstractC6567a.m25638h(m6580E) && m6580E != null) {
                for (EpgProgram epgProgram : m6580E) {
                    String endTime = epgProgram.getEndTime();
                    if (endTime == null) {
                        endTime = "";
                    }
                    if (format.compareTo(endTime) < 0) {
                        arrayList.add(epgProgram);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: O */
    public final ArrayList m6629O(EpgDate epgDate, List list) {
        AbstractC5868k.m23674f(list, "epgPrograms");
        ArrayList arrayList = new ArrayList();
        String m20614g = AbstractC5086c.m20614g("yyyy-MM-dd");
        if (epgDate != null && !AbstractC6567a.m25635e(list) && m20614g.compareTo(epgDate.getYearInfo()) >= 0) {
            String str = m20614g + new SimpleDateFormat("HH:mm", Locale.getDefault()).format(new Date());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                EpgProgram epgProgram = (EpgProgram) it.next();
                if (AbstractC5868k.m23669a(epgProgram.getDate(), epgDate.getYearInfo())) {
                    if (str.compareTo(epgProgram.getDate() + epgProgram.getStart()) > 0) {
                        if (str.compareTo(epgProgram.getDate() + epgProgram.getStop()) > 0) {
                            arrayList.add(epgProgram);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: P */
    public final Channel m6630P() {
        return f5528j;
    }

    /* renamed from: Q */
    public final ArrayList m6631Q() {
        return f5523e;
    }

    /* renamed from: R */
    public final void m6632R(Context context, int i10) {
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        C7626d c7626d = C7626d.f28065a;
        c7626d.m29392i(context, i10);
        c7626d.m29396v(this);
    }

    /* renamed from: S */
    public final void m6633S(Channel channel, EpgDate epgDate, EpgProgram epgProgram) {
        AbstractC5868k.m23674f(epgDate, "epgDate");
        AbstractC5868k.m23674f(epgProgram, "epg");
        if (channel == null) {
            return;
        }
        LiveReserveDao liveReserveDao = LiveReserveDao.INSTANCE;
        String channelCode = channel.getChannelCode();
        String name = channel.getName();
        String yearInfo = epgDate.getYearInfo();
        String str = epgProgram.getStart() + '-' + epgProgram.getStop();
        String programName = epgProgram.getProgramName();
        if (programName == null) {
            programName = "";
        }
        liveReserveDao.insert(new ReservationList(channelCode, name, yearInfo, str, programName, C7594o0.f27942a.m29220i(channel.getPosterList(), C7594o0.a.Icon), 1));
        m6579A0();
    }

    /* renamed from: U */
    public final boolean m6634U() {
        return C7626d.f28065a.m29393j();
    }

    /* renamed from: V */
    public final int m6635V(EpgProgram epgProgram) {
        AbstractC5868k.m23674f(epgProgram, "epgResultData");
        long time = new Date().getTime();
        String date = epgProgram.getDate();
        String start = epgProgram.getStart();
        String str = date + ' ' + start;
        String str2 = date + ' ' + epgProgram.getStop();
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.getDefault());
            long time2 = simpleDateFormat.parse(str).getTime();
            long time3 = simpleDateFormat.parse(str2).getTime();
            if (time2 > time3) {
                time3 += 86400000;
            }
            if (time3 < time) {
                return 0;
            }
            if (time >= time2 && time <= time3) {
                return 1;
            }
            if (time >= time2) {
                return 0;
            }
            return 2;
        } catch (ParseException e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    /* renamed from: W */
    public final boolean m6636W(String str) {
        String str2 = null;
        if (AbstractC6567a.m25634d(str)) {
            return false;
        }
        Channel channel = f5528j;
        if (channel != null) {
            str2 = channel.getChannelCode();
        } else {
            str2 = null;
        }
        if (!AbstractC5868k.m23669a(str, str2)) {
            return false;
        }
        return true;
    }

    /* renamed from: X */
    public final void m6637X(InterfaceC1404d0 interfaceC1404d0) {
        AbstractC5868k.m23674f(interfaceC1404d0, "callback");
        C1414i0.f5493a.m6554h(interfaceC1404d0);
    }

    /* renamed from: Y */
    public final ArrayList m6638Y(String str) {
        ArrayList arrayList = new ArrayList();
        if (!C7626d.f28065a.m29394k()) {
            return arrayList;
        }
        String format = new SimpleDateFormat("yyyyMMddHHmmss", Locale.getDefault()).format(new Date());
        StringBuilder sb2 = new StringBuilder();
        AbstractC5868k.m23673e(format, "curTime");
        String substring = format.substring(0, 4);
        AbstractC5868k.m23673e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        sb2.append(substring);
        sb2.append('-');
        String substring2 = format.substring(4, 6);
        AbstractC5868k.m23673e(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
        sb2.append(substring2);
        sb2.append('-');
        String substring3 = format.substring(6, 8);
        AbstractC5868k.m23673e(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
        sb2.append(substring3);
        List m6580E = m6580E(str, sb2.toString());
        if (AbstractC6567a.m25638h(m6580E)) {
            AbstractC5868k.m23671c(m6580E);
            Iterator it = m6580E.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                EpgProgram epgProgram = (EpgProgram) it.next();
                if (!AbstractC6567a.m25634d(epgProgram.getProgramName())) {
                    String startTime = epgProgram.getStartTime();
                    String str2 = "";
                    if (startTime == null) {
                        startTime = "";
                    }
                    if (format.compareTo(startTime) >= 0) {
                        String endTime = epgProgram.getEndTime();
                        if (endTime == null) {
                            endTime = "";
                        }
                        if (format.compareTo(endTime) <= 0) {
                            arrayList.add(epgProgram);
                        }
                    }
                    String startTime2 = epgProgram.getStartTime();
                    if (startTime2 != null) {
                        str2 = startTime2;
                    }
                    if (format.compareTo(str2) < 0) {
                        arrayList.add(epgProgram);
                        break;
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: Z */
    public final ArrayList m6639Z(long j10, boolean z10) {
        int i10 = 0;
        if (z10) {
            i10 = -6;
        } else {
            i10 = 0;
        }
        ArrayList arrayList = new ArrayList();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        while (i10 < 7) {
            String format = simpleDateFormat.format(new Date((i10 * 24 * 3600000) + j10));
            AbstractC5868k.m23673e(format, "yearInfo");
            String substring = format.substring(5);
            AbstractC5868k.m23673e(substring, "this as java.lang.String).substring(startIndex)");
            arrayList.add(new EpgDate(substring, format));
            i10++;
        }
        return arrayList;
    }

    @Override // p401xb.InterfaceC7623a
    /* renamed from: a */
    public void mo6640a(File file) {
        AbstractC5868k.m23674f(file, "epgFile");
        if (!file.exists()) {
            return;
        }
        try {
            m6593i0(file);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* renamed from: a0 */
    public final void m6641a0(List list, String str) {
        AbstractC5868k.m23674f(list, "epgPrograms");
        if (!AbstractC6567a.m25635e(list) && !AbstractC6567a.m25634d(str)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                EpgProgram epgProgram = (EpgProgram) it.next();
                if (LiveReserveDao.INSTANCE.queryById(str, epgProgram.getProgramName(), epgProgram.getStart() + '-' + epgProgram.getStop(), epgProgram.getDate())) {
                    epgProgram.setFlag(1);
                } else {
                    epgProgram.setFlag(0);
                }
            }
        }
    }

    /* renamed from: b0 */
    public final ArrayList m6642b0(EpgDate epgDate, EpgProgram epgProgram) {
        AbstractC5868k.m23674f(epgDate, "epgDate");
        AbstractC5868k.m23674f(epgProgram, "epg");
        ArrayList<ReservationList> queryStartTime = LiveReserveDao.INSTANCE.queryStartTime(epgProgram.getStart(), epgDate.getYearInfo());
        AbstractC5868k.m23673e(queryStartTime, "INSTANCE.queryStartTime(…tart(), epgDate.yearInfo)");
        return queryStartTime;
    }

    /* renamed from: c0 */
    public final ArrayList m6643c0() {
        m6611y(false);
        String m20614g = AbstractC5086c.m20614g("yyyy-MM-dd HH:mm");
        AbstractC5868k.m23673e(m20614g, Progress.DATE);
        String substring = m20614g.substring(0, 10);
        AbstractC5868k.m23673e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        String substring2 = m20614g.substring(11);
        AbstractC5868k.m23673e(substring2, "this as java.lang.String).substring(startIndex)");
        ArrayList<ReservationList> queryReserveNotifyList = LiveReserveDao.INSTANCE.queryReserveNotifyList(substring, substring2);
        AbstractC5868k.m23673e(queryReserveNotifyList, "INSTANCE.queryReserveNotifyList(curDate, curTime)");
        return queryReserveNotifyList;
    }

    /* renamed from: d0 */
    public final ArrayList m6644d0(long j10) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < 7; i10++) {
            Date date = new Date((i10 * 24 * 3600000) + j10);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            String valueOf = String.valueOf(calendar.get(1));
            String valueOf2 = String.valueOf(calendar.get(2) + 1);
            String valueOf3 = String.valueOf(calendar.get(5));
            Integer valueOf4 = Integer.valueOf(valueOf2);
            AbstractC5868k.m23673e(valueOf4, "valueOf(month)");
            if (valueOf4.intValue() < 10) {
                valueOf2 = '0' + valueOf2;
            }
            Integer valueOf5 = Integer.valueOf(valueOf3);
            AbstractC5868k.m23673e(valueOf5, "valueOf(day)");
            if (valueOf5.intValue() < 10) {
                valueOf3 = '0' + valueOf3;
            }
            arrayList.add(new ReserveDate(valueOf2 + '-' + valueOf3, valueOf + '-' + valueOf2 + '-' + valueOf3));
        }
        return arrayList;
    }

    /* renamed from: e0 */
    public final ArrayList m6645e0(String str) {
        AbstractC5868k.m23674f(str, Progress.DATE);
        m6611y(false);
        ArrayList<ReservationList> queryByDate = LiveReserveDao.INSTANCE.queryByDate(str);
        m6603s0(queryByDate);
        AbstractC5868k.m23673e(queryByDate, "reserveList");
        return queryByDate;
    }

    /* renamed from: f0 */
    public final void m6646f0(InterfaceC1416k interfaceC1416k) {
        AbstractC5868k.m23674f(interfaceC1416k, "callback");
        ArrayList arrayList = f5524f;
        if (arrayList.contains(interfaceC1416k)) {
            return;
        }
        arrayList.add(interfaceC1416k);
        m6607v0();
    }

    /* renamed from: k0 */
    public final void m6647k0(boolean z10) {
        f5530l = z10;
    }

    /* renamed from: l0 */
    public final void m6648l0(Channel channel) {
        AbstractC5868k.m23674f(channel, "backChannel");
        f5527i = channel;
    }

    /* renamed from: m0 */
    public final void m6649m0(String str) {
        AbstractC5868k.m23674f(str, "backChannelCode");
        f5526h = str;
    }

    /* renamed from: n0 */
    public final void m6650n0(int i10) {
        f5525g = i10;
    }

    /* renamed from: o0 */
    public final void m6651o0(int i10) {
        f5529k = i10;
    }

    @Override // p401xb.InterfaceC7623a
    public void onFinished() {
        if (!AbstractC6567a.m25635e(f5524f)) {
            m6607v0();
        }
    }

    /* renamed from: p0 */
    public final void m6652p0(String str, ArrayList arrayList) {
        AbstractC5868k.m23674f(str, "channelCode");
        AbstractC5868k.m23674f(arrayList, "epgPrograms");
        f5531m.put(str, new BackProgram(str, arrayList, System.currentTimeMillis()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ed, code lost:
    
        if (r5 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0106, code lost:
    
        if (r9 == null) goto L38;
     */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList m6653q(java.util.List r17) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c8.C1427v.m6653q(java.util.List):java.util.ArrayList");
    }

    /* renamed from: q0 */
    public final void m6654q0(Channel channel) {
        f5528j = channel;
    }

    /* renamed from: r */
    public final void m6655r(final ArrayList arrayList, final int i10, String str) {
        if (AbstractC6567a.m25635e(arrayList)) {
            return;
        }
        Observable compose = Observable.create(new ObservableOnSubscribe() { // from class: c8.q
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                C1427v.m6602s(arrayList, i10, observableEmitter);
            }
        }).compose(AbstractC7029f.m27121b());
        final a aVar = new a(str);
        Consumer consumer = new Consumer() { // from class: c8.r
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C1427v.m6604t(InterfaceC5660l.this, obj);
            }
        };
        final b bVar = b.f5533a;
        compose.subscribe(consumer, new Consumer() { // from class: c8.s
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C1427v.m6605u(InterfaceC5660l.this, obj);
            }
        });
    }

    /* renamed from: r0 */
    public final void m6656r0(ArrayList arrayList) {
        AbstractC5868k.m23674f(arrayList, "playingEpgs");
        ArrayList arrayList2 = f5523e;
        arrayList2.clear();
        if (!AbstractC6567a.m25635e(arrayList)) {
            arrayList2.addAll(arrayList);
        }
    }

    /* renamed from: t0 */
    public final void m6657t0(List list) {
        if (AbstractC6567a.m25635e(list)) {
            return;
        }
        try {
            final e eVar = e.f5534a;
            Collections.sort(list, new Comparator() { // from class: c8.t
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int m6606u0;
                    m6606u0 = C1427v.m6606u0(InterfaceC5664p.this, obj, obj2);
                    return m6606u0;
                }
            });
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* renamed from: v */
    public final void m6658v() {
        C1414i0.f5493a.m6553f();
    }

    /* renamed from: w */
    public final void m6659w(String str) {
        BackProgram backProgram;
        ArrayList<EpgProgram> backProgramList;
        if (str != null && (backProgram = (BackProgram) f5531m.get(str)) != null && (backProgramList = backProgram.getBackProgramList()) != null) {
            backProgramList.clear();
        }
    }

    /* renamed from: z */
    public final void m6660z(ReservationList reservationList) {
        AbstractC5868k.m23674f(reservationList, "reserve");
        LiveReserveDao.INSTANCE.deleteItemByDCT(reservationList.getChannelCode(), reservationList.getDate(), reservationList.getContent(), reservationList.getTime());
        m6579A0();
    }
}
