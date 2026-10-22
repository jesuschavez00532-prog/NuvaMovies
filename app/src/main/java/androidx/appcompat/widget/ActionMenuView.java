package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.C0325e;
import androidx.appcompat.view.menu.C0327g;
import androidx.appcompat.view.menu.InterfaceC0330j;
import androidx.appcompat.view.menu.InterfaceC0331k;
import androidx.appcompat.widget.AbstractC0445s1;

/* loaded from: classes.dex */
public class ActionMenuView extends AbstractC0445s1 implements C0325e.b, InterfaceC0331k {

    /* renamed from: A */
    InterfaceC0344e f1488A;

    /* renamed from: p */
    private C0325e f1489p;

    /* renamed from: q */
    private Context f1490q;

    /* renamed from: r */
    private int f1491r;

    /* renamed from: s */
    private boolean f1492s;

    /* renamed from: t */
    private C0387e f1493t;

    /* renamed from: u */
    private InterfaceC0330j.a f1494u;

    /* renamed from: v */
    C0325e.a f1495v;

    /* renamed from: w */
    private boolean f1496w;

    /* renamed from: x */
    private int f1497x;

    /* renamed from: y */
    private int f1498y;

    /* renamed from: z */
    private int f1499z;

    /* renamed from: androidx.appcompat.widget.ActionMenuView$a */
    /* loaded from: classes.dex */
    public interface InterfaceC0340a {
        /* renamed from: b */
        boolean mo1261b();

