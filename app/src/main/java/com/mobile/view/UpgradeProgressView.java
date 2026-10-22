package com.mobile.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import com.mobile.autoupdate.R$color;
import com.raizlabs.android.dbflow.sql.language.Operator;
import p433zd.AbstractC7786b;

/* loaded from: classes2.dex */
public class UpgradeProgressView extends View {

    /* renamed from: a */
    private int f11856a;

    /* renamed from: b */
    private float f11857b;

    /* renamed from: c */
    private float f11858c;

    /* renamed from: d */
    private Paint f11859d;

    /* renamed from: e */
    private Paint f11860e;

    /* renamed from: f */
    private Paint f11861f;

    /* renamed from: g */
    private final RectF f11862g;

    public UpgradeProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11856a = 0;
        this.f11858c = 0.0f;
        this.f11862g = new RectF();
        m11954a();
    }

    /* renamed from: a */
    private void m11954a() {
        Paint paint = new Paint(5);
        this.f11859d = paint;
        paint.setStrokeCap(Paint.Cap.ROUND);
        this.f11859d.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f11859d.setColor(Color.parseColor("#45454d"));
        this.f11860e = new Paint(5);
        Paint paint2 = new Paint(5);
        this.f11861f = paint2;
        paint2.setColor(-1);
        this.f11861f.setTextSize(AbstractC7786b.m30166j(24));
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        float measureText;
        super.onDraw(canvas);
        float f10 = this.f11857b;
        float measuredWidth = getMeasuredWidth();
        float f11 = this.f11857b;
        canvas.drawLine(f10, f10, measuredWidth - f11, f11, this.f11859d);
        float measuredWidth2 = ((this.f11856a * 1.0f) * getMeasuredWidth()) / 100.0f;
        RectF rectF = this.f11862g;
        rectF.left = 0.0f;
        rectF.top = 0.0f;
        rectF.right = measuredWidth2;
        rectF.bottom = getMeasuredHeight();
        RectF rectF2 = this.f11862g;
        float f12 = this.f11857b;
        canvas.drawRoundRect(rectF2, f12, f12, this.f11860e);
        String str = this.f11856a + Operator.Operation.MOD;
        if (this.f11856a <= 10) {
            measureText = measuredWidth2 + this.f11857b;
        } else {
            measureText = (measuredWidth2 - this.f11861f.measureText(str)) - this.f11857b;
        }
        canvas.drawText(str, measureText, this.f11858c, this.f11861f);
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f11857b = (getMeasuredHeight() * 1.0f) / 2.0f;
        this.f11859d.setStrokeWidth(getMeasuredHeight());
        this.f11860e.setShader(new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), new int[]{getResources().getColor(R$color.download_progress_start_color), getResources().getColor(R$color.download_progress_end_color)}, (float[]) null, Shader.TileMode.CLAMP));
        this.f11860e.setStrokeWidth(getMeasuredHeight());
        Paint.FontMetrics fontMetrics = this.f11861f.getFontMetrics();
        float f10 = this.f11857b;
        float f11 = fontMetrics.bottom;
        this.f11858c = (f10 + ((f11 - fontMetrics.top) / 2.0f)) - f11;
    }

    public void setInvalid(boolean z10) {
        LinearGradient linearGradient;
        if (z10) {
            linearGradient = new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), new int[]{Color.parseColor("#5c5c66"), Color.parseColor("#5c5c66")}, (float[]) null, Shader.TileMode.CLAMP);
        } else {
            linearGradient = new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), new int[]{getResources().getColor(R$color.download_progress_start_color), getResources().getColor(R$color.download_progress_end_color)}, (float[]) null, Shader.TileMode.CLAMP);
        }
        this.f11860e.setShader(linearGradient);
        invalidate();
    }

    public void setProgress(int i10) {
        if (i10 >= 0 && i10 <= 100) {
            this.f11856a = i10;
            invalidate();
        }
    }
}
