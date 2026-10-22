package p144g5;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import p214l.C5311i;

/* renamed from: g5.c */
/* loaded from: classes.dex */
public class C4348c {

    /* renamed from: a */
    private final C5311i f18929a = new C5311i();

    /* renamed from: b */
    private final C5311i f18930b = new C5311i();

    /* renamed from: a */
    private static void m18244a(C4348c c4348c, Animator animator) {
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            c4348c.m18248e(objectAnimator.getPropertyName(), objectAnimator.getValues());
            c4348c.m18249f(objectAnimator.getPropertyName(), C4349d.m18250a(objectAnimator));
        } else {
            throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
        }
    }

    /* renamed from: b */
    public static C4348c m18245b(Context context, TypedArray typedArray, int i10) {
        int resourceId;
        if (typedArray.hasValue(i10) && (resourceId = typedArray.getResourceId(i10, 0)) != 0) {
            return m18246c(context, resourceId);
        }
        return null;
    }

    /* renamed from: c */
    public static C4348c m18246c(Context context, int i10) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i10);
            if (loadAnimator instanceof AnimatorSet) {
                return m18247d(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return m18247d(arrayList);
        } catch (Exception e10) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i10), e10);
            return null;
        }
    }

    /* renamed from: d */
    private static C4348c m18247d(List list) {
        C4348c c4348c = new C4348c();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            m18244a(c4348c, (Animator) list.get(i10));
        }
        return c4348c;
    }

    /* renamed from: e */
    public void m18248e(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
        this.f18930b.put(str, propertyValuesHolderArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4348c)) {
            return false;
        }
        return this.f18929a.equals(((C4348c) obj).f18929a);
    }

    /* renamed from: f */
    public void m18249f(String str, C4349d c4349d) {
        this.f18929a.put(str, c4349d);
    }

    public int hashCode() {
        return this.f18929a.hashCode();
    }

    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f18929a + "}\n";
    }
}
