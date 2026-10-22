package p230m1;

import android.graphics.Bitmap;

/* renamed from: m1.e */
/* loaded from: classes.dex */
public class C5572e implements InterfaceC5571d {
    @Override // p230m1.InterfaceC5571d
    /* renamed from: a */
    public void mo22615a(int i10) {
    }

    @Override // p230m1.InterfaceC5571d
    /* renamed from: b */
    public void mo22616b() {
    }

    @Override // p230m1.InterfaceC5571d
    /* renamed from: c */
    public void mo22617c(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // p230m1.InterfaceC5571d
    /* renamed from: d */
    public Bitmap mo22618d(int i10, int i11, Bitmap.Config config) {
        return Bitmap.createBitmap(i10, i11, config);
    }

    @Override // p230m1.InterfaceC5571d
    /* renamed from: e */
    public Bitmap mo22619e(int i10, int i11, Bitmap.Config config) {
        return mo22618d(i10, i11, config);
    }
}
