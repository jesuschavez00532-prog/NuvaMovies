package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.p */
/* loaded from: classes.dex */
public abstract class AbstractC0829p extends RecyclerView.AbstractC0800s {
    static final float MILLISECONDS_PER_INCH = 100.0f;
    private Scroller mGravityScroller;
    RecyclerView mRecyclerView;
    private final RecyclerView.AbstractC0802u mScrollListener = new a();

    /* renamed from: androidx.recyclerview.widget.p$a */
    /* loaded from: classes.dex */
    class a extends RecyclerView.AbstractC0802u {

        /* renamed from: a */
        boolean f3486a = false;

        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0802u
        public void onScrollStateChanged(RecyclerView recyclerView, int i10) {
            super.onScrollStateChanged(recyclerView, i10);
            if (i10 == 0 && this.f3486a) {
                this.f3486a = false;
                AbstractC0829p.this.snapToTargetExistingView();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0802u
        public void onScrolled(RecyclerView recyclerView, int i10, int i11) {
            if (i10 != 0 || i11 != 0) {
                this.f3486a = true;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.p$b */
    /* loaded from: classes.dex */
    public class b extends C0821h {
        b(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.C0821h
        protected float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return AbstractC0829p.MILLISECONDS_PER_INCH / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.C0821h, androidx.recyclerview.widget.RecyclerView.AbstractC0777a0
        protected void onTargetFound(View view, RecyclerView.C0779b0 c0779b0, RecyclerView.AbstractC0777a0.a aVar) {
            AbstractC0829p abstractC0829p = AbstractC0829p.this;
            RecyclerView recyclerView = abstractC0829p.mRecyclerView;
            if (recyclerView == null) {
                return;
            }
            int[] calculateDistanceToFinalSnap = abstractC0829p.calculateDistanceToFinalSnap(recyclerView.getLayoutManager(), view);
            int i10 = calculateDistanceToFinalSnap[0];
            int i11 = calculateDistanceToFinalSnap[1];
            int calculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i10), Math.abs(i11)));
            if (calculateTimeForDeceleration > 0) {
                aVar.m3833d(i10, i11, calculateTimeForDeceleration, this.mDecelerateInterpolator);
            }
        }
    }

    /* renamed from: a */
    private void m4274a() {
        this.mRecyclerView.removeOnScrollListener(this.mScrollListener);
        this.mRecyclerView.setOnFlingListener(null);
    }

    /* renamed from: b */
    private void m4275b() {
        if (this.mRecyclerView.getOnFlingListener() == null) {
            this.mRecyclerView.addOnScrollListener(this.mScrollListener);
            this.mRecyclerView.setOnFlingListener(this);
            return;
        }
        throw new IllegalStateException("An instance of OnFlingListener already set.");
    }

    /* renamed from: c */
    private boolean m4276c(RecyclerView.AbstractC0797p abstractC0797p, int i10, int i11) {
        RecyclerView.AbstractC0777a0 createScroller;
        int findTargetSnapPosition;
        if (!(abstractC0797p instanceof RecyclerView.AbstractC0777a0.b) || (createScroller = createScroller(abstractC0797p)) == null || (findTargetSnapPosition = findTargetSnapPosition(abstractC0797p, i10, i11)) == -1) {
            return false;
        }
        createScroller.setTargetPosition(findTargetSnapPosition);
        abstractC0797p.startSmoothScroll(createScroller);
        return true;
    }

    public void attachToRecyclerView(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.mRecyclerView;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            m4274a();
        }
        this.mRecyclerView = recyclerView;
        if (recyclerView != null) {
            m4275b();
            this.mGravityScroller = new Scroller(this.mRecyclerView.getContext(), new DecelerateInterpolator());
            snapToTargetExistingView();
        }
    }

    public abstract int[] calculateDistanceToFinalSnap(RecyclerView.AbstractC0797p abstractC0797p, View view);

    @SuppressLint({"UnknownNullness"})
    public int[] calculateScrollDistance(int i10, int i11) {
        this.mGravityScroller.fling(0, 0, i10, i11, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return new int[]{this.mGravityScroller.getFinalX(), this.mGravityScroller.getFinalY()};
    }

    protected RecyclerView.AbstractC0777a0 createScroller(RecyclerView.AbstractC0797p abstractC0797p) {
        return createSnapScroller(abstractC0797p);
    }

    @Deprecated
    protected C0821h createSnapScroller(RecyclerView.AbstractC0797p abstractC0797p) {
        if (!(abstractC0797p instanceof RecyclerView.AbstractC0777a0.b)) {
            return null;
        }
        return new b(this.mRecyclerView.getContext());
    }

    public abstract View findSnapView(RecyclerView.AbstractC0797p abstractC0797p);

    public abstract int findTargetSnapPosition(RecyclerView.AbstractC0797p abstractC0797p, int i10, int i11);

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0800s
    public boolean onFling(int i10, int i11) {
        RecyclerView.AbstractC0797p layoutManager = this.mRecyclerView.getLayoutManager();
        if (layoutManager == null || this.mRecyclerView.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.mRecyclerView.getMinFlingVelocity();
        if ((Math.abs(i11) <= minFlingVelocity && Math.abs(i10) <= minFlingVelocity) || !m4276c(layoutManager, i10, i11)) {
            return false;
        }
        return true;
    }

    void snapToTargetExistingView() {
        RecyclerView.AbstractC0797p layoutManager;
        View findSnapView;
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (findSnapView = findSnapView(layoutManager)) == null) {
            return;
        }
        int[] calculateDistanceToFinalSnap = calculateDistanceToFinalSnap(layoutManager, findSnapView);
        int i10 = calculateDistanceToFinalSnap[0];
        if (i10 != 0 || calculateDistanceToFinalSnap[1] != 0) {
            this.mRecyclerView.smoothScrollBy(i10, calculateDistanceToFinalSnap[1]);
        }
    }
}
