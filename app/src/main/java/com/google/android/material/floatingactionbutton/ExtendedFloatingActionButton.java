package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.support.v4.media.session.AbstractC0272b;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import java.util.List;

/* loaded from: classes.dex */
public abstract class ExtendedFloatingActionButton extends MaterialButton {

    /* renamed from: q */
    private static final int f9725q = R$style.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon;

    /* renamed from: r */
    static final Property f9726r = new C2578a(Float.class, "width");

    /* renamed from: s */
    static final Property f9727s = new C2579b(Float.class, "height");

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$a */
    /* loaded from: classes.dex */
    static class C2578a extends Property {
        C2578a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(view.getLayoutParams().width);
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f10) {
            view.getLayoutParams().width = f10.intValue();
            view.requestLayout();
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$b */
    /* loaded from: classes.dex */
    static class C2579b extends Property {
        C2579b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(view.getLayoutParams().height);
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f10) {
            view.getLayoutParams().height = f10.intValue();
            view.requestLayout();
        }
    }

    /* renamed from: g */
    static /* synthetic */ Rect m10560g(ExtendedFloatingActionButton extendedFloatingActionButton) {
        throw null;
    }

    /* loaded from: classes.dex */
    protected static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.AbstractC0482b {

        /* renamed from: a */
        private boolean f9728a;

        /* renamed from: b */
        private boolean f9729b;

        public ExtendedFloatingActionButtonBehavior() {
            this.f9728a = false;
            this.f9729b = true;
        }

        /* renamed from: F */
        private static boolean m10561F(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.C0485e) {
                return ((CoordinatorLayout.C0485e) layoutParams).m2144e() instanceof BottomSheetBehavior;
            }
            return false;
        }

        /* renamed from: G */
        private void m10562G(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            Rect m10560g = ExtendedFloatingActionButton.m10560g(extendedFloatingActionButton);
            if (m10560g != null && m10560g.centerX() > 0 && m10560g.centerY() > 0) {
                throw null;
            }
        }

        /* renamed from: J */
        private boolean m10563J(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            throw null;
        }

        /* renamed from: K */
        private boolean m10564K(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!m10563J(view, extendedFloatingActionButton)) {
                return false;
            }
            throw null;
        }

        /* renamed from: E */
        public boolean m10565E(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, Rect rect) {
            ExtendedFloatingActionButton.m10560g(extendedFloatingActionButton);
            throw null;
        }

        /* renamed from: H */
        public boolean m10566H(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, View view) {
            if (m10561F(view)) {
                m10564K(view, extendedFloatingActionButton);
                return false;
            }
            return false;
        }

        /* renamed from: I */
        public boolean m10567I(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, int i10) {
            List m2101q = coordinatorLayout.m2101q(extendedFloatingActionButton);
            int size = m2101q.size();
            for (int i11 = 0; i11 < size; i11++) {
                View view = (View) m2101q.get(i11);
                if (m10561F(view) && m10564K(view, extendedFloatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.m2090G(extendedFloatingActionButton, i10);
            m10562G(coordinatorLayout, extendedFloatingActionButton);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0482b
        /* renamed from: b */
        public /* bridge */ /* synthetic */ boolean mo2112b(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            AbstractC0272b.m941a(view);
            return m10565E(coordinatorLayout, null, rect);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0482b
        /* renamed from: g */
        public void mo2117g(CoordinatorLayout.C0485e c0485e) {
            if (c0485e.f2156h == 0) {
                c0485e.f2156h = 80;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0482b
        /* renamed from: h */
        public /* bridge */ /* synthetic */ boolean mo2118h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            AbstractC0272b.m941a(view);
            return m10566H(coordinatorLayout, null, view2);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0482b
        /* renamed from: l */
        public /* bridge */ /* synthetic */ boolean mo2122l(CoordinatorLayout coordinatorLayout, View view, int i10) {
            AbstractC0272b.m941a(view);
            return m10567I(coordinatorLayout, null, i10);
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.f9302I);
            this.f9728a = obtainStyledAttributes.getBoolean(R$styleable.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoHide, false);
            this.f9729b = obtainStyledAttributes.getBoolean(R$styleable.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoShrink, true);
            obtainStyledAttributes.recycle();
        }
    }
}
