package p357uc;

import ne.AbstractC5864g;
import ne.AbstractC5868k;

/* renamed from: uc.a */
/* loaded from: classes3.dex */
public final class C7074a {

    /* renamed from: a */
    private int f26509a;

    /* renamed from: b */
    private String f26510b;

    /* renamed from: c */
    private String f26511c;

    /* renamed from: d */
    private String f26512d;

    /* renamed from: e */
    private float f26513e;

    /* renamed from: f */
    private long f26514f;

    /* renamed from: g */
    private long f26515g;

    public C7074a(int i10, String str, String str2, String str3, float f10, long j10, long j11) {
        AbstractC5868k.m23675g(str, "codec");
        AbstractC5868k.m23675g(str2, "decoder");
        AbstractC5868k.m23675g(str3, "lang");
        this.f26509a = i10;
        this.f26510b = str;
        this.f26511c = str2;
        this.f26512d = str3;
        this.f26513e = f10;
        this.f26514f = j10;
        this.f26515g = j11;
    }

    /* renamed from: a */
    public final int m27240a() {
        return this.f26509a;
    }

    /* renamed from: b */
    public final void m27241b(long j10) {
        this.f26515g = j10;
    }

    /* renamed from: c */
    public final void m27242c(long j10) {
        this.f26514f = j10;
    }

    /* renamed from: d */
    public final void m27243d(String str) {
        AbstractC5868k.m23675g(str, "<set-?>");
        this.f26510b = str;
    }

    /* renamed from: e */
    public final void m27244e(String str) {
        AbstractC5868k.m23675g(str, "<set-?>");
        this.f26511c = str;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C7074a) {
                C7074a c7074a = (C7074a) obj;
                if ((this.f26509a == c7074a.f26509a) && AbstractC5868k.m23669a(this.f26510b, c7074a.f26510b) && AbstractC5868k.m23669a(this.f26511c, c7074a.f26511c) && AbstractC5868k.m23669a(this.f26512d, c7074a.f26512d) && Float.compare(this.f26513e, c7074a.f26513e) == 0) {
                    if (this.f26514f == c7074a.f26514f) {
                        if (this.f26515g == c7074a.f26515g) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final void m27245f(float f10) {
        this.f26513e = f10;
    }

    /* renamed from: g */
    public final void m27246g(int i10) {
        this.f26509a = i10;
    }

    /* renamed from: h */
    public final void m27247h(String str) {
        AbstractC5868k.m23675g(str, "<set-?>");
        this.f26512d = str;
    }

    public int hashCode() {
        int i10 = this.f26509a * 31;
        String str = this.f26510b;
        int hashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f26511c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f26512d;
        int hashCode3 = (((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + Float.floatToIntBits(this.f26513e)) * 31;
        long j10 = this.f26514f;
        int i11 = (hashCode3 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f26515g;
        return i11 + ((int) (j11 ^ (j11 >>> 32)));
    }

    public String toString() {
        return "AudioTrackInfo(id=" + this.f26509a + ", codec=" + this.f26510b + ", decoder=" + this.f26511c + ", lang=" + this.f26512d + ", delay=" + this.f26513e + ", bufferTime=" + this.f26514f + ", bufferLength=" + this.f26515g + ")";
    }

    public /* synthetic */ C7074a(int i10, String str, String str2, String str3, float f10, long j10, long j11, int i11, AbstractC5864g abstractC5864g) {
        this((i11 & 1) != 0 ? -1 : i10, (i11 & 2) != 0 ? "" : str, (i11 & 4) != 0 ? "" : str2, (i11 & 8) == 0 ? str3 : "", (i11 & 16) != 0 ? 0.0f : f10, (i11 & 32) != 0 ? 0L : j10, (i11 & 64) == 0 ? j11 : 0L);
    }
}
