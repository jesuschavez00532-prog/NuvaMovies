package com.google.android.gms.measurement.internal;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import anet.channel.entity.ConnType;
import anet.channel.strategy.dispatch.DispatchConstants;
import com.google.android.gms.internal.measurement.C1854b5;
import com.google.android.gms.internal.measurement.C1934g5;
import com.google.android.gms.internal.measurement.C1942gd;
import com.google.android.gms.internal.measurement.C1949h5;
import com.google.android.gms.internal.measurement.C2023m4;
import com.google.android.gms.internal.measurement.C2038n4;
import com.google.android.gms.internal.measurement.C2053o4;
import com.google.android.gms.internal.measurement.C2068p4;
import com.google.android.gms.internal.measurement.C2083q4;
import com.google.android.gms.internal.measurement.C2098r4;
import com.google.android.gms.internal.measurement.C2143u4;
import com.google.android.gms.internal.measurement.C2173w4;
import com.google.android.gms.internal.measurement.C2188x4;
import com.google.android.gms.internal.measurement.C2203y4;
import com.google.android.gms.internal.measurement.C2218z4;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import p025b5.C1098b;
import p025b5.EnumC1096a;
import p219l4.AbstractC5391n;

/* renamed from: com.google.android.gms.measurement.internal.d5 */
/* loaded from: classes.dex */
final class CallableC2273d5 implements Callable {

    /* renamed from: a */
    final /* synthetic */ C2465v f8536a;

    /* renamed from: b */
    final /* synthetic */ String f8537b;

