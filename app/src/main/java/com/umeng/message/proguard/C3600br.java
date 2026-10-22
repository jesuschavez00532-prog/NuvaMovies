package com.umeng.message.proguard;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.Button;

/* renamed from: com.umeng.message.proguard.br */
/* loaded from: classes3.dex */
public final class C3600br extends Button {

    /* renamed from: a */
    private Paint f16085a;

    /* renamed from: b */
    private float f16086b;

    /* renamed from: c */
    private float f16087c;

    /* renamed from: d */
    private float f16088d;

    /* renamed from: e */
    private float f16089e;

    /* renamed from: f */
    private float f16090f;

    /* renamed from: g */
    private int f16091g;

    public C3600br(Context context) {
        super(context);
        setBackgroundColor(0);
        this.f16085a = new Paint();
        this.f16091g = C3597bo.m15440a(1.0f);
        this.f16090f = C3597bo.m15440a(2.0f);
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f16086b = getWidth() / 2;
        this.f16087c = getHeight() / 2;
        float min = (Math.min(getHeight(), getWidth()) / 2) - this.f16091g;
        this.f16088d = min;
        this.f16089e = min / 1.4142f;
        this.f16085a.setAntiAlias(true);
        this.f16085a.setColor(-16777216);
        this.f16085a.setStyle(Paint.Style.FILL);
        canvas.drawCircle(this.f16086b, this.f16087c, this.f16088d, this.f16085a);
        this.f16085a.setColor(-1);
        this.f16085a.setStrokeWidth(this.f16090f);
        this.f16085a.setStyle(Paint.Style.STROKE);
        canvas.drawCircle(this.f16086b, this.f16087c, this.f16088d, this.f16085a);
        float f10 = this.f16086b;
        float f11 = this.f16089e;
        float f12 = this.f16087c;
        canvas.drawLine(f10 - f11, f12 - f11, f10 + f11, f12 + f11, this.f16085a);
        float f13 = this.f16086b;
        float f14 = this.f16089e;
        float f15 = this.f16087c;
        canvas.drawLine(f13 + f14, f15 - f14, f13 - f14, f15 + f14, this.f16085a);
    }
}
