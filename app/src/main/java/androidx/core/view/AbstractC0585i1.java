package androidx.core.view;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: androidx.core.view.i1 */
/* loaded from: classes.dex */
public abstract class AbstractC0585i1 {
    /* renamed from: a */
    public static boolean m2472a(ViewParent viewParent, View view, float f10, float f11, boolean z10) {
        boolean onNestedFling;
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                onNestedFling = viewParent.onNestedFling(view, f10, f11, z10);
                return onNestedFling;
            } catch (AbstractMethodError e10) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedFling", e10);
                return false;
            }
        }
        if (viewParent instanceof InterfaceC0580h0) {
            return ((InterfaceC0580h0) viewParent).onNestedFling(view, f10, f11, z10);
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m2473b(ViewParent viewParent, View view, float f10, float f11) {
        boolean onNestedPreFling;
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                onNestedPreFling = viewParent.onNestedPreFling(view, f10, f11);
                return onNestedPreFling;
            } catch (AbstractMethodError e10) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreFling", e10);
                return false;
            }
        }
        if (viewParent instanceof InterfaceC0580h0) {
            return ((InterfaceC0580h0) viewParent).onNestedPreFling(view, f10, f11);
        }
        return false;
    }

    /* renamed from: c */
    public static void m2474c(ViewParent viewParent, View view, int i10, int i11, int[] iArr, int i12) {
        if (viewParent instanceof InterfaceC0572f0) {
            ((InterfaceC0572f0) viewParent).mo1460o(view, i10, i11, iArr, i12);
            return;
        }
        if (i12 == 0) {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    viewParent.onNestedPreScroll(view, i10, i11, iArr);
                    return;
                } catch (AbstractMethodError e10) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreScroll", e10);
                    return;
                }
            }
            if (viewParent instanceof InterfaceC0580h0) {
                ((InterfaceC0580h0) viewParent).onNestedPreScroll(view, i10, i11, iArr);
            }
        }
    }

    /* renamed from: d */
    public static void m2475d(ViewParent viewParent, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        if (viewParent instanceof InterfaceC0576g0) {
            ((InterfaceC0576g0) viewParent).mo1450e(view, i10, i11, i12, i13, i14, iArr);
            return;
        }
        iArr[0] = iArr[0] + i12;
        iArr[1] = iArr[1] + i13;
        if (viewParent instanceof InterfaceC0572f0) {
            ((InterfaceC0572f0) viewParent).mo1456k(view, i10, i11, i12, i13, i14);
            return;
        }
        if (i14 == 0) {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    viewParent.onNestedScroll(view, i10, i11, i12, i13);
                    return;
                } catch (AbstractMethodError e10) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScroll", e10);
                    return;
                }
            }
            if (viewParent instanceof InterfaceC0580h0) {
                ((InterfaceC0580h0) viewParent).onNestedScroll(view, i10, i11, i12, i13);
            }
        }
    }

    /* renamed from: e */
    public static void m2476e(ViewParent viewParent, View view, View view2, int i10, int i11) {
        if (viewParent instanceof InterfaceC0572f0) {
            ((InterfaceC0572f0) viewParent).mo1458m(view, view2, i10, i11);
            return;
        }
        if (i11 == 0) {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    viewParent.onNestedScrollAccepted(view, view2, i10);
                    return;
                } catch (AbstractMethodError e10) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScrollAccepted", e10);
                    return;
                }
            }
            if (viewParent instanceof InterfaceC0580h0) {
                ((InterfaceC0580h0) viewParent).onNestedScrollAccepted(view, view2, i10);
            }
        }
    }

    /* renamed from: f */
    public static boolean m2477f(ViewParent viewParent, View view, View view2, int i10, int i11) {
        boolean onStartNestedScroll;
        if (viewParent instanceof InterfaceC0572f0) {
            return ((InterfaceC0572f0) viewParent).mo1457l(view, view2, i10, i11);
        }
        if (i11 == 0) {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    onStartNestedScroll = viewParent.onStartNestedScroll(view, view2, i10);
                    return onStartNestedScroll;
                } catch (AbstractMethodError e10) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStartNestedScroll", e10);
                    return false;
                }
            }
            if (viewParent instanceof InterfaceC0580h0) {
                return ((InterfaceC0580h0) viewParent).onStartNestedScroll(view, view2, i10);
            }
            return false;
        }
        return false;
    }

    /* renamed from: g */
    public static void m2478g(ViewParent viewParent, View view, int i10) {
        if (viewParent instanceof InterfaceC0572f0) {
            ((InterfaceC0572f0) viewParent).mo1459n(view, i10);
            return;
        }
        if (i10 == 0) {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    viewParent.onStopNestedScroll(view);
                    return;
                } catch (AbstractMethodError e10) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStopNestedScroll", e10);
                    return;
                }
            }
            if (viewParent instanceof InterfaceC0580h0) {
                ((InterfaceC0580h0) viewParent).onStopNestedScroll(view);
            }
        }
    }

    /* renamed from: h */
    public static boolean m2479h(ViewParent viewParent, View view, AccessibilityEvent accessibilityEvent) {
        return viewParent.requestSendAccessibilityEvent(view, accessibilityEvent);
    }
}
