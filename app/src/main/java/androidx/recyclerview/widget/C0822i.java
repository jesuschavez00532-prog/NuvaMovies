package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.i */
/* loaded from: classes.dex */
public class C0822i extends AbstractC0829p {

    /* renamed from: a */
    private AbstractC0824k f3474a;

    /* renamed from: b */
    private AbstractC0824k f3475b;

    /* renamed from: d */
    private float m4212d(RecyclerView.AbstractC0797p abstractC0797p, AbstractC0824k abstractC0824k) {
        int childCount = abstractC0797p.getChildCount();
        if (childCount == 0) {
            return 1.0f;
        }
        View view = null;
        View view2 = null;
        int i10 = Integer.MAX_VALUE;
        int i11 = Integer.MIN_VALUE;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = abstractC0797p.getChildAt(i12);
            int position = abstractC0797p.getPosition(childAt);
            if (position != -1) {
                if (position < i10) {
                    view = childAt;
                    i10 = position;
                }
                if (position > i11) {
                    view2 = childAt;
                    i11 = position;
                }
            }
        }
        if (view == null || view2 == null) {
            return 1.0f;
        }
        int max = Math.max(abstractC0824k.mo4227d(view), abstractC0824k.mo4227d(view2)) - Math.min(abstractC0824k.mo4230g(view), abstractC0824k.mo4230g(view2));
        if (max == 0) {
            return 1.0f;
        }
        return (max * 1.0f) / ((i11 - i10) + 1);
    }

    /* renamed from: e */
    private int m4213e(View view, AbstractC0824k abstractC0824k) {
        return (abstractC0824k.mo4230g(view) + (abstractC0824k.mo4228e(view) / 2)) - (abstractC0824k.mo4236m() + (abstractC0824k.mo4237n() / 2));
    }

    /* renamed from: f */
    private int m4214f(RecyclerView.AbstractC0797p abstractC0797p, AbstractC0824k abstractC0824k, int i10, int i11) {
        int i12;
        int[] calculateScrollDistance = calculateScrollDistance(i10, i11);
        float m4212d = m4212d(abstractC0797p, abstractC0824k);
        if (m4212d <= 0.0f) {
            return 0;
        }
        if (Math.abs(calculateScrollDistance[0]) > Math.abs(calculateScrollDistance[1])) {
            i12 = calculateScrollDistance[0];
        } else {
            i12 = calculateScrollDistance[1];
        }
        return Math.round(i12 / m4212d);
    }

    /* renamed from: g */
    private View m4215g(RecyclerView.AbstractC0797p abstractC0797p, AbstractC0824k abstractC0824k) {
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

    /* renamed from: h */
    private AbstractC0824k m4216h(RecyclerView.AbstractC0797p abstractC0797p) {
        AbstractC0824k abstractC0824k = this.f3475b;
        if (abstractC0824k == null || abstractC0824k.f3477a != abstractC0797p) {
            this.f3475b = AbstractC0824k.m4224a(abstractC0797p);
        }
        return this.f3475b;
    }

    /* renamed from: i */
    private AbstractC0824k m4217i(RecyclerView.AbstractC0797p abstractC0797p) {
        AbstractC0824k abstractC0824k = this.f3474a;
        if (abstractC0824k == null || abstractC0824k.f3477a != abstractC0797p) {
            this.f3474a = AbstractC0824k.m4226c(abstractC0797p);
        }
        return this.f3474a;
    }

    @Override // androidx.recyclerview.widget.AbstractC0829p
    public int[] calculateDistanceToFinalSnap(RecyclerView.AbstractC0797p abstractC0797p, View view) {
        int[] iArr = new int[2];
        if (abstractC0797p.canScrollHorizontally()) {
            iArr[0] = m4213e(view, m4216h(abstractC0797p));
        } else {
            iArr[0] = 0;
        }
        if (abstractC0797p.canScrollVertically()) {
            iArr[1] = m4213e(view, m4217i(abstractC0797p));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.AbstractC0829p
    public View findSnapView(RecyclerView.AbstractC0797p abstractC0797p) {
        if (abstractC0797p.canScrollVertically()) {
            return m4215g(abstractC0797p, m4217i(abstractC0797p));
        }
        if (abstractC0797p.canScrollHorizontally()) {
            return m4215g(abstractC0797p, m4216h(abstractC0797p));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.AbstractC0829p
    public int findTargetSnapPosition(RecyclerView.AbstractC0797p abstractC0797p, int i10, int i11) {
        int itemCount;
        View findSnapView;
        int position;
        int i12;
        PointF computeScrollVectorForPosition;
        int i13;
        int i14;
        if (!(abstractC0797p instanceof RecyclerView.AbstractC0777a0.b) || (itemCount = abstractC0797p.getItemCount()) == 0 || (findSnapView = findSnapView(abstractC0797p)) == null || (position = abstractC0797p.getPosition(findSnapView)) == -1 || (computeScrollVectorForPosition = ((RecyclerView.AbstractC0777a0.b) abstractC0797p).computeScrollVectorForPosition(itemCount - 1)) == null) {
            return -1;
        }
        int i15 = 0;
        if (abstractC0797p.canScrollHorizontally()) {
            i13 = m4214f(abstractC0797p, m4216h(abstractC0797p), i10, 0);
            if (computeScrollVectorForPosition.x < 0.0f) {
                i13 = -i13;
            }
        } else {
            i13 = 0;
        }
        if (abstractC0797p.canScrollVertically()) {
            i14 = m4214f(abstractC0797p, m4217i(abstractC0797p), 0, i11);
            if (computeScrollVectorForPosition.y < 0.0f) {
                i14 = -i14;
            }
        } else {
            i14 = 0;
        }
        if (abstractC0797p.canScrollVertically()) {
            i13 = i14;
        }
        if (i13 == 0) {
            return -1;
        }
        int i16 = position + i13;
        if (i16 >= 0) {
            i15 = i16;
        }
        if (i15 < itemCount) {
            return i15;
        }
        return i12;
    }
}
