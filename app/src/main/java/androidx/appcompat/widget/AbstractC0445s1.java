package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import androidx.appcompat.R$styleable;
import androidx.core.view.AbstractC0616q0;

/* renamed from: androidx.appcompat.widget.s1 */
/* loaded from: classes.dex */
public abstract class AbstractC0445s1 extends ViewGroup {

    /* renamed from: a */
    private boolean f1906a;

    /* renamed from: b */
    private int f1907b;

    /* renamed from: c */
    private int f1908c;

    /* renamed from: d */
    private int f1909d;

    /* renamed from: e */
    private int f1910e;

    /* renamed from: f */
    private int f1911f;

    /* renamed from: g */
    private float f1912g;

    /* renamed from: h */
    private boolean f1913h;

    /* renamed from: i */
    private int[] f1914i;

    /* renamed from: j */
    private int[] f1915j;

    /* renamed from: k */
    private Drawable f1916k;

    /* renamed from: l */
    private int f1917l;

    /* renamed from: m */
    private int f1918m;

    /* renamed from: n */
    private int f1919n;

    /* renamed from: o */
    private int f1920o;

    /* renamed from: androidx.appcompat.widget.s1$a */
    /* loaded from: classes.dex */
    public static class a extends LinearLayout.LayoutParams {
        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public a(int i10, int i11) {
            super(i10, i11);
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public AbstractC0445s1(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: A */
    private void m1917A(View view, int i10, int i11, int i12, int i13) {
        view.layout(i10, i11, i12 + i10, i13 + i11);
    }

    /* renamed from: k */
    private void m1918k(int i10, int i11) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i12 = 0; i12 < i10; i12++) {
            View m1927s = m1927s(i12);
            if (m1927s.getVisibility() != 8) {
                a aVar = (a) m1927s.getLayoutParams();
                if (((LinearLayout.LayoutParams) aVar).height == -1) {
                    int i13 = ((LinearLayout.LayoutParams) aVar).width;
                    ((LinearLayout.LayoutParams) aVar).width = m1927s.getMeasuredWidth();
                    measureChildWithMargins(m1927s, i11, 0, makeMeasureSpec, 0);
                    ((LinearLayout.LayoutParams) aVar).width = i13;
                }
            }
        }
    }

