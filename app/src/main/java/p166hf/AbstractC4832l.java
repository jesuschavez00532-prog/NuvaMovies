package p166hf;

/* renamed from: hf.l */
/* loaded from: classes3.dex */
public abstract class AbstractC4832l {

    /* renamed from: a */
    protected short[] f20305a;

    /* renamed from: b */
    protected byte[] f20306b;

    /* renamed from: c */
    protected float f20307c;

    /* renamed from: d */
    protected boolean f20308d;

    /* renamed from: e */
    protected String f20309e;

    public AbstractC4832l(short[] sArr, byte[] bArr, float f10, boolean z10, String str) {
        this.f20305a = sArr;
        this.f20306b = bArr;
        this.f20307c = f10;
        this.f20308d = z10;
        this.f20309e = str;
    }

    /* renamed from: a */
    public String m19910a() {
        return this.f20309e;
    }

    /* renamed from: b */
    public short m19911b(byte b10) {
        return this.f20305a[b10 & 255];
    }

    /* renamed from: c */
    public byte m19912c(int i10) {
        return this.f20306b[i10];
    }

    /* renamed from: d */
    public float m19913d() {
        return this.f20307c;
    }
}
