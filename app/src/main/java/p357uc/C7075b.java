package p357uc;

import com.umeng.analytics.pro.C3325bt;
import ne.AbstractC5864g;
import ne.AbstractC5868k;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* renamed from: uc.b */
/* loaded from: classes3.dex */
public final class C7075b {

    /* renamed from: a */
    private int f26516a;

    /* renamed from: b */
    private String f26517b;

    /* renamed from: c */
    private String f26518c;

    /* renamed from: d */
    private String f26519d;

    /* renamed from: e */
    private String f26520e;

    /* renamed from: f */
    private String f26521f;

    /* renamed from: g */
    private String f26522g;

    /* renamed from: h */
    private String f26523h;

    /* renamed from: i */
    private String f26524i;

    /* renamed from: j */
    private String f26525j;

    public C7075b(int i10, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        AbstractC5868k.m23675g(str, "type");
        AbstractC5868k.m23675g(str2, "codec");
        AbstractC5868k.m23675g(str3, "frame_rate");
        AbstractC5868k.m23675g(str4, "pixel_format");
        AbstractC5868k.m23675g(str5, C3325bt.f14284z);
        AbstractC5868k.m23675g(str6, "lang");
        AbstractC5868k.m23675g(str7, IjkMediaMeta.IJKM_KEY_CHANNELS);
        AbstractC5868k.m23675g(str8, IjkMediaMeta.IJKM_KEY_SAMPLE_RATE);
        AbstractC5868k.m23675g(str9, "bit_depth");
        this.f26516a = i10;
        this.f26517b = str;
        this.f26518c = str2;
        this.f26519d = str3;
        this.f26520e = str4;
        this.f26521f = str5;
        this.f26522g = str6;
        this.f26523h = str7;
        this.f26524i = str8;
        this.f26525j = str9;
    }

    /* renamed from: a */
    public final String m27248a() {
        return this.f26518c;
    }

    /* renamed from: b */
    public final int m27249b() {
        return this.f26516a;
    }

    /* renamed from: c */
    public final String m27250c() {
        return this.f26522g;
    }

    /* renamed from: d */
    public final String m27251d() {
        return this.f26517b;
    }

    /* renamed from: e */
    public final void m27252e(String str) {
        AbstractC5868k.m23675g(str, "<set-?>");
        this.f26523h = str;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C7075b) {
                C7075b c7075b = (C7075b) obj;
                if (!(this.f26516a == c7075b.f26516a) || !AbstractC5868k.m23669a(this.f26517b, c7075b.f26517b) || !AbstractC5868k.m23669a(this.f26518c, c7075b.f26518c) || !AbstractC5868k.m23669a(this.f26519d, c7075b.f26519d) || !AbstractC5868k.m23669a(this.f26520e, c7075b.f26520e) || !AbstractC5868k.m23669a(this.f26521f, c7075b.f26521f) || !AbstractC5868k.m23669a(this.f26522g, c7075b.f26522g) || !AbstractC5868k.m23669a(this.f26523h, c7075b.f26523h) || !AbstractC5868k.m23669a(this.f26524i, c7075b.f26524i) || !AbstractC5868k.m23669a(this.f26525j, c7075b.f26525j)) {
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final void m27253f(String str) {
        AbstractC5868k.m23675g(str, "<set-?>");
        this.f26518c = str;
    }

    /* renamed from: g */
    public final void m27254g(String str) {
        AbstractC5868k.m23675g(str, "<set-?>");
        this.f26519d = str;
    }

    /* renamed from: h */
    public final void m27255h(int i10) {
        this.f26516a = i10;
    }

    public int hashCode() {
        int i10 = this.f26516a * 31;
        String str = this.f26517b;
        int hashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f26518c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f26519d;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f26520e;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f26521f;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f26522g;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.f26523h;
        int hashCode7 = (hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.f26524i;
        int hashCode8 = (hashCode7 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.f26525j;
        return hashCode8 + (str9 != null ? str9.hashCode() : 0);
    }

    /* renamed from: i */
    public final void m27256i(String str) {
        AbstractC5868k.m23675g(str, "<set-?>");
        this.f26522g = str;
    }

    /* renamed from: j */
    public final void m27257j(String str) {
        AbstractC5868k.m23675g(str, "<set-?>");
        this.f26520e = str;
    }

    /* renamed from: k */
    public final void m27258k(String str) {
        AbstractC5868k.m23675g(str, "<set-?>");
        this.f26521f = str;
    }

    /* renamed from: l */
    public final void m27259l(String str) {
        AbstractC5868k.m23675g(str, "<set-?>");
        this.f26524i = str;
    }

    /* renamed from: m */
    public final void m27260m(String str) {
        AbstractC5868k.m23675g(str, "<set-?>");
        this.f26517b = str;
    }

    public String toString() {
        return "MultiTrackInfo(id=" + this.f26516a + ", type=" + this.f26517b + ", codec=" + this.f26518c + ", frame_rate=" + this.f26519d + ", pixel_format=" + this.f26520e + ", resolution=" + this.f26521f + ", lang=" + this.f26522g + ", channels=" + this.f26523h + ", sample_rate=" + this.f26524i + ", bit_depth=" + this.f26525j + ")";
    }

    public /* synthetic */ C7075b(int i10, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i11, AbstractC5864g abstractC5864g) {
        this((i11 & 1) != 0 ? -1 : i10, (i11 & 2) != 0 ? "" : str, (i11 & 4) != 0 ? "" : str2, (i11 & 8) != 0 ? "" : str3, (i11 & 16) != 0 ? "" : str4, (i11 & 32) != 0 ? "" : str5, (i11 & 64) != 0 ? "" : str6, (i11 & 128) != 0 ? "" : str7, (i11 & 256) != 0 ? "" : str8, (i11 & 512) == 0 ? str9 : "");
    }
}
