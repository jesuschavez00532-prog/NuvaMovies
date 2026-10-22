package p151h0;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

/* renamed from: h0.a0 */
/* loaded from: classes.dex */
class C4460a0 implements InterfaceC4462b0 {

    /* renamed from: a */
    private final ViewOverlay f19308a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4460a0(View view) {
        this.f19308a = view.getOverlay();
    }

    @Override // p151h0.InterfaceC4462b0
    /* renamed from: a */
    public void mo18661a(Drawable drawable) {
        this.f19308a.add(drawable);
    }

    @Override // p151h0.InterfaceC4462b0
    /* renamed from: b */
    public void mo18662b(Drawable drawable) {
        this.f19308a.remove(drawable);
    }
}
