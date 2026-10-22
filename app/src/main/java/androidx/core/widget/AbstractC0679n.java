package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;

/* renamed from: androidx.core.widget.n */
/* loaded from: classes.dex */
public abstract class AbstractC0679n {
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static ColorStateList m2973a(ImageView imageView) {
        ColorStateList imageTintList;
        if (Build.VERSION.SDK_INT >= 21) {
            imageTintList = imageView.getImageTintList();
            return imageTintList;
        }
        if (imageView instanceof InterfaceC0673h0) {
            return ((InterfaceC0673h0) imageView).getSupportImageTintList();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public static PorterDuff.Mode m2974b(ImageView imageView) {
        PorterDuff.Mode imageTintMode;
        if (Build.VERSION.SDK_INT >= 21) {
            imageTintMode = imageView.getImageTintMode();
            return imageTintMode;
        }
        if (imageView instanceof InterfaceC0673h0) {
            return ((InterfaceC0673h0) imageView).getSupportImageTintMode();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public static void m2975c(ImageView imageView, ColorStateList colorStateList) {
        Drawable drawable;
        ColorStateList imageTintList;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 21) {
            imageView.setImageTintList(colorStateList);
            if (i10 == 21 && (drawable = imageView.getDrawable()) != null) {
                imageTintList = imageView.getImageTintList();
                if (imageTintList != null) {
                    if (drawable.isStateful()) {
                        drawable.setState(imageView.getDrawableState());
                    }
                    imageView.setImageDrawable(drawable);
                    return;
                }
                return;
            }
            return;
        }
        if (imageView instanceof InterfaceC0673h0) {
            ((InterfaceC0673h0) imageView).setSupportImageTintList(colorStateList);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    public static void m2976d(ImageView imageView, PorterDuff.Mode mode) {
        Drawable drawable;
        ColorStateList imageTintList;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 21) {
            imageView.setImageTintMode(mode);
            if (i10 == 21 && (drawable = imageView.getDrawable()) != null) {
                imageTintList = imageView.getImageTintList();
                if (imageTintList != null) {
                    if (drawable.isStateful()) {
                        drawable.setState(imageView.getDrawableState());
                    }
                    imageView.setImageDrawable(drawable);
                    return;
                }
                return;
            }
            return;
        }
        if (imageView instanceof InterfaceC0673h0) {
            ((InterfaceC0673h0) imageView).setSupportImageTintMode(mode);
        }
    }
}
