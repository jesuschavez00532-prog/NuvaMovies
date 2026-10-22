package com.open.leanback.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.AbstractC0828o;
import androidx.recyclerview.widget.RecyclerView;
import com.open.leanback.R$styleable;
import p433zd.AbstractC7786b;

/* renamed from: com.open.leanback.widget.a */
/* loaded from: classes2.dex */
public abstract class AbstractC3050a extends RecyclerView {

    /* renamed from: a */
    final GridLayoutManager f12501a;

    /* renamed from: b */
    private boolean f12502b;

    /* renamed from: c */
    private boolean f12503c;

    /* renamed from: d */
    private RecyclerView.AbstractC0794m f12504d;

    /* renamed from: e */
    private g f12505e;

    /* renamed from: f */
    private c f12506f;

    /* renamed from: g */
    RecyclerView.InterfaceC0805x f12507g;

    /* renamed from: h */
    private h f12508h;

    /* renamed from: i */
    private f f12509i;

    /* renamed from: j */
    private d f12510j;

    /* renamed from: k */
    private int f12511k;

    /* renamed from: l */
    int f12512l;

    /* renamed from: com.open.leanback.widget.a$a */
    /* loaded from: classes2.dex */
    class a implements RecyclerView.InterfaceC0805x {
        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0805x
        /* renamed from: a */
        public void mo3992a(RecyclerView.AbstractC0787f0 abstractC0787f0) {
            AbstractC3050a.this.f12501a.m12398A0(abstractC0787f0);
            RecyclerView.InterfaceC0805x interfaceC0805x = AbstractC3050a.this.f12507g;
            if (interfaceC0805x != null) {
                interfaceC0805x.mo3992a(abstractC0787f0);
            }
        }
    }

