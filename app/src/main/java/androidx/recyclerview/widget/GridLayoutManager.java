package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import p389x.C7458h0;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    private static final boolean DEBUG = false;
    public static final int DEFAULT_SPAN_COUNT = -1;
    private static final String TAG = "GridLayoutManager";
    int[] mCachedBorders;
    final Rect mDecorInsets;
    boolean mPendingSpanCountChange;
    final SparseIntArray mPreLayoutSpanIndexCache;
    final SparseIntArray mPreLayoutSpanSizeCache;
    View[] mSet;
    int mSpanCount;
    AbstractC0771c mSpanSizeLookup;
    private boolean mUsingSpansToEstimateScrollBarDimensions;

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$a */
    /* loaded from: classes.dex */
    public static final class C0769a extends AbstractC0771c {
        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0771c
        /* renamed from: e */
        public int mo3777e(int i10, int i11) {
            return i10 % i11;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0771c
        /* renamed from: f */
        public int mo3778f(int i10) {
            return 1;
        }
    }

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$c */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0771c {

        /* renamed from: a */
        final SparseIntArray f3178a = new SparseIntArray();

        /* renamed from: b */
        final SparseIntArray f3179b = new SparseIntArray();

        /* renamed from: c */
        private boolean f3180c = false;

        /* renamed from: d */
        private boolean f3181d = false;

        /* renamed from: a */
        static int m3781a(SparseIntArray sparseIntArray, int i10) {
            int size = sparseIntArray.size() - 1;
            int i11 = 0;
            while (i11 <= size) {
                int i12 = (i11 + size) >>> 1;
                if (sparseIntArray.keyAt(i12) < i10) {
                    i11 = i12 + 1;
                } else {
                    size = i12 - 1;
                }
            }
            int i13 = i11 - 1;
            if (i13 >= 0 && i13 < sparseIntArray.size()) {
                return sparseIntArray.keyAt(i13);
            }
            return -1;
        }

        /* renamed from: b */
        int m3782b(int i10, int i11) {
            if (!this.f3181d) {
                return m3784d(i10, i11);
            }
            int i12 = this.f3179b.get(i10, -1);
            if (i12 != -1) {
                return i12;
            }
            int m3784d = m3784d(i10, i11);
            this.f3179b.put(i10, m3784d);
            return m3784d;
        }

        /* renamed from: c */
        int m3783c(int i10, int i11) {
            if (!this.f3180c) {
                return mo3777e(i10, i11);
            }
            int i12 = this.f3178a.get(i10, -1);
            if (i12 != -1) {
                return i12;
            }
            int mo3777e = mo3777e(i10, i11);
            this.f3178a.put(i10, mo3777e);
            return mo3777e;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
        /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
        /* renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int m3784d(int r7, int r8) {
            /*
                r6 = this;
                boolean r0 = r6.f3181d
                r1 = 0
                if (r0 == 0) goto L24
                android.util.SparseIntArray r0 = r6.f3179b
                int r0 = m3781a(r0, r7)
                r2 = -1
                if (r0 == r2) goto L24
                android.util.SparseIntArray r2 = r6.f3179b
                int r2 = r2.get(r0)
                int r3 = r0 + 1
                int r4 = r6.m3783c(r0, r8)
                int r0 = r6.mo3778f(r0)
                int r4 = r4 + r0
                if (r4 != r8) goto L27
                int r2 = r2 + 1
                goto L26
            L24:
                r2 = 0
                r3 = 0
            L26:
                r4 = 0
            L27:
                int r0 = r6.mo3778f(r7)
            L2b:
                if (r3 >= r7) goto L40
                int r5 = r6.mo3778f(r3)
                int r4 = r4 + r5
                if (r4 != r8) goto L38
                int r2 = r2 + 1
                r4 = 0
                goto L3d
            L38:
                if (r4 <= r8) goto L3d
                int r2 = r2 + 1
                r4 = r5
            L3d:
                int r3 = r3 + 1
                goto L2b
            L40:
                int r4 = r4 + r0
                if (r4 <= r8) goto L45
                int r2 = r2 + 1
            L45:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.AbstractC0771c.m3784d(int, int):int");
        }

        /* renamed from: e */
        public abstract int mo3777e(int i10, int i11);

        /* renamed from: f */
        public abstract int mo3778f(int i10);

        /* renamed from: g */
        public void m3785g() {
            this.f3179b.clear();
        }

        /* renamed from: h */
        public void m3786h() {
            this.f3178a.clear();
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.mPendingSpanCountChange = false;
        this.mSpanCount = -1;
        this.mPreLayoutSpanSizeCache = new SparseIntArray();
        this.mPreLayoutSpanIndexCache = new SparseIntArray();
        this.mSpanSizeLookup = new C0769a();
        this.mDecorInsets = new Rect();
        setSpanCount(RecyclerView.AbstractC0797p.getProperties(context, attributeSet, i10, i11).f3262b);
    }

    /* renamed from: G */
    private void m3762G(RecyclerView.C0804w c0804w, RecyclerView.C0779b0 c0779b0, int i10, boolean z10) {
        int i11;
        int i12;
        int i13;
        int i14 = 0;
        if (z10) {
            i12 = i10;
            i11 = 0;
            i13 = 1;
        } else {
            i11 = i10 - 1;
            i12 = -1;
            i13 = -1;
        }
        while (i11 != i12) {
            View view = this.mSet[i11];
            C0770b c0770b = (C0770b) view.getLayoutParams();
            int m3772Q = m3772Q(c0804w, c0779b0, getPosition(view));
            c0770b.f3177f = m3772Q;
            c0770b.f3176e = i14;
            i14 += m3772Q;
            i11 += i13;
        }
    }

    /* renamed from: H */
    private void m3763H() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            C0770b c0770b = (C0770b) getChildAt(i10).getLayoutParams();
            int m3926b = c0770b.m3926b();
            this.mPreLayoutSpanSizeCache.put(m3926b, c0770b.m3780h());
            this.mPreLayoutSpanIndexCache.put(m3926b, c0770b.m3779g());
        }
    }

    /* renamed from: I */
    private void m3764I(int i10) {
        this.mCachedBorders = calculateItemBorders(this.mCachedBorders, this.mSpanCount, i10);
    }

    /* renamed from: J */
    private void m3765J() {
        this.mPreLayoutSpanSizeCache.clear();
        this.mPreLayoutSpanIndexCache.clear();
    }

    /* renamed from: K */
    private int m3766K(RecyclerView.C0779b0 c0779b0) {
        int max;
        if (getChildCount() != 0 && c0779b0.m3836c() != 0) {
            ensureLayoutState();
            boolean isSmoothScrollbarEnabled = isSmoothScrollbarEnabled();
            View findFirstVisibleChildClosestToStart = findFirstVisibleChildClosestToStart(!isSmoothScrollbarEnabled, true);
            View findFirstVisibleChildClosestToEnd = findFirstVisibleChildClosestToEnd(!isSmoothScrollbarEnabled, true);
            if (findFirstVisibleChildClosestToStart != null && findFirstVisibleChildClosestToEnd != null) {
                int m3782b = this.mSpanSizeLookup.m3782b(getPosition(findFirstVisibleChildClosestToStart), this.mSpanCount);
                int m3782b2 = this.mSpanSizeLookup.m3782b(getPosition(findFirstVisibleChildClosestToEnd), this.mSpanCount);
                int min = Math.min(m3782b, m3782b2);
                int max2 = Math.max(m3782b, m3782b2);
                int m3782b3 = this.mSpanSizeLookup.m3782b(c0779b0.m3836c() - 1, this.mSpanCount) + 1;
                if (this.mShouldReverseLayout) {
                    max = Math.max(0, (m3782b3 - max2) - 1);
                } else {
                    max = Math.max(0, min);
                }
                if (!isSmoothScrollbarEnabled) {
                    return max;
                }
                return Math.round((max * (Math.abs(this.mOrientationHelper.mo4227d(findFirstVisibleChildClosestToEnd) - this.mOrientationHelper.mo4230g(findFirstVisibleChildClosestToStart)) / ((this.mSpanSizeLookup.m3782b(getPosition(findFirstVisibleChildClosestToEnd), this.mSpanCount) - this.mSpanSizeLookup.m3782b(getPosition(findFirstVisibleChildClosestToStart), this.mSpanCount)) + 1))) + (this.mOrientationHelper.mo4236m() - this.mOrientationHelper.mo4230g(findFirstVisibleChildClosestToStart)));
            }
        }
        return 0;
    }

    /* renamed from: L */
    private int m3767L(RecyclerView.C0779b0 c0779b0) {
        if (getChildCount() != 0 && c0779b0.m3836c() != 0) {
            ensureLayoutState();
            View findFirstVisibleChildClosestToStart = findFirstVisibleChildClosestToStart(!isSmoothScrollbarEnabled(), true);
            View findFirstVisibleChildClosestToEnd = findFirstVisibleChildClosestToEnd(!isSmoothScrollbarEnabled(), true);
            if (findFirstVisibleChildClosestToStart != null && findFirstVisibleChildClosestToEnd != null) {
                if (!isSmoothScrollbarEnabled()) {
                    return this.mSpanSizeLookup.m3782b(c0779b0.m3836c() - 1, this.mSpanCount) + 1;
                }
                int mo4227d = this.mOrientationHelper.mo4227d(findFirstVisibleChildClosestToEnd) - this.mOrientationHelper.mo4230g(findFirstVisibleChildClosestToStart);
                int m3782b = this.mSpanSizeLookup.m3782b(getPosition(findFirstVisibleChildClosestToStart), this.mSpanCount);
                return (int) ((mo4227d / ((this.mSpanSizeLookup.m3782b(getPosition(findFirstVisibleChildClosestToEnd), this.mSpanCount) - m3782b) + 1)) * (this.mSpanSizeLookup.m3782b(c0779b0.m3836c() - 1, this.mSpanCount) + 1));
            }
        }
        return 0;
    }

    /* renamed from: M */
    private void m3768M(RecyclerView.C0804w c0804w, RecyclerView.C0779b0 c0779b0, LinearLayoutManager.C0772a c0772a, int i10) {
        boolean z10;
        if (i10 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        int m3771P = m3771P(c0804w, c0779b0, c0772a.f3183b);
        if (z10) {
            while (m3771P > 0) {
                int i11 = c0772a.f3183b;
                if (i11 > 0) {
                    int i12 = i11 - 1;
                    c0772a.f3183b = i12;
                    m3771P = m3771P(c0804w, c0779b0, i12);
                } else {
                    return;
                }
            }
            return;
        }
        int m3836c = c0779b0.m3836c() - 1;
        int i13 = c0772a.f3183b;
        while (i13 < m3836c) {
            int i14 = i13 + 1;
            int m3771P2 = m3771P(c0804w, c0779b0, i14);
            if (m3771P2 <= m3771P) {
                break;
            }
            i13 = i14;
            m3771P = m3771P2;
        }
        c0772a.f3183b = i13;
    }

    /* renamed from: N */
    private void m3769N() {
        View[] viewArr = this.mSet;
        if (viewArr == null || viewArr.length != this.mSpanCount) {
            this.mSet = new View[this.mSpanCount];
        }
    }

    /* renamed from: O */
    private int m3770O(RecyclerView.C0804w c0804w, RecyclerView.C0779b0 c0779b0, int i10) {
        if (!c0779b0.m3841h()) {
            return this.mSpanSizeLookup.m3782b(i10, this.mSpanCount);
        }
        int m3974f = c0804w.m3974f(i10);
        if (m3974f == -1) {
            Log.w(TAG, "Cannot find span size for pre layout position. " + i10);
            return 0;
        }
        return this.mSpanSizeLookup.m3782b(m3974f, this.mSpanCount);
    }

    /* renamed from: P */
    private int m3771P(RecyclerView.C0804w c0804w, RecyclerView.C0779b0 c0779b0, int i10) {
        if (!c0779b0.m3841h()) {
            return this.mSpanSizeLookup.m3783c(i10, this.mSpanCount);
        }
        int i11 = this.mPreLayoutSpanIndexCache.get(i10, -1);
        if (i11 != -1) {
            return i11;
        }
        int m3974f = c0804w.m3974f(i10);
        if (m3974f == -1) {
            Log.w(TAG, "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i10);
            return 0;
        }
        return this.mSpanSizeLookup.m3783c(m3974f, this.mSpanCount);
    }

    /* renamed from: Q */
    private int m3772Q(RecyclerView.C0804w c0804w, RecyclerView.C0779b0 c0779b0, int i10) {
        if (!c0779b0.m3841h()) {
            return this.mSpanSizeLookup.mo3778f(i10);
        }
        int i11 = this.mPreLayoutSpanSizeCache.get(i10, -1);
        if (i11 != -1) {
            return i11;
        }
        int m3974f = c0804w.m3974f(i10);
        if (m3974f == -1) {
            Log.w(TAG, "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i10);
            return 1;
        }
        return this.mSpanSizeLookup.mo3778f(m3974f);
    }

    /* renamed from: R */
    private void m3773R(float f10, int i10) {
        m3764I(Math.max(Math.round(f10 * this.mSpanCount), i10));
    }

    /* renamed from: S */
    private void m3774S(View view, int i10, boolean z10) {
        int i11;
        int i12;
        C0770b c0770b = (C0770b) view.getLayoutParams();
        Rect rect = c0770b.f3266b;
        int i13 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c0770b).topMargin + ((ViewGroup.MarginLayoutParams) c0770b).bottomMargin;
        int i14 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c0770b).leftMargin + ((ViewGroup.MarginLayoutParams) c0770b).rightMargin;
        int spaceForSpanRange = getSpaceForSpanRange(c0770b.f3176e, c0770b.f3177f);
        if (this.mOrientation == 1) {
            i12 = RecyclerView.AbstractC0797p.getChildMeasureSpec(spaceForSpanRange, i10, i14, ((ViewGroup.MarginLayoutParams) c0770b).width, false);
            i11 = RecyclerView.AbstractC0797p.getChildMeasureSpec(this.mOrientationHelper.mo4237n(), getHeightMode(), i13, ((ViewGroup.MarginLayoutParams) c0770b).height, true);
        } else {
            int childMeasureSpec = RecyclerView.AbstractC0797p.getChildMeasureSpec(spaceForSpanRange, i10, i13, ((ViewGroup.MarginLayoutParams) c0770b).height, false);
            int childMeasureSpec2 = RecyclerView.AbstractC0797p.getChildMeasureSpec(this.mOrientationHelper.mo4237n(), getWidthMode(), i14, ((ViewGroup.MarginLayoutParams) c0770b).width, true);
            i11 = childMeasureSpec;
            i12 = childMeasureSpec2;
        }
        m3775T(view, i12, i11, z10);
    }

    /* renamed from: T */
    private void m3775T(View view, int i10, int i11, boolean z10) {
        boolean shouldMeasureChild;
        RecyclerView.C0798q c0798q = (RecyclerView.C0798q) view.getLayoutParams();
        if (z10) {
            shouldMeasureChild = shouldReMeasureChild(view, i10, i11, c0798q);
        } else {
            shouldMeasureChild = shouldMeasureChild(view, i10, i11, c0798q);
        }
        if (shouldMeasureChild) {
            view.measure(i10, i11);
        }
    }

    /* renamed from: U */
    private void m3776U() {
        int height;
        int paddingTop;
        if (getOrientation() == 1) {
            height = getWidth() - getPaddingRight();
            paddingTop = getPaddingLeft();
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = getPaddingTop();
        }
        m3764I(height - paddingTop);
    }

    static int[] calculateItemBorders(int[] iArr, int i10, int i11) {
        int i12;
        if (iArr == null || iArr.length != i10 + 1 || iArr[iArr.length - 1] != i11) {
            iArr = new int[i10 + 1];
        }
        int i13 = 0;
        iArr[0] = 0;
        int i14 = i11 / i10;
        int i15 = i11 % i10;
        int i16 = 0;
        for (int i17 = 1; i17 <= i10; i17++) {
            i13 += i15;
            if (i13 > 0 && i10 - i13 < i15) {
                i12 = i14 + 1;
                i13 -= i10;
            } else {
                i12 = i14;
            }
            i16 += i12;
            iArr[i17] = i16;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    public boolean checkLayoutParams(RecyclerView.C0798q c0798q) {
        return c0798q instanceof C0770b;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    void collectPrefetchPositionsForLayoutState(RecyclerView.C0779b0 c0779b0, LinearLayoutManager.C0774c c0774c, RecyclerView.AbstractC0797p.c cVar) {
        int i10 = this.mSpanCount;
        for (int i11 = 0; i11 < this.mSpanCount && c0774c.m3822c(c0779b0) && i10 > 0; i11++) {
            int i12 = c0774c.f3194d;
            cVar.mo3924a(i12, Math.max(0, c0774c.f3197g));
            i10 -= this.mSpanSizeLookup.mo3778f(i12);
            c0774c.f3194d += c0774c.f3195e;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    public int computeHorizontalScrollOffset(RecyclerView.C0779b0 c0779b0) {
        if (this.mUsingSpansToEstimateScrollBarDimensions) {
            return m3766K(c0779b0);
        }
        return super.computeHorizontalScrollOffset(c0779b0);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    public int computeHorizontalScrollRange(RecyclerView.C0779b0 c0779b0) {
        if (this.mUsingSpansToEstimateScrollBarDimensions) {
            return m3767L(c0779b0);
        }
        return super.computeHorizontalScrollRange(c0779b0);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    public int computeVerticalScrollOffset(RecyclerView.C0779b0 c0779b0) {
        if (this.mUsingSpansToEstimateScrollBarDimensions) {
            return m3766K(c0779b0);
        }
        return super.computeVerticalScrollOffset(c0779b0);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    public int computeVerticalScrollRange(RecyclerView.C0779b0 c0779b0) {
        if (this.mUsingSpansToEstimateScrollBarDimensions) {
            return m3767L(c0779b0);
        }
        return super.computeVerticalScrollRange(c0779b0);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    View findReferenceChild(RecyclerView.C0804w c0804w, RecyclerView.C0779b0 c0779b0, boolean z10, boolean z11) {
        int i10;
        int i11;
        int childCount = getChildCount();
        int i12 = 1;
        if (z11) {
            i11 = getChildCount() - 1;
            i10 = -1;
            i12 = -1;
        } else {
            i10 = childCount;
            i11 = 0;
        }
        int m3836c = c0779b0.m3836c();
        ensureLayoutState();
        int mo4236m = this.mOrientationHelper.mo4236m();
        int mo4232i = this.mOrientationHelper.mo4232i();
        View view = null;
        View view2 = null;
        while (i11 != i10) {
            View childAt = getChildAt(i11);
            int position = getPosition(childAt);
            if (position >= 0 && position < m3836c && m3771P(c0804w, c0779b0, position) == 0) {
                if (((RecyclerView.C0798q) childAt.getLayoutParams()).m3928d()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else {
                    if (this.mOrientationHelper.mo4230g(childAt) < mo4232i && this.mOrientationHelper.mo4227d(childAt) >= mo4236m) {
                        return childAt;
                    }
                    if (view == null) {
                        view = childAt;
                    }
                }
            }
            i11 += i12;
        }
        if (view == null) {
            return view2;
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    public RecyclerView.C0798q generateDefaultLayoutParams() {
        if (this.mOrientation == 0) {
            return new C0770b(-2, -1);
        }
        return new C0770b(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    public RecyclerView.C0798q generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new C0770b(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    public int getColumnCountForAccessibility(RecyclerView.C0804w c0804w, RecyclerView.C0779b0 c0779b0) {
        if (this.mOrientation == 1) {
            return this.mSpanCount;
        }
        if (c0779b0.m3836c() < 1) {
            return 0;
        }
        return m3770O(c0804w, c0779b0, c0779b0.m3836c() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    public int getRowCountForAccessibility(RecyclerView.C0804w c0804w, RecyclerView.C0779b0 c0779b0) {
        if (this.mOrientation == 0) {
            return this.mSpanCount;
        }
        if (c0779b0.m3836c() < 1) {
            return 0;
        }
        return m3770O(c0804w, c0779b0, c0779b0.m3836c() - 1) + 1;
    }

    int getSpaceForSpanRange(int i10, int i11) {
        if (this.mOrientation == 1 && isLayoutRTL()) {
            int[] iArr = this.mCachedBorders;
            int i12 = this.mSpanCount;
            return iArr[i12 - i10] - iArr[(i12 - i10) - i11];
        }
        int[] iArr2 = this.mCachedBorders;
        return iArr2[i11 + i10] - iArr2[i10];
    }

    public int getSpanCount() {
        return this.mSpanCount;
    }

    public AbstractC0771c getSpanSizeLookup() {
        return this.mSpanSizeLookup;
    }

    public boolean isUsingSpansToEstimateScrollbarDimensions() {
        return this.mUsingSpansToEstimateScrollBarDimensions;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x009f, code lost:
    
        r21.f3188b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a1, code lost:
    
        return;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void layoutChunk(androidx.recyclerview.widget.RecyclerView.C0804w r18, androidx.recyclerview.widget.RecyclerView.C0779b0 r19, androidx.recyclerview.widget.LinearLayoutManager.C0774c r20, androidx.recyclerview.widget.LinearLayoutManager.C0773b r21) {
        /*
            Method dump skipped, instructions count: 557
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.layoutChunk(androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$b0, androidx.recyclerview.widget.LinearLayoutManager$c, androidx.recyclerview.widget.LinearLayoutManager$b):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void onAnchorReady(RecyclerView.C0804w c0804w, RecyclerView.C0779b0 c0779b0, LinearLayoutManager.C0772a c0772a, int i10) {
        super.onAnchorReady(c0804w, c0779b0, c0772a, i10);
        m3776U();
        if (c0779b0.m3836c() > 0 && !c0779b0.m3841h()) {
            m3768M(c0804w, c0779b0, c0772a, i10);
        }
        m3769N();
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00d6, code lost:
    
        if (r13 == r7) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00f6, code lost:
    
        if (r13 == r11) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0107  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View onFocusSearchFailed(android.view.View r24, int r25, androidx.recyclerview.widget.RecyclerView.C0804w r26, androidx.recyclerview.widget.RecyclerView.C0779b0 r27) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.onFocusSearchFailed(android.view.View, int, androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$b0):android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    public void onInitializeAccessibilityNodeInfo(RecyclerView.C0804w c0804w, RecyclerView.C0779b0 c0779b0, C7458h0 c7458h0) {
        super.onInitializeAccessibilityNodeInfo(c0804w, c0779b0, c7458h0);
        c7458h0.m28599X(GridView.class.getName());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    public void onInitializeAccessibilityNodeInfoForItem(RecyclerView.C0804w c0804w, RecyclerView.C0779b0 c0779b0, View view, C7458h0 c7458h0) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C0770b)) {
            super.onInitializeAccessibilityNodeInfoForItem(view, c7458h0);
            return;
        }
        C0770b c0770b = (C0770b) layoutParams;
        int m3770O = m3770O(c0804w, c0779b0, c0770b.m3926b());
        if (this.mOrientation == 0) {
            c7458h0.m28603a0(C7458h0.c.m28644a(c0770b.m3779g(), c0770b.m3780h(), m3770O, 1, false, false));
        } else {
            c7458h0.m28603a0(C7458h0.c.m28644a(m3770O, 1, c0770b.m3779g(), c0770b.m3780h(), false, false));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    public void onItemsAdded(RecyclerView recyclerView, int i10, int i11) {
        this.mSpanSizeLookup.m3786h();
        this.mSpanSizeLookup.m3785g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    public void onItemsChanged(RecyclerView recyclerView) {
        this.mSpanSizeLookup.m3786h();
        this.mSpanSizeLookup.m3785g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    public void onItemsMoved(RecyclerView recyclerView, int i10, int i11, int i12) {
        this.mSpanSizeLookup.m3786h();
        this.mSpanSizeLookup.m3785g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    public void onItemsRemoved(RecyclerView recyclerView, int i10, int i11) {
        this.mSpanSizeLookup.m3786h();
        this.mSpanSizeLookup.m3785g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    public void onItemsUpdated(RecyclerView recyclerView, int i10, int i11, Object obj) {
        this.mSpanSizeLookup.m3786h();
        this.mSpanSizeLookup.m3785g();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    public void onLayoutChildren(RecyclerView.C0804w c0804w, RecyclerView.C0779b0 c0779b0) {
        if (c0779b0.m3841h()) {
            m3763H();
        }
        super.onLayoutChildren(c0804w, c0779b0);
        m3765J();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    public void onLayoutCompleted(RecyclerView.C0779b0 c0779b0) {
        super.onLayoutCompleted(c0779b0);
        this.mPendingSpanCountChange = false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    public int scrollHorizontallyBy(int i10, RecyclerView.C0804w c0804w, RecyclerView.C0779b0 c0779b0) {
        m3776U();
        m3769N();
        return super.scrollHorizontallyBy(i10, c0804w, c0779b0);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    public int scrollVerticallyBy(int i10, RecyclerView.C0804w c0804w, RecyclerView.C0779b0 c0779b0) {
        m3776U();
        m3769N();
        return super.scrollVerticallyBy(i10, c0804w, c0779b0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    public void setMeasuredDimension(Rect rect, int i10, int i11) {
        int chooseSize;
        int chooseSize2;
        if (this.mCachedBorders == null) {
            super.setMeasuredDimension(rect, i10, i11);
        }
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.mOrientation == 1) {
            chooseSize2 = RecyclerView.AbstractC0797p.chooseSize(i11, rect.height() + paddingTop, getMinimumHeight());
            int[] iArr = this.mCachedBorders;
            chooseSize = RecyclerView.AbstractC0797p.chooseSize(i10, iArr[iArr.length - 1] + paddingLeft, getMinimumWidth());
        } else {
            chooseSize = RecyclerView.AbstractC0797p.chooseSize(i10, rect.width() + paddingLeft, getMinimumWidth());
            int[] iArr2 = this.mCachedBorders;
            chooseSize2 = RecyclerView.AbstractC0797p.chooseSize(i11, iArr2[iArr2.length - 1] + paddingTop, getMinimumHeight());
        }
        setMeasuredDimension(chooseSize, chooseSize2);
    }

    public void setSpanCount(int i10) {
        if (i10 == this.mSpanCount) {
            return;
        }
        this.mPendingSpanCountChange = true;
        if (i10 >= 1) {
            this.mSpanCount = i10;
            this.mSpanSizeLookup.m3786h();
            requestLayout();
        } else {
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i10);
        }
    }

    public void setSpanSizeLookup(AbstractC0771c abstractC0771c) {
        this.mSpanSizeLookup = abstractC0771c;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void setStackFromEnd(boolean z10) {
        if (!z10) {
            super.setStackFromEnd(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    public void setUsingSpansToEstimateScrollbarDimensions(boolean z10) {
        this.mUsingSpansToEstimateScrollBarDimensions = z10;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    public boolean supportsPredictiveItemAnimations() {
        if (this.mPendingSavedState == null && !this.mPendingSpanCountChange) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    public RecyclerView.C0798q generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C0770b((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C0770b(layoutParams);
    }

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$b */
    /* loaded from: classes.dex */
    public static class C0770b extends RecyclerView.C0798q {

        /* renamed from: e */
        int f3176e;

        /* renamed from: f */
        int f3177f;

        public C0770b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f3176e = -1;
            this.f3177f = 0;
        }

        /* renamed from: g */
        public int m3779g() {
            return this.f3176e;
        }

        /* renamed from: h */
        public int m3780h() {
            return this.f3177f;
        }

        public C0770b(int i10, int i11) {
            super(i10, i11);
            this.f3176e = -1;
            this.f3177f = 0;
        }

        public C0770b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f3176e = -1;
            this.f3177f = 0;
        }

        public C0770b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f3176e = -1;
            this.f3177f = 0;
        }
    }

    public GridLayoutManager(Context context, int i10) {
        super(context);
        this.mPendingSpanCountChange = false;
        this.mSpanCount = -1;
        this.mPreLayoutSpanSizeCache = new SparseIntArray();
        this.mPreLayoutSpanIndexCache = new SparseIntArray();
        this.mSpanSizeLookup = new C0769a();
        this.mDecorInsets = new Rect();
        setSpanCount(i10);
    }

    public GridLayoutManager(Context context, int i10, int i11, boolean z10) {
        super(context, i11, z10);
        this.mPendingSpanCountChange = false;
        this.mSpanCount = -1;
        this.mPreLayoutSpanSizeCache = new SparseIntArray();
        this.mPreLayoutSpanIndexCache = new SparseIntArray();
        this.mSpanSizeLookup = new C0769a();
        this.mDecorInsets = new Rect();
        setSpanCount(i10);
    }
}
