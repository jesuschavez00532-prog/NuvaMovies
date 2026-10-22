package p322s1;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import p184j1.C4977h;
import p184j1.InterfaceC4979j;
import p216l1.InterfaceC5335v;
import p230m1.C5572e;
import p230m1.InterfaceC5571d;
import p307r1.C6508n;

/* renamed from: s1.f */
/* loaded from: classes.dex */
public final class C6622f implements InterfaceC4979j {

    /* renamed from: a */
    private final InterfaceC5571d f25431a = new C5572e();

    @Override // p184j1.InterfaceC4979j
    /* renamed from: a */
    public /* bridge */ /* synthetic */ InterfaceC5335v mo20329a(Object obj, int i10, int i11, C4977h c4977h) {
        return m25847c(AbstractC6618d.m25838a(obj), i10, i11, c4977h);
    }

    @Override // p184j1.InterfaceC4979j
    /* renamed from: b */
    public /* bridge */ /* synthetic */ boolean mo20330b(Object obj, C4977h c4977h) {
        return m25848d(AbstractC6618d.m25838a(obj), c4977h);
    }

    /* renamed from: c */
    public InterfaceC5335v m25847c(ImageDecoder.Source source, int i10, int i11, C4977h c4977h) {
        Bitmap decodeBitmap;
        decodeBitmap = ImageDecoder.decodeBitmap(source, new C6508n(i10, i11, c4977h));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            Log.v("BitmapImageDecoder", "Decoded [" + decodeBitmap.getWidth() + "x" + decodeBitmap.getHeight() + "] for [" + i10 + "x" + i11 + "]");
        }
        return new C6624g(decodeBitmap, this.f25431a);
    }

    /* renamed from: d */
    public boolean m25848d(ImageDecoder.Source source, C4977h c4977h) {
        return true;
    }
}
