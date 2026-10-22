package p175i7;

import java.lang.reflect.Array;

/* renamed from: i7.b */
/* loaded from: classes.dex */
public final class C4903b {

    /* renamed from: a */
    private final byte[][] f20416a;

    /* renamed from: b */
    private final int f20417b;

    /* renamed from: c */
    private final int f20418c;

    public C4903b(int i10, int i11) {
        this.f20416a = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i11, i10);
        this.f20417b = i10;
        this.f20418c = i11;
    }

    /* renamed from: a */
    public void m20104a(byte b10) {
        for (int i10 = 0; i10 < this.f20418c; i10++) {
            for (int i11 = 0; i11 < this.f20417b; i11++) {
                this.f20416a[i10][i11] = b10;
            }
        }
    }

    /* renamed from: b */
    public byte m20105b(int i10, int i11) {
        return this.f20416a[i11][i10];
    }

    /* renamed from: c */
    public byte[][] m20106c() {
        return this.f20416a;
    }

    /* renamed from: d */
    public int m20107d() {
        return this.f20418c;
    }

    /* renamed from: e */
    public int m20108e() {
        return this.f20417b;
    }

    /* renamed from: f */
    public void m20109f(int i10, int i11, int i12) {
        this.f20416a[i11][i10] = (byte) i12;
    }

    /* renamed from: g */
    public void m20110g(int i10, int i11, boolean z10) {
        this.f20416a[i11][i10] = z10 ? (byte) 1 : (byte) 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder((this.f20417b * 2 * this.f20418c) + 2);
        for (int i10 = 0; i10 < this.f20418c; i10++) {
            for (int i11 = 0; i11 < this.f20417b; i11++) {
                byte b10 = this.f20416a[i10][i11];
                if (b10 != 0) {
                    if (b10 != 1) {
                        sb2.append("  ");
                    } else {
                        sb2.append(" 1");
                    }
                } else {
                    sb2.append(" 0");
                }
            }
            sb2.append('\n');
        }
        return sb2.toString();
    }
}
