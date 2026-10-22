package com.download.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import be.AbstractC1314j;
import be.InterfaceC1312h;
import com.download.R$mipmap;
import com.download.R$string;
import com.download.R$styleable;
import java.util.LinkedHashMap;
import java.util.Map;
import ne.AbstractC5868k;
import p433zd.AbstractC7786b;
import re.AbstractC6578f;

/* loaded from: classes.dex */
public final class DefaultDownloadView extends View {

    /* renamed from: a */
    private final int f6990a;

    /* renamed from: b */
    private final int f6991b;

    /* renamed from: c */
    private final int f6992c;

    /* renamed from: d */
    private final InterfaceC1312h f6993d;

    /* renamed from: e */
    private final InterfaceC1312h f6994e;

    /* renamed from: f */
    private final int f6995f;

    /* renamed from: g */
    private final int f6996g;

    /* renamed from: h */
    private final int f6997h;

    /* renamed from: i */
    private int f6998i;

    /* renamed from: j */
    public Map f6999j = new LinkedHashMap();

    public DefaultDownloadView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        InterfaceC1312h m5965b;
        InterfaceC1312h m5965b2;
        this.f6990a = AbstractC7786b.m30166j(189);
        this.f6991b = AbstractC7786b.m30166j(396);
        this.f6992c = AbstractC7786b.m30163g(60);
        m5965b = AbstractC1314j.m5965b(C1662a.f7010a);
        this.f6993d = m5965b;
        m5965b2 = AbstractC1314j.m5965b(C1663b.f7011a);
        this.f6994e = m5965b2;
        this.f6995f = 1;
        this.f6996g = 2;
        this.f6997h = 3;
        this.f6998i = 3;
        m7601b(context, attributeSet, 0);
    }

    /* renamed from: a */
    private final Bitmap m7600a(int i10) {
        int i11;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(getContext().getResources(), i10, options);
        options.inDensity = options.outWidth;
        if (this.f6998i == this.f6997h) {
            i11 = this.f6990a;
        } else {
            i11 = this.f6991b;
        }
        options.inTargetDensity = i11;
        options.inJustDecodeBounds = false;
        Bitmap decodeResource = BitmapFactory.decodeResource(getContext().getResources(), i10, options);
        AbstractC5868k.m23673e(decodeResource, "decodeResource(context.resources, id, options)");
        return decodeResource;
    }

    /* renamed from: b */
    private final void m7601b(Context context, AttributeSet attributeSet, int i10) {
        TypedArray typedArray;
        if (context != null) {
            typedArray = context.obtainStyledAttributes(attributeSet, R$styleable.f6849P, i10, 0);
        } else {
            typedArray = null;
        }
        if (typedArray != null) {
            typedArray.recycle();
        }
        getTextPaint().setColor(-1);
        getTextPaint().setTextSize(AbstractC7786b.m30163g(28));
    }

    /* renamed from: c */
    private final int m7602c(int i10) {
        int m25675c;
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode != 1073741824) {
            int m30166j = AbstractC7786b.m30166j(380);
            if (mode == Integer.MIN_VALUE) {
                m25675c = AbstractC6578f.m25675c(m30166j, size);
                return m25675c;
            }
            return m30166j;
        }
        return size;
    }

    /* renamed from: d */
    private final int m7603d(int i10) {
        int m25675c;
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode != 1073741824) {
            int m30166j = AbstractC7786b.m30166j(1234);
            if (mode == Integer.MIN_VALUE) {
                m25675c = AbstractC6578f.m25675c(m30166j, size);
                return m25675c;
            }
            return m30166j;
        }
        return size;
    }

    private final Paint getPaint() {
        return (Paint) this.f6993d.getValue();
    }

    private final TextPaint getTextPaint() {
        return (TextPaint) this.f6994e.getValue();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        AbstractC5868k.m23674f(canvas, "canvas");
        super.draw(canvas);
        int i10 = this.f6998i;
        if (i10 == this.f6995f) {
            StaticLayout staticLayout = new StaticLayout(getResources().getString(R$string.download_no_internet), getTextPaint(), getWidth(), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, true);
            canvas.save();
            canvas.translate(0.0f, AbstractC7786b.m30163g(60) + this.f6992c);
            staticLayout.draw(canvas);
            canvas.restore();
            return;
        }
        if (i10 == this.f6996g) {
            canvas.drawBitmap(m7600a(R$mipmap.img_no_download_content), (getWidth() - this.f6991b) / 2, 0.0f, getPaint());
            StaticLayout staticLayout2 = new StaticLayout(getResources().getString(R$string.download_empty), getTextPaint(), getWidth(), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, true);
            canvas.save();
            canvas.translate(0.0f, r0.getHeight() + this.f6992c);
            staticLayout2.draw(canvas);
            canvas.restore();
            return;
        }
        canvas.drawBitmap(m7600a(R$mipmap.img_no_usb_disk), (getWidth() - this.f6990a) / 2, 0.0f, getPaint());
        StaticLayout staticLayout3 = new StaticLayout(getResources().getString(R$string.download_insert_usb), getTextPaint(), getWidth(), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, true);
        canvas.save();
        canvas.translate(0.0f, r0.getHeight() + this.f6992c);
        staticLayout3.draw(canvas);
        canvas.restore();
    }

    /* renamed from: e */
    public final void m7604e() {
        int i10 = this.f6998i;
        int i11 = this.f6996g;
        if (i10 == i11) {
            return;
        }
        this.f6998i = i11;
        invalidate();
    }

    /* renamed from: f */
    public final void m7605f() {
        int i10 = this.f6998i;
        int i11 = this.f6997h;
        if (i10 == i11) {
            return;
        }
        this.f6998i = i11;
        invalidate();
    }

    /* renamed from: g */
    public final void m7606g() {
        int i10 = this.f6998i;
        int i11 = this.f6995f;
        if (i10 == i11) {
            return;
        }
        this.f6998i = i11;
        invalidate();
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        setMeasuredDimension(m7603d(i10), m7602c(i11));
    }
}
