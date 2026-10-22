package com.live.view.match;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import com.live.R$color;
import com.request.result.MatchPromotion;
import com.umeng.analytics.pro.C3384f;
import com.zhy.autolayout.AutoFrameLayout;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import ne.AbstractC5868k;
import org.android.agoo.message.MessageService;
import p043ce.AbstractC1500l;
import p250n8.InterfaceC5767c;
import p433zd.AbstractC7786b;

/* loaded from: classes2.dex */
public final class PlayOffView extends AutoFrameLayout {

    /* renamed from: A */
    private final ArrayList f11006A;

    /* renamed from: B */
    private View f11007B;

    /* renamed from: C */
    private View f11008C;

    /* renamed from: D */
    private InterfaceC5767c f11009D;

    /* renamed from: E */
    private boolean f11010E;

    /* renamed from: F */
    public Map f11011F;

    /* renamed from: a */
    private final String f11012a;

    /* renamed from: b */
    private float f11013b;

    /* renamed from: c */
    private float f11014c;

    /* renamed from: d */
    private float f11015d;

    /* renamed from: e */
    private float f11016e;

    /* renamed from: f */
    private float f11017f;

    /* renamed from: g */
    private float f11018g;

    /* renamed from: h */
    private float f11019h;

    /* renamed from: i */
    private final Paint f11020i;

    /* renamed from: j */
    private final TextPaint f11021j;

    /* renamed from: k */
    private final Paint f11022k;

    /* renamed from: l */
    private final TextPaint f11023l;

    /* renamed from: m */
    private float f11024m;

    /* renamed from: n */
    private float f11025n;

    /* renamed from: o */
    private float f11026o;

    /* renamed from: p */
    private float f11027p;

    /* renamed from: q */
    private final RectF f11028q;

    /* renamed from: r */
    private final RectF f11029r;

    /* renamed from: s */
    private final int f11030s;

    /* renamed from: t */
    private final int f11031t;

    /* renamed from: u */
    private final RectF f11032u;

    /* renamed from: v */
    private final int f11033v;

    /* renamed from: w */
    private int f11034w;

    /* renamed from: x */
    private int f11035x;

    /* renamed from: y */
    private MatchPromotion f11036y;

    /* renamed from: z */
    private final ArrayList f11037z;

    public PlayOffView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: g */
    private final void m11660g(Canvas canvas) {
        float f10 = 2;
        float measuredWidth = getMeasuredWidth() / f10;
        float measuredHeight = getMeasuredHeight() / f10;
        float f11 = this.f11018g / f10;
        float f12 = this.f11019h / f10;
        this.f11022k.setColor(this.f11031t);
        this.f11022k.setStyle(Paint.Style.STROKE);
        this.f11032u.setEmpty();
        RectF rectF = this.f11032u;
        rectF.left = measuredWidth - f11;
        float f13 = measuredHeight - f12;
        rectF.top = f13;
        rectF.right = f11 + measuredWidth;
        rectF.bottom = measuredHeight + f12;
        float f14 = this.f11013b;
        canvas.drawRoundRect(rectF, f14, f14, this.f11022k);
        this.f11022k.setColor(-1);
        this.f11022k.setStyle(Paint.Style.FILL);
        RectF rectF2 = this.f11032u;
        float f15 = this.f11013b;
        rectF2.inset(f15, f15);
        RectF rectF3 = this.f11032u;
        float f16 = this.f11013b;
        canvas.drawRoundRect(rectF3, f16, f16, this.f11022k);
        this.f11022k.setColor(this.f11033v);
        this.f11032u.setEmpty();
        RectF rectF4 = this.f11032u;
        float f17 = this.f11024m;
        float f18 = measuredWidth - (f17 / f10);
        rectF4.left = f18;
        float f19 = this.f11025n;
        float f20 = f13 - (f19 / f10);
        rectF4.top = f20;
        rectF4.right = f18 + f17;
        rectF4.bottom = f20 + f19;
        float f21 = this.f11015d;
        canvas.drawRoundRect(rectF4, f21, f21, this.f11022k);
        String str = this.f11012a;
        canvas.drawText(str, measuredWidth - (this.f11023l.measureText(str) / f10), this.f11032u.bottom - this.f11014c, this.f11023l);
    }

