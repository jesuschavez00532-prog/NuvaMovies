package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.R$attr;
import androidx.core.view.C0589j1;
import androidx.core.widget.C0680o;
import java.lang.reflect.Field;
import p121f.AbstractC4204e;
import p290q.AbstractC6306k;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.widget.p1 */
/* loaded from: classes.dex */
public class C0433p1 extends ListView {

    /* renamed from: a */
    private final Rect f1844a;

    /* renamed from: b */
    private int f1845b;

    /* renamed from: c */
    private int f1846c;

    /* renamed from: d */
    private int f1847d;

    /* renamed from: e */
    private int f1848e;

    /* renamed from: f */
    private int f1849f;

    /* renamed from: g */
    private Field f1850g;

    /* renamed from: h */
    private a f1851h;

    /* renamed from: i */
    private boolean f1852i;

    /* renamed from: j */
    private boolean f1853j;

    /* renamed from: k */
    private boolean f1854k;

    /* renamed from: l */
    private C0589j1 f1855l;

    /* renamed from: m */
    private C0680o f1856m;

    /* renamed from: n */
    b f1857n;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.p1$a */
    /* loaded from: classes.dex */
    public static class a extends AbstractC4204e {

        /* renamed from: b */
        private boolean f1858b;

        a(Drawable drawable) {
            super(drawable);
            this.f1858b = true;
        }

        /* renamed from: c */
        void m1858c(boolean z10) {
            this.f1858b = z10;
        }

