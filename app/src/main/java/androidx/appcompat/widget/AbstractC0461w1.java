package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.R$styleable;
import androidx.core.view.AbstractC0616q0;
import androidx.core.widget.AbstractC0683r;
import java.lang.reflect.Method;
import p150h.InterfaceC4458e;

/* renamed from: androidx.appcompat.widget.w1 */
/* loaded from: classes.dex */
public abstract class AbstractC0461w1 implements InterfaceC4458e {

    /* renamed from: G */
    private static Method f1971G;

    /* renamed from: H */
    private static Method f1972H;

    /* renamed from: I */
    private static Method f1973I;

    /* renamed from: A */
    private Runnable f1974A;

    /* renamed from: B */
    final Handler f1975B;

    /* renamed from: C */
    private final Rect f1976C;

    /* renamed from: D */
    private Rect f1977D;

    /* renamed from: E */
    private boolean f1978E;

    /* renamed from: F */
    PopupWindow f1979F;

    /* renamed from: a */
    private Context f1980a;

    /* renamed from: b */
    private ListAdapter f1981b;

    /* renamed from: c */
    C0433p1 f1982c;

    /* renamed from: d */
    private int f1983d;

    /* renamed from: e */
    private int f1984e;

    /* renamed from: f */
    private int f1985f;

    /* renamed from: g */
    private int f1986g;

    /* renamed from: h */
    private int f1987h;

    /* renamed from: i */
    private boolean f1988i;

    /* renamed from: j */
    private boolean f1989j;

    /* renamed from: k */
    private boolean f1990k;

    /* renamed from: l */
    private int f1991l;

    /* renamed from: m */
    private boolean f1992m;

    /* renamed from: n */
    private boolean f1993n;

    /* renamed from: o */
    int f1994o;

    /* renamed from: p */
    private View f1995p;

    /* renamed from: q */
    private int f1996q;

    /* renamed from: r */
    private DataSetObserver f1997r;

    /* renamed from: s */
    private View f1998s;

    /* renamed from: t */
    private Drawable f1999t;

    /* renamed from: u */
    private AdapterView.OnItemClickListener f2000u;

    /* renamed from: v */
    private AdapterView.OnItemSelectedListener f2001v;

    /* renamed from: w */
    final g f2002w;

    /* renamed from: x */
    private final f f2003x;

    /* renamed from: y */
    private final e f2004y;