    /* renamed from: h */
    private final void m11661h(Canvas canvas, MatchPromotion matchPromotion, MatchPromotion matchPromotion2, int i10, float f10, float f11, int i11, float f12, boolean z10) {
        float f13;
        Object obj;
        int i12;
        boolean z11;
        if (matchPromotion == null) {
            return;
        }
        int i13 = i11 / 2;
        if (i13 == 0) {
            f13 = this.f11027p + this.f11013b;
        } else {
            f13 = i13 * ((this.f11027p * 3) + this.f11013b);
        }
        float f14 = f10 - (f13 / 2);
        float f15 = (f10 + f10) - f14;
        float f16 = i10 == 1 ? f12 - f11 : f12 - this.f11017f;
        int m11667o = m11667o(matchPromotion);
        m11668s(matchPromotion, matchPromotion2, z10, m11667o, 0, this.f11020i);
        canvas.drawLine(f16, f10, f12, f10, this.f11020i);
        if (matchPromotion.getLeft() != null) {
            if (AbstractC5868k.m23669a(matchPromotion.getLeftScore(), "-1")) {
                obj = "-1";
            } else {
                obj = "-1";
                m11668s(matchPromotion, matchPromotion2, z10, m11667o, -1, this.f11021j);
                String leftScore = matchPromotion.getLeftScore();
                float f17 = this.f11013b;
                canvas.drawText(leftScore, f16 + f17, f10 - f17, this.f11021j);
            }
            m11668s(matchPromotion, matchPromotion2, z10, m11667o, -1, this.f11020i);
            canvas.drawLine(f16, f14, f16, f10, this.f11020i);
        } else {
            obj = "-1";
        }
        if (matchPromotion.getRight() != null) {
            if (!AbstractC5868k.m23669a(matchPromotion.getRightScore(), obj)) {
                m11668s(matchPromotion, matchPromotion2, z10, m11667o, 1, this.f11021j);
                canvas.drawText(matchPromotion.getRightScore(), this.f11013b + f16, f10 + this.f11016e, this.f11021j);
            }
            m11668s(matchPromotion, matchPromotion2, z10, m11667o, 1, this.f11020i);
            canvas.drawLine(f16, f10, f16, f15, this.f11020i);
        }
        if (m11667o == -1 && z10) {
            i12 = 1;
            z11 = true;
        } else {
            i12 = 1;
            z11 = false;
        }
        boolean z12 = m11667o == i12 && z10;
        int i14 = i10 + 1;
        m11661h(canvas, matchPromotion.getLeft(), matchPromotion, i14, f14, f11, i13, f16, z11);
        m11661h(canvas, matchPromotion.getRight(), matchPromotion, i14, f15, f11, i13, f16, z12);
    }

    /* renamed from: i */
    private final void m11662i(Canvas canvas) {
        if (this.f11036y == null) {
            return;
        }
        this.f11020i.setColor(this.f11031t);
        float f10 = 2;
        float measuredHeight = getMeasuredHeight() / f10;
        int i10 = this.f11034w / 4;
        float measuredWidth = ((getMeasuredWidth() - (this.f11026o * f10)) - this.f11018g) / f10;
        float f11 = measuredWidth - ((this.f11035x - 1) * this.f11017f);
        float measuredWidth2 = getMeasuredWidth();
        float f12 = this.f11026o;
        float f13 = (measuredWidth2 - f12) - measuredWidth;
        float f14 = f12 + measuredWidth;
        MatchPromotion matchPromotion = this.f11036y;
        AbstractC5868k.m23671c(matchPromotion);
        boolean m11666n = m11666n(matchPromotion.getLeft());
        MatchPromotion matchPromotion2 = this.f11036y;
        AbstractC5868k.m23671c(matchPromotion2);
        MatchPromotion left = matchPromotion2.getLeft();
        MatchPromotion matchPromotion3 = this.f11036y;
        AbstractC5868k.m23671c(matchPromotion3);
        m11661h(canvas, left, matchPromotion3, 1, measuredHeight, f11, i10, f14, m11666n);
        MatchPromotion matchPromotion4 = this.f11036y;
        AbstractC5868k.m23671c(matchPromotion4);
        boolean m11666n2 = m11666n(matchPromotion4.getRight());
        MatchPromotion matchPromotion5 = this.f11036y;
        AbstractC5868k.m23671c(matchPromotion5);
        MatchPromotion right = matchPromotion5.getRight();
        MatchPromotion matchPromotion6 = this.f11036y;
        AbstractC5868k.m23671c(matchPromotion6);
        m11663j(canvas, right, matchPromotion6, 1, measuredHeight, f11, i10, f13, m11666n2);
    }

