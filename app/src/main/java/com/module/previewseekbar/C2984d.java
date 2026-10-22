package com.module.previewseekbar;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.module.R$dimen;
import com.module.R$drawable;
import com.module.previewseekbar.InterfaceC2985e;
import p290q.AbstractC6306k;
import sa.InterfaceC6778b;

/* renamed from: com.module.previewseekbar.d */
/* loaded from: classes2.dex */
public class C2984d implements InterfaceC2985e.a {

    /* renamed from: a */
    private FrameLayout f12097a;

    /* renamed from: b */
    private View f12098b;

    /* renamed from: c */
    private View f12099c;

    /* renamed from: d */
    private ViewGroup f12100d;

    /* renamed from: e */
    private AbstractC2981a f12101e;

    /* renamed from: f */
    private InterfaceC2985e f12102f;

    /* renamed from: g */
    private InterfaceC6778b f12103g;

    /* renamed from: h */
    private int f12104h;

    /* renamed from: i */
    private boolean f12105i;

    /* renamed from: j */
    private boolean f12106j;

    /* renamed from: k */
    private boolean f12107k;

    /* renamed from: l */
    private boolean f12108l;

    /* renamed from: m */
    private boolean f12109m;

    public C2984d(InterfaceC2985e interfaceC2985e, int i10) {
        this.f12102f = interfaceC2985e;
        interfaceC2985e.mo12002b(this);
        this.f12104h = i10;
    }

    /* renamed from: f */
    private FrameLayout m12028f(ViewGroup viewGroup, int i10) {
        if (i10 != -1 && viewGroup != null) {
            for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                View childAt = viewGroup.getChildAt(i11);
                if (childAt.getId() == i10 && (childAt instanceof FrameLayout)) {
                    return (FrameLayout) childAt;
                }
            }
        }
        return null;
    }

    /* renamed from: h */
    private void m12029h(FrameLayout frameLayout) {
        View view = new View(frameLayout.getContext());
        this.f12098b = view;
        view.setBackgroundResource(R$drawable.previewseekbar_morph);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(0, 0);
        int dimensionPixelSize = frameLayout.getResources().getDimensionPixelSize(R$dimen.previewseekbar_indicator_width);
        layoutParams.width = dimensionPixelSize;
        layoutParams.height = dimensionPixelSize;
        this.f12100d.addView(this.f12098b, layoutParams);
        this.f12099c = new View(frameLayout.getContext());
        frameLayout.addView(this.f12099c, new FrameLayout.LayoutParams(-1, -1));
        m12041n(this.f12104h);
        frameLayout.requestLayout();
    }

    @Override // com.module.previewseekbar.InterfaceC2985e.a
    /* renamed from: a */
    public void mo12030a(InterfaceC2985e interfaceC2985e, int i10) {
        this.f12106j = false;
    }

    @Override // com.module.previewseekbar.InterfaceC2985e.a
    /* renamed from: b */
    public void mo12031b(InterfaceC2985e interfaceC2985e, int i10, int i11) {
        this.f12106j = true;
    }

    @Override // com.module.previewseekbar.InterfaceC2985e.a
    /* renamed from: c */
    public void mo12032c(InterfaceC2985e interfaceC2985e, int i10) {
        this.f12106j = false;
    }

    @Override // com.module.previewseekbar.InterfaceC2985e.a
    /* renamed from: d */
    public void mo12033d(InterfaceC2985e interfaceC2985e, int i10, boolean z10) {
        if (this.f12107k && this.f12108l) {
            this.f12101e.mo12011f();
            if (!this.f12105i && z10) {
                m12043p();
            }
            InterfaceC6778b interfaceC6778b = this.f12103g;
            if (interfaceC6778b != null) {
                if (this.f12109m) {
                    interfaceC6778b.mo12288c(i10);
                } else {
                    interfaceC6778b.mo12287a(i10);
                }
            }
        }
        this.f12106j = false;
    }

    /* renamed from: e */
    public void m12034e(FrameLayout frameLayout) {
        if (this.f12107k) {
            return;
        }
        this.f12100d = (ViewGroup) frameLayout.getParent();
        this.f12097a = frameLayout;
        m12029h(frameLayout);
        this.f12098b.setVisibility(4);
        this.f12097a.setVisibility(4);
        this.f12099c.setVisibility(4);
        if (Build.VERSION.SDK_INT >= 21) {
            this.f12101e = new C2983c(this.f12100d, this.f12102f, this.f12098b, this.f12097a, this.f12099c);
        } else {
            this.f12101e = new C2982b(this.f12100d, this.f12102f, this.f12098b, this.f12097a, this.f12099c);
        }
        this.f12107k = true;
    }

    /* renamed from: g */
    public void m12035g() {
        if (this.f12105i) {
            this.f12101e.mo12010e();
            this.f12105i = false;
        }
    }

    /* renamed from: i */
    public boolean m12036i() {
        return this.f12107k;
    }

    /* renamed from: j */
    public boolean m12037j() {
        return this.f12105i;
    }

    /* renamed from: k */
    public void m12038k(ViewGroup viewGroup, int i10) {
        if (!this.f12107k) {
            this.f12100d = viewGroup;
            FrameLayout m12028f = m12028f(viewGroup, i10);
            if (m12028f != null) {
                m12034e(m12028f);
            }
        }
    }

    /* renamed from: l */
    public void m12039l(boolean z10) {
        this.f12108l = z10;
    }

    /* renamed from: m */
    public void m12040m(boolean z10) {
        this.f12109m = z10;
    }

    /* renamed from: n */
    public void m12041n(int i10) {
        Drawable m25072r = AbstractC6306k.m25072r(this.f12098b.getBackground());
        AbstractC6306k.m25068n(m25072r, i10);
        this.f12098b.setBackground(m25072r);
        this.f12099c.setBackgroundColor(i10);
    }

    /* renamed from: o */
    public void m12042o(InterfaceC6778b interfaceC6778b) {
        this.f12103g = interfaceC6778b;
    }

    /* renamed from: p */
    public void m12043p() {
        if (!this.f12105i && this.f12107k) {
            this.f12101e.mo12012g();
            this.f12105i = true;
        }
    }
}
