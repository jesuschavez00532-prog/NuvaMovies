package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.n9 */
/* loaded from: classes.dex */
final class C2043n9 extends AbstractC2103r9 {

    /* renamed from: c */
    private static final Class f7966c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C2043n9(AbstractC2028m9 abstractC2028m9) {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC2103r9
    /* renamed from: a */
    public final void mo8738a(Object obj, long j10) {
        Object unmodifiableList;
        List list = (List) AbstractC1908eb.m8309k(obj, j10);
        if (list instanceof InterfaceC2013l9) {
            unmodifiableList = ((InterfaceC2013l9) list).mo8598b();
        } else {
            if (f7966c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof InterfaceC1999ka) && (list instanceof InterfaceC1922f9)) {
                InterfaceC1922f9 interfaceC1922f9 = (InterfaceC1922f9) list;
                if (interfaceC1922f9.mo8387f()) {
                    interfaceC1922f9.mo8386e();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        AbstractC1908eb.m8322x(obj, j10, unmodifiableList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.AbstractC2103r9
    /* renamed from: b */
    public final void mo8739b(Object obj, Object obj2, long j10) {
        C1998k9 c1998k9;
        List list = (List) AbstractC1908eb.m8309k(obj2, j10);
        int size = list.size();
        List list2 = (List) AbstractC1908eb.m8309k(obj, j10);
        if (list2.isEmpty()) {
            if (list2 instanceof InterfaceC2013l9) {
                list2 = new C1998k9(size);
            } else if ((list2 instanceof InterfaceC1999ka) && (list2 instanceof InterfaceC1922f9)) {
                list2 = ((InterfaceC1922f9) list2).mo8095l(size);
            } else {
                list2 = new ArrayList(size);
            }
            AbstractC1908eb.m8322x(obj, j10, list2);
        } else {
            if (f7966c.isAssignableFrom(list2.getClass())) {
                ArrayList arrayList = new ArrayList(list2.size() + size);
                arrayList.addAll(list2);
                AbstractC1908eb.m8322x(obj, j10, arrayList);
                c1998k9 = arrayList;
            } else if (list2 instanceof C2224za) {
                C1998k9 c1998k92 = new C1998k9(list2.size() + size);
                c1998k92.addAll(c1998k92.size(), (C2224za) list2);
                AbstractC1908eb.m8322x(obj, j10, c1998k92);
                c1998k9 = c1998k92;
            } else if ((list2 instanceof InterfaceC1999ka) && (list2 instanceof InterfaceC1922f9)) {
                InterfaceC1922f9 interfaceC1922f9 = (InterfaceC1922f9) list2;
                if (!interfaceC1922f9.mo8387f()) {
                    list2 = interfaceC1922f9.mo8095l(list2.size() + size);
                    AbstractC1908eb.m8322x(obj, j10, list2);
                }
            }
            list2 = c1998k9;
        }
        int size2 = list2.size();
        int size3 = list.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(list);
        }
        if (size2 > 0) {
            list = list2;
        }
        AbstractC1908eb.m8322x(obj, j10, list);
    }
}
