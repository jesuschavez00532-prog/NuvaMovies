package androidx.appcompat.widget;

import android.R;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import p290q.InterfaceC6321z;

/* renamed from: androidx.appcompat.widget.u */
/* loaded from: classes.dex */
class C0451u {

    /* renamed from: c */
    private static final int[] f1923c = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* renamed from: a */
    private final ProgressBar f1924a;

    /* renamed from: b */
    private Bitmap f1925b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0451u(ProgressBar progressBar) {
        this.f1924a = progressBar;
    }

    /* renamed from: a */
    private Shape m1941a() {
        return new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    private Drawable m1942d(Drawable drawable, boolean z10) {
        boolean z11;
        if (drawable instanceof InterfaceC6321z) {
            InterfaceC6321z interfaceC6321z = (InterfaceC6321z) drawable;
            Drawable mo25041b = interfaceC6321z.mo25041b();
            if (mo25041b != null) {
                interfaceC6321z.mo25040a(m1942d(mo25041b, z10));
            }
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i10 = 0; i10 < numberOfLayers; i10++) {
                    int id2 = layerDrawable.getId(i10);
                    Drawable drawable2 = layerDrawable.getDrawable(i10);
                    if (id2 != 16908301 && id2 != 16908303) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    drawableArr[i10] = m1942d(drawable2, z11);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i11 = 0; i11 < numberOfLayers; i11++) {
                    layerDrawable2.setId(i11, layerDrawable.getId(i11));
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (this.f1925b == null) {
                    this.f1925b = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(m1941a());
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                if (z10) {
                    return new ClipDrawable(shapeDrawable, 3, 1);
                }
                return shapeDrawable;
            }
        }
        return drawable;
    }

    /* renamed from: e */
    private Drawable m1943e(Drawable drawable) {
        if (drawable instanceof AnimationDrawable) {
            AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            AnimationDrawable animationDrawable2 = new AnimationDrawable();
            animationDrawable2.setOneShot(animationDrawable.isOneShot());
            for (int i10 = 0; i10 < numberOfFrames; i10++) {
                Drawable m1942d = m1942d(animationDrawable.getFrame(i10), true);
                m1942d.setLevel(10000);
                animationDrawable2.addFrame(m1942d, animationDrawable.getDuration(i10));
            }
            animationDrawable2.setLevel(10000);
            return animationDrawable2;
        }
        return drawable;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public Bitmap m1944b() {
        return this.f1925b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo1596c(AttributeSet attributeSet, int i10) {
        C0438q2 m1874v = C0438q2.m1874v(this.f1924a.getContext(), attributeSet, f1923c, i10, 0);
        Drawable m1882h = m1874v.m1882h(0);
        if (m1882h != null) {
            this.f1924a.setIndeterminateDrawable(m1943e(m1882h));
        }
        Drawable m1882h2 = m1874v.m1882h(1);
        if (m1882h2 != null) {
            this.f1924a.setProgressDrawable(m1942d(m1882h2, false));
        }
        m1874v.m1894w();
    }
}
