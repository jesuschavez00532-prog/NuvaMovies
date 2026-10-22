package androidx.media;

import androidx.versionedparcelable.AbstractC0855a;

/* loaded from: classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(AbstractC0855a abstractC0855a) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f3166a = abstractC0855a.m4425p(audioAttributesImplBase.f3166a, 1);
        audioAttributesImplBase.f3167b = abstractC0855a.m4425p(audioAttributesImplBase.f3167b, 2);
        audioAttributesImplBase.f3168c = abstractC0855a.m4425p(audioAttributesImplBase.f3168c, 3);
        audioAttributesImplBase.f3169d = abstractC0855a.m4425p(audioAttributesImplBase.f3169d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, AbstractC0855a abstractC0855a) {
        abstractC0855a.m4433x(false, false);
        abstractC0855a.m4405F(audioAttributesImplBase.f3166a, 1);
        abstractC0855a.m4405F(audioAttributesImplBase.f3167b, 2);
        abstractC0855a.m4405F(audioAttributesImplBase.f3168c, 3);
        abstractC0855a.m4405F(audioAttributesImplBase.f3169d, 4);
    }
}
