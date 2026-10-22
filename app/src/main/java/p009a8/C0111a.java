package p009a8;

/* renamed from: a8.a */
/* loaded from: classes2.dex */
public class C0111a extends RuntimeException {

    /* renamed from: a */
    private int f362a;

    /* renamed from: b */
    private int f363b;

    public C0111a(int i10) {
        this.f362a = i10;
    }

    /* renamed from: a */
    public int m485a() {
        return this.f362a;
    }

    /* renamed from: b */
    public int m486b() {
        return this.f363b;
    }

    public C0111a(int i10, String str) {
        super(str);
        this.f362a = i10;
    }

    public C0111a(int i10, int i11, String str) {
        super(str);
        this.f362a = i10;
        this.f363b = i11;
    }

    public C0111a(int i10, String str, Throwable th) {
        super(str, th);
        this.f362a = i10;
    }

    public C0111a(int i10, Throwable th) {
        super(th);
        this.f362a = i10;
    }
}
