package com.live.view.match;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.AbstractC0547a;
import com.live.R$color;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import ne.AbstractC5868k;
import p043ce.AbstractC1500l;
import p250n8.C5765a;
import p433zd.AbstractC7786b;

/* loaded from: classes2.dex */
public final class MatchDataStat extends View {

    /* renamed from: a */
    private float f10978a;

    /* renamed from: b */
    private float f10979b;

    /* renamed from: c */
    private float f10980c;

    /* renamed from: d */
    private float f10981d;

    /* renamed from: e */
    private final TextPaint f10982e;

    /* renamed from: f */
    private final ArrayList f10983f;

    /* renamed from: g */
    public Map f10984g;

    public MatchDataStat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private final void m11655a() {
        this.f10982e.setColor(AbstractC0547a.m2322d(getContext(), R$color.color_font_normal));
        this.f10982e.setTextSize(AbstractC7786b.m30166j(28));
        this.f10979b = AbstractC7786b.m30166j(40);
        this.f10980c = AbstractC7786b.m30166j(55);
        Paint.FontMetrics fontMetrics = this.f10982e.getFontMetrics();
        this.f10981d = ((this.f10980c - fontMetrics.descent) - fontMetrics.ascent) / 2;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        AbstractC5868k.m23674f(canvas, "canvas");
        super.draw(canvas);
        int i10 = 0;
        for (Object obj : this.f10983f) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC1500l.m6991j();
            }
            C5765a c5765a = (C5765a) obj;
            float f10 = (i10 * this.f10980c) + this.f10981d;
            if (canvas != null) {
                canvas.drawText(c5765a.m23227c(), this.f10979b, f10, this.f10982e);
            }
            float measureText = this.f10982e.measureText(c5765a.m23225a());
            if (canvas != null) {
                canvas.drawText(c5765a.m23225a(), (getMeasuredWidth() - this.f10979b) - measureText, f10, this.f10982e);
            }
            float measureText2 = this.f10982e.measureText(c5765a.m23226b());
            if (canvas != null) {
                canvas.drawText(c5765a.m23226b(), this.f10978a - (measureText2 / 2), f10, this.f10982e);
            }
            i10 = i11;
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f10978a = getMeasuredWidth() / 2;
    }

    public final void setDataStats(ArrayList<C5765a> arrayList) {
        AbstractC5868k.m23674f(arrayList, "dataStats");
        this.f10983f.clear();
        this.f10983f.addAll(arrayList);
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MatchDataStat(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f10984g = new LinkedHashMap();
        this.f10982e = new TextPaint(5);
        this.f10983f = new ArrayList();
        m11655a();
    }
}
