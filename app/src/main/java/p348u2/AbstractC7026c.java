package p348u2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* renamed from: u2.c */
/* loaded from: classes.dex */
public abstract class AbstractC7026c {
    /* renamed from: a */
    public static Drawable m27111a(Context context, int i10) {
        return m27113c(context, i10, false);
    }

    /* renamed from: b */
    public static Drawable m27112b(Context context, int i10, boolean z10) {
        return m27113c(context, i10, z10);
    }

    /* renamed from: c */
    private static Drawable m27113c(Context context, int i10, boolean z10) {
        if (z10) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inPreferredConfig = Bitmap.Config.RGB_565;
            return new BitmapDrawable(context.getResources(), BitmapFactory.decodeResource(context.getResources(), i10, options));
        }
        return context.getResources().getDrawable(i10);
    }
}
