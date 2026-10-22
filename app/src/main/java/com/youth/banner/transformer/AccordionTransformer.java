package com.youth.banner.transformer;

import android.view.View;

/* loaded from: classes3.dex */
public class AccordionTransformer extends ABaseTransformer {
    @Override // com.youth.banner.transformer.ABaseTransformer
    protected void onTransform(View view, float f10) {
        float width;
        float f11;
        if (f10 < 0.0f) {
            width = 0.0f;
        } else {
            width = view.getWidth();
        }
        view.setPivotX(width);
        if (f10 < 0.0f) {
            f11 = f10 + 1.0f;
        } else {
            f11 = 1.0f - f10;
        }
        view.setScaleX(f11);
    }
}
