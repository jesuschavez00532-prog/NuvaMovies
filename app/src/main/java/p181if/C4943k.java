package p181if;

/* renamed from: if.k */
/* loaded from: classes3.dex */
public class C4943k {

    /* renamed from: a */
    private int f20544a;

    /* renamed from: b */
    private int f20545b;

    /* renamed from: c */
    private int f20546c;

    /* renamed from: d */
    private int f20547d;

    /* renamed from: e */
    private int[] f20548e;

    public C4943k(int i10, int i11, int i12, int i13, int[] iArr) {
        this.f20544a = i10;
        this.f20545b = i11;
        this.f20546c = i12;
        this.f20547d = i13;
        this.f20548e = iArr;
    }

    /* renamed from: a */
    public static int m20273a(int i10, int i11) {
        return i10 | (i11 << 16);
    }

    /* renamed from: b */
    public static int m20274b(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        return m20275c(i10 | (i11 << 4), (i13 << 4) | i12, (i15 << 4) | i14, (i17 << 4) | i16);
    }

    /* renamed from: c */
    public static int m20275c(int i10, int i11, int i12, int i13) {
        return m20273a(i10 | (i11 << 8), (i13 << 8) | i12);
    }

    /* renamed from: d */
    public int m20276d(int i10) {
        return (this.f20548e[i10 >> this.f20544a] >> ((i10 & this.f20545b) << this.f20546c)) & this.f20547d;
    }
}
