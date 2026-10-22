package com.umeng.message.proguard;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.umeng.message.proguard.InterfaceC3606bx;

/* renamed from: com.umeng.message.proguard.cm */
/* loaded from: classes3.dex */
public final class C3623cm extends AbstractC3624cn {

    /* renamed from: c */
    private ImageView f16187c;

    /* renamed from: d */
    private Bitmap f16188d;

    public C3623cm(Context context, C3622cl c3622cl) {
        super(context, c3622cl);
    }

    @Override // com.umeng.message.proguard.AbstractC3624cn
    /* renamed from: a */
    public final void mo15536a(Bitmap bitmap) {
        this.f16188d = bitmap;
    }

    @Override // com.umeng.message.proguard.AbstractC3624cn
    /* renamed from: b */
    public final void mo15537b() {
        ImageView imageView = new ImageView(this.f16189a);
        this.f16187c = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        this.f16187c.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    }

    @Override // com.umeng.message.proguard.AbstractC3624cn
    /* renamed from: c */
    public final void mo15538c() {
        boolean z10;
        int i10;
        int i11;
        ImageView imageView = this.f16187c;
        if (imageView == null) {
            return;
        }
        imageView.setImageBitmap(this.f16188d);
        if (C3602bt.m15448a(this.f16190b.f16185a) != InterfaceC3606bx.c.INTERSTITIAL || this.f16188d.getHeight() == 0) {
            return;
        }
        DisplayMetrics displayMetrics = this.f16189a.getResources().getDisplayMetrics();
        if (displayMetrics.widthPixels < displayMetrics.heightPixels) {
            z10 = true;
        } else {
            z10 = false;
        }
        float width = (this.f16188d.getWidth() * 1.0f) / this.f16188d.getHeight();
        int m15728a = C3670ed.m15728a(72.0f);
        int m15728a2 = C3670ed.m15728a(144.0f);
        if (z10) {
            i10 = displayMetrics.widthPixels - m15728a;
            i11 = (int) (i10 / width);
            int i12 = displayMetrics.heightPixels;
            if (i11 > i12 - m15728a2) {
                i11 = i12 - m15728a2;
                i10 = (int) (i11 * width);
            }
        } else {
            i10 = displayMetrics.heightPixels - m15728a2;
            int i13 = (int) (i10 * width);
            int i14 = displayMetrics.widthPixels;
            if (i13 > i14 - m15728a) {
                int i15 = i14 - m15728a;
                i11 = i10;
                i10 = i15;
            } else {
                i11 = i10;
                if (i10 < i13) {
                    i10 = i13;
                }
            }
        }
        ViewGroup.LayoutParams layoutParams = this.f16187c.getLayoutParams();
        layoutParams.width = i10;
        layoutParams.height = i11;
        this.f16187c.setLayoutParams(layoutParams);
    }

    @Override // com.umeng.message.proguard.AbstractC3624cn
    /* renamed from: d */
    public final void mo15539d() {
        try {
            Bitmap bitmap = this.f16188d;
            if (bitmap != null && !bitmap.isRecycled()) {
                this.f16188d.recycle();
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.umeng.message.proguard.AbstractC3624cn
    /* renamed from: a */
    public final View mo15535a() {
        return this.f16187c;
    }
}
