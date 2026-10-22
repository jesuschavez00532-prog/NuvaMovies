package p175i7;

import p158h7.C4563c;
import p158h7.EnumC4561a;
import p158h7.EnumC4562b;

/* renamed from: i7.f */
/* loaded from: classes.dex */
public final class C4907f {

    /* renamed from: a */
    private EnumC4562b f20425a;

    /* renamed from: b */
    private EnumC4561a f20426b;

    /* renamed from: c */
    private C4563c f20427c;

    /* renamed from: d */
    private int f20428d = -1;

    /* renamed from: e */
    private C4903b f20429e;

    /* renamed from: b */
    public static boolean m20160b(int i10) {
        return i10 >= 0 && i10 < 8;
    }

    /* renamed from: a */
    public C4903b m20161a() {
        return this.f20429e;
    }

    /* renamed from: c */
    public void m20162c(EnumC4561a enumC4561a) {
        this.f20426b = enumC4561a;
    }

    /* renamed from: d */
    public void m20163d(int i10) {
        this.f20428d = i10;
    }

    /* renamed from: e */
    public void m20164e(C4903b c4903b) {
        this.f20429e = c4903b;
    }

    /* renamed from: f */
    public void m20165f(EnumC4562b enumC4562b) {
        this.f20425a = enumC4562b;
    }

    /* renamed from: g */
    public void m20166g(C4563c c4563c) {
        this.f20427c = c4563c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(200);
        sb2.append("<<\n");
        sb2.append(" mode: ");
        sb2.append(this.f20425a);
        sb2.append("\n ecLevel: ");
        sb2.append(this.f20426b);
        sb2.append("\n version: ");
        sb2.append(this.f20427c);
        sb2.append("\n maskPattern: ");
        sb2.append(this.f20428d);
        if (this.f20429e == null) {
            sb2.append("\n matrix: null\n");
        } else {
            sb2.append("\n matrix:\n");
            sb2.append(this.f20429e);
        }
        sb2.append(">>\n");
        return sb2.toString();
    }
}
