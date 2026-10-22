package p347u1;

import android.graphics.drawable.Drawable;
import p216l1.InterfaceC5335v;

/* renamed from: u1.k */
/* loaded from: classes.dex */
final class C7021k extends AbstractC7020j {
    private C7021k(Drawable drawable) {
        super(drawable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static InterfaceC5335v m27099e(Drawable drawable) {
        if (drawable != null) {
            return new C7021k(drawable);
        }
        return null;
    }

    @Override // p216l1.InterfaceC5335v
    /* renamed from: b */
    public void mo21576b() {
    }

    @Override // p216l1.InterfaceC5335v
    /* renamed from: c */
    public Class mo21577c() {
        return this.f26395a.getClass();
    }

    @Override // p216l1.InterfaceC5335v
    public int getSize() {
        return Math.max(1, this.f26395a.getIntrinsicWidth() * this.f26395a.getIntrinsicHeight() * 4);
    }
}
