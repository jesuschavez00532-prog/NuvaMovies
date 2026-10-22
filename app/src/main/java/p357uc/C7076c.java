package p357uc;

import anet.channel.entity.EventType;
import java.util.ArrayList;
import java.util.List;
import ne.AbstractC5864g;
import ne.AbstractC5868k;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* renamed from: uc.c */
/* loaded from: classes3.dex */
public final class C7076c {

    /* renamed from: a */
    private long f26526a;

    /* renamed from: b */
    private String f26527b;

    /* renamed from: c */
    private String f26528c;

    /* renamed from: d */
    private String f26529d;

    /* renamed from: e */
    private String f26530e;

    /* renamed from: f */
    private String f26531f;

    /* renamed from: g */
    private List f26532g;

    /* renamed from: h */
    private long f26533h;

    /* renamed from: i */
    private String f26534i;

    /* renamed from: j */
    private String f26535j;

    /* renamed from: k */
    private C7079f f26536k;

    /* renamed from: l */
    private C7074a f26537l;

    /* renamed from: m */
    private C7078e f26538m;

    /* renamed from: n */
    private ArrayList f26539n;

    public C7076c(long j10, String str, String str2, String str3, String str4, String str5, List list, long j11, String str6, String str7, C7079f c7079f, C7074a c7074a, C7078e c7078e, ArrayList arrayList) {
        AbstractC5868k.m23675g(str, "program");
        AbstractC5868k.m23675g(str2, "title");
        AbstractC5868k.m23675g(str3, "buss");
        AbstractC5868k.m23675g(str4, "media");
        AbstractC5868k.m23675g(str5, "play_url");
        AbstractC5868k.m23675g(str6, IjkMediaMeta.IJKM_KEY_FORMAT);
        AbstractC5868k.m23675g(str7, "player");
        this.f26526a = j10;
        this.f26527b = str;
        this.f26528c = str2;
        this.f26529d = str3;
        this.f26530e = str4;
        this.f26531f = str5;
        this.f26532g = list;
        this.f26533h = j11;
        this.f26534i = str6;
        this.f26535j = str7;
        this.f26536k = c7079f;
        this.f26537l = c7074a;
        this.f26538m = c7078e;
        this.f26539n = arrayList;
    }

    /* renamed from: a */
    public final C7074a m27261a() {
        return this.f26537l;
    }

    /* renamed from: b */
    public final String m27262b() {
        return this.f26529d;
    }

    /* renamed from: c */
    public final long m27263c() {
        return this.f26526a;
    }

    /* renamed from: d */
    public final String m27264d() {
        return this.f26531f;
    }

