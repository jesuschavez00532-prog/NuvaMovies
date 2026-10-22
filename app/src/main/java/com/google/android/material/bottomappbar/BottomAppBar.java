package com.google.android.material.bottomappbar;

import android.content.Context;
import android.graphics.Rect;
import android.support.v4.media.session.AbstractC0272b;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AbstractC0616q0;
import com.google.android.material.R$style;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public abstract class BottomAppBar extends Toolbar {

    /* renamed from: O */
    private static final int f9427O = R$style.Widget_MaterialComponents_BottomAppBar;

    /* renamed from: O */
    static /* synthetic */ View m10185O(BottomAppBar bottomAppBar) {
        throw null;
    }

    /* renamed from: P */
    static /* synthetic */ void m10186P(BottomAppBar bottomAppBar) {
        throw null;
    }

    /* loaded from: classes.dex */
    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* renamed from: e */
        private final Rect f9428e;

        /* renamed from: f */
        private WeakReference f9429f;

        /* renamed from: g */
        private int f9430g;

        /* renamed from: h */
        private final View.OnLayoutChangeListener f9431h;

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$Behavior$a */
        /* loaded from: classes.dex */
        class ViewOnLayoutChangeListenerC2528a implements View.OnLayoutChangeListener {
            ViewOnLayoutChangeListenerC2528a() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                AbstractC0272b.m941a(Behavior.this.f9429f.get());
                view.removeOnLayoutChangeListener(this);
            }
        }

        public Behavior() {
            this.f9431h = new ViewOnLayoutChangeListenerC2528a();
            this.f9428e = new Rect();
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0482b
        /* renamed from: A */
        public /* bridge */ /* synthetic */ boolean mo2107A(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10, int i11) {
            AbstractC0272b.m941a(view);
            return m10189K(coordinatorLayout, null, view2, view3, i10, i11);
        }

        /* renamed from: J */
        public boolean m10188J(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, int i10) {
            this.f9429f = new WeakReference(bottomAppBar);
            View m10185O = BottomAppBar.m10185O(bottomAppBar);
            if (m10185O != null && !AbstractC0616q0.m2600R(m10185O)) {
                CoordinatorLayout.C0485e c0485e = (CoordinatorLayout.C0485e) m10185O.getLayoutParams();
                c0485e.f2152d = 49;
                this.f9430g = ((ViewGroup.MarginLayoutParams) c0485e).bottomMargin;
                BottomAppBar.m10186P(bottomAppBar);
            }
            coordinatorLayout.m2090G(bottomAppBar, i10);
            return super.mo2122l(coordinatorLayout, bottomAppBar, i10);
        }

        /* renamed from: K */
        public boolean m10189K(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, View view, View view2, int i10, int i11) {
            throw null;
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0482b
        /* renamed from: l */
        public /* bridge */ /* synthetic */ boolean mo2122l(CoordinatorLayout coordinatorLayout, View view, int i10) {
            AbstractC0272b.m941a(view);
            return m10188J(coordinatorLayout, null, i10);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f9431h = new ViewOnLayoutChangeListenerC2528a();
            this.f9428e = new Rect();
        }
    }
}