    /* renamed from: j */
    private final void m11663j(Canvas canvas, MatchPromotion matchPromotion, MatchPromotion matchPromotion2, int i10, float f10, float f11, int i11, float f12, boolean z10) {
        float f13;
        Object obj;
        int i12;
        boolean z11;
        if (matchPromotion == null) {
            return;
        }
        int i13 = i11 / 2;
        if (i13 == 0) {
            f13 = this.f11027p + this.f11013b;
        } else {
            f13 = i13 * ((this.f11027p * 3) + this.f11013b);
        }
        float f14 = f10 - (f13 / 2);
        float f15 = (f10 + f10) - f14;
        float f16 = i10 == 1 ? f12 + f11 : f12 + this.f11017f;
        int m11667o = m11667o(matchPromotion);
        m11668s(matchPromotion, matchPromotion2, z10, m11667o, 0, this.f11020i);
        canvas.drawLine(f12, f10, f16, f10, this.f11020i);
        if (matchPromotion.getLeft() != null) {
            if (AbstractC5868k.m23669a(matchPromotion.getLeftScore(), "-1")) {
                obj = "-1";
            } else {
                obj = "-1";
                m11668s(matchPromotion, matchPromotion2, z10, m11667o, -1, this.f11021j);
                canvas.drawText(matchPromotion.getLeftScore(), f16 - this.f11015d, f10 - this.f11013b, this.f11021j);
            }
            m11668s(matchPromotion, matchPromotion2, z10, m11667o, -1, this.f11020i);
            canvas.drawLine(f16, f14, f16, f10, this.f11020i);
        } else {
            obj = "-1";
        }
        if (matchPromotion.getRight() != null) {
            if (!AbstractC5868k.m23669a(matchPromotion.getRightScore(), obj)) {
                m11668s(matchPromotion, matchPromotion2, z10, m11667o, 1, this.f11021j);
                canvas.drawText(matchPromotion.getRightScore(), f16 - this.f11015d, f10 + this.f11016e, this.f11021j);
            }
            m11668s(matchPromotion, matchPromotion2, z10, m11667o, 1, this.f11020i);
            canvas.drawLine(f16, f10, f16, f15, this.f11020i);
        }
        if (m11667o == -1 && z10) {
            i12 = 1;
            z11 = true;
        } else {
            i12 = 1;
            z11 = false;
        }
        boolean z12 = m11667o == i12 && z10;
        int i14 = i10 + 1;
        m11663j(canvas, matchPromotion.getLeft(), matchPromotion, i14, f14, f11, i13, f16, z11);
        m11663j(canvas, matchPromotion.getRight(), matchPromotion, i14, f15, f11, i13, f16, z12);
    }

    /* renamed from: k */
    private final void m11664k(Canvas canvas) {
        this.f11020i.setColor(this.f11030s);
        int i10 = this.f11034w / 4;
        for (int i11 = 0; i11 < i10; i11++) {
            float f10 = this.f11027p;
            float f11 = i11 * ((3 * f10) + this.f11013b);
            float f12 = f10 + f11;
            RectF rectF = this.f11028q;
            rectF.top = f11;
            rectF.bottom = f12;
            canvas.drawRect(rectF, this.f11020i);
            RectF rectF2 = this.f11029r;
            rectF2.top = f11;
            rectF2.bottom = f12;
            canvas.drawRect(rectF2, this.f11020i);
            float f13 = this.f11027p;
            float f14 = f11 + this.f11013b + f13;
            float f15 = f13 + f14;
            RectF rectF3 = this.f11028q;
            rectF3.top = f14;
            rectF3.bottom = f15;
            canvas.drawRect(rectF3, this.f11020i);
            RectF rectF4 = this.f11029r;
            rectF4.top = f14;
            rectF4.bottom = f15;
            canvas.drawRect(rectF4, this.f11020i);
        }
    }

