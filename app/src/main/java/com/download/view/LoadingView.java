package com.download.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathDashPathEffect;
import android.graphics.PathMeasure;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.view.View;
import be.AbstractC1314j;
import be.InterfaceC1312h;
import com.download.R$color;
import java.util.LinkedHashMap;
import java.util.Map;
import ne.AbstractC5868k;
import p258o3.C5913i;
import re.AbstractC6578f;

/* loaded from: classes.dex */
public final class LoadingView extends View {

    /* renamed from: a */
    private final InterfaceC1312h f7000a;

    /* renamed from: b */
    private final Path f7001b;

    /* renamed from: c */
    private float f7002c;

    /* renamed from: d */
    private float f7003d;

    /* renamed from: e */
    private final Path f7004e;

    /* renamed from: f */
    private final PathMeasure f7005f;

    /* renamed from: g */
    private PathDashPathEffect f7006g;

    /* renamed from: h */
    private float f7007h;

    /* renamed from: i */
    private boolean f7008i;

    /* renamed from: j */
    public Map f7009j = new LinkedHashMap();

    public LoadingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        InterfaceC1312h m5965b;
        m5965b = AbstractC1314j.m5965b(C1664c.f7012a);
        this.f7000a = m5965b;
        this.f7001b = new Path();
        this.f7004e = new Path();
        this.f7005f = new PathMeasure();
    }

    private final Paint getPaint() {
        return (Paint) this.f7000a.getValue();
    }

    private final boolean getStartAnimation() {
        return this.f7008i;
    }

    private final void setStartAnimation(boolean z10) {
        this.f7008i = z10;
        postInvalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        AbstractC5868k.m23674f(canvas, "canvas");
        super.onDraw(canvas);
        getPaint().setPathEffect(this.f7006g);
        if (this.f7007h >= 360.0f) {
            this.f7007h = 0.0f;
        }
        float f10 = this.f7007h + 45.0f;
        this.f7007h = f10;
        canvas.rotate(f10, getWidth() / 2.0f, getHeight() / 2.0f);
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, this.f7002c, getPaint());
        getPaint().setPathEffect(null);
        if (getStartAnimation()) {
            postInvalidateDelayed(100L);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int m23912a;
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        if (mode == 1073741824) {
            m23912a = size;
        } else {
            m23912a = (int) C5913i.m23912a(66.0f);
            if (mode == Integer.MIN_VALUE) {
                m23912a = AbstractC6578f.m25675c(m23912a, size);
            }
        }
        if (mode2 != 1073741824) {
            size = (int) C5913i.m23912a(66.0f);
            if (mode2 == Integer.MIN_VALUE) {
                size = AbstractC6578f.m25675c(size, size2);
            }
        }
        setMeasuredDimension(m23912a, size);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f7004e.reset();
        this.f7002c = getWidth() / 2.0f;
        this.f7003d = getWidth() / 10.0f;
        getPaint().setShader(new SweepGradient(getWidth() / 2.0f, getHeight() / 2.0f, 0, getResources().getColor(R$color.color_main)));
        Path path = this.f7001b;
        float f10 = this.f7003d;
        path.addCircle(0.0f, f10, f10, Path.Direction.CW);
        this.f7004e.addCircle(getWidth() / 2.0f, getHeight() / 2.0f, this.f7002c, Path.Direction.CW);
        this.f7005f.setPath(this.f7004e, false);
        this.f7006g = new PathDashPathEffect(this.f7001b, (this.f7005f.getLength() - getPaint().getStrokeWidth()) / 8, this.f7003d * 1.5f, PathDashPathEffect.Style.ROTATE);
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i10) {
        boolean z10;
        AbstractC5868k.m23674f(view, "changedView");
        super.onVisibilityChanged(view, i10);
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        setStartAnimation(z10);
    }
}
