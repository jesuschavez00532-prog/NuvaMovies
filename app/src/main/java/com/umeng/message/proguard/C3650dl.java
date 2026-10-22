package com.umeng.message.proguard;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.umeng.message.push.C3708R;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.umeng.message.proguard.dl */
/* loaded from: classes3.dex */
public final class C3650dl {

    /* renamed from: a */
    final C3649dk f16349a;

    /* renamed from: b */
    final View f16350b;

    /* renamed from: c */
    final C3672ef f16351c;

    /* renamed from: d */
    View.OnClickListener f16352d;

    public C3650dl(Context context, C3649dk c3649dk) {
        FrameLayout.LayoutParams layoutParams;
        this.f16349a = c3649dk;
        C3672ef c3672ef = new C3672ef(context);
        this.f16351c = c3672ef;
        c3672ef.setClipChildren(false);
        c3672ef.setClipToPadding(false);
        c3672ef.setClickable(true);
        final int m15728a = C3670ed.m15728a(8.0f);
        c3672ef.setBackgroundDrawable(new ShapeDrawable(new RectShape() { // from class: com.umeng.message.proguard.dl.1
            @Override // android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
            public final void draw(Canvas canvas, Paint paint) {
                paint.setColor(-83886081);
                RectF rect = rect();
                int i10 = m15728a;
                canvas.drawRoundRect(rect, i10, i10, paint);
            }
        }));
        if (Build.VERSION.SDK_INT >= 21) {
            float f10 = m15728a;
            c3672ef.setElevation(f10);
            c3672ef.setTranslationZ(f10);
        }
        if (c3649dk.m15667a()) {
            ImageView imageView = new ImageView(context);
            imageView.setImageDrawable(new C3675ei(c3649dk.f16347b, C3670ed.m15728a(8.0f)));
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            imageView.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
            c3672ef.addView(imageView);
        } else {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            linearLayout.setPadding(C3670ed.m15728a(12.0f), 0, C3670ed.m15728a(26.0f), 0);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
            layoutParams2.gravity = 16;
            linearLayout.setLayoutParams(layoutParams2);
            c3672ef.addView(linearLayout);
            Bitmap bitmap = c3649dk.f16347b;
            if (bitmap != null && bitmap.getWidth() > 0 && bitmap.getHeight() > 0) {
                ImageView imageView2 = new ImageView(context);
                int m15728a2 = C3670ed.m15728a(48.0f);
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams((bitmap.getWidth() * m15728a2) / bitmap.getHeight(), m15728a2);
                layoutParams3.gravity = 16;
                layoutParams3.leftMargin = C3670ed.m15728a(4.0f);
                linearLayout.addView(imageView2, layoutParams3);
                imageView2.setImageDrawable(new C3675ei(bitmap, C3670ed.m15728a(8.0f)));
            }
            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams4.gravity = 16;
            if (bitmap != null) {
                layoutParams4.leftMargin = C3670ed.m15728a(10.0f);
            }
            LinearLayout linearLayout2 = new LinearLayout(context);
            linearLayout2.setOrientation(1);
            linearLayout.addView(linearLayout2, layoutParams4);
            TextView textView = new TextView(context);
            textView.setText(c3649dk.f16346a.m15524d());
            textView.setSingleLine();
            textView.setMaxLines(1);
            textView.setTypeface(Typeface.DEFAULT_BOLD);
            textView.setTextColor(-14341836);
            textView.setTextSize(2, 16.0f);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            linearLayout2.addView(textView);
            TextView textView2 = new TextView(context);
            textView2.setText(c3649dk.f16346a.m15525e());
            textView2.setTextColor(-14341836);
            textView2.setSingleLine();
            textView2.setMaxLines(1);
            textView2.setTextSize(2, 14.0f);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams5.topMargin = C3670ed.m15728a(4.0f);
            linearLayout2.addView(textView2, layoutParams5);
        }
        int m15728a3 = C3670ed.m15728a(24.0f);
        int m15728a4 = C3670ed.m15728a(10.0f);
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(m15728a3, m15728a3);
        layoutParams6.gravity = 8388661;
        ImageView imageView3 = new ImageView(context);
        imageView3.setImageResource(C3708R.drawable.umeng_union_close);
        imageView3.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView3.setLayoutParams(layoutParams6);
        int m15728a5 = C3670ed.m15728a(4.0f);
        imageView3.setPadding(m15728a5, m15728a4, m15728a4, m15728a5);
        c3672ef.addView(imageView3);
        this.f16350b = imageView3;
        if (c3649dk.f16346a.m15526f()) {
            ImageView imageView4 = new ImageView(context);
            if (c3649dk.m15667a()) {
                layoutParams = new FrameLayout.LayoutParams(C3670ed.m15728a(20.0f), C3670ed.m15728a(10.0f));
                layoutParams.gravity = 8388691;
                imageView4.setImageResource(C3708R.drawable.umeng_union_mark);
            } else {
                layoutParams = new FrameLayout.LayoutParams(C3670ed.m15728a(24.0f), C3670ed.m15728a(14.0f));
                layoutParams.gravity = 8388693;
                imageView4.setImageResource(C3708R.drawable.umeng_union_mark3);
                imageView4.setPadding(0, 0, m15728a5, m15728a5);
            }
            imageView4.setScaleType(ImageView.ScaleType.FIT_XY);
            imageView4.setLayoutParams(layoutParams);
            c3672ef.addView(imageView4);
        }
    }
}
