package com.youth.banner.transformer;

import android.view.View;

/* loaded from: classes3.dex */
public class ZoomOutSlideTransformer extends ABaseTransformer {
    private static final float MIN_ALPHA = 0.5f;
    private static final float MIN_SCALE = 0.85f;

    @Override // com.youth.banner.transformer.ABaseTransformer
    protected void onTransform(View view, float f10) {
        if (f10 >= -1.0f || f10 <= 1.0f) {
            float height = view.getHeight();
            float width = view.getWidth();
            float max = Math.max(MIN_SCALE, 1.0f - Math.abs(f10));
            float f11 = 1.0f - max;
            float f12 = (height * f11) / 2.0f;
            float f13 = (f11 * width) / 2.0f;
            view.setPivotY(height * MIN_ALPHA);
            view.setPivotX(width * MIN_ALPHA);
            if (f10 < 0.0f) {
                view.setTranslationX(f13 - (f12 / 2.0f));
            } else {
                view.setTranslationX((-f13) + (f12 / 2.0f));
            }
            view.setScaleX(max);
            view.setScaleY(max);
            view.setAlpha((((max - MIN_SCALE) / 0.14999998f) * MIN_ALPHA) + MIN_ALPHA);
        }
    }
}
