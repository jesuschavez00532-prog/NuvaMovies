package p232m3;

import android.content.Context;
import com.download.permission.OverlayActivity;
import com.umeng.analytics.pro.C3384f;
import ne.AbstractC5868k;

/* renamed from: m3.e */
/* loaded from: classes.dex */
public final class C5589e extends AbstractC5586b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5589e(Context context) {
        super(context);
        AbstractC5868k.m23674f(context, C3384f.f14563X);
    }

    @Override // p232m3.AbstractC5586b
    /* renamed from: d */
    public void mo22685d() {
        C5592h c5592h = C5592h.f22623a;
        if (c5592h.m22705a(m22684c()) && c5592h.m22709g(m22684c())) {
            m22683b();
        } else {
            m22682a();
        }
    }

    @Override // p232m3.AbstractC5586b
    /* renamed from: g */
    public void mo22688g() {
        if (C5592h.f22623a.m22705a(m22684c())) {
            mo22685d();
            return;
        }
        OverlayActivity.C1658a c1658a = OverlayActivity.f6980b;
        c1658a.m7588a(this);
        c1658a.m7589b(m22684c(), 4);
    }
}
