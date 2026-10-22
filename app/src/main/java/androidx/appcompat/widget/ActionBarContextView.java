package androidx.appcompat.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.R$attr;
import androidx.appcompat.R$id;
import androidx.appcompat.R$layout;
import androidx.appcompat.R$styleable;
import androidx.appcompat.view.menu.C0325e;
import androidx.core.view.AbstractC0616q0;
import androidx.core.view.C0589j1;
import p138g.AbstractC4318b;

/* loaded from: classes.dex */
public class ActionBarContextView extends AbstractC0371a {

    /* renamed from: i */
    private CharSequence f1439i;

    /* renamed from: j */
    private CharSequence f1440j;

    /* renamed from: k */
    private View f1441k;

    /* renamed from: l */
    private View f1442l;

    /* renamed from: m */
    private View f1443m;

    /* renamed from: n */
    private LinearLayout f1444n;

    /* renamed from: o */
    private TextView f1445o;

    /* renamed from: p */
    private TextView f1446p;

    /* renamed from: q */
    private int f1447q;

    /* renamed from: r */
    private int f1448r;

    /* renamed from: s */
    private boolean f1449s;

    /* renamed from: t */
    private int f1450t;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.ActionBarContextView$a */
    /* loaded from: classes.dex */
    public class ViewOnClickListenerC0334a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC4318b f1451a;

