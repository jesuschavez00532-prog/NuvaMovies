package p032c0;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.AbstractC0585i1;
import androidx.core.view.AbstractC0616q0;
import androidx.core.view.C0551a;
import com.taobao.accs.data.Message;
import java.util.ArrayList;
import java.util.List;
import p032c0.AbstractC1335b;
import p214l.C5312j;
import p389x.AbstractC7466l0;
import p389x.C7458h0;
import p389x.C7464k0;

/* renamed from: c0.a */
/* loaded from: classes.dex */
public abstract class AbstractC1334a extends C0551a {

    /* renamed from: n */
    private static final Rect f5010n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: o */
    private static final AbstractC1335b.a f5011o = new a();

    /* renamed from: p */
    private static final AbstractC1335b.b f5012p = new b();

    /* renamed from: h */
    private final AccessibilityManager f5017h;

    /* renamed from: i */
    private final View f5018i;

    /* renamed from: j */
    private c f5019j;

    /* renamed from: d */
    private final Rect f5013d = new Rect();

    /* renamed from: e */
    private final Rect f5014e = new Rect();

    /* renamed from: f */
    private final Rect f5015f = new Rect();

    /* renamed from: g */
    private final int[] f5016g = new int[2];

    /* renamed from: k */
    int f5020k = Integer.MIN_VALUE;

    /* renamed from: l */
    int f5021l = Integer.MIN_VALUE;

    /* renamed from: m */
    private int f5022m = Integer.MIN_VALUE;

    /* renamed from: c0.a$a */
    /* loaded from: classes.dex */
    static class a implements AbstractC1335b.a {
        a() {
        }

