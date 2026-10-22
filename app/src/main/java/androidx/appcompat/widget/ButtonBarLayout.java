package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.R$id;
import androidx.appcompat.R$styleable;
import androidx.core.view.AbstractC0616q0;

/* loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* renamed from: a */
    private boolean f1508a;

    /* renamed from: b */
    private int f1509b;

    /* renamed from: c */
    private int f1510c;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1509b = -1;
        this.f1510c = 0;
        int[] iArr = R$styleable.f919p;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        AbstractC0616q0.m2632l0(this, context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        this.f1508a = obtainStyledAttributes.getBoolean(R$styleable.ButtonBarLayout_allowStacking, true);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private int m1489a(int i10) {
        int childCount = getChildCount();
        while (i10 < childCount) {
            if (getChildAt(i10).getVisibility() == 0) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    /* renamed from: b */
    private boolean m1490b() {
        if (getOrientation() == 1) {
            return true;
        }
        return false;
    }

    private void setStacked(boolean z10) {
        int i10;
        int i11;
        setOrientation(z10 ? 1 : 0);
        if (z10) {
            i10 = 8388613;
        } else {
            i10 = 80;
        }
        setGravity(i10);
        View findViewById = findViewById(R$id.spacer);
        if (findViewById != null) {
            if (z10) {
                i11 = 8;
            } else {
                i11 = 4;
            }
            findViewById.setVisibility(i11);
        }
        for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
            bringChildToFront(getChildAt(childCount));
        }
    }

    @Override // android.view.View
    public int getMinimumHeight() {
        return Math.max(this.f1510c, super.getMinimumHeight());
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        int i12;
        boolean z10;
        boolean z11;
        int size = View.MeasureSpec.getSize(i10);
        int i13 = 0;
        if (this.f1508a) {
            if (size > this.f1509b && m1490b()) {
                setStacked(false);
            }
            this.f1509b = size;
        }
        if (!m1490b() && View.MeasureSpec.getMode(i10) == 1073741824) {
            i12 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z10 = true;
        } else {
            i12 = i10;
            z10 = false;
        }
        super.onMeasure(i12, i11);
        if (this.f1508a && !m1490b()) {
            if ((getMeasuredWidthAndState() & (-16777216)) == 16777216) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                setStacked(true);
                z10 = true;
            }
        }
        if (z10) {
            super.onMeasure(i10, i11);
        }
        int m1489a = m1489a(0);
        if (m1489a >= 0) {
            View childAt = getChildAt(m1489a);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int paddingTop = getPaddingTop() + childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin + 0;
            if (m1490b()) {
                int m1489a2 = m1489a(m1489a + 1);
                if (m1489a2 >= 0) {
                    paddingTop += getChildAt(m1489a2).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
                i13 = paddingTop;
            } else {
                i13 = paddingTop + getPaddingBottom();
            }
        }
        if (AbstractC0616q0.m2581C(this) != i13) {
            setMinimumHeight(i13);
        }
    }

    public void setAllowStacking(boolean z10) {
        if (this.f1508a != z10) {
            this.f1508a = z10;
            if (!z10 && getOrientation() == 1) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
