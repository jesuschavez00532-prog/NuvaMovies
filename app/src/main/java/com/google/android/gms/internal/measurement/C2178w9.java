package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.w9 */
/* loaded from: classes.dex */
public final class C2178w9 implements InterfaceC2074pa {

    /* renamed from: b */
    private static final InterfaceC1859ba f8237b = new C2148u9();

    /* renamed from: a */
    private final InterfaceC1859ba f8238a;

    public C2178w9() {
        InterfaceC1859ba interfaceC1859ba;
        InterfaceC1859ba[] interfaceC1859baArr = new InterfaceC1859ba[2];
        interfaceC1859baArr[0] = C2162v8.m9044c();
        try {
            interfaceC1859ba = (InterfaceC1859ba) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            interfaceC1859ba = f8237b;
        }
        interfaceC1859baArr[1] = interfaceC1859ba;
        C2163v9 c2163v9 = new C2163v9(interfaceC1859baArr);
        AbstractC1938g9.m8419f(c2163v9, "messageInfoFactory");
        this.f8238a = c2163v9;
    }

    /* renamed from: b */
    private static boolean m9085b(InterfaceC1843aa interfaceC1843aa) {
        if (interfaceC1843aa.mo8099f() == 1) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2074pa
    /* renamed from: a */
    public final InterfaceC2059oa mo8769a(Class cls) {
        AbstractC2089qa.m8841g(cls);
        InterfaceC1843aa mo8140a = this.f8238a.mo8140a(cls);
        if (mo8140a.mo8098e()) {
            if (AbstractC2222z8.class.isAssignableFrom(cls)) {
                return C1954ha.m8517j(AbstractC2089qa.m8835b(), AbstractC2102r8.m8904b(), mo8140a.mo8097a());
            }
            return C1954ha.m8517j(AbstractC2089qa.m8836b0(), AbstractC2102r8.m8903a(), mo8140a.mo8097a());
        }
        if (AbstractC2222z8.class.isAssignableFrom(cls)) {
            if (m9085b(mo8140a)) {
                return C1939ga.m8427F(cls, mo8140a, AbstractC1984ja.m8559b(), AbstractC2103r9.m8906d(), AbstractC2089qa.m8835b(), AbstractC2102r8.m8904b(), AbstractC2223z9.m9410b());
            }
            return C1939ga.m8427F(cls, mo8140a, AbstractC1984ja.m8559b(), AbstractC2103r9.m8906d(), AbstractC2089qa.m8835b(), null, AbstractC2223z9.m9410b());
        }
        if (m9085b(mo8140a)) {
            return C1939ga.m8427F(cls, mo8140a, AbstractC1984ja.m8558a(), AbstractC2103r9.m8905c(), AbstractC2089qa.m8836b0(), AbstractC2102r8.m8903a(), AbstractC2223z9.m9409a());
        }
        return C1939ga.m8427F(cls, mo8140a, AbstractC1984ja.m8558a(), AbstractC2103r9.m8905c(), AbstractC2089qa.m8833a(), null, AbstractC2223z9.m9409a());
    }
}