        /* renamed from: c */
        boolean mo1262c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.ActionMenuView$b */
    /* loaded from: classes.dex */
    public static class C0341b implements InterfaceC0330j.a {
        C0341b() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0330j.a
        /* renamed from: a */
        public void mo1162a(C0325e c0325e, boolean z10) {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0330j.a
        /* renamed from: b */
        public boolean mo1163b(C0325e c0325e) {
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$c */
    /* loaded from: classes.dex */
    public static class C0342c extends AbstractC0445s1.a {

        /* renamed from: a */
        public boolean f1500a;

        /* renamed from: b */
        public int f1501b;

        /* renamed from: c */
        public int f1502c;

        /* renamed from: d */
        public boolean f1503d;

        /* renamed from: e */
        public boolean f1504e;

        /* renamed from: f */
        boolean f1505f;

        public C0342c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0342c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0342c(C0342c c0342c) {
            super(c0342c);
            this.f1500a = c0342c.f1500a;
        }

        public C0342c(int i10, int i11) {
            super(i10, i11);
            this.f1500a = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.ActionMenuView$d */
    /* loaded from: classes.dex */
    public class C0343d implements C0325e.a {
        C0343d() {
        }

        @Override // androidx.appcompat.view.menu.C0325e.a
        /* renamed from: a */
        public boolean mo1141a(C0325e c0325e, MenuItem menuItem) {
            InterfaceC0344e interfaceC0344e = ActionMenuView.this.f1488A;
            if (interfaceC0344e != null && interfaceC0344e.onMenuItemClick(menuItem)) {
                return true;
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.C0325e.a
        /* renamed from: b */
        public void mo1143b(C0325e c0325e) {
            C0325e.a aVar = ActionMenuView.this.f1495v;
            if (aVar != null) {
                aVar.mo1143b(c0325e);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$e */
    /* loaded from: classes.dex */
    public interface InterfaceC0344e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: L */
    public static int m1466L(View view, int i10, int i11, int i12, int i13) {
        ActionMenuItemView actionMenuItemView;
        boolean z10;
        int i14;
        C0342c c0342c = (C0342c) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i12) - i13, View.MeasureSpec.getMode(i12));
        if (view instanceof ActionMenuItemView) {
            actionMenuItemView = (ActionMenuItemView) view;
        } else {
            actionMenuItemView = null;
        }
        boolean z11 = true;
        if (actionMenuItemView != null && actionMenuItemView.m1265g()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i11 > 0) {
            i14 = 2;
            if (!z10 || i11 >= 2) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i11 * i10, Integer.MIN_VALUE), makeMeasureSpec);
                int measuredWidth = view.getMeasuredWidth();
                int i15 = measuredWidth / i10;
                if (measuredWidth % i10 != 0) {
                    i15++;
                }
                if (!z10 || i15 >= 2) {
                    i14 = i15;
                }
                if (!c0342c.f1500a || !z10) {
                    z11 = false;
                }
                c0342c.f1503d = z11;
                c0342c.f1501b = i14;
                view.measure(View.MeasureSpec.makeMeasureSpec(i10 * i14, 1073741824), makeMeasureSpec);
                return i14;
            }
        }
        i14 = 0;
        if (!c0342c.f1500a) {
        }
        z11 = false;
        c0342c.f1503d = z11;
        c0342c.f1501b = i14;
        view.measure(View.MeasureSpec.makeMeasureSpec(i10 * i14, 1073741824), makeMeasureSpec);
        return i14;
    }

    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9, types: [int, boolean] */
    /* renamed from: M */
    private void m1467M(int i10, int i11) {
        boolean z10;
        int i12;
        int i13;
        boolean z11;
        int i14;
        boolean z12;
        boolean z13;
        int i15;
        int i16;
        boolean z14;
        int i17;
        Object r14 = null;
        boolean z15;
        int i18;
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i11, paddingTop, -2);
        int i19 = size - paddingLeft;
        int i20 = this.f1498y;
        int i21 = i19 / i20;
        int i22 = i19 % i20;
        if (i21 == 0) {
            setMeasuredDimension(i19, 0);
            return;
        }
        int i23 = i20 + (i22 / i21);
        int childCount = getChildCount();
        int i24 = 0;
        int i25 = 0;
        boolean z16 = false;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        long j10 = 0;
        while (i25 < childCount) {
            View childAt = getChildAt(i25);
            int i29 = size2;
            if (childAt.getVisibility() != 8) {
                boolean z17 = childAt instanceof ActionMenuItemView;
                int i30 = i26 + 1;
                if (z17) {
                    int i31 = this.f1499z;
                    i17 = i30;
                    r14 = 0;
                    childAt.setPadding(i31, 0, i31, 0);
                } else {
                    i17 = i30;
                    r14 = 0;
                }
                C0342c c0342c = (C0342c) childAt.getLayoutParams();
                c0342c.f1505f = r14;
                c0342c.f1502c = r14;
                c0342c.f1501b = r14;
                c0342c.f1503d = r14;
                ((LinearLayout.LayoutParams) c0342c).leftMargin = r14;
                ((LinearLayout.LayoutParams) c0342c).rightMargin = r14;
                if (z17 && ((ActionMenuItemView) childAt).m1265g()) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                c0342c.f1504e = z15;
                if (c0342c.f1500a) {
                    i18 = 1;
                } else {
                    i18 = i21;
                }
                int m1466L = m1466L(childAt, i23, i18, childMeasureSpec, paddingTop);
                i27 = Math.max(i27, m1466L);
                if (c0342c.f1503d) {
                    i28++;
                }
                if (c0342c.f1500a) {
                    z16 = true;
                }
                i21 -= m1466L;
                i24 = Math.max(i24, childAt.getMeasuredHeight());
                if (m1466L == 1) {
                    j10 |= 1 << i25;
                    i24 = i24;
                }
                i26 = i17;
            }
            i25++;
            size2 = i29;
        }
        int i32 = size2;
        if (z16 && i26 == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z18 = false;
        while (i28 > 0 && i21 > 0) {
            int i33 = 0;
            int i34 = 0;
            int i35 = Integer.MAX_VALUE;
            long j11 = 0;
            while (i34 < childCount) {
                boolean z19 = z18;
                C0342c c0342c2 = (C0342c) getChildAt(i34).getLayoutParams();
                int i36 = i24;
                if (c0342c2.f1503d) {
                    int i37 = c0342c2.f1501b;
                    if (i37 < i35) {
                        j11 = 1 << i34;
                        i35 = i37;
                        i33 = 1;
                    } else if (i37 == i35) {
                        i33++;
                        j11 |= 1 << i34;
                    }
                }
                i34++;
                i24 = i36;
                z18 = z19;
            }
            z11 = z18;
            i14 = i24;
            j10 |= j11;
            if (i33 > i21) {
                i12 = mode;
                i13 = i19;
                break;
            }
            int i38 = i35 + 1;
            int i39 = 0;
            while (i39 < childCount) {
                View childAt2 = getChildAt(i39);
                C0342c c0342c3 = (C0342c) childAt2.getLayoutParams();
                int i40 = i19;
                int i41 = mode;
                long j12 = 1 << i39;
                if ((j11 & j12) == 0) {
                    if (c0342c3.f1501b == i38) {
                        j10 |= j12;
                    }
                    z14 = z10;
                } else {
                    if (z10 && c0342c3.f1504e && i21 == 1) {
                        int i42 = this.f1499z;
                        z14 = z10;
                        childAt2.setPadding(i42 + i23, 0, i42, 0);
                    } else {
                        z14 = z10;
                    }
                    c0342c3.f1501b++;
                    c0342c3.f1505f = true;
                    i21--;
                }
                i39++;
                mode = i41;
                i19 = i40;
                z10 = z14;
            }
            i24 = i14;
            z18 = true;
        }
        i12 = mode;
        i13 = i19;
        z11 = z18;
        i14 = i24;
        if (!z16 && i26 == 1) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (i21 > 0 && j10 != 0 && (i21 < i26 - 1 || z12 || i27 > 1)) {
            float bitCount = Long.bitCount(j10);
            if (!z12) {
                if ((j10 & 1) != 0 && !((C0342c) getChildAt(0).getLayoutParams()).f1504e) {
                    bitCount -= 0.5f;
                }
                int i43 = childCount - 1;
                if ((j10 & (1 << i43)) != 0 && !((C0342c) getChildAt(i43).getLayoutParams()).f1504e) {
                    bitCount -= 0.5f;
                }
            }
            if (bitCount > 0.0f) {
                i16 = (int) ((i21 * i23) / bitCount);
            } else {
                i16 = 0;
            }
            z13 = z11;
            for (int i44 = 0; i44 < childCount; i44++) {
                if ((j10 & (1 << i44)) != 0) {
                    View childAt3 = getChildAt(i44);
                    C0342c c0342c4 = (C0342c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        c0342c4.f1502c = i16;
                        c0342c4.f1505f = true;
                        if (i44 == 0 && !c0342c4.f1504e) {
                            ((LinearLayout.LayoutParams) c0342c4).leftMargin = (-i16) / 2;
                        }
                    } else if (c0342c4.f1500a) {
                        c0342c4.f1502c = i16;
                        c0342c4.f1505f = true;
                        ((LinearLayout.LayoutParams) c0342c4).rightMargin = (-i16) / 2;
                    } else {
                        if (i44 != 0) {
                            ((LinearLayout.LayoutParams) c0342c4).leftMargin = i16 / 2;
                        }
                        if (i44 != childCount - 1) {
                            ((LinearLayout.LayoutParams) c0342c4).rightMargin = i16 / 2;
                        }
                    }
                    z13 = true;
                }
            }
        } else {
            z13 = z11;
        }
        if (z13) {
            for (int i45 = 0; i45 < childCount; i45++) {
                View childAt4 = getChildAt(i45);
                C0342c c0342c5 = (C0342c) childAt4.getLayoutParams();
                if (c0342c5.f1505f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((c0342c5.f1501b * i23) + c0342c5.f1502c, 1073741824), childMeasureSpec);
                }
            }
        }
        if (i12 != 1073741824) {
            i15 = i14;
        } else {
            i15 = i32;
        }
        setMeasuredDimension(i13, i15);
    }

    /* renamed from: B */
    public void m1468B() {
        C0387e c0387e = this.f1493t;
        if (c0387e != null) {
            c0387e.m1689y();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.AbstractC0445s1
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public C0342c generateDefaultLayoutParams() {
        C0342c c0342c = new C0342c(-2, -2);
        ((LinearLayout.LayoutParams) c0342c).gravity = 16;
        return c0342c;
    }

    @Override // androidx.appcompat.widget.AbstractC0445s1
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public C0342c generateLayoutParams(AttributeSet attributeSet) {
        return new C0342c(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.AbstractC0445s1
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public C0342c generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C0342c c0342c;
        if (layoutParams != null) {
            if (layoutParams instanceof C0342c) {
                c0342c = new C0342c((C0342c) layoutParams);
            } else {
                c0342c = new C0342c(layoutParams);
            }
            if (((LinearLayout.LayoutParams) c0342c).gravity <= 0) {
                ((LinearLayout.LayoutParams) c0342c).gravity = 16;
            }
            return c0342c;
        }
        return generateDefaultLayoutParams();
    }

    /* renamed from: F */
    public C0342c m1472F() {
        C0342c generateDefaultLayoutParams = generateDefaultLayoutParams();
        generateDefaultLayoutParams.f1500a = true;
        return generateDefaultLayoutParams;
    }

    /* renamed from: G */
    protected boolean m1473G(int i10) {
        boolean z10 = false;
        if (i10 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i10 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i10);
        if (i10 < getChildCount() && (childAt instanceof InterfaceC0340a)) {
            z10 = false | ((InterfaceC0340a) childAt).mo1261b();
        }
        if (i10 > 0 && (childAt2 instanceof InterfaceC0340a)) {
            return z10 | ((InterfaceC0340a) childAt2).mo1262c();
        }
        return z10;
    }

    /* renamed from: H */
    public boolean m1474H() {
        C0387e c0387e = this.f1493t;
        if (c0387e != null && c0387e.m1679B()) {
            return true;
        }
        return false;
    }

    /* renamed from: I */
    public boolean m1475I() {
        C0387e c0387e = this.f1493t;
        if (c0387e != null && c0387e.m1681D()) {
            return true;
        }
        return false;
    }

    /* renamed from: J */
    public boolean m1476J() {
        C0387e c0387e = this.f1493t;
        if (c0387e != null && c0387e.m1682E()) {
            return true;
        }
        return false;
    }

    /* renamed from: K */
    public boolean m1477K() {
        return this.f1492s;
    }

    /* renamed from: N */
    public C0325e m1478N() {
        return this.f1489p;
    }

    /* renamed from: O */
    public void m1479O(InterfaceC0330j.a aVar, C0325e.a aVar2) {
        this.f1494u = aVar;
        this.f1495v = aVar2;
    }

    /* renamed from: P */
    public boolean m1480P() {
        C0387e c0387e = this.f1493t;
        if (c0387e != null && c0387e.m1688K()) {
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.C0325e.b
    /* renamed from: a */
    public boolean mo1269a(C0327g c0327g) {
        return this.f1489p.m1340L(c0327g, 0);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0331k
    /* renamed from: b */
    public void mo1270b(C0325e c0325e) {
        this.f1489p = c0325e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.AbstractC0445s1, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0342c;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public Menu getMenu() {
        if (this.f1489p == null) {
            Context context = getContext();
            C0325e c0325e = new C0325e(context);
            this.f1489p = c0325e;
            c0325e.mo1345R(new C0343d());
            C0387e c0387e = new C0387e(context);
            this.f1493t = c0387e;
            c0387e.m1687J(true);
            C0387e c0387e2 = this.f1493t;
            InterfaceC0330j.a aVar = this.f1494u;
            if (aVar == null) {
                aVar = new C0341b();
            }
            c0387e2.mo1281f(aVar);
            this.f1489p.m1356c(this.f1493t, this.f1490q);
            this.f1493t.m1685H(this);
        }
        return this.f1489p;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.f1493t.m1678A();
    }

    public int getPopupTheme() {
        return this.f1491r;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0387e c0387e = this.f1493t;
        if (c0387e != null) {
            c0387e.mo1278b(false);
            if (this.f1493t.m1682E()) {
                this.f1493t.m1679B();
                this.f1493t.m1688K();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m1468B();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.AbstractC0445s1, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int width;
        int i15;
        if (!this.f1496w) {
            super.onLayout(z10, i10, i11, i12, i13);
            return;
        }
        int childCount = getChildCount();
        int i16 = (i13 - i11) / 2;
        int dividerWidth = getDividerWidth();
        int i17 = i12 - i10;
        int paddingRight = (i17 - getPaddingRight()) - getPaddingLeft();
        boolean m2027b = AbstractC0466x2.m2027b(this);
        int i18 = 0;
        int i19 = 0;
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt = getChildAt(i20);
            if (childAt.getVisibility() != 8) {
                C0342c c0342c = (C0342c) childAt.getLayoutParams();
                if (c0342c.f1500a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (m1473G(i20)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (m2027b) {
                        i15 = getPaddingLeft() + ((LinearLayout.LayoutParams) c0342c).leftMargin;
                        width = i15 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) c0342c).rightMargin;
                        i15 = width - measuredWidth;
                    }
                    int i21 = i16 - (measuredHeight / 2);
                    childAt.layout(i15, i21, width, measuredHeight + i21);
                    paddingRight -= measuredWidth;
                    i18 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) c0342c).leftMargin) + ((LinearLayout.LayoutParams) c0342c).rightMargin;
                    m1473G(i20);
                    i19++;
                }
            }
        }
        if (childCount == 1 && i18 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i22 = (i17 / 2) - (measuredWidth2 / 2);
            int i23 = i16 - (measuredHeight2 / 2);
            childAt2.layout(i22, i23, measuredWidth2 + i22, measuredHeight2 + i23);
            return;
        }
        int i24 = i19 - (i18 ^ 1);
        if (i24 > 0) {
            i14 = paddingRight / i24;
        } else {
            i14 = 0;
        }
        int max = Math.max(0, i14);
        if (m2027b) {
            int width2 = getWidth() - getPaddingRight();
            for (int i25 = 0; i25 < childCount; i25++) {
                View childAt3 = getChildAt(i25);
                C0342c c0342c2 = (C0342c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c0342c2.f1500a) {
                    int i26 = width2 - ((LinearLayout.LayoutParams) c0342c2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i27 = i16 - (measuredHeight3 / 2);
                    childAt3.layout(i26 - measuredWidth3, i27, i26, measuredHeight3 + i27);
                    width2 = i26 - ((measuredWidth3 + ((LinearLayout.LayoutParams) c0342c2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i28 = 0; i28 < childCount; i28++) {
            View childAt4 = getChildAt(i28);
            C0342c c0342c3 = (C0342c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c0342c3.f1500a) {
                int i29 = paddingLeft + ((LinearLayout.LayoutParams) c0342c3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i30 = i16 - (measuredHeight4 / 2);
                childAt4.layout(i29, i30, i29 + measuredWidth4, measuredHeight4 + i30);
                paddingLeft = i29 + measuredWidth4 + ((LinearLayout.LayoutParams) c0342c3).rightMargin + max;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.AbstractC0445s1, android.view.View
    public void onMeasure(int i10, int i11) {
        boolean z10;
        C0325e c0325e;
        boolean z11 = this.f1496w;
        if (View.MeasureSpec.getMode(i10) == 1073741824) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f1496w = z10;
        if (z11 != z10) {
            this.f1497x = 0;
        }
        int size = View.MeasureSpec.getSize(i10);
        if (this.f1496w && (c0325e = this.f1489p) != null && size != this.f1497x) {
            this.f1497x = size;
            c0325e.m1339K(true);
        }
        int childCount = getChildCount();
        if (this.f1496w && childCount > 0) {
            m1467M(i10, i11);
            return;
        }
        for (int i12 = 0; i12 < childCount; i12++) {
            C0342c c0342c = (C0342c) getChildAt(i12).getLayoutParams();
            ((LinearLayout.LayoutParams) c0342c).rightMargin = 0;
            ((LinearLayout.LayoutParams) c0342c).leftMargin = 0;
        }
        super.onMeasure(i10, i11);
    }

    public void setExpandedActionViewsExclusive(boolean z10) {
        this.f1493t.m1684G(z10);
    }

    public void setOnMenuItemClickListener(InterfaceC0344e interfaceC0344e) {
        this.f1488A = interfaceC0344e;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.f1493t.m1686I(drawable);
    }

    public void setOverflowReserved(boolean z10) {
        this.f1492s = z10;
    }

    public void setPopupTheme(int i10) {
        if (this.f1491r != i10) {
            this.f1491r = i10;
            if (i10 == 0) {
                this.f1490q = getContext();
            } else {
                this.f1490q = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setPresenter(C0387e c0387e) {
        this.f1493t = c0387e;
        c0387e.m1685H(this);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f1498y = (int) (56.0f * f10);
        this.f1499z = (int) (f10 * 4.0f);
        this.f1490q = context;
        this.f1491r = 0;
    }
}
