package org.xutils.view;

/* renamed from: org.xutils.view.b */
/* loaded from: classes3.dex */
final class C6126b {

    /* renamed from: a */
    public int f24114a;

    /* renamed from: b */
    public int f24115b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6126b.class != obj.getClass()) {
            return false;
        }
        C6126b c6126b = (C6126b) obj;
        if (this.f24114a == c6126b.f24114a && this.f24115b == c6126b.f24115b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f24114a * 31) + this.f24115b;
    }
}
