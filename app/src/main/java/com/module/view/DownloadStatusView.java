package com.module.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import be.AbstractC1314j;
import be.InterfaceC1312h;
import java.util.LinkedHashMap;
import java.util.Map;
import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class DownloadStatusView extends View {

    /* renamed from: a */
    private final InterfaceC1312h f12168a;

    /* renamed from: b */
    private final RectF f12169b;

    /* renamed from: c */
    private float f12170c;

    /* renamed from: d */
    private final Path f12171d;

    /* renamed from: e */
    private final Path f12172e;

    /* renamed from: f */
    private float f12173f;

    /* renamed from: g */
    private float f12174g;

    /* renamed from: h */
    public Map f12175h = new LinkedHashMap();

    public DownloadStatusView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        InterfaceC1312h m5965b;
        m5965b = AbstractC1314j.m5965b(C3033a.f12350a);
        this.f12168a = m5965b;
        this.f12169b = new RectF();
        this.f12170c = 2.0f;
        this.f12171d = new Path();
        this.f12172e = new Path();
    }

    private final Paint getPaint() {
        return (Paint) this.f12168a.getValue();
    }

    public final float getFraction() {
        return this.f12174g;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        boolean z10;
        AbstractC5868k.m23674f(canvas, "canvas");
        super.onDraw(canvas);
        getPaint().setStyle(Paint.Style.STROKE);
        getPaint().setStrokeWidth(this.f12170c);
        getPaint().setColor(Color.parseColor("#b3b3b3"));
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, (getWidth() / 2.0f) - this.f12170c, getPaint());
        getPaint().setColor(Color.parseColor("#0fbd13"));
        canvas.drawArc(this.f12169b, -90.0f, 360 * getFraction(), false, getPaint());
        getPaint().setStrokeCap(Paint.Cap.ROUND);
        if (getFraction() == 1.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            getPaint().setColor(Color.parseColor("#0fbd13"));
            Path path = this.f12172e;
            path.reset();
            path.moveTo(this.f12173f, getHeight() / 2.0f);
            path.lineTo(this.f12173f * 1.5f, (getHeight() * 2) / 3.0f);
            float width = getWidth();
            float f10 = this.f12173f;
            path.lineTo(width - f10, f10);
            canvas.drawPath(this.f12172e, getPaint());
            return;
        }
        getPaint().setColor(-1);
        Path path2 = this.f12171d;
        path2.reset();
        path2.moveTo(getWidth() / 2.0f, this.f12173f);
        path2.lineTo(getWidth() / 2.0f, getHeight() - this.f12173f);
        path2.moveTo(this.f12173f, getHeight() / 2.0f);
        path2.lineTo(getWidth() / 2.0f, getHeight() - this.f12173f);
        path2.lineTo(getWidth() - this.f12173f, getHeight() / 2.0f);
        canvas.drawPath(this.f12171d, getPaint());
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        RectF rectF = this.f12169b;
        float f10 = this.f12170c;
        rectF.set(f10, f10, getWidth() - this.f12170c, getHeight() - this.f12170c);
        this.f12170c = getWidth() / 12.0f;
        this.f12173f = getWidth() * 0.3f;
    }

    public final void setFraction(float f10) {
        this.f12174g = f10;
        invalidate();
    }
}
