package p022b2;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.bumptech.glide.R$id;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p003a2.InterfaceC0008d;
import p109e2.AbstractC4121k;

/* renamed from: b2.k */
/* loaded from: classes.dex */
public abstract class AbstractC1043k extends AbstractC1033a {

    /* renamed from: f */
    private static boolean f4288f;

    /* renamed from: g */
    private static int f4289g = R$id.glide_custom_view_target_tag;

    /* renamed from: a */
    protected final View f4290a;

    /* renamed from: b */
    private final a f4291b;

    /* renamed from: c */
    private View.OnAttachStateChangeListener f4292c;

    /* renamed from: d */
    private boolean f4293d;

    /* renamed from: e */
    private boolean f4294e;

    /* renamed from: b2.k$a */
    /* loaded from: classes.dex */
    static final class a {

        /* renamed from: e */
        static Integer f4295e;

        /* renamed from: a */
        private final View f4296a;

        /* renamed from: b */
        private final List f4297b = new ArrayList();

        /* renamed from: c */
        boolean f4298c;

        /* renamed from: d */
        private ViewTreeObserverOnPreDrawListenerC7802a f4299d;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b2.k$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class ViewTreeObserverOnPreDrawListenerC7802a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: a */
            private final WeakReference f4300a;

            ViewTreeObserverOnPreDrawListenerC7802a(a aVar) {
                this.f4300a = new WeakReference(aVar);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (Log.isLoggable("ViewTarget", 2)) {
                    Log.v("ViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                a aVar = (a) this.f4300a.get();
                if (aVar != null) {
                    aVar.m4872a();
                    return true;
                }
                return true;
            }
        }

        a(View view) {
            this.f4296a = view;
        }

        /* renamed from: c */
        private static int m4865c(Context context) {
            if (f4295e == null) {
                Display defaultDisplay = ((WindowManager) AbstractC4121k.m17226d((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f4295e = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f4295e.intValue();
        }

        /* renamed from: e */
        private int m4866e(int i10, int i11, int i12) {
            int i13 = i11 - i12;
            if (i13 > 0) {
                return i13;
            }
            if (this.f4298c && this.f4296a.isLayoutRequested()) {
                return 0;
            }
            int i14 = i10 - i12;
            if (i14 > 0) {
                return i14;
            }
            if (this.f4296a.isLayoutRequested() || i11 != -2) {
                return 0;
            }
            if (Log.isLoggable("ViewTarget", 4)) {
                Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            return m4865c(this.f4296a.getContext());
        }

        /* renamed from: f */
        private int m4867f() {
            int i10 = 0;
            int paddingTop = this.f4296a.getPaddingTop() + this.f4296a.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = this.f4296a.getLayoutParams();
            if (layoutParams != null) {
                i10 = layoutParams.height;
            } else {
                i10 = 0;
            }
            return m4866e(this.f4296a.getHeight(), i10, paddingTop);
        }

        /* renamed from: g */
        private int m4868g() {
            int i10 = 0;
            int paddingLeft = this.f4296a.getPaddingLeft() + this.f4296a.getPaddingRight();
            ViewGroup.LayoutParams layoutParams = this.f4296a.getLayoutParams();
            if (layoutParams != null) {
                i10 = layoutParams.width;
            } else {
                i10 = 0;
            }
            return m4866e(this.f4296a.getWidth(), i10, paddingLeft);
        }

        /* renamed from: h */
        private boolean m4869h(int i10) {
            return i10 > 0 || i10 == Integer.MIN_VALUE;
        }

        /* renamed from: i */
        private boolean m4870i(int i10, int i11) {
            if (m4869h(i10) && m4869h(i11)) {
                return true;
            }
            return false;
        }

        /* renamed from: j */
        private void m4871j(int i10, int i11) {
            Iterator it = new ArrayList(this.f4297b).iterator();
            while (it.hasNext()) {
                ((InterfaceC1041i) it.next()).mo130e(i10, i11);
            }
        }

        /* renamed from: a */
        void m4872a() {
            if (this.f4297b.isEmpty()) {
                return;
            }
            int m4868g = m4868g();
            int m4867f = m4867f();
            if (!m4870i(m4868g, m4867f)) {
                return;
            }
            m4871j(m4868g, m4867f);
            m4873b();
        }

        /* renamed from: b */
        void m4873b() {
            ViewTreeObserver viewTreeObserver = this.f4296a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f4299d);
            }
            this.f4299d = null;
            this.f4297b.clear();
        }

        /* renamed from: d */
        void m4874d(InterfaceC1041i interfaceC1041i) {
            int m4868g = m4868g();
            int m4867f = m4867f();
            if (m4870i(m4868g, m4867f)) {
                interfaceC1041i.mo130e(m4868g, m4867f);
                return;
            }
            if (!this.f4297b.contains(interfaceC1041i)) {
                this.f4297b.add(interfaceC1041i);
            }
            if (this.f4299d == null) {
                ViewTreeObserver viewTreeObserver = this.f4296a.getViewTreeObserver();
                ViewTreeObserverOnPreDrawListenerC7802a viewTreeObserverOnPreDrawListenerC7802a = new ViewTreeObserverOnPreDrawListenerC7802a(this);
                this.f4299d = viewTreeObserverOnPreDrawListenerC7802a;
                viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC7802a);
            }
        }

        /* renamed from: k */
        void m4875k(InterfaceC1041i interfaceC1041i) {
            this.f4297b.remove(interfaceC1041i);
        }
    }

    public AbstractC1043k(View view) {
        this.f4290a = (View) AbstractC4121k.m17226d(view);
        this.f4291b = new a(view);
    }

    /* renamed from: a */
    private Object m4861a() {
        return this.f4290a.getTag(f4289g);
    }

    /* renamed from: b */
    private void m4862b() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f4292c;
        if (onAttachStateChangeListener != null && !this.f4294e) {
            this.f4290a.addOnAttachStateChangeListener(onAttachStateChangeListener);
            this.f4294e = true;
        }
    }

    /* renamed from: c */
    private void m4863c() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f4292c;
        if (onAttachStateChangeListener != null && this.f4294e) {
            this.f4290a.removeOnAttachStateChangeListener(onAttachStateChangeListener);
            this.f4294e = false;
        }
    }