    /* renamed from: z */
    private final c f2005z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.w1$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View m2014r = AbstractC0461w1.this.m2014r();
            if (m2014r != null && m2014r.getWindowToken() != null) {
                AbstractC0461w1.this.show();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.w1$b */
    /* loaded from: classes.dex */
    public class b implements AdapterView.OnItemSelectedListener {
        b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            C0433p1 c0433p1;
            if (i10 != -1 && (c0433p1 = AbstractC0461w1.this.f1982c) != null) {
                c0433p1.setListSelectionHidden(false);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.w1$c */
    /* loaded from: classes.dex */
    public class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC0461w1.this.m2013p();
        }
    }

    /* renamed from: androidx.appcompat.widget.w1$d */
    /* loaded from: classes.dex */
    private class d extends DataSetObserver {
        d() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (AbstractC0461w1.this.isShowing()) {
                AbstractC0461w1.this.show();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            AbstractC0461w1.this.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.w1$e */
    /* loaded from: classes.dex */
    public class e implements AbsListView.OnScrollListener {
        e() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i10, int i11, int i12) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i10) {
            if (i10 == 1 && !AbstractC0461w1.this.m2016u() && AbstractC0461w1.this.f1979F.getContentView() != null) {
                AbstractC0461w1 abstractC0461w1 = AbstractC0461w1.this;
                abstractC0461w1.f1975B.removeCallbacks(abstractC0461w1.f2002w);
                AbstractC0461w1.this.f2002w.run();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.w1$f */
    /* loaded from: classes.dex */
    public class f implements View.OnTouchListener {
        f() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = AbstractC0461w1.this.f1979F) != null && popupWindow.isShowing() && x10 >= 0 && x10 < AbstractC0461w1.this.f1979F.getWidth() && y10 >= 0 && y10 < AbstractC0461w1.this.f1979F.getHeight()) {
                AbstractC0461w1 abstractC0461w1 = AbstractC0461w1.this;
                abstractC0461w1.f1975B.postDelayed(abstractC0461w1.f2002w, 250L);
                return false;
            }
            if (action == 1) {
                AbstractC0461w1 abstractC0461w12 = AbstractC0461w1.this;
                abstractC0461w12.f1975B.removeCallbacks(abstractC0461w12.f2002w);
                return false;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.w1$g */
    /* loaded from: classes.dex */
    public class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0433p1 c0433p1 = AbstractC0461w1.this.f1982c;
            if (c0433p1 != null && AbstractC0616q0.m2599Q(c0433p1) && AbstractC0461w1.this.f1982c.getCount() > AbstractC0461w1.this.f1982c.getChildCount()) {
                int childCount = AbstractC0461w1.this.f1982c.getChildCount();
                AbstractC0461w1 abstractC0461w1 = AbstractC0461w1.this;
                if (childCount <= abstractC0461w1.f1994o) {
                    abstractC0461w1.f1979F.setInputMethodMode(2);
                    AbstractC0461w1.this.show();
                }
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f1971G = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f1973I = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                f1972H = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public AbstractC0461w1(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    /* renamed from: H */
    private void m1993H(boolean z10) {
        if (Build.VERSION.SDK_INT > 28) {
            this.f1979F.setIsClippedToScreen(z10);
            return;
        }
        Method method = f1971G;
        if (method != null) {
            try {
                method.invoke(this.f1979F, Boolean.valueOf(z10));
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
        }
    }

    /* renamed from: o */
    private int m1994o() {
        int i10;
        int i11;
        int makeMeasureSpec;
        int i12;
        boolean z10 = true;
        if (this.f1982c == null) {
            Context context = this.f1980a;
            this.f1974A = new a();
            C0433p1 mo1628q = mo1628q(context, !this.f1978E);
            this.f1982c = mo1628q;
            Drawable drawable = this.f1999t;
            if (drawable != null) {
                mo1628q.setSelector(drawable);
            }
            this.f1982c.setAdapter(this.f1981b);
            this.f1982c.setOnItemClickListener(this.f2000u);
            this.f1982c.setFocusable(true);
            this.f1982c.setFocusableInTouchMode(true);
            this.f1982c.setOnItemSelectedListener(new b());
            this.f1982c.setOnScrollListener(this.f2004y);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f2001v;
            if (onItemSelectedListener != null) {
                this.f1982c.setOnItemSelectedListener(onItemSelectedListener);
            }
            View view = this.f1982c;
            View view2 = this.f1995p;
            if (view2 != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                int i13 = this.f1996q;
                if (i13 != 0) {
                    if (i13 != 1) {
                        Log.e("ListPopupWindow", "Invalid hint position " + this.f1996q);
                    } else {
                        linearLayout.addView(view, layoutParams);
                        linearLayout.addView(view2);
                    }
                } else {
                    linearLayout.addView(view2);
                    linearLayout.addView(view, layoutParams);
                }
                int i14 = this.f1984e;
                if (i14 >= 0) {
                    i12 = Integer.MIN_VALUE;
                } else {
                    i14 = 0;
                    i12 = 0;
                }
                view2.measure(View.MeasureSpec.makeMeasureSpec(i14, i12), 0);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view2.getLayoutParams();
                i10 = view2.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
                view = linearLayout;
            } else {
                i10 = 0;
            }
            this.f1979F.setContentView(view);
        } else {
            View view3 = this.f1995p;
            if (view3 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view3.getLayoutParams();
                i10 = view3.getMeasuredHeight() + layoutParams3.topMargin + layoutParams3.bottomMargin;
            } else {
                i10 = 0;
            }
        }
        Drawable background = this.f1979F.getBackground();
        if (background != null) {
            background.getPadding(this.f1976C);
            Rect rect = this.f1976C;
            int i15 = rect.top;
            i11 = rect.bottom + i15;
            if (!this.f1988i) {
                this.f1986g = -i15;
            }
        } else {
            this.f1976C.setEmpty();
            i11 = 0;
        }
        if (this.f1979F.getInputMethodMode() != 2) {
            z10 = false;
        }
        int m1995s = m1995s(m2014r(), this.f1986g, z10);
        if (!this.f1992m && this.f1983d != -1) {
            int i16 = this.f1984e;
            if (i16 != -2) {
                if (i16 != -1) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i16, 1073741824);
                } else {
                    int i17 = this.f1980a.getResources().getDisplayMetrics().widthPixels;
                    Rect rect2 = this.f1976C;
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i17 - (rect2.left + rect2.right), 1073741824);
                }
            } else {
                int i18 = this.f1980a.getResources().getDisplayMetrics().widthPixels;
                Rect rect3 = this.f1976C;
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i18 - (rect3.left + rect3.right), Integer.MIN_VALUE);
            }
            int mo1629d = this.f1982c.mo1629d(makeMeasureSpec, 0, -1, m1995s - i10, -1);
            if (mo1629d > 0) {
                i10 += i11 + this.f1982c.getPaddingTop() + this.f1982c.getPaddingBottom();
            }
            return mo1629d + i10;
        }
        return m1995s + i11;
    }

    /* renamed from: s */
    private int m1995s(View view, int i10, boolean z10) {
        int maxAvailableHeight;
        if (Build.VERSION.SDK_INT > 23) {
            maxAvailableHeight = this.f1979F.getMaxAvailableHeight(view, i10, z10);
            return maxAvailableHeight;
        }
        Method method = f1972H;
        if (method != null) {
            try {
                return ((Integer) method.invoke(this.f1979F, view, Integer.valueOf(i10), Boolean.valueOf(z10))).intValue();
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
            }
        }
        return this.f1979F.getMaxAvailableHeight(view, i10);
    }

    /* renamed from: w */
    private void m1996w() {
        View view = this.f1995p;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f1995p);
            }
        }
    }

