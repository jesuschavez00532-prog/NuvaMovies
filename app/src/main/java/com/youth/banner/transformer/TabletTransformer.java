package com.youth.banner.transformer;

import android.graphics.Camera;
import android.graphics.Matrix;
import android.view.View;

/* loaded from: classes3.dex */
public class TabletTransformer extends ABaseTransformer {
    private static final Matrix OFFSET_MATRIX = new Matrix();
    private static final Camera OFFSET_CAMERA = new Camera();
    private static final float[] OFFSET_TEMP_FLOAT = new float[2];

    protected static final float getOffsetXForRotation(float f10, int i10, int i11) {
        float f11;
        Matrix matrix = OFFSET_MATRIX;
        matrix.reset();
        Camera camera = OFFSET_CAMERA;
        camera.save();
        camera.rotateY(Math.abs(f10));
        camera.getMatrix(matrix);
        camera.restore();
        matrix.preTranslate((-i10) * 0.5f, (-i11) * 0.5f);
        float f12 = i10;
        float f13 = i11;
        matrix.postTranslate(f12 * 0.5f, 0.5f * f13);
        float[] fArr = OFFSET_TEMP_FLOAT;
        fArr[0] = f12;
        fArr[1] = f13;
        matrix.mapPoints(fArr);
        float f14 = f12 - fArr[0];
        if (f10 > 0.0f) {
            f11 = 1.0f;
        } else {
            f11 = -1.0f;
        }
        return f14 * f11;
    }

    @Override // com.youth.banner.transformer.ABaseTransformer
    protected void onTransform(View view, float f10) {
        float f11;
        if (f10 < 0.0f) {
            f11 = 30.0f;
        } else {
            f11 = -30.0f;
        }
        float abs = f11 * Math.abs(f10);
        view.setTranslationX(getOffsetXForRotation(abs, view.getWidth(), view.getHeight()));
        view.setPivotX(view.getWidth() * 0.5f);
        view.setPivotY(0.0f);
        view.setRotationY(abs);
    }
}
