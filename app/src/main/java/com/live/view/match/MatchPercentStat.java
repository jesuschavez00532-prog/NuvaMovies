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
import p250n8.C5766b;
import p433zd.AbstractC7786b;

/* loaded from: classes2.dex */
public final class MatchPercentStat extends View {

    /* renamed from: a */
    private float f10985a;

    /* renamed from: b */
    private float f10986b;

    /* renamed from: c */
    private float f10987c;

    /* renamed from: d */
    private float f10988d;

    /* renamed from: e */
    private float f10989e;

    /* renamed from: f */
    private float f10990f;

    /* renamed from: g */
    private float f10991g;

    /* renamed from: h */
    private float f10992h;

    /* renamed from: i */
    private float f10993i;

    /* renamed from: j */
    private float f10994j;

    /* renamed from: k */
    private final TextPaint f10995k;

    /* renamed from: l */
    private final TextPaint f10996l;

    /* renamed from: m */
    private final TextPaint f10997m;

    /* renamed from: n */
    private final TextPaint f10998n;

    /* renamed from: o */
    private final ArrayList f10999o;

    /* renamed from: p */
    public Map f11000p;

    public MatchPercentStat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private final void m11656a(Canvas canvas, C5766b c5766b, int i10) {
        int i11;
        TextPaint textPaint;
        boolean z10;
        TextPaint textPaint2;
        if (c5766b.m23230c() == c5766b.m23228a()) {
            if (canvas != null) {
                float f10 = this.f10989e;
                float f11 = i10;
                float f12 = this.f10992h;
                canvas.drawRect(f10, (f11 * f12) + this.f10987c, this.f10991g - 1, (f11 * f12) + this.f10990f, this.f10998n);
            }
            if (canvas != null) {
                float f13 = i10;
                canvas.drawRect(1 + this.f10991g, (this.f10992h * f13) + this.f10987c, getMeasuredWidth() - this.f10989e, this.f10990f + (f13 * this.f10992h), this.f10997m);
                return;
            }
            return;
        }
        int m23230c = c5766b.m23230c();
        int m23228a = c5766b.m23228a();
        boolean z11 = false;
        if (m23230c != 0 && m23228a != 0) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        float measuredWidth = getMeasuredWidth();
        float f14 = this.f10989e;
        int i12 = (m23230c * 100) / (m23230c + m23228a);
        float f15 = ((measuredWidth - (2 * f14)) * i12) / 100;
        if (i12 != 0 && canvas != null) {
            float f16 = i10;
            float f17 = this.f10992h;
            float f18 = (f16 * f17) + this.f10987c;
            float f19 = (f14 + f15) - i11;
            float f20 = (f16 * f17) + this.f10990f;
            if (m23230c > m23228a) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                textPaint2 = this.f10998n;
            } else {
                textPaint2 = this.f10997m;
            }
            canvas.drawRect(f14, f18, f19, f20, textPaint2);
        }
        if (i12 != 100 && canvas != null) {
            float f21 = i11 + this.f10989e + f15;
            float f22 = i10;
            float f23 = (this.f10992h * f22) + this.f10987c;
            float measuredWidth2 = getMeasuredWidth() - this.f10989e;
            float f24 = this.f10990f + (f22 * this.f10992h);
            if (m23230c > m23228a) {
                z11 = true;
            }
            if (z11) {
                textPaint = this.f10997m;
            } else {
                textPaint = this.f10998n;
            }
            canvas.drawRect(f21, f23, measuredWidth2, f24, textPaint);
        }
    }

    /* renamed from: b */
    private final void m11657b(Canvas canvas, C5766b c5766b, int i10) {
        String valueOf;
        String valueOf2;
        if (c5766b.m23231d()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(c5766b.m23230c());
            sb2.append('%');
            valueOf = sb2.toString();
        } else {
            valueOf = String.valueOf(c5766b.m23230c());
        }
        float measureText = this.f10996l.measureText(valueOf);
        if (canvas != null) {
            canvas.drawText(valueOf, this.f10986b - (measureText / 2), this.f10994j + (i10 * this.f10992h), this.f10996l);
        }
        if (c5766b.m23231d()) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(c5766b.m23228a());
            sb3.append('%');
            valueOf2 = sb3.toString();
        } else {
            valueOf2 = String.valueOf(c5766b.m23228a());
        }
        float measureText2 = this.f10996l.measureText(valueOf2);
        if (canvas != null) {
            canvas.drawText(valueOf2, (getMeasuredWidth() - this.f10986b) - (measureText2 / 2), this.f10994j + (i10 * this.f10992h), this.f10996l);
        }
    }

    /* renamed from: c */
    private final void m11658c() {
        TextPaint textPaint = this.f10995k;
        Context context = getContext();
        int i10 = R$color.color_font_normal;
        textPaint.setColor(AbstractC0547a.m2322d(context, i10));
        this.f10995k.setTextSize(AbstractC7786b.m30166j(28));
        this.f10996l.setColor(AbstractC0547a.m2322d(getContext(), i10));
        this.f10996l.setTextSize(AbstractC7786b.m30166j(36));
        this.f10997m.setColor(AbstractC0547a.m2322d(getContext(), R$color.color_main));
        this.f10998n.setColor(AbstractC0547a.m2322d(getContext(), R$color.color_match_percent_stat));
        this.f10985a = AbstractC7786b.m30166j(20);
        this.f10986b = AbstractC7786b.m30166j(56);
        this.f10987c = AbstractC7786b.m30166j(75);
        this.f10988d = AbstractC7786b.m30166j(85);
        this.f10989e = AbstractC7786b.m30166j(94);
        this.f10990f = AbstractC7786b.m30166j(95);
        this.f10992h = AbstractC7786b.m30166j(110);
        Paint.FontMetrics fontMetrics = this.f10995k.getFontMetrics();
        float m30166j = AbstractC7786b.m30166j(40);
        float f10 = fontMetrics.descent + fontMetrics.ascent;
        float f11 = 2;
        this.f10993i = m30166j - (f10 / f11);
        Paint.FontMetrics fontMetrics2 = this.f10996l.getFontMetrics();
        this.f10994j = this.f10988d - ((fontMetrics2.descent + fontMetrics2.ascent) / f11);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        AbstractC5868k.m23674f(canvas, "canvas");
        super.onDraw(canvas);
        int i10 = 0;
        for (Object obj : this.f10999o) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC1500l.m6991j();
            }
            C5766b c5766b = (C5766b) obj;
            float measureText = this.f10995k.measureText(c5766b.m23229b());
            if (canvas != null) {
                canvas.drawText(c5766b.m23229b(), (getMeasuredWidth() - measureText) / 2, this.f10993i + (i10 * this.f10992h), this.f10995k);
            }
            m11656a(canvas, c5766b, i10);
            m11657b(canvas, c5766b, i10);
            i10 = i11;
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f10991g = getMeasuredWidth() / 2;
    }

    public final void setPercentStats(ArrayList<C5766b> arrayList) {
        AbstractC5868k.m23674f(arrayList, "percentStats");
        this.f10999o.clear();
        this.f10999o.addAll(arrayList);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MatchPercentStat(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f11000p = new LinkedHashMap();
        this.f10995k = new TextPaint(5);
        this.f10996l = new TextPaint(5);
        this.f10997m = new TextPaint(5);
        this.f10998n = new TextPaint(5);
        this.f10999o = new ArrayList();
        m11658c();
    }
}
