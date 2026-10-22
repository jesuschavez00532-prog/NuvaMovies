package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.core.view.AbstractC0616q0;
import androidx.core.view.C0609o1;
import androidx.fragment.R$styleable;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.i */
/* loaded from: classes.dex */
public final class C0720i extends FrameLayout {

    /* renamed from: a */
    private ArrayList f2843a;

    /* renamed from: b */
    private ArrayList f2844b;

    /* renamed from: c */
    private View.OnApplyWindowInsetsListener f2845c;

    /* renamed from: d */
    private boolean f2846d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0720i(Context context, AttributeSet attributeSet, AbstractC0729o abstractC0729o) {
        super(context, attributeSet);
        String str;
        this.f2846d = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.f2613e);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(R$styleable.FragmentContainerView_android_name) : classAttribute;
        String string = obtainStyledAttributes.getString(R$styleable.FragmentContainerView_android_tag);
        obtainStyledAttributes.recycle();
        int id2 = getId();
        Fragment m3521g0 = abstractC0729o.m3521g0(id2);
        if (classAttribute != null && m3521g0 == null) {
            if (id2 <= 0) {
                if (string != null) {
                    str = " with tag " + string;
                } else {
                    str = "";
                }
                throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + classAttribute + str);
            }
            Fragment mo3410a = abstractC0729o.m3541q0().mo3410a(context.getClassLoader(), classAttribute);
            mo3410a.m3137X7(context, attributeSet, null);
            abstractC0729o.m3534m().m3646t(true).m3639c(this, mo3410a, string).mo3230j();
        }
        abstractC0729o.m3502T0(this);
    }

    /* renamed from: a */
    private void m3349a(View view) {
        ArrayList arrayList = this.f2844b;
        if (arrayList != null && arrayList.contains(view)) {
            if (this.f2843a == null) {
                this.f2843a = new ArrayList();
            }
            this.f2843a.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (AbstractC0729o.m3467z0(view) != null) {
            super.addView(view, i10, layoutParams);
            return;
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    @Override // android.view.ViewGroup
    protected boolean addViewInLayout(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z10) {
        if (AbstractC0729o.m3467z0(view) != null) {
            return super.addViewInLayout(view, i10, layoutParams, z10);
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    @Override // android.view.ViewGroup, android.view.View
    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        C0609o1 m2608Z;
        WindowInsets onApplyWindowInsets;
        C0609o1 m2509u = C0609o1.m2509u(windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f2845c;
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            m2608Z = C0609o1.m2509u(onApplyWindowInsets);
        } else {
            m2608Z = AbstractC0616q0.m2608Z(this, m2509u);
        }
        if (!m2608Z.m2523n()) {
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                AbstractC0616q0.m2623h(getChildAt(i10), m2608Z);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        if (this.f2846d && this.f2843a != null) {
            for (int i10 = 0; i10 < this.f2843a.size(); i10++) {
                super.drawChild(canvas, (View) this.f2843a.get(i10), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j10) {
        ArrayList arrayList;
        if (this.f2846d && (arrayList = this.f2843a) != null && arrayList.size() > 0 && this.f2843a.contains(view)) {
            return false;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(View view) {
        ArrayList arrayList = this.f2844b;
        if (arrayList != null) {
            arrayList.remove(view);
            ArrayList arrayList2 = this.f2843a;
            if (arrayList2 != null && arrayList2.remove(view)) {
                this.f2846d = true;
            }
        }
        super.endViewTransition(view);
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            m3349a(getChildAt(childCount));
        }
        super.removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup
    protected void removeDetachedView(View view, boolean z10) {
        if (z10) {
            m3349a(view);
        }
        super.removeDetachedView(view, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        m3349a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i10) {
        m3349a(getChildAt(i10));
        super.removeViewAt(i10);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(View view) {
        m3349a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public void removeViews(int i10, int i11) {
        for (int i12 = i10; i12 < i10 + i11; i12++) {
            m3349a(getChildAt(i12));
        }
        super.removeViews(i10, i11);
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int i10, int i11) {
        for (int i12 = i10; i12 < i10 + i11; i12++) {
            m3349a(getChildAt(i12));
        }
        super.removeViewsInLayout(i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setDrawDisappearingViewsLast(boolean z10) {
        this.f2846d = z10;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.f2845c = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(View view) {
        if (view.getParent() == this) {
            if (this.f2844b == null) {
                this.f2844b = new ArrayList();
            }
            this.f2844b.add(view);
        }
        super.startViewTransition(view);
    }
}
