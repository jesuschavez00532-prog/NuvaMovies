package ad;

import com.titan.ranger.bean.Program;
import ne.AbstractC5868k;

/* renamed from: ad.e */
/* loaded from: classes3.dex */
public final class C0233e implements InterfaceC0230b {

    /* renamed from: a */
    private String f635a;

    /* renamed from: b */
    private Program f636b;

    /* renamed from: c */
    private Program f637c;

    @Override // ad.InterfaceC0230b
    /* renamed from: a */
    public Program mo804a() {
        return this.f637c;
    }

    @Override // ad.InterfaceC0230b
    /* renamed from: b */
    public String mo805b() {
        return this.f635a;
    }

    @Override // ad.InterfaceC0230b
    /* renamed from: c */
    public void mo806c(Program program) {
        AbstractC5868k.m23674f(program, "program");
        this.f636b = program;
    }

    @Override // ad.InterfaceC0230b
    /* renamed from: d */
    public void mo807d(String str) {
        AbstractC5868k.m23674f(str, "programCode");
        this.f635a = str;
    }

    @Override // ad.InterfaceC0230b
    /* renamed from: e */
    public void mo808e() {
        this.f635a = null;
        this.f636b = null;
    }
}
