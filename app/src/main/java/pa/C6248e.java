package pa;

import java.util.ArrayList;
import java.util.List;
import ne.AbstractC5868k;

/* renamed from: pa.e */
/* loaded from: classes2.dex */
public final class C6248e implements InterfaceC6245b {

    /* renamed from: a */
    private List f24478a = new ArrayList();

    /* renamed from: b */
    private int f24479b;

    /* renamed from: a */
    public final List m24874a() {
        return this.f24478a;
    }

    /* renamed from: b */
    public final void m24875b(List list) {
        AbstractC5868k.m23674f(list, "list");
        this.f24479b = 0;
        this.f24478a.clear();
        this.f24478a.addAll(list);
    }

    @Override // pa.InterfaceC6245b
    public int getType() {
        return 3;
    }
}
