package android.support.v4.media;

import androidx.media.AudioAttributesCompat;
import androidx.versionedparcelable.AbstractC0855a;

/* loaded from: classes.dex */
public final class AudioAttributesCompatParcelizer extends androidx.media.AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(AbstractC0855a abstractC0855a) {
        return androidx.media.AudioAttributesCompatParcelizer.read(abstractC0855a);
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, AbstractC0855a abstractC0855a) {
        androidx.media.AudioAttributesCompatParcelizer.write(audioAttributesCompat, abstractC0855a);
    }
}
