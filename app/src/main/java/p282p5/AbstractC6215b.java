package p282p5;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;

/* renamed from: p5.b */
/* loaded from: classes.dex */
public abstract class AbstractC6215b {
    /* renamed from: a */
    public static TypedValue m24787a(Context context, int i10) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i10, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    /* renamed from: b */
    public static boolean m24788b(Context context, int i10, boolean z10) {
        TypedValue m24787a = m24787a(context, i10);
        if (m24787a != null && m24787a.type == 18) {
            if (m24787a.data != 0) {
                return true;
            }
            return false;
        }
        return z10;
    }

    /* renamed from: c */
    public static int m24789c(Context context, int i10, String str) {
        TypedValue m24787a = m24787a(context, i10);
        if (m24787a != null) {
            return m24787a.data;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i10)));
    }

    /* renamed from: d */
    public static int m24790d(View view, int i10) {
        return m24789c(view.getContext(), i10, view.getClass().getCanonicalName());
    }
}
