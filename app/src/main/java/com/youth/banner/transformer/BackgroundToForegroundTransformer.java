package com.youth.banner.transformer;

import android.view.View;

/* loaded from: classes3.dex */
public class BackgroundToForegroundTransformer extends ABaseTransformer {
    @Override // com.youth.banner.transformer.ABaseTransformer
    protected void onTransform(View view, float f10) {
        float f11;
        float height = view.getHeight();
        float width = view.getWidth();
        float f12 = 1.0f;
        if (f10 >= 0.0f) {
            f12 = Math.abs(1.0f - f10);
        }
        float min = ABaseTransformer.min(f12, 0.5f);
        view.setScaleX(min);
        view.setScaleY(min);
        view.setPivotX(width * 0.5f);
        view.setPivotY(height * 0.5f);
        if (f10 < 0.0f) {
            f11 = width * f10;
        } else {
            f11 = (-width) * f10 * 0.25f;
        }
        view.setTranslationX(f11);
    }
}
