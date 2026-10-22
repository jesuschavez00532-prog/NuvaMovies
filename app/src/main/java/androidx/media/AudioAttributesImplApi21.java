package androidx.media;

import android.media.AudioAttributes;

/* loaded from: classes.dex */
public class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* renamed from: a */
    public AudioAttributes f3164a;

    /* renamed from: b */
    public int f3165b = -1;

    public boolean equals(Object obj) {
        boolean equals;
        if (obj instanceof AudioAttributesImplApi21) {
            equals = this.f3164a.equals(((AudioAttributesImplApi21) obj).f3164a);
            return equals;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        hashCode = this.f3164a.hashCode();
        return hashCode;
    }

    public String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f3164a;
    }
}
