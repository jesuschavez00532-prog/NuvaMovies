package ve;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ve.p0 */
/* loaded from: classes3.dex */
public final class C7306p0 implements InterfaceC7333y0 {

    /* renamed from: a */
    private final boolean f27205a;

    public C7306p0(boolean z10) {
        this.f27205a = z10;
    }

    @Override // ve.InterfaceC7333y0
    /* renamed from: a */
    public boolean mo28135a() {
        return this.f27205a;
    }

    @Override // ve.InterfaceC7333y0
    /* renamed from: e */
    public C7295l1 mo28136e() {
        return null;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Empty{");
        if (mo28135a()) {
            str = "Active";
        } else {
            str = "New";
        }
        sb2.append(str);
        sb2.append('}');
        return sb2.toString();
    }
}
