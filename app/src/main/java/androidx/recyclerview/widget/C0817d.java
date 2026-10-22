package androidx.recyclerview.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.d */
/* loaded from: classes.dex */
public class C0817d extends RecyclerView.AbstractC0796o {

    /* renamed from: d */
    private static final int[] f3410d = {R.attr.listDivider};

    /* renamed from: a */
    private Drawable f3411a;

    /* renamed from: b */
    private int f3412b;

    /* renamed from: c */
    private final Rect f3413c = new Rect();

    public C0817d(Context context, int i10) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f3410d);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        this.f3411a = drawable;
        if (drawable == null) {
            Log.w("DividerItem", "@android:attr/listDivider was not set in the theme used for this DividerItemDecoration. Please set that attribute all call setDrawable()");
        }
        obtainStyledAttributes.recycle();
        m4171g(i10);
    }

    /* renamed from: d */
    private void m4168d(Canvas canvas, RecyclerView recyclerView) {
        int height;
        int i10;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i10 = recyclerView.getPaddingTop();
            height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), i10, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
        } else {
            height = recyclerView.getHeight();
            i10 = 0;
        }
        int childCount = recyclerView.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = recyclerView.getChildAt(i11);
            recyclerView.getLayoutManager().getDecoratedBoundsWithMargins(childAt, this.f3413c);
            int round = this.f3413c.right + Math.round(childAt.getTranslationX());
            this.f3411a.setBounds(round - this.f3411a.getIntrinsicWidth(), i10, round, height);
            this.f3411a.draw(canvas);
        }
        canvas.restore();
    }

    /* renamed from: e */
    private void m4169e(Canvas canvas, RecyclerView recyclerView) {
        int width;
        int i10;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i10 = recyclerView.getPaddingLeft();
            width = recyclerView.getWidth() - recyclerView.getPaddingRight();
            canvas.clipRect(i10, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
        } else {
            width = recyclerView.getWidth();
            i10 = 0;
        }
        int childCount = recyclerView.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = recyclerView.getChildAt(i11);
            recyclerView.getDecoratedBoundsWithMargins(childAt, this.f3413c);
            int round = this.f3413c.bottom + Math.round(childAt.getTranslationY());
            this.f3411a.setBounds(i10, round - this.f3411a.getIntrinsicHeight(), width, round);
            this.f3411a.draw(canvas);
        }
        canvas.restore();
    }

    /* renamed from: f */
    public void m4170f(Drawable drawable) {
        if (drawable != null) {
            this.f3411a = drawable;
            return;
        }
        throw new IllegalArgumentException("Drawable cannot be null.");
    }

    /* renamed from: g */
    public void m4171g(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException("Invalid orientation. It should be either HORIZONTAL or VERTICAL");
        }
        this.f3412b = i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0796o
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0779b0 c0779b0) {
        Drawable drawable = this.f3411a;
        if (drawable == null) {
            rect.set(0, 0, 0, 0);
        } else if (this.f3412b == 1) {
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        } else {
            rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0796o
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.C0779b0 c0779b0) {
        if (recyclerView.getLayoutManager() != null && this.f3411a != null) {
            if (this.f3412b == 1) {
                m4169e(canvas, recyclerView);
            } else {
                m4168d(canvas, recyclerView);
            }
        }
    }
}
