package com.umeng.message.proguard;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

/* renamed from: com.umeng.message.proguard.ar */
/* loaded from: classes3.dex */
public final class C3572ar extends View {

    /* renamed from: a */
    private final Paint f15974a;

    public C3572ar(Context context) {
        super(context);
        Paint paint = new Paint();
        this.f15974a = paint;
        paint.setAntiAlias(true);
        paint.setColor(-9733746);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(C3597bo.m15440a(1.3f));
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        int width = getWidth() / 2;
        float min = Math.min(width, r1) * 0.618f;
        float f10 = width;
        float f11 = f10 - min;
        float height = getHeight() / 2;
        float f12 = height - min;
        float f13 = f10 + min;
        float f14 = height + min;
        canvas.drawLine(f11, f12, f13, f14, this.f15974a);
        canvas.drawLine(f13, f12, f11, f14, this.f15974a);
    }
}
