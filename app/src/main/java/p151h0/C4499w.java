package p151h0;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* renamed from: h0.w */
/* loaded from: classes.dex */
class C4499w implements InterfaceC4500x {

    /* renamed from: a */
    private final ViewGroupOverlay f19470a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4499w(ViewGroup viewGroup) {
        this.f19470a = viewGroup.getOverlay();
    }

    @Override // p151h0.InterfaceC4462b0
    /* renamed from: a */
    public void mo18661a(Drawable drawable) {
        this.f19470a.add(drawable);
    }

    @Override // p151h0.InterfaceC4462b0
    /* renamed from: b */
    public void mo18662b(Drawable drawable) {
        this.f19470a.remove(drawable);
    }

    @Override // p151h0.InterfaceC4500x
    /* renamed from: c */
    public void mo18812c(View view) {
        this.f19470a.add(view);
    }

    @Override // p151h0.InterfaceC4500x
    /* renamed from: d */
    public void mo18813d(View view) {
        this.f19470a.remove(view);
    }
}
