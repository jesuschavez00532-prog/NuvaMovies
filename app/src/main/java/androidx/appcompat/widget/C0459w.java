package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import androidx.appcompat.R$attr;

/* renamed from: androidx.appcompat.widget.w */
/* loaded from: classes.dex */
public class C0459w extends RatingBar {

    /* renamed from: a */
    private final C0451u f1970a;

    public C0459w(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.ratingBarStyle);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        Bitmap m1944b = this.f1970a.m1944b();
        if (m1944b != null) {
            setMeasuredDimension(View.resolveSizeAndState(m1944b.getWidth() * getNumStars(), i10, 0), getMeasuredHeight());
        }
    }

    public C0459w(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        AbstractC0422m2.m1832a(this, getContext());
        C0451u c0451u = new C0451u(this);
        this.f1970a = c0451u;
        c0451u.mo1596c(attributeSet, i10);
    }
}
