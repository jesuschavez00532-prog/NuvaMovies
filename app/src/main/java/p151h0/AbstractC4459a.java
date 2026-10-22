package p151h0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: h0.a */
/* loaded from: classes.dex */
abstract class AbstractC4459a {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m18658a(Animator animator, AnimatorListenerAdapter animatorListenerAdapter) {
        animator.addPauseListener(animatorListenerAdapter);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static void m18659b(Animator animator) {
        animator.pause();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static void m18660c(Animator animator) {
        animator.resume();
    }
}
