package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.InterfaceC1990k1;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.cookie.SerializableCookie;
import com.umeng.analytics.pro.C3329bx;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import p025b5.AbstractC1105e0;
import p025b5.AbstractC1118p;
import p025b5.AbstractC1119q;
import p025b5.AbstractC1120r;
import p025b5.AbstractC1121s;
import p172i4.AbstractC4884q;
import p172i4.C4870j;
import p219l4.AbstractC5391n;
import p281p4.AbstractC6201e;
import p310r4.C6534e;

/* renamed from: com.google.android.gms.measurement.internal.o9 */
/* loaded from: classes.dex */
public final class C2398o9 extends AbstractC2350k5 {

    /* renamed from: g */
    private static final String[] f8901g = {"firebase_", "google_", "ga_"};

    /* renamed from: h */
    private static final String[] f8902h = {"_err"};

    /* renamed from: c */
    private SecureRandom f8903c;

    /* renamed from: d */
    private final AtomicLong f8904d;

    /* renamed from: e */
    private int f8905e;

    /* renamed from: f */
    private Integer f8906f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2398o9(C2415q4 c2415q4) {
        super(c2415q4);
        this.f8906f = null;
        this.f8904d = new AtomicLong(0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: W */
    public static boolean m9898W(String str) {
        if (!TextUtils.isEmpty(str) && str.startsWith("_")) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: X */
    public static boolean m9899X(String str) {
        AbstractC5391n.m21779e(str);
        if (str.charAt(0) == '_' && !str.equals("_ep")) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Y */
    public static boolean m9900Y(Context context) {
        ActivityInfo receiverInfo;
        AbstractC5391n.m21783i(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) != null) {
                if (receiverInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Z */
    public static boolean m9901Z(Context context, boolean z10) {
        AbstractC5391n.m21783i(context);
        if (Build.VERSION.SDK_INT >= 24) {
            return m9908i0(context, "com.google.android.gms.measurement.AppMeasurementJobService");
        }
        return m9908i0(context, "com.google.android.gms.measurement.AppMeasurementService");
    }

    /* renamed from: a0 */
    public static boolean m9902a0(String str) {
        if (f8902h[0].equals(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: d0 */
    static final boolean m9903d0(Bundle bundle, int i10) {
        if (bundle.getLong("_err") == 0) {
            bundle.putLong("_err", i10);
            return true;
        }
        return false;
    }

    /* renamed from: e0 */
    static final boolean m9904e0(String str) {
        AbstractC5391n.m21783i(str);
        return str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$");
    }

    /* renamed from: f0 */
    private final int m9905f0(String str) {
        if ("_ldl".equals(str)) {
            this.f8714a.m10051z();
            return 2048;
        }
        if (C3329bx.f14344d.equals(str)) {
            this.f8714a.m10051z();
            return 256;
        }
        if ("_lgclid".equals(str)) {
            this.f8714a.m10051z();
            return 100;
        }
        this.f8714a.m10051z();
        return 36;
    }

    /* renamed from: g0 */
    private final Object m9906g0(int i10, Object obj, boolean z10, boolean z11) {
        long j10;
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof Long) && !(obj instanceof Double)) {
            if (obj instanceof Integer) {
                return Long.valueOf(((Integer) obj).intValue());
            }
            if (obj instanceof Byte) {
                return Long.valueOf(((Byte) obj).byteValue());
            }
            if (obj instanceof Short) {
                return Long.valueOf(((Short) obj).shortValue());
            }
            if (obj instanceof Boolean) {
                if (true != ((Boolean) obj).booleanValue()) {
                    j10 = 0;
                } else {
                    j10 = 1;
                }
                return Long.valueOf(j10);
            }
            if (obj instanceof Float) {
                return Double.valueOf(((Float) obj).doubleValue());
            }
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                if (!z11 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                for (Parcelable parcelable : (Parcelable[]) obj) {
                    if (parcelable instanceof Bundle) {
                        Bundle m9953u0 = m9953u0((Bundle) parcelable);
                        if (!m9953u0.isEmpty()) {
                            arrayList.add(m9953u0);
                        }
                    }
                }
                return arrayList.toArray(new Bundle[arrayList.size()]);
            }
            return m9947r(obj.toString(), i10, z10);
        }
        return obj;
    }

    /* renamed from: h0 */
    private static boolean m9907h0(String str, String[] strArr) {
        AbstractC5391n.m21783i(strArr);
        for (String str2 : strArr) {
            if (AbstractC1105e0.m5060a(str, str2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i0 */
    private static boolean m9908i0(Context context, String str) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0)) != null) {
                if (serviceInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q0 */
    public static long m9909q0(byte[] bArr) {
        boolean z10;
        AbstractC5391n.m21783i(bArr);
        int length = bArr.length;
        int i10 = 0;
        if (length > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        AbstractC5391n.m21786l(z10);
        long j10 = 0;
        for (int i11 = length - 1; i11 >= 0 && i11 >= bArr.length - 8; i11--) {
            j10 += (bArr[i11] & 255) << i10;
            i10 += 8;
        }
        return j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public static MessageDigest m9910t() {
        MessageDigest messageDigest;
        for (int i10 = 0; i10 < 2; i10++) {
            try {
                messageDigest = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }

    /* renamed from: v */
    public static ArrayList m9911v(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C2267d c2267d = (C2267d) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("app_id", c2267d.f8521a);
            bundle.putString("origin", c2267d.f8522b);
            bundle.putLong("creation_timestamp", c2267d.f8524d);
            bundle.putString(SerializableCookie.NAME, c2267d.f8523c.f8758b);
            AbstractC1118p.m5086b(bundle, AbstractC5391n.m21783i(c2267d.f8523c.m9735g()));
            bundle.putBoolean("active", c2267d.f8525e);
            String str = c2267d.f8526f;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            C2465v c2465v = c2267d.f8527g;
            if (c2465v != null) {
                bundle.putString("timed_out_event_name", c2465v.f9137a);
                C2443t c2443t = c2465v.f9138b;
                if (c2443t != null) {
                    bundle.putBundle("timed_out_event_params", c2443t.m10072j());
                }
            }
            bundle.putLong("trigger_timeout", c2267d.f8528h);
            C2465v c2465v2 = c2267d.f8529i;
            if (c2465v2 != null) {
                bundle.putString("triggered_event_name", c2465v2.f9137a);
                C2443t c2443t2 = c2465v2.f9138b;
                if (c2443t2 != null) {
                    bundle.putBundle("triggered_event_params", c2443t2.m10072j());
                }
            }
            bundle.putLong("triggered_timestamp", c2267d.f8523c.f8759c);
            bundle.putLong("time_to_live", c2267d.f8530j);
            C2465v c2465v3 = c2267d.f8531k;
            if (c2465v3 != null) {
                bundle.putString("expired_event_name", c2465v3.f9137a);
                C2443t c2443t3 = c2465v3.f9138b;
                if (c2443t3 != null) {
                    bundle.putBundle("expired_event_params", c2443t3.m10072j());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    /* renamed from: y */
    public static void m9912y(C2461u6 c2461u6, Bundle bundle, boolean z10) {
        if (bundle != null && c2461u6 != null) {
            if (bundle.containsKey("_sc") && !z10) {
                z10 = false;
            } else {
                String str = c2461u6.f9122a;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = c2461u6.f9123b;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", c2461u6.f9124c);
                return;
            }
        }
        if (bundle != null && c2461u6 == null && z10) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public final void m9913A(C2381n3 c2381n3, int i10) {
        int i11 = 0;
        for (String str : new TreeSet(c2381n3.f8856d.keySet())) {
            if (m9899X(str) && (i11 = i11 + 1) > i10) {
                this.f8714a.mo9577b().m9801s().m9701c("Event can't contain more than " + i10 + " params", this.f8714a.m10022D().m9641d(c2381n3.f8853a), this.f8714a.m10022D().m9639b(c2381n3.f8856d));
                m9903d0(c2381n3.f8856d, 5);
                c2381n3.f8856d.remove(str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B */
    public final void m9914B(InterfaceC2387n9 interfaceC2387n9, String str, int i10, String str2, String str3, int i11) {
        Bundle bundle = new Bundle();
        m9903d0(bundle, i10);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i10 == 6 || i10 == 7 || i10 == 2) {
            bundle.putLong("_el", i11);
        }
        interfaceC2387n9.mo9519a(str, "_err", bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public final void m9915C(Bundle bundle, String str, Object obj) {
        String str2;
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
            return;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
        } else if (str != null) {
            if (obj != null) {
                str2 = obj.getClass().getSimpleName();
            } else {
                str2 = null;
            }
            this.f8714a.mo9577b().m9806x().m9701c("Not putting event parameter. Invalid value type. name, type", this.f8714a.m10022D().m9642e(str), str2);
        }
    }

    /* renamed from: D */
    public final void m9916D(InterfaceC1990k1 interfaceC1990k1, boolean z10) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z10);
        try {
            interfaceC1990k1.mo8200b(bundle);
        } catch (RemoteException e10) {
            this.f8714a.mo9577b().m9805w().m9700b("Error returning boolean value to wrapper", e10);
        }
    }

    /* renamed from: E */
    public final void m9917E(InterfaceC1990k1 interfaceC1990k1, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            interfaceC1990k1.mo8200b(bundle);
        } catch (RemoteException e10) {
            this.f8714a.mo9577b().m9805w().m9700b("Error returning bundle list to wrapper", e10);
        }
    }

    /* renamed from: F */
    public final void m9918F(InterfaceC1990k1 interfaceC1990k1, Bundle bundle) {
        try {
            interfaceC1990k1.mo8200b(bundle);
        } catch (RemoteException e10) {
            this.f8714a.mo9577b().m9805w().m9700b("Error returning bundle value to wrapper", e10);
        }
    }

    /* renamed from: G */
    public final void m9919G(InterfaceC1990k1 interfaceC1990k1, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            interfaceC1990k1.mo8200b(bundle);
        } catch (RemoteException e10) {
            this.f8714a.mo9577b().m9805w().m9700b("Error returning byte array to wrapper", e10);
        }
    }

    /* renamed from: H */
    public final void m9920H(InterfaceC1990k1 interfaceC1990k1, int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i10);
        try {
            interfaceC1990k1.mo8200b(bundle);
        } catch (RemoteException e10) {
            this.f8714a.mo9577b().m9805w().m9700b("Error returning int value to wrapper", e10);
        }
    }

    /* renamed from: I */
    public final void m9921I(InterfaceC1990k1 interfaceC1990k1, long j10) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j10);
        try {
            interfaceC1990k1.mo8200b(bundle);
        } catch (RemoteException e10) {
            this.f8714a.mo9577b().m9805w().m9700b("Error returning long value to wrapper", e10);
        }
    }

    /* renamed from: J */
    public final void m9922J(InterfaceC1990k1 interfaceC1990k1, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            interfaceC1990k1.mo8200b(bundle);
        } catch (RemoteException e10) {
            this.f8714a.mo9577b().m9805w().m9700b("Error returning string value to wrapper", e10);
        }
    }

    /* renamed from: K */
    final void m9923K(String str, String str2, String str3, Bundle bundle, List list, boolean z10) {
        int i10;
        int i11;
        String str4;
        String str5;
        int m9927O;
        if (bundle == null) {
            return;
        }
        this.f8714a.m10051z();
        int i12 = 0;
        for (String str6 : new TreeSet(bundle.keySet())) {
            if (list != null && list.contains(str6)) {
                i11 = 0;
            } else {
                if (!z10) {
                    i10 = m9940m0(str6);
                } else {
                    i10 = 0;
                }
                if (i10 == 0) {
                    i10 = m9939l0(str6);
                }
                i11 = i10;
            }
            if (i11 != 0) {
                if (i11 == 3) {
                    str4 = str6;
                } else {
                    str4 = null;
                }
                m9957x(bundle, i11, str6, str6, str4);
                bundle.remove(str6);
            } else {
                if (m9933U(bundle.get(str6))) {
                    this.f8714a.mo9577b().m9806x().m9702d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str2, str3, str6);
                    str5 = str6;
                    m9927O = 22;
                } else {
                    str5 = str6;
                    m9927O = m9927O(str, str2, str6, bundle.get(str6), bundle, list, z10, false);
                }
                if (m9927O != 0 && !"_ev".equals(str5)) {
                    m9957x(bundle, m9927O, str5, str5, bundle.get(str5));
                    bundle.remove(str5);
                } else if (m9899X(str5) && !m9907h0(str5, AbstractC1120r.f4417d) && (i12 = i12 + 1) > 0) {
                    this.f8714a.mo9577b().m9801s().m9701c("Item cannot contain custom parameters", this.f8714a.m10022D().m9641d(str2), this.f8714a.m10022D().m9639b(bundle));
                    m9903d0(bundle, 23);
                    bundle.remove(str5);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: L */
    public final boolean m9924L(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            if (!m9904e0(str)) {
                if (this.f8714a.m10046q()) {
                    this.f8714a.mo9577b().m9801s().m9700b("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", C2370m3.m9796z(str));
                }
                return false;
            }
            return true;
        }
        if (!TextUtils.isEmpty(str2)) {
            if (!m9904e0(str2)) {
                this.f8714a.mo9577b().m9801s().m9700b("Invalid admob_app_id. Analytics disabled.", C2370m3.m9796z(str2));
                return false;
            }
            return true;
        }
        if (this.f8714a.m10046q()) {
            this.f8714a.mo9577b().m9801s().m9699a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M */
    public final boolean m9925M(String str, int i10, String str2) {
        if (str2 == null) {
            this.f8714a.mo9577b().m9801s().m9700b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.codePointCount(0, str2.length()) > i10) {
            this.f8714a.mo9577b().m9801s().m9702d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i10), str2);
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: N */
    public final boolean m9926N(String str, String[] strArr, String[] strArr2, String str2) {
        if (str2 == null) {
            this.f8714a.mo9577b().m9801s().m9700b("Name is required and can't be null. Type", str);
            return false;
        }
        AbstractC5391n.m21783i(str2);
        String[] strArr3 = f8901g;
        for (int i10 = 0; i10 < 3; i10++) {
            if (str2.startsWith(strArr3[i10])) {
                this.f8714a.mo9577b().m9801s().m9701c("Name starts with reserved prefix. Type, name", str, str2);
                return false;
            }
        }
        if (strArr != null && m9907h0(str2, strArr)) {
            if (strArr2 == null || !m9907h0(str2, strArr2)) {
                this.f8714a.mo9577b().m9801s().m9701c("Name is reserved. Type, name", str, str2);
                return false;
            }
            return true;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00d0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d1  */
    /* renamed from: O */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final int m9927O(java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.Object r17, android.os.Bundle r18, java.util.List r19, boolean r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2398o9.m9927O(java.lang.String, java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: P */
    public final boolean m9928P(String str, String str2, int i10, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String obj2 = obj.toString();
            if (obj2.codePointCount(0, obj2.length()) > i10) {
                this.f8714a.mo9577b().m9806x().m9702d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(obj2.length()));
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Q */
    public final boolean m9929Q(String str, String str2) {
        if (str2 == null) {
            this.f8714a.mo9577b().m9801s().m9700b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            this.f8714a.mo9577b().m9801s().m9700b("Name is required and can't be empty. Type", str);
            return false;
        }
        int codePointAt = str2.codePointAt(0);
        if (!Character.isLetter(codePointAt)) {
            if (codePointAt == 95) {
                codePointAt = 95;
            } else {
                this.f8714a.mo9577b().m9801s().m9701c("Name must start with a letter or _ (underscore). Type, name", str, str2);
                return false;
            }
        }
        int length = str2.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str2.codePointAt(charCount);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                this.f8714a.mo9577b().m9801s().m9701c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            charCount += Character.charCount(codePointAt2);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: R */
    public final boolean m9930R(String str, String str2) {
        if (str2 == null) {
            this.f8714a.mo9577b().m9801s().m9700b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            this.f8714a.mo9577b().m9801s().m9700b("Name is required and can't be empty. Type", str);
            return false;
        }
        int codePointAt = str2.codePointAt(0);
        if (!Character.isLetter(codePointAt)) {
            this.f8714a.mo9577b().m9801s().m9701c("Name must start with a letter. Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str2.codePointAt(charCount);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                this.f8714a.mo9577b().m9801s().m9701c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            charCount += Character.charCount(codePointAt2);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: S */
    public final boolean m9931S(String str) {
        mo9428h();
        if (C6534e.m25570a(this.f8714a.mo9584f()).m25563a(str) == 0) {
            return true;
        }
        this.f8714a.mo9577b().m9799q().m9700b("Permission not granted", str);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: T */
    public final boolean m9932T(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String m9631u = this.f8714a.m10051z().m9631u();
        this.f8714a.mo9580d();
        return m9631u.equals(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: U */
    public final boolean m9933U(Object obj) {
        if (!(obj instanceof Parcelable[]) && !(obj instanceof ArrayList) && !(obj instanceof Bundle)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: V */
    public final boolean m9934V(Context context, String str) {
        Signature[] signatureArr;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo m25567e = C6534e.m25570a(context).m25567e(str, 64);
            if (m25567e != null && (signatureArr = m25567e.signatures) != null && signatureArr.length > 0) {
                return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
            }
            return true;
        } catch (PackageManager.NameNotFoundException e10) {
            this.f8714a.mo9577b().m9800r().m9700b("Package name not found", e10);
            return true;
        } catch (CertificateException e11) {
            this.f8714a.mo9577b().m9800r().m9700b("Error obtaining certificate", e11);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b0 */
    public final boolean m9935b0(String str, String str2, String str3, String str4) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (!isEmpty && !isEmpty2) {
            AbstractC5391n.m21783i(str);
            if (!str.equals(str2)) {
                return true;
            }
            return false;
        }
        if (isEmpty && isEmpty2) {
            if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
                if (!str3.equals(str4)) {
                    return true;
                }
                return false;
            }
            if (!TextUtils.isEmpty(str4)) {
                return true;
            }
            return false;
        }
        if (!isEmpty) {
            if (TextUtils.isEmpty(str4)) {
                return false;
            }
            if (TextUtils.isEmpty(str3) || !str3.equals(str4)) {
                return true;
            }
            return false;
        }
        if (TextUtils.isEmpty(str3) || !str3.equals(str4)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c0 */
    public final byte[] m9936c0(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2350k5
    /* renamed from: i */
    protected final void mo9429i() {
        mo9428h();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                this.f8714a.mo9577b().m9805w().m9699a("Utils falling back to Random for random id");
            }
        }
        this.f8904d.set(nextLong);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2350k5
    /* renamed from: j */
    protected final boolean mo9430j() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j0 */
    public final int m9937j0(String str, Object obj) {
        boolean m9928P;
        if ("_ldl".equals(str)) {
            m9928P = m9928P("user property referrer", str, m9905f0(str), obj);
        } else {
            m9928P = m9928P("user property", str, m9905f0(str), obj);
        }
        if (m9928P) {
            return 0;
        }
        return 7;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k0 */
    public final int m9938k0(String str) {
        if (!m9929Q("event", str)) {
            return 2;
        }
        if (!m9926N("event", AbstractC1119q.f4410a, AbstractC1119q.f4411b, str)) {
            return 13;
        }
        this.f8714a.m10051z();
        if (!m9925M("event", 40, str)) {
            return 2;
        }
        return 0;
    }

    /* renamed from: l0 */
    final int m9939l0(String str) {
        if (!m9929Q("event param", str)) {
            return 3;
        }
        if (!m9926N("event param", null, null, str)) {
            return 14;
        }
        this.f8714a.m10051z();
        if (!m9925M("event param", 40, str)) {
            return 3;
        }
        return 0;
    }

    /* renamed from: m0 */
    final int m9940m0(String str) {
        if (!m9930R("event param", str)) {
            return 3;
        }
        if (!m9926N("event param", null, null, str)) {
            return 14;
        }
        this.f8714a.m10051z();
        if (!m9925M("event param", 40, str)) {
            return 3;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n0 */
    public final int m9941n0(String str) {
        if (!m9929Q("user property", str)) {
            return 6;
        }
        if (!m9926N("user property", AbstractC1121s.f4418a, null, str)) {
            return 15;
        }
        this.f8714a.m10051z();
        if (!m9925M("user property", 24, str)) {
            return 6;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public final Object m9942o(String str, Object obj) {
        int i10 = 256;
        if ("_ev".equals(str)) {
            this.f8714a.m10051z();
            return m9906g0(256, obj, true, true);
        }
        if (m9898W(str)) {
            this.f8714a.m10051z();
        } else {
            this.f8714a.m10051z();
            i10 = 100;
        }
        return m9906g0(i10, obj, false, true);
    }

    /* renamed from: o0 */
    public final int m9943o0() {
        if (this.f8906f == null) {
            this.f8906f = Integer.valueOf(C4870j.m20060f().m20061a(this.f8714a.mo9584f()) / 1000);
        }
        return this.f8906f.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public final Object m9944p(String str, Object obj) {
        if ("_ldl".equals(str)) {
            return m9906g0(m9905f0(str), obj, true, false);
        }
        return m9906g0(m9905f0(str), obj, false, false);
    }

    /* renamed from: p0 */
    public final int m9945p0(int i10) {
        return C4870j.m20060f().mo20046h(this.f8714a.mo9584f(), AbstractC4884q.f20380a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public final String m9946q() {
        byte[] bArr = new byte[16];
        m9952u().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    /* renamed from: r */
    public final String m9947r(String str, int i10, boolean z10) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) > i10) {
            if (!z10) {
                return null;
            }
            return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i10))).concat("...");
        }
        return str;
    }

    /* renamed from: r0 */
    public final long m9948r0() {
        long andIncrement;
        long j10;
        if (this.f8904d.get() == 0) {
            synchronized (this.f8904d) {
                long nextLong = new Random(System.nanoTime() ^ this.f8714a.mo9578c().mo24747a()).nextLong();
                int i10 = this.f8905e + 1;
                this.f8905e = i10;
                j10 = nextLong + i10;
            }
            return j10;
        }
        synchronized (this.f8904d) {
            this.f8904d.compareAndSet(-1L, 1L);
            andIncrement = this.f8904d.getAndIncrement();
        }
        return andIncrement;
    }

    /* renamed from: s */
    public final URL m9949s(long j10, String str, String str2, long j11) {
        try {
            AbstractC5391n.m21779e(str2);
            AbstractC5391n.m21779e(str);
            String format = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", String.format("v%s.%s", 73000L, Integer.valueOf(m9943o0())), str2, str, Long.valueOf(j11));
            if (str.equals(this.f8714a.m10051z().m9632v())) {
                format = format.concat("&ddl_test=1");
            }
            return new URL(format);
        } catch (IllegalArgumentException | MalformedURLException e10) {
            this.f8714a.mo9577b().m9800r().m9700b("Failed to create BOW URL for Deferred Deep Link. exception", e10.getMessage());
            return null;
        }
    }

    /* renamed from: s0 */
    public final long m9950s0(long j10, long j11) {
        return (j10 + (j11 * OkGo.DEFAULT_MILLISECONDS)) / 86400000;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t0 */
    public final Bundle m9951t0(Uri uri) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        if (uri != null) {
            try {
                if (uri.isHierarchical()) {
                    str = uri.getQueryParameter("utm_campaign");
                    str2 = uri.getQueryParameter("utm_source");
                    str3 = uri.getQueryParameter("utm_medium");
                    str4 = uri.getQueryParameter("gclid");
                    str5 = uri.getQueryParameter("utm_id");
                    str6 = uri.getQueryParameter("dclid");
                    str7 = uri.getQueryParameter("srsltid");
                } else {
                    str = null;
                    str2 = null;
                    str3 = null;
                    str4 = null;
                    str5 = null;
                    str6 = null;
                    str7 = null;
                }
                if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str4) && TextUtils.isEmpty(str5) && TextUtils.isEmpty(str6) && TextUtils.isEmpty(str7)) {
                    return null;
                }
                Bundle bundle = new Bundle();
                if (!TextUtils.isEmpty(str)) {
                    bundle.putString("campaign", str);
                }
                if (!TextUtils.isEmpty(str2)) {
                    bundle.putString("source", str2);
                }
                if (!TextUtils.isEmpty(str3)) {
                    bundle.putString("medium", str3);
                }
                if (!TextUtils.isEmpty(str4)) {
                    bundle.putString("gclid", str4);
                }
                String queryParameter = uri.getQueryParameter("utm_term");
                if (!TextUtils.isEmpty(queryParameter)) {
                    bundle.putString("term", queryParameter);
                }
                String queryParameter2 = uri.getQueryParameter("utm_content");
                if (!TextUtils.isEmpty(queryParameter2)) {
                    bundle.putString("content", queryParameter2);
                }
                String queryParameter3 = uri.getQueryParameter("aclid");
                if (!TextUtils.isEmpty(queryParameter3)) {
                    bundle.putString("aclid", queryParameter3);
                }
                String queryParameter4 = uri.getQueryParameter("cp1");
                if (!TextUtils.isEmpty(queryParameter4)) {
                    bundle.putString("cp1", queryParameter4);
                }
                String queryParameter5 = uri.getQueryParameter("anid");
                if (!TextUtils.isEmpty(queryParameter5)) {
                    bundle.putString("anid", queryParameter5);
                }
                if (!TextUtils.isEmpty(str5)) {
                    bundle.putString("campaign_id", str5);
                }
                if (!TextUtils.isEmpty(str6)) {
                    bundle.putString("dclid", str6);
                }
                String queryParameter6 = uri.getQueryParameter("utm_source_platform");
                if (!TextUtils.isEmpty(queryParameter6)) {
                    bundle.putString("source_platform", queryParameter6);
                }
                String queryParameter7 = uri.getQueryParameter("utm_creative_format");
                if (!TextUtils.isEmpty(queryParameter7)) {
                    bundle.putString("creative_format", queryParameter7);
                }
                String queryParameter8 = uri.getQueryParameter("utm_marketing_tactic");
                if (!TextUtils.isEmpty(queryParameter8)) {
                    bundle.putString("marketing_tactic", queryParameter8);
                }
                if (!TextUtils.isEmpty(str7)) {
                    bundle.putString("srsltid", str7);
                }
                return bundle;
            } catch (UnsupportedOperationException e10) {
                this.f8714a.mo9577b().m9805w().m9700b("Install referrer url isn't a hierarchical URI", e10);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public final SecureRandom m9952u() {
        mo9428h();
        if (this.f8903c == null) {
            this.f8903c = new SecureRandom();
        }
        return this.f8903c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u0 */
    public final Bundle m9953u0(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object m9942o = m9942o(str, bundle.get(str));
                if (m9942o == null) {
                    this.f8714a.mo9577b().m9806x().m9700b("Param value can't be null", this.f8714a.m10022D().m9642e(str));
                } else {
                    m9915C(bundle2, str, m9942o);
                }
            }
        }
        return bundle2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0106 A[SYNTHETIC] */
    /* renamed from: v0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.os.Bundle m9954v0(java.lang.String r21, java.lang.String r22, android.os.Bundle r23, java.util.List r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2398o9.m9954v0(java.lang.String, java.lang.String, android.os.Bundle, java.util.List, boolean):android.os.Bundle");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public final void m9955w(Bundle bundle, long j10) {
        long j11 = bundle.getLong("_et");
        if (j11 != 0) {
            this.f8714a.mo9577b().m9805w().m9700b("Params already contained engagement", Long.valueOf(j11));
        } else {
            j11 = 0;
        }
        bundle.putLong("_et", j10 + j11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w0 */
    public final C2465v m9956w0(String str, String str2, Bundle bundle, String str3, long j10, boolean z10, boolean z11) {
        Bundle bundle2;
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (m9938k0(str2) == 0) {
            if (bundle != null) {
                bundle2 = new Bundle(bundle);
            } else {
                bundle2 = new Bundle();
            }
            Bundle bundle3 = bundle2;
            bundle3.putString("_o", str3);
            Bundle m9954v0 = m9954v0(str, str2, bundle3, AbstractC6201e.m24751b("_o"), true);
            if (z10) {
                m9954v0 = m9953u0(m9954v0);
            }
            AbstractC5391n.m21783i(m9954v0);
            return new C2465v(str2, new C2443t(m9954v0), str3, j10);
        }
        this.f8714a.mo9577b().m9800r().m9700b("Invalid conditional property event name", this.f8714a.m10022D().m9643f(str2));
        throw new IllegalArgumentException();
    }

    /* renamed from: x */
    final void m9957x(Bundle bundle, int i10, String str, String str2, Object obj) {
        if (m9903d0(bundle, i10)) {
            this.f8714a.m10051z();
            bundle.putString("_ev", m9947r(str, 40, true));
            if (obj != null) {
                AbstractC5391n.m21783i(bundle);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", obj.toString().length());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public final void m9958z(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                this.f8714a.m10031N().m9915C(bundle, str, bundle2.get(str));
            }
        }
    }
}
