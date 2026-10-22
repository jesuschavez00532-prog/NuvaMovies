package p184j1;

import java.io.IOException;

/* renamed from: j1.e */
/* loaded from: classes.dex */
public final class C4974e extends IOException {

    /* renamed from: a */
    private final int f20710a;

    public C4974e(int i10) {
        this("Http request failed", i10);
    }

    public C4974e(String str, int i10) {
        this(str, i10, null);
    }

    public C4974e(String str, int i10, Throwable th) {
        super(str + ", status code: " + i10, th);
        this.f20710a = i10;
    }
}
