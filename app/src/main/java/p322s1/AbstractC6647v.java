package p322s1;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.util.concurrent.locks.Lock;
import p216l1.InterfaceC5335v;
import p230m1.C5572e;
import p230m1.InterfaceC5571d;

/* renamed from: s1.v */
/* loaded from: classes.dex */
abstract class AbstractC6647v {

    /* renamed from: a */
    private static final InterfaceC5571d f25495a = new a();

    /* renamed from: s1.v$a */
    /* loaded from: classes.dex */
    class a extends C5572e {
        a() {
        }

        @Override // p230m1.C5572e, p230m1.InterfaceC5571d
        /* renamed from: c */
        public void mo22617c(Bitmap bitmap) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static InterfaceC5335v m25959a(InterfaceC5571d interfaceC5571d, Drawable drawable, int i10, int i11) {
        Bitmap bitmap;
        Drawable current = drawable.getCurrent();
        boolean z10 = false;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (!(current instanceof Animatable)) {
            bitmap = m25960b(interfaceC5571d, current, i10, i11);
            z10 = true;
        } else {
            bitmap = null;
        }
        if (!z10) {
            interfaceC5571d = f25495a;
        }
        return C6624g.m25851e(bitmap, interfaceC5571d);
    }

    /* renamed from: b */
    private static Bitmap m25960b(InterfaceC5571d interfaceC5571d, Drawable drawable, int i10, int i11) {
        if (i10 == Integer.MIN_VALUE && drawable.getIntrinsicWidth() <= 0) {
            if (Log.isLoggable("DrawableToBitmap", 5)) {
                Log.w("DrawableToBitmap", "Unable to draw " + drawable + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width");
            }
            return null;
        }
        if (i11 == Integer.MIN_VALUE && drawable.getIntrinsicHeight() <= 0) {
            if (Log.isLoggable("DrawableToBitmap", 5)) {
                Log.w("DrawableToBitmap", "Unable to draw " + drawable + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height");
            }
            return null;
        }
        if (drawable.getIntrinsicWidth() > 0) {
            i10 = drawable.getIntrinsicWidth();
        }
        if (drawable.getIntrinsicHeight() > 0) {
            i11 = drawable.getIntrinsicHeight();
        }
        Lock m25867h = AbstractC6629i0.m25867h();
        m25867h.lock();
        Bitmap mo22618d = interfaceC5571d.mo22618d(i10, i11, Bitmap.Config.ARGB_8888);
        try {
            Canvas canvas = new Canvas(mo22618d);
            drawable.setBounds(0, 0, i10, i11);
            drawable.draw(canvas);
            canvas.setBitmap(null);
            return mo22618d;
        } finally {
            m25867h.unlock();
        }
    }
}
