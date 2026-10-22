package androidx.media;

import androidx.versionedparcelable.AbstractC0855a;

/* loaded from: classes.dex */
public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(AbstractC0855a abstractC0855a) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.f3163a = (AudioAttributesImpl) abstractC0855a.m4431v(audioAttributesCompat.f3163a, 1);
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, AbstractC0855a abstractC0855a) {
        abstractC0855a.m4433x(false, false);
        abstractC0855a.m4412M(audioAttributesCompat.f3163a, 1);
    }
}
