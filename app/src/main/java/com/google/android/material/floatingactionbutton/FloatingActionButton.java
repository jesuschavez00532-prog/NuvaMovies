package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.support.v4.media.session.AbstractC0272b;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.InterfaceC0604n0;
import androidx.core.widget.InterfaceC0673h0;
import com.google.android.material.R$styleable;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.AbstractC2590h;
import java.util.List;
import p247n5.InterfaceC5745a;
import p326s5.InterfaceC6693p;

/* loaded from: classes.dex */
public abstract class FloatingActionButton extends AbstractC2590h implements InterfaceC0604n0, InterfaceC0673h0, InterfaceC5745a, InterfaceC6693p {

    /* loaded from: classes.dex */
    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* renamed from: E */
        public /* bridge */ /* synthetic */ boolean mo10576E(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            return super.mo10576E(coordinatorLayout, floatingActionButton, rect);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* renamed from: H */
        public /* bridge */ /* synthetic */ boolean mo10577H(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            return super.mo10577H(coordinatorLayout, floatingActionButton, view);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* renamed from: I */
        public /* bridge */ /* synthetic */ boolean mo10578I(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i10) {
            return super.mo10578I(coordinatorLayout, floatingActionButton, i10);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0482b
        /* renamed from: g */
        public /* bridge */ /* synthetic */ void mo2117g(CoordinatorLayout.C0485e c0485e) {
            super.mo2117g(c0485e);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* loaded from: classes.dex */
    protected static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.AbstractC0482b {

        /* renamed from: a */
        private boolean f9730a;

        public BaseBehavior() {
            this.f9730a = true;
        }

        /* renamed from: F */
        private static boolean m10572F(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.C0485e) {
                return ((CoordinatorLayout.C0485e) layoutParams).m2144e() instanceof BottomSheetBehavior;
            }
            return false;
        }

        /* renamed from: G */
        private void m10573G(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton) {
            throw null;
        }

        /* renamed from: J */
        private boolean m10574J(View view, FloatingActionButton floatingActionButton) {
            throw null;
        }

        /* renamed from: K */
        private boolean m10575K(View view, FloatingActionButton floatingActionButton) {
            if (!m10574J(view, floatingActionButton)) {
                return false;
            }
            throw null;
        }

        /* renamed from: E */
        public boolean mo10576E(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            throw null;
        }

        /* renamed from: H */
        public boolean mo10577H(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            if (m10572F(view)) {
                m10575K(view, floatingActionButton);
                return false;
            }
            return false;
        }

        /* renamed from: I */
        public boolean mo10578I(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i10) {
            List m2101q = coordinatorLayout.m2101q(floatingActionButton);
            int size = m2101q.size();
            for (int i11 = 0; i11 < size; i11++) {
                View view = (View) m2101q.get(i11);
                if (m10572F(view) && m10575K(view, floatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.m2090G(floatingActionButton, i10);
            m10573G(coordinatorLayout, floatingActionButton);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0482b
        /* renamed from: b */
        public /* bridge */ /* synthetic */ boolean mo2112b(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            AbstractC0272b.m941a(view);
            return mo10576E(coordinatorLayout, null, rect);
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
            return mo10577H(coordinatorLayout, null, view2);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0482b
        /* renamed from: l */
        public /* bridge */ /* synthetic */ boolean mo2122l(CoordinatorLayout coordinatorLayout, View view, int i10) {
            AbstractC0272b.m941a(view);
            return mo10578I(coordinatorLayout, null, i10);
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.f9305K);
            this.f9730a = obtainStyledAttributes.getBoolean(R$styleable.FloatingActionButton_Behavior_Layout_behavior_autoHide, true);
            obtainStyledAttributes.recycle();
        }
    }
}
