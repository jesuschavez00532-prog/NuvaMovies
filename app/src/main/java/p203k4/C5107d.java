package p203k4;

import android.app.Activity;
import androidx.fragment.app.AbstractActivityC0712e;
import p219l4.AbstractC5391n;

/* renamed from: k4.d */
/* loaded from: classes.dex */
public class C5107d {

    /* renamed from: a */
    private final Object f21038a;

    public C5107d(Activity activity) {
        AbstractC5391n.m21784j(activity, "Activity must not be null");
        this.f21038a = activity;
    }

    /* renamed from: a */
    public final Activity m20750a() {
        return (Activity) this.f21038a;
    }

    /* renamed from: b */
    public final AbstractActivityC0712e m20751b() {
        return (AbstractActivityC0712e) this.f21038a;
    }

    /* renamed from: c */
    public final boolean m20752c() {
        return this.f21038a instanceof Activity;
    }

    /* renamed from: d */
    public final boolean m20753d() {
        return this.f21038a instanceof AbstractActivityC0712e;
    }
}
