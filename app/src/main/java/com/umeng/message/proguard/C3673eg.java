package com.umeng.message.proguard;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.umeng.message.push.C3708R;

/* renamed from: com.umeng.message.proguard.eg */
/* loaded from: classes3.dex */
public final class C3673eg extends C3674eh {

    /* renamed from: a */
    private ImageView f16456a;

    /* renamed from: b */
    private ImageView f16457b;

    /* renamed from: c */
    private ImageView f16458c;

    public C3673eg(Context context) {
        super(context);
        View.inflate(getContext(), C3708R.layout.umeng_fi_layout, this);
        this.f16456a = (ImageView) findViewById(C3708R.id.umeng_fi_close);
        this.f16457b = (ImageView) findViewById(C3708R.id.umeng_fi_img);
        this.f16458c = (ImageView) findViewById(C3708R.id.umeng_fi_mark);
    }

    public final void setAdImage(Bitmap bitmap) {
        if (bitmap == null || bitmap.getWidth() == 0) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.f16457b.getLayoutParams();
        int m15728a = C3670ed.m15728a(64.0f);
        layoutParams.width = m15728a;
        layoutParams.height = Math.min((m15728a * bitmap.getHeight()) / bitmap.getWidth(), layoutParams.width * 2);
        this.f16457b.setLayoutParams(layoutParams);
        this.f16457b.setScaleType(ImageView.ScaleType.FIT_XY);
        this.f16457b.setImageBitmap(bitmap);
    }

    public final void setAdMarkVisibility(boolean z10) {
        ImageView imageView = this.f16458c;
        if (imageView != null) {
            if (z10) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(8);
            }
        }
    }

    public final void setCloseClickListener(View.OnClickListener onClickListener) {
        ImageView imageView = this.f16456a;
        if (imageView != null) {
            imageView.setTag(onClickListener);
            this.f16456a.setOnClickListener(onClickListener);
        }
    }

    public final void setIconClickListener(View.OnClickListener onClickListener) {
        ImageView imageView = this.f16457b;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
        }
    }
}
