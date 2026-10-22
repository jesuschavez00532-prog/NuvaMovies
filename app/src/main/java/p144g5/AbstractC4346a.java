package p144g5;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import p091d0.C3917a;
import p091d0.C3918b;
import p091d0.C3919c;

/* renamed from: g5.a */
/* loaded from: classes.dex */
public abstract class AbstractC4346a {

    /* renamed from: a */
    public static final TimeInterpolator f18924a = new LinearInterpolator();

    /* renamed from: b */
    public static final TimeInterpolator f18925b = new C3918b();

    /* renamed from: c */
    public static final TimeInterpolator f18926c = new C3917a();

    /* renamed from: d */
    public static final TimeInterpolator f18927d = new C3919c();

    /* renamed from: e */
    public static final TimeInterpolator f18928e = new DecelerateInterpolator();

    /* renamed from: a */
    public static float m18242a(float f10, float f11, float f12) {
        return f10 + (f12 * (f11 - f10));
    }
}
