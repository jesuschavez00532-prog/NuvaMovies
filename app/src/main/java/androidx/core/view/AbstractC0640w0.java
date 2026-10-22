package androidx.core.view;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import anet.channel.strategy.dispatch.DispatchConstants;
import java.lang.reflect.Method;

/* renamed from: androidx.core.view.w0 */
/* loaded from: classes.dex */
public abstract class AbstractC0640w0 {

    /* renamed from: a */
    private static Method f2422a;

    static {
        if (Build.VERSION.SDK_INT == 25) {
            try {
                f2422a = ViewConfiguration.class.getDeclaredMethod("getScaledScrollFactor", new Class[0]);
            } catch (Exception unused) {
                Log.i("ViewConfigCompat", "Could not find method getScaledScrollFactor() on ViewConfiguration");
            }
        }
    }

    /* renamed from: a */
    private static float m2827a(ViewConfiguration viewConfiguration, Context context) {
        Method method;
        if (Build.VERSION.SDK_INT >= 25 && (method = f2422a) != null) {
            try {
                return ((Integer) method.invoke(viewConfiguration, new Object[0])).intValue();
            } catch (Exception unused) {
                Log.i("ViewConfigCompat", "Could not find method getScaledScrollFactor() on ViewConfiguration");
            }
        }
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
            return typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return 0.0f;
    }

    /* renamed from: b */
    public static float m2828b(ViewConfiguration viewConfiguration, Context context) {
        float scaledHorizontalScrollFactor;
        if (Build.VERSION.SDK_INT >= 26) {
            scaledHorizontalScrollFactor = viewConfiguration.getScaledHorizontalScrollFactor();
            return scaledHorizontalScrollFactor;
        }
        return m2827a(viewConfiguration, context);
    }

    /* renamed from: c */
    public static int m2829c(ViewConfiguration viewConfiguration) {
        int scaledHoverSlop;
        if (Build.VERSION.SDK_INT >= 28) {
            scaledHoverSlop = viewConfiguration.getScaledHoverSlop();
            return scaledHoverSlop;
        }
        return viewConfiguration.getScaledTouchSlop() / 2;
    }

    /* renamed from: d */
    public static float m2830d(ViewConfiguration viewConfiguration, Context context) {
        float scaledVerticalScrollFactor;
        if (Build.VERSION.SDK_INT >= 26) {
            scaledVerticalScrollFactor = viewConfiguration.getScaledVerticalScrollFactor();
            return scaledVerticalScrollFactor;
        }
        return m2827a(viewConfiguration, context);
    }

    /* renamed from: e */
    public static boolean m2831e(ViewConfiguration viewConfiguration, Context context) {
        boolean shouldShowMenuShortcutsWhenKeyboardPresent;
        if (Build.VERSION.SDK_INT >= 28) {
            shouldShowMenuShortcutsWhenKeyboardPresent = viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
            return shouldShowMenuShortcutsWhenKeyboardPresent;
        }
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", DispatchConstants.ANDROID);
        if (identifier != 0 && resources.getBoolean(identifier)) {
            return true;
        }
        return false;
    }
}
