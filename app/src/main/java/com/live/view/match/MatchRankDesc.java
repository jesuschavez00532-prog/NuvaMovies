package com.live.view.match;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.AbstractC0547a;
import com.live.R$color;
import com.live.R$styleable;
import java.util.LinkedHashMap;
import java.util.Map;
import ne.AbstractC5868k;
import p317rb.AbstractC6567a;
import p433zd.AbstractC7786b;

/* loaded from: classes2.dex */
public final class MatchRankDesc extends View {

    /* renamed from: a */
    private String f11001a;

    /* renamed from: b */
    private String f11002b;

    /* renamed from: c */
    private final TextPaint f11003c;

    /* renamed from: d */
    private final TextPaint f11004d;

    /* renamed from: e */
    public Map f11005e;

    public MatchRankDesc(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private final void m11659a(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.f10785o0);
            AbstractC5868k.m23673e(obtainStyledAttributes, "context.obtainStyledAttr….styleable.MatchRankDesc)");
            String string = obtainStyledAttributes.getString(R$styleable.MatchRankDesc_simplifyText);
            String str = "";
            if (string == null) {
                string = "";
            } else {
                AbstractC5868k.m23673e(string, "ta.getString(R.styleable…kDesc_simplifyText) ?: \"\"");
            }
            this.f11001a = string;
            String string2 = obtainStyledAttributes.getString(R$styleable.MatchRankDesc_descText);
            if (string2 != null) {
                AbstractC5868k.m23673e(string2, "ta.getString(R.styleable…hRankDesc_descText) ?: \"\"");
                str = string2;
            }
            this.f11002b = str;
            obtainStyledAttributes.recycle();
        }
        this.f11003c.setColor(AbstractC0547a.m2322d(getContext(), R$color.color_font_main));
        this.f11003c.setTextSize(AbstractC7786b.m30166j(24));
        this.f11003c.setFakeBoldText(true);
        this.f11004d.setColor(AbstractC0547a.m2322d(getContext(), R$color.color_font_normal));
        this.f11004d.setTextSize(AbstractC7786b.m30166j(20));
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        AbstractC5868k.m23674f(canvas, "canvas");
        super.onDraw(canvas);
        if (getVisibility() != 4 && !AbstractC6567a.m25634d(this.f11001a) && !AbstractC6567a.m25634d(this.f11002b)) {
            Paint.FontMetrics fontMetrics = this.f11003c.getFontMetrics();
            float measuredHeight = (getMeasuredHeight() / 2) - ((fontMetrics.descent + fontMetrics.ascent) / 2);
            float f10 = 0.0f;
            if (AbstractC6567a.m25637g(this.f11001a)) {
                float measureText = this.f11003c.measureText(this.f11001a);
                canvas.drawText(this.f11001a, 0.0f, measuredHeight, this.f11003c);
                f10 = measureText;
            }
            if (AbstractC6567a.m25637g(this.f11002b)) {
                canvas.drawText(this.f11002b, f10, measuredHeight, this.f11004d);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        if (getVisibility() == 4) {
            Paint.FontMetrics fontMetrics = this.f11003c.getFontMetrics();
            setMeasuredDimension(0, (int) (fontMetrics.bottom - fontMetrics.top));
        } else {
            if (!AbstractC6567a.m25634d(this.f11001a) && !AbstractC6567a.m25634d(this.f11002b)) {
                float measureText = this.f11003c.measureText(this.f11001a) + this.f11004d.measureText(this.f11002b);
                Paint.FontMetrics fontMetrics2 = this.f11003c.getFontMetrics();
                setMeasuredDimension((int) measureText, (int) (fontMetrics2.bottom - fontMetrics2.top));
                return;
            }
            setMeasuredDimension(0, 0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MatchRankDesc(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f11005e = new LinkedHashMap();
        this.f11001a = "";
        this.f11002b = "";
        this.f11003c = new TextPaint(5);
        this.f11004d = new TextPaint(5);
        m11659a(attributeSet);
    }
}
