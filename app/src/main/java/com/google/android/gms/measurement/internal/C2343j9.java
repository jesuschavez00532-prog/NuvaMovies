package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import anet.channel.strategy.dispatch.DispatchConstants;
import com.google.android.gms.internal.measurement.C1848b;
import com.google.android.gms.internal.measurement.C1884d3;
import com.google.android.gms.internal.measurement.C1886d5;
import com.google.android.gms.internal.measurement.C1916f3;
import com.google.android.gms.internal.measurement.C1918f5;
import com.google.android.gms.internal.measurement.C1934g5;
import com.google.android.gms.internal.measurement.C1942gd;
import com.google.android.gms.internal.measurement.C1949h5;
import com.google.android.gms.internal.measurement.C1978j4;
import com.google.android.gms.internal.measurement.C1992k3;
import com.google.android.gms.internal.measurement.C2008l4;
import com.google.android.gms.internal.measurement.C2022m3;
import com.google.android.gms.internal.measurement.C2023m4;
import com.google.android.gms.internal.measurement.C2038n4;
import com.google.android.gms.internal.measurement.C2057o8;
import com.google.android.gms.internal.measurement.C2083q4;
import com.google.android.gms.internal.measurement.C2097r3;
import com.google.android.gms.internal.measurement.C2098r4;
import com.google.android.gms.internal.measurement.C2173w4;
import com.google.android.gms.internal.measurement.C2188x4;
import com.google.android.gms.internal.measurement.C2203y4;
import com.google.android.gms.internal.measurement.InterfaceC1875ca;
import com.lzy.okgo.cookie.SerializableCookie;
import com.raizlabs.android.dbflow.sql.language.Operator;
import com.umeng.analytics.pro.C3325bt;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import p025b5.AbstractC1119q;
import p219l4.AbstractC5391n;
import p233m4.AbstractC5594b;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;