    /* renamed from: d */
    private void m4864d(Object obj) {
        f4288f = true;
        this.f4290a.setTag(f4289g, obj);
    }

    @Override // p022b2.InterfaceC1042j
    public InterfaceC0008d getRequest() {
        Object m4861a = m4861a();
        if (m4861a != null) {
            if (m4861a instanceof InterfaceC0008d) {
                return (InterfaceC0008d) m4861a;
            }
            throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
        }
        return null;
    }

    @Override // p022b2.InterfaceC1042j
    public void getSize(InterfaceC1041i interfaceC1041i) {
        this.f4291b.m4874d(interfaceC1041i);
    }

    @Override // p022b2.AbstractC1033a, p022b2.InterfaceC1042j
    public void onLoadCleared(Drawable drawable) {
        super.onLoadCleared(drawable);
        this.f4291b.m4873b();
        if (!this.f4293d) {
            m4863c();
        }
    }

    @Override // p022b2.AbstractC1033a, p022b2.InterfaceC1042j
    public void onLoadStarted(Drawable drawable) {
        super.onLoadStarted(drawable);
        m4862b();
    }

    @Override // p022b2.InterfaceC1042j
    public void removeCallback(InterfaceC1041i interfaceC1041i) {
        this.f4291b.m4875k(interfaceC1041i);
    }

    @Override // p022b2.InterfaceC1042j
    public void setRequest(InterfaceC0008d interfaceC0008d) {
        m4864d(interfaceC0008d);
    }

    public String toString() {
        return "Target for: " + this.f4290a;
    }
}
