package com.youth.banner.transformer;

import android.view.View;

/* loaded from: classes3.dex */
public class CubeOutTransformer extends ABaseTransformer {
    @Override // com.youth.banner.transformer.ABaseTransformer
    public boolean isPagingEnabled() {
        return true;
    }

    @Override // com.youth.banner.transformer.ABaseTransformer
    protected void onTransform(View view, float f10) {
        float f11 = 0.0f;
        if (f10 < 0.0f) {
            f11 = view.getWidth();
        }
        view.setPivotX(f11);
        view.setPivotY(view.getHeight() * 0.5f);
        view.setRotationY(f10 * 90.0f);
    }
}
