package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.ref.WeakReference;

/* renamed from: androidx.appcompat.widget.w2 */
/* loaded from: classes.dex */
public class C0462w2 extends Resources {

    /* renamed from: b */
    private static boolean f2013b;

    /* renamed from: a */
    private final WeakReference f2014a;

    public C0462w2(Context context, Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f2014a = new WeakReference(context);
    }

    /* renamed from: a */
    public static boolean m2021a() {
        return f2013b;
    }

    /* renamed from: b */
    public static boolean m2022b() {
        if (m2021a() && Build.VERSION.SDK_INT <= 20) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final Drawable m2023c(int i10) {
        return super.getDrawable(i10);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i10) {
        Context context = (Context) this.f2014a.get();
        if (context != null) {
            return C0382c2.m1640h().m1654t(context, this, i10);
        }
        return super.getDrawable(i10);
    }
}
