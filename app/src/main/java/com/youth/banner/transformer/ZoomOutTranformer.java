package com.youth.banner.transformer;

import android.view.View;

/* loaded from: classes3.dex */
public class ZoomOutTranformer extends ABaseTransformer {
    @Override // com.youth.banner.transformer.ABaseTransformer
    protected void onTransform(View view, float f10) {
        float f11;
        float abs = Math.abs(f10) + 1.0f;
        view.setScaleX(abs);
        view.setScaleY(abs);
        view.setPivotX(view.getWidth() * 0.5f);
        view.setPivotY(view.getHeight() * 0.5f);
        if (f10 >= -1.0f && f10 <= 1.0f) {
            f11 = 1.0f - (abs - 1.0f);
        } else {
            f11 = 0.0f;
        }
        view.setAlpha(f11);
        if (f10 == -1.0f) {
            view.setTranslationX(view.getWidth() * (-1));
        }
    }
}
