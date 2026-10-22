package p357uc;

import ne.AbstractC5864g;
import ne.AbstractC5868k;

/* renamed from: uc.e */
/* loaded from: classes3.dex */
public final class C7078e {

    /* renamed from: a */
    private int f26543a;

    /* renamed from: b */
    private String f26544b;

    /* renamed from: c */
    private String f26545c;

    /* renamed from: d */
    private float f26546d;

    public C7078e(int i10, String str, String str2, float f10) {
        AbstractC5868k.m23675g(str, "codec");
        AbstractC5868k.m23675g(str2, "lang");
        this.f26543a = i10;
        this.f26544b = str;
        this.f26545c = str2;
        this.f26546d = f10;
    }

    /* renamed from: a */
    public final void m27283a(String str) {
        AbstractC5868k.m23675g(str, "<set-?>");
        this.f26544b = str;
    }

    /* renamed from: b */
    public final void m27284b(int i10) {
        this.f26543a = i10;
    }

    /* renamed from: c */
    public final void m27285c(String str) {
        AbstractC5868k.m23675g(str, "<set-?>");
        this.f26545c = str;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C7078e) {
                C7078e c7078e = (C7078e) obj;
                if (!(this.f26543a == c7078e.f26543a) || !AbstractC5868k.m23669a(this.f26544b, c7078e.f26544b) || !AbstractC5868k.m23669a(this.f26545c, c7078e.f26545c) || Float.compare(this.f26546d, c7078e.f26546d) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i10 = this.f26543a * 31;
        String str = this.f26544b;
        int hashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f26545c;
        return ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Float.floatToIntBits(this.f26546d);
    }

    public String toString() {
        return "SubTitleTrackInfo(id=" + this.f26543a + ", codec=" + this.f26544b + ", lang=" + this.f26545c + ", delay=" + this.f26546d + ")";
    }

    public /* synthetic */ C7078e(int i10, String str, String str2, float f10, int i11, AbstractC5864g abstractC5864g) {
        this((i11 & 1) != 0 ? -1 : i10, (i11 & 2) != 0 ? "" : str, (i11 & 4) != 0 ? "" : str2, (i11 & 8) != 0 ? 0.0f : f10);
    }
}
