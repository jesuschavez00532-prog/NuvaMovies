package p225ld;

import com.module.bean.SourceBean;
import ne.AbstractC5868k;
import pa.InterfaceC6245b;

/* renamed from: ld.a */
/* loaded from: classes3.dex */
public final class C5547a implements InterfaceC6245b {

    /* renamed from: a */
    private SourceBean f22484a;

    /* renamed from: b */
    private int f22485b;

    /* renamed from: c */
    private boolean f22486c;

    public C5547a(SourceBean sourceBean, int i10, boolean z10) {
        AbstractC5868k.m23674f(sourceBean, "sourceBean");
        this.f22484a = sourceBean;
        this.f22485b = i10;
        this.f22486c = z10;
    }

    /* renamed from: a */
    public final int m22487a() {
        return this.f22485b;
    }

    /* renamed from: b */
    public final SourceBean m22488b() {
        return this.f22484a;
    }

    /* renamed from: c */
    public final boolean m22489c() {
        return this.f22486c;
    }

    @Override // pa.InterfaceC6245b
    public int getType() {
        return 2;
    }
}
