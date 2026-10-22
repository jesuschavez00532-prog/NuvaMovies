package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.R$attr;
import androidx.appcompat.R$styleable;
import androidx.appcompat.app.AbstractC0300a;
import androidx.appcompat.view.menu.C0325e;
import androidx.appcompat.view.menu.C0327g;
import androidx.appcompat.view.menu.InterfaceC0330j;
import androidx.appcompat.view.menu.SubMenuC0333m;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.view.AbstractC0616q0;
import androidx.core.view.AbstractC0619r;
import androidx.core.view.AbstractC0631u;
import java.util.ArrayList;
import java.util.List;
import p020b0.AbstractC1031a;
import p106e.AbstractC4105b;
import p138g.C4323g;
import p138g.InterfaceC4319c;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {

    /* renamed from: A */
    private ColorStateList f1594A;

    /* renamed from: B */
    private boolean f1595B;

    /* renamed from: C */
    private boolean f1596C;

    /* renamed from: D */
    private final ArrayList f1597D;

    /* renamed from: E */
    private final ArrayList f1598E;

    /* renamed from: F */
    private final int[] f1599F;

    /* renamed from: G */
    private final ActionMenuView.InterfaceC0344e f1600G;

    /* renamed from: H */
    private C0442r2 f1601H;

    /* renamed from: I */
    private C0387e f1602I;

    /* renamed from: J */
    private C0366d f1603J;

    /* renamed from: K */
    private InterfaceC0330j.a f1604K;

    /* renamed from: L */
    private C0325e.a f1605L;

    /* renamed from: M */
    private boolean f1606M;

    /* renamed from: N */
    private final Runnable f1607N;

    /* renamed from: a */
    private ActionMenuView f1608a;

    /* renamed from: b */
    private TextView f1609b;

    /* renamed from: c */
    private TextView f1610c;

    /* renamed from: d */
    private ImageButton f1611d;

    /* renamed from: e */
    private ImageView f1612e;

    /* renamed from: f */
    private Drawable f1613f;

    /* renamed from: g */
    private CharSequence f1614g;

    /* renamed from: h */
    ImageButton f1615h;

    /* renamed from: i */
    View f1616i;

    /* renamed from: j */
    private Context f1617j;

    /* renamed from: k */
    private int f1618k;

    /* renamed from: l */
    private int f1619l;

    /* renamed from: m */
    private int f1620m;

    /* renamed from: n */
    int f1621n;

    /* renamed from: o */
    private int f1622o;

    /* renamed from: p */
    private int f1623p;

    /* renamed from: q */
    private int f1624q;

    /* renamed from: r */
    private int f1625r;

    /* renamed from: s */
    private int f1626s;

    /* renamed from: t */
    private C0402h2 f1627t;

    /* renamed from: u */
    private int f1628u;

    /* renamed from: v */
    private int f1629v;

    /* renamed from: w */
    private int f1630w;

    /* renamed from: x */
    private CharSequence f1631x;

    /* renamed from: y */
    private CharSequence f1632y;

    /* renamed from: z */
    private ColorStateList f1633z;

    /* renamed from: androidx.appcompat.widget.Toolbar$a */
    /* loaded from: classes.dex */
    class C0363a implements ActionMenuView.InterfaceC0344e {
        C0363a() {
        }

        @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC0344e
        public boolean onMenuItemClick(MenuItem menuItem) {
            Toolbar.this.getClass();
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$b */
    /* loaded from: classes.dex */
    class RunnableC0364b implements Runnable {
        RunnableC0364b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Toolbar.this.m1570N();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.Toolbar$c */
    /* loaded from: classes.dex */
    public class ViewOnClickListenerC0365c implements View.OnClickListener {
        ViewOnClickListenerC0365c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Toolbar.this.m1573e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.Toolbar$d */
    /* loaded from: classes.dex */
    public class C0366d implements InterfaceC0330j {

        /* renamed from: a */
        C0325e f1637a;

        /* renamed from: b */
        C0327g f1638b;

        C0366d() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0330j
        /* renamed from: a */
        public void mo1277a(C0325e c0325e, boolean z10) {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0330j
        /* renamed from: b */
        public void mo1278b(boolean z10) {
            if (this.f1638b != null) {
                C0325e c0325e = this.f1637a;
                boolean z11 = false;
                if (c0325e != null) {
                    int size = c0325e.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= size) {
                            break;
                        }
                        if (this.f1637a.getItem(i10) == this.f1638b) {
                            z11 = true;
                            break;
                        }
                        i10++;
                    }
                }
                if (!z11) {
                    mo1279d(this.f1637a, this.f1638b);
                }
            }
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0330j
        /* renamed from: c */
        public boolean mo1300c() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0330j
        /* renamed from: d */
        public boolean mo1279d(C0325e c0325e, C0327g c0327g) {
            KeyEvent.Callback callback = Toolbar.this.f1616i;
            if (callback instanceof InterfaceC4319c) {
                ((InterfaceC4319c) callback).mo1530f();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f1616i);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f1615h);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f1616i = null;
            toolbar3.m1571a();
            this.f1638b = null;
            Toolbar.this.requestLayout();
            c0327g.m1399r(false);
            return true;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0330j
        /* renamed from: e */
        public boolean mo1280e(C0325e c0325e, C0327g c0327g) {
            Toolbar.this.m1575g();
            ViewParent parent = Toolbar.this.f1615h.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f1615h);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f1615h);
            }
            Toolbar.this.f1616i = c0327g.getActionView();
            this.f1638b = c0327g;
            ViewParent parent2 = Toolbar.this.f1616i.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f1616i);
                }
                C0367e generateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                generateDefaultLayoutParams.f1044a = (toolbar4.f1621n & 112) | 8388611;
                generateDefaultLayoutParams.f1640b = 2;
                toolbar4.f1616i.setLayoutParams(generateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f1616i);
            }
            Toolbar.this.m1565G();
            Toolbar.this.requestLayout();
            c0327g.m1399r(true);
            KeyEvent.Callback callback = Toolbar.this.f1616i;
            if (callback instanceof InterfaceC4319c) {
                ((InterfaceC4319c) callback).mo1528c();
            }
            return true;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0330j
        /* renamed from: g */
        public void mo1282g(Context context, C0325e c0325e) {
            C0327g c0327g;
            C0325e c0325e2 = this.f1637a;
            if (c0325e2 != null && (c0327g = this.f1638b) != null) {
                c0325e2.mo1361f(c0327g);
            }
            this.f1637a = c0325e;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0330j
        /* renamed from: i */
        public boolean mo1284i(SubMenuC0333m subMenuC0333m) {
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$f */
    /* loaded from: classes.dex */
    public interface InterfaceC0368f {
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.toolbarStyle);
    }

    /* renamed from: B */
    private int m1543B(View view, int i10, int[] iArr, int i11) {
        C0367e c0367e = (C0367e) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) c0367e).leftMargin - iArr[0];
        int max = i10 + Math.max(0, i12);
        iArr[0] = Math.max(0, -i12);
        int m1558q = m1558q(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, m1558q, max + measuredWidth, view.getMeasuredHeight() + m1558q);
        return max + measuredWidth + ((ViewGroup.MarginLayoutParams) c0367e).rightMargin;
    }

    /* renamed from: C */
    private int m1544C(View view, int i10, int[] iArr, int i11) {
        C0367e c0367e = (C0367e) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) c0367e).rightMargin - iArr[1];
        int max = i10 - Math.max(0, i12);
        iArr[1] = Math.max(0, -i12);
        int m1558q = m1558q(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, m1558q, max, view.getMeasuredHeight() + m1558q);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) c0367e).leftMargin);
    }

    /* renamed from: D */
    private int m1545D(View view, int i10, int i11, int i12, int i13, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i14 = marginLayoutParams.leftMargin - iArr[0];
        int i15 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i14) + Math.max(0, i15);
        iArr[0] = Math.max(0, -i14);
        iArr[1] = Math.max(0, -i15);
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + max + i11, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i12, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    /* renamed from: E */
    private void m1546E(View view, int i10, int i11, int i12, int i13, int i14) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i12, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i14 >= 0) {
            if (mode != 0) {
                i14 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i14);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    /* renamed from: F */
    private void m1547F() {
        removeCallbacks(this.f1607N);
        post(this.f1607N);
    }

    /* renamed from: L */
    private boolean m1548L() {
        if (!this.f1606M) {
            return false;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (m1549M(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: M */
    private boolean m1549M(View view) {
        if (view != null && view.getParent() == this && view.getVisibility() != 8) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private void m1550b(List list, int i10) {
        boolean z10;
        if (AbstractC0616q0.m2579B(this) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        int childCount = getChildCount();
        int m2800b = AbstractC0619r.m2800b(i10, AbstractC0616q0.m2579B(this));
        list.clear();
        if (z10) {
            for (int i11 = childCount - 1; i11 >= 0; i11--) {
                View childAt = getChildAt(i11);
                C0367e c0367e = (C0367e) childAt.getLayoutParams();
                if (c0367e.f1640b == 0 && m1549M(childAt) && m1557p(c0367e.f1044a) == m2800b) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt2 = getChildAt(i12);
            C0367e c0367e2 = (C0367e) childAt2.getLayoutParams();
            if (c0367e2.f1640b == 0 && m1549M(childAt2) && m1557p(c0367e2.f1044a) == m2800b) {
                list.add(childAt2);
            }
        }
    }

    /* renamed from: c */
    private void m1551c(View view, boolean z10) {
        C0367e c0367e;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            c0367e = generateDefaultLayoutParams();
        } else if (!checkLayoutParams(layoutParams)) {
            c0367e = generateLayoutParams(layoutParams);
        } else {
            c0367e = (C0367e) layoutParams;
        }
        c0367e.f1640b = 1;
        if (z10 && this.f1616i != null) {
            view.setLayoutParams(c0367e);
            this.f1598E.add(view);
        } else {
            addView(view, c0367e);
        }
    }

    private MenuInflater getMenuInflater() {
        return new C4323g(getContext());
    }

    /* renamed from: h */
    private void m1552h() {
        if (this.f1627t == null) {
            this.f1627t = new C0402h2();
        }
    }

    /* renamed from: i */
    private void m1553i() {
        if (this.f1612e == null) {
            this.f1612e = new C0439r(getContext());
        }
    }

    /* renamed from: j */
    private void m1554j() {
        m1555k();
        if (this.f1608a.m1478N() == null) {
            C0325e c0325e = (C0325e) this.f1608a.getMenu();
            if (this.f1603J == null) {
                this.f1603J = new C0366d();
            }
            this.f1608a.setExpandedActionViewsExclusive(true);
            c0325e.m1356c(this.f1603J, this.f1617j);
        }
    }

    /* renamed from: k */
    private void m1555k() {
        if (this.f1608a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f1608a = actionMenuView;
            actionMenuView.setPopupTheme(this.f1618k);
            this.f1608a.setOnMenuItemClickListener(this.f1600G);
            this.f1608a.m1479O(this.f1604K, this.f1605L);
            C0367e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f1044a = (this.f1621n & 112) | 8388613;
            this.f1608a.setLayoutParams(generateDefaultLayoutParams);
            m1551c(this.f1608a, false);
        }
    }

    /* renamed from: l */
    private void m1556l() {
        if (this.f1611d == null) {
            this.f1611d = new C0427o(getContext(), null, R$attr.toolbarNavigationButtonStyle);
            C0367e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f1044a = (this.f1621n & 112) | 8388611;
            this.f1611d.setLayoutParams(generateDefaultLayoutParams);
        }
    }

    /* renamed from: p */
    private int m1557p(int i10) {
        int m2579B = AbstractC0616q0.m2579B(this);
        int m2800b = AbstractC0619r.m2800b(i10, m2579B) & 7;
        if (m2800b != 1 && m2800b != 3 && m2800b != 5) {
            if (m2579B != 1) {
                return 3;
            }
            return 5;
        }
        return m2800b;
    }

    /* renamed from: q */
    private int m1558q(View view, int i10) {
        int i11;
        C0367e c0367e = (C0367e) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        if (i10 > 0) {
            i11 = (measuredHeight - i10) / 2;
        } else {
            i11 = 0;
        }
        int m1559r = m1559r(c0367e.f1044a);
        if (m1559r != 48) {
            if (m1559r != 80) {
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int height = getHeight();
                int i12 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
                int i13 = ((ViewGroup.MarginLayoutParams) c0367e).topMargin;
                if (i12 < i13) {
                    i12 = i13;
                } else {
                    int i14 = (((height - paddingBottom) - measuredHeight) - i12) - paddingTop;
                    int i15 = ((ViewGroup.MarginLayoutParams) c0367e).bottomMargin;
                    if (i14 < i15) {
                        i12 = Math.max(0, i12 - (i15 - i14));
                    }
                }
                return paddingTop + i12;
            }
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) c0367e).bottomMargin) - i11;
        }
        return getPaddingTop() - i11;
    }

    /* renamed from: r */
    private int m1559r(int i10) {
        int i11 = i10 & 112;
        if (i11 != 16 && i11 != 48 && i11 != 80) {
            return this.f1630w & 112;
        }
        return i11;
    }

    /* renamed from: s */
    private int m1560s(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return AbstractC0631u.m2818b(marginLayoutParams) + AbstractC0631u.m2817a(marginLayoutParams);
    }

    /* renamed from: t */
    private int m1561t(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* renamed from: u */
    private int m1562u(List list, int[] iArr) {
        int i10 = iArr[0];
        int i11 = iArr[1];
        int size = list.size();
        int i12 = 0;
        int i13 = 0;
        while (i12 < size) {
            View view = (View) list.get(i12);
            C0367e c0367e = (C0367e) view.getLayoutParams();
            int i14 = ((ViewGroup.MarginLayoutParams) c0367e).leftMargin - i10;
            int i15 = ((ViewGroup.MarginLayoutParams) c0367e).rightMargin - i11;
            int max = Math.max(0, i14);
            int max2 = Math.max(0, i15);
            int max3 = Math.max(0, -i14);
            int max4 = Math.max(0, -i15);
            i13 += max + view.getMeasuredWidth() + max2;
            i12++;
            i11 = max4;
            i10 = max3;
        }
        return i13;
    }

    /* renamed from: y */
    private boolean m1563y(View view) {
        if (view.getParent() != this && !this.f1598E.contains(view)) {
            return false;
        }
        return true;
    }

    /* renamed from: A */
    public boolean m1564A() {
        ActionMenuView actionMenuView = this.f1608a;
        if (actionMenuView != null && actionMenuView.m1476J()) {
            return true;
        }
        return false;
    }

    /* renamed from: G */
    void m1565G() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((C0367e) childAt.getLayoutParams()).f1640b != 2 && childAt != this.f1608a) {
                removeViewAt(childCount);
                this.f1598E.add(childAt);
            }
        }
    }

    /* renamed from: H */
    public void m1566H(int i10, int i11) {
        m1552h();
        this.f1627t.m1747g(i10, i11);
    }

    /* renamed from: I */
    public void m1567I(C0325e c0325e, C0387e c0387e) {
        if (c0325e == null && this.f1608a == null) {
            return;
        }
        m1555k();
        C0325e m1478N = this.f1608a.m1478N();
        if (m1478N == c0325e) {
            return;
        }
        if (m1478N != null) {
            m1478N.m1342O(this.f1602I);
            m1478N.m1342O(this.f1603J);
        }
        if (this.f1603J == null) {
            this.f1603J = new C0366d();
        }
        c0387e.m1684G(true);
        if (c0325e != null) {
            c0325e.m1356c(c0387e, this.f1617j);
            c0325e.m1356c(this.f1603J, this.f1617j);
        } else {
            c0387e.mo1282g(this.f1617j, null);
            this.f1603J.mo1282g(this.f1617j, null);
            c0387e.mo1278b(true);
            this.f1603J.mo1278b(true);
        }
        this.f1608a.setPopupTheme(this.f1618k);
        this.f1608a.setPresenter(c0387e);
        this.f1602I = c0387e;
    }

    /* renamed from: J */
    public void m1568J(Context context, int i10) {
        this.f1620m = i10;
        TextView textView = this.f1610c;
        if (textView != null) {
            textView.setTextAppearance(context, i10);
        }
    }

    /* renamed from: K */
    public void m1569K(Context context, int i10) {
        this.f1619l = i10;
        TextView textView = this.f1609b;
        if (textView != null) {
            textView.setTextAppearance(context, i10);
        }
    }

    /* renamed from: N */
    public boolean m1570N() {
        ActionMenuView actionMenuView = this.f1608a;
        if (actionMenuView != null && actionMenuView.m1480P()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    void m1571a() {
        for (int size = this.f1598E.size() - 1; size >= 0; size--) {
            addView((View) this.f1598E.get(size));
        }
        this.f1598E.clear();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (super.checkLayoutParams(layoutParams) && (layoutParams instanceof C0367e)) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public boolean m1572d() {
        ActionMenuView actionMenuView;
        if (getVisibility() == 0 && (actionMenuView = this.f1608a) != null && actionMenuView.m1477K()) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public void m1573e() {
        C0327g c0327g;
        C0366d c0366d = this.f1603J;
        if (c0366d == null) {
            c0327g = null;
        } else {
            c0327g = c0366d.f1638b;
        }
        if (c0327g != null) {
            c0327g.collapseActionView();
        }
    }

    /* renamed from: f */
    public void m1574f() {
        ActionMenuView actionMenuView = this.f1608a;
        if (actionMenuView != null) {
            actionMenuView.m1468B();
        }
    }

    /* renamed from: g */
    void m1575g() {
        if (this.f1615h == null) {
            C0427o c0427o = new C0427o(getContext(), null, R$attr.toolbarNavigationButtonStyle);
            this.f1615h = c0427o;
            c0427o.setImageDrawable(this.f1613f);
            this.f1615h.setContentDescription(this.f1614g);
            C0367e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f1044a = (this.f1621n & 112) | 8388611;
            generateDefaultLayoutParams.f1640b = 2;
            this.f1615h.setLayoutParams(generateDefaultLayoutParams);
            this.f1615h.setOnClickListener(new ViewOnClickListenerC0365c());
        }
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f1615h;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f1615h;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        C0402h2 c0402h2 = this.f1627t;
        if (c0402h2 != null) {
            return c0402h2.m1741a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i10 = this.f1629v;
        if (i10 == Integer.MIN_VALUE) {
            return getContentInsetEnd();
        }
        return i10;
    }

    public int getContentInsetLeft() {
        C0402h2 c0402h2 = this.f1627t;
        if (c0402h2 != null) {
            return c0402h2.m1742b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        C0402h2 c0402h2 = this.f1627t;
        if (c0402h2 != null) {
            return c0402h2.m1743c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        C0402h2 c0402h2 = this.f1627t;
        if (c0402h2 != null) {
            return c0402h2.m1744d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i10 = this.f1628u;
        if (i10 == Integer.MIN_VALUE) {
            return getContentInsetStart();
        }
        return i10;
    }

    public int getCurrentContentInsetEnd() {
        boolean z10;
        C0325e m1478N;
        ActionMenuView actionMenuView = this.f1608a;
        if (actionMenuView != null && (m1478N = actionMenuView.m1478N()) != null && m1478N.hasVisibleItems()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return Math.max(getContentInsetEnd(), Math.max(this.f1629v, 0));
        }
        return getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        if (AbstractC0616q0.m2579B(this) == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        if (AbstractC0616q0.m2579B(this) == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        if (getNavigationIcon() != null) {
            return Math.max(getContentInsetStart(), Math.max(this.f1628u, 0));
        }
        return getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f1612e;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f1612e;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        m1554j();
        return this.f1608a.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f1611d;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f1611d;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    C0387e getOuterActionMenuPresenter() {
        return this.f1602I;
    }

    public Drawable getOverflowIcon() {
        m1554j();
        return this.f1608a.getOverflowIcon();
    }

    Context getPopupContext() {
        return this.f1617j;
    }

    public int getPopupTheme() {
        return this.f1618k;
    }

    public CharSequence getSubtitle() {
        return this.f1632y;
    }

    final TextView getSubtitleTextView() {
        return this.f1610c;
    }

    public CharSequence getTitle() {
        return this.f1631x;
    }

    public int getTitleMarginBottom() {
        return this.f1626s;
    }

    public int getTitleMarginEnd() {
        return this.f1624q;
    }

    public int getTitleMarginStart() {
        return this.f1623p;
    }

    public int getTitleMarginTop() {
        return this.f1625r;
    }

    final TextView getTitleTextView() {
        return this.f1609b;
    }

    public InterfaceC0417l1 getWrapper() {
        if (this.f1601H == null) {
            this.f1601H = new C0442r2(this, true);
        }
        return this.f1601H;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public C0367e generateDefaultLayoutParams() {
        return new C0367e(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public C0367e generateLayoutParams(AttributeSet attributeSet) {
        return new C0367e(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public C0367e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C0367e) {
            return new C0367e((C0367e) layoutParams);
        }
        if (layoutParams instanceof AbstractC0300a.a) {
            return new C0367e((AbstractC0300a.a) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C0367e((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C0367e(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f1607N);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1596C = false;
        }
        if (!this.f1596C) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f1596C = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1596C = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x029f A[LOOP:0: B:41:0x029d->B:42:0x029f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02c1 A[LOOP:1: B:45:0x02bf->B:46:0x02c1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02fa A[LOOP:2: B:54:0x02f8->B:55:0x02fa, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0227  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 783
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int[] iArr = this.f1599F;
        boolean m2027b = AbstractC0466x2.m2027b(this);
        int i19 = 0;
        int i20 = !m2027b ? 1 : 0;
        if (m1549M(this.f1611d)) {
            m1546E(this.f1611d, i10, 0, i11, 0, this.f1622o);
            i12 = this.f1611d.getMeasuredWidth() + m1560s(this.f1611d);
            i13 = Math.max(0, this.f1611d.getMeasuredHeight() + m1561t(this.f1611d));
            i14 = View.combineMeasuredStates(0, this.f1611d.getMeasuredState());
        } else {
            i12 = 0;
            i13 = 0;
            i14 = 0;
        }
        if (m1549M(this.f1615h)) {
            m1546E(this.f1615h, i10, 0, i11, 0, this.f1622o);
            i12 = this.f1615h.getMeasuredWidth() + m1560s(this.f1615h);
            i13 = Math.max(i13, this.f1615h.getMeasuredHeight() + m1561t(this.f1615h));
            i14 = View.combineMeasuredStates(i14, this.f1615h.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = 0 + Math.max(currentContentInsetStart, i12);
        iArr[m2027b ? 1 : 0] = Math.max(0, currentContentInsetStart - i12);
        if (m1549M(this.f1608a)) {
            m1546E(this.f1608a, i10, max, i11, 0, this.f1622o);
            i15 = this.f1608a.getMeasuredWidth() + m1560s(this.f1608a);
            i13 = Math.max(i13, this.f1608a.getMeasuredHeight() + m1561t(this.f1608a));
            i14 = View.combineMeasuredStates(i14, this.f1608a.getMeasuredState());
        } else {
            i15 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i15);
        iArr[i20] = Math.max(0, currentContentInsetEnd - i15);
        if (m1549M(this.f1616i)) {
            max2 += m1545D(this.f1616i, i10, max2, i11, 0, iArr);
            i13 = Math.max(i13, this.f1616i.getMeasuredHeight() + m1561t(this.f1616i));
            i14 = View.combineMeasuredStates(i14, this.f1616i.getMeasuredState());
        }
        if (m1549M(this.f1612e)) {
            max2 += m1545D(this.f1612e, i10, max2, i11, 0, iArr);
            i13 = Math.max(i13, this.f1612e.getMeasuredHeight() + m1561t(this.f1612e));
            i14 = View.combineMeasuredStates(i14, this.f1612e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i21 = 0; i21 < childCount; i21++) {
            View childAt = getChildAt(i21);
            if (((C0367e) childAt.getLayoutParams()).f1640b == 0 && m1549M(childAt)) {
                max2 += m1545D(childAt, i10, max2, i11, 0, iArr);
                i13 = Math.max(i13, childAt.getMeasuredHeight() + m1561t(childAt));
                i14 = View.combineMeasuredStates(i14, childAt.getMeasuredState());
            }
        }
        int i22 = this.f1625r + this.f1626s;
        int i23 = this.f1623p + this.f1624q;
        if (m1549M(this.f1609b)) {
            m1545D(this.f1609b, i10, max2 + i23, i11, i22, iArr);
            int measuredWidth = this.f1609b.getMeasuredWidth() + m1560s(this.f1609b);
            i18 = this.f1609b.getMeasuredHeight() + m1561t(this.f1609b);
            i16 = View.combineMeasuredStates(i14, this.f1609b.getMeasuredState());
            i17 = measuredWidth;
        } else {
            i16 = i14;
            i17 = 0;
            i18 = 0;
        }
        if (m1549M(this.f1610c)) {
            i17 = Math.max(i17, m1545D(this.f1610c, i10, max2 + i23, i11, i18 + i22, iArr));
            i18 += this.f1610c.getMeasuredHeight() + m1561t(this.f1610c);
            i16 = View.combineMeasuredStates(i16, this.f1610c.getMeasuredState());
        }
        int max3 = Math.max(i13, i18);
        int paddingLeft = max2 + i17 + getPaddingLeft() + getPaddingRight();
        int paddingTop = max3 + getPaddingTop() + getPaddingBottom();
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i10, (-16777216) & i16);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i11, i16 << 16);
        if (!m1548L()) {
            i19 = resolveSizeAndState2;
        }
        setMeasuredDimension(resolveSizeAndState, i19);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        C0325e c0325e;
        MenuItem findItem;
        if (!(parcelable instanceof C0369g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0369g c0369g = (C0369g) parcelable;
        super.onRestoreInstanceState(c0369g.m4828a());
        ActionMenuView actionMenuView = this.f1608a;
        if (actionMenuView != null) {
            c0325e = actionMenuView.m1478N();
        } else {
            c0325e = null;
        }
        int i10 = c0369g.f1641c;
        if (i10 != 0 && this.f1603J != null && c0325e != null && (findItem = c0325e.findItem(i10)) != null) {
            findItem.expandActionView();
        }
        if (c0369g.f1642d) {
            m1547F();
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        m1552h();
        C0402h2 c0402h2 = this.f1627t;
        boolean z10 = true;
        if (i10 != 1) {
            z10 = false;
        }
        c0402h2.m1746f(z10);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        C0327g c0327g;
        C0369g c0369g = new C0369g(super.onSaveInstanceState());
        C0366d c0366d = this.f1603J;
        if (c0366d != null && (c0327g = c0366d.f1638b) != null) {
            c0369g.f1641c = c0327g.getItemId();
        }
        c0369g.f1642d = m1564A();
        return c0369g;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1595B = false;
        }
        if (!this.f1595B) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1595B = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1595B = false;
        }
        return true;
    }

    public void setCollapseContentDescription(int i10) {
        setCollapseContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setCollapseIcon(int i10) {
        setCollapseIcon(AbstractC4105b.m17170d(getContext(), i10));
    }

    public void setCollapsible(boolean z10) {
        this.f1606M = z10;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.f1629v) {
            this.f1629v = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.f1628u) {
            this.f1628u = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i10) {
        setLogo(AbstractC4105b.m17170d(getContext(), i10));
    }

    public void setLogoDescription(int i10) {
        setLogoDescription(getContext().getText(i10));
    }

    public void setNavigationContentDescription(int i10) {
        setNavigationContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setNavigationIcon(int i10) {
        setNavigationIcon(AbstractC4105b.m17170d(getContext(), i10));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        m1556l();
        this.f1611d.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(InterfaceC0368f interfaceC0368f) {
    }

    public void setOverflowIcon(Drawable drawable) {
        m1554j();
        this.f1608a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i10) {
        if (this.f1618k != i10) {
            this.f1618k = i10;
            if (i10 == 0) {
                this.f1617j = getContext();
            } else {
                this.f1617j = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setSubtitle(int i10) {
        setSubtitle(getContext().getText(i10));
    }

    public void setSubtitleTextColor(int i10) {
        setSubtitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setTitle(int i10) {
        setTitle(getContext().getText(i10));
    }

    public void setTitleMarginBottom(int i10) {
        this.f1626s = i10;
        requestLayout();
    }

    public void setTitleMarginEnd(int i10) {
        this.f1624q = i10;
        requestLayout();
    }

    public void setTitleMarginStart(int i10) {
        this.f1623p = i10;
        requestLayout();
    }

    public void setTitleMarginTop(int i10) {
        this.f1625r = i10;
        requestLayout();
    }

    public void setTitleTextColor(int i10) {
        setTitleTextColor(ColorStateList.valueOf(i10));
    }

    /* renamed from: v */
    public boolean m1579v() {
        C0366d c0366d = this.f1603J;
        if (c0366d != null && c0366d.f1638b != null) {
            return true;
        }
        return false;
    }

    /* renamed from: w */
    public boolean m1580w() {
        ActionMenuView actionMenuView = this.f1608a;
        if (actionMenuView != null && actionMenuView.m1474H()) {
            return true;
        }
        return false;
    }

    /* renamed from: x */
    public void m1581x(int i10) {
        getMenuInflater().inflate(i10, getMenu());
    }

    /* renamed from: z */
    public boolean m1582z() {
        ActionMenuView actionMenuView = this.f1608a;
        if (actionMenuView != null && actionMenuView.m1475I()) {
            return true;
        }
        return false;
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$e */
    /* loaded from: classes.dex */
    public static class C0367e extends AbstractC0300a.a {

        /* renamed from: b */
        int f1640b;

        public C0367e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1640b = 0;
        }

        /* renamed from: a */
        void m1583a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public C0367e(int i10, int i11) {
            super(i10, i11);
            this.f1640b = 0;
            this.f1044a = 8388627;
        }

        public C0367e(C0367e c0367e) {
            super((AbstractC0300a.a) c0367e);
            this.f1640b = 0;
            this.f1640b = c0367e.f1640b;
        }

        public C0367e(AbstractC0300a.a aVar) {
            super(aVar);
            this.f1640b = 0;
        }

        public C0367e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f1640b = 0;
            m1583a(marginLayoutParams);
        }

        public C0367e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1640b = 0;
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1630w = 8388627;
        this.f1597D = new ArrayList();
        this.f1598E = new ArrayList();
        this.f1599F = new int[2];
        this.f1600G = new C0363a();
        this.f1607N = new RunnableC0364b();
        Context context2 = getContext();
        int[] iArr = R$styleable.f900O;
        C0438q2 m1874v = C0438q2.m1874v(context2, attributeSet, iArr, i10, 0);
        AbstractC0616q0.m2632l0(this, context, iArr, attributeSet, m1874v.m1892r(), i10, 0);
        this.f1619l = m1874v.m1888n(R$styleable.Toolbar_titleTextAppearance, 0);
        this.f1620m = m1874v.m1888n(R$styleable.Toolbar_subtitleTextAppearance, 0);
        this.f1630w = m1874v.m1886l(R$styleable.Toolbar_android_gravity, this.f1630w);
        this.f1621n = m1874v.m1886l(R$styleable.Toolbar_buttonGravity, 48);
        int m1879e = m1874v.m1879e(R$styleable.Toolbar_titleMargin, 0);
        int i11 = R$styleable.Toolbar_titleMargins;
        m1879e = m1874v.m1893s(i11) ? m1874v.m1879e(i11, m1879e) : m1879e;
        this.f1626s = m1879e;
        this.f1625r = m1879e;
        this.f1624q = m1879e;
        this.f1623p = m1879e;
        int m1879e2 = m1874v.m1879e(R$styleable.Toolbar_titleMarginStart, -1);
        if (m1879e2 >= 0) {
            this.f1623p = m1879e2;
        }
        int m1879e3 = m1874v.m1879e(R$styleable.Toolbar_titleMarginEnd, -1);
        if (m1879e3 >= 0) {
            this.f1624q = m1879e3;
        }
        int m1879e4 = m1874v.m1879e(R$styleable.Toolbar_titleMarginTop, -1);
        if (m1879e4 >= 0) {
            this.f1625r = m1879e4;
        }
        int m1879e5 = m1874v.m1879e(R$styleable.Toolbar_titleMarginBottom, -1);
        if (m1879e5 >= 0) {
            this.f1626s = m1879e5;
        }
        this.f1622o = m1874v.m1880f(R$styleable.Toolbar_maxButtonHeight, -1);
        int m1879e6 = m1874v.m1879e(R$styleable.Toolbar_contentInsetStart, Integer.MIN_VALUE);
        int m1879e7 = m1874v.m1879e(R$styleable.Toolbar_contentInsetEnd, Integer.MIN_VALUE);
        int m1880f = m1874v.m1880f(R$styleable.Toolbar_contentInsetLeft, 0);
        int m1880f2 = m1874v.m1880f(R$styleable.Toolbar_contentInsetRight, 0);
        m1552h();
        this.f1627t.m1745e(m1880f, m1880f2);
        if (m1879e6 != Integer.MIN_VALUE || m1879e7 != Integer.MIN_VALUE) {
            this.f1627t.m1747g(m1879e6, m1879e7);
        }
        this.f1628u = m1874v.m1879e(R$styleable.Toolbar_contentInsetStartWithNavigation, Integer.MIN_VALUE);
        this.f1629v = m1874v.m1879e(R$styleable.Toolbar_contentInsetEndWithActions, Integer.MIN_VALUE);
        this.f1613f = m1874v.m1881g(R$styleable.Toolbar_collapseIcon);
        this.f1614g = m1874v.m1890p(R$styleable.Toolbar_collapseContentDescription);
        CharSequence m1890p = m1874v.m1890p(R$styleable.Toolbar_title);
        if (!TextUtils.isEmpty(m1890p)) {
            setTitle(m1890p);
        }
        CharSequence m1890p2 = m1874v.m1890p(R$styleable.Toolbar_subtitle);
        if (!TextUtils.isEmpty(m1890p2)) {
            setSubtitle(m1890p2);
        }
        this.f1617j = getContext();
        setPopupTheme(m1874v.m1888n(R$styleable.Toolbar_popupTheme, 0));
        Drawable m1881g = m1874v.m1881g(R$styleable.Toolbar_navigationIcon);
        if (m1881g != null) {
            setNavigationIcon(m1881g);
        }
        CharSequence m1890p3 = m1874v.m1890p(R$styleable.Toolbar_navigationContentDescription);
        if (!TextUtils.isEmpty(m1890p3)) {
            setNavigationContentDescription(m1890p3);
        }
        Drawable m1881g2 = m1874v.m1881g(R$styleable.Toolbar_logo);
        if (m1881g2 != null) {
            setLogo(m1881g2);
        }
        CharSequence m1890p4 = m1874v.m1890p(R$styleable.Toolbar_logoDescription);
        if (!TextUtils.isEmpty(m1890p4)) {
            setLogoDescription(m1890p4);
        }
        int i12 = R$styleable.Toolbar_titleTextColor;
        if (m1874v.m1893s(i12)) {
            setTitleTextColor(m1874v.m1877c(i12));
        }
        int i13 = R$styleable.Toolbar_subtitleTextColor;
        if (m1874v.m1893s(i13)) {
            setSubtitleTextColor(m1874v.m1877c(i13));
        }
        int i14 = R$styleable.Toolbar_menu;
        if (m1874v.m1893s(i14)) {
            m1581x(m1874v.m1888n(i14, 0));
        }
        m1874v.m1894w();
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m1575g();
        }
        ImageButton imageButton = this.f1615h;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            m1575g();
            this.f1615h.setImageDrawable(drawable);
        } else {
            ImageButton imageButton = this.f1615h;
            if (imageButton != null) {
                imageButton.setImageDrawable(this.f1613f);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            m1553i();
            if (!m1563y(this.f1612e)) {
                m1551c(this.f1612e, true);
            }
        } else {
            ImageView imageView = this.f1612e;
            if (imageView != null && m1563y(imageView)) {
                removeView(this.f1612e);
                this.f1598E.remove(this.f1612e);
            }
        }
        ImageView imageView2 = this.f1612e;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m1553i();
        }
        ImageView imageView = this.f1612e;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m1556l();
        }
        ImageButton imageButton = this.f1611d;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            m1556l();
            if (!m1563y(this.f1611d)) {
                m1551c(this.f1611d, true);
            }
        } else {
            ImageButton imageButton = this.f1611d;
            if (imageButton != null && m1563y(imageButton)) {
                removeView(this.f1611d);
                this.f1598E.remove(this.f1611d);
            }
        }
        ImageButton imageButton2 = this.f1611d;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f1610c == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.f1610c = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f1610c.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f1620m;
                if (i10 != 0) {
                    this.f1610c.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.f1594A;
                if (colorStateList != null) {
                    this.f1610c.setTextColor(colorStateList);
                }
            }
            if (!m1563y(this.f1610c)) {
                m1551c(this.f1610c, true);
            }
        } else {
            TextView textView = this.f1610c;
            if (textView != null && m1563y(textView)) {
                removeView(this.f1610c);
                this.f1598E.remove(this.f1610c);
            }
        }
        TextView textView2 = this.f1610c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f1632y = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f1594A = colorStateList;
        TextView textView = this.f1610c;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f1609b == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.f1609b = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f1609b.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f1619l;
                if (i10 != 0) {
                    this.f1609b.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.f1633z;
                if (colorStateList != null) {
                    this.f1609b.setTextColor(colorStateList);
                }
            }
            if (!m1563y(this.f1609b)) {
                m1551c(this.f1609b, true);
            }
        } else {
            TextView textView = this.f1609b;
            if (textView != null && m1563y(textView)) {
                removeView(this.f1609b);
                this.f1598E.remove(this.f1609b);
            }
        }
        TextView textView2 = this.f1609b;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f1631x = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f1633z = colorStateList;
        TextView textView = this.f1609b;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$g */
    /* loaded from: classes.dex */
    public static class C0369g extends AbstractC1031a {
        public static final Parcelable.Creator<C0369g> CREATOR = new a();

        /* renamed from: c */
        int f1641c;

        /* renamed from: d */
        boolean f1642d;

        /* renamed from: androidx.appcompat.widget.Toolbar$g$a */
        /* loaded from: classes.dex */
        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public C0369g createFromParcel(Parcel parcel) {
                return new C0369g(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public C0369g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0369g(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public C0369g[] newArray(int i10) {
                return new C0369g[i10];
            }
        }

        public C0369g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1641c = parcel.readInt();
            this.f1642d = parcel.readInt() != 0;
        }

        @Override // p020b0.AbstractC1031a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f1641c);
            parcel.writeInt(this.f1642d ? 1 : 0);
        }

        public C0369g(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
