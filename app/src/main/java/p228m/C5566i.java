package p228m;

import java.util.Arrays;

/* renamed from: m.i */
/* loaded from: classes.dex */
public class C5566i {

    /* renamed from: k */
    private static int f22555k = 1;

    /* renamed from: a */
    private String f22556a;

    /* renamed from: e */
    public float f22560e;

    /* renamed from: g */
    a f22562g;

    /* renamed from: b */
    public int f22557b = -1;

    /* renamed from: c */
    int f22558c = -1;

    /* renamed from: d */
    public int f22559d = 0;

    /* renamed from: f */
    float[] f22561f = new float[7];

    /* renamed from: h */
    C5559b[] f22563h = new C5559b[8];

    /* renamed from: i */
    int f22564i = 0;

    /* renamed from: j */
    public int f22565j = 0;

    /* renamed from: m.i$a */
    /* loaded from: classes.dex */
    public enum a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public C5566i(a aVar, String str) {
        this.f22562g = aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static void m22598b() {
        f22555k++;
    }

    /* renamed from: a */
    public final void m22599a(C5559b c5559b) {
        int i10 = 0;
        while (true) {
            int i11 = this.f22564i;
            if (i10 < i11) {
                if (this.f22563h[i10] == c5559b) {
                    return;
                } else {
                    i10++;
                }
            } else {
                C5559b[] c5559bArr = this.f22563h;
                if (i11 >= c5559bArr.length) {
                    this.f22563h = (C5559b[]) Arrays.copyOf(c5559bArr, c5559bArr.length * 2);
                }
                C5559b[] c5559bArr2 = this.f22563h;
                int i12 = this.f22564i;
                c5559bArr2[i12] = c5559b;
                this.f22564i = i12 + 1;
                return;
            }
        }
    }

    /* renamed from: c */
    public final void m22600c(C5559b c5559b) {
        int i10 = this.f22564i;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f22563h[i11] == c5559b) {
                for (int i12 = 0; i12 < (i10 - i11) - 1; i12++) {
                    C5559b[] c5559bArr = this.f22563h;
                    int i13 = i11 + i12;
                    c5559bArr[i13] = c5559bArr[i13 + 1];
                }
                this.f22564i--;
                return;
            }
        }
    }

    /* renamed from: d */
    public void m22601d() {
        this.f22556a = null;
        this.f22562g = a.UNKNOWN;
        this.f22559d = 0;
        this.f22557b = -1;
        this.f22558c = -1;
        this.f22560e = 0.0f;
        this.f22564i = 0;
        this.f22565j = 0;
    }

    /* renamed from: e */
    public void m22602e(a aVar, String str) {
        this.f22562g = aVar;
    }

    /* renamed from: f */
    public final void m22603f(C5559b c5559b) {
        int i10 = this.f22564i;
        for (int i11 = 0; i11 < i10; i11++) {
            C5559b c5559b2 = this.f22563h[i11];
            c5559b2.f22530d.m22536n(c5559b2, c5559b, false);
        }
        this.f22564i = 0;
    }

    public String toString() {
        return "" + this.f22556a;
    }
}