/* renamed from: com.google.android.gms.measurement.internal.j9 */
/* loaded from: classes.dex */
public final class C2343j9 extends AbstractC2485w8 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C2343j9(C2310g9 c2310g9) {
        super(c2310g9);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public static InterfaceC1875ca m9669C(InterfaceC1875ca interfaceC1875ca, byte[] bArr) {
        C2057o8 m8755a = C2057o8.m8755a();
        if (m8755a != null) {
            return interfaceC1875ca.mo8193q(bArr, m8755a);
        }
        return interfaceC1875ca.mo8192c(bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H */
    public static List m9670H(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            long j10 = 0;
            for (int i11 = 0; i11 < 64; i11++) {
                int i12 = (i10 * 64) + i11;
                if (i12 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i12)) {
                    j10 |= 1 << i11;
                }
            }
            arrayList.add(Long.valueOf(j10));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: L */
    public static boolean m9671L(List list, int i10) {
        if (i10 < list.size() * 64) {
            if (((1 << (i10 % 64)) & ((Long) list.get(i10 / 64)).longValue()) != 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: N */
    public static boolean m9672N(String str) {
        if (str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: P */
    public static final void m9673P(C2023m4 c2023m4, String str, Object obj) {
        List m8687H = c2023m4.m8687H();
        int i10 = 0;
        while (true) {
            if (i10 < m8687H.size()) {
                if (str.equals(((C2098r4) m8687H.get(i10)).m8891D())) {
                    break;
                } else {
                    i10++;
                }
            } else {
                i10 = -1;
                break;
            }
        }
        C2083q4 m8877B = C2098r4.m8877B();
        m8877B.m8783B(str);
        if (obj instanceof Long) {
            m8877B.m8782A(((Long) obj).longValue());
        }
        if (i10 >= 0) {
            c2023m4.m8681B(i10, m8877B);
        } else {
            c2023m4.m8693w(m8877B);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public static final boolean m9674m(C2465v c2465v, C2453t9 c2453t9) {
        AbstractC5391n.m21783i(c2465v);
        AbstractC5391n.m21783i(c2453t9);
        if (TextUtils.isEmpty(c2453t9.f9085b) && TextUtils.isEmpty(c2453t9.f9100q)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public static final C2098r4 m9675n(C2038n4 c2038n4, String str) {
        for (C2098r4 c2098r4 : c2038n4.m8729F()) {
            if (c2098r4.m8891D().equals(str)) {
                return c2098r4;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public static final Object m9676o(C2038n4 c2038n4, String str) {
        C2098r4 m9675n = m9675n(c2038n4, str);
        if (m9675n != null) {
            if (m9675n.m8898W()) {
                return m9675n.m8892E();
            }
            if (m9675n.m8896U()) {
                return Long.valueOf(m9675n.m8890A());
            }
            if (m9675n.m8894Q()) {
                return Double.valueOf(m9675n.m8899x());
            }
            if (m9675n.m8901z() > 0) {
                List<C2098r4> m8893F = m9675n.m8893F();
                ArrayList arrayList = new ArrayList();
                for (C2098r4 c2098r4 : m8893F) {
                    if (c2098r4 != null) {
                        Bundle bundle = new Bundle();
                        for (C2098r4 c2098r42 : c2098r4.m8893F()) {
                            if (c2098r42.m8898W()) {
                                bundle.putString(c2098r42.m8891D(), c2098r42.m8892E());
                            } else if (c2098r42.m8896U()) {
                                bundle.putLong(c2098r42.m8891D(), c2098r42.m8890A());
                            } else if (c2098r42.m8894Q()) {
                                bundle.putDouble(c2098r42.m8891D(), c2098r42.m8899x());
                            }
                        }
                        if (!bundle.isEmpty()) {
                            arrayList.add(bundle);
                        }
                    }
                }
                return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
            }
            return null;
        }
        return null;
    }

    /* renamed from: p */
    private final void m9677p(StringBuilder sb2, int i10, List list) {
        String str;
        String str2;
        Long l10;
        if (list == null) {
            return;
        }
        int i11 = i10 + 1;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C2098r4 c2098r4 = (C2098r4) it.next();
            if (c2098r4 != null) {
                m9679r(sb2, i11);
                sb2.append("param {\n");
                Double d10 = null;
                if (c2098r4.m8897V()) {
                    str = this.f8714a.m10022D().m9642e(c2098r4.m8891D());
                } else {
                    str = null;
                }
                m9682u(sb2, i11, SerializableCookie.NAME, str);
                if (c2098r4.m8898W()) {
                    str2 = c2098r4.m8892E();
                } else {
                    str2 = null;
                }
                m9682u(sb2, i11, "string_value", str2);
                if (c2098r4.m8896U()) {
                    l10 = Long.valueOf(c2098r4.m8890A());
                } else {
                    l10 = null;
                }
                m9682u(sb2, i11, "int_value", l10);
                if (c2098r4.m8894Q()) {
                    d10 = Double.valueOf(c2098r4.m8899x());
                }
                m9682u(sb2, i11, "double_value", d10);
                if (c2098r4.m8901z() > 0) {
                    m9677p(sb2, i11, c2098r4.m8893F());
                }
                m9679r(sb2, i11);
                sb2.append("}\n");
            }
        }
    }

    /* renamed from: q */
    private final void m9678q(StringBuilder sb2, int i10, C1916f3 c1916f3) {
        String str;
        if (c1916f3 == null) {
            return;
        }
        m9679r(sb2, i10);
        sb2.append("filter {\n");
        if (c1916f3.m8372E()) {
            m9682u(sb2, i10, "complement", Boolean.valueOf(c1916f3.m8371D()));
        }
        if (c1916f3.m8374G()) {
            m9682u(sb2, i10, "param_name", this.f8714a.m10022D().m9642e(c1916f3.m8370B()));
        }
        if (c1916f3.m8375H()) {
            int i11 = i10 + 1;
            C2097r3 m8369A = c1916f3.m8369A();
            if (m8369A != null) {
                m9679r(sb2, i11);
                sb2.append("string_filter {\n");
                if (m8369A.m8874F()) {
                    switch (m8369A.m8875G()) {
                        case 1:
                            str = "UNKNOWN_MATCH_TYPE";
                            break;
                        case 2:
                            str = "REGEXP";
                            break;
                        case 3:
                            str = "BEGINS_WITH";
                            break;
                        case 4:
                            str = "ENDS_WITH";
                            break;
                        case 5:
                            str = "PARTIAL";
                            break;
                        case 6:
                            str = "EXACT";
                            break;
                        default:
                            str = "IN_LIST";
                            break;
                    }
                    m9682u(sb2, i11, "match_type", str);
                }
                if (m8369A.m8873E()) {
                    m9682u(sb2, i11, "expression", m8369A.m8869A());
                }
                if (m8369A.m8872D()) {
                    m9682u(sb2, i11, "case_sensitive", Boolean.valueOf(m8369A.m8871C()));
                }
                if (m8369A.m8876x() > 0) {
                    m9679r(sb2, i11 + 1);
                    sb2.append("expression_list {\n");
                    for (String str2 : m8369A.m8870B()) {
                        m9679r(sb2, i11 + 2);
                        sb2.append(str2);
                        sb2.append("\n");
                    }
                    sb2.append("}\n");
                }
                m9679r(sb2, i11);
                sb2.append("}\n");
            }
        }
        if (c1916f3.m8373F()) {
            m9683v(sb2, i10 + 1, "number_filter", c1916f3.m8376z());
        }
        m9679r(sb2, i10);
        sb2.append("}\n");
    }

    /* renamed from: r */
    private static final void m9679r(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append("  ");
        }
    }

    /* renamed from: s */
    private static final String m9680s(boolean z10, boolean z11, boolean z12) {
        StringBuilder sb2 = new StringBuilder();
        if (z10) {
            sb2.append("Dynamic ");
        }
        if (z11) {
            sb2.append("Sequence ");
        }
        if (z12) {
            sb2.append("Session-Scoped ");
        }
        return sb2.toString();
    }

    /* renamed from: t */
    private static final void m9681t(StringBuilder sb2, int i10, String str, C1886d5 c1886d5) {
        Integer num;
        Integer num2;
        Long l10;
        if (c1886d5 == null) {
            return;
        }
        m9679r(sb2, 3);
        sb2.append(str);
        sb2.append(" {\n");
        if (c1886d5.m8245y() != 0) {
            m9679r(sb2, 4);
            sb2.append("results: ");
            int i11 = 0;
            for (Long l11 : c1886d5.m8241H()) {
                int i12 = i11 + 1;
                if (i11 != 0) {
                    sb2.append(", ");
                }
                sb2.append(l11);
                i11 = i12;
            }
            sb2.append('\n');
        }
        if (c1886d5.m8237A() != 0) {
            m9679r(sb2, 4);
            sb2.append("status: ");
            int i13 = 0;
            for (Long l12 : c1886d5.m8243J()) {
                int i14 = i13 + 1;
                if (i13 != 0) {
                    sb2.append(", ");
                }
                sb2.append(l12);
                i13 = i14;
            }
            sb2.append('\n');
        }
        if (c1886d5.m8244x() != 0) {
            m9679r(sb2, 4);
            sb2.append("dynamic_filter_timestamps: {");
            int i15 = 0;
            for (C2008l4 c2008l4 : c1886d5.m8240G()) {
                int i16 = i15 + 1;
                if (i15 != 0) {
                    sb2.append(", ");
                }
                if (c2008l4.m8619E()) {
                    num2 = Integer.valueOf(c2008l4.m8620x());
                } else {
                    num2 = null;
                }
                sb2.append(num2);
                sb2.append(":");
                if (c2008l4.m8618D()) {
                    l10 = Long.valueOf(c2008l4.m8621y());
                } else {
                    l10 = null;
                }
                sb2.append(l10);
                i15 = i16;
            }
            sb2.append("}\n");
        }
        if (c1886d5.m8246z() != 0) {
            m9679r(sb2, 4);
            sb2.append("sequence_filter_timestamps: {");
            int i17 = 0;
            for (C1918f5 c1918f5 : c1886d5.m8242I()) {
                int i18 = i17 + 1;
                if (i17 != 0) {
                    sb2.append(", ");
                }
                if (c1918f5.m8382F()) {
                    num = Integer.valueOf(c1918f5.m8384y());
                } else {
                    num = null;
                }
                sb2.append(num);
                sb2.append(": [");
                Iterator it = c1918f5.m8381C().iterator();
                int i19 = 0;
                while (it.hasNext()) {
                    long longValue = ((Long) it.next()).longValue();
                    int i20 = i19 + 1;
                    if (i19 != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(longValue);
                    i19 = i20;
                }
                sb2.append("]");
                i17 = i18;
            }
            sb2.append("}\n");
        }
        m9679r(sb2, 3);
        sb2.append("}\n");
    }

    /* renamed from: u */
    private static final void m9682u(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj == null) {
            return;
        }
        m9679r(sb2, i10 + 1);
        sb2.append(str);
        sb2.append(": ");
        sb2.append(obj);
        sb2.append('\n');
    }

    /* renamed from: v */
    private static final void m9683v(StringBuilder sb2, int i10, String str, C1992k3 c1992k3) {
        String str2;
        if (c1992k3 == null) {
            return;
        }
        m9679r(sb2, i10);
        sb2.append(str);
        sb2.append(" {\n");
        if (c1992k3.m8569D()) {
            int m8574I = c1992k3.m8574I();
            if (m8574I != 1) {
                if (m8574I != 2) {
                    if (m8574I != 3) {
                        if (m8574I != 4) {
                            str2 = Operator.Operation.BETWEEN;
                        } else {
                            str2 = "EQUAL";
                        }
                    } else {
                        str2 = "GREATER_THAN";
                    }
                } else {
                    str2 = "LESS_THAN";
                }
            } else {
                str2 = "UNKNOWN_COMPARISON_TYPE";
            }
            m9682u(sb2, i10, "comparison_type", str2);
        }
        if (c1992k3.m8571F()) {
            m9682u(sb2, i10, "match_as_float", Boolean.valueOf(c1992k3.m8568C()));
        }
        if (c1992k3.m8570E()) {
            m9682u(sb2, i10, "comparison_value", c1992k3.m8575z());
        }
        if (c1992k3.m8573H()) {
            m9682u(sb2, i10, "min_comparison_value", c1992k3.m8567B());
        }
        if (c1992k3.m8572G()) {
            m9682u(sb2, i10, "max_comparison_value", c1992k3.m8566A());
        }
        m9679r(sb2, i10);
        sb2.append("}\n");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public static int m9684w(C2188x4 c2188x4, String str) {
        if (c2188x4 != null) {
            for (int i10 = 0; i10 < c2188x4.m9151p0(); i10++) {
                if (str.equals(c2188x4.m9145j0(i10).m8489C())) {
                    return i10;
                }
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public final C2465v m9685A(C1848b c1848b) {
        String str;
        Object obj;
        Bundle m9697y = m9697y(c1848b.m8112e(), true);
        if (m9697y.containsKey("_o") && (obj = m9697y.get("_o")) != null) {
            str = obj.toString();
        } else {
            str = "app";
        }
        String str2 = str;
        String m5088b = AbstractC1119q.m5088b(c1848b.m8111d());
        if (m5088b == null) {
            m5088b = c1848b.m8111d();
        }
        return new C2465v(m5088b, new C2443t(m9697y), str2, c1848b.m8108a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B */
    public final C2038n4 m9686B(C2410q c2410q) {
        C2023m4 m8715B = C2038n4.m8715B();
        m8715B.m8683D(c2410q.f8954e);
        C2432s c2432s = new C2432s(c2410q.f8955f);
        while (c2432s.hasNext()) {
            String next = c2432s.next();
            C2083q4 m8877B = C2098r4.m8877B();
            m8877B.m8783B(next);
            Object m10075o = c2410q.f8955f.m10075o(next);
            AbstractC5391n.m21783i(m10075o);
            m9692J(m8877B, m10075o);
            m8715B.m8693w(m8877B);
        }
        return (C2038n4) m8715B.m9176o();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D */
    public final String m9687D(C2173w4 c2173w4) {
        Long l10;
        Long l11;
        Double d10;
        if (c2173w4 == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\nbatch {\n");
        for (C2203y4 c2203y4 : c2173w4.m9069A()) {
            if (c2203y4 != null) {
                m9679r(sb2, 1);
                sb2.append("bundle {\n");
                if (c2203y4.m9337m1()) {
                    m9682u(sb2, 1, "protocol_version", Integer.valueOf(c2203y4.m9346v1()));
                }
                C1942gd.m8472c();
                if (this.f8714a.m10051z().m9614B(null, AbstractC2260c3.f8485t0) && c2203y4.m9340p1()) {
                    m9682u(sb2, 1, "session_stitching_token", c2203y4.m9313H());
                }
                m9682u(sb2, 1, DispatchConstants.PLATFORM, c2203y4.m9309F());
                if (c2203y4.m9333i1()) {
                    m9682u(sb2, 1, "gmp_version", Long.valueOf(c2203y4.m9306D1()));
                }
                if (c2203y4.m9344t1()) {
                    m9682u(sb2, 1, "uploading_gmp_version", Long.valueOf(c2203y4.m9316I1()));
                }
                if (c2203y4.m9331g1()) {
                    m9682u(sb2, 1, "dynamite_version", Long.valueOf(c2203y4.m9302B1()));
                }
                if (c2203y4.m9328d1()) {
                    m9682u(sb2, 1, "config_version", Long.valueOf(c2203y4.m9357z1()));
                }
                m9682u(sb2, 1, "gmp_app_id", c2203y4.m9303C());
                m9682u(sb2, 1, "admob_app_id", c2203y4.m9322N1());
                m9682u(sb2, 1, "app_id", c2203y4.m9323O1());
                m9682u(sb2, 1, "app_version", c2203y4.m9349x());
                if (c2203y4.m9353y0()) {
                    m9682u(sb2, 1, "app_version_major", Integer.valueOf(c2203y4.m9326Z()));
                }
                m9682u(sb2, 1, "firebase_instance_id", c2203y4.m9301B());
                if (c2203y4.m9330f1()) {
                    m9682u(sb2, 1, "dev_cert_hash", Long.valueOf(c2203y4.m9300A1()));
                }
                m9682u(sb2, 1, "app_store", c2203y4.m9325Q1());
                if (c2203y4.m9343s1()) {
                    m9682u(sb2, 1, "upload_timestamp_millis", Long.valueOf(c2203y4.m9314H1()));
                }
                if (c2203y4.m9341q1()) {
                    m9682u(sb2, 1, "start_timestamp_millis", Long.valueOf(c2203y4.m9312G1()));
                }
                if (c2203y4.m9332h1()) {
                    m9682u(sb2, 1, "end_timestamp_millis", Long.valueOf(c2203y4.m9304C1()));
                }
                if (c2203y4.m9336l1()) {
                    m9682u(sb2, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(c2203y4.m9310F1()));
                }
                if (c2203y4.m9335k1()) {
                    m9682u(sb2, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(c2203y4.m9308E1()));
                }
                m9682u(sb2, 1, "app_instance_id", c2203y4.m9324P1());
                m9682u(sb2, 1, "resettable_device_id", c2203y4.m9311G());
                m9682u(sb2, 1, "ds_id", c2203y4.m9299A());
                if (c2203y4.m9334j1()) {
                    m9682u(sb2, 1, "limited_ad_tracking", Boolean.valueOf(c2203y4.m9347w0()));
                }
                m9682u(sb2, 1, C3325bt.f14283y, c2203y4.m9307E());
                m9682u(sb2, 1, "device_model", c2203y4.m9355z());
                m9682u(sb2, 1, "user_default_language", c2203y4.m9315I());
                if (c2203y4.m9342r1()) {
                    m9682u(sb2, 1, "time_zone_offset_minutes", Integer.valueOf(c2203y4.m9351x1()));
                }
                if (c2203y4.m9356z0()) {
                    m9682u(sb2, 1, "bundle_sequential_index", Integer.valueOf(c2203y4.m9327a1()));
                }
                if (c2203y4.m9339o1()) {
                    m9682u(sb2, 1, "service_upload", Boolean.valueOf(c2203y4.m9350x0()));
                }
                m9682u(sb2, 1, "health_monitor", c2203y4.m9305D());
                if (c2203y4.m9338n1()) {
                    m9682u(sb2, 1, IjkMediaPlayer.OnNativeInvokeListener.ARG_RETRY_COUNTER, Integer.valueOf(c2203y4.m9348w1()));
                }
                if (c2203y4.m9329e1()) {
                    m9682u(sb2, 1, "consent_signals", c2203y4.m9352y());
                }
                List<C1949h5> m9320L = c2203y4.m9320L();
                if (m9320L != null) {
                    for (C1949h5 c1949h5 : m9320L) {
                        if (c1949h5 != null) {
                            m9679r(sb2, 2);
                            sb2.append("user_property {\n");
                            if (c1949h5.m8493O()) {
                                l10 = Long.valueOf(c1949h5.m8497z());
                            } else {
                                l10 = null;
                            }
                            m9682u(sb2, 2, "set_timestamp_millis", l10);
                            m9682u(sb2, 2, SerializableCookie.NAME, this.f8714a.m10022D().m9643f(c1949h5.m8489C()));
                            m9682u(sb2, 2, "string_value", c1949h5.m8490D());
                            if (c1949h5.m8492N()) {
                                l11 = Long.valueOf(c1949h5.m8496y());
                            } else {
                                l11 = null;
                            }
                            m9682u(sb2, 2, "int_value", l11);
                            if (c1949h5.m8491M()) {
                                d10 = Double.valueOf(c1949h5.m8495x());
                            } else {
                                d10 = null;
                            }
                            m9682u(sb2, 2, "double_value", d10);
                            m9679r(sb2, 2);
                            sb2.append("}\n");
                        }
                    }
                }
                List<C1978j4> m9317J = c2203y4.m9317J();
                if (m9317J != null) {
                    for (C1978j4 c1978j4 : m9317J) {
                        if (c1978j4 != null) {
                            m9679r(sb2, 2);
                            sb2.append("audience_membership {\n");
                            if (c1978j4.m8552H()) {
                                m9682u(sb2, 2, "audience_id", Integer.valueOf(c1978j4.m8555x()));
                            }
                            if (c1978j4.m8553I()) {
                                m9682u(sb2, 2, "new_audience", Boolean.valueOf(c1978j4.m8551G()));
                            }
                            m9681t(sb2, 2, "current_data", c1978j4.m8549A());
                            if (c1978j4.m8554J()) {
                                m9681t(sb2, 2, "previous_data", c1978j4.m8550B());
                            }
                            m9679r(sb2, 2);
                            sb2.append("}\n");
                        }
                    }
                }
                List<C2038n4> m9319K = c2203y4.m9319K();
                if (m9319K != null) {
                    for (C2038n4 c2038n4 : m9319K) {
                        if (c2038n4 != null) {
                            m9679r(sb2, 2);
                            sb2.append("event {\n");
                            m9682u(sb2, 2, SerializableCookie.NAME, this.f8714a.m10022D().m9641d(c2038n4.m8728E()));
                            if (c2038n4.m8732Q()) {
                                m9682u(sb2, 2, "timestamp_millis", Long.valueOf(c2038n4.m8726A()));
                            }
                            if (c2038n4.m8731P()) {
                                m9682u(sb2, 2, "previous_timestamp_millis", Long.valueOf(c2038n4.m8735z()));
                            }
                            if (c2038n4.m8730O()) {
                                m9682u(sb2, 2, "count", Integer.valueOf(c2038n4.m8733x()));
                            }
                            if (c2038n4.m8734y() != 0) {
                                m9677p(sb2, 2, c2038n4.m8729F());
                            }
                            m9679r(sb2, 2);
                            sb2.append("}\n");
                        }
                    }
                }
                m9679r(sb2, 1);
                sb2.append("}\n");
            }
        }
        sb2.append("}\n");
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E */
    public final String m9688E(C1884d3 c1884d3) {
        if (c1884d3 == null) {
            return "null";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\nevent_filter {\n");
        if (c1884d3.m8215L()) {
            m9682u(sb2, 0, "filter_id", Integer.valueOf(c1884d3.m8218y()));
        }
        m9682u(sb2, 0, "event_name", this.f8714a.m10022D().m9641d(c1884d3.m8209D()));
        String m9680s = m9680s(c1884d3.m8211H(), c1884d3.m8212I(), c1884d3.m8213J());
        if (!m9680s.isEmpty()) {
            m9682u(sb2, 0, "filter_type", m9680s);
        }
        if (c1884d3.m8214K()) {
            m9683v(sb2, 1, "event_count_filter", c1884d3.m8208C());
        }
        if (c1884d3.m8217x() > 0) {
            sb2.append("  filters {\n");
            Iterator it = c1884d3.m8210E().iterator();
            while (it.hasNext()) {
                m9678q(sb2, 2, (C1916f3) it.next());
            }
        }
        m9679r(sb2, 1);
        sb2.append("}\n}\n");
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F */
    public final String m9689F(C2022m3 c2022m3) {
        if (c2022m3 == null) {
            return "null";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\nproperty_filter {\n");
        if (c2022m3.m8676G()) {
            m9682u(sb2, 0, "filter_id", Integer.valueOf(c2022m3.m8678x()));
        }
        m9682u(sb2, 0, "property_name", this.f8714a.m10022D().m9643f(c2022m3.m8672B()));
        String m9680s = m9680s(c2022m3.m8673D(), c2022m3.m8674E(), c2022m3.m8675F());
        if (!m9680s.isEmpty()) {
            m9682u(sb2, 0, "filter_type", m9680s);
        }
        m9678q(sb2, 1, c2022m3.m8679y());
        sb2.append("}\n");
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G */
    public final List m9690G(List list, List list2) {
        int i10;
        ArrayList arrayList = new ArrayList(list);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                this.f8714a.mo9577b().m9805w().m9700b("Ignoring negative bit index to be cleared", num);
            } else {
                int intValue = num.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    this.f8714a.mo9577b().m9805w().m9701c("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & ((1 << (num.intValue() % 64)) ^ (-1))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i11 = size2;
            i10 = size;
            size = i11;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        r5 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        if (r4 == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        r3 = (android.os.Parcelable[]) r3;
        r4 = r3.length;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
    
        if (r7 >= r4) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        r8 = r3[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        if ((r8 instanceof android.os.Bundle) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        r5.add(m9691I((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0080, code lost:
    
        r0.put(r2, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0054, code lost:
    
        if ((r3 instanceof java.util.ArrayList) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0056, code lost:
    
        r3 = (java.util.ArrayList) r3;
        r4 = r3.size();
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005d, code lost:
    
        if (r7 >= r4) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005f, code lost:
    
        r8 = r3.get(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0065, code lost:
    
        if ((r8 instanceof android.os.Bundle) == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0067, code lost:
    
        r5.add(m9691I((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0070, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0075, code lost:
    
        if ((r3 instanceof android.os.Bundle) == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0077, code lost:
    
        r5.add(m9691I((android.os.Bundle) r3, false));
     */
    /* renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map m9691I(android.os.Bundle r11, boolean r12) {
        /*
            r10 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Set r1 = r11.keySet()
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L84
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r11.get(r2)
            boolean r4 = r3 instanceof android.os.Parcelable[]
            if (r4 != 0) goto L30
            boolean r5 = r3 instanceof java.util.ArrayList
            if (r5 != 0) goto L30
            boolean r5 = r3 instanceof android.os.Bundle
            if (r5 == 0) goto L2a
            goto L30
        L2a:
            if (r3 == 0) goto Ld
            r0.put(r2, r3)
            goto Ld
        L30:
            if (r12 == 0) goto Ld
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r6 = 0
            if (r4 == 0) goto L52
            android.os.Parcelable[] r3 = (android.os.Parcelable[]) r3
            int r4 = r3.length
            r7 = 0
        L3e:
            if (r7 >= r4) goto L80
            r8 = r3[r7]
            boolean r9 = r8 instanceof android.os.Bundle
            if (r9 == 0) goto L4f
            android.os.Bundle r8 = (android.os.Bundle) r8
            java.util.Map r8 = r10.m9691I(r8, r6)
            r5.add(r8)
        L4f:
            int r7 = r7 + 1
            goto L3e
        L52:
            boolean r4 = r3 instanceof java.util.ArrayList
            if (r4 == 0) goto L73
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r4 = r3.size()
            r7 = 0
        L5d:
            if (r7 >= r4) goto L80
            java.lang.Object r8 = r3.get(r7)
            boolean r9 = r8 instanceof android.os.Bundle
            if (r9 == 0) goto L70
            android.os.Bundle r8 = (android.os.Bundle) r8
            java.util.Map r8 = r10.m9691I(r8, r6)
            r5.add(r8)
        L70:
            int r7 = r7 + 1
            goto L5d
        L73:
            boolean r4 = r3 instanceof android.os.Bundle
            if (r4 == 0) goto L80
            android.os.Bundle r3 = (android.os.Bundle) r3
            java.util.Map r3 = r10.m9691I(r3, r6)
            r5.add(r3)
        L80:
            r0.put(r2, r5)
            goto Ld
        L84:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2343j9.m9691I(android.os.Bundle, boolean):java.util.Map");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J */
    public final void m9692J(C2083q4 c2083q4, Object obj) {
        AbstractC5391n.m21783i(obj);
        c2083q4.m8791y();
        c2083q4.m8789w();
        c2083q4.m8788v();
        c2083q4.m8790x();
        if (obj instanceof String) {
            c2083q4.m8784C((String) obj);
            return;
        }
        if (obj instanceof Long) {
            c2083q4.m8782A(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            c2083q4.m8792z(((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Bundle[]) {
            ArrayList arrayList = new ArrayList();
            for (Bundle bundle : (Bundle[]) obj) {
                if (bundle != null) {
                    C2083q4 m8877B = C2098r4.m8877B();
                    for (String str : bundle.keySet()) {
                        C2083q4 m8877B2 = C2098r4.m8877B();
                        m8877B2.m8783B(str);
                        Object obj2 = bundle.get(str);
                        if (obj2 instanceof Long) {
                            m8877B2.m8782A(((Long) obj2).longValue());
                        } else if (obj2 instanceof String) {
                            m8877B2.m8784C((String) obj2);
                        } else if (obj2 instanceof Double) {
                            m8877B2.m8792z(((Double) obj2).doubleValue());
                        }
                        m8877B.m8787u(m8877B2);
                    }
                    if (m8877B.m8785s() > 0) {
                        arrayList.add((C2098r4) m8877B.m9176o());
                    }
                }
            }
            c2083q4.m8786t(arrayList);
            return;
        }
        this.f8714a.mo9577b().m9800r().m9700b("Ignoring invalid (type) event param value", obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: K */
    public final void m9693K(C1934g5 c1934g5, Object obj) {
        AbstractC5391n.m21783i(obj);
        c1934g5.m8406u();
        c1934g5.m8405t();
        c1934g5.m8404s();
        if (obj instanceof String) {
            c1934g5.m8411z((String) obj);
            return;
        }
        if (obj instanceof Long) {
            c1934g5.m8408w(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            c1934g5.m8407v(((Double) obj).doubleValue());
        } else {
            this.f8714a.mo9577b().m9800r().m9700b("Ignoring invalid (type) user attribute value", obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M */
    public final boolean m9694M(long j10, long j11) {
        if (j10 != 0 && j11 > 0 && Math.abs(this.f8714a.mo9578c().mo24747a() - j10) <= j11) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O */
    public final byte[] m9695O(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            this.f8714a.mo9577b().m9800r().m9700b("Failed to gzip content", e10);
            throw e10;
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2485w8
    /* renamed from: l */
    protected final boolean mo9454l() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public final long m9696x(byte[] bArr) {
        AbstractC5391n.m21783i(bArr);
        this.f8714a.m10031N().mo9428h();
        MessageDigest m9910t = C2398o9.m9910t();
        if (m9910t == null) {
            this.f8714a.mo9577b().m9800r().m9699a("Failed to get MD5");
            return 0L;
        }
        return C2398o9.m9909q0(m9910t.digest(bArr));
    }

    /* renamed from: y */
    final Bundle m9697y(Map map, boolean z10) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (obj instanceof ArrayList) {
                if (z10) {
                    ArrayList arrayList = (ArrayList) obj;
                    ArrayList arrayList2 = new ArrayList();
                    int size = arrayList.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        arrayList2.add(m9697y((Map) arrayList.get(i10), false));
                    }
                    bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
                }
            } else {
                bundle.putString(str, obj.toString());
            }
        }
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public final Parcelable m9698z(byte[] bArr, Parcelable.Creator creator) {
        if (bArr == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            obtain.unmarshall(bArr, 0, bArr.length);
            obtain.setDataPosition(0);
            return (Parcelable) creator.createFromParcel(obtain);
        } catch (AbstractC5594b.a unused) {
            this.f8714a.mo9577b().m9800r().m9699a("Failed to load parcelable from buffer");
            return null;
        } finally {
            obtain.recycle();
        }
    }
}
