package androidx.media;

import androidx.versionedparcelable.AbstractC0855a;
import p122f0.AbstractC4208c;

/* loaded from: classes.dex */
public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(AbstractC0855a abstractC0855a) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.f3164a = AbstractC4208c.m17582a(abstractC0855a.m4427r(audioAttributesImplApi26.f3164a, 1));
        audioAttributesImplApi26.f3165b = abstractC0855a.m4425p(audioAttributesImplApi26.f3165b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, AbstractC0855a abstractC0855a) {
        abstractC0855a.m4433x(false, false);
        abstractC0855a.m4407H(audioAttributesImplApi26.f3164a, 1);
        abstractC0855a.m4405F(audioAttributesImplApi26.f3165b, 2);
    }
}
