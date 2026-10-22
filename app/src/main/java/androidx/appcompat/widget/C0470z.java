package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.appcompat.R$attr;

/* renamed from: androidx.appcompat.widget.z */
/* loaded from: classes.dex */
public class C0470z extends SeekBar {

    /* renamed from: a */
    private final C0372a0 f2017a;

    public C0470z(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.f2017a.m1598h();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f2017a.m1599i();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f2017a.m1597g(canvas);
    }

    public C0470z(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        AbstractC0422m2.m1832a(this, getContext());
        C0372a0 c0372a0 = new C0372a0(this);
        this.f2017a = c0372a0;
        c0372a0.mo1596c(attributeSet, i10);
    }
}
