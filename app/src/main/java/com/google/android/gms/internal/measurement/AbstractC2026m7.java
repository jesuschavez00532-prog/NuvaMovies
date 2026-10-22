package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.m7 */
/* loaded from: classes.dex */
public abstract class AbstractC2026m7 implements InterfaceC1891da {
    protected int zzb = 0;

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: h */
    public static void m8701h(Iterable iterable, List list) {
        AbstractC1938g9.m8418e(iterable);
        if (iterable instanceof InterfaceC2013l9) {
            List mo8600h = ((InterfaceC2013l9) iterable).mo8600h();
            InterfaceC2013l9 interfaceC2013l9 = (InterfaceC2013l9) list;
            int size = list.size();
            for (Object obj : mo8600h) {
                if (obj == null) {
                    String str = "Element at index " + (interfaceC2013l9.size() - size) + " is null.";
                    int size2 = interfaceC2013l9.size();
                    while (true) {
                        size2--;
                        if (size2 < size) {
                            break;
                        } else {
                            interfaceC2013l9.remove(size2);
                        }
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof AbstractC1873c8) {
                    interfaceC2013l9.mo8602r((AbstractC1873c8) obj);
                } else {
                    interfaceC2013l9.add((String) obj);
                }
            }
            return;
        }
        if (!(iterable instanceof InterfaceC1999ka)) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size3 = list.size();
            for (Object obj2 : iterable) {
                if (obj2 == null) {
                    String str2 = "Element at index " + (list.size() - size3) + " is null.";
                    int size4 = list.size();
                    while (true) {
                        size4--;
                        if (size4 < size3) {
                            break;
                        } else {
                            list.remove(size4);
                        }
                    }
                    throw new NullPointerException(str2);
                }
                list.add(obj2);
            }
            return;
        }
        list.addAll((Collection) iterable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public abstract int mo8702g();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public abstract void mo8703i(int i10);

    /* renamed from: j */
    public final byte[] m8704j() {
        try {
            byte[] bArr = new byte[mo8250e()];
            AbstractC1997k8 m8590c = AbstractC1997k8.m8590c(bArr);
            mo8251f(m8590c);
            m8590c.m8595d();
            return bArr;
        } catch (IOException e10) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a byte array threw an IOException (should never happen).", e10);
        }
    }
}