    /* renamed from: A */
    public void m1997A(int i10) {
        this.f1991l = i10;
    }

    /* renamed from: B */
    public void m1998B(Rect rect) {
        Rect rect2;
        if (rect != null) {
            rect2 = new Rect(rect);
        } else {
            rect2 = null;
        }
        this.f1977D = rect2;
    }

    /* renamed from: C */
    public void m1999C(int i10) {
        this.f1979F.setInputMethodMode(i10);
    }

    /* renamed from: D */
    public void m2000D(boolean z10) {
        this.f1978E = z10;
        this.f1979F.setFocusable(z10);
    }

    /* renamed from: E */
    public void m2001E(PopupWindow.OnDismissListener onDismissListener) {
        this.f1979F.setOnDismissListener(onDismissListener);
    }

    /* renamed from: F */
    public void m2002F(AdapterView.OnItemClickListener onItemClickListener) {
        this.f2000u = onItemClickListener;
    }

    /* renamed from: G */
    public void m2003G(boolean z10) {
        this.f1990k = true;
        this.f1989j = z10;
    }

    /* renamed from: I */
    public void m2004I(int i10) {
        this.f1996q = i10;
    }

    /* renamed from: J */
    public void m2005J(int i10) {
        C0433p1 c0433p1 = this.f1982c;
        if (isShowing() && c0433p1 != null) {
            c0433p1.setListSelectionHidden(false);
            c0433p1.setSelection(i10);
            if (c0433p1.getChoiceMode() != 0) {
                c0433p1.setItemChecked(i10, true);
            }
        }
    }

    /* renamed from: K */
    public void m2006K(int i10) {
        this.f1984e = i10;
    }

    /* renamed from: a */
    public int m2007a() {
        return this.f1985f;
    }

    /* renamed from: c */
    public void m2008c(int i10) {
        this.f1985f = i10;
    }

    @Override // p150h.InterfaceC4458e
    public void dismiss() {
        this.f1979F.dismiss();
        m1996w();
        this.f1979F.setContentView(null);
        this.f1982c = null;
        this.f1975B.removeCallbacks(this.f2002w);
    }

    /* renamed from: f */
    public Drawable m2009f() {
        return this.f1979F.getBackground();
    }

    @Override // p150h.InterfaceC4458e
    /* renamed from: h */
    public ListView mo1301h() {
        return this.f1982c;
    }

    /* renamed from: i */
    public void m2010i(Drawable drawable) {
        this.f1979F.setBackgroundDrawable(drawable);
    }

    @Override // p150h.InterfaceC4458e
    public boolean isShowing() {
        return this.f1979F.isShowing();
    }

    /* renamed from: j */
    public void m2011j(int i10) {
        this.f1986g = i10;
        this.f1988i = true;
    }

    /* renamed from: m */
    public int m2012m() {
        if (!this.f1988i) {
            return 0;
        }
        return this.f1986g;
    }

