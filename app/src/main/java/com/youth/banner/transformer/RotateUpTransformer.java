package com.youth.banner.transformer;

import android.view.View;

/* loaded from: classes3.dex */
public class RotateUpTransformer extends ABaseTransformer {
    private static final float ROT_MOD = -15.0f;

    @Override // com.youth.banner.transformer.ABaseTransformer
    protected boolean isPagingEnabled() {
        return true;
    }

    @Override // com.youth.banner.transformer.ABaseTransformer
    protected void onTransform(View view, float f10) {
        float width = view.getWidth();
        float f11 = f10 * ROT_MOD;
        view.setPivotX(width * 0.5f);
        view.setPivotY(0.0f);
        view.setTranslationX(0.0f);
        view.setRotation(f11);
    }
}
