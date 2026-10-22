package p276p;

import android.graphics.Insets;
import android.graphics.Rect;

/* renamed from: p.g */
/* loaded from: classes.dex */
public final class C6134g {

    /* renamed from: e */
    public static final C6134g f24117e = new C6134g(0, 0, 0, 0);

    /* renamed from: a */
    public final int f24118a;

    /* renamed from: b */
    public final int f24119b;

    /* renamed from: c */
    public final int f24120c;

    /* renamed from: d */
    public final int f24121d;

    private C6134g(int i10, int i11, int i12, int i13) {
        this.f24118a = i10;
        this.f24119b = i11;
        this.f24120c = i12;
        this.f24121d = i13;
    }

    /* renamed from: a */
    public static C6134g m24433a(C6134g c6134g, C6134g c6134g2) {
        return m24434b(Math.max(c6134g.f24118a, c6134g2.f24118a), Math.max(c6134g.f24119b, c6134g2.f24119b), Math.max(c6134g.f24120c, c6134g2.f24120c), Math.max(c6134g.f24121d, c6134g2.f24121d));
    }

    /* renamed from: b */
    public static C6134g m24434b(int i10, int i11, int i12, int i13) {
        if (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            return f24117e;
        }
        return new C6134g(i10, i11, i12, i13);
    }

    /* renamed from: c */
    public static C6134g m24435c(Rect rect) {
        return m24434b(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: d */
    public static C6134g m24436d(Insets insets) {
        int i10;
        int i11;
        int i12;
        int i13;
        i10 = insets.left;
        i11 = insets.top;
        i12 = insets.right;
        i13 = insets.bottom;
        return m24434b(i10, i11, i12, i13);
    }

    /* renamed from: e */
    public Insets m24437e() {
        Insets of;
        of = Insets.of(this.f24118a, this.f24119b, this.f24120c, this.f24121d);
        return of;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6134g.class != obj.getClass()) {
            return false;
        }
        C6134g c6134g = (C6134g) obj;
        if (this.f24121d == c6134g.f24121d && this.f24118a == c6134g.f24118a && this.f24120c == c6134g.f24120c && this.f24119b == c6134g.f24119b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f24118a * 31) + this.f24119b) * 31) + this.f24120c) * 31) + this.f24121d;
    }

    public String toString() {
        return "Insets{left=" + this.f24118a + ", top=" + this.f24119b + ", right=" + this.f24120c + ", bottom=" + this.f24121d + '}';
    }
}
