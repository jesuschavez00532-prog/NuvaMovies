package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.AbstractC0272b;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AbstractC0616q0;
import com.google.android.material.R$styleable;
import java.lang.ref.WeakReference;
import java.util.List;
import p020b0.AbstractC1031a;
import p320s.AbstractC6605a;

/* loaded from: classes.dex */
public abstract class AppBarLayout extends LinearLayout {

    /* loaded from: classes.dex */
    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        @Override // com.google.android.material.appbar.AbstractC2523c
        /* renamed from: E */
        public /* bridge */ /* synthetic */ int mo10149E() {
            return super.mo10149E();
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: W */
        public /* bridge */ /* synthetic */ boolean mo10137W(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10) {
            return super.mo10137W(coordinatorLayout, appBarLayout, i10);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: X */
        public /* bridge */ /* synthetic */ boolean mo10138X(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10, int i11, int i12, int i13) {
            return super.mo10138X(coordinatorLayout, appBarLayout, i10, i11, i12, i13);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: Y */
        public /* bridge */ /* synthetic */ void mo10139Y(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10, int i11, int[] iArr, int i12) {
            super.mo10139Y(coordinatorLayout, appBarLayout, view, i10, i11, iArr, i12);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: Z */
        public /* bridge */ /* synthetic */ void mo10140Z(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
            super.mo10140Z(coordinatorLayout, appBarLayout, view, i10, i11, i12, i13, i14, iArr);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: a0 */
        public /* bridge */ /* synthetic */ void mo10141a0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            super.mo10141a0(coordinatorLayout, appBarLayout, parcelable);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: b0 */
        public /* bridge */ /* synthetic */ Parcelable mo10142b0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            return super.mo10142b0(coordinatorLayout, appBarLayout);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: c0 */
        public /* bridge */ /* synthetic */ boolean mo10143c0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i10, int i11) {
            return super.mo10143c0(coordinatorLayout, appBarLayout, view, view2, i10, i11);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: d0 */
        public /* bridge */ /* synthetic */ void mo10144d0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10) {
            super.mo10144d0(coordinatorLayout, appBarLayout, view, i10);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* loaded from: classes.dex */
    public static class ScrollingViewBehavior extends AbstractC2522b {
        public ScrollingViewBehavior() {
        }

        /* renamed from: P */
        private void m10150P(View view, View view2) {
            CoordinatorLayout.AbstractC0482b m2144e = ((CoordinatorLayout.C0485e) view2.getLayoutParams()).m2144e();
            if (m2144e instanceof BaseBehavior) {
                AbstractC0616q0.m2607Y(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) m2144e).f9373k) + m10164K()) - m10163H(view2));
            }
        }

        /* renamed from: Q */
        private void m10151Q(View view, View view2) {
        }

        @Override // com.google.android.material.appbar.AbstractC2522b
        /* renamed from: G */
        /* bridge */ /* synthetic */ View mo10152G(List list) {
            m10155O(list);
            return null;
        }

        @Override // com.google.android.material.appbar.AbstractC2522b
        /* renamed from: I */
        float mo10153I(View view) {
            return 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.AbstractC2522b
        /* renamed from: J */
        public int mo10154J(View view) {
            return super.mo10154J(view);
        }

        /* renamed from: O */
        AppBarLayout m10155O(List list) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
            }
            return null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0482b
        /* renamed from: e */
        public boolean mo2115e(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0482b
        /* renamed from: h */
        public boolean mo2118h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            m10150P(view, view2);
            m10151Q(view, view2);
            return false;
        }

        @Override // com.google.android.material.appbar.AbstractC2523c, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0482b
        /* renamed from: l */
        public /* bridge */ /* synthetic */ boolean mo2122l(CoordinatorLayout coordinatorLayout, View view, int i10) {
            return super.mo2122l(coordinatorLayout, view, i10);
        }

        @Override // com.google.android.material.appbar.AbstractC2522b, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0482b
        /* renamed from: m */
        public /* bridge */ /* synthetic */ boolean mo2123m(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int i13) {
            return super.mo2123m(coordinatorLayout, view, i10, i11, i12, i13);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0482b
        /* renamed from: w */
        public boolean mo2133w(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z10) {
            m10155O(coordinatorLayout.m2101q(view));
            return false;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.f9352p0);
            m10165M(obtainStyledAttributes.getDimensionPixelSize(R$styleable.ScrollingViewBehavior_Layout_behavior_overlapTop, 0));
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public static class BaseBehavior<T extends AppBarLayout> extends AbstractC2521a {

        /* renamed from: k */
        private int f9373k;

        /* renamed from: l */
        private int f9374l;

        /* renamed from: m */
        private int f9375m;

        /* renamed from: n */
        private boolean f9376n;

        /* renamed from: o */
        private float f9377o;

        /* renamed from: p */
        private WeakReference f9378p;

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$a */
        /* loaded from: classes.dex */
        public static class C2520a extends AbstractC1031a {
            public static final Parcelable.Creator<C2520a> CREATOR = new a();

            /* renamed from: c */
            int f9379c;

            /* renamed from: d */
            float f9380d;

            /* renamed from: e */
            boolean f9381e;

            /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$a$a */
            /* loaded from: classes.dex */
            static class a implements Parcelable.ClassLoaderCreator {
                a() {
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public C2520a createFromParcel(Parcel parcel) {
                    return new C2520a(parcel, null);
                }

                @Override // android.os.Parcelable.ClassLoaderCreator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public C2520a createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new C2520a(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: c, reason: merged with bridge method [inline-methods] */
                public C2520a[] newArray(int i10) {
                    return new C2520a[i10];
                }
            }

            public C2520a(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                boolean z10;
                this.f9379c = parcel.readInt();
                this.f9380d = parcel.readFloat();
                if (parcel.readByte() != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f9381e = z10;
            }

            @Override // p020b0.AbstractC1031a, android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i10) {
                super.writeToParcel(parcel, i10);
                parcel.writeInt(this.f9379c);
                parcel.writeFloat(this.f9380d);
                parcel.writeByte(this.f9381e ? (byte) 1 : (byte) 0);
            }
        }

        public BaseBehavior() {
            this.f9375m = -1;
        }

        /* renamed from: S */
        private int m10125S(AppBarLayout appBarLayout, int i10) {
            throw null;
        }

        /* renamed from: f0 */
        private void m10126f0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            if (m10125S(appBarLayout, mo10130L()) < 0) {
            } else {
                throw null;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0482b
        /* renamed from: A */
        public /* bridge */ /* synthetic */ boolean mo2107A(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10, int i11) {
            AbstractC0272b.m941a(view);
            return mo10143c0(coordinatorLayout, null, view2, view3, i10, i11);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0482b
        /* renamed from: C */
        public /* bridge */ /* synthetic */ void mo2109C(CoordinatorLayout coordinatorLayout, View view, View view2, int i10) {
            AbstractC0272b.m941a(view);
            mo10144d0(coordinatorLayout, null, view2, i10);
        }

        @Override // com.google.android.material.appbar.AbstractC2521a
        /* renamed from: G */
        /* bridge */ /* synthetic */ boolean mo10127G(View view) {
            AbstractC0272b.m941a(view);
            return m10133R(null);
        }

        @Override // com.google.android.material.appbar.AbstractC2521a
        /* renamed from: J */
        /* bridge */ /* synthetic */ int mo10128J(View view) {
            AbstractC0272b.m941a(view);
            return m10134T(null);
        }

        @Override // com.google.android.material.appbar.AbstractC2521a
        /* renamed from: K */
        /* bridge */ /* synthetic */ int mo10129K(View view) {
            AbstractC0272b.m941a(view);
            return m10135U(null);
        }

        @Override // com.google.android.material.appbar.AbstractC2521a
        /* renamed from: L */
        int mo10130L() {
            return mo10149E() + this.f9373k;
        }

        @Override // com.google.android.material.appbar.AbstractC2521a
        /* renamed from: M */
        /* bridge */ /* synthetic */ void mo10131M(CoordinatorLayout coordinatorLayout, View view) {
            AbstractC0272b.m941a(view);
            m10136V(coordinatorLayout, null);
        }

        @Override // com.google.android.material.appbar.AbstractC2521a
        /* renamed from: P */
        /* bridge */ /* synthetic */ int mo10132P(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
            AbstractC0272b.m941a(view);
            return m10145e0(coordinatorLayout, null, i10, i11, i12);
        }

        /* renamed from: R */
        boolean m10133R(AppBarLayout appBarLayout) {
            WeakReference weakReference = this.f9378p;
            if (weakReference == null) {
                return true;
            }
            View view = (View) weakReference.get();
            if (view != null && view.isShown() && !view.canScrollVertically(-1)) {
                return true;
            }
            return false;
        }

        /* renamed from: T */
        int m10134T(AppBarLayout appBarLayout) {
            throw null;
        }

        /* renamed from: U */
        int m10135U(AppBarLayout appBarLayout) {
            throw null;
        }

        /* renamed from: V */
        void m10136V(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            m10126f0(coordinatorLayout, appBarLayout);
            throw null;
        }

        /* renamed from: W */
        public boolean mo10137W(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10) {
            super.mo2122l(coordinatorLayout, appBarLayout, i10);
            throw null;
        }

        /* renamed from: X */
        public boolean mo10138X(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10, int i11, int i12, int i13) {
            throw null;
        }

        /* renamed from: Y */
        public void mo10139Y(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10, int i11, int[] iArr, int i12) {
            if (i11 != 0) {
                if (i11 < 0) {
                    throw null;
                }
                throw null;
            }
            throw null;
        }

        /* renamed from: Z */
        public void mo10140Z(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
            if (i13 >= 0) {
            } else {
                throw null;
            }
        }

        /* renamed from: a0 */
        public void mo10141a0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            if (parcelable instanceof C2520a) {
                C2520a c2520a = (C2520a) parcelable;
                super.mo2134x(coordinatorLayout, appBarLayout, c2520a.m4828a());
                this.f9375m = c2520a.f9379c;
                this.f9377o = c2520a.f9380d;
                this.f9376n = c2520a.f9381e;
                return;
            }
            super.mo2134x(coordinatorLayout, appBarLayout, parcelable);
            this.f9375m = -1;
        }

        /* renamed from: b0 */
        public Parcelable mo10142b0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            super.mo2135y(coordinatorLayout, appBarLayout);
            mo10149E();
            throw null;
        }

        /* renamed from: c0 */
        public boolean mo10143c0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i10, int i11) {
            if ((i10 & 2) == 0) {
                this.f9378p = null;
                this.f9374l = i11;
                return false;
            }
            throw null;
        }

        /* renamed from: d0 */
        public void mo10144d0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10) {
            if (this.f9374l != 0 && i10 != 1) {
                this.f9378p = new WeakReference(view);
            } else {
                m10126f0(coordinatorLayout, appBarLayout);
                throw null;
            }
        }

        /* renamed from: e0 */
        int m10145e0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10, int i11, int i12) {
            int mo10130L = mo10130L();
            if (i11 != 0 && mo10130L >= i11 && mo10130L <= i12) {
                if (mo10130L != AbstractC6605a.m25818b(i10, i11, i12)) {
                    throw null;
                }
            } else {
                this.f9373k = 0;
            }
            return 0;
        }

        @Override // com.google.android.material.appbar.AbstractC2523c, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0482b
        /* renamed from: l */
        public /* bridge */ /* synthetic */ boolean mo2122l(CoordinatorLayout coordinatorLayout, View view, int i10) {
            AbstractC0272b.m941a(view);
            return mo10137W(coordinatorLayout, null, i10);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0482b
        /* renamed from: m */
        public /* bridge */ /* synthetic */ boolean mo2123m(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int i13) {
            AbstractC0272b.m941a(view);
            return mo10138X(coordinatorLayout, null, i10, i11, i12, i13);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0482b
        /* renamed from: q */
        public /* bridge */ /* synthetic */ void mo2127q(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int[] iArr, int i12) {
            AbstractC0272b.m941a(view);
            mo10139Y(coordinatorLayout, null, view2, i10, i11, iArr, i12);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0482b
        /* renamed from: t */
        public /* bridge */ /* synthetic */ void mo2130t(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
            AbstractC0272b.m941a(view);
            mo10140Z(coordinatorLayout, null, view2, i10, i11, i12, i13, i14, iArr);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0482b
        /* renamed from: x */
        public /* bridge */ /* synthetic */ void mo2134x(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
            AbstractC0272b.m941a(view);
            mo10141a0(coordinatorLayout, null, parcelable);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0482b
        /* renamed from: y */
        public /* bridge */ /* synthetic */ Parcelable mo2135y(CoordinatorLayout coordinatorLayout, View view) {
            AbstractC0272b.m941a(view);
            return mo10142b0(coordinatorLayout, null);
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f9375m = -1;
        }
    }
}
