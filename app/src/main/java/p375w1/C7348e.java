package p375w1;

import p347u1.AbstractC7020j;

/* renamed from: w1.e */
/* loaded from: classes.dex */
public class C7348e extends AbstractC7020j {
    public C7348e(C7346c c7346c) {
        super(c7346c);
    }

    @Override // p347u1.AbstractC7020j, p216l1.InterfaceC5331r
    /* renamed from: a */
    public void mo21593a() {
        ((C7346c) this.f26395a).m28346e().prepareToDraw();
    }

    @Override // p216l1.InterfaceC5335v
    /* renamed from: b */
    public void mo21576b() {
        ((C7346c) this.f26395a).stop();
        ((C7346c) this.f26395a).m28350k();
    }

    @Override // p216l1.InterfaceC5335v
    /* renamed from: c */
    public Class mo21577c() {
        return C7346c.class;
    }

    @Override // p216l1.InterfaceC5335v
    public int getSize() {
        return ((C7346c) this.f26395a).m28349i();
    }
}
