package p022b2;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: b2.g */
/* loaded from: classes.dex */
public class C1039g {
    /* renamed from: a */
    public AbstractC1043k m4860a(ImageView imageView, Class cls) {
        if (Bitmap.class.equals(cls)) {
            return new C1034b(imageView);
        }
        if (Drawable.class.isAssignableFrom(cls)) {
            return new C1037e(imageView);
        }
        throw new IllegalArgumentException("Unhandled class: " + cls + ", try .as*(Class).transcode(ResourceTranscoder)");
    }
}