        ViewOnClickListenerC0334a(AbstractC4318b abstractC4318b) {
            this.f1451a = abstractC4318b;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f1451a.mo1244c();
        }
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    /* renamed from: i */
    private void m1431i() {
        int i10;
        if (this.f1444n == null) {
            LayoutInflater.from(getContext()).inflate(R$layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f1444n = linearLayout;
            this.f1445o = (TextView) linearLayout.findViewById(R$id.action_bar_title);
            this.f1446p = (TextView) this.f1444n.findViewById(R$id.action_bar_subtitle);
            if (this.f1447q != 0) {
                this.f1445o.setTextAppearance(getContext(), this.f1447q);
            }
            if (this.f1448r != 0) {
                this.f1446p.setTextAppearance(getContext(), this.f1448r);
            }
        }
        this.f1445o.setText(this.f1439i);
        this.f1446p.setText(this.f1440j);
        boolean z10 = !TextUtils.isEmpty(this.f1439i);
        boolean z11 = !TextUtils.isEmpty(this.f1440j);
        TextView textView = this.f1446p;
        int i11 = 0;
        if (z11) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        textView.setVisibility(i10);
        LinearLayout linearLayout2 = this.f1444n;
        if (!z10 && !z11) {
            i11 = 8;
        }
        linearLayout2.setVisibility(i11);
        if (this.f1444n.getParent() == null) {
            addView(this.f1444n);
        }
    }

    @Override // androidx.appcompat.widget.AbstractC0371a
    /* renamed from: f */
    public /* bridge */ /* synthetic */ C0589j1 mo1432f(int i10, long j10) {
        return super.mo1432f(i10, j10);
    }

    /* renamed from: g */
    public void m1433g() {
        if (this.f1441k == null) {
            m1436k();
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.AbstractC0371a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // androidx.appcompat.widget.AbstractC0371a
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f1440j;
    }

    public CharSequence getTitle() {
        return this.f1439i;
    }

    /* renamed from: h */
    public void m1434h(AbstractC4318b abstractC4318b) {
        View view = this.f1441k;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.f1450t, (ViewGroup) this, false);
            this.f1441k = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.f1441k);
        }
        View findViewById = this.f1441k.findViewById(R$id.action_mode_close_button);
        this.f1442l = findViewById;
        findViewById.setOnClickListener(new ViewOnClickListenerC0334a(abstractC4318b));
        C0325e c0325e = (C0325e) abstractC4318b.mo1246e();
        C0387e c0387e = this.f1650d;
        if (c0387e != null) {
            c0387e.m1689y();
        }
        C0387e c0387e2 = new C0387e(getContext());
        this.f1650d = c0387e2;
        c0387e2.m1687J(true);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        c0325e.m1356c(this.f1650d, this.f1648b);
        ActionMenuView actionMenuView = (ActionMenuView) this.f1650d.mo1290o(this);
        this.f1649c = actionMenuView;
        AbstractC0616q0.m2642q0(actionMenuView, null);
        addView(this.f1649c, layoutParams);
    }

    /* renamed from: j */
    public boolean m1435j() {
        return this.f1449s;
    }

    /* renamed from: k */
    public void m1436k() {
        removeAllViews();
        this.f1443m = null;
        this.f1649c = null;
        this.f1650d = null;
        View view = this.f1442l;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    /* renamed from: l */
    public boolean m1437l() {
        C0387e c0387e = this.f1650d;
        if (c0387e != null) {
            return c0387e.m1688K();
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0387e c0387e = this.f1650d;
        if (c0387e != null) {
            c0387e.m1679B();
            this.f1650d.m1680C();
        }
    }

    @Override // androidx.appcompat.widget.AbstractC0371a, android.view.View
    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            accessibilityEvent.setSource(this);
            accessibilityEvent.setClassName(getClass().getName());
            accessibilityEvent.setPackageName(getContext().getPackageName());
            accessibilityEvent.setContentDescription(this.f1439i);
            return;
        }
        super.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int paddingLeft;
        int paddingRight;
        int i14;
        int i15;
        boolean m2027b = AbstractC0466x2.m2027b(this);
        if (m2027b) {
            paddingLeft = (i12 - i10) - getPaddingRight();
        } else {
            paddingLeft = getPaddingLeft();
        }
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
        View view = this.f1441k;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1441k.getLayoutParams();
            if (m2027b) {
                i14 = marginLayoutParams.rightMargin;
            } else {
                i14 = marginLayoutParams.leftMargin;
            }
            if (m2027b) {
                i15 = marginLayoutParams.leftMargin;
            } else {
                i15 = marginLayoutParams.rightMargin;
            }
            int m1590d = AbstractC0371a.m1590d(paddingLeft, i14, m2027b);
            paddingLeft = AbstractC0371a.m1590d(m1590d + m1592e(this.f1441k, m1590d, paddingTop, paddingTop2, m2027b), i15, m2027b);
        }
        int i16 = paddingLeft;
        LinearLayout linearLayout = this.f1444n;
        if (linearLayout != null && this.f1443m == null && linearLayout.getVisibility() != 8) {
            i16 += m1592e(this.f1444n, i16, paddingTop, paddingTop2, m2027b);
        }
        int i17 = i16;
        View view2 = this.f1443m;
        if (view2 != null) {
            m1592e(view2, i17, paddingTop, paddingTop2, m2027b);
        }
        if (m2027b) {
            paddingRight = getPaddingLeft();
        } else {
            paddingRight = (i12 - i10) - getPaddingRight();
        }
        ActionMenuView actionMenuView = this.f1649c;
        if (actionMenuView != null) {
            m1592e(actionMenuView, paddingRight, paddingTop, paddingTop2, !m2027b);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int i12;
        boolean z10;
        int i13;
        int i14 = 1073741824;
        if (View.MeasureSpec.getMode(i10) == 1073741824) {
            if (View.MeasureSpec.getMode(i11) != 0) {
                int size = View.MeasureSpec.getSize(i10);
                int i15 = this.f1651e;
                if (i15 <= 0) {
                    i15 = View.MeasureSpec.getSize(i11);
                }
                int paddingTop = getPaddingTop() + getPaddingBottom();
                int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
                int i16 = i15 - paddingTop;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i16, Integer.MIN_VALUE);
                View view = this.f1441k;
                if (view != null) {
                    int m1591c = m1591c(view, paddingLeft, makeMeasureSpec, 0);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1441k.getLayoutParams();
                    paddingLeft = m1591c - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
                }
                ActionMenuView actionMenuView = this.f1649c;
                if (actionMenuView != null && actionMenuView.getParent() == this) {
                    paddingLeft = m1591c(this.f1649c, paddingLeft, makeMeasureSpec, 0);
                }
                LinearLayout linearLayout = this.f1444n;
                if (linearLayout != null && this.f1443m == null) {
                    if (this.f1449s) {
                        this.f1444n.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                        int measuredWidth = this.f1444n.getMeasuredWidth();
                        if (measuredWidth <= paddingLeft) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            paddingLeft -= measuredWidth;
                        }
                        LinearLayout linearLayout2 = this.f1444n;
                        if (z10) {
                            i13 = 0;
                        } else {
                            i13 = 8;
                        }
                        linearLayout2.setVisibility(i13);
                    } else {
                        paddingLeft = m1591c(linearLayout, paddingLeft, makeMeasureSpec, 0);
                    }
                }
                View view2 = this.f1443m;
                if (view2 != null) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    int i17 = layoutParams.width;
                    if (i17 != -2) {
                        i12 = 1073741824;
                    } else {
                        i12 = Integer.MIN_VALUE;
                    }
                    if (i17 >= 0) {
                        paddingLeft = Math.min(i17, paddingLeft);
                    }
                    int i18 = layoutParams.height;
                    if (i18 == -2) {
                        i14 = Integer.MIN_VALUE;
                    }
                    if (i18 >= 0) {
                        i16 = Math.min(i18, i16);
                    }
                    this.f1443m.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i12), View.MeasureSpec.makeMeasureSpec(i16, i14));
                }
                if (this.f1651e <= 0) {
                    int childCount = getChildCount();
                    int i19 = 0;
                    for (int i20 = 0; i20 < childCount; i20++) {
                        int measuredHeight = getChildAt(i20).getMeasuredHeight() + paddingTop;
                        if (measuredHeight > i19) {
                            i19 = measuredHeight;
                        }
                    }
                    setMeasuredDimension(size, i19);
                    return;
                }
                setMeasuredDimension(size, i15);
                return;
            }
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
        throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
    }

    @Override // androidx.appcompat.widget.AbstractC0371a, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.appcompat.widget.AbstractC0371a
    public void setContentHeight(int i10) {
        this.f1651e = i10;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f1443m;
        if (view2 != null) {
            removeView(view2);
        }
        this.f1443m = view;
        if (view != null && (linearLayout = this.f1444n) != null) {
            removeView(linearLayout);
            this.f1444n = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f1440j = charSequence;
        m1431i();
    }

    public void setTitle(CharSequence charSequence) {
        this.f1439i = charSequence;
        m1431i();
    }

    public void setTitleOptional(boolean z10) {
        if (z10 != this.f1449s) {
            requestLayout();
        }
        this.f1449s = z10;
    }

    @Override // androidx.appcompat.widget.AbstractC0371a, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i10) {
        super.setVisibility(i10);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.actionModeStyle);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        C0438q2 m1874v = C0438q2.m1874v(context, attributeSet, R$styleable.f908e, i10, 0);
        AbstractC0616q0.m2642q0(this, m1874v.m1881g(R$styleable.ActionMode_background));
        this.f1447q = m1874v.m1888n(R$styleable.ActionMode_titleTextStyle, 0);
        this.f1448r = m1874v.m1888n(R$styleable.ActionMode_subtitleTextStyle, 0);
        this.f1651e = m1874v.m1887m(R$styleable.ActionMode_height, 0);
        this.f1450t = m1874v.m1888n(R$styleable.ActionMode_closeItemLayout, R$layout.abc_action_mode_close_item_material);
        m1874v.m1894w();
    }
}
