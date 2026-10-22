package com.youth.banner.transformer;

import android.view.View;

/* loaded from: classes3.dex */
public class CubeInTransformer extends ABaseTransformer {
    @Override // com.youth.banner.transformer.ABaseTransformer
    public boolean isPagingEnabled() {
        return true;
    }

    @Override // com.youth.banner.transformer.ABaseTransformer
    protected void onTransform(View view, float f10) {
        float width;
        if (f10 > 0.0f) {
            width = 0.0f;
        } else {
            width = view.getWidth();
        }
        view.setPivotX(width);
        view.setPivotY(0.0f);
        view.setRotationY(f10 * (-90.0f));
    }
}
