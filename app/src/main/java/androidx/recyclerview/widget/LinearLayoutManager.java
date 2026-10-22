package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.umeng.analytics.pro.C3395q;
import java.util.List;

/* loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.AbstractC0797p implements RecyclerView.AbstractC0777a0.b {
    static final boolean DEBUG = false;
    public static final int HORIZONTAL = 0;
    public static final int INVALID_OFFSET = Integer.MIN_VALUE;
    private static final float MAX_SCROLL_FACTOR = 0.33333334f;
    private static final String TAG = "LinearLayoutManager";
    public static final int VERTICAL = 1;
    final C0772a mAnchorInfo;
    private int mInitialPrefetchItemCount;
    private boolean mLastStackFromEnd;
    private final C0773b mLayoutChunkResult;
    private C0774c mLayoutState;
    int mOrientation;
    AbstractC0824k mOrientationHelper;
    C0775d mPendingSavedState;
    int mPendingScrollPosition;
    int mPendingScrollPositionOffset;
    private boolean mRecycleChildrenOnDetach;
    private int[] mReusableIntPair;
    private boolean mReverseLayout;
    boolean mShouldReverseLayout;
    private boolean mSmoothScrollbarEnabled;
    private boolean mStackFromEnd;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$a */
    /* loaded from: classes.dex */
    public static class C0772a {

        /* renamed from: a */
        AbstractC0824k f3182a;

        /* renamed from: b */
        int f3183b;

        /* renamed from: c */
        int f3184c;

        /* renamed from: d */
        boolean f3185d;

        /* renamed from: e */
        boolean f3186e;

        C0772a() {
            m3817e();
        }

        /* renamed from: a */
        void m3813a() {
            int mo4236m;
            if (this.f3185d) {
                mo4236m = this.f3182a.mo4232i();
            } else {
                mo4236m = this.f3182a.mo4236m();
            }
            this.f3184c = mo4236m;
        }

        /* renamed from: b */
        public void m3814b(View view, int i10) {
            if (this.f3185d) {
                this.f3184c = this.f3182a.mo4227d(view) + this.f3182a.m4238o();
            } else {
                this.f3184c = this.f3182a.mo4230g(view);
            }
            this.f3183b = i10;
        }

        /* renamed from: c */
        public void m3815c(View view, int i10) {
            int m4238o = this.f3182a.m4238o();
            if (m4238o >= 0) {
                m3814b(view, i10);
                return;
            }
            this.f3183b = i10;
            if (this.f3185d) {
                int mo4232i = (this.f3182a.mo4232i() - m4238o) - this.f3182a.mo4227d(view);
                this.f3184c = this.f3182a.mo4232i() - mo4232i;
                if (mo4232i > 0) {
                    int mo4228e = this.f3184c - this.f3182a.mo4228e(view);
                    int mo4236m = this.f3182a.mo4236m();
                    int min = mo4228e - (mo4236m + Math.min(this.f3182a.mo4230g(view) - mo4236m, 0));
                    if (min < 0) {
                        this.f3184c += Math.min(mo4232i, -min);
                        return;
                    }
                    return;
                }
                return;
            }
            int mo4230g = this.f3182a.mo4230g(view);
            int mo4236m2 = mo4230g - this.f3182a.mo4236m();
            this.f3184c = mo4230g;
            if (mo4236m2 > 0) {
                int mo4232i2 = (this.f3182a.mo4232i() - Math.min(0, (this.f3182a.mo4232i() - m4238o) - this.f3182a.mo4227d(view))) - (mo4230g + this.f3182a.mo4228e(view));
                if (mo4232i2 < 0) {
                    this.f3184c -= Math.min(mo4236m2, -mo4232i2);
                }
            }
        }

        /* renamed from: d */
        boolean m3816d(View view, RecyclerView.C0779b0 c0779b0) {
            RecyclerView.C0798q c0798q = (RecyclerView.C0798q) view.getLayoutParams();
            if (!c0798q.m3928d() && c0798q.m3926b() >= 0 && c0798q.m3926b() < c0779b0.m3836c()) {
                return true;
            }
            return false;
        }

        /* renamed from: e */
        void m3817e() {
            this.f3183b = -1;
            this.f3184c = Integer.MIN_VALUE;
            this.f3185d = false;
            this.f3186e = false;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f3183b + ", mCoordinate=" + this.f3184c + ", mLayoutFromEnd=" + this.f3185d + ", mValid=" + this.f3186e + '}';
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$b */
    /* loaded from: classes.dex */
    public static class C0773b {

        /* renamed from: a */
        public int f3187a;

        /* renamed from: b */
        public boolean f3188b;

        /* renamed from: c */
        public boolean f3189c;

        /* renamed from: d */
        public boolean f3190d;

        protected C0773b() {
        }

        /* renamed from: a */
        void m3818a() {
            this.f3187a = 0;
            this.f3188b = false;
            this.f3189c = false;
            this.f3190d = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$c */
    /* loaded from: classes.dex */
    public static class C0774c {

        /* renamed from: b */
        int f3192b;

        /* renamed from: c */
        int f3193c;

        /* renamed from: d */
        int f3194d;

        /* renamed from: e */
        int f3195e;

        /* renamed from: f */
        int f3196f;

        /* renamed from: g */
        int f3197g;

        /* renamed from: k */
        int f3201k;

        /* renamed from: m */
        boolean f3203m;

        /* renamed from: a */
        boolean f3191a = true;

        /* renamed from: h */
        int f3198h = 0;

        /* renamed from: i */
        int f3199i = 0;

        /* renamed from: j */
        boolean f3200j = false;

        /* renamed from: l */
        List f3202l = null;

        C0774c() {
        }

        /* renamed from: e */
        private View m3819e() {
            int size = this.f3202l.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = ((RecyclerView.AbstractC0787f0) this.f3202l.get(i10)).itemView;
                RecyclerView.C0798q c0798q = (RecyclerView.C0798q) view.getLayoutParams();
                if (!c0798q.m3928d() && this.f3194d == c0798q.m3926b()) {
                    m3821b(view);
                    return view;
                }
            }
            return null;
        }

        /* renamed from: a */
        public void m3820a() {
            m3821b(null);
        }

        /* renamed from: b */
        public void m3821b(View view) {
            View m3824f = m3824f(view);
            if (m3824f == null) {
                this.f3194d = -1;
            } else {
                this.f3194d = ((RecyclerView.C0798q) m3824f.getLayoutParams()).m3926b();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean m3822c(RecyclerView.C0779b0 c0779b0) {
            int i10 = this.f3194d;
            if (i10 >= 0 && i10 < c0779b0.m3836c()) {
                return true;
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: d */
        public View m3823d(RecyclerView.C0804w c0804w) {
            if (this.f3202l != null) {
                return m3819e();
            }
            View m3983o = c0804w.m3983o(this.f3194d);
            this.f3194d += this.f3195e;
            return m3983o;
        }

        /* renamed from: f */
        public View m3824f(View view) {
            int m3926b;
            int size = this.f3202l.size();
            View view2 = null;
            int i10 = Integer.MAX_VALUE;
            for (int i11 = 0; i11 < size; i11++) {
                View view3 = ((RecyclerView.AbstractC0787f0) this.f3202l.get(i11)).itemView;
                RecyclerView.C0798q c0798q = (RecyclerView.C0798q) view3.getLayoutParams();
                if (view3 != view && !c0798q.m3928d() && (m3926b = (c0798q.m3926b() - this.f3194d) * this.f3195e) >= 0 && m3926b < i10) {
                    view2 = view3;
                    if (m3926b == 0) {
                        break;
                    }
                    i10 = m3926b;
                }
            }
            return view2;
        }
    }

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$d */
    /* loaded from: classes.dex */
    public static class C0775d implements Parcelable {
        public static final Parcelable.Creator<C0775d> CREATOR = new a();

        /* renamed from: a */
        int f3204a;

        /* renamed from: b */
        int f3205b;

        /* renamed from: c */
        boolean f3206c;

        /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$d$a */
        /* loaded from: classes.dex */
        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public C0775d createFromParcel(Parcel parcel) {
                return new C0775d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public C0775d[] newArray(int i10) {
                return new C0775d[i10];
            }
        }

        public C0775d() {
        }

        /* renamed from: a */
        boolean m3825a() {
            if (this.f3204a >= 0) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        void m3826b() {
            this.f3204a = -1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f3204a);
            parcel.writeInt(this.f3205b);
            parcel.writeInt(this.f3206c ? 1 : 0);
        }

        C0775d(Parcel parcel) {
            this.f3204a = parcel.readInt();
            this.f3205b = parcel.readInt();
            this.f3206c = parcel.readInt() == 1;
        }

        public C0775d(C0775d c0775d) {
            this.f3204a = c0775d.f3204a;
            this.f3205b = c0775d.f3205b;
            this.f3206c = c0775d.f3206c;
        }
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    /* renamed from: A */
    private void m3787A(RecyclerView.C0804w c0804w, RecyclerView.C0779b0 c0779b0, C0772a c0772a) {
        int i10;
        if (m3812z(c0779b0, c0772a) || m3811y(c0804w, c0779b0, c0772a)) {
            return;
        }
        c0772a.m3813a();
        if (this.mStackFromEnd) {
            i10 = c0779b0.m3836c() - 1;
        } else {
            i10 = 0;
        }
        c0772a.f3183b = i10;
    }

    /* renamed from: B */
    private void m3788B(int i10, int i11, boolean z10, RecyclerView.C0779b0 c0779b0) {
        int i12;
        int mo4236m;
        this.mLayoutState.f3203m = resolveIsInfinite();
        this.mLayoutState.f3196f = i10;
        int[] iArr = this.mReusableIntPair;
        boolean z11 = false;
        iArr[0] = 0;
        int i13 = 1;
        iArr[1] = 0;
        calculateExtraLayoutSpace(c0779b0, iArr);
        int max = Math.max(0, this.mReusableIntPair[0]);
        int max2 = Math.max(0, this.mReusableIntPair[1]);
        if (i10 == 1) {
            z11 = true;
        }
        C0774c c0774c = this.mLayoutState;
        if (z11) {
            i12 = max2;
        } else {
            i12 = max;
        }
        c0774c.f3198h = i12;
        if (!z11) {
            max = max2;
        }
        c0774c.f3199i = max;
        if (z11) {
            c0774c.f3198h = i12 + this.mOrientationHelper.mo4233j();
            View m3802p = m3802p();
            C0774c c0774c2 = this.mLayoutState;
            if (this.mShouldReverseLayout) {
                i13 = -1;
            }
            c0774c2.f3195e = i13;
            int position = getPosition(m3802p);
            C0774c c0774c3 = this.mLayoutState;
            c0774c2.f3194d = position + c0774c3.f3195e;
            c0774c3.f3192b = this.mOrientationHelper.mo4227d(m3802p);
            mo4236m = this.mOrientationHelper.mo4227d(m3802p) - this.mOrientationHelper.mo4232i();
        } else {
            View m3803q = m3803q();
            this.mLayoutState.f3198h += this.mOrientationHelper.mo4236m();
            C0774c c0774c4 = this.mLayoutState;
            if (!this.mShouldReverseLayout) {
                i13 = -1;
            }
            c0774c4.f3195e = i13;
            int position2 = getPosition(m3803q);
            C0774c c0774c5 = this.mLayoutState;
            c0774c4.f3194d = position2 + c0774c5.f3195e;
            c0774c5.f3192b = this.mOrientationHelper.mo4230g(m3803q);
            mo4236m = (-this.mOrientationHelper.mo4230g(m3803q)) + this.mOrientationHelper.mo4236m();
        }
        C0774c c0774c6 = this.mLayoutState;
        c0774c6.f3193c = i11;
        if (z10) {
            c0774c6.f3193c = i11 - mo4236m;
        }
        c0774c6.f3197g = mo4236m;
    }

    /* renamed from: C */
    private void m3789C(int i10, int i11) {
        int i12;
        this.mLayoutState.f3193c = this.mOrientationHelper.mo4232i() - i11;
        C0774c c0774c = this.mLayoutState;
        if (this.mShouldReverseLayout) {
            i12 = -1;
        } else {
            i12 = 1;
        }
        c0774c.f3195e = i12;
        c0774c.f3194d = i10;
        c0774c.f3196f = 1;
        c0774c.f3192b = i11;
        c0774c.f3197g = Integer.MIN_VALUE;
    }

    /* renamed from: D */
    private void m3790D(C0772a c0772a) {
        m3789C(c0772a.f3183b, c0772a.f3184c);
    }

    /* renamed from: E */
    private void m3791E(int i10, int i11) {
        int i12;
        this.mLayoutState.f3193c = i11 - this.mOrientationHelper.mo4236m();
        C0774c c0774c = this.mLayoutState;
        c0774c.f3194d = i10;
        if (this.mShouldReverseLayout) {
            i12 = 1;
        } else {
            i12 = -1;
        }
        c0774c.f3195e = i12;
        c0774c.f3196f = -1;
        c0774c.f3192b = i11;
        c0774c.f3197g = Integer.MIN_VALUE;
    }

    /* renamed from: F */
    private void m3792F(C0772a c0772a) {
        m3791E(c0772a.f3183b, c0772a.f3184c);
    }

    /* renamed from: g */
    private int m3793g(RecyclerView.C0779b0 c0779b0) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return AbstractC0827n.m4254a(c0779b0, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    /* renamed from: h */
    private int m3794h(RecyclerView.C0779b0 c0779b0) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return AbstractC0827n.m4255b(c0779b0, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled, this.mShouldReverseLayout);
    }

    /* renamed from: i */
    private int m3795i(RecyclerView.C0779b0 c0779b0) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return AbstractC0827n.m4256c(c0779b0, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    /* renamed from: j */
    private View m3796j() {
        return findOnePartiallyOrCompletelyInvisibleChild(0, getChildCount());
    }

    /* renamed from: k */
    private View m3797k() {
        return findOnePartiallyOrCompletelyInvisibleChild(getChildCount() - 1, -1);
    }

    /* renamed from: l */
    private View m3798l() {
        if (this.mShouldReverseLayout) {
            return m3796j();
        }
        return m3797k();
    }

    /* renamed from: m */
    private View m3799m() {
        if (this.mShouldReverseLayout) {
            return m3797k();
        }
        return m3796j();
    }

    /* renamed from: n */
    private int m3800n(int i10, RecyclerView.C0804w c0804w, RecyclerView.C0779b0 c0779b0, boolean z10) {
        int mo4232i;
        int mo4232i2 = this.mOrientationHelper.mo4232i() - i10;
        if (mo4232i2 > 0) {
            int i11 = -scrollBy(-mo4232i2, c0804w, c0779b0);
            int i12 = i10 + i11;
            if (z10 && (mo4232i = this.mOrientationHelper.mo4232i() - i12) > 0) {
                this.mOrientationHelper.mo4241r(mo4232i);
                return mo4232i + i11;
            }
            return i11;
        }
        return 0;
    }

    /* renamed from: o */
    private int m3801o(int i10, RecyclerView.C0804w c0804w, RecyclerView.C0779b0 c0779b0, boolean z10) {
        int mo4236m;
        int mo4236m2 = i10 - this.mOrientationHelper.mo4236m();
        if (mo4236m2 > 0) {
            int i11 = -scrollBy(mo4236m2, c0804w, c0779b0);
            int i12 = i10 + i11;
            if (z10 && (mo4236m = i12 - this.mOrientationHelper.mo4236m()) > 0) {
                this.mOrientationHelper.mo4241r(-mo4236m);
                return i11 - mo4236m;
            }
            return i11;
        }
        return 0;
    }

    /* renamed from: p */
    private View m3802p() {
        int childCount;
        if (this.mShouldReverseLayout) {
            childCount = 0;
        } else {
            childCount = getChildCount() - 1;
        }
        return getChildAt(childCount);
    }

    /* renamed from: q */
    private View m3803q() {
        int i10;
        if (this.mShouldReverseLayout) {
            i10 = getChildCount() - 1;
        } else {
            i10 = 0;
        }
        return getChildAt(i10);
    }

    /* renamed from: r */
    private void m3804r(RecyclerView.C0804w c0804w, RecyclerView.C0779b0 c0779b0, int i10, int i11) {
        boolean z10;
        if (c0779b0.m3843j() && getChildCount() != 0 && !c0779b0.m3841h() && supportsPredictiveItemAnimations()) {
            List m3979k = c0804w.m3979k();
            int size = m3979k.size();
            int position = getPosition(getChildAt(0));
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < size; i14++) {
                RecyclerView.AbstractC0787f0 abstractC0787f0 = (RecyclerView.AbstractC0787f0) m3979k.get(i14);
                if (!abstractC0787f0.isRemoved()) {
                    char c10 = 1;
                    if (abstractC0787f0.getLayoutPosition() < position) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10 != this.mShouldReverseLayout) {
                        c10 = 65535;
                    }
                    if (c10 == 65535) {
                        i12 += this.mOrientationHelper.mo4228e(abstractC0787f0.itemView);
                    } else {
                        i13 += this.mOrientationHelper.mo4228e(abstractC0787f0.itemView);
                    }
                }
            }
            this.mLayoutState.f3202l = m3979k;
            if (i12 > 0) {
                m3791E(getPosition(m3803q()), i10);
                C0774c c0774c = this.mLayoutState;
                c0774c.f3198h = i12;
                c0774c.f3193c = 0;
                c0774c.m3820a();
                fill(c0804w, this.mLayoutState, c0779b0, false);
            }
            if (i13 > 0) {
                m3789C(getPosition(m3802p()), i11);
                C0774c c0774c2 = this.mLayoutState;
                c0774c2.f3198h = i13;
                c0774c2.f3193c = 0;
                c0774c2.m3820a();
                fill(c0804w, this.mLayoutState, c0779b0, false);
            }
            this.mLayoutState.f3202l = null;
        }
    }

    /* renamed from: s */
    private void m3805s() {
        Log.d(TAG, "internal representation of views on the screen");
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            Log.d(TAG, "item " + getPosition(childAt) + ", coord:" + this.mOrientationHelper.mo4230g(childAt));
        }
        Log.d(TAG, "==============");
    }

    /* renamed from: t */
    private void m3806t(RecyclerView.C0804w c0804w, C0774c c0774c) {
        if (c0774c.f3191a && !c0774c.f3203m) {
            int i10 = c0774c.f3197g;
            int i11 = c0774c.f3199i;
            if (c0774c.f3196f == -1) {
                m3808v(c0804w, i10, i11);
            } else {
                m3809w(c0804w, i10, i11);
            }
        }
    }

    /* renamed from: u */
    private void m3807u(RecyclerView.C0804w c0804w, int i10, int i11) {
        if (i10 == i11) {
            return;
        }
        if (i11 > i10) {
            for (int i12 = i11 - 1; i12 >= i10; i12--) {
                removeAndRecycleViewAt(i12, c0804w);
            }
            return;
        }
        while (i10 > i11) {
            removeAndRecycleViewAt(i10, c0804w);
            i10--;
        }
    }

    /* renamed from: v */
    private void m3808v(RecyclerView.C0804w c0804w, int i10, int i11) {
        int childCount = getChildCount();
        if (i10 < 0) {
            return;
        }
        int mo4231h = (this.mOrientationHelper.mo4231h() - i10) + i11;
        if (this.mShouldReverseLayout) {
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                if (this.mOrientationHelper.mo4230g(childAt) < mo4231h || this.mOrientationHelper.mo4240q(childAt) < mo4231h) {
                    m3807u(c0804w, 0, i12);
                    return;
                }
            }
            return;
        }
        int i13 = childCount - 1;
        for (int i14 = i13; i14 >= 0; i14--) {
            View childAt2 = getChildAt(i14);
            if (this.mOrientationHelper.mo4230g(childAt2) < mo4231h || this.mOrientationHelper.mo4240q(childAt2) < mo4231h) {
                m3807u(c0804w, i13, i14);
                return;
            }
        }
    }

    /* renamed from: w */
    private void m3809w(RecyclerView.C0804w c0804w, int i10, int i11) {
        if (i10 < 0) {
            return;
        }
        int i12 = i10 - i11;
        int childCount = getChildCount();
        if (this.mShouldReverseLayout) {
            int i13 = childCount - 1;
            for (int i14 = i13; i14 >= 0; i14--) {
                View childAt = getChildAt(i14);
                if (this.mOrientationHelper.mo4227d(childAt) > i12 || this.mOrientationHelper.mo4239p(childAt) > i12) {
                    m3807u(c0804w, i13, i14);
                    return;
                }
            }
            return;
        }
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt2 = getChildAt(i15);
            if (this.mOrientationHelper.mo4227d(childAt2) > i12 || this.mOrientationHelper.mo4239p(childAt2) > i12) {
                m3807u(c0804w, 0, i15);
                return;
            }
        }
    }

    /* renamed from: x */
    private void m3810x() {
        if (this.mOrientation != 1 && isLayoutRTL()) {
            this.mShouldReverseLayout = !this.mReverseLayout;
        } else {
            this.mShouldReverseLayout = this.mReverseLayout;
        }
    }

    /* renamed from: y */
    private boolean m3811y(RecyclerView.C0804w c0804w, RecyclerView.C0779b0 c0779b0, C0772a c0772a) {
        View findReferenceChild;
        boolean z10;
        boolean z11 = false;
        if (getChildCount() == 0) {
            return false;
        }
        View focusedChild = getFocusedChild();
        if (focusedChild != null && c0772a.m3816d(focusedChild, c0779b0)) {
            c0772a.m3815c(focusedChild, getPosition(focusedChild));
            return true;
        }
        boolean z12 = this.mLastStackFromEnd;
        boolean z13 = this.mStackFromEnd;
        if (z12 != z13 || (findReferenceChild = findReferenceChild(c0804w, c0779b0, c0772a.f3185d, z13)) == null) {
            return false;
        }
        c0772a.m3814b(findReferenceChild, getPosition(findReferenceChild));
        if (!c0779b0.m3841h() && supportsPredictiveItemAnimations()) {
            int mo4230g = this.mOrientationHelper.mo4230g(findReferenceChild);
            int mo4227d = this.mOrientationHelper.mo4227d(findReferenceChild);
            int mo4236m = this.mOrientationHelper.mo4236m();
            int mo4232i = this.mOrientationHelper.mo4232i();
            if (mo4227d <= mo4236m && mo4230g < mo4236m) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (mo4230g >= mo4232i && mo4227d > mo4232i) {
                z11 = true;
            }
            if (z10 || z11) {
                if (c0772a.f3185d) {
                    mo4236m = mo4232i;
                }
                c0772a.f3184c = mo4236m;
            }
        }
        return true;
    }

    /* renamed from: z */
    private boolean m3812z(RecyclerView.C0779b0 c0779b0, C0772a c0772a) {
        int i10;
        boolean z10;
        int mo4230g;
        boolean z11 = false;
        if (!c0779b0.m3841h() && (i10 = this.mPendingScrollPosition) != -1) {
            if (i10 >= 0 && i10 < c0779b0.m3836c()) {
                c0772a.f3183b = this.mPendingScrollPosition;
                C0775d c0775d = this.mPendingSavedState;
                if (c0775d != null && c0775d.m3825a()) {
                    boolean z12 = this.mPendingSavedState.f3206c;
                    c0772a.f3185d = z12;
                    if (z12) {
                        c0772a.f3184c = this.mOrientationHelper.mo4232i() - this.mPendingSavedState.f3205b;
                    } else {
                        c0772a.f3184c = this.mOrientationHelper.mo4236m() + this.mPendingSavedState.f3205b;
                    }
                    return true;
                }
                if (this.mPendingScrollPositionOffset == Integer.MIN_VALUE) {
                    View findViewByPosition = findViewByPosition(this.mPendingScrollPosition);
                    if (findViewByPosition != null) {
                        if (this.mOrientationHelper.mo4228e(findViewByPosition) > this.mOrientationHelper.mo4237n()) {
                            c0772a.m3813a();
                            return true;
                        }
                        if (this.mOrientationHelper.mo4230g(findViewByPosition) - this.mOrientationHelper.mo4236m() < 0) {
                            c0772a.f3184c = this.mOrientationHelper.mo4236m();
                            c0772a.f3185d = false;
                            return true;
                        }
                        if (this.mOrientationHelper.mo4232i() - this.mOrientationHelper.mo4227d(findViewByPosition) < 0) {
                            c0772a.f3184c = this.mOrientationHelper.mo4232i();
                            c0772a.f3185d = true;
                            return true;
                        }
                        if (c0772a.f3185d) {
                            mo4230g = this.mOrientationHelper.mo4227d(findViewByPosition) + this.mOrientationHelper.m4238o();
                        } else {
                            mo4230g = this.mOrientationHelper.mo4230g(findViewByPosition);
                        }
                        c0772a.f3184c = mo4230g;
                    } else {
                        if (getChildCount() > 0) {
                            if (this.mPendingScrollPosition < getPosition(getChildAt(0))) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10 == this.mShouldReverseLayout) {
                                z11 = true;
                            }
                            c0772a.f3185d = z11;
                        }
                        c0772a.m3813a();
                    }
                    return true;
                }
                boolean z13 = this.mShouldReverseLayout;
                c0772a.f3185d = z13;
                if (z13) {
                    c0772a.f3184c = this.mOrientationHelper.mo4232i() - this.mPendingScrollPositionOffset;
                } else {
                    c0772a.f3184c = this.mOrientationHelper.mo4236m() + this.mPendingScrollPositionOffset;
                }
                return true;
            }
            this.mPendingScrollPosition = -1;
            this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    @SuppressLint({"UnknownNullness"})
    public void assertNotInLayoutOrScroll(String str) {
        if (this.mPendingSavedState == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void calculateExtraLayoutSpace(RecyclerView.C0779b0 c0779b0, int[] iArr) {
        int i10;
        int extraLayoutSpace = getExtraLayoutSpace(c0779b0);
        if (this.mLayoutState.f3196f == -1) {
            i10 = 0;
        } else {
            i10 = extraLayoutSpace;
            extraLayoutSpace = 0;
        }
        iArr[0] = extraLayoutSpace;
        iArr[1] = i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    public boolean canScrollHorizontally() {
        if (this.mOrientation == 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    public boolean canScrollVertically() {
        if (this.mOrientation == 1) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    @SuppressLint({"UnknownNullness"})
    public void collectAdjacentPrefetchPositions(int i10, int i11, RecyclerView.C0779b0 c0779b0, RecyclerView.AbstractC0797p.c cVar) {
        int i12;
        if (this.mOrientation != 0) {
            i10 = i11;
        }
        if (getChildCount() != 0 && i10 != 0) {
            ensureLayoutState();
            if (i10 > 0) {
                i12 = 1;
            } else {
                i12 = -1;
            }
            m3788B(i12, Math.abs(i10), true, c0779b0);
            collectPrefetchPositionsForLayoutState(c0779b0, this.mLayoutState, cVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    @SuppressLint({"UnknownNullness"})
    public void collectInitialPrefetchPositions(int i10, RecyclerView.AbstractC0797p.c cVar) {
        boolean z10;
        int i11;
        C0775d c0775d = this.mPendingSavedState;
        int i12 = -1;
        if (c0775d != null && c0775d.m3825a()) {
            C0775d c0775d2 = this.mPendingSavedState;
            z10 = c0775d2.f3206c;
            i11 = c0775d2.f3204a;
        } else {
            m3810x();
            z10 = this.mShouldReverseLayout;
            i11 = this.mPendingScrollPosition;
            if (i11 == -1) {
                i11 = z10 ? i10 - 1 : 0;
            }
        }
        if (!z10) {
            i12 = 1;
        }
        for (int i13 = 0; i13 < this.mInitialPrefetchItemCount && i11 >= 0 && i11 < i10; i13++) {
            cVar.mo3924a(i11, 0);
            i11 += i12;
        }
    }

    void collectPrefetchPositionsForLayoutState(RecyclerView.C0779b0 c0779b0, C0774c c0774c, RecyclerView.AbstractC0797p.c cVar) {
        int i10 = c0774c.f3194d;
        if (i10 >= 0 && i10 < c0779b0.m3836c()) {
            cVar.mo3924a(i10, Math.max(0, c0774c.f3197g));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    @SuppressLint({"UnknownNullness"})
    public int computeHorizontalScrollExtent(RecyclerView.C0779b0 c0779b0) {
        return m3793g(c0779b0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    @SuppressLint({"UnknownNullness"})
    public int computeHorizontalScrollOffset(RecyclerView.C0779b0 c0779b0) {
        return m3794h(c0779b0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    @SuppressLint({"UnknownNullness"})
    public int computeHorizontalScrollRange(RecyclerView.C0779b0 c0779b0) {
        return m3795i(c0779b0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0777a0.b
    @SuppressLint({"UnknownNullness"})
    public PointF computeScrollVectorForPosition(int i10) {
        if (getChildCount() == 0) {
            return null;
        }
        boolean z10 = false;
        int i11 = 1;
        if (i10 < getPosition(getChildAt(0))) {
            z10 = true;
        }
        if (z10 != this.mShouldReverseLayout) {
            i11 = -1;
        }
        if (this.mOrientation == 0) {
            return new PointF(i11, 0.0f);
        }
        return new PointF(0.0f, i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    @SuppressLint({"UnknownNullness"})
    public int computeVerticalScrollExtent(RecyclerView.C0779b0 c0779b0) {
        return m3793g(c0779b0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    @SuppressLint({"UnknownNullness"})
    public int computeVerticalScrollOffset(RecyclerView.C0779b0 c0779b0) {
        return m3794h(c0779b0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    @SuppressLint({"UnknownNullness"})
    public int computeVerticalScrollRange(RecyclerView.C0779b0 c0779b0) {
        return m3795i(c0779b0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int convertFocusDirectionToLayoutDirection(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 17) {
                    if (i10 != 33) {
                        if (i10 != 66) {
                            if (i10 == 130 && this.mOrientation == 1) {
                                return 1;
                            }
                            return Integer.MIN_VALUE;
                        }
                        if (this.mOrientation == 0) {
                            return 1;
                        }
                        return Integer.MIN_VALUE;
                    }
                    if (this.mOrientation == 1) {
                        return -1;
                    }
                    return Integer.MIN_VALUE;
                }
                if (this.mOrientation == 0) {
                    return -1;
                }
                return Integer.MIN_VALUE;
            }
            if (this.mOrientation != 1 && isLayoutRTL()) {
                return -1;
            }
            return 1;
        }
        if (this.mOrientation == 1 || !isLayoutRTL()) {
            return -1;
        }
        return 1;
    }

    C0774c createLayoutState() {
        return new C0774c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void ensureLayoutState() {
        if (this.mLayoutState == null) {
            this.mLayoutState = createLayoutState();
        }
    }

    int fill(RecyclerView.C0804w c0804w, C0774c c0774c, RecyclerView.C0779b0 c0779b0, boolean z10) {
        int i10 = c0774c.f3193c;
        int i11 = c0774c.f3197g;
        if (i11 != Integer.MIN_VALUE) {
            if (i10 < 0) {
                c0774c.f3197g = i11 + i10;
            }
            m3806t(c0804w, c0774c);
        }
        int i12 = c0774c.f3193c + c0774c.f3198h;
        C0773b c0773b = this.mLayoutChunkResult;
        while (true) {
            if ((!c0774c.f3203m && i12 <= 0) || !c0774c.m3822c(c0779b0)) {
                break;
            }
            c0773b.m3818a();
            layoutChunk(c0804w, c0779b0, c0774c, c0773b);
            if (!c0773b.f3188b) {
                c0774c.f3192b += c0773b.f3187a * c0774c.f3196f;
                if (!c0773b.f3189c || c0774c.f3202l != null || !c0779b0.m3841h()) {
                    int i13 = c0774c.f3193c;
                    int i14 = c0773b.f3187a;
                    c0774c.f3193c = i13 - i14;
                    i12 -= i14;
                }
                int i15 = c0774c.f3197g;
                if (i15 != Integer.MIN_VALUE) {
                    int i16 = i15 + c0773b.f3187a;
                    c0774c.f3197g = i16;
                    int i17 = c0774c.f3193c;
                    if (i17 < 0) {
                        c0774c.f3197g = i16 + i17;
                    }
                    m3806t(c0804w, c0774c);
                }
                if (z10 && c0773b.f3190d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i10 - c0774c.f3193c;
    }

    public int findFirstCompletelyVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(0, getChildCount(), true, false);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return getPosition(findOneVisibleChild);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View findFirstVisibleChildClosestToEnd(boolean z10, boolean z11) {
        if (this.mShouldReverseLayout) {
            return findOneVisibleChild(0, getChildCount(), z10, z11);
        }
        return findOneVisibleChild(getChildCount() - 1, -1, z10, z11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View findFirstVisibleChildClosestToStart(boolean z10, boolean z11) {
        if (this.mShouldReverseLayout) {
            return findOneVisibleChild(getChildCount() - 1, -1, z10, z11);
        }
        return findOneVisibleChild(0, getChildCount(), z10, z11);
    }

    public int findFirstVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(0, getChildCount(), false, true);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return getPosition(findOneVisibleChild);
    }

    public int findLastCompletelyVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, true, false);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return getPosition(findOneVisibleChild);
    }

    public int findLastVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, false, true);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return getPosition(findOneVisibleChild);
    }

    View findOnePartiallyOrCompletelyInvisibleChild(int i10, int i11) {
        char c10;
        int i12;
        int i13;
        ensureLayoutState();
        if (i11 > i10) {
            c10 = 1;
        } else if (i11 < i10) {
            c10 = 65535;
        } else {
            c10 = 0;
        }
        if (c10 == 0) {
            return getChildAt(i10);
        }
        if (this.mOrientationHelper.mo4230g(getChildAt(i10)) < this.mOrientationHelper.mo4236m()) {
            i12 = 16644;
            i13 = 16388;
        } else {
            i12 = 4161;
            i13 = C3395q.a.f14857a;
        }
        if (this.mOrientation == 0) {
            return this.mHorizontalBoundCheck.m4277a(i10, i11, i12, i13);
        }
        return this.mVerticalBoundCheck.m4277a(i10, i11, i12, i13);
    }

    View findOneVisibleChild(int i10, int i11, boolean z10, boolean z11) {
        int i12;
        ensureLayoutState();
        int i13 = 320;
        if (z10) {
            i12 = 24579;
        } else {
            i12 = 320;
        }
        if (!z11) {
            i13 = 0;
        }
        if (this.mOrientation == 0) {
            return this.mHorizontalBoundCheck.m4277a(i10, i11, i12, i13);
        }
        return this.mVerticalBoundCheck.m4277a(i10, i11, i12, i13);
    }

    View findReferenceChild(RecyclerView.C0804w c0804w, RecyclerView.C0779b0 c0779b0, boolean z10, boolean z11) {
        int i10;
        int i11;
        int i12;
        boolean z12;
        boolean z13;
        ensureLayoutState();
        int childCount = getChildCount();
        if (z11) {
            i11 = getChildCount() - 1;
            i10 = -1;
            i12 = -1;
        } else {
            i10 = childCount;
            i11 = 0;
            i12 = 1;
        }
        int m3836c = c0779b0.m3836c();
        int mo4236m = this.mOrientationHelper.mo4236m();
        int mo4232i = this.mOrientationHelper.mo4232i();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i11 != i10) {
            View childAt = getChildAt(i11);
            int position = getPosition(childAt);
            int mo4230g = this.mOrientationHelper.mo4230g(childAt);
            int mo4227d = this.mOrientationHelper.mo4227d(childAt);
            if (position >= 0 && position < m3836c) {
                if (((RecyclerView.C0798q) childAt.getLayoutParams()).m3928d()) {
                    if (view3 == null) {
                        view3 = childAt;
                    }
                } else {
                    if (mo4227d <= mo4236m && mo4230g < mo4236m) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (mo4230g >= mo4232i && mo4227d > mo4232i) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (!z12 && !z13) {
                        return childAt;
                    }
                    if (z10) {
                        if (!z13) {
                            if (view != null) {
                            }
                            view = childAt;
                        }
                        view2 = childAt;
                    } else {
                        if (!z12) {
                            if (view != null) {
                            }
                            view = childAt;
                        }
                        view2 = childAt;
                    }
                }
            }
            i11 += i12;
        }
        if (view == null) {
            if (view2 != null) {
                return view2;
            }
            return view3;
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    @SuppressLint({"UnknownNullness"})
    public View findViewByPosition(int i10) {
        int childCount = getChildCount();
        if (childCount == 0) {
            return null;
        }
        int position = i10 - getPosition(getChildAt(0));
        if (position >= 0 && position < childCount) {
            View childAt = getChildAt(position);
            if (getPosition(childAt) == i10) {
                return childAt;
            }
        }
        return super.findViewByPosition(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    @SuppressLint({"UnknownNullness"})
    public RecyclerView.C0798q generateDefaultLayoutParams() {
        return new RecyclerView.C0798q(-2, -2);
    }

    @Deprecated
    protected int getExtraLayoutSpace(RecyclerView.C0779b0 c0779b0) {
        if (c0779b0.m3840g()) {
            return this.mOrientationHelper.mo4237n();
        }
        return 0;
    }

    public int getInitialPrefetchItemCount() {
        return this.mInitialPrefetchItemCount;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public boolean getRecycleChildrenOnDetach() {
        return this.mRecycleChildrenOnDetach;
    }

    public boolean getReverseLayout() {
        return this.mReverseLayout;
    }

    public boolean getStackFromEnd() {
        return this.mStackFromEnd;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    public boolean isAutoMeasureEnabled() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean isLayoutRTL() {
        if (getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    public boolean isSmoothScrollbarEnabled() {
        return this.mSmoothScrollbarEnabled;
    }

    void layoutChunk(RecyclerView.C0804w c0804w, RecyclerView.C0779b0 c0779b0, C0774c c0774c, C0773b c0773b) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        int mo4229f;
        boolean z11;
        View m3823d = c0774c.m3823d(c0804w);
        if (m3823d == null) {
            c0773b.f3188b = true;
            return;
        }
        RecyclerView.C0798q c0798q = (RecyclerView.C0798q) m3823d.getLayoutParams();
        if (c0774c.f3202l == null) {
            boolean z12 = this.mShouldReverseLayout;
            if (c0774c.f3196f == -1) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z12 == z11) {
                addView(m3823d);
            } else {
                addView(m3823d, 0);
            }
        } else {
            boolean z13 = this.mShouldReverseLayout;
            if (c0774c.f3196f == -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z13 == z10) {
                addDisappearingView(m3823d);
            } else {
                addDisappearingView(m3823d, 0);
            }
        }
        measureChildWithMargins(m3823d, 0, 0);
        c0773b.f3187a = this.mOrientationHelper.mo4228e(m3823d);
        if (this.mOrientation == 1) {
            if (isLayoutRTL()) {
                mo4229f = getWidth() - getPaddingRight();
                i13 = mo4229f - this.mOrientationHelper.mo4229f(m3823d);
            } else {
                i13 = getPaddingLeft();
                mo4229f = this.mOrientationHelper.mo4229f(m3823d) + i13;
            }
            if (c0774c.f3196f == -1) {
                int i14 = c0774c.f3192b;
                i12 = i14;
                i11 = mo4229f;
                i10 = i14 - c0773b.f3187a;
            } else {
                int i15 = c0774c.f3192b;
                i10 = i15;
                i11 = mo4229f;
                i12 = c0773b.f3187a + i15;
            }
        } else {
            int paddingTop = getPaddingTop();
            int mo4229f2 = this.mOrientationHelper.mo4229f(m3823d) + paddingTop;
            if (c0774c.f3196f == -1) {
                int i16 = c0774c.f3192b;
                i11 = i16;
                i10 = paddingTop;
                i12 = mo4229f2;
                i13 = i16 - c0773b.f3187a;
            } else {
                int i17 = c0774c.f3192b;
                i10 = paddingTop;
                i11 = c0773b.f3187a + i17;
                i12 = mo4229f2;
                i13 = i17;
            }
        }
        layoutDecoratedWithMargins(m3823d, i13, i10, i11, i12);
        if (c0798q.m3928d() || c0798q.m3927c()) {
            c0773b.f3189c = true;
        }
        c0773b.f3190d = m3823d.hasFocusable();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onAnchorReady(RecyclerView.C0804w c0804w, RecyclerView.C0779b0 c0779b0, C0772a c0772a, int i10) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    @SuppressLint({"UnknownNullness"})
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.C0804w c0804w) {
        super.onDetachedFromWindow(recyclerView, c0804w);
        if (this.mRecycleChildrenOnDetach) {
            removeAndRecycleAllViews(c0804w);
            c0804w.m3971c();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    @SuppressLint({"UnknownNullness"})
    public View onFocusSearchFailed(View view, int i10, RecyclerView.C0804w c0804w, RecyclerView.C0779b0 c0779b0) {
        int convertFocusDirectionToLayoutDirection;
        View m3798l;
        View m3802p;
        m3810x();
        if (getChildCount() == 0 || (convertFocusDirectionToLayoutDirection = convertFocusDirectionToLayoutDirection(i10)) == Integer.MIN_VALUE) {
            return null;
        }
        ensureLayoutState();
        m3788B(convertFocusDirectionToLayoutDirection, (int) (this.mOrientationHelper.mo4237n() * MAX_SCROLL_FACTOR), false, c0779b0);
        C0774c c0774c = this.mLayoutState;
        c0774c.f3197g = Integer.MIN_VALUE;
        c0774c.f3191a = false;
        fill(c0804w, c0774c, c0779b0, true);
        if (convertFocusDirectionToLayoutDirection == -1) {
            m3798l = m3799m();
        } else {
            m3798l = m3798l();
        }
        if (convertFocusDirectionToLayoutDirection == -1) {
            m3802p = m3803q();
        } else {
            m3802p = m3802p();
        }
        if (m3802p.hasFocusable()) {
            if (m3798l == null) {
                return null;
            }
            return m3802p;
        }
        return m3798l;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    @SuppressLint({"UnknownNullness"})
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(findFirstVisibleItemPosition());
            accessibilityEvent.setToIndex(findLastVisibleItemPosition());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    @SuppressLint({"UnknownNullness"})
    public void onLayoutChildren(RecyclerView.C0804w c0804w, RecyclerView.C0779b0 c0779b0) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int m3800n;
        int i15;
        View findViewByPosition;
        int mo4230g;
        int i16;
        int i17 = -1;
        if ((this.mPendingSavedState != null || this.mPendingScrollPosition != -1) && c0779b0.m3836c() == 0) {
            removeAndRecycleAllViews(c0804w);
            return;
        }
        C0775d c0775d = this.mPendingSavedState;
        if (c0775d != null && c0775d.m3825a()) {
            this.mPendingScrollPosition = this.mPendingSavedState.f3204a;
        }
        ensureLayoutState();
        this.mLayoutState.f3191a = false;
        m3810x();
        View focusedChild = getFocusedChild();
        C0772a c0772a = this.mAnchorInfo;
        if (c0772a.f3186e && this.mPendingScrollPosition == -1 && this.mPendingSavedState == null) {
            if (focusedChild != null && (this.mOrientationHelper.mo4230g(focusedChild) >= this.mOrientationHelper.mo4232i() || this.mOrientationHelper.mo4227d(focusedChild) <= this.mOrientationHelper.mo4236m())) {
                this.mAnchorInfo.m3815c(focusedChild, getPosition(focusedChild));
            }
        } else {
            c0772a.m3817e();
            C0772a c0772a2 = this.mAnchorInfo;
            c0772a2.f3185d = this.mShouldReverseLayout ^ this.mStackFromEnd;
            m3787A(c0804w, c0779b0, c0772a2);
            this.mAnchorInfo.f3186e = true;
        }
        C0774c c0774c = this.mLayoutState;
        if (c0774c.f3201k >= 0) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        c0774c.f3196f = i10;
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        calculateExtraLayoutSpace(c0779b0, iArr);
        int max = Math.max(0, this.mReusableIntPair[0]) + this.mOrientationHelper.mo4236m();
        int max2 = Math.max(0, this.mReusableIntPair[1]) + this.mOrientationHelper.mo4233j();
        if (c0779b0.m3841h() && (i15 = this.mPendingScrollPosition) != -1 && this.mPendingScrollPositionOffset != Integer.MIN_VALUE && (findViewByPosition = findViewByPosition(i15)) != null) {
            if (this.mShouldReverseLayout) {
                i16 = this.mOrientationHelper.mo4232i() - this.mOrientationHelper.mo4227d(findViewByPosition);
                mo4230g = this.mPendingScrollPositionOffset;
            } else {
                mo4230g = this.mOrientationHelper.mo4230g(findViewByPosition) - this.mOrientationHelper.mo4236m();
                i16 = this.mPendingScrollPositionOffset;
            }
            int i18 = i16 - mo4230g;
            if (i18 > 0) {
                max += i18;
            } else {
                max2 -= i18;
            }
        }
        C0772a c0772a3 = this.mAnchorInfo;
        if (!c0772a3.f3185d ? !this.mShouldReverseLayout : this.mShouldReverseLayout) {
            i17 = 1;
        }
        onAnchorReady(c0804w, c0779b0, c0772a3, i17);
        detachAndScrapAttachedViews(c0804w);
        this.mLayoutState.f3203m = resolveIsInfinite();
        this.mLayoutState.f3200j = c0779b0.m3841h();
        this.mLayoutState.f3199i = 0;
        C0772a c0772a4 = this.mAnchorInfo;
        if (c0772a4.f3185d) {
            m3792F(c0772a4);
            C0774c c0774c2 = this.mLayoutState;
            c0774c2.f3198h = max;
            fill(c0804w, c0774c2, c0779b0, false);
            C0774c c0774c3 = this.mLayoutState;
            i12 = c0774c3.f3192b;
            int i19 = c0774c3.f3194d;
            int i20 = c0774c3.f3193c;
            if (i20 > 0) {
                max2 += i20;
            }
            m3790D(this.mAnchorInfo);
            C0774c c0774c4 = this.mLayoutState;
            c0774c4.f3198h = max2;
            c0774c4.f3194d += c0774c4.f3195e;
            fill(c0804w, c0774c4, c0779b0, false);
            C0774c c0774c5 = this.mLayoutState;
            i11 = c0774c5.f3192b;
            int i21 = c0774c5.f3193c;
            if (i21 > 0) {
                m3791E(i19, i12);
                C0774c c0774c6 = this.mLayoutState;
                c0774c6.f3198h = i21;
                fill(c0804w, c0774c6, c0779b0, false);
                i12 = this.mLayoutState.f3192b;
            }
        } else {
            m3790D(c0772a4);
            C0774c c0774c7 = this.mLayoutState;
            c0774c7.f3198h = max2;
            fill(c0804w, c0774c7, c0779b0, false);
            C0774c c0774c8 = this.mLayoutState;
            i11 = c0774c8.f3192b;
            int i22 = c0774c8.f3194d;
            int i23 = c0774c8.f3193c;
            if (i23 > 0) {
                max += i23;
            }
            m3792F(this.mAnchorInfo);
            C0774c c0774c9 = this.mLayoutState;
            c0774c9.f3198h = max;
            c0774c9.f3194d += c0774c9.f3195e;
            fill(c0804w, c0774c9, c0779b0, false);
            C0774c c0774c10 = this.mLayoutState;
            i12 = c0774c10.f3192b;
            int i24 = c0774c10.f3193c;
            if (i24 > 0) {
                m3789C(i22, i11);
                C0774c c0774c11 = this.mLayoutState;
                c0774c11.f3198h = i24;
                fill(c0804w, c0774c11, c0779b0, false);
                i11 = this.mLayoutState.f3192b;
            }
        }
        if (getChildCount() > 0) {
            if (this.mShouldReverseLayout ^ this.mStackFromEnd) {
                int m3800n2 = m3800n(i11, c0804w, c0779b0, true);
                i13 = i12 + m3800n2;
                i14 = i11 + m3800n2;
                m3800n = m3801o(i13, c0804w, c0779b0, false);
            } else {
                int m3801o = m3801o(i12, c0804w, c0779b0, true);
                i13 = i12 + m3801o;
                i14 = i11 + m3801o;
                m3800n = m3800n(i14, c0804w, c0779b0, false);
            }
            i12 = i13 + m3800n;
            i11 = i14 + m3800n;
        }
        m3804r(c0804w, c0779b0, i12, i11);
        if (!c0779b0.m3841h()) {
            this.mOrientationHelper.m4242s();
        } else {
            this.mAnchorInfo.m3817e();
        }
        this.mLastStackFromEnd = this.mStackFromEnd;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    @SuppressLint({"UnknownNullness"})
    public void onLayoutCompleted(RecyclerView.C0779b0 c0779b0) {
        super.onLayoutCompleted(c0779b0);
        this.mPendingSavedState = null;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mAnchorInfo.m3817e();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    @SuppressLint({"UnknownNullness"})
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof C0775d) {
            C0775d c0775d = (C0775d) parcelable;
            this.mPendingSavedState = c0775d;
            if (this.mPendingScrollPosition != -1) {
                c0775d.m3826b();
            }
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    @SuppressLint({"UnknownNullness"})
    public Parcelable onSaveInstanceState() {
        if (this.mPendingSavedState != null) {
            return new C0775d(this.mPendingSavedState);
        }
        C0775d c0775d = new C0775d();
        if (getChildCount() > 0) {
            ensureLayoutState();
            boolean z10 = this.mLastStackFromEnd ^ this.mShouldReverseLayout;
            c0775d.f3206c = z10;
            if (z10) {
                View m3802p = m3802p();
                c0775d.f3205b = this.mOrientationHelper.mo4232i() - this.mOrientationHelper.mo4227d(m3802p);
                c0775d.f3204a = getPosition(m3802p);
            } else {
                View m3803q = m3803q();
                c0775d.f3204a = getPosition(m3803q);
                c0775d.f3205b = this.mOrientationHelper.mo4230g(m3803q) - this.mOrientationHelper.mo4236m();
            }
        } else {
            c0775d.m3826b();
        }
        return c0775d;
    }

    public void prepareForDrop(View view, View view2, int i10, int i11) {
        char c10;
        assertNotInLayoutOrScroll("Cannot drop a view during a scroll or layout calculation");
        ensureLayoutState();
        m3810x();
        int position = getPosition(view);
        int position2 = getPosition(view2);
        if (position < position2) {
            c10 = 1;
        } else {
            c10 = 65535;
        }
        if (this.mShouldReverseLayout) {
            if (c10 == 1) {
                scrollToPositionWithOffset(position2, this.mOrientationHelper.mo4232i() - (this.mOrientationHelper.mo4230g(view2) + this.mOrientationHelper.mo4228e(view)));
                return;
            } else {
                scrollToPositionWithOffset(position2, this.mOrientationHelper.mo4232i() - this.mOrientationHelper.mo4227d(view2));
                return;
            }
        }
        if (c10 == 65535) {
            scrollToPositionWithOffset(position2, this.mOrientationHelper.mo4230g(view2));
        } else {
            scrollToPositionWithOffset(position2, this.mOrientationHelper.mo4227d(view2) - this.mOrientationHelper.mo4228e(view));
        }
    }

    boolean resolveIsInfinite() {
        if (this.mOrientationHelper.mo4234k() == 0 && this.mOrientationHelper.mo4231h() == 0) {
            return true;
        }
        return false;
    }

    int scrollBy(int i10, RecyclerView.C0804w c0804w, RecyclerView.C0779b0 c0779b0) {
        int i11;
        if (getChildCount() == 0 || i10 == 0) {
            return 0;
        }
        ensureLayoutState();
        this.mLayoutState.f3191a = true;
        if (i10 > 0) {
            i11 = 1;
        } else {
            i11 = -1;
        }
        int abs = Math.abs(i10);
        m3788B(i11, abs, true, c0779b0);
        C0774c c0774c = this.mLayoutState;
        int fill = c0774c.f3197g + fill(c0804w, c0774c, c0779b0, false);
        if (fill < 0) {
            return 0;
        }
        if (abs > fill) {
            i10 = i11 * fill;
        }
        this.mOrientationHelper.mo4241r(-i10);
        this.mLayoutState.f3201k = i10;
        return i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    @SuppressLint({"UnknownNullness"})
    public int scrollHorizontallyBy(int i10, RecyclerView.C0804w c0804w, RecyclerView.C0779b0 c0779b0) {
        if (this.mOrientation == 1) {
            return 0;
        }
        return scrollBy(i10, c0804w, c0779b0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    public void scrollToPosition(int i10) {
        this.mPendingScrollPosition = i10;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        C0775d c0775d = this.mPendingSavedState;
        if (c0775d != null) {
            c0775d.m3826b();
        }
        requestLayout();
    }

    public void scrollToPositionWithOffset(int i10, int i11) {
        this.mPendingScrollPosition = i10;
        this.mPendingScrollPositionOffset = i11;
        C0775d c0775d = this.mPendingSavedState;
        if (c0775d != null) {
            c0775d.m3826b();
        }
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    @SuppressLint({"UnknownNullness"})
    public int scrollVerticallyBy(int i10, RecyclerView.C0804w c0804w, RecyclerView.C0779b0 c0779b0) {
        if (this.mOrientation == 0) {
            return 0;
        }
        return scrollBy(i10, c0804w, c0779b0);
    }

    public void setInitialPrefetchItemCount(int i10) {
        this.mInitialPrefetchItemCount = i10;
    }

    public void setOrientation(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i10);
        }
        assertNotInLayoutOrScroll(null);
        if (i10 != this.mOrientation || this.mOrientationHelper == null) {
            AbstractC0824k m4225b = AbstractC0824k.m4225b(this, i10);
            this.mOrientationHelper = m4225b;
            this.mAnchorInfo.f3182a = m4225b;
            this.mOrientation = i10;
            requestLayout();
        }
    }

    public void setRecycleChildrenOnDetach(boolean z10) {
        this.mRecycleChildrenOnDetach = z10;
    }

    public void setReverseLayout(boolean z10) {
        assertNotInLayoutOrScroll(null);
        if (z10 == this.mReverseLayout) {
            return;
        }
        this.mReverseLayout = z10;
        requestLayout();
    }

    public void setSmoothScrollbarEnabled(boolean z10) {
        this.mSmoothScrollbarEnabled = z10;
    }

    public void setStackFromEnd(boolean z10) {
        assertNotInLayoutOrScroll(null);
        if (this.mStackFromEnd == z10) {
            return;
        }
        this.mStackFromEnd = z10;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    boolean shouldMeasureTwice() {
        if (getHeightMode() != 1073741824 && getWidthMode() != 1073741824 && hasFlexibleChildInBothOrientations()) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    @SuppressLint({"UnknownNullness"})
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.C0779b0 c0779b0, int i10) {
        C0821h c0821h = new C0821h(recyclerView.getContext());
        c0821h.setTargetPosition(i10);
        startSmoothScroll(c0821h);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    public boolean supportsPredictiveItemAnimations() {
        if (this.mPendingSavedState == null && this.mLastStackFromEnd == this.mStackFromEnd) {
            return true;
        }
        return false;
    }

    void validateChildOrder() {
        Log.d(TAG, "validating child count " + getChildCount());
        boolean z10 = true;
        if (getChildCount() < 1) {
            return;
        }
        int position = getPosition(getChildAt(0));
        int mo4230g = this.mOrientationHelper.mo4230g(getChildAt(0));
        if (this.mShouldReverseLayout) {
            for (int i10 = 1; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                int position2 = getPosition(childAt);
                int mo4230g2 = this.mOrientationHelper.mo4230g(childAt);
                if (position2 < position) {
                    m3805s();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("detected invalid position. loc invalid? ");
                    if (mo4230g2 >= mo4230g) {
                        z10 = false;
                    }
                    sb2.append(z10);
                    throw new RuntimeException(sb2.toString());
                }
                if (mo4230g2 > mo4230g) {
                    m3805s();
                    throw new RuntimeException("detected invalid location");
                }
            }
            return;
        }
        for (int i11 = 1; i11 < getChildCount(); i11++) {
            View childAt2 = getChildAt(i11);
            int position3 = getPosition(childAt2);
            int mo4230g3 = this.mOrientationHelper.mo4230g(childAt2);
            if (position3 < position) {
                m3805s();
                StringBuilder sb3 = new StringBuilder();
                sb3.append("detected invalid position. loc invalid? ");
                if (mo4230g3 >= mo4230g) {
                    z10 = false;
                }
                sb3.append(z10);
                throw new RuntimeException(sb3.toString());
            }
            if (mo4230g3 < mo4230g) {
                m3805s();
                throw new RuntimeException("detected invalid location");
            }
        }
    }

    public LinearLayoutManager(Context context, int i10, boolean z10) {
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new C0772a();
        this.mLayoutChunkResult = new C0773b();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        setOrientation(i10);
        setReverseLayout(z10);
    }

    @SuppressLint({"UnknownNullness"})
    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new C0772a();
        this.mLayoutChunkResult = new C0773b();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        RecyclerView.AbstractC0797p.d properties = RecyclerView.AbstractC0797p.getProperties(context, attributeSet, i10, i11);
        setOrientation(properties.f3261a);
        setReverseLayout(properties.f3263c);
        setStackFromEnd(properties.f3264d);
    }
}