    /* renamed from: com.open.leanback.widget.a$b */
    /* loaded from: classes2.dex */
    class b extends RecyclerView.AbstractC0802u {
        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0802u
        public void onScrollStateChanged(RecyclerView recyclerView, int i10) {
            if (i10 != 0) {
                if ((i10 == 1 || i10 == 2) && AbstractC3050a.this.f12509i != null) {
                    AbstractC3050a.this.f12509i.mo12524c();
                    return;
                }
                return;
            }
            if (AbstractC3050a.this.f12509i != null) {
                AbstractC3050a.this.f12509i.mo12522a();
            }
            if (AbstractC3050a.this.f12510j != null && AbstractC3050a.this.getLastVisiblePosition() >= AbstractC3050a.this.getAdapter().getItemCount() - AbstractC3050a.this.f12511k) {
                AbstractC3050a.this.f12510j.onLoadMore();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0802u
        public void onScrolled(RecyclerView recyclerView, int i10, int i11) {
            if (AbstractC3050a.this.f12509i != null) {
                AbstractC3050a.this.f12509i.mo12523b();
            }
        }
    }

    /* renamed from: com.open.leanback.widget.a$c */
    /* loaded from: classes2.dex */
    public interface c {
        /* renamed from: a */
        boolean mo12521a(KeyEvent keyEvent);
    }

    /* renamed from: com.open.leanback.widget.a$d */
    /* loaded from: classes2.dex */
    public interface d {
        void onLoadMore();
    }

    /* renamed from: com.open.leanback.widget.a$e */
    /* loaded from: classes2.dex */
    public interface e {
    }

    /* renamed from: com.open.leanback.widget.a$f */
    /* loaded from: classes2.dex */
    public static abstract class f {
        /* renamed from: a */
        public abstract void mo12522a();

        /* renamed from: b */
        public abstract void mo12523b();

        /* renamed from: c */
        public abstract void mo12524c();
    }

    /* renamed from: com.open.leanback.widget.a$g */
    /* loaded from: classes2.dex */
    public interface g {
        /* renamed from: a */
        boolean mo12525a(MotionEvent motionEvent);
    }

    /* renamed from: com.open.leanback.widget.a$h */
    /* loaded from: classes2.dex */
    public interface h {
        /* renamed from: a */
        boolean mo489a(KeyEvent keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC3050a(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f12502b = true;
        this.f12503c = false;
        this.f12511k = 1;
        this.f12512l = 4;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this);
        this.f12501a = gridLayoutManager;
        setLayoutManager(gridLayoutManager);
        setPreserveFocusAfterLayout(false);
        setDescendantFocusability(262144);
        setHasFixedSize(true);
        setChildrenDrawingOrderEnabled(true);
        setWillNotDraw(true);
        setOverScrollMode(2);
        ((AbstractC0828o) getItemAnimator()).m4273U(false);
        super.setRecyclerListener(new a());
        addOnScrollListener(new b());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected boolean dispatchGenericFocusedEvent(MotionEvent motionEvent) {
        return super.dispatchGenericFocusedEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        c cVar = this.f12506f;
        if ((cVar != null && cVar.mo12521a(keyEvent)) || super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        h hVar = this.f12508h;
        if (hVar != null && hVar.mo489a(keyEvent)) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        g gVar = this.f12505e;
        if (gVar != null && gVar.mo12525a(motionEvent)) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: e */
    public void m12519e(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.f12392Z);
        this.f12501a.m12425V0(obtainStyledAttributes.getBoolean(R$styleable.lbBaseGridView_focusOutFront, false), obtainStyledAttributes.getBoolean(R$styleable.lbBaseGridView_focusOutEnd, false));
        this.f12501a.m12427W0(obtainStyledAttributes.getBoolean(R$styleable.lbBaseGridView_focusOutSideStart, true), obtainStyledAttributes.getBoolean(R$styleable.lbBaseGridView_focusOutSideEnd, true));
        this.f12501a.m12473u1(AbstractC7786b.m30163g(obtainStyledAttributes.getDimensionPixelSize(R$styleable.lbBaseGridView_android_verticalSpacing, obtainStyledAttributes.getDimensionPixelSize(R$styleable.lbBaseGridView_verticalMargin, 0))));
        this.f12501a.m12435c1(AbstractC7786b.m30166j(obtainStyledAttributes.getDimensionPixelSize(R$styleable.lbBaseGridView_android_horizontalSpacing, obtainStyledAttributes.getDimensionPixelSize(R$styleable.lbBaseGridView_horizontalMargin, 0))));
        int i10 = R$styleable.lbBaseGridView_android_gravity;
        if (obtainStyledAttributes.hasValue(i10)) {
            setGravity(obtainStyledAttributes.getInt(i10, 0));
        }
        obtainStyledAttributes.recycle();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public final boolean m12520f() {
        return isChildrenDrawingOrderEnabled();
    }

    @Override // android.view.View
    public View focusSearch(int i10) {
        if (isFocused()) {
            GridLayoutManager gridLayoutManager = this.f12501a;
            View findViewByPosition = gridLayoutManager.findViewByPosition(gridLayoutManager.m12416Q());
            if (findViewByPosition != null) {
                return focusSearch(findViewByPosition, i10);
            }
        }
        return super.focusSearch(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public int getChildDrawingOrder(int i10, int i11) {
        return this.f12501a.m12477x(this, i10, i11);
    }

    public int getExtraLayoutSpace() {
        return this.f12501a.m12397A();
    }

    public int getFocusScrollStrategy() {
        return this.f12501a.m12401C();
    }

    @Deprecated
    public int getHorizontalMargin() {
        return this.f12501a.m12404D();
    }

    public int getHorizontalSpacing() {
        return this.f12501a.m12404D();
    }

    public int getInitialPrefetchItemCount() {
        return this.f12512l;
    }

    public int getItemAlignmentOffset() {
        return this.f12501a.m12406E();
    }

    public float getItemAlignmentOffsetPercent() {
        return this.f12501a.m12407F();
    }

    public int getItemAlignmentViewId() {
        return this.f12501a.m12408G();
    }

    public int getLastVisiblePosition() {
        int childCount = getChildCount();
        if (childCount == 0) {
            return 0;
        }
        return getChildLayoutPosition(getChildAt(childCount - 1));
    }

    public h getOnUnhandledKeyListener() {
        return this.f12508h;
    }

    public final int getSaveChildrenLimitNumber() {
        return this.f12501a.f12439P.m12591c();
    }

    public final int getSaveChildrenPolicy() {
        return this.f12501a.f12439P.m12592d();
    }

    public int getSelectedPosition() {
        return this.f12501a.m12416Q();
    }

    public int getSelectedSubPosition() {
        return this.f12501a.m12422U();
    }

    @Deprecated
    public int getVerticalMargin() {
        return this.f12501a.m12426W();
    }

    public int getVerticalSpacing() {
        return this.f12501a.m12426W();
    }

    public int getWindowAlignment() {
        return this.f12501a.m12440f0();
    }

    public int getWindowAlignmentOffset() {
        return this.f12501a.m12442g0();
    }

    public float getWindowAlignmentOffsetPercent() {
        return this.f12501a.m12444h0();
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return this.f12503c;
    }

    @Override // android.view.View
    protected void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        this.f12501a.m12400B0(z10, i10, rect);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i10, Rect rect) {
        return this.f12501a.m12447i0(this, i10, rect);
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        this.f12501a.m12402C0(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void scrollToPosition(int i10) {
        if (this.f12501a.m12469s0()) {
            this.f12501a.m12472t1(i10, 0, 0);
        } else {
            super.scrollToPosition(i10);
        }
    }

    public void setAnimateChildLayout(boolean z10) {
        if (this.f12502b != z10) {
            this.f12502b = z10;
            if (!z10) {
                this.f12504d = getItemAnimator();
                super.setItemAnimator(null);
            } else {
                super.setItemAnimator(this.f12504d);
            }
        }
    }

    public void setChildrenVisibility(int i10) {
        this.f12501a.m12421T0(i10);
    }

    public void setExtraLayoutSpace(int i10) {
        this.f12501a.m12423U0(i10);
    }

    public void setFocusDrawingOrderEnabled(boolean z10) {
        super.setChildrenDrawingOrderEnabled(z10);
    }

    public void setFocusScrollStrategy(int i10) {
        if (i10 != 0 && i10 != 1 && i10 != 2) {
            throw new IllegalArgumentException("Invalid scrollStrategy");
        }
        this.f12501a.m12428X0(i10);
        requestLayout();
    }

    public final void setFocusSearchDisabled(boolean z10) {
        int i10;
        if (z10) {
            i10 = 393216;
        } else {
            i10 = 262144;
        }
        setDescendantFocusability(i10);
        this.f12501a.m12429Y0(z10);
    }

    public void setGravity(int i10) {
        this.f12501a.m12433b1(i10);
        requestLayout();
    }

    public void setHasOverlappingRendering(boolean z10) {
        this.f12503c = z10;
    }

    @Deprecated
    public void setHorizontalMargin(int i10) {
        setHorizontalSpacing(i10);
    }

    public void setHorizontalSpacing(int i10) {
        this.f12501a.m12435c1(i10);
        requestLayout();
    }

    public void setInitialPrefetchItemCount(int i10) {
        this.f12512l = i10;
    }

    public void setItemAlignmentOffset(int i10) {
        this.f12501a.m12437d1(i10);
        requestLayout();
    }

    public void setItemAlignmentOffsetPercent(float f10) {
        this.f12501a.m12439e1(f10);
        requestLayout();
    }

    public void setItemAlignmentOffsetWithPadding(boolean z10) {
        this.f12501a.m12441f1(z10);
        requestLayout();
    }

    public void setItemAlignmentViewId(int i10) {
        this.f12501a.m12443g1(i10);
    }

    @Deprecated
    public void setItemMargin(int i10) {
        setItemSpacing(i10);
    }

    public void setItemSpacing(int i10) {
        this.f12501a.m12445h1(i10);
        requestLayout();
    }

    public void setLayoutEnabled(boolean z10) {
        this.f12501a.m12448i1(z10);
    }

    public void setLoadMoreItemOffset(int i10) {
        this.f12511k = i10;
    }

    public void setOnChildLaidOutListener(InterfaceC3055f interfaceC3055f) {
        this.f12501a.m12451k1(interfaceC3055f);
    }

    public void setOnChildSelectedListener(InterfaceC3056g interfaceC3056g) {
        this.f12501a.m12454l1(interfaceC3056g);
    }

    public void setOnChildViewHolderSelectedListener(AbstractC3057h abstractC3057h) {
        this.f12501a.m12456m1(abstractC3057h);
    }

    public void setOnKeyInterceptListener(c cVar) {
        this.f12506f = cVar;
    }

    public void setOnLoadMoreListener(d dVar) {
        this.f12510j = dVar;
    }

    public void setOnMotionInterceptListener(e eVar) {
    }

    public void setOnScrollChangeListener(f fVar) {
        this.f12509i = fVar;
    }

    public void setOnTouchInterceptListener(g gVar) {
        this.f12505e = gVar;
    }

    public void setOnUnhandledKeyListener(h hVar) {
        this.f12508h = hVar;
    }

    public void setPruneChild(boolean z10) {
        this.f12501a.m12459n1(z10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setRecyclerListener(RecyclerView.InterfaceC0805x interfaceC0805x) {
        this.f12507g = interfaceC0805x;
    }

    public final void setSaveChildrenLimitNumber(int i10) {
        this.f12501a.f12439P.m12600m(i10);
    }

    public final void setSaveChildrenPolicy(int i10) {
        this.f12501a.f12439P.m12601n(i10);
    }

    public void setScrollEnabled(boolean z10) {
        this.f12501a.m12463p1(z10);
    }

    public void setSelectedPosition(int i10) {
        this.f12501a.m12466q1(i10, 0);
    }

    public void setSelectedPositionSmooth(int i10) {
        this.f12501a.m12470s1(i10);
        if (this.f12510j != null && i10 + (this.f12501a.f12430G * 2) >= getAdapter().getItemCount() - this.f12511k) {
            this.f12510j.onLoadMore();
        }
    }

    @Deprecated
    public void setVerticalMargin(int i10) {
        setVerticalSpacing(i10);
    }

    public void setVerticalSpacing(int i10) {
        this.f12501a.m12473u1(i10);
        requestLayout();
    }

    public void setWindowAlignment(int i10) {
        this.f12501a.m12474v1(i10);
        requestLayout();
    }

    public void setWindowAlignmentOffset(int i10) {
        this.f12501a.m12476w1(i10);
        requestLayout();
    }

    public void setWindowAlignmentOffsetPercent(float f10) {
        this.f12501a.m12478x1(f10);
        requestLayout();
    }

    public void setWindowAlignmentPreferKeyLineOverHighEdge(boolean z10) {
        this.f12501a.f12434K.m12602a().m12628u(z10);
        requestLayout();
    }

    public void setWindowAlignmentPreferKeyLineOverLowEdge(boolean z10) {
        this.f12501a.f12434K.m12602a().m12629v(z10);
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void smoothScrollToPosition(int i10) {
        if (this.f12501a.m12469s0()) {
            this.f12501a.m12472t1(i10, 0, 0);
        } else {
            super.smoothScrollToPosition(i10);
        }
    }
}