    /* renamed from: l */
    private void m1919l(int i10, int i11) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i12 = 0; i12 < i10; i12++) {
            View m1927s = m1927s(i12);
            if (m1927s.getVisibility() != 8) {
                a aVar = (a) m1927s.getLayoutParams();
                if (((LinearLayout.LayoutParams) aVar).width == -1) {
                    int i13 = ((LinearLayout.LayoutParams) aVar).height;
                    ((LinearLayout.LayoutParams) aVar).height = m1927s.getMeasuredHeight();
                    measureChildWithMargins(m1927s, makeMeasureSpec, 0, i11, 0);
                    ((LinearLayout.LayoutParams) aVar).height = i13;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    /* renamed from: g */
    void m1920g(Canvas canvas) {
        int right;
        int left;
        int i10;
        int left2;
        int virtualChildCount = getVirtualChildCount();
        boolean m2027b = AbstractC0466x2.m2027b(this);
        for (int i11 = 0; i11 < virtualChildCount; i11++) {
            View m1927s = m1927s(i11);
            if (m1927s != null && m1927s.getVisibility() != 8 && m1928t(i11)) {
                a aVar = (a) m1927s.getLayoutParams();
                if (m2027b) {
                    left2 = m1927s.getRight() + ((LinearLayout.LayoutParams) aVar).rightMargin;
                } else {
                    left2 = (m1927s.getLeft() - ((LinearLayout.LayoutParams) aVar).leftMargin) - this.f1917l;
                }
                m1923j(canvas, left2);
            }
        }
        if (m1928t(virtualChildCount)) {
            View m1927s2 = m1927s(virtualChildCount - 1);
            if (m1927s2 == null) {
                if (m2027b) {
                    right = getPaddingLeft();
                } else {
                    left = getWidth() - getPaddingRight();
                    i10 = this.f1917l;
                    right = left - i10;
                }
            } else {
                a aVar2 = (a) m1927s2.getLayoutParams();
                if (m2027b) {
                    left = m1927s2.getLeft() - ((LinearLayout.LayoutParams) aVar2).leftMargin;
                    i10 = this.f1917l;
                    right = left - i10;
                } else {
                    right = m1927s2.getRight() + ((LinearLayout.LayoutParams) aVar2).rightMargin;
                }
            }
            m1923j(canvas, right);
        }
    }

    @Override // android.view.View
    public int getBaseline() {
        int i10;
        if (this.f1907b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i11 = this.f1907b;
        if (childCount > i11) {
            View childAt = getChildAt(i11);
            int baseline = childAt.getBaseline();
            if (baseline == -1) {
                if (this.f1907b == 0) {
                    return -1;
                }
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
            int i12 = this.f1908c;
            if (this.f1909d == 1 && (i10 = this.f1910e & 112) != 48) {
                if (i10 != 16) {
                    if (i10 == 80) {
                        i12 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f1911f;
                    }
                } else {
                    i12 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f1911f) / 2;
                }
            }
            return i12 + ((LinearLayout.LayoutParams) ((a) childAt.getLayoutParams())).topMargin + baseline;
        }
        throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
    }

    public int getBaselineAlignedChildIndex() {
        return this.f1907b;
    }

    public Drawable getDividerDrawable() {
        return this.f1916k;
    }

    public int getDividerPadding() {
        return this.f1920o;
    }

    public int getDividerWidth() {
        return this.f1917l;
    }

    public int getGravity() {
        return this.f1910e;
    }

    public int getOrientation() {
        return this.f1909d;
    }

    public int getShowDividers() {
        return this.f1919n;
    }

    int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f1912g;
    }

    /* renamed from: h */
    void m1921h(Canvas canvas) {
        int bottom;
        int virtualChildCount = getVirtualChildCount();
        for (int i10 = 0; i10 < virtualChildCount; i10++) {
            View m1927s = m1927s(i10);
            if (m1927s != null && m1927s.getVisibility() != 8 && m1928t(i10)) {
                m1922i(canvas, (m1927s.getTop() - ((LinearLayout.LayoutParams) ((a) m1927s.getLayoutParams())).topMargin) - this.f1918m);
            }
        }
        if (m1928t(virtualChildCount)) {
            View m1927s2 = m1927s(virtualChildCount - 1);
            if (m1927s2 == null) {
                bottom = (getHeight() - getPaddingBottom()) - this.f1918m;
            } else {
                bottom = m1927s2.getBottom() + ((LinearLayout.LayoutParams) ((a) m1927s2.getLayoutParams())).bottomMargin;
            }
            m1922i(canvas, bottom);
        }
    }

    /* renamed from: i */
    void m1922i(Canvas canvas, int i10) {
        this.f1916k.setBounds(getPaddingLeft() + this.f1920o, i10, (getWidth() - getPaddingRight()) - this.f1920o, this.f1918m + i10);
        this.f1916k.draw(canvas);
    }

    /* renamed from: j */
    void m1923j(Canvas canvas, int i10) {
        this.f1916k.setBounds(i10, getPaddingTop() + this.f1920o, this.f1917l + i10, (getHeight() - getPaddingBottom()) - this.f1920o);
        this.f1916k.draw(canvas);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public a generateDefaultLayoutParams() {
        int i10 = this.f1909d;
        if (i10 == 0) {
            return new a(-2, -2);
        }
        if (i10 == 1) {
            return new a(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.f1916k == null) {
            return;
        }
        if (this.f1909d == 1) {
            m1921h(canvas);
        } else {
            m1920g(canvas);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        if (this.f1909d == 1) {
            m1930v(i10, i11, i12, i13);
        } else {
            m1929u(i10, i11, i12, i13);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        if (this.f1909d == 1) {
            m1934z(i10, i11);
        } else {
            m1932x(i10, i11);
        }
    }

    /* renamed from: p */
    int m1924p(View view, int i10) {
        return 0;
    }

    /* renamed from: q */
    int m1925q(View view) {
        return 0;
    }

    /* renamed from: r */
    int m1926r(View view) {
        return 0;
    }

    /* renamed from: s */
    View m1927s(int i10) {
        return getChildAt(i10);
    }

    public void setBaselineAligned(boolean z10) {
        this.f1906a = z10;
    }

    public void setBaselineAlignedChildIndex(int i10) {
        if (i10 >= 0 && i10 < getChildCount()) {
            this.f1907b = i10;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f1916k) {
            return;
        }
        this.f1916k = drawable;
        boolean z10 = false;
        if (drawable != null) {
            this.f1917l = drawable.getIntrinsicWidth();
            this.f1918m = drawable.getIntrinsicHeight();
        } else {
            this.f1917l = 0;
            this.f1918m = 0;
        }
        if (drawable == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        requestLayout();
    }

    public void setDividerPadding(int i10) {
        this.f1920o = i10;
    }

    public void setGravity(int i10) {
        if (this.f1910e != i10) {
            if ((8388615 & i10) == 0) {
                i10 |= 8388611;
            }
            if ((i10 & 112) == 0) {
                i10 |= 48;
            }
            this.f1910e = i10;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i10) {
        int i11 = i10 & 8388615;
        int i12 = this.f1910e;
        if ((8388615 & i12) != i11) {
            this.f1910e = i11 | ((-8388616) & i12);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z10) {
        this.f1913h = z10;
    }

    public void setOrientation(int i10) {
        if (this.f1909d != i10) {
            this.f1909d = i10;
            requestLayout();
        }
    }

    public void setShowDividers(int i10) {
        if (i10 != this.f1919n) {
            requestLayout();
        }
        this.f1919n = i10;
    }

    public void setVerticalGravity(int i10) {
        int i11 = i10 & 112;
        int i12 = this.f1910e;
        if ((i12 & 112) != i11) {
            this.f1910e = i11 | (i12 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f10) {
        this.f1912g = Math.max(0.0f, f10);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: t */
    public boolean m1928t(int i10) {
        if (i10 == 0) {
            if ((this.f1919n & 1) == 0) {
                return false;
            }
            return true;
        }
        if (i10 == getChildCount()) {
            if ((this.f1919n & 4) == 0) {
                return false;
            }
            return true;
        }
        if ((this.f1919n & 2) == 0) {
            return false;
        }
        for (int i11 = i10 - 1; i11 >= 0; i11--) {
            if (getChildAt(i11).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e3  */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void m1929u(int r25, int r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AbstractC0445s1.m1929u(int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x009f  */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void m1930v(int r18, int r19, int r20, int r21) {
        /*
            r17 = this;
            r6 = r17
            int r7 = r17.getPaddingLeft()
            int r0 = r20 - r18
            int r1 = r17.getPaddingRight()
            int r8 = r0 - r1
            int r0 = r0 - r7
            int r1 = r17.getPaddingRight()
            int r9 = r0 - r1
            int r10 = r17.getVirtualChildCount()
            int r0 = r6.f1910e
            r1 = r0 & 112(0x70, float:1.57E-43)
            r2 = 8388615(0x800007, float:1.1754953E-38)
            r11 = r0 & r2
            r0 = 16
            if (r1 == r0) goto L3b
            r0 = 80
            if (r1 == r0) goto L2f
            int r0 = r17.getPaddingTop()
            goto L47
        L2f:
            int r0 = r17.getPaddingTop()
            int r0 = r0 + r21
            int r0 = r0 - r19
            int r1 = r6.f1911f
            int r0 = r0 - r1
            goto L47
        L3b:
            int r0 = r17.getPaddingTop()
            int r1 = r21 - r19
            int r2 = r6.f1911f
            int r1 = r1 - r2
            int r1 = r1 / 2
            int r0 = r0 + r1
        L47:
            r1 = 0
            r12 = 0
        L49:
            if (r12 >= r10) goto Lc8
            android.view.View r13 = r6.m1927s(r12)
            r14 = 1
            if (r13 != 0) goto L59
            int r1 = r6.m1933y(r12)
            int r0 = r0 + r1
            goto Lc5
        L59:
            int r1 = r13.getVisibility()
            r2 = 8
            if (r1 == r2) goto Lc5
            int r4 = r13.getMeasuredWidth()
            int r15 = r13.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r1 = r13.getLayoutParams()
            r5 = r1
            androidx.appcompat.widget.s1$a r5 = (androidx.appcompat.widget.AbstractC0445s1.a) r5
            int r1 = r5.gravity
            if (r1 >= 0) goto L75
            r1 = r11
        L75:
            int r2 = androidx.core.view.AbstractC0616q0.m2579B(r17)
            int r1 = androidx.core.view.AbstractC0619r.m2800b(r1, r2)
            r1 = r1 & 7
            if (r1 == r14) goto L8d
            r2 = 5
            if (r1 == r2) goto L88
            int r1 = r5.leftMargin
            int r1 = r1 + r7
            goto L98
        L88:
            int r1 = r8 - r4
            int r2 = r5.rightMargin
            goto L97
        L8d:
            int r1 = r9 - r4
            int r1 = r1 / 2
            int r1 = r1 + r7
            int r2 = r5.leftMargin
            int r1 = r1 + r2
            int r2 = r5.rightMargin
        L97:
            int r1 = r1 - r2
        L98:
            r2 = r1
            boolean r1 = r6.m1928t(r12)
            if (r1 == 0) goto La2
            int r1 = r6.f1918m
            int r0 = r0 + r1
        La2:
            int r1 = r5.topMargin
            int r16 = r0 + r1
            int r0 = r6.m1925q(r13)
            int r3 = r16 + r0
            r0 = r17
            r1 = r13
            r14 = r5
            r5 = r15
            r0.m1917A(r1, r2, r3, r4, r5)
            int r0 = r14.bottomMargin
            int r15 = r15 + r0
            int r0 = r6.m1926r(r13)
            int r15 = r15 + r0
            int r16 = r16 + r15
            int r0 = r6.m1924p(r13, r12)
            int r12 = r12 + r0
            r0 = r16
        Lc5:
            r1 = 1
            int r12 = r12 + r1
            goto L49
        Lc8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AbstractC0445s1.m1930v(int, int, int, int):void");
    }

    /* renamed from: w */
    void m1931w(View view, int i10, int i11, int i12, int i13, int i14) {
        measureChildWithMargins(view, i11, i12, i13, i14);
    }

    /* JADX WARN: Removed duplicated region for block: B:195:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01d4  */
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void m1932x(int r38, int r39) {
        /*
            Method dump skipped, instructions count: 1285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AbstractC0445s1.m1932x(int, int):void");
    }

    /* renamed from: y */
    int m1933y(int i10) {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:158:0x0323  */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void m1934z(int r34, int r35) {
        /*
            Method dump skipped, instructions count: 911
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AbstractC0445s1.m1934z(int, int):void");
    }

    public AbstractC0445s1(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1906a = true;
        this.f1907b = -1;
        this.f1908c = 0;
        this.f1910e = 8388659;
        int[] iArr = R$styleable.f929z;
        C0438q2 m1874v = C0438q2.m1874v(context, attributeSet, iArr, i10, 0);
        AbstractC0616q0.m2632l0(this, context, iArr, attributeSet, m1874v.m1892r(), i10, 0);
        int m1885k = m1874v.m1885k(R$styleable.LinearLayoutCompat_android_orientation, -1);
        if (m1885k >= 0) {
            setOrientation(m1885k);
        }
        int m1885k2 = m1874v.m1885k(R$styleable.LinearLayoutCompat_android_gravity, -1);
        if (m1885k2 >= 0) {
            setGravity(m1885k2);
        }
        boolean m1875a = m1874v.m1875a(R$styleable.LinearLayoutCompat_android_baselineAligned, true);
        if (!m1875a) {
            setBaselineAligned(m1875a);
        }
        this.f1912g = m1874v.m1883i(R$styleable.LinearLayoutCompat_android_weightSum, -1.0f);
        this.f1907b = m1874v.m1885k(R$styleable.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
        this.f1913h = m1874v.m1875a(R$styleable.LinearLayoutCompat_measureWithLargestChild, false);
        setDividerDrawable(m1874v.m1881g(R$styleable.LinearLayoutCompat_divider));
        this.f1919n = m1874v.m1885k(R$styleable.LinearLayoutCompat_showDividers, 0);
        this.f1920o = m1874v.m1880f(R$styleable.LinearLayoutCompat_dividerPadding, 0);
        m1874v.m1894w();
    }
}
