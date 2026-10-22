package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.ViewGroup;
import androidx.appcompat.R$styleable;
import p138g.AbstractC4318b;

/* renamed from: androidx.appcompat.app.a */
/* loaded from: classes.dex */
public abstract class AbstractC0300a {
    /* renamed from: g */
    public boolean m1024g() {
        return false;
    }

    /* renamed from: h */
    public abstract boolean mo1025h();

    /* renamed from: i */
    public abstract void mo1026i(boolean z10);

    /* renamed from: j */
    public abstract int mo1027j();

    /* renamed from: k */
    public abstract Context mo1028k();

    /* renamed from: l */
    public boolean m1029l() {
        return false;
    }

    /* renamed from: m */
    public abstract void mo1030m(Configuration configuration);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public void m1031n() {
    }

    /* renamed from: o */
    public abstract boolean mo1032o(int i10, KeyEvent keyEvent);

    /* renamed from: p */
    public boolean m1033p(KeyEvent keyEvent) {
        return false;
    }

    /* renamed from: q */
    public boolean m1034q() {
        return false;
    }

    /* renamed from: r */
    public abstract void mo1035r(boolean z10);

    /* renamed from: s */
    public abstract void mo1036s(boolean z10);

    /* renamed from: t */
    public abstract void mo1037t(CharSequence charSequence);

    /* renamed from: u */
    public abstract AbstractC4318b mo1038u(AbstractC4318b.a aVar);

    /* renamed from: androidx.appcompat.app.a$a */
    /* loaded from: classes.dex */
    public static class a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public int f1044a;

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1044a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.f905b);
            this.f1044a = obtainStyledAttributes.getInt(R$styleable.ActionBarLayout_android_layout_gravity, 0);
            obtainStyledAttributes.recycle();
        }

        public a(int i10, int i11) {
            super(i10, i11);
            this.f1044a = 8388627;
        }

        public a(a aVar) {
            super((ViewGroup.MarginLayoutParams) aVar);
            this.f1044a = 0;
            this.f1044a = aVar.f1044a;
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1044a = 0;
        }
    }
}
