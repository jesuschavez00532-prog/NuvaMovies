package p400xa;

import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import ne.AbstractC5868k;

/* renamed from: xa.b */
/* loaded from: classes2.dex */
public final class C7554b {
    /* renamed from: e */
    public static /* synthetic */ void m28939e(C7554b c7554b, View view, float f10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = 1.1f;
        }
        c7554b.m28943c(view, f10);
    }

    /* renamed from: h */
    public static /* synthetic */ void m28940h(C7554b c7554b, View view, float f10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = 1.1f;
        }
        c7554b.m28945f(view, f10);
    }

    /* renamed from: a */
    public final ObjectAnimator m28941a(View view) {
        AbstractC5868k.m23674f(view, "view");
        ObjectAnimator duration = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofKeyframe(View.TRANSLATION_X, Keyframe.ofFloat(0.0f, 0.0f), Keyframe.ofFloat(0.1f, -10.0f), Keyframe.ofFloat(0.28f, 10.0f), Keyframe.ofFloat(0.46f, -15.0f), Keyframe.ofFloat(0.64f, 15.0f), Keyframe.ofFloat(0.82f, -10.0f), Keyframe.ofFloat(0.98f, 10.0f), Keyframe.ofFloat(1.0f, 0.0f))).setDuration(800L);
        AbstractC5868k.m23673e(duration, "ofPropertyValuesHolder(v…nslateX).setDuration(800)");
        return duration;
    }

    /* renamed from: b */
    public final ObjectAnimator m28942b(View view) {
        AbstractC5868k.m23674f(view, "view");
        ObjectAnimator duration = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofKeyframe(View.TRANSLATION_Y, Keyframe.ofFloat(0.0f, 0.0f), Keyframe.ofFloat(0.1f, -10.0f), Keyframe.ofFloat(0.28f, 10.0f), Keyframe.ofFloat(0.46f, -15.0f), Keyframe.ofFloat(0.64f, 15.0f), Keyframe.ofFloat(0.82f, -10.0f), Keyframe.ofFloat(0.98f, 10.0f), Keyframe.ofFloat(1.0f, 0.0f))).setDuration(800L);
        AbstractC5868k.m23673e(duration, "ofPropertyValuesHolder(v…nslateY).setDuration(800)");
        return duration;
    }

    /* renamed from: c */
    public final void m28943c(View view, float f10) {
        AbstractC5868k.m23674f(view, "view");
        m28944d(view, f10, f10);
    }

    /* renamed from: d */
    public final void m28944d(View view, float f10, float f11) {
        AbstractC5868k.m23674f(view, "view");
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", 1.0f, f10);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleY", 1.0f, f11);
        animatorSet.setDuration(200L);
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.play(ofFloat).with(ofFloat2);
        animatorSet.start();
    }

    /* renamed from: f */
    public final void m28945f(View view, float f10) {
        AbstractC5868k.m23674f(view, "view");
        m28946g(view, f10, f10);
    }

    /* renamed from: g */
    public final void m28946g(View view, float f10, float f11) {
        AbstractC5868k.m23674f(view, "view");
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", f10, 1.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleY", f11, 1.0f);
        animatorSet.setDuration(200L);
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.play(ofFloat).with(ofFloat2);
        animatorSet.start();
    }
}
