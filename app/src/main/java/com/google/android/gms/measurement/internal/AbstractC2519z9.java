package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C1992k3;
import com.google.android.gms.internal.measurement.C2097r3;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import p219l4.AbstractC5391n;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.z9 */
/* loaded from: classes.dex */
public abstract class AbstractC2519z9 {

    /* renamed from: a */
    final String f9261a;

    /* renamed from: b */
    final int f9262b;

    /* renamed from: c */
    Boolean f9263c;

    /* renamed from: d */
    Boolean f9264d;

    /* renamed from: e */
    Long f9265e;

    /* renamed from: f */
    Long f9266f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC2519z9(String str, int i10) {
        this.f9261a = str;
        this.f9262b = i10;
    }

    /* renamed from: d */
    private static Boolean m10117d(String str, int i10, boolean z10, String str2, List list, String str3, C2370m3 c2370m3) {
        int i11;
        if (i10 == 7) {
            if (list == null || list.isEmpty()) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z10 && i10 != 2) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (i10 - 1) {
            case 1:
                if (str3 == null) {
                    return null;
                }
                if (true != z10) {
                    i11 = 66;
                } else {
                    i11 = 0;
                }
                try {
                    return Boolean.valueOf(Pattern.compile(str3, i11).matcher(str).matches());
                } catch (PatternSyntaxException unused) {
                    if (c2370m3 != null) {
                        c2370m3.m9805w().m9700b("Invalid regular expression in REGEXP audience filter. expression", str3);
                    }
                    return null;
                }
            case 2:
                return Boolean.valueOf(str.startsWith(str2));
            case 3:
                return Boolean.valueOf(str.endsWith(str2));
            case 4:
                return Boolean.valueOf(str.contains(str2));
            case 5:
                return Boolean.valueOf(str.equals(str2));
            case 6:
                if (list == null) {
                    return null;
                }
                return Boolean.valueOf(list.contains(str));
            default:
                return null;
        }
    }

    /* renamed from: e */
    static Boolean m10118e(BigDecimal bigDecimal, C1992k3 c1992k3, double d10) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        AbstractC5391n.m21783i(c1992k3);
        if (c1992k3.m8569D()) {
            boolean z10 = true;
            if (c1992k3.m8574I() != 1) {
                if (c1992k3.m8574I() == 5) {
                    if (!c1992k3.m8573H() || !c1992k3.m8572G()) {
                        return null;
                    }
                } else if (!c1992k3.m8570E()) {
                    return null;
                }
                int m8574I = c1992k3.m8574I();
                if (c1992k3.m8574I() == 5) {
                    if (C2343j9.m9672N(c1992k3.m8567B()) && C2343j9.m9672N(c1992k3.m8566A())) {
                        try {
                            BigDecimal bigDecimal5 = new BigDecimal(c1992k3.m8567B());
                            bigDecimal4 = new BigDecimal(c1992k3.m8566A());
                            bigDecimal3 = bigDecimal5;
                            bigDecimal2 = null;
                        } catch (NumberFormatException unused) {
                        }
                    }
                    return null;
                }
                if (!C2343j9.m9672N(c1992k3.m8575z())) {
                    return null;
                }
                try {
                    bigDecimal2 = new BigDecimal(c1992k3.m8575z());
                    bigDecimal3 = null;
                    bigDecimal4 = null;
                } catch (NumberFormatException unused2) {
                }
                if (m8574I == 5) {
                    if (bigDecimal3 == null) {
                        return null;
                    }
                } else if (bigDecimal2 == null) {
                    return null;
                }
                int i10 = m8574I - 1;
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 != 4 || bigDecimal3 == null) {
                                return null;
                            }
                            if (bigDecimal.compareTo(bigDecimal3) < 0 || bigDecimal.compareTo(bigDecimal4) > 0) {
                                z10 = false;
                            }
                            return Boolean.valueOf(z10);
                        }
                        if (bigDecimal2 == null) {
                            return null;
                        }
                        if (d10 != 0.0d) {
                            if (bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d10).multiply(new BigDecimal(2)))) <= 0 || bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d10).multiply(new BigDecimal(2)))) >= 0) {
                                z10 = false;
                            }
                            return Boolean.valueOf(z10);
                        }
                        if (bigDecimal.compareTo(bigDecimal2) != 0) {
                            z10 = false;
                        }
                        return Boolean.valueOf(z10);
                    }
                    if (bigDecimal2 == null) {
                        return null;
                    }
                    if (bigDecimal.compareTo(bigDecimal2) <= 0) {
                        z10 = false;
                    }
                    return Boolean.valueOf(z10);
                }
                if (bigDecimal2 == null) {
                    return null;
                }
                if (bigDecimal.compareTo(bigDecimal2) >= 0) {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static Boolean m10119f(String str, C2097r3 c2097r3, C2370m3 c2370m3) {
        String m8869A;
        List list;
        String str2;
        AbstractC5391n.m21783i(c2097r3);
        if (str == null || !c2097r3.m8874F() || c2097r3.m8875G() == 1) {
            return null;
        }
        if (c2097r3.m8875G() == 7) {
            if (c2097r3.m8876x() == 0) {
                return null;
            }
        } else if (!c2097r3.m8873E()) {
            return null;
        }
        int m8875G = c2097r3.m8875G();
        boolean m8871C = c2097r3.m8871C();
        if (!m8871C && m8875G != 2 && m8875G != 7) {
            m8869A = c2097r3.m8869A().toUpperCase(Locale.ENGLISH);
        } else {
            m8869A = c2097r3.m8869A();
        }
        String str3 = m8869A;
        if (c2097r3.m8876x() == 0) {
            list = null;
        } else {
            List m8870B = c2097r3.m8870B();
            if (!m8871C) {
                ArrayList arrayList = new ArrayList(m8870B.size());
                Iterator it = m8870B.iterator();
                while (it.hasNext()) {
                    arrayList.add(((String) it.next()).toUpperCase(Locale.ENGLISH));
                }
                m8870B = Collections.unmodifiableList(arrayList);
            }
            list = m8870B;
        }
        if (m8875G == 2) {
            str2 = str3;
        } else {
            str2 = null;
        }
        return m10117d(str, m8875G, m8871C, str3, list, str2, c2370m3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static Boolean m10120g(double d10, C1992k3 c1992k3) {
        try {
            return m10118e(new BigDecimal(d10), c1992k3, Math.ulp(d10));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static Boolean m10121h(long j10, C1992k3 c1992k3) {
        try {
            return m10118e(new BigDecimal(j10), c1992k3, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static Boolean m10122i(String str, C1992k3 c1992k3) {
        if (!C2343j9.m9672N(str)) {
            return null;
        }
        try {
            return m10118e(new BigDecimal(str), c1992k3, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static Boolean m10123j(Boolean bool, boolean z10) {
        boolean z11;
        if (bool == null) {
            return null;
        }
        if (bool.booleanValue() != z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        return Boolean.valueOf(z11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract int mo9448a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract boolean mo9449b();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract boolean mo9450c();
}
