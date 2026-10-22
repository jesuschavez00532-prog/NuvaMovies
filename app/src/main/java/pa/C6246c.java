package pa;

import java.util.ArrayList;
import ne.AbstractC5868k;

/* renamed from: pa.c */
/* loaded from: classes2.dex */
public final class C6246c implements InterfaceC6245b {

    /* renamed from: a */
    private ArrayList f24475a = new ArrayList();

    /* renamed from: b */
    private int f24476b;

    /* renamed from: a */
    public final ArrayList m24870a() {
        return this.f24475a;
    }

    /* renamed from: b */
    public final void m24871b(ArrayList arrayList) {
        AbstractC5868k.m23674f(arrayList, "list");
        this.f24476b = 0;
        this.f24475a.clear();
        this.f24475a.addAll(arrayList);
    }

    @Override // pa.InterfaceC6245b
    public int getType() {
        return 2;
    }
}
