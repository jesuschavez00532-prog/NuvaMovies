package com.taobao.accs.utl;

import java.io.ByteArrayOutputStream;

/* renamed from: com.taobao.accs.utl.r */
/* loaded from: classes.dex */
public class C3205r extends ByteArrayOutputStream {
    public C3205r(int i10) {
        super(i10);
    }

    /* renamed from: a */
    public C3205r m13027a(byte b10) {
        write(b10);
        return this;
    }

    public C3205r() {
    }

    /* renamed from: a */
    public C3205r m13028a(short s10) {
        write(s10 >> 8);
        write(s10);
        return this;
    }
}
