package androidx.media;

import androidx.versionedparcelable.AbstractC0855a;
import p122f0.AbstractC4208c;

/* loaded from: classes.dex */
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(AbstractC0855a abstractC0855a) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f3164a = AbstractC4208c.m17582a(abstractC0855a.m4427r(audioAttributesImplApi21.f3164a, 1));
        audioAttributesImplApi21.f3165b = abstractC0855a.m4425p(audioAttributesImplApi21.f3165b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, AbstractC0855a abstractC0855a) {
        abstractC0855a.m4433x(false, false);
        abstractC0855a.m4407H(audioAttributesImplApi21.f3164a, 1);
        abstractC0855a.m4405F(audioAttributesImplApi21.f3165b, 2);
    }
}
