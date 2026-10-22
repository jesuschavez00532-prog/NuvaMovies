package p025b5;

import android.os.Bundle;
import com.efs.sdk.base.core.util.NetworkUtil;
import com.raizlabs.android.dbflow.sql.language.Operator;
import java.util.EnumMap;
import java.util.Iterator;

/* renamed from: b5.b */
/* loaded from: classes.dex */
public final class C1098b {

    /* renamed from: b */
    public static final C1098b f4403b = new C1098b(null, null);

    /* renamed from: a */
    private final EnumMap f4404a;

    public C1098b(Boolean bool, Boolean bool2) {
        EnumMap enumMap = new EnumMap(EnumC1096a.class);
        this.f4404a = enumMap;
        enumMap.put((EnumMap) EnumC1096a.AD_STORAGE, (EnumC1096a) bool);
        enumMap.put((EnumMap) EnumC1096a.ANALYTICS_STORAGE, (EnumC1096a) bool2);
    }

    /* renamed from: a */
    public static C1098b m5044a(Bundle bundle) {
        if (bundle == null) {
            return f4403b;
        }
        EnumMap enumMap = new EnumMap(EnumC1096a.class);
        for (EnumC1096a enumC1096a : EnumC1096a.values()) {
            enumMap.put((EnumMap) enumC1096a, (EnumC1096a) m5049n(bundle.getString(enumC1096a.f4402a)));
        }
        return new C1098b(enumMap);
    }

    /* renamed from: b */
    public static C1098b m5045b(String str) {
        EnumMap enumMap = new EnumMap(EnumC1096a.class);
        if (str != null) {
            int i10 = 0;
            while (true) {
                EnumC1096a[] enumC1096aArr = EnumC1096a.f4400d;
                int length = enumC1096aArr.length;
                if (i10 >= 2) {
                    break;
                }
                EnumC1096a enumC1096a = enumC1096aArr[i10];
                int i11 = i10 + 2;
                if (i11 < str.length()) {
                    char charAt = str.charAt(i11);
                    Boolean bool = null;
                    if (charAt != '-') {
                        if (charAt != '0') {
                            if (charAt == '1') {
                                bool = Boolean.TRUE;
                            }
                        } else {
                            bool = Boolean.FALSE;
                        }
                    }
                    enumMap.put((EnumMap) enumC1096a, (EnumC1096a) bool);
                }
                i10++;
            }
        }
        return new C1098b(enumMap);
    }

    /* renamed from: g */
    public static String m5046g(Bundle bundle) {
        String string;
        for (EnumC1096a enumC1096a : EnumC1096a.values()) {
            if (bundle.containsKey(enumC1096a.f4402a) && (string = bundle.getString(enumC1096a.f4402a)) != null && m5049n(string) == null) {
                return string;
            }
        }
        return null;
    }

    /* renamed from: j */
    public static boolean m5047j(int i10, int i11) {
        return i10 <= i11;
    }

    /* renamed from: m */
    static final int m5048m(Boolean bool) {
        if (bool == null) {
            return 0;
        }
        if (bool.booleanValue()) {
            return 1;
        }
        return 2;
    }

    /* renamed from: n */
    private static Boolean m5049n(String str) {
        if (str == null) {
            return null;
        }
        if (str.equals("granted")) {
            return Boolean.TRUE;
        }
        if (!str.equals(NetworkUtil.NETWORK_CLASS_DENIED)) {
            return null;
        }
        return Boolean.FALSE;
    }

