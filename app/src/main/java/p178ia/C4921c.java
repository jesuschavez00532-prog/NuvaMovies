package p178ia;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import ne.AbstractC5868k;
import p022b2.AbstractC1043k;
import p034c2.InterfaceC1344b;
import p375w1.C7346c;

/* renamed from: ia.c */
/* loaded from: classes2.dex */
public final class C4921c extends AbstractC1043k implements InterfaceC1344b.a {

    /* renamed from: h */
    private final int f20461h;

    /* renamed from: i */
    private C7346c f20462i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4921c(ImageView imageView, int i10) {
        super(imageView);
        AbstractC5868k.m23674f(imageView, "view");
        this.f20461h = i10;
    }

    /* renamed from: e */
    private final void m20219e(C7346c c7346c) {
        boolean z10 = false;
        if (c7346c instanceof Animatable) {
            this.f20462i = c7346c;
            if (c7346c != null) {
                z10 = c7346c.isRunning();
            } else {
                z10 = false;
            }
            if (z10) {
                C7346c c7346c2 = this.f20462i;
                if (c7346c2 != null) {
                    c7346c2.start();
                    return;
                }
                return;
            }
            C7346c c7346c3 = this.f20462i;
            if (c7346c3 != null) {
                c7346c3.m28353o();
                return;
            }
            return;
        }
        this.f20462i = null;
    }

    /* renamed from: i */
    private final void m20220i(C7346c c7346c) {
        m20223h(c7346c);
        m20219e(c7346c);
    }

    @Override // p022b2.InterfaceC1042j
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public void onResourceReady(C7346c c7346c, InterfaceC1344b interfaceC1344b) {
        AbstractC5868k.m23674f(c7346c, "resource");
        if (interfaceC1344b != null && interfaceC1344b.mo6110a(c7346c, this)) {
            m20219e(c7346c);
        } else {
            m20220i(c7346c);
        }
    }

    /* renamed from: g */
    public void m20222g(Drawable drawable) {
        ((ImageView) this.f4290a).setImageDrawable(drawable);
    }

    /* renamed from: h */
    protected final void m20223h(C7346c c7346c) {
        int i10 = this.f20461h;
        if (i10 >= 0 && c7346c != null) {
            c7346c.m28352n(i10);
        }
        ((ImageView) this.f4290a).setImageDrawable(c7346c);
    }

    @Override // p022b2.AbstractC1043k, p022b2.AbstractC1033a, p022b2.InterfaceC1042j
    public void onLoadCleared(Drawable drawable) {
        super.onLoadCleared(drawable);
        C7346c c7346c = this.f20462i;
        if (c7346c != null) {
            c7346c.stop();
        }
        m20220i(null);
        m20222g(drawable);
    }

    @Override // p022b2.AbstractC1033a, p022b2.InterfaceC1042j
    public void onLoadFailed(Drawable drawable) {
        super.onLoadFailed(drawable);
        m20220i(null);
        m20222g(drawable);
    }

    @Override // p022b2.AbstractC1043k, p022b2.AbstractC1033a, p022b2.InterfaceC1042j
    public void onLoadStarted(Drawable drawable) {
        super.onLoadStarted(drawable);
        m20220i(null);
        m20222g(drawable);
    }

    @Override // p022b2.AbstractC1033a, com.bumptech.glide.manager.InterfaceC1628k
    public void onStart() {
        boolean z10 = false;
        C7346c c7346c = this.f20462i;
        if (c7346c != null) {
            z10 = c7346c.isRunning();
        } else {
            z10 = false;
        }
        if (z10) {
            C7346c c7346c2 = this.f20462i;
            if (c7346c2 != null) {
                c7346c2.start();
                return;
            }
            return;
        }
        C7346c c7346c3 = this.f20462i;
        if (c7346c3 != null) {
            c7346c3.m28353o();
        }
    }

    @Override // p022b2.AbstractC1033a, com.bumptech.glide.manager.InterfaceC1628k
    public void onStop() {
        C7346c c7346c = this.f20462i;
        if (c7346c != null) {
            c7346c.stop();
        }
    }
}
