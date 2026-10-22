package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.l */
/* loaded from: classes.dex */
public abstract class AbstractC0825l extends AbstractC0829p {
    private static final int MAX_SCROLL_ON_FLING_DURATION = 100;
    private AbstractC0824k mHorizontalHelper;
    private AbstractC0824k mVerticalHelper;

    /* renamed from: androidx.recyclerview.widget.l$a */
    /* loaded from: classes.dex */
    class a extends C0821h {
        a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.C0821h
        protected float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.C0821h
        protected int calculateTimeForScrolling(int i10) {
            return Math.min(100, super.calculateTimeForScrolling(i10));
        }

        @Override // androidx.recyclerview.widget.C0821h, androidx.recyclerview.widget.RecyclerView.AbstractC0777a0
        protected void onTargetFound(View view, RecyclerView.C0779b0 c0779b0, RecyclerView.AbstractC0777a0.a aVar) {
            AbstractC0825l abstractC0825l = AbstractC0825l.this;
            int[] calculateDistanceToFinalSnap = abstractC0825l.calculateDistanceToFinalSnap(abstractC0825l.mRecyclerView.getLayoutManager(), view);
            int i10 = calculateDistanceToFinalSnap[0];
            int i11 = calculateDistanceToFinalSnap[1];
            int calculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i10), Math.abs(i11)));
            if (calculateTimeForDeceleration > 0) {
                aVar.m3833d(i10, i11, calculateTimeForDeceleration, this.mDecelerateInterpolator);
            }
        }
    }

    /* renamed from: d */
    private int m4243d(View view, AbstractC0824k abstractC0824k) {
        return (abstractC0824k.mo4230g(view) + (abstractC0824k.mo4228e(view) / 2)) - (abstractC0824k.mo4236m() + (abstractC0824k.mo4237n() / 2));
    }

    /* renamed from: e */
    private View m4244e(RecyclerView.AbstractC0797p abstractC0797p, AbstractC0824k abstractC0824k) {
        int childCount = abstractC0797p.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        int mo4236m = abstractC0824k.mo4236m() + (abstractC0824k.mo4237n() / 2);
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = abstractC0797p.getChildAt(i11);
            int abs = Math.abs((abstractC0824k.mo4230g(childAt) + (abstractC0824k.mo4228e(childAt) / 2)) - mo4236m);
            if (abs < i10) {
                view = childAt;
                i10 = abs;
            }
        }
        return view;
    }

    /* renamed from: f */
    private AbstractC0824k m4245f(RecyclerView.AbstractC0797p abstractC0797p) {
        AbstractC0824k abstractC0824k = this.mHorizontalHelper;
        if (abstractC0824k == null || abstractC0824k.f3477a != abstractC0797p) {
            this.mHorizontalHelper = AbstractC0824k.m4224a(abstractC0797p);
        }
        return this.mHorizontalHelper;
    }

    /* renamed from: g */
    private AbstractC0824k m4246g(RecyclerView.AbstractC0797p abstractC0797p) {
        if (abstractC0797p.canScrollVertically()) {
            return m4247h(abstractC0797p);
        }
        if (abstractC0797p.canScrollHorizontally()) {
            return m4245f(abstractC0797p);
        }
        return null;
    }

    /* renamed from: h */
    private AbstractC0824k m4247h(RecyclerView.AbstractC0797p abstractC0797p) {
        AbstractC0824k abstractC0824k = this.mVerticalHelper;
        if (abstractC0824k == null || abstractC0824k.f3477a != abstractC0797p) {
            this.mVerticalHelper = AbstractC0824k.m4226c(abstractC0797p);
        }
        return this.mVerticalHelper;
    }

    /* renamed from: i */
    private boolean m4248i(RecyclerView.AbstractC0797p abstractC0797p, int i10, int i11) {
        if (abstractC0797p.canScrollHorizontally()) {
            if (i10 > 0) {
                return true;
            }
            return false;
        }
        if (i11 > 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: j */
    private boolean m4249j(RecyclerView.AbstractC0797p abstractC0797p) {
        PointF computeScrollVectorForPosition;
        int itemCount = abstractC0797p.getItemCount();
        if (!(abstractC0797p instanceof RecyclerView.AbstractC0777a0.b) || (computeScrollVectorForPosition = ((RecyclerView.AbstractC0777a0.b) abstractC0797p).computeScrollVectorForPosition(itemCount - 1)) == null) {
            return false;
        }
        if (computeScrollVectorForPosition.x >= 0.0f && computeScrollVectorForPosition.y >= 0.0f) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.AbstractC0829p
    public int[] calculateDistanceToFinalSnap(RecyclerView.AbstractC0797p abstractC0797p, View view) {
        int[] iArr = new int[2];
        if (abstractC0797p.canScrollHorizontally()) {
            iArr[0] = m4243d(view, m4245f(abstractC0797p));
        } else {
            iArr[0] = 0;
        }
        if (abstractC0797p.canScrollVertically()) {
            iArr[1] = m4243d(view, m4247h(abstractC0797p));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.AbstractC0829p
    protected RecyclerView.AbstractC0777a0 createScroller(RecyclerView.AbstractC0797p abstractC0797p) {
        if (!(abstractC0797p instanceof RecyclerView.AbstractC0777a0.b)) {
            return null;
        }
        return new a(this.mRecyclerView.getContext());
    }

    @Override // androidx.recyclerview.widget.AbstractC0829p
    public View findSnapView(RecyclerView.AbstractC0797p abstractC0797p) {
        if (abstractC0797p.canScrollVertically()) {
            return m4244e(abstractC0797p, m4247h(abstractC0797p));
        }
        if (abstractC0797p.canScrollHorizontally()) {
            return m4244e(abstractC0797p, m4245f(abstractC0797p));
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.AbstractC0829p
    @SuppressLint({"UnknownNullness"})
    public int findTargetSnapPosition(RecyclerView.AbstractC0797p abstractC0797p, int i10, int i11) {
        AbstractC0824k m4246g;
        int i12;
        int itemCount = abstractC0797p.getItemCount();
        if (itemCount == 0 || (m4246g = m4246g(abstractC0797p)) == null) {
            return -1;
        }
        int childCount = abstractC0797p.getChildCount();
        View view = null;
        View view2 = null;
        int i13 = Integer.MIN_VALUE;
        int i14 = Integer.MAX_VALUE;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = abstractC0797p.getChildAt(i15);
            if (childAt != null) {
                int m4243d = m4243d(childAt, m4246g);
                if (m4243d <= 0 && m4243d > i13) {
                    view2 = childAt;
                    i13 = m4243d;
                }
                if (m4243d >= 0 && m4243d < i14) {
                    view = childAt;
                    i14 = m4243d;
                }
            }
        }
        boolean m4248i = m4248i(abstractC0797p, i10, i11);
        if (m4248i && view != null) {
            return abstractC0797p.getPosition(view);
        }
        if (!m4248i && view2 != null) {
            return abstractC0797p.getPosition(view2);
        }
        if (m4248i) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int position = abstractC0797p.getPosition(view);
        if (m4249j(abstractC0797p) == m4248i) {
            i12 = -1;
        } else {
            i12 = 1;
        }
        int i16 = position + i12;
        if (i16 < 0 || i16 >= itemCount) {
            return -1;
        }
        return i16;
    }
}
