package p151h0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.AbstractC0616q0;
import java.util.Map;

/* renamed from: h0.c */
/* loaded from: classes.dex */
public class C4463c extends AbstractC4485n {

    /* renamed from: M */
    private static final String[] f19309M = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: N */
    private static final Property f19310N = new b(PointF.class, "boundsOrigin");

    /* renamed from: O */
    private static final Property f19311O = new c(PointF.class, "topLeft");

    /* renamed from: V */
    private static final Property f19312V = new d(PointF.class, "bottomRight");

    /* renamed from: W */
    private static final Property f19313W = new e(PointF.class, "bottomRight");

    /* renamed from: X */
    private static final Property f19314X = new f(PointF.class, "topLeft");

    /* renamed from: Y */
    private static final Property f19315Y = new g(PointF.class, "position");

    /* renamed from: Z */
    private static C4481l f19316Z = new C4481l();

    /* renamed from: J */
    private int[] f19317J = new int[2];

    /* renamed from: K */
    private boolean f19318K = false;

    /* renamed from: L */
    private boolean f19319L = false;

    /* renamed from: h0.c$a */
    /* loaded from: classes.dex */
    class a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f19320a;

        /* renamed from: b */
        final /* synthetic */ BitmapDrawable f19321b;

        /* renamed from: c */
        final /* synthetic */ View f19322c;

        /* renamed from: d */
        final /* synthetic */ float f19323d;