    /* renamed from: l */
    private final void m11665l() {
        this.f11013b = AbstractC7786b.m30166j(10);
        this.f11014c = AbstractC7786b.m30166j(15);
        float f10 = this.f11013b;
        this.f11015d = 2 * f10;
        this.f11016e = 3 * f10;
        this.f11017f = f10 * 6;
        this.f11021j.setTextSize(AbstractC7786b.m30166j(24));
        this.f11023l.setColor(-1);
        this.f11023l.setFakeBoldText(true);
        this.f11023l.setTextSize(AbstractC7786b.m30166j(32));
    }

    /* renamed from: n */
    private final boolean m11666n(MatchPromotion matchPromotion) {
        String str;
        String rightScore;
        String str2 = MessageService.MSG_DB_READY_REPORT;
        if (matchPromotion == null || (str = matchPromotion.getLeftScore()) == null) {
            str = MessageService.MSG_DB_READY_REPORT;
        }
        if (matchPromotion != null && (rightScore = matchPromotion.getRightScore()) != null) {
            str2 = rightScore;
        }
        return !AbstractC5868k.m23669a(str, str2);
    }

    /* renamed from: o */
    private final int m11667o(MatchPromotion matchPromotion) {
        String str;
        String rightScore;
        String str2 = MessageService.MSG_DB_READY_REPORT;
        if (matchPromotion == null || (str = matchPromotion.getLeftScore()) == null) {
            str = MessageService.MSG_DB_READY_REPORT;
        }
        if (matchPromotion != null && (rightScore = matchPromotion.getRightScore()) != null) {
            str2 = rightScore;
        }
        if (AbstractC5868k.m23669a(str, str2)) {
            return 0;
        }
        if (str.compareTo(str2) > 0) {
            return -1;
        }
        return 1;
    }

    /* renamed from: s */
    private final void m11668s(MatchPromotion matchPromotion, MatchPromotion matchPromotion2, boolean z10, int i10, int i11, Paint paint) {
        if (!z10) {
            if (matchPromotion.getLeft() == null && matchPromotion.getRight() == null) {
                int m11667o = m11667o(matchPromotion2);
                if (m11667o == -1 && AbstractC5868k.m23669a(matchPromotion2.getLeft(), matchPromotion)) {
                    paint.setColor(-1);
                    return;
                } else if (m11667o == 1 && AbstractC5868k.m23669a(matchPromotion2.getRight(), matchPromotion)) {
                    paint.setColor(-1);
                    return;
                } else {
                    paint.setColor(this.f11031t);
                    return;
                }
            }
            if (i10 == -1 && i11 <= 0) {
                paint.setColor(-1);
                return;
            } else if (i10 == 1 && i11 >= 0) {
                paint.setColor(-1);
                return;
            } else {
                paint.setColor(this.f11031t);
                return;
            }
        }
        if (matchPromotion.getLeft() == null && matchPromotion.getRight() == null) {
            int m11667o2 = m11667o(matchPromotion2);
            if (m11667o2 == -1 && AbstractC5868k.m23669a(matchPromotion2.getLeft(), matchPromotion)) {
                paint.setColor(this.f11033v);
                return;
            } else if (m11667o2 == 1 && AbstractC5868k.m23669a(matchPromotion2.getRight(), matchPromotion)) {
                paint.setColor(this.f11033v);
                return;
            } else {
                paint.setColor(this.f11031t);
                return;
            }
        }
        if (i10 == -1 && i11 <= 0) {
            paint.setColor(this.f11033v);
        } else if (i10 == 1 && i11 >= 0) {
            paint.setColor(this.f11033v);
        } else {
            paint.setColor(this.f11031t);
        }
    }

