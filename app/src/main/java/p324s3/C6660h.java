package p324s3;

import java.util.Arrays;
import p294q3.C6335b;

/* renamed from: s3.h */
/* loaded from: classes.dex */
public final class C6660h {

    /* renamed from: a */
    private final C6335b f25572a;

    /* renamed from: b */
    private final byte[] f25573b;

    public C6660h(C6335b c6335b, byte[] bArr) {
        if (c6335b != null) {
            if (bArr != null) {
                this.f25572a = c6335b;
                this.f25573b = bArr;
                return;
            }
            throw new NullPointerException("bytes is null");
        }
        throw new NullPointerException("encoding is null");
    }

    /* renamed from: a */
    public byte[] m26018a() {
        return this.f25573b;
    }

    /* renamed from: b */
    public C6335b m26019b() {
        return this.f25572a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6660h)) {
            return false;
        }
        C6660h c6660h = (C6660h) obj;
        if (!this.f25572a.equals(c6660h.f25572a)) {
            return false;
        }
        return Arrays.equals(this.f25573b, c6660h.f25573b);
    }

    public int hashCode() {
        return ((this.f25572a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f25573b);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.f25572a + ", bytes=[...]}";
    }
}
