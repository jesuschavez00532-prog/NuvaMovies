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

/* renamed from: b2.d */
/* loaded from: classes.dex */
public abstract class AbstractC1036d implements InterfaceC1042j {

    /* renamed from: f */
    private static final int f4275f = R$id.glide_custom_view_target_tag;

    /* renamed from: a */
    private final a f4276a;

    /* renamed from: b */
    protected final View f4277b;

    /* renamed from: c */
    private View.OnAttachStateChangeListener f4278c;

    /* renamed from: d */
    private boolean f4279d;

    /* renamed from: e */
    private boolean f4280e;

    /* renamed from: b2.d$a */
    /* loaded from: classes.dex */
    static final class a {

        /* renamed from: e */
        static Integer f4281e;

        /* renamed from: a */
        private final View f4282a;

        /* renamed from: b */
        private final List f4283b = new ArrayList();

        /* renamed from: c */
        boolean f4284c;

        /* renamed from: d */
        private ViewTreeObserverOnPreDrawListenerC7801a f4285d;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b2.d$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class ViewTreeObserverOnPreDrawListenerC7801a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: a */
            private final WeakReference f4286a;

            ViewTreeObserverOnPreDrawListenerC7801a(a aVar) {
                this.f4286a = new WeakReference(aVar);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (Log.isLoggable("CustomViewTarget", 2)) {
                    Log.v("CustomViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                a aVar = (a) this.f4286a.get();
                if (aVar != null) {
                    aVar.m4852a();
                    return true;
                }
                return true;
            }
        }

        a(View view) {
            this.f4282a = view;
        }

        /* renamed from: c */
        private static int m4845c(Context context) {
            if (f4281e == null) {
                Display defaultDisplay = ((WindowManager) AbstractC4121k.m17226d((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f4281e = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f4281e.intValue();
        }

        /* renamed from: e */
        private int m4846e(int i10, int i11, int i12) {
            int i13 = i11 - i12;
            if (i13 > 0) {
                return i13;
            }
            if (this.f4284c && this.f4282a.isLayoutRequested()) {
                return 0;
            }
            int i14 = i10 - i12;
            if (i14 > 0) {
                return i14;
            }
            if (this.f4282a.isLayoutRequested() || i11 != -2) {
                return 0;
            }
            if (Log.isLoggable("CustomViewTarget", 4)) {
                Log.i("CustomViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use .override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            return m4845c(this.f4282a.getContext());
        }

        /* renamed from: f */
        private int m4847f() {
            int i10;
            int paddingTop = this.f4282a.getPaddingTop() + this.f4282a.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = this.f4282a.getLayoutParams();
            if (layoutParams != null) {
                i10 = layoutParams.height;
            } else {
                i10 = 0;
            }
            return m4846e(this.f4282a.getHeight(), i10, paddingTop);
        }

        /* renamed from: g */
        private int m4848g() {
            int i10;
            int paddingLeft = this.f4282a.getPaddingLeft() + this.f4282a.getPaddingRight();
            ViewGroup.LayoutParams layoutParams = this.f4282a.getLayoutParams();
            if (layoutParams != null) {
                i10 = layoutParams.width;
            } else {
                i10 = 0;
            }
            return m4846e(this.f4282a.getWidth(), i10, paddingLeft);
        }

        /* renamed from: h */
        private boolean m4849h(int i10) {
            return i10 > 0 || i10 == Integer.MIN_VALUE;
        }

        /* renamed from: i */
        private boolean m4850i(int i10, int i11) {
            if (m4849h(i10) && m4849h(i11)) {
                return true;
            }
            return false;
        }

        /* renamed from: j */
        private void m4851j(int i10, int i11) {
            Iterator it = new ArrayList(this.f4283b).iterator();
            while (it.hasNext()) {
                ((InterfaceC1041i) it.next()).mo130e(i10, i11);
            }
        }

        /* renamed from: a */
        void m4852a() {
            if (this.f4283b.isEmpty()) {
                return;
            }
            int m4848g = m4848g();
            int m4847f = m4847f();
            if (!m4850i(m4848g, m4847f)) {
                return;
            }
            m4851j(m4848g, m4847f);
            m4853b();
        }

        /* renamed from: b */
        void m4853b() {
            ViewTreeObserver viewTreeObserver = this.f4282a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f4285d);
            }
            this.f4285d = null;
            this.f4283b.clear();
        }

        /* renamed from: d */
        void m4854d(InterfaceC1041i interfaceC1041i) {
            int m4848g = m4848g();
            int m4847f = m4847f();
            if (m4850i(m4848g, m4847f)) {
                interfaceC1041i.mo130e(m4848g, m4847f);
                return;
            }
            if (!this.f4283b.contains(interfaceC1041i)) {
                this.f4283b.add(interfaceC1041i);
            }
            if (this.f4285d == null) {
                ViewTreeObserver viewTreeObserver = this.f4282a.getViewTreeObserver();
                ViewTreeObserverOnPreDrawListenerC7801a viewTreeObserverOnPreDrawListenerC7801a = new ViewTreeObserverOnPreDrawListenerC7801a(this);
                this.f4285d = viewTreeObserverOnPreDrawListenerC7801a;
                viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC7801a);
            }
        }

        /* renamed from: k */
        void m4855k(InterfaceC1041i interfaceC1041i) {
            this.f4283b.remove(interfaceC1041i);
        }
    }

    public AbstractC1036d(View view) {
        this.f4277b = (View) AbstractC4121k.m17226d(view);
        this.f4276a = new a(view);
    }

    /* renamed from: a */
    private Object m4839a() {
        return this.f4277b.getTag(f4275f);
    }

    /* renamed from: b */
    private void m4840b() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f4278c;
        if (onAttachStateChangeListener != null && !this.f4280e) {
            this.f4277b.addOnAttachStateChangeListener(onAttachStateChangeListener);
            this.f4280e = true;
        }
    }

    /* renamed from: c */
    private void m4841c() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f4278c;
        if (onAttachStateChangeListener != null && this.f4280e) {
            this.f4277b.removeOnAttachStateChangeListener(onAttachStateChangeListener);
            this.f4280e = false;
        }
    }

    /* renamed from: f */
    private void m4842f(Object obj) {
        this.f4277b.setTag(f4275f, obj);
    }

    /* renamed from: d */
    protected abstract void mo4843d(Drawable drawable);

    /* renamed from: e */
    protected void m4844e(Drawable drawable) {
    }

    @Override // p022b2.InterfaceC1042j
    public final InterfaceC0008d getRequest() {
        Object m4839a = m4839a();
        if (m4839a != null) {
            if (m4839a instanceof InterfaceC0008d) {
                return (InterfaceC0008d) m4839a;
            }
            throw new IllegalArgumentException("You must not pass non-R.id ids to setTag(id)");
        }
        return null;
    }

    @Override // p022b2.InterfaceC1042j
    public final void getSize(InterfaceC1041i interfaceC1041i) {
        this.f4276a.m4854d(interfaceC1041i);
    }

    @Override // com.bumptech.glide.manager.InterfaceC1628k
    public void onDestroy() {
    }

    @Override // p022b2.InterfaceC1042j
    public final void onLoadCleared(Drawable drawable) {
        this.f4276a.m4853b();
        mo4843d(drawable);
        if (!this.f4279d) {
            m4841c();
        }
    }

    @Override // p022b2.InterfaceC1042j
    public final void onLoadStarted(Drawable drawable) {
        m4840b();
        m4844e(drawable);
    }

    @Override // com.bumptech.glide.manager.InterfaceC1628k
    public void onStart() {
    }

    @Override // com.bumptech.glide.manager.InterfaceC1628k
    public void onStop() {
    }

    @Override // p022b2.InterfaceC1042j
    public final void removeCallback(InterfaceC1041i interfaceC1041i) {
        this.f4276a.m4855k(interfaceC1041i);
    }

    @Override // p022b2.InterfaceC1042j
    public final void setRequest(InterfaceC0008d interfaceC0008d) {
        m4842f(interfaceC0008d);
    }

    public String toString() {
        return "Target for: " + this.f4277b;
    }
}
