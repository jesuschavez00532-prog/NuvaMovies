package org.xutils.image;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: org.xutils.image.b */
/* loaded from: classes3.dex */
public final class C6122b {

    /* renamed from: a */
    public final String f24107a;

    /* renamed from: b */
    public final ImageOptions f24108b;

    public C6122b(String str, ImageOptions imageOptions) {
        this.f24107a = str;
        this.f24108b = imageOptions;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6122b.class != obj.getClass()) {
            return false;
        }
        C6122b c6122b = (C6122b) obj;
        if (!this.f24107a.equals(c6122b.f24107a)) {
            return false;
        }
        return this.f24108b.equals(c6122b.f24108b);
    }

    public int hashCode() {
        return (this.f24107a.hashCode() * 31) + this.f24108b.hashCode();
    }

    public String toString() {
        return this.f24107a + this.f24108b.toString();
    }
}