        @Override // p032c0.AbstractC1335b.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo6024a(C7458h0 c7458h0, Rect rect) {
            c7458h0.m28619l(rect);
        }
    }

    /* renamed from: c0.a$b */
    /* loaded from: classes.dex */
    static class b implements AbstractC1335b.b {
        b() {
        }

        @Override // p032c0.AbstractC1335b.b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public C7458h0 mo6026a(C5312j c5312j, int i10) {
            return (C7458h0) c5312j.m21446l(i10);
        }

        @Override // p032c0.AbstractC1335b.b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public int mo6027b(C5312j c5312j) {
            return c5312j.m21445k();
        }
    }

    /* renamed from: c0.a$c */
    /* loaded from: classes.dex */
    private class c extends C7464k0 {
        c() {
        }

        @Override // p389x.C7464k0
        /* renamed from: b */
        public C7458h0 mo6030b(int i10) {
            return C7458h0.m28567M(AbstractC1334a.this.m6009H(i10));
        }

        @Override // p389x.C7464k0
        /* renamed from: d */
        public C7458h0 mo6031d(int i10) {
            int i11 = 0;
            if (i10 == 2) {
                i11 = AbstractC1334a.this.f5020k;
            } else {
                i11 = AbstractC1334a.this.f5021l;
            }
            if (i11 == Integer.MIN_VALUE) {
                return null;
            }
            return mo6030b(i11);
        }

        @Override // p389x.C7464k0
        /* renamed from: f */
        public boolean mo6032f(int i10, int i11, Bundle bundle) {
            return AbstractC1334a.this.m6017P(i10, i11, bundle);
        }
    }

    public AbstractC1334a(View view) {
        if (view != null) {
            this.f5018i = view;
            this.f5017h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            if (AbstractC0616q0.m2659z(view) == 0) {
                AbstractC0616q0.m2654w0(view, 1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    /* renamed from: D */
    private static Rect m5989D(View view, int i10, Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i10 != 17) {
            if (i10 != 33) {
                if (i10 != 66) {
                    if (i10 == 130) {
                        rect.set(0, -1, width, -1);
                    } else {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                } else {
                    rect.set(-1, 0, -1, height);
                }
            } else {
                rect.set(0, height, width, height);
            }
        } else {
            rect.set(width, 0, width, height);
        }
        return rect;
    }

    /* renamed from: E */
    private boolean m5990E(Rect rect) {
        if (rect == null || rect.isEmpty() || this.f5018i.getWindowVisibility() != 0) {
            return false;
        }
        Object parent = this.f5018i.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                return false;
            }
            parent = view.getParent();
        }
        if (parent == null) {
            return false;
        }
        return true;
    }

    /* renamed from: F */
    private static int m5991F(int i10) {
        if (i10 == 19) {
            return 33;
        }
        if (i10 != 21) {
            return i10 != 22 ? 130 : 66;
        }
        return 17;
    }

    /* renamed from: G */
    private boolean m5992G(int i10, Rect rect) {
        C7458h0 c7458h0;
        boolean z10 = false;
        C7458h0 c7458h02;
        C5312j m6004y = m6004y();
        int i11 = this.f5021l;
        int i12 = Integer.MIN_VALUE;
        if (i11 == Integer.MIN_VALUE) {
            c7458h0 = null;
        } else {
            c7458h0 = (C7458h0) m6004y.m21440f(i11);
        }
        C7458h0 c7458h03 = c7458h0;
        if (i10 != 1 && i10 != 2) {
            if (i10 != 17 && i10 != 33 && i10 != 66 && i10 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect2 = new Rect();
            int i13 = this.f5021l;
            if (i13 != Integer.MIN_VALUE) {
                m6005z(i13, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                m5989D(this.f5018i, i10, rect2);
            }
            c7458h02 = (C7458h0) AbstractC1335b.m6035c(m6004y, f5012p, f5011o, c7458h03, rect2, i10);
        } else {
            if (AbstractC0616q0.m2579B(this.f5018i) == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            c7458h02 = (C7458h0) AbstractC1335b.m6036d(m6004y, f5012p, f5011o, c7458h03, i10, z10, false);
        }
        if (c7458h02 != null) {
            i12 = m6004y.m21443i(m6004y.m21442h(c7458h02));
        }
        return m6018T(i12);
    }

    /* renamed from: Q */
    private boolean m5993Q(int i10, int i11, Bundle bundle) {
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 64) {
                    if (i11 != 128) {
                        return mo6011J(i10, i11, bundle);
                    }
                    return m5997n(i10);
                }
                return m5995S(i10);
            }
            return m6020o(i10);
        }
        return m6018T(i10);
    }

    /* renamed from: R */
    private boolean m5994R(int i10, Bundle bundle) {
        return AbstractC0616q0.m2614c0(this.f5018i, i10, bundle);
    }

    /* renamed from: S */
    private boolean m5995S(int i10) {
        int i11 = 0;
        if (!this.f5017h.isEnabled() || !this.f5017h.isTouchExplorationEnabled() || (i11 = this.f5020k) == i10) {
            return false;
        }
        if (i11 != Integer.MIN_VALUE) {
            m5997n(i11);
        }
        this.f5020k = i10;
        this.f5018i.invalidate();
        m6019U(i10, Message.FLAG_DATA_TYPE);
        return true;
    }

    /* renamed from: V */
    private void m5996V(int i10) {
        int i11 = this.f5022m;
        if (i11 == i10) {
            return;
        }
        this.f5022m = i10;
        m6019U(i10, 128);
        m6019U(i11, 256);
    }

    /* renamed from: n */
    private boolean m5997n(int i10) {
        if (this.f5020k == i10) {
            this.f5020k = Integer.MIN_VALUE;
            this.f5018i.invalidate();
            m6019U(i10, 65536);
            return true;
        }
        return false;
    }

    /* renamed from: p */
    private boolean m5998p() {
        int i10 = this.f5021l;
        if (i10 != Integer.MIN_VALUE && mo6011J(i10, 16, null)) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    private AccessibilityEvent m5999q(int i10, int i11) {
        if (i10 != -1) {
            return m6000r(i10, i11);
        }
        return m6001s(i11);
    }

    /* renamed from: r */
    private AccessibilityEvent m6000r(int i10, int i11) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i11);
        C7458h0 m6009H = m6009H(i10);
        obtain.getText().add(m6009H.m28636v());
        obtain.setContentDescription(m6009H.m28628q());
        obtain.setScrollable(m6009H.m28588H());
        obtain.setPassword(m6009H.m28587G());
        obtain.setEnabled(m6009H.m28583C());
        obtain.setChecked(m6009H.m28581A());
        m6013L(i10, obtain);
        if (obtain.getText().isEmpty() && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        obtain.setClassName(m6009H.m28625o());
        AbstractC7466l0.m28656c(obtain, this.f5018i, i10);
        obtain.setPackageName(this.f5018i.getContext().getPackageName());
        return obtain;
    }

    /* renamed from: s */
    private AccessibilityEvent m6001s(int i10) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i10);
        this.f5018i.onInitializeAccessibilityEvent(obtain);
        return obtain;
    }

    /* renamed from: t */
    private C7458h0 m6002t(int i10) {
        boolean z10 = false;
        C7458h0 m28565K = C7458h0.m28565K();
        m28565K.m28608d0(true);
        m28565K.m28611f0(true);
        m28565K.m28599X("android.view.View");
        Rect rect = f5010n;
        m28565K.m28595T(rect);
        m28565K.m28596U(rect);
        m28565K.m28620l0(this.f5018i);
        mo6015N(i10, m28565K);
        if (m28565K.m28636v() == null && m28565K.m28628q() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        m28565K.m28619l(this.f5014e);
        if (!this.f5014e.equals(rect)) {
            int m28616j = m28565K.m28616j();
            if ((m28616j & 64) == 0) {
                if ((m28616j & 128) == 0) {
                    m28565K.m28617j0(this.f5018i.getContext().getPackageName());
                    m28565K.m28629q0(this.f5018i, i10);
                    if (this.f5020k == i10) {
                        m28565K.m28594R(true);
                        m28565K.m28602a(128);
                    } else {
                        m28565K.m28594R(false);
                        m28565K.m28602a(64);
                    }
                    if (this.f5021l == i10) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        m28565K.m28602a(2);
                    } else if (m28565K.m28584D()) {
                        m28565K.m28602a(1);
                    }
                    m28565K.m28612g0(z10);
                    this.f5018i.getLocationOnScreen(this.f5016g);
                    m28565K.m28621m(this.f5013d);
                    if (this.f5013d.equals(rect)) {
                        m28565K.m28619l(this.f5013d);
                        if (m28565K.f27491b != -1) {
                            C7458h0 m28565K2 = C7458h0.m28565K();
                            for (int i11 = m28565K.f27491b; i11 != -1; i11 = m28565K2.f27491b) {
                                m28565K2.m28622m0(this.f5018i, -1);
                                m28565K2.m28595T(f5010n);
                                mo6015N(i11, m28565K2);
                                m28565K2.m28619l(this.f5014e);
                                Rect rect2 = this.f5013d;
                                Rect rect3 = this.f5014e;
                                rect2.offset(rect3.left, rect3.top);
                            }
                            m28565K2.m28592O();
                        }
                        this.f5013d.offset(this.f5016g[0] - this.f5018i.getScrollX(), this.f5016g[1] - this.f5018i.getScrollY());
                    }
                    if (this.f5018i.getLocalVisibleRect(this.f5015f)) {
                        this.f5015f.offset(this.f5016g[0] - this.f5018i.getScrollX(), this.f5016g[1] - this.f5018i.getScrollY());
                        if (this.f5013d.intersect(this.f5015f)) {
                            m28565K.m28596U(this.f5013d);
                            if (m5990E(this.f5013d)) {
                                m28565K.m28634t0(true);
                            }
                        }
                    }
                    return m28565K;
                }
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
    }

    /* renamed from: u */
    private C7458h0 m6003u() {
        C7458h0 m28566L = C7458h0.m28566L(this.f5018i);
        AbstractC0616q0.m2610a0(this.f5018i, m28566L);
        ArrayList arrayList = new ArrayList();
        mo6008C(arrayList);
        if (m28566L.m28623n() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            m28566L.m28606c(this.f5018i, ((Integer) arrayList.get(i10)).intValue());
        }
        return m28566L;
    }

    /* renamed from: y */
    private C5312j m6004y() {
        ArrayList arrayList = new ArrayList();
        mo6008C(arrayList);
        C5312j c5312j = new C5312j();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            c5312j.m21444j(i10, m6002t(i10));
        }
        return c5312j;
    }

    /* renamed from: z */
    private void m6005z(int i10, Rect rect) {
        m6009H(i10).m28619l(rect);
    }

    /* renamed from: A */
    public final int m6006A() {
        return this.f5021l;
    }

    /* renamed from: B */
    protected abstract int mo6007B(float f10, float f11);

    /* renamed from: C */
    protected abstract void mo6008C(List list);

    /* renamed from: H */
    C7458h0 m6009H(int i10) {
        if (i10 == -1) {
            return m6003u();
        }
        return m6002t(i10);
    }

    /* renamed from: I */
    public final void m6010I(boolean z10, int i10, Rect rect) {
        int i11 = this.f5021l;
        if (i11 != Integer.MIN_VALUE) {
            m6020o(i11);
        }
        if (z10) {
            m5992G(i10, rect);
        }
    }

    /* renamed from: J */
    protected abstract boolean mo6011J(int i10, int i11, Bundle bundle);

    /* renamed from: K */
    protected void m6012K(AccessibilityEvent accessibilityEvent) {
    }

    /* renamed from: L */
    protected void m6013L(int i10, AccessibilityEvent accessibilityEvent) {
    }

    /* renamed from: M */
    protected abstract void mo6014M(C7458h0 c7458h0);

    /* renamed from: N */
    protected abstract void mo6015N(int i10, C7458h0 c7458h0);

    /* renamed from: O */
    protected abstract void mo6016O(int i10, boolean z10);

    /* renamed from: P */
    boolean m6017P(int i10, int i11, Bundle bundle) {
        if (i10 != -1) {
            return m5993Q(i10, i11, bundle);
        }
        return m5994R(i11, bundle);
    }

    /* renamed from: T */
    public final boolean m6018T(int i10) {
        int i11 = 0;
        if ((!this.f5018i.isFocused() && !this.f5018i.requestFocus()) || (i11 = this.f5021l) == i10) {
            return false;
        }
        if (i11 != Integer.MIN_VALUE) {
            m6020o(i11);
        }
        this.f5021l = i10;
        mo6016O(i10, true);
        m6019U(i10, 8);
        return true;
    }

    /* renamed from: U */
    public final boolean m6019U(int i10, int i11) {
        ViewParent parent;
        if (i10 == Integer.MIN_VALUE || !this.f5017h.isEnabled() || (parent = this.f5018i.getParent()) == null) {
            return false;
        }
        return AbstractC0585i1.m2479h(parent, this.f5018i, m5999q(i10, i11));
    }

    @Override // androidx.core.view.C0551a
    /* renamed from: b */
    public C7464k0 mo2379b(View view) {
        if (this.f5019j == null) {
            this.f5019j = new c();
        }
        return this.f5019j;
    }

    @Override // androidx.core.view.C0551a
    /* renamed from: f */
    public void mo2381f(View view, AccessibilityEvent accessibilityEvent) {
        super.mo2381f(view, accessibilityEvent);
        m6012K(accessibilityEvent);
    }

    @Override // androidx.core.view.C0551a
    /* renamed from: g */
    public void mo2382g(View view, C7458h0 c7458h0) {
        super.mo2382g(view, c7458h0);
        mo6014M(c7458h0);
    }

    /* renamed from: o */
    public final boolean m6020o(int i10) {
        if (this.f5021l != i10) {
            return false;
        }
        this.f5021l = Integer.MIN_VALUE;
        mo6016O(i10, false);
        m6019U(i10, 8);
        return true;
    }

    /* renamed from: v */
    public final boolean m6021v(MotionEvent motionEvent) {
        if (!this.f5017h.isEnabled() || !this.f5017h.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7 && action != 9) {
            if (action != 10 || this.f5022m == Integer.MIN_VALUE) {
                return false;
            }
            m5996V(Integer.MIN_VALUE);
            return true;
        }
        int mo6007B = mo6007B(motionEvent.getX(), motionEvent.getY());
        m5996V(mo6007B);
        if (mo6007B == Integer.MIN_VALUE) {
            return false;
        }
        return true;
    }

    /* renamed from: w */
    public final boolean m6022w(KeyEvent keyEvent) {
        int i10 = 0;
        if (keyEvent.getAction() == 1) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 61) {
            if (keyCode != 66) {
                switch (keyCode) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                        if (!keyEvent.hasNoModifiers()) {
                            return false;
                        }
                        int m5991F = m5991F(keyCode);
                        int repeatCount = keyEvent.getRepeatCount() + 1;
                        boolean z10 = false;
                        while (i10 < repeatCount && m5992G(m5991F, null)) {
                            i10++;
                            z10 = true;
                        }
                        return z10;
                    case 23:
                        break;
                    default:
                        return false;
                }
            }
            if (!keyEvent.hasNoModifiers() || keyEvent.getRepeatCount() != 0) {
                return false;
            }
            m5998p();
            return true;
        }
        if (keyEvent.hasNoModifiers()) {
            return m5992G(2, null);
        }
        if (!keyEvent.hasModifiers(1)) {
            return false;
        }
        return m5992G(1, null);
    }

    /* renamed from: x */
    public final int m6023x() {
        return this.f5020k;
    }
}
