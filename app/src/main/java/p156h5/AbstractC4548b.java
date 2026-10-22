package p156h5;

import android.graphics.Canvas;
import android.os.Build;

/* renamed from: h5.b */
/* loaded from: classes.dex */
public abstract class AbstractC4548b {
    /* renamed from: a */
    public static int m18945a(Canvas canvas, float f10, float f11, float f12, float f13, int i10) {
        int saveLayerAlpha;
        if (Build.VERSION.SDK_INT > 21) {
            saveLayerAlpha = canvas.saveLayerAlpha(f10, f11, f12, f13, i10);
            return saveLayerAlpha;
        }
        return canvas.saveLayerAlpha(f10, f11, f12, f13, i10, 31);
    }
}
