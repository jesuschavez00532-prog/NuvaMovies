package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* renamed from: androidx.appcompat.widget.p2 */
/* loaded from: classes.dex */
class C0434p2 extends AbstractC0398g2 {

    /* renamed from: b */
    private final WeakReference f1860b;

    public C0434p2(Context context, Resources resources) {
        super(resources);
        this.f1860b = new WeakReference(context);
    }

    @Override // androidx.appcompat.widget.AbstractC0398g2, android.content.res.Resources
    public Drawable getDrawable(int i10) {
        Drawable drawable = super.getDrawable(i10);
        Context context = (Context) this.f1860b.get();
        if (drawable != null && context != null) {
            C0382c2.m1640h().m1656x(context, i10, drawable);
        }
        return drawable;
    }
}
