package p178ia;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import ne.AbstractC5868k;
import p022b2.AbstractC1043k;
import p034c2.InterfaceC1344b;

/* renamed from: ia.e */
/* loaded from: classes2.dex */
public abstract class AbstractC4923e extends AbstractC1043k implements InterfaceC1344b.a {

    /* renamed from: h */
    private Animatable f20464h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC4923e(View view) {
        super(view);
        AbstractC5868k.m23674f(view, "view");
    }

    /* renamed from: e */
    private final void m20225e(Object obj) {
        if (obj instanceof Animatable) {
            Animatable animatable = (Animatable) obj;
            this.f20464h = animatable;
            if (animatable != null) {
                animatable.start();
                return;
            }
            return;
        }
        this.f20464h = null;
    }

    /* renamed from: h */
    private final void m20226h(Object obj) {
        mo20212g(obj);
        m20225e(obj);
    }

    /* renamed from: f */
    public void m20227f(Drawable drawable) {
        this.f4290a.setBackground(drawable);
    }

    /* renamed from: g */
    protected abstract void mo20212g(Object obj);

    @Override // p022b2.AbstractC1043k, p022b2.AbstractC1033a, p022b2.InterfaceC1042j
    public void onLoadCleared(Drawable drawable) {
        super.onLoadCleared(drawable);
        Animatable animatable = this.f20464h;
        if (animatable != null) {
            AbstractC5868k.m23671c(animatable);
            animatable.stop();
        }
        m20226h(null);
        m20227f(drawable);
    }

    @Override // p022b2.AbstractC1033a, p022b2.InterfaceC1042j
    public void onLoadFailed(Drawable drawable) {
        super.onLoadFailed(drawable);
        m20226h(null);
        m20227f(drawable);
    }

    @Override // p022b2.AbstractC1043k, p022b2.AbstractC1033a, p022b2.InterfaceC1042j
    public void onLoadStarted(Drawable drawable) {
        super.onLoadStarted(drawable);
        m20226h(null);
        m20227f(drawable);
    }

    @Override // p022b2.InterfaceC1042j
    public void onResourceReady(Object obj, InterfaceC1344b interfaceC1344b) {
        if (interfaceC1344b != null && interfaceC1344b.mo6110a(obj, this)) {
            m20225e(obj);
        } else {
            m20226h(obj);
        }
    }

    @Override // p022b2.AbstractC1033a, com.bumptech.glide.manager.InterfaceC1628k
    public void onStart() {
        Animatable animatable = this.f20464h;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // p022b2.AbstractC1033a, com.bumptech.glide.manager.InterfaceC1628k
    public void onStop() {
        Animatable animatable = this.f20464h;
        if (animatable != null) {
            animatable.stop();
        }
    }
}
