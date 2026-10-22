package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.k */
/* loaded from: classes.dex */
public abstract class AbstractC0824k {

    /* renamed from: a */
    protected final RecyclerView.AbstractC0797p f3477a;

    /* renamed from: b */
    private int f3478b;

    /* renamed from: c */
    final Rect f3479c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.k$a */
    /* loaded from: classes.dex */
    public class a extends AbstractC0824k {
        a(RecyclerView.AbstractC0797p abstractC0797p) {
            super(abstractC0797p, null);
        }

        @Override // androidx.recyclerview.widget.AbstractC0824k
        /* renamed from: d */
        public int mo4227d(View view) {
            return this.f3477a.getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.C0798q) view.getLayoutParams())).rightMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC0824k
        /* renamed from: e */
        public int mo4228e(View view) {
            RecyclerView.C0798q c0798q = (RecyclerView.C0798q) view.getLayoutParams();
            return this.f3477a.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) c0798q).leftMargin + ((ViewGroup.MarginLayoutParams) c0798q).rightMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC0824k
        /* renamed from: f */
        public int mo4229f(View view) {
            RecyclerView.C0798q c0798q = (RecyclerView.C0798q) view.getLayoutParams();
            return this.f3477a.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) c0798q).topMargin + ((ViewGroup.MarginLayoutParams) c0798q).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC0824k
        /* renamed from: g */
        public int mo4230g(View view) {
            return this.f3477a.getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.C0798q) view.getLayoutParams())).leftMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC0824k
        /* renamed from: h */
        public int mo4231h() {
            return this.f3477a.getWidth();
        }

        @Override // androidx.recyclerview.widget.AbstractC0824k
        /* renamed from: i */
        public int mo4232i() {
            return this.f3477a.getWidth() - this.f3477a.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.AbstractC0824k
        /* renamed from: j */
        public int mo4233j() {
            return this.f3477a.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.AbstractC0824k
        /* renamed from: k */
        public int mo4234k() {
            return this.f3477a.getWidthMode();
        }

        @Override // androidx.recyclerview.widget.AbstractC0824k
        /* renamed from: l */
        public int mo4235l() {
            return this.f3477a.getHeightMode();
        }

        @Override // androidx.recyclerview.widget.AbstractC0824k
        /* renamed from: m */
        public int mo4236m() {
            return this.f3477a.getPaddingLeft();
        }

        @Override // androidx.recyclerview.widget.AbstractC0824k
        /* renamed from: n */
        public int mo4237n() {
            return (this.f3477a.getWidth() - this.f3477a.getPaddingLeft()) - this.f3477a.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.AbstractC0824k
        /* renamed from: p */
        public int mo4239p(View view) {
            this.f3477a.getTransformedBoundingBox(view, true, this.f3479c);
            return this.f3479c.right;
        }

        @Override // androidx.recyclerview.widget.AbstractC0824k
        /* renamed from: q */
        public int mo4240q(View view) {
            this.f3477a.getTransformedBoundingBox(view, true, this.f3479c);
            return this.f3479c.left;
        }

        @Override // androidx.recyclerview.widget.AbstractC0824k
        /* renamed from: r */
        public void mo4241r(int i10) {
            this.f3477a.offsetChildrenHorizontal(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.k$b */
    /* loaded from: classes.dex */
    public class b extends AbstractC0824k {
        b(RecyclerView.AbstractC0797p abstractC0797p) {
            super(abstractC0797p, null);
        }

        @Override // androidx.recyclerview.widget.AbstractC0824k
        /* renamed from: d */
        public int mo4227d(View view) {
            return this.f3477a.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.C0798q) view.getLayoutParams())).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC0824k
        /* renamed from: e */
        public int mo4228e(View view) {
            RecyclerView.C0798q c0798q = (RecyclerView.C0798q) view.getLayoutParams();
            return this.f3477a.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) c0798q).topMargin + ((ViewGroup.MarginLayoutParams) c0798q).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC0824k
        /* renamed from: f */
        public int mo4229f(View view) {
            RecyclerView.C0798q c0798q = (RecyclerView.C0798q) view.getLayoutParams();
            return this.f3477a.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) c0798q).leftMargin + ((ViewGroup.MarginLayoutParams) c0798q).rightMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC0824k
        /* renamed from: g */
        public int mo4230g(View view) {
            return this.f3477a.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.C0798q) view.getLayoutParams())).topMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC0824k
        /* renamed from: h */
        public int mo4231h() {
            return this.f3477a.getHeight();
        }

        @Override // androidx.recyclerview.widget.AbstractC0824k
        /* renamed from: i */
        public int mo4232i() {
            return this.f3477a.getHeight() - this.f3477a.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.AbstractC0824k
        /* renamed from: j */
        public int mo4233j() {
            return this.f3477a.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.AbstractC0824k
        /* renamed from: k */
        public int mo4234k() {
            return this.f3477a.getHeightMode();
        }

        @Override // androidx.recyclerview.widget.AbstractC0824k
        /* renamed from: l */
        public int mo4235l() {
            return this.f3477a.getWidthMode();
        }

        @Override // androidx.recyclerview.widget.AbstractC0824k
        /* renamed from: m */
        public int mo4236m() {
            return this.f3477a.getPaddingTop();
        }

        @Override // androidx.recyclerview.widget.AbstractC0824k
        /* renamed from: n */
        public int mo4237n() {
            return (this.f3477a.getHeight() - this.f3477a.getPaddingTop()) - this.f3477a.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.AbstractC0824k
        /* renamed from: p */
        public int mo4239p(View view) {
            this.f3477a.getTransformedBoundingBox(view, true, this.f3479c);
            return this.f3479c.bottom;
        }

        @Override // androidx.recyclerview.widget.AbstractC0824k
        /* renamed from: q */
        public int mo4240q(View view) {
            this.f3477a.getTransformedBoundingBox(view, true, this.f3479c);
            return this.f3479c.top;
        }

        @Override // androidx.recyclerview.widget.AbstractC0824k
        /* renamed from: r */
        public void mo4241r(int i10) {
            this.f3477a.offsetChildrenVertical(i10);
        }
    }

    /* synthetic */ AbstractC0824k(RecyclerView.AbstractC0797p abstractC0797p, a aVar) {
        this(abstractC0797p);
    }

    /* renamed from: a */
    public static AbstractC0824k m4224a(RecyclerView.AbstractC0797p abstractC0797p) {
        return new a(abstractC0797p);
    }

    /* renamed from: b */
    public static AbstractC0824k m4225b(RecyclerView.AbstractC0797p abstractC0797p, int i10) {
        if (i10 != 0) {
            if (i10 == 1) {
                return m4226c(abstractC0797p);
            }
            throw new IllegalArgumentException("invalid orientation");
        }
        return m4224a(abstractC0797p);
    }

    /* renamed from: c */
    public static AbstractC0824k m4226c(RecyclerView.AbstractC0797p abstractC0797p) {
        return new b(abstractC0797p);
    }

    /* renamed from: d */
    public abstract int mo4227d(View view);

    /* renamed from: e */
    public abstract int mo4228e(View view);

    /* renamed from: f */
    public abstract int mo4229f(View view);

    /* renamed from: g */
    public abstract int mo4230g(View view);

    /* renamed from: h */
    public abstract int mo4231h();

    /* renamed from: i */
    public abstract int mo4232i();

    /* renamed from: j */
    public abstract int mo4233j();

    /* renamed from: k */
    public abstract int mo4234k();

    /* renamed from: l */
    public abstract int mo4235l();

    /* renamed from: m */
    public abstract int mo4236m();

    /* renamed from: n */
    public abstract int mo4237n();

    /* renamed from: o */
    public int m4238o() {
        if (Integer.MIN_VALUE == this.f3478b) {
            return 0;
        }
        return mo4237n() - this.f3478b;
    }

    /* renamed from: p */
    public abstract int mo4239p(View view);

    /* renamed from: q */
    public abstract int mo4240q(View view);

    /* renamed from: r */
    public abstract void mo4241r(int i10);

    /* renamed from: s */
    public void m4242s() {
        this.f3478b = mo4237n();
    }

    private AbstractC0824k(RecyclerView.AbstractC0797p abstractC0797p) {
        this.f3478b = Integer.MIN_VALUE;
        this.f3479c = new Rect();
        this.f3477a = abstractC0797p;
    }
}
