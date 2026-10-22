package com.efs.sdk.net.p057a.p058a;

import java.io.ByteArrayOutputStream;

/* renamed from: com.efs.sdk.net.a.a.h */
/* loaded from: classes.dex */
public final class C1763h {

    /* renamed from: a */
    public final InterfaceC1761f f7362a;

    /* renamed from: b */
    public ByteArrayOutputStream f7363b;

    /* renamed from: c */
    public C1756a f7364c;

    /* renamed from: d */
    private final String f7365d;

    public C1763h(InterfaceC1761f interfaceC1761f, String str) {
        this.f7362a = interfaceC1761f;
        this.f7365d = str;
    }

    /* renamed from: a */
    public final boolean m7856a() {
        if (this.f7363b != null) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void m7857b() {
        if (m7856a()) {
        } else {
            throw new IllegalStateException("No body found; has createBodySink been called?");
        }
    }
}
