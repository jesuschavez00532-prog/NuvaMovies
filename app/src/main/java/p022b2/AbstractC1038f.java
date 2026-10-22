package p022b2;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import p034c2.InterfaceC1344b;

/* renamed from: b2.f */
/* loaded from: classes.dex */
public abstract class AbstractC1038f extends AbstractC1043k implements InterfaceC1344b.a {

    /* renamed from: h */
    private Animatable f4287h;

    public AbstractC1038f(ImageView imageView) {
        super(imageView);
    }

    /* renamed from: e */
    private void m4857e(Object obj) {
        if (obj instanceof Animatable) {
            Animatable animatable = (Animatable) obj;
            this.f4287h = animatable;
            animatable.start();
            return;
        }
        this.f4287h = null;
    }

    /* renamed from: h */
    private void m4858h(Object obj) {
        mo4837g(obj);
        m4857e(obj);
    }

    /* renamed from: f */
    public void m4859f(Drawable drawable) {
        ((ImageView) this.f4290a).setImageDrawable(drawable);
    }

    /* renamed from: g */
    protected abstract void mo4837g(Object obj);

    @Override // p022b2.AbstractC1043k, p022b2.AbstractC1033a, p022b2.InterfaceC1042j
    public void onLoadCleared(Drawable drawable) {
        super.onLoadCleared(drawable);
        Animatable animatable = this.f4287h;
        if (animatable != null) {
            animatable.stop();
        }
        m4858h(null);
        m4859f(drawable);
    }

    @Override // p022b2.AbstractC1033a, p022b2.InterfaceC1042j
    public void onLoadFailed(Drawable drawable) {
        super.onLoadFailed(drawable);
        m4858h(null);
        m4859f(drawable);
    }

    @Override // p022b2.AbstractC1043k, p022b2.AbstractC1033a, p022b2.InterfaceC1042j
    public void onLoadStarted(Drawable drawable) {
        super.onLoadStarted(drawable);
        m4858h(null);
        m4859f(drawable);
    }

    @Override // p022b2.InterfaceC1042j
    public void onResourceReady(Object obj, InterfaceC1344b interfaceC1344b) {
        if (interfaceC1344b != null && interfaceC1344b.mo6110a(obj, this)) {
            m4857e(obj);
        } else {
            m4858h(obj);
        }
    }

    @Override // p022b2.AbstractC1033a, com.bumptech.glide.manager.InterfaceC1628k
    public void onStart() {
        Animatable animatable = this.f4287h;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // p022b2.AbstractC1033a, com.bumptech.glide.manager.InterfaceC1628k
    public void onStop() {
        Animatable animatable = this.f4287h;
        if (animatable != null) {
            animatable.stop();
        }
    }
}