    /* renamed from: a */
    public final void m11669a() {
        boolean z10;
        InterfaceC5767c interfaceC5767c = this.f11009D;
        if (interfaceC5767c != null) {
            int i10 = 0;
            for (Object obj : this.f11006A) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    AbstractC1500l.m6991j();
                }
                View view = (View) obj;
                Object obj2 = this.f11037z.get(i10);
                AbstractC5868k.m23673e(obj2, "mTeamData[index]");
                MatchPromotion matchPromotion = (MatchPromotion) obj2;
                Context context = getContext();
                AbstractC5868k.m23673e(context, C3384f.f14563X);
                if (i10 % 2 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                interfaceC5767c.mo5431c(context, view, matchPromotion, z10);
                i10 = i11;
            }
            View view2 = this.f11007B;
            if (view2 != null) {
                Context context2 = getContext();
                AbstractC5868k.m23673e(context2, C3384f.f14563X);
                interfaceC5767c.mo5429a(context2, view2, this.f11036y);
            }
            View view3 = this.f11008C;
            if (view3 != null) {
                Context context3 = getContext();
                AbstractC5868k.m23673e(context3, C3384f.f14563X);
                interfaceC5767c.mo5432d(context3, view3, this.f11036y);
            }
        }
    }

    /* renamed from: c */
    public final void m11670c() {
        if (m11671m()) {
            return;
        }
        removeAllViews();
        this.f11006A.clear();
        InterfaceC5767c interfaceC5767c = this.f11009D;
        if (interfaceC5767c != null) {
            LayoutInflater from = LayoutInflater.from(getContext());
            int i10 = this.f11034w / 2;
            for (int i11 = 0; i11 < i10; i11++) {
                InterfaceC5767c interfaceC5767c2 = this.f11009D;
                if (interfaceC5767c2 != null) {
                    AbstractC5868k.m23673e(from, "layoutInflater");
                    View mo5434f = interfaceC5767c2.mo5434f(from, true);
                    addView(mo5434f, (int) this.f11026o, (int) this.f11027p);
                    this.f11006A.add(mo5434f);
                }
            }
            for (int i12 = 0; i12 < i10; i12++) {
                InterfaceC5767c interfaceC5767c3 = this.f11009D;
                if (interfaceC5767c3 != null) {
                    AbstractC5868k.m23673e(from, "layoutInflater");
                    View mo5434f2 = interfaceC5767c3.mo5434f(from, false);
                    addView(mo5434f2, (int) this.f11026o, (int) this.f11027p);
                    this.f11006A.add(mo5434f2);
                }
            }
            AbstractC5868k.m23673e(from, "layoutInflater");
            View mo5433e = interfaceC5767c.mo5433e(from);
            this.f11007B = mo5433e;
            AbstractC5868k.m23671c(mo5433e);
            addView(mo5433e, (int) this.f11018g, (int) this.f11019h);
            View mo5430b = interfaceC5767c.mo5430b(from);
            this.f11008C = mo5430b;
            AbstractC5868k.m23671c(mo5430b);
            addView(mo5430b, AbstractC7786b.m30166j(155), AbstractC7786b.m30166j(150));
        }
        m11673q();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        AbstractC5868k.m23674f(canvas, "canvas");
        if (this.f11034w == 0) {
            super.dispatchDraw(canvas);
            return;
        }
        m11664k(canvas);
        m11662i(canvas);
        m11660g(canvas);
        super.dispatchDraw(canvas);
    }

    /* renamed from: m */
    public final boolean m11671m() {
        return this.f11010E;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zhy.autolayout.AutoFrameLayout, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        if (this.f11034w == 0) {
            return;
        }
        this.f11028q.setEmpty();
        RectF rectF = this.f11028q;
        rectF.left = 0.0f;
        rectF.right = this.f11026o;
        this.f11029r.setEmpty();
        this.f11029r.left = getMeasuredWidth() - this.f11026o;
        this.f11029r.right = getMeasuredWidth();
        if (this.f11006A.isEmpty()) {
            return;
        }
        int size = this.f11006A.size() / 2;
        int i14 = size / 2;
        int i15 = (int) ((this.f11027p * 3) + this.f11013b);
        int measuredWidth = (int) (getMeasuredWidth() - this.f11026o);
        int i16 = 0;
        for (int i17 = 0; i17 < i14; i17++) {
            int i18 = i17 * i15;
            int i19 = i17 * 2;
            Object obj = this.f11006A.get(i19);
            AbstractC5868k.m23673e(obj, "mTeamViews[teamIndex * 2]");
            View view = (View) obj;
            view.layout(0, i18, view.getMeasuredWidth(), view.getMeasuredHeight() + i18);
            int i20 = size + i19;
            Object obj2 = this.f11006A.get(i20);
            AbstractC5868k.m23673e(obj2, "mTeamViews[leftCount + teamIndex * 2]");
            View view2 = (View) obj2;
            view2.layout(measuredWidth, i18, view2.getMeasuredWidth() + measuredWidth, view2.getMeasuredHeight() + i18);
            int i21 = i18 + ((int) (this.f11027p + this.f11013b));
            Object obj3 = this.f11006A.get(i19 + 1);
            AbstractC5868k.m23673e(obj3, "mTeamViews[teamIndex * 2 + 1]");
            View view3 = (View) obj3;
            view3.layout(0, i21, view3.getMeasuredWidth(), view3.getMeasuredHeight() + i21);
            Object obj4 = this.f11006A.get(i20 + 1);
            AbstractC5868k.m23673e(obj4, "mTeamViews[leftCount + teamIndex * 2 + 1]");
            View view4 = (View) obj4;
            view4.layout(measuredWidth, i21, view4.getMeasuredWidth() + measuredWidth, view4.getMeasuredHeight() + i21);
        }
        View view5 = this.f11007B;
        if (view5 != null) {
            int measuredWidth2 = (getMeasuredWidth() - view5.getMeasuredWidth()) / 2;
            int measuredHeight = (getMeasuredHeight() - view5.getMeasuredHeight()) / 2;
            view5.layout(measuredWidth2, measuredHeight, view5.getMeasuredWidth() + measuredWidth2, view5.getMeasuredHeight() + measuredHeight);
        }
        View view6 = this.f11008C;
        if (view6 != null && view6.getVisibility() == 0) {
            int measuredWidth3 = (getMeasuredWidth() - view6.getMeasuredWidth()) / 2;
            int measuredHeight2 = getMeasuredHeight();
            View view7 = this.f11007B;
            if (view7 != null) {
                i16 = view7.getMeasuredHeight();
            }
            int measuredHeight3 = (int) ((((measuredHeight2 - i16) / 2) - view6.getMeasuredHeight()) - this.f11025n);
            view6.layout(measuredWidth3, measuredHeight3, view6.getMeasuredWidth() + measuredWidth3, view6.getMeasuredHeight() + measuredHeight3);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zhy.autolayout.AutoFrameLayout, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        if (this.f11034w == 0) {
            super.onMeasure(i10, i11);
            return;
        }
        if (getChildCount() != 0) {
            int childCount = getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                measureChildWithMargins(getChildAt(i12), i10, 0, i11, 0);
            }
        }
        setMeasuredDimension(i10, (int) ((((r10 + r0) - 1) * this.f11027p) + (this.f11013b * ((this.f11034w / 2) / 2))));
    }

    /* renamed from: p */
    public final void m11672p(float f10, float f11, float f12, float f13) {
        this.f11026o = f10;
        this.f11027p = f11;
        this.f11018g = f12;
        this.f11019h = f13;
    }

    /* renamed from: q */
    public final void m11673q() {
        this.f11010E = true;
    }

    /* renamed from: r */
    public final void m11674r(float f10, float f11) {
        this.f11024m = f10;
        this.f11025n = f11;
    }

    public final void setAdapter(InterfaceC5767c interfaceC5767c) {
        AbstractC5868k.m23674f(interfaceC5767c, "adapter");
        this.f11009D = interfaceC5767c;
    }

    /* renamed from: t */
    public final void m11675t(MatchPromotion matchPromotion, ArrayList arrayList, int i10, int i11) {
        AbstractC5868k.m23674f(matchPromotion, "playOffGragh");
        AbstractC5868k.m23674f(arrayList, "promotionTeamList");
        this.f11036y = matchPromotion;
        this.f11037z.clear();
        this.f11037z.addAll(arrayList);
        this.f11035x = i10;
        this.f11034w = i11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayOffView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f11011F = new LinkedHashMap();
        this.f11012a = "Final";
        this.f11020i = new Paint(5);
        this.f11021j = new TextPaint(5);
        this.f11022k = new Paint(5);
        this.f11023l = new TextPaint(5);
        this.f11028q = new RectF();
        this.f11029r = new RectF();
        this.f11030s = Color.parseColor("#484a4d");
        this.f11031t = Color.parseColor("#666666");
        this.f11032u = new RectF();
        this.f11033v = getResources().getColor(R$color.color_main);
        this.f11037z = new ArrayList();
        this.f11006A = new ArrayList();
        m11665l();
    }
}
