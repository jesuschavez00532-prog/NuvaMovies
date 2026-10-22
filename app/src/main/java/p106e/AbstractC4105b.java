package p106e;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.appcompat.widget.C0382c2;
import androidx.core.content.AbstractC0547a;
import java.util.WeakHashMap;
import p254o.AbstractC5888c;

/* renamed from: e.b */
/* loaded from: classes.dex */
public abstract class AbstractC4105b {

    /* renamed from: a */
    private static final ThreadLocal f18046a = new ThreadLocal();

    /* renamed from: b */
    private static final WeakHashMap f18047b = new WeakHashMap(0);

    /* renamed from: c */
    private static final Object f18048c = new Object();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e.b$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        final ColorStateList f18049a;

        /* renamed from: b */
        final Configuration f18050b;

        a(ColorStateList colorStateList, Configuration configuration) {
            this.f18049a = colorStateList;
            this.f18050b = configuration;
        }
    }

    /* renamed from: a */
    private static void m17167a(Context context, int i10, ColorStateList colorStateList) {
        synchronized (f18048c) {
            WeakHashMap weakHashMap = f18047b;
            SparseArray sparseArray = (SparseArray) weakHashMap.get(context);
            if (sparseArray == null) {
                sparseArray = new SparseArray();
                weakHashMap.put(context, sparseArray);
            }
            sparseArray.append(i10, new a(colorStateList, context.getResources().getConfiguration()));
        }
    }

    /* renamed from: b */
    private static ColorStateList m17168b(Context context, int i10) {
        a aVar;
        synchronized (f18048c) {
            SparseArray sparseArray = (SparseArray) f18047b.get(context);
            if (sparseArray != null && sparseArray.size() > 0 && (aVar = (a) sparseArray.get(i10)) != null) {
                if (aVar.f18050b.equals(context.getResources().getConfiguration())) {
                    return aVar.f18049a;
                }
                sparseArray.remove(i10);
            }
            return null;
        }
    }

    /* renamed from: c */
    public static ColorStateList m17169c(Context context, int i10) {
        ColorStateList colorStateList;
        if (Build.VERSION.SDK_INT >= 23) {
            colorStateList = context.getColorStateList(i10);
            return colorStateList;
        }
        ColorStateList m17168b = m17168b(context, i10);
        if (m17168b != null) {
            return m17168b;
        }
        ColorStateList m17172f = m17172f(context, i10);
        if (m17172f != null) {
            m17167a(context, i10, m17172f);
            return m17172f;
        }
        return AbstractC0547a.m2323e(context, i10);
    }

    /* renamed from: d */
    public static Drawable m17170d(Context context, int i10) {
        return C0382c2.m1640h().m1649j(context, i10);
    }

    /* renamed from: e */
    private static TypedValue m17171e() {
        ThreadLocal threadLocal = f18046a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            TypedValue typedValue2 = new TypedValue();
            threadLocal.set(typedValue2);
            return typedValue2;
        }
        return typedValue;
    }

    /* renamed from: f */
    private static ColorStateList m17172f(Context context, int i10) {
        if (m17173g(context, i10)) {
            return null;
        }
        Resources resources = context.getResources();
        try {
            return AbstractC5888c.m23746a(resources, resources.getXml(i10), context.getTheme());
        } catch (Exception e10) {
            Log.e("AppCompatResources", "Failed to inflate ColorStateList, leaving it to the framework", e10);
            return null;
        }
    }

    /* renamed from: g */
    private static boolean m17173g(Context context, int i10) {
        Resources resources = context.getResources();
        TypedValue m17171e = m17171e();
        resources.getValue(i10, m17171e, true);
        int i11 = m17171e.type;
        if (i11 >= 28 && i11 <= 31) {
            return true;
        }
        return false;
    }
}
