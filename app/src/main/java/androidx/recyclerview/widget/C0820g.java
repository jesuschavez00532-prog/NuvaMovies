package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.g */
/* loaded from: classes.dex */
class C0820g {

    /* renamed from: b */
    int f3466b;

    /* renamed from: c */
    int f3467c;

    /* renamed from: d */
    int f3468d;

    /* renamed from: e */
    int f3469e;

    /* renamed from: h */
    boolean f3472h;

    /* renamed from: i */
    boolean f3473i;

    /* renamed from: a */
    boolean f3465a = true;

    /* renamed from: f */
    int f3470f = 0;

    /* renamed from: g */
    int f3471g = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean m4208a(RecyclerView.C0779b0 c0779b0) {
        int i10 = this.f3467c;
        if (i10 >= 0 && i10 < c0779b0.m3836c()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public View m4209b(RecyclerView.C0804w c0804w) {
        View m3983o = c0804w.m3983o(this.f3467c);
        this.f3467c += this.f3468d;
        return m3983o;
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f3466b + ", mCurrentPosition=" + this.f3467c + ", mItemDirection=" + this.f3468d + ", mLayoutDirection=" + this.f3469e + ", mStartLine=" + this.f3470f + ", mEndLine=" + this.f3471g + '}';
    }
}
