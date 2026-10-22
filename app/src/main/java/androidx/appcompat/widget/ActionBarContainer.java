package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.R$id;
import androidx.appcompat.R$styleable;
import androidx.core.view.AbstractC0616q0;

/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: a */
    private boolean f1429a;

    /* renamed from: b */
    private View f1430b;

    /* renamed from: c */
    private View f1431c;

    /* renamed from: d */
    private View f1432d;

    /* renamed from: e */
    Drawable f1433e;

    /* renamed from: f */
    Drawable f1434f;

    /* renamed from: g */
    Drawable f1435g;

    /* renamed from: h */
    boolean f1436h;

    /* renamed from: i */
    boolean f1437i;

    /* renamed from: j */
    private int f1438j;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC0616q0.m2642q0(this, new C0379c(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.f904a);
        this.f1433e = obtainStyledAttributes.getDrawable(R$styleable.ActionBar_background);
        this.f1434f = obtainStyledAttributes.getDrawable(R$styleable.ActionBar_backgroundStacked);
        this.f1438j = obtainStyledAttributes.getDimensionPixelSize(R$styleable.ActionBar_height, -1);
        boolean z10 = true;
        if (getId() == R$id.split_action_bar) {
            this.f1436h = true;
            this.f1435g = obtainStyledAttributes.getDrawable(R$styleable.ActionBar_backgroundSplit);
        }
        obtainStyledAttributes.recycle();
        if (!this.f1436h ? this.f1433e != null || this.f1434f != null : this.f1435g != null) {
            z10 = false;
        }
        setWillNotDraw(z10);
    }

    /* renamed from: a */
    private int m1429a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    /* renamed from: b */
    private boolean m1430b(View view) {
        if (view != null && view.getVisibility() != 8 && view.getMeasuredHeight() != 0) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f1433e;
        if (drawable != null && drawable.isStateful()) {
            this.f1433e.setState(getDrawableState());
        }
        Drawable drawable2 = this.f1434f;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f1434f.setState(getDrawableState());
        }
        Drawable drawable3 = this.f1435g;
        if (drawable3 != null && drawable3.isStateful()) {
            this.f1435g.setState(getDrawableState());
        }
    }

    public View getTabContainer() {
        return this.f1430b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1433e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1434f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f1435g;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f1431c = findViewById(R$id.action_bar);
        this.f1432d = findViewById(R$id.action_context_bar);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f1429a && !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        Drawable drawable;
        super.onLayout(z10, i10, i11, i12, i13);
        View view = this.f1430b;
        boolean z12 = true;
        boolean z13 = false;
        if (view != null && view.getVisibility() != 8) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (view != null && view.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            int measuredHeight2 = measuredHeight - view.getMeasuredHeight();
            int i14 = layoutParams.bottomMargin;
            view.layout(i10, measuredHeight2 - i14, i12, measuredHeight - i14);
        }
        if (this.f1436h) {
            Drawable drawable2 = this.f1435g;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z12 = false;
            }
        } else {
            if (this.f1433e != null) {
                if (this.f1431c.getVisibility() == 0) {
                    this.f1433e.setBounds(this.f1431c.getLeft(), this.f1431c.getTop(), this.f1431c.getRight(), this.f1431c.getBottom());
                } else {
                    View view2 = this.f1432d;
                    if (view2 != null && view2.getVisibility() == 0) {
                        this.f1433e.setBounds(this.f1432d.getLeft(), this.f1432d.getTop(), this.f1432d.getRight(), this.f1432d.getBottom());
                    } else {
                        this.f1433e.setBounds(0, 0, 0, 0);
                    }
                }
                z13 = true;
            }
            this.f1437i = z11;
            if (z11 && (drawable = this.f1434f) != null) {
                drawable.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            } else {
                z12 = z13;
            }
        }
        if (z12) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        if (this.f1431c == null && View.MeasureSpec.getMode(i11) == Integer.MIN_VALUE && (i14 = this.f1438j) >= 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(Math.min(i14, View.MeasureSpec.getSize(i11)), Integer.MIN_VALUE);
        }
        super.onMeasure(i10, i11);
        if (this.f1431c == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i11);
        View view = this.f1430b;
        if (view != null && view.getVisibility() != 8 && mode != 1073741824) {
            if (!m1430b(this.f1431c)) {
                i12 = m1429a(this.f1431c);
            } else if (!m1430b(this.f1432d)) {
                i12 = m1429a(this.f1432d);
            } else {
                i12 = 0;
            }
            if (mode == Integer.MIN_VALUE) {
                i13 = View.MeasureSpec.getSize(i11);
            } else {
                i13 = Integer.MAX_VALUE;
            }
            setMeasuredDimension(getMeasuredWidth(), Math.min(i12 + m1429a(this.f1430b), i13));
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f1433e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f1433e);
        }
        this.f1433e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f1431c;
            if (view != null) {
                this.f1433e.setBounds(view.getLeft(), this.f1431c.getTop(), this.f1431c.getRight(), this.f1431c.getBottom());
            }
        }
        boolean z10 = true;
        if (!this.f1436h ? this.f1433e != null || this.f1434f != null : this.f1435g != null) {
            z10 = false;
        }
        setWillNotDraw(z10);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f1435g;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f1435g);
        }
        this.f1435g = drawable;
        boolean z10 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1436h && (drawable2 = this.f1435g) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f1436h ? !(this.f1433e != null || this.f1434f != null) : this.f1435g == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f1434f;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f1434f);
        }
        this.f1434f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1437i && (drawable2 = this.f1434f) != null) {
                drawable2.setBounds(this.f1430b.getLeft(), this.f1430b.getTop(), this.f1430b.getRight(), this.f1430b.getBottom());
            }
        }
        boolean z10 = true;
        if (!this.f1436h ? this.f1433e != null || this.f1434f != null : this.f1435g != null) {
            z10 = false;
        }
        setWillNotDraw(z10);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setTabContainer(AbstractC0406i2 abstractC0406i2) {
        View view = this.f1430b;
        if (view != null) {
            removeView(view);
        }
        this.f1430b = abstractC0406i2;
    }

    public void setTransitioning(boolean z10) {
        int i10;
        this.f1429a = z10;
        if (z10) {
            i10 = 393216;
        } else {
            i10 = 262144;
        }
        setDescendantFocusability(i10);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        boolean z10;
        super.setVisibility(i10);
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Drawable drawable = this.f1433e;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
        Drawable drawable2 = this.f1434f;
        if (drawable2 != null) {
            drawable2.setVisible(z10, false);
        }
        Drawable drawable3 = this.f1435g;
        if (drawable3 != null) {
            drawable3.setVisible(z10, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        if ((drawable == this.f1433e && !this.f1436h) || ((drawable == this.f1434f && this.f1437i) || ((drawable == this.f1435g && this.f1436h) || super.verifyDrawable(drawable)))) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i10) {
        if (i10 != 0) {
            return super.startActionModeForChild(view, callback, i10);
        }
        return null;
    }
}
