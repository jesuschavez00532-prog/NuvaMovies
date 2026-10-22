package androidx.activity;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.AbstractC0749c;
import androidx.lifecycle.InterfaceC0750d;
import androidx.lifecycle.InterfaceC0752f;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
final class ImmLeaksCleaner implements InterfaceC0750d {

    /* renamed from: b */
    private static int f836b;

    /* renamed from: c */
    private static Field f837c;

    /* renamed from: d */
    private static Field f838d;

    /* renamed from: e */
    private static Field f839e;

    /* renamed from: a */
    private Activity f840a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ImmLeaksCleaner(Activity activity) {
        this.f840a = activity;
    }

    /* renamed from: a */
    private static void m956a() {
        try {
            f836b = 2;
            Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
            f838d = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
            f839e = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
            f837c = declaredField3;
            declaredField3.setAccessible(true);
            f836b = 1;
        } catch (NoSuchFieldException unused) {
        }
    }

    @Override // androidx.lifecycle.InterfaceC0750d
    public void onStateChanged(InterfaceC0752f interfaceC0752f, AbstractC0749c.b bVar) {
        if (bVar != AbstractC0749c.b.ON_DESTROY) {
            return;
        }
        if (f836b == 0) {
            m956a();
        }
        if (f836b == 1) {
            InputMethodManager inputMethodManager = (InputMethodManager) this.f840a.getSystemService("input_method");
            try {
                Object obj = f837c.get(inputMethodManager);
                if (obj == null) {
                    return;
                }
                synchronized (obj) {
                    try {
                        try {
                            View view = (View) f838d.get(inputMethodManager);
                            if (view == null) {
                                return;
                            }
                            if (view.isAttachedToWindow()) {
                                return;
                            }
                            try {
                                f839e.set(inputMethodManager, null);
                                inputMethodManager.isActive();
                            } catch (IllegalAccessException unused) {
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    } catch (ClassCastException unused2) {
                    } catch (IllegalAccessException unused3) {
                    }
                }
            } catch (IllegalAccessException unused4) {
            }
        }
    }
}