        a(ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f10) {
            this.f19320a = viewGroup;
            this.f19321b = bitmapDrawable;
            this.f19322c = view;
            this.f19323d = f10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC4464c0.m18690b(this.f19320a).mo18662b(this.f19321b);
            AbstractC4464c0.m18695g(this.f19322c, this.f19323d);
        }
    }

    /* renamed from: h0.c$b */
    /* loaded from: classes.dex */
    static class b extends Property {

        /* renamed from: a */
        private Rect f19325a;

        b(Class cls, String str) {
            super(cls, str);
            this.f19325a = new Rect();
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.f19325a);
            Rect rect = this.f19325a;
            return new PointF(rect.left, rect.top);
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(Drawable drawable, PointF pointF) {
            drawable.copyBounds(this.f19325a);
            this.f19325a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.f19325a);
        }
    }

    /* renamed from: h0.c$c */
    /* loaded from: classes.dex */
    static class c extends Property {
        c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(k kVar) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(k kVar, PointF pointF) {
            kVar.m18688c(pointF);
        }
    }

    /* renamed from: h0.c$d */
    /* loaded from: classes.dex */
    static class d extends Property {
        d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(k kVar) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(k kVar, PointF pointF) {
            kVar.m18687a(pointF);
        }
    }

    /* renamed from: h0.c$e */
    /* loaded from: classes.dex */
    static class e extends Property {
        e(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            AbstractC4464c0.m18694f(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    /* renamed from: h0.c$f */
    /* loaded from: classes.dex */
    static class f extends Property {
        f(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            AbstractC4464c0.m18694f(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: h0.c$g */
    /* loaded from: classes.dex */
    static class g extends Property {
        g(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            AbstractC4464c0.m18694f(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    }

    /* renamed from: h0.c$h */
    /* loaded from: classes.dex */
    class h extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ k f19326a;
        private k mViewBounds;

        h(k kVar) {
            this.f19326a = kVar;
            this.mViewBounds = kVar;
        }
    }

    /* renamed from: h0.c$i */
    /* loaded from: classes.dex */
    class i extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f19328a;

        /* renamed from: b */
        final /* synthetic */ View f19329b;

        /* renamed from: c */
        final /* synthetic */ Rect f19330c;

        /* renamed from: d */
        final /* synthetic */ int f19331d;

        /* renamed from: e */
        final /* synthetic */ int f19332e;

        /* renamed from: f */
        final /* synthetic */ int f19333f;

        /* renamed from: g */
        final /* synthetic */ int f19334g;

        i(View view, Rect rect, int i10, int i11, int i12, int i13) {
            this.f19329b = view;
            this.f19330c = rect;
            this.f19331d = i10;
            this.f19332e = i11;
            this.f19333f = i12;
            this.f19334g = i13;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f19328a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f19328a) {
                AbstractC0616q0.m2648t0(this.f19329b, this.f19330c);
                AbstractC4464c0.m18694f(this.f19329b, this.f19331d, this.f19332e, this.f19333f, this.f19334g);
            }
        }
    }

    /* renamed from: h0.c$j */
    /* loaded from: classes.dex */
    class j extends AbstractC4487o {

        /* renamed from: a */
        boolean f19336a = false;

        /* renamed from: b */
        final /* synthetic */ ViewGroup f19337b;

        j(ViewGroup viewGroup) {
            this.f19337b = viewGroup;
        }

        @Override // p151h0.AbstractC4487o, p151h0.AbstractC4485n.f
        /* renamed from: a */
        public void mo18682a(AbstractC4485n abstractC4485n) {
            AbstractC4502z.m18817c(this.f19337b, false);
        }

        @Override // p151h0.AbstractC4487o, p151h0.AbstractC4485n.f
        /* renamed from: b */
        public void mo18683b(AbstractC4485n abstractC4485n) {
            AbstractC4502z.m18817c(this.f19337b, false);
            this.f19336a = true;
        }

        @Override // p151h0.AbstractC4487o, p151h0.AbstractC4485n.f
        /* renamed from: d */
        public void mo18684d(AbstractC4485n abstractC4485n) {
            AbstractC4502z.m18817c(this.f19337b, true);
        }

        @Override // p151h0.AbstractC4485n.f
        /* renamed from: e */
        public void mo18685e(AbstractC4485n abstractC4485n) {
            if (!this.f19336a) {
                AbstractC4502z.m18817c(this.f19337b, false);
            }
            abstractC4485n.mo18754R(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h0.c$k */
    /* loaded from: classes.dex */
    public static class k {

        /* renamed from: a */
        private int f19339a;

        /* renamed from: b */
        private int f19340b;

        /* renamed from: c */
        private int f19341c;

        /* renamed from: d */
        private int f19342d;

        /* renamed from: e */
        private View f19343e;

        /* renamed from: f */
        private int f19344f;

        /* renamed from: g */
        private int f19345g;

        k(View view) {
            this.f19343e = view;
        }

        /* renamed from: b */
        private void m18686b() {
            AbstractC4464c0.m18694f(this.f19343e, this.f19339a, this.f19340b, this.f19341c, this.f19342d);
            this.f19344f = 0;
            this.f19345g = 0;
        }

        /* renamed from: a */
        void m18687a(PointF pointF) {
            this.f19341c = Math.round(pointF.x);
            this.f19342d = Math.round(pointF.y);
            int i10 = this.f19345g + 1;
            this.f19345g = i10;
            if (this.f19344f == i10) {
                m18686b();
            }
        }

        /* renamed from: c */
        void m18688c(PointF pointF) {
            this.f19339a = Math.round(pointF.x);
            this.f19340b = Math.round(pointF.y);
            int i10 = this.f19344f + 1;
            this.f19344f = i10;
            if (i10 == this.f19345g) {
                m18686b();
            }
        }
    }

    /* renamed from: g0 */
    private void m18664g0(C4497u c4497u) {
        View view = c4497u.f19464b;
        if (AbstractC0616q0.m2600R(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            c4497u.f19463a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            c4497u.f19463a.put("android:changeBounds:parent", c4497u.f19464b.getParent());
            if (this.f19319L) {
                c4497u.f19464b.getLocationInWindow(this.f19317J);
                c4497u.f19463a.put("android:changeBounds:windowX", Integer.valueOf(this.f19317J[0]));
                c4497u.f19463a.put("android:changeBounds:windowY", Integer.valueOf(this.f19317J[1]));
            }
            if (this.f19318K) {
                c4497u.f19463a.put("android:changeBounds:clip", AbstractC0616q0.m2647t(view));
            }
        }
    }

    /* renamed from: h0 */
    private boolean m18665h0(View view, View view2) {
        if (!this.f19319L) {
            return true;
        }
        C4497u m18778v = m18778v(view, true);
        if (m18778v == null) {
            if (view == view2) {
                return true;
            }
        } else if (view2 == m18778v.f19464b) {
            return true;
        }
        return false;
    }

    @Override // p151h0.AbstractC4485n
    /* renamed from: F */
    public String[] mo18666F() {
        return f19309M;
    }

    @Override // p151h0.AbstractC4485n
    /* renamed from: g */
    public void mo18667g(C4497u c4497u) {
        m18664g0(c4497u);
    }

    @Override // p151h0.AbstractC4485n
    /* renamed from: j */
    public void mo18668j(C4497u c4497u) {
        m18664g0(c4497u);
    }

    @Override // p151h0.AbstractC4485n
    /* renamed from: o */
    public Animator mo18669o(ViewGroup viewGroup, C4497u c4497u, C4497u c4497u2) {
        int i10;
        View view;
        ObjectAnimator m18716a;
        int i11;
        Rect rect;
        Rect rect2;
        ObjectAnimator objectAnimator;
        Animator m18811c;
        if (c4497u != null && c4497u2 != null) {
            Map map = c4497u.f19463a;
            Map map2 = c4497u2.f19463a;
            ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
            ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
            if (viewGroup2 != null && viewGroup3 != null) {
                View view2 = c4497u2.f19464b;
                if (m18665h0(viewGroup2, viewGroup3)) {
                    Rect rect3 = (Rect) c4497u.f19463a.get("android:changeBounds:bounds");
                    Rect rect4 = (Rect) c4497u2.f19463a.get("android:changeBounds:bounds");
                    int i12 = rect3.left;
                    int i13 = rect4.left;
                    int i14 = rect3.top;
                    int i15 = rect4.top;
                    int i16 = rect3.right;
                    int i17 = rect4.right;
                    int i18 = rect3.bottom;
                    int i19 = rect4.bottom;
                    int i20 = i16 - i12;
                    int i21 = i18 - i14;
                    int i22 = i17 - i13;
                    int i23 = i19 - i15;
                    Rect rect5 = (Rect) c4497u.f19463a.get("android:changeBounds:clip");
                    Rect rect6 = (Rect) c4497u2.f19463a.get("android:changeBounds:clip");
                    if ((i20 != 0 && i21 != 0) || (i22 != 0 && i23 != 0)) {
                        if (i12 == i13 && i14 == i15) {
                            i10 = 0;
                        } else {
                            i10 = 1;
                        }
                        if (i16 != i17 || i18 != i19) {
                            i10++;
                        }
                    } else {
                        i10 = 0;
                    }
                    if ((rect5 != null && !rect5.equals(rect6)) || (rect5 == null && rect6 != null)) {
                        i10++;
                    }
                    if (i10 > 0) {
                        if (!this.f19318K) {
                            view = view2;
                            AbstractC4464c0.m18694f(view, i12, i14, i16, i18);
                            if (i10 == 2) {
                                if (i20 == i22 && i21 == i23) {
                                    m18811c = AbstractC4471g.m18716a(view, f19315Y, m18780x().mo18718a(i12, i14, i13, i15));
                                } else {
                                    k kVar = new k(view);
                                    ObjectAnimator m18716a2 = AbstractC4471g.m18716a(kVar, f19311O, m18780x().mo18718a(i12, i14, i13, i15));
                                    ObjectAnimator m18716a3 = AbstractC4471g.m18716a(kVar, f19312V, m18780x().mo18718a(i16, i18, i17, i19));
                                    AnimatorSet animatorSet = new AnimatorSet();
                                    animatorSet.playTogether(m18716a2, m18716a3);
                                    animatorSet.addListener(new h(kVar));
                                    m18811c = animatorSet;
                                }
                            } else if (i12 == i13 && i14 == i15) {
                                m18811c = AbstractC4471g.m18716a(view, f19313W, m18780x().mo18718a(i16, i18, i17, i19));
                            } else {
                                m18811c = AbstractC4471g.m18716a(view, f19314X, m18780x().mo18718a(i12, i14, i13, i15));
                            }
                        } else {
                            view = view2;
                            AbstractC4464c0.m18694f(view, i12, i14, Math.max(i20, i22) + i12, Math.max(i21, i23) + i14);
                            if (i12 == i13 && i14 == i15) {
                                m18716a = null;
                            } else {
                                m18716a = AbstractC4471g.m18716a(view, f19315Y, m18780x().mo18718a(i12, i14, i13, i15));
                            }
                            if (rect5 == null) {
                                i11 = 0;
                                rect = new Rect(0, 0, i20, i21);
                            } else {
                                i11 = 0;
                                rect = rect5;
                            }
                            if (rect6 == null) {
                                rect2 = new Rect(i11, i11, i22, i23);
                            } else {
                                rect2 = rect6;
                            }
                            if (!rect.equals(rect2)) {
                                AbstractC0616q0.m2648t0(view, rect);
                                C4481l c4481l = f19316Z;
                                Object[] objArr = new Object[2];
                                objArr[i11] = rect;
                                objArr[1] = rect2;
                                ObjectAnimator ofObject = ObjectAnimator.ofObject(view, "clipBounds", c4481l, objArr);
                                ofObject.addListener(new i(view, rect6, i13, i15, i17, i19));
                                objectAnimator = ofObject;
                            } else {
                                objectAnimator = null;
                            }
                            m18811c = AbstractC4496t.m18811c(m18716a, objectAnimator);
                        }
                        if (view.getParent() instanceof ViewGroup) {
                            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                            AbstractC4502z.m18817c(viewGroup4, true);
                            mo18760a(new j(viewGroup4));
                        }
                        return m18811c;
                    }
                    return null;
                }
                int intValue = ((Integer) c4497u.f19463a.get("android:changeBounds:windowX")).intValue();
                int intValue2 = ((Integer) c4497u.f19463a.get("android:changeBounds:windowY")).intValue();
                int intValue3 = ((Integer) c4497u2.f19463a.get("android:changeBounds:windowX")).intValue();
                int intValue4 = ((Integer) c4497u2.f19463a.get("android:changeBounds:windowY")).intValue();
                if (intValue == intValue3 && intValue2 == intValue4) {
                    return null;
                }
                viewGroup.getLocationInWindow(this.f19317J);
                Bitmap createBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_8888);
                view2.draw(new Canvas(createBitmap));
                BitmapDrawable bitmapDrawable = new BitmapDrawable(createBitmap);
                float m18691c = AbstractC4464c0.m18691c(view2);
                AbstractC4464c0.m18695g(view2, 0.0f);
                AbstractC4464c0.m18690b(viewGroup).mo18661a(bitmapDrawable);
                AbstractC4473h m18780x = m18780x();
                int[] iArr = this.f19317J;
                int i24 = iArr[0];
                int i25 = iArr[1];
                ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, AbstractC4479k.m18726a(f19310N, m18780x.mo18718a(intValue - i24, intValue2 - i25, intValue3 - i24, intValue4 - i25)));
                ofPropertyValuesHolder.addListener(new a(viewGroup, bitmapDrawable, view2, m18691c));
                return ofPropertyValuesHolder;
            }
            return null;
        }
        return null;
    }
}
