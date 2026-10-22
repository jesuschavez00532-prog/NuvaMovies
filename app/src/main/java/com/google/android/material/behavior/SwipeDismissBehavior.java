package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AbstractC0616q0;
import p032c0.C1336c;

/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.AbstractC0482b {

    /* renamed from: a */
    C1336c f9412a;

    /* renamed from: b */
    private boolean f9413b;

    /* renamed from: d */
    private boolean f9415d;

    /* renamed from: c */
    private float f9414c = 0.0f;

    /* renamed from: e */
    int f9416e = 2;

    /* renamed from: f */
    float f9417f = 0.5f;

    /* renamed from: g */
    float f9418g = 0.0f;

    /* renamed from: h */
    float f9419h = 0.5f;

    /* renamed from: i */
    private final C1336c.c f9420i = new C2526a();

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$a */
    /* loaded from: classes.dex */
    class C2526a extends C1336c.c {

        /* renamed from: a */
        private int f9421a;

        /* renamed from: b */
        private int f9422b = -1;

        C2526a() {
        }

        /* renamed from: n */
        private boolean m10184n(View view, float f10) {
            boolean z10;
            if (f10 != 0.0f) {
                if (AbstractC0616q0.m2579B(view) == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                int i10 = SwipeDismissBehavior.this.f9416e;
                if (i10 == 2) {
                    return true;
                }
                if (i10 == 0) {
                    if (z10) {
                        if (f10 >= 0.0f) {
                            return false;
                        }
                    } else if (f10 <= 0.0f) {
                        return false;
                    }
                    return true;
                }
                if (i10 != 1) {
                    return false;
                }
                if (z10) {
                    if (f10 <= 0.0f) {
                        return false;
                    }
                } else if (f10 >= 0.0f) {
                    return false;
                }
                return true;
            }
            if (Math.abs(view.getLeft() - this.f9421a) < Math.round(view.getWidth() * SwipeDismissBehavior.this.f9417f)) {
                return false;
            }
            return true;
        }

        @Override // p032c0.C1336c.c
        /* renamed from: a */
        public int mo6083a(View view, int i10, int i11) {
            boolean z10;
            int width;
            int width2;
            int width3;
            if (AbstractC0616q0.m2579B(view) == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i12 = SwipeDismissBehavior.this.f9416e;
            if (i12 == 0) {
                if (z10) {
                    width = this.f9421a - view.getWidth();
                    width2 = this.f9421a;
                } else {
                    width = this.f9421a;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                }
            } else if (i12 == 1) {
                if (z10) {
                    width = this.f9421a;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                } else {
                    width = this.f9421a - view.getWidth();
                    width2 = this.f9421a;
                }
            } else {
                width = this.f9421a - view.getWidth();
                width2 = view.getWidth() + this.f9421a;
            }
            return SwipeDismissBehavior.m10177G(width, i10, width2);
        }

        @Override // p032c0.C1336c.c
        /* renamed from: b */
        public int mo6084b(View view, int i10, int i11) {
            return view.getTop();
        }

        @Override // p032c0.C1336c.c
        /* renamed from: d */
        public int mo6086d(View view) {
            return view.getWidth();
        }

        @Override // p032c0.C1336c.c
        /* renamed from: i */
        public void mo6091i(View view, int i10) {
            this.f9422b = i10;
            this.f9421a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        @Override // p032c0.C1336c.c
        /* renamed from: j */
        public void mo6092j(int i10) {
            SwipeDismissBehavior.this.getClass();
        }

        @Override // p032c0.C1336c.c
        /* renamed from: k */
        public void mo6093k(View view, int i10, int i11, int i12, int i13) {
            float width = this.f9421a + (view.getWidth() * SwipeDismissBehavior.this.f9418g);
            float width2 = this.f9421a + (view.getWidth() * SwipeDismissBehavior.this.f9419h);
            float f10 = i10;
            if (f10 <= width) {
                view.setAlpha(1.0f);
            } else if (f10 >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.m10176F(0.0f, 1.0f - SwipeDismissBehavior.m10179I(width, width2, f10), 1.0f));
            }
        }

        @Override // p032c0.C1336c.c
        /* renamed from: l */
        public void mo6094l(View view, float f10, float f11) {
            int i10;
            boolean z10;
            this.f9422b = -1;
            int width = view.getWidth();
            if (m10184n(view, f10)) {
                int left = view.getLeft();
                int i11 = this.f9421a;
                if (left < i11) {
                    i10 = i11 - width;
                } else {
                    i10 = i11 + width;
                }
                z10 = true;
            } else {
                i10 = this.f9421a;
                z10 = false;
            }
            if (SwipeDismissBehavior.this.f9412a.m6070F(i10, view.getTop())) {
                AbstractC0616q0.m2620f0(view, new RunnableC2527b(view, z10));
            } else if (z10) {
                SwipeDismissBehavior.this.getClass();
            }
        }

        @Override // p032c0.C1336c.c
        /* renamed from: m */
        public boolean mo6095m(View view, int i10) {
            int i11 = this.f9422b;
            if ((i11 == -1 || i11 == i10) && SwipeDismissBehavior.this.mo10180E(view)) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$b */
    /* loaded from: classes.dex */
    private class RunnableC2527b implements Runnable {

        /* renamed from: a */
        private final View f9424a;

        /* renamed from: b */
        private final boolean f9425b;

        RunnableC2527b(View view, boolean z10) {
            this.f9424a = view;
            this.f9425b = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1336c c1336c = SwipeDismissBehavior.this.f9412a;
            if (c1336c != null && c1336c.m6076k(true)) {
                AbstractC0616q0.m2620f0(this.f9424a, this);
            } else if (this.f9425b) {
                SwipeDismissBehavior.this.getClass();
            }
        }
    }

    /* renamed from: F */
    static float m10176F(float f10, float f11, float f12) {
        return Math.min(Math.max(f10, f11), f12);
    }

    /* renamed from: G */
    static int m10177G(int i10, int i11, int i12) {
        return Math.min(Math.max(i10, i11), i12);
    }

    /* renamed from: H */
    private void m10178H(ViewGroup viewGroup) {
        C1336c m6061m;
        if (this.f9412a == null) {
            if (this.f9415d) {
                m6061m = C1336c.m6060l(viewGroup, this.f9414c, this.f9420i);
            } else {
                m6061m = C1336c.m6061m(viewGroup, this.f9420i);
            }
            this.f9412a = m6061m;
        }
    }

    /* renamed from: I */
    static float m10179I(float f10, float f11, float f12) {
        return (f12 - f10) / (f11 - f10);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0482b
    /* renamed from: D */
    public boolean mo2110D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        C1336c c1336c = this.f9412a;
        if (c1336c != null) {
            c1336c.m6082z(motionEvent);
            return true;
        }
        return false;
    }

    /* renamed from: E */
    public boolean mo10180E(View view) {
        return true;
    }

    /* renamed from: J */
    public void m10181J(float f10) {
        this.f9419h = m10176F(0.0f, f10, 1.0f);
    }

    /* renamed from: K */
    public void m10182K(float f10) {
        this.f9418g = m10176F(0.0f, f10, 1.0f);
    }

    /* renamed from: L */
    public void m10183L(int i10) {
        this.f9416e = i10;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0482b
    /* renamed from: k */
    public boolean mo2121k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z10 = this.f9413b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.f9413b = false;
            }
        } else {
            z10 = coordinatorLayout.m2106z(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f9413b = z10;
        }
        if (!z10) {
            return false;
        }
        m10178H(coordinatorLayout);
        return this.f9412a.m6071G(motionEvent);
    }
}
