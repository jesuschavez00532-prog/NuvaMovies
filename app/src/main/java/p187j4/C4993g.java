package p187j4;

import p172i4.C4858d;

/* renamed from: j4.g */
/* loaded from: classes.dex */
public final class C4993g extends UnsupportedOperationException {

    /* renamed from: a */
    private final C4858d f20744a;

    public C4993g(C4858d c4858d) {
        this.f20744a = c4858d;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return "Missing ".concat(String.valueOf(this.f20744a));
    }
}