    /* renamed from: c */
    public final C1098b m5050c(C1098b c1098b) {
        boolean z10;
        EnumMap enumMap = new EnumMap(EnumC1096a.class);
        for (EnumC1096a enumC1096a : EnumC1096a.values()) {
            Boolean bool = (Boolean) this.f4404a.get(enumC1096a);
            Boolean bool2 = (Boolean) c1098b.f4404a.get(enumC1096a);
            if (bool == null) {
                bool = bool2;
            } else if (bool2 != null) {
                if (bool.booleanValue() && bool2.booleanValue()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                bool = Boolean.valueOf(z10);
            }
            enumMap.put((EnumMap) enumC1096a, (EnumC1096a) bool);
        }
        return new C1098b(enumMap);
    }

    /* renamed from: d */
    public final C1098b m5051d(C1098b c1098b) {
        EnumMap enumMap = new EnumMap(EnumC1096a.class);
        for (EnumC1096a enumC1096a : EnumC1096a.values()) {
            Boolean bool = (Boolean) this.f4404a.get(enumC1096a);
            if (bool == null) {
                bool = (Boolean) c1098b.f4404a.get(enumC1096a);
            }
            enumMap.put((EnumMap) enumC1096a, (EnumC1096a) bool);
        }
        return new C1098b(enumMap);
    }

    /* renamed from: e */
    public final Boolean m5052e() {
        return (Boolean) this.f4404a.get(EnumC1096a.AD_STORAGE);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1098b)) {
            return false;
        }
        C1098b c1098b = (C1098b) obj;
        for (EnumC1096a enumC1096a : EnumC1096a.values()) {
            if (m5048m((Boolean) this.f4404a.get(enumC1096a)) != m5048m((Boolean) c1098b.f4404a.get(enumC1096a))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final Boolean m5053f() {
        return (Boolean) this.f4404a.get(EnumC1096a.ANALYTICS_STORAGE);
    }

    /* renamed from: h */
    public final String m5054h() {
        char c10;
        StringBuilder sb2 = new StringBuilder("G1");
        EnumC1096a[] enumC1096aArr = EnumC1096a.f4400d;
        int length = enumC1096aArr.length;
        for (int i10 = 0; i10 < 2; i10++) {
            Boolean bool = (Boolean) this.f4404a.get(enumC1096aArr[i10]);
            if (bool == null) {
                c10 = '-';
            } else if (bool.booleanValue()) {
                c10 = '1';
            } else {
                c10 = '0';
            }
            sb2.append(c10);
        }
        return sb2.toString();
    }

    public final int hashCode() {
        Iterator it = this.f4404a.values().iterator();
        int i10 = 17;
        while (it.hasNext()) {
            i10 = (i10 * 31) + m5048m((Boolean) it.next());
        }
        return i10;
    }

    /* renamed from: i */
    public final boolean m5055i(EnumC1096a enumC1096a) {
        Boolean bool = (Boolean) this.f4404a.get(enumC1096a);
        if (bool != null && !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public final boolean m5056k(C1098b c1098b) {
        return m5057l(c1098b, (EnumC1096a[]) this.f4404a.keySet().toArray(new EnumC1096a[0]));
    }

    /* renamed from: l */
    public final boolean m5057l(C1098b c1098b, EnumC1096a... enumC1096aArr) {
        for (EnumC1096a enumC1096a : enumC1096aArr) {
            Boolean bool = (Boolean) this.f4404a.get(enumC1096a);
            Boolean bool2 = (Boolean) c1098b.f4404a.get(enumC1096a);
            Boolean bool3 = Boolean.FALSE;
            if (bool == bool3 && bool2 != bool3) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("settings: ");
        EnumC1096a[] values = EnumC1096a.values();
        int length = values.length;
        for (int i10 = 0; i10 < length; i10++) {
            EnumC1096a enumC1096a = values[i10];
            if (i10 != 0) {
                sb2.append(", ");
            }
            sb2.append(enumC1096a.name());
            sb2.append(Operator.Operation.EQUALS);
            Boolean bool = (Boolean) this.f4404a.get(enumC1096a);
            if (bool == null) {
                sb2.append("uninitialized");
            } else {
                if (true != bool.booleanValue()) {
                    str = NetworkUtil.NETWORK_CLASS_DENIED;
                } else {
                    str = "granted";
                }
                sb2.append(str);
            }
        }
        return sb2.toString();
    }

    public C1098b(EnumMap enumMap) {
        EnumMap enumMap2 = new EnumMap(EnumC1096a.class);
        this.f4404a = enumMap2;
        enumMap2.putAll(enumMap);
    }
}
