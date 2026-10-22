package com.core.sysopt.mark;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import androidx.appcompat.widget.C0439r;

/* loaded from: classes.dex */
public class TraceRecycledImageView extends C0439r {
    public TraceRecycledImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (RuntimeException e10) {
            Log.e("TraceRecycledImageView", "find exception and view is " + this);
            throw e10;
        }
    }
}