    /* renamed from: c */
    final /* synthetic */ BinderC2328i5 f8538c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CallableC2273d5(BinderC2328i5 binderC2328i5, C2465v c2465v, String str) {
        this.f8538c = binderC2328i5;
        this.f8536a = c2465v;
        this.f8537b = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        C2310g9 c2310g9;
        C2310g9 c2310g92;
        C2376m9 c2376m9;
        C2372m5 c2372m5;
        C2143u4 c2143u4;
        String str;
        Bundle bundle;
        C2188x4 c2188x4;
        String str2;
        C2421r m10057c;
        long j10;
        byte[] bArr;
        C2310g9 c2310g93;
        c2310g9 = this.f8538c.f8683a;
        c2310g9.m9582e();
        c2310g92 = this.f8538c.f8683a;
        C2450t6 m9581d0 = c2310g92.m9581d0();
        C2465v c2465v = this.f8536a;
        String str3 = this.f8537b;
        m9581d0.mo9428h();
        C2415q4.m10015t();
        AbstractC5391n.m21783i(c2465v);
        AbstractC5391n.m21779e(str3);
        if (!m9581d0.f8714a.m10051z().m9614B(str3, AbstractC2260c3.f8440U)) {
            m9581d0.f8714a.mo9577b().m9799q().m9700b("Generating ScionPayload disabled. packageName", str3);
            return new byte[0];
        }
        if (!"_iap".equals(c2465v.f9137a) && !"_iapx".equals(c2465v.f9137a)) {
            m9581d0.f8714a.mo9577b().m9799q().m9701c("Generating a payload for this event is not available. package_name, event_name", str3, c2465v.f9137a);
            return null;
        }
        C2143u4 m9067x = C2173w4.m9067x();
        m9581d0.f9168b.m9571W().m9768e0();
        try {
            C2372m5 m9756R = m9581d0.f9168b.m9571W().m9756R(str3);
            if (m9756R == null) {
                m9581d0.f8714a.mo9577b().m9799q().m9700b("Log and bundle not available. package_name", str3);
                bArr = new byte[0];
                c2310g93 = m9581d0.f9168b;
            } else if (!m9756R.m9817J()) {
                m9581d0.f8714a.mo9577b().m9799q().m9700b("Log and bundle disabled. package_name", str3);
                bArr = new byte[0];
                c2310g93 = m9581d0.f9168b;
            } else {
                C2188x4 m9247K1 = C2203y4.m9247K1();
                m9247K1.m9134Y(1);
                m9247K1.m9129R(DispatchConstants.ANDROID);
                if (!TextUtils.isEmpty(m9756R.m9841d0())) {
                    m9247K1.m9160v(m9756R.m9841d0());
                }
                if (!TextUtils.isEmpty(m9756R.m9845f0())) {
                    m9247K1.m9164x((String) AbstractC5391n.m21783i(m9756R.m9845f0()));
                }
                if (!TextUtils.isEmpty(m9756R.m9847g0())) {
                    m9247K1.m9166y((String) AbstractC5391n.m21783i(m9756R.m9847g0()));
                }
                if (m9756R.m9819L() != -2147483648L) {
                    m9247K1.m9168z((int) m9756R.m9819L());
                }
                m9247K1.m9124N(m9756R.m9830W());
                m9247K1.m9112H(m9756R.m9828U());
                String m9851i0 = m9756R.m9851i0();
                String m9837b0 = m9756R.m9837b0();
                if (!TextUtils.isEmpty(m9851i0)) {
                    m9247K1.m9122M(m9851i0);
                } else if (!TextUtils.isEmpty(m9837b0)) {
                    m9247K1.m9158u(m9837b0);
                }
                C1098b m9570V = m9581d0.f9168b.m9570V(str3);
                m9247K1.m9106E(m9756R.m9827T());
                if (m9581d0.f8714a.m10044o() && m9581d0.f8714a.m10051z().m9615C(m9247K1.m9146k0()) && m9570V.m5055i(EnumC1096a.AD_STORAGE) && !TextUtils.isEmpty(null)) {
                    m9247K1.m9110G(null);
                }
                m9247K1.m9104D(m9570V.m5054h());
                if (m9570V.m5055i(EnumC1096a.AD_STORAGE) && m9756R.m9816I()) {
                    Pair m9521n = m9581d0.f9168b.m9583e0().m9521n(m9756R.m9841d0(), m9570V);
                    if (m9756R.m9816I() && !TextUtils.isEmpty((CharSequence) m9521n.first)) {
                        try {
                            m9247K1.m9135Z(C2450t6.m10080e((String) m9521n.first, Long.toString(c2465v.f9140d)));
                            Object obj = m9521n.second;
                            if (obj != null) {
                                m9247K1.m9127P(((Boolean) obj).booleanValue());
                            }
                        } catch (SecurityException e10) {
                            m9581d0.f8714a.mo9577b().m9799q().m9700b("Resettable device id encryption failed", e10.getMessage());
                            bArr = new byte[0];
                            c2310g93 = m9581d0.f9168b;
                        }
                    }
                }
                m9581d0.f8714a.m10019A().m9731k();
                m9247K1.m9108F(Build.MODEL);
                m9581d0.f8714a.m10019A().m9731k();
                m9247K1.m9128Q(Build.VERSION.RELEASE);
                m9247K1.m9140e0((int) m9581d0.f8714a.m10019A().m9960p());
                m9247K1.m9144i0(m9581d0.f8714a.m10019A().m9961q());
                try {
                    if (m9570V.m5055i(EnumC1096a.ANALYTICS_STORAGE) && m9756R.m9843e0() != null) {
                        m9247K1.m9162w(C2450t6.m10080e((String) AbstractC5391n.m21783i(m9756R.m9843e0()), Long.toString(c2465v.f9140d)));
                    }
                    if (!TextUtils.isEmpty(m9756R.m9849h0())) {
                        m9247K1.m9120L((String) AbstractC5391n.m21783i(m9756R.m9849h0()));
                    }
                    String m9841d0 = m9756R.m9841d0();
                    List m9766c0 = m9581d0.f9168b.m9571W().m9766c0(m9841d0);
                    Iterator it = m9766c0.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            c2376m9 = (C2376m9) it.next();
                            if ("_lte".equals(c2376m9.f8845c)) {
                                break;
                            }
                        } else {
                            c2376m9 = null;
                            break;
                        }
                    }
                    if (c2376m9 == null || c2376m9.f8847e == null) {
                        C2376m9 c2376m92 = new C2376m9(m9841d0, ConnType.PK_AUTO, "_lte", m9581d0.f8714a.mo9578c().mo24747a(), 0L);
                        m9766c0.add(c2376m92);
                        m9581d0.f9168b.m9571W().m9783x(c2376m92);
                    }
                    C2343j9 m9586g0 = m9581d0.f9168b.m9586g0();
                    m9586g0.f8714a.mo9577b().m9804v().m9699a("Checking account type status for ad personalization signals");
                    if (m9586g0.f8714a.m10019A().m9963s()) {
                        String m9841d02 = m9756R.m9841d0();
                        AbstractC5391n.m21783i(m9841d02);
                        if (m9756R.m9816I() && m9586g0.f9168b.m9576a0().m9711B(m9841d02)) {
                            m9586g0.f8714a.mo9577b().m9799q().m9699a("Turning off ad personalization due to account type");
                            Iterator it2 = m9766c0.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                if ("_npa".equals(((C2376m9) it2.next()).f8845c)) {
                                    it2.remove();
                                    break;
                                }
                            }
                            m9766c0.add(new C2376m9(m9841d02, ConnType.PK_AUTO, "_npa", m9586g0.f8714a.mo9578c().mo24747a(), 1L));
                        }
                    }
                    C1949h5[] c1949h5Arr = new C1949h5[m9766c0.size()];
                    for (int i10 = 0; i10 < m9766c0.size(); i10++) {
                        C1934g5 m8479A = C1949h5.m8479A();
                        m8479A.m8409x(((C2376m9) m9766c0.get(i10)).f8845c);
                        m8479A.m8410y(((C2376m9) m9766c0.get(i10)).f8846d);
                        m9581d0.f9168b.m9586g0().m9693K(m8479A, ((C2376m9) m9766c0.get(i10)).f8847e);
                        c1949h5Arr[i10] = (C1949h5) m8479A.m9176o();
                    }
                    m9247K1.m9165x0(Arrays.asList(c1949h5Arr));
                    C2381n3 m9870b = C2381n3.m9870b(c2465v);
                    m9581d0.f8714a.m10031N().m9958z(m9870b.f8856d, m9581d0.f9168b.m9571W().m9755Q(str3));
                    m9581d0.f8714a.m10031N().m9913A(m9870b, m9581d0.f8714a.m10051z().m9624n(str3));
                    Bundle bundle2 = m9870b.f8856d;
                    bundle2.putLong("_c", 1L);
                    m9581d0.f8714a.mo9577b().m9799q().m9699a("Marking in-app purchase as real-time");
                    bundle2.putLong("_r", 1L);
                    bundle2.putString("_o", c2465v.f9139c);
                    if (m9581d0.f8714a.m10031N().m9932T(m9247K1.m9146k0())) {
                        m9581d0.f8714a.m10031N().m9915C(bundle2, "_dbg", 1L);
                        m9581d0.f8714a.m10031N().m9915C(bundle2, "_r", 1L);
                    }
                    C2421r m9760V = m9581d0.f9168b.m9571W().m9760V(str3, c2465v.f9137a);
                    if (m9760V == null) {
                        c2188x4 = m9247K1;
                        c2372m5 = m9756R;
                        c2143u4 = m9067x;
                        str = str3;
                        bundle = bundle2;
                        str2 = null;
                        m10057c = new C2421r(str3, c2465v.f9137a, 0L, 0L, 0L, c2465v.f9140d, 0L, null, null, null, null);
                        j10 = 0;
                    } else {
                        c2372m5 = m9756R;
                        c2143u4 = m9067x;
                        str = str3;
                        bundle = bundle2;
                        c2188x4 = m9247K1;
                        str2 = null;
                        long j11 = m9760V.f9019f;
                        m10057c = m9760V.m10057c(c2465v.f9140d);
                        j10 = j11;
                    }
                    m9581d0.f9168b.m9571W().m9776q(m10057c);
                    C2410q c2410q = new C2410q(m9581d0.f8714a, c2465v.f9139c, str, c2465v.f9137a, c2465v.f9140d, j10, bundle);
                    C2023m4 m8715B = C2038n4.m8715B();
                    m8715B.m8684E(c2410q.f8953d);
                    m8715B.m8680A(c2410q.f8951b);
                    m8715B.m8683D(c2410q.f8954e);
                    C2432s c2432s = new C2432s(c2410q.f8955f);
                    while (c2432s.hasNext()) {
                        String next = c2432s.next();
                        C2083q4 m8877B = C2098r4.m8877B();
                        m8877B.m8783B(next);
                        Object m10075o = c2410q.f8955f.m10075o(next);
                        if (m10075o != null) {
                            m9581d0.f9168b.m9586g0().m9692J(m8877B, m10075o);
                            m8715B.m8693w(m8877B);
                        }
                    }
                    C2188x4 c2188x42 = c2188x4;
                    c2188x42.m9167y0(m8715B);
                    C2218z4 m8131x = C1854b5.m8131x();
                    C2053o4 m8763x = C2068p4.m8763x();
                    m8763x.m8749s(m10057c.f9016c);
                    m8763x.m8750t(c2465v.f9137a);
                    m8131x.m9393s(m8763x);
                    c2188x42.m9131V(m8131x);
                    c2188x42.m9157t0(m9581d0.f9168b.m9568T().m9455m(c2372m5.m9841d0(), Collections.emptyList(), c2188x42.m9150o0(), Long.valueOf(m8715B.m8691u()), Long.valueOf(m8715B.m8691u())));
                    if (m8715B.m8688I()) {
                        c2188x42.m9139d0(m8715B.m8691u());
                        c2188x42.m9114I(m8715B.m8691u());
                    }
                    long m9831X = c2372m5.m9831X();
                    if (m9831X != 0) {
                        c2188x42.m9132W(m9831X);
                    }
                    long m9833Z = c2372m5.m9833Z();
                    if (m9833Z != 0) {
                        c2188x42.m9133X(m9833Z);
                    } else if (m9831X != 0) {
                        c2188x42.m9133X(m9831X);
                    }
                    String m9836b = c2372m5.m9836b();
                    C1942gd.m8472c();
                    if (m9581d0.f8714a.m10051z().m9614B(str2, AbstractC2260c3.f8485t0) && m9836b != null) {
                        c2188x42.m9138c0(m9836b);
                    }
                    c2372m5.m9842e();
                    c2188x42.m9098A((int) c2372m5.m9832Y());
                    m9581d0.f8714a.m10051z().m9627q();
                    c2188x42.m9142g0(73000L);
                    c2188x42.m9141f0(m9581d0.f8714a.mo9578c().mo24747a());
                    c2188x42.m9137b0(true);
                    if (m9581d0.f8714a.m10051z().m9614B(str2, AbstractC2260c3.f8419B0)) {
                        m9581d0.f9168b.m9587h(c2188x42.m9146k0(), c2188x42);
                    }
                    C2143u4 c2143u42 = c2143u4;
                    c2143u42.m9008s(c2188x42);
                    C2372m5 c2372m52 = c2372m5;
                    c2372m52.m9810C(c2188x42.m9153r0());
                    c2372m52.m9869z(c2188x42.m9152q0());
                    m9581d0.f9168b.m9571W().m9775p(c2372m52);
                    m9581d0.f9168b.m9571W().m9774o();
                    m9581d0.f9168b.m9571W().m9769f0();
                    try {
                        return m9581d0.f9168b.m9586g0().m9695O(((C2173w4) c2143u42.m9176o()).m8704j());
                    } catch (IOException e11) {
                        m9581d0.f8714a.mo9577b().m9800r().m9701c("Data loss. Failed to bundle and serialize. appId", C2370m3.m9796z(str), e11);
                        return str2;
                    }
                } catch (SecurityException e12) {
                    m9581d0.f8714a.mo9577b().m9799q().m9700b("app instance id encryption failed", e12.getMessage());
                    byte[] bArr2 = new byte[0];
                    m9581d0.f9168b.m9571W().m9769f0();
                    return bArr2;
                }
            }
            c2310g93.m9571W().m9769f0();
            return bArr;
        } catch (Throwable th) {
            m9581d0.f9168b.m9571W().m9769f0();
            throw th;
        }
    }
}
