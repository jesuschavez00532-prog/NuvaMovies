package p400xa;

import ne.AbstractC5868k;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;

/* renamed from: xa.d1 */
/* loaded from: classes2.dex */
public final class C7562d1 {

    /* renamed from: a */
    private String f27767a;

    /* renamed from: b */
    private String f27768b;

    /* renamed from: c */
    private Double f27769c;

    /* renamed from: d */
    private String f27770d;

    public C7562d1(String str, String str2, Double d10, String str3) {
        AbstractC5868k.m23674f(str, IjkMediaPlayer.OnNativeInvokeListener.ARG_HTTP_CODE);
        AbstractC5868k.m23674f(str2, "msg");
        AbstractC5868k.m23674f(str3, "host");
        this.f27767a = str;
        this.f27768b = str2;
        this.f27769c = d10;
        this.f27770d = str3;
    }

    /* renamed from: a */
    public final String m28992a() {
        return this.f27770d;
    }

    /* renamed from: b */
    public final String m28993b() {
        return this.f27767a;
    }

    /* renamed from: c */
    public final String m28994c() {
        return this.f27768b;
    }

    /* renamed from: d */
    public final Double m28995d() {
        return this.f27769c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7562d1)) {
            return false;
        }
        C7562d1 c7562d1 = (C7562d1) obj;
        return AbstractC5868k.m23669a(this.f27767a, c7562d1.f27767a) && AbstractC5868k.m23669a(this.f27768b, c7562d1.f27768b) && AbstractC5868k.m23669a(this.f27769c, c7562d1.f27769c) && AbstractC5868k.m23669a(this.f27770d, c7562d1.f27770d);
    }

    public int hashCode() {
        int hashCode = ((this.f27767a.hashCode() * 31) + this.f27768b.hashCode()) * 31;
        Double d10 = this.f27769c;
        return ((hashCode + (d10 == null ? 0 : d10.hashCode())) * 31) + this.f27770d.hashCode();
    }

    public String toString() {
        return "PingResult(http_code=" + this.f27767a + ", msg=" + this.f27768b + ", total_ms=" + this.f27769c + ", host=" + this.f27770d + ')';
    }
}