        @Override // p121f.AbstractC4204e, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.f1858b) {
                super.draw(canvas);
            }
        }

        @Override // p121f.AbstractC4204e, android.graphics.drawable.Drawable
        public void setHotspot(float f10, float f11) {
            if (this.f1858b) {
                super.setHotspot(f10, f11);
            }
        }

        @Override // p121f.AbstractC4204e, android.graphics.drawable.Drawable
        public void setHotspotBounds(int i10, int i11, int i12, int i13) {
            if (this.f1858b) {
                super.setHotspotBounds(i10, i11, i12, i13);
            }
        }

        @Override // p121f.AbstractC4204e, android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
            if (this.f1858b) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // p121f.AbstractC4204e, android.graphics.drawable.Drawable
        public boolean setVisible(boolean z10, boolean z11) {
            if (this.f1858b) {
                return super.setVisible(z10, z11);
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.p1$b */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        b() {
        }

        /* renamed from: a */
        public void m1859a() {
            C0433p1 c0433p1 = C0433p1.this;
            c0433p1.f1857n = null;
            c0433p1.removeCallbacks(this);
        }

        /* renamed from: b */
        public void m1860b() {
            C0433p1.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            C0433p1 c0433p1 = C0433p1.this;
            c0433p1.f1857n = null;
            c0433p1.drawableStateChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0433p1(Context context, boolean z10) {
        super(context, null, R$attr.dropDownListViewStyle);
        this.f1844a = new Rect();
        this.f1845b = 0;
        this.f1846c = 0;
        this.f1847d = 0;
        this.f1848e = 0;
        this.f1853j = z10;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f1850g = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e10) {
            e10.printStackTrace();
        }
    }

    /* renamed from: a */
    private void m1848a() {
        this.f1854k = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f1849f - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        C0589j1 c0589j1 = this.f1855l;
        if (c0589j1 != null) {
            c0589j1.m2484b();
            this.f1855l = null;
        }
    }

    /* renamed from: b */
    private void m1849b(View view, int i10) {
        performItemClick(view, i10, getItemIdAtPosition(i10));
    }

    /* renamed from: c */
    private void m1850c(Canvas canvas) {
        Drawable selector;
        if (!this.f1844a.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(this.f1844a);
            selector.draw(canvas);
        }
    }

    /* renamed from: f */
    private void m1851f(int i10, View view) {
        boolean z10;
        Rect rect = this.f1844a;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f1845b;
        rect.top -= this.f1846c;
        rect.right += this.f1847d;
        rect.bottom += this.f1848e;
        try {
            boolean z11 = this.f1850g.getBoolean(this);
            if (view.isEnabled() != z11) {
                Field field = this.f1850g;
                if (!z11) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                field.set(this, Boolean.valueOf(z10));
                if (i10 != -1) {
                    refreshDrawableState();
                }
            }
        } catch (IllegalAccessException e10) {
            e10.printStackTrace();
        }
    }

    /* renamed from: g */
    private void m1852g(int i10, View view) {
        boolean z10;
        Drawable selector = getSelector();
        boolean z11 = true;
        if (selector != null && i10 != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            selector.setVisible(false, false);
        }
        m1851f(i10, view);
        if (z10) {
            Rect rect = this.f1844a;
            float exactCenterX = rect.exactCenterX();
            float exactCenterY = rect.exactCenterY();
            if (getVisibility() != 0) {
                z11 = false;
            }
            selector.setVisible(z11, false);
            AbstractC6306k.m25065k(selector, exactCenterX, exactCenterY);
        }
    }

    /* renamed from: h */
    private void m1853h(int i10, View view, float f10, float f11) {
        m1852g(i10, view);
        Drawable selector = getSelector();
        if (selector != null && i10 != -1) {
            AbstractC6306k.m25065k(selector, f10, f11);
        }
    }

    /* renamed from: i */
    private void m1854i(View view, int i10, float f10, float f11) {
        View childAt;
        this.f1854k = true;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 21) {
            drawableHotspotChanged(f10, f11);
        }
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i12 = this.f1849f;
        if (i12 != -1 && (childAt = getChildAt(i12 - getFirstVisiblePosition())) != null && childAt != view && childAt.isPressed()) {
            childAt.setPressed(false);
        }
        this.f1849f = i10;
        float left = f10 - view.getLeft();
        float top = f11 - view.getTop();
        if (i11 >= 21) {
            view.drawableHotspotChanged(left, top);
        }
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        m1853h(i10, view, f10, f11);
        m1855j(false);
        refreshDrawableState();
    }

    /* renamed from: j */
    private void m1855j(boolean z10) {
        a aVar = this.f1851h;
        if (aVar != null) {
            aVar.m1858c(z10);
        }
    }

    /* renamed from: k */
    private boolean m1856k() {
        return this.f1854k;
    }

    /* renamed from: l */
    private void m1857l() {
        Drawable selector = getSelector();
        if (selector != null && m1856k() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    /* renamed from: d */
    public int mo1629d(int i10, int i11, int i12, int i13, int i14) {
        int makeMeasureSpec;
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i15 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        View view = null;
        int i16 = 0;
        int i17 = 0;
        for (int i18 = 0; i18 < count; i18++) {
            int itemViewType = adapter.getItemViewType(i18);
            if (itemViewType != i16) {
                view = null;
                i16 = itemViewType;
            }
            view = adapter.getView(i18, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i19 = layoutParams.height;
            if (i19 > 0) {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i19, 1073741824);
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            view.measure(i10, makeMeasureSpec);
            view.forceLayout();
            if (i18 > 0) {
                i15 += dividerHeight;
            }
            i15 += view.getMeasuredHeight();
            if (i15 >= i13) {
                if (i14 >= 0 && i18 > i14 && i17 > 0 && i15 != i13) {
                    return i17;
                }
                return i13;
            }
            if (i14 >= 0 && i18 >= i14) {
                i17 = i15;
            }
        }
        return i15;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        m1850c(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.f1857n != null) {
            return;
        }
        super.drawableStateChanged();
        m1855j(true);
        m1857l();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000c, code lost:
    
        if (r0 != 3) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0048 A[ADDED_TO_REGION] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean mo1630e(android.view.MotionEvent r8, int r9) {
        /*
            r7 = this;
            int r0 = r8.getActionMasked()
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L16
            r3 = 2
            if (r0 == r3) goto L14
            r9 = 3
            if (r0 == r9) goto L11
        Le:
            r9 = 0
            r3 = 1
            goto L46
        L11:
            r9 = 0
            r3 = 0
            goto L46
        L14:
            r3 = 1
            goto L17
        L16:
            r3 = 0
        L17:
            int r9 = r8.findPointerIndex(r9)
            if (r9 >= 0) goto L1e
            goto L11
        L1e:
            float r4 = r8.getX(r9)
            int r4 = (int) r4
            float r9 = r8.getY(r9)
            int r9 = (int) r9
            int r5 = r7.pointToPosition(r4, r9)
            r6 = -1
            if (r5 != r6) goto L31
            r9 = 1
            goto L46
        L31:
            int r3 = r7.getFirstVisiblePosition()
            int r3 = r5 - r3
            android.view.View r3 = r7.getChildAt(r3)
            float r4 = (float) r4
            float r9 = (float) r9
            r7.m1854i(r3, r5, r4, r9)
            if (r0 != r1) goto Le
            r7.m1849b(r3, r5)
            goto Le
        L46:
            if (r3 == 0) goto L4a
            if (r9 == 0) goto L4d
        L4a:
            r7.m1848a()
        L4d:
            if (r3 == 0) goto L65
            androidx.core.widget.o r9 = r7.f1856m
            if (r9 != 0) goto L5a
            androidx.core.widget.o r9 = new androidx.core.widget.o
            r9.<init>(r7)
            r7.f1856m = r9
        L5a:
            androidx.core.widget.o r9 = r7.f1856m
            r9.m2903m(r1)
            androidx.core.widget.o r9 = r7.f1856m
            r9.onTouch(r7, r8)
            goto L6c
        L65:
            androidx.core.widget.o r8 = r7.f1856m
            if (r8 == 0) goto L6c
            r8.m2903m(r2)
        L6c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0433p1.mo1630e(android.view.MotionEvent, int):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        if (!this.f1853j && !super.hasFocus()) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        if (!this.f1853j && !super.hasWindowFocus()) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean isFocused() {
        if (!this.f1853j && !super.isFocused()) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        if ((this.f1853j && this.f1852i) || super.isInTouchMode()) {
            return true;
        }
        return false;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.f1857n = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f1857n == null) {
            b bVar = new b();
            this.f1857n = bVar;
            bVar.m1860b();
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
        } else {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
                m1857l();
            }
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f1849f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        b bVar = this.f1857n;
        if (bVar != null) {
            bVar.m1859a();
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setListSelectionHidden(boolean z10) {
        this.f1852i = z10;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        a aVar;
        if (drawable != null) {
            aVar = new a(drawable);
        } else {
            aVar = null;
        }
        this.f1851h = aVar;
        super.setSelector(aVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f1845b = rect.left;
        this.f1846c = rect.top;
        this.f1847d = rect.right;
        this.f1848e = rect.bottom;
    }
}
