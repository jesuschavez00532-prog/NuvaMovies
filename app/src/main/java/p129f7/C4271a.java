package p129f7;

import anet.channel.entity.EventType;
import com.umeng.ccg.C3419c;

/* renamed from: f7.a */
/* loaded from: classes.dex */
public final class C4271a {

    /* renamed from: h */
    public static final C4271a f18598h = new C4271a(4201, 4096, 1);

    /* renamed from: i */
    public static final C4271a f18599i = new C4271a(1033, EventType.AUTH_FAIL, 1);

    /* renamed from: j */
    public static final C4271a f18600j;

    /* renamed from: k */
    public static final C4271a f18601k;

    /* renamed from: l */
    public static final C4271a f18602l;

    /* renamed from: m */
    public static final C4271a f18603m;

    /* renamed from: n */
    public static final C4271a f18604n;

    /* renamed from: o */
    public static final C4271a f18605o;

    /* renamed from: a */
    private final int[] f18606a;

    /* renamed from: b */
    private final int[] f18607b;

    /* renamed from: c */
    private final C4272b f18608c;

    /* renamed from: d */
    private final C4272b f18609d;

    /* renamed from: e */
    private final int f18610e;

    /* renamed from: f */
    private final int f18611f;

    /* renamed from: g */
    private final int f18612g;

    static {
        C4271a c4271a = new C4271a(67, 64, 1);
        f18600j = c4271a;
        f18601k = new C4271a(19, 16, 1);
        f18602l = new C4271a(285, 256, 0);
        C4271a c4271a2 = new C4271a(C3419c.f15026o, 256, 1);
        f18603m = c4271a2;
        f18604n = c4271a2;
        f18605o = c4271a;
    }

    public C4271a(int i10, int i11, int i12) {
        this.f18611f = i10;
        this.f18610e = i11;
        this.f18612g = i12;
        this.f18606a = new int[i11];
        this.f18607b = new int[i11];
        int i13 = 1;
        for (int i14 = 0; i14 < i11; i14++) {
            this.f18606a[i14] = i13;
            i13 <<= 1;
            if (i13 >= i11) {
                i13 = (i13 ^ i10) & (i11 - 1);
            }
        }
        for (int i15 = 0; i15 < i11 - 1; i15++) {
            this.f18607b[this.f18606a[i15]] = i15;
        }
        this.f18608c = new C4272b(this, new int[]{0});
        this.f18609d = new C4272b(this, new int[]{1});
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m17806a(int i10, int i11) {
        return i10 ^ i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public C4272b m17807b(int i10, int i11) {
        if (i10 >= 0) {
            if (i11 == 0) {
                return this.f18608c;
            }
            int[] iArr = new int[i10 + 1];
            iArr[0] = i11;
            return new C4272b(this, iArr);
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m17808c(int i10) {
        return this.f18606a[i10];
    }

    /* renamed from: d */
    public int m17809d() {
        return this.f18612g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public C4272b m17810e() {
        return this.f18608c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public int m17811f(int i10) {
        if (i10 != 0) {
            return this.f18606a[(this.f18610e - this.f18607b[i10]) - 1];
        }
        throw new ArithmeticException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public int m17812g(int i10) {
        if (i10 != 0) {
            return this.f18607b[i10];
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public int m17813h(int i10, int i11) {
        if (i10 != 0 && i11 != 0) {
            int[] iArr = this.f18606a;
            int[] iArr2 = this.f18607b;
            return iArr[(iArr2[i10] + iArr2[i11]) % (this.f18610e - 1)];
        }
        return 0;
    }

    public String toString() {
        return "GF(0x" + Integer.toHexString(this.f18611f) + ',' + this.f18610e + ')';
    }
}
