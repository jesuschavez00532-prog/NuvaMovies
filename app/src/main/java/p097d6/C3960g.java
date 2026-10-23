package p097d6;

import android.util.Base64;
import android.util.JsonReader;
import anet.channel.strategy.dispatch.DispatchConstants;
import com.lzy.okgo.cache.CacheEntity;
import com.lzy.okgo.cookie.SerializableCookie;
import com.taobao.accs.common.Constants;
import com.umeng.analytics.pro.C3309bd;
import com.umeng.analytics.pro.C3384f;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import p038c6.AbstractC1366a0;
import p038c6.C1365a;
import p038c6.C1368b0;
import p235m6.InterfaceC5597a;
import p261o6.C5920d;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;

/* renamed from: d6.g */
/* loaded from: classes.dex */
public class C3960g {

    /* renamed from: a */
    private static final InterfaceC5597a f17631a = new C5920d().m23936j(C1365a.f5108a).m23937k(true).m23935i();

    /* renamed from: d6.g$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        Object mo16781a(JsonReader jsonReader);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0019. Please report as an issue. */
    /* renamed from: A */
    private static AbstractC1366a0 m16782A(JsonReader jsonReader) throws java.io.IOException {
        AbstractC1366a0.b m6165b = AbstractC1366a0.m6165b();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -2118372775:
                    if (nextName.equals("ndkPayload")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1962630338:
                    if (nextName.equals(Constants.KEY_SDK_VERSION)) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -911706486:
                    if (nextName.equals("buildVersion")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 344431858:
                    if (nextName.equals("gmpAppId")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 719853845:
                    if (nextName.equals("installationUuid")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 1874684019:
                    if (nextName.equals(DispatchConstants.PLATFORM)) {
                        c10 = 5;
                        break;
                    }
                    break;
                case 1975623094:
                    if (nextName.equals("displayVersion")) {
                        c10 = 6;
                        break;
                    }
                    break;
                case 1984987798:
                    if (nextName.equals(C3384f.f14569aC)) {
                        c10 = 7;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    m6165b.mo6201f(m16807y(jsonReader));
                    break;
                case 1:
                    m6165b.mo6203h(jsonReader.nextString());
                    break;
                case 2:
                    m6165b.mo6197b(jsonReader.nextString());
                    break;
                case 3:
                    m6165b.mo6199d(jsonReader.nextString());
                    break;
                case 4:
                    m6165b.mo6200e(jsonReader.nextString());
                    break;
                case 5:
                    m6165b.mo6202g(jsonReader.nextInt());
                    break;
                case 6:
                    m6165b.mo6198c(jsonReader.nextString());
                    break;
                case 7:
                    m6165b.mo6204i(m16783B(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m6165b.mo6196a();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x001a. Please report as an issue. */
    /* renamed from: B */
    private static AbstractC1366a0.e m16783B(JsonReader jsonReader) {
        AbstractC1366a0.e.b m6223a = AbstractC1366a0.e.m6223a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -2128794476:
                    if (nextName.equals("startedAt")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1618432855:
                    if (nextName.equals("identifier")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -1606742899:
                    if (nextName.equals("endedAt")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case -1335157162:
                    if (nextName.equals("device")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case -1291329255:
                    if (nextName.equals(C3384f.f14604ax)) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 3556:
                    if (nextName.equals("os")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case 96801:
                    if (nextName.equals("app")) {
                        c10 = 6;
                        break;
                    }
                    break;
                case 3599307:
                    if (nextName.equals(C3309bd.f14106m)) {
                        c10 = 7;
                        break;
                    }
                    break;
                case 286956243:
                    if (nextName.equals("generator")) {
                        c10 = '\b';
                        break;
                    }
                    break;
                case 1025385094:
                    if (nextName.equals("crashed")) {
                        c10 = '\t';
                        break;
                    }
                    break;
                case 2047016109:
                    if (nextName.equals("generatorType")) {
                        c10 = '\n';
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    m6223a.mo6265l(jsonReader.nextLong());
                    break;
                case 1:
                    m6223a.m6263j(Base64.decode(jsonReader.nextString(), 2));
                    break;
                case 2:
                    m6223a.mo6258e(Long.valueOf(jsonReader.nextLong()));
                    break;
                case 3:
                    m6223a.mo6257d(m16795m(jsonReader));
                    break;
                case 4:
                    m6223a.mo6259f(m16793k(jsonReader, new a() { // from class: d6.a
                        @Override // p097d6.C3960g.a
                        /* renamed from: a */
                        public final Object mo16781a(JsonReader jsonReader2) throws java.io.IOException {
                            AbstractC1366a0.e.d m16796n;
                            m16796n = C3960g.m16796n(jsonReader2);
                            return m16796n;
                        }
                    }));
                    break;
                case 5:
                    m6223a.mo6264k(m16808z(jsonReader));
                    break;
                case 6:
                    m6223a.mo6255b(m16791i(jsonReader));
                    break;
                case 7:
                    m6223a.mo6266m(m16784C(jsonReader));
                    break;
                case '\b':
                    m6223a.mo6260g(jsonReader.nextString());
                    break;
                case '\t':
                    m6223a.mo6256c(jsonReader.nextBoolean());
                    break;
                case '\n':
                    m6223a.mo6261h(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m6223a.mo6254a();
    }

    /* renamed from: C */
    private static AbstractC1366a0.e.f m16784C(JsonReader jsonReader) {
        AbstractC1366a0.e.f.a m6405a = AbstractC1366a0.e.f.m6405a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (!nextName.equals("identifier")) {
                jsonReader.skipValue();
            } else {
                m6405a.mo6408b(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return m6405a.mo6407a();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0019. Please report as an issue. */
    /* renamed from: i */
    private static AbstractC1366a0.e.a m16791i(JsonReader jsonReader) {
        AbstractC1366a0.e.a.AbstractC7804a m6239a = AbstractC1366a0.e.a.m6239a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -1618432855:
                    if (nextName.equals("identifier")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -519438642:
                    if (nextName.equals("developmentPlatform")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 213652010:
                    if (nextName.equals("developmentPlatformVersion")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 351608024:
                    if (nextName.equals("version")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 719853845:
                    if (nextName.equals("installationUuid")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 1975623094:
                    if (nextName.equals("displayVersion")) {
                        c10 = 5;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    m6239a.mo6251e(jsonReader.nextString());
                    break;
                case 1:
                    m6239a.mo6248b(jsonReader.nextString());
                    break;
                case 2:
                    m6239a.mo6249c(jsonReader.nextString());
                    break;
                case 3:
                    m6239a.mo6253g(jsonReader.nextString());
                    break;
                case 4:
                    m6239a.mo6252f(jsonReader.nextString());
                    break;
                case 5:
                    m6239a.mo6250d(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m6239a.mo6247a();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0019. Please report as an issue. */
    /* renamed from: j */
    private static AbstractC1366a0.a m16792j(JsonReader jsonReader) {
        AbstractC1366a0.a.AbstractC7803a m6178a = AbstractC1366a0.a.m6178a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case 110987:
                    if (nextName.equals("pid")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 111312:
                    if (nextName.equals("pss")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 113234:
                    if (nextName.equals("rss")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 55126294:
                    if (nextName.equals("timestamp")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 202325402:
                    if (nextName.equals("processName")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 722137681:
                    if (nextName.equals("reasonCode")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case 723857505:
                    if (nextName.equals("traceFile")) {
                        c10 = 6;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c10 = 7;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    m6178a.mo6189c(jsonReader.nextInt());
                    break;
                case 1:
                    m6178a.mo6191e(jsonReader.nextLong());
                    break;
                case 2:
                    m6178a.mo6193g(jsonReader.nextLong());
                    break;
                case 3:
                    m6178a.mo6194h(jsonReader.nextLong());
                    break;
                case 4:
                    m6178a.mo6190d(jsonReader.nextString());
                    break;
                case 5:
                    m6178a.mo6192f(jsonReader.nextInt());
                    break;
                case 6:
                    m6178a.mo6195i(jsonReader.nextString());
                    break;
                case 7:
                    m6178a.mo6188b(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m6178a.mo6187a();
    }

    /* renamed from: k */
    private static C1368b0 m16793k(JsonReader jsonReader, a aVar) throws java.io.IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(aVar.mo16781a(jsonReader));
        }
        jsonReader.endArray();
        return C1368b0.m6409c(arrayList);
    }

    /* renamed from: l */
    public static AbstractC1366a0.c m16794l(JsonReader jsonReader) {
        AbstractC1366a0.c.a m6205a = AbstractC1366a0.c.m6205a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (!nextName.equals(CacheEntity.KEY)) {
                if (!nextName.equals("value")) {
                    jsonReader.skipValue();
                } else {
                    m6205a.mo6210c(jsonReader.nextString());
                }
            } else {
                m6205a.mo6209b(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return m6205a.mo6208a();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0019. Please report as an issue. */
    /* renamed from: m */
    private static AbstractC1366a0.e.c m16795m(JsonReader jsonReader) {
        AbstractC1366a0.e.c.a m6267a = AbstractC1366a0.e.c.m6267a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -1981332476:
                    if (nextName.equals("simulator")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1969347631:
                    if (nextName.equals("manufacturer")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 112670:
                    if (nextName.equals("ram")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 3002454:
                    if (nextName.equals("arch")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 81784169:
                    if (nextName.equals("diskSpace")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 94848180:
                    if (nextName.equals("cores")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case 104069929:
                    if (nextName.equals(Constants.KEY_MODEL)) {
                        c10 = 6;
                        break;
                    }
                    break;
                case 109757585:
                    if (nextName.equals("state")) {
                        c10 = 7;
                        break;
                    }
                    break;
                case 2078953423:
                    if (nextName.equals("modelClass")) {
                        c10 = '\b';
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    m6267a.mo6285i(jsonReader.nextBoolean());
                    break;
                case 1:
                    m6267a.mo6281e(jsonReader.nextString());
                    break;
                case 2:
                    m6267a.mo6284h(jsonReader.nextLong());
                    break;
                case 3:
                    m6267a.mo6278b(jsonReader.nextInt());
                    break;
                case 4:
                    m6267a.mo6280d(jsonReader.nextLong());
                    break;
                case 5:
                    m6267a.mo6279c(jsonReader.nextInt());
                    break;
                case 6:
                    m6267a.mo6282f(jsonReader.nextString());
                    break;
                case 7:
                    m6267a.mo6286j(jsonReader.nextInt());
                    break;
                case '\b':
                    m6267a.mo6283g(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m6267a.mo6277a();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0019. Please report as an issue. */
    /* renamed from: n */
    public static AbstractC1366a0.e.d m16796n(JsonReader jsonReader) {
        AbstractC1366a0.e.d.b m6287a = AbstractC1366a0.e.d.m6287a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -1335157162:
                    if (nextName.equals("device")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 96801:
                    if (nextName.equals("app")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 107332:
                    if (nextName.equals("log")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 3575610:
                    if (nextName.equals("type")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 55126294:
                    if (nextName.equals("timestamp")) {
                        c10 = 4;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    m6287a.mo6373c(m16799q(jsonReader));
                    break;
                case 1:
                    m6287a.mo6372b(m16797o(jsonReader));
                    break;
                case 2:
                    m6287a.mo6374d(m16803u(jsonReader));
                    break;
                case 3:
                    m6287a.mo6376f(jsonReader.nextString());
                    break;
                case 4:
                    m6287a.mo6375e(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m6287a.mo6371a();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0019. Please report as an issue. */
    /* renamed from: o */
    private static AbstractC1366a0.e.d.a m16797o(JsonReader jsonReader) {
        AbstractC1366a0.e.d.a.AbstractC7805a m6294a = AbstractC1366a0.e.d.a.m6294a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -1332194002:
                    if (nextName.equals("background")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1090974952:
                    if (nextName.equals("execution")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -80231855:
                    if (nextName.equals("internalKeys")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 555169704:
                    if (nextName.equals("customAttributes")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 928737948:
                    if (nextName.equals("uiOrientation")) {
                        c10 = 4;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    m6294a.mo6302b(Boolean.valueOf(jsonReader.nextBoolean()));
                    break;
                case 1:
                    m6294a.mo6304d(m16800r(jsonReader));
                    break;
                case 2:
                    m6294a.mo6305e(m16793k(jsonReader, new a() { // from class: d6.c
                        @Override // p097d6.C3960g.a
                        /* renamed from: a */
                        public final Object mo16781a(JsonReader jsonReader2) throws java.io.IOException {
                            AbstractC1366a0.c m16794l;
                            m16794l = C3960g.m16794l(jsonReader2);
                            return m16794l;
                        }
                    }));
                    break;
                case 3:
                    m6294a.mo6303c(m16793k(jsonReader, new a() { // from class: d6.c
                        @Override // p097d6.C3960g.a
                        /* renamed from: a */
                        public final Object mo16781a(JsonReader jsonReader2) throws java.io.IOException {
                            AbstractC1366a0.c m16794l;
                            m16794l = C3960g.m16794l(jsonReader2);
                            return m16794l;
                        }
                    }));
                    break;
                case 4:
                    m6294a.mo6306f(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m6294a.mo6301a();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x001a. Please report as an issue. */
    /* renamed from: p */
    public static AbstractC1366a0.e.d.a.b.AbstractC7806a m16798p(JsonReader jsonReader) {
        AbstractC1366a0.e.d.a.b.AbstractC7806a.AbstractC7807a m6313a = AbstractC1366a0.e.d.a.b.AbstractC7806a.m6313a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case 3373707:
                    if (nextName.equals(SerializableCookie.NAME)) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 3530753:
                    if (nextName.equals("size")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 3601339:
                    if (nextName.equals("uuid")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 1153765347:
                    if (nextName.equals("baseAddress")) {
                        c10 = 3;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    m6313a.mo6321c(jsonReader.nextString());
                    break;
                case 1:
                    m6313a.mo6322d(jsonReader.nextLong());
                    break;
                case 2:
                    m6313a.m6324f(Base64.decode(jsonReader.nextString(), 2));
                    break;
                case 3:
                    m6313a.mo6320b(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m6313a.mo6319a();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0019. Please report as an issue. */
    /* renamed from: q */
    private static AbstractC1366a0.e.d.c m16799q(JsonReader jsonReader) {
        AbstractC1366a0.e.d.c.a m6377a = AbstractC1366a0.e.d.c.m6377a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -1708606089:
                    if (nextName.equals("batteryLevel")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1455558134:
                    if (nextName.equals("batteryVelocity")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -1439500848:
                    if (nextName.equals("orientation")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 279795450:
                    if (nextName.equals("diskUsed")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 976541947:
                    if (nextName.equals("ramUsed")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 1516795582:
                    if (nextName.equals("proximityOn")) {
                        c10 = 5;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    m6377a.mo6385b(Double.valueOf(jsonReader.nextDouble()));
                    break;
                case 1:
                    m6377a.mo6386c(jsonReader.nextInt());
                    break;
                case 2:
                    m6377a.mo6388e(jsonReader.nextInt());
                    break;
                case 3:
                    m6377a.mo6387d(jsonReader.nextLong());
                    break;
                case 4:
                    m6377a.mo6390g(jsonReader.nextLong());
                    break;
                case 5:
                    m6377a.mo6389f(jsonReader.nextBoolean());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m6377a.mo6384a();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0019. Please report as an issue. */
    /* renamed from: r */
    private static AbstractC1366a0.e.d.a.b m16800r(JsonReader jsonReader) {
        AbstractC1366a0.e.d.a.b.AbstractC7808b m6307a = AbstractC1366a0.e.d.a.b.m6307a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -1375141843:
                    if (nextName.equals("appExitInfo")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1337936983:
                    if (nextName.equals("threads")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -902467928:
                    if (nextName.equals("signal")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 937615455:
                    if (nextName.equals("binaries")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 1481625679:
                    if (nextName.equals("exception")) {
                        c10 = 4;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    m6307a.mo6326b(m16792j(jsonReader));
                    break;
                case 1:
                    m6307a.mo6330f(m16793k(jsonReader, new a() { // from class: d6.d
                        @Override // p097d6.C3960g.a
                        /* renamed from: a */
                        public final Object mo16781a(JsonReader jsonReader2) throws java.io.IOException {
                            AbstractC1366a0.e.d.a.b.AbstractC7812e m16805w;
                            m16805w = C3960g.m16805w(jsonReader2);
                            return m16805w;
                        }
                    }));
                    break;
                case 2:
                    m6307a.mo6329e(m16804v(jsonReader));
                    break;
                case 3:
                    m6307a.mo6327c(m16793k(jsonReader, new a() { // from class: d6.e
                        @Override // p097d6.C3960g.a
                        /* renamed from: a */
                        public final Object mo16781a(JsonReader jsonReader2) throws java.io.IOException {
                            AbstractC1366a0.e.d.a.b.AbstractC7806a m16798p;
                            m16798p = C3960g.m16798p(jsonReader2);
                            return m16798p;
                        }
                    }));
                    break;
                case 4:
                    m6307a.mo6328d(m16801s(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m6307a.mo6325a();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0019. Please report as an issue. */
    /* renamed from: s */
    private static AbstractC1366a0.e.d.a.b.c m16801s(JsonReader jsonReader) {
        AbstractC1366a0.e.d.a.b.c.AbstractC7809a m6331a = AbstractC1366a0.e.d.a.b.c.m6331a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -1266514778:
                    if (nextName.equals("frames")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -934964668:
                    if (nextName.equals("reason")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 3575610:
                    if (nextName.equals("type")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 91997906:
                    if (nextName.equals("causedBy")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 581754413:
                    if (nextName.equals("overflowCount")) {
                        c10 = 4;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    m6331a.mo6339c(m16793k(jsonReader, new C3959f()));
                    break;
                case 1:
                    m6331a.mo6341e(jsonReader.nextString());
                    break;
                case 2:
                    m6331a.mo6342f(jsonReader.nextString());
                    break;
                case 3:
                    m6331a.mo6338b(m16801s(jsonReader));
                    break;
                case 4:
                    m6331a.mo6340d(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m6331a.mo6337a();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0019. Please report as an issue. */
    /* renamed from: t */
    public static AbstractC1366a0.e.d.a.b.AbstractC7812e.AbstractC7814b m16802t(JsonReader jsonReader) {
        AbstractC1366a0.e.d.a.b.AbstractC7812e.AbstractC7814b.AbstractC7815a m6359a = AbstractC1366a0.e.d.a.b.AbstractC7812e.AbstractC7814b.m6359a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -1019779949:
                    if (nextName.equals(IjkMediaPlayer.OnNativeInvokeListener.ARG_OFFSET)) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -887523944:
                    if (nextName.equals("symbol")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 3571:
                    if (nextName.equals("pc")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 3143036:
                    if (nextName.equals("file")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c10 = 4;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    m6359a.mo6368d(jsonReader.nextLong());
                    break;
                case 1:
                    m6359a.mo6370f(jsonReader.nextString());
                    break;
                case 2:
                    m6359a.mo6369e(jsonReader.nextLong());
                    break;
                case 3:
                    m6359a.mo6366b(jsonReader.nextString());
                    break;
                case 4:
                    m6359a.mo6367c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m6359a.mo6365a();
    }

    /* renamed from: u */
    private static AbstractC1366a0.e.d.AbstractC7816d m16803u(JsonReader jsonReader) {
        AbstractC1366a0.e.d.AbstractC7816d.a m6391a = AbstractC1366a0.e.d.AbstractC7816d.m6391a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (!nextName.equals("content")) {
                jsonReader.skipValue();
            } else {
                m6391a.mo6394b(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return m6391a.mo6393a();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0019. Please report as an issue. */
    /* renamed from: v */
    private static AbstractC1366a0.e.d.a.b.AbstractC7810d m16804v(JsonReader jsonReader) {
        AbstractC1366a0.e.d.a.b.AbstractC7810d.AbstractC7811a m6343a = AbstractC1366a0.e.d.a.b.AbstractC7810d.m6343a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -1147692044:
                    if (nextName.equals("address")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 3059181:
                    if (nextName.equals(Constants.KEY_HTTP_CODE)) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 3373707:
                    if (nextName.equals(SerializableCookie.NAME)) {
                        c10 = 2;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    m6343a.mo6348b(jsonReader.nextLong());
                    break;
                case 1:
                    m6343a.mo6349c(jsonReader.nextString());
                    break;
                case 2:
                    m6343a.mo6350d(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m6343a.mo6347a();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0019. Please report as an issue. */
    /* renamed from: w */
    public static AbstractC1366a0.e.d.a.b.AbstractC7812e m16805w(JsonReader jsonReader) {
        AbstractC1366a0.e.d.a.b.AbstractC7812e.AbstractC7813a m6351a = AbstractC1366a0.e.d.a.b.AbstractC7812e.m6351a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -1266514778:
                    if (nextName.equals("frames")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 3373707:
                    if (nextName.equals(SerializableCookie.NAME)) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c10 = 2;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    m6351a.mo6356b(m16793k(jsonReader, new C3959f()));
                    break;
                case 1:
                    m6351a.mo6358d(jsonReader.nextString());
                    break;
                case 2:
                    m6351a.mo6357c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m6351a.mo6355a();
    }

    /* renamed from: x */
    public static AbstractC1366a0.d.b m16806x(JsonReader jsonReader) {
        AbstractC1366a0.d.b.a m6217a = AbstractC1366a0.d.b.m6217a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (!nextName.equals("filename")) {
                if (!nextName.equals("contents")) {
                    jsonReader.skipValue();
                } else {
                    m6217a.mo6221b(Base64.decode(jsonReader.nextString(), 2));
                }
            } else {
                m6217a.mo6222c(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return m6217a.mo6220a();
    }

    /* renamed from: y */
    private static AbstractC1366a0.d m16807y(JsonReader jsonReader) {
        AbstractC1366a0.d.a m6211a = AbstractC1366a0.d.m6211a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (!nextName.equals("files")) {
                if (!nextName.equals("orgId")) {
                    jsonReader.skipValue();
                } else {
                    m6211a.mo6216c(jsonReader.nextString());
                }
            } else {
                m6211a.mo6215b(m16793k(jsonReader, new a() { // from class: d6.b
                    @Override // p097d6.C3960g.a
                    /* renamed from: a */
                    public final Object mo16781a(JsonReader jsonReader2) throws java.io.IOException {
                        AbstractC1366a0.d.b m16806x;
                        m16806x = C3960g.m16806x(jsonReader2);
                        return m16806x;
                    }
                }));
            }
        }
        jsonReader.endObject();
        return m6211a.mo6214a();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0019. Please report as an issue. */
    /* renamed from: z */
    private static AbstractC1366a0.e.AbstractC7817e m16808z(JsonReader jsonReader) {
        AbstractC1366a0.e.AbstractC7817e.a m6395a = AbstractC1366a0.e.AbstractC7817e.m6395a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -911706486:
                    if (nextName.equals("buildVersion")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -293026577:
                    if (nextName.equals("jailbroken")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 351608024:
                    if (nextName.equals("version")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 1874684019:
                    if (nextName.equals(DispatchConstants.PLATFORM)) {
                        c10 = 3;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    m6395a.mo6401b(jsonReader.nextString());
                    break;
                case 1:
                    m6395a.mo6402c(jsonReader.nextBoolean());
                    break;
                case 2:
                    m6395a.mo6404e(jsonReader.nextString());
                    break;
                case 3:
                    m6395a.mo6403d(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m6395a.mo6400a();
    }

    /* renamed from: D */
    public AbstractC1366a0 m16809D(String str) {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                AbstractC1366a0 m16782A = m16782A(jsonReader);
                jsonReader.close();
                return m16782A;
            } finally {
            }
        } catch (IllegalStateException e10) {
            throw new IOException(e10);
        }
    }

    /* renamed from: E */
    public String m16810E(AbstractC1366a0 abstractC1366a0) {
        return f17631a.mo22760b(abstractC1366a0);
    }

    /* renamed from: g */
    public AbstractC1366a0.e.d m16811g(String str) {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                AbstractC1366a0.e.d m16796n = m16796n(jsonReader);
                jsonReader.close();
                return m16796n;
            } finally {
            }
        } catch (IllegalStateException e10) {
            throw new IOException(e10);
        }
    }

    /* renamed from: h */
    public String m16812h(AbstractC1366a0.e.d dVar) {
        return f17631a.mo22760b(dVar);
    }
}
