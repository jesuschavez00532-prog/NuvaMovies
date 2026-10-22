package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.raizlabs.android.dbflow.sql.language.Operator;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import p025b5.AbstractC1119q;
import p025b5.AbstractC1120r;
import p025b5.AbstractC1121s;
import p025b5.InterfaceC1108g;
import p219l4.AbstractC5391n;

/* renamed from: com.google.android.gms.measurement.internal.h3 */
/* loaded from: classes.dex */
public final class C2315h3 {

    /* renamed from: b */
    protected static final AtomicReference f8659b = new AtomicReference();

    /* renamed from: c */
    protected static final AtomicReference f8660c = new AtomicReference();

    /* renamed from: d */
    protected static final AtomicReference f8661d = new AtomicReference();

    /* renamed from: a */
    private final InterfaceC1108g f8662a;

    public C2315h3(InterfaceC1108g interfaceC1108g) {
        this.f8662a = interfaceC1108g;
    }

    /* renamed from: g */
    private static final String m9637g(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        boolean z10;
        String str2;
        AbstractC5391n.m21783i(strArr);
        AbstractC5391n.m21783i(strArr2);
        AbstractC5391n.m21783i(atomicReference);
        if (strArr.length == strArr2.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        AbstractC5391n.m21775a(z10);
        for (int i10 = 0; i10 < strArr.length; i10++) {
            Object obj = strArr[i10];
            if (str == obj || str.equals(obj)) {
                synchronized (atomicReference) {
                    String[] strArr3 = (String[]) atomicReference.get();
                    if (strArr3 == null) {
                        strArr3 = new String[strArr2.length];
                        atomicReference.set(strArr3);
                    }
                    str2 = strArr3[i10];
                    if (str2 == null) {
                        str2 = strArr2[i10] + "(" + strArr[i10] + ")";
                        strArr3[i10] = str2;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    /* renamed from: a */
    protected final String m9638a(Object[] objArr) {
        String valueOf;
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        for (Object obj : objArr) {
            if (obj instanceof Bundle) {
                valueOf = m9639b((Bundle) obj);
            } else {
                valueOf = String.valueOf(obj);
            }
            if (valueOf != null) {
                if (sb2.length() != 1) {
                    sb2.append(", ");
                }
                sb2.append(valueOf);
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public final String m9639b(Bundle bundle) {
        String valueOf;
        if (bundle == null) {
            return null;
        }
        if (!this.f8662a.mo5079a()) {
            return bundle.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sb2.length() != 8) {
                sb2.append(", ");
            }
            sb2.append(m9642e(str));
            sb2.append(Operator.Operation.EQUALS);
            Object obj = bundle.get(str);
            if (obj instanceof Bundle) {
                valueOf = m9638a(new Object[]{obj});
            } else if (obj instanceof Object[]) {
                valueOf = m9638a((Object[]) obj);
            } else if (obj instanceof ArrayList) {
                valueOf = m9638a(((ArrayList) obj).toArray());
            } else {
                valueOf = String.valueOf(obj);
            }
            sb2.append(valueOf);
        }
        sb2.append("}]");
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public final String m9640c(C2465v c2465v) {
        String m9639b;
        if (!this.f8662a.mo5079a()) {
            return c2465v.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("origin=");
        sb2.append(c2465v.f9139c);
        sb2.append(",name=");
        sb2.append(m9641d(c2465v.f9137a));
        sb2.append(",params=");
        C2443t c2443t = c2465v.f9138b;
        if (c2443t == null) {
            m9639b = null;
        } else if (!this.f8662a.mo5079a()) {
            m9639b = c2443t.toString();
        } else {
            m9639b = m9639b(c2443t.m10072j());
        }
        sb2.append(m9639b);
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public final String m9641d(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f8662a.mo5079a()) {
            return str;
        }
        return m9637g(str, AbstractC1119q.f4412c, AbstractC1119q.f4410a, f8659b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public final String m9642e(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f8662a.mo5079a()) {
            return str;
        }
        return m9637g(str, AbstractC1120r.f4415b, AbstractC1120r.f4414a, f8660c);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: f */
    public final String m9643f(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f8662a.mo5079a()) {
            return str;
        }
        if (str.startsWith("_exp_")) {
            return "experiment_id(" + str + ")";
        }
        return m9637g(str, AbstractC1121s.f4419b, AbstractC1121s.f4418a, f8661d);
    }
}
