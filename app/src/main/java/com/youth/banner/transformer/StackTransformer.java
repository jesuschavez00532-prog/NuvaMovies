package com.youth.banner.transformer;

import android.view.View;

/* loaded from: classes3.dex */
public class StackTransformer extends ABaseTransformer {
    @Override // com.youth.banner.transformer.ABaseTransformer
    protected void onTransform(View view, float f10) {
        float f11 = 0.0f;
        if (f10 >= 0.0f) {
            f11 = (-view.getWidth()) * f10;
        }
        view.setTranslationX(f11);
    }
}
