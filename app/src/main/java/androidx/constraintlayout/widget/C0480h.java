package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import androidx.constraintlayout.widget.AbstractC0475c;

/* renamed from: androidx.constraintlayout.widget.h */
/* loaded from: classes.dex */
public class C0480h extends View {
    public C0480h(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    public void setGuidelineBegin(int i10) {
        AbstractC0475c.a aVar = (AbstractC0475c.a) getLayoutParams();
        aVar.guideBegin = i10;
        setLayoutParams(aVar);
    }

    public void setGuidelineEnd(int i10) {
        AbstractC0475c.a aVar = (AbstractC0475c.a) getLayoutParams();
        aVar.guideEnd = i10;
        setLayoutParams(aVar);
    }

    public void setGuidelinePercent(float f10) {
        AbstractC0475c.a aVar = (AbstractC0475c.a) getLayoutParams();
        aVar.guidePercent = f10;
        setLayoutParams(aVar);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
    }
}
