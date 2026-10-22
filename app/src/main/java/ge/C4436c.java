package ge;

import ee.InterfaceC4181d;
import ee.InterfaceC4184g;

/* renamed from: ge.c */
/* loaded from: classes3.dex */
public final class C4436c implements InterfaceC4181d {

    /* renamed from: a */
    public static final C4436c f19252a = new C4436c();

    private C4436c() {
    }

    @Override // ee.InterfaceC4181d
    /* renamed from: d */
    public void mo17486d(Object obj) {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    @Override // ee.InterfaceC4181d
    /* renamed from: e */
    public InterfaceC4184g mo17487e() {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    public String toString() {
        return "This continuation is already complete";
    }
}
