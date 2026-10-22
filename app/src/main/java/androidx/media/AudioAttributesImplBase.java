package androidx.media;

import com.umeng.commonsdk.stateless.C3478b;
import java.util.Arrays;

/* loaded from: classes.dex */
public class AudioAttributesImplBase implements AudioAttributesImpl {

    /* renamed from: a */
    public int f3166a = 0;

    /* renamed from: b */
    public int f3167b = 0;

    /* renamed from: c */
    public int f3168c = 0;

    /* renamed from: d */
    public int f3169d = -1;

    /* renamed from: a */
    public int m3758a() {
        return this.f3167b;
    }

    /* renamed from: b */
    public int m3759b() {
        int i10 = this.f3168c;
        int m3760c = m3760c();
        if (m3760c == 6) {
            i10 |= 4;
        } else if (m3760c == 7) {
            i10 |= 1;
        }
        return i10 & C3478b.f15365a;
    }

    /* renamed from: c */
    public int m3760c() {
        int i10 = this.f3169d;
        if (i10 != -1) {
            return i10;
        }
        return AudioAttributesCompat.m3756a(false, this.f3168c, this.f3166a);
    }

    /* renamed from: d */
    public int m3761d() {
        return this.f3166a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        if (this.f3167b != audioAttributesImplBase.m3758a() || this.f3168c != audioAttributesImplBase.m3759b() || this.f3166a != audioAttributesImplBase.m3761d() || this.f3169d != audioAttributesImplBase.f3169d) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f3167b), Integer.valueOf(this.f3168c), Integer.valueOf(this.f3166a), Integer.valueOf(this.f3169d)});
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AudioAttributesCompat:");
        if (this.f3169d != -1) {
            sb2.append(" stream=");
            sb2.append(this.f3169d);
            sb2.append(" derived");
        }
        sb2.append(" usage=");
        sb2.append(AudioAttributesCompat.m3757b(this.f3166a));
        sb2.append(" content=");
        sb2.append(this.f3167b);
        sb2.append(" flags=0x");
        sb2.append(Integer.toHexString(this.f3168c).toUpperCase());
        return sb2.toString();
    }
}
