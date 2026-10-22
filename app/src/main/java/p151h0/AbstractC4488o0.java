package p151h0;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: h0.o0 */
/* loaded from: classes.dex */
abstract class AbstractC4488o0 {

    /* renamed from: a */
    private static Method f19422a;

    /* renamed from: b */
    private static boolean f19423b;

    /* renamed from: c */
    private static Field f19424c;

    /* renamed from: d */
    private static boolean f19425d;

    /* renamed from: b */
    private void m18782b() {
        if (!f19423b) {
            try {
                Class cls = Integer.TYPE;
                Method declaredMethod = View.class.getDeclaredMethod("setFrame", cls, cls, cls, cls);
                f19422a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e10) {
                Log.i("ViewUtilsBase", "Failed to retrieve setFrame method", e10);
            }
            f19423b = true;
        }
    }

    /* renamed from: a */
    public abstract void mo18712a(View view);

    /* renamed from: c */
    public abstract float mo18713c(View view);

    /* renamed from: d */
    public abstract void mo18714d(View view);

    /* renamed from: e */
    public void mo18727e(View view, int i10, int i11, int i12, int i13) {
        m18782b();
        Method method = f19422a;
        if (method != null) {
            try {
                method.invoke(view, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e10) {
                throw new RuntimeException(e10.getCause());
            }
        }
    }

    /* renamed from: f */
    public abstract void mo18715f(View view, float f10);

    /* renamed from: g */
    public void mo18732g(View view, int i10) {
        if (!f19425d) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f19424c = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
            }
            f19425d = true;
        }
        Field field = f19424c;
        if (field != null) {
            try {
                f19424c.setInt(view, i10 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    /* renamed from: h */
    public void mo18722h(View view, Matrix matrix) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            mo18722h((View) parent, matrix);
            matrix.preTranslate(-r0.getScrollX(), -r0.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (!matrix2.isIdentity()) {
            matrix.preConcat(matrix2);
        }
    }

    /* renamed from: i */
    public void mo18723i(View view, Matrix matrix) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            mo18723i((View) parent, matrix);
            matrix.postTranslate(r0.getScrollX(), r0.getScrollY());
        }
        matrix.postTranslate(-view.getLeft(), -view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (!matrix2.isIdentity()) {
            Matrix matrix3 = new Matrix();
            if (matrix2.invert(matrix3)) {
                matrix.postConcat(matrix3);
            }
        }
    }
}
