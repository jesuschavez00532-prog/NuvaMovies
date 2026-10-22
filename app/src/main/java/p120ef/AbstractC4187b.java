package p120ef;

import java.nio.ByteBuffer;

/* renamed from: ef.b */
/* loaded from: classes3.dex */
public abstract class AbstractC4187b {

    /* renamed from: ef.b$a */
    /* loaded from: classes3.dex */
    public enum a {
        DETECTING,
        FOUND_IT,
        NOT_ME
    }

    /* renamed from: g */
    private boolean m17504g(byte b10) {
        return (b10 & 128) == 0;
    }

    /* renamed from: h */
    private boolean m17505h(byte b10) {
        int i10 = b10 & 255;
        return i10 < 65 || (i10 > 90 && i10 < 97) || i10 > 122;
    }

    /* renamed from: a */
    public ByteBuffer m17506a(byte[] bArr, int i10, int i11) {
        ByteBuffer allocate = ByteBuffer.allocate(i11);
        int i12 = i11 + i10;
        int i13 = i10;
        boolean z10 = false;
        while (i10 < i12) {
            byte b10 = bArr[i10];
            if (b10 == 62) {
                z10 = false;
            } else if (b10 == 60) {
                z10 = true;
            }
            if (m17504g(b10) && m17505h(b10)) {
                if (i10 > i13 && !z10) {
                    allocate.put(bArr, i13, i10 - i13);
                    allocate.put((byte) 32);
                }
                i13 = i10 + 1;
            }
            i10++;
        }
        if (!z10 && i10 > i13) {
            allocate.put(bArr, i13, i10 - i13);
        }
        return allocate;
    }

    /* renamed from: b */
    public ByteBuffer m17507b(byte[] bArr, int i10, int i11) {
        ByteBuffer allocate = ByteBuffer.allocate(i11);
        int i12 = i11 + i10;
        int i13 = i10;
        boolean z10 = false;
        while (i10 < i12) {
            byte b10 = bArr[i10];
            if (!m17504g(b10)) {
                z10 = true;
            } else if (m17505h(b10)) {
                if (!z10 || i10 <= i13) {
                    i13 = i10 + 1;
                } else {
                    allocate.put(bArr, i13, i10 - i13);
                    allocate.put((byte) 32);
                    i13 = i10 + 1;
                    z10 = false;
                }
            }
            i10++;
        }
        if (z10 && i10 > i13) {
            allocate.put(bArr, i13, i10 - i13);
        }
        return allocate;
    }

    /* renamed from: c */
    public abstract String mo17499c();

    /* renamed from: d */
    public abstract float mo17500d();

    /* renamed from: e */
    public abstract a mo17501e();

    /* renamed from: f */
    public abstract a mo17502f(byte[] bArr, int i10, int i11);

    /* renamed from: i */
    public abstract void mo17503i();
}
