package p178ia;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import p022b2.AbstractC1043k;
import p034c2.InterfaceC1344b;

/* renamed from: ia.b */
/* loaded from: classes2.dex */
public class C4920b extends AbstractC1043k implements InterfaceC1344b.a {

    /* renamed from: h */
    private Animatable f20460h;

    public C4920b(ImageView imageView) {
        super(imageView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    private void m20214e(Drawable drawable) {
        if (drawable instanceof Animatable) {
            Animatable animatable = (Animatable) drawable;
            this.f20460h = animatable;
            animatable.start();
            return;
        }
        this.f20460h = null;
    }

    /* renamed from: i */
    private void m20215i(Drawable drawable) {
        m20218h(drawable);
        m20214e(drawable);
    }

    @Override // p022b2.InterfaceC1042j
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public void onResourceReady(Drawable drawable, InterfaceC1344b interfaceC1344b) {
        if (interfaceC1344b != null && interfaceC1344b.mo6110a(drawable, this)) {
            m20214e(drawable);
        } else {
            m20215i(drawable);
        }
    }

    /* renamed from: g */
    public void m20217g(Drawable drawable) {
        ((ImageView) this.f4290a).setImageDrawable(drawable);
    }

    /* renamed from: h */
    protected void m20218h(Drawable drawable) {
        ((ImageView) this.f4290a).setImageDrawable(drawable);
    }

    @Override // p022b2.AbstractC1043k, p022b2.AbstractC1033a, p022b2.InterfaceC1042j
    public void onLoadCleared(Drawable drawable) {
        super.onLoadCleared(drawable);
        Animatable animatable = this.f20460h;
        if (animatable != null) {
            animatable.stop();
        }
        m20217g(drawable);
    }

    @Override // p022b2.AbstractC1033a, p022b2.InterfaceC1042j
    public void onLoadFailed(Drawable drawable) {
        super.onLoadFailed(drawable);
        m20217g(drawable);
    }

    @Override // p022b2.AbstractC1043k, p022b2.AbstractC1033a, p022b2.InterfaceC1042j
    public void onLoadStarted(Drawable drawable) {
        super.onLoadStarted(drawable);
        m20217g(drawable);
    }

    @Override // p022b2.AbstractC1033a, com.bumptech.glide.manager.InterfaceC1628k
    public void onStart() {
        Animatable animatable = this.f20460h;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // p022b2.AbstractC1033a, com.bumptech.glide.manager.InterfaceC1628k
    public void onStop() {
        Animatable animatable = this.f20460h;
        if (animatable != null) {
            animatable.stop();
        }
    }
}