    /* renamed from: e */
    public final String m27265e() {
        return this.f26535j;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C7076c) {
                C7076c c7076c = (C7076c) obj;
                if ((this.f26526a == c7076c.f26526a) && AbstractC5868k.m23669a(this.f26527b, c7076c.f26527b) && AbstractC5868k.m23669a(this.f26528c, c7076c.f26528c) && AbstractC5868k.m23669a(this.f26529d, c7076c.f26529d) && AbstractC5868k.m23669a(this.f26530e, c7076c.f26530e) && AbstractC5868k.m23669a(this.f26531f, c7076c.f26531f) && AbstractC5868k.m23669a(this.f26532g, c7076c.f26532g)) {
                    if (!(this.f26533h == c7076c.f26533h) || !AbstractC5868k.m23669a(this.f26534i, c7076c.f26534i) || !AbstractC5868k.m23669a(this.f26535j, c7076c.f26535j) || !AbstractC5868k.m23669a(this.f26536k, c7076c.f26536k) || !AbstractC5868k.m23669a(this.f26537l, c7076c.f26537l) || !AbstractC5868k.m23669a(this.f26538m, c7076c.f26538m) || !AbstractC5868k.m23669a(this.f26539n, c7076c.f26539n)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final ArrayList m27266f() {
        return this.f26539n;
    }

    /* renamed from: g */
    public final C7079f m27267g() {
        return this.f26536k;
    }

    /* renamed from: h */
    public final void m27268h(C7074a c7074a) {
        this.f26537l = c7074a;
    }

    public int hashCode() {
        long j10 = this.f26526a;
        int i10 = ((int) (j10 ^ (j10 >>> 32))) * 31;
        String str = this.f26527b;
        int hashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f26528c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f26529d;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f26530e;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f26531f;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        List list = this.f26532g;
        int hashCode6 = list != null ? list.hashCode() : 0;
        long j11 = this.f26533h;
        int i11 = (((hashCode5 + hashCode6) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        String str6 = this.f26534i;
        int hashCode7 = (i11 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.f26535j;
        int hashCode8 = (hashCode7 + (str7 != null ? str7.hashCode() : 0)) * 31;
        C7079f c7079f = this.f26536k;
        int hashCode9 = (hashCode8 + (c7079f != null ? c7079f.hashCode() : 0)) * 31;
        C7074a c7074a = this.f26537l;
        int hashCode10 = (hashCode9 + (c7074a != null ? c7074a.hashCode() : 0)) * 31;
        C7078e c7078e = this.f26538m;
        int hashCode11 = (hashCode10 + (c7078e != null ? c7078e.hashCode() : 0)) * 31;
        ArrayList arrayList = this.f26539n;
        return hashCode11 + (arrayList != null ? arrayList.hashCode() : 0);
    }

    /* renamed from: i */
    public final void m27269i(String str) {
        AbstractC5868k.m23675g(str, "<set-?>");
        this.f26529d = str;
    }

    /* renamed from: j */
    public final void m27270j(long j10) {
        this.f26526a = j10;
    }

    /* renamed from: k */
    public final void m27271k(String str) {
        AbstractC5868k.m23675g(str, "<set-?>");
        this.f26534i = str;
    }

    /* renamed from: l */
    public final void m27272l(long j10) {
        this.f26533h = j10;
    }

    /* renamed from: m */
    public final void m27273m(List list) {
        this.f26532g = list;
    }

    /* renamed from: n */
    public final void m27274n(String str) {
        AbstractC5868k.m23675g(str, "<set-?>");
        this.f26530e = str;
    }

    /* renamed from: o */
    public final void m27275o(String str) {
        AbstractC5868k.m23675g(str, "<set-?>");
        this.f26531f = str;
    }

    /* renamed from: p */
    public final void m27276p(String str) {
        AbstractC5868k.m23675g(str, "<set-?>");
        this.f26535j = str;
    }

    /* renamed from: q */
    public final void m27277q(String str) {
        AbstractC5868k.m23675g(str, "<set-?>");
        this.f26527b = str;
    }

    /* renamed from: r */
    public final void m27278r(C7078e c7078e) {
        this.f26538m = c7078e;
    }

    /* renamed from: s */
    public final void m27279s(String str) {
        AbstractC5868k.m23675g(str, "<set-?>");
        this.f26528c = str;
    }

    /* renamed from: t */
    public final void m27280t(ArrayList arrayList) {
        this.f26539n = arrayList;
    }

    public String toString() {
        return "PlayStatus(duration=" + this.f26526a + ", program=" + this.f26527b + ", title=" + this.f26528c + ", buss=" + this.f26529d + ", media=" + this.f26530e + ", play_url=" + this.f26531f + ", links=" + this.f26532g + ", latency=" + this.f26533h + ", format=" + this.f26534i + ", player=" + this.f26535j + ", video=" + this.f26536k + ", audio=" + this.f26537l + ", subtitle=" + this.f26538m + ", tracks=" + this.f26539n + ")";
    }

    /* renamed from: u */
    public final void m27281u(C7079f c7079f) {
        this.f26536k = c7079f;
    }

    public /* synthetic */ C7076c(long j10, String str, String str2, String str3, String str4, String str5, List list, long j11, String str6, String str7, C7079f c7079f, C7074a c7074a, C7078e c7078e, ArrayList arrayList, int i10, AbstractC5864g abstractC5864g) {
        this((i10 & 1) != 0 ? 0L : j10, (i10 & 2) != 0 ? "" : str, (i10 & 4) != 0 ? "" : str2, (i10 & 8) != 0 ? "" : str3, (i10 & 16) != 0 ? "" : str4, (i10 & 32) != 0 ? "" : str5, (i10 & 64) != 0 ? null : list, (i10 & 128) != 0 ? -1L : j11, (i10 & 256) != 0 ? "" : str6, (i10 & 512) == 0 ? str7 : "", (i10 & EventType.AUTH_FAIL) != 0 ? null : c7079f, (i10 & 2048) != 0 ? null : c7074a, (i10 & 4096) != 0 ? null : c7078e, (i10 & 8192) != 0 ? null : arrayList);
    }
}
