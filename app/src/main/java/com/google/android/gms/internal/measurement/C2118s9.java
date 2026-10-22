package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.s9 */
/* loaded from: classes.dex */
public final class C2118s9 extends C2033n {

    /* renamed from: b */
    private final C1864c f8057b;

    public C2118s9(C1864c c1864c) {
        this.f8057b = c1864c;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.measurement.C2033n, com.google.android.gms.internal.measurement.InterfaceC2078q
    /* renamed from: o */
    public final InterfaceC2078q mo8355o(String str, C2158v4 c2158v4, List list) {
        char c10;
        switch (str.hashCode()) {
            case 21624207:
                if (str.equals("getEventName")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case 45521504:
                if (str.equals("getTimestamp")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 146575578:
                if (str.equals("getParamValue")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 700587132:
                if (str.equals("getParams")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 920706790:
                if (str.equals("setParamValue")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case 1570616835:
                if (str.equals("setEventName")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        if (c10 != 0) {
            if (c10 != 1) {
                if (c10 != 2) {
                    if (c10 != 3) {
                        if (c10 != 4) {
                            if (c10 != 5) {
                                return super.mo8355o(str, c2158v4, list);
                            }
                            AbstractC2174w5.m9078h("setParamValue", 2, list);
                            String mo8351i = c2158v4.m9027b((InterfaceC2078q) list.get(0)).mo8351i();
                            InterfaceC2078q m9027b = c2158v4.m9027b((InterfaceC2078q) list.get(1));
                            this.f8057b.m8154b().m8114g(mo8351i, AbstractC2174w5.m9076f(m9027b));
                            return m9027b;
                        }
                        AbstractC2174w5.m9078h("setEventName", 1, list);
                        InterfaceC2078q m9027b2 = c2158v4.m9027b((InterfaceC2078q) list.get(0));
                        if (!InterfaceC2078q.f8002Q.equals(m9027b2) && !InterfaceC2078q.f8003R.equals(m9027b2)) {
                            this.f8057b.m8154b().m8113f(m9027b2.mo8351i());
                            return new C2138u(m9027b2.mo8351i());
                        }
                        throw new IllegalArgumentException("Illegal event name");
                    }
                    AbstractC2174w5.m9078h("getTimestamp", 0, list);
                    return new C1958i(Double.valueOf(this.f8057b.m8154b().m8108a()));
                }
                AbstractC2174w5.m9078h("getParams", 0, list);
                Map m8112e = this.f8057b.m8154b().m8112e();
                C2033n c2033n = new C2033n();
                for (String str2 : m8112e.keySet()) {
                    c2033n.mo8354n(str2, AbstractC2205y6.m9359b(m8112e.get(str2)));
                }
                return c2033n;
            }
            AbstractC2174w5.m9078h("getParamValue", 1, list);
            return AbstractC2205y6.m9359b(this.f8057b.m8154b().m8110c(c2158v4.m9027b((InterfaceC2078q) list.get(0)).mo8351i()));
        }
        AbstractC2174w5.m9078h("getEventName", 0, list);
        return new C2138u(this.f8057b.m8154b().m8111d());
    }
}
