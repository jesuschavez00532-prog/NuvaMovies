package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.widget.n2 */
/* loaded from: classes.dex */
public class C0426n2 extends ContextWrapper {

    /* renamed from: c */
    private static final Object f1834c = new Object();

    /* renamed from: d */
    private static ArrayList f1835d;

    /* renamed from: a */
    private final Resources f1836a;

    /* renamed from: b */
    private final Resources.Theme f1837b;

    private C0426n2(Context context) {
        super(context);
        if (C0462w2.m2022b()) {
            C0462w2 c0462w2 = new C0462w2(this, context.getResources());
            this.f1836a = c0462w2;
            Resources.Theme newTheme = c0462w2.newTheme();
            this.f1837b = newTheme;
            newTheme.setTo(context.getTheme());
            return;
        }
        this.f1836a = new C0434p2(this, context.getResources());
        this.f1837b = null;
    }

    /* renamed from: a */
    private static boolean m1841a(Context context) {
        if ((context instanceof C0426n2) || (context.getResources() instanceof C0434p2) || (context.getResources() instanceof C0462w2)) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 21 && !C0462w2.m2022b()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static Context m1842b(Context context) {
        C0426n2 c0426n2;
        if (m1841a(context)) {
            synchronized (f1834c) {
                ArrayList arrayList = f1835d;
                if (arrayList == null) {
                    f1835d = new ArrayList();
                } else {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        WeakReference weakReference = (WeakReference) f1835d.get(size);
                        if (weakReference == null || weakReference.get() == null) {
                            f1835d.remove(size);
                        }
                    }
                    for (int size2 = f1835d.size() - 1; size2 >= 0; size2--) {
                        WeakReference weakReference2 = (WeakReference) f1835d.get(size2);
                        if (weakReference2 != null) {
                            c0426n2 = (C0426n2) weakReference2.get();
                        } else {
                            c0426n2 = null;
                        }
                        if (c0426n2 != null && c0426n2.getBaseContext() == context) {
                            return c0426n2;
                        }
                    }
                }
                C0426n2 c0426n22 = new C0426n2(context);
                f1835d.add(new WeakReference(c0426n22));
                return c0426n22;
            }
        }
        return context;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.f1836a.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.f1836a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f1837b;
        if (theme == null) {
            return super.getTheme();
        }
        return theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        Resources.Theme theme = this.f1837b;
        if (theme == null) {
            super.setTheme(i10);
        } else {
            theme.applyStyle(i10, true);
        }
    }
}
