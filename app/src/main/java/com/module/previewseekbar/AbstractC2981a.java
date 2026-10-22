package com.module.previewseekbar;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* renamed from: com.module.previewseekbar.a */
/* loaded from: classes2.dex */
abstract class AbstractC2981a {

    /* renamed from: a */
    View f12083a;

    /* renamed from: b */
    View f12084b;

    /* renamed from: c */
    FrameLayout f12085c;

    /* renamed from: d */
    InterfaceC2985e f12086d;

    /* renamed from: e */
    ViewGroup f12087e;

    public AbstractC2981a(ViewGroup viewGroup, InterfaceC2985e interfaceC2985e, View view, FrameLayout frameLayout, View view2) {
        this.f12087e = viewGroup;
        this.f12086d = interfaceC2985e;
        this.f12083a = view;
        this.f12085c = frameLayout;
        this.f12084b = view2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public float m12006a() {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f12085c.getLayoutParams();
        float m12009d = m12009d(this.f12086d.getProgress());
        float left = this.f12085c.getLeft();
        float width = (this.f12087e.getWidth() - marginLayoutParams.rightMargin) - this.f12085c.getWidth();
        float m12008c = m12008c() + this.f12086d.getThumbOffset();
        float m12007b = ((((m12007b() - this.f12086d.getThumbOffset()) - m12008c) * m12009d) + m12008c) - (this.f12085c.getWidth() / 2.0f);
        if (m12007b < left) {
            return left;
        }
        if (m12007b > width) {
            return width;
        }
        return m12007b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public float m12007b() {
        return m12008c() + ((View) this.f12086d).getWidth();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public float m12008c() {
        return ((View) this.f12086d).getX();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public float m12009d(int i10) {
        return i10 / this.f12086d.getMax();
    }

    /* renamed from: e */
    public abstract void mo12010e();

    /* renamed from: f */
    public abstract void mo12011f();

    /* renamed from: g */
    public abstract void mo12012g();
}