    /* renamed from: n */
    public void mo1616n(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f1997r;
        if (dataSetObserver == null) {
            this.f1997r = new d();
        } else {
            ListAdapter listAdapter2 = this.f1981b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f1981b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f1997r);
        }
        C0433p1 c0433p1 = this.f1982c;
        if (c0433p1 != null) {
            c0433p1.setAdapter(this.f1981b);
        }
    }

    /* renamed from: p */
    public void m2013p() {
        C0433p1 c0433p1 = this.f1982c;
        if (c0433p1 != null) {
            c0433p1.setListSelectionHidden(true);
            c0433p1.requestLayout();
        }
    }

    /* renamed from: q */
    C0433p1 mo1628q(Context context, boolean z10) {
        return new C0433p1(context, z10);
    }

    /* renamed from: r */
    public View m2014r() {
        return this.f1998s;
    }

    @Override // p150h.InterfaceC4458e
    public void show() {
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        int m1994o = m1994o();
        boolean m2016u = m2016u();
        AbstractC0683r.m2980b(this.f1979F, this.f1987h);
        boolean z11 = true;
        if (this.f1979F.isShowing()) {
            if (!AbstractC0616q0.m2599Q(m2014r())) {
                return;
            }
            int i14 = this.f1984e;
            if (i14 == -1) {
                i14 = -1;
            } else if (i14 == -2) {
                i14 = m2014r().getWidth();
            }
            int i15 = this.f1983d;
            if (i15 == -1) {
                if (!m2016u) {
                    m1994o = -1;
                }
                if (m2016u) {
                    PopupWindow popupWindow = this.f1979F;
                    if (this.f1984e == -1) {
                        i13 = -1;
                    } else {
                        i13 = 0;
                    }
                    popupWindow.setWidth(i13);
                    this.f1979F.setHeight(0);
                } else {
                    PopupWindow popupWindow2 = this.f1979F;
                    if (this.f1984e == -1) {
                        i12 = -1;
                    } else {
                        i12 = 0;
                    }
                    popupWindow2.setWidth(i12);
                    this.f1979F.setHeight(-1);
                }
            } else if (i15 != -2) {
                m1994o = i15;
            }
            PopupWindow popupWindow3 = this.f1979F;
            if (this.f1993n || this.f1992m) {
                z11 = false;
            }
            popupWindow3.setOutsideTouchable(z11);
            PopupWindow popupWindow4 = this.f1979F;
            View m2014r = m2014r();
            int i16 = this.f1985f;
            int i17 = this.f1986g;
            if (i14 < 0) {
                i10 = -1;
            } else {
                i10 = i14;
            }
            if (m1994o < 0) {
                i11 = -1;
            } else {
                i11 = m1994o;
            }
            popupWindow4.update(m2014r, i16, i17, i10, i11);
            return;
        }
        int i18 = this.f1984e;
        if (i18 == -1) {
            i18 = -1;
        } else if (i18 == -2) {
            i18 = m2014r().getWidth();
        }
        int i19 = this.f1983d;
        if (i19 == -1) {
            m1994o = -1;
        } else if (i19 != -2) {
            m1994o = i19;
        }
        this.f1979F.setWidth(i18);
        this.f1979F.setHeight(m1994o);
        m1993H(true);
        PopupWindow popupWindow5 = this.f1979F;
        if (!this.f1993n && !this.f1992m) {
            z10 = true;
        } else {
            z10 = false;
        }
        popupWindow5.setOutsideTouchable(z10);
        this.f1979F.setTouchInterceptor(this.f2003x);
        if (this.f1990k) {
            AbstractC0683r.m2979a(this.f1979F, this.f1989j);
        }
        if (Build.VERSION.SDK_INT > 28) {
            this.f1979F.setEpicenterBounds(this.f1977D);
        } else {
            Method method = f1973I;
            if (method != null) {
                try {
                    method.invoke(this.f1979F, this.f1977D);
                } catch (Exception e10) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e10);
                }
            }
        }
        AbstractC0683r.m2981c(this.f1979F, m2014r(), this.f1985f, this.f1986g, this.f1991l);
        this.f1982c.setSelection(-1);
        if (!this.f1978E || this.f1982c.isInTouchMode()) {
            m2013p();
        }
        if (!this.f1978E) {
            this.f1975B.post(this.f2005z);
        }
    }

    /* renamed from: t */
    public int m2015t() {
        return this.f1984e;
    }

    /* renamed from: u */
    public boolean m2016u() {
        if (this.f1979F.getInputMethodMode() == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: v */
    public boolean m2017v() {
        return this.f1978E;
    }

    /* renamed from: x */
    public void m2018x(View view) {
        this.f1998s = view;
    }

    /* renamed from: y */
    public void m2019y(int i10) {
        this.f1979F.setAnimationStyle(i10);
    }

    /* renamed from: z */
    public void m2020z(int i10) {
        Drawable background = this.f1979F.getBackground();
        if (background != null) {
            background.getPadding(this.f1976C);
            Rect rect = this.f1976C;
            this.f1984e = rect.left + rect.right + i10;
            return;
        }
        m2006K(i10);
    }

    public AbstractC0461w1(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f1983d = -2;
        this.f1984e = -2;
        this.f1987h = 1002;
        this.f1991l = 0;
        this.f1992m = false;
        this.f1993n = false;
        this.f1994o = Integer.MAX_VALUE;
        this.f1996q = 0;
        this.f2002w = new g();
        this.f2003x = new f();
        this.f2004y = new e();
        this.f2005z = new c();
        this.f1976C = new Rect();
        this.f1980a = context;
        this.f1975B = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.f887B, i10, i11);
        this.f1985f = obtainStyledAttributes.getDimensionPixelOffset(R$styleable.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(R$styleable.ListPopupWindow_android_dropDownVerticalOffset, 0);
        this.f1986g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f1988i = true;
        }
        obtainStyledAttributes.recycle();
        C0447t c0447t = new C0447t(context, attributeSet, i10, i11);
        this.f1979F = c0447t;
        c0447t.setInputMethodMode(1);
    }
}
