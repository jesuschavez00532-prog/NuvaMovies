package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;
import androidx.core.widget.AbstractC0670g;
import p290q.AbstractC6306k;

/* renamed from: androidx.appcompat.widget.k */
/* loaded from: classes.dex */
class C0411k {

    /* renamed from: a */
    private final CompoundButton f1780a;

    /* renamed from: b */
    private ColorStateList f1781b = null;

    /* renamed from: c */
    private PorterDuff.Mode f1782c = null;

    /* renamed from: d */
    private boolean f1783d = false;

    /* renamed from: e */
    private boolean f1784e = false;

    /* renamed from: f */
    private boolean f1785f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0411k(CompoundButton compoundButton) {
        this.f1780a = compoundButton;
    }

    /* renamed from: a */
    void m1752a() {
        Drawable m2957a = AbstractC0670g.m2957a(this.f1780a);
        if (m2957a != null) {
            if (this.f1783d || this.f1784e) {
                Drawable mutate = AbstractC6306k.m25072r(m2957a).mutate();
                if (this.f1783d) {
                    AbstractC6306k.m25069o(mutate, this.f1781b);
                }
                if (this.f1784e) {
                    AbstractC6306k.m25070p(mutate, this.f1782c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(this.f1780a.getDrawableState());
                }
                this.f1780a.setButtonDrawable(mutate);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m1753b(int i10) {
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public ColorStateList m1754c() {
        return this.f1781b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public PorterDuff.Mode m1755d() {
        return this.f1782c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003e A[Catch: all -> 0x0085, TRY_ENTER, TryCatch #1 {all -> 0x0085, blocks: (B:3:0x001d, B:5:0x0025, B:8:0x002b, B:11:0x003e, B:13:0x0046, B:15:0x004c, B:16:0x0059, B:18:0x0061, B:19:0x006a, B:21:0x0072), top: B:2:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0061 A[Catch: all -> 0x0085, TryCatch #1 {all -> 0x0085, blocks: (B:3:0x001d, B:5:0x0025, B:8:0x002b, B:11:0x003e, B:13:0x0046, B:15:0x004c, B:16:0x0059, B:18:0x0061, B:19:0x006a, B:21:0x0072), top: B:2:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0072 A[Catch: all -> 0x0085, TRY_LEAVE, TryCatch #1 {all -> 0x0085, blocks: (B:3:0x001d, B:5:0x0025, B:8:0x002b, B:11:0x003e, B:13:0x0046, B:15:0x004c, B:16:0x0059, B:18:0x0061, B:19:0x006a, B:21:0x0072), top: B:2:0x001d }] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m1756e(android.util.AttributeSet r10, int r11) {
        /*
            r9 = this;
            android.widget.CompoundButton r0 = r9.f1780a
            android.content.Context r0 = r0.getContext()
            int[] r3 = androidx.appcompat.R$styleable.f921r
            r8 = 0
            androidx.appcompat.widget.q2 r0 = androidx.appcompat.widget.C0438q2.m1874v(r0, r10, r3, r11, r8)
            android.widget.CompoundButton r1 = r9.f1780a
            android.content.Context r2 = r1.getContext()
            android.content.res.TypedArray r5 = r0.m1892r()
            r7 = 0
            r4 = r10
            r6 = r11
            androidx.core.view.AbstractC0616q0.m2632l0(r1, r2, r3, r4, r5, r6, r7)
            int r10 = androidx.appcompat.R$styleable.CompoundButton_buttonCompat     // Catch: java.lang.Throwable -> L85
            boolean r11 = r0.m1893s(r10)     // Catch: java.lang.Throwable -> L85
            if (r11 == 0) goto L3b
            int r10 = r0.m1888n(r10, r8)     // Catch: java.lang.Throwable -> L85
            if (r10 == 0) goto L3b
            android.widget.CompoundButton r11 = r9.f1780a     // Catch: android.content.res.Resources.NotFoundException -> L3a java.lang.Throwable -> L85
            android.content.Context r1 = r11.getContext()     // Catch: android.content.res.Resources.NotFoundException -> L3a java.lang.Throwable -> L85
            android.graphics.drawable.Drawable r10 = p106e.AbstractC4105b.m17170d(r1, r10)     // Catch: android.content.res.Resources.NotFoundException -> L3a java.lang.Throwable -> L85
            r11.setButtonDrawable(r10)     // Catch: android.content.res.Resources.NotFoundException -> L3a java.lang.Throwable -> L85
            r10 = 1
            goto L3c
        L3a:
        L3b:
            r10 = 0
        L3c:
            if (r10 != 0) goto L59
            int r10 = androidx.appcompat.R$styleable.CompoundButton_android_button     // Catch: java.lang.Throwable -> L85
            boolean r11 = r0.m1893s(r10)     // Catch: java.lang.Throwable -> L85
            if (r11 == 0) goto L59
            int r10 = r0.m1888n(r10, r8)     // Catch: java.lang.Throwable -> L85
            if (r10 == 0) goto L59
            android.widget.CompoundButton r11 = r9.f1780a     // Catch: java.lang.Throwable -> L85
            android.content.Context r1 = r11.getContext()     // Catch: java.lang.Throwable -> L85
            android.graphics.drawable.Drawable r10 = p106e.AbstractC4105b.m17170d(r1, r10)     // Catch: java.lang.Throwable -> L85
            r11.setButtonDrawable(r10)     // Catch: java.lang.Throwable -> L85
        L59:
            int r10 = androidx.appcompat.R$styleable.CompoundButton_buttonTint     // Catch: java.lang.Throwable -> L85
            boolean r11 = r0.m1893s(r10)     // Catch: java.lang.Throwable -> L85
            if (r11 == 0) goto L6a
            android.widget.CompoundButton r11 = r9.f1780a     // Catch: java.lang.Throwable -> L85
            android.content.res.ColorStateList r10 = r0.m1877c(r10)     // Catch: java.lang.Throwable -> L85
            androidx.core.widget.AbstractC0670g.m2959c(r11, r10)     // Catch: java.lang.Throwable -> L85
        L6a:
            int r10 = androidx.appcompat.R$styleable.CompoundButton_buttonTintMode     // Catch: java.lang.Throwable -> L85
            boolean r11 = r0.m1893s(r10)     // Catch: java.lang.Throwable -> L85
            if (r11 == 0) goto L81
            android.widget.CompoundButton r11 = r9.f1780a     // Catch: java.lang.Throwable -> L85
            r1 = -1
            int r10 = r0.m1885k(r10, r1)     // Catch: java.lang.Throwable -> L85
            r1 = 0
            android.graphics.PorterDuff$Mode r10 = androidx.appcompat.widget.AbstractC0421m1.m1831d(r10, r1)     // Catch: java.lang.Throwable -> L85
            androidx.core.widget.AbstractC0670g.m2960d(r11, r10)     // Catch: java.lang.Throwable -> L85
        L81:
            r0.m1894w()
            return
        L85:
            r10 = move-exception
            r0.m1894w()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0411k.m1756e(android.util.AttributeSet, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m1757f() {
        if (this.f1785f) {
            this.f1785f = false;
        } else {
            this.f1785f = true;
            m1752a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m1758g(ColorStateList colorStateList) {
        this.f1781b = colorStateList;
        this.f1783d = true;
        m1752a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m1759h(PorterDuff.Mode mode) {
        this.f1782c = mode;
        this.f1784e = true;
        m1752a();
    }
}
