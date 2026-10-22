package p151h0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.R$id;
import p151h0.AbstractC4485n;

/* renamed from: h0.p0 */
/* loaded from: classes.dex */
public abstract class AbstractC4490p0 extends AbstractC4485n {

    /* renamed from: K */
    private static final String[] f19433K = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: J */
    private int f19434J = 3;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h0.p0$a */
    /* loaded from: classes.dex */
    public class a extends AbstractC4487o {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f19435a;

        /* renamed from: b */
        final /* synthetic */ View f19436b;

        /* renamed from: c */
        final /* synthetic */ View f19437c;

        a(ViewGroup viewGroup, View view, View view2) {
            this.f19435a = viewGroup;
            this.f19436b = view;
            this.f19437c = view2;
        }

        @Override // p151h0.AbstractC4487o, p151h0.AbstractC4485n.f
        /* renamed from: a */
        public void mo18682a(AbstractC4485n abstractC4485n) {
            AbstractC4502z.m18815a(this.f19435a).mo18813d(this.f19436b);
        }

        @Override // p151h0.AbstractC4487o, p151h0.AbstractC4485n.f
        /* renamed from: d */
        public void mo18684d(AbstractC4485n abstractC4485n) {
            if (this.f19436b.getParent() == null) {
                AbstractC4502z.m18815a(this.f19435a).mo18812c(this.f19436b);
            } else {
                AbstractC4490p0.this.cancel();
            }
        }

