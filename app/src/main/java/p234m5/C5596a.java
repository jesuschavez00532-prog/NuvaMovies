package p234m5;

import android.content.Context;
import android.graphics.Color;
import com.google.android.material.R$attr;
import p188j5.AbstractC4995a;
import p276p.AbstractC6128a;
import p282p5.AbstractC6215b;

/* renamed from: m5.a */
/* loaded from: classes.dex */
public class C5596a {

    /* renamed from: a */
    private final boolean f22624a;

    /* renamed from: b */
    private final int f22625b;

    /* renamed from: c */
    private final int f22626c;

    /* renamed from: d */
    private final float f22627d;

    public C5596a(Context context) {
        this.f22624a = AbstractC6215b.m24788b(context, R$attr.elevationOverlayEnabled, false);
        this.f22625b = AbstractC4995a.m20371a(context, R$attr.elevationOverlayColor, 0);
        this.f22626c = AbstractC4995a.m20371a(context, R$attr.colorSurface, 0);
        this.f22627d = context.getResources().getDisplayMetrics().density;
    }

    /* renamed from: e */
    private boolean m22754e(int i10) {
        if (AbstractC6128a.m24427f(i10, 255) == this.f22626c) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public float m22755a(float f10) {
        if (this.f22627d <= 0.0f || f10 <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p(f10 / r0)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    /* renamed from: b */
    public int m22756b(int i10, float f10) {
        float m22755a = m22755a(f10);
        return AbstractC6128a.m24427f(AbstractC4995a.m20376f(AbstractC6128a.m24427f(i10, 255), this.f22625b, m22755a), Color.alpha(i10));
    }

    /* renamed from: c */
    public int m22757c(int i10, float f10) {
        if (this.f22624a && m22754e(i10)) {
            return m22756b(i10, f10);
        }
        return i10;
    }

    /* renamed from: d */
    public boolean m22758d() {
        return this.f22624a;
    }
}
