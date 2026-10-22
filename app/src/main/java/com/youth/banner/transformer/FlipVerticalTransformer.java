package com.youth.banner.transformer;

import android.view.View;

/* loaded from: classes3.dex */
public class FlipVerticalTransformer extends ABaseTransformer {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.youth.banner.transformer.ABaseTransformer
    public void onPostTransform(View view, float f10) {
        super.onPostTransform(view, f10);
        if (f10 > -0.5f && f10 < 0.5f) {
            view.setVisibility(0);
        } else {
            view.setVisibility(4);
        }
    }

    @Override // com.youth.banner.transformer.ABaseTransformer
    protected void onTransform(View view, float f10) {
        float f11;
        float f12 = f10 * (-180.0f);
        if (f12 <= 90.0f && f12 >= -90.0f) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        view.setAlpha(f11);
        view.setPivotX(view.getWidth() * 0.5f);
        view.setPivotY(view.getHeight() * 0.5f);
        view.setRotationX(f12);
    }
}
