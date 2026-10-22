package androidx.core.view;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.core.view.s */
/* loaded from: classes.dex */
public abstract class AbstractC0623s {

    /* renamed from: a */
    private static boolean f2416a;

    /* renamed from: b */
    private static Method f2417b;

    /* renamed from: c */
    private static boolean f2418c;

    /* renamed from: d */
    private static Field f2419d;

    /* renamed from: androidx.core.view.s$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: I2 */
        boolean mo1195I2(KeyEvent keyEvent);
    }

    /* renamed from: a */
    private static boolean m2803a(ActionBar actionBar, KeyEvent keyEvent) {
        if (!f2416a) {
            try {
                f2417b = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
            } catch (NoSuchMethodException unused) {
            }
            f2416a = true;
        }
        Method method = f2417b;
        if (method != null) {
            try {
                return ((Boolean) method.invoke(actionBar, keyEvent)).booleanValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return false;
    }

    /* renamed from: b */
    private static boolean m2804b(Activity activity, KeyEvent keyEvent) {
        KeyEvent.DispatcherState dispatcherState;
        activity.onUserInteraction();
        Window window = activity.getWindow();
        if (window.hasFeature(8)) {
            ActionBar actionBar = activity.getActionBar();
            if (keyEvent.getKeyCode() == 82 && actionBar != null && m2803a(actionBar, keyEvent)) {
                return true;
            }
        }
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (AbstractC0616q0.m2625i(decorView, keyEvent)) {
            return true;
        }
        if (decorView != null) {
            dispatcherState = decorView.getKeyDispatcherState();
        } else {
            dispatcherState = null;
        }
        return keyEvent.dispatch(activity, dispatcherState, activity);
    }

    /* renamed from: c */
    private static boolean m2805c(Dialog dialog, KeyEvent keyEvent) {
        KeyEvent.DispatcherState dispatcherState;
        DialogInterface.OnKeyListener m2808f = m2808f(dialog);
        if (m2808f != null && m2808f.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
            return true;
        }
        Window window = dialog.getWindow();
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (AbstractC0616q0.m2625i(decorView, keyEvent)) {
            return true;
        }
        if (decorView != null) {
            dispatcherState = decorView.getKeyDispatcherState();
        } else {
            dispatcherState = null;
        }
        return keyEvent.dispatch(dialog, dispatcherState, dialog);
    }

    /* renamed from: d */
    public static boolean m2806d(View view, KeyEvent keyEvent) {
        return AbstractC0616q0.m2627j(view, keyEvent);
    }

    /* renamed from: e */
    public static boolean m2807e(a aVar, View view, Window.Callback callback, KeyEvent keyEvent) {
        if (aVar == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return aVar.mo1195I2(keyEvent);
        }
        if (callback instanceof Activity) {
            return m2804b((Activity) callback, keyEvent);
        }
        if (callback instanceof Dialog) {
            return m2805c((Dialog) callback, keyEvent);
        }
        if ((view == null || !AbstractC0616q0.m2625i(view, keyEvent)) && !aVar.mo1195I2(keyEvent)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    private static DialogInterface.OnKeyListener m2808f(Dialog dialog) {
        if (!f2418c) {
            try {
                Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                f2419d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f2418c = true;
        }
        Field field = f2419d;
        if (field != null) {
            try {
                return (DialogInterface.OnKeyListener) field.get(dialog);
            } catch (IllegalAccessException unused2) {
                return null;
            }
        }
        return null;
    }
}
