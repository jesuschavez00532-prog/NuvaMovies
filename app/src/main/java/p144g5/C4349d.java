package p144g5;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* renamed from: g5.d */
/* loaded from: classes.dex */
public class C4349d {

    /* renamed from: a */
    private long f18931a;

    /* renamed from: b */
    private long f18932b;

    /* renamed from: c */
    private TimeInterpolator f18933c;

    /* renamed from: d */
    private int f18934d;

    /* renamed from: e */
    private int f18935e;

    public C4349d(long j10, long j11) {
        this.f18933c = null;
        this.f18934d = 0;
        this.f18935e = 1;
        this.f18931a = j10;
        this.f18932b = j11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C4349d m18250a(ValueAnimator valueAnimator) {
        C4349d c4349d = new C4349d(valueAnimator.getStartDelay(), valueAnimator.getDuration(), m18251e(valueAnimator));
        c4349d.f18934d = valueAnimator.getRepeatCount();
        c4349d.f18935e = valueAnimator.getRepeatMode();
        return c4349d;
    }

    /* renamed from: e */
    private static TimeInterpolator m18251e(ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        if (!(interpolator instanceof AccelerateDecelerateInterpolator) && interpolator != null) {
            if (interpolator instanceof AccelerateInterpolator) {
                return AbstractC4346a.f18926c;
            }
            if (interpolator instanceof DecelerateInterpolator) {
                return AbstractC4346a.f18927d;
            }
            return interpolator;
        }
        return AbstractC4346a.f18925b;
    }

    /* renamed from: b */
    public long m18252b() {
        return this.f18931a;
    }

    /* renamed from: c */
    public long m18253c() {
        return this.f18932b;
    }

    /* renamed from: d */
    public TimeInterpolator m18254d() {
        TimeInterpolator timeInterpolator = this.f18933c;
        if (timeInterpolator == null) {
            return AbstractC4346a.f18925b;
        }
        return timeInterpolator;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4349d)) {
            return false;
        }
        C4349d c4349d = (C4349d) obj;
        if (m18252b() != c4349d.m18252b() || m18253c() != c4349d.m18253c() || m18255f() != c4349d.m18255f() || m18256g() != c4349d.m18256g()) {
            return false;
        }
        return m18254d().getClass().equals(c4349d.m18254d().getClass());
    }

    /* renamed from: f */
    public int m18255f() {
        return this.f18934d;
    }

    /* renamed from: g */
    public int m18256g() {
        return this.f18935e;
    }

    public int hashCode() {
        return (((((((((int) (m18252b() ^ (m18252b() >>> 32))) * 31) + ((int) (m18253c() ^ (m18253c() >>> 32)))) * 31) + m18254d().getClass().hashCode()) * 31) + m18255f()) * 31) + m18256g();
    }

    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + m18252b() + " duration: " + m18253c() + " interpolator: " + m18254d().getClass() + " repeatCount: " + m18255f() + " repeatMode: " + m18256g() + "}\n";
    }

    public C4349d(long j10, long j11, TimeInterpolator timeInterpolator) {
        this.f18934d = 0;
        this.f18935e = 1;
        this.f18931a = j10;
        this.f18932b = j11;
        this.f18933c = timeInterpolator;
    }
}
