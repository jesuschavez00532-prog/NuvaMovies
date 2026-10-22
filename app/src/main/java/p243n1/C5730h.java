package p243n1;

import p109e2.C4118h;
import p184j1.InterfaceC4975f;
import p216l1.InterfaceC5335v;
import p243n1.InterfaceC5731i;

/* renamed from: n1.h */
/* loaded from: classes.dex */
public class C5730h extends C4118h implements InterfaceC5731i {

    /* renamed from: e */
    private InterfaceC5731i.a f23004e;

    public C5730h(long j10) {
        super(j10);
    }

    @Override // p243n1.InterfaceC5731i
    /* renamed from: a */
    public void mo23129a(int i10) {
        if (i10 >= 40) {
            m17212b();
        } else if (i10 >= 20 || i10 == 15) {
            m17219m(m17214h() / 2);
        }
    }

    @Override // p243n1.InterfaceC5731i
    /* renamed from: c */
    public /* bridge */ /* synthetic */ InterfaceC5335v mo23130c(InterfaceC4975f interfaceC4975f) {
        return (InterfaceC5335v) super.m17218l(interfaceC4975f);
    }

    @Override // p243n1.InterfaceC5731i
    /* renamed from: d */
    public void mo23131d(InterfaceC5731i.a aVar) {
        this.f23004e = aVar;
    }

    @Override // p243n1.InterfaceC5731i
    /* renamed from: e */
    public /* bridge */ /* synthetic */ InterfaceC5335v mo23132e(InterfaceC4975f interfaceC4975f, InterfaceC5335v interfaceC5335v) {
        return (InterfaceC5335v) super.m17217k(interfaceC4975f, interfaceC5335v);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p109e2.C4118h
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public int mo17215i(InterfaceC5335v interfaceC5335v) {
        if (interfaceC5335v == null) {
            return super.mo17215i(null);
        }
        return interfaceC5335v.getSize();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p109e2.C4118h
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public void mo17216j(InterfaceC4975f interfaceC4975f, InterfaceC5335v interfaceC5335v) {
        InterfaceC5731i.a aVar = this.f23004e;
        if (aVar != null && interfaceC5335v != null) {
            aVar.mo21542b(interfaceC5335v);
        }
    }
}
