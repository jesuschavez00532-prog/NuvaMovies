package com.taobao.accs.utl;

import java.io.ByteArrayInputStream;
import java.io.IOException;

/* renamed from: com.taobao.accs.utl.s */
/* loaded from: classes.dex */
public class C3206s extends ByteArrayInputStream {
    public C3206s(byte[] bArr) {
        super(bArr);
    }

    /* renamed from: a */
    public int m13029a() {
        return read() & 255;
    }

    /* renamed from: b */
    public int m13031b() {
        return (m13029a() << 8) | m13029a();
    }

    /* renamed from: c */
    public byte[] m13032c() {
        byte[] bArr = new byte[available()];
        read(bArr);
        return bArr;
    }

    /* renamed from: a */
    public String m13030a(int i10) {
        byte[] bArr = new byte[i10];
        int read = read(bArr);
        if (read == i10) {
            return new String(bArr, "utf-8");
        }
        throw new IOException("read len not match. ask for " + i10 + " but read for " + read);
    }
}