        @Override // p151h0.AbstractC4485n.f
        /* renamed from: e */
        public void mo18685e(AbstractC4485n abstractC4485n) {
            this.f19437c.setTag(R$id.save_overlay_view, null);
            AbstractC4502z.m18815a(this.f19435a).mo18813d(this.f19436b);
            abstractC4485n.mo18754R(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h0.p0$b */
    /* loaded from: classes.dex */
    public static class b extends AnimatorListenerAdapter implements AbstractC4485n.f {

        /* renamed from: a */
        private final View f19439a;

        /* renamed from: b */
        private final int f19440b;

        /* renamed from: c */
        private final ViewGroup f19441c;

        /* renamed from: d */
        private final boolean f19442d;

        /* renamed from: e */
        private boolean f19443e;

        /* renamed from: f */
        boolean f19444f = false;

        b(View view, int i10, boolean z10) {
            this.f19439a = view;
            this.f19440b = i10;
            this.f19441c = (ViewGroup) view.getParent();
            this.f19442d = z10;
            m18794g(true);
        }

        /* renamed from: f */
        private void m18793f() {
            if (!this.f19444f) {
                AbstractC4464c0.m18696h(this.f19439a, this.f19440b);
                ViewGroup viewGroup = this.f19441c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            m18794g(false);
        }

        /* renamed from: g */
        private void m18794g(boolean z10) {
            ViewGroup viewGroup;
            if (this.f19442d && this.f19443e != z10 && (viewGroup = this.f19441c) != null) {
                this.f19443e = z10;
                AbstractC4502z.m18817c(viewGroup, z10);
            }
        }

        @Override // p151h0.AbstractC4485n.f
        /* renamed from: a */
        public void mo18682a(AbstractC4485n abstractC4485n) {
            m18794g(false);
        }

        @Override // p151h0.AbstractC4485n.f
        /* renamed from: b */
        public void mo18683b(AbstractC4485n abstractC4485n) {
        }

        @Override // p151h0.AbstractC4485n.f
        /* renamed from: c */
        public void mo18709c(AbstractC4485n abstractC4485n) {
        }

        @Override // p151h0.AbstractC4485n.f
        /* renamed from: d */
        public void mo18684d(AbstractC4485n abstractC4485n) {
            m18794g(true);
        }

        @Override // p151h0.AbstractC4485n.f
        /* renamed from: e */
        public void mo18685e(AbstractC4485n abstractC4485n) {
            m18793f();
            abstractC4485n.mo18754R(this);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f19444f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            m18793f();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            if (!this.f19444f) {
                AbstractC4464c0.m18696h(this.f19439a, this.f19440b);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            if (!this.f19444f) {
                AbstractC4464c0.m18696h(this.f19439a, 0);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h0.p0$c */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        boolean f19445a;

        /* renamed from: b */
        boolean f19446b;

        /* renamed from: c */
        int f19447c;

        /* renamed from: d */
        int f19448d;

        /* renamed from: e */
        ViewGroup f19449e;

        /* renamed from: f */
        ViewGroup f19450f;

        c() {
        }
    }

    /* renamed from: g0 */
    private void m18788g0(C4497u c4497u) {
        c4497u.f19463a.put("android:visibility:visibility", Integer.valueOf(c4497u.f19464b.getVisibility()));
        c4497u.f19463a.put("android:visibility:parent", c4497u.f19464b.getParent());
        int[] iArr = new int[2];
        c4497u.f19464b.getLocationOnScreen(iArr);
        c4497u.f19463a.put("android:visibility:screenLocation", iArr);
    }

    /* renamed from: h0 */
    private c m18789h0(C4497u c4497u, C4497u c4497u2) {
        c cVar = new c();
        cVar.f19445a = false;
        cVar.f19446b = false;
        if (c4497u != null && c4497u.f19463a.containsKey("android:visibility:visibility")) {
            cVar.f19447c = ((Integer) c4497u.f19463a.get("android:visibility:visibility")).intValue();
            cVar.f19449e = (ViewGroup) c4497u.f19463a.get("android:visibility:parent");
        } else {
            cVar.f19447c = -1;
            cVar.f19449e = null;
        }
        if (c4497u2 != null && c4497u2.f19463a.containsKey("android:visibility:visibility")) {
            cVar.f19448d = ((Integer) c4497u2.f19463a.get("android:visibility:visibility")).intValue();
            cVar.f19450f = (ViewGroup) c4497u2.f19463a.get("android:visibility:parent");
        } else {
            cVar.f19448d = -1;
            cVar.f19450f = null;
        }
        if (c4497u != null && c4497u2 != null) {
            int i10 = cVar.f19447c;
            int i11 = cVar.f19448d;
            if (i10 == i11 && cVar.f19449e == cVar.f19450f) {
                return cVar;
            }
            if (i10 != i11) {
                if (i10 == 0) {
                    cVar.f19446b = false;
                    cVar.f19445a = true;
                } else if (i11 == 0) {
                    cVar.f19446b = true;
                    cVar.f19445a = true;
                }
            } else if (cVar.f19450f == null) {
                cVar.f19446b = false;
                cVar.f19445a = true;
            } else if (cVar.f19449e == null) {
                cVar.f19446b = true;
                cVar.f19445a = true;
            }
        } else if (c4497u == null && cVar.f19448d == 0) {
            cVar.f19446b = true;
            cVar.f19445a = true;
        } else if (c4497u2 == null && cVar.f19447c == 0) {
            cVar.f19446b = false;
            cVar.f19445a = true;
        }
        return cVar;
    }

    @Override // p151h0.AbstractC4485n
    /* renamed from: F */
    public String[] mo18666F() {
        return f19433K;
    }

    @Override // p151h0.AbstractC4485n
    /* renamed from: H */
    public boolean mo18750H(C4497u c4497u, C4497u c4497u2) {
        if (c4497u == null && c4497u2 == null) {
            return false;
        }
        if (c4497u != null && c4497u2 != null && c4497u2.f19463a.containsKey("android:visibility:visibility") != c4497u.f19463a.containsKey("android:visibility:visibility")) {
            return false;
        }
        c m18789h0 = m18789h0(c4497u, c4497u2);
        if (!m18789h0.f19445a) {
            return false;
        }
        if (m18789h0.f19447c != 0 && m18789h0.f19448d != 0) {
            return false;
        }
        return true;
    }

    @Override // p151h0.AbstractC4485n
    /* renamed from: g */
    public void mo18667g(C4497u c4497u) {
        m18788g0(c4497u);
    }

    /* renamed from: i0 */
    public abstract Animator mo18705i0(ViewGroup viewGroup, View view, C4497u c4497u, C4497u c4497u2);

    @Override // p151h0.AbstractC4485n
    /* renamed from: j */
    public void mo18668j(C4497u c4497u) {
        m18788g0(c4497u);
    }

    /* renamed from: j0 */
    public Animator m18790j0(ViewGroup viewGroup, C4497u c4497u, int i10, C4497u c4497u2, int i11) {
        if ((this.f19434J & 1) != 1 || c4497u2 == null) {
            return null;
        }
        if (c4497u == null) {
            View view = (View) c4497u2.f19464b.getParent();
            if (m18789h0(m18778v(view, false), m18749G(view, false)).f19445a) {
                return null;
            }
        }
        return mo18705i0(viewGroup, c4497u2.f19464b, c4497u, c4497u2);
    }

    /* renamed from: k0 */
    public abstract Animator mo18706k0(ViewGroup viewGroup, View view, C4497u c4497u, C4497u c4497u2);

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0089, code lost:
    
        if (r17.f19410w != false) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x004a  */
    /* renamed from: l0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.animation.Animator m18791l0(android.view.ViewGroup r18, p151h0.C4497u r19, int r20, p151h0.C4497u r21, int r22) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p151h0.AbstractC4490p0.m18791l0(android.view.ViewGroup, h0.u, int, h0.u, int):android.animation.Animator");
    }

    /* renamed from: m0 */
    public void m18792m0(int i10) {
        if ((i10 & (-4)) == 0) {
            this.f19434J = i10;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    @Override // p151h0.AbstractC4485n
    /* renamed from: o */
    public Animator mo18669o(ViewGroup viewGroup, C4497u c4497u, C4497u c4497u2) {
        c m18789h0 = m18789h0(c4497u, c4497u2);
        if (m18789h0.f19445a) {
            if (m18789h0.f19449e != null || m18789h0.f19450f != null) {
                if (m18789h0.f19446b) {
                    return m18790j0(viewGroup, c4497u, m18789h0.f19447c, c4497u2, m18789h0.f19448d);
                }
                return m18791l0(viewGroup, c4497u, m18789h0.f19447c, c4497u2, m18789h0.f19448d);
            }
            return null;
        }
        return null;
    }
}
