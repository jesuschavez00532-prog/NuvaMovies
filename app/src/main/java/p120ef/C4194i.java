package p120ef;

import java.nio.ByteBuffer;
import p105df.AbstractC4102b;
import p120ef.AbstractC4187b;

/* renamed from: ef.i */
/* loaded from: classes3.dex */
public class C4194i extends AbstractC4187b {

    /* renamed from: d */
    private static final byte[] f18344d = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 1, 1, 1, 1, 1, 1, 0, 1, 7, 1, 1, 1, 1, 1, 1, 5, 1, 5, 0, 5, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 7, 1, 7, 0, 7, 5, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 4, 4, 4, 4, 4, 4, 5, 5, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 4, 4, 4, 4, 4, 1, 4, 4, 4, 4, 4, 5, 5, 5, 6, 6, 6, 6, 6, 6, 7, 7, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 6, 6, 6, 6, 6, 1, 6, 6, 6, 6, 6, 7, 7, 7};

    /* renamed from: e */
    private static final byte[] f18345e = {0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 3, 3, 3, 3, 3, 3, 0, 3, 3, 3, 3, 3, 3, 3, 0, 3, 3, 3, 1, 1, 3, 3, 0, 3, 3, 3, 1, 2, 1, 2, 0, 3, 3, 3, 3, 3, 3, 3, 0, 3, 1, 3, 1, 1, 1, 3, 0, 3, 1, 3, 1, 1, 3, 3};

    /* renamed from: a */
    private AbstractC4187b.a f18346a;

    /* renamed from: b */
    private byte f18347b;

    /* renamed from: c */
    private int[] f18348c = new int[4];

    public C4194i() {
        mo17503i();
    }

    @Override // p120ef.AbstractC4187b
    /* renamed from: c */
    public String mo17499c() {
        return AbstractC4102b.f18025r;
    }

    @Override // p120ef.AbstractC4187b
    /* renamed from: d */
    public float mo17500d() {
        int[] iArr;
        float f10 = 0.0f;
        if (this.f18346a == AbstractC4187b.a.NOT_ME) {
            return 0.01f;
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            iArr = this.f18348c;
            if (i10 >= iArr.length) {
                break;
            }
            i11 += iArr[i10];
            i10++;
        }
        if (i11 <= 0) {
            f10 = 0.0f;
        } else {
            float f11 = i11;
            f10 = ((iArr[3] * 1.0f) / f11) - ((iArr[1] * 20.0f) / f11);
        }
        return (f10 >= 0.0f ? f10 : 0.0f) * 0.5f;
    }

    @Override // p120ef.AbstractC4187b
    /* renamed from: e */
    public AbstractC4187b.a mo17501e() {
        return this.f18346a;
    }

    @Override // p120ef.AbstractC4187b
    /* renamed from: f */
    public AbstractC4187b.a mo17502f(byte[] bArr, int i10, int i11) {
        ByteBuffer m17506a = m17506a(bArr, i10, i11);
        byte[] array = m17506a.array();
        int position = m17506a.position();
        int i12 = 0;
        while (true) {
            if (i12 >= position) {
                break;
            }
            byte b10 = f18344d[array[i12] & 255];
            byte b11 = f18345e[(this.f18347b * 8) + b10];
            if (b11 == 0) {
                this.f18346a = AbstractC4187b.a.NOT_ME;
                break;
            }
            int[] iArr = this.f18348c;
            iArr[b11] = iArr[b11] + 1;
            this.f18347b = b10;
            i12++;
        }
        return this.f18346a;
    }

    @Override // p120ef.AbstractC4187b
    /* renamed from: i */
    public void mo17503i() {
        this.f18346a = AbstractC4187b.a.DETECTING;
        this.f18347b = (byte) 1;
        int i10 = 0;
        while (true) {
            int[] iArr = this.f18348c;
            if (i10 >= iArr.length) {
                return;
            }
            iArr[i10] = 0;
            i10++;
        }
    }
}
